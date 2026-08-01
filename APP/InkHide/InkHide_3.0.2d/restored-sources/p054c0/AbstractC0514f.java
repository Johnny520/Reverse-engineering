package p054c0;

import java.lang.reflect.Member;
import p001A0.C0026a;
import p014H.C0142a;
import p059d0.InterfaceC0517b;

/* JADX INFO: renamed from: c0.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0514f {

    /* JADX INFO: renamed from: a */
    public static final C0142a f1621a;

    /* JADX INFO: renamed from: b */
    public static InterfaceC0517b f1622b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0142a c0142a = new C0142a();
        c0142a.f443b = new C0026a(21);
        c0142a.f444c = new C0026a(22);
        f1621a = c0142a;
        f1622b = AbstractC0513e.f1620b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1024a(Object obj, String str, Object... objArr) {
        f1622b.mo1012c(obj, str, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m1025b(Class cls, String str, Object... objArr) {
        f1622b.mo1017h(cls, str, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m1026c(String str, ClassLoader classLoader, String str2, Object... objArr) {
        f1622b.mo1023n(str, classLoader, str2, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m1027d(Member member, AbstractC0509a abstractC0509a) {
        f1622b.mo1014e(member, abstractC0509a);
    }
}
