package p274t;

import p121i3.InterfaceC3175e;
import p165l1.InterfaceC4499e;
import p165l1.InterfaceC4507m;
import p166l2.InterfaceC4589t1;

/* JADX INFO: renamed from: t.j1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7851j1 extends InterfaceC4507m.c implements InterfaceC4589t1 {

    /* JADX INFO: renamed from: F */
    public InterfaceC4499e.b f26180F;

    public C7851j1(InterfaceC4499e.b bVar) {
        this.f26180F = bVar;
    }

    @Override // p166l2.InterfaceC4589t1
    /* JADX INFO: renamed from: G2, reason: merged with bridge method [inline-methods] */
    public C7927y2 mo13048l(InterfaceC3175e interfaceC3175e, Object obj) {
        C7927y2 c7927y2 = obj instanceof C7927y2 ? (C7927y2) obj : null;
        if (c7927y2 == null) {
            c7927y2 = new C7927y2(0.0f, false, null, null, 15, null);
        }
        c7927y2.m30616e(AbstractC7835g0.f26136a.m30364a(this.f26180F));
        return c7927y2;
    }

    /* JADX INFO: renamed from: H2 */
    public final void m30403H2(InterfaceC4499e.b bVar) {
        this.f26180F = bVar;
    }
}
