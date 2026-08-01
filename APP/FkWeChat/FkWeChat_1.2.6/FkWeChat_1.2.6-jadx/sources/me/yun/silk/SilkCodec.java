package me.yun.silk;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class SilkCodec {
    static {
        System.loadLibrary("silk_codec");
    }

    public native int autoToPcm(String str, String str2);

    public native int autoToSilk(String str, String str2, int i10);

    public native int flacToPcm(String str, String str2);

    public native int flacToSilk(String str, String str2, int i10);

    public native long getDuration(String str);

    public native int getFileType(String str);

    public native int mp3ToPcm(String str, String str2);

    public native int mp3ToSilk(String str, String str2, int i10);

    public native int oggToPcm(String str, String str2);

    public native int oggToSilk(String str, String str2, int i10);

    public native int pcmToSilk(String str, String str2, int i10, int i11, int i12);

    public native int silkToMp3(String str, String str2, int i10);

    public native int silkToPcm(String str, String str2, int i10);

    public native int wavToPcm(String str, String str2);

    public native int wavToSilk(String str, String str2, int i10);
}
