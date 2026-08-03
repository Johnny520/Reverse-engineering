package com.abc.core.features;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import java.lang.ref.WeakReference;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0667j1 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0670k1 f2073a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f2074b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ WeakReference f2075c;

    public C0667j1(InputConnection r2, View r3, WeakReference r4) {
        this.f2073a = C0670k1.f2084a;
        this.f2074b = r3;
        this.f2075c = r4;
        super(r2, true);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int r4, int r5) {
        if (r4 <= 0) goto L14;
        if (r5 != 0) goto L14;
        WeakReference r02 = this.f2075c;
        Object r1 = r02.get();
        if (C0670k1.m1685g() == true) goto L7;
        boolean r12 = false;
    L8:
        if (r12 == false) goto L14;
        Object r03 = r02.get();
        this.f2073a.getClass();
        if (C0670k1.m1689k(r03, "ime.delete") == false) goto L14;
        return true;
    L7:
        r12 = C0670k1.m1686h(this.f2074b, r1);
    L14:
        return super.deleteSurroundingText(r4, r5);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int r4, int r5) {
        if (r4 <= 0) goto L14;
        if (r5 != 0) goto L14;
        WeakReference r02 = this.f2075c;
        Object r1 = r02.get();
        if (C0670k1.m1685g() == true) goto L7;
        boolean r12 = false;
    L8:
        if (r12 == false) goto L14;
        Object r03 = r02.get();
        this.f2073a.getClass();
        if (C0670k1.m1689k(r03, "ime.deleteCp") == false) goto L14;
        return true;
    L7:
        r12 = C0670k1.m1686h(this.f2074b, r1);
    L14:
        return super.deleteSurroundingTextInCodePoints(r4, r5);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent r4) {
        AbstractC0307g.m703e(r4, "event");
        if (r4.getAction() != 0) goto L16;
        if (r4.getKeyCode() != 67) goto L16;
        WeakReference r02 = this.f2075c;
        Object r1 = r02.get();
        if (C0670k1.m1685g() == true) goto L9;
        boolean r12 = false;
    L10:
        if (r12 == false) goto L16;
        Object r03 = r02.get();
        this.f2073a.getClass();
        if (C0670k1.m1689k(r03, "ime.key") == false) goto L16;
        return true;
    L9:
        r12 = C0670k1.m1686h(this.f2074b, r1);
    L16:
        return super.sendKeyEvent(r4);
    }
}
