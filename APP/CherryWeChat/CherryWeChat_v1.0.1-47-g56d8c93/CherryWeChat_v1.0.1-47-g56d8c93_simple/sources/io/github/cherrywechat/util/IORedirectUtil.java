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
    public static final IORedirectUtil INSTANCE = null;
    private static final String TAG = null;

    static {
        TAG = AbstractC0295Gu.m625r(-839352573753397L);
        INSTANCE = new IORedirectUtil();
    }

    private IORedirectUtil() {
    }

    public static final boolean initIORedirect(String r2, String r3) {
        AbstractC0295Gu.m625r(-841628906420277L);
        AbstractC0295Gu.m625r(-841658971191349L);
        if (AbstractC2564tz.m5059T(r2) == true) goto L18;
        if (AbstractC2564tz.m5059T(r3) == true) goto L16;
        AbstractC0295Gu.m625r(-841972503803957L);
        AbstractC0295Gu.m625r(-842036928313397L);
        AbstractC0295Gu.m625r(-842152892430389L);
        boolean r22 = nativeInitIORedirect(r2, r3);     // Catch: Exception -> L13
        if (r22 == false) goto L11;
        AbstractC0295Gu.m625r(-842174367266869L);     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-841689035962421L);     // Catch: Exception -> L13
        return r22;
    L11:
        AbstractC0295Gu.m625r(-841847949752373L);     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-841912374261813L);     // Catch: Exception -> L13
        return r22;
    L13:
        AbstractC0295Gu.m625r(-840404840740917L);
        AbstractC0295Gu.m625r(-840469265250357L);
        return false;
    L16:
        throw new IllegalArgumentException(AbstractC0295Gu.m625r(-841281014069301L).toString());
    L18:
        throw new IllegalArgumentException(AbstractC0295Gu.m625r(-841160754985013L).toString());
    }

    public static final boolean isSupported() {
        if (Build.VERSION.SDK_INT >= 30) goto L28;
        AbstractC0295Gu.m625r(-840108487997493L);
        AbstractC0295Gu.m625r(-840172912506933L);
        return false;
    L28:
        String r1 = AbstractC2675wh.m5244g0(new File(AbstractC0295Gu.m625r(-841040495900725L)));     // Catch: Exception -> L26
        AbstractC0295Gu.m625r(-841100625442869L);     // Catch: Exception -> L26
        AbstractC0295Gu.m625r(-840615294138421L);     // Catch: Exception -> L26
        C2813zq r12 = AbstractC1406fG.m2680E(Pattern.compile(AbstractC0295Gu.m625r(-840688308582453L)).matcher(r1), 0, r1);     // Catch: Exception -> L26
        if (r12 == null) goto L25;
        Integer r3 = AbstractC0042Az.m61H((String) ((C2770yq) r12.m5446a()).get(1));     // Catch: Exception -> L26
        if (r3 == null) goto L12;
        int r32 = r3.intValue();     // Catch: Exception -> L26
    L13:
        Integer r13 = AbstractC0042Az.m61H((String) ((C2770yq) r12.m5446a()).get(2));     // Catch: Exception -> L26
        if (r13 == null) goto L17;
        int r14 = r13.intValue();     // Catch: Exception -> L26
    L19:
        if (r32 > 5) goto L25;
        if (r32 == 5) goto L22;
    L24:
        return false;
    L22:
        if (r14 < 9) goto L24;
    L17:
        r14 = 0;
        goto L19
    L12:
        r32 = 0;
    L25:
        return true;
    L26:
        AbstractC0295Gu.m625r(-840804272699445L);
        AbstractC0295Gu.m625r(-839219429767221L);
        return true;
    }

    private static final native boolean nativeInitIORedirect(String r0, String r1);
}
