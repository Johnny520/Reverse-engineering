package p001A0;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import p008E.C0156j;

/* JADX INFO: renamed from: A0.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0046v {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f138a;

    /* JADX INFO: renamed from: b */
    public final C0045u f139b;

    /* JADX INFO: renamed from: c */
    public final Context f140c;

    /* JADX INFO: renamed from: d */
    public final CheckableImageButton f141d;

    public AbstractC0046v(C0045u c0045u) {
        this.f138a = c0045u.f116a;
        this.f139b = c0045u;
        this.f140c = c0045u.getContext();
        this.f141d = c0045u.f122g;
    }

    /* JADX INFO: renamed from: a */
    public void mo57a() {
    }

    /* JADX INFO: renamed from: b */
    public void mo154b() {
    }

    /* JADX INFO: renamed from: c */
    public int mo58c() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public int mo59d() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public View.OnFocusChangeListener mo60e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public View.OnClickListener mo61f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public View.OnFocusChangeListener mo62g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public C0037m mo71h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo72i(int i2) {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo73j() {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo155k() {
        return this instanceof C0039o;
    }

    /* JADX INFO: renamed from: l */
    public boolean mo74l() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public void mo63m(EditText editText) {
    }

    /* JADX INFO: renamed from: n */
    public void mo75n(C0156j c0156j) {
    }

    /* JADX INFO: renamed from: o */
    public void mo76o(AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: renamed from: p */
    public void mo64p(boolean z2) {
    }

    /* JADX INFO: renamed from: q */
    public final void m156q() {
        this.f139b.m145f(false);
    }

    /* JADX INFO: renamed from: r */
    public void mo65r() {
    }

    /* JADX INFO: renamed from: s */
    public void mo66s() {
    }
}
