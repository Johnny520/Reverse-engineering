package p047I0;

import com.bumptech.glide.AbstractC1923e;
import p029F0.C0363A;
import p056K2.C0891q;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: I0.Q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0692Q0 extends AbstractC1666k implements InterfaceC1599a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0713b f2216e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC0690P0 f2217f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0363A f2218g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0692Q0(AbstractC0713b abstractC0713b, ViewOnAttachStateChangeListenerC0690P0 viewOnAttachStateChangeListenerC0690P0, C0363A c0363a) {
        super(0);
        this.f2216e = abstractC0713b;
        this.f2217f = viewOnAttachStateChangeListenerC0690P0;
        this.f2218g = c0363a;
    }

    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        ViewOnAttachStateChangeListenerC0690P0 viewOnAttachStateChangeListenerC0690P0 = this.f2217f;
        AbstractC0713b abstractC0713b = this.f2216e;
        abstractC0713b.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0690P0);
        C0363A c0363a = this.f2218g;
        AbstractC1665j.m2985e(c0363a, "listener");
        AbstractC1923e.m3444B(abstractC0713b).f10583a.remove(c0363a);
        return C0891q.f2780a;
    }
}
