package p339x6;

import ec.InterfaceC2156m;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p024b9.AbstractC1043k;
import p024b9.C1026b0;
import p098g9.InterfaceC2548b;
import p193n3.AbstractC5489b;
import p215oc.C5729x;

/* JADX INFO: renamed from: x6.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9451d {

    /* JADX INFO: renamed from: a */
    public static final e f32117a = new e(null);

    /* JADX INFO: renamed from: b */
    public static final AtomicReferenceFieldUpdater[] f32118b;
    private volatile InterfaceC2156m acceptHandlerReference;
    private volatile InterfaceC2156m connectHandlerReference;
    private volatile InterfaceC2156m readHandlerReference;
    private volatile InterfaceC2156m writeHandlerReference;

    /* JADX INFO: renamed from: x6.d$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class f {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f32123a;

        static {
            int[] iArr = new int[EnumC9454g.values().length];
            try {
                iArr[EnumC9454g.f32138v.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9454g.f32139w.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC9454g.f32140x.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC9454g.f32141y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f32123a = iArr;
        }
    }

    static {
        InterfaceC2548b interfaceC2548b;
        EnumC9454g[] enumC9454gArrM36854a = EnumC9454g.f32134r.m36854a();
        ArrayList arrayList = new ArrayList(enumC9454gArrM36854a.length);
        for (EnumC9454g enumC9454g : enumC9454gArrM36854a) {
            int i10 = f.f32123a[enumC9454g.ordinal()];
            if (i10 == 1) {
                interfaceC2548b = new C1026b0() { // from class: x6.d.a
                    @Override // p024b9.C1026b0, p098g9.InterfaceC2559m
                    public Object get(Object obj) {
                        return ((C9451d) obj).readHandlerReference;
                    }
                };
            } else if (i10 == 2) {
                interfaceC2548b = new C1026b0() { // from class: x6.d.b
                    @Override // p024b9.C1026b0, p098g9.InterfaceC2559m
                    public Object get(Object obj) {
                        return ((C9451d) obj).writeHandlerReference;
                    }
                };
            } else if (i10 == 3) {
                interfaceC2548b = new C1026b0() { // from class: x6.d.c
                    @Override // p024b9.C1026b0, p098g9.InterfaceC2559m
                    public Object get(Object obj) {
                        return ((C9451d) obj).acceptHandlerReference;
                    }
                };
            } else {
                if (i10 != 4) {
                    C5729x.m23182a();
                    return;
                }
                interfaceC2548b = new C1026b0() { // from class: x6.d.d
                    @Override // p024b9.C1026b0, p098g9.InterfaceC2559m
                    public Object get(Object obj) {
                        return ((C9451d) obj).connectHandlerReference;
                    }
                };
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater = AtomicReferenceFieldUpdater.newUpdater(C9451d.class, InterfaceC2156m.class, interfaceC2548b.getName());
            atomicReferenceFieldUpdaterNewUpdater.getClass();
            arrayList.add(atomicReferenceFieldUpdaterNewUpdater);
        }
        f32118b = (AtomicReferenceFieldUpdater[]) arrayList.toArray(new AtomicReferenceFieldUpdater[0]);
    }

    /* JADX INFO: renamed from: f */
    public final void m36822f(EnumC9454g enumC9454g, InterfaceC2156m interfaceC2156m) {
        enumC9454g.getClass();
        interfaceC2156m.getClass();
        if (AbstractC5489b.m22334a(f32117a.m36826b(enumC9454g), this, null, interfaceC2156m)) {
            return;
        }
        C9450c.m36816a("Handler for ", enumC9454g.name(), " is already registered");
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC2156m m36823g(int i10) {
        return (InterfaceC2156m) f32118b[i10].getAndSet(this, null);
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC2156m m36824h(EnumC9454g enumC9454g) {
        enumC9454g.getClass();
        return (InterfaceC2156m) f32117a.m36826b(enumC9454g).getAndSet(this, null);
    }

    public String toString() {
        return "R " + this.readHandlerReference + " W " + this.writeHandlerReference + " C " + this.connectHandlerReference + " A " + this.acceptHandlerReference;
    }

    /* JADX INFO: renamed from: x6.d$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e {
        public /* synthetic */ e(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final AtomicReferenceFieldUpdater m36826b(EnumC9454g enumC9454g) {
            return C9451d.f32118b[enumC9454g.ordinal()];
        }

        public e() {
        }
    }
}
