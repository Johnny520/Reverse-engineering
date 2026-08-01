package p190k3;

import com.bumptech.glide.AbstractC1923e;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p084Q2.InterfaceC1179d;
import p160f3.AbstractC2123a;
import p160f3.AbstractC2162v;

/* JADX INFO: renamed from: k3.q */
/* JADX INFO: loaded from: classes.dex */
public class C2469q extends AbstractC2123a implements InterfaceC1179d {

    /* JADX INFO: renamed from: g */
    public final InterfaceC1046d f7956g;

    public C2469q(InterfaceC1046d interfaceC1046d, InterfaceC1051i interfaceC1051i) {
        super(interfaceC1051i, true);
        this.f7956g = interfaceC1046d;
    }

    @Override // p160f3.C2122Z
    /* JADX INFO: renamed from: Q */
    public final boolean mo3934Q() {
        return true;
    }

    @Override // p084Q2.InterfaceC1179d
    /* JADX INFO: renamed from: d */
    public final InterfaceC1179d mo2123d() {
        InterfaceC1046d interfaceC1046d = this.f7956g;
        if (interfaceC1046d instanceof InterfaceC1179d) {
            return (InterfaceC1179d) interfaceC1046d;
        }
        return null;
    }

    @Override // p160f3.C2122Z
    /* JADX INFO: renamed from: q */
    public void mo3875q(Object obj) {
        AbstractC2453a.m4380h(AbstractC1923e.m3448G(this.f7956g), AbstractC2162v.m3995q(obj));
    }

    @Override // p160f3.C2122Z
    /* JADX INFO: renamed from: u */
    public void mo3876u(Object obj) {
        this.f7956g.mo278i(AbstractC2162v.m3995q(obj));
    }
}
