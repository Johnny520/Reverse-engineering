package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import java.nio.MappedByteBuffer;

/* JADX INFO: renamed from: x3 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0912x3 implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7251d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f7252e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0912x3(int i, Object obj) {
        this.f7251d = i;
        this.f7252e = obj;
    }

    /* JADX DEBUG: Class process forced to load method for inline: tv0.a(tv0):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01ac, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01b0, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        int i3 = this.f7251d;
        Object obj = this.f7252e;
        switch (i3) {
            case 0:
                ViewOnAttachStateChangeListenerC0078c4 viewOnAttachStateChangeListenerC0078c4 = (ViewOnAttachStateChangeListenerC0078c4) obj;
                Trace.beginSection("measureAndLayout");
                try {
                    viewOnAttachStateChangeListenerC0078c4.f669g.m4859s(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        viewOnAttachStateChangeListenerC0078c4.m462f();
                        Trace.endSection();
                        viewOnAttachStateChangeListenerC0078c4.f664M = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 1:
                ViewOnAttachStateChangeListenerC0827v4 viewOnAttachStateChangeListenerC0827v4 = (ViewOnAttachStateChangeListenerC0827v4) obj;
                boolean zM4391i = viewOnAttachStateChangeListenerC0827v4.m4391i();
                ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = viewOnAttachStateChangeListenerC0827v4.f6394d;
                if (zM4391i) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        viewTreeObserverOnGlobalLayoutListenerC0875w3.m4859s(true);
                        ug0 ug0Var = viewOnAttachStateChangeListenerC0827v4.f6405o;
                        int[] iArr = ug0Var.f6112b;
                        long[] jArr = ug0Var.f6111a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j = jArr[i4];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    int i6 = 0;
                                    while (i6 < i5) {
                                        if ((255 & j) < 128) {
                                            int i7 = iArr[(i4 << 3) + i6];
                                            if (viewOnAttachStateChangeListenerC0827v4.m4390h().m4247a(i7)) {
                                                i2 = i4;
                                            } else {
                                                i2 = i4;
                                                viewOnAttachStateChangeListenerC0827v4.f6397g.add(new C0805uj(i7, viewOnAttachStateChangeListenerC0827v4.f6404n, EnumC0854vj.f6724e, null));
                                                viewOnAttachStateChangeListenerC0827v4.f6401k.mo1710s(na1.f4229a);
                                            }
                                        }
                                        j >>= 8;
                                        i6++;
                                        i4 = i2;
                                    }
                                    int i8 = i4;
                                    if (i5 == 8) {
                                        i = i8;
                                    }
                                } else {
                                    i = i4;
                                }
                                if (i != length) {
                                    i4 = i + 1;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        viewOnAttachStateChangeListenerC0827v4.m4393k(viewTreeObserverOnGlobalLayoutListenerC0875w3.getSemanticsOwner().m2a(), viewOnAttachStateChangeListenerC0827v4.f6406p);
                        Trace.endSection();
                        viewOnAttachStateChangeListenerC0827v4.m4388f(viewOnAttachStateChangeListenerC0827v4.m4390h());
                        viewOnAttachStateChangeListenerC0827v4.m4396n();
                        viewOnAttachStateChangeListenerC0827v4.f6407q = false;
                        return;
                    } finally {
                    }
                }
                return;
            case 2:
                ViewTreeObserverOnDrawListenerC0129dh viewTreeObserverOnDrawListenerC0129dh = (ViewTreeObserverOnDrawListenerC0129dh) obj;
                Runnable runnable = viewTreeObserverOnDrawListenerC0129dh.f1105e;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0129dh.f1105e = null;
                    return;
                }
                return;
            case 3:
                DialogC1010zn.m5593a((DialogC1010zn) obj);
                return;
            case 4:
                C0741sv c0741sv = (C0741sv) obj;
                synchronized (c0741sv.f5841g) {
                    try {
                        if (c0741sv.f5845k == null) {
                            return;
                        }
                        try {
                            C0107cw c0107cwM4107c = c0741sv.m4107c();
                            int i9 = c0107cwM4107c.f903f;
                            if (i9 == 2) {
                                synchronized (c0741sv.f5841g) {
                                }
                            }
                            if (i9 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i9 + ")");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C0675r3 c0675r3 = c0741sv.f5840f;
                                Context context = c0741sv.f5838d;
                                c0675r3.getClass();
                                Typeface typefaceM4926a = w91.m4926a(context, new C0107cw[]{c0107cwM4107c});
                                MappedByteBuffer mappedByteBufferM4277t = u50.m4277t(c0741sv.f5838d, c0107cwM4107c.f898a);
                                if (mappedByteBufferM4277t == null || typefaceM4926a == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                C0948y2 c0948y2 = new C0948y2(typefaceM4926a, z60.m5425L(mappedByteBufferM4277t));
                                Trace.endSection();
                                synchronized (c0741sv.f5841g) {
                                    try {
                                        s91 s91Var = c0741sv.f5845k;
                                        if (s91Var != null) {
                                            s91Var.mo2735I(c0948y2);
                                        }
                                    } finally {
                                    }
                                    break;
                                }
                                c0741sv.m4106b();
                                return;
                            } catch (Throwable th) {
                                throw th;
                            } finally {
                            }
                            break;
                        } catch (Throwable th2) {
                            synchronized (c0741sv.f5841g) {
                                try {
                                    s91 s91Var2 = c0741sv.f5845k;
                                    if (s91Var2 != null) {
                                        s91Var2.mo2734H(th2);
                                    }
                                    c0741sv.m4106b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 5:
                m90.m2470o((m90) obj);
                return;
            case 6:
                os0 os0Var = (os0) obj;
                z90 z90Var = os0Var.f4627i;
                if (os0Var.f4623e == 0) {
                    os0Var.f4624f = true;
                    z90Var.m5461e(q90.ON_PAUSE);
                }
                if (os0Var.f4622d == 0 && os0Var.f4624f) {
                    z90Var.m5461e(q90.ON_STOP);
                    os0Var.f4625g = true;
                    return;
                }
                return;
            case 7:
                tv0.setRippleState$lambda$1((tv0) obj);
                return;
            default:
                wb1.m4966v((InterfaceC0742sw) obj);
                return;
        }
    }
}
