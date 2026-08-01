package p091S;

import java.io.ByteArrayOutputStream;
import me.dartcv.nuke.ProtectedMainEntry;
import p021D3.C0274k;
import p038G3.AbstractC0516b;
import p044H3.AbstractC0646a;
import p055K1.C3554;
import p056K2.C0887m;
import p139c.C3614;
import p178i3.C3645;
import p193l0.C3648;

/* JADX INFO: renamed from: S.ۣ۟۟ۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3571 {

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int f11035 = -559;

    /* JADX INFO: renamed from: ۟۟ۢۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6004(Object obj) {
        if (C3554.m5926() <= 0) {
            return ((ProtectedMainEntry) obj).onBackPressed();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۧۡۦ, reason: not valid java name and contains not printable characters */
    public static int m6005(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۨۢ۟, reason: not valid java name and contains not printable characters */
    public static AbstractC0646a[] m6006() {
        if (C3645.m6357() >= 0) {
            return AbstractC0516b.f1651f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢ۠۠, reason: not valid java name and contains not printable characters */
    public static String m6007(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i6 = 0; i6 < length; i6++) {
            byteArray[i6] = (byte) (byteArray[i6] ^ str2.charAt(i6 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۢ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static C0887m m6008() {
        if (C3648.m6374() >= 0) {
            return C0274k.f881a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢ۠, reason: contains not printable characters */
    public static int m6009() {
        return 370 ^ C3614.f11078;
    }

    /* JADX INFO: renamed from: ۥۥۣ۠, reason: contains not printable characters */
    public static String m6010(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
