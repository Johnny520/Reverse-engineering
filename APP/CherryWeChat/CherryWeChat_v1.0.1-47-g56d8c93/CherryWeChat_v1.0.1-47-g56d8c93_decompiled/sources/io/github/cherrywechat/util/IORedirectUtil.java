package io.github.cherrywechat.util;

import android.os.Build;
import java.io.File;
import java.util.regex.Pattern;
import p000.AbstractC0042Az;
import p000.AbstractC0295Gu;
import p000.AbstractC1406fG;
import p000.AbstractC2564tz;
import p000.AbstractC2675wh;
import p000.C2770yq;
import p000.C2813zq;
import p000.InterfaceC0759Rm;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0759Rm
public final class IORedirectUtil {
    private static final String TAG = AbstractC0295Gu.m625r(-839352573753397L);
    public static final IORedirectUtil INSTANCE = new IORedirectUtil();

    private IORedirectUtil() {
    }

    public static final boolean initIORedirect(String str, String str2) {
        AbstractC0295Gu.m625r(-841628906420277L);
        AbstractC0295Gu.m625r(-841658971191349L);
        if (AbstractC2564tz.m5059T(str)) {
            throw new IllegalArgumentException(AbstractC0295Gu.m625r(-841160754985013L).toString());
        }
        if (AbstractC2564tz.m5059T(str2)) {
            throw new IllegalArgumentException(AbstractC0295Gu.m625r(-841281014069301L).toString());
        }
        AbstractC0295Gu.m625r(-841972503803957L);
        AbstractC0295Gu.m625r(-842036928313397L);
        AbstractC0295Gu.m625r(-842152892430389L);
        try {
            boolean zNativeInitIORedirect = nativeInitIORedirect(str, str2);
            if (zNativeInitIORedirect) {
                AbstractC0295Gu.m625r(-842174367266869L);
                AbstractC0295Gu.m625r(-841689035962421L);
                return zNativeInitIORedirect;
            }
            AbstractC0295Gu.m625r(-841847949752373L);
            AbstractC0295Gu.m625r(-841912374261813L);
            return zNativeInitIORedirect;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-840404840740917L);
            AbstractC0295Gu.m625r(-840469265250357L);
            return false;
        }
    }

    public static final boolean isSupported() {
        if (Build.VERSION.SDK_INT < 30) {
            AbstractC0295Gu.m625r(-840108487997493L);
            AbstractC0295Gu.m625r(-840172912506933L);
            return false;
        }
        try {
            String strM5244g0 = AbstractC2675wh.m5244g0(new File(AbstractC0295Gu.m625r(-841040495900725L)));
            AbstractC0295Gu.m625r(-841100625442869L);
            AbstractC0295Gu.m625r(-840615294138421L);
            C2813zq c2813zqM2680E = AbstractC1406fG.m2680E(Pattern.compile(AbstractC0295Gu.m625r(-840688308582453L)).matcher(strM5244g0), 0, strM5244g0);
            if (c2813zqM2680E != null) {
                Integer numM61H = AbstractC0042Az.m61H((String) ((C2770yq) c2813zqM2680E.m5446a()).get(1));
                int iIntValue = numM61H != null ? numM61H.intValue() : 0;
                Integer numM61H2 = AbstractC0042Az.m61H((String) ((C2770yq) c2813zqM2680E.m5446a()).get(2));
                int iIntValue2 = numM61H2 != null ? numM61H2.intValue() : 0;
                if (iIntValue <= 5 && (iIntValue != 5 || iIntValue2 < 9)) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-840804272699445L);
            AbstractC0295Gu.m625r(-839219429767221L);
            return true;
        }
    }

    private static final native boolean nativeInitIORedirect(String str, String str2);
}
