package p000;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class i00 {

    /* JADX INFO: renamed from: s */
    public static final List f2295s = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: a */
    public final View f2296a;

    /* JADX INFO: renamed from: b */
    public WeakReference f2297b;

    /* JADX INFO: renamed from: j */
    public int f2305j;

    /* JADX INFO: renamed from: r */
    public RecyclerView f2313r;

    /* JADX INFO: renamed from: c */
    public int f2298c = -1;

    /* JADX INFO: renamed from: d */
    public int f2299d = -1;

    /* JADX INFO: renamed from: e */
    public long f2300e = -1;

    /* JADX INFO: renamed from: f */
    public int f2301f = -1;

    /* JADX INFO: renamed from: g */
    public int f2302g = -1;

    /* JADX INFO: renamed from: h */
    public i00 f2303h = null;

    /* JADX INFO: renamed from: i */
    public i00 f2304i = null;

    /* JADX INFO: renamed from: k */
    public final ArrayList f2306k = null;

    /* JADX INFO: renamed from: l */
    public final List f2307l = null;

    /* JADX INFO: renamed from: m */
    public int f2308m = 0;

    /* JADX INFO: renamed from: n */
    public a00 f2309n = null;

    /* JADX INFO: renamed from: o */
    public boolean f2310o = false;

    /* JADX INFO: renamed from: p */
    public int f2311p = 0;

    /* JADX INFO: renamed from: q */
    public int f2312q = -1;

    public i00(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f2296a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m1419a(int i) {
        this.f2305j = i | this.f2305j;
    }

    /* JADX INFO: renamed from: b */
    public final int m1420b() {
        int i = this.f2302g;
        return i == -1 ? this.f2298c : i;
    }

    /* JADX INFO: renamed from: c */
    public final List m1421c() {
        ArrayList arrayList;
        return ((this.f2305j & 1024) != 0 || (arrayList = this.f2306k) == null || arrayList.size() == 0) ? f2295s : this.f2307l;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1422d() {
        View view = this.f2296a;
        return (view.getParent() == null || view.getParent() == this.f2313r) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1423e() {
        return (this.f2305j & 1) != 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1424f() {
        return (this.f2305j & 4) != 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1425g() {
        if ((this.f2305j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = oa0.f3426a;
        return !x90.m2661i(this.f2296a);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1426h() {
        return (this.f2305j & 8) != 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1427i() {
        return this.f2309n != null;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1428j() {
        return (this.f2305j & 256) != 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1429k() {
        return (this.f2305j & 2) != 0;
    }

    /* JADX INFO: renamed from: l */
    public final void m1430l(int i, boolean z) {
        if (this.f2299d == -1) {
            this.f2299d = this.f2298c;
        }
        if (this.f2302g == -1) {
            this.f2302g = this.f2298c;
        }
        if (z) {
            this.f2302g += i;
        }
        this.f2298c += i;
        View view = this.f2296a;
        if (view.getLayoutParams() != null) {
            ((C0836vz) view.getLayoutParams()).f5019c = true;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1431m() {
        this.f2305j = 0;
        this.f2298c = -1;
        this.f2299d = -1;
        this.f2300e = -1L;
        this.f2302g = -1;
        this.f2308m = 0;
        this.f2303h = null;
        this.f2304i = null;
        ArrayList arrayList = this.f2306k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f2305j &= -1025;
        this.f2311p = 0;
        this.f2312q = -1;
        RecyclerView.m357j(this);
    }

    /* JADX INFO: renamed from: n */
    public final void m1432n(boolean z) {
        int i = this.f2308m;
        int i2 = z ? i - 1 : i + 1;
        this.f2308m = i2;
        if (i2 < 0) {
            this.f2308m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z && i2 == 1) {
            this.f2305j |= 16;
        } else if (z && i2 == 0) {
            this.f2305j &= -17;
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m1433o() {
        return (this.f2305j & 128) != 0;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m1434p() {
        return (this.f2305j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f2298c + " id=" + this.f2300e + ", oldPos=" + this.f2299d + ", pLpos:" + this.f2302g);
        if (m1427i()) {
            sb.append(" scrap ");
            sb.append(this.f2310o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m1424f()) {
            sb.append(" invalid");
        }
        if (!m1423e()) {
            sb.append(" unbound");
        }
        if ((this.f2305j & 2) != 0) {
            sb.append(" update");
        }
        if (m1426h()) {
            sb.append(" removed");
        }
        if (m1433o()) {
            sb.append(" ignored");
        }
        if (m1428j()) {
            sb.append(" tmpDetached");
        }
        if (!m1425g()) {
            sb.append(" not recyclable(" + this.f2308m + ")");
        }
        if ((this.f2305j & 512) != 0 || m1424f()) {
            sb.append(" undefined adapter position");
        }
        if (this.f2296a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
