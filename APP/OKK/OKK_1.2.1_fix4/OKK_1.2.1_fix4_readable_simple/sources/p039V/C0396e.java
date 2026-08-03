package p039V;

import android.os.Bundle;
import androidx.lifecycle.C0532i;
import p031Q0.AbstractC0307g;
import p061i.C0950c;
import p061i.C0953f;

/* JADX INFO: renamed from: V.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0396e {

    /* JADX INFO: renamed from: a */
    public final C0953f f884a;

    /* JADX INFO: renamed from: b */
    public boolean f885b;

    /* JADX INFO: renamed from: c */
    public Bundle f886c;

    /* JADX INFO: renamed from: d */
    public C0392a f887d;

    /* JADX INFO: renamed from: e */
    public boolean f888e;

    public C0396e() {
        this.f884a = new C0953f();
        this.f888e = true;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m982a(String r2) {
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    /* JADX INFO: renamed from: b */
    public final void m983b(String r3, InterfaceC0395d r4) {
        AbstractC0307g.m703e(r4, "provider");
        C0953f r02 = this.f884a;
        C0950c r1 = r02.mo2281a(r3);
        if (r1 == null) goto L5;
        Object r32 = r1.f3370b;
    L11:
        if (((InterfaceC0395d) r32) != null) goto L14;
        return;
    L14:
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
    L5:
        C0950c r12 = new C0950c(r3, r4);
        r02.f3379d++;
        C0950c r33 = r02.f3377b;
        if (r33 != null) goto L8;
        r02.f3376a = r12;
        r02.f3377b = r12;
    L9:
        r32 = null;
        goto L11
    L8:
        r33.f3371c = r12;
        r12.f3372d = r33;
        r02.f3377b = r12;
        goto L9
    }

    /* JADX INFO: renamed from: c */
    public final void m984c() {
        if (this.f888e == false) goto L17;
        C0392a r1 = this.f887d;
        if (r1 != null) goto L7;
        r1 = new C0392a(this);
    L7:
        this.f887d = r1;
        C0532i.class.getDeclaredConstructor(null);     // Catch: NoSuchMethodException -> L13
        C0392a r12 = this.f887d;
        if (r12 == null) goto L20;
        r12.f882a.add(C0532i.class.getName());
        return;
    L20:
        return;
    L13:
        e = move-exception;
        throw new IllegalArgumentException("Class " + C0532i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
    L17:
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
}
