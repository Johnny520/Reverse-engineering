package p298u9;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p111ha.InterfaceC2937x;
import p128ia.C3368a;
import p128ia.C3369b;
import p213oa.C5691b;
import p299ub.AbstractC8611a0;
import p313v9.AbstractC8865f;

/* JADX INFO: renamed from: u9.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8571f implements InterfaceC2937x {

    /* JADX INFO: renamed from: c */
    public static final a f28610c = new a(null);

    /* JADX INFO: renamed from: a */
    public final Class f28611a;

    /* JADX INFO: renamed from: b */
    public final C3368a f28612b;

    public C8571f(Class cls, C3368a c3368a) {
        this.f28611a = cls;
        this.f28612b = c3368a;
    }

    @Override // p111ha.InterfaceC2937x
    /* JADX INFO: renamed from: a */
    public String mo10732a() {
        return AbstractC8611a0.m33068M(this.f28611a.getName(), '.', '/', false, 4, null) + ".class";
    }

    @Override // p111ha.InterfaceC2937x
    /* JADX INFO: renamed from: b */
    public C3368a mo10733b() {
        return this.f28612b;
    }

    @Override // p111ha.InterfaceC2937x
    /* JADX INFO: renamed from: c */
    public void mo10734c(InterfaceC2937x.d dVar, byte[] bArr) {
        dVar.getClass();
        C8568c.f28608a.m32980i(this.f28611a, dVar);
    }

    @Override // p111ha.InterfaceC2937x
    /* JADX INFO: renamed from: d */
    public void mo10735d(InterfaceC2937x.c cVar, byte[] bArr) {
        cVar.getClass();
        C8568c.f28608a.m32973b(this.f28611a, cVar);
    }

    /* JADX INFO: renamed from: e */
    public final Class m32985e() {
        return this.f28611a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8571f) && AbstractC1061t.m3842c(this.f28611a, ((C8571f) obj).f28611a);
    }

    @Override // p111ha.InterfaceC2937x
    /* JADX INFO: renamed from: h */
    public C5691b mo10736h() {
        return AbstractC8865f.m34029e(this.f28611a);
    }

    public int hashCode() {
        return this.f28611a.hashCode();
    }

    public String toString() {
        return C8571f.class.getName() + ": " + this.f28611a;
    }

    /* JADX INFO: renamed from: u9.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C8571f m32986a(Class cls) {
            cls.getClass();
            C3369b c3369b = new C3369b();
            C8568c.f28608a.m32973b(cls, c3369b);
            C3368a c3368aM12614n = c3369b.m12614n();
            AbstractC1043k abstractC1043k = null;
            if (c3368aM12614n == null) {
                return null;
            }
            return new C8571f(cls, c3368aM12614n, abstractC1043k);
        }

        public a() {
        }
    }

    public /* synthetic */ C8571f(Class cls, C3368a c3368a, AbstractC1043k abstractC1043k) {
        this(cls, c3368a);
    }
}
