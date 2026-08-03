package com.abc.core.features;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.lang.ref.WeakReference;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.i1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0664i1 extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2064b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0670k1 f2065c;

    public C0664i1(int i2) {
        this.f2064b = i2;
        switch (i2) {
            case 1:
                this.f2065c = C0670k1.f2084a;
                break;
            case 2:
                this.f2065c = C0670k1.f2084a;
                break;
            case 3:
                this.f2065c = C0670k1.f2084a;
                break;
            default:
                this.f2065c = C0670k1.f2084a;
                break;
        }
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b c0760b) {
        switch (this.f2064b) {
            case 0:
                C0670k1.f2090g = new WeakReference(c0760b.f2669b);
                if (C0670k1.f2091h == null) {
                    C0670k1 c0670k1 = this.f2065c;
                    Class<?> cls = c0760b.f2669b.getClass();
                    c0670k1.getClass();
                    C0670k1.m1688j(cls);
                }
                break;
            case 1:
                C0670k1.f2090g = new WeakReference(c0760b.f2669b);
                if (C0670k1.f2091h == null) {
                    C0670k1 c0670k12 = this.f2065c;
                    Class<?> cls2 = c0760b.f2669b.getClass();
                    c0670k12.getClass();
                    C0670k1.m1688j(cls2);
                }
                break;
            case 2:
                this.f2065c.getClass();
                if (C0670k1.m1685g()) {
                    Object obj = c0760b.f2669b;
                    View view = obj instanceof View ? (View) obj : null;
                    if (view != null) {
                        if (!(view instanceof EditText)) {
                            String name = view.getClass().getName();
                            if (!AbstractC0425j.m1005J0(name, "EditText", true) && !AbstractC0425j.m1005J0(name, "MMEdit", true)) {
                            }
                        }
                        Object parent = view;
                        for (int i2 = 0; (parent instanceof View) && i2 < 20; i2++) {
                            if (C0670k1.m1683e(parent)) {
                                Object obj2 = c0760b.f2672e;
                                InputConnection inputConnection = obj2 instanceof InputConnection ? (InputConnection) obj2 : null;
                                if (inputConnection != null) {
                                    c0760b.m1946c(new C0667j1(inputConnection, view, new WeakReference(C0670k1.m1679a(view))));
                                    break;
                                }
                            } else {
                                parent = ((View) parent).getParent();
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b c0760b) {
        switch (this.f2064b) {
            case 3:
                this.f2065c.getClass();
                if (C0670k1.m1685g()) {
                    Object[] objArr = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr, "args");
                    Object objM537n0 = AbstractC0179j.m537n0(2, objArr);
                    KeyEvent keyEvent = objM537n0 instanceof KeyEvent ? (KeyEvent) objM537n0 : null;
                    if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
                        Object[] objArr2 = c0760b.f2670c;
                        AbstractC0307g.m702d(objArr2, "args");
                        Object objM537n02 = AbstractC0179j.m537n0(0, objArr2);
                        View view = objM537n02 instanceof View ? (View) objM537n02 : null;
                        Object objM1679a = C0670k1.m1679a(view);
                        if ((objM1679a != null || (objM1679a = C0670k1.m1681c()) != null) && C0670k1.m1686h(view, objM1679a) && C0670k1.m1689k(objM1679a, "onKey")) {
                            c0760b.m1946c(Boolean.TRUE);
                        }
                    }
                    break;
                }
                break;
        }
    }
}
