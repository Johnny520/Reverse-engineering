package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import p000.AbstractC0213Ey;
import p000.C1384ev;
import p000.C2088j9;

/* JADX INFO: renamed from: androidx.recyclerview.widget.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1153b {

    /* JADX INFO: renamed from: a */
    public final C1384ev f4017a;

    /* JADX INFO: renamed from: b */
    public final C2088j9 f4018b = new C2088j9();

    /* JADX INFO: renamed from: c */
    public final ArrayList f4019c = new ArrayList();

    public C1153b(C1384ev c1384ev) {
        this.f4017a = c1384ev;
    }

    /* JADX INFO: renamed from: a */
    public final void m2228a(View view, int i, boolean z) {
        RecyclerView recyclerView = this.f4017a.f4930a;
        int childCount = i < 0 ? recyclerView.getChildCount() : m2233f(i);
        this.f4018b.m4257e(childCount, z);
        if (z) {
            m2236i(view);
        }
        recyclerView.addView(view, childCount);
        recyclerView.dispatchChildAttached(view);
    }

    /* JADX INFO: renamed from: b */
    public final void m2229b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = this.f4017a.f4930a;
        int childCount = i < 0 ? recyclerView.getChildCount() : m2233f(i);
        this.f4018b.m4257e(childCount, z);
        if (z) {
            m2236i(view);
        }
        AbstractC1166o childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(AbstractC0213Ey.m406d(recyclerView, sb));
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                childViewHolderInt.toString();
            }
            childViewHolderInt.clearTmpDetachFlag();
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(AbstractC0213Ey.m406d(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public final void m2230c(int i) {
        int iM2233f = m2233f(i);
        this.f4018b.m4258f(iM2233f);
        RecyclerView recyclerView = this.f4017a.f4930a;
        View childAt = recyclerView.getChildAt(iM2233f);
        if (childAt != null) {
            AbstractC1166o childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(childViewHolderInt);
                    throw new IllegalArgumentException(AbstractC0213Ey.m406d(recyclerView, sb));
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
                childViewHolderInt.addFlags(256);
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(iM2233f);
            throw new IllegalArgumentException(AbstractC0213Ey.m406d(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(iM2233f);
    }

    /* JADX INFO: renamed from: d */
    public final View m2231d(int i) {
        return this.f4017a.f4930a.getChildAt(m2233f(i));
    }

    /* JADX INFO: renamed from: e */
    public final int m2232e() {
        return this.f4017a.f4930a.getChildCount() - this.f4019c.size();
    }

    /* JADX INFO: renamed from: f */
    public final int m2233f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f4017a.f4930a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C2088j9 c2088j9 = this.f4018b;
            int iM4254b = i - (i2 - c2088j9.m4254b(i2));
            if (iM4254b == 0) {
                while (c2088j9.m4256d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM4254b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public final View m2234g(int i) {
        return this.f4017a.f4930a.getChildAt(i);
    }

    /* JADX INFO: renamed from: h */
    public final int m2235h() {
        return this.f4017a.f4930a.getChildCount();
    }

    /* JADX INFO: renamed from: i */
    public final void m2236i(View view) {
        this.f4019c.add(view);
        AbstractC1166o childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(this.f4017a.f4930a);
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m2237j(View view) {
        int iIndexOfChild = this.f4017a.f4930a.indexOfChild(view);
        if (iIndexOfChild == -1) {
            return -1;
        }
        C2088j9 c2088j9 = this.f4018b;
        if (c2088j9.m4256d(iIndexOfChild)) {
            return -1;
        }
        return iIndexOfChild - c2088j9.m4254b(iIndexOfChild);
    }

    /* JADX INFO: renamed from: k */
    public final void m2238k(View view) {
        AbstractC1166o childViewHolderInt;
        if (!this.f4019c.remove(view) || (childViewHolderInt = RecyclerView.getChildViewHolderInt(view)) == null) {
            return;
        }
        childViewHolderInt.onLeftHiddenState(this.f4017a.f4930a);
    }

    public final String toString() {
        return this.f4018b.toString() + ", hidden list:" + this.f4019c.size();
    }
}
