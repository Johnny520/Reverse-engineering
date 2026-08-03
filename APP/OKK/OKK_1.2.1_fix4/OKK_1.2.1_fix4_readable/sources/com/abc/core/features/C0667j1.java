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
    public final /* synthetic */ C0670k1 f2073a = C0670k1.f2084a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f2074b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ WeakReference f2075c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0667j1(InputConnection inputConnection, View view, WeakReference weakReference) {
        super(inputConnection, true);
        this.f2074b = view;
        this.f2075c = weakReference;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i3) {
        if (i2 > 0 && i3 == 0) {
            WeakReference weakReference = this.f2075c;
            if (!C0670k1.m1685g() ? false : C0670k1.m1686h(this.f2074b, weakReference.get())) {
                Object obj = weakReference.get();
                this.f2073a.getClass();
                if (C0670k1.m1689k(obj, "ime.delete")) {
                    return true;
                }
            }
        }
        return super.deleteSurroundingText(i2, i3);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        if (i2 > 0 && i3 == 0) {
            WeakReference weakReference = this.f2075c;
            if (!C0670k1.m1685g() ? false : C0670k1.m1686h(this.f2074b, weakReference.get())) {
                Object obj = weakReference.get();
                this.f2073a.getClass();
                if (C0670k1.m1689k(obj, "ime.deleteCp")) {
                    return true;
                }
            }
        }
        return super.deleteSurroundingTextInCodePoints(i2, i3);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        AbstractC0307g.m703e(keyEvent, "event");
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
            WeakReference weakReference = this.f2075c;
            if (!C0670k1.m1685g() ? false : C0670k1.m1686h(this.f2074b, weakReference.get())) {
                Object obj = weakReference.get();
                this.f2073a.getClass();
                if (C0670k1.m1689k(obj, "ime.key")) {
                    return true;
                }
            }
        }
        return super.sendKeyEvent(keyEvent);
    }
}
