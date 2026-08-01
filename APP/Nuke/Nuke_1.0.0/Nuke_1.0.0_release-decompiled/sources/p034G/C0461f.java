package p034G;

import com.bumptech.glide.AbstractC1922d;
import p018D.C0254c;
import p027E4.C0330q;
import p029F0.InterfaceC0430v;
import p040H.InterfaceC0546d;
import p204n0.C2684c;
import p238t.AbstractC3204b;

/* JADX INFO: renamed from: G.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0461f implements InterfaceC0546d {

    /* JADX INFO: renamed from: d */
    public final long f1364d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0463h f1365e;

    public C0461f(C0463h c0463h, long j5) {
        this.f1365e = c0463h;
        this.f1364d = j5;
    }

    @Override // p040H.InterfaceC0546d
    /* JADX INFO: renamed from: B */
    public final C2684c mo743B(InterfaceC0430v interfaceC0430v) {
        return AbstractC1922d.m3425d(mo744l(interfaceC0430v), 0L);
    }

    @Override // p040H.InterfaceC0546d
    /* JADX INFO: renamed from: l */
    public final long mo744l(InterfaceC0430v interfaceC0430v) {
        InterfaceC0430v interfaceC0430v2 = (InterfaceC0430v) this.f1365e.f1373u.getValue();
        if (interfaceC0430v2 != null) {
            return interfaceC0430v.mo636P(interfaceC0430v2, this.f1364d);
        }
        AbstractC3204b.m5478d("Tried to open context menu before the anchor was placed.");
        throw new C0330q();
    }

    @Override // p040H.InterfaceC0546d
    /* JADX INFO: renamed from: r0 */
    public final C0254c mo745r0() {
        return AbstractC0464i.m747b(this.f1365e);
    }
}
