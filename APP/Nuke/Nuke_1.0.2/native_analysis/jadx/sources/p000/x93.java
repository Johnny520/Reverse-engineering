package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public interface x93 {
    /* JADX INFO: renamed from: a */
    boolean mo121a();

    /* JADX INFO: renamed from: b */
    long mo1171b(AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3);

    /* JADX INFO: renamed from: q */
    AbstractC0494nd mo737q(long j, AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3);

    /* JADX INFO: renamed from: s */
    AbstractC0494nd mo739s(long j, AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3);

    /* JADX INFO: renamed from: t */
    default AbstractC0494nd mo2189t(AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3) {
        return mo737q(mo1171b(abstractC0494nd, abstractC0494nd2, abstractC0494nd3), abstractC0494nd, abstractC0494nd2, abstractC0494nd3);
    }
}
