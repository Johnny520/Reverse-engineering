package com.bumptech.glide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import de.robv.android.xposed.XposedBridge;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import me.dartcv.nuke.BuildConfig;
import org.luckypray.dexkit.DexKitBridge;
import p000A.AbstractC0070k0;
import p011B4.AbstractC0231b;
import p026E3.C0285a;
import p027E4.C0330q;
import p041H0.AbstractC0601k;
import p041H0.C0617s;
import p042H1.AbstractC0636d;
import p045H4.C0650b;
import p049I2.AbstractC0797o;
import p056K2.AbstractC0885k;
import p056K2.C0884j;
import p056K2.C0891q;
import p056K2.EnumC0880f;
import p056K2.InterfaceC0879e;
import p058L.C0946r;
import p058L.C0948t;
import p058L.C0949u;
import p058L.EnumC0937i;
import p058L.InterfaceC0936h;
import p092S0.C1257J;
import p092S0.C1259L;
import p092S0.C1277o;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p118X3.C1706p;
import p127Z2.AbstractC1784a;
import p128a.AbstractC1785a;
import p149d3.AbstractC1976d;
import p153e1.C2005a;
import p154e2.C2029h;
import p156e4.C2049l;
import p179i4.AbstractC2352g;
import p187k0.C2449e;
import p206n2.AbstractC2691c;
import p211o0.AbstractC2767z;
import p211o0.C2740O;
import p211o0.C2762u;
import p245u0.AbstractC3300G;
import p245u0.C3308e;
import p245u0.C3309f;
import p254v4.C3354a;
import p254v4.C3355b;
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

