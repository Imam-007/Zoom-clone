# Zoom Clone Web App

A Zoom-like web application developed using **Spring Boot**, **Thymeleaf**, and **ZEGOCLOUD**, offering a seamless video conferencing experience with advanced features for meeting management.

## Features

- **Video and Audio Streaming**: Integrated ZEGOCLOUD SDK to provide reliable peer-to-peer video and audio communication.
- **Screen Sharing**: Share your screen during meetings for collaborative work.
- **Meeting Moderation**: Manage meetings with features like muting participants and controlling access.
- **Participant Management**: View, add, and remove participants in real-time.
- **Real-Time Chat**: Send and receive messages during meetings with a built-in chat feature.
- **Secure User Authentication**: Implemented **Spring Security** for secure login and registration.
- **Role-Based Access Control**: Assign roles (e.g., host, participant) to control user privileges.
- **Responsive UI**: Designed with **Thymeleaf** for a responsive user interface, ensuring compatibility across devices and browsers.
- **Optimized Performance**: Minimized video call latency and ensured smooth user experience.

## Technology Stack

- **Backend**: Spring Boot, Spring Security
- **Frontend**: Thymeleaf
- **Video Streaming**: ZEGOCLOUD SDK
- **Database**: Your choice (e.g., MySQL, PostgreSQL)
- **Build Tool**: Maven

## Installation

### Prerequisites
- Java 11 or higher
- Maven
- A supported database (e.g., MySQL)
- ZEGOCLOUD account for API keys

### Steps

1. Clone this repository:
   ```bash  
   git clone https://github.com/your-username/zoom-clone.git  
   cd zoom-clone