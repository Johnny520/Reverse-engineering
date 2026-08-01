package p265s1;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: s1.e2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b1\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B£\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00104R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b9\u00102\u001a\u0004\b:\u00104R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b;\u00102\u001a\u0004\b<\u00104R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b=\u00102\u001a\u0004\b>\u00104R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b?\u00102\u001a\u0004\b@\u00104R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bA\u00102\u001a\u0004\bB\u00104R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bC\u00102\u001a\u0004\bD\u00104R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bE\u00102\u001a\u0004\bF\u00104R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b!\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b%\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bQ\u0010H\u001a\u0004\bR\u0010JR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bS\u0010H\u001a\u0004\bT\u0010JR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010,R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bX\u0010V\u001a\u0004\bY\u0010,R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]¨\u0006^"}, m16758d2 = {"Ls1/e2;", "Ll2/z0;", "Ls1/j3;", _UrlKt.FRAGMENT_ENCODE_SET, "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Ls1/q3;", "transformOrigin", "Ls1/i3;", "shape", _UrlKt.FRAGMENT_ENCODE_SET, "clip", "Ls1/c3;", "renderEffect", "Ls1/q1;", "ambientShadowColor", "spotShadowColor", "Ls1/a2;", "compositingStrategy", "Ls1/z0;", "blendMode", "Ls1/r1;", "colorFilter", "<init>", "(FFFFFFFFFFJLs1/i3;ZLs1/c3;JJIILs1/r1;Lb9/k;)V", "m", "()Ls1/j3;", "node", "Ll8/i0;", "n", "(Ls1/j3;)V", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", "equals", "(Ljava/lang/Object;)Z", "b", "F", "getScaleX", "()F", "c", "getScaleY", "d", "getAlpha", "e", "getTranslationX", "f", "getTranslationY", "g", "getShadowElevation", "h", "getRotationX", "i", "getRotationY", "j", "getRotationZ", "k", "getCameraDistance", "l", "J", "getTransformOrigin-SzJe1aQ", "()J", "Ls1/i3;", "getShape", "()Ls1/i3;", "Z", "getClip", "()Z", "o", "getAmbientShadowColor-0d7_KjU", "p", "getSpotShadowColor-0d7_KjU", "q", "I", "getCompositingStrategy--NrFUSI", "r", "getBlendMode-0nO6VwU", "s", "Ls1/r1;", "getColorFilter", "()Ls1/r1;", "ui"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final /* data */ class C7069e2 extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final float scaleX;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final float scaleY;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final float alpha;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final float translationX;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final float translationY;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final float shadowElevation;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final float rotationX;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final float rotationY;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final float rotationZ;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final float cameraDistance;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final long transformOrigin;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final InterfaceC7090i3 shape;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final boolean clip;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final long ambientShadowColor;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final long spotShadowColor;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final int compositingStrategy;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public final int blendMode;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final AbstractC7133r1 colorFilter;

    public C7069e2(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, InterfaceC7090i3 interfaceC7090i3, boolean z10, AbstractC7060c3 abstractC7060c3, long j11, long j12, int i10, int i11, AbstractC7133r1 abstractC7133r1) {
        this.scaleX = f10;
        this.scaleY = f11;
        this.alpha = f12;
        this.translationX = f13;
        this.translationY = f14;
        this.shadowElevation = f15;
        this.rotationX = f16;
        this.rotationY = f17;
        this.rotationZ = f18;
        this.cameraDistance = f19;
        this.transformOrigin = j10;
        this.shape = interfaceC7090i3;
        this.clip = z10;
        this.ambientShadowColor = j11;
        this.spotShadowColor = j12;
        this.compositingStrategy = i10;
        this.blendMode = i11;
        this.colorFilter = abstractC7133r1;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C7069e2)) {
            return false;
        }
        C7069e2 c7069e2 = (C7069e2) other;
        return Float.compare(this.scaleX, c7069e2.scaleX) == 0 && Float.compare(this.scaleY, c7069e2.scaleY) == 0 && Float.compare(this.alpha, c7069e2.alpha) == 0 && Float.compare(this.translationX, c7069e2.translationX) == 0 && Float.compare(this.translationY, c7069e2.translationY) == 0 && Float.compare(this.shadowElevation, c7069e2.shadowElevation) == 0 && Float.compare(this.rotationX, c7069e2.rotationX) == 0 && Float.compare(this.rotationY, c7069e2.rotationY) == 0 && Float.compare(this.rotationZ, c7069e2.rotationZ) == 0 && Float.compare(this.cameraDistance, c7069e2.cameraDistance) == 0 && C7130q3.m28162e(this.transformOrigin, c7069e2.transformOrigin) && AbstractC1061t.m3842c(this.shape, c7069e2.shape) && this.clip == c7069e2.clip && AbstractC1061t.m3842c(null, null) && C7128q1.m28131q(this.ambientShadowColor, c7069e2.ambientShadowColor) && C7128q1.m28131q(this.spotShadowColor, c7069e2.spotShadowColor) && AbstractC7049a2.m27747e(this.compositingStrategy, c7069e2.compositingStrategy) && AbstractC7168z0.m28276E(this.blendMode, c7069e2.blendMode) && AbstractC1061t.m3842c(this.colorFilter, c7069e2.colorFilter);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((Float.hashCode(this.scaleX) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.alpha)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + Float.hashCode(this.shadowElevation)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.cameraDistance)) * 31) + C7130q3.m28165h(this.transformOrigin)) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 961) + C7128q1.m28137w(this.ambientShadowColor)) * 31) + C7128q1.m28137w(this.spotShadowColor)) * 31) + AbstractC7049a2.m27748f(this.compositingStrategy)) * 31) + AbstractC7168z0.m28277F(this.blendMode)) * 31;
        AbstractC7133r1 abstractC7133r1 = this.colorFilter;
        return iHashCode + (abstractC7133r1 == null ? 0 : abstractC7133r1.hashCode());
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C7095j3 mo1191j() {
        return new C7095j3(this.scaleX, this.scaleY, this.alpha, this.translationX, this.translationY, this.shadowElevation, this.rotationX, this.rotationY, this.rotationZ, this.cameraDistance, this.transformOrigin, this.shape, this.clip, null, this.ambientShadowColor, this.spotShadowColor, this.compositingStrategy, this.blendMode, this.colorFilter, null);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C7095j3 node) {
        node.m27938A(this.scaleX);
        node.m27969p(this.scaleY);
        node.m27962e(this.alpha);
        node.m27944H(this.translationX);
        node.m27968m(this.translationY);
        node.m27966j(this.shadowElevation);
        node.m27954M(this.rotationX);
        node.m27964h(this.rotationY);
        node.m27967k(this.rotationZ);
        node.m27950K(this.cameraDistance);
        node.m27976y1(this.transformOrigin);
        node.m27971r1(this.shape);
        node.m27942E(this.clip);
        node.m27948J(null);
        node.m27975y(this.ambientShadowColor);
        node.m27946I(this.spotShadowColor);
        node.m27939B0(this.compositingStrategy);
        node.m27961c(this.blendMode);
        node.m27963f(this.colorFilter);
        node.m27960R2();
    }

    public String toString() {
        return "GraphicsLayerElement(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha=" + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) C7130q3.m28166i(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=null, ambientShadowColor=" + ((Object) C7128q1.m28138x(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) C7128q1.m28138x(this.spotShadowColor)) + ", compositingStrategy=" + ((Object) AbstractC7049a2.m27749g(this.compositingStrategy)) + ", blendMode=" + ((Object) AbstractC7168z0.m28278G(this.blendMode)) + ", colorFilter=" + this.colorFilter + ')';
    }

    public /* synthetic */ C7069e2(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, InterfaceC7090i3 interfaceC7090i3, boolean z10, AbstractC7060c3 abstractC7060c3, long j11, long j12, int i10, int i11, AbstractC7133r1 abstractC7133r1, AbstractC1043k abstractC1043k) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, interfaceC7090i3, z10, abstractC7060c3, j11, j12, i10, i11, abstractC7133r1);
    }
}
