package p052d0;

import android.view.KeyEvent;
import android.view.View;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: d0.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnKeyListenerC0747h implements View.OnKeyListener {
    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (i2 != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        AbstractC0358S.m898n(true);
        return true;
    }
}
