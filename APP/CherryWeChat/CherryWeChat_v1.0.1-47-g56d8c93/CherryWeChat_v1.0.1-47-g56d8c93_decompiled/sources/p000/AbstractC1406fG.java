package p000;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: fG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1406fG implements InterfaceC0406Jc, InterfaceC0919Va, InterfaceC0359IE {

    /* JADX INFO: renamed from: b */
    public static final C2610v1 f4983b;

    /* JADX INFO: renamed from: c */
    public static final C2610v1 f4984c;

    /* JADX INFO: renamed from: d */
    public static final Object f4985d = new Object();

    /* JADX INFO: renamed from: e */
    public static final byte[] f4986e = {112, 114, 111, 0};

    /* JADX INFO: renamed from: f */
    public static final byte[] f4987f = {112, 114, 109, 0};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4988a;

    static {
        int i = 10;
        f4983b = new C2610v1("UNDEFINED", i);
        f4984c = new C2610v1("REUSABLE_CLAIMED", i);
    }

    public /* synthetic */ AbstractC1406fG(int i) {
        this.f4988a = i;
    }

    /* JADX INFO: renamed from: E */
    public static final C2813zq m2680E(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new C2813zq(matcher, charSequence);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x06f2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0114  */
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2681F(C2497sb c2497sb, C2244mo c2244mo, ArrayList arrayList, int i) {
        int i2;
        C2178l7[] c2178l7Arr;
        int i3;
        int i4;
        C1259cb[] c1259cbArr;
        boolean z;
        C2454rb c2454rb;
        float f;
        boolean z2;
        boolean z3;
        int i5;
        C2454rb c2454rb2;
        C2244mo c2244mo2;
        C2454rb c2454rb3;
        C0256Fy c0256Fy;
        C1259cb c1259cb;
        C0256Fy c0256Fy2;
        C2454rb c2454rb4;
        int i6;
        C1259cb c1259cb2;
        C0256Fy c0256Fy3;
        C2454rb c2454rb5;
        C1259cb[] c1259cbArr2;
        C2454rb c2454rb6;
        int i7;
        C0256Fy c0256Fy4;
        int size;
        ArrayList arrayList2;
        int i8;
        C2454rb c2454rb7;
        int i9;
        float f2;
        int i10;
        float f3;
        C2454rb c2454rb8;
        int i11;
        boolean z4;
        int i12;
        int i13;
        C2454rb c2454rb9;
        C2497sb c2497sb2 = c2497sb;
        C2244mo c2244mo3 = c2244mo;
        ArrayList arrayList3 = arrayList;
        if (i == 0) {
            i2 = c2497sb2.f8783z0;
            c2178l7Arr = c2497sb2.f8764C0;
            i3 = 0;
        } else {
            i2 = c2497sb2.f8762A0;
            c2178l7Arr = c2497sb2.f8763B0;
            i3 = 2;
        }
        int i14 = i2;
        C2178l7[] c2178l7Arr2 = c2178l7Arr;
        int i15 = 0;
        while (i15 < i14) {
            C2178l7 c2178l7 = c2178l7Arr2[i15];
            boolean z5 = c2178l7.f7605q;
            C2454rb c2454rb10 = c2178l7.f7589a;
            C1259cb[] c1259cbArr3 = c2454rb10.f8596Q;
            int i16 = 3;
            int i17 = 8;
            float f4 = 0.0f;
            if (z5) {
                i4 = i15;
            } else {
                int i18 = c2178l7.f7600l;
                int i19 = i18 * 2;
                C2454rb c2454rb11 = c2454rb10;
                C2454rb c2454rb12 = c2454rb11;
                boolean z6 = false;
                while (!z6) {
                    c2178l7.f7597i++;
                    C2454rb[] c2454rbArr = c2454rb11.f8631m0;
                    C1259cb[] c1259cbArr4 = c2454rb11.f8596Q;
                    c2454rbArr[i18] = null;
                    c2454rb11.f8629l0[i18] = null;
                    if (c2454rb11.f8619g0 != i17) {
                        c2454rb11.m4932j(i18);
                        c1259cbArr4[i19].m2384e();
                        int i20 = i19 + 1;
                        c1259cbArr4[i20].m2384e();
                        c1259cbArr4[i19].m2384e();
                        c1259cbArr4[i20].m2384e();
                        if (c2178l7.f7590b == null) {
                            c2178l7.f7590b = c2454rb11;
                        }
                        c2178l7.f7592d = c2454rb11;
                        int i21 = c2454rb11.f8637p0[i18];
                        if (i21 == i16) {
                            int i22 = c2454rb11.f8641t[i18];
                            if (i22 == 0 || i22 == i16 || i22 == 2) {
                                c2178l7.f7598j++;
                                float f5 = c2454rb11.f8627k0[i18];
                                if (f5 > 0.0f) {
                                    i12 = i15;
                                    c2178l7.f7599k += f5;
                                } else {
                                    i12 = i15;
                                }
                                i13 = i18;
                                if (c2454rb11.f8619g0 != 8 && i21 == 3 && (i22 == 0 || i22 == 3)) {
                                    if (f5 < 0.0f) {
                                        c2178l7.f7602n = true;
                                    } else {
                                        c2178l7.f7603o = true;
                                    }
                                    if (c2178l7.f7596h == null) {
                                        c2178l7.f7596h = new ArrayList();
                                    }
                                    c2178l7.f7596h.add(c2454rb11);
                                }
                                if (c2178l7.f7594f == null) {
                                    c2178l7.f7594f = c2454rb11;
                                }
                                C2454rb c2454rb13 = c2178l7.f7595g;
                                if (c2454rb13 != null) {
                                    c2454rb13.f8629l0[i13] = c2454rb11;
                                }
                                c2178l7.f7595g = c2454rb11;
                            } else {
                                i12 = i15;
                                i13 = i18;
                            }
                            if (i13 == 0) {
                                if (c2454rb11.f8639r == 0 && c2454rb11.f8642u == 0) {
                                    int i23 = c2454rb11.f8643v;
                                }
                            } else if (c2454rb11.f8640s == 0 && c2454rb11.f8645x == 0) {
                                int i24 = c2454rb11.f8646y;
                            }
                        } else {
                            i12 = i15;
                            i13 = i18;
                        }
                    }
                    C2454rb c2454rb14 = c2454rb12;
                    if (c2454rb14 != c2454rb11) {
                        c2454rb14.f8631m0[i13] = c2454rb11;
                    }
                    C1259cb c1259cb3 = c1259cbArr4[i19 + 1].f4270f;
                    if (c1259cb3 != null) {
                        c2454rb9 = c1259cb3.f4268d;
                        C1259cb c1259cb4 = c2454rb9.f8596Q[i19].f4270f;
                        if (c1259cb4 == null || c1259cb4.f4268d != c2454rb11) {
                            c2454rb9 = null;
                        }
                    }
                    if (c2454rb9 == null) {
                        c2454rb9 = c2454rb11;
                        z6 = true;
                    }
                    c2454rb12 = c2454rb11;
                    i18 = i13;
                    i16 = 3;
                    i17 = 8;
                    c2454rb11 = c2454rb9;
                    i15 = i12;
                }
                i4 = i15;
                int i25 = i18;
                C2454rb c2454rb15 = c2178l7.f7590b;
                if (c2454rb15 != null) {
                    c2454rb15.f8596Q[i19].m2384e();
                }
                C2454rb c2454rb16 = c2178l7.f7592d;
                if (c2454rb16 != null) {
                    c2454rb16.f8596Q[i19 + 1].m2384e();
                }
                c2178l7.f7591c = c2454rb11;
                if (i25 == 0 && c2178l7.f7601m) {
                    c2178l7.f7593e = c2454rb11;
                } else {
                    c2178l7.f7593e = c2454rb10;
                }
                c2178l7.f7604p = c2178l7.f7603o && c2178l7.f7602n;
            }
            c2178l7.f7605q = true;
            if (arrayList3 == null || arrayList3.contains(c2454rb10)) {
                C2454rb c2454rb17 = c2178l7.f7591c;
                C2454rb c2454rb18 = c2178l7.f7590b;
                C2454rb c2454rb19 = c2178l7.f7592d;
                C2454rb c2454rb20 = c2178l7.f7593e;
                float f6 = c2178l7.f7599k;
                int[] iArr = c2497sb2.f8637p0;
                C1259cb[] c1259cbArr5 = c2497sb2.f8596Q;
                boolean z7 = iArr[i] == 2;
                if (i == 0) {
                    int i26 = c2454rb20.f8623i0;
                    boolean z8 = i26 == 0;
                    c1259cbArr = c1259cbArr3;
                    boolean z9 = i26 == 1;
                    z = i26 == 2;
                    c2454rb = c2454rb10;
                    f = f6;
                    z3 = z9;
                    z2 = z8;
                } else {
                    c1259cbArr = c1259cbArr3;
                    int i27 = c2454rb20.f8625j0;
                    boolean z10 = i27 == 0;
                    boolean z11 = i27 == 1;
                    z = i27 == 2;
                    c2454rb = c2454rb10;
                    f = f6;
                    z2 = z10;
                    z3 = z11;
                }
                boolean z12 = false;
                while (!z12) {
                    C1259cb[] c1259cbArr6 = c2454rb.f8596Q;
                    int[] iArr2 = c2454rb.f8637p0;
                    C1259cb c1259cb5 = c1259cbArr6[i3];
                    int i28 = z ? 1 : 4;
                    int iM2384e = c1259cb5.m2384e();
                    boolean z13 = z7;
                    boolean z14 = z;
                    boolean z15 = iArr2[i] == 3 && c2454rb.f8641t[i] == 0;
                    C1259cb c1259cb6 = c1259cb5.f4270f;
                    if (c1259cb6 != null && c2454rb != c2454rb10) {
                        iM2384e = c1259cb6.m2384e() + iM2384e;
                    }
                    int i29 = iM2384e;
                    if (z14 && c2454rb != c2454rb10 && c2454rb != c2454rb18) {
                        i28 = 8;
                    }
                    C2454rb c2454rb21 = c2454rb10;
                    C1259cb c1259cb7 = c1259cb5.f4270f;
                    if (c1259cb7 != null) {
                        if (c2454rb == c2454rb18) {
                            z4 = z15;
                            c2244mo3.m4567f(c1259cb5.f4273i, c1259cb7.f4273i, i29, 6);
                        } else {
                            z4 = z15;
                            c2244mo3.m4567f(c1259cb5.f4273i, c1259cb7.f4273i, i29, 8);
                        }
                        if (z4 && !z14) {
                            i28 = 5;
                        }
                        c2244mo3.m4566e(c1259cb5.f4273i, c1259cb5.f4270f.f4273i, i29, (c2454rb == c2454rb18 && z14 && c2454rb.f8598S[i]) ? 5 : i28);
                    }
                    if (z13) {
                        if (c2454rb.f8619g0 == 8 || iArr2[i] != 3) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                            c2244mo3.m4567f(c1259cbArr6[i3 + 1].f4273i, c1259cbArr6[i3].f4273i, 0, 5);
                        }
                        c2244mo3.m4567f(c1259cbArr6[i3].f4273i, c1259cbArr5[i3].f4273i, i11, 8);
                    }
                    C1259cb c1259cb8 = c1259cbArr6[i3 + 1].f4270f;
                    if (c1259cb8 != null) {
                        c2454rb8 = c1259cb8.f4268d;
                        C1259cb c1259cb9 = c2454rb8.f8596Q[i3].f4270f;
                        if (c1259cb9 == null || c1259cb9.f4268d != c2454rb) {
                            c2454rb8 = null;
                        }
                    }
                    if (c2454rb8 != null) {
                        c2454rb = c2454rb8;
                    } else {
                        z12 = true;
                    }
                    c2454rb10 = c2454rb21;
                    z7 = z13;
                    z = z14;
                }
                boolean z16 = z7;
                boolean z17 = z;
                if (c2454rb19 != null) {
                    int i30 = i3 + 1;
                    if (c2454rb17.f8596Q[i30].f4270f != null) {
                        C1259cb c1259cb10 = c2454rb19.f8596Q[i30];
                        if (c2454rb19.f8637p0[i] == 3 && c2454rb19.f8641t[i] == 0 && !z17) {
                            C1259cb c1259cb11 = c1259cb10.f4270f;
                            if (c1259cb11.f4268d == c2497sb2) {
                                c2244mo3.m4566e(c1259cb10.f4273i, c1259cb11.f4273i, -c1259cb10.m2384e(), 5);
                            }
                            c2244mo3.m4568g(c1259cb10.f4273i, c2454rb17.f8596Q[i30].f4270f.f4273i, -c1259cb10.m2384e(), 6);
                        } else {
                            if (z17) {
                                C1259cb c1259cb12 = c1259cb10.f4270f;
                                if (c1259cb12.f4268d == c2497sb2) {
                                    c2244mo3.m4566e(c1259cb10.f4273i, c1259cb12.f4273i, -c1259cb10.m2384e(), 4);
                                }
                            }
                            c2244mo3.m4568g(c1259cb10.f4273i, c2454rb17.f8596Q[i30].f4270f.f4273i, -c1259cb10.m2384e(), 6);
                        }
                    }
                }
                if (z16) {
                    int i31 = i3 + 1;
                    C0256Fy c0256Fy5 = c1259cbArr5[i31].f4273i;
                    C1259cb c1259cb13 = c2454rb17.f8596Q[i31];
                    c2244mo3.m4567f(c0256Fy5, c1259cb13.f4273i, c1259cb13.m2384e(), 8);
                }
                ArrayList arrayList4 = c2178l7.f7596h;
                if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                    if (c2178l7.f7602n && !c2178l7.f7604p) {
                        f = c2178l7.f7598j;
                    }
                    C2454rb c2454rb22 = null;
                    float f7 = 0.0f;
                    int i32 = 0;
                    while (i32 < size) {
                        C2454rb c2454rb23 = (C2454rb) arrayList4.get(i32);
                        float[] fArr = c2454rb23.f8627k0;
                        C1259cb[] c1259cbArr7 = c2454rb23.f8596Q;
                        float f8 = fArr[i];
                        if (f8 >= f4) {
                            arrayList2 = arrayList4;
                            i8 = size;
                            if (f8 != f4) {
                                f3 = f7;
                                c2244mo3.m4566e(c1259cbArr7[i3 + 1].f4273i, c1259cbArr7[i3].f4273i, 0, 8);
                                i9 = i32;
                                f2 = f4;
                                f7 = f3;
                                i10 = i14;
                            } else {
                                float f9 = f7;
                                if (c2454rb22 != null) {
                                    C1259cb[] c1259cbArr8 = c2454rb22.f8596Q;
                                    C0256Fy c0256Fy6 = c1259cbArr8[i3].f4273i;
                                    int i33 = i3 + 1;
                                    C0256Fy c0256Fy7 = c1259cbArr8[i33].f4273i;
                                    C0256Fy c0256Fy8 = c1259cbArr7[i3].f4273i;
                                    C0256Fy c0256Fy9 = c1259cbArr7[i33].f4273i;
                                    C0564N4 c0564n4M4573l = c2244mo3.m4573l();
                                    c2454rb7 = c2454rb23;
                                    float f10 = f4;
                                    c0564n4M4573l.f1843b = f10;
                                    f2 = f10;
                                    if (f == f10 || f9 == f8) {
                                        i9 = i32;
                                        i10 = i14;
                                        c0564n4M4573l.f1845d.m367g(c0256Fy6, 1.0f);
                                        c0564n4M4573l.f1845d.m367g(c0256Fy7, -1.0f);
                                        c0564n4M4573l.f1845d.m367g(c0256Fy9, 1.0f);
                                        c0564n4M4573l.f1845d.m367g(c0256Fy8, -1.0f);
                                    } else {
                                        if (f9 == f2) {
                                            c0564n4M4573l.f1845d.m367g(c0256Fy6, 1.0f);
                                            c0564n4M4573l.f1845d.m367g(c0256Fy7, -1.0f);
                                        } else if (f8 == f4) {
                                            c0564n4M4573l.f1845d.m367g(c0256Fy8, 1.0f);
                                            c0564n4M4573l.f1845d.m367g(c0256Fy9, -1.0f);
                                        } else {
                                            i9 = i32;
                                            float f11 = (f9 / f) / (f8 / f);
                                            i10 = i14;
                                            c0564n4M4573l.f1845d.m367g(c0256Fy6, 1.0f);
                                            c0564n4M4573l.f1845d.m367g(c0256Fy7, -1.0f);
                                            c0564n4M4573l.f1845d.m367g(c0256Fy9, f11);
                                            c0564n4M4573l.f1845d.m367g(c0256Fy8, -f11);
                                        }
                                        i9 = i32;
                                        i10 = i14;
                                    }
                                    c2244mo3.m4564c(c0564n4M4573l);
                                } else {
                                    c2454rb7 = c2454rb23;
                                    i9 = i32;
                                    f2 = f4;
                                    i10 = i14;
                                }
                                f7 = f8;
                                c2454rb22 = c2454rb7;
                            }
                        } else if (c2178l7.f7604p) {
                            arrayList2 = arrayList4;
                            i8 = size;
                            c2244mo3.m4566e(c1259cbArr7[i3 + 1].f4273i, c1259cbArr7[i3].f4273i, 0, 4);
                            f3 = f7;
                            i9 = i32;
                            f2 = f4;
                            f7 = f3;
                            i10 = i14;
                        } else {
                            f8 = 1.0f;
                            arrayList2 = arrayList4;
                            i8 = size;
                            if (f8 != f4) {
                            }
                        }
                        i32 = i9 + 1;
                        i14 = i10;
                        arrayList4 = arrayList2;
                        size = i8;
                        f4 = f2;
                    }
                }
                i5 = i14;
                if (c2454rb18 == null || !(c2454rb18 == c2454rb19 || z17)) {
                    c2454rb2 = c2454rb19;
                    if (!z2 || c2454rb18 == null) {
                        C1259cb[] c1259cbArr9 = c1259cbArr;
                        int i34 = 8;
                        if (z3 && c2454rb18 != null) {
                            int i35 = c2178l7.f7598j;
                            boolean z18 = i35 > 0 && c2178l7.f7597i == i35;
                            C2454rb c2454rb24 = c2454rb18;
                            C2454rb c2454rb25 = c2454rb24;
                            while (c2454rb25 != null) {
                                C1259cb[] c1259cbArr10 = c2454rb25.f8596Q;
                                C2454rb c2454rb26 = c2454rb25.f8631m0[i];
                                while (c2454rb26 != null && c2454rb26.f8619g0 == i34) {
                                    c2454rb26 = c2454rb26.f8631m0[i];
                                }
                                if (c2454rb25 == c2454rb18 || c2454rb25 == c2454rb2 || c2454rb26 == null) {
                                    c2454rb3 = c2454rb24;
                                } else {
                                    if (c2454rb26 == c2454rb2) {
                                        c2454rb26 = null;
                                    }
                                    C1259cb c1259cb14 = c1259cbArr10[i3];
                                    C0256Fy c0256Fy10 = c1259cb14.f4273i;
                                    int i36 = i3 + 1;
                                    C0256Fy c0256Fy11 = c2454rb24.f8596Q[i36].f4273i;
                                    int iM2384e2 = c1259cb14.m2384e();
                                    int iM2384e3 = c1259cbArr10[i36].m2384e();
                                    if (c2454rb26 != null) {
                                        c1259cb = c2454rb26.f8596Q[i3];
                                        c0256Fy2 = c1259cb.f4273i;
                                        C1259cb c1259cb15 = c1259cb.f4270f;
                                        c0256Fy = c1259cb15 != null ? c1259cb15.f4273i : null;
                                    } else {
                                        C1259cb c1259cb16 = c2454rb2.f8596Q[i3];
                                        C0256Fy c0256Fy12 = c1259cb16 != null ? c1259cb16.f4273i : null;
                                        c0256Fy = c1259cbArr10[i36].f4273i;
                                        c1259cb = c1259cb16;
                                        c0256Fy2 = c0256Fy12;
                                    }
                                    if (c1259cb != null) {
                                        iM2384e3 += c1259cb.m2384e();
                                    }
                                    int iM2384e4 = iM2384e2 + c2454rb24.f8596Q[i36].m2384e();
                                    C2454rb c2454rb27 = c2454rb26;
                                    C0256Fy c0256Fy13 = c0256Fy2;
                                    int i37 = z18 ? 8 : 4;
                                    if (c0256Fy10 == null || c0256Fy11 == null || c0256Fy13 == null || c0256Fy == null) {
                                        c2454rb3 = c2454rb24;
                                        c2454rb4 = c2454rb27;
                                    } else {
                                        c2454rb4 = c2454rb27;
                                        C0256Fy c0256Fy14 = c0256Fy;
                                        c2454rb3 = c2454rb24;
                                        c2244mo.m4563b(c0256Fy10, c0256Fy11, iM2384e4, 0.5f, c0256Fy13, c0256Fy14, iM2384e3, i37);
                                    }
                                    c2454rb26 = c2454rb4;
                                }
                                if (c2454rb25.f8619g0 != 8) {
                                    c2454rb3 = c2454rb25;
                                }
                                c2454rb25 = c2454rb26;
                                c2454rb24 = c2454rb3;
                                i34 = 8;
                            }
                            c2244mo2 = c2244mo;
                            C1259cb c1259cb17 = c2454rb18.f8596Q[i3];
                            C1259cb c1259cb18 = c1259cbArr9[i3].f4270f;
                            int i38 = i3 + 1;
                            C1259cb c1259cb19 = c2454rb2.f8596Q[i38];
                            C1259cb c1259cb20 = c2454rb17.f8596Q[i38].f4270f;
                            if (c1259cb18 != null) {
                                if (c2454rb18 != c2454rb2) {
                                    c2244mo2.m4566e(c1259cb17.f4273i, c1259cb18.f4273i, c1259cb17.m2384e(), 5);
                                } else if (c1259cb20 != null) {
                                    c2244mo2.m4563b(c1259cb17.f4273i, c1259cb18.f4273i, c1259cb17.m2384e(), 0.5f, c1259cb19.f4273i, c1259cb20.f4273i, c1259cb19.m2384e(), 5);
                                }
                            }
                            if (c1259cb20 != null && c2454rb18 != c2454rb2) {
                                c2244mo2.m4566e(c1259cb19.f4273i, c1259cb20.f4273i, -c1259cb19.m2384e(), 5);
                            }
                        }
                        if ((z2 || z3) && c2454rb18 != null && c2454rb18 != c2454rb2) {
                            C1259cb[] c1259cbArr11 = c2454rb18.f8596Q;
                            C1259cb c1259cb21 = c1259cbArr11[i3];
                            if (c2454rb2 == null) {
                                c2454rb2 = c2454rb18;
                            }
                            C1259cb[] c1259cbArr12 = c2454rb2.f8596Q;
                            int i39 = i3 + 1;
                            C1259cb c1259cb22 = c1259cbArr12[i39];
                            C1259cb c1259cb23 = c1259cb21.f4270f;
                            c0256Fy4 = c1259cb23 != null ? c1259cb23.f4273i : null;
                            C1259cb c1259cb24 = c1259cb22.f4270f;
                            C0256Fy c0256Fy15 = c1259cb24 != null ? c1259cb24.f4273i : null;
                            if (c2454rb17 != c2454rb2) {
                                C1259cb c1259cb25 = c2454rb17.f8596Q[i39].f4270f;
                                c0256Fy15 = c1259cb25 != null ? c1259cb25.f4273i : null;
                            }
                            if (c2454rb18 == c2454rb2) {
                                c1259cb22 = c1259cbArr11[i39];
                            }
                            if (c0256Fy4 != null && c0256Fy15 != null) {
                                c2244mo2.m4563b(c1259cb21.f4273i, c0256Fy4, c1259cb21.m2384e(), 0.5f, c0256Fy15, c1259cb22.f4273i, c1259cbArr12[i39].m2384e(), 5);
                            }
                        }
                    } else {
                        int i40 = c2178l7.f7598j;
                        boolean z19 = i40 > 0 && c2178l7.f7597i == i40;
                        C2454rb c2454rb28 = c2454rb18;
                        C2454rb c2454rb29 = c2454rb28;
                        while (c2454rb28 != null) {
                            C1259cb[] c1259cbArr13 = c2454rb28.f8596Q;
                            C2454rb c2454rb30 = c2454rb28.f8631m0[i];
                            while (true) {
                                if (c2454rb30 == null) {
                                    i6 = 8;
                                    break;
                                }
                                i6 = 8;
                                if (c2454rb30.f8619g0 != 8) {
                                    break;
                                } else {
                                    c2454rb30 = c2454rb30.f8631m0[i];
                                }
                            }
                            if (c2454rb30 != null || c2454rb28 == c2454rb2) {
                                C1259cb c1259cb26 = c1259cbArr13[i3];
                                C0256Fy c0256Fy16 = c1259cb26.f4273i;
                                C1259cb c1259cb27 = c1259cb26.f4270f;
                                C0256Fy c0256Fy17 = c1259cb27 != null ? c1259cb27.f4273i : null;
                                if (c2454rb29 != c2454rb28) {
                                    c0256Fy17 = c2454rb29.f8596Q[i3 + 1].f4273i;
                                } else if (c2454rb28 == c2454rb18) {
                                    C1259cb c1259cb28 = c1259cbArr[i3].f4270f;
                                    c0256Fy17 = c1259cb28 != null ? c1259cb28.f4273i : null;
                                }
                                int iM2384e5 = c1259cb26.m2384e();
                                int i41 = i3 + 1;
                                int iM2384e6 = c1259cbArr13[i41].m2384e();
                                if (c2454rb30 != null) {
                                    c1259cb2 = c2454rb30.f8596Q[i3];
                                    c0256Fy3 = c1259cb2.f4273i;
                                } else {
                                    c1259cb2 = c2454rb17.f8596Q[i41].f4270f;
                                    c0256Fy3 = c1259cb2 != null ? c1259cb2.f4273i : null;
                                }
                                C0256Fy c0256Fy18 = c1259cbArr13[i41].f4273i;
                                if (c1259cb2 != null) {
                                    iM2384e6 += c1259cb2.m2384e();
                                }
                                int iM2384e7 = c2454rb29.f8596Q[i41].m2384e() + iM2384e5;
                                if (c0256Fy16 == null || c0256Fy17 == null || c0256Fy3 == null || c0256Fy18 == null) {
                                    c2454rb5 = c2454rb30;
                                    c1259cbArr2 = c1259cbArr;
                                    c2454rb6 = c2454rb29;
                                    i7 = 8;
                                } else {
                                    if (c2454rb28 == c2454rb18) {
                                        iM2384e7 = c2454rb18.f8596Q[i3].m2384e();
                                    }
                                    if (c2454rb28 == c2454rb2) {
                                        iM2384e6 = c2454rb2.f8596Q[i41].m2384e();
                                    }
                                    c2454rb5 = c2454rb30;
                                    c1259cbArr2 = c1259cbArr;
                                    c2454rb6 = c2454rb29;
                                    i7 = 8;
                                    c2244mo.m4563b(c0256Fy16, c0256Fy17, iM2384e7, 0.5f, c0256Fy3, c0256Fy18, iM2384e6, z19 ? 8 : 5);
                                }
                            } else {
                                c2454rb5 = c2454rb30;
                                c1259cbArr2 = c1259cbArr;
                                c2454rb6 = c2454rb29;
                                i7 = i6;
                            }
                            if (c2454rb28.f8619g0 != i7) {
                                c2454rb6 = c2454rb28;
                            }
                            c2454rb28 = c2454rb5;
                            c2454rb29 = c2454rb6;
                            c1259cbArr = c1259cbArr2;
                        }
                    }
                } else {
                    C1259cb c1259cb29 = c1259cbArr[i3];
                    int i42 = i3 + 1;
                    C1259cb c1259cb30 = c2454rb17.f8596Q[i42];
                    C1259cb c1259cb31 = c1259cb29.f4270f;
                    C0256Fy c0256Fy19 = c1259cb31 != null ? c1259cb31.f4273i : null;
                    C1259cb c1259cb32 = c1259cb30.f4270f;
                    C0256Fy c0256Fy20 = c1259cb32 != null ? c1259cb32.f4273i : null;
                    C1259cb c1259cb33 = c2454rb18.f8596Q[i3];
                    if (c2454rb19 != null) {
                        c1259cb30 = c2454rb19.f8596Q[i42];
                    }
                    if (c0256Fy19 == null || c0256Fy20 == null) {
                        c2454rb2 = c2454rb19;
                    } else {
                        float f12 = i == 0 ? c2454rb20.f8613d0 : c2454rb20.f8615e0;
                        int iM2384e8 = c1259cb33.m2384e();
                        int iM2384e9 = c1259cb30.m2384e();
                        C0256Fy c0256Fy21 = c1259cb33.f4273i;
                        C0256Fy c0256Fy22 = c1259cb30.f4273i;
                        C0256Fy c0256Fy23 = c0256Fy19;
                        c2454rb2 = c2454rb19;
                        c2244mo3.m4563b(c0256Fy21, c0256Fy23, iM2384e8, f12, c0256Fy20, c0256Fy22, iM2384e9, 7);
                    }
                }
                c2244mo2 = c2244mo;
                if (z2) {
                    C1259cb[] c1259cbArr112 = c2454rb18.f8596Q;
                    C1259cb c1259cb212 = c1259cbArr112[i3];
                    if (c2454rb2 == null) {
                    }
                    C1259cb[] c1259cbArr122 = c2454rb2.f8596Q;
                    int i392 = i3 + 1;
                    C1259cb c1259cb222 = c1259cbArr122[i392];
                    C1259cb c1259cb232 = c1259cb212.f4270f;
                    if (c1259cb232 != null) {
                    }
                    C1259cb c1259cb242 = c1259cb222.f4270f;
                    if (c1259cb242 != null) {
                    }
                    if (c2454rb17 != c2454rb2) {
                    }
                    if (c2454rb18 == c2454rb2) {
                    }
                    if (c0256Fy4 != null) {
                    }
                } else {
                    C1259cb[] c1259cbArr1122 = c2454rb18.f8596Q;
                    C1259cb c1259cb2122 = c1259cbArr1122[i3];
                    if (c2454rb2 == null) {
                    }
                    C1259cb[] c1259cbArr1222 = c2454rb2.f8596Q;
                    int i3922 = i3 + 1;
                    C1259cb c1259cb2222 = c1259cbArr1222[i3922];
                    C1259cb c1259cb2322 = c1259cb2122.f4270f;
                    if (c1259cb2322 != null) {
                    }
                    C1259cb c1259cb2422 = c1259cb2222.f4270f;
                    if (c1259cb2422 != null) {
                    }
                    if (c2454rb17 != c2454rb2) {
                    }
                    if (c2454rb18 == c2454rb2) {
                    }
                    if (c0256Fy4 != null) {
                    }
                }
            } else {
                i5 = i14;
            }
            i15 = i4 + 1;
            c2497sb2 = c2497sb;
            c2244mo3 = c2244mo;
            arrayList3 = arrayList;
            i14 = i5;
        }
    }

    /* JADX INFO: renamed from: G */
    public static boolean m2682G(C0552Mt[] c0552MtArr, C0552Mt[] c0552MtArr2) {
        if (c0552MtArr == null || c0552MtArr2 == null || c0552MtArr.length != c0552MtArr2.length) {
            return false;
        }
        for (int i = 0; i < c0552MtArr.length; i++) {
            C0552Mt c0552Mt = c0552MtArr[i];
            char c = c0552Mt.f1820a;
            C0552Mt c0552Mt2 = c0552MtArr2[i];
            if (c != c0552Mt2.f1820a || c0552Mt.f1821b.length != c0552Mt2.f1821b.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: H */
    public static byte[] m2683H(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* JADX INFO: renamed from: I */
    public static float[] m2684I(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX INFO: renamed from: J */
    public static C2648vx m2685J(Object obj) {
        C2648vx c2648vx = new C2648vx();
        if (obj instanceof Class) {
            c2648vx.f9163b = (Class) obj;
            return c2648vx;
        }
        c2648vx.f9164c = obj;
        c2648vx.f9163b = obj != null ? obj.getClass() : null;
        return c2648vx;
    }

    /* JADX INFO: renamed from: K */
    public static byte[] m2686K(C0192Ed[] c0192EdArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (C0192Ed c0192Ed : c0192EdArr) {
            length += ((((c0192Ed.f586g * 2) + 7) & (-8)) / 8) + (c0192Ed.f584e * 2) + m2693S(c0192Ed.f580a, c0192Ed.f581b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c0192Ed.f585f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, AbstractC0148Dc.f395l)) {
            int length2 = c0192EdArr.length;
            while (i < length2) {
                C0192Ed c0192Ed2 = c0192EdArr[i];
                m2722v0(byteArrayOutputStream, c0192Ed2, m2693S(c0192Ed2.f580a, c0192Ed2.f581b, bArr));
                m2721u0(byteArrayOutputStream, c0192Ed2);
                i++;
            }
        } else {
            for (C0192Ed c0192Ed3 : c0192EdArr) {
                m2722v0(byteArrayOutputStream, c0192Ed3, m2693S(c0192Ed3.f580a, c0192Ed3.f581b, bArr));
            }
            int length3 = c0192EdArr.length;
            while (i < length3) {
                m2721u0(byteArrayOutputStream, c0192EdArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX INFO: renamed from: L */
    public static AbstractC0828TB m2687L(int i) {
        if (i != 0 && i == 1) {
            return new C2275nc();
        }
        return new C0684Pw();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /* JADX INFO: renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0552Mt[] m2688M(String str) {
        int i;
        String strTrim;
        float[] fArrM2684I;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char cCharAt = str.charAt(i4);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    }
                    i4++;
                }
                if (cCharAt == 'e' || cCharAt == 'E') {
                    i4++;
                } else {
                    strTrim = str.substring(i3, i4).trim();
                    if (!strTrim.isEmpty()) {
                        if (strTrim.charAt(i2) == 'z' || strTrim.charAt(i2) == 'Z') {
                            fArrM2684I = new float[i2];
                        } else {
                            try {
                                float[] fArr = new float[strTrim.length()];
                                int length = strTrim.length();
                                int i5 = i2;
                                int i6 = 1;
                                while (i6 < length) {
                                    int i7 = i2;
                                    int i8 = i7;
                                    int i9 = i8;
                                    int i10 = i9;
                                    for (int i11 = i6; i11 < strTrim.length(); i11++) {
                                        char cCharAt2 = strTrim.charAt(i11);
                                        if (cCharAt2 == ' ') {
                                            i7 = 0;
                                            i9 = 1;
                                            if (i9 != 0) {
                                            }
                                        } else {
                                            if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i11 != i6 && i7 == 0) {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        i7 = 0;
                                                        break;
                                                    case '.':
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                        } else {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 != 0) {
                                            }
                                        }
                                        if (i6 < i11) {
                                            fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                            i5++;
                                        }
                                        i6 = i10 == 0 ? i11 : i11 + 1;
                                        i2 = 0;
                                    }
                                    if (i6 < i11) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    i2 = 0;
                                }
                                fArrM2684I = m2684I(fArr, i5);
                                i2 = 0;
                            } catch (NumberFormatException e) {
                                throw new RuntimeException(AbstractC2374ph.m4814k("error in parsing \"", strTrim, "\""), e);
                            }
                        }
                        arrayList.add(new C0552Mt(strTrim.charAt(i2), fArrM2684I));
                    }
                    i3 = i4;
                    i4++;
                    i2 = 0;
                }
            }
            strTrim = str.substring(i3, i4).trim();
            if (!strTrim.isEmpty()) {
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new C0552Mt(str.charAt(i3), new float[0]));
        }
        return (C0552Mt[]) arrayList.toArray(new C0552Mt[i]);
    }

    /* JADX INFO: renamed from: N */
    public static Bitmap m2689N(InputStream inputStream, BitmapFactory.Options options, C2656w4 c2656w4) throws Throwable {
        boolean zM5217y;
        int i = Build.VERSION.SDK_INT;
        Bitmap bitmapM2712l0 = null;
        if (i == 34) {
            if ((i == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) AbstractC1293cr.f4726b.get()).booleanValue() : false) {
                try {
                    zM5217y = c2656w4.m5217y();
                } catch (IOException unused) {
                    zM5217y = false;
                }
                if (zM5217y) {
                    Bitmap.Config config = options.inPreferredConfig;
                    Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                    AbstractC0714Qj.m1484f("", config == config2);
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                        if (bitmapDecodeStream == null) {
                            if (bitmapDecodeStream != null) {
                            }
                            options.inPreferredConfig = config2;
                            return bitmapM2712l0;
                        }
                        try {
                            bitmapM2712l0 = m2712l0(bitmapDecodeStream);
                        } catch (Throwable th) {
                            th = th;
                            bitmapM2712l0 = bitmapDecodeStream;
                            if (bitmapM2712l0 != null) {
                                bitmapM2712l0.recycle();
                            }
                            options.inPreferredConfig = Bitmap.Config.HARDWARE;
                            throw th;
                        }
                        bitmapDecodeStream.recycle();
                        options.inPreferredConfig = config2;
                        return bitmapM2712l0;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    /* JADX INFO: renamed from: P */
    public static C0552Mt[] m2690P(C0552Mt[] c0552MtArr) {
        C0552Mt[] c0552MtArr2 = new C0552Mt[c0552MtArr.length];
        for (int i = 0; i < c0552MtArr.length; i++) {
            c0552MtArr2[i] = new C0552Mt(c0552MtArr[i]);
        }
        return c0552MtArr2;
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m2691Q(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = m2691Q(file2) && z;
        }
        return z;
    }

    /* JADX INFO: renamed from: R */
    public static C0096C9 m2692R(DexKitBridge dexKitBridge, C1117a c1117a) {
        int iM2033b = c1117a.m2033b(4);
        int i = iM2033b != 0 ? c1117a.f3526b.getInt(iM2033b + c1117a.f3525a) : 0;
        int iM2033b2 = c1117a.m2033b(6);
        int i2 = iM2033b2 != 0 ? c1117a.f3526b.getInt(iM2033b2 + c1117a.f3525a) : 0;
        int iM2033b3 = c1117a.m2033b(8);
        if (iM2033b3 != 0) {
            c1117a.m2035d(iM2033b3 + c1117a.f3525a);
        }
        int iM2033b4 = c1117a.m2033b(10);
        int i3 = iM2033b4 != 0 ? c1117a.f3526b.getInt(iM2033b4 + c1117a.f3525a) : 0;
        int iM2033b5 = c1117a.m2033b(12);
        String strM2035d = iM2033b5 != 0 ? c1117a.m2035d(iM2033b5 + c1117a.f3525a) : null;
        if (strM2035d == null) {
            strM2035d = "";
        }
        String str = strM2035d;
        int iM2033b6 = c1117a.m2033b(14);
        int i4 = iM2033b6 != 0 ? c1117a.f3526b.getInt(iM2033b6 + c1117a.f3525a) : 0;
        Integer numValueOf = i4 != -1 ? Integer.valueOf(i4) : null;
        ArrayList arrayList = new ArrayList();
        int iM2033b7 = c1117a.m2033b(16);
        int iM2037f = iM2033b7 != 0 ? c1117a.m2037f(iM2033b7) : 0;
        for (int i5 = 0; i5 < iM2037f; i5++) {
            int iM2033b8 = c1117a.m2033b(16);
            arrayList.add(Integer.valueOf(iM2033b8 != 0 ? c1117a.f3526b.getInt((i5 * 4) + c1117a.m2036e(iM2033b8)) : 0));
        }
        ArrayList arrayList2 = new ArrayList();
        int iM2033b9 = c1117a.m2033b(18);
        int iM2037f2 = iM2033b9 != 0 ? c1117a.m2037f(iM2033b9) : 0;
        for (int i6 = 0; i6 < iM2037f2; i6++) {
            int iM2033b10 = c1117a.m2033b(18);
            arrayList2.add(Integer.valueOf(iM2033b10 != 0 ? c1117a.f3526b.getInt((i6 * 4) + c1117a.m2036e(iM2033b10)) : 0));
        }
        ArrayList arrayList3 = new ArrayList();
        int iM2033b11 = c1117a.m2033b(20);
        int iM2037f3 = iM2033b11 != 0 ? c1117a.m2037f(iM2033b11) : 0;
        for (int i7 = 0; i7 < iM2037f3; i7++) {
            int iM2033b12 = c1117a.m2033b(20);
            arrayList3.add(Integer.valueOf(iM2033b12 != 0 ? c1117a.f3526b.getInt((i7 * 4) + c1117a.m2036e(iM2033b12)) : 0));
        }
        return new C0096C9(dexKitBridge, i, i2, i3, str, numValueOf, arrayList, arrayList2, arrayList3);
    }

    /* JADX INFO: renamed from: S */
    public static String m2693S(String str, String str2, byte[] bArr) {
        byte[] bArr2 = AbstractC0148Dc.f396m;
        byte[] bArr3 = AbstractC0148Dc.f397n;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return AbstractC0213Ey.m410h(sb, (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: T */
    public static C1420fn m2694T(String str) throws GeneralSecurityException {
        Map mapUnmodifiableMap;
        AtomicReference atomicReference = AbstractC0640Ov.f2045a;
        synchronized (AbstractC0640Ov.class) {
            mapUnmodifiableMap = Collections.unmodifiableMap(AbstractC0640Ov.f2048d);
        }
        C1420fn c1420fn = (C1420fn) mapUnmodifiableMap.get(str);
        if (c1420fn != null) {
            return c1420fn;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }

    /* JADX INFO: renamed from: U */
    public static Drawable m2695U(Context context, int i) {
        return C2776yw.m5347b().m5350c(context, i);
    }

    /* JADX INFO: renamed from: V */
    public static int m2696V(List list, InputStream inputStream, C2812zp c2812zp) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C1340dv(inputStream, c2812zp);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int iMo567b = ((InterfaceC1331dl) list.get(i)).mo567b(inputStream, c2812zp);
                if (iMo567b != -1) {
                    return iMo567b;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: W */
    public static ImageHeaderParser$ImageType m2697W(List list, InputStream inputStream, C2812zp c2812zp) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C1340dv(inputStream, c2812zp);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo571f = ((InterfaceC1331dl) list.get(i)).mo571f(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeMo571f != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeMo571f;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: X */
    public static ImageHeaderParser$ImageType m2698X(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo566a = ((InterfaceC1331dl) list.get(i)).mo566a(byteBuffer);
                AtomicReference atomicReference = AbstractC2529t6.f8828a;
                if (imageHeaderParser$ImageTypeMo566a != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeMo566a;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = AbstractC2529t6.f8828a;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m2699Y(Application application) throws PackageManager.NameNotFoundException {
        AbstractC0295Gu.m625r(-579038900910133L);
        ApplicationInfo applicationInfo = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128);
        AbstractC0295Gu.m625r(-579090440517685L);
        Bundle bundle = applicationInfo.metaData;
        String string = bundle != null ? bundle.getString(AbstractC0295Gu.m625r(-577544252291125L)) : null;
        return string == null || string.length() == 0;
    }

    /* JADX INFO: renamed from: Z */
    public static InterfaceC1137ac m2700Z(InterfaceC1137ac interfaceC1137ac, InterfaceC1137ac interfaceC1137ac2) {
        return interfaceC1137ac2 == C0366If.f1247a ? interfaceC1137ac : (InterfaceC1137ac) interfaceC1137ac2.mo25q(interfaceC1137ac, new C0309H7(6));
    }

    /* JADX INFO: renamed from: a0 */
    public static byte[] m2701a0(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new IllegalStateException(AbstractC2374ph.m4812i(i, "Not enough bytes to read: "));
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: b0 */
    public static int[] m2702b0(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM2709i0 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM2709i0 += (int) m2709i0(byteArrayInputStream, 2);
            iArr[i2] = iM2709i0;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: c0 */
    public static byte[] m2703c0(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static C0192Ed[] m2704d0(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0192Ed[] c0192EdArr) throws IOException {
        byte[] bArr3 = AbstractC0148Dc.f398o;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, AbstractC0148Dc.f399p)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM2709i0 = (int) m2709i0(fileInputStream, 2);
            byte[] bArrM2703c0 = m2703c0(fileInputStream, (int) m2709i0(fileInputStream, 4), (int) m2709i0(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM2703c0);
            try {
                C0192Ed[] c0192EdArrM2706f0 = m2706f0(byteArrayInputStream, bArr2, iM2709i0, c0192EdArr);
                byteArrayInputStream.close();
                return c0192EdArrM2706f0;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(AbstractC0148Dc.f393j, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2709i02 = (int) m2709i0(fileInputStream, 1);
        byte[] bArrM2703c02 = m2703c0(fileInputStream, (int) m2709i0(fileInputStream, 4), (int) m2709i0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM2703c02);
        try {
            C0192Ed[] c0192EdArrM2705e0 = m2705e0(byteArrayInputStream2, iM2709i02, c0192EdArr);
            byteArrayInputStream2.close();
            return c0192EdArrM2705e0;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static C0192Ed[] m2705e0(ByteArrayInputStream byteArrayInputStream, int i, C0192Ed[] c0192EdArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0192Ed[0];
        }
        if (i != c0192EdArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM2709i0 = (int) m2709i0(byteArrayInputStream, 2);
            iArr[i2] = (int) m2709i0(byteArrayInputStream, 2);
            strArr[i2] = new String(m2701a0(byteArrayInputStream, iM2709i0), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C0192Ed c0192Ed = c0192EdArr[i3];
            if (!c0192Ed.f581b.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            c0192Ed.f584e = i4;
            c0192Ed.f587h = m2702b0(byteArrayInputStream, i4);
        }
        return c0192EdArr;
    }

    /* JADX INFO: renamed from: f0 */
    public static C0192Ed[] m2706f0(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C0192Ed[] c0192EdArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C0192Ed[0];
        }
        if (i != c0192EdArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            m2709i0(byteArrayInputStream, 2);
            String str = new String(m2701a0(byteArrayInputStream, (int) m2709i0(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM2709i0 = m2709i0(byteArrayInputStream, 4);
            int iM2709i0 = (int) m2709i0(byteArrayInputStream, 2);
            C0192Ed c0192Ed = null;
            if (c0192EdArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i3 = 0;
                while (true) {
                    if (i3 >= c0192EdArr.length) {
                        break;
                    }
                    if (c0192EdArr[i3].f581b.equals(strSubstring)) {
                        c0192Ed = c0192EdArr[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (c0192Ed == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c0192Ed.f583d = jM2709i0;
            int[] iArrM2702b0 = m2702b0(byteArrayInputStream, iM2709i0);
            if (Arrays.equals(bArr, AbstractC0148Dc.f397n)) {
                c0192Ed.f584e = iM2709i0;
                c0192Ed.f587h = iArrM2702b0;
            }
        }
        return c0192EdArr;
    }

    /* JADX INFO: renamed from: g0 */
    public static C0192Ed[] m2707g0(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, AbstractC0148Dc.f394k)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM2709i0 = (int) m2709i0(fileInputStream, 1);
        byte[] bArrM2703c0 = m2703c0(fileInputStream, (int) m2709i0(fileInputStream, 4), (int) m2709i0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM2703c0);
        try {
            C0192Ed[] c0192EdArrM2710j0 = m2710j0(byteArrayInputStream, str, iM2709i0);
            byteArrayInputStream.close();
            return c0192EdArrM2710j0;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static final String m2708h0(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: i0 */
    public static long m2709i0(InputStream inputStream, int i) throws IOException {
        byte[] bArrM2701a0 = m2701a0(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM2701a0[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: j0 */
    public static C0192Ed[] m2710j0(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C0192Ed[0];
        }
        C0192Ed[] c0192EdArr = new C0192Ed[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iM2709i0 = (int) m2709i0(byteArrayInputStream, 2);
            int iM2709i02 = (int) m2709i0(byteArrayInputStream, 2);
            c0192EdArr[i3] = new C0192Ed(str, new String(m2701a0(byteArrayInputStream, iM2709i0), StandardCharsets.UTF_8), m2709i0(byteArrayInputStream, 4), iM2709i02, (int) m2709i0(byteArrayInputStream, 4), (int) m2709i0(byteArrayInputStream, 4), new int[iM2709i02], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            C0192Ed c0192Ed = c0192EdArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = c0192Ed.f585f;
            int i6 = c0192Ed.f586g;
            TreeMap treeMap = c0192Ed.f588i;
            int i7 = iAvailable - i5;
            int iM2709i03 = i2;
            while (byteArrayInputStream.available() > i7) {
                iM2709i03 += (int) m2709i0(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM2709i03), 1);
                int iM2709i04 = (int) m2709i0(byteArrayInputStream, 2);
                while (iM2709i04 > 0) {
                    m2709i0(byteArrayInputStream, 2);
                    int iM2709i05 = (int) m2709i0(byteArrayInputStream, 1);
                    if (iM2709i05 != 6 && iM2709i05 != 7) {
                        while (iM2709i05 > 0) {
                            m2709i0(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iM2709i06 = (int) m2709i0(byteArrayInputStream, 1); iM2709i06 > 0; iM2709i06--) {
                                m2709i0(byteArrayInputStream, 2);
                            }
                            iM2709i05--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iM2709i04--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c0192Ed.f587h = m2702b0(byteArrayInputStream, c0192Ed.f584e);
            BitSet bitSetValueOf = BitSet.valueOf(m2701a0(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return c0192EdArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0088 A[Catch: all -> 0x006b, DONT_GENERATE, TryCatch #2 {all -> 0x006b, blocks: (B:20:0x004e, B:22:0x0058, B:24:0x005e, B:37:0x008b, B:27:0x006d, B:29:0x0077, B:34:0x0082, B:36:0x0088, B:42:0x0098, B:45:0x00a1, B:44:0x009e, B:32:0x007d), top: B:61:0x004e, inners: #0 }] */
    /* JADX INFO: renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2711k0(InterfaceC0190Eb interfaceC0190Eb, Object obj) throws C1324de {
        InterfaceC1332dm interfaceC1332dm;
        if (!(interfaceC0190Eb instanceof C1367ee)) {
            interfaceC0190Eb.mo264f(obj);
            return;
        }
        C1367ee c1367ee = (C1367ee) interfaceC0190Eb;
        AbstractC1217bc abstractC1217bc = c1367ee.f4894d;
        AbstractC0233Fb abstractC0233Fb = c1367ee.f4895e;
        InterfaceC1137ac interfaceC1137ac = abstractC0233Fb.f731b;
        Throwable thM726a = C0340Hw.m726a(obj);
        Object c0189Ea = thM726a == null ? obj : new C0189Ea(thM726a, false);
        try {
            if (abstractC1217bc.mo2333u(interfaceC1137ac)) {
                c1367ee.f4896f = c0189Ea;
                c1367ee.f5157c = 1;
                m2713m0(abstractC1217bc, interfaceC1137ac, c1367ee);
                return;
            }
            AbstractC2588ug abstractC2588ugM2050a = AbstractC1129aB.m2050a();
            if (abstractC2588ugM2050a.f8957b >= 4294967296L) {
                c1367ee.f4896f = c0189Ea;
                c1367ee.f5157c = 1;
                C0134D4 c0134d4 = abstractC2588ugM2050a.f8959d;
                if (c0134d4 == null) {
                    c0134d4 = new C0134D4();
                    abstractC2588ugM2050a.f8959d = c0134d4;
                }
                c0134d4.addLast(c1367ee);
                return;
            }
            abstractC2588ugM2050a.m5096y(true);
            try {
                interfaceC1332dm = (InterfaceC1332dm) interfaceC1137ac.mo24m(C1456gf.f5162f);
            } finally {
                try {
                } finally {
                }
            }
            if (interfaceC1332dm == null || interfaceC1332dm.mo1745d()) {
                Object objM604E = AbstractC0295Gu.m604E(interfaceC1137ac, c1367ee.f4897g);
                C2664wC c2664wCM289w = objM604E != AbstractC0295Gu.f1005j ? AbstractC0148Dc.m289w(abstractC0233Fb, interfaceC1137ac, objM604E) : null;
                try {
                    abstractC0233Fb.mo264f(obj);
                } finally {
                    if (c2664wCM289w == null || c2664wCM289w.m5231P()) {
                        AbstractC0295Gu.m601B(interfaceC1137ac, objM604E);
                    }
                }
            }
            c1367ee.mo264f(new C0297Gw(interfaceC1332dm.mo1748p()));
            while (abstractC2588ugM2050a.m5097z()) {
            }
        } catch (Throwable th) {
            throw new C1324de(th, abstractC1217bc, interfaceC1137ac);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static Bitmap m2712l0(Bitmap bitmap) {
        Gainmap gainmap = bitmap.getGainmap();
        if (gainmap != null) {
            Bitmap.Config config = gainmap.getGainmapContents().getConfig();
            Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
            if (config == config2) {
                ColorMatrixColorFilter colorMatrixColorFilter = AbstractC0542Mj.f1759a;
                Bitmap gainmapContents = gainmap.getGainmapContents();
                if (gainmapContents.getConfig() == config2) {
                    AbstractC0714Qj.m1484f("", gainmapContents.getConfig() == config2);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gainmapContents.getWidth(), gainmapContents.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setColorFilter(AbstractC0542Mj.f1759a);
                    canvas.drawBitmap(gainmapContents, 0.0f, 0.0f, paint);
                    canvas.setBitmap(null);
                    Gainmap gainmapM972j = AbstractC0499Lj.m972j(bitmapCreateBitmap);
                    float[] ratioMin = gainmap.getRatioMin();
                    gainmapM972j.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                    float[] ratioMax = gainmap.getRatioMax();
                    gainmapM972j.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                    float[] gamma = gainmap.getGamma();
                    gainmapM972j.setGamma(gamma[0], gamma[1], gamma[2]);
                    float[] epsilonSdr = gainmap.getEpsilonSdr();
                    gainmapM972j.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                    float[] epsilonHdr = gainmap.getEpsilonHdr();
                    gainmapM972j.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                    gainmapM972j.setDisplayRatioForFullHdr(gainmap.getDisplayRatioForFullHdr());
                    gainmapM972j.setMinDisplayRatioForHdrTransition(gainmap.getMinDisplayRatioForHdrTransition());
                    gainmap = gainmapM972j;
                }
                bitmap.setGainmap(gainmap);
            }
        }
        return bitmap.copy(Bitmap.Config.HARDWARE, false);
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m2713m0(AbstractC1217bc abstractC1217bc, InterfaceC1137ac interfaceC1137ac, Runnable runnable) throws C1324de {
        try {
            abstractC1217bc.mo1781t(interfaceC1137ac, runnable);
        } catch (Throwable th) {
            throw new C1324de(th, abstractC1217bc, interfaceC1137ac);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static void m2714n0(View view, C1021Xq c1021Xq) {
        C2101jf c2101jf = c1021Xq.f3241b.f2904c;
        if (c2101jf == null || !c2101jf.f7390a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        C0935Vq c0935Vq = c1021Xq.f3241b;
        if (c0935Vq.f2914m != elevation) {
            c0935Vq.f2914m = elevation;
            c1021Xq.m1933s();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m2715o0(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    /* JADX INFO: renamed from: p0 */
    public static void m2716p0(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    /* JADX INFO: renamed from: q0 */
    public static void m2717q0(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* JADX INFO: renamed from: r0 */
    public static Class m2718r0(String str) {
        AbstractC0295Gu.m625r(-579361023457333L);
        Class<?> clsLoadClass = AbstractC1450gG.f5069c.loadClass(str);
        AbstractC0295Gu.m625r(-579391088228405L);
        return clsLoadClass;
    }

    /* JADX INFO: renamed from: s0 */
    public static final C1402fC m2719s0(String str) {
        int i;
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC0585Nj.m1139g(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int iDivideUnsigned = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                if (iDivideUnsigned != 119304647) {
                    return null;
                }
                iDivideUnsigned = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                    return null;
                }
            }
            int i3 = i2 * 10;
            int i4 = iDigit + i3;
            if (Integer.compareUnsigned(i4, i3) < 0) {
                return null;
            }
            i++;
            i2 = i4;
        }
        return new C1402fC(i2);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: t0 */
    public static boolean m2720t0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0192Ed[] c0192EdArr) throws IOException {
        long j;
        int length;
        byte[] bArr2 = AbstractC0148Dc.f397n;
        byte[] bArr3 = AbstractC0148Dc.f396m;
        byte[] bArr4 = AbstractC0148Dc.f393j;
        int i = 0;
        if (Arrays.equals(bArr, bArr4)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                m2726z0(byteArrayOutputStream2, c0192EdArr.length);
                int i2 = 2;
                int i3 = 2;
                for (C0192Ed c0192Ed : c0192EdArr) {
                    m2725y0(byteArrayOutputStream2, c0192Ed.f582c, 4);
                    m2725y0(byteArrayOutputStream2, c0192Ed.f583d, 4);
                    m2725y0(byteArrayOutputStream2, c0192Ed.f586g, 4);
                    String strM2693S = m2693S(c0192Ed.f580a, c0192Ed.f581b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = strM2693S.getBytes(charset).length;
                    m2726z0(byteArrayOutputStream2, length2);
                    i3 = i3 + 14 + length2;
                    byteArrayOutputStream2.write(strM2693S.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i3 != byteArray.length) {
                    throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
                }
                C0789SF c0789sf = new C0789SF(1, byteArray, false);
                byteArrayOutputStream2.close();
                arrayList.add(c0789sf);
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i4 = 0;
                int i5 = 0;
                while (i4 < c0192EdArr.length) {
                    try {
                        C0192Ed c0192Ed2 = c0192EdArr[i4];
                        m2726z0(byteArrayOutputStream3, i4);
                        m2726z0(byteArrayOutputStream3, c0192Ed2.f584e);
                        i5 = i5 + 4 + (c0192Ed2.f584e * i2);
                        int[] iArr = c0192Ed2.f587h;
                        int length3 = iArr.length;
                        int i6 = i;
                        int i7 = i2;
                        int i8 = i6;
                        while (i8 < length3) {
                            int i9 = iArr[i8];
                            m2726z0(byteArrayOutputStream3, i9 - i6);
                            i8++;
                            i6 = i9;
                        }
                        i4++;
                        i2 = i7;
                        i = 0;
                    } catch (Throwable th) {
                    }
                }
                byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                if (i5 != byteArray2.length) {
                    throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray2.length);
                }
                C0789SF c0789sf2 = new C0789SF(3, byteArray2, true);
                byteArrayOutputStream3.close();
                arrayList.add(c0789sf2);
                byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i10 = 0;
                int i11 = 0;
                while (i10 < c0192EdArr.length) {
                    try {
                        C0192Ed c0192Ed3 = c0192EdArr[i10];
                        Iterator it = c0192Ed3.f588i.entrySet().iterator();
                        int iIntValue = 0;
                        while (it.hasNext()) {
                            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                        }
                        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m2723w0(byteArrayOutputStream4, iIntValue, c0192Ed3);
                            byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            byteArrayOutputStream4 = new ByteArrayOutputStream();
                            try {
                                m2724x0(byteArrayOutputStream4, c0192Ed3);
                                byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                m2726z0(byteArrayOutputStream3, i10);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i12 = i11 + 6;
                                int i13 = i10;
                                m2725y0(byteArrayOutputStream3, length4, 4);
                                m2726z0(byteArrayOutputStream3, iIntValue);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                i11 = i12 + length4;
                                i10 = i13 + 1;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                        try {
                            byteArrayOutputStream3.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
                byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                if (i11 != byteArray5.length) {
                    throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
                }
                C0789SF c0789sf3 = new C0789SF(4, byteArray5, true);
                byteArrayOutputStream3.close();
                arrayList.add(c0789sf3);
                long j2 = 4;
                long size = j2 + j2 + 4 + ((long) (arrayList.size() * 16));
                m2725y0(byteArrayOutputStream, arrayList.size(), 4);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    C0789SF c0789sf4 = (C0789SF) arrayList.get(i14);
                    int i15 = c0789sf4.f2486a;
                    byte[] bArr5 = c0789sf4.f2487b;
                    if (i15 == 1) {
                        j = 0;
                    } else if (i15 == 2) {
                        j = 1;
                    } else if (i15 == 3) {
                        j = 2;
                    } else if (i15 == 4) {
                        j = 3;
                    } else {
                        if (i15 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                    m2725y0(byteArrayOutputStream, j, 4);
                    m2725y0(byteArrayOutputStream, size, 4);
                    if (c0789sf4.f2488c) {
                        long length5 = bArr5.length;
                        byte[] bArrM2683H = m2683H(bArr5);
                        arrayList2.add(bArrM2683H);
                        m2725y0(byteArrayOutputStream, bArrM2683H.length, 4);
                        m2725y0(byteArrayOutputStream, length5, 4);
                        length = bArrM2683H.length;
                    } else {
                        arrayList2.add(bArr5);
                        m2725y0(byteArrayOutputStream, bArr5.length, 4);
                        m2725y0(byteArrayOutputStream, 0L, 4);
                        length = bArr5.length;
                    }
                    size += (long) length;
                }
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    byteArrayOutputStream.write((byte[]) arrayList2.get(i16));
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } else {
            byte[] bArr6 = AbstractC0148Dc.f394k;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrM2686K = m2686K(c0192EdArr, bArr6);
                m2725y0(byteArrayOutputStream, c0192EdArr.length, 1);
                m2725y0(byteArrayOutputStream, bArrM2686K.length, 4);
                byte[] bArrM2683H2 = m2683H(bArrM2686K);
                m2725y0(byteArrayOutputStream, bArrM2683H2.length, 4);
                byteArrayOutputStream.write(bArrM2683H2);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                m2725y0(byteArrayOutputStream, c0192EdArr.length, 1);
                for (C0192Ed c0192Ed4 : c0192EdArr) {
                    int size2 = c0192Ed4.f588i.size() * 4;
                    String strM2693S2 = m2693S(c0192Ed4.f580a, c0192Ed4.f581b, bArr3);
                    Charset charset2 = StandardCharsets.UTF_8;
                    m2726z0(byteArrayOutputStream, strM2693S2.getBytes(charset2).length);
                    m2726z0(byteArrayOutputStream, c0192Ed4.f587h.length);
                    m2725y0(byteArrayOutputStream, size2, 4);
                    m2725y0(byteArrayOutputStream, c0192Ed4.f582c, 4);
                    byteArrayOutputStream.write(strM2693S2.getBytes(charset2));
                    Iterator it2 = c0192Ed4.f588i.keySet().iterator();
                    while (it2.hasNext()) {
                        m2726z0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                        m2726z0(byteArrayOutputStream, 0);
                    }
                    for (int i17 : c0192Ed4.f587h) {
                        m2726z0(byteArrayOutputStream, i17);
                    }
                }
            } else {
                byte[] bArr7 = AbstractC0148Dc.f395l;
                if (Arrays.equals(bArr, bArr7)) {
                    byte[] bArrM2686K2 = m2686K(c0192EdArr, bArr7);
                    m2725y0(byteArrayOutputStream, c0192EdArr.length, 1);
                    m2725y0(byteArrayOutputStream, bArrM2686K2.length, 4);
                    byte[] bArrM2683H3 = m2683H(bArrM2686K2);
                    m2725y0(byteArrayOutputStream, bArrM2683H3.length, 4);
                    byteArrayOutputStream.write(bArrM2683H3);
                    return true;
                }
                if (!Arrays.equals(bArr, bArr2)) {
                    return false;
                }
                m2726z0(byteArrayOutputStream, c0192EdArr.length);
                for (C0192Ed c0192Ed5 : c0192EdArr) {
                    String str = c0192Ed5.f580a;
                    TreeMap treeMap = c0192Ed5.f588i;
                    String strM2693S3 = m2693S(str, c0192Ed5.f581b, bArr2);
                    Charset charset3 = StandardCharsets.UTF_8;
                    m2726z0(byteArrayOutputStream, strM2693S3.getBytes(charset3).length);
                    m2726z0(byteArrayOutputStream, treeMap.size());
                    m2726z0(byteArrayOutputStream, c0192Ed5.f587h.length);
                    m2725y0(byteArrayOutputStream, c0192Ed5.f582c, 4);
                    byteArrayOutputStream.write(strM2693S3.getBytes(charset3));
                    Iterator it3 = treeMap.keySet().iterator();
                    while (it3.hasNext()) {
                        m2726z0(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                    }
                    for (int i18 : c0192Ed5.f587h) {
                        m2726z0(byteArrayOutputStream, i18);
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: u0 */
    public static void m2721u0(ByteArrayOutputStream byteArrayOutputStream, C0192Ed c0192Ed) throws IOException {
        m2724x0(byteArrayOutputStream, c0192Ed);
        int i = c0192Ed.f586g;
        int[] iArr = c0192Ed.f587h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            m2726z0(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0192Ed.f588i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: v0 */
    public static void m2722v0(ByteArrayOutputStream byteArrayOutputStream, C0192Ed c0192Ed, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        m2726z0(byteArrayOutputStream, str.getBytes(charset).length);
        m2726z0(byteArrayOutputStream, c0192Ed.f584e);
        m2725y0(byteArrayOutputStream, c0192Ed.f585f, 4);
        m2725y0(byteArrayOutputStream, c0192Ed.f582c, 4);
        m2725y0(byteArrayOutputStream, c0192Ed.f586g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: w0 */
    public static void m2723w0(ByteArrayOutputStream byteArrayOutputStream, int i, C0192Ed c0192Ed) throws IOException {
        int i2 = c0192Ed.f586g;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0192Ed.f588i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: x0 */
    public static void m2724x0(ByteArrayOutputStream byteArrayOutputStream, C0192Ed c0192Ed) throws IOException {
        int i = 0;
        for (Map.Entry entry : c0192Ed.f588i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                m2726z0(byteArrayOutputStream, iIntValue - i);
                m2726z0(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static void m2725y0(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: z0 */
    public static void m2726z0(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        m2725y0(byteArrayOutputStream, i, 2);
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: A */
    public long mo1767A(InterfaceC0126Cx interfaceC0126Cx, int i) {
        return mo841a();
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: B */
    public InterfaceC0919Va mo839B(InterfaceC0126Cx interfaceC0126Cx) {
        return this;
    }

    @Override // p000.InterfaceC0359IE
    /* JADX INFO: renamed from: C */
    public void mo795C() {
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: D */
    public double mo840D() {
        m2727O();
        throw null;
    }

    /* JADX INFO: renamed from: O */
    public void m2727O() {
        throw new C0341Hx(AbstractC0425Jv.m881a(getClass()) + " can't retrieve untyped values");
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: a */
    public abstract long mo841a();

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: b */
    public InterfaceC0406Jc mo1768b(C2116ju c2116ju, int i) {
        return mo848u(c2116ju.mo210j(i));
    }

    @Override // p000.InterfaceC0359IE
    /* JADX INFO: renamed from: d */
    public void mo797d() {
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: e */
    public boolean mo842e() {
        m2727O();
        throw null;
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: f */
    public boolean mo843f() {
        return true;
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: g */
    public char mo844g() {
        m2727O();
        throw null;
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: h */
    public Object mo845h(InterfaceC0717Qm interfaceC0717Qm) {
        return interfaceC0717Qm.deserialize(this);
    }

    public int hashCode() {
        switch (this.f4988a) {
            case 18:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: i */
    public Object mo1769i(InterfaceC0126Cx interfaceC0126Cx, int i, InterfaceC0717Qm interfaceC0717Qm, Object obj) {
        if (interfaceC0717Qm.getDescriptor().mo208h() || mo843f()) {
            return mo845h(interfaceC0717Qm);
        }
        return null;
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: k */
    public double mo1771k(C2116ju c2116ju, int i) {
        return mo840D();
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: l */
    public char mo1772l(C2116ju c2116ju, int i) {
        return mo844g();
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: m */
    public float mo1773m(C2116ju c2116ju, int i) {
        return mo851z();
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: n */
    public byte mo1774n(C2116ju c2116ju, int i) {
        return mo847t();
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: o */
    public String mo1775o(InterfaceC0126Cx interfaceC0126Cx, int i) {
        return mo850y();
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: p */
    public abstract int mo846p();

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: q */
    public short mo1776q(C2116ju c2116ju, int i) {
        return mo849x();
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: r */
    public void mo1777r(InterfaceC0126Cx interfaceC0126Cx) {
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: s */
    public boolean mo1778s(InterfaceC0126Cx interfaceC0126Cx, int i) {
        return mo842e();
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: t */
    public abstract byte mo847t();

    public String toString() {
        switch (this.f4988a) {
            case 18:
                return AbstractC0425Jv.m881a(getClass()).m445b();
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: u */
    public InterfaceC0406Jc mo848u(InterfaceC0126Cx interfaceC0126Cx) {
        return this;
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: v */
    public Object mo1779v(InterfaceC0126Cx interfaceC0126Cx, int i, InterfaceC0717Qm interfaceC0717Qm, Object obj) {
        return mo845h(interfaceC0717Qm);
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: w */
    public int mo1780w(InterfaceC0126Cx interfaceC0126Cx, int i) {
        return mo846p();
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: x */
    public abstract short mo849x();

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: y */
    public String mo850y() {
        m2727O();
        throw null;
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: z */
    public float mo851z() {
        m2727O();
        throw null;
    }
}
