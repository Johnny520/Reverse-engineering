package p298u9;

import p024b9.AbstractC1043k;
import p037cb.C1486n;
import p111ha.C2924k;
import p172l8.C4700i0;
import p229p9.InterfaceC6005h0;

/* JADX INFO: renamed from: u9.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8576k {

    /* JADX INFO: renamed from: c */
    public static final a f28617c = new a(null);

    /* JADX INFO: renamed from: a */
    public final C1486n f28618a;

    /* JADX INFO: renamed from: b */
    public final C8566a f28619b;

    public C8576k(C1486n c1486n, C8566a c8566a) {
        this.f28618a = c1486n;
        this.f28619b = c8566a;
    }

    /* JADX INFO: renamed from: a */
    public final C1486n m32991a() {
        return this.f28618a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC6005h0 m32992b() {
        return this.f28618a.m5839q();
    }

    /* JADX INFO: renamed from: c */
    public final C8566a m32993c() {
        return this.f28619b;
    }

    /* JADX INFO: renamed from: u9.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C8576k m32994a(ClassLoader classLoader) {
            classLoader.getClass();
            C8572g c8572g = new C8572g(classLoader);
            C2924k.a aVar = C2924k.f7730b;
            ClassLoader classLoader2 = C4700i0.class.getClassLoader();
            classLoader2.getClass();
            C2924k.a.C10094a c10094aM10665a = aVar.m10665a(c8572g, new C8572g(classLoader2), new C8569d(classLoader), "runtime module for " + classLoader, C8575j.f28616b, C8577l.f28620a);
            return new C8576k(c10094aM10665a.m10666a().m10664a(), new C8566a(c10094aM10665a.m10667b(), c8572g), null);
        }

        public a() {
        }
    }

    public /* synthetic */ C8576k(C1486n c1486n, C8566a c8566a, AbstractC1043k abstractC1043k) {
        this(c1486n, c8566a);
    }
}
