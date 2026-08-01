package p158f0;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import p041H0.InterfaceC0616r0;
import p095T.C1309E;
import p095T.C1311F;
import p095T.C1357e;
import p095T.C1381q;
import p095T.InterfaceC1334Q0;
import p105V.C1483e;
import p105V.C1486h;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p179i4.AbstractC2352g;
import p186k.C2408E;
import p186k.C2409F;
import p186k.C2444z;

/* JADX INFO: renamed from: f0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C2087s {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1601c f6983a;

    /* JADX INFO: renamed from: b */
    public Object f6984b;

    /* JADX INFO: renamed from: c */
    public C2444z f6985c;

    /* JADX INFO: renamed from: j */
    public boolean f6992j;

    /* JADX INFO: renamed from: k */
    public int f6993k;

    /* JADX INFO: renamed from: d */
    public int f6986d = -1;

    /* JADX INFO: renamed from: e */
    public final C2408E f6987e = AbstractC2352g.m4201n();

    /* JADX INFO: renamed from: f */
    public final C2408E f6988f = new C2408E();

    /* JADX INFO: renamed from: g */
    public final C2409F f6989g = new C2409F();

    /* JADX INFO: renamed from: h */
    public final C1483e f6990h = new C1483e(new C1311F[16]);

    /* JADX INFO: renamed from: i */
    public final C1381q f6991i = new C1381q(1, this);

    /* JADX INFO: renamed from: l */
    public final C2408E f6994l = AbstractC2352g.m4201n();

    /* JADX INFO: renamed from: m */
    public final HashMap f6995m = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2087s(InterfaceC1601c interfaceC1601c) {
        this.f6983a = interfaceC1601c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0219 A[PHI: r23
  0x0219: PHI (r23v19 boolean) = (r23v18 boolean), (r23v20 boolean) binds: [B:92:0x01f1, B:100:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a8 A[PHI: r23
  0x02a8: PHI (r23v12 boolean) = (r23v11 boolean), (r23v13 boolean) binds: [B:123:0x0280, B:131:0x02a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04fd A[EDGE_INSN: B:244:0x04f6->B:246:0x04fd BREAK  A[LOOP:20: B:230:0x04bc->B:243:0x04f3], PHI: r2
  0x04fd: PHI (r2v10 boolean) = (r2v2 boolean), (r2v2 boolean), (r2v14 boolean) binds: [B:224:0x04a7, B:228:0x04b8, B:244:0x04f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x056e A[PHI: r0
  0x056e: PHI (r0v8 boolean) = (r0v7 boolean), (r0v9 boolean) binds: [B:265:0x0547, B:273:0x056c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e A[PHI: r23
  0x013e: PHI (r23v29 boolean) = (r23v28 boolean), (r23v30 boolean) binds: [B:51:0x010d, B:62:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0149  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3861a(Set set) throws Throwable {
        long j5;
        boolean z5;
        Iterator it;
        Object obj;
        String str;
        HashMap map;
        boolean z6;
        Object objM4272g;
        boolean z7;
        Iterator it2;
        Object obj2;
        String str2;
        C2408E c2408e;
        int i5;
        boolean z8;
        long[] jArr;
        int i6;
        int i7;
        Object[] objArr;
        int i8;
        int i9;
        Object[] objArr2;
        C2444z c2444z;
        long[] jArr2;
        C1357e c1357e;
        C2408E c2408e2;
        Object[] objArr3;
        int i10;
        long[] jArr3;
        C1357e c1357e2;
        int i11;
        int i12;
        int i13;
        int i14;
        long j6;
        C2408E c2408e3;
        Object[] objArr4;
        boolean z9;
        C2408E c2408e4;
        int i15;
        int i16;
        int i17;
        long j7;
        int i18;
        C2087s c2087s = this;
        C1357e c1357e3 = C1357e.f4798j;
        boolean z10 = set instanceof C1486h;
        String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
        C1483e c1483e = c2087s.f6990h;
        C2408E c2408e5 = c2087s.f6994l;
        HashMap map2 = c2087s.f6995m;
        C2408E c2408e6 = c2087s.f6987e;
        C2409F c2409f = c2087s.f6989g;
        if (z10) {
            C2409F c2409f2 = ((C1486h) set).f5195d;
            Object[] objArr5 = c2409f2.f7794b;
            long[] jArr4 = c2409f2.f7793a;
            j5 = -9187201950435737472L;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i19 = 0;
                z5 = false;
                while (true) {
                    int i20 = 8;
                    long j8 = jArr4[i19];
                    C2408E c2408e7 = c2408e5;
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i21 = 8 - ((~(i19 - length)) >>> 31);
                        int i22 = 0;
                        while (i22 < i21) {
                            if ((j8 & 255) < 128) {
                                Object obj3 = objArr5[(i19 << 3) + i22];
                                jArr3 = jArr4;
                                if (obj3 instanceof AbstractC2091w) {
                                    c1357e2 = c1357e3;
                                    if (!((AbstractC2091w) obj3).m3869e(2)) {
                                    }
                                    j8 = j6 >> 8;
                                    i22 = i12 + 1;
                                    i20 = 8;
                                    objArr5 = objArr4;
                                    jArr4 = jArr3;
                                    c1357e3 = c1357e2;
                                    length = i13;
                                    i19 = i14;
                                    i21 = i11;
                                    c2408e7 = c2408e3;
                                } else {
                                    c1357e2 = c1357e3;
                                }
                                if (c2087s.f6992j) {
                                    c2408e3 = c2408e7;
                                    i11 = i21;
                                    i12 = i22;
                                    i13 = length;
                                    i14 = i19;
                                    j6 = j8;
                                    objArr4 = objArr5;
                                } else {
                                    C2408E c2408e8 = c2408e7;
                                    if (c2408e8.m4268c(obj3)) {
                                        c2087s.f6992j = true;
                                        try {
                                            Object objM4272g2 = c2408e8.m4272g(obj3);
                                            if (objM4272g2 != null) {
                                                objArr4 = objArr5;
                                                try {
                                                    if (objM4272g2 instanceof C2409F) {
                                                        C2409F c2409f3 = (C2409F) objM4272g2;
                                                        Object[] objArr6 = c2409f3.f7794b;
                                                        long[] jArr5 = c2409f3.f7793a;
                                                        int length2 = jArr5.length - 2;
                                                        if (length2 >= 0) {
                                                            j6 = j8;
                                                            int i23 = 0;
                                                            while (true) {
                                                                long j9 = jArr5[i23];
                                                                i13 = length;
                                                                i14 = i19;
                                                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i24 = 8 - ((~(i23 - length2)) >>> 31);
                                                                    int i25 = 0;
                                                                    while (i25 < i24) {
                                                                        if ((j9 & 255) < 128) {
                                                                            i16 = i22;
                                                                            C1311F c1311f = (C1311F) objArr6[(i23 << 3) + i25];
                                                                            AbstractC1665j.m2983c(c1311f, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                                            i17 = i25;
                                                                            Object obj4 = map2.get(c1311f);
                                                                            j7 = j9;
                                                                            InterfaceC1334Q0 interfaceC1334Q0 = c1311f.f4683f;
                                                                            if (interfaceC1334Q0 == null) {
                                                                                interfaceC1334Q0 = c1357e2;
                                                                            }
                                                                            if (interfaceC1334Q0.mo2498a(c1311f.m2413h().f4678f, obj4)) {
                                                                                c2408e4 = c2408e8;
                                                                                i15 = i21;
                                                                                c1483e.m2753b(c1311f);
                                                                            } else {
                                                                                Object objM4272g3 = c2408e6.m4272g(c1311f);
                                                                                if (objM4272g3 == null) {
                                                                                    c2408e4 = c2408e8;
                                                                                    i15 = i21;
                                                                                } else if (objM4272g3 instanceof C2409F) {
                                                                                    C2409F c2409f4 = (C2409F) objM4272g3;
                                                                                    Object[] objArr7 = c2409f4.f7794b;
                                                                                    long[] jArr6 = c2409f4.f7793a;
                                                                                    int length3 = jArr6.length - 2;
                                                                                    if (length3 >= 0) {
                                                                                        i15 = i21;
                                                                                        int i26 = 0;
                                                                                        while (true) {
                                                                                            long j10 = jArr6[i26];
                                                                                            c2408e4 = c2408e8;
                                                                                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                                int i27 = 8 - ((~(i26 - length3)) >>> 31);
                                                                                                int i28 = 0;
                                                                                                while (i28 < i27) {
                                                                                                    if ((j10 & 255) < 128) {
                                                                                                        i18 = i28;
                                                                                                        c2409f.m4279a(objArr7[(i26 << 3) + i28]);
                                                                                                        z5 = true;
                                                                                                    } else {
                                                                                                        i18 = i28;
                                                                                                    }
                                                                                                    j10 >>= i20;
                                                                                                    i28 = i18 + 1;
                                                                                                }
                                                                                                if (i27 != i20) {
                                                                                                    break;
                                                                                                }
                                                                                                if (i26 == length3) {
                                                                                                    break;
                                                                                                }
                                                                                                i26++;
                                                                                                i20 = 8;
                                                                                                c2408e8 = c2408e4;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    c2408e4 = c2408e8;
                                                                                    i15 = i21;
                                                                                    c2409f.m4279a(objM4272g3);
                                                                                    z5 = true;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            c2408e4 = c2408e8;
                                                                            i15 = i21;
                                                                            i16 = i22;
                                                                            i17 = i25;
                                                                            j7 = j9;
                                                                        }
                                                                        j9 = j7 >> 8;
                                                                        i25 = i17 + 1;
                                                                        i20 = 8;
                                                                        i22 = i16;
                                                                        i21 = i15;
                                                                        c2408e8 = c2408e4;
                                                                    }
                                                                    c2408e3 = c2408e8;
                                                                    i11 = i21;
                                                                    i12 = i22;
                                                                    if (i24 != i20) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    c2408e3 = c2408e8;
                                                                    i11 = i21;
                                                                    i12 = i22;
                                                                }
                                                                if (i23 == length2) {
                                                                    break;
                                                                }
                                                                i23++;
                                                                i20 = 8;
                                                                length = i13;
                                                                i19 = i14;
                                                                i22 = i12;
                                                                i21 = i11;
                                                                c2408e8 = c2408e3;
                                                            }
                                                        } else {
                                                            c2408e3 = c2408e8;
                                                        }
                                                    } else {
                                                        c2408e3 = c2408e8;
                                                        i11 = i21;
                                                        i12 = i22;
                                                        i13 = length;
                                                        i14 = i19;
                                                        j6 = j8;
                                                        C1311F c1311f2 = (C1311F) objM4272g2;
                                                        Object obj5 = map2.get(c1311f2);
                                                        InterfaceC1334Q0 interfaceC1334Q02 = c1311f2.f4683f;
                                                        if (interfaceC1334Q02 == null) {
                                                            interfaceC1334Q02 = c1357e2;
                                                        }
                                                        if (interfaceC1334Q02.mo2498a(c1311f2.m2413h().f4678f, obj5)) {
                                                            c1483e.m2753b(c1311f2);
                                                        } else {
                                                            Object objM4272g4 = c2408e6.m4272g(c1311f2);
                                                            if (objM4272g4 != null) {
                                                                if (objM4272g4 instanceof C2409F) {
                                                                    C2409F c2409f5 = (C2409F) objM4272g4;
                                                                    Object[] objArr8 = c2409f5.f7794b;
                                                                    long[] jArr7 = c2409f5.f7793a;
                                                                    int length4 = jArr7.length - 2;
                                                                    if (length4 >= 0) {
                                                                        int i29 = 0;
                                                                        while (true) {
                                                                            long j11 = jArr7[i29];
                                                                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                int i30 = 8 - ((~(i29 - length4)) >>> 31);
                                                                                for (int i31 = 0; i31 < i30; i31++) {
                                                                                    if ((j11 & 255) < 128) {
                                                                                        c2409f.m4279a(objArr8[(i29 << 3) + i31]);
                                                                                        z5 = true;
                                                                                    }
                                                                                    j11 >>= 8;
                                                                                }
                                                                                if (i30 != 8) {
                                                                                    break;
                                                                                }
                                                                                if (i29 == length4) {
                                                                                    break;
                                                                                }
                                                                                i29++;
                                                                            }
                                                                            j8 = j6 >> 8;
                                                                            i22 = i12 + 1;
                                                                            i20 = 8;
                                                                            objArr5 = objArr4;
                                                                            jArr4 = jArr3;
                                                                            c1357e3 = c1357e2;
                                                                            length = i13;
                                                                            i19 = i14;
                                                                            i21 = i11;
                                                                            c2408e7 = c2408e3;
                                                                        }
                                                                    }
                                                                } else {
                                                                    c2409f.m4279a(objM4272g4);
                                                                    z5 = true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    c2087s = this;
                                                    c2087s.f6992j = false;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    z9 = false;
                                                    c2087s = this;
                                                    c2087s.f6992j = z9;
                                                    throw th;
                                                }
                                            } else {
                                                c2408e3 = c2408e8;
                                                objArr4 = objArr5;
                                            }
                                            i11 = i21;
                                            i12 = i22;
                                            i13 = length;
                                            i14 = i19;
                                            j6 = j8;
                                            c2087s = this;
                                            c2087s.f6992j = false;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            z9 = false;
                                        }
                                    } else {
                                        c2408e3 = c2408e8;
                                        objArr4 = objArr5;
                                        i11 = i21;
                                        i12 = i22;
                                        i13 = length;
                                        i14 = i19;
                                        j6 = j8;
                                    }
                                }
                                Object objM4272g5 = c2408e6.m4272g(obj3);
                                if (objM4272g5 != null) {
                                    if (objM4272g5 instanceof C2409F) {
                                        C2409F c2409f6 = (C2409F) objM4272g5;
                                        Object[] objArr9 = c2409f6.f7794b;
                                        long[] jArr8 = c2409f6.f7793a;
                                        int length5 = jArr8.length - 2;
                                        if (length5 >= 0) {
                                            int i32 = 0;
                                            while (true) {
                                                long j12 = jArr8[i32];
                                                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i33 = 8 - ((~(i32 - length5)) >>> 31);
                                                    for (int i34 = 0; i34 < i33; i34++) {
                                                        if ((j12 & 255) < 128) {
                                                            c2409f.m4279a(objArr9[(i32 << 3) + i34]);
                                                            z5 = true;
                                                        }
                                                        j12 >>= 8;
                                                    }
                                                    if (i33 != 8) {
                                                        break;
                                                    }
                                                    if (i32 == length5) {
                                                        break;
                                                    }
                                                    i32++;
                                                }
                                            }
                                        }
                                    } else {
                                        c2409f.m4279a(objM4272g5);
                                        z5 = true;
                                    }
                                }
                                j8 = j6 >> 8;
                                i22 = i12 + 1;
                                i20 = 8;
                                objArr5 = objArr4;
                                jArr4 = jArr3;
                                c1357e3 = c1357e2;
                                length = i13;
                                i19 = i14;
                                i21 = i11;
                                c2408e7 = c2408e3;
                            } else {
                                jArr3 = jArr4;
                                c1357e2 = c1357e3;
                            }
                            i11 = i21;
                            i12 = i22;
                            i13 = length;
                            i14 = i19;
                            j6 = j8;
                            c2408e3 = c2408e7;
                            objArr4 = objArr5;
                            j8 = j6 >> 8;
                            i22 = i12 + 1;
                            i20 = 8;
                            objArr5 = objArr4;
                            jArr4 = jArr3;
                            c1357e3 = c1357e2;
                            length = i13;
                            i19 = i14;
                            i21 = i11;
                            c2408e7 = c2408e3;
                        }
                        jArr2 = jArr4;
                        c1357e = c1357e3;
                        int i35 = length;
                        int i36 = i19;
                        c2408e2 = c2408e7;
                        objArr3 = objArr5;
                        if (i21 != i20) {
                            break;
                        }
                        length = i35;
                        i10 = i36;
                    } else {
                        jArr2 = jArr4;
                        c1357e = c1357e3;
                        c2408e2 = c2408e7;
                        objArr3 = objArr5;
                        i10 = i19;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i19 = i10 + 1;
                    objArr5 = objArr3;
                    jArr4 = jArr2;
                    c1357e3 = c1357e;
                    c2408e5 = c2408e2;
                }
            } else {
                z5 = false;
            }
        } else {
            C2408E c2408e9 = c2408e5;
            j5 = -9187201950435737472L;
            Iterator it3 = set.iterator();
            boolean z11 = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if ((next instanceof AbstractC2091w) && !((AbstractC2091w) next).m3869e(2)) {
                    it = it3;
                    str = str3;
                    map = map2;
                } else if (c2087s.f6992j) {
                    it = it3;
                    obj = next;
                    str = str3;
                    map = map2;
                    z6 = false;
                    boolean z12 = z11;
                    objM4272g = c2408e6.m4272g(obj);
                    if (objM4272g != null) {
                    }
                    z11 = z12;
                } else {
                    C2408E c2408e10 = c2408e9;
                    if (c2408e10.m4268c(next)) {
                        c2087s.f6992j = true;
                        try {
                            Object objM4272g6 = c2408e10.m4272g(next);
                            if (objM4272g6 == null) {
                                it = it3;
                                obj = next;
                                str = str3;
                                c2408e9 = c2408e10;
                                map = map2;
                                boolean z122 = z11;
                                objM4272g = c2408e6.m4272g(obj);
                                if (objM4272g != null) {
                                    if (objM4272g instanceof C2409F) {
                                        C2409F c2409f7 = (C2409F) objM4272g;
                                        Object[] objArr10 = c2409f7.f7794b;
                                        long[] jArr9 = c2409f7.f7793a;
                                        int length6 = jArr9.length - 2;
                                        if (length6 >= 0) {
                                            ?? r7 = z6;
                                            while (true) {
                                                long j13 = jArr9[r7];
                                                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i37 = 8 - ((~(r7 - length6)) >>> 31);
                                                    for (?? r8 = z6; r8 < i37; r8++) {
                                                        if ((j13 & 255) < 128) {
                                                            c2409f.m4279a(objArr10[(r7 << 3) + r8]);
                                                            z122 = true;
                                                        }
                                                        j13 >>= 8;
                                                    }
                                                    if (i37 != 8) {
                                                        break;
                                                    }
                                                    if (r7 == length6) {
                                                        break;
                                                    }
                                                    r7++;
                                                }
                                            }
                                        }
                                    } else {
                                        c2409f.m4279a(objM4272g);
                                        z122 = true;
                                    }
                                }
                                z11 = z122;
                            } else {
                                if (objM4272g6 instanceof C2409F) {
                                    C2409F c2409f8 = (C2409F) objM4272g6;
                                    Object[] objArr11 = c2409f8.f7794b;
                                    long[] jArr10 = c2409f8.f7793a;
                                    int length7 = jArr10.length - 2;
                                    if (length7 >= 0) {
                                        boolean z13 = z11;
                                        map = map2;
                                        int i38 = 0;
                                        while (true) {
                                            long j14 = jArr10[i38];
                                            long[] jArr11 = jArr10;
                                            Object[] objArr12 = objArr11;
                                            if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i39 = 8 - ((~(i38 - length7)) >>> 31);
                                                long j15 = j14;
                                                int i40 = 0;
                                                while (i40 < i39) {
                                                    if ((j15 & 255) < 128) {
                                                        C1311F c1311f3 = (C1311F) objArr12[(i38 << 3) + i40];
                                                        AbstractC1665j.m2983c(c1311f3, str3);
                                                        Object obj6 = map.get(c1311f3);
                                                        it2 = it3;
                                                        InterfaceC1334Q0 interfaceC1334Q03 = c1311f3.f4683f;
                                                        if (interfaceC1334Q03 == null) {
                                                            interfaceC1334Q03 = c1357e3;
                                                        }
                                                        str2 = str3;
                                                        if (interfaceC1334Q03.mo2498a(c1311f3.m2413h().f4678f, obj6)) {
                                                            obj2 = next;
                                                            c2408e = c2408e10;
                                                            i5 = i40;
                                                            c1483e.m2753b(c1311f3);
                                                        } else {
                                                            Object objM4272g7 = c2408e6.m4272g(c1311f3);
                                                            if (objM4272g7 == null) {
                                                                obj2 = next;
                                                                c2408e = c2408e10;
                                                                i5 = i40;
                                                                z8 = z13;
                                                                z13 = z8;
                                                            } else if (objM4272g7 instanceof C2409F) {
                                                                C2409F c2409f9 = (C2409F) objM4272g7;
                                                                Object[] objArr13 = c2409f9.f7794b;
                                                                long[] jArr12 = c2409f9.f7793a;
                                                                int length8 = jArr12.length - 2;
                                                                if (length8 >= 0) {
                                                                    c2408e = c2408e10;
                                                                    i5 = i40;
                                                                    int i41 = 0;
                                                                    while (true) {
                                                                        long j16 = jArr12[i41];
                                                                        obj2 = next;
                                                                        Object[] objArr14 = objArr13;
                                                                        if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                            int i42 = 8 - ((~(i41 - length8)) >>> 31);
                                                                            int i43 = 0;
                                                                            while (i43 < i42) {
                                                                                if ((j16 & 255) < 128) {
                                                                                    c2409f.m4279a(objArr14[(i41 << 3) + i43]);
                                                                                    z13 = true;
                                                                                }
                                                                                j16 >>= 8;
                                                                                i43++;
                                                                                jArr12 = jArr12;
                                                                            }
                                                                            jArr = jArr12;
                                                                            if (i42 != 8) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            jArr = jArr12;
                                                                        }
                                                                        if (i41 == length8) {
                                                                            break;
                                                                        }
                                                                        i41++;
                                                                        next = obj2;
                                                                        objArr13 = objArr14;
                                                                        jArr12 = jArr;
                                                                    }
                                                                }
                                                                z8 = z13;
                                                                z13 = z8;
                                                            } else {
                                                                obj2 = next;
                                                                c2408e = c2408e10;
                                                                i5 = i40;
                                                                c2409f.m4279a(objM4272g7);
                                                                z8 = true;
                                                                z13 = z8;
                                                            }
                                                        }
                                                    } else {
                                                        it2 = it3;
                                                        obj2 = next;
                                                        str2 = str3;
                                                        c2408e = c2408e10;
                                                        i5 = i40;
                                                    }
                                                    j15 >>= 8;
                                                    i40 = i5 + 1;
                                                    it3 = it2;
                                                    str3 = str2;
                                                    next = obj2;
                                                    c2408e10 = c2408e;
                                                }
                                                it = it3;
                                                obj = next;
                                                str = str3;
                                                c2408e9 = c2408e10;
                                                if (i39 != 8) {
                                                    break;
                                                }
                                            } else {
                                                it = it3;
                                                obj = next;
                                                str = str3;
                                                c2408e9 = c2408e10;
                                            }
                                            if (i38 == length7) {
                                                break;
                                            }
                                            i38++;
                                            it3 = it;
                                            objArr11 = objArr12;
                                            jArr10 = jArr11;
                                            str3 = str;
                                            next = obj;
                                            c2408e10 = c2408e9;
                                        }
                                        z11 = z13;
                                    }
                                } else {
                                    it = it3;
                                    obj = next;
                                    str = str3;
                                    c2408e9 = c2408e10;
                                    map = map2;
                                    C1311F c1311f4 = (C1311F) objM4272g6;
                                    Object obj7 = map.get(c1311f4);
                                    InterfaceC1334Q0 interfaceC1334Q04 = c1311f4.f4683f;
                                    if (interfaceC1334Q04 == null) {
                                        interfaceC1334Q04 = c1357e3;
                                    }
                                    if (interfaceC1334Q04.mo2498a(c1311f4.m2413h().f4678f, obj7)) {
                                        c1483e.m2753b(c1311f4);
                                    } else {
                                        Object objM4272g8 = c2408e6.m4272g(c1311f4);
                                        if (objM4272g8 == null) {
                                            z7 = z11;
                                            z11 = z7;
                                        } else {
                                            if (objM4272g8 instanceof C2409F) {
                                                C2409F c2409f10 = (C2409F) objM4272g8;
                                                Object[] objArr15 = c2409f10.f7794b;
                                                long[] jArr13 = c2409f10.f7793a;
                                                int length9 = jArr13.length - 2;
                                                if (length9 >= 0) {
                                                    boolean z14 = z11;
                                                    int i44 = 0;
                                                    while (true) {
                                                        long j17 = jArr13[i44];
                                                        if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i45 = 8 - ((~(i44 - length9)) >>> 31);
                                                            long j18 = j17;
                                                            for (int i46 = 0; i46 < i45; i46++) {
                                                                if ((j18 & 255) < 128) {
                                                                    c2409f.m4279a(objArr15[(i44 << 3) + i46]);
                                                                    z14 = true;
                                                                }
                                                                j18 >>= 8;
                                                            }
                                                            if (i45 != 8) {
                                                                z7 = z14;
                                                                break;
                                                            }
                                                        }
                                                        if (i44 == length9) {
                                                            z11 = z14;
                                                            break;
                                                        }
                                                        i44++;
                                                    }
                                                    z7 = z11;
                                                }
                                            } else {
                                                c2409f.m4279a(objM4272g8);
                                                z7 = true;
                                            }
                                            z11 = z7;
                                        }
                                    }
                                }
                                boolean z1222 = z11;
                                objM4272g = c2408e6.m4272g(obj);
                                if (objM4272g != null) {
                                }
                                z11 = z1222;
                            }
                        } finally {
                            c2087s.f6992j = false;
                        }
                    } else {
                        c2408e9 = c2408e10;
                        it = it3;
                        obj = next;
                        str = str3;
                        map = map2;
                        z6 = false;
                        boolean z12222 = z11;
                        objM4272g = c2408e6.m4272g(obj);
                        if (objM4272g != null) {
                        }
                        z11 = z12222;
                    }
                }
                it3 = it;
                map2 = map;
                str3 = str;
            }
            z5 = z11;
        }
        int i47 = 0;
        if (!c2087s.f6992j && (i6 = c1483e.f5183f) != 0) {
            Object[] objArr16 = c1483e.f5181d;
            int i48 = 0;
            while (i48 < i6) {
                C1311F c1311f5 = (C1311F) objArr16[i48];
                int iHashCode = Long.hashCode(AbstractC2082n.m3834j().mo3791g());
                Object objM4272g9 = c2408e6.m4272g(c1311f5);
                if (objM4272g9 != null) {
                    boolean z15 = objM4272g9 instanceof C2409F;
                    C2408E c2408e11 = c2087s.f6988f;
                    if (z15) {
                        C2409F c2409f11 = (C2409F) objM4272g9;
                        Object[] objArr17 = c2409f11.f7794b;
                        long[] jArr14 = c2409f11.f7793a;
                        int length10 = jArr14.length - 2;
                        if (length10 >= 0) {
                            int i49 = i47;
                            while (true) {
                                long j19 = jArr14[i49];
                                i8 = i48;
                                if ((((~j19) << 7) & j19 & j5) != j5) {
                                    int i50 = 8 - ((~(i49 - length10)) >>> 31);
                                    int i51 = 0;
                                    while (i51 < i50) {
                                        if ((j19 & 255) < 128) {
                                            i9 = i6;
                                            Object obj8 = objArr17[(i49 << 3) + i51];
                                            C2444z c2444z2 = (C2444z) c2408e11.m4272g(obj8);
                                            objArr2 = objArr16;
                                            if (c2444z2 == null) {
                                                c2444z = new C2444z();
                                                c2408e11.m4278m(obj8, c2444z);
                                            } else {
                                                c2444z = c2444z2;
                                            }
                                            c2087s.m3862b(c1311f5, iHashCode, obj8, c2444z);
                                        } else {
                                            i9 = i6;
                                            objArr2 = objArr16;
                                        }
                                        j19 >>= 8;
                                        i51++;
                                        i6 = i9;
                                        objArr16 = objArr2;
                                    }
                                    i7 = i6;
                                    objArr = objArr16;
                                    if (i50 == 8) {
                                        break;
                                    }
                                } else {
                                    i7 = i6;
                                    objArr = objArr16;
                                }
                                if (i49 != length10) {
                                    i49++;
                                    i48 = i8;
                                    i6 = i7;
                                    objArr16 = objArr;
                                }
                            }
                        } else {
                            i7 = i6;
                            objArr = objArr16;
                            i8 = i48;
                        }
                    } else {
                        i7 = i6;
                        objArr = objArr16;
                        i8 = i48;
                        C2444z c2444z3 = (C2444z) c2408e11.m4272g(objM4272g9);
                        if (c2444z3 == null) {
                            c2444z3 = new C2444z();
                            c2408e11.m4278m(objM4272g9, c2444z3);
                        }
                        c2087s.m3862b(c1311f5, iHashCode, objM4272g9, c2444z3);
                    }
                } else {
                    i7 = i6;
                    objArr = objArr16;
                    i8 = i48;
                }
                i48 = i8 + 1;
                i6 = i7;
                objArr16 = objArr;
                i47 = 0;
            }
            c1483e.m2758g();
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3862b(Object obj, int i5, Object obj2, C2444z c2444z) {
        int i6;
        if (this.f6993k > 0) {
            return;
        }
        int iM4363c = c2444z.m4363c(obj);
        if (iM4363c < 0) {
            iM4363c = ~iM4363c;
            i6 = -1;
        } else {
            i6 = c2444z.f7900c[iM4363c];
        }
        c2444z.f7899b[iM4363c] = obj;
        c2444z.f7900c[iM4363c] = i5;
        if ((obj instanceof C1311F) && i6 != i5) {
            C1309E c1309eM2413h = ((C1311F) obj).m2413h();
            this.f6995m.put(obj, c1309eM2413h.f4678f);
            C2444z c2444z2 = c1309eM2413h.f4677e;
            C2408E c2408e = this.f6994l;
            AbstractC2352g.m4181D(c2408e, obj);
            Object[] objArr = c2444z2.f7899b;
            long[] jArr = c2444z2.f7898a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j5 = jArr[i7];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((j5 & 255) < 128) {
                                InterfaceC2090v interfaceC2090v = (InterfaceC2090v) objArr[(i7 << 3) + i9];
                                if (interfaceC2090v instanceof AbstractC2091w) {
                                    ((AbstractC2091w) interfaceC2090v).m3870f(2);
                                }
                                AbstractC2352g.m4192e(c2408e, interfaceC2090v, obj);
                            }
                            j5 >>= 8;
                        }
                        if (i8 != 8) {
                            break;
                        } else if (i7 == length) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
            }
        }
        if (i6 == -1) {
            if (obj instanceof AbstractC2091w) {
                ((AbstractC2091w) obj).m3870f(2);
            }
            AbstractC2352g.m4192e(this.f6987e, obj, obj2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m3863c(Object obj, Object obj2) {
        C2408E c2408e = this.f6987e;
        AbstractC2352g.m4180C(c2408e, obj2, obj);
        if (!(obj2 instanceof C1311F) || c2408e.m4268c(obj2)) {
            return;
        }
        AbstractC2352g.m4181D(this.f6994l, obj2);
        this.f6995m.remove(obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3864d() {
        long[] jArr;
        long[] jArr2;
        long j5;
        char c5;
        long j6;
        int i5;
        boolean z5;
        long j7;
        C2408E c2408e = this.f6988f;
        long[] jArr3 = c2408e.f7787a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j8 = jArr3[i6];
            char c6 = 7;
            long j9 = -9187201950435737472L;
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8;
                int i8 = 8 - ((~(i6 - length)) >>> 31);
                int i9 = 0;
                while (i9 < i8) {
                    if ((j8 & 255) < 128) {
                        int i10 = (i6 << 3) + i9;
                        c5 = c6;
                        Object obj = c2408e.f7788b[i10];
                        j6 = j9;
                        C2444z c2444z = (C2444z) c2408e.f7789c[i10];
                        AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                        boolean zMo800H = ((InterfaceC0616r0) obj).mo800H();
                        if (!zMo800H) {
                            Object[] objArr = c2444z.f7899b;
                            int[] iArr = c2444z.f7900c;
                            long[] jArr4 = c2444z.f7898a;
                            int i11 = i7;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j5 = j8;
                                int i12 = 0;
                                while (true) {
                                    long j10 = jArr4[i12];
                                    long[] jArr5 = jArr4;
                                    z5 = zMo800H;
                                    if ((((~j10) << c5) & j10 & j6) != j6) {
                                        int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j10 & 255) < 128) {
                                                int i15 = (i12 << 3) + i14;
                                                j7 = j10;
                                                Object obj2 = objArr[i15];
                                                int i16 = iArr[i15];
                                                m3863c(obj, obj2);
                                            } else {
                                                j7 = j10;
                                            }
                                            j10 = j7 >> i11;
                                        }
                                        if (i13 != i11) {
                                            break;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        zMo800H = z5;
                                        jArr4 = jArr5;
                                        i11 = 8;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                j5 = j8;
                                z5 = zMo800H;
                            }
                            if (!z5) {
                                c2408e.m4277l(i10);
                            }
                            i5 = 8;
                        }
                    } else {
                        jArr2 = jArr3;
                        j5 = j8;
                        c5 = c6;
                        j6 = j9;
                        i5 = i7;
                    }
                    i9++;
                    i7 = i5;
                    j8 = j5 >> i5;
                    c6 = c5;
                    j9 = j6;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i8 != i7) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i6 == length) {
                return;
            }
            i6++;
            jArr3 = jArr;
        }
    }
}
