package p000;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: fj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0226fj {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f1969a;

    /* JADX INFO: renamed from: b */
    public final C0189ej f1970b;

    /* JADX INFO: renamed from: c */
    public final Context f1971c;

    /* JADX INFO: renamed from: d */
    public final CheckableImageButton f1972d;

    public AbstractC0226fj(C0189ej c0189ej) {
        this.f1969a = c0189ej.f1786a;
        this.f1970b = c0189ej;
        this.f1971c = c0189ej.getContext();
        this.f1972d = c0189ej.f1792g;
    }

    /* JADX INFO: renamed from: c */
    public int mo1215c() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public int mo1216d() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public View.OnFocusChangeListener mo1217e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public View.OnClickListener mo1218f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public View.OnFocusChangeListener mo1219g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC0001a0 mo1220h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo1221i(int i) {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo1222j() {
        return this instanceof C0597ph;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo1223k() {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m1228p() {
        this.f1970b.m1040f(false);
    }

    /* JADX INFO: renamed from: l */
    public void mo1224l(EditText editText) {
    }

    /* JADX INFO: renamed from: m */
    public void mo1225m(C0357j0 c0357j0) {
    }

    /* JADX INFO: renamed from: n */
    public void mo1226n(AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: renamed from: o */
    public void mo1227o(boolean z) {
    }

    /* JADX INFO: renamed from: a */
    public void mo1213a() {
    }

    /* JADX INFO: renamed from: b */
    public void mo1214b() {
    }

    /* JADX INFO: renamed from: q */
    public void mo1229q() {
    }

    /* JADX INFO: renamed from: r */
    public void mo1230r() {
    }
}
