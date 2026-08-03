package p000;

import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.android.replay.video.C1811a;
import io.sentry.android.replay.video.C1814d;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: z9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2790z9 extends AbstractC0073Bn implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f9458b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f9459c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2790z9(int i, Object obj) {
        super(0);
        this.f9458b = i;
        this.f9459c = obj;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f9458b;
        Object obj = this.f9459c;
        switch (i) {
            case 0:
                return new C0106Cd(((C0096C9) obj).f217c);
            case 1:
                C0149Dd c0149Dd = (C0149Dd) obj;
                return "(" + AbstractC2453ra.m4901k0(c0149Dd.f403c, "", null, null, C0053B9.f117d, 30) + ")" + AbstractC0235Fd.m481d(c0149Dd.f404d);
            case 2:
                Method method = (Method) obj;
                LinkedHashMap linkedHashMap = AbstractC0235Fd.f751a;
                return "(" + AbstractC0650P4.m1314I(method.getParameterTypes(), C0053B9.f118e, 30) + ")" + AbstractC0235Fd.m480c(method.getReturnType());
            case 3:
                return ((Class) ((C0382Iv) obj).f1315a).getDeclaredMethods();
            case 4:
                return new C0149Dd(((C0764Rr) obj).f2432c);
            case 5:
                return AbstractC0628Oj.m1250y((InterfaceC2752yE) obj);
            default:
                C1814d c1814d = (C1814d) obj;
                C1811a c1811a = c1814d.f6568b;
                C2046v2 c2046v2 = c1814d.f6567a;
                int iIntValue = c1811a.f6559e;
                try {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = c1814d.f6570d.getCodecInfo().getCapabilitiesForType("video/avc").getVideoCapabilities();
                    if (!videoCapabilities.getBitrateRange().contains(Integer.valueOf(iIntValue))) {
                        c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Encoder doesn't support the provided bitRate: " + iIntValue + ", the value will be clamped to the closest one", new Object[0]);
                        iIntValue = ((Number) videoCapabilities.getBitrateRange().clamp(Integer.valueOf(iIntValue))).intValue();
                    }
                    break;
                } catch (Throwable th) {
                    c2046v2.getLogger().mo3683r(EnumC1657a2.DEBUG, "Could not retrieve MediaCodec info", th);
                }
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", c1811a.f6556b, c1811a.f6557c);
                mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
                mediaFormatCreateVideoFormat.setInteger("bitrate", iIntValue);
                mediaFormatCreateVideoFormat.setFloat("frame-rate", c1811a.f6558d);
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
                return mediaFormatCreateVideoFormat;
        }
    }
}
