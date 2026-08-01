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
public abstract class b00 {

    /* JADX INFO: renamed from: s */
    public static final List f696s = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: a */
    public final View f697a;

    /* JADX INFO: renamed from: b */
    public WeakReference f698b;

    /* JADX INFO: renamed from: j */
    public int f706j;

    /* JADX INFO: renamed from: r */
    public RecyclerView f714r;

    /* JADX INFO: renamed from: c */
    public int f699c = -1;

    /* JADX INFO: renamed from: d */
    public int f700d = -1;

    /* JADX INFO: renamed from: e */
    public long f701e = -1;

    /* JADX INFO: renamed from: f */
    public int f702f = -1;

    /* JADX INFO: renamed from: g */
    public int f703g = -1;

    /* JADX INFO: renamed from: h */
    public b00 f704h = null;

    /* JADX INFO: renamed from: i */
    public b00 f705i = null;

    /* JADX INFO: renamed from: k */
    public final ArrayList f707k = null;

    /* JADX INFO: renamed from: l */
    public final List f708l = null;

    /* JADX INFO: renamed from: m */
    public int f709m = 0;

    /* JADX INFO: renamed from: n */
    public C0763tz f710n = null;

    /* JADX INFO: renamed from: o */
    public boolean f711o = false;

    /* JADX INFO: renamed from: p */
    public int f712p = 0;

    /* JADX INFO: renamed from: q */
    public int f713q = -1;

    public b00(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f697a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m481a(int i) {
        this.f706j = i | this.f706j;
    }

    /* JADX INFO: renamed from: b */
    public final int m482b() {
        int i = this.f703g;
        return i == -1 ? this.f699c : i;
    }

    /* JADX INFO: renamed from: c */
    public final List m483c() {
        ArrayList arrayList;
        return ((this.f706j & 1024) != 0 || (arrayList = this.f707k) == null || arrayList.size() == 0) ? f696s : this.f708l;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m484d() {
        View view = this.f697a;
        return (view.getParent() == null || view.getParent() == this.f714r) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m485e() {
        return (this.f706j & 1) != 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m486f() {
        return (this.f706j & 4) != 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m487g() {
        if ((this.f706j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = ja0.f2600a;
        return !s90.m2317i(this.f697a);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m488h() {
        return (this.f706j & 8) != 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m489i() {
        return this.f710n != null;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m490j() {
        return (this.f706j & 256) != 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m491k() {
        return (this.f706j & 2) != 0;
    }

    /* JADX INFO: renamed from: l */
    public final void m492l(int i, boolean z) {
        if (this.f700d == -1) {
            this.f700d = this.f699c;
        }
        if (this.f703g == -1) {
            this.f703g = this.f699c;
        }
        if (z) {
            this.f703g += i;
        }
        this.f699c += i;
        View view = this.f697a;
        if (view.getLayoutParams() != null) {
            ((C0577oz) view.getLayoutParams()).f3623c = true;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m493m() {
        this.f706j = 0;
        this.f699c = -1;
        this.f700d = -1;
        this.f701e = -1L;
        this.f703g = -1;
        this.f709m = 0;
        this.f704h = null;
        this.f705i = null;
        ArrayList arrayList = this.f707k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f706j &= -1025;
        this.f712p = 0;
        this.f713q = -1;
        RecyclerView.m372j(this);
    }

    /* JADX INFO: renamed from: n */
    public final void m494n(boolean z) {
        int i = this.f709m;
        int i2 = z ? i - 1 : i + 1;
        this.f709m = i2;
        if (i2 < 0) {
            this.f709m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z && i2 == 1) {
            this.f706j |= 16;
        } else if (z && i2 == 0) {
            this.f706j &= -17;
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m495o() {
        return (this.f706j & 128) != 0;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m496p() {
        return (this.f706j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f699c + " id=" + this.f701e + ", oldPos=" + this.f700d + ", pLpos:" + this.f703g);
        if (m489i()) {
            sb.append(" scrap ");
            sb.append(this.f711o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m486f()) {
            sb.append(" invalid");
        }
        if (!m485e()) {
            sb.append(" unbound");
        }
        if ((this.f706j & 2) != 0) {
            sb.append(" update");
        }
        if (m488h()) {
            sb.append(" removed");
        }
        if (m495o()) {
            sb.append(" ignored");
        }
        if (m490j()) {
            sb.append(" tmpDetached");
        }
        if (!m487g()) {
            sb.append(" not recyclable(" + this.f709m + ")");
        }
        if ((this.f706j & 512) != 0 || m486f()) {
            sb.append(" undefined adapter position");
        }
        if (this.f697a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
