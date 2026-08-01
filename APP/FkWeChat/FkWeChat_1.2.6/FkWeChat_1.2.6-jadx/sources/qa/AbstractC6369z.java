package qa;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: renamed from: qa.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6369z {

    /* JADX INFO: renamed from: a */
    public static final int f20068a = m25335c(1, 3);

    /* JADX INFO: renamed from: b */
    public static final int f20069b = m25335c(1, 4);

    /* JADX INFO: renamed from: c */
    public static final int f20070c = m25335c(2, 0);

    /* JADX INFO: renamed from: d */
    public static final int f20071d = m25335c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'u' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: qa.z$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b {

        /* JADX INFO: renamed from: A */
        public static final b f20072A;

        /* JADX INFO: renamed from: B */
        public static final b f20073B;

        /* JADX INFO: renamed from: C */
        public static final b f20074C;

        /* JADX INFO: renamed from: D */
        public static final b f20075D;

        /* JADX INFO: renamed from: E */
        public static final b f20076E;

        /* JADX INFO: renamed from: F */
        public static final b f20077F;

        /* JADX INFO: renamed from: G */
        public static final b f20078G;

        /* JADX INFO: renamed from: H */
        public static final b f20079H;

        /* JADX INFO: renamed from: I */
        public static final b f20080I;

        /* JADX INFO: renamed from: J */
        public static final b f20081J;

        /* JADX INFO: renamed from: K */
        public static final /* synthetic */ b[] f20082K;

        /* JADX INFO: renamed from: s */
        public static final b f20083s;

        /* JADX INFO: renamed from: t */
        public static final b f20084t;

        /* JADX INFO: renamed from: u */
        public static final b f20085u;

        /* JADX INFO: renamed from: v */
        public static final b f20086v;

        /* JADX INFO: renamed from: w */
        public static final b f20087w;

        /* JADX INFO: renamed from: x */
        public static final b f20088x;

        /* JADX INFO: renamed from: y */
        public static final b f20089y;

        /* JADX INFO: renamed from: z */
        public static final b f20090z;

        /* JADX INFO: renamed from: q */
        public final c f20091q;

        /* JADX INFO: renamed from: r */
        public final int f20092r;

        /* JADX INFO: renamed from: qa.z$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public enum a extends b {
            public a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // qa.AbstractC6369z.b
            /* JADX INFO: renamed from: g */
            public boolean mo25338g() {
                return false;
            }
        }

        /* JADX INFO: renamed from: qa.z$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public enum C10185b extends b {
            public C10185b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // qa.AbstractC6369z.b
            /* JADX INFO: renamed from: g */
            public boolean mo25338g() {
                return false;
            }
        }

        /* JADX INFO: renamed from: qa.z$b$c */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public enum c extends b {
            public c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // qa.AbstractC6369z.b
            /* JADX INFO: renamed from: g */
            public boolean mo25338g() {
                return false;
            }
        }

        /* JADX INFO: renamed from: qa.z$b$d */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public enum d extends b {
            public d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // qa.AbstractC6369z.b
            /* JADX INFO: renamed from: g */
            public boolean mo25338g() {
                return false;
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f20083s = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f20084t = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f20085u = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f20086v = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f20087w = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f20088x = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f20089y = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f20090z = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f20072A = aVar;
            c cVar3 = c.MESSAGE;
            C10185b c10185b = new C10185b("GROUP", 9, cVar3, 3);
            f20073B = c10185b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f20074C = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f20075D = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f20076E = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f20077F = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f20078G = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f20079H = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f20080I = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f20081J = bVar14;
            f20082K = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c10185b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public b(String str, int i10, c cVar, int i11) {
            this.f20091q = cVar;
            this.f20092r = i11;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f20082K.clone();
        }

        /* JADX INFO: renamed from: a */
        public c m25336a() {
            return this.f20091q;
        }

        /* JADX INFO: renamed from: c */
        public int m25337c() {
            return this.f20092r;
        }

        /* JADX INFO: renamed from: g */
        public boolean mo25338g() {
            return true;
        }
    }

    /* JADX INFO: renamed from: qa.z$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(_UrlKt.FRAGMENT_ENCODE_SET),
        BYTE_STRING(AbstractC6348e.f19966q),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: q */
        public final Object f20103q;

        c(Object obj) {
            this.f20103q = obj;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m25333a(int i10) {
        return i10 >>> 3;
    }

    /* JADX INFO: renamed from: b */
    public static int m25334b(int i10) {
        return i10 & 7;
    }

    /* JADX INFO: renamed from: c */
    public static int m25335c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}
