Geocoder geocoder = new Geocoder(this, Locale.getDefault());
List<Address> addresses = geocoder.getFromLocation(latitude, longitude, 1);
String cityName = addresses.get(0).getLocality();
