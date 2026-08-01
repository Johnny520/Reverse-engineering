package androidx.compose.runtime;

import p010a9.InterfaceC0184l;
import p215oc.C5706c;

/* JADX INFO: renamed from: androidx.compose.runtime.i3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0513i3 {

    /* JADX INFO: renamed from: i */
    public static final int f1416i = 8;

    /* JADX INFO: renamed from: a */
    public final AbstractC0524k0 f1417a;

    /* JADX INFO: renamed from: b */
    public final boolean f1418b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0466b5 f1419c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0512i2 f1420d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0184l f1421e;

    /* JADX INFO: renamed from: f */
    public final boolean f1422f;

    /* JADX INFO: renamed from: g */
    public final Object f1423g;

    /* JADX INFO: renamed from: h */
    public boolean f1424h = true;

    public C0513i3(AbstractC0524k0 abstractC0524k0, Object obj, boolean z10, InterfaceC0466b5 interfaceC0466b5, InterfaceC0512i2 interfaceC0512i2, InterfaceC0184l interfaceC0184l, boolean z11) {
        this.f1417a = abstractC0524k0;
        this.f1418b = z10;
        this.f1419c = interfaceC0466b5;
        this.f1420d = interfaceC0512i2;
        this.f1421e = interfaceC0184l;
        this.f1422f = z11;
        this.f1423g = obj;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1746a() {
        return this.f1424h;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0524k0 m1747b() {
        return this.f1417a;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0184l m1748c() {
        return this.f1421e;
    }

    /* JADX INFO: renamed from: d */
    public final Object m1749d() {
        if (this.f1418b) {
            return null;
        }
        InterfaceC0512i2 interfaceC0512i2 = this.f1420d;
        if (interfaceC0512i2 != null) {
            return interfaceC0512i2.getValue();
        }
        Object obj = this.f1423g;
        if (obj != null) {
            return obj;
        }
        AbstractC0468c0.m1549c("Unexpected form of a provided value");
        C5706c.m23089a();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC0466b5 m1750e() {
        return this.f1419c;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC0512i2 m1751f() {
        return this.f1420d;
    }

    /* JADX INFO: renamed from: g */
    public final Object m1752g() {
        return this.f1423g;
    }

    /* JADX INFO: renamed from: h */
    public final C0513i3 m1753h() {
        this.f1424h = false;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1754i() {
        return this.f1422f;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1755j() {
        return (this.f1418b || m1752g() != null) && !this.f1422f;
    }
}
