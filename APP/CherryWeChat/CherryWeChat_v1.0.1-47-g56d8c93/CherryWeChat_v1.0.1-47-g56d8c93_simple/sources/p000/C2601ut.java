package p000;

import android.text.TextUtils;

/* JADX INFO: renamed from: ut */
/* JADX INFO: loaded from: classes.dex */
public final class C2601ut {

    /* JADX INFO: renamed from: e */
    public static final C0668Pg f8986e = null;

    /* JADX INFO: renamed from: a */
    public final Object f8987a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2558tt f8988b;

    /* JADX INFO: renamed from: c */
    public final String f8989c;

    /* JADX INFO: renamed from: d */
    public volatile byte[] f8990d;

    static {
        f8986e = new C0668Pg(24);
    }

    public C2601ut(String r2, Object r3, InterfaceC2558tt r4) {
        if (TextUtils.isEmpty(r2) == true) goto L7;
        this.f8989c = r2;
        this.f8987a = r3;
        this.f8988b = r4;
        return;
    L7:
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* JADX INFO: renamed from: a */
    public static C2601ut m5116a(String r2, Object r3) {
        return new C2601ut(r2, r3, f8986e);
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C2601ut) == true) goto L5;
        return false;
    L5:
        return this.f8989c.equals(((C2601ut) r2).f8989c);
    }

    public final int hashCode() {
        return this.f8989c.hashCode();
    }

    public final String toString() {
        return AbstractC0213Ey.m410h(new StringBuilder("Option{key='"), this.f8989c, "'}");
    }
}
