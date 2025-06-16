package com.krishna.journalApp.Repository;

import com.krishna.journalApp.entity.JournalEntry;
import com.krishna.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUserName(String username);

    void deleteByUserName (String username);
}
