package p211o0;

import p007B0.C0171D;
import p007B0.C0172E;
import p011B4.AbstractC0231b;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p041H0.InterfaceC0627x;
import p041H0.InterfaceC0632z0;
import p061L2.C0982v;
import p077P0.AbstractC1134u;
import p077P0.InterfaceC1136w;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: o0.N */
/* JADX INFO: loaded from: classes.dex */
public final class C2739N extends AbstractC2206o implements InterfaceC0627x, InterfaceC0632z0 {

    /* JADX INFO: renamed from: A */
    public long f8707A;

    /* JADX INFO: renamed from: B */
    public int f8708B;

    /* JADX INFO: renamed from: C */
    public C0172E f8709C;

    /* JADX INFO: renamed from: r */
    public float f8710r;

    /* JADX INFO: renamed from: s */
    public float f8711s;

    /* JADX INFO: renamed from: t */
    public float f8712t;

    /* JADX INFO: renamed from: u */
    public float f8713u;

    /* JADX INFO: renamed from: v */
    public float f8714v;

    /* JADX INFO: renamed from: w */
    public long f8715w;

    /* JADX INFO: renamed from: x */
    public InterfaceC2738M f8716x;

    /* JADX INFO: renamed from: y */
    public boolean f8717y;

    /* JADX INFO: renamed from: z */
    public long f8718z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0632z0
    /* JADX INFO: renamed from: X */
    public final void mo943X(InterfaceC1136w interfaceC1136w) {
        if (this.f8717y) {
            AbstractC1134u.m2190c(interfaceC1136w, this.f8716x);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: d */
    public final InterfaceC0378P mo687d(InterfaceC0379Q interfaceC0379Q, InterfaceC0376N interfaceC0376N, long j5) {
        AbstractC0391b0 abstractC0391b0Mo648e = interfaceC0376N.mo648e(j5);
        return interfaceC0379Q.mo604f0(abstractC0391b0Mo648e.f1206d, abstractC0391b0Mo648e.f1207e, C0982v.f3048d, new C0171D(12, abstractC0391b0Mo648e, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0632z0
    /* JADX INFO: renamed from: f */
    public final boolean mo1083f() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f8710r);
        sb.append(", scaleY=");
        sb.append(this.f8711s);
        sb.append(", alpha = ");
        sb.append(this.f8712t);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f8713u);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.f8714v);
        sb.append(", transformOrigin=");
        sb.append((Object) C2741P.m4809d(this.f8715w));
        sb.append(", shape=");
        sb.append(this.f8716x);
        sb.append(", clip=");
        sb.append(this.f8717y);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC0231b.m406q(this.f8718z, sb, ", spotShadowColor=");
        AbstractC0231b.m406q(this.f8707A, sb, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) AbstractC2767z.m4929B(this.f8708B));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: y0 */
    public final boolean mo656y0() {
        return false;
    }
}
