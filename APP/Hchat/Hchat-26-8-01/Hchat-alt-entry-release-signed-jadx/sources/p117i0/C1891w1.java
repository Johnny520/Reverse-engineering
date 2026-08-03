package p117i0;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.os.Trace;
import be.C0289k;
import ca.C0512c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p036c9.C0443h0;
import p051db.C0765c;
import p057e1.C0807b;
import p069f.C0945l0;
import p070f0.C0976h;
import p071f1.C1009j;
import p071f1.C1034w;
import p080fb.AbstractC1184v0;
import p080fb.C1183v;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p101h1.C1570g;
import p101h1.InterfaceC1567d;
import p131j0.C2046b;
import p249qg.InterfaceC3599t;
import p251r.C3623h;
import p259r9.AbstractC3754e0;
import p266s0.C3874d;
import p276sf.C3967n;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4662m;
import p322w0.C4651b;
import p322w0.C4674y;
import p322w0.C4675z;
import p332wb.AbstractC5193p0;
import p332wb.C4899g1;
import p332wb.C4911gd;
import p332wb.C5200p7;
import p332wb.C5265r6;
import p332wb.C5270rb;
import p332wb.C5293s1;
import p332wb.C5436wc;
import p332wb.C5469xc;
import p332wb.C5495y6;
import sh.C3998d;
import sh.C4024l;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: i0.w1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1891w1 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6274g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f6275h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f6276i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f6277j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f6278k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f6279l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f6280m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f6281n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f6282o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f6283p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1891w1(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, String str, List list, ArrayList arrayList, List list2, InterfaceC1235p interfaceC1235p, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14) {
        this.f6274g = 4;
        this.f6275h = interfaceC1809a1;
        this.f6276i = interfaceC1809a12;
        this.f6277j = str;
        this.f6280m = list;
        this.f6278k = arrayList;
        this.f6281n = list2;
        this.f6279l = interfaceC1235p;
        this.f6282o = interfaceC1809a13;
        this.f6283p = interfaceC1809a14;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, INVOKE] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[INVOKE, INVOKE]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:131:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0666 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0523  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean zM4671z;
        AbstractC4655f c4675z;
        int i9;
        long j3;
        boolean z9;
        long j4;
        float f3;
        Path path;
        switch (this.f6274g) {
            case 0:
                C1897y1 c1897y1 = (C1897y1) this.f6275h;
                C0945l0 c0945l0 = (C0945l0) this.f6276i;
                C0945l0 c0945l02 = (C0945l0) this.f6277j;
                List list = (List) this.f6280m;
                List list2 = (List) this.f6281n;
                c0945l02 = (C0945l0) this.f6278k;
                list = (List) this.f6282o;
                c0945l02 = (C0945l0) this.f6279l;
                Set set = (Set) this.f6283p;
                long jLongValue = ((Long) obj).longValue();
                synchronized (c1897y1.f6305c) {
                    zM4671z = c1897y1.m4671z();
                }
                if (zM4671z) {
                    Trace.beginSection("Recomposer:animation");
                    try {
                        ((C0289k) c1897y1.f6303a.f6043i).m1197f(new C0512c(jLongValue, 7));
                        synchronized (AbstractC4662m.f15512c) {
                            C0945l0 c0945l03 = AbstractC4662m.f15519j.f15477h;
                            if (c0945l03 != null) {
                                z9 = c0945l03.m2335h();
                            }
                        }
                        if (z9) {
                            AbstractC4662m.m9120a();
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                Trace.beginSection("Recomposer:recompose");
                try {
                    c1897y1.m4667K();
                    synchronized (c1897y1.f6305c) {
                        try {
                            C2046b c2046b = c1897y1.f6311i;
                            Object[] objArr = c2046b.f6891g;
                            int i10 = c2046b.f6893i;
                            for (int i11 = 0; i11 < i10; i11++) {
                                list.add((C1871q) objArr[i11]);
                            }
                            c1897y1.f6311i.m5061g();
                        } finally {
                        }
                    }
                    c0945l0.m2329b();
                    while (true) {
                        if (list.isEmpty() && list2.isEmpty()) {
                            AbstractC4655f abstractC4655fM9129j = AbstractC4662m.m9129j();
                            if (abstractC4655fM9129j instanceof C4651b) {
                                c4675z = new C4674y((C4651b) abstractC4655fM9129j, null, null, true, false);
                                i9 = 0;
                            } else {
                                i9 = 0;
                                c4675z = new C4675z(abstractC4655fM9129j, null, true, false);
                            }
                            try {
                                AbstractC4655f abstractC4655fM9110j = c4675z.m9110j();
                                try {
                                    if (list.isEmpty()) {
                                        if (c0945l02.m2335h()) {
                                        }
                                        if (c0945l02.m2335h()) {
                                        }
                                        AbstractC4655f.m9106q(abstractC4655fM9110j);
                                        c4675z.mo9086c();
                                        synchronized (c1897y1.f6305c) {
                                        }
                                    } else {
                                        try {
                                            int size = list.size();
                                            for (int i12 = i9; i12 < size; i12++) {
                                                c0945l02.m2328a((C1871q) list.get(i12));
                                            }
                                            int size2 = list.size();
                                            for (int i13 = i9; i13 < size2; i13++) {
                                                ((C1871q) list.get(i13)).m4591d();
                                            }
                                            if (c0945l02.m2335h()) {
                                                j3 = 128;
                                            } else {
                                                try {
                                                    c0945l02.m2337j(c0945l02);
                                                    Object[] objArr2 = c0945l02.f2976b;
                                                    j3 = 128;
                                                    long[] jArr = c0945l02.f2975a;
                                                    int length = jArr.length - 2;
                                                    if (length >= 0) {
                                                        int i14 = 0;
                                                        while (true) {
                                                            long j5 = jArr[i14];
                                                            Object[] objArr3 = objArr2;
                                                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i15 = 8 - ((~(i14 - length)) >>> 31);
                                                                for (int i16 = 0; i16 < i15; i16++) {
                                                                    if ((j5 & 255) < 128) {
                                                                        ((C1871q) objArr3[(i14 << 3) + i16]).m4593f();
                                                                    }
                                                                    j5 >>= 8;
                                                                }
                                                                if (i15 == 8) {
                                                                    int i17 = i14;
                                                                    if (i17 != length) {
                                                                        i14 = i17 + 1;
                                                                        objArr2 = objArr3;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    try {
                                                        c1897y1.m4666J(th2, null);
                                                        C1894x1.m4654f(c1897y1, list, list2, list, c0945l02, c0945l02, c0945l0, c0945l02);
                                                        AbstractC4655f.m9106q(abstractC4655fM9110j);
                                                        return C3967n.f12976a;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            if (c0945l02.m2335h()) {
                                                try {
                                                    Object[] objArr4 = c0945l02.f2976b;
                                                    long[] jArr2 = c0945l02.f2975a;
                                                    int length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        int i18 = 0;
                                                        while (true) {
                                                            long j10 = jArr2[i18];
                                                            Object[] objArr5 = objArr4;
                                                            long[] jArr3 = jArr2;
                                                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                                                for (int i20 = 0; i20 < i19; i20++) {
                                                                    if ((j10 & 255) < j3) {
                                                                        ((C1871q) objArr5[(i18 << 3) + i20]).m4594g();
                                                                    }
                                                                    j10 >>= 8;
                                                                }
                                                                if (i19 == 8) {
                                                                }
                                                            }
                                                            if (i18 != length2) {
                                                                i18++;
                                                                objArr4 = objArr5;
                                                                jArr2 = jArr3;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    try {
                                                        c1897y1.m4666J(th3, null);
                                                        C1894x1.m4654f(c1897y1, list, list2, list, c0945l02, c0945l02, c0945l0, c0945l02);
                                                        c0945l02.m2329b();
                                                        AbstractC4655f.m9106q(abstractC4655fM9110j);
                                                        return C3967n.f12976a;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            AbstractC4655f.m9106q(abstractC4655fM9110j);
                                            c4675z.mo9086c();
                                            synchronized (c1897y1.f6305c) {
                                                if (c1897y1.m4670y() != null) {
                                                    AbstractC1855m.m4573a("unexpected to get continuation here");
                                                    break;
                                                }
                                            }
                                            AbstractC4662m.m9129j().mo9089m();
                                            c0945l02.m2329b();
                                            c0945l0.m2329b();
                                            c1897y1.f6319q = null;
                                        } catch (Throwable th4) {
                                            try {
                                                c1897y1.m4666J(th4, null);
                                                C1894x1.m4654f(c1897y1, list, list2, list, c0945l02, c0945l02, c0945l0, c0945l02);
                                                list.clear();
                                                AbstractC4655f.m9106q(abstractC4655fM9110j);
                                                return C3967n.f12976a;
                                            } finally {
                                            }
                                        }
                                    }
                                } catch (Throwable th5) {
                                    AbstractC4655f.m9106q(abstractC4655fM9110j);
                                    throw th5;
                                }
                            } finally {
                                c4675z.mo9086c();
                            }
                        } else {
                            try {
                                int size3 = list.size();
                                for (int i21 = 0; i21 < size3; i21++) {
                                    C1871q c1871q = (C1871q) list.get(i21);
                                    C1871q c1871qM4665I = c1897y1.m4665I(c1871q, c0945l0);
                                    if (c1871qM4665I != null) {
                                        list.add(c1871qM4665I);
                                    }
                                    c0945l02.m2328a(c1871q);
                                }
                                list.clear();
                                if (c0945l0.m2335h() || c1897y1.f6311i.f6893i != 0) {
                                    synchronized (c1897y1.f6305c) {
                                        try {
                                            List listM4661D = c1897y1.m4661D();
                                            int size4 = listM4661D.size();
                                            for (int i22 = 0; i22 < size4; i22++) {
                                                C1871q c1871q2 = (C1871q) listM4661D.get(i22);
                                                if (!c0945l02.m2330c(c1871q2) && c1871q2.m4609v(set)) {
                                                    list.add(c1871q2);
                                                }
                                            }
                                            C2046b c2046b2 = c1897y1.f6311i;
                                            int i23 = c2046b2.f6893i;
                                            int i24 = 0;
                                            int i25 = 0;
                                            while (true) {
                                                Object[] objArr6 = c2046b2.f6891g;
                                                if (i24 < i23) {
                                                    C1871q c1871q3 = (C1871q) objArr6[i24];
                                                    if (!c0945l02.m2330c(c1871q3) && !list.contains(c1871q3)) {
                                                        list.add(c1871q3);
                                                        i25++;
                                                    } else if (i25 > 0) {
                                                        Object[] objArr7 = c2046b2.f6891g;
                                                        objArr7[i24 - i25] = objArr7[i24];
                                                    }
                                                    i24++;
                                                } else {
                                                    int i26 = i23 - i25;
                                                    Arrays.fill(objArr6, i26, i23, (Object) null);
                                                    c2046b2.f6893i = i26;
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                                if (list.isEmpty()) {
                                    try {
                                        C1894x1.m4655g(list2, c1897y1);
                                        while (!list2.isEmpty()) {
                                            List listM4664H = c1897y1.m4664H(list2, c0945l0);
                                            c0945l02.getClass();
                                            Iterator it = listM4664H.iterator();
                                            while (it.hasNext()) {
                                                c0945l02.m2338k(it.next());
                                            }
                                            C1894x1.m4655g(list2, c1897y1);
                                        }
                                    } catch (Throwable th6) {
                                        c1897y1.m4666J(th6, null);
                                        C1894x1.m4654f(c1897y1, list, list2, list, c0945l02, c0945l02, c0945l0, c0945l02);
                                    }
                                    break;
                                }
                            } catch (Throwable th7) {
                                try {
                                    c1897y1.m4666J(th7, null);
                                    C1894x1.m4654f(c1897y1, list, list2, list, c0945l02, c0945l02, c0945l0, c0945l02);
                                } finally {
                                }
                            }
                        }
                        return C3967n.f12976a;
                    }
                } catch (Throwable th8) {
                    throw th8;
                }
            case 1:
                InterfaceC1854l2 interfaceC1854l2 = (InterfaceC1854l2) this.f6275h;
                InterfaceC1854l2 interfaceC1854l22 = (InterfaceC1854l2) this.f6276i;
                InterfaceC1854l2 interfaceC1854l23 = (InterfaceC1854l2) this.f6277j;
                InterfaceC1854l2 interfaceC1854l24 = (InterfaceC1854l2) this.f6278k;
                InterfaceC1854l2 interfaceC1854l25 = (InterfaceC1854l2) this.f6279l;
                InterfaceC1854l2 interfaceC1854l26 = (InterfaceC1854l2) this.f6280m;
                C1009j c1009j = (C1009j) this.f6281n;
                C4024l c4024l = (C4024l) this.f6282o;
                C1570g c1570g = (C1570g) this.f6283p;
                InterfaceC1567d interfaceC1567d = (InterfaceC1567d) obj;
                interfaceC1567d.getClass();
                InterfaceC1567d.m4083O(interfaceC1567d, ((C1034w) interfaceC1854l2.getValue()).f3265a, 0.0f, 0L, 126);
                long j11 = ((C1034w) interfaceC1854l22.getValue()).f3265a;
                float fFloatValue = ((Number) interfaceC1854l23.getValue()).floatValue();
                float fFloatValue2 = ((Number) interfaceC1854l24.getValue()).floatValue();
                float fFloatValue3 = ((Number) interfaceC1854l25.getValue()).floatValue();
                float fFloatValue4 = ((Number) interfaceC1854l26.getValue()).floatValue();
                Path path2 = c1009j.f3191a;
                Path path3 = c1009j.f3191a;
                path2.rewind();
                long j12 = c4024l.f13209a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L));
                float f10 = c4024l.f13213e;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(AbstractC1184v0.m3176C(fIntBitsToFloat2, f10, fFloatValue4))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
                long j13 = c4024l.f13210b;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(AbstractC1184v0.m3176C(Float.intBitsToFloat((int) (j13 >> 32)), c4024l.f13212d, fFloatValue4))) << 32) | (((long) Float.floatToRawIntBits(AbstractC1184v0.m3176C(Float.intBitsToFloat((int) (j13 & 4294967295L)), f10, fFloatValue4))) & 4294967295L);
                long j14 = c4024l.f13211c;
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(AbstractC1184v0.m3176C(Float.intBitsToFloat((int) (j14 & 4294967295L)), f10, fFloatValue4))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j14 >> 32)))) << 32);
                float fM2040c = C0807b.m2040c(C0807b.m2041d(jFloatToRawIntBits2, jFloatToRawIntBits));
                float fM2040c2 = C0807b.m2040c(C0807b.m2041d(jFloatToRawIntBits3, jFloatToRawIntBits2));
                float f11 = fM2040c + fM2040c2;
                float f12 = fFloatValue2 * f11;
                float f13 = f11 * fFloatValue3;
                if (f12 >= fM2040c || f13 <= 0.0f) {
                    j4 = jFloatToRawIntBits3;
                    f3 = fM2040c;
                    path = path3;
                } else {
                    j4 = jFloatToRawIntBits3;
                    float fM7907q = AbstractC3754e0.m7907q(f12 / fM2040c, 0.0f, 1.0f);
                    float fM7907q2 = AbstractC3754e0.m7907q(f13 / fM2040c, 0.0f, 1.0f);
                    int i27 = (int) (jFloatToRawIntBits >> 32);
                    int i28 = (int) (jFloatToRawIntBits2 >> 32);
                    float fIntBitsToFloat3 = ((Float.intBitsToFloat(i28) - Float.intBitsToFloat(i27)) * fM7907q) + Float.intBitsToFloat(i27);
                    int i29 = (int) (jFloatToRawIntBits & 4294967295L);
                    f3 = fM2040c;
                    int i30 = (int) (jFloatToRawIntBits2 & 4294967295L);
                    float fIntBitsToFloat4 = ((Float.intBitsToFloat(i30) - Float.intBitsToFloat(i29)) * fM7907q) + Float.intBitsToFloat(i29);
                    float fIntBitsToFloat5 = ((Float.intBitsToFloat(i28) - Float.intBitsToFloat(i27)) * fM7907q2) + Float.intBitsToFloat(i27);
                    float fIntBitsToFloat6 = ((Float.intBitsToFloat(i30) - Float.intBitsToFloat(i29)) * fM7907q2) + Float.intBitsToFloat(i29);
                    path = path3;
                    path.moveTo(fIntBitsToFloat3, fIntBitsToFloat4);
                    c1009j.m2604f(fIntBitsToFloat5, fIntBitsToFloat6);
                }
                if (f13 > f3) {
                    float fM7907q3 = AbstractC3754e0.m7907q((f12 - f3) / fM2040c2, 0.0f, 1.0f);
                    float fM7907q4 = AbstractC3754e0.m7907q((f13 - f3) / fM2040c2, 0.0f, 1.0f);
                    int i31 = (int) (jFloatToRawIntBits2 >> 32);
                    int i32 = (int) (j4 >> 32);
                    float fIntBitsToFloat7 = ((Float.intBitsToFloat(i32) - Float.intBitsToFloat(i31)) * fM7907q3) + Float.intBitsToFloat(i31);
                    int i33 = (int) (jFloatToRawIntBits2 & 4294967295L);
                    int i34 = (int) (j4 & 4294967295L);
                    float fIntBitsToFloat8 = ((Float.intBitsToFloat(i34) - Float.intBitsToFloat(i33)) * fM7907q3) + Float.intBitsToFloat(i33);
                    float fIntBitsToFloat9 = ((Float.intBitsToFloat(i32) - Float.intBitsToFloat(i31)) * fM7907q4) + Float.intBitsToFloat(i31);
                    float fIntBitsToFloat10 = ((Float.intBitsToFloat(i34) - Float.intBitsToFloat(i33)) * fM7907q4) + Float.intBitsToFloat(i33);
                    if (f12 < fM2040c) {
                        c1009j.m2604f(fIntBitsToFloat9, fIntBitsToFloat10);
                    } else {
                        path.moveTo(fIntBitsToFloat7, fIntBitsToFloat8);
                        c1009j.m2604f(fIntBitsToFloat9, fIntBitsToFloat10);
                    }
                }
                interfaceC1567d.mo4070F0(c1009j, j11, fFloatValue, c1570g);
                break;
            case 2:
                C0765c c0765c = (C0765c) this.f6275h;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f6276i;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f6277j;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f6278k;
                InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) this.f6279l;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f6280m;
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f6281n;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f6282o;
                Context context = (Context) this.f6283p;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19876t4, 3);
                C3623h.m7604a(c3623h, null, new C3874d(-1650133709, new C5436wc(0, c0765c, interfaceC1231l), true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19883u4, 3);
                C3623h.m7604a(c3623h, null, new C3874d(-141033231, new C0443h0(12, c0765c, interfaceC1231l, interfaceC1220a3, false), true), 3);
                C3623h.m7604a(c3623h, null, new C3874d(-1533966640, new C0976h(c0765c, 6), true), 3);
                C3623h.m7604a(c3623h, null, new C3874d(1368067247, new C5469xc((Object) c0765c, (Object) interfaceC1231l, (Object) interfaceC1231l2, interfaceC1235p, (Object) interfaceC1231l3, 0), true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19890v4, 3);
                C3623h.m7604a(c3623h, null, new C3874d(-1417799571, new C0443h0(c0765c, context, interfaceC1231l, 13), true), 3);
                if (c0765c.f2305r == 0 && c0765c.f2308u == 0) {
                    C3623h.m7604a(c3623h, null, AbstractC5193p0.f19897w4, 3);
                    C3623h.m7604a(c3623h, null, new C3874d(1899829048, new C5436wc(1, c0765c, interfaceC1231l), true), 3);
                }
                if (interfaceC1220a != null || interfaceC1220a2 != null) {
                    C3623h.m7604a(c3623h, null, AbstractC5193p0.f19904x4, 3);
                    C3623h.m7604a(c3623h, null, new C3874d(-42722399, new C4899g1(interfaceC1220a, interfaceC1220a2, 3), true), 3);
                }
                return C3967n.f12976a;
            case 3:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f6275h;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f6276i;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f6277j;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f6278k;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f6279l;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f6280m;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f6281n;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f6282o;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f6283p;
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19802k2, 3);
                C3623h.m7604a(c3623h2, null, new C3874d(401302076, new C5200p7(interfaceC1809a1, interfaceC1809a12, interfaceC1809a13, 5), true), 3);
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19810l2, 3);
                C3623h.m7604a(c3623h2, null, new C3874d(901504634, new C5200p7(interfaceC1809a14, interfaceC1809a15, interfaceC1809a16, 6), true), 3);
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19818m2, 3);
                C3623h.m7604a(c3623h2, null, new C3874d(1401707192, new C5200p7(interfaceC1809a17, interfaceC1809a18, interfaceC1809a19, 7), true), 3);
                break;
            case 4:
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f6275h;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f6276i;
                String str = (String) this.f6277j;
                List list3 = (List) this.f6280m;
                ArrayList arrayList = (ArrayList) this.f6278k;
                List list4 = (List) this.f6281n;
                InterfaceC1235p interfaceC1235p2 = (InterfaceC1235p) this.f6279l;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f6282o;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f6283p;
                C3623h c3623h3 = (C3623h) obj;
                c3623h3.getClass();
                C3623h.m7604a(c3623h3, null, new C3874d(-331781284, new C5293s1(interfaceC1809a110, 24), true), 3);
                C3623h.m7604a(c3623h3, null, new C3874d(-1227666029, new C5293s1(interfaceC1809a111, 25), true), 3);
                C3623h.m7604a(c3623h3, null, new C3874d(-1341276524, new C3998d(str, 4), true), 3);
                C3623h.m7604a(c3623h3, null, new C3874d(-1454887019, new C4911gd(list3, arrayList, list4, interfaceC1235p2, interfaceC1809a112, interfaceC1809a113, 2), true), 3);
                break;
            case 5:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f6275h;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f6276i;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f6277j;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f6278k;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f6279l;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f6280m;
                InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) this.f6281n;
                InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) this.f6282o;
                InterfaceC1809a1 interfaceC1809a121 = (InterfaceC1809a1) this.f6283p;
                C3623h c3623h4 = (C3623h) obj;
                c3623h4.getClass();
                C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19638O2, 3);
                C3623h.m7604a(c3623h4, null, new C3874d(1457537913, new C5265r6(sharedPreferences, 9), true), 3);
                C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19645P2, 3);
                C3623h.m7604a(c3623h4, null, new C3874d(-50510665, new C5270rb(interfaceC1809a114, interfaceC1809a115, interfaceC1809a116, interfaceC1809a117, interfaceC1809a118, interfaceC1809a119, interfaceC1809a120, interfaceC1809a121, 0), true), 3);
                break;
            default:
                List list5 = (List) this.f6280m;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f6275h;
                C1183v c1183v = (C1183v) this.f6276i;
                InterfaceC1809a1 interfaceC1809a122 = (InterfaceC1809a1) this.f6277j;
                InterfaceC1809a1 interfaceC1809a123 = (InterfaceC1809a1) this.f6278k;
                InterfaceC1809a1 interfaceC1809a124 = (InterfaceC1809a1) this.f6279l;
                InterfaceC1809a1 interfaceC1809a125 = (InterfaceC1809a1) this.f6281n;
                InterfaceC1809a1 interfaceC1809a126 = (InterfaceC1809a1) this.f6282o;
                String str2 = (String) this.f6283p;
                C3623h c3623h5 = (C3623h) obj;
                c3623h5.getClass();
                C3623h.m7604a(c3623h5, null, new C3874d(-561432933, new C5495y6((Object) interfaceC3599t, (Object) c1183v, (Object) interfaceC1809a122, (Object) interfaceC1809a123, (Object) interfaceC1809a124, (Object) interfaceC1809a125, (Object) interfaceC1809a126, 9), true), 3);
                for (String str3 : AbstractC4166m.m8403L1(300, list5)) {
                    C3623h.m7604a(c3623h5, str3, new C3874d(-164852499, new C0443h0(28, str2, interfaceC1809a123, str3), true), 2);
                }
                return C3967n.f12976a;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C1891w1(C1897y1 c1897y1, C0945l0 c0945l0, C0945l0 c0945l02, List list, List list2, C0945l0 c0945l03, List list3, C0945l0 c0945l04, Set set) {
        this.f6274g = 0;
        this.f6275h = c1897y1;
        this.f6276i = c0945l0;
        this.f6277j = c0945l02;
        this.f6280m = list;
        this.f6281n = list2;
        this.f6278k = c0945l03;
        this.f6282o = list3;
        this.f6279l = c0945l04;
        this.f6283p = set;
    }

    public /* synthetic */ C1891w1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i9) {
        this.f6274g = i9;
        this.f6275h = obj;
        this.f6276i = obj2;
        this.f6277j = obj3;
        this.f6278k = obj4;
        this.f6279l = obj5;
        this.f6280m = obj6;
        this.f6281n = obj7;
        this.f6282o = obj8;
        this.f6283p = obj9;
    }

    public /* synthetic */ C1891w1(List list, InterfaceC3599t interfaceC3599t, C1183v c1183v, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, String str) {
        this.f6274g = 6;
        this.f6280m = list;
        this.f6275h = interfaceC3599t;
        this.f6276i = c1183v;
        this.f6277j = interfaceC1809a1;
        this.f6278k = interfaceC1809a12;
        this.f6279l = interfaceC1809a13;
        this.f6281n = interfaceC1809a14;
        this.f6282o = interfaceC1809a15;
        this.f6283p = str;
    }
}
