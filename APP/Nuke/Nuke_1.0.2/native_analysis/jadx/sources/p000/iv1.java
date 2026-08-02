package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class iv1 {

    /* JADX INFO: renamed from: a */
    public final int f4804a;

    /* JADX INFO: renamed from: b */
    public final int f4805b;

    public /* synthetic */ iv1(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo296a(bo0 bo0Var, InterfaceC0654rf interfaceC0654rf, tr2 tr2Var, z72 z72Var, jv1 jv1Var);

    /* JADX INFO: renamed from: b */
    public ao0 mo2408b(bo0 bo0Var) {
        return null;
    }

    public final String toString() {
        String strM591c = d72.m967a(getClass()).m591c();
        return strM591c == null ? "" : strM591c;
    }

    public iv1(int i, int i2) {
        this.f4804a = i;
        this.f4805b = i2;
    }
}
