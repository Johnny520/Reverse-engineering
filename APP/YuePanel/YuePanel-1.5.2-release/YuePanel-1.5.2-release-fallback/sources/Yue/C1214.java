package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1214 extends Yue.C1212 {
    public C1214() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final <T> void m6236(@Yue.InterfaceC4418 java.util.Iterator<? extends T> r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, Yue.C6593> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "operation"
            Yue.C3329.m13906(r2, r0)
        La:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.next()
            r2.invoke(r0)
            goto La
        L18:
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final <T> java.util.Iterator<T> m6237(java.util.Iterator<? extends T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final <T> java.util.Iterator<Yue.C3239<T>> m6238(@Yue.InterfaceC4418 java.util.Iterator<? extends T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥ۠ۥۡۦ r0 = new Yue.ۥ۠ۥۡۦ
            r0.<init>(r1)
            return r0
    }
}
