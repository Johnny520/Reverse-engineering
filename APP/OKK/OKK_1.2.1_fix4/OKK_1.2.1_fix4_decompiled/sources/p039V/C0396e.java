package p039V;

import android.os.Bundle;
import androidx.lifecycle.C0532i;
import p031Q0.AbstractC0307g;
import p061i.C0950c;
import p061i.C0953f;

/* JADX INFO: renamed from: V.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0396e {

    /* JADX INFO: renamed from: b */
    public boolean f885b;

    /* JADX INFO: renamed from: c */
    public Bundle f886c;

    /* JADX INFO: renamed from: d */
    public C0392a f887d;

    /* JADX INFO: renamed from: a */
    public final C0953f f884a = new C0953f();

    /* JADX INFO: renamed from: e */
    public boolean f888e = true;

    /* JADX INFO: renamed from: a */
    public final Bundle m982a(String str) {
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    /* JADX INFO: renamed from: b */
    public final void m983b(String str, InterfaceC0395d interfaceC0395d) {
        Object obj;
        AbstractC0307g.m703e(interfaceC0395d, "provider");
        C0953f c0953f = this.f884a;
        C0950c c0950cMo2281a = c0953f.mo2281a(str);
        if (c0950cMo2281a != null) {
            obj = c0950cMo2281a.f3370b;
        } else {
            C0950c c0950c = new C0950c(str, interfaceC0395d);
            c0953f.f3379d++;
            C0950c c0950c2 = c0953f.f3377b;
            if (c0950c2 == null) {
                c0953f.f3376a = c0950c;
                c0953f.f3377b = c0950c;
            } else {
                c0950c2.f3371c = c0950c;
                c0950c.f3372d = c0950c2;
                c0953f.f3377b = c0950c;
            }
            obj = null;
        }
        if (((InterfaceC0395d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m984c() {
        if (!this.f888e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        C0392a c0392a = this.f887d;
        if (c0392a == null) {
            c0392a = new C0392a(this);
        }
        this.f887d = c0392a;
        try {
            C0532i.class.getDeclaredConstructor(null);
            C0392a c0392a2 = this.f887d;
            if (c0392a2 != null) {
                c0392a2.f882a.add(C0532i.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + C0532i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }
}
