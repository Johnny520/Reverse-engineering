package xhss;

/* JADX INFO: renamed from: xhss.ᛳᲈᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0330 extends xhss.AbstractC1090 {
    @Override // xhss.AbstractC1090
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int mo666() {
            r0 = this;
            java.util.Random r0 = r0.mo668()
            int r0 = r0.nextInt()
            return r0
    }

    @Override // xhss.AbstractC1090
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final int mo667(int r2) {
            r1 = this;
            java.util.Random r1 = r1.mo668()
            int r1 = r1.nextInt()
            int r0 = 32 - r2
            int r1 = r1 >>> r0
            int r2 = -r2
            int r2 = r2 >> 31
            r1 = r1 & r2
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public abstract java.util.Random mo668();
}
