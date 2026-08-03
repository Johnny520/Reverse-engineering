package p006D;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: D.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0131w extends C0095d {

    /* JADX INFO: renamed from: c */
    public View f320c;

    /* JADX INFO: renamed from: d */
    public WindowInsetsController f321d;

    @Override // p006D.C0095d
    /* JADX INFO: renamed from: A */
    public final void mo338A() {
        View r02 = this.f320c;
        if (r02 != null) goto L5;
    L7:
        WindowInsetsController r1 = this.f321d;
        if (r1 != null) goto L13;
        if (r02 == null) goto L12;
        r1 = AbstractC0130v.m447l(r02);
        goto L13
    L12:
        r1 = null;
    L13:
        if (r1 == null) goto L15;
        AbstractC0130v.m454s(r1, AbstractC0130v.m437b());
        return;
    L15:
        super.mo338A();
        return;
    L5:
        if (Build.VERSION.SDK_INT >= 33) goto L7;
        ((InputMethodManager) r02.getContext().getSystemService("input_method")).isActive();
        goto L7
    }
}
