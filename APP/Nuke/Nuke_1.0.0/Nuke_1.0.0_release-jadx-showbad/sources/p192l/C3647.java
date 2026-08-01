package p192l;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.versionedparcelable.C3608;
import java.io.ByteArrayOutputStream;
import p114X.C3588;
import p115X0.C3590;

/* JADX INFO: renamed from: l.۟ۦۨ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3647 {

    /* JADX INFO: renamed from: ۟ۢۢۨۤ, reason: not valid java name and contains not printable characters */
    public static int f11109 = -703;

    /* JADX INFO: renamed from: ۟ۤۥۤۨ, reason: not valid java name and contains not printable characters */
    public static Window m6364(Object obj) {
        if (C3588.m6086() > 0) {
            return ((Activity) obj).getWindow();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۟۟, reason: not valid java name and contains not printable characters */
    public static String m6365(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static int m6366() {
        return 823 ^ C3608.f11072;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣۧ, reason: not valid java name and contains not printable characters */
    public static View m6367(Object obj, int i5) {
        if (C3590.m6097() < 0) {
            return ((ViewGroup) obj).getChildAt(i5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۡۦ, reason: contains not printable characters */
    public static int m6368(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۟ۨۦۣ, reason: not valid java name and contains not printable characters */
    public static String m6363(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
