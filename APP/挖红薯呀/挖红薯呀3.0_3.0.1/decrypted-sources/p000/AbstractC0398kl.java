package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.SizeF;
import android.view.accessibility.AccessibilityNodeInfo;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: renamed from: kl */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0398kl {

    /* JADX INFO: renamed from: C */
    public static final q91 f3186C;

    /* JADX INFO: renamed from: D */
    public static final q91 f3187D;

    /* JADX INFO: renamed from: E */
    public static final q91 f3188E;

    /* JADX INFO: renamed from: F */
    public static final q91 f3189F;

    /* JADX INFO: renamed from: j */
    public static final C1014zr f3199j;

    /* JADX INFO: renamed from: v */
    public static final C1014zr f3211v;

    /* JADX INFO: renamed from: x */
    public static final q91 f3213x;

    /* JADX INFO: renamed from: a */
    public static final C0916x7 f3190a = new C0916x7(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: b */
    public static final C0953y7 f3191b = new C0953y7(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c */
    public static final C0990z7 f3192c = new C0990z7(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d */
    public static final C0009a8 f3193d = new C0009a8(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e */
    public static final C0916x7 f3194e = new C0916x7(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: f */
    public static final C0953y7 f3195f = new C0953y7(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: g */
    public static final C0990z7 f3196g = new C0990z7(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: h */
    public static final C0009a8 f3197h = new C0009a8(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: i */
    public static final z01 f3198i = z01.f7748e;

    /* JADX INFO: renamed from: k */
    public static final EnumC0472mf f3200k = EnumC0472mf.f3935k;

    /* JADX INFO: renamed from: l */
    public static final EnumC0472mf f3201l = EnumC0472mf.f3931g;

    /* JADX INFO: renamed from: m */
    public static final float f3202m = 0.1f;

    /* JADX INFO: renamed from: n */
    public static final EnumC0472mf f3203n = EnumC0472mf.f3932h;

    /* JADX INFO: renamed from: o */
    public static final float f3204o = 0.38f;

    /* JADX INFO: renamed from: p */
    public static final float f3205p = 1.0f;

    /* JADX INFO: renamed from: q */
    public static final EnumC0472mf f3206q = EnumC0472mf.f3928d;

    /* JADX INFO: renamed from: r */
    public static final StackTraceElement[] f3207r = new StackTraceElement[0];

    /* JADX INFO: renamed from: s */
    public static final jo0 f3208s = new jo0(11);

    /* JADX INFO: renamed from: t */
    public static final jo0 f3209t = new jo0(12);

    /* JADX INFO: renamed from: u */
    public static final jo0 f3210u = new jo0(13);

    /* JADX INFO: renamed from: w */
    public static final StackTraceElement[] f3212w = new StackTraceElement[0];

    /* JADX INFO: renamed from: y */
    public static final q91 f3214y = new q91(new sx0(22), new sx0(23));

    /* JADX INFO: renamed from: z */
    public static final q91 f3215z = new q91(new sx0(24), new sx0(25));

    /* JADX INFO: renamed from: A */
    public static final q91 f3184A = new q91(new sx0(26), new sx0(27));

    /* JADX INFO: renamed from: B */
    public static final q91 f3185B = new q91(new sx0(28), new sx0(29));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        final int i = 1;
        f3199j = new C1014zr("CLOSED", i);
        final int i2 = 0;
        f3211v = new C1014zr("NO_VALUE", i);
        final int i3 = 8;
        f3213x = new q91(new sx0(21), new InterfaceC0742sw() { // from class: gb1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                switch (i3) {
                    case 0:
                        ok0 ok0Var = (ok0) obj;
                        return new C0953y7(Float.intBitsToFloat((int) (ok0Var.f4590a >> 32)), Float.intBitsToFloat((int) (4294967295L & ok0Var.f4590a)));
                    case 1:
                        C0953y7 c0953y7 = (C0953y7) obj;
                        return new ok0((((long) Float.floatToRawIntBits(c0953y7.f7558b)) & 4294967295L) | (((long) Float.floatToRawIntBits(c0953y7.f7557a)) << 32));
                    case 2:
                        long j = ((w20) obj).f6904a;
                        return new C0953y7((int) (j >> 32), (int) (4294967295L & j));
                    case 3:
                        C0953y7 c0953y72 = (C0953y7) obj;
                        return new w20((((long) Math.round(c0953y72.f7558b)) & 4294967295L) | (((long) Math.round(c0953y72.f7557a)) << 32));
                    case 4:
                        long j2 = ((d30) obj).f953a;
                        return new C0953y7((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 5:
                        C0953y7 c0953y73 = (C0953y7) obj;
                        int iRound = Math.round(c0953y73.f7557a);
                        if (iRound < 0) {
                            iRound = 0;
                        }
                        int iRound2 = Math.round(c0953y73.f7558b);
                        return new d30((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
                    case 6:
                        st0 st0Var = (st0) obj;
                        return new C0009a8(st0Var.f5832a, st0Var.f5833b, st0Var.f5834c, st0Var.f5835d);
                    case 7:
                        C0009a8 c0009a8 = (C0009a8) obj;
                        return new st0(c0009a8.f65a, c0009a8.f66b, c0009a8.f67c, c0009a8.f68d);
                    default:
                        return Float.valueOf(((C0916x7) obj).f7277a);
                }
            }
        });
        f3186C = new q91(new InterfaceC0742sw() { // from class: gb1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        ok0 ok0Var = (ok0) obj;
                        return new C0953y7(Float.intBitsToFloat((int) (ok0Var.f4590a >> 32)), Float.intBitsToFloat((int) (4294967295L & ok0Var.f4590a)));
                    case 1:
                        C0953y7 c0953y7 = (C0953y7) obj;
                        return new ok0((((long) Float.floatToRawIntBits(c0953y7.f7558b)) & 4294967295L) | (((long) Float.floatToRawIntBits(c0953y7.f7557a)) << 32));
                    case 2:
                        long j = ((w20) obj).f6904a;
                        return new C0953y7((int) (j >> 32), (int) (4294967295L & j));
                    case 3:
                        C0953y7 c0953y72 = (C0953y7) obj;
                        return new w20((((long) Math.round(c0953y72.f7558b)) & 4294967295L) | (((long) Math.round(c0953y72.f7557a)) << 32));
                    case 4:
                        long j2 = ((d30) obj).f953a;
                        return new C0953y7((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 5:
                        C0953y7 c0953y73 = (C0953y7) obj;
                        int iRound = Math.round(c0953y73.f7557a);
                        if (iRound < 0) {
                            iRound = 0;
                        }
                        int iRound2 = Math.round(c0953y73.f7558b);
                        return new d30((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
                    case 6:
                        st0 st0Var = (st0) obj;
                        return new C0009a8(st0Var.f5832a, st0Var.f5833b, st0Var.f5834c, st0Var.f5835d);
                    case 7:
                        C0009a8 c0009a8 = (C0009a8) obj;
                        return new st0(c0009a8.f65a, c0009a8.f66b, c0009a8.f67c, c0009a8.f68d);
                    default:
                        return Float.valueOf(((C0916x7) obj).f7277a);
                }
            }
        }, new InterfaceC0742sw() { // from class: gb1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        ok0 ok0Var = (ok0) obj;
                        return new C0953y7(Float.intBitsToFloat((int) (ok0Var.f4590a >> 32)), Float.intBitsToFloat((int) (4294967295L & ok0Var.f4590a)));
                    case 1:
                        C0953y7 c0953y7 = (C0953y7) obj;
                        return new ok0((((long) Float.floatToRawIntBits(c0953y7.f7558b)) & 4294967295L) | (((long) Float.floatToRawIntBits(c0953y7.f7557a)) << 32));
                    case 2:
                        long j = ((w20) obj).f6904a;
                        return new C0953y7((int) (j >> 32), (int) (4294967295L & j));
                    case 3:
                        C0953y7 c0953y72 = (C0953y7) obj;
                        return new w20((((long) Math.round(c0953y72.f7558b)) & 4294967295L) | (((long) Math.round(c0953y72.f7557a)) << 32));
                    case 4:
                        long j2 = ((d30) obj).f953a;
                        return new C0953y7((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 5:
                        C0953y7 c0953y73 = (C0953y7) obj;
                        int iRound = Math.round(c0953y73.f7557a);
                        if (iRound < 0) {
                            iRound = 0;
                        }
                        int iRound2 = Math.round(c0953y73.f7558b);
                        return new d30((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
                    case 6:
                        st0 st0Var = (st0) obj;
                        return new C0009a8(st0Var.f5832a, st0Var.f5833b, st0Var.f5834c, st0Var.f5835d);
                    case 7:
                        C0009a8 c0009a8 = (C0009a8) obj;
                        return new st0(c0009a8.f65a, c0009a8.f66b, c0009a8.f67c, c0009a8.f68d);
                    default:
                        return Float.valueOf(((C0916x7) obj).f7277a);
                }
            }
        });
        final int i4 = 2;
        final int i5 = 3;
        f3187D = new q91(new InterfaceC0742sw() { // from class: gb1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                switch (i4) {
                    case 0:
                        ok0 ok0Var = (ok0) obj;
                        return new C0953y7(Float.intBitsToFloat((int) (ok0Var.f4590a >> 32)), Float.intBitsToFloat((int) (4294967295L & ok0Var.f4590a)));
                    case 1:
                        C0953y7 c0953y7 = (C0953y7) obj;
                        return new ok0((((long) Float.floatToRawIntBits(c0953y7.f7558b)) & 4294967295L) | (((long) Float.floatToRawIntBits(c0953y7.f7557a)) << 32));
                    case 2:
                        long j = ((w20) obj).f6904a;
                        return new C0953y7((int) (j >> 32), (int) (4294967295L & j));
                    case 3:
                        C0953y7 c0953y72 = (C0953y7) obj;
                        return new w20((((long) Math.round(c0953y72.f7558b)) & 4294967295L) | (((long) Math.round(c0953y72.f7557a)) << 32));
                    case 4:
                        long j2 = ((d30) obj).f953a;
                        return new C0953y7((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 5:
                        C0953y7 c0953y73 = (C0953y7) obj;
                        int iRound = Math.round(c0953y73.f7557a);
                        if (iRound < 0) {
                            iRound = 0;
                        }
                        int iRound2 = Math.round(c0953y73.f7558b);
                        return new d30((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
                    case 6:
                        st0 st0Var = (st0) obj;
                        return new C0009a8(st0Var.f5832a, st0Var.f5833b, st0Var.f5834c, st0Var.f5835d);
                    case 7:
                        C0009a8 c0009a8 = (C0009a8) obj;
                        return new st0(c0009a8.f65a, c0009a8.f66b, c0009a8.f67c, c0009a8.f68d);
                    default:
                        return Float.valueOf(((C0916x7) obj).f7277a);
                }
            }
        }, new InterfaceC0742sw() { // from class: gb1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                switch (i5) {
                    case 0:
                        ok0 ok0Var = (ok0) obj;
                        return new C0953y7(Float.intBitsToFloat((int) (ok0Var.f4590a >> 32)), Float.intBitsToFloat((int) (4294967295L & ok0Var.f4590a)));
                    case 1:
                        C0953y7 c0953y7 = (C0953y7) obj;
                        return new ok0((((long) Float.floatToRawIntBits(c0953y7.f7558b)) & 4294967295L) | (((long) Float.floatToRawIntBits(c0953y7.f7557a)) << 32));
                    case 2:
                        long j = ((w20) obj).f6904a;
                        return new C0953y7((int) (j >> 32), (int) (4294967295L & j));
                    case 3:
                        C0953y7 c0953y72 = (C0953y7) obj;
                        return new w20((((long) Math.round(c0953y72.f7558b)) & 4294967295L) | (((long) Math.round(c0953y72.f7557a)) << 32));
                    case 4:
                        long j2 = ((d30) obj).f953a;
                        return new C0953y7((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 5:
                        C0953y7 c0953y73 = (C0953y7) obj;
                        int iRound = Math.round(c0953y73.f7557a);
                        if (iRound < 0) {
                            iRound = 0;
                        }
                        int iRound2 = Math.round(c0953y73.f7558b);
                        return new d30((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
                    case 6:
                        st0 st0Var = (st0) obj;
                        return new C0009a8(st0Var.f5832a, st0Var.f5833b, st0Var.f5834c, st0Var.f5835d);
                    case 7:
                        C0009a8 c0009a8 = (C0009a8) obj;
                        return new st0(c0009a8.f65a, c0009a8.f66b, c0009a8.f67c, c0009a8.f68d);
                    default:
                        return Float.valueOf(((C0916x7) obj).f7277a);
                }
            }
        });
        final int i6 = 4;
        final int i7 = 5;
        f3188E = new q91(new InterfaceC0742sw() { // from class: gb1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                switch (i6) {
                    case 0:
                        ok0 ok0Var = (ok0) obj;
                        return new C0953y7(Float.intBitsToFloat((int) (ok0Var.f4590a >> 32)), Float.intBitsToFloat((int) (4294967295L & ok0Var.f4590a)));
                    case 1:
                        C0953y7 c0953y7 = (C0953y7) obj;
                        return new ok0((((long) Float.floatToRawIntBits(c0953y7.f7558b)) & 4294967295L) | (((long) Float.floatToRawIntBits(c0953y7.f7557a)) << 32));
                    case 2:
                        long j = ((w20) obj).f6904a;
                        return new C0953y7((int) (j >> 32), (int) (4294967295L & j));
                    case 3:
                        C0953y7 c0953y72 = (C0953y7) obj;
                        return new w20((((long) Math.round(c0953y72.f7558b)) & 4294967295L) | (((long) Math.round(c0953y72.f7557a)) << 32));
                    case 4:
                        long j2 = ((d30) obj).f953a;
                        return new C0953y7((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 5:
                        C0953y7 c0953y73 = (C0953y7) obj;
                        int iRound = Math.round(c0953y73.f7557a);
                        if (iRound < 0) {
                            iRound = 0;
                        }
                        int iRound2 = Math.round(c0953y73.f7558b);
                        return new d30((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
                    case 6:
                        st0 st0Var = (st0) obj;
                        return new C0009a8(st0Var.f5832a, st0Var.f5833b, st0Var.f5834c, st0Var.f5835d);
                    case 7:
                        C0009a8 c0009a8 = (C0009a8) obj;
                        return new st0(c0009a8.f65a, c0009a8.f66b, c0009a8.f67c, c0009a8.f68d);
                    default:
                        return Float.valueOf(((C0916x7) obj).f7277a);
                }
            }
        }, new InterfaceC0742sw() { // from class: gb1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        ok0 ok0Var = (ok0) obj;
                        return new C0953y7(Float.intBitsToFloat((int) (ok0Var.f4590a >> 32)), Float.intBitsToFloat((int) (4294967295L & ok0Var.f4590a)));
                    case 1:
                        C0953y7 c0953y7 = (C0953y7) obj;
                        return new ok0((((long) Float.floatToRawIntBits(c0953y7.f7558b)) & 4294967295L) | (((long) Float.floatToRawIntBits(c0953y7.f7557a)) << 32));
                    case 2:
                        long j = ((w20) obj).f6904a;
                        return new C0953y7((int) (j >> 32), (int) (4294967295L & j));
                    case 3:
                        C0953y7 c0953y72 = (C0953y7) obj;
                        return new w20((((long) Math.round(c0953y72.f7558b)) & 4294967295L) | (((long) Math.round(c0953y72.f7557a)) << 32));
                    case 4:
                        long j2 = ((d30) obj).f953a;
                        return new C0953y7((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 5:
                        C0953y7 c0953y73 = (C0953y7) obj;
                        int iRound = Math.round(c0953y73.f7557a);
                        if (iRound < 0) {
                            iRound = 0;
                        }
                        int iRound2 = Math.round(c0953y73.f7558b);
                        return new d30((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
                    case 6:
                        st0 st0Var = (st0) obj;
                        return new C0009a8(st0Var.f5832a, st0Var.f5833b, st0Var.f5834c, st0Var.f5835d);
                    case 7:
                        C0009a8 c0009a8 = (C0009a8) obj;
                        return new st0(c0009a8.f65a, c0009a8.f66b, c0009a8.f67c, c0009a8.f68d);
                    default:
                        return Float.valueOf(((C0916x7) obj).f7277a);
                }
            }
        });
        final int i8 = 6;
        final int i9 = 7;
        f3189F = new q91(new InterfaceC0742sw() { // from class: gb1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                switch (i8) {
                    case 0:
                        ok0 ok0Var = (ok0) obj;
                        return new C0953y7(Float.intBitsToFloat((int) (ok0Var.f4590a >> 32)), Float.intBitsToFloat((int) (4294967295L & ok0Var.f4590a)));
                    case 1:
                        C0953y7 c0953y7 = (C0953y7) obj;
                        return new ok0((((long) Float.floatToRawIntBits(c0953y7.f7558b)) & 4294967295L) | (((long) Float.floatToRawIntBits(c0953y7.f7557a)) << 32));
                    case 2:
                        long j = ((w20) obj).f6904a;
                        return new C0953y7((int) (j >> 32), (int) (4294967295L & j));
                    case 3:
                        C0953y7 c0953y72 = (C0953y7) obj;
                        return new w20((((long) Math.round(c0953y72.f7558b)) & 4294967295L) | (((long) Math.round(c0953y72.f7557a)) << 32));
                    case 4:
                        long j2 = ((d30) obj).f953a;
                        return new C0953y7((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 5:
                        C0953y7 c0953y73 = (C0953y7) obj;
                        int iRound = Math.round(c0953y73.f7557a);
                        if (iRound < 0) {
                            iRound = 0;
                        }
                        int iRound2 = Math.round(c0953y73.f7558b);
                        return new d30((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
                    case 6:
                        st0 st0Var = (st0) obj;
                        return new C0009a8(st0Var.f5832a, st0Var.f5833b, st0Var.f5834c, st0Var.f5835d);
                    case 7:
                        C0009a8 c0009a8 = (C0009a8) obj;
                        return new st0(c0009a8.f65a, c0009a8.f66b, c0009a8.f67c, c0009a8.f68d);
                    default:
                        return Float.valueOf(((C0916x7) obj).f7277a);
                }
            }
        }, new InterfaceC0742sw() { // from class: gb1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        ok0 ok0Var = (ok0) obj;
                        return new C0953y7(Float.intBitsToFloat((int) (ok0Var.f4590a >> 32)), Float.intBitsToFloat((int) (4294967295L & ok0Var.f4590a)));
                    case 1:
                        C0953y7 c0953y7 = (C0953y7) obj;
                        return new ok0((((long) Float.floatToRawIntBits(c0953y7.f7558b)) & 4294967295L) | (((long) Float.floatToRawIntBits(c0953y7.f7557a)) << 32));
                    case 2:
                        long j = ((w20) obj).f6904a;
                        return new C0953y7((int) (j >> 32), (int) (4294967295L & j));
                    case 3:
                        C0953y7 c0953y72 = (C0953y7) obj;
                        return new w20((((long) Math.round(c0953y72.f7558b)) & 4294967295L) | (((long) Math.round(c0953y72.f7557a)) << 32));
                    case 4:
                        long j2 = ((d30) obj).f953a;
                        return new C0953y7((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 5:
                        C0953y7 c0953y73 = (C0953y7) obj;
                        int iRound = Math.round(c0953y73.f7557a);
                        if (iRound < 0) {
                            iRound = 0;
                        }
                        int iRound2 = Math.round(c0953y73.f7558b);
                        return new d30((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
                    case 6:
                        st0 st0Var = (st0) obj;
                        return new C0009a8(st0Var.f5832a, st0Var.f5833b, st0Var.f5834c, st0Var.f5835d);
                    case 7:
                        C0009a8 c0009a8 = (C0009a8) obj;
                        return new st0(c0009a8.f65a, c0009a8.f66b, c0009a8.f67c, c0009a8.f68d);
                    default:
                        return Float.valueOf(((C0916x7) obj).f7277a);
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static final Bitmap.Config m1910A(int i) {
        return i == 0 ? Bitmap.Config.ARGB_8888 : i == 1 ? Bitmap.Config.ALPHA_8 : i == 2 ? Bitmap.Config.RGB_565 : i == 3 ? Bitmap.Config.RGBA_F16 : i == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final String m1911B(InterfaceC0322ik interfaceC0322ik) {
        Object bv0Var;
        if (interfaceC0322ik instanceof C0179eo) {
            return ((C0179eo) interfaceC0322ik).toString();
        }
        try {
            bv0Var = interfaceC0322ik + '@' + m1927m(interfaceC0322ik);
        } catch (Throwable th) {
            bv0Var = new bv0(th);
        }
        if (cv0.m604a(bv0Var) != null) {
            bv0Var = interfaceC0322ik.getClass().getName() + '@' + m1927m(interfaceC0322ik);
        }
        return (String) bv0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static final fq0 m1912C(ct0[] ct0VarArr, fq0 fq0Var, fq0 fq0Var2) {
        eq0 eq0Var = new eq0(fq0.f1796g);
        for (ct0 ct0Var : ct0VarArr) {
            at0 at0Var = ct0Var.f886a;
            if (ct0Var.f891f || !fq0Var.containsKey(at0Var)) {
                eq0Var.put(at0Var, at0Var.m208c(ct0Var, (cb1) fq0Var2.get(at0Var)));
            }
        }
        return eq0Var.m954a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static final Object m1913D(InterfaceC0618pk interfaceC0618pk, Object obj, Object obj2, InterfaceC0904ww interfaceC0904ww, InterfaceC0322ik interfaceC0322ik) {
        Object objInvoke;
        Object objM4035V = s91.m4035V(interfaceC0618pk, obj2);
        try {
            p31 p31Var = new p31(interfaceC0322ik, interfaceC0618pk);
            if (interfaceC0904ww == null) {
                objInvoke = rd0.m3467Z(interfaceC0904ww, obj, p31Var);
            } else {
                s91.m4048m(2, interfaceC0904ww);
                objInvoke = interfaceC0904ww.invoke(obj, p31Var);
            }
            s91.m4026M(interfaceC0618pk, objM4035V);
            if (objInvoke == EnumC1007zk.f7916d) {
                interfaceC0322ik.getClass();
            }
            return objInvoke;
        } catch (Throwable th) {
            s91.m4026M(interfaceC0618pk, objM4035V);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static final int m1914E(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m1915a(final InterfaceC0298hw interfaceC0298hw, final C0474mh c0474mh, pe0 pe0Var, final InterfaceC0904ww interfaceC0904ww, final InterfaceC0904ww interfaceC0904ww2, final InterfaceC0904ww interfaceC0904ww3, x01 x01Var, long j, long j2, long j3, long j4, C0932xn c0932xn, InterfaceC0356ji interfaceC0356ji, final int i) {
        C0616pi c0616pi;
        final pe0 pe0Var2;
        final x01 x01Var2;
        final long j5;
        final long j6;
        final long j7;
        final long j8;
        final C0932xn c0932xn2;
        long jM2698d;
        C0932xn c0932xn3;
        long j9;
        x01 x01Var3;
        long j10;
        pe0 pe0Var3;
        long j11;
        C0616pi c0616pi2 = (C0616pi) interfaceC0356ji;
        c0616pi2.m3091X(94478519);
        int i2 = i | 306209152;
        if (c0616pi2.m3082O(i2 & 1, (306783379 & i2) != 306783378)) {
            c0616pi2.m3087T();
            if ((i & 1) == 0 || c0616pi2.m3128y()) {
                x01 x01VarM387a = c11.m387a(s91.f5703e, c0616pi2);
                long jM2698d2 = AbstractC0510nf.m2698d(s91.f5702d, c0616pi2);
                long jM2698d3 = AbstractC0510nf.m2698d(s91.f5708j, c0616pi2);
                long jM2698d4 = AbstractC0510nf.m2698d(s91.f5704f, c0616pi2);
                jM2698d = AbstractC0510nf.m2698d(s91.f5706h, c0616pi2);
                c0932xn3 = new C0932xn();
                j9 = jM2698d3;
                x01Var3 = x01VarM387a;
                j10 = jM2698d2;
                pe0Var3 = me0.f3922a;
                j11 = jM2698d4;
            } else {
                c0616pi2.m3085R();
                pe0Var3 = pe0Var;
                x01Var3 = x01Var;
                j10 = j;
                j9 = j2;
                j11 = j3;
                jM2698d = j4;
                c0932xn3 = c0932xn;
            }
            c0616pi2.m3120q();
            c0616pi = c0616pi2;
            AbstractC0457m2.m2427c(interfaceC0298hw, c0474mh, pe0Var3, interfaceC0904ww, interfaceC0904ww2, interfaceC0904ww3, x01Var3, j10, j9, j11, jM2698d, c0932xn3, c0616pi, 1797558, 3456);
            pe0Var2 = pe0Var3;
            x01Var2 = x01Var3;
            j5 = j10;
            j6 = j9;
            j7 = j11;
            j8 = jM2698d;
            c0932xn2 = c0932xn3;
        } else {
            c0616pi = c0616pi2;
            c0616pi.m3085R();
            pe0Var2 = pe0Var;
            x01Var2 = x01Var;
            j5 = j;
            j6 = j2;
            j7 = j3;
            j8 = j4;
            c0932xn2 = c0932xn;
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new InterfaceC0904ww(c0474mh, pe0Var2, interfaceC0904ww, interfaceC0904ww2, interfaceC0904ww3, x01Var2, j5, j6, j7, j8, c0932xn2, i) { // from class: x2

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ C0474mh f7237e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ pe0 f7238f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ InterfaceC0904ww f7239g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ InterfaceC0904ww f7240h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ InterfaceC0904ww f7241i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ x01 f7242j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ long f7243k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ long f7244l;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ long f7245m;

                /* JADX INFO: renamed from: n */
                public final /* synthetic */ long f7246n;

                /* JADX INFO: renamed from: o */
                public final /* synthetic */ C0932xn f7247o;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0904ww
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM1649A = j50.m1649A(1772599);
                    AbstractC0398kl.m1915a(this.f7236d, this.f7237e, this.f7238f, this.f7239g, this.f7240h, this.f7241i, this.f7242j, this.f7243k, this.f7244l, this.f7245m, this.f7246n, this.f7247o, (InterfaceC0356ji) obj, iM1649A);
                    return na1.f4229a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C0045b7 m1916b(float f) {
        return new C0045b7(Float.valueOf(f), f3213x, Float.valueOf(0.01f), 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m1917c(pe0 pe0Var, float f, final long j, InterfaceC0356ji interfaceC0356ji, final int i, final int i2) {
        final pe0 pe0Var2;
        final float f2;
        pe0 pe0Var3;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(75144485);
        int i3 = i | 6;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 54;
        } else if ((i & 48) == 0) {
            i3 |= c0616pi.m3098c(f) ? 32 : 16;
        }
        int i5 = i3 | (c0616pi.m3102e(j) ? 256 : 128);
        boolean z = true;
        if (c0616pi.m3082O(i5 & 1, (i5 & 147) != 146)) {
            c0616pi.m3087T();
            if ((i & 1) == 0 || c0616pi.m3128y()) {
                f2 = i4 != 0 ? AbstractC0896wo.f7158a : f;
                pe0Var3 = me0.f3922a;
            } else {
                c0616pi.m3085R();
                pe0Var3 = pe0Var;
                f2 = f;
            }
            c0616pi.m3120q();
            pe0 pe0VarM3999b = s11.m3999b(pe0Var3.mo2499c(s11.f5620a), f2);
            boolean z2 = (i5 & 112) == 32;
            if ((((i5 & 896) ^ 384) <= 256 || !c0616pi.m3102e(j)) && (i5 & 384) != 256) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objM3080L = c0616pi.m3080L();
            if (z3 || objM3080L == C0320ii.f2572a) {
                objM3080L = new InterfaceC0742sw() { // from class: xo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p000.InterfaceC0742sw
                    public final Object invoke(Object obj) {
                        InterfaceC0812uq interfaceC0812uq = (InterfaceC0812uq) obj;
                        float f3 = f2;
                        float fMo654p = interfaceC0812uq.mo654p(f3);
                        float fMo654p2 = interfaceC0812uq.mo654p(f3) / 2.0f;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fMo654p2)) & 4294967295L);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0812uq.mo649c() >> 32));
                        float fMo654p3 = interfaceC0812uq.mo654p(f3) / 2.0f;
                        interfaceC0812uq.mo646T(j, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fMo654p3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), fMo654p);
                        return na1.f4229a;
                    }
                };
                c0616pi.m3107g0(objM3080L);
            }
            s91.m4037b(pe0VarM3999b, (InterfaceC0742sw) objM3080L, c0616pi, 0);
            pe0Var2 = pe0Var3;
        } else {
            c0616pi.m3085R();
            pe0Var2 = pe0Var;
            f2 = f;
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new InterfaceC0904ww() { // from class: yo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0904ww
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC0398kl.m1917c(pe0Var2, f2, j, (InterfaceC0356ji) obj, j50.m1649A(i | 1), i2);
                    return na1.f4229a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012e  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0752t5 m1918d(int i, int i2, int i3) {
        ColorSpace colorSpace;
        ColorSpace rgb;
        ColorSpace rgb2;
        nv0 nv0Var = C0687rf.f5391e;
        m1910A(i3);
        Bitmap.Config configM1910A = m1910A(i3);
        if (p30.m3002l(nv0Var, nv0Var)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (p30.m3002l(nv0Var, C0687rf.f5403q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (p30.m3002l(nv0Var, C0687rf.f5404r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (p30.m3002l(nv0Var, C0687rf.f5401o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (p30.m3002l(nv0Var, C0687rf.f5396j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (p30.m3002l(nv0Var, C0687rf.f5395i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (p30.m3002l(nv0Var, C0687rf.f5406t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (p30.m3002l(nv0Var, C0687rf.f5405s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (p30.m3002l(nv0Var, C0687rf.f5397k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (p30.m3002l(nv0Var, C0687rf.f5398l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (p30.m3002l(nv0Var, C0687rf.f5393g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (p30.m3002l(nv0Var, C0687rf.f5394h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (p30.m3002l(nv0Var, C0687rf.f5392f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (p30.m3002l(nv0Var, C0687rf.f5399m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (p30.m3002l(nv0Var, C0687rf.f5402p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!p30.m3002l(nv0Var, C0687rf.f5400n)) {
                if (Build.VERSION.SDK_INT >= 34) {
                    rgb2 = p30.m3002l(nv0Var, C0687rf.f5408v) ? ColorSpace.get(ColorSpace.Named.BT2020_HLG) : p30.m3002l(nv0Var, C0687rf.f5409w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
                    if (rgb2 != null) {
                        rgb = rgb2;
                    }
                } else if (nv0Var != null) {
                    String str = nv0Var.f4544a;
                    float[] fArrM509a = nv0Var.f4348d.m509a();
                    s81 s81Var = nv0Var.f4351g;
                    ColorSpace.Rgb.TransferParameters transferParameters = s81Var != null ? new ColorSpace.Rgb.TransferParameters(s81Var.f5684b, s81Var.f5685c, s81Var.f5686d, s81Var.f5687e, s81Var.f5688f, s81Var.f5689g, s81Var.f5683a) : null;
                    if (transferParameters != null) {
                        rgb2 = new ColorSpace.Rgb(str, nv0Var.f4352h, fArrM509a, transferParameters);
                        rgb = rgb2;
                    } else {
                        float[] fArr = nv0Var.f4352h;
                        final mv0 mv0Var = nv0Var.f4356l;
                        final int i4 = 0;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: pf
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                int i5 = i4;
                                InterfaceC0742sw interfaceC0742sw = mv0Var;
                                switch (i5) {
                                }
                                return ((Number) interfaceC0742sw.invoke(Double.valueOf(d))).doubleValue();
                            }
                        };
                        final mv0 mv0Var2 = nv0Var.f4359o;
                        final int i5 = 1;
                        rgb = new ColorSpace.Rgb(str, fArr, fArrM509a, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: pf
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                int i52 = i5;
                                InterfaceC0742sw interfaceC0742sw = mv0Var2;
                                switch (i52) {
                                }
                                return ((Number) interfaceC0742sw.invoke(Double.valueOf(d))).doubleValue();
                            }
                        }, nv0Var.f4349e, nv0Var.f4350f);
                    }
                } else {
                    colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new C0752t5(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configM1910A, true, rgb));
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        rgb = colorSpace;
        return new C0752t5(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configM1910A, true, rgb));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final void m1919e(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m1920f(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = b40.f368a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = br0.f561a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final int m1921g(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final Bundle m1922h(uo0... uo0VarArr) {
        Bundle bundle = new Bundle(uo0VarArr.length);
        for (uo0 uo0Var : uo0VarArr) {
            String str = (String) uo0Var.f6274d;
            Object obj = uo0Var.f6275e;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final boolean m1923i(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = C0294hs.f2354d;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i = 0;
                while (i < size) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    xz0 xz0Var = (xz0) obj2;
                    xz0 xz0Var2 = (xz0) obj;
                    arrayList2.add(new ok0((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (xz0Var2.m5185g().m4101a() >> 32)) - Float.intBitsToFloat((int) (xz0Var.m5185g().m4101a() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (xz0Var2.m5185g().m4101a() & 4294967295L)) - Float.intBitsToFloat((int) (xz0Var.m5185g().m4101a() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((ok0) AbstractC0960ye.m5240J(list)).f4590a;
            } else {
                if (list.isEmpty()) {
                    ya0.m5228c("Empty collection can't be reduced.");
                }
                Object objM5240J = AbstractC0960ye.m5240J(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        objM5240J = new ok0(ok0.m2934e(((ok0) objM5240J).f4590a, ((ok0) list.get(i2)).f4590a));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((ok0) objM5240J).f4590a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final C0408kv m1924j(Context context) {
        C0675r3 c0675r3 = new C0675r3(1);
        context.getApplicationContext();
        return new C0408kv(c0675r3, new C0603p5(Build.VERSION.SDK_INT >= 31 ? C0033aw.f281a.m212a(context) : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final dx0 m1925k(rg0 rg0Var) {
        LinkedHashMap linkedHashMap = rg0Var.f1481a;
        nx0 nx0Var = (nx0) linkedHashMap.get(f3208s);
        Bundle bundle = null;
        if (nx0Var == null) {
            C0921xc.m5131l("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        wc1 wc1Var = (wc1) linkedHashMap.get(f3209t);
        if (wc1Var == null) {
            C0921xc.m5131l("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(f3210u);
        String str = (String) linkedHashMap.get(o30.f4430P);
        if (str == null) {
            C0921xc.m5131l("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        jx0 jx0VarM1961b = nx0Var.getSavedStateRegistry().m1961b();
        gx0 gx0Var = jx0VarM1961b instanceof gx0 ? (gx0) jx0VarM1961b : null;
        if (gx0Var == null) {
            C0921xc.m5134o("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = m1930p(wc1Var).f2371b;
        dx0 dx0Var = (dx0) linkedHashMap2.get(str);
        if (dx0Var != null) {
            return dx0Var;
        }
        gx0Var.m1265b();
        Bundle bundle3 = gx0Var.f2087c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = m1922h((uo0[]) Arrays.copyOf(new uo0[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                gx0Var.f2087c = null;
            }
            bundle = bundle4;
        }
        dx0 dx0VarM3408j = r60.m3408j(bundle, bundle2);
        linkedHashMap2.put(str, dx0VarM3408j);
        return dx0VarM3408j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final Object m1926l(nz0 nz0Var, long j, InterfaceC0904ww interfaceC0904ww) {
        while (true) {
            if (nz0Var.f4374e >= j && !nz0Var.mo1587f()) {
                return nz0Var;
            }
            Object objM1585d = nz0Var.m1585d();
            C1014zr c1014zr = f3199j;
            if (objM1585d == c1014zr) {
                return c1014zr;
            }
            nz0 nz0Var2 = (nz0) ((AbstractC0321ij) objM1585d);
            if (nz0Var2 == null) {
                nz0Var2 = (nz0) interfaceC0904ww.invoke(Long.valueOf(nz0Var.f4374e + 1), nz0Var);
                if (nz0Var.m1590i(nz0Var2)) {
                    if (nz0Var.mo1587f()) {
                        nz0Var.m1589h();
                    }
                }
            }
            nz0Var = nz0Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final String m1927m(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: n */
    public static final Class m1928n(C0352je c0352je) {
        c0352je.getClass();
        Class cls = c0352je.f2804d;
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: o */
    public static final Class m1929o(C0352je c0352je) {
        Class cls = c0352je.f2804d;
        if (cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final hx0 m1930p(wc1 wc1Var) {
        fx0 fx0Var = new fx0();
        AbstractC0176el defaultViewModelCreationExtras = wc1Var instanceof InterfaceC0411ky ? ((InterfaceC0411ky) wc1Var).getDefaultViewModelCreationExtras() : C0133dl.f1150b;
        defaultViewModelCreationExtras.getClass();
        vc1 viewModelStore = wc1Var.getViewModelStore();
        viewModelStore.getClass();
        return (hx0) new C0948y2(viewModelStore, fx0Var, defaultViewModelCreationExtras).m5208l(au0.m211a(hx0.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final void m1931q(InterfaceC0618pk interfaceC0618pk, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC0767tk.f6009a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0729sk) it.next()).mo787n(interfaceC0618pk, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    m1920f(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            m1920f(th, new C0809un(interfaceC0618pk));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: tq */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static final void m1932r(InterfaceC0775tq interfaceC0775tq) {
        if (((oe0) interfaceC0775tq).f4529d.f4542q) {
            pf1.m3037O(interfaceC0775tq, 1).m3273N0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final C0822v m1933s(Object[] objArr) {
        objArr.getClass();
        return new C0822v(objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final pe0 m1934t(f70 f70Var, C0166eb c0166eb, um0 um0Var) {
        return new b70(f70Var, c0166eb, um0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static pe0 m1935u(pe0 pe0Var, aj0 aj0Var) {
        return pe0Var.mo2499c(new dj0(aj0Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final Object m1936v(fq0 fq0Var, at0 at0Var) {
        at0Var.getClass();
        Object objMo207b = fq0Var.get(at0Var);
        if (objMo207b == null) {
            objMo207b = at0Var.mo207b();
        }
        return ((cb1) objMo207b).mo196a(fq0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final C0474mh m1937w(int i, InterfaceC0188ex interfaceC0188ex, InterfaceC0356ji interfaceC0356ji) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        Object objM3080L = c0616pi.m3080L();
        if (objM3080L == C0320ii.f2572a) {
            objM3080L = new C0474mh(i, true, interfaceC0188ex);
            c0616pi.m3107g0(objM3080L);
        }
        C0474mh c0474mh = (C0474mh) objM3080L;
        if (!c0474mh.f3978f.equals(interfaceC0188ex)) {
            c0474mh.f3978f = interfaceC0188ex;
            if (c0474mh.f3977e) {
                ht0 ht0Var = c0474mh.f3979g;
                if (ht0Var != null) {
                    C0964yi c0964yi = ht0Var.f2359a;
                    if (c0964yi != null) {
                        c0964yi.m5278s(ht0Var, null);
                    }
                    c0474mh.f3979g = null;
                }
                ArrayList arrayList = c0474mh.f3980h;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ht0 ht0Var2 = (ht0) arrayList.get(i2);
                        C0964yi c0964yi2 = ht0Var2.f2359a;
                        if (c0964yi2 != null) {
                            c0964yi2.m5278s(ht0Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return c0474mh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static final void m1938x(C0884wc c0884wc, InterfaceC0322ik interfaceC0322ik, boolean z) {
        Object objM4991u = c0884wc.m4991u();
        Throwable thMo1251f = c0884wc.mo1251f(objM4991u);
        Object bv0Var = thMo1251f != null ? new bv0(thMo1251f) : c0884wc.mo1252g(objM4991u);
        if (!z) {
            interfaceC0322ik.mo541i(bv0Var);
            return;
        }
        interfaceC0322ik.getClass();
        C0179eo c0179eo = (C0179eo) interfaceC0322ik;
        AbstractC0358jk abstractC0358jk = c0179eo.f1490h;
        Object obj = c0179eo.f1492j;
        InterfaceC0618pk interfaceC0618pkMo540e = abstractC0358jk.mo540e();
        Object objM4035V = s91.m4035V(interfaceC0618pkMo540e, obj);
        la1 la1VarM1521G = objM4035V != s91.f5695C ? AbstractC0307i4.m1521G(abstractC0358jk, interfaceC0618pkMo540e, objM4035V) : null;
        try {
            abstractC0358jk.mo541i(bv0Var);
            if (la1VarM1521G == null || la1VarM1521G.m2009m0()) {
                s91.m4026M(interfaceC0618pkMo540e, objM4035V);
            }
        } catch (Throwable th) {
            if (la1VarM1521G == null || la1VarM1521G.m2009m0()) {
                s91.m4026M(interfaceC0618pkMo540e, objM4035V);
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final a30 m1939y(st0 st0Var) {
        return new a30(Math.round(st0Var.f5832a), Math.round(st0Var.f5833b), Math.round(st0Var.f5834c), Math.round(st0Var.f5835d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static final void m1940z(C0156e1 c0156e1, xz0 xz0Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0156e1.f1256a;
        Object objM1701g = xz0Var.m5188k().f5877d.m1701g(b01.f327f);
        if (objM1701g == null) {
            objM1701g = null;
        }
        C0923xe c0923xe = (C0923xe) objM1701g;
        if (c0923xe != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(c0923xe.f7334a, c0923xe.f7335b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objM1701g2 = xz0Var.m5188k().f5877d.m1701g(b01.f326e);
        if ((objM1701g2 != null ? objM1701g2 : null) != null) {
            List listM5178j = xz0.m5178j(4, xz0Var);
            int size = listM5178j.size();
            for (int i = 0; i < size; i++) {
                xz0 xz0Var2 = (xz0) listM5178j.get(i);
                if (xz0Var2.m5188k().f5877d.m1697c(b01.f314G)) {
                    arrayList.add(xz0Var2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zM1923i = m1923i(arrayList);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zM1923i ? 1 : arrayList.size(), zM1923i ? arrayList.size() : 1, false, 0));
    }
}
