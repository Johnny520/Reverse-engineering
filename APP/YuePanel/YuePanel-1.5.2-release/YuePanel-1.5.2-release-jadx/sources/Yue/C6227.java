package Yue;

import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥۡۡۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6227 {
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public static String m2722(@InterfaceC6490 String str, @InterfaceC6391 String[] strArr) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("/");
        for (String str2 : strArr) {
            if (m19242(strArrSplit, str2.split("/"))) {
                return str2;
            }
        }
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public static String m2723(@InterfaceC6490 String[] strArr, @InterfaceC6391 String str) {
        if (strArr == null) {
            return null;
        }
        String[] strArrSplit = str.split("/");
        for (String str2 : strArr) {
            if (m19242(str2.split("/"), strArrSplit)) {
                return str2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m19240(@InterfaceC6490 String str, @InterfaceC6391 String str2) {
        if (str == null) {
            return false;
        }
        return m19242(str.split("/"), str2.split("/"));
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static String[] m19241(@InterfaceC6490 String[] strArr, @InterfaceC6391 String str) {
        if (strArr == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split("/");
        for (String str2 : strArr) {
            if (m19242(str2.split("/"), strArrSplit)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m19242(@InterfaceC6391 String[] strArr, @InterfaceC6391 String[] strArr2) {
        if (strArr2.length != 2) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
        }
        if (strArr2[0].isEmpty() || strArr2[1].isEmpty()) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
        }
        if (strArr.length != 2) {
            return false;
        }
        if (InterfaceC5949.f14892.equals(strArr2[0]) || strArr2[0].equals(strArr[0])) {
            return InterfaceC5949.f14892.equals(strArr2[1]) || strArr2[1].equals(strArr[1]);
        }
        return false;
    }
}
