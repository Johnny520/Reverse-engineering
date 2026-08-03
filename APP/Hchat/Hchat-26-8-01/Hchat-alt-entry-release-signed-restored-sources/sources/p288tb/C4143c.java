package p288tb;

import be.AbstractC0283h;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import me.yun.silk.AacCodec;
import me.yun.silk.SilkCodec;
import p015b0.C0136d0;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p099h.Hchat.utils.KavaReflector;
import p144k.C2209s1;
import p218og.AbstractC3149m;
import p222p.AbstractC3199a;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.EnumC3957d;
import p276sf.InterfaceC3956c;
import p332wb.AbstractC4855en;
import tf.AbstractC4156d0;
import tf.AbstractC4178y;
import tf.C4174u;

/* JADX INFO: renamed from: tb.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C4143c {
    public static final int $stable = 0;
    private static final int DEFAULT_CHANNELS = 1;
    private static final int DEFAULT_SAMPLE_RATE = 44100;
    private final InterfaceC1231l logger;
    private final InterfaceC3956c silkCodec$delegate = AbstractC0283h.m1127G(EnumC3957d.f12958g, new C2209s1(12));
    public static final C4142b Companion = new C4142b();
    public static final int DEFAULT_HZ = 24000;
    private static final Set<Integer> SUPPORTED_SILK_HZ = AbstractC4156d0.m8355W(8000, 12000, 16000, Integer.valueOf(DEFAULT_HZ));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4143c(C0136d0 c0136d0) {
        this.logger = c0136d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m8335c(String str) {
        String string;
        if (str == null || (string = AbstractC3149m.m6703R0(str).toString()) == null) {
            return null;
        }
        if (string.length() > 0) {
            return string;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static int m8336d(int i9) {
        return SUPPORTED_SILK_HZ.contains(Integer.valueOf(i9)) ? i9 : DEFAULT_HZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final SilkCodec m8337a() {
        return (SilkCodec) this.silkCodec$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int aacToPcm(String str, String str2) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -801;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -12;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.aacToPcm(strM8335c, strM8335c2));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("aacToPcm 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -803;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int aacToSilk(String str, String str2, int i9) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -801;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -10;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.aacToSilk(strM8335c, strM8335c2, m8337a(), m8336d(i9)));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("aacToSilk 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -1031;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int autoAacToSilk(String str, String str2, int i9) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -1;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -10;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.autoAacToSilk(strM8335c, strM8335c2, m8337a(), m8336d(i9)));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("autoAacToSilk 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -1031;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int autoToAac(String str, String str2, int i9) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -1;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -901;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.autoToAac(strM8335c, strM8335c2, m8337a(), m8338b(i9, strM8335c)));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("autoToAac 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int autoToM4a(String str, String str2, int i9) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -1;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -911;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.autoToM4a(strM8335c, strM8335c2, m8337a(), m8338b(i9, strM8335c)));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("autoToM4a 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int autoToPcm(String str, String str2) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -1;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -12;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.autoToPcmCompat(strM8335c, strM8335c2, m8337a()));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("autoToPcm 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int autoToSilk(String str, String str2, int i9) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -1;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -10;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.autoToSilkCompat(strM8335c, strM8335c2, m8337a(), m8336d(i9)));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("autoToSilk 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m8338b(int i9, String str) {
        Object c3959f;
        try {
            c3959f = Integer.valueOf(m8337a().getFileType(str));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = 0;
        }
        return ((Number) c3959f).intValue() == 1 ? m8336d(i9) : i9 > 0 ? i9 : DEFAULT_SAMPLE_RATE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int decodeAacFile(String str, String str2) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -801;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -12;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.decodeAacFile(strM8335c, strM8335c2, null));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("decodeAacFile 失败: ", thM8182b.getMessage(), this);
        }
        Integer num = (Integer) (c3959f instanceof C3959f ? null : c3959f);
        if (num != null) {
            return num.intValue();
        }
        return -803;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int decodeM4aFile(String str, String str2) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -801;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -12;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.decodeM4aFile(strM8335c, strM8335c2, null));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("decodeM4aFile 失败: ", thM8182b.getMessage(), this);
        }
        Integer num = (Integer) (c3959f instanceof C3959f ? null : c3959f);
        if (num != null) {
            return num.intValue();
        }
        return -803;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int encodePcmToAac(String str, String str2, int i9, int i10) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -901;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -11;
        }
        if (i9 <= 0) {
            i9 = DEFAULT_SAMPLE_RATE;
        }
        if (i10 <= 0) {
            i10 = 1;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.encodePcmToAac(strM8335c, strM8335c2, i9, i10, null));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("encodePcmToAac 失败: ", thM8182b.getMessage(), this);
        }
        Integer num = (Integer) (c3959f instanceof C3959f ? null : c3959f);
        if (num != null) {
            return num.intValue();
        }
        return -902;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int encodePcmToM4a(String str, String str2, int i9, int i10) {
        String strM8335c;
        Object c3959f;
        String strM8335c2 = m8335c(str);
        if (strM8335c2 == null || (strM8335c = m8335c(str2)) == null) {
            return -911;
        }
        if (i9 <= 0) {
            i9 = DEFAULT_SAMPLE_RATE;
        }
        if (i10 <= 0) {
            i10 = 1;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.encodePcmToM4a(strM8335c2, strM8335c, i9, i10, null));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("encodePcmToM4a 失败: ", thM8182b.getMessage(), this);
        }
        Integer num = (Integer) (c3959f instanceof C3959f ? null : c3959f);
        if (num != null) {
            return num.intValue();
        }
        return -912;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int flacToPcm(String str, String str2) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -1;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -12;
        }
        try {
            c3959f = Integer.valueOf(m8337a().flacToPcm(strM8335c, strM8335c2));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("flacToPcm 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -601;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int flacToSilk(String str, String str2, int i9) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -1;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -10;
        }
        try {
            c3959f = Integer.valueOf(m8337a().flacToSilk(strM8335c, strM8335c2, m8336d(i9)));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("flacToSilk 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -601;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Map<String, Object> getAudioInfo(String str) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c != null) {
            try {
                c3959f = AacCodec.getAudioInfo(strM8335c);
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                AbstractC3199a.m6850w("读取音频信息失败: ", thM8182b.getMessage(), this);
            }
            if (c3959f instanceof C3959f) {
                c3959f = null;
            }
            AacCodec.AudioInfo audioInfo = (AacCodec.AudioInfo) c3959f;
            if (audioInfo != null) {
                Object field = KavaReflector.readField(audioInfo, "sampleRate");
                Number number = field instanceof Number ? (Number) field : null;
                int iIntValue = number != null ? number.intValue() : DEFAULT_SAMPLE_RATE;
                Object field2 = KavaReflector.readField(audioInfo, "channelCount");
                Number number2 = field2 instanceof Number ? (Number) field2 : null;
                return AbstractC4178y.m8437Z(new C3958e("sampleRate", Integer.valueOf(iIntValue)), new C3958e("channelCount", Integer.valueOf(number2 != null ? number2.intValue() : 1)));
            }
        }
        return C4174u.f13711g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getDuration(String str) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return 0L;
        }
        try {
            c3959f = Long.valueOf(m8337a().getDuration(strM8335c));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("getDuration 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Long l10 = (Long) c3959f;
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getDurationLimited(String str) {
        String strM8335c = m8335c(str);
        if (strM8335c != null) {
            return Math.min(getDuration(strM8335c), 60000L);
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getErrorMessage(int i9) {
        Object c3959f;
        if (i9 == 0) {
            return "成功";
        }
        if (i9 == -1) {
            return "无法获取文件扩展名";
        }
        if (i9 == -2) {
            return "不支持的音频格式";
        }
        if (i9 == -3) {
            return "PCM 转 Silk 需要额外参数";
        }
        if (i9 == -4) {
            return "输入已经是 PCM 格式";
        }
        if (i9 == -5) {
            return "输入已经是 Silk 格式";
        }
        if (i9 == -10) {
            return "输出必须是 .silk 或 .slk";
        }
        if (i9 == -11) {
            return "输出必须是 .mp3";
        }
        if (i9 == -12) {
            return "输出必须是 .pcm 或 .raw";
        }
        if (i9 == -13) {
            return "文件格式与方法不匹配";
        }
        if (-201 <= i9 && i9 < -201) {
            return "Silk 转 MP3 文件错误";
        }
        if (i9 == -301) {
            return "MP3 解码错误";
        }
        if (i9 == -302) {
            return "MP3 文件错误";
        }
        if (i9 == -401) {
            return "OGG 解码错误";
        }
        if (i9 == -402) {
            return "OGG 文件错误";
        }
        if (i9 == -501) {
            return "WAV 解码错误";
        }
        if (i9 == -502) {
            return "WAV 文件错误";
        }
        if (i9 == -601) {
            return "FLAC 解码错误";
        }
        if (i9 == -602) {
            return "FLAC 文件错误";
        }
        if (i9 == -701 || i9 == -703) {
            return "PCM 参数错误";
        }
        if (i9 == -702) {
            return "PCM 文件错误";
        }
        if (i9 == -801) {
            return "AAC/M4A 解码错误 (文件不存在)";
        }
        if (i9 == -802) {
            return "AAC/M4A 解码错误 (未找到音频轨道)";
        }
        if (i9 == -803) {
            return "AAC/M4A 解码错误 (格式不支持)";
        }
        if (-901 <= i9 && i9 < -901) {
            return "AAC 编码错误";
        }
        if (-911 <= i9 && i9 < -911) {
            return "M4A 编码错误";
        }
        if (-1001 <= i9 && i9 < -1008) {
            return "Silk 转 AAC/M4A 错误";
        }
        if (-1011 <= i9 && i9 < -1011) {
            return "MP3 转 AAC/M4A 错误";
        }
        if (-1021 <= i9 && i9 < -1021) {
            return "WAV 转 AAC/M4A 错误";
        }
        if (-1031 <= i9 && i9 < -1038) {
            return "M4A/AAC 转 Silk 错误";
        }
        if (-1051 <= i9 && i9 < -1058) {
            return "M4A/AAC 转 AAC 错误";
        }
        if (-1061 <= i9 && i9 < -1068) {
            return "M4A/AAC 转 M4A 错误";
        }
        if (i9 == -2000) {
            return "M4A/AAC 转 Silk 错误 (解码失败)";
        }
        try {
            c3959f = AacCodec.getErrorMessage(i9);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (C3960g.m8182b(c3959f) != null) {
            c3959f = AbstractC0921a.m2250m(i9, "错误码: ", " -> 未知错误");
        }
        return (String) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getFileType(String str) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return 0;
        }
        try {
            c3959f = Integer.valueOf(m8337a().getFileType(strM8335c));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("getFileType 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void log(String str) {
        str.getClass();
        InterfaceC1231l interfaceC1231l = this.logger;
        if (interfaceC1231l != null) {
            interfaceC1231l.invoke(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int m4aToAac(String str, String str2, int i9) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -801;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -901;
        }
        if (i9 <= 0) {
            i9 = DEFAULT_SAMPLE_RATE;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.m4aToAac(strM8335c, strM8335c2, i9));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("m4aToAac 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -1051;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int m4aToM4a(String str, String str2, int i9) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -801;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -911;
        }
        if (i9 <= 0) {
            i9 = DEFAULT_SAMPLE_RATE;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.m4aToM4a(strM8335c, strM8335c2, i9));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("m4aToM4a 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -1061;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int m4aToPcm(String str, String str2) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -801;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -12;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.m4aToPcm(strM8335c, strM8335c2));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("m4aToPcm 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -803;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int m4aToSilk(String str, String str2, int i9) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -801;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -10;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.m4aToSilk(strM8335c, strM8335c2, m8337a(), m8336d(i9)));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("m4aToSilk 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -1031;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int mp3ToPcm(String str, String str2) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -1;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -12;
        }
        try {
            c3959f = Integer.valueOf(m8337a().mp3ToPcm(strM8335c, strM8335c2));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("mp3ToPcm 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -301;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int mp3ToSilk(String str, String str2, int i9) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -1;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -10;
        }
        try {
            c3959f = Integer.valueOf(m8337a().mp3ToSilk(strM8335c, strM8335c2, m8336d(i9)));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("mp3ToSilk 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -301;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int mp4ToAac(String str, String str2, int i9) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -801;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -901;
        }
        if (i9 <= 0) {
            i9 = DEFAULT_SAMPLE_RATE;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.mp4ToAac(strM8335c, strM8335c2, i9));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("mp4ToAac 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -1051;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int mp4ToM4a(String str, String str2, int i9) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -801;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -911;
        }
        if (i9 <= 0) {
            i9 = DEFAULT_SAMPLE_RATE;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.mp4ToM4a(strM8335c, strM8335c2, i9));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("mp4ToM4a 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -1061;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int mp4ToSilk(String str, String str2, int i9) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -801;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -10;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.mp4ToSilk(strM8335c, strM8335c2, m8337a(), m8336d(i9)));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("mp4ToSilk 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -1031;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int oggToPcm(String str, String str2) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -1;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -12;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.oggToPcmCompat(strM8335c, strM8335c2, m8337a()));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("oggToPcm 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -401;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int oggToSilk(String str, String str2, int i9) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -1;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -10;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.oggToSilkCompat(strM8335c, strM8335c2, m8337a(), m8336d(i9)));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("oggToSilk 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -401;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int pcmToAac(String str, String str2, int i9, int i10) {
        String strM8335c;
        Object c3959f;
        String strM8335c2 = m8335c(str);
        if (strM8335c2 == null || (strM8335c = m8335c(str2)) == null) {
            return -901;
        }
        if (i9 <= 0) {
            i9 = DEFAULT_SAMPLE_RATE;
        }
        if (i10 <= 0) {
            i10 = 1;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.pcmToAac(strM8335c2, strM8335c, i9, i10));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("pcmToAac 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -902;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int pcmToM4a(String str, String str2, int i9, int i10) {
        String strM8335c;
        Object c3959f;
        String strM8335c2 = m8335c(str);
        if (strM8335c2 == null || (strM8335c = m8335c(str2)) == null) {
            return -911;
        }
        if (i9 <= 0) {
            i9 = DEFAULT_SAMPLE_RATE;
        }
        if (i10 <= 0) {
            i10 = 1;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.pcmToM4a(strM8335c2, strM8335c, i9, i10));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("pcmToM4a 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -912;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int pcmToSilk(String str, String str2, int i9, int i10, int i11) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -1;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -10;
        }
        try {
            SilkCodec silkCodecM8337a = m8337a();
            int iM8336d = m8336d(i9);
            if (i10 <= 0) {
                i10 = DEFAULT_SAMPLE_RATE;
            }
            int i12 = i10;
            if (i11 <= 0) {
                i11 = 1;
            }
            c3959f = Integer.valueOf(silkCodecM8337a.pcmToSilk(strM8335c, strM8335c2, iM8336d, i12, i11));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("pcmToSilk 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -701;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int silkToAac(String str, String str2, int i9) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -1001;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -901;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.silkToAac(strM8335c, strM8335c2, m8337a(), m8336d(i9)));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("silkToAac 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -1001;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int silkToM4a(String str, String str2, int i9) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -1001;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -911;
        }
        try {
            c3959f = Integer.valueOf(AacCodec.silkToM4a(strM8335c, strM8335c2, m8337a(), m8336d(i9)));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("silkToM4a 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -1001;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int silkToMp3(String str, String str2, int i9) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -1;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -11;
        }
        try {
            c3959f = Integer.valueOf(m8337a().silkToMp3(strM8335c, strM8335c2, m8336d(i9)));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("silkToMp3 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -201;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int silkToPcm(String str, String str2, int i9) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -1;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -12;
        }
        try {
            c3959f = Integer.valueOf(m8337a().silkToPcm(strM8335c, strM8335c2, m8336d(i9)));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("silkToPcm 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -201;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void startTransform(final int i9, String str, String str2, int i10, final Consumer<Object> consumer) {
        final String strM8335c;
        final String strM8335c2 = m8335c(str);
        if (strM8335c2 == null || (strM8335c = m8335c(str2)) == null) {
            return;
        }
        final int iM8336d = m8336d(i10);
        if (i10 <= 0) {
            i10 = DEFAULT_SAMPLE_RATE;
        }
        final int i11 = i10;
        new Thread(new Runnable() { // from class: tb.a
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                int iSilkToMp3;
                int i12 = i9;
                C4143c c4143c = this;
                String str3 = strM8335c2;
                String str4 = strM8335c;
                int i13 = iM8336d;
                Consumer consumer2 = consumer;
                try {
                    if (i12 == 0) {
                        iSilkToMp3 = c4143c.silkToMp3(str3, str4, i13);
                    } else if (i12 != 1) {
                        int i14 = i11;
                        switch (i12) {
                            case 5:
                                iSilkToMp3 = c4143c.autoToSilk(str3, str4, i13);
                                break;
                            case 6:
                                iSilkToMp3 = c4143c.autoToPcm(str3, str4);
                                break;
                            case 7:
                                iSilkToMp3 = c4143c.autoToAac(str3, str4, i14);
                                break;
                            case 8:
                                iSilkToMp3 = c4143c.autoToM4a(str3, str4, i14);
                                break;
                            case 9:
                                iSilkToMp3 = c4143c.autoAacToSilk(str3, str4, i13);
                                break;
                            default:
                                iSilkToMp3 = -2;
                                break;
                        }
                    } else {
                        iSilkToMp3 = c4143c.mp3ToSilk(str3, str4, i13);
                    }
                    if (iSilkToMp3 == 0) {
                        if (consumer2 != null) {
                            consumer2.accept(AbstractC4178y.m8437Z(new C3958e("type", "progress"), new C3958e("progress", 100)));
                        }
                    } else if (consumer2 != null) {
                        consumer2.accept(AbstractC4178y.m8437Z(new C3958e("type", "message"), new C3958e("message", "错误码:" + iSilkToMp3 + " -> " + c4143c.getErrorMessage(iSilkToMp3))));
                    }
                } catch (Throwable th2) {
                    AbstractC3199a.m6850w("startTransform 失败: ", th2.getMessage(), c4143c);
                    if (consumer2 != null) {
                        consumer2.accept(AbstractC4178y.m8437Z(new C3958e("type", "message"), new C3958e("message", AbstractC4855en.m9263g("异常: ", th2.getMessage()))));
                    }
                }
            }
        }, "Hchat-Audio-Transform").start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int wavToPcm(String str, String str2) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -1;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -12;
        }
        try {
            c3959f = Integer.valueOf(m8337a().wavToPcm(strM8335c, strM8335c2));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("wavToPcm 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -501;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int wavToSilk(String str, String str2, int i9) {
        Object c3959f;
        String strM8335c = m8335c(str);
        if (strM8335c == null) {
            return -1;
        }
        String strM8335c2 = m8335c(str2);
        if (strM8335c2 == null) {
            return -10;
        }
        try {
            c3959f = Integer.valueOf(m8337a().wavToSilk(strM8335c, strM8335c2, m8336d(i9)));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC3199a.m6850w("wavToSilk 失败: ", thM8182b.getMessage(), this);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num != null) {
            return num.intValue();
        }
        return -501;
    }

    public final int mp3ToSilk(String str, String str2) {
        return mp3ToSilk(str, str2, DEFAULT_HZ);
    }

    public final int silkToMp3(String str, String str2) {
        return silkToMp3(str, str2, DEFAULT_HZ);
    }
}
