package me.yun.silk.utils;

import gg.AbstractC1411g;
import me.yun.silk.AacCodec;
import me.yun.silk.SilkCodec;
import me.yun.silk.utils.Conversion;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Conversion {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int m4aToPcm(String str, String str2) {
        return Companion.m4aToPcm(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int m4aToSilk(SilkCodec silkCodec, String str, String str2, int i9) {
        return Companion.m4aToSilk(silkCodec, str, str2, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int pcmToAac(String str, String str2, int i9, int i10) {
        return Companion.pcmToAac(str, str2, i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int pcmToM4a(String str, String str2, int i9, int i10) {
        return Companion.pcmToM4a(str, str2, i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int silkToAac(SilkCodec silkCodec, String str, String str2, int i9) {
        return Companion.silkToAac(silkCodec, str, str2, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int silkToM4a(SilkCodec silkCodec, String str, String str2, int i9) {
        return Companion.silkToM4a(silkCodec, str, str2, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void startTransform(SilkCodec silkCodec, int i9, String str, String str2, int i10, ConversionCallback conversionCallback) {
        Companion.startTransform(silkCodec, i9, str, str2, i10, conversionCallback);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: me.yun.silk.utils.Conversion.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final String getErrorMsg(int i9) {
            if (i9 == 0) {
                return "成功";
            }
            if (i9 == -1) {
                return "错误码:-1 -> 无法获取文件扩展名";
            }
            if (i9 == -2) {
                return "错误码:-2 -> 不支持的音频格式";
            }
            if (i9 == -3) {
                return "错误码:-3 -> PCM 转 Silk 需要额外参数";
            }
            if (i9 == -4) {
                return "错误码:-4 -> 输入已经是 PCM 格式";
            }
            if (i9 == -5) {
                return "错误码:-5 -> 输入已经是 Silk 格式";
            }
            if (i9 == -1022 || i9 == -1021) {
                return AbstractC0921a.m2250m(i9, "错误码:", " -> WAV 转 AAC/M4A 错误");
            }
            if (i9 == -1012 || i9 == -1011) {
                return AbstractC0921a.m2250m(i9, "错误码:", " -> MP3 转 AAC/M4A 错误");
            }
            if (i9 == -912 || i9 == -911) {
                return AbstractC0921a.m2250m(i9, "错误码:", " -> M4A 编码错误");
            }
            if (i9 == -902 || i9 == -901) {
                return AbstractC0921a.m2250m(i9, "错误码:", " -> AAC/M4A 编码错误");
            }
            if (i9 == -602 || i9 == -601) {
                return AbstractC0921a.m2250m(i9, "错误码:", " -> FLAC 解码错误");
            }
            if (i9 == -502 || i9 == -501) {
                return AbstractC0921a.m2250m(i9, "错误码:", " -> WAV 解码错误");
            }
            if (i9 == -402 || i9 == -401) {
                return AbstractC0921a.m2250m(i9, "错误码:", " -> OGG 解码错误");
            }
            if (i9 == -302 || i9 == -301) {
                return AbstractC0921a.m2250m(i9, "错误码:", " -> MP3 解码错误");
            }
            switch (i9) {
                case -2000:
                    return "错误码:-2000 -> M4A/AAC 转 Silk 错误 (解码失败)";
                case -1041:
                    return "错误码:-1041 -> 中间转换错误";
                case -1031:
                    return "错误码:-1031 -> AAC/M4A 转 Silk 错误";
                case -1001:
                    return "错误码:-1001 -> Silk 转 AAC/M4A 错误";
                case -803:
                    return "错误码:-803 -> AAC/M4A 解码错误 (格式不支持)";
                case -802:
                case -801:
                    return AbstractC0921a.m2250m(i9, "错误码:", " -> AAC/M4A 解码错误 (文件读取失败)");
                case -202:
                case -201:
                    return AbstractC0921a.m2250m(i9, "错误码:", " -> Silk 转 MP3 文件错误");
                case -13:
                    return "错误码:-13 -> 文件格式与方法不匹配";
                case -12:
                    return "错误码:-12 -> 输出必须是 .pcm 或 .raw";
                case -11:
                    return "错误码:-11 -> 输出必须是 .mp3";
                case -10:
                    return "错误码:-10 -> 输出必须是 .silk 或 .slk";
                case 0:
                    return "成功";
                default:
                    switch (i9) {
                        case -703:
                        case -702:
                        case -701:
                            return AbstractC0921a.m2250m(i9, "错误码:", " -> PCM 参数错误");
                        default:
                            return AbstractC0921a.m2250m(i9, "错误码:", " -> 未知错误");
                    }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public static final void startTransform$lambda$0(int i9, SilkCodec silkCodec, String str, String str2, int i10, ConversionCallback conversionCallback) {
            int iSilkToMp3;
            try {
                if (i9 == 0) {
                    iSilkToMp3 = silkCodec.silkToMp3(str, str2, i10);
                } else if (i9 != 1) {
                    switch (i9) {
                        case 5:
                            iSilkToMp3 = AacCodec.autoToSilkCompat(str, str2, silkCodec, i10);
                            break;
                        case 6:
                            iSilkToMp3 = AacCodec.autoToPcmCompat(str, str2, silkCodec);
                            break;
                        case 7:
                            iSilkToMp3 = AacCodec.autoToAac(str, str2, silkCodec, i10);
                            break;
                        case 8:
                            iSilkToMp3 = AacCodec.autoToM4a(str, str2, silkCodec, i10);
                            break;
                        case 9:
                            iSilkToMp3 = AacCodec.m4aToSilk(str, str2, silkCodec, i10);
                            break;
                        default:
                            iSilkToMp3 = -2;
                            break;
                    }
                } else {
                    iSilkToMp3 = silkCodec.mp3ToSilk(str, str2, i10);
                }
                if (iSilkToMp3 == 0) {
                    conversionCallback.onProgress(100);
                } else {
                    conversionCallback.onMessage(Conversion.Companion.getErrorMsg(iSilkToMp3));
                }
            } catch (Throwable th2) {
                conversionCallback.onMessage("异常: " + th2.getMessage());
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int m4aToPcm(String str, String str2) {
            str.getClass();
            str2.getClass();
            return AacCodec.m4aToPcm(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int m4aToSilk(SilkCodec silkCodec, String str, String str2, int i9) {
            silkCodec.getClass();
            str.getClass();
            str2.getClass();
            return AacCodec.m4aToSilk(str, str2, silkCodec, i9);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int pcmToAac(String str, String str2, int i9, int i10) {
            str.getClass();
            str2.getClass();
            return AacCodec.pcmToAac(str, str2, i9, i10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int pcmToM4a(String str, String str2, int i9, int i10) {
            str.getClass();
            str2.getClass();
            return AacCodec.pcmToM4a(str, str2, i9, i10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int silkToAac(SilkCodec silkCodec, String str, String str2, int i9) {
            silkCodec.getClass();
            str.getClass();
            str2.getClass();
            return AacCodec.silkToAac(str, str2, silkCodec, i9);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int silkToM4a(SilkCodec silkCodec, String str, String str2, int i9) {
            silkCodec.getClass();
            str.getClass();
            str2.getClass();
            return AacCodec.silkToM4a(str, str2, silkCodec, i9);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startTransform(final SilkCodec silkCodec, final int i9, final String str, final String str2, final int i10, final ConversionCallback conversionCallback) {
            silkCodec.getClass();
            str.getClass();
            str2.getClass();
            conversionCallback.getClass();
            new Thread(new Runnable() { // from class: zg.a
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.lang.Runnable
                public final void run() {
                    Conversion.Companion.startTransform$lambda$0(i9, silkCodec, str, str2, i10, conversionCallback);
                }
            }).start();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface ConversionCallback {

        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public static final class DefaultImpls {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Deprecated
            public static void onProgress(ConversionCallback conversionCallback, int i9) {
                ConversionCallback.super.onProgress(i9);
            }
        }

        void onMessage(String str);

        default void onProgress(int i9) {
        }
    }
}
