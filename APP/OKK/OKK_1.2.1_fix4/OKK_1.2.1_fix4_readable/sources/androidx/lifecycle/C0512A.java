package androidx.lifecycle;

import android.os.Handler;
import p001A0.RunnableC0028d;
import p006D.C0095d;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: androidx.lifecycle.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0512A implements InterfaceC0541r {

    /* JADX INFO: renamed from: i */
    public static final C0512A f1447i = new C0512A();

    /* JADX INFO: renamed from: a */
    public int f1448a;

    /* JADX INFO: renamed from: b */
    public int f1449b;

    /* JADX INFO: renamed from: e */
    public Handler f1452e;

    /* JADX INFO: renamed from: c */
    public boolean f1450c = true;

    /* JADX INFO: renamed from: d */
    public boolean f1451d = true;

    /* JADX INFO: renamed from: f */
    public final C0543t f1453f = new C0543t(this);

    /* JADX INFO: renamed from: g */
    public final RunnableC0028d f1454g = new RunnableC0028d(4, this);

    /* JADX INFO: renamed from: h */
    public final C0095d f1455h = new C0095d(15, this);

    /* JADX INFO: renamed from: a */
    public final void m1244a() {
        int i2 = this.f1449b + 1;
        this.f1449b = i2;
        if (i2 == 1) {
            if (this.f1450c) {
                this.f1453f.m1257d(EnumC0535l.ON_RESUME);
                this.f1450c = false;
            } else {
                Handler handler = this.f1452e;
                AbstractC0307g.m700b(handler);
                handler.removeCallbacks(this.f1454g);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0541r
    /* JADX INFO: renamed from: d */
    public final C0543t mo1231d() {
        return this.f1453f;
    }
}
