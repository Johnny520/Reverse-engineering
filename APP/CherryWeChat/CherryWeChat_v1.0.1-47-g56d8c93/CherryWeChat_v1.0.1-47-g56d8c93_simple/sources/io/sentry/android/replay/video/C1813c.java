package io.sentry.android.replay.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import p000.AbstractC0073Bn;
import p000.AbstractC2564tz;
import p000.InterfaceC0884Ui;

/* JADX INFO: renamed from: io.sentry.android.replay.video.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1813c extends AbstractC0073Bn implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: b */
    public static final C1813c f6566b = null;

    static {
        f6566b = new C1813c(0);
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        boolean r1 = false;
        MediaCodecInfo[] r0 = new MediaCodecList(0).getCodecInfos();
        int r2 = r0.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L9;
        if (AbstractC2564tz.m5051L(r0[r3].getName(), "c2.exynos", false) == true) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        r1 = true;
    L9:
        return Boolean.valueOf(r1);
    }
}
