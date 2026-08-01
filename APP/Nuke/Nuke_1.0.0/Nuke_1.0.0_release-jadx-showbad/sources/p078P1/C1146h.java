package p078P1;

import android.text.TextUtils;
import p002A1.C0115D;
import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: P1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1146h {

    /* JADX INFO: renamed from: e */
    public static final C0115D f3780e = new C0115D(17);

    /* JADX INFO: renamed from: a */
    public final Object f3781a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1145g f3782b;

    /* JADX INFO: renamed from: c */
    public final String f3783c;

    /* JADX INFO: renamed from: d */
    public volatile byte[] f3784d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1146h(String str, Object obj, InterfaceC1145g interfaceC1145g) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f3783c = str;
        this.f3781a = obj;
        this.f3782b = interfaceC1145g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1146h m2200a(Object obj, String str) {
        return new C1146h(str, obj, f3780e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1146h) {
            return this.f3783c.equals(((C1146h) obj).f3783c);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3783c.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0231b.m403n(new StringBuilder("Option{key='"), this.f3783c, "'}");
    }
}
