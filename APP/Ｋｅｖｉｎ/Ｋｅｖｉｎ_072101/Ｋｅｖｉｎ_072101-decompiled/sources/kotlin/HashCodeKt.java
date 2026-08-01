package kotlin;

/* JADX INFO: compiled from: HashCode.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\u001a\u000f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0087\b¨\u0006\u0003"}, m115d2 = {"hashCode", "", "", "kotlin-stdlib"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class HashCodeKt {
    private static final int hashCode(java.lang.Object r1) {
            if (r1 == 0) goto L7
            int r0 = r1.hashCode()
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }
}
