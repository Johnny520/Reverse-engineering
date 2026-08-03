package ba;

import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: ba.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0223c implements IntUnaryOperator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f555a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i9) {
        switch (this.f555a) {
            case 0:
                if (i9 >= 27647) {
                    return 27408;
                }
                return i9 + 1;
            case 1:
                if (i9 >= 30207) {
                    return 29968;
                }
                return i9 + 1;
            case 2:
                if (i9 >= 27391) {
                    return 27152;
                }
                return i9 + 1;
            case 3:
                if (i9 >= 999999) {
                    return 1;
                }
                return 1 + i9;
            case 4:
                if (i9 >= 29951) {
                    return 29712;
                }
                return i9 + 1;
            default:
                if (i9 >= 999999) {
                    return 1;
                }
                return 1 + i9;
        }
    }
}
