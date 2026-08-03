package p000;

import android.text.TextUtils;

/* JADX INFO: renamed from: ut */
/* JADX INFO: loaded from: classes.dex */
public final class C2601ut {

    /* JADX INFO: renamed from: e */
    public static final C0668Pg f8986e = new C0668Pg(24);

    /* JADX INFO: renamed from: a */
    public final Object f8987a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2558tt f8988b;

    /* JADX INFO: renamed from: c */
    public final String f8989c;

    /* JADX INFO: renamed from: d */
    public volatile byte[] f8990d;

    public C2601ut(String str, Object obj, InterfaceC2558tt interfaceC2558tt) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f8989c = str;
        this.f8987a = obj;
        this.f8988b = interfaceC2558tt;
    }

    /* JADX INFO: renamed from: a */
    public static C2601ut m5116a(String str, Object obj) {
        return new C2601ut(str, obj, f8986e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2601ut) {
            return this.f8989c.equals(((C2601ut) obj).f8989c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8989c.hashCode();
    }

    public final String toString() {
        return AbstractC0213Ey.m410h(new StringBuilder("Option{key='"), this.f8989c, "'}");
    }
}
