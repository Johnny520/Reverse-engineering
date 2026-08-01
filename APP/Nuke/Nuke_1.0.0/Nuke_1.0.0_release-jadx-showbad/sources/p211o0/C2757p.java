package p211o0;

import android.graphics.RenderEffect;
import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: o0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2757p {

    /* JADX INFO: renamed from: a */
    public RenderEffect f8751a;

    /* JADX INFO: renamed from: b */
    public final float f8752b;

    /* JADX INFO: renamed from: c */
    public final float f8753c;

    /* JADX INFO: renamed from: d */
    public final int f8754d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2757p(float f2, float f5, int i5) {
        this.f8752b = f2;
        this.f8753c = f5;
        this.f8754d = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final RenderEffect m4917a() {
        RenderEffect renderEffectCreateOffsetEffect = this.f8751a;
        if (renderEffectCreateOffsetEffect == null) {
            float f2 = this.f8752b;
            float f5 = this.f8753c;
            renderEffectCreateOffsetEffect = (f2 == 0.0f && f5 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f2, f5, AbstractC2767z.m4951v(this.f8754d));
            this.f8751a = renderEffectCreateOffsetEffect;
        }
        return renderEffectCreateOffsetEffect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2757p)) {
            return false;
        }
        C2757p c2757p = (C2757p) obj;
        return this.f8752b == c2757p.f8752b && this.f8753c == c2757p.f8753c && this.f8754d == c2757p.f8754d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f8754d) + AbstractC0231b.m390a(this.f8753c, Float.hashCode(this.f8752b) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("BlurEffect(renderEffect=null, radiusX=");
        sb.append(this.f8752b);
        sb.append(", radiusY=");
        sb.append(this.f8753c);
        sb.append(", edgeTreatment=");
        int i5 = this.f8754d;
        sb.append((Object) (i5 == 0 ? "Clamp" : i5 == 1 ? "Repeated" : i5 == 2 ? "Mirror" : i5 == 3 ? "Decal" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
