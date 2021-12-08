public class Message 
{
    final String messageContent; //variable 
     
    public Message (String m) { //method constraktor yang memiliki parameter string m
        this.messageContent = m;
    }
 
    public String getMessageContent() { //method get untuk mengembalikan nilai dari messageContent.
        return messageContent;
    }
}