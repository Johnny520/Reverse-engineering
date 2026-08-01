package com.bumptech.glide;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.DragEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import me.dartcv.nuke.BuildConfig;
import org.luckypray.dexkit.DexKitBridge;
import p000A.C0049a;
import p000A.C0075n;
import p000A.C0078o0;
import p000A.C0080p0;
import p000A.C0099z;
import p000A.InterfaceC0092v0;
import p007B0.AbstractC0208v;
import p007B0.C0185S;
import p007B0.C0200n;
import p007B0.C0209w;
import p007B0.EnumC0201o;
import p011B4.AbstractC0231b;
import p027E4.C0330q;
import p029F0.C0363A;
import p042H1.AbstractC0636d;
import p049I2.AbstractC0797o;
import p049I2.C0793k;
import p056K2.AbstractC0885k;
import p056K2.C0891q;
import p058L.C0899A;
import p058L.C0900B;
import p058L.C0920W;
import p058L.C0950v;
import p058L.C0952x;
import p058L.C0953y;
import p058L.C0954z;
import p058L.EnumC0938j;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0973m;
import p061L2.C0981u;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1176a;
import p092S0.C1259L;
import p103U2.C1476a;
import p117X2.AbstractC1665j;
import p117X2.C1671p;
import p117X2.C1674s;
import p118X3.C1692b;
import p118X3.C1698h;
import p118X3.C1705o;
import p118X3.EnumC1689K;
import p121Y1.C1753n;
import p123Y3.AbstractC1776g;
import p127Z2.AbstractC1784a;
import p128a.AbstractC1785a;
import p132a3.C1802b;
import p132a3.C1804d;
import p149d3.AbstractC1973a;
import p153e1.C2019o;
import p153e1.C2020p;
import p153e1.C2021q;
import p154e2.C2029h;
import p179i4.AbstractC2352g;
import p198m0.C2590u;
import p204n0.C2683b;
import p206n2.AbstractC2691c;
import p215o4.AbstractC2803b;
import p227r.AbstractC2945D;
import p245u0.C3309f;
import p254v4.C3356c;
import p254v4.C3357d;
import p265x4.C3455a;
import p265x4.C3456b;
import p265x4.C3457c;
import p265x4.C3458d;
import p265x4.C3459e;
import p265x4.C3460f;
import p265x4.C3461g;
import p265x4.C3462h;
import p265x4.C3463i;
import p265x4.C3464j;
import p265x4.C3465k;
import p265x4.C3466l;
import p265x4.C3467m;
import p265x4.C3468n;
import p265x4.C3469o;
import p265x4.C3470p;

