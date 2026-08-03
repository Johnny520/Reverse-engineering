package p332wb;

import java.util.function.LongUnaryOperator;

/* JADX INFO: renamed from: wb.xt */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5486xt implements LongUnaryOperator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.LongUnaryOperator
    public final long applyAsLong(long j3) {
        return Math.max(System.currentTimeMillis(), j3 + 1);
    }
}
