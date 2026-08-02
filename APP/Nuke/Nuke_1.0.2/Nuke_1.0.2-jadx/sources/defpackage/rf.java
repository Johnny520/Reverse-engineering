package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public interface rf {
    void a(int i, Object obj);

    void b(Object obj);

    void f();

    void g(int i, Object obj);

    void j(int i, int i2, int i3);

    Object k();

    void l(int i, int i2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default void m(mn0 mn0Var, Object obj) {
        mn0Var.g(k(), obj);
    }

    void o();

    default void i() {
    }
}
