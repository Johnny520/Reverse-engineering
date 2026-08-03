package p190n2;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p225p2.C3290b;

/* JADX INFO: renamed from: n2.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2875j {

    /* JADX INFO: renamed from: g */
    public static final C2875j f9292g = new C2875j(false, 0, true, 1, 1, C3290b.f10460i);

    /* JADX INFO: renamed from: a */
    public final boolean f9293a;

    /* JADX INFO: renamed from: b */
    public final int f9294b;

    /* JADX INFO: renamed from: c */
    public final boolean f9295c;

    /* JADX INFO: renamed from: d */
    public final int f9296d;

    /* JADX INFO: renamed from: e */
    public final int f9297e;

    /* JADX INFO: renamed from: f */
    public final C3290b f9298f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2875j(boolean z9, int i9, boolean z10, int i10, int i11, C3290b c3290b) {
        this.f9293a = z9;
        this.f9294b = i9;
        this.f9295c = z10;
        this.f9296d = i10;
        this.f9297e = i11;
        this.f9298f = c3290b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2875j)) {
            return false;
        }
        C2875j c2875j = (C2875j) obj;
        return this.f9293a == c2875j.f9293a && this.f9294b == c2875j.f9294b && this.f9295c == c2875j.f9295c && this.f9296d == c2875j.f9296d && this.f9297e == c2875j.f9297e && AbstractC1416l.m3825a(this.f9298f, c2875j.f9298f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9298f.f10461g.hashCode() + AbstractC0921a.m2242e(this.f9297e, AbstractC0921a.m2242e(this.f9296d, AbstractC0921a.m2245h(AbstractC0921a.m2242e(this.f9294b, Boolean.hashCode(this.f9293a) * 31, 31), 31, this.f9295c), 31), 961);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImeOptions(singleLine=");
        sb2.append(this.f9293a);
        sb2.append(", capitalization=");
        int i9 = this.f9294b;
        sb2.append((Object) (i9 == -1 ? "Unspecified" : i9 == 0 ? "None" : i9 == 1 ? "Characters" : i9 == 2 ? "Words" : i9 == 3 ? "Sentences" : "Invalid"));
        sb2.append(", autoCorrect=");
        sb2.append(this.f9295c);
        sb2.append(", keyboardType=");
        sb2.append((Object) C2876k.m6286a(this.f9296d));
        sb2.append(", imeAction=");
        sb2.append((Object) C2874i.m6285a(this.f9297e));
        sb2.append(", platformImeOptions=null, hintLocales=");
        sb2.append(this.f9298f);
        sb2.append(')');
        return sb2.toString();
    }
}
