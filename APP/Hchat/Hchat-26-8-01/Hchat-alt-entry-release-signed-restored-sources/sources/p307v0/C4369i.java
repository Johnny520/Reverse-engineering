package p307v0;

import android.os.Bundle;
import androidx.lifecycle.C0114s;
import java.util.Map;
import p085fg.InterfaceC1220a;
import p116i.C1746e0;
import p174m.C2571a;
import p227p4.C3315t;
import p294u3.InterfaceC4250c;
import pa.C3377c;

/* JADX INFO: renamed from: v0.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4369i implements InterfaceC4366f, InterfaceC4250c {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4367g f14576g;

    /* JADX INFO: renamed from: h */
    public C0114s f14577h;

    /* JADX INFO: renamed from: i */
    public C3315t f14578i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4369i(C4367g c4367g) {
        this.f14576g = c4367g;
        Object objMo8039d = c4367g.mo8039d("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objMo8039d instanceof Bundle ? (Bundle) objMo8039d : null;
        if (bundle != null) {
            m8802g(bundle);
        }
        c4367g.mo8040e("androidx.savedstate.SavedStateRegistry", new C4361a(this, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p307v0.InterfaceC4366f
    /* JADX INFO: renamed from: a */
    public final boolean mo8036a(Object obj) {
        return this.f14576g.mo8036a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p294u3.InterfaceC4250c
    /* JADX INFO: renamed from: b */
    public final C2571a mo1402b() {
        return (C2571a) m8802g(null).f10678i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p307v0.InterfaceC4366f
    /* JADX INFO: renamed from: c */
    public final Map mo8038c() {
        return this.f14576g.mo8038c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p307v0.InterfaceC4366f
    /* JADX INFO: renamed from: d */
    public final Object mo8039d(String str) {
        return this.f14576g.mo8039d(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p307v0.InterfaceC4366f
    /* JADX INFO: renamed from: e */
    public final InterfaceC4365e mo8040e(String str, InterfaceC1220a interfaceC1220a) {
        return this.f14576g.mo8040e(str, interfaceC1220a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0112q
    /* JADX INFO: renamed from: f */
    public final C0114s mo550f() {
        C0114s c0114s = this.f14577h;
        if (c0114s != null) {
            return c0114s;
        }
        C0114s c0114s2 = new C0114s(this, false);
        this.f14577h = c0114s2;
        return c0114s2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final C3315t m8802g(Bundle bundle) {
        C3315t c3315t = this.f14578i;
        if (c3315t != null) {
            return c3315t;
        }
        C3315t c3315t2 = new C3315t(new C3377c(this, new C1746e0(this, 28)));
        this.f14578i = c3315t2;
        c3315t2.m7017F(bundle);
        return c3315t2;
    }
}
