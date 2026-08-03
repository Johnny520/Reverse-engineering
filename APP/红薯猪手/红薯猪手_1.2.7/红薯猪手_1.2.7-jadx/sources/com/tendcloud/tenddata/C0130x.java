package com.tendcloud.tenddata;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tendcloud.tenddata.x */
/* JADX INFO: loaded from: classes.dex */
public class C0130x {

    /* JADX INFO: renamed from: a */
    private static Location f627a;

    /* JADX INFO: renamed from: b */
    private static boolean f628b;

    /* JADX INFO: renamed from: a */
    public static List<Location> m738a(Context context) {
        ArrayList arrayList = new ArrayList();
        if (!C0020ab.f110T.isLocationEnabled() || C0020ab.f106P) {
            return arrayList;
        }
        try {
            arrayList.add(m743f(context));
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static String m739b(Context context) {
        try {
            List<Location> listM738a = m738a(context);
            StringBuilder sb = new StringBuilder();
            for (Location location : listM738a) {
                if (location != null) {
                    sb.append(location.getLatitude());
                    sb.append(',');
                    sb.append(location.getLongitude());
                    sb.append(',');
                    sb.append(location.hasAltitude() ? Double.valueOf(location.getAltitude()) : "");
                    sb.append(',');
                    sb.append(location.getTime());
                    sb.append(',');
                    sb.append(location.hasAccuracy() ? Float.valueOf(location.getAccuracy()) : "");
                    sb.append(',');
                    sb.append(location.hasBearing() ? Float.valueOf(location.getBearing()) : "");
                    sb.append(',');
                    sb.append(location.hasSpeed() ? Float.valueOf(location.getSpeed()) : "");
                    sb.append(',');
                    sb.append(location.getProvider());
                    sb.append(':');
                }
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static JSONArray m740c(Context context) {
        JSONArray jSONArray = new JSONArray();
        if (!C0020ab.f110T.isLocationEnabled() || C0020ab.f106P) {
            return jSONArray;
        }
        try {
            Location locationM743f = m743f(context);
            if (locationM743f != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("lat", locationM743f.getLatitude());
                jSONObject.put("lng", locationM743f.getLongitude());
                jSONObject.put("ts", locationM743f.getTime());
                if (C0131y.m754a(17)) {
                    jSONObject.put("elapsed", locationM743f.getElapsedRealtimeNanos());
                }
                if (locationM743f.hasAltitude()) {
                    jSONObject.put("altitude", locationM743f.getAltitude());
                }
                if (locationM743f.hasAccuracy()) {
                    jSONObject.put("hAccuracy", locationM743f.getAccuracy());
                }
                if (locationM743f.hasBearing()) {
                    jSONObject.put("bearing", locationM743f.getBearing());
                }
                if (locationM743f.hasSpeed()) {
                    jSONObject.put("speed", locationM743f.getSpeed());
                }
                jSONObject.put("provider", locationM743f.getProvider());
                jSONArray.put(jSONObject);
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: d */
    public static JSONArray m741d(Context context) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArrayM662A = C0122o.m662A(context);
            if (jSONArrayM662A.length() > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "sim");
                jSONObject.put("extra", jSONArrayM662A);
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", "account");
            String str = C0020ab.f143r;
            if (str != null) {
                jSONObject2.put("accountId", str);
            }
            String strM560l = C0116i.m560l();
            if (!C0131y.m767b(strM560l)) {
                C0115h.dForInternal(strM560l);
                JSONObject jSONObject3 = new JSONObject(strM560l);
                if (jSONObject3.length() > 0) {
                    jSONObject2.put("accountProp", jSONObject3);
                }
            }
            if (jSONObject2.length() > 1) {
                jSONArray.put(jSONObject2);
            }
            if (jSONArray.length() > 0) {
                return jSONArray;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Long[][] m742e(Context context) {
        return new Long[3][];
    }

    /* JADX INFO: renamed from: f */
    private static Location m743f(Context context) {
        boolean zIsProviderEnabled;
        Location lastKnownLocation = null;
        if (!C0020ab.f110T.isLocationEnabled()) {
            return null;
        }
        if (f628b) {
            return f627a;
        }
        if (!C0131y.m766b(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            f628b = true;
            return null;
        }
        try {
            LocationManager locationManager = (LocationManager) C0020ab.f132g.getSystemService("location");
            boolean zIsProviderEnabled2 = false;
            if (locationManager != null) {
                zIsProviderEnabled2 = locationManager.isProviderEnabled("gps");
                zIsProviderEnabled = locationManager.isProviderEnabled("network");
            } else {
                zIsProviderEnabled = false;
            }
            if (zIsProviderEnabled2 || zIsProviderEnabled) {
                lastKnownLocation = locationManager.getLastKnownLocation("passive");
            }
        } catch (Throwable unused) {
        }
        f627a = lastKnownLocation;
        f628b = true;
        return lastKnownLocation;
    }
}
