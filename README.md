# web-scraper
java web scraper

Write a simple web scraper to help us visit the tide pools. Use any language and/or tools that you like.

Go to https://www.tide-forecast.com/ to get tide forecasts for these locations:

Half Moon Bay, California
Huntington Beach, California
Providence, Rhode Island
Wrightsville Beach, North Carolina

Load the tide forecast page for each location and extract information on low tides that occur after sunrise and before sunset. Return the time and height for each daylight low tide,.

To run this clone this repo.
Go to the root directory containing the pom.xml
```
mvn clean install
mvn exec:java 
```

```
Half Moon Bay, California
===
date=Friday 6 July, time=10:58 AM PDT, height=0.37 m
date=Saturday 7 July, time=11:52 AM PDT, height=0.50 m
date=Sunday 8 July, time=12:48 PM PDT, height=0.60 m
date=Monday 9 July, time=1:44 PM PDT, height=0.69 m
date=Tuesday 10 July, time=2:40 PM PDT, height=0.74 m
date=Wednesday 11 July, time=3:34 PM PDT, height=0.76 m
date=Thursday 12 July, time=4:27 PM PDT, height=0.76 m
date=Friday 13 July, time=5:21 PM PDT, height=0.74 m
date=Saturday 14 July, time=6:18 AM PDT, height=-0.49 m
date=Sunday 15 July, time=7:05 AM PDT, height=-0.41 m
date=Monday 16 July, time=7:54 AM PDT, height=-0.28 m
date=Tuesday 17 July, time=8:43 AM PDT, height=-0.11 m
date=Wednesday 18 July, time=9:34 AM PDT, height=0.09 m
date=Thursday 19 July, time=10:27 AM PDT, height=0.29 m
date=Friday 20 July, time=11:25 AM PDT, height=0.47 m
date=Saturday 21 July, time=12:24 PM PDT, height=0.63 m
date=Sunday 22 July, time=1:23 PM PDT, height=0.74 m
date=Monday 23 July, time=2:19 PM PDT, height=0.81 m
date=Tuesday 24 July, time=3:08 PM PDT, height=0.85 m
date=Wednesday 25 July, time=3:53 PM PDT, height=0.87 m
date=Thursday 26 July, time=4:34 PM PDT, height=0.87 m
date=Friday 27 July, time=5:12 PM PDT, height=0.87 m
date=Saturday 28 July, time=5:49 PM PDT, height=0.85 m
date=Sunday 29 July, time=6:25 AM PDT, height=-0.07 m
date=Monday 30 July, time=6:57 AM PDT, height=-0.02 m
date=Tuesday 31 July, time=7:30 AM PDT, height=0.05 m
date=Wednesday 1 August, time=8:05 AM PDT, height=0.15 m
date=Thursday 2 August, time=8:43 AM PDT, height=0.27 m
date=Friday 3 August, time=9:26 AM PDT, height=0.41 m
date=Saturday 4 August, time=10:17 AM PDT, height=0.56 m

Providence, Rhode Island
===
date=Friday 6 July, time=7:35 AM EDT, height=0.12 m
date=Saturday 7 July, time=8:33 AM EDT, height=0.11 m
date=Sunday 8 July, time=9:32 AM EDT, height=0.07 m
date=Monday 9 July, time=10:30 AM EDT, height=0.00 m
date=Tuesday 10 July, time=11:26 AM EDT, height=-0.07 m
date=Wednesday 11 July, time=12:22 PM EDT, height=-0.12 m
date=Thursday 12 July, time=1:18 PM EDT, height=-0.16 m
date=Friday 13 July, time=2:16 PM EDT, height=-0.18 m
date=Saturday 14 July, time=3:12 PM EDT, height=-0.17 m
date=Sunday 15 July, time=4:05 PM EDT, height=-0.14 m
date=Monday 16 July, time=4:56 PM EDT, height=-0.06 m
date=Tuesday 17 July, time=5:47 PM EDT, height=0.04 m
date=Wednesday 18 July, time=6:11 AM EDT, height=0.00 m
date=Thursday 19 July, time=6:59 AM EDT, height=0.10 m
date=Friday 20 July, time=7:50 AM EDT, height=0.19 m
date=Saturday 21 July, time=8:46 AM EDT, height=0.24 m
date=Sunday 22 July, time=9:40 AM EDT, height=0.26 m
date=Monday 23 July, time=10:30 AM EDT, height=0.25 m
date=Tuesday 24 July, time=11:16 AM EDT, height=0.23 m
date=Wednesday 25 July, time=12:00 PM EDT, height=0.20 m
date=Thursday 26 July, time=12:45 PM EDT, height=0.17 m
date=Friday 27 July, time=1:31 PM EDT, height=0.15 m
date=Saturday 28 July, time=2:16 PM EDT, height=0.13 m
date=Sunday 29 July, time=3:00 PM EDT, height=0.12 m
date=Monday 30 July, time=3:42 PM EDT, height=0.12 m
date=Tuesday 31 July, time=4:24 PM EDT, height=0.12 m
date=Wednesday 1 August, time=5:06 PM EDT, height=0.13 m
date=Thursday 2 August, time=5:51 PM EDT, height=0.16 m
date=Friday 3 August, time=6:12 AM EDT, height=0.06 m
date=Saturday 4 August, time=7:02 AM EDT, height=0.08 m

Huntington Beach, California
===
date=Friday 6 July, time=9:32 AM PDT, height=0.80 meters
date=Saturday 7 July, time=10:24 AM PDT, height=0.87 meters
date=Sunday 8 July, time=11:20 AM PDT, height=0.92 meters
date=Monday 9 July, time=12:15 PM PDT, height=0.94 meters
date=Tuesday 10 July, time=1:08 PM PDT, height=0.95 meters
date=Wednesday 11 July, time=1:59 PM PDT, height=0.93 meters
date=Thursday 12 July, time=2:51 PM PDT, height=0.92 meters
date=Friday 13 July, time=3:42 PM PDT, height=0.91 meters
date=Saturday 14 July, time=4:37 PM PDT, height=0.91 meters
date=Sunday 15 July, time=5:53 AM PDT, height=-0.01 meters
date=Monday 16 July, time=6:40 AM PDT, height=0.13 meters
date=Tuesday 17 July, time=7:28 AM PDT, height=0.32 meters
date=Wednesday 18 July, time=8:18 AM PDT, height=0.51 meters
date=Thursday 19 July, time=9:11 AM PDT, height=0.70 meters
date=Friday 20 July, time=10:09 AM PDT, height=0.86 meters
date=Saturday 21 July, time=11:09 AM PDT, height=0.97 meters
date=Sunday 22 July, time=12:05 PM PDT, height=1.04 meters
date=Monday 23 July, time=12:54 PM PDT, height=1.07 meters
date=Tuesday 24 July, time=1:36 PM PDT, height=1.07 meters
date=Wednesday 25 July, time=2:13 PM PDT, height=1.05 meters
date=Thursday 26 July, time=2:49 PM PDT, height=1.03 meters
date=Friday 27 July, time=3:23 PM PDT, height=1.01 meters
date=Saturday 28 July, time=3:58 PM PDT, height=1.01 meters
date=Sunday 29 July, time=4:34 PM PDT, height=1.02 meters
date=Monday 30 July, time=5:12 PM PDT, height=1.03 meters
date=Tuesday 31 July, time=6:07 AM PDT, height=0.45 meters
date=Wednesday 1 August, time=6:36 AM PDT, height=0.56 meters
date=Thursday 2 August, time=7:06 AM PDT, height=0.67 meters
date=Friday 3 August, time=7:40 AM PDT, height=0.79 meters
date=Saturday 4 August, time=8:25 AM PDT, height=0.91 meters

Wrightsville Beach, North Carolina
===
date=Friday 6 July, time=7:52 AM EDT, height=0.08 m
date=Saturday 7 July, time=8:46 AM EDT, height=0.03 m
date=Sunday 8 July, time=9:37 AM EDT, height=-0.03 m
date=Monday 9 July, time=10:28 AM EDT, height=-0.09 m
date=Tuesday 10 July, time=11:21 AM EDT, height=-0.16 m
date=Wednesday 11 July, time=12:17 PM EDT, height=-0.21 m
date=Thursday 12 July, time=1:14 PM EDT, height=-0.25 m
date=Friday 13 July, time=2:11 PM EDT, height=-0.28 m
date=Saturday 14 July, time=3:06 PM EDT, height=-0.28 m
date=Sunday 15 July, time=3:59 PM EDT, height=-0.24 m
date=Monday 16 July, time=4:53 PM EDT, height=-0.16 m
date=Tuesday 17 July, time=5:52 PM EDT, height=-0.06 m
date=Wednesday 18 July, time=6:34 AM EDT, height=-0.09 m
date=Thursday 19 July, time=7:35 AM EDT, height=-0.04 m
date=Friday 20 July, time=8:33 AM EDT, height=-0.00 m
date=Saturday 21 July, time=9:26 AM EDT, height=0.02 m
date=Sunday 22 July, time=10:14 AM EDT, height=0.03 m
date=Monday 23 July, time=11:00 AM EDT, height=0.04 m
date=Tuesday 24 July, time=11:43 AM EDT, height=0.05 m
date=Wednesday 25 July, time=12:27 PM EDT, height=0.05 m
date=Thursday 26 July, time=1:11 PM EDT, height=0.05 m
date=Friday 27 July, time=1:53 PM EDT, height=0.05 m
date=Saturday 28 July, time=2:33 PM EDT, height=0.05 m
date=Sunday 29 July, time=3:11 PM EDT, height=0.07 m
date=Monday 30 July, time=3:47 PM EDT, height=0.09 m
date=Tuesday 31 July, time=4:23 PM EDT, height=0.13 m
date=Wednesday 1 August, time=5:02 PM EDT, height=0.17 m
date=Thursday 2 August, time=5:49 PM EDT, height=0.21 m
date=Friday 3 August, time=6:49 PM EDT, height=0.25 m
date=Saturday 4 August, time=7:07 AM EDT, height=0.10 m
```
