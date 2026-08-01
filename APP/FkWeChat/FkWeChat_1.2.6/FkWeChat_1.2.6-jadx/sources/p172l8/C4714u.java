package p172l8;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p193n3.AbstractC5489b;

/* JADX INFO: renamed from: l8.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4714u implements InterfaceC4705l, Serializable {

    /* JADX INFO: renamed from: t */
    public static final a f13931t = new a(null);

    /* JADX INFO: renamed from: u */
    public static final AtomicReferenceFieldUpdater f13932u = AtomicReferenceFieldUpdater.newUpdater(C4714u.class, Object.class, "r");

    /* JADX INFO: renamed from: q */
    public volatile InterfaceC0173a f13933q;

    /* JADX INFO: renamed from: r */
    public volatile Object f13934r;

    /* JADX INFO: renamed from: s */
    public final Object f13935s;

    public C4714u(InterfaceC0173a interfaceC0173a) {
        interfaceC0173a.getClass();
        this.f13933q = interfaceC0173a;
        C4692e0 c4692e0 = C4692e0.f13903a;
        this.f13934r = c4692e0;
        this.f13935s = c4692e0;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new C4697h(getValue());
    }

    @Override // p172l8.InterfaceC4705l
    /* JADX INFO: renamed from: a */
    public boolean mo18779a() {
        return this.f13934r != C4692e0.f13903a;
    }

    @Override // p172l8.InterfaceC4705l
    public Object getValue() {
        Object obj = this.f13934r;
        C4692e0 c4692e0 = C4692e0.f13903a;
        if (obj != c4692e0) {
            return obj;
        }
        InterfaceC0173a interfaceC0173a = this.f13933q;
        if (interfaceC0173a != null) {
            Object objInvoke = interfaceC0173a.invoke();
            if (AbstractC5489b.m22334a(f13932u, this, c4692e0, objInvoke)) {
                this.f13933q = null;
                return objInvoke;
            }
        }
        return this.f13934r;
    }

    public String toString() {
        return mo18779a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    /* JADX INFO: renamed from: l8.u$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
