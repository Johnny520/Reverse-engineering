package io.sentry.android.replay.video;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import android.view.Surface;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.android.replay.util.C1807g;
import io.sentry.android.replay.util.EnumC1805e;
import java.nio.ByteBuffer;
import p000.AbstractC0148Dc;
import p000.AbstractC0213Ey;
import p000.AbstractC2374ph;
import p000.AbstractC2564tz;
import p000.C2790z9;
import p000.InterfaceC0159Dn;

/* JADX INFO: renamed from: io.sentry.android.replay.video.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1814d {

    /* JADX INFO: renamed from: a */
    public final C2046v2 f6567a;

    /* JADX INFO: renamed from: b */
    public final C1811a f6568b;

    /* JADX INFO: renamed from: c */
    public final Object f6569c;

    /* JADX INFO: renamed from: d */
    public final MediaCodec f6570d;

    /* JADX INFO: renamed from: e */
    public final Object f6571e;

    /* JADX INFO: renamed from: f */
    public final MediaCodec.BufferInfo f6572f;

    /* JADX INFO: renamed from: g */
    public final C1812b f6573g;

    /* JADX INFO: renamed from: h */
    public Surface f6574h;

    public C1814d(C2046v2 r3, C1811a r4) {
        this.f6567a = r3;
        this.f6568b = r4;
        InterfaceC0159Dn r32 = AbstractC0148Dc.m280n(3, C1813c.f6566b);
        this.f6569c = r32;
        if (((Boolean) r32.getValue()).booleanValue() == false) goto L5;
        MediaCodec r33 = MediaCodec.createByCodecName("c2.android.avc.encoder");
    L6:
        this.f6570d = r33;
        this.f6571e = AbstractC0148Dc.m280n(3, new C2790z9(6, this));
        this.f6572f = new MediaCodec.BufferInfo();
        this.f6573g = new C1812b(r4.f6555a.getAbsolutePath(), r4.f6558d);
        return;
    L5:
        r33 = MediaCodec.createEncoderByType("video/avc");
        goto L6
    }

    /* JADX INFO: renamed from: a */
    public final void m3982a(boolean r13) {
        C2046v2 r0 = this.f6567a;
        if (r0.getSessionReplay().f7316l == false) goto L5;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "[Encoder]: drainCodec(" + r13 + ')', new Object[0]);
    L5:
        MediaCodec r1 = this.f6570d;
        if (r13 == true) goto L8;
    L11:
        ByteBuffer[] r3 = r1.getOutputBuffers();
    L12:
        MediaCodec.BufferInfo r6 = this.f6572f;
        int r4 = r1.dequeueOutputBuffer(r6, 100000);
        if (r4 == (-1)) goto L14;
        if (r4 == (-3)) goto L21;
        C1812b r7 = this.f6573g;
        if (r4 == (-2)) goto L25;
        if (r4 < 0) goto L34;
        if (r3 == null) goto L64;
        ByteBuffer r5 = r3[r4];
        if (r5 == null) goto L64;
        if ((r6.flags & 2) == 0) goto L46;
        if (r0.getSessionReplay().f7316l == false) goto L44;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG", new Object[0]);
    L44:
        r6.size = 0;
    L46:
        if (r6.size != 0) goto L48;
    L54:
        r1.releaseOutputBuffer(r4, false);
        if ((r6.flags & 4) == 0) goto L12;
        if (r0.getSessionReplay().f7316l == false) goto L89;
        if (r13 == true) goto L61;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "[Encoder]: reached end of stream unexpectedly", new Object[0]);
        return;
    L61:
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "[Encoder]: end of stream reached", new Object[0]);
        return;
    L89:
        return;
    L48:
        if (r7.f6562c == false) goto L53;
        long r8 = r7.f6560a;
        int r10 = r7.f6564e;
        r7.f6564e = r10 + 1;
        long r82 = r8 * ((long) r10);
        r7.f6565f = r82;
        r6.presentationTimeUs = r82;
        r7.f6561b.writeSampleData(r7.f6563d, r5, r6);
        if (r0.getSessionReplay().f7316l == false) goto L54;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, AbstractC0213Ey.m409g(new StringBuilder("[Encoder]: sent "), r6.size, " bytes to muxer"), new Object[0]);
        goto L54
    L53:
        throw new RuntimeException("muxer hasn't started");
    L64:
        throw new RuntimeException(AbstractC2374ph.m4813j(r4, "encoderOutputBuffer ", " was null"));
    L34:
        if (r0.getSessionReplay().f7316l == false) goto L12;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, AbstractC2374ph.m4812i(r4, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: "), new Object[0]);
        goto L12
    L25:
        if (r7.f6562c == true) goto L31;
        MediaFormat r42 = r1.getOutputFormat();
        if (r0.getSessionReplay().f7316l == false) goto L29;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "[Encoder]: encoder output format changed: " + r42, new Object[0]);
    L29:
        MediaMuxer r52 = r7.f6561b;
        r7.f6563d = r52.addTrack(r42);
        r52.start();
        r7.f6562c = true;
        goto L12
    L31:
        throw new RuntimeException("format changed twice");
    L21:
        r3 = r1.getOutputBuffers();
        goto L12
    L14:
        if (r13 == false) goto L90;
        if (r0.getSessionReplay().f7316l == false) goto L12;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "[Encoder]: no output available, spinning to await EOS", new Object[0]);
        goto L12
    L90:
        return;
    L8:
        if (r0.getSessionReplay().f7316l == false) goto L10;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "[Encoder]: sending EOS to encoder", new Object[0]);
    L10:
        r1.signalEndOfInputStream();
        goto L11
    }

    /* JADX INFO: renamed from: b */
    public final void m3983b(Bitmap r6) {
        String r0 = Build.MANUFACTURER;
        if (AbstractC2564tz.m5051L(r0, "xiaomi", true) == false) goto L5;
    L21:
        Surface r02 = this.f6574h;
        if (r02 != null) goto L23;
    L20:
        Canvas r03 = null;
    L24:
        if (r03 == null) goto L26;
        r03.drawBitmap(r6, 0.0f, 0.0f, null);
    L26:
        Surface r62 = this.f6574h;
        if (r62 == null) goto L29;
        r62.unlockCanvasAndPost(r03);
    L29:
        m3982a(false);
        return;
    L23:
        r03 = r02.lockCanvas(null);
        goto L24
    L5:
        if (AbstractC2564tz.m5051L(r0, "motorola", true) == true) goto L21;
        EnumC1805e r04 = EnumC1805e.SOC_MANUFACTURER;
        String r1 = C1807g.m3978a(r04);
        if (r1 != null) goto L9;
        boolean r12 = false;
    L10:
        if (r12 == true) goto L21;
        String r05 = C1807g.m3978a(r04);
        if (r05 != null) goto L14;
        boolean r06 = false;
    L15:
        if (r06 == true) goto L21;
        Surface r07 = this.f6574h;
        if (r07 == null) goto L20;
        r03 = r07.lockHardwareCanvas();
        goto L24
    L14:
        r06 = r05.equalsIgnoreCase("unisoc");
        goto L15
    L9:
        r12 = r1.equalsIgnoreCase("spreadtrum");
        goto L10
    }

    /* JADX INFO: renamed from: c */
    public final void m3984c() {
        MediaCodec r0 = this.f6570d;
        m3982a(true);     // Catch: Throwable -> L6
        r0.stop();     // Catch: Throwable -> L6
        r0.release();     // Catch: Throwable -> L6
        Surface r02 = this.f6574h;     // Catch: Throwable -> L6
        if (r02 == null) goto L8;
        r02.release();     // Catch: Throwable -> L6
    L8:
        MediaMuxer r03 = this.f6573g.f6561b;     // Catch: Throwable -> L6
        r03.stop();     // Catch: Throwable -> L6
        r03.release();     // Catch: Throwable -> L6
        return;
    L6:
        th = move-exception;
        this.f6567a.getLogger().mo3683r(EnumC1657a2.DEBUG, "Failed to properly release video encoder", th);
    }
}