/* JADX INFO: renamed from: com.bumptech.glide.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1925g {

    /* JADX INFO: renamed from: a */
    public static C3309f f6533a;

    /* JADX INFO: renamed from: b */
    public static C3309f f6534b;

    /* JADX INFO: renamed from: A */
    public static final long m3518A(float f2, long j5) {
        return (Float.isNaN(f2) || f2 >= 1.0f) ? j5 : C2762u.m4920b(C2762u.m4922d(j5) * f2, j5);
    }

    /* JADX INFO: renamed from: B */
    public static void m3519B(Context context, String str) {
        AbstractC1665j.m2985e(context, "act");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("mqq://card/show_pslcard?src_type=internal&version=1&uin=" + str + "&card_type=group&source=qrcode"));
        intent.setPackage("com.tencent.mobileqq");
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m3520C(Context context, String str) {
        Object objM3229o;
        if (AbstractC1976d.m3637e0(str)) {
            return false;
        }
        try {
            m3519B(context, str);
            objM3229o = C0891q.f2780a;
        } catch (Throwable th) {
            objM3229o = AbstractC1784a.m3229o(th);
        }
        return !(objM3229o instanceof C0884j);
    }

    /* JADX INFO: renamed from: D */
    public static boolean m3521D(Context context, String str) {
        Object objM3229o;
        if (AbstractC1976d.m3637e0(str)) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            context.startActivity(intent);
            objM3229o = C0891q.f2780a;
        } catch (Throwable th) {
            objM3229o = AbstractC1784a.m3229o(th);
        }
        return !(objM3229o instanceof C0884j);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m3522E(java.lang.String r14, int r15) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.AbstractC1925g.m3522E(java.lang.String, int):long");
    }

    /* JADX INFO: renamed from: F */
    public static final long m3523F(long j5) {
        return (((long) Float.floatToRawIntBits((int) (j5 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j5 >> 32)) << 32);
    }

    /* JADX INFO: renamed from: a */
    public static final C0949u m3524a(C2029h c2029h, InterfaceC0936h interfaceC0936h) {
        EnumC0937i enumC0937iM3726d = c2029h.m3726d();
        C0946r c0946r = (C0946r) c2029h.f6764g;
        boolean z5 = enumC0937iM3726d == EnumC0937i.f2936d;
        return new C0949u(m3527d(c0946r, z5, true, interfaceC0936h), m3527d(c0946r, z5, false, interfaceC0936h), z5);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m3525b(C2449e c2449e, long j5) {
        if (!c2449e.f7186d.f7199q) {
            return false;
        }
        C0617s c0617s = AbstractC0601k.m1044t(c2449e).f1699J.f1893c;
        if (!c0617s.f1970U.f7199q) {
            return false;
        }
        long jMo638R = c0617s.mo638R(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo638R >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo638R & 4294967295L));
        long j6 = c2449e.f7911t;
        float f2 = ((int) (j6 >> 32)) + fIntBitsToFloat;
        float f5 = ((int) (j6 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j5 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f2) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f5;
    }

    /* JADX INFO: renamed from: c */
    public static final C0948t m3526c(final C2029h c2029h, final C0946r c0946r, C0948t c0948t) {
        int i5 = c0946r.f2976c;
        int i6 = c0946r.f2975b;
        boolean z5 = c2029h.f6762e;
        final int i7 = z5 ? i6 : i5;
        C1257J c1257j = (C1257J) c0946r.f2978e;
        int i8 = c0946r.f2977d;
        C2049l c2049l = new C2049l(c0946r, i7);
        EnumC0880f enumC0880f = EnumC0880f.f2767e;
        final InterfaceC0879e interfaceC0879eM1395t = AbstractC0797o.m1395t(enumC0880f, c2049l);
        final int i9 = z5 ? i5 : i6;
        InterfaceC0879e interfaceC0879eM1395t2 = AbstractC0797o.m1395t(enumC0880f, new InterfaceC1599a() { // from class: L.w
            /* JADX WARN: Type inference failed for: r3v0, types: [K2.e, java.lang.Object] */
            @Override // p112W2.InterfaceC1599a
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                C0946r c0946r2 = c0946r;
                C1257J c1257j2 = (C1257J) c0946r2.f2978e;
                int iIntValue = ((Number) interfaceC0879eM1395t.getValue()).intValue();
                C2029h c2029h2 = c2029h;
                boolean z6 = c2029h2.f6762e;
                boolean z7 = c2029h2.m3726d() == EnumC0937i.f2936d;
                int i10 = i7;
                long jM2332i = c1257j2.m2332i(i10);
                C1277o c1277o = c1257j2.f4527b;
                int i11 = C1259L.f4537c;
                int iM2329f = (int) (jM2332i >> 32);
                int iM2363d = c1277o.m2363d(iM2329f);
                int i12 = c1277o.f4590f;
                if (iM2363d != iIntValue) {
                    iM2329f = iIntValue >= i12 ? c1257j2.m2329f(i12 - 1) : c1257j2.m2329f(iIntValue);
                }
                int iM2362c = (int) (jM2332i & 4294967295L);
                if (c1277o.m2363d(iM2362c) != iIntValue) {
                    iM2362c = iIntValue >= i12 ? c1277o.m2362c(i12 - 1, false) : c1277o.m2362c(iIntValue, false);
                }
                int i13 = i9;
                if (iM2329f == i13) {
                    return c0946r2.m1950a(iM2362c);
                }
                if (iM2362c == i13) {
                    return c0946r2.m1950a(iM2329f);
                }
                if (!(z6 ^ z7) ? i10 >= iM2329f : i10 > iM2362c) {
                    iM2329f = iM2362c;
                }
                return c0946r2.m1950a(iM2329f);
            }
        });
        if (1 != c0948t.f2983c) {
            return (C0948t) interfaceC0879eM1395t2.getValue();
        }
        if (i7 == i8) {
            return c0948t;
        }
        if (((Number) interfaceC0879eM1395t.getValue()).intValue() != c1257j.f4527b.m2363d(i8)) {
            return (C0948t) interfaceC0879eM1395t2.getValue();
        }
        int i10 = c0948t.f2982b;
        long jM2332i = c1257j.m2332i(i10);
        if (i8 != -1) {
            if (i7 != i8) {
                EnumC0937i enumC0937i = EnumC0937i.f2936d;
                if (!(((i6 < i5 ? EnumC0937i.f2937e : i6 > i5 ? enumC0937i : EnumC0937i.f2938f) == enumC0937i) ^ z5)) {
                }
            }
            return c0946r.m1950a(i7);
        }
        int i11 = C1259L.f4537c;
        return (i10 == ((int) (jM2332i >> 32)) || i10 == ((int) (4294967295L & jM2332i))) ? (C0948t) interfaceC0879eM1395t2.getValue() : c0946r.m1950a(i7);
    }

    /* JADX INFO: renamed from: d */
    public static final C0948t m3527d(C0946r c0946r, boolean z5, boolean z6, InterfaceC0936h interfaceC0936h) {
        long j5;
        long jMo1946a = interfaceC0936h.mo1946a(c0946r, z6 ? c0946r.f2975b : c0946r.f2976c);
        if (z5 ^ z6) {
            int i5 = C1259L.f4537c;
            j5 = jMo1946a >> 32;
        } else {
            int i6 = C1259L.f4537c;
            j5 = 4294967295L & jMo1946a;
        }
        return c0946r.m1950a((int) j5);
    }

    /* JADX INFO: renamed from: e */
    public static final Object m3528e(C0285a c0285a, int i5) {
        AbstractC1665j.m2985e(c0285a, "<this>");
        Object[] objArr = c0285a.f913a.args;
        AbstractC1665j.m2984d(objArr, "args");
        return objArr[i5];
    }

    /* JADX INFO: renamed from: f */
    public static final C0948t m3529f(C0948t c0948t, C0946r c0946r, int i5) {
        return new C0948t(((C1257J) c0946r.f2978e).m2324a(i5), i5, c0948t.f2983c);
    }

    /* JADX INFO: renamed from: g */
    public static final void m3530g(int i5, int i6) {
        if (i5 < 0 || i5 >= i6) {
            throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", i6));
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m3531h(int i5, int i6) {
        if (i5 < 0 || i5 > i6) {
            throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", i6));
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m3532i(int i5, int i6, int i7) {
        if (i5 >= 0 && i6 <= i7) {
            if (i5 > i6) {
                throw new IllegalArgumentException(AbstractC0231b.m399j("fromIndex: ", i5, " > toIndex: ", i6));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i5 + ", toIndex: " + i6 + ", size: " + i7);
    }

    /* JADX INFO: renamed from: j */
    public static final void m3533j(int i5, int i6, int i7) {
        if (i5 >= 0 && i6 <= i7) {
            if (i5 > i6) {
                throw new IllegalArgumentException(AbstractC0231b.m399j("fromIndex: ", i5, " > toIndex: ", i6));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i5 + ", toIndex: " + i6 + ", size: " + i7);
    }

    /* JADX INFO: renamed from: k */
    public static final void m3534k(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC2352g.m4193f(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static final C0650b m3535l(long j5) {
        return new C0650b(false, AbstractC2767z.m4934d(4278848010L), AbstractC2767z.m4934d(4279637526L), AbstractC2767z.m4934d(4280558628L), AbstractC2767z.m4934d(4294967295L), AbstractC2767z.m4934d(4287137928L), j5);
    }

    /* JADX INFO: renamed from: m */
    public static int m3536m(String str, int i5, int i6, boolean z5) {
        while (i5 < i6) {
            char cCharAt = str.charAt(i5);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z5)) {
                return i5;
            }
            i5++;
        }
        return i6;
    }

    /* JADX INFO: renamed from: n */
    public static void m3537n(String str, String str2) {
        AbstractC1665j.m2985e(str, "tag");
        AbstractC1665j.m2985e(str2, "msg");
        m3549z(6, str, str2);
    }

    /* JADX INFO: renamed from: o */
    public static final long m3538o(long j5, boolean z5, int i5, float f2) {
        int iM3680h = ((z5 || i5 == 2 || i5 == 4 || i5 == 5) && C2005a.m3676d(j5)) ? C2005a.m3680h(j5) : Integer.MAX_VALUE;
        if (C2005a.m3682j(j5) != iM3680h) {
            iM3680h = AbstractC1926h.m3568k(AbstractC0070k0.m83j(f2), C2005a.m3682j(j5), iM3680h);
        }
        return AbstractC1784a.m3233s(0, iM3680h, 0, C2005a.m3679g(j5));
    }

    /* JADX INFO: renamed from: p */
    public static C3354a m3539p(DexKitBridge dexKitBridge, C3457c c3457c) {
        Object objValueOf;
        AbstractC1665j.m2985e(dexKitBridge, "bridge");
        int iM4685b = c3457c.m4685b(4);
        if (iM4685b != 0) {
            c3457c.f8592b.getInt(iM4685b + c3457c.f8591a);
        }
        int i5 = 6;
        int iM4685b2 = c3457c.m4685b(6);
        if (iM4685b2 != 0) {
            c3457c.f8592b.getInt(iM4685b2 + c3457c.f8591a);
        }
        int iM4685b3 = c3457c.m4685b(8);
        String strM4687d = iM4685b3 != 0 ? c3457c.m4687d(iM4685b3 + c3457c.f8591a) : null;
        AbstractC1665j.m2982b(strM4687d);
        int iM4685b4 = c3457c.m4685b(10);
        byte b2 = 0;
        byte b5 = iM4685b4 != 0 ? c3457c.f8592b.get(iM4685b4 + c3457c.f8591a) : (byte) 0;
        if (b5 != 0 && b5 != 1 && b5 != 2 && b5 != 3) {
            throw new IllegalArgumentException(AbstractC0231b.m398i("Unknown AnnotationVisibilityType: ", b5));
        }
        ArrayList arrayList = new ArrayList();
        int iM4685b5 = c3457c.m4685b(12);
        int iM4689f = iM4685b5 != 0 ? c3457c.m4689f(iM4685b5) : 0;
        int i6 = 0;
        while (i6 < iM4689f) {
            C3455a c3455a = new C3455a();
            int iM4685b6 = c3457c.m4685b(12);
            if (iM4685b6 != 0) {
                int iM4684a = c3457c.m4684a((i6 * 4) + c3457c.m4688e(iM4685b6));
                ByteBuffer byteBuffer = c3457c.f8592b;
                AbstractC1665j.m2984d(byteBuffer, "bb");
                c3455a.m4686c(iM4684a, byteBuffer);
            } else {
                c3455a = null;
            }
            AbstractC1665j.m2982b(c3455a);
            C3455a c3455a2 = new C3455a();
            int iM4685b7 = c3455a.m4685b(i5);
            if (iM4685b7 != 0) {
                int iM4684a2 = c3455a.m4684a(iM4685b7 + c3455a.f8591a);
                ByteBuffer byteBuffer2 = c3455a.f8592b;
                AbstractC1665j.m2984d(byteBuffer2, "bb");
                c3455a2.m4686c(iM4684a2, byteBuffer2);
            } else {
                c3455a2 = null;
            }
            AbstractC1665j.m2983c(c3455a2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeValueMeta }");
            int iM4685b8 = c3455a.m4685b(4);
            String strM4687d2 = iM4685b8 != 0 ? c3455a.m4687d(iM4685b8 + c3455a.f8591a) : null;
            AbstractC1665j.m2982b(strM4687d2);
            int iM4685b9 = c3455a2.m4685b(i5);
            int iM3248h = AbstractC1785a.m3248h(iM4685b9 != 0 ? c3455a2.f8592b.get(iM4685b9 + c3455a2.f8591a) : b2);
            switch (AbstractC0636d.m1088a(iM3248h)) {
                case 0:
                    AbstractC2691c abstractC2691cM5708j = c3455a2.m5708j(new C3460f());
                    AbstractC1665j.m2983c(abstractC2691cM5708j, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueByte{ org.luckypray.dexkit.AliasKt.InnerEncodeValueByte }");
                    C3460f c3460f = (C3460f) abstractC2691cM5708j;
                    int iM4685b10 = c3460f.m4685b(4);
                    objValueOf = Byte.valueOf(iM4685b10 != 0 ? c3460f.f8592b.get(iM4685b10 + c3460f.f8591a) : (byte) 0);
                    break;
                case BuildConfig.VERSION_CODE /* 1 */:
                    AbstractC2691c abstractC2691cM5708j2 = c3455a2.m5708j(new C3467m());
                    AbstractC1665j.m2983c(abstractC2691cM5708j2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueShort{ org.luckypray.dexkit.AliasKt.InnerEncodeValueShort }");
                    C3467m c3467m = (C3467m) abstractC2691cM5708j2;
                    int iM4685b11 = c3467m.m4685b(4);
                    objValueOf = Short.valueOf(iM4685b11 != 0 ? c3467m.f8592b.getShort(iM4685b11 + c3467m.f8591a) : (short) 0);
                    break;
                case 2:
                    AbstractC2691c abstractC2691cM5708j3 = c3455a2.m5708j(new C3461g());
                    AbstractC1665j.m2983c(abstractC2691cM5708j3, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueChar{ org.luckypray.dexkit.AliasKt.InnerEncodeValueChar }");
                    C3461g c3461g = (C3461g) abstractC2691cM5708j3;
                    int iM4685b12 = c3461g.m4685b(4);
                    objValueOf = Short.valueOf(iM4685b12 != 0 ? c3461g.f8592b.getShort(iM4685b12 + c3461g.f8591a) : (short) 0);
                    break;
                case 3:
                    AbstractC2691c abstractC2691cM5708j4 = c3455a2.m5708j(new C3464j());
                    AbstractC1665j.m2983c(abstractC2691cM5708j4, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueInt{ org.luckypray.dexkit.AliasKt.InnerEncodeValueInt }");
                    C3464j c3464j = (C3464j) abstractC2691cM5708j4;
                    int iM4685b13 = c3464j.m4685b(4);
                    objValueOf = Integer.valueOf(iM4685b13 != 0 ? c3464j.f8592b.getInt(iM4685b13 + c3464j.f8591a) : 0);
                    break;
                case 4:
                    AbstractC2691c abstractC2691cM5708j5 = c3455a2.m5708j(new C3465k());
                    AbstractC1665j.m2983c(abstractC2691cM5708j5, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueLong{ org.luckypray.dexkit.AliasKt.InnerEncodeValueLong }");
                    C3465k c3465k = (C3465k) abstractC2691cM5708j5;
                    int iM4685b14 = c3465k.m4685b(4);
                    objValueOf = Long.valueOf(iM4685b14 != 0 ? c3465k.f8592b.getLong(iM4685b14 + c3465k.f8591a) : 0L);
                    break;
                case 5:
                    AbstractC2691c abstractC2691cM5708j6 = c3455a2.m5708j(new C3463i());
                    AbstractC1665j.m2983c(abstractC2691cM5708j6, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueFloat{ org.luckypray.dexkit.AliasKt.InnerEncodeValueFloat }");
                    C3463i c3463i = (C3463i) abstractC2691cM5708j6;
                    int iM4685b15 = c3463i.m4685b(4);
                    objValueOf = Float.valueOf(iM4685b15 != 0 ? c3463i.f8592b.getFloat(iM4685b15 + c3463i.f8591a) : 0.0f);
                    break;
                case 6:
                    AbstractC2691c abstractC2691cM5708j7 = c3455a2.m5708j(new C3462h());
                    AbstractC1665j.m2983c(abstractC2691cM5708j7, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueDouble{ org.luckypray.dexkit.AliasKt.InnerEncodeValueDouble }");
                    C3462h c3462h = (C3462h) abstractC2691cM5708j7;
                    int iM4685b16 = c3462h.m4685b(4);
                    objValueOf = Double.valueOf(iM4685b16 != 0 ? c3462h.f8592b.getDouble(iM4685b16 + c3462h.f8591a) : 0.0d);
                    break;
                case 7:
                    AbstractC2691c abstractC2691cM5708j8 = c3455a2.m5708j(new C3468n());
                    AbstractC1665j.m2983c(abstractC2691cM5708j8, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueString{ org.luckypray.dexkit.AliasKt.InnerEncodeValueString }");
                    C3468n c3468n = (C3468n) abstractC2691cM5708j8;
                    int iM4685b17 = c3468n.m4685b(4);
                    objValueOf = iM4685b17 != 0 ? c3468n.m4687d(iM4685b17 + c3468n.f8591a) : null;
                    AbstractC1665j.m2982b(objValueOf);
                    break;
                case 8:
                    AbstractC2691c abstractC2691cM5708j9 = c3455a2.m5708j(new C3458d());
                    AbstractC1665j.m2983c(abstractC2691cM5708j9, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-ClassMeta{ org.luckypray.dexkit.AliasKt.InnerClassMeta }");
                    objValueOf = AbstractC2352g.m4205r(dexKitBridge, (C3458d) abstractC2691cM5708j9);
                    break;
                case 9:
                    AbstractC2691c abstractC2691cM5708j10 = c3455a2.m5708j(new C3470p());
                    AbstractC1665j.m2983c(abstractC2691cM5708j10, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-MethodMeta{ org.luckypray.dexkit.AliasKt.InnerMethodMeta }");
                    objValueOf = AbstractC1784a.m3234t(dexKitBridge, (C3470p) abstractC2691cM5708j10);
                    break;
                case 10:
                    AbstractC2691c abstractC2691cM5708j11 = c3455a2.m5708j(new C3469o());
                    AbstractC1665j.m2983c(abstractC2691cM5708j11, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-FieldMeta{ org.luckypray.dexkit.AliasKt.InnerFieldMeta }");
                    objValueOf = AbstractC0797o.m1389n(dexKitBridge, (C3469o) abstractC2691cM5708j11);
                    break;
                case 11:
                    AbstractC2691c abstractC2691cM5708j12 = c3455a2.m5708j(new C3456b());
                    AbstractC1665j.m2983c(abstractC2691cM5708j12, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeArray{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeArray }");
                    objValueOf = AbstractC1926h.m3573p(dexKitBridge, (C3456b) abstractC2691cM5708j12);
                    break;
                case 12:
                    AbstractC2691c abstractC2691cM5708j13 = c3455a2.m5708j(new C3457c());
                    AbstractC1665j.m2983c(abstractC2691cM5708j13, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationMeta }");
                    objValueOf = m3539p(dexKitBridge, (C3457c) abstractC2691cM5708j13);
                    break;
                case 13:
                    AbstractC2691c abstractC2691cM5708j14 = c3455a2.m5708j(new C3466l());
                    AbstractC1665j.m2983c(abstractC2691cM5708j14, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueNull{ org.luckypray.dexkit.AliasKt.InnerEncodeValueNull }");
                    objValueOf = (C3466l) abstractC2691cM5708j14;
                    break;
                case 14:
                    AbstractC2691c abstractC2691cM5708j15 = c3455a2.m5708j(new C3459e());
                    AbstractC1665j.m2983c(abstractC2691cM5708j15, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueBoolean{ org.luckypray.dexkit.AliasKt.InnerEncodeValueBoolean }");
                    C3459e c3459e = (C3459e) abstractC2691cM5708j15;
                    int iM4685b18 = c3459e.m4685b(4);
                    objValueOf = Boolean.valueOf((iM4685b18 == 0 || ((byte) b2) == c3459e.f8592b.get(iM4685b18 + c3459e.f8591a)) ? false : true);
                    break;
                default:
                    throw new C0330q();
            }
            arrayList.add(new C3355b(dexKitBridge, strM4687d2, new C3357d(iM3248h, objValueOf)));
            i6++;
            i5 = 6;
            b2 = 0;
        }
        return new C3354a(dexKitBridge, strM4687d, arrayList);
    }

    /* JADX INFO: renamed from: q */
    public static final C3309f m3540q() {
        C3309f c3309f = f6533a;
        if (c3309f != null) {
            return c3309f;
        }
        C3308e c3308e = new C3308e("Filled.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i5 = AbstractC3300G.f10208a;
        C2740O c2740o = new C2740O(C2762u.f8757b);
        C1706p c1706p = new C1706p(5);
        c1706p.m3033l(12.0f, 2.0f);
        c1706p.m3026e(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        c1706p.m3035n(4.48f, 10.0f, 10.0f, 10.0f);
        c1706p.m3035n(10.0f, -4.48f, 10.0f, -10.0f);
        c1706p.m3034m(17.52f, 2.0f, 12.0f, 2.0f);
        c1706p.m3025d();
        c1706p.m3033l(10.0f, 17.0f);
        c1706p.m3032k(-5.0f, -5.0f);
        c1706p.m3032k(1.41f, -1.41f);
        c1706p.m3031j(10.0f, 14.17f);
        c1706p.m3032k(7.59f, -7.59f);
        c1706p.m3031j(19.0f, 8.0f);
        c1706p.m3032k(-9.0f, 9.0f);
        c1706p.m3025d();
        C3308e.m5578a(c3308e, c1706p.f5857a, c2740o);
        C3309f c3309fM5579b = c3308e.m5579b();
        f6533a = c3309fM5579b;
        return c3309fM5579b;
    }

    /* JADX INFO: renamed from: r */
    public static void m3541r(byte b2, byte b5, byte b6, byte b7, char[] cArr, int i5) {
        if (!m3547x(b5)) {
            if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && !m3547x(b6) && !m3547x(b7)) {
                int i6 = ((b2 & 7) << 18) | ((b5 & 63) << 12) | ((b6 & 63) << 6) | (b7 & 63);
                cArr[i5] = (char) ((i6 >>> 10) + 55232);
                cArr[i5 + 1] = (char) ((i6 & 1023) + 56320);
                return;
            }
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }

    /* JADX INFO: renamed from: s */
    public static void m3542s(byte b2, byte b5, byte b6, char[] cArr, int i5) {
        if (m3547x(b5) || ((b2 == -32 && b5 < -96) || ((b2 == -19 && b5 >= -96) || m3547x(b6)))) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        cArr[i5] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
    }

    /* JADX INFO: renamed from: t */
    public static void m3543t(byte b2, byte b5, char[] cArr, int i5) {
        if (b2 < -62) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }
        if (m3547x(b5)) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        }
        cArr[i5] = (char) (((b2 & 31) << 6) | (b5 & 63));
    }

    /* JADX INFO: renamed from: u */
    public static void m3544u(String str, String str2) {
        AbstractC1665j.m2985e(str2, "msg");
        m3549z(4, str, str2);
    }

    /* JADX INFO: renamed from: v */
    public static int m3545v(int i5) {
        if (i5 == 1) {
            return 0;
        }
        if (i5 == 2) {
            return 1;
        }
        if (i5 == 4) {
            return 2;
        }
        if (i5 == 8) {
            return 3;
        }
        if (i5 == 16) {
            return 4;
        }
        if (i5 == 32) {
            return 5;
        }
        if (i5 == 64) {
            return 6;
        }
        if (i5 == 128) {
            return 7;
        }
        if (i5 == 256) {
            return 8;
        }
        if (i5 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(AbstractC0231b.m398i("type needs to be >= FIRST and <= LAST, type=", i5));
    }

    /* JADX INFO: renamed from: w */
    public static boolean m3546w(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX INFO: renamed from: x */
    public static boolean m3547x(byte b2) {
        return b2 > -65;
    }

    /* JADX INFO: renamed from: y */
    public static final C0650b m3548y(long j5) {
        return new C0650b(true, AbstractC2767z.m4934d(4294243574L), C2762u.f8758c, AbstractC2767z.m4934d(4293914607L), AbstractC2767z.m4934d(4279900698L), AbstractC2767z.m4934d(4285887861L), j5);
    }

    /* JADX INFO: renamed from: z */
    public static void m3549z(int i5, String str, Object obj) {
        Object objM3229o;
        String string = obj.toString();
        try {
            XposedBridge.log("[" + str + "]" + string);
            objM3229o = C0891q.f2780a;
        } catch (Throwable th) {
            objM3229o = AbstractC1784a.m3229o(th);
        }
        if (AbstractC0885k.m1902a(objM3229o) != null) {
            Log.println(i5, str, string);
        }
    }
}
