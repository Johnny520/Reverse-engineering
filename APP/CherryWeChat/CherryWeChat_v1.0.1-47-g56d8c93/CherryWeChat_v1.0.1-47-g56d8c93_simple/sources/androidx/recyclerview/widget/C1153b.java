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
    public final C2088j9 f4018b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f4019c;

    public C1153b(C1384ev r1) {
        this.f4017a = r1;
        this.f4018b = new C2088j9();
        this.f4019c = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m2228a(View r3, int r4, boolean r5) {
        RecyclerView r0 = this.f4017a.f4930a;
        if (r4 >= 0) goto L5;
        int r42 = r0.getChildCount();
    L6:
        this.f4018b.m4257e(r42, r5);
        if (r5 == false) goto L9;
        m2236i(r3);
    L9:
        r0.addView(r3, r42);
        r0.dispatchChildAttached(r3);
        return;
    L5:
        r42 = m2233f(r4);
        goto L6
    }

    /* JADX INFO: renamed from: b */
    public final void m2229b(View r3, int r4, ViewGroup.LayoutParams r5, boolean r6) {
        RecyclerView r0 = this.f4017a.f4930a;
        if (r4 >= 0) goto L5;
        int r42 = r0.getChildCount();
    L6:
        this.f4018b.m4257e(r42, r6);
        if (r6 == false) goto L9;
        m2236i(r3);
    L9:
        AbstractC1166o r62 = RecyclerView.getChildViewHolderInt(r3);
        if (r62 == null) goto L23;
        if (r62.isTmpDetached() == true) goto L19;
        if (r62.shouldIgnore() == true) goto L19;
        StringBuilder r43 = new StringBuilder("Called attach on a child which is not detached: ");
        r43.append(r62);
        throw new IllegalArgumentException(AbstractC0213Ey.m406d(r0, r43));
    L19:
        if (RecyclerView.sVerboseLoggingEnabled == false) goto L21;
        r62.toString();
    L21:
        r62.clearTmpDetachFlag();
    L24:
        RecyclerView.access$000(r0, r3, r42, r5);
        return;
    L23:
        if (RecyclerView.sDebugAssertionsEnabled == false) goto L24;
        StringBuilder r63 = new StringBuilder("No ViewHolder found for child: ");
        r63.append(r3);
        r63.append(", index: ");
        r63.append(r42);
        throw new IllegalArgumentException(AbstractC0213Ey.m406d(r0, r63));
    L5:
        r42 = m2233f(r4);
        goto L6
    }

    /* JADX INFO: renamed from: c */
    public final void m2230c(int r5) {
        int r52 = m2233f(r5);
        this.f4018b.m4258f(r52);
        RecyclerView r0 = this.f4017a.f4930a;
        View r1 = r0.getChildAt(r52);
        if (r1 == null) goto L18;
        AbstractC1166o r12 = RecyclerView.getChildViewHolderInt(r1);
        if (r12 != null) goto L7;
    L19:
        RecyclerView.access$100(r0, r52);
        return;
    L7:
        if (r12.isTmpDetached() == false) goto L14;
        if (r12.shouldIgnore() == true) goto L14;
        StringBuilder r2 = new StringBuilder("called detach on an already detached child ");
        r2.append(r12);
        throw new IllegalArgumentException(AbstractC0213Ey.m406d(r0, r2));
    L14:
        if (RecyclerView.sVerboseLoggingEnabled == false) goto L16;
        r12.toString();
    L16:
        r12.addFlags(256);
        goto L19
    L18:
        if (RecyclerView.sDebugAssertionsEnabled == false) goto L19;
        StringBuilder r22 = new StringBuilder("No view at offset ");
        r22.append(r52);
        throw new IllegalArgumentException(AbstractC0213Ey.m406d(r0, r22));
    }

    /* JADX INFO: renamed from: d */
    public final View m2231d(int r2) {
        int r22 = m2233f(r2);
        return this.f4017a.f4930a.getChildAt(r22);
    }

    /* JADX INFO: renamed from: e */
    public final int m2232e() {
        return this.f4017a.f4930a.getChildCount() - this.f4019c.size();
    }

    /* JADX INFO: renamed from: f */
    public final int m2233f(int r6) {
        if (r6 >= 0) goto L5;
        return -1;
    L5:
        int r1 = this.f4017a.f4930a.getChildCount();
        int r2 = r6;
    L6:
        if (r2 >= r1) goto L14;
        C2088j9 r3 = this.f4018b;
        int r4 = r6 - (r2 - r3.m4254b(r2));
        if (r4 == 0) goto L10;
        r2 = r2 + r4;
    L10:
        if (r3.m4256d(r2) == false) goto L12;
        r2 = r2 + 1;
        goto L10
    L12:
        return r2;
    L14:
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public final View m2234g(int r2) {
        return this.f4017a.f4930a.getChildAt(r2);
    }

    /* JADX INFO: renamed from: h */
    public final int m2235h() {
        return this.f4017a.f4930a.getChildCount();
    }

    /* JADX INFO: renamed from: i */
    public final void m2236i(View r2) {
        this.f4019c.add(r2);
        AbstractC1166o r22 = RecyclerView.getChildViewHolderInt(r2);
        if (r22 == null) goto L6;
        r22.onEnteredHiddenState(this.f4017a.f4930a);
        return;
    }

    /* JADX INFO: renamed from: j */
    public final int m2237j(View r4) {
        int r42 = this.f4017a.f4930a.indexOfChild(r4);
        if (r42 != (-1)) goto L5;
        return -1;
    L5:
        C2088j9 r1 = this.f4018b;
        if (r1.m4256d(r42) == false) goto L9;
        return -1;
    L9:
        return r42 - r1.m4254b(r42);
    }

    /* JADX INFO: renamed from: k */
    public final void m2238k(View r2) {
        if (this.f4019c.remove(r2) == false) goto L8;
        AbstractC1166o r22 = RecyclerView.getChildViewHolderInt(r2);
        if (r22 == null) goto L9;
        r22.onLeftHiddenState(this.f4017a.f4930a);
        return;
    L9:
        return;
    }

    public final String toString() {
        return this.f4018b.toString() + ", hidden list:" + this.f4019c.size();
    }
}
