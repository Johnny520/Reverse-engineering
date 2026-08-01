package defpackage;

/* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0742 extends defpackage.AbstractC1482 {
    @Override // defpackage.AbstractC1482
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final long mo1658() {
            r2 = this;
            java.util.Random r2 = r2.mo1661()
            long r0 = r2.nextLong()
            return r0
    }

    @Override // defpackage.AbstractC1482
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int mo1659(int r2) {
            r1 = this;
            java.util.Random r1 = r1.mo1661()
            int r1 = r1.nextInt()
            int r0 = 32 - r2
            int r1 = r1 >>> r0
            int r2 = -r2
            int r2 = r2 >> 31
            r1 = r1 & r2
            return r1
    }

    @Override // defpackage.AbstractC1482
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int mo1660() {
            r0 = this;
            java.util.Random r0 = r0.mo1661()
            int r0 = r0.nextInt()
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public abstract java.util.Random mo1661();
}
