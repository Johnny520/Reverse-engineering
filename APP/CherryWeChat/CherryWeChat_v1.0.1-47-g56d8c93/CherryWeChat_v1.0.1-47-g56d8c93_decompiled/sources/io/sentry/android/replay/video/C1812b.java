package io.sentry.android.replay.video;

import android.media.MediaMuxer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.android.replay.video.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1812b {

    /* JADX INFO: renamed from: a */
    public final long f6560a;

    /* JADX INFO: renamed from: b */
    public final MediaMuxer f6561b;

    /* JADX INFO: renamed from: c */
    public boolean f6562c;

    /* JADX INFO: renamed from: d */
    public int f6563d;

    /* JADX INFO: renamed from: e */
    public int f6564e;

    /* JADX INFO: renamed from: f */
    public long f6565f;

    public C1812b(String str, float f) {
        this.f6560a = (long) (TimeUnit.SECONDS.toMicros(1L) / f);
        this.f6561b = new MediaMuxer(str, 0);
    }
}
