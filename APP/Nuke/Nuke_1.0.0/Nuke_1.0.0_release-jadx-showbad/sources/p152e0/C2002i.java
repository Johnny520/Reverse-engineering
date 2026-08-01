package p152e0;

import android.os.Bundle;
import java.util.Map;
import p000A.C0099z;
import p002A1.AbstractC0142o;
import p002A1.C0147t;
import p048I1.C0780e;
import p048I1.C0781f;
import p048I1.InterfaceC0782g;
import p055K1.C0874a;
import p112W2.InterfaceC1599a;

/* JADX INFO: renamed from: e0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2002i implements InterfaceC1999f, InterfaceC0782g {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2000g f6722d;

    /* JADX INFO: renamed from: e */
    public C0147t f6723e;

    /* JADX INFO: renamed from: f */
    public C0781f f6724f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2002i(C2000g c2000g) {
        this.f6722d = c2000g;
        Object objMo1277c = c2000g.mo1277c("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objMo1277c instanceof Bundle ? (Bundle) objMo1277c : null;
        if (bundle != null) {
            m3668e(bundle);
        }
        c2000g.mo1278d("androidx.savedstate.SavedStateRegistry", new C0099z(19, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152e0.InterfaceC1999f
    /* JADX INFO: renamed from: a */
    public final boolean mo1275a(Object obj) {
        return this.f6722d.mo1275a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152e0.InterfaceC1999f
    /* JADX INFO: renamed from: b */
    public final Map mo1276b() {
        return this.f6722d.mo1276b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152e0.InterfaceC1999f
    /* JADX INFO: renamed from: c */
    public final Object mo1277c(String str) {
        return this.f6722d.mo1277c(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152e0.InterfaceC1999f
    /* JADX INFO: renamed from: d */
    public final InterfaceC1998e mo1278d(String str, InterfaceC1599a interfaceC1599a) {
        return this.f6722d.mo1278d(str, interfaceC1599a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C0781f m3668e(Bundle bundle) {
        C0781f c0781f = this.f6724f;
        if (c0781f != null) {
            return c0781f;
        }
        C0781f c0781f2 = new C0781f(new C0874a(this, new C0099z(6, this)));
        this.f6724f = c0781f2;
        c0781f2.m1329a(bundle);
        return c0781f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p002A1.InterfaceC0145r
    public final AbstractC0142o getLifecycle() {
        C0147t c0147t = this.f6723e;
        if (c0147t != null) {
            return c0147t;
        }
        C0147t c0147t2 = new C0147t(this, false);
        this.f6723e = c0147t2;
        return c0147t2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p048I1.InterfaceC0782g
    public final C0780e getSavedStateRegistry() {
        return m3668e(null).f2525b;
    }
}
