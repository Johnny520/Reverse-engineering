package p321w;

import p068eh.AbstractC0921a;
import p190n2.C2875j;
import p190n2.C2876k;
import p225p2.C3290b;

/* JADX INFO: renamed from: w.p0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4626p0 {

    /* JADX INFO: renamed from: b */
    public static final C4626p0 f15318b = new C4626p0(0, 127);

    /* JADX INFO: renamed from: a */
    public final int f15319a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4626p0(int i9, int i10) {
        this.f15319a = (i10 & 4) != 0 ? 0 : i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C2875j m9047a(boolean z9) {
        int i9 = this.f15319a;
        C2876k c2876k = new C2876k(i9);
        if (i9 == 0) {
            c2876k = null;
        }
        return new C2875j(z9, 0, true, c2876k != null ? c2876k.f9299a : 1, 1, C3290b.f10460i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4626p0) && this.f15319a == ((C4626p0) obj).f15319a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return AbstractC0921a.m2242e(-1, AbstractC0921a.m2242e(this.f15319a, Integer.hashCode(-1) * 961, 31), 29791);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) "Unspecified") + ", autoCorrectEnabled=null, keyboardType=" + ((Object) C2876k.m6286a(this.f15319a)) + ", imeAction=" + ((Object) "Unspecified") + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
