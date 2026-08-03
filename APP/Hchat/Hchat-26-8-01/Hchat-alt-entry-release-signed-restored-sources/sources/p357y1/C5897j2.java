package p357y1;

import gg.AbstractC1417m;
import okio.C3193a;
import p007a7.AbstractC0018a;
import p085fg.InterfaceC1220a;
import p276sf.C3967n;

/* JADX INFO: renamed from: y1.j2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5897j2 extends AbstractC1417m implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC5858a f23962g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC5893i2 f23963h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3193a f23964i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5897j2(AbstractC5858a abstractC5858a, ViewOnAttachStateChangeListenerC5893i2 viewOnAttachStateChangeListenerC5893i2, C3193a c3193a) {
        super(0);
        this.f23962g = abstractC5858a;
        this.f23963h = viewOnAttachStateChangeListenerC5893i2;
        this.f23964i = c3193a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        ViewOnAttachStateChangeListenerC5893i2 viewOnAttachStateChangeListenerC5893i2 = this.f23963h;
        AbstractC5858a abstractC5858a = this.f23962g;
        abstractC5858a.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC5893i2);
        AbstractC0018a.m259w(abstractC5858a).f7408a.remove(this.f23964i);
        return C3967n.f12976a;
    }
}
