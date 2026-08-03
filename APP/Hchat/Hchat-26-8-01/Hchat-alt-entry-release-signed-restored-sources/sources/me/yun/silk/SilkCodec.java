package me.yun.silk;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class SilkCodec {
    public static final long MAX_DURATION_MS = 60000;

    public native int autoToPcm(String str, String str2);

    public native int autoToSilk(String str, String str2, int i9);

    public native int flacToPcm(String str, String str2);

    public native int flacToSilk(String str, String str2, int i9);

    public native long getDuration(String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getDurationLimited(String str) {
        long duration = getDuration(str);
        if (duration > 60000) {
            return 60000L;
        }
        return duration;
    }

    public native int getFileType(String str);

    public native int mp3ToPcm(String str, String str2);

    public native int mp3ToSilk(String str, String str2, int i9);

    public native int oggToPcm(String str, String str2);

    public native int oggToSilk(String str, String str2, int i9);

    public native int pcmToSilk(String str, String str2, int i9, int i10, int i11);

    public native int silkToMp3(String str, String str2, int i9);

    public native int silkToPcm(String str, String str2, int i9);

    public native int wavToPcm(String str, String str2);

    public native int wavToSilk(String str, String str2, int i9);
}