/* JADX INFO: renamed from: com.bumptech.glide.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1926h {

    /* JADX INFO: renamed from: a */
    public static C3309f f6535a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: A */
    public static byte[] m3550A(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i5 = (int) length;
            byte[] bArrCopyOf = new byte[i5];
            int i6 = i5;
            int i7 = 0;
            while (i6 > 0) {
                int i8 = fileInputStream.read(bArrCopyOf, i7, i6);
                if (i8 < 0) {
                    break;
                }
                i6 -= i8;
                i7 += i8;
            }
            if (i6 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i7);
                AbstractC1665j.m2984d(bArrCopyOf, "copyOf(...)");
            } else {
                int i9 = fileInputStream.read();
                if (i9 != -1) {
                    C1476a c1476a = new C1476a(8193);
                    c1476a.write(i9);
                    AbstractC1924f.m3496h(fileInputStream, c1476a);
                    int size = c1476a.size() + i5;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrM2748b = c1476a.m2748b();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    AbstractC1665j.m2984d(bArrCopyOf, "copyOf(...)");
                    AbstractC0972l.m1989M(i5, 0, c1476a.size(), bArrM2748b, bArrCopyOf);
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1925g.m3534k(fileInputStream, th);
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: B */
    public static String m3551B(File file) throws IOException {
        Charset charset = AbstractC1973a.f6662a;
        AbstractC1665j.m2985e(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int i5 = inputStreamReader.read(cArr); i5 >= 0; i5 = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, i5);
            }
            String string = stringWriter.toString();
            AbstractC1665j.m2984d(string, "toString(...)");
            inputStreamReader.close();
            return string;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static C1802b m3552E(C1804d c1804d, int i5) {
        AbstractC1665j.m2985e(c1804d, "<this>");
        boolean z5 = i5 > 0;
        Integer numValueOf = Integer.valueOf(i5);
        if (!z5) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i6 = c1804d.f6140d;
        int i7 = c1804d.f6141e;
        if (c1804d.f6142f <= 0) {
            i5 = -i5;
        }
        return new C1802b(i6, i7, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static final String m3553F(int i5) {
        if (i5 == 0) {
            return "0";
        }
        char[] cArr = AbstractC2803b.f8827a;
        int i6 = 0;
        char[] cArr2 = {cArr[(i5 >> 28) & 15], cArr[(i5 >> 24) & 15], cArr[(i5 >> 20) & 15], cArr[(i5 >> 16) & 15], cArr[(i5 >> 12) & 15], cArr[(i5 >> 8) & 15], cArr[(i5 >> 4) & 15], cArr[i5 & 15]};
        while (i6 < 8 && cArr2[i6] == '0') {
            i6++;
        }
        if (i6 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0231b.m397h(i6, "startIndex: ", ", endIndex: 8, size: 8"));
        }
        if (i6 <= 8) {
            return new String(cArr2, i6, 8 - i6);
        }
        throw new IllegalArgumentException(AbstractC0231b.m397h(i6, "startIndex: ", " > endIndex: 8"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static final long m3554G(long j5) {
        return AbstractC2352g.m4190c(Float.isNaN(C2021q.m3714b(j5)) ? 0.0f : C2021q.m3714b(j5), Float.isNaN(C2021q.m3715c(j5)) ? 0.0f : C2021q.m3715c(j5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r14 == r5) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3555H(C0185S c0185s, InterfaceC0092v0 interfaceC0092v0, C0200n c0200n, AbstractC1176a abstractC1176a) {
        C0954z c0954z;
        C0209w c0209w;
        if (abstractC1176a instanceof C0954z) {
            c0954z = (C0954z) abstractC1176a;
            int i5 = c0954z.f3011k;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0954z.f3011k = i5 - Integer.MIN_VALUE;
            } else {
                c0954z = new C0954z(abstractC1176a);
            }
        }
        Object objM5151b = c0954z.f3010j;
        int i6 = c0954z.f3011k;
        boolean z5 = true;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        try {
            if (i6 == 0) {
                AbstractC1784a.m3205S(objM5151b);
                c0209w = (C0209w) AbstractC0973m.m2012S(c0200n.f696a);
                long j5 = c0209w.f711a;
                c0954z.f3007g = c0185s;
                c0954z.f3008h = interfaceC0092v0;
                c0954z.f3009i = c0209w;
                c0954z.f3011k = 1;
                objM5151b = AbstractC2945D.m5151b(c0185s, j5, c0954z);
                if (objM5151b == enumC1152a) {
                }
                return enumC1152a;
            }
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC0092v0 = c0954z.f3008h;
                c0185s = c0954z.f3007g;
                AbstractC1784a.m3205S(objM5151b);
                if (((Boolean) objM5151b).booleanValue()) {
                    ?? r11 = c0185s.f645i.f653w.f696a;
                    int size = r11.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        C0209w c0209w2 = (C0209w) r11.get(i7);
                        if (AbstractC0208v.m313c(c0209w2)) {
                            c0209w2.m320a();
                        }
                    }
                    interfaceC0092v0.mo129b();
                } else {
                    interfaceC0092v0.onCancel();
                }
                return C0891q.f2780a;
            }
            C0209w c0209w3 = c0954z.f3009i;
            interfaceC0092v0 = c0954z.f3008h;
            C0185S c0185s2 = c0954z.f3007g;
            AbstractC1784a.m3205S(objM5151b);
            c0209w = c0209w3;
            c0185s = c0185s2;
            C0209w c0209w4 = (C0209w) objM5151b;
            if (c0209w4 != null) {
                long j6 = c0209w4.f713c;
                if (C2683b.m4645c(C2683b.m4646d(c0209w.f713c, j6)) >= AbstractC2945D.m5156g(c0185s.m277f(), c0209w.f719i)) {
                    z5 = false;
                }
                if (z5) {
                    interfaceC0092v0.mo128a(j6, C0950v.f2990e);
                    long j7 = c0209w4.f711a;
                    C0080p0 c0080p0 = new C0080p0(interfaceC0092v0, 1);
                    c0954z.f3007g = c0185s;
                    c0954z.f3008h = interfaceC0092v0;
                    c0954z.f3009i = null;
                    c0954z.f3011k = 2;
                    objM5151b = AbstractC2945D.m5154e(c0185s, j7, c0080p0, c0954z);
                }
            }
            return C0891q.f2780a;
        } catch (CancellationException e5) {
            interfaceC0092v0.onCancel();
            throw e5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static final void m3556I(String str, long j5) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static C1804d m3557J(int i5, int i6) {
        if (i6 > Integer.MIN_VALUE) {
            return new C1804d(i5, i6 - 1, 1);
        }
        C1804d c1804d = C1804d.f6147g;
        return C1804d.f6147g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3558a(C0185S c0185s, AbstractC1176a abstractC1176a) {
        C0952x c0952x;
        EnumC1152a enumC1152a;
        int size;
        int i5;
        if (abstractC1176a instanceof C0952x) {
            c0952x = (C0952x) abstractC1176a;
            int i6 = c0952x.f3001i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0952x.f3001i = i6 - Integer.MIN_VALUE;
            } else {
                c0952x = new C0952x(abstractC1176a);
            }
        }
        Object objM271a = c0952x.f3000h;
        int i7 = c0952x.f3001i;
        if (i7 == 0) {
            AbstractC1784a.m3205S(objM271a);
            c0952x.f2999g = c0185s;
            c0952x.f3001i = 1;
            objM271a = c0185s.m271a(EnumC0201o.f703e, c0952x);
            enumC1152a = EnumC1152a.f3788d;
            if (objM271a == enumC1152a) {
            }
            C0200n c0200n = (C0200n) objM271a;
            ?? r12 = c0200n.f696a;
            size = r12.size();
            i5 = 0;
            while (i5 < size) {
            }
            return c0200n;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c0185s = c0952x.f2999g;
        AbstractC1784a.m3205S(objM271a);
        C0200n c0200n2 = (C0200n) objM271a;
        ?? r122 = c0200n2.f696a;
        size = r122.size();
        i5 = 0;
        while (i5 < size) {
            if (AbstractC0208v.m311a((C0209w) r122.get(i5))) {
                i5++;
            } else {
                c0952x.f2999g = c0185s;
                c0952x.f3001i = 1;
                objM271a = c0185s.m271a(EnumC0201o.f703e, c0952x);
                enumC1152a = EnumC1152a.f3788d;
                if (objM271a == enumC1152a) {
                    return enumC1152a;
                }
                C0200n c0200n22 = (C0200n) objM271a;
                ?? r1222 = c0200n22.f696a;
                size = r1222.size();
                i5 = 0;
                while (i5 < size) {
                }
            }
        }
        return c0200n22;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
    
        if (r15 == r6) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3559b(C0185S c0185s, InterfaceC0092v0 interfaceC0092v0, C0200n c0200n, int i5, AbstractC1176a abstractC1176a) {
        C0899A c0899a;
        long j5;
        C1674s c1674s;
        if (abstractC1176a instanceof C0899A) {
            c0899a = (C0899A) abstractC1176a;
            int i6 = c0899a.f2796l;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0899a.f2796l = i6 - Integer.MIN_VALUE;
            } else {
                c0899a = new C0899A(abstractC1176a);
            }
        }
        Object objM281l = c0899a.f2795k;
        int i7 = c0899a.f2796l;
        C0891q c0891q = C0891q.f2780a;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        try {
            if (i7 == 0) {
                AbstractC1784a.m3205S(objM281l);
                C0209w c0209w = (C0209w) AbstractC0973m.m2012S(c0200n.f696a);
                j5 = c0209w.f711a;
                interfaceC0092v0.mo128a(c0209w.f713c, i5 > 2 ? C0950v.f2991f : C0950v.f2990e);
                c1674s = new C1674s();
                c1674s.f5708d = 9205357640488583168L;
                long jMo776c = c0185s.m277f().mo776c();
                C0900B c0900b = new C0900B(j5, c1674s, null);
                c0899a.f2791g = c0185s;
                c0899a.f2792h = interfaceC0092v0;
                c0899a.f2793i = c1674s;
                c0899a.f2794j = j5;
                c0899a.f2796l = 1;
                objM281l = c0185s.m281l(jMo776c, c0900b, c0899a);
                if (objM281l == enumC1152a) {
                }
                return enumC1152a;
            }
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC0092v0 = c0899a.f2792h;
                c0185s = c0899a.f2791g;
                AbstractC1784a.m3205S(objM281l);
                if (!((Boolean) objM281l).booleanValue()) {
                    interfaceC0092v0.onCancel();
                    return c0891q;
                }
                ?? r11 = c0185s.f645i.f653w.f696a;
                int size = r11.size();
                for (int i8 = 0; i8 < size; i8++) {
                    C0209w c0209w2 = (C0209w) r11.get(i8);
                    if (AbstractC0208v.m313c(c0209w2)) {
                        c0209w2.m320a();
                    }
                }
                interfaceC0092v0.mo129b();
                return c0891q;
            }
            long j6 = c0899a.f2794j;
            c1674s = c0899a.f2793i;
            InterfaceC0092v0 interfaceC0092v02 = c0899a.f2792h;
            C0185S c0185s2 = c0899a.f2791g;
            try {
                AbstractC1784a.m3205S(objM281l);
                j5 = j6;
                interfaceC0092v0 = interfaceC0092v02;
                c0185s = c0185s2;
            } catch (CancellationException e5) {
                e = e5;
                interfaceC0092v0 = interfaceC0092v02;
                interfaceC0092v0.onCancel();
                throw e;
            }
            EnumC0938j enumC0938j = (EnumC0938j) objM281l;
            if (enumC0938j == null) {
                enumC0938j = EnumC0938j.f2942f;
            }
            if (enumC0938j == EnumC0938j.f2943g) {
                interfaceC0092v0.onCancel();
                return c0891q;
            }
            if (enumC0938j == EnumC0938j.f2940d) {
                interfaceC0092v0.mo129b();
                return c0891q;
            }
            if (enumC0938j == EnumC0938j.f2941e) {
                interfaceC0092v0.mo132e(c1674s.f5708d);
            }
            C0080p0 c0080p0 = new C0080p0(interfaceC0092v0, 2);
            c0899a.f2791g = c0185s;
            c0899a.f2792h = interfaceC0092v0;
            c0899a.f2793i = null;
            c0899a.f2796l = 2;
            objM281l = AbstractC2945D.m5154e(c0185s, j5, c0080p0, c0899a);
        } catch (CancellationException e6) {
            e = e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m3560c(Context context) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        AbstractC1665j.m2985e(context, "context");
        Resources resources = context.getResources();
        AbstractC1665j.m2984d(resources, "getResources(...)");
        String str = AbstractC1785a.f6098d;
        if (str != null) {
            m3561d(resources, str);
        } else {
            AbstractC1665j.m2991k("moduleApkPath");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m3561d(Resources resources, String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Method declaredMethod = AssetManager.class.getDeclaredMethod("addAssetPath", String.class);
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(resources.getAssets(), str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final boolean m3562e(int i5, int i6, int i7, byte[] bArr, byte[] bArr2) {
        AbstractC1665j.m2985e(bArr, "a");
        AbstractC1665j.m2985e(bArr2, "b");
        for (int i8 = 0; i8 < i7; i8++) {
            if (bArr[i8 + i5] != bArr2[i8 + i6]) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String m3563f(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final void m3564g(long j5, long j6, long j7) {
        if ((j6 | j7) < 0 || j6 > j5 || j5 - j6 < j7) {
            throw new ArrayIndexOutOfBoundsException("size=" + j5 + " offset=" + j6 + " byteCount=" + j7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m3565h(int i5) {
        if (2 > i5 || i5 >= 37) {
            StringBuilder sbM404o = AbstractC0231b.m404o(i5, "radix ", " was not in valid range ");
            sbM404o.append(new C1804d(2, 36, 1));
            throw new IllegalArgumentException(sbM404o.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static double m3566i(double d5, double d6, double d7) {
        if (d6 <= d7) {
            return d5 < d6 ? d6 : d5 > d7 ? d7 : d5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d7 + " is less than minimum " + d6 + '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static float m3567j(float f2, float f5, float f6) {
        if (f5 <= f6) {
            return f2 < f5 ? f5 : f2 > f6 ? f6 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f6 + " is less than minimum " + f5 + '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static int m3568k(int i5, int i6, int i7) {
        if (i6 <= i7) {
            return i5 < i6 ? i6 : i5 > i7 ? i7 : i5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i7 + " is less than minimum " + i6 + '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static long m3569l(long j5) {
        if (j5 < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j5 > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.io.Serializable */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static long[] m3570m(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            jArr[i5] = iArr[i5];
        }
        return jArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final void m3571n(int i5, int i6) {
        if (i5 <= i6) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i5 + ") is greater than size (" + i6 + ").");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final boolean m3572o(char c5, char c6, boolean z5) {
        if (c5 == c6) {
            return true;
        }
        if (!z5) {
            return false;
        }
        char upperCase = Character.toUpperCase(c5);
        char upperCase2 = Character.toUpperCase(c6);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0170  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3356c m3573p(DexKitBridge dexKitBridge, C3456b c3456b) {
        Object objValueOf;
        Object objM3229o;
        AbstractC1665j.m2985e(dexKitBridge, "bridge");
        ArrayList arrayList = new ArrayList();
        int iM4685b = c3456b.m4685b(4);
        int iM4689f = iM4685b != 0 ? c3456b.m4689f(iM4685b) : 0;
        for (int i5 = 0; i5 < iM4689f; i5++) {
            C3455a c3455a = new C3455a();
            int iM4685b2 = c3456b.m4685b(4);
            ByteBuffer byteBufferOrder = null;
            if (iM4685b2 != 0) {
                int iM4684a = c3456b.m4684a((i5 * 4) + c3456b.m4688e(iM4685b2));
                ByteBuffer byteBuffer = c3456b.f8592b;
                AbstractC1665j.m2984d(byteBuffer, "bb");
                c3455a.m4686c(iM4684a, byteBuffer);
            } else {
                c3455a = null;
            }
            AbstractC1665j.m2982b(c3455a);
            int iM4685b3 = c3455a.m4685b(6);
            int iM3248h = AbstractC1785a.m3248h(iM4685b3 != 0 ? c3455a.f8592b.get(iM4685b3 + c3455a.f8591a) : (byte) 0);
            switch (AbstractC0636d.m1088a(iM3248h)) {
                case 0:
                    AbstractC2691c abstractC2691cM5708j = c3455a.m5708j(new C3460f());
                    AbstractC1665j.m2983c(abstractC2691cM5708j, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueByte{ org.luckypray.dexkit.AliasKt.InnerEncodeValueByte }");
                    C3460f c3460f = (C3460f) abstractC2691cM5708j;
                    int iM4685b4 = c3460f.m4685b(4);
                    objValueOf = Byte.valueOf(iM4685b4 != 0 ? c3460f.f8592b.get(iM4685b4 + c3460f.f8591a) : (byte) 0);
                    break;
                case BuildConfig.VERSION_CODE /* 1 */:
                    AbstractC2691c abstractC2691cM5708j2 = c3455a.m5708j(new C3467m());
                    AbstractC1665j.m2983c(abstractC2691cM5708j2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueShort{ org.luckypray.dexkit.AliasKt.InnerEncodeValueShort }");
                    C3467m c3467m = (C3467m) abstractC2691cM5708j2;
                    int iM4685b5 = c3467m.m4685b(4);
                    objValueOf = Short.valueOf(iM4685b5 != 0 ? c3467m.f8592b.getShort(iM4685b5 + c3467m.f8591a) : (short) 0);
                    break;
                case 2:
                    AbstractC2691c abstractC2691cM5708j3 = c3455a.m5708j(new C3461g());
                    AbstractC1665j.m2983c(abstractC2691cM5708j3, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueChar{ org.luckypray.dexkit.AliasKt.InnerEncodeValueChar }");
                    C3461g c3461g = (C3461g) abstractC2691cM5708j3;
                    int iM4685b6 = c3461g.m4685b(4);
                    objValueOf = Short.valueOf(iM4685b6 != 0 ? c3461g.f8592b.getShort(iM4685b6 + c3461g.f8591a) : (short) 0);
                    break;
                case 3:
                    AbstractC2691c abstractC2691cM5708j4 = c3455a.m5708j(new C3464j());
                    AbstractC1665j.m2983c(abstractC2691cM5708j4, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueInt{ org.luckypray.dexkit.AliasKt.InnerEncodeValueInt }");
                    C3464j c3464j = (C3464j) abstractC2691cM5708j4;
                    int iM4685b7 = c3464j.m4685b(4);
                    objValueOf = Integer.valueOf(iM4685b7 != 0 ? c3464j.f8592b.getInt(iM4685b7 + c3464j.f8591a) : 0);
                    break;
                case 4:
                    AbstractC2691c abstractC2691cM5708j5 = c3455a.m5708j(new C3465k());
                    AbstractC1665j.m2983c(abstractC2691cM5708j5, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueLong{ org.luckypray.dexkit.AliasKt.InnerEncodeValueLong }");
                    C3465k c3465k = (C3465k) abstractC2691cM5708j5;
                    int iM4685b8 = c3465k.m4685b(4);
                    objValueOf = Long.valueOf(iM4685b8 != 0 ? c3465k.f8592b.getLong(iM4685b8 + c3465k.f8591a) : 0L);
                    break;
                case 5:
                    AbstractC2691c abstractC2691cM5708j6 = c3455a.m5708j(new C3463i());
                    AbstractC1665j.m2983c(abstractC2691cM5708j6, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueFloat{ org.luckypray.dexkit.AliasKt.InnerEncodeValueFloat }");
                    C3463i c3463i = (C3463i) abstractC2691cM5708j6;
                    int iM4685b9 = c3463i.m4685b(4);
                    objValueOf = Float.valueOf(iM4685b9 != 0 ? c3463i.f8592b.getFloat(iM4685b9 + c3463i.f8591a) : 0.0f);
                    break;
                case 6:
                    AbstractC2691c abstractC2691cM5708j7 = c3455a.m5708j(new C3462h());
                    AbstractC1665j.m2983c(abstractC2691cM5708j7, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueDouble{ org.luckypray.dexkit.AliasKt.InnerEncodeValueDouble }");
                    C3462h c3462h = (C3462h) abstractC2691cM5708j7;
                    int iM4685b10 = c3462h.m4685b(4);
                    objValueOf = Double.valueOf(iM4685b10 != 0 ? c3462h.f8592b.getDouble(iM4685b10 + c3462h.f8591a) : 0.0d);
                    break;
                case 7:
                    AbstractC2691c abstractC2691cM5708j8 = c3455a.m5708j(new C3468n());
                    AbstractC1665j.m2983c(abstractC2691cM5708j8, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueString{ org.luckypray.dexkit.AliasKt.InnerEncodeValueString }");
                    C3468n c3468n = (C3468n) abstractC2691cM5708j8;
                    try {
                        try {
                            int iM4685b11 = c3468n.m4685b(4);
                            String strM4687d = iM4685b11 != 0 ? c3468n.m4687d(iM4685b11 + c3468n.f8591a) : null;
                            AbstractC1665j.m2982b(strM4687d);
                            objValueOf = strM4687d;
                        } catch (IllegalArgumentException unused) {
                            int iM4685b12 = c3468n.m4685b(4);
                            if (iM4685b12 != 0) {
                                byteBufferOrder = c3468n.f8592b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
                                int iM4688e = c3468n.m4688e(iM4685b12);
                                byteBufferOrder.position(iM4688e);
                                byteBufferOrder.limit(c3468n.m4689f(iM4685b12) + iM4688e);
                            }
                            AbstractC1665j.m2984d(byteBufferOrder, "__vector_as_bytebuffer(4, 1)");
                            objM3229o = AbstractC1922d.m3429h(AbstractC1785a.m3246f(byteBufferOrder));
                            if (AbstractC0885k.m1902a(objM3229o) != null) {
                                objM3229o = "";
                            }
                            objValueOf = (String) objM3229o;
                            AbstractC1665j.m2984d(objValueOf, "when (type) {\n          …lue\n                    }");
                            arrayList.add(new C3357d(iM3248h, objValueOf));
                        }
                    } catch (Throwable th) {
                        objM3229o = AbstractC1784a.m3229o(th);
                        if (AbstractC0885k.m1902a(objM3229o) != null) {
                        }
                        objValueOf = (String) objM3229o;
                        AbstractC1665j.m2984d(objValueOf, "when (type) {\n          …lue\n                    }");
                        arrayList.add(new C3357d(iM3248h, objValueOf));
                    }
                    break;
                case 8:
                    AbstractC2691c abstractC2691cM5708j9 = c3455a.m5708j(new C3458d());
                    AbstractC1665j.m2983c(abstractC2691cM5708j9, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-ClassMeta{ org.luckypray.dexkit.AliasKt.InnerClassMeta }");
                    objValueOf = AbstractC2352g.m4205r(dexKitBridge, (C3458d) abstractC2691cM5708j9);
                    break;
                case 9:
                    AbstractC2691c abstractC2691cM5708j10 = c3455a.m5708j(new C3470p());
                    AbstractC1665j.m2983c(abstractC2691cM5708j10, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-MethodMeta{ org.luckypray.dexkit.AliasKt.InnerMethodMeta }");
                    objValueOf = AbstractC1784a.m3234t(dexKitBridge, (C3470p) abstractC2691cM5708j10);
                    break;
                case 10:
                    AbstractC2691c abstractC2691cM5708j11 = c3455a.m5708j(new C3469o());
                    AbstractC1665j.m2983c(abstractC2691cM5708j11, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-FieldMeta{ org.luckypray.dexkit.AliasKt.InnerFieldMeta }");
                    objValueOf = AbstractC0797o.m1389n(dexKitBridge, (C3469o) abstractC2691cM5708j11);
                    break;
                case 11:
                    AbstractC2691c abstractC2691cM5708j12 = c3455a.m5708j(new C3456b());
                    AbstractC1665j.m2983c(abstractC2691cM5708j12, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeArray{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeArray }");
                    objValueOf = m3573p(dexKitBridge, (C3456b) abstractC2691cM5708j12);
                    break;
                case 12:
                    AbstractC2691c abstractC2691cM5708j13 = c3455a.m5708j(new C3457c());
                    AbstractC1665j.m2983c(abstractC2691cM5708j13, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationMeta }");
                    objValueOf = AbstractC1925g.m3539p(dexKitBridge, (C3457c) abstractC2691cM5708j13);
                    break;
                case 13:
                    AbstractC2691c abstractC2691cM5708j14 = c3455a.m5708j(new C3466l());
                    AbstractC1665j.m2983c(abstractC2691cM5708j14, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueNull{ org.luckypray.dexkit.AliasKt.InnerEncodeValueNull }");
                    objValueOf = (C3466l) abstractC2691cM5708j14;
                    break;
                case 14:
                    AbstractC2691c abstractC2691cM5708j15 = c3455a.m5708j(new C3459e());
                    AbstractC1665j.m2983c(abstractC2691cM5708j15, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueBoolean{ org.luckypray.dexkit.AliasKt.InnerEncodeValueBoolean }");
                    C3459e c3459e = (C3459e) abstractC2691cM5708j15;
                    int iM4685b13 = c3459e.m4685b(4);
                    objValueOf = Boolean.valueOf((iM4685b13 == 0 || ((byte) 0) == c3459e.f8592b.get(iM4685b13 + c3459e.f8591a)) ? false : true);
                    break;
                default:
                    throw new C0330q();
            }
            AbstractC1665j.m2984d(objValueOf, "when (type) {\n          …lue\n                    }");
            arrayList.add(new C3357d(iM3248h, objValueOf));
        }
        return new C3356c(dexKitBridge, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static C1705o m3574q(SSLSession sSLSession) throws IOException {
        Object objM3183j;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        C1698h c1698hM3011b = C1698h.f5805b.m3011b(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        EnumC1689K.f5766e.getClass();
        EnumC1689K enumC1689KM3009c = C1692b.m3009c(protocol);
        try {
            objM3183j = AbstractC1776g.m3183j(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            objM3183j = C0981u.f3047d;
        }
        return new C1705o(enumC1689KM3009c, c1698hM3011b, AbstractC1776g.m3183j(sSLSession.getLocalCertificates()), new C0099z(14, objM3183j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final long m3575r(C1753n c1753n) {
        DragEvent dragEvent = (DragEvent) c1753n.f6028e;
        float x5 = dragEvent.getX();
        float y5 = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x5)) << 32) | (((long) Float.floatToRawIntBits(y5)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final int m3576s(int i5, int i6, int i7) {
        if (i7 > 0) {
            if (i5 < i6) {
                int i8 = i6 % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i5 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i6 - i10;
            }
        } else {
            if (i7 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i5 > i6) {
                int i11 = -i7;
                int i12 = i5 % i11;
                if (i12 < 0) {
                    i12 += i11;
                }
                int i13 = i6 % i11;
                if (i13 < 0) {
                    i13 += i11;
                }
                int i14 = (i12 - i13) % i11;
                if (i14 < 0) {
                    i14 += i11;
                }
                return i14 + i6;
            }
        }
        return i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final Bundle m3577t(String str, Bundle bundle) {
        AbstractC1665j.m2985e(str, "key");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        throw new IllegalArgumentException(AbstractC0231b.m400k("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final long m3578u(double d5) {
        return m3582y((float) d5, 4294967296L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final long m3579v(int i5) {
        return m3582y(i5, 4294967296L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static boolean m3580w(char c5) {
        return Character.isWhitespace(c5) || Character.isSpaceChar(c5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0165, code lost:
    
        if (r3 == r13) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:44:0x00b5, B:46:0x00bd, B:48:0x00c9, B:50:0x00d5, B:41:0x009b), top: B:98:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3581x(C0185S c0185s, C2029h c2029h, C0793k c0793k, C0200n c0200n, AbstractC1176a abstractC1176a) {
        C0953y c0953y;
        C0363A c0363a;
        boolean z5;
        C1671p c1671p;
        C0078o0 c0078o0;
        boolean z6;
        C0185S c0185s2 = c0185s;
        C2029h c2029h2 = c2029h;
        C0363A c0363a2 = C0950v.f2989d;
        if (abstractC1176a instanceof C0953y) {
            c0953y = (C0953y) abstractC1176a;
            int i5 = c0953y.f3006k;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0953y.f3006k = i5 - Integer.MIN_VALUE;
            } else {
                c0953y = new C0953y(abstractC1176a);
            }
        }
        C0953y c0953y2 = c0953y;
        Object objM5154e = c0953y2.f3005j;
        int i6 = c0953y2.f3006k;
        int i7 = 0;
        try {
            try {
                if (i6 == 0) {
                    AbstractC1784a.m3205S(objM5154e);
                    C0209w c0209w = (C0209w) c0200n.f696a.get(0);
                    int i8 = c0200n.f700e & 1;
                    EnumC1152a enumC1152a = EnumC1152a.f3788d;
                    if (i8 != 0) {
                        long j5 = c0209w.f713c;
                        C0920W c0920w = (C0920W) c2029h2.f6764g;
                        C0078o0 c0078o02 = c0920w.f2868d;
                        if (c0078o02 == null || c0078o02.m123d() == null || !c0920w.m1936k()) {
                            z6 = false;
                        } else {
                            c0920w.f2883s = -1;
                            C2590u c2590u = c0920w.f2875k;
                            if (c2590u != null) {
                                C2590u.m4539a(c2590u);
                            }
                            c2029h2.m3729g(c0920w.m1939n(), j5, false, C0950v.f2989d);
                            z6 = true;
                        }
                        if (z6) {
                            c0209w.m320a();
                            long j6 = c0209w.f711a;
                            C0049a c0049a = new C0049a(8, c2029h2);
                            c0953y2.f3002g = c0185s2;
                            c0953y2.f3003h = c2029h2;
                            c0953y2.f3006k = 1;
                            objM5154e = AbstractC2945D.m5154e(c0185s2, j6, c0049a, c0953y2);
                            if (objM5154e == enumC1152a) {
                                return enumC1152a;
                            }
                            if (((Boolean) objM5154e).booleanValue()) {
                            }
                        }
                    } else {
                        int i9 = c0793k.f2537e;
                        if (i9 != 1) {
                            c0363a = i9 != 2 ? C0950v.f2991f : C0950v.f2990e;
                        } else {
                            c0363a = c0363a2;
                        }
                        long j7 = c0209w.f713c;
                        C0920W c0920w2 = (C0920W) c2029h2.f6764g;
                        if (!c0920w2.m1936k() || c0920w2.m1939n().f5650a.f4563e.length() == 0 || (c0078o0 = c0920w2.f2868d) == null || c0078o0.m123d() == null) {
                            z5 = false;
                        } else {
                            C2590u c2590u2 = c0920w2.f2875k;
                            if (c2590u2 != null) {
                                C2590u.m4539a(c2590u2);
                            }
                            c0920w2.f2878n = j7;
                            c0920w2.f2883s = -1;
                            z5 = true;
                            c0920w2.m1933h(true);
                            long jM3729g = c2029h2.m3729g(c0920w2.m1939n(), c0920w2.f2878n, true, c0363a);
                            if (i9 >= 2) {
                                c2029h2.f6762e = true;
                                c2029h2.f6763f = new C1259L(jM3729g);
                            }
                        }
                        if (z5) {
                            c1671p = new C1671p();
                            c1671p.f5705d = !c0363a.equals(c0363a2);
                            long j8 = c0209w.f711a;
                            C0075n c0075n = new C0075n(c2029h2, c0363a, c1671p, 7);
                            c0953y2.f3002g = c0185s2;
                            c0953y2.f3003h = c2029h2;
                            c0953y2.f3004i = c1671p;
                            c0953y2.f3006k = 2;
                            objM5154e = AbstractC2945D.m5154e(c0185s2, j8, c0075n, c0953y2);
                        }
                    }
                } else if (i6 == 1) {
                    c2029h2 = c0953y2.f3003h;
                    c0185s2 = c0953y2.f3002g;
                    AbstractC1784a.m3205S(objM5154e);
                    if (((Boolean) objM5154e).booleanValue()) {
                        ?? r02 = c0185s2.f645i.f653w.f696a;
                        int size = r02.size();
                        while (i7 < size) {
                            C0209w c0209w2 = (C0209w) r02.get(i7);
                            if (AbstractC0208v.m313c(c0209w2)) {
                                c0209w2.m320a();
                            }
                            i7++;
                        }
                    }
                } else {
                    if (i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1671p c1671p2 = c0953y2.f3004i;
                    c2029h2 = c0953y2.f3003h;
                    C0185S c0185s3 = c0953y2.f3002g;
                    AbstractC1784a.m3205S(objM5154e);
                    c1671p = c1671p2;
                    c0185s2 = c0185s3;
                    if (((Boolean) objM5154e).booleanValue() && c1671p.f5705d) {
                        ?? r03 = c0185s2.f645i.f653w.f696a;
                        int size2 = r03.size();
                        while (i7 < size2) {
                            C0209w c0209w3 = (C0209w) r03.get(i7);
                            if (AbstractC0208v.m313c(c0209w3)) {
                                c0209w3.m320a();
                            }
                            i7++;
                        }
                    }
                    c2029h2.m3728f();
                }
                return C0891q.f2780a;
            } finally {
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final long m3582y(float f2, long j5) {
        long jFloatToRawIntBits = j5 | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        C2020p[] c2020pArr = C2019o.f6746b;
        return jFloatToRawIntBits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0457 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ab  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:84:0x01e1
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final p239t0.AbstractC3207b m3583z(int r46, p095T.InterfaceC1373m r47) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r46
            T.U0 r1 = p047I0.AbstractC0691Q.f2211b
            r2 = r47
            T.r r2 = (p095T.C1383r) r2
            java.lang.Object r1 = r2.m2590j(r1)
            android.content.Context r1 = (android.content.Context) r1
            T.C r3 = p047I0.AbstractC0691Q.f2212c
            java.lang.Object r3 = r2.m2590j(r3)
            android.content.res.Resources r3 = (android.content.res.Resources) r3
            T.U0 r4 = p047I0.AbstractC0691Q.f2214e
            java.lang.Object r4 = r2.m2590j(r4)
            N0.d r4 = (p067N0.C1010d) r4
            monitor-enter(r4)
            k.u r5 = r4.f3126a     // Catch: java.lang.Throwable -> L43
            java.lang.Object r5 = r5.m4318b(r0)     // Catch: java.lang.Throwable -> L43
            android.util.TypedValue r5 = (android.util.TypedValue) r5     // Catch: java.lang.Throwable -> L43
            r6 = 1
            if (r5 != 0) goto L46
            android.util.TypedValue r5 = new android.util.TypedValue     // Catch: java.lang.Throwable -> L43
            r5.<init>()     // Catch: java.lang.Throwable -> L43
            r3.getValue(r0, r5, r6)     // Catch: java.lang.Throwable -> L43
            k.u r7 = r4.f3126a     // Catch: java.lang.Throwable -> L43
            int r8 = r7.m4340d(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.Object[] r9 = r7.f7847c     // Catch: java.lang.Throwable -> L43
            r10 = r9[r8]     // Catch: java.lang.Throwable -> L43
            int[] r7 = r7.f7846b     // Catch: java.lang.Throwable -> L43
            r7[r8] = r0     // Catch: java.lang.Throwable -> L43
            r9[r8] = r5     // Catch: java.lang.Throwable -> L43
            goto L46
        L43:
            r0 = move-exception
            goto L61e
        L46:
            monitor-exit(r4)
            java.lang.CharSequence r4 = r5.string
            r8 = 0
            if (r4 == 0) goto L5c3
            java.lang.String r9 = ".xml"
            boolean r9 = p149d3.AbstractC1976d.m3631Y(r4, r9)
            if (r9 != r6) goto L5c3
            r4 = -1771798434(0xffffffff9664805e, float:-1.8458199E-25)
            r2.m2568W(r4)
            android.content.res.Resources$Theme r1 = r1.getTheme()
            int r4 = r5.changingConfigurations
            T.U0 r5 = p047I0.AbstractC0691Q.f2213d
            java.lang.Object r5 = r2.m2590j(r5)
            N0.c r5 = (p067N0.C1009c) r5
            N0.b r9 = new N0.b
            r9.<init>(r1, r0)
            java.util.HashMap r10 = r5.f3125a
            java.lang.Object r10 = r10.get(r9)
            java.lang.ref.WeakReference r10 = (java.lang.ref.WeakReference) r10
            if (r10 == 0) goto L7e
            java.lang.Object r10 = r10.get()
            N0.a r10 = (p067N0.C1007a) r10
            goto L7f
        L7e:
            r10 = 0
        L7f:
            if (r10 != 0) goto L5b8
            android.content.res.XmlResourceParser r10 = r3.getXml(r0)
            int r0 = r10.next()
        L89:
            r11 = 2
            if (r0 == r11) goto L93
            if (r0 == r6) goto L93
            int r0 = r10.next()
            goto L89
        L93:
            if (r0 != r11) goto L5b0
            java.lang.String r0 = r10.getName()
            java.lang.String r12 = "vector"
            boolean r0 = p117X2.AbstractC1665j.m2981a(r0, r12)
            if (r0 == 0) goto L5a8
            android.util.AttributeSet r12 = android.util.Xml.asAttributeSet(r10)
            v0.a r13 = new v0.a
            r13.<init>(r10)
            int[] r0 = p251v0.AbstractC3351b.f10413a
            if (r1 != 0) goto Lb4
            android.content.res.TypedArray r0 = r3.obtainAttributes(r12, r0)
        Lb2:
            r14 = r0
            goto Lb9
        Lb4:
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r12, r0, r8, r8)
            goto Lb2
        Lb9:
            int r0 = r14.getChangingConfigurations()
            r13.m5602c(r0)
            java.lang.String r0 = "autoMirrored"
            java.lang.String r15 = "http://schemas.android.com/apk/res/android"
            java.lang.String r0 = r10.getAttributeValue(r15, r0)
            r15 = 5
            if (r0 == 0) goto Ld2
            boolean r0 = r14.getBoolean(r15, r8)
            r25 = r0
            goto Ld4
        Ld2:
            r25 = r8
        Ld4:
            int r0 = r14.getChangingConfigurations()
            r13.m5602c(r0)
            java.lang.String r0 = "viewportWidth"
            r7 = 7
            r15 = 0
            float r20 = r13.m5601b(r14, r0, r7, r15)
            java.lang.String r0 = "viewportHeight"
            r7 = 8
            float r21 = r13.m5601b(r14, r0, r7, r15)
            int r0 = (r20 > r15 ? 1 : (r20 == r15 ? 0 : -1))
            if (r0 <= 0) goto L58d
            int r0 = (r21 > r15 ? 1 : (r21 == r15 ? 0 : -1))
            if (r0 <= 0) goto L572
            r7 = 3
            float r16 = r14.getDimension(r7, r15)
            int r0 = r14.getChangingConfigurations()
            r13.m5602c(r0)
            float r17 = r14.getDimension(r11, r15)
            int r0 = r14.getChangingConfigurations()
            r13.m5602c(r0)
            boolean r0 = r14.hasValue(r6)
            if (r0 == 0) goto L18d
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r14.getValue(r6, r0)
            int r0 = r0.type
            if (r0 != r11) goto L122
            long r18 = p211o0.C2762u.f8762g
        L11e:
            r22 = r18
            goto L190
        L122:
            java.lang.String r0 = "tint"
            java.lang.String r15 = "http://schemas.android.com/apk/res/android"
            java.lang.String r0 = r10.getAttributeValue(r15, r0)
            if (r0 == 0) goto L162
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r14.getValue(r6, r0)
            int r15 = r0.type
            if (r15 == r11) goto L164
            r11 = 28
            if (r15 < r11) goto L147
            r11 = 31
            if (r15 > r11) goto L147
            int r0 = r0.data
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            goto L178
        L147:
            android.content.res.Resources r0 = r14.getResources()
            int r11 = r14.getResourceId(r6, r8)
            java.lang.ThreadLocal r15 = p199m1.AbstractC2597b.f8261a
            android.content.res.XmlResourceParser r11 = r0.getXml(r11)     // Catch: java.lang.Exception -> L15a
            android.content.res.ColorStateList r0 = p199m1.AbstractC2597b.m4545a(r0, r11, r1)     // Catch: java.lang.Exception -> L15a
            goto L178
        L15a:
            r0 = move-exception
            java.lang.String r11 = "CSLCompat"
            java.lang.String r15 = "Failed to inflate ColorStateList."
            android.util.Log.e(r11, r15, r0)
        L162:
            r0 = 0
            goto L178
        L164:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to resolve attribute at index 1: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L178:
            int r11 = r14.getChangingConfigurations()
            r13.m5602c(r11)
            if (r0 == 0) goto L18a
            int r0 = r0.getDefaultColor()
            long r18 = p211o0.AbstractC2767z.m4933c(r0)
            goto L11e
        L18a:
            long r18 = p211o0.C2762u.f8762g
            goto L11e
        L18d:
            long r18 = p211o0.C2762u.f8762g
            goto L11e
        L190:
            r0 = 6
            r11 = -1
            int r15 = r14.getInt(r0, r11)
            int r0 = r14.getChangingConfigurations()
            r13.m5602c(r0)
            r0 = 9
            if (r15 == r11) goto L1ab
            if (r15 == r7) goto L1bc
            r11 = 5
            if (r15 == r11) goto L1ab
            if (r15 == r0) goto L1b9
            switch(r15) {
                case 14: goto L1b6;
                case 15: goto L1b1;
                case 16: goto L1ae;
                default: goto L1ab;
            }
        L1ab:
            r24 = 5
            goto L1be
        L1ae:
            r24 = 12
            goto L1be
        L1b1:
            r11 = 14
            r24 = r11
            goto L1be
        L1b6:
            r24 = 13
            goto L1be
        L1b9:
            r24 = r0
            goto L1be
        L1bc:
            r24 = r7
        L1be:
            android.util.DisplayMetrics r11 = r3.getDisplayMetrics()
            float r11 = r11.density
            float r18 = r16 / r11
            android.util.DisplayMetrics r11 = r3.getDisplayMetrics()
            float r11 = r11.density
            float r19 = r17 / r11
            r14.recycle()
            u0.e r16 = new u0.e
            r17 = 0
            r26 = 1
            r16.<init>(r17, r18, r19, r20, r21, r22, r24, r25, r26)
            r11 = r16
            r14 = r8
        L1dd:
            int r15 = r10.getEventType()
            if (r15 == r6) goto L1ef
            int r15 = r10.getDepth()
            if (r15 >= r6) goto L1f4
            int r15 = r10.getEventType()
            if (r15 != r7) goto L1f4
        L1ef:
            r29 = r4
            r7 = r9
            goto L55a
        L1f4:
            java.lang.String r15 = "group"
            L2.u r25 = p061L2.C0981u.f3047d
            java.lang.String r16 = ""
            org.xmlpull.v1.XmlPullParser r0 = r13.f10410a
            r28 = r6
            Y1.n r6 = r13.f10412c
            int r8 = r0.getEventType()
            r29 = r4
            r4 = 2
            if (r8 == r4) goto L289
            if (r8 == r7) goto L212
        L20b:
            r7 = r9
            r30 = r10
        L20e:
            r4 = r28
            goto L333
        L212:
            java.lang.String r0 = r0.getName()
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L20b
            int r14 = r14 + 1
            r0 = 0
        L21f:
            if (r0 >= r14) goto L27c
            java.util.ArrayList r4 = r11.f10272i
            boolean r6 = r11.f10274k
            if (r6 == 0) goto L22c
            java.lang.String r6 = "ImageVector.Builder is single use, create a new instance to create a new ImageVector"
            p023E0.AbstractC0277a.m483b(r6)
        L22c:
            int r6 = r4.size()
            int r6 = r6 + (-1)
            java.lang.Object r6 = r4.remove(r6)
            u0.d r6 = (p245u0.C3307d) r6
            int r8 = r4.size()
            int r8 = r8 + (-1)
            java.lang.Object r4 = r4.get(r8)
            u0.d r4 = (p245u0.C3307d) r4
            java.util.ArrayList r4 = r4.f10263j
            u0.F r15 = new u0.F
            java.lang.String r8 = r6.f10254a
            float r7 = r6.f10255b
            r26 = r0
            float r0 = r6.f10256c
            r18 = r0
            float r0 = r6.f10257d
            r19 = r0
            float r0 = r6.f10258e
            r20 = r0
            float r0 = r6.f10259f
            r21 = r0
            float r0 = r6.f10260g
            r22 = r0
            float r0 = r6.f10261h
            r23 = r0
            java.util.List r0 = r6.f10262i
            java.util.ArrayList r6 = r6.f10263j
            r24 = r0
            r25 = r6
            r17 = r7
            r16 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r4.add(r15)
            int r0 = r26 + 1
            r7 = 3
            goto L21f
        L27c:
            r7 = r9
            r30 = r10
            r4 = r28
            r10 = 5
            r14 = 0
        L283:
            r15 = 9
        L285:
            r27 = -1
            goto L54c
        L289:
            java.lang.String r4 = r0.getName()
            if (r4 == 0) goto L20b
            int r7 = r4.hashCode()
            r8 = -1649314686(0xffffffff9db17482, float:-4.6971976E-21)
            if (r7 == r8) goto L4ce
            r8 = 3433509(0x346425, float:4.811371E-39)
            r30 = r10
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r7 == r8) goto L336
            r0 = 98629247(0x5e0f67f, float:2.1155407E-35)
            if (r7 == r0) goto L2a9
        L2a6:
            r7 = r9
            goto L20e
        L2a9:
            boolean r0 = r4.equals(r15)
            if (r0 != 0) goto L2b0
            goto L2a6
        L2b0:
            int[] r0 = p251v0.AbstractC3351b.f10414b
            if (r1 != 0) goto L2b9
            android.content.res.TypedArray r0 = r3.obtainAttributes(r12, r0)
            goto L2be
        L2b9:
            r4 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r12, r0, r4, r4)
        L2be:
            int r4 = r0.getChangingConfigurations()
            r13.m5602c(r4)
            java.lang.String r4 = "rotation"
            r6 = 0
            r7 = 5
            float r18 = r13.m5601b(r0, r4, r7, r6)
            r4 = r28
            float r19 = r0.getFloat(r4, r6)
            int r4 = r0.getChangingConfigurations()
            r13.m5602c(r4)
            r4 = 2
            float r20 = r0.getFloat(r4, r6)
            int r4 = r0.getChangingConfigurations()
            r13.m5602c(r4)
            java.lang.String r4 = "scaleX"
            r7 = 3
            float r21 = r13.m5601b(r0, r4, r7, r10)
            java.lang.String r4 = "scaleY"
            r7 = 4
            float r22 = r13.m5601b(r0, r4, r7, r10)
            java.lang.String r4 = "translateX"
            r7 = 6
            float r23 = r13.m5601b(r0, r4, r7, r6)
            java.lang.String r4 = "translateY"
            r7 = 7
            float r24 = r13.m5601b(r0, r4, r7, r6)
            r4 = 0
            java.lang.String r6 = r0.getString(r4)
            int r4 = r0.getChangingConfigurations()
            r13.m5602c(r4)
            if (r6 != 0) goto L313
            r17 = r16
            goto L315
        L313:
            r17 = r6
        L315:
            r0.recycle()
            int r0 = p245u0.AbstractC3300G.f10208a
            boolean r0 = r11.f10274k
            if (r0 == 0) goto L323
            java.lang.String r0 = "ImageVector.Builder is single use, create a new instance to create a new ImageVector"
            p023E0.AbstractC0277a.m483b(r0)
        L323:
            u0.d r16 = new u0.d
            r26 = 512(0x200, float:7.17E-43)
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0 = r16
            java.util.ArrayList r4 = r11.f10272i
            r4.add(r0)
        L331:
            r7 = r9
            r4 = 1
        L333:
            r10 = 5
            goto L283
        L336:
            java.lang.String r7 = "path"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L33f
            goto L331
        L33f:
            int[] r4 = p251v0.AbstractC3351b.f10415c
            if (r1 != 0) goto L349
            android.content.res.TypedArray r4 = r3.obtainAttributes(r12, r4)
            r7 = 0
            goto L34e
        L349:
            r7 = 0
            android.content.res.TypedArray r4 = r1.obtainStyledAttributes(r12, r4, r7, r7)
        L34e:
            int r8 = r4.getChangingConfigurations()
            r13.m5602c(r8)
            java.lang.String r8 = "pathData"
            java.lang.String r15 = "http://schemas.android.com/apk/res/android"
            java.lang.String r0 = r0.getAttributeValue(r15, r8)
            if (r0 == 0) goto L4c6
            java.lang.String r0 = r4.getString(r7)
            int r7 = r4.getChangingConfigurations()
            r13.m5602c(r7)
            if (r0 != 0) goto L370
            r32 = r16
        L36e:
            r7 = 2
            goto L373
        L370:
            r32 = r0
            goto L36e
        L373:
            java.lang.String r0 = r4.getString(r7)
            int r7 = r4.getChangingConfigurations()
            r13.m5602c(r7)
            if (r0 != 0) goto L385
            int r0 = p245u0.AbstractC3300G.f10208a
        L382:
            r33 = r25
            goto L38a
        L385:
            java.util.ArrayList r25 = p121Y1.C1753n.m3106G(r6, r0)
            goto L382
        L38a:
            java.lang.String r0 = "fillColor"
            r6 = 1
            C0.c r0 = r13.m5600a(r4, r1, r0, r6)
            java.lang.String r6 = "fillAlpha"
            r7 = 12
            float r36 = r13.m5601b(r4, r6, r7, r10)
            java.lang.String r6 = "strokeLineCap"
            org.xmlpull.v1.XmlPullParser r8 = r13.f10410a
            boolean r6 = p199m1.AbstractC2596a.m4541a(r8, r6)
            if (r6 != 0) goto L3a7
            r6 = -1
            r8 = 8
            goto L3af
        L3a7:
            r6 = -1
            r8 = 8
            int r15 = r4.getInt(r8, r6)
            r6 = r15
        L3af:
            int r15 = r4.getChangingConfigurations()
            r13.m5602c(r15)
            if (r6 == 0) goto L3be
            r15 = 1
            if (r6 == r15) goto L3c4
            r15 = 2
            if (r6 == r15) goto L3c1
        L3be:
            r40 = 0
            goto L3c6
        L3c1:
            r40 = 2
            goto L3c6
        L3c4:
            r40 = 1
        L3c6:
            java.lang.String r6 = "strokeLineJoin"
            org.xmlpull.v1.XmlPullParser r15 = r13.f10410a
            boolean r6 = p199m1.AbstractC2596a.m4541a(r15, r6)
            if (r6 != 0) goto L3d4
            r6 = -1
            r15 = 9
            goto L3dd
        L3d4:
            r6 = -1
            r15 = 9
            int r16 = r4.getInt(r15, r6)
            r6 = r16
        L3dd:
            int r7 = r4.getChangingConfigurations()
            r13.m5602c(r7)
            if (r6 == 0) goto L3f6
            r7 = 1
            if (r6 == r7) goto L3f2
            r7 = 2
            if (r6 == r7) goto L3ef
        L3ec:
            r41 = 0
            goto L3f8
        L3ef:
            r41 = r7
            goto L3f8
        L3f2:
            r7 = 2
            r41 = 1
            goto L3f8
        L3f6:
            r7 = 2
            goto L3ec
        L3f8:
            java.lang.String r6 = "strokeMiterLimit"
            r7 = 10
            r8 = 1082130432(0x40800000, float:4.0)
            float r42 = r13.m5601b(r4, r6, r7, r8)
            java.lang.String r6 = "strokeColor"
            r7 = 3
            C0.c r6 = r13.m5600a(r4, r1, r6, r7)
            java.lang.String r8 = "strokeAlpha"
            r7 = 11
            float r38 = r13.m5601b(r4, r8, r7, r10)
            java.lang.String r7 = "strokeWidth"
            r8 = 4
            float r39 = r13.m5601b(r4, r7, r8, r10)
            java.lang.String r7 = "trimPathEnd"
            r8 = 6
            float r44 = r13.m5601b(r4, r7, r8, r10)
            java.lang.String r7 = "trimPathOffset"
            r8 = 0
            r10 = 7
            float r45 = r13.m5601b(r4, r7, r10, r8)
            java.lang.String r7 = "trimPathStart"
            r10 = 5
            float r43 = r13.m5601b(r4, r7, r10, r8)
            java.lang.String r7 = "fillType"
            org.xmlpull.v1.XmlPullParser r8 = r13.f10410a
            boolean r7 = p199m1.AbstractC2596a.m4541a(r8, r7)
            if (r7 != 0) goto L43d
            r8 = 13
            r16 = 0
            goto L444
        L43d:
            r7 = 0
            r8 = 13
            int r16 = r4.getInt(r8, r7)
        L444:
            int r7 = r4.getChangingConfigurations()
            r13.m5602c(r7)
            r4.recycle()
            java.lang.Object r4 = r0.f794f
            android.graphics.Shader r4 = (android.graphics.Shader) r4
            int r0 = r0.f793e
            if (r4 == 0) goto L457
            goto L459
        L457:
            if (r0 == 0) goto L471
        L459:
            if (r4 == 0) goto L464
            o0.r r0 = new o0.r
            r0.<init>(r4)
            r35 = r0
            r7 = r9
            goto L474
        L464:
            o0.O r4 = new o0.O
            r7 = r9
            long r8 = p211o0.AbstractC2767z.m4933c(r0)
            r4.<init>(r8)
            r35 = r4
            goto L474
        L471:
            r7 = r9
            r35 = 0
        L474:
            java.lang.Object r0 = r6.f794f
            android.graphics.Shader r0 = (android.graphics.Shader) r0
            int r4 = r6.f793e
            if (r0 == 0) goto L47d
            goto L47f
        L47d:
            if (r4 == 0) goto L495
        L47f:
            if (r0 == 0) goto L489
            o0.r r4 = new o0.r
            r4.<init>(r0)
            r37 = r4
            goto L497
        L489:
            o0.O r0 = new o0.O
            long r8 = p211o0.AbstractC2767z.m4933c(r4)
            r0.<init>(r8)
            r37 = r0
            goto L497
        L495:
            r37 = 0
        L497:
            if (r16 != 0) goto L49c
            r34 = 0
            goto L49e
        L49c:
            r34 = 1
        L49e:
            boolean r0 = r11.f10274k
            if (r0 == 0) goto L4a7
            java.lang.String r0 = "ImageVector.Builder is single use, create a new instance to create a new ImageVector"
            p023E0.AbstractC0277a.m483b(r0)
        L4a7:
            java.util.ArrayList r0 = r11.f10272i
            int r4 = r0.size()
            r28 = 1
            int r4 = r4 + (-1)
            java.lang.Object r0 = r0.get(r4)
            u0.d r0 = (p245u0.C3307d) r0
            java.util.ArrayList r0 = r0.f10263j
            u0.J r31 = new u0.J
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            r4 = r31
            r0.add(r4)
            r4 = 1
            goto L285
        L4c6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No path data available"
            r0.<init>(r1)
            throw r0
        L4ce:
            r7 = r9
            r30 = r10
            r10 = 5
            r15 = 9
            r27 = -1
            java.lang.String r0 = "clip-path"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L4e1
            r4 = 1
            goto L54c
        L4e1:
            int[] r0 = p251v0.AbstractC3351b.f10416d
            if (r1 != 0) goto L4eb
            android.content.res.TypedArray r0 = r3.obtainAttributes(r12, r0)
            r4 = 0
            goto L4f0
        L4eb:
            r4 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r12, r0, r4, r4)
        L4f0:
            int r8 = r0.getChangingConfigurations()
            r13.m5602c(r8)
            java.lang.String r8 = r0.getString(r4)
            int r4 = r0.getChangingConfigurations()
            r13.m5602c(r4)
            if (r8 != 0) goto L508
            r32 = r16
        L506:
            r4 = 1
            goto L50b
        L508:
            r32 = r8
            goto L506
        L50b:
            java.lang.String r8 = r0.getString(r4)
            int r9 = r0.getChangingConfigurations()
            r13.m5602c(r9)
            if (r8 != 0) goto L51d
            int r6 = p245u0.AbstractC3300G.f10208a
        L51a:
            r40 = r25
            goto L522
        L51d:
            java.util.ArrayList r25 = p121Y1.C1753n.m3106G(r6, r8)
            goto L51a
        L522:
            r0.recycle()
            boolean r0 = r11.f10274k
            if (r0 == 0) goto L52e
            java.lang.String r0 = "ImageVector.Builder is single use, create a new instance to create a new ImageVector"
            p023E0.AbstractC0277a.m483b(r0)
        L52e:
            u0.d r31 = new u0.d
            r41 = 512(0x200, float:7.17E-43)
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 1065353216(0x3f800000, float:1.0)
            r37 = 1065353216(0x3f800000, float:1.0)
            r38 = 0
            r39 = 0
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r0 = r31
            java.util.ArrayList r6 = r11.f10272i
            r6.add(r0)
            int r14 = r14 + 1
        L54c:
            r30.next()
            r6 = r4
            r9 = r7
            r0 = r15
            r4 = r29
            r10 = r30
            r7 = 3
            r8 = 0
            goto L1dd
        L55a:
            int r0 = r13.f10411b
            r0 = r29 | r0
            N0.a r10 = new N0.a
            u0.f r1 = r11.m5579b()
            r10.<init>(r1, r0)
            java.util.HashMap r0 = r5.f3125a
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r10)
            r0.put(r7, r1)
            goto L5b8
        L572:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r14.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = "<VectorGraphic> tag requires viewportHeight > 0"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L58d:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r14.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = "<VectorGraphic> tag requires viewportWidth > 0"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5a8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP"
            r0.<init>(r1)
            throw r0
        L5b0:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
        L5b8:
            u0.f r0 = r10.f3121a
            u0.I r0 = p245u0.AbstractC3305b.m5573d(r0, r2)
            r4 = 0
            r2.m2597p(r4)
            return r0
        L5c3:
            r5 = -1771643000(0xffffffff9666df88, float:-1.8649786E-25)
            r2.m2568W(r5)
            android.content.res.Resources$Theme r1 = r1.getTheme()
            boolean r5 = r2.m2582f(r4)
            boolean r6 = r2.m2578d(r0)
            r5 = r5 | r6
            boolean r1 = r2.m2582f(r1)
            r1 = r1 | r5
            java.lang.Object r5 = r2.m2558L()
            if (r1 != 0) goto L5e5
            T.e r1 = p095T.C1371l.f4833a
            if (r5 != r1) goto L5fd
        L5e5:
            r1 = 0
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0, r1)     // Catch: java.lang.Exception -> L609
            java.lang.String r1 = "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable"
            p117X2.AbstractC1665j.m2983c(r0, r1)     // Catch: java.lang.Exception -> L609
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0     // Catch: java.lang.Exception -> L609
            android.graphics.Bitmap r0 = r0.getBitmap()     // Catch: java.lang.Exception -> L609
            o0.f r5 = new o0.f     // Catch: java.lang.Exception -> L609
            r5.<init>(r0)     // Catch: java.lang.Exception -> L609
            r2.m2585g0(r5)
        L5fd:
            o0.f r5 = (p211o0.C2747f) r5
            t0.a r0 = new t0.a
            r0.<init>(r5)
            r4 = 0
            r2.m2597p(r4)
            return r0
        L609:
            r0 = move-exception
            E4.q r1 = new E4.q
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error attempting to load resource: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L61e:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.AbstractC1926h.m3583z(int, T.m):t0.b");
    }

    /* JADX INFO: renamed from: C */
    public abstract void mo3584C(boolean z5);

    /* JADX INFO: renamed from: D */
    public abstract void mo3585D(boolean z5);
}
