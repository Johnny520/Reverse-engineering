package p319w2;

import p024b9.AbstractC1061t;
import p319w2.C9058e;

/* JADX INFO: renamed from: w2.i3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9082i3 implements C9058e.a {

    /* JADX INFO: renamed from: a */
    public final String f31135a;

    public /* synthetic */ C9082i3(String str) {
        this.f31135a = str;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C9082i3 m35297a(String str) {
        return new C9082i3(str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m35299c(String str, Object obj) {
        return (obj instanceof C9082i3) && AbstractC1061t.m3842c(str, ((C9082i3) obj).m35302f());
    }

    /* JADX INFO: renamed from: d */
    public static int m35300d(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: e */
    public static String m35301e(String str) {
        return "StringAnnotation(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m35299c(this.f31135a, obj);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String m35302f() {
        return this.f31135a;
    }

    public int hashCode() {
        return m35300d(this.f31135a);
    }

    public String toString() {
        return m35301e(this.f31135a);
    }

    /* JADX INFO: renamed from: b */
    public static String m35298b(String str) {
        return str;
    }
}
