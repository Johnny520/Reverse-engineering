package p348xb;

import ai.AbstractC0088a;
import android.graphics.RuntimeShader;
import p057e1.C0807b;
import p057e1.C0810e;
import p071f1.AbstractC0996c0;
import p071f1.C1029t;
import p071f1.C1034w;
import p085fg.InterfaceC1231l;
import p101h1.C1565b;
import p101h1.InterfaceC1567d;
import p249qg.AbstractC3603v;
import p267s1.C3914t;
import p276sf.C3967n;
import p339x1.C5610h0;

/* JADX INFO: renamed from: xb.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5766l implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23483g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5769o f23484h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5766l(C5769o c5769o, int i9) {
        this.f23483g = i9;
        this.f23484h = c5769o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f23483g) {
            case 0:
                C5610h0 c5610h0 = (C5610h0) obj;
                c5610h0.getClass();
                C1565b c1565b = c5610h0.f22833g;
                C5769o c5769o = this.f23484h;
                float fFloatValue = ((Number) c5769o.f23495e.m4360d()).floatValue();
                if (fFloatValue > 0.0f) {
                    long j3 = C1034w.f3259c;
                    InterfaceC1567d.m4087Z(c5610h0, C1034w.m2634b(j3, 0.06f * fFloatValue), 0L, 0.0f, 12, 62);
                    RuntimeShader runtimeShaderM479e = AbstractC0088a.m479e(c5769o.f23498h);
                    long j4 = ((C0807b) c5769o.f23492b.invoke(new C0810e(c1565b.mo4091a()), c5769o.f23496f.m4360d())).f2414a;
                    runtimeShaderM479e.setFloatUniform("size", Float.intBitsToFloat((int) (c1565b.mo4091a() >> 32)), Float.intBitsToFloat((int) (c1565b.mo4091a() & 4294967295L)));
                    runtimeShaderM479e.setColorUniform("color", AbstractC0996c0.m2526w(C1034w.m2634b(j3, fFloatValue * 0.12f)));
                    runtimeShaderM479e.setFloatUniform("radius", C0810e.m2055b(c1565b.mo4091a()) * 1.2f);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c1565b.mo4091a() >> 32));
                    if (fIntBitsToFloat < 0.0f) {
                        fIntBitsToFloat = 0.0f;
                    }
                    if (fIntBitsToFloat <= fIntBitsToFloat2) {
                        fIntBitsToFloat2 = fIntBitsToFloat;
                    }
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j4 & 4294967295L));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (c1565b.mo4091a() & 4294967295L));
                    float f3 = fIntBitsToFloat3 >= 0.0f ? fIntBitsToFloat3 : 0.0f;
                    if (f3 <= fIntBitsToFloat4) {
                        fIntBitsToFloat4 = f3;
                    }
                    runtimeShaderM479e.setFloatUniform("position", fIntBitsToFloat2, fIntBitsToFloat4);
                    InterfaceC1567d.m4086V0(c5610h0, new C1029t(c5769o.f23498h), 0L, 0L, 0.0f, null, 12, 62);
                }
                c5610h0.m10064e();
                break;
            case 1:
                C3914t c3914t = (C3914t) obj;
                c3914t.getClass();
                long j5 = c3914t.f12836c;
                C5769o c5769o2 = this.f23484h;
                c5769o2.f23497g = j5;
                AbstractC3603v.m7563q(c5769o2.f23491a, null, new C5768n(c5769o2, null, 0), 3);
                break;
            default:
                ((C3914t) obj).getClass();
                C5769o c5769o3 = this.f23484h;
                AbstractC3603v.m7563q(c5769o3.f23491a, null, new C5768n(c5769o3, null, 1), 3);
                break;
        }
        return C3967n.f12976a;
    }
}
