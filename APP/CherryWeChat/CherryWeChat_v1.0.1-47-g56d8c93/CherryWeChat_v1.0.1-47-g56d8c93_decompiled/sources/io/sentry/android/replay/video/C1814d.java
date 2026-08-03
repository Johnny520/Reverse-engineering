package io.sentry.android.replay.video;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
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

    public C1814d(C2046v2 c2046v2, C1811a c1811a) {
        this.f6567a = c2046v2;
        this.f6568b = c1811a;
        InterfaceC0159Dn interfaceC0159DnM280n = AbstractC0148Dc.m280n(3, C1813c.f6566b);
        this.f6569c = interfaceC0159DnM280n;
        this.f6570d = ((Boolean) interfaceC0159DnM280n.getValue()).booleanValue() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType("video/avc");
        this.f6571e = AbstractC0148Dc.m280n(3, new C2790z9(6, this));
        this.f6572f = new MediaCodec.BufferInfo();
        this.f6573g = new C1812b(c1811a.f6555a.getAbsolutePath(), c1811a.f6558d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0180, code lost:
    
        throw new java.lang.RuntimeException(p000.AbstractC2374ph.m4813j(r4, "encoderOutputBuffer ", " was null"));
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3982a(boolean z) {
        ByteBuffer byteBuffer;
        C2046v2 c2046v2 = this.f6567a;
        if (c2046v2.getSessionReplay().f7316l) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "[Encoder]: drainCodec(" + z + ')', new Object[0]);
        }
        MediaCodec mediaCodec = this.f6570d;
        if (z) {
            if (c2046v2.getSessionReplay().f7316l) {
                c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "[Encoder]: sending EOS to encoder", new Object[0]);
            }
            mediaCodec.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
        while (true) {
            MediaCodec.BufferInfo bufferInfo = this.f6572f;
            int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (iDequeueOutputBuffer == -1) {
                if (!z) {
                    return;
                }
                if (c2046v2.getSessionReplay().f7316l) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "[Encoder]: no output available, spinning to await EOS", new Object[0]);
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = mediaCodec.getOutputBuffers();
            } else {
                C1812b c1812b = this.f6573g;
                if (iDequeueOutputBuffer == -2) {
                    if (c1812b.f6562c) {
                        throw new RuntimeException("format changed twice");
                    }
                    MediaFormat outputFormat = mediaCodec.getOutputFormat();
                    if (c2046v2.getSessionReplay().f7316l) {
                        c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "[Encoder]: encoder output format changed: " + outputFormat, new Object[0]);
                    }
                    MediaMuxer mediaMuxer = c1812b.f6561b;
                    c1812b.f6563d = mediaMuxer.addTrack(outputFormat);
                    mediaMuxer.start();
                    c1812b.f6562c = true;
                } else if (iDequeueOutputBuffer < 0) {
                    if (c2046v2.getSessionReplay().f7316l) {
                        c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, AbstractC2374ph.m4812i(iDequeueOutputBuffer, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: "), new Object[0]);
                    }
                } else {
                    if (outputBuffers == null || (byteBuffer = outputBuffers[iDequeueOutputBuffer]) == null) {
                        break;
                    }
                    if ((bufferInfo.flags & 2) != 0) {
                        if (c2046v2.getSessionReplay().f7316l) {
                            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG", new Object[0]);
                        }
                        bufferInfo.size = 0;
                    }
                    if (bufferInfo.size != 0) {
                        if (!c1812b.f6562c) {
                            throw new RuntimeException("muxer hasn't started");
                        }
                        long j = c1812b.f6560a;
                        int i = c1812b.f6564e;
                        c1812b.f6564e = i + 1;
                        long j2 = j * ((long) i);
                        c1812b.f6565f = j2;
                        bufferInfo.presentationTimeUs = j2;
                        c1812b.f6561b.writeSampleData(c1812b.f6563d, byteBuffer, bufferInfo);
                        if (c2046v2.getSessionReplay().f7316l) {
                            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, AbstractC0213Ey.m409g(new StringBuilder("[Encoder]: sent "), bufferInfo.size, " bytes to muxer"), new Object[0]);
                        }
                    }
                    mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    if ((bufferInfo.flags & 4) != 0) {
                        if (c2046v2.getSessionReplay().f7316l) {
                            if (z) {
                                c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "[Encoder]: end of stream reached", new Object[0]);
                                return;
                            } else {
                                c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "[Encoder]: reached end of stream unexpectedly", new Object[0]);
                                return;
                            }
                        }
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3983b(Bitmap bitmap) {
        Canvas canvasLockCanvas;
        String str = Build.MANUFACTURER;
        if (AbstractC2564tz.m5051L(str, "xiaomi", true) || AbstractC2564tz.m5051L(str, "motorola", true)) {
            Surface surface = this.f6574h;
            canvasLockCanvas = surface != null ? surface.lockCanvas(null) : null;
        } else {
            EnumC1805e enumC1805e = EnumC1805e.SOC_MANUFACTURER;
            String strM3978a = C1807g.m3978a(enumC1805e);
            if (!(strM3978a == null ? false : strM3978a.equalsIgnoreCase("spreadtrum"))) {
                String strM3978a2 = C1807g.m3978a(enumC1805e);
                if (!(strM3978a2 == null ? false : strM3978a2.equalsIgnoreCase("unisoc"))) {
                    Surface surface2 = this.f6574h;
                    if (surface2 != null) {
                        canvasLockCanvas = surface2.lockHardwareCanvas();
                    }
                }
            }
        }
        if (canvasLockCanvas != null) {
            canvasLockCanvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Surface surface3 = this.f6574h;
        if (surface3 != null) {
            surface3.unlockCanvasAndPost(canvasLockCanvas);
        }
        m3982a(false);
    }

    /* JADX INFO: renamed from: c */
    public final void m3984c() {
        MediaCodec mediaCodec = this.f6570d;
        try {
            m3982a(true);
            mediaCodec.stop();
            mediaCodec.release();
            Surface surface = this.f6574h;
            if (surface != null) {
                surface.release();
            }
            MediaMuxer mediaMuxer = this.f6573g.f6561b;
            mediaMuxer.stop();
            mediaMuxer.release();
        } catch (Throwable th) {
            this.f6567a.getLogger().mo3683r(EnumC1657a2.DEBUG, "Failed to properly release video encoder", th);
        }
    }
}
