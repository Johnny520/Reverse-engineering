package Yue;

import Yue.InterfaceC7144;
import java.io.PrintWriter;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: Yue.ۥۢۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public final class C7818 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public static final int f3098 = 19;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f3099 = 60;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f23387 = 3600;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f23388 = 86400;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Object f23389 = new Object();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static char[] f23390 = new char[24];

    /* JADX INFO: renamed from: ۥ */
    public static int m3914(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟ */
    public static void m3915(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            m24803(j - j2, printWriter, 0);
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m24802(long j, PrintWriter printWriter) {
        m24803(j, printWriter, 0);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m24803(long j, PrintWriter printWriter, int i) {
        synchronized (f23389) {
            printWriter.print(new String(f23390, 0, m24805(j, i)));
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m24804(long j, StringBuilder sb) {
        synchronized (f23389) {
            sb.append(f23390, 0, m24805(j, 0));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int m24805(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2 = j;
        if (f23390.length < i) {
            f23390 = new char[i];
        }
        char[] cArr = f23390;
        if (j2 == 0) {
            int i7 = i - 1;
            while (i7 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j2 > 0) {
            c = SignatureVisitor.EXTENDS;
        } else {
            j2 = -j2;
            c = SignatureVisitor.SUPER;
        }
        int i8 = (int) (j2 % 1000);
        int iFloor = (int) Math.floor(j2 / 1000);
        if (iFloor > 86400) {
            i2 = iFloor / f23388;
            iFloor -= f23388 * i2;
        } else {
            i2 = 0;
        }
        if (iFloor > 3600) {
            i3 = iFloor / f23387;
            iFloor -= i3 * f23387;
        } else {
            i3 = 0;
        }
        if (iFloor > 60) {
            int i9 = iFloor / 60;
            i4 = iFloor - (i9 * 60);
            i5 = i9;
        } else {
            i4 = iFloor;
            i5 = 0;
        }
        if (i != 0) {
            int iM3914 = m3914(i2, 1, false, 0);
            int iM39142 = iM3914 + m3914(i3, 1, iM3914 > 0, 2);
            int iM39143 = iM39142 + m3914(i5, 1, iM39142 > 0, 2);
            int iM39144 = iM39143 + m3914(i4, 1, iM39143 > 0, 2);
            i6 = 0;
            for (int iM39145 = iM39144 + m3914(i8, 2, true, iM39144 > 0 ? 3 : 0) + 1; iM39145 < i; iM39145++) {
                cArr[i6] = ' ';
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i10 = i6 + 1;
        boolean z = i != 0;
        int iM24806 = m24806(cArr, i2, Advice.OffsetMapping.ForOrigin.Renderer.ForDescriptor.SYMBOL, i10, false, 0);
        int iM248062 = m24806(cArr, i3, 'h', iM24806, iM24806 != i10, z ? 2 : 0);
        int iM248063 = m24806(cArr, i5, Advice.OffsetMapping.ForOrigin.Renderer.ForMethodName.SYMBOL, iM248062, iM248062 != i10, z ? 2 : 0);
        int iM248064 = m24806(cArr, i4, Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL, iM248063, iM248063 != i10, z ? 2 : 0);
        int iM248065 = m24806(cArr, i8, Advice.OffsetMapping.ForOrigin.Renderer.ForMethodName.SYMBOL, iM248064, true, (!z || iM248064 == i10) ? 0 : 3);
        cArr[iM248065] = Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL;
        return iM248065 + 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m24806(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        cArr[i4 + 1] = c;
        return i4 + 2;
    }
}
