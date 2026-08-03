package p071f1;

import p016b1.C0166f;
import p072f2.AbstractC1060w;
import p072f2.InterfaceC1062y;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p339x1.InterfaceC5651v;
import p339x1.InterfaceC5665z1;
import p356y0.AbstractC5852n;
import tf.C4174u;

/* JADX INFO: renamed from: f1.s0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1028s0 extends AbstractC5852n implements InterfaceC5651v, InterfaceC5665z1 {

    /* JADX INFO: renamed from: A */
    public InterfaceC1026r0 f3239A;

    /* JADX INFO: renamed from: B */
    public boolean f3240B;

    /* JADX INFO: renamed from: C */
    public long f3241C;

    /* JADX INFO: renamed from: D */
    public long f3242D;

    /* JADX INFO: renamed from: E */
    public int f3243E;

    /* JADX INFO: renamed from: F */
    public C1017n f3244F;

    /* JADX INFO: renamed from: G */
    public C0166f f3245G;

    /* JADX INFO: renamed from: u */
    public float f3246u;

    /* JADX INFO: renamed from: v */
    public float f3247v;

    /* JADX INFO: renamed from: w */
    public float f3248w;

    /* JADX INFO: renamed from: x */
    public float f3249x;

    /* JADX INFO: renamed from: y */
    public float f3250y;

    /* JADX INFO: renamed from: z */
    public long f3251z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5665z1
    /* JADX INFO: renamed from: A */
    public final boolean mo2629A() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5665z1
    /* JADX INFO: renamed from: X0 */
    public final void mo1610X0(InterfaceC1062y interfaceC1062y) {
        if (this.f3240B) {
            AbstractC1060w.m2681d(interfaceC1062y, this.f3239A);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo1349Z0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: j */
    public final InterfaceC4415o0 mo1350j(InterfaceC4418p0 interfaceC4418p0, InterfaceC4409m0 interfaceC4409m0, long j3) {
        AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(j3);
        return interfaceC4418p0.mo8010z(abstractC4377b1Mo8831Q.f14593g, abstractC4377b1Mo8831Q.f14594h, C4174u.f13711g, new C1021p(abstractC4377b1Mo8831Q, 1, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.f3246u + ", scaleY=" + this.f3247v + ", alpha = " + this.f3248w + ", translationX=0.0, translationY=0.0, shadowElevation=" + this.f3249x + ", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=" + this.f3250y + ", transformOrigin=" + ((Object) C1032u0.m2632b(this.f3251z)) + ", shape=" + this.f3239A + ", clip=" + this.f3240B + ", renderEffect=null, ambientShadowColor=" + ((Object) C1034w.m2641i(this.f3241C)) + ", spotShadowColor=" + ((Object) C1034w.m2641i(this.f3242D)) + ", compositingStrategy=CompositingStrategy(value=0), blendMode=" + ((Object) AbstractC0996c0.m2503A(this.f3243E)) + ", colorFilter=" + this.f3244F + ')';
    }
}
