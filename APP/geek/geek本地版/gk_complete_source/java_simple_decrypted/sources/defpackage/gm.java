package defpackage;

import android.os.Bundle;
import androidx.lifecycle.a;
import androidx.savedstate.Recreator;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gm {
    public boolean a;
    public final Object b;
    public final Object c;

    public gm(u10 r1) {
        this.b = r1;
        this.c = new a3();
    }

    public void a() {
        u10 r0 = (u10) this.b;
        a r1 = r0.e();
        if (r1.c != jq.b) goto L11;
        r1.a(new Recreator(r0));
        final a3 r02 = (a3) this.c;
        r02.getClass();
        if (r02.c == true) goto L9;
        r1.a(new r10(r02));
        r02.c = true;
        this.a = true;
        return;
    L9:
        throw new IllegalStateException("SavedStateRegistry was already attached.");
    L11:
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void b(Bundle r4) {
        if (this.a == true) goto L5;
        a();
    L5:
        a r0 = ((u10) this.b).e();
        if (r0.c.compareTo(jq.d) >= 0) goto L21;
        a3 r02 = (a3) this.c;
        if (r02.c == false) goto L19;
        if (r02.d == true) goto L17;
        if (r4 == null) goto L13;
        Bundle r42 = r4.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
    L14:
        r02.a = r42;
        r02.d = true;
        return;
    L13:
        r42 = null;
        goto L14
    L17:
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    L19:
        throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
    L21:
        throw new IllegalStateException(("performRestore cannot be called when owner is " + r0.c).toString());
    }

    public void c(Bundle r5) {
        ip.o("outBundle", r5);
        a3 r0 = (a3) this.c;
        r0.getClass();
        Bundle r1 = new Bundle();
        Bundle r2 = (Bundle) r0.a;
        if (r2 == null) goto L5;
        r1.putAll(r2);
    L5:
        o10 r02 = (o10) r0.f;
        r02.getClass();
        m10 r22 = new m10(r02);
        r02.c.put(r22, Boolean.FALSE);
    L7:
        if (r22.hasNext() == false) goto L10;
        Map.Entry r03 = (Map.Entry) r22.next();
        r1.putBundle((String) r03.getKey(), ((t10) r03.getValue()).a());
        goto L7
    L10:
        if (r1.isEmpty() == true) goto L14;
        r5.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", r1);
        return;
    }

    public gm(vb r1, k80 r2) {
        this.b = new Object();
        this.c = new ArrayList();
    }
}
