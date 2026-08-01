package p055K1;

import android.os.Bundle;
import java.util.LinkedHashMap;
import p000A.C0099z;
import p002A1.C0115D;
import p002A1.C0147t;
import p002A1.EnumC0141n;
import p047I0.C0695S0;
import p048I1.InterfaceC0782g;

/* JADX INFO: renamed from: K1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0874a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0782g f2756a;

    /* JADX INFO: renamed from: b */
    public final C0099z f2757b;

    /* JADX INFO: renamed from: e */
    public boolean f2760e;

    /* JADX INFO: renamed from: f */
    public Bundle f2761f;

    /* JADX INFO: renamed from: g */
    public boolean f2762g;

    /* JADX INFO: renamed from: c */
    public final C0115D f2758c = new C0115D(15);

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f2759d = new LinkedHashMap();

    /* JADX INFO: renamed from: h */
    public boolean f2763h = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0874a(InterfaceC0782g interfaceC0782g, C0099z c0099z) {
        this.f2756a = interfaceC0782g;
        this.f2757b = c0099z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1901a() {
        InterfaceC0782g interfaceC0782g = this.f2756a;
        if (((C0147t) interfaceC0782g.getLifecycle()).f541c != EnumC0141n.f532e) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f2760e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f2757b.mo6a();
        interfaceC0782g.getLifecycle().mo184a(new C0695S0(1, this));
        this.f2760e = true;
    }
}
