package p000A;

import p011B4.AbstractC0231b;
import p115X0.C1637l;
import p115X0.C1638m;

/* JADX INFO: renamed from: A.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0076n0 {

    /* JADX INFO: renamed from: c */
    public static final C0076n0 f318c = new C0076n0(0, 127);

    /* JADX INFO: renamed from: a */
    public final int f319a;

    /* JADX INFO: renamed from: b */
    public final int f320b;

    public C0076n0(int i5, int i6) {
        int i7 = (i6 & 1) != 0 ? -1 : 1;
        i5 = (i6 & 4) != 0 ? 0 : i5;
        this.f319a = i7;
        this.f320b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0076n0)) {
            return false;
        }
        C0076n0 c0076n0 = (C0076n0) obj;
        return this.f319a == c0076n0.f319a && this.f320b == c0076n0.f320b;
    }

    public final int hashCode() {
        return AbstractC0231b.m391b(-1, AbstractC0231b.m391b(this.f320b, Integer.hashCode(this.f319a) * 961, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) C1637l.m2938a(this.f319a)) + ", autoCorrectEnabled=null, keyboardType=" + ((Object) C1638m.m2939a(this.f320b)) + ", imeAction=" + ((Object) "Unspecified") + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
