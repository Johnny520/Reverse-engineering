package p116i;

import p085fg.InterfaceC1220a;
import p117i0.AbstractC1874r;
import p117i0.C1845j1;

/* JADX INFO: renamed from: i.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1760j {

    /* JADX INFO: renamed from: a */
    public final C1771m1 f5876a;

    /* JADX INFO: renamed from: b */
    public final Object f5877b;

    /* JADX INFO: renamed from: c */
    public final long f5878c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1220a f5879d;

    /* JADX INFO: renamed from: e */
    public final C1845j1 f5880e;

    /* JADX INFO: renamed from: f */
    public AbstractC1781q f5881f;

    /* JADX INFO: renamed from: g */
    public long f5882g;

    /* JADX INFO: renamed from: h */
    public long f5883h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i */
    public final C1845j1 f5884i = AbstractC1874r.m4639u(Boolean.TRUE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1760j(Object obj, C1771m1 c1771m1, AbstractC1781q abstractC1781q, long j3, Object obj2, long j4, InterfaceC1220a interfaceC1220a) {
        this.f5876a = c1771m1;
        this.f5877b = obj2;
        this.f5878c = j4;
        this.f5879d = interfaceC1220a;
        this.f5880e = AbstractC1874r.m4639u(obj);
        this.f5881f = AbstractC1742d.m4373i(abstractC1781q);
        this.f5882g = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4409a() {
        this.f5884i.setValue(Boolean.FALSE);
        this.f5879d.invoke();
    }
}
