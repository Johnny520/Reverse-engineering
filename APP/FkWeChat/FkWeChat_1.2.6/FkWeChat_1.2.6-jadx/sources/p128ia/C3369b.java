package p128ia;

import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import la.C4723c;
import na.AbstractC5526a;
import p111ha.InterfaceC2937x;
import p128ia.C3368a;
import p213oa.C5691b;
import p213oa.C5692c;
import p213oa.C5695f;
import p229p9.InterfaceC6003g1;
import p358y9.AbstractC9626i0;
import ua.C8589f;

/* JADX INFO: renamed from: ia.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3369b implements InterfaceC2937x.c {

    /* JADX INFO: renamed from: j */
    public static boolean f9177j;

    /* JADX INFO: renamed from: k */
    public static final Map f9178k;

    /* JADX INFO: renamed from: a */
    public int[] f9179a = null;

    /* JADX INFO: renamed from: b */
    public String f9180b = null;

    /* JADX INFO: renamed from: c */
    public int f9181c = 0;

    /* JADX INFO: renamed from: d */
    public String f9182d = null;

    /* JADX INFO: renamed from: e */
    public String[] f9183e = null;

    /* JADX INFO: renamed from: f */
    public String[] f9184f = null;

    /* JADX INFO: renamed from: g */
    public String[] f9185g = null;

    /* JADX INFO: renamed from: h */
    public C3368a.a f9186h = null;

    /* JADX INFO: renamed from: i */
    public String[] f9187i = null;

    /* JADX INFO: renamed from: ia.b$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class b implements InterfaceC2937x.b {

        /* JADX INFO: renamed from: a */
        public final List f9188a = new ArrayList();

        /* JADX INFO: renamed from: f */
        private static /* synthetic */ void m12616f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i10 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i10 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i10 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i10 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p111ha.InterfaceC2937x.b
        /* JADX INFO: renamed from: a */
        public void mo10643a() {
            mo12617g((String[]) this.f9188a.toArray(new String[0]));
        }

        @Override // p111ha.InterfaceC2937x.b
        /* JADX INFO: renamed from: b */
        public void mo10644b(Object obj) {
            if (obj instanceof String) {
                this.f9188a.add((String) obj);
            }
        }

        @Override // p111ha.InterfaceC2937x.b
        /* JADX INFO: renamed from: c */
        public void mo10645c(C8589f c8589f) {
            if (c8589f == null) {
                m12616f(2);
            }
        }

        @Override // p111ha.InterfaceC2937x.b
        /* JADX INFO: renamed from: d */
        public InterfaceC2937x.a mo10646d(C5691b c5691b) {
            if (c5691b != null) {
                return null;
            }
            m12616f(3);
            return null;
        }

        @Override // p111ha.InterfaceC2937x.b
        /* JADX INFO: renamed from: e */
        public void mo10647e(C5691b c5691b, C5695f c5695f) {
            if (c5691b == null) {
                m12616f(0);
            }
            if (c5695f == null) {
                m12616f(1);
            }
        }

        /* JADX INFO: renamed from: g */
        public abstract void mo12617g(String[] strArr);
    }

    static {
        try {
            f9177j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f9177j = false;
        }
        HashMap map = new HashMap();
        f9178k = map;
        map.put(C5691b.m22981k(new C5692c("kotlin.jvm.internal.KotlinClass")), C3368a.a.f9170u);
        map.put(C5691b.m22981k(new C5692c("kotlin.jvm.internal.KotlinFileFacade")), C3368a.a.f9171v);
        map.put(C5691b.m22981k(new C5692c("kotlin.jvm.internal.KotlinMultifileClass")), C3368a.a.f9173x);
        map.put(C5691b.m22981k(new C5692c("kotlin.jvm.internal.KotlinMultifileClassPart")), C3368a.a.f9174y);
        map.put(C5691b.m22981k(new C5692c("kotlin.jvm.internal.KotlinSyntheticClass")), C3368a.a.f9172w);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m12604d(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // p111ha.InterfaceC2937x.c
    /* JADX INFO: renamed from: c */
    public InterfaceC2937x.a mo10584c(C5691b c5691b, InterfaceC6003g1 interfaceC6003g1) {
        C3368a.a aVar;
        if (c5691b == null) {
            m12604d(0);
        }
        if (interfaceC6003g1 == null) {
            m12604d(1);
        }
        C5692c c5692cM22982a = c5691b.m22982a();
        if (c5692cM22982a.equals(AbstractC9626i0.f32762a)) {
            return new c();
        }
        if (c5692cM22982a.equals(AbstractC9626i0.f32781t)) {
            return new d();
        }
        if (f9177j || this.f9186h != null || (aVar = (C3368a.a) f9178k.get(c5691b)) == null) {
            return null;
        }
        this.f9186h = aVar;
        return new e();
    }

    /* JADX INFO: renamed from: m */
    public C3368a m12613m(C4723c c4723c) {
        if (this.f9186h == null || this.f9179a == null) {
            return null;
        }
        C4723c c4723c2 = new C4723c(this.f9179a, (this.f9181c & 8) != 0);
        if (!c4723c2.m18863h(c4723c)) {
            this.f9185g = this.f9183e;
            this.f9183e = null;
        } else if (m12615o() && this.f9183e == null) {
            return null;
        }
        String[] strArr = this.f9187i;
        return new C3368a(this.f9186h, c4723c2, this.f9183e, this.f9185g, this.f9184f, this.f9180b, this.f9181c, this.f9182d, strArr != null ? AbstractC5526a.m22528e(strArr) : null);
    }

    /* JADX INFO: renamed from: n */
    public C3368a m12614n() {
        return m12613m(C4723c.f14003i);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m12615o() {
        C3368a.a aVar = this.f9186h;
        return aVar == C3368a.a.f9170u || aVar == C3368a.a.f9171v || aVar == C3368a.a.f9174y;
    }

    /* JADX INFO: renamed from: ia.b$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class c implements InterfaceC2937x.a {

        /* JADX INFO: renamed from: ia.b$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public class a extends b {
            public a() {
            }

            /* JADX INFO: renamed from: f */
            public static /* synthetic */ void m12621f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // p128ia.C3369b.b
            /* JADX INFO: renamed from: g */
            public void mo12617g(String[] strArr) {
                if (strArr == null) {
                    m12621f(0);
                }
                C3369b.this.f9183e = strArr;
            }
        }

        /* JADX INFO: renamed from: ia.b$c$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public class b extends b {
            public b() {
            }

            /* JADX INFO: renamed from: f */
            private static /* synthetic */ void m12622f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // p128ia.C3369b.b
            /* JADX INFO: renamed from: g */
            public void mo12617g(String[] strArr) {
                if (strArr == null) {
                    m12622f(0);
                }
                C3369b.this.f9184f = strArr;
            }
        }

        public c() {
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m12618g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: b */
        public InterfaceC2937x.b mo10634b(C5695f c5695f) {
            String strM23030c = c5695f != null ? c5695f.m23030c() : null;
            if ("d1".equals(strM23030c)) {
                return m12619h();
            }
            if ("d2".equals(strM23030c)) {
                return m12620i();
            }
            return null;
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: c */
        public void mo10635c(C5695f c5695f, C8589f c8589f) {
            if (c8589f == null) {
                m12618g(0);
            }
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: d */
        public void mo10636d(C5695f c5695f, C5691b c5691b, C5695f c5695f2) {
            if (c5691b == null) {
                m12618g(1);
            }
            if (c5695f2 == null) {
                m12618g(2);
            }
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: e */
        public void mo10637e(C5695f c5695f, Object obj) {
            if (c5695f == null) {
                return;
            }
            String strM23030c = c5695f.m23030c();
            if ("k".equals(strM23030c)) {
                if (obj instanceof Integer) {
                    C3369b.this.f9186h = C3368a.a.m12602g(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(strM23030c)) {
                if (obj instanceof int[]) {
                    C3369b.this.f9179a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strM23030c)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    C3369b.this.f9180b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strM23030c)) {
                if (obj instanceof Integer) {
                    C3369b.this.f9181c = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(strM23030c) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                C3369b.this.f9182d = str2;
            }
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: f */
        public InterfaceC2937x.a mo10638f(C5695f c5695f, C5691b c5691b) {
            if (c5691b != null) {
                return null;
            }
            m12618g(3);
            return null;
        }

        /* JADX INFO: renamed from: h */
        public final InterfaceC2937x.b m12619h() {
            return new a();
        }

        /* JADX INFO: renamed from: i */
        public final InterfaceC2937x.b m12620i() {
            return new b();
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: a */
        public void mo10641a() {
        }
    }

    /* JADX INFO: renamed from: ia.b$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class d implements InterfaceC2937x.a {

        /* JADX INFO: renamed from: ia.b$d$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public class a extends b {
            public a() {
            }

            /* JADX INFO: renamed from: f */
            private static /* synthetic */ void m12625f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // p128ia.C3369b.b
            /* JADX INFO: renamed from: g */
            public void mo12617g(String[] strArr) {
                if (strArr == null) {
                    m12625f(0);
                }
                C3369b.this.f9187i = strArr;
            }
        }

        public d() {
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m12623g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: b */
        public InterfaceC2937x.b mo10634b(C5695f c5695f) {
            if ("b".equals(c5695f != null ? c5695f.m23030c() : null)) {
                return m12624h();
            }
            return null;
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: c */
        public void mo10635c(C5695f c5695f, C8589f c8589f) {
            if (c8589f == null) {
                m12623g(0);
            }
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: d */
        public void mo10636d(C5695f c5695f, C5691b c5691b, C5695f c5695f2) {
            if (c5691b == null) {
                m12623g(1);
            }
            if (c5695f2 == null) {
                m12623g(2);
            }
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: f */
        public InterfaceC2937x.a mo10638f(C5695f c5695f, C5691b c5691b) {
            if (c5691b != null) {
                return null;
            }
            m12623g(3);
            return null;
        }

        /* JADX INFO: renamed from: h */
        public final InterfaceC2937x.b m12624h() {
            return new a();
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: a */
        public void mo10641a() {
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: e */
        public void mo10637e(C5695f c5695f, Object obj) {
        }
    }

    /* JADX INFO: renamed from: ia.b$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class e implements InterfaceC2937x.a {

        /* JADX INFO: renamed from: ia.b$e$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public class a extends b {
            public a() {
            }

            /* JADX INFO: renamed from: f */
            private static /* synthetic */ void m12629f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // p128ia.C3369b.b
            /* JADX INFO: renamed from: g */
            public void mo12617g(String[] strArr) {
                if (strArr == null) {
                    m12629f(0);
                }
                C3369b.this.f9183e = strArr;
            }
        }

        /* JADX INFO: renamed from: ia.b$e$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public class b extends b {
            public b() {
            }

            /* JADX INFO: renamed from: f */
            private static /* synthetic */ void m12630f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // p128ia.C3369b.b
            /* JADX INFO: renamed from: g */
            public void mo12617g(String[] strArr) {
                if (strArr == null) {
                    m12630f(0);
                }
                C3369b.this.f9184f = strArr;
            }
        }

        public e() {
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m12626g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX INFO: renamed from: h */
        private InterfaceC2937x.b m12627h() {
            return new a();
        }

        /* JADX INFO: renamed from: i */
        private InterfaceC2937x.b m12628i() {
            return new b();
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: b */
        public InterfaceC2937x.b mo10634b(C5695f c5695f) {
            String strM23030c = c5695f != null ? c5695f.m23030c() : null;
            if ("data".equals(strM23030c) || "filePartClassNames".equals(strM23030c)) {
                return m12627h();
            }
            if ("strings".equals(strM23030c)) {
                return m12628i();
            }
            return null;
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: c */
        public void mo10635c(C5695f c5695f, C8589f c8589f) {
            if (c8589f == null) {
                m12626g(0);
            }
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: d */
        public void mo10636d(C5695f c5695f, C5691b c5691b, C5695f c5695f2) {
            if (c5691b == null) {
                m12626g(1);
            }
            if (c5695f2 == null) {
                m12626g(2);
            }
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: e */
        public void mo10637e(C5695f c5695f, Object obj) {
            if (c5695f == null) {
                return;
            }
            String strM23030c = c5695f.m23030c();
            if ("version".equals(strM23030c)) {
                if (obj instanceof int[]) {
                    C3369b.this.f9179a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strM23030c)) {
                C3369b.this.f9180b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: f */
        public InterfaceC2937x.a mo10638f(C5695f c5695f, C5691b c5691b) {
            if (c5691b != null) {
                return null;
            }
            m12626g(3);
            return null;
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: a */
        public void mo10641a() {
        }
    }

    @Override // p111ha.InterfaceC2937x.c
    /* JADX INFO: renamed from: a */
    public void mo10583a() {
    }
}
