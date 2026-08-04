package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import yyds.InterfaceC2018;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class DialogScrollView extends ScrollView implements InterfaceC2018 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public boolean f415;

    public DialogScrollView(Context context) {
        super(context);
    }

    @Override // yyds.InterfaceC2018
    public int getScrollDistance() {
        return getScrollY();
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f415) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // yyds.InterfaceC2018
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean mo292() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            if (getHeight() < childAt.getHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // yyds.InterfaceC2018
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void mo293(boolean z) {
        this.f415 = z;
    }

    public DialogScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
