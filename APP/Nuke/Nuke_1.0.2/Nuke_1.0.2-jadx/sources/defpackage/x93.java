package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public interface x93 {
    boolean a();

    long b(nd ndVar, nd ndVar2, nd ndVar3);

    nd q(long j, nd ndVar, nd ndVar2, nd ndVar3);

    nd s(long j, nd ndVar, nd ndVar2, nd ndVar3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default nd t(nd ndVar, nd ndVar2, nd ndVar3) {
        return q(b(ndVar, ndVar2, ndVar3), ndVar, ndVar2, ndVar3);
    }
}
