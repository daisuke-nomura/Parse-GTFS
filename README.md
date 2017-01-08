# Parse-GTFS

[![Release](https://jitpack.io/v/daisuke-nomura/Parse-GTFS.svg)](https://jitpack.io/#daisuke-nomura/Parse-GTFS)

GTFS class for Android Java extends ParseObject of Parse.com.  
GTFS specification is [here][gtfs].

##Sample usage

```java
ParseQuery<Trips> query = ParseQuery.getQuery(Trips.class);
query.whereEqualTo("trip_id", "******");

query.findInBackground(new FindCallback<Trips>() {
    @Override
    public void done(List<Trips> objects, ParseException e) {
        if (e == null) {
            for (Trips object : objects) {
                Log.d(TAG, object.getTripShortName());
            }
        }
    }
});
```

```java
Trips trips = new Trips();
trips.setTripId("******");
trips.saveInBackground();
```

Note: DON'T forget call ParseObject.registerSubclass before initialize.

```java
ParseObject.registerSubclass(Agency.class);
ParseObject.registerSubclass(Calendar.class);
ParseObject.registerSubclass(CalendarDates.class);
ParseObject.registerSubclass(FareAttributes.class);
ParseObject.registerSubclass(FareRules.class);
ParseObject.registerSubclass(Routes.class);
ParseObject.registerSubclass(Shapes.cclass);
ParseObject.registerSubclass(Stops.class);
ParseObject.registerSubclass(StopTimes.class);
ParseObject.registerSubclass(Trips.class);

Parse.initialize(this, "******", "******");
```

##Binaries

    allprojects {
        repositories {
            maven { url "https://jitpack.io" }
        }
    }

and

    dependencies {
        compile 'com.github.daisuke-nomura:Parse-GTFS:{latest version}'
    }

##Bugs and Feedback

Please use [GitHub Issues][issues].

##License

    MIT License

    Copyright (c) 2017 Daisuke Nomura

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.


[gtfs]: https://developers.google.com/transit/gtfs/
[issues]: https://github.com/daisuke-nomura/Parse-GTFS/issues