package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface n1 {
    boolean a();

    long b(i.q r1, i.q r2, i.q r3);

    default i.q g(i.q r7, i.q r8, i.q r9) {
            r6 = this;
            long r1 = r6.b(r7, r8, r9)
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            i.q r7 = r0.n(r1, r3, r4, r5)
            return r7
    }

    i.q n(long r1, i.q r3, i.q r4, i.q r5);

    i.q w(long r1, i.q r3, i.q r4, i.q r5);
}
