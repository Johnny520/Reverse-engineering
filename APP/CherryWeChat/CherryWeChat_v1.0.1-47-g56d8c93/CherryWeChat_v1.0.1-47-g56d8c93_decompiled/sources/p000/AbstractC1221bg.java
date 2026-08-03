package p000;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: bg */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1221bg {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f4173a;

    /* JADX INFO: renamed from: b */
    public final C1141ag f4174b;

    /* JADX INFO: renamed from: c */
    public final Context f4175c;

    /* JADX INFO: renamed from: d */
    public final CheckableImageButton f4176d;

    public AbstractC1221bg(C1141ag c1141ag) {
        this.f4173a = c1141ag.f3606a;
        this.f4174b = c1141ag;
        this.f4175c = c1141ag.getContext();
        this.f4176d = c1141ag.f3612g;
    }

    /* JADX INFO: renamed from: a */
    public void mo946a() {
    }

    /* JADX INFO: renamed from: b */
    public void mo992b() {
    }

    /* JADX INFO: renamed from: c */
    public int mo947c() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public int mo948d() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public View.OnFocusChangeListener mo949e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public View.OnClickListener mo950f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public View.OnFocusChangeListener mo1112g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public AccessibilityManager.TouchExplorationStateChangeListener mo951h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo952i(int i) {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo993j() {
        return this instanceof C0494Le;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo953k() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public void mo954l(EditText editText) {
    }

    /* JADX INFO: renamed from: m */
    public void mo955m(C1118a0 c1118a0) {
    }

    /* JADX INFO: renamed from: n */
    public void mo956n(AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: renamed from: o */
    public void mo1113o(boolean z) {
    }

    /* JADX INFO: renamed from: p */
    public final void m2348p() {
        this.f4174b.m2063f(false);
    }

    /* JADX INFO: renamed from: q */
    public void mo957q() {
    }

    /* JADX INFO: renamed from: r */
    public void mo958r() {
    }
}
