package p248u3;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.util.List;
import p002A1.AbstractC0116E;
import p002A1.InterfaceC0127P;
import p095T.InterfaceC1373m;
import p099T3.C1427f;
import p108V3.AbstractC1543P;
import p112W2.InterfaceC1601c;
import p168h.C3632;
import p193l0.C3648;
import p194l1.C3650;
import p231r3.C3678;

/* JADX INFO: renamed from: u3.۟ۡۥۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3691 {

    /* JADX INFO: renamed from: ۟۠ۦۤۡ, reason: not valid java name and contains not printable characters */
    public static int f11157 = 479;

    /* JADX INFO: renamed from: ۟۟ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Signature[] m6630(Object obj) {
        if (C3648.m6374() > 0) {
            return ((PackageInfo) obj).signatures;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۦۦ, reason: not valid java name and contains not printable characters */
    public static void m6631(Object obj, Object obj2, Object obj3, boolean z5, boolean z6, Object obj4, Object obj5, Object obj6, int i5, int i6) {
        if (C3650.m6384() < 0) {
            AbstractC1543P.m2822g((List) obj, (List) obj2, (C1427f) obj3, z5, z6, (InterfaceC1601c) obj4, (InterfaceC1601c) obj5, (InterfaceC1373m) obj6, i5, i6);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦۥ۟, reason: not valid java name and contains not printable characters */
    public static String m6632(String str) {
        String string = "";
        int i5 = 0;
        String str2 = "";
        while (i5 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i5)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i5).toString();
            i5++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i6 = 0; i6 < str.length(); i6 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i6)) << 4) | string.indexOf(str.charAt(i6 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۡۧۦۢ, reason: not valid java name and contains not printable characters */
    public static int m6633() {
        return 643 ^ C3678.f11144;
    }

    /* JADX INFO: renamed from: ۠ۡۥۤ, reason: not valid java name and contains not printable characters */
    public static int m6635(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣۡۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0127P m6636(Object obj) {
        if (C3632.m6293() <= 0) {
            return AbstractC0116E.m163e((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۡۨ, reason: not valid java name and contains not printable characters */
    public static String m6634(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
