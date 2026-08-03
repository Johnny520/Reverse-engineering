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

    public /* synthetic */ C2790z9(int r1, Object r2) {
        this.f9458b = r1;
        this.f9459c = r2;
        super(0);
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int r0 = this.f9458b;
        Object r3 = this.f9459c;
        switch(r0) {
            case 0: goto L24;
            case 1: goto L21;
            case 2: goto L19;
            case 3: goto L18;
            case 4: goto L16;
            case 5: goto L14;
            default: goto L4;
        };
    L4:
        C1814d r32 = (C1814d) r3;
        C1811a r2 = r32.f6568b;
        C2046v2 r4 = r32.f6567a;
        int r5 = r2.f6559e;
        MediaCodecInfo.VideoCapabilities r33 = r32.f6570d.getCodecInfo().getCapabilitiesForType("video/avc").getVideoCapabilities();     // Catch: Throwable -> L9
        if (r33.getBitrateRange().contains(Integer.valueOf(r5)) == true) goto L11;
        r4.getLogger().mo3680e(EnumC1657a2.DEBUG, "Encoder doesn't support the provided bitRate: " + r5 + ", the value will be clamped to the closest one", new Object[0]);     // Catch: Throwable -> L9
        r5 = ((Number) r33.getBitrateRange().clamp(Integer.valueOf(r5))).intValue();     // Catch: Throwable -> L9
    L11:
        MediaFormat r02 = MediaFormat.createVideoFormat("video/avc", r2.f6556b, r2.f6557c);
        r02.setInteger("color-format", 2130708361);
        r02.setInteger("bitrate", r5);
        r02.setFloat("frame-rate", r2.f6558d);
        r02.setInteger("i-frame-interval", 6);
        return r02;
    L9:
        th = move-exception;
        r4.getLogger().mo3683r(EnumC1657a2.DEBUG, "Could not retrieve MediaCodec info", th);
        goto L11
    L19:
        Method r34 = (Method) r3;
        LinkedHashMap r03 = AbstractC0235Fd.f751a;
        return "(" + AbstractC0650P4.m1314I(r34.getParameterTypes(), C0053B9.f118e, 30) + ")" + AbstractC0235Fd.m480c(r34.getReturnType());
    L21:
        C0149Dd r35 = (C0149Dd) r3;
        return "(" + AbstractC2453ra.m4901k0(r35.f403c, "", null, null, C0053B9.f117d, 30) + ")" + AbstractC0235Fd.m481d(r35.f404d);
    L14:
        return AbstractC0628Oj.m1250y((InterfaceC2752yE) r3);
    L16:
        return new C0149Dd(((C0764Rr) r3).f2432c);
    L18:
        return ((Class) ((C0382Iv) r3).f1315a).getDeclaredMethods();
    L24:
        return new C0106Cd(((C0096C9) r3).f217c);
    }
}
