package p210o;

import java.io.ByteArrayOutputStream;
import java.util.Collection;
import me.dartcv.nuke.ProtectedMainEntry;
import p050I3.C3551;
import p057K3.C3555;
import p084Q2.C3565;
import p099T3.C1427f;
import p128a.AbstractC1785a;
import p178i3.C3645;
import p193l0.C3648;

/* JADX INFO: renamed from: o.ۨۨۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3663 {

    /* JADX INFO: renamed from: ۤ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static int f11129 = 864;

    /* JADX INFO: renamed from: ۟۠ۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m6495() {
        return (-128) ^ C3565.f11029;
    }

    /* JADX INFO: renamed from: ۟ۡۦۢۡ, reason: not valid java name and contains not printable characters */
    public static int m6496(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۥ, reason: not valid java name and contains not printable characters */
    public static String m6497() {
        if (C3648.m6374() > 0) {
            return AbstractC1785a.f6098d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static Object[] m6498(Object obj, Object obj2) {
        if (C3645.m6357() > 0) {
            return ((Collection) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static int m6499(Object obj) {
        if (C3551.m5909() >= 0) {
            return ((C1427f) obj).f5083b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۡ۟ۧ, reason: contains not printable characters */
    public static String m6501(String str) {
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

    /* JADX INFO: renamed from: ۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static ProtectedMainEntry m6502() {
        if (C3555.m5928() > 0) {
            return ProtectedMainEntry.INSTANCE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۧ, reason: not valid java name and contains not printable characters */
    public static String m6500(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
