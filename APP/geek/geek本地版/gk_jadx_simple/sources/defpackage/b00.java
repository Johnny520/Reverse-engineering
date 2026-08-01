package defpackage;

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
    public static final List s = null;
    public final View a;
    public WeakReference b;
    public int c;
    public int d;
    public long e;
    public int f;
    public int g;
    public b00 h;
    public b00 i;
    public int j;
    public final ArrayList k;
    public final List l;
    public int m;
    public tz n;
    public boolean o;
    public int p;
    public int q;
    public RecyclerView r;

    static {
        s = Collections.EMPTY_LIST;
    }

    public b00(View r4) {
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = null;
        this.i = null;
        this.k = null;
        this.l = null;
        this.m = 0;
        this.n = null;
        this.o = false;
        this.p = 0;
        this.q = -1;
        if (r4 == null) goto L7;
        this.a = r4;
        return;
    L7:
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int r2) {
        this.j = r2 | this.j;
    }

    public final int b() {
        int r0 = this.g;
        if (r0 == (-1)) goto L5;
        return r0;
    L5:
        return this.c;
    }

    public final List c() {
        if ((this.j & 1024) != 0) goto L12;
        ArrayList r0 = this.k;
        if (r0 == null) goto L12;
        if (r0.size() == 0) goto L12;
        return this.l;
    L12:
        return s;
    }

    public final boolean d() {
        View r0 = this.a;
        if (r0.getParent() != null) goto L5;
        return false;
    L5:
        if (r0.getParent() == this.r) goto L10;
        return true;
    L10:
        return false;
    }

    public final boolean e() {
        if ((this.j & 1) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean f() {
        if ((this.j & 4) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean g() {
        if ((this.j & 16) != 0) goto L8;
        WeakHashMap r0 = ja0.a;
        if (s90.i(this.a) == true) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public final boolean h() {
        if ((this.j & 8) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean i() {
        if (this.n == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean j() {
        if ((this.j & 256) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean k() {
        if ((this.j & 2) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final void l(int r3, boolean r4) {
        if (this.d != (-1)) goto L6;
        this.d = this.c;
    L6:
        if (this.g != (-1)) goto L8;
        this.g = this.c;
    L8:
        if (r4 == false) goto L10;
        this.g += r3;
    L10:
        this.c += r3;
        View r32 = this.a;
        if (r32.getLayoutParams() == null) goto L14;
        ((oz) r32.getLayoutParams()).c = true;
        return;
    }

    public final void m() {
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.g = -1;
        this.m = 0;
        this.h = null;
        this.i = null;
        ArrayList r2 = this.k;
        if (r2 == null) goto L5;
        r2.clear();
    L5:
        this.j &= -1025;
        this.p = 0;
        this.q = -1;
        RecyclerView.j(this);
    }

    public final void n(boolean r3) {
        int r1 = this.m;
        if (r3 == false) goto L5;
        int r12 = r1 - 1;
    L6:
        this.m = r12;
        if (r12 >= 0) goto L10;
        this.m = 0;
        Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        return;
    L10:
        if (r3 == true) goto L14;
        if (r12 != 1) goto L14;
        this.j |= 16;
        return;
    L14:
        if (r3 == false) goto L18;
        if (r12 != 0) goto L19;
        this.j &= -17;
        return;
    L19:
        return;
    L18:
        return;
    L5:
        r12 = r1 + 1;
        goto L6
    }

    public final boolean o() {
        if ((this.j & 128) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean p() {
        if ((this.j & 32) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final String toString() {
        if (getClass().isAnonymousClass() == false) goto L5;
        String r0 = "ViewHolder";
    L6:
        StringBuilder r1 = new StringBuilder(r0 + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
        if (i() == false) goto L14;
        r1.append(" scrap ");
        if (this.o == false) goto L11;
        String r02 = "[changeScrap]";
    L12:
        r1.append(r02);
        goto L14
    L11:
        r02 = "[attachedScrap]";
    L14:
        if (f() == false) goto L17;
        r1.append(" invalid");
    L17:
        if (e() == true) goto L20;
        r1.append(" unbound");
    L20:
        if ((this.j & 2) == 0) goto L23;
        r1.append(" update");
    L23:
        if (h() == false) goto L26;
        r1.append(" removed");
    L26:
        if (o() == false) goto L29;
        r1.append(" ignored");
    L29:
        if (j() == false) goto L32;
        r1.append(" tmpDetached");
    L32:
        if (g() == true) goto L35;
        r1.append(" not recyclable(" + this.m + ")");
    L35:
        if ((this.j & 512) == 0) goto L37;
    L38:
        r1.append(" undefined adapter position");
    L40:
        if (this.a.getParent() != null) goto L42;
        r1.append(" no parent");
    L42:
        r1.append("}");
        return r1.toString();
    L37:
        if (f() == false) goto L40;
    L5:
        r0 = getClass().getSimpleName();
        goto L6
    }
}
