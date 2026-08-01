package p178m1;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* JADX INFO: renamed from: m1.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4811w implements InterfaceC4810v {

    /* JADX INFO: renamed from: a */
    public final AutofillManager f14325a;

    public C4811w(AutofillManager autofillManager) {
        this.f14325a = autofillManager;
    }

    @Override // p178m1.InterfaceC4810v
    /* JADX INFO: renamed from: a */
    public void mo19256a(View view, int i10, AutofillValue autofillValue) {
        this.f14325a.notifyValueChanged(view, i10, autofillValue);
    }

    @Override // p178m1.InterfaceC4810v
    /* JADX INFO: renamed from: b */
    public void mo19257b(View view, int i10, Rect rect) {
        this.f14325a.requestAutofill(view, i10, rect);
    }

    @Override // p178m1.InterfaceC4810v
    /* JADX INFO: renamed from: c */
    public void mo19258c(View view, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT >= 27) {
            C4799k.f14275a.m19242a(view, this.f14325a, i10, z10);
        }
    }

    @Override // p178m1.InterfaceC4810v
    public void commit() {
        this.f14325a.commit();
    }

    @Override // p178m1.InterfaceC4810v
    /* JADX INFO: renamed from: d */
    public void mo19259d(View view, int i10) {
        this.f14325a.notifyViewExited(view, i10);
    }

    @Override // p178m1.InterfaceC4810v
    /* JADX INFO: renamed from: e */
    public void mo19260e(View view, int i10, Rect rect) {
        this.f14325a.notifyViewEntered(view, i10, rect);
    }
}
