package p357y1;

import p085fg.InterfaceC1220a;
import p117i0.AbstractC1874r;
import p117i0.C1845j1;

/* JADX INFO: renamed from: y1.v1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5944v1 implements InterfaceC5917o2 {

    /* JADX INFO: renamed from: a */
    public InterfaceC1220a f24164a;

    /* JADX INFO: renamed from: b */
    public C1845j1 f24165b;

    /* JADX INFO: renamed from: c */
    public final C1845j1 f24166c = AbstractC1874r.m4639u(Boolean.FALSE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m10670a() {
        C5896j1 c5896j1;
        if (this.f24165b == null) {
            InterfaceC1220a interfaceC1220a = this.f24164a;
            if (interfaceC1220a == null || (c5896j1 = (C5896j1) interfaceC1220a.invoke()) == null) {
                c5896j1 = C5896j1.f23959c;
            }
            this.f24165b = AbstractC1874r.m4639u(c5896j1);
            this.f24164a = null;
        }
        C1845j1 c1845j1 = this.f24165b;
        c1845j1.getClass();
        return ((C5896j1) c1845j1.getValue()).f23961b;
    }
}
