package p259r9;

import android.view.View;
import android.widget.RelativeLayout;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: r9.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3767q {

    /* JADX INFO: renamed from: a */
    public final RelativeLayout f12321a;

    /* JADX INFO: renamed from: b */
    public final View f12322b;

    /* JADX INFO: renamed from: c */
    public final boolean f12323c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3767q(RelativeLayout relativeLayout, View view, boolean z9) {
        this.f12321a = relativeLayout;
        this.f12322b = view;
        this.f12323c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3767q)) {
            return false;
        }
        C3767q c3767q = (C3767q) obj;
        return this.f12321a.equals(c3767q.f12321a) && this.f12322b.equals(c3767q.f12322b) && this.f12323c == c3767q.f12323c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f12323c) + ((this.f12322b.hashCode() + (this.f12321a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvatarDetailsAnchor(parent=");
        sb2.append(this.f12321a);
        sb2.append(", positionView=");
        sb2.append(this.f12322b);
        sb2.append(", hidden=");
        return AbstractC3199a.m6840m(")", sb2, this.f12323c);
    }
}
