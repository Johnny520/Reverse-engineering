package me.yun.silk;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class SilkCodec {
    public static final long MAX_DURATION_MS = 60000;

    public SilkCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    public native int autoToPcm(java.lang.String r1, java.lang.String r2);

    public native int autoToSilk(java.lang.String r1, java.lang.String r2, int r3);

    public native int flacToPcm(java.lang.String r1, java.lang.String r2);

    public native int flacToSilk(java.lang.String r1, java.lang.String r2, int r3);

    public native long getDuration(java.lang.String r1);

    public long getDurationLimited(java.lang.String r5) {
            r4 = this;
            long r0 = r4.getDuration(r5)
            r2 = 60000(0xea60, double:2.9644E-319)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto Lc
            return r2
        Lc:
            return r0
    }

    public native int getFileType(java.lang.String r1);

    public native int mp3ToPcm(java.lang.String r1, java.lang.String r2);

    public native int mp3ToSilk(java.lang.String r1, java.lang.String r2, int r3);

    public native int oggToPcm(java.lang.String r1, java.lang.String r2);

    public native int oggToSilk(java.lang.String r1, java.lang.String r2, int r3);

    public native int pcmToSilk(java.lang.String r1, java.lang.String r2, int r3, int r4, int r5);

    public native int silkToMp3(java.lang.String r1, java.lang.String r2, int r3);

    public native int silkToPcm(java.lang.String r1, java.lang.String r2, int r3);

    public native int wavToPcm(java.lang.String r1, java.lang.String r2);

    public native int wavToSilk(java.lang.String r1, java.lang.String r2, int r3);
}
