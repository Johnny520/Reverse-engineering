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
    public static final C1813c f6566b = new C1813c(0);

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        boolean z = false;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        int length = codecInfos.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (AbstractC2564tz.m5051L(codecInfos[i].getName(), "c2.exynos", false)) {
                z = true;
                break;
            }
            i++;
        }
        return Boolean.valueOf(z);
    }
}
