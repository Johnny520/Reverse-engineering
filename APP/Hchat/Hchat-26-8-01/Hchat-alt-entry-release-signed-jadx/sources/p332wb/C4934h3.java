package p332wb;

import ci.C0589j;
import p071f1.C1034w;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p249qg.AbstractC3603v;
import p276sf.C3967n;
import p348xb.C5763i;
import p367yb.C6021b;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.h3 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4934h3 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17520g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5763i f17521h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4934h3(C5763i c5763i, int i9) {
        this.f17520g = i9;
        this.f17521h = c5763i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f17520g) {
            case 0:
                C5763i c5763i = this.f17521h;
                return new C6021b(c5763i.m10455a() * 8, c5763i.m10455a(), 18, C1034w.m2634b(C1034w.f3258b, 0.15f));
            case 1:
                return Float.valueOf(AbstractC1184v0.m3176C(1.0f, 1.2f, this.f17521h.m10455a()));
            case 2:
                C5763i c5763i2 = this.f17521h;
                c5763i2.f23453d.invoke(c5763i2);
                AbstractC3603v.m7563q(c5763i2.f23450a, null, new C0589j(c5763i2, (InterfaceC5557c) null, 24), 3);
                return C3967n.f12976a;
            default:
                return Float.valueOf(((Number) this.f17521h.f23460k.m4360d()).floatValue());
        }
    }
}
