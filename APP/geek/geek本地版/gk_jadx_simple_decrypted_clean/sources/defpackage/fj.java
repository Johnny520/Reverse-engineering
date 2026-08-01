package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class fj {
    public final TextInputLayout a;
    public final ej b;
    public final Context c;
    public final CheckableImageButton d;

    public fj(ej r2) {
        this.a = r2.a;
        this.b = r2;
        this.c = r2.getContext();
        this.d = r2.g;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public a0 h() {
        return null;
    }

    public boolean i(int r1) {
        return true;
    }

    public boolean j() {
        return this instanceof ph;
    }

    public boolean k() {
        return false;
    }

    public final void p() {
        this.b.f(false);
    }

    public void l(EditText r1) {
    }

    public void m(j0 r1) {
    }

    public void n(AccessibilityEvent r1) {
    }

    public void o(boolean r1) {
    }

    public void a() {
    }

    public void b() {
    }

    public void q() {
    }

    public void r() {
    }
}
