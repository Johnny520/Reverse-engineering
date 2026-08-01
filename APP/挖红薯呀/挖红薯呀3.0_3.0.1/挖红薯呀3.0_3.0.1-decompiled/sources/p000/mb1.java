package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public interface mb1 {
    /* JADX INFO: renamed from: a */
    boolean mo2486a();

    /* JADX INFO: renamed from: b */
    long mo2487b(AbstractC0046b8 abstractC0046b8, AbstractC0046b8 abstractC0046b82, AbstractC0046b8 abstractC0046b83);

    /* JADX INFO: renamed from: e */
    AbstractC0046b8 mo376e(long j, AbstractC0046b8 abstractC0046b8, AbstractC0046b8 abstractC0046b82, AbstractC0046b8 abstractC0046b83);

    /* JADX INFO: renamed from: h */
    AbstractC0046b8 mo379h(long j, AbstractC0046b8 abstractC0046b8, AbstractC0046b8 abstractC0046b82, AbstractC0046b8 abstractC0046b83);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    default AbstractC0046b8 mo2488i(AbstractC0046b8 abstractC0046b8, AbstractC0046b8 abstractC0046b82, AbstractC0046b8 abstractC0046b83) {
        return mo376e(mo2487b(abstractC0046b8, abstractC0046b82, abstractC0046b83), abstractC0046b8, abstractC0046b82, abstractC0046b83);
    }
}
