package p274t;

import p121i3.InterfaceC3175e;
import p165l1.InterfaceC4507m;
import p166l2.InterfaceC4589t1;

/* JADX INFO: renamed from: t.a2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7802a2 extends InterfaceC4507m.c implements InterfaceC4589t1 {

    /* JADX INFO: renamed from: F */
    public float f26014F;

    /* JADX INFO: renamed from: G */
    public boolean f26015G;

    public C7802a2(float f10, boolean z10) {
        this.f26014F = f10;
        this.f26015G = z10;
    }

    @Override // p166l2.InterfaceC4589t1
    /* JADX INFO: renamed from: G2, reason: merged with bridge method [inline-methods] */
    public C7927y2 mo13048l(InterfaceC3175e interfaceC3175e, Object obj) {
        C7927y2 c7927y2 = obj instanceof C7927y2 ? (C7927y2) obj : null;
        if (c7927y2 == null) {
            c7927y2 = new C7927y2(0.0f, false, null, null, 15, null);
        }
        c7927y2.m30618g(this.f26014F);
        c7927y2.m30617f(this.f26015G);
        return c7927y2;
    }

    /* JADX INFO: renamed from: H2 */
    public final void m30237H2(boolean z10) {
        this.f26015G = z10;
    }

    /* JADX INFO: renamed from: I2 */
    public final void m30238I2(float f10) {
        this.f26014F = f10;
    }
}
