@echo off
ECHO Performing initial task...

:: To wait for 5 seconds, use -n 6 (5 seconds of delay)
PING 127.0.0.1 -n 6 > NUL

ECHO Delay complete. Continuing with the next task...