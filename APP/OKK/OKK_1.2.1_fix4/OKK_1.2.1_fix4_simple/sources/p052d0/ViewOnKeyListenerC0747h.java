package p052d0;

import android.view.KeyEvent;
import android.view.View;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: d0.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnKeyListenerC0747h implements View.OnKeyListener {
    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View r1, int r2, KeyEvent r3) {
        if (r2 == 4) goto L5;
    L7:
        return false;
    L5:
        if (r3.getAction() != 1) goto L7;
        AbstractC0358S.m898n(true);
        return true;
    }
}
