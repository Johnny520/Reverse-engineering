package p050da;

import android.content.res.ColorStateList;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: da.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0756b {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f2256a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f2257b;

    /* JADX INFO: renamed from: c */
    public final int f2258c;

    /* JADX INFO: renamed from: d */
    public final Shader f2259d;

    /* JADX INFO: renamed from: e */
    public final int f2260e;

    /* JADX INFO: renamed from: f */
    public LinearGradient f2261f = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0756b(ColorStateList colorStateList, ColorStateList colorStateList2, int i9, Shader shader, int i10) {
        this.f2256a = colorStateList;
        this.f2257b = colorStateList2;
        this.f2258c = i9;
        this.f2259d = shader;
        this.f2260e = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0756b)) {
            return false;
        }
        C0756b c0756b = (C0756b) obj;
        return this.f2256a.equals(c0756b.f2256a) && this.f2257b.equals(c0756b.f2257b) && this.f2258c == c0756b.f2258c && AbstractC1416l.m3825a(this.f2259d, c0756b.f2259d) && this.f2260e == c0756b.f2260e && AbstractC1416l.m3825a(this.f2261f, c0756b.f2261f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2242e = AbstractC0921a.m2242e(this.f2258c, (this.f2257b.hashCode() + (this.f2256a.hashCode() * 31)) * 31, 31);
        Shader shader = this.f2259d;
        int iM2242e2 = AbstractC0921a.m2242e(this.f2260e, (iM2242e + (shader == null ? 0 : shader.hashCode())) * 31, 31);
        LinearGradient linearGradient = this.f2261f;
        return iM2242e2 + (linearGradient != null ? linearGradient.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AppliedTextState(originalTextColors=" + this.f2256a + ", originalLinkTextColors=" + this.f2257b + ", originalLinkColor=" + this.f2258c + ", originalShader=" + this.f2259d + ", appliedColor=" + this.f2260e + ", appliedShader=" + this.f2261f + ")";
    }
}
