package p000a;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0979c;
import androidx.appcompat.C0983R;
import androidx.appcompat.app.DialogInterfaceC0989b;
import androidx.savedstate.C1225b;
import p000a.AbstractC0255O0;
import p000a.AbstractC0272P;

/* JADX INFO: renamed from: a.X0 */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0416X0 extends DialogC0078E3 implements InterfaceC0147I0 {

    /* JADX INFO: renamed from: d */
    public LayoutInflaterFactory2C0291Q0 f1578d;

    /* JADX INFO: renamed from: e */
    public final C0398W0 f1579e;

    public DialogC0416X0(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(C0983R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(contextThemeWrapper, i2);
        this.f1579e = new C0398W0((DialogInterfaceC0989b) this);
        AbstractC0255O0 abstractC0255O0M1058c = m1058c();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(C0983R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C0291Q0) abstractC0255O0M1058c).f1011U = i;
        abstractC0255O0M1058c.mo709o();
    }

    @Override // p000a.DialogC0078E3, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1058c().mo698c(view, layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0255O0 m1058c() {
        if (this.f1578d == null) {
            AbstractC0255O0.c cVar = AbstractC0255O0.f886a;
            this.f1578d = new LayoutInflaterFactory2C0291Q0(getContext(), getWindow(), this, this);
        }
        return this.f1578d;
    }

    /* JADX INFO: renamed from: d */
    public final void m1059d() {
        C0235Mg.m628a(getWindow().getDecorView(), this);
        C1225b.m3011a(getWindow().getDecorView(), this);
        C0979c.m2290a(getWindow().getDecorView(), this);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m1058c().mo710p();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        C0398W0 c0398w0 = this.f1579e;
        if (c0398w0 == null) {
            return false;
        }
        return c0398w0.f1525a.m1060e(keyEvent);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1060e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i) {
        return (T) m1058c().mo700e(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        m1058c().mo707l();
    }

    @Override // p000a.DialogC0078E3, android.app.Dialog
    public void onCreate(Bundle bundle) {
        m1058c().mo706k();
        super.onCreate(bundle);
        m1058c().mo709o();
    }

    @Override // p000a.DialogC0078E3, android.app.Dialog
    public final void onStop() {
        super.onStop();
        m1058c().mo714t();
    }

    @Override // p000a.InterfaceC0147I0
    public final void onSupportActionModeFinished(AbstractC0272P abstractC0272P) {
    }

    @Override // p000a.InterfaceC0147I0
    public final void onSupportActionModeStarted(AbstractC0272P abstractC0272P) {
    }

    @Override // p000a.InterfaceC0147I0
    public final AbstractC0272P onWindowStartingSupportActionMode(AbstractC0272P.a aVar) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000a.DialogC0078E3, android.app.Dialog
    public final void setContentView(int i) {
        m1059d();
        m1058c().mo716w(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m1058c().mo696B(charSequence);
    }

    @Override // p000a.DialogC0078E3, android.app.Dialog
    public final void setContentView(View view) {
        m1059d();
        m1058c().mo717x(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        m1058c().mo696B(getContext().getString(i));
    }

    @Override // p000a.DialogC0078E3, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1059d();
        m1058c().mo718y(view, layoutParams);
    }
}
