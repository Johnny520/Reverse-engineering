package la;

import p143ja.C3770c;
import p143ja.EnumC3778k;
import p143ja.EnumC3779l;
import p143ja.EnumC3792y;
import p154k5.C3972g;
import qa.AbstractC6354k;

/* JADX INFO: renamed from: la.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4722b {

    /* JADX INFO: renamed from: A */
    public static final b f13957A;

    /* JADX INFO: renamed from: B */
    public static final b f13958B;

    /* JADX INFO: renamed from: C */
    public static final b f13959C;

    /* JADX INFO: renamed from: D */
    public static final b f13960D;

    /* JADX INFO: renamed from: E */
    public static final b f13961E;

    /* JADX INFO: renamed from: F */
    public static final b f13962F;

    /* JADX INFO: renamed from: G */
    public static final b f13963G;

    /* JADX INFO: renamed from: H */
    public static final b f13964H;

    /* JADX INFO: renamed from: I */
    public static final b f13965I;

    /* JADX INFO: renamed from: J */
    public static final b f13966J;

    /* JADX INFO: renamed from: K */
    public static final b f13967K;

    /* JADX INFO: renamed from: L */
    public static final b f13968L;

    /* JADX INFO: renamed from: M */
    public static final b f13969M;

    /* JADX INFO: renamed from: N */
    public static final b f13970N;

    /* JADX INFO: renamed from: O */
    public static final b f13971O;

    /* JADX INFO: renamed from: P */
    public static final b f13972P;

    /* JADX INFO: renamed from: a */
    public static final b f13973a;

    /* JADX INFO: renamed from: b */
    public static final b f13974b;

    /* JADX INFO: renamed from: c */
    public static final b f13975c;

    /* JADX INFO: renamed from: d */
    public static final d f13976d;

    /* JADX INFO: renamed from: e */
    public static final d f13977e;

    /* JADX INFO: renamed from: f */
    public static final d f13978f;

    /* JADX INFO: renamed from: g */
    public static final b f13979g;

    /* JADX INFO: renamed from: h */
    public static final b f13980h;

    /* JADX INFO: renamed from: i */
    public static final b f13981i;

    /* JADX INFO: renamed from: j */
    public static final b f13982j;

    /* JADX INFO: renamed from: k */
    public static final b f13983k;

    /* JADX INFO: renamed from: l */
    public static final b f13984l;

    /* JADX INFO: renamed from: m */
    public static final b f13985m;

    /* JADX INFO: renamed from: n */
    public static final b f13986n;

    /* JADX INFO: renamed from: o */
    public static final b f13987o;

    /* JADX INFO: renamed from: p */
    public static final d f13988p;

    /* JADX INFO: renamed from: q */
    public static final b f13989q;

    /* JADX INFO: renamed from: r */
    public static final b f13990r;

    /* JADX INFO: renamed from: s */
    public static final b f13991s;

    /* JADX INFO: renamed from: t */
    public static final b f13992t;

    /* JADX INFO: renamed from: u */
    public static final b f13993u;

    /* JADX INFO: renamed from: v */
    public static final b f13994v;

    /* JADX INFO: renamed from: w */
    public static final b f13995w;

    /* JADX INFO: renamed from: x */
    public static final b f13996x;

    /* JADX INFO: renamed from: y */
    public static final b f13997y;

    /* JADX INFO: renamed from: z */
    public static final b f13998z;

    /* JADX INFO: renamed from: la.b$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b extends d {
        public b(int i10) {
            super(i10, 1);
        }

        @Override // la.AbstractC4722b.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean mo18852d(int i10) {
            return Boolean.valueOf((i10 & (1 << this.f14000a)) != 0);
        }

        @Override // la.AbstractC4722b.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public int mo18853e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f14000a;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: la.b$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c extends d {

        /* JADX INFO: renamed from: c */
        public final AbstractC6354k.a[] f13999c;

        public c(int i10, AbstractC6354k.a[] aVarArr) {
            super(i10, m18857g(aVarArr));
            this.f13999c = aVarArr;
        }

        /* JADX INFO: renamed from: f */
        private static /* synthetic */ void m18856f(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        /* JADX INFO: renamed from: g */
        public static int m18857g(Object[] objArr) {
            if (objArr == null) {
                m18856f(0);
            }
            int length = objArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i10 = 31; i10 >= 0; i10--) {
                if (((1 << i10) & length) != 0) {
                    return i10 + 1;
                }
            }
            C3972g.m15749a("Empty enum: ", objArr.getClass());
            return 0;
        }

        @Override // la.AbstractC4722b.d
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public AbstractC6354k.a mo18852d(int i10) {
            int i11 = (1 << this.f14001b) - 1;
            int i12 = this.f14000a;
            int i13 = (i10 & (i11 << i12)) >> i12;
            for (AbstractC6354k.a aVar : this.f13999c) {
                if (aVar.mo14092b() == i13) {
                    return aVar;
                }
            }
            return null;
        }

        @Override // la.AbstractC4722b.d
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public int mo18853e(AbstractC6354k.a aVar) {
            return aVar.mo14092b() << this.f14000a;
        }
    }

    /* JADX INFO: renamed from: la.b$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class d {

        /* JADX INFO: renamed from: a */
        public final int f14000a;

        /* JADX INFO: renamed from: b */
        public final int f14001b;

        public d(int i10, int i11) {
            this.f14000a = i10;
            this.f14001b = i11;
        }

        /* JADX INFO: renamed from: a */
        public static d m18860a(d dVar, AbstractC6354k.a[] aVarArr) {
            return new c(dVar.f14000a + dVar.f14001b, aVarArr);
        }

        /* JADX INFO: renamed from: b */
        public static b m18861b(d dVar) {
            return new b(dVar.f14000a + dVar.f14001b);
        }

        /* JADX INFO: renamed from: c */
        public static b m18862c() {
            return new b(0);
        }

        /* JADX INFO: renamed from: d */
        public abstract Object mo18852d(int i10);

        /* JADX INFO: renamed from: e */
        public abstract int mo18853e(Object obj);
    }

    static {
        b bVarM18862c = d.m18862c();
        f13973a = bVarM18862c;
        f13974b = d.m18861b(bVarM18862c);
        b bVarM18862c2 = d.m18862c();
        f13975c = bVarM18862c2;
        d dVarM18860a = d.m18860a(bVarM18862c2, EnumC3792y.values());
        f13976d = dVarM18860a;
        d dVarM18860a2 = d.m18860a(dVarM18860a, EnumC3779l.values());
        f13977e = dVarM18860a2;
        d dVarM18860a3 = d.m18860a(dVarM18860a2, C3770c.c.values());
        f13978f = dVarM18860a3;
        b bVarM18861b = d.m18861b(dVarM18860a3);
        f13979g = bVarM18861b;
        b bVarM18861b2 = d.m18861b(bVarM18861b);
        f13980h = bVarM18861b2;
        b bVarM18861b3 = d.m18861b(bVarM18861b2);
        f13981i = bVarM18861b3;
        b bVarM18861b4 = d.m18861b(bVarM18861b3);
        f13982j = bVarM18861b4;
        b bVarM18861b5 = d.m18861b(bVarM18861b4);
        f13983k = bVarM18861b5;
        b bVarM18861b6 = d.m18861b(bVarM18861b5);
        f13984l = bVarM18861b6;
        f13985m = d.m18861b(bVarM18861b6);
        b bVarM18861b7 = d.m18861b(dVarM18860a);
        f13986n = bVarM18861b7;
        f13987o = d.m18861b(bVarM18861b7);
        d dVarM18860a4 = d.m18860a(dVarM18860a2, EnumC3778k.values());
        f13988p = dVarM18860a4;
        b bVarM18861b8 = d.m18861b(dVarM18860a4);
        f13989q = bVarM18861b8;
        b bVarM18861b9 = d.m18861b(bVarM18861b8);
        f13990r = bVarM18861b9;
        b bVarM18861b10 = d.m18861b(bVarM18861b9);
        f13991s = bVarM18861b10;
        b bVarM18861b11 = d.m18861b(bVarM18861b10);
        f13992t = bVarM18861b11;
        b bVarM18861b12 = d.m18861b(bVarM18861b11);
        f13993u = bVarM18861b12;
        b bVarM18861b13 = d.m18861b(bVarM18861b12);
        f13994v = bVarM18861b13;
        b bVarM18861b14 = d.m18861b(bVarM18861b13);
        f13995w = bVarM18861b14;
        f13996x = d.m18861b(bVarM18861b14);
        b bVarM18861b15 = d.m18861b(dVarM18860a4);
        f13997y = bVarM18861b15;
        b bVarM18861b16 = d.m18861b(bVarM18861b15);
        f13998z = bVarM18861b16;
        b bVarM18861b17 = d.m18861b(bVarM18861b16);
        f13957A = bVarM18861b17;
        b bVarM18861b18 = d.m18861b(bVarM18861b17);
        f13958B = bVarM18861b18;
        b bVarM18861b19 = d.m18861b(bVarM18861b18);
        f13959C = bVarM18861b19;
        b bVarM18861b20 = d.m18861b(bVarM18861b19);
        f13960D = bVarM18861b20;
        b bVarM18861b21 = d.m18861b(bVarM18861b20);
        f13961E = bVarM18861b21;
        b bVarM18861b22 = d.m18861b(bVarM18861b21);
        f13962F = bVarM18861b22;
        f13963G = d.m18861b(bVarM18861b22);
        b bVarM18861b23 = d.m18861b(bVarM18862c2);
        f13964H = bVarM18861b23;
        b bVarM18861b24 = d.m18861b(bVarM18861b23);
        f13965I = bVarM18861b24;
        f13966J = d.m18861b(bVarM18861b24);
        b bVarM18861b25 = d.m18861b(dVarM18860a2);
        f13967K = bVarM18861b25;
        b bVarM18861b26 = d.m18861b(bVarM18861b25);
        f13968L = bVarM18861b26;
        f13969M = d.m18861b(bVarM18861b26);
        b bVarM18862c3 = d.m18862c();
        f13970N = bVarM18862c3;
        f13971O = d.m18861b(bVarM18862c3);
        f13972P = d.m18862c();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m18850a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 2
            r3 = 1
            if (r5 == r3) goto L2b
            if (r5 == r2) goto L26
            r4 = 5
            if (r5 == r4) goto L2b
            r4 = 6
            if (r5 == r4) goto L21
            r4 = 8
            if (r5 == r4) goto L2b
            r4 = 9
            if (r5 == r4) goto L21
            r4 = 11
            if (r5 == r4) goto L2b
            java.lang.String r4 = "visibility"
            r0[r1] = r4
            goto L2f
        L21:
            java.lang.String r4 = "memberKind"
            r0[r1] = r4
            goto L2f
        L26:
            java.lang.String r4 = "kind"
            r0[r1] = r4
            goto L2f
        L2b:
            java.lang.String r4 = "modality"
            r0[r1] = r4
        L2f:
            java.lang.String r1 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r3] = r1
            switch(r5) {
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L3b;
                case 11: goto L3b;
                default: goto L36;
            }
        L36:
            java.lang.String r5 = "getClassFlags"
            r0[r2] = r5
            goto L4e
        L3b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r2] = r5
            goto L4e
        L40:
            java.lang.String r5 = "getPropertyFlags"
            r0[r2] = r5
            goto L4e
        L45:
            java.lang.String r5 = "getFunctionFlags"
            r0[r2] = r5
            goto L4e
        L4a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r2] = r5
        L4e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: la.AbstractC4722b.m18850a(int):void");
    }

    /* JADX INFO: renamed from: b */
    public static int m18851b(boolean z10, EnumC3792y enumC3792y, EnumC3779l enumC3779l, boolean z11, boolean z12, boolean z13) {
        if (enumC3792y == null) {
            m18850a(10);
        }
        if (enumC3779l == null) {
            m18850a(11);
        }
        return f13975c.mo18853e(Boolean.valueOf(z10)) | f13977e.mo18853e(enumC3779l) | f13976d.mo18853e(enumC3792y) | f13967K.mo18853e(Boolean.valueOf(z11)) | f13968L.mo18853e(Boolean.valueOf(z12)) | f13969M.mo18853e(Boolean.valueOf(z13));
    }
}
