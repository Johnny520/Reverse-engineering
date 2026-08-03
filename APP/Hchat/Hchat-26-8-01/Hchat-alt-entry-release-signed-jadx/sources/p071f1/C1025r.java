package p071f1;

import android.graphics.RenderEffect;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: f1.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1025r extends AbstractC1018n0 {

    /* JADX INFO: renamed from: h */
    public final float f3237h;

    /* JADX INFO: renamed from: i */
    public final float f3238i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1025r(float f3, float f10) {
        this.f3237h = f3;
        this.f3238i = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1025r)) {
            return false;
        }
        C1025r c1025r = (C1025r) obj;
        return this.f3237h == c1025r.f3237h && this.f3238i == c1025r.f3238i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(3) + AbstractC0921a.m2241d(this.f3238i, Float.hashCode(this.f3237h) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.AbstractC1018n0
    /* JADX INFO: renamed from: i */
    public final RenderEffect mo2611i() {
        float f3 = this.f3237h;
        float f10 = this.f3238i;
        return (f3 == 0.0f && f10 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f3, f10, AbstractC0996c0.m2525v(3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.f3237h + ", radiusY=" + this.f3238i + ", edgeTreatment=" + ((Object) "Decal") + ')';
    }
}
