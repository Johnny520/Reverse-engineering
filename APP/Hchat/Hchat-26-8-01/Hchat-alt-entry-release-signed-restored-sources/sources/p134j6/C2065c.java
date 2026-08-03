package p134j6;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import p089g1.C1275d;
import p105h6.AbstractC1622n;
import p105h6.C1614f;
import p105h6.InterfaceC1623o;
import p123i6.InterfaceC1989a;
import p151k6.C2301l;
import p194n6.C2901a;
import p208o6.C3066a;

/* JADX INFO: renamed from: j6.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2065c extends AbstractC1622n {

    /* JADX INFO: renamed from: a */
    public volatile AbstractC1622n f6938a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f6939b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1614f f6940c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2901a f6941d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2066d f6942e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2065c(C2066d c2066d, boolean z9, C1614f c1614f, C2901a c2901a) {
        this.f6942e = c2066d;
        this.f6939b = z9;
        this.f6940c = c1614f;
        this.f6941d = c2901a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082 A[SYNTHETIC] */
    @Override // p105h6.AbstractC1622n
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4127b(C3066a c3066a, Object obj) {
        Iterator it;
        if (this.f6939b) {
            c3066a.m6508l();
            return;
        }
        AbstractC1622n abstractC1622nM4130b = this.f6938a;
        if (abstractC1622nM4130b == null) {
            C1614f c1614f = this.f6940c;
            InterfaceC1623o interfaceC1623o = this.f6942e;
            C2901a c2901a = this.f6941d;
            C2301l c2301l = c1614f.f5296d;
            c2301l.getClass();
            ConcurrentHashMap concurrentHashMap = c2301l.f7624h;
            if (interfaceC1623o == C2301l.f7622i) {
                interfaceC1623o = c2301l;
                it = c1614f.f5297e.iterator();
                boolean z9 = false;
                while (true) {
                    if (it.hasNext()) {
                        InterfaceC1623o interfaceC1623o2 = (InterfaceC1623o) it.next();
                        if (z9) {
                            AbstractC1622n abstractC1622nMo4137a = interfaceC1623o2.mo4137a(c1614f, c2901a);
                            if (abstractC1622nMo4137a != null) {
                                abstractC1622nM4130b = abstractC1622nMo4137a;
                                break;
                            }
                        } else if (interfaceC1623o2 == interfaceC1623o) {
                            z9 = true;
                        }
                    } else {
                        if (z9) {
                            C1275d.m3412f(c2901a, "GSON cannot serialize or deserialize ");
                            return;
                        }
                        abstractC1622nM4130b = c1614f.m4130b(c2901a);
                    }
                }
                this.f6938a = abstractC1622nM4130b;
            } else {
                Class cls = c2901a.f9368a;
                InterfaceC1623o interfaceC1623o3 = (InterfaceC1623o) concurrentHashMap.get(cls);
                if (interfaceC1623o3 != null) {
                    if (interfaceC1623o3 == interfaceC1623o) {
                    }
                    it = c1614f.f5297e.iterator();
                    boolean z92 = false;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    this.f6938a = abstractC1622nM4130b;
                } else {
                    InterfaceC1989a interfaceC1989a = (InterfaceC1989a) cls.getAnnotation(InterfaceC1989a.class);
                    if (interfaceC1989a != null) {
                        Class clsValue = interfaceC1989a.value();
                        if (InterfaceC1623o.class.isAssignableFrom(clsValue)) {
                            InterfaceC1623o interfaceC1623o4 = (InterfaceC1623o) c2301l.f7623g.m4042c(new C2901a(clsValue), true).mo4937d();
                            InterfaceC1623o interfaceC1623o5 = (InterfaceC1623o) concurrentHashMap.putIfAbsent(cls, interfaceC1623o4);
                            if (interfaceC1623o5 != null) {
                                interfaceC1623o4 = interfaceC1623o5;
                            }
                            if (interfaceC1623o4 == interfaceC1623o) {
                            }
                        }
                    }
                    it = c1614f.f5297e.iterator();
                    boolean z922 = false;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    this.f6938a = abstractC1622nM4130b;
                }
            }
        }
        abstractC1622nM4130b.mo4127b(c3066a, obj);
    }
}
