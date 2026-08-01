package p228p8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p024b9.AbstractC1043k;
import p193n3.AbstractC5489b;
import p242q8.AbstractC6325c;
import p242q8.EnumC6323a;
import p257r8.InterfaceC6536e;
import p376zd.C10010p0;

/* JADX INFO: renamed from: p8.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5982l implements InterfaceC5976f, InterfaceC6536e {

    /* JADX INFO: renamed from: r */
    public static final a f18918r = new a(null);

    /* JADX INFO: renamed from: s */
    public static final AtomicReferenceFieldUpdater f18919s = AtomicReferenceFieldUpdater.newUpdater(C5982l.class, Object.class, "result");

    /* JADX INFO: renamed from: q */
    public final InterfaceC5976f f18920q;
    private volatile Object result;

    public C5982l(InterfaceC5976f interfaceC5976f, Object obj) {
        interfaceC5976f.getClass();
        this.f18920q = interfaceC5976f;
        this.result = obj;
    }

    @Override // p257r8.InterfaceC6536e
    public InterfaceC6536e getCallerFrame() {
        InterfaceC5976f interfaceC5976f = this.f18920q;
        if (interfaceC5976f instanceof InterfaceC6536e) {
            return (InterfaceC6536e) interfaceC5976f;
        }
        return null;
    }

    @Override // p228p8.InterfaceC5976f
    public InterfaceC5980j getContext() {
        return this.f18920q.getContext();
    }

    @Override // p228p8.InterfaceC5976f
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC6323a enumC6323a = EnumC6323a.f19836r;
            if (obj2 == enumC6323a) {
                if (AbstractC5489b.m22334a(f18919s, this, enumC6323a, obj)) {
                    return;
                }
            } else if (obj2 != AbstractC6325c.m24992g()) {
                C10010p0.m38820a("Already resumed");
                return;
            } else if (AbstractC5489b.m22334a(f18919s, this, AbstractC6325c.m24992g(), EnumC6323a.f19837s)) {
                this.f18920q.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f18920q;
    }

    /* JADX INFO: renamed from: p8.l$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
