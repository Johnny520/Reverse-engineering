package p000;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: hj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0300hj {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f2228a;

    /* JADX INFO: renamed from: b */
    public final C0263gj f2229b;

    /* JADX INFO: renamed from: c */
    public final Context f2230c;

    /* JADX INFO: renamed from: d */
    public final CheckableImageButton f2231d;

    public AbstractC0300hj(C0263gj c0263gj) {
        this.f2228a = c0263gj.f1997a;
        this.f2229b = c0263gj;
        this.f2230c = c0263gj.getContext();
        this.f2231d = c0263gj.f2003g;
    }

    /* JADX INFO: renamed from: c */
    public int mo599c() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public int mo600d() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public View.OnFocusChangeListener mo601e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public View.OnClickListener mo602f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public View.OnFocusChangeListener mo603g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC0001a0 mo1397h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo1398i(int i) {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo1399j() {
        return this instanceof C0670rh;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo1400k() {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m1403p() {
        this.f2229b.m1288f(false);
    }

    /* JADX INFO: renamed from: l */
    public void mo604l(EditText editText) {
    }

    /* JADX INFO: renamed from: m */
    public void mo1401m(C0357j0 c0357j0) {
    }

    /* JADX INFO: renamed from: n */
    public void mo1402n(AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: renamed from: o */
    public void mo605o(boolean z) {
    }

    /* JADX INFO: renamed from: a */
    public void mo598a() {
    }

    /* JADX INFO: renamed from: b */
    public void mo1396b() {
    }

    /* JADX INFO: renamed from: q */
    public void mo606q() {
    }

    /* JADX INFO: renamed from: r */
    public void mo607r() {
    }
}
