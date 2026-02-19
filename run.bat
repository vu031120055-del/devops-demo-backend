@echo off
echo =========================
echo Starting DevOps Backend
echo =========================

call mvn clean install
call mvn spring-boot:run

pause
