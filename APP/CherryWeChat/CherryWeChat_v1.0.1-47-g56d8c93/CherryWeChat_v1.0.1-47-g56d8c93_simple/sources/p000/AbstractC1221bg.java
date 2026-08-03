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

    public AbstractC1221bg(C1141ag r2) {
        this.f4173a = r2.f3606a;
        this.f4174b = r2;
        this.f4175c = r2.getContext();
        this.f4176d = r2.f3612g;
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
    public boolean mo952i(int r1) {
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
    public void mo954l(EditText r1) {
    }

    /* JADX INFO: renamed from: m */
    public void mo955m(C1118a0 r1) {
    }

    /* JADX INFO: renamed from: n */
    public void mo956n(AccessibilityEvent r1) {
    }

    /* JADX INFO: renamed from: o */
    public void mo1113o(boolean r1) {
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
