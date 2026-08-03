package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface a {
    void c(int r1, java.lang.Object r2);

    void d(java.lang.Object r1);

    void f();

    void h(int r1, int r2, int r3);

    void i(int r1, int r2);

    void k();

    void p(int r1, java.lang.Object r2);

    default void q() {
            r0 = this;
            return
    }

    java.lang.Object r();

    default void t(fg.p r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Object r0 = r1.r()
            r2.invoke(r0, r3)
            return
    }
}
