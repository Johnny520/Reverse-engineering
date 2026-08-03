package ba;

import android.content.res.ColorStateList;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: ba.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0231k {

    /* JADX INFO: renamed from: a */
    public final C0232l f577a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f578b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f579c;

    /* JADX INFO: renamed from: d */
    public final boolean f580d;

    /* JADX INFO: renamed from: e */
    public final boolean f581e;

    /* JADX INFO: renamed from: f */
    public final int f582f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0231k(C0232l c0232l, ColorStateList colorStateList, ColorStateList colorStateList2, boolean z9, boolean z10, int i9) {
        this.f577a = c0232l;
        this.f578b = colorStateList;
        this.f579c = colorStateList2;
        this.f580d = z9;
        this.f581e = z10;
        this.f582f = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0231k)) {
            return false;
        }
        C0231k c0231k = (C0231k) obj;
        return this.f577a.equals(c0231k.f577a) && this.f578b.equals(c0231k.f578b) && this.f579c.equals(c0231k.f579c) && this.f580d == c0231k.f580d && this.f581e == c0231k.f581e && this.f582f == c0231k.f582f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f582f) + AbstractC0921a.m2245h(AbstractC0921a.m2245h((this.f579c.hashCode() + ((this.f578b.hashCode() + (this.f577a.hashCode() * 31)) * 31)) * 31, 31, this.f580d), 31, this.f581e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextColorState(target=" + this.f577a + ", textColors=" + this.f578b + ", linkTextColors=" + this.f579c + ", changeTextColor=" + this.f580d + ", changeLinkColor=" + this.f581e + ", appliedColor=" + this.f582f + ")";
    }
}
