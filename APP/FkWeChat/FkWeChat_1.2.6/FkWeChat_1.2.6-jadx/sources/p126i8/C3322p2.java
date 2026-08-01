package p126i8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p010a9.InterfaceC0173a;
import p172l8.C4700i0;
import p193n3.AbstractC5489b;
import p209o6.C5646i;
import p209o6.InterfaceC5644g;
import p360yb.AbstractC9658a;
import p360yb.InterfaceC9664g;

/* JADX INFO: renamed from: i8.p2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3322p2 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9012c = AtomicReferenceFieldUpdater.newUpdater(C3322p2.class, Object.class, "b");

    /* JADX INFO: renamed from: a */
    public final InterfaceC5644g f9013a = C5646i.f17766a.m22846a(new InterfaceC0173a() { // from class: i8.n2
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return C3322p2.m12439a();
        }
    });

    /* JADX INFO: renamed from: b */
    public volatile /* synthetic */ Object f9014b = AbstractC9658a.m37777b();

    /* JADX INFO: renamed from: a */
    public static C4700i0 m12439a() {
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static Object m12440b(String str) {
        return "Removing session: " + str;
    }

    /* JADX INFO: renamed from: c */
    public static Object m12441c(C3294i2 c3294i2) {
        return "Adding session: " + c3294i2.m12429Y();
    }

    /* JADX INFO: renamed from: d */
    public final void m12442d(final C3294i2 c3294i2) {
        Object obj;
        c3294i2.getClass();
        this.f9013a.mo22823d(new InterfaceC0173a() { // from class: i8.o2
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C3322p2.m12441c(c3294i2);
            }
        });
        do {
            obj = this.f9014b;
        } while (!AbstractC5489b.m22334a(f9012c, this, obj, ((InterfaceC9664g) obj).put((Object) c3294i2.m12429Y(), (Object) c3294i2)));
    }

    /* JADX INFO: renamed from: e */
    public final void m12443e(final String str) {
        Object obj;
        str.getClass();
        this.f9013a.mo22823d(new InterfaceC0173a() { // from class: i8.m2
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C3322p2.m12440b(str);
            }
        });
        do {
            obj = this.f9014b;
        } while (!AbstractC5489b.m22334a(f9012c, this, obj, ((InterfaceC9664g) obj).remove((Object) str)));
    }
}
