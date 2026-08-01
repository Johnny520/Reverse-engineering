package p126i8;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p010a9.InterfaceC0173a;
import p193n3.AbstractC5489b;
import p209o6.C5646i;
import p209o6.InterfaceC5644g;
import p360yb.AbstractC9658a;
import p360yb.InterfaceC9663f;
import p360yb.InterfaceC9664g;

/* JADX INFO: renamed from: i8.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3282g0 {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8949e = AtomicReferenceFieldUpdater.newUpdater(C3282g0.class, Object.class, "c");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8950f = AtomicReferenceFieldUpdater.newUpdater(C3282g0.class, Object.class, "d");

    /* JADX INFO: renamed from: a */
    public final String f8951a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5644g f8952b;

    /* JADX INFO: renamed from: c */
    public volatile /* synthetic */ Object f8953c;

    /* JADX INFO: renamed from: d */
    public volatile /* synthetic */ Object f8954d;

    public C3282g0(String str) {
        str.getClass();
        this.f8951a = str;
        this.f8952b = C5646i.f17766a.m22847b("FeatureRegistry[" + str + "]");
        this.f8953c = AbstractC9658a.m37777b();
        this.f8954d = AbstractC9658a.m37776a();
    }

    /* JADX INFO: renamed from: b */
    public static Object m12398b(C3282g0 c3282g0, String str) {
        return c3282g0.f8951a + " not found: \"" + str + "\"";
    }

    /* JADX INFO: renamed from: c */
    public static Object m12399c(C3282g0 c3282g0, String str) {
        return "Got " + c3282g0.f8951a + ": \"" + str + "\"";
    }

    /* JADX INFO: renamed from: d */
    public static Object m12400d(C3282g0 c3282g0, InterfaceC3266d interfaceC3266d) {
        return "Adding " + c3282g0.f8951a + ": \"" + interfaceC3266d.getKey() + "\"";
    }

    /* JADX INFO: renamed from: e */
    public static Object m12401e(C3282g0 c3282g0, String str) {
        return "Getting " + c3282g0.f8951a + ": \"" + str + "\"";
    }

    /* JADX INFO: renamed from: f */
    public static Object m12402f(C3282g0 c3282g0, InterfaceC3266d interfaceC3266d) {
        return "Added " + c3282g0.f8951a + ": \"" + interfaceC3266d.getKey() + "\"";
    }

    /* JADX INFO: renamed from: g */
    public static Object m12403g() {
        return "Notifying listeners on feature update";
    }

    /* JADX INFO: renamed from: m */
    public static final Object m12404m() {
        return "Notification should have feature key, but none found";
    }

    /* JADX INFO: renamed from: h */
    public final void m12405h(final InterfaceC3266d interfaceC3266d) {
        Object obj;
        InterfaceC9664g interfaceC9664g;
        interfaceC3266d.getClass();
        this.f8952b.mo22823d(new InterfaceC0173a() { // from class: i8.c0
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C3282g0.m12400d(this.f8800q, interfaceC3266d);
            }
        });
        do {
            obj = this.f8953c;
            interfaceC9664g = (InterfaceC9664g) obj;
        } while (!AbstractC5489b.m22334a(f8949e, this, obj, interfaceC9664g.put((Object) interfaceC3266d.getKey(), (Object) interfaceC3266d)));
        InterfaceC3266d interfaceC3266d2 = (InterfaceC3266d) interfaceC9664g.get(interfaceC3266d.getKey());
        this.f8952b.mo22823d(new InterfaceC0173a() { // from class: i8.d0
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C3282g0.m12402f(this.f8803q, interfaceC3266d);
            }
        });
        m12409l(interfaceC3266d2, interfaceC3266d);
    }

    /* JADX INFO: renamed from: i */
    public final void m12406i(InterfaceC3271e interfaceC3271e) {
        Object obj;
        interfaceC3271e.getClass();
        do {
            obj = this.f8954d;
        } while (!AbstractC5489b.m22334a(f8950f, this, obj, ((InterfaceC9663f) obj).add((Object) interfaceC3271e)));
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC3266d m12407j(final String str) {
        str.getClass();
        this.f8952b.mo22823d(new InterfaceC0173a() { // from class: i8.z
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C3282g0.m12401e(this.f9151q, str);
            }
        });
        InterfaceC3266d interfaceC3266d = (InterfaceC3266d) ((InterfaceC9664g) this.f8953c).get(str);
        InterfaceC5644g interfaceC5644g = this.f8952b;
        if (interfaceC3266d != null) {
            interfaceC5644g.mo22823d(new InterfaceC0173a() { // from class: i8.a0
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return C3282g0.m12399c(this.f8769q, str);
                }
            });
            return interfaceC3266d;
        }
        interfaceC5644g.mo22823d(new InterfaceC0173a() { // from class: i8.b0
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C3282g0.m12398b(this.f8796q, str);
            }
        });
        return interfaceC3266d;
    }

    /* JADX INFO: renamed from: k */
    public final Map m12408k() {
        return (Map) this.f8953c;
    }

    /* JADX INFO: renamed from: l */
    public final void m12409l(InterfaceC3266d interfaceC3266d, InterfaceC3266d interfaceC3266d2) {
        String key;
        if (interfaceC3266d == null || (key = interfaceC3266d.getKey()) == null) {
            if (interfaceC3266d2 == null) {
                this.f8952b.mo22825f(new InterfaceC0173a() { // from class: i8.e0
                    @Override // p010a9.InterfaceC0173a
                    public final Object invoke() {
                        return C3282g0.m12404m();
                    }
                });
                return;
            }
            key = interfaceC3266d2.getKey();
        }
        this.f8952b.mo22823d(new InterfaceC0173a() { // from class: i8.f0
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C3282g0.m12403g();
            }
        });
        Iterator it = ((Iterable) this.f8954d).iterator();
        while (it.hasNext()) {
            ((InterfaceC3271e) it.next()).mo12362a(key);
        }
    }
}
