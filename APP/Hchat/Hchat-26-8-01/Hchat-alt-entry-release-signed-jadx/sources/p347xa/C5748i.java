package p347xa;

import android.app.Activity;
import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: xa.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5748i {

    /* JADX INFO: renamed from: a */
    public final Activity f23406a;

    /* JADX INFO: renamed from: b */
    public final String f23407b;

    /* JADX INFO: renamed from: c */
    public final boolean f23408c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5748i(Activity activity, String str, boolean z9) {
        this.f23406a = activity;
        this.f23407b = str;
        this.f23408c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5748i)) {
            return false;
        }
        C5748i c5748i = (C5748i) obj;
        return this.f23406a.equals(c5748i.f23406a) && this.f23407b.equals(c5748i.f23407b) && this.f23408c == c5748i.f23408c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f23408c) + AbstractC0921a.m2244g(this.f23406a.hashCode() * 31, 31, this.f23407b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MenuTarget(activity=");
        sb2.append(this.f23406a);
        sb2.append(", talker=");
        sb2.append(this.f23407b);
        sb2.append(", allowOpenIm=");
        return AbstractC3199a.m6840m(")", sb2, this.f23408c);
    }
}
