package Yue;

import android.view.autofill.AutofillId;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3502 {

    /* JADX INFO: renamed from: ۥ */
    public final Object f339;

    @InterfaceC7113(26)
    public C3502(@InterfaceC6391 AutofillId autofillId) {
        this.f339 = autofillId;
    }

    @InterfaceC6391
    @InterfaceC7113(26)
    /* JADX INFO: renamed from: ۥ۟ */
    public static C3502 m559(@InterfaceC6391 AutofillId autofillId) {
        return new C3502(autofillId);
    }

    @InterfaceC6391
    @InterfaceC7113(26)
    /* JADX INFO: renamed from: ۥ */
    public AutofillId m560() {
        return (AutofillId) this.f339;
    }
}
