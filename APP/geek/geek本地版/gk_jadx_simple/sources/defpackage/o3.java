package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class o3 {
    public Object a;
    public Object b;

    public o3(Context r1) {
        this.a = r1;
    }

    public void c() {
        n3 r0 = (n3) this.a;
        if (r0 == null) goto L10;
        ((r3) this.b).k.unregisterReceiver(r0);     // Catch: IllegalArgumentException -> L7
    L5:
        this.a = null;
        return;
    }

    public void d() {
        g40 r0 = (g40) this.a;
        k8 r1 = (k8) this.b;
        HashSet r2 = r0.e;
        if (r2.remove(r1) == true) goto L5;
        return;
    L5:
        if (r2.isEmpty() == false) goto L9;
        r0.b();
        return;
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem r3) {
        if ((r3 instanceof l50) == false) goto L11;
        l50 r32 = (l50) r3;
        if (((u30) this.b) != null) goto L7;
        this.b = new u30();
    L7:
        MenuItem r0 = (MenuItem) ((u30) this.b).getOrDefault(r32, null);
        if (r0 != null) goto L12;
        su r02 = new su((Context) this.a, r32);
        ((u30) this.b).put(r32, r02);
        return r02;
    L12:
        return r0;
    L11:
        return r3;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter r0 = e();
        if (r0.countActions() != 0) goto L6;
        return;
    L6:
        if (((n3) this.a) != null) goto L8;
        this.a = new n3(this);
    L8:
        ((r3) this.b).k.registerReceiver((n3) this.a, r0);
    }

    public o3(g40 r1, k8 r2) {
        this.a = r1;
        this.b = r2;
    }

    public o3(r3 r1) {
        this.b = r1;
    }
}
