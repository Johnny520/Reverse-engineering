package p366ya;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: ya.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6012b {

    /* JADX INFO: renamed from: a */
    public final View f24412a;

    /* JADX INFO: renamed from: b */
    public final View f24413b;

    /* JADX INFO: renamed from: c */
    public final int f24414c;

    /* JADX INFO: renamed from: d */
    public final int f24415d;

    /* JADX INFO: renamed from: e */
    public final int f24416e;

    /* JADX INFO: renamed from: f */
    public final int f24417f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f24418g;

    /* JADX INFO: renamed from: h */
    public final int f24419h;

    /* JADX INFO: renamed from: i */
    public final float f24420i;

    /* JADX INFO: renamed from: j */
    public final Typeface f24421j;

    /* JADX INFO: renamed from: k */
    public final int f24422k;

    /* JADX INFO: renamed from: l */
    public final boolean f24423l;

    /* JADX INFO: renamed from: m */
    public final int f24424m;

    /* JADX INFO: renamed from: n */
    public final int f24425n;

    /* JADX INFO: renamed from: o */
    public final int f24426o;

    /* JADX INFO: renamed from: p */
    public final int f24427p;

    /* JADX INFO: renamed from: q */
    public final Drawable f24428q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6012b(View view, View view2, int i9, int i10, int i11, int i12, CharSequence charSequence, int i13, float f3, Typeface typeface, int i14, boolean z9, int i15, int i16, int i17, int i18, Drawable drawable) {
        view.getClass();
        this.f24412a = view;
        this.f24413b = view2;
        this.f24414c = i9;
        this.f24415d = i10;
        this.f24416e = i11;
        this.f24417f = i12;
        this.f24418g = charSequence;
        this.f24419h = i13;
        this.f24420i = f3;
        this.f24421j = typeface;
        this.f24422k = i14;
        this.f24423l = z9;
        this.f24424m = i15;
        this.f24425n = i16;
        this.f24426o = i17;
        this.f24427p = i18;
        this.f24428q = drawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6012b)) {
            return false;
        }
        C6012b c6012b = (C6012b) obj;
        return AbstractC1416l.m3825a(this.f24412a, c6012b.f24412a) && AbstractC1416l.m3825a(this.f24413b, c6012b.f24413b) && this.f24414c == c6012b.f24414c && this.f24415d == c6012b.f24415d && this.f24416e == c6012b.f24416e && this.f24417f == c6012b.f24417f && AbstractC1416l.m3825a(this.f24418g, c6012b.f24418g) && this.f24419h == c6012b.f24419h && Float.compare(this.f24420i, c6012b.f24420i) == 0 && AbstractC1416l.m3825a(this.f24421j, c6012b.f24421j) && this.f24422k == c6012b.f24422k && this.f24423l == c6012b.f24423l && this.f24424m == c6012b.f24424m && this.f24425n == c6012b.f24425n && this.f24426o == c6012b.f24426o && this.f24427p == c6012b.f24427p && AbstractC1416l.m3825a(this.f24428q, c6012b.f24428q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f24412a.hashCode() * 31;
        View view = this.f24413b;
        int iM2242e = AbstractC0921a.m2242e(this.f24417f, AbstractC0921a.m2242e(this.f24416e, AbstractC0921a.m2242e(this.f24415d, AbstractC0921a.m2242e(this.f24414c, (iHashCode + (view == null ? 0 : view.hashCode())) * 31, 31), 31), 31), 31);
        CharSequence charSequence = this.f24418g;
        int iM2241d = AbstractC0921a.m2241d(this.f24420i, AbstractC0921a.m2242e(this.f24419h, (iM2242e + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31), 31);
        Typeface typeface = this.f24421j;
        int iM2242e2 = AbstractC0921a.m2242e(this.f24427p, AbstractC0921a.m2242e(this.f24426o, AbstractC0921a.m2242e(this.f24425n, AbstractC0921a.m2242e(this.f24424m, AbstractC0921a.m2245h(AbstractC0921a.m2242e(this.f24422k, (iM2241d + (typeface == null ? 0 : typeface.hashCode())) * 31, 31), 31, this.f24423l), 31), 31), 31), 31);
        Drawable drawable = this.f24428q;
        return iM2242e2 + (drawable != null ? drawable.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DragTarget(contextView=");
        sb2.append(this.f24412a);
        sb2.append(", source=");
        sb2.append(this.f24413b);
        sb2.append(", screenLeft=");
        AbstractC4855en.m9272p(sb2, this.f24414c, ", screenTop=", this.f24415d, ", width=");
        AbstractC4855en.m9272p(sb2, this.f24416e, ", height=", this.f24417f, ", text=");
        sb2.append((Object) this.f24418g);
        sb2.append(", textColor=");
        sb2.append(this.f24419h);
        sb2.append(", textSizePx=");
        sb2.append(this.f24420i);
        sb2.append(", typeface=");
        sb2.append(this.f24421j);
        sb2.append(", gravity=");
        sb2.append(this.f24422k);
        sb2.append(", includeFontPadding=");
        sb2.append(this.f24423l);
        sb2.append(", paddingLeft=");
        AbstractC4855en.m9272p(sb2, this.f24424m, ", paddingTop=", this.f24425n, ", paddingRight=");
        AbstractC4855en.m9272p(sb2, this.f24426o, ", paddingBottom=", this.f24427p, ", background=");
        sb2.append(this.f24428q);
        sb2.append(")");
        return sb2.toString();
    }
}
