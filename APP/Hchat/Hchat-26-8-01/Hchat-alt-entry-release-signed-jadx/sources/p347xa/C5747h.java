package p347xa;

import android.view.View;
import gg.AbstractC1416l;
import java.lang.ref.WeakReference;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: xa.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5747h {

    /* JADX INFO: renamed from: a */
    public WeakReference f23402a;

    /* JADX INFO: renamed from: b */
    public String f23403b;

    /* JADX INFO: renamed from: c */
    public final View.OnLongClickListener f23404c;

    /* JADX INFO: renamed from: d */
    public final boolean f23405d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5747h(WeakReference weakReference, String str, View.OnLongClickListener onLongClickListener, boolean z9) {
        this.f23402a = weakReference;
        this.f23403b = str;
        this.f23404c = onLongClickListener;
        this.f23405d = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5747h)) {
            return false;
        }
        C5747h c5747h = (C5747h) obj;
        return this.f23402a.equals(c5747h.f23402a) && this.f23403b.equals(c5747h.f23403b) && AbstractC1416l.m3825a(this.f23404c, c5747h.f23404c) && this.f23405d == c5747h.f23405d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2244g = AbstractC0921a.m2244g(this.f23402a.hashCode() * 31, 31, this.f23403b);
        View.OnLongClickListener onLongClickListener = this.f23404c;
        return Boolean.hashCode(this.f23405d) + ((iM2244g + (onLongClickListener == null ? 0 : onLongClickListener.hashCode())) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AvatarBinding(activity=" + this.f23402a + ", talker=" + this.f23403b + ", originalListener=" + this.f23404c + ", originalLongClickable=" + this.f23405d + ")";
    }
}
