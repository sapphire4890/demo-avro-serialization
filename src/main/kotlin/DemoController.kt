package org.example

import DemoDTO
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {
    @GetMapping("/testing")
    fun getDemoResponse(): ResponseEntity<String> {
        return ResponseEntity.ok(DemoDTO("HelloWorld", "This is the first serialization", "Goodbye").toString())
    }
}