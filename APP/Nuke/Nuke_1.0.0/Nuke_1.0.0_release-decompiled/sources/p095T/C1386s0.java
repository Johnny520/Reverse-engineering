package p095T;

import p027E4.C0330q;

/* JADX INFO: renamed from: T.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1386s0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1384r0 f4914a;

    /* JADX INFO: renamed from: b */
    public final boolean f4915b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1334Q0 f4916c;

    /* JADX INFO: renamed from: d */
    public final boolean f4917d;

    /* JADX INFO: renamed from: e */
    public final Object f4918e;

    /* JADX INFO: renamed from: f */
    public boolean f4919f = true;

    public C1386s0(AbstractC1384r0 abstractC1384r0, Object obj, boolean z5, InterfaceC1334Q0 interfaceC1334Q0, boolean z6) {
        this.f4914a = abstractC1384r0;
        this.f4915b = z5;
        this.f4916c = interfaceC1334Q0;
        this.f4917d = z6;
        this.f4918e = obj;
    }

    /* JADX INFO: renamed from: a */
    public final Object m2637a() {
        if (this.f4915b) {
            return null;
        }
        Object obj = this.f4918e;
        if (obj != null) {
            return obj;
        }
        AbstractC1387t.m2639b("Unexpected form of a provided value");
        throw new C0330q();
    }
}
