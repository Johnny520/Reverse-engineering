package p332wb;

import bi.C0322j;
import ci.C0589j;
import p051db.C0765c;
import p057e1.C0807b;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p116i.C1739c;
import p117i0.C1829f1;
import p117i0.C1836h0;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p251r.C3619d;
import p259r9.AbstractC3754e0;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p348xb.C5762h;
import p348xb.C5763i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.k3 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5031k3 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18296g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f18297h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f18298i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f18299j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f18300k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f18301l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5031k3(int i9, InterfaceC1231l interfaceC1231l, boolean z9, C0765c c0765c, InterfaceC1220a interfaceC1220a) {
        this.f18297h = i9;
        this.f18299j = interfaceC1231l;
        this.f18298i = z9;
        this.f18300k = c0765c;
        this.f18301l = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f18296g) {
            case 0:
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f18299j;
                C1829f1 c1829f1 = (C1829f1) this.f18300k;
                C1739c c1739c = (C1739c) this.f18301l;
                C5763i c5763i = (C5763i) obj;
                C0807b c0807b = (C0807b) obj3;
                c5763i.getClass();
                if (c1829f1.m4488g() > 0.0f) {
                    float fIntBitsToFloat = ((Float.intBitsToFloat((int) (c0807b.f2414a >> 32)) / c1829f1.m4488g()) * (this.f18298i ? 1.0f : -1.0f)) + c5763i.m10456b();
                    float f3 = this.f18297h - 1;
                    float f10 = fIntBitsToFloat >= 0.0f ? fIntBitsToFloat : 0.0f;
                    if (f10 <= f3) {
                        f3 = f10;
                    }
                    AbstractC3603v.m7563q(c5763i.f23450a, null, new C5762h(c5763i, ((Number) AbstractC3754e0.m7913t(Float.valueOf(f3), c5763i.f23451b)).floatValue(), null), 3);
                    AbstractC3603v.m7563q(interfaceC3599t, null, new C0589j(c1739c, c0807b, (InterfaceC5557c) null, 20), 3);
                }
                break;
            default:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f18299j;
                C0765c c0765c = (C0765c) this.f18300k;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f18301l;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-723003324, new C0322j(this.f18297h, interfaceC1231l, this.f18298i, c0765c, interfaceC1220a), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5031k3(boolean z9, int i9, InterfaceC3599t interfaceC3599t, C1829f1 c1829f1, C1739c c1739c) {
        this.f18298i = z9;
        this.f18297h = i9;
        this.f18299j = interfaceC3599t;
        this.f18300k = c1829f1;
        this.f18301l = c1739c;
    }
}
