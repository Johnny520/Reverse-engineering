package p018b3;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.C0644c;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.concurrent.Executor;
import okhttp3.internal.http2.Http2;
import p018b3.C0975s;
import p018b3.C0987y;
import p018b3.C0989z;
import p319w2.C9137t3;
import p367z3.AbstractC9848a;
import p376zd.C10010p0;

/* JADX INFO: renamed from: b3.a1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0936a1 {
    /* JADX INFO: renamed from: a */
    public static void m3448a(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: b3.z0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                AbstractC0936a1.m3452e(runnable, j10);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static final Executor m3451d(final Choreographer choreographer) {
        return new Executor() { // from class: b3.y0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                AbstractC0936a1.m3448a(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: renamed from: e */
    public static final void m3452e(Runnable runnable, long j10) {
        runnable.run();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m3453f(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    /* JADX INFO: renamed from: g */
    public static final void m3454g(EditorInfo editorInfo, C0977t c0977t, C0978t0 c0978t0) {
        int iM3571e = c0977t.m3571e();
        C0975s.a aVar = C0975s.f2976b;
        int i10 = 6;
        if (C0975s.m3554m(iM3571e, aVar.m3558a())) {
            if (!c0977t.m3574h()) {
                i10 = 0;
            }
        } else if (C0975s.m3554m(iM3571e, aVar.m3562e())) {
            i10 = 1;
        } else if (C0975s.m3554m(iM3571e, aVar.m3560c())) {
            i10 = 2;
        } else if (C0975s.m3554m(iM3571e, aVar.m3561d())) {
            i10 = 5;
        } else if (C0975s.m3554m(iM3571e, aVar.m3563f())) {
            i10 = 7;
        } else if (C0975s.m3554m(iM3571e, aVar.m3564g())) {
            i10 = 3;
        } else if (C0975s.m3554m(iM3571e, aVar.m3565h())) {
            i10 = 4;
        } else if (!C0975s.m3554m(iM3571e, aVar.m3559b())) {
            C10010p0.m38820a("invalid ImeAction");
            return;
        }
        editorInfo.imeOptions = i10;
        c0977t.m3573g();
        int iM3572f = c0977t.m3572f();
        C0989z.a aVar2 = C0989z.f3042b;
        if (C0989z.m3663n(iM3572f, aVar2.m3674h())) {
            editorInfo.inputType = 1;
        } else if (C0989z.m3663n(iM3572f, aVar2.m3667a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (C0989z.m3663n(iM3572f, aVar2.m3670d())) {
            editorInfo.inputType = 2;
        } else if (C0989z.m3663n(iM3572f, aVar2.m3673g())) {
            editorInfo.inputType = 3;
        } else if (C0989z.m3663n(iM3572f, aVar2.m3676j())) {
            editorInfo.inputType = 17;
        } else if (C0989z.m3663n(iM3572f, aVar2.m3669c())) {
            editorInfo.inputType = 33;
        } else if (C0989z.m3663n(iM3572f, aVar2.m3672f())) {
            editorInfo.inputType = Opcodes.LOR;
        } else if (C0989z.m3663n(iM3572f, aVar2.m3671e())) {
            editorInfo.inputType = 18;
        } else {
            if (!C0989z.m3663n(iM3572f, aVar2.m3668b())) {
                C10010p0.m38820a("Invalid Keyboard Type");
                return;
            }
            editorInfo.inputType = 8194;
        }
        if (!c0977t.m3574h() && m3453f(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (C0975s.m3554m(c0977t.m3571e(), aVar.m3558a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (m3453f(editorInfo.inputType, 1)) {
            int iM3569c = c0977t.m3569c();
            C0987y.a aVar3 = C0987y.f3034b;
            if (C0987y.m3641i(iM3569c, aVar3.m3645a())) {
                editorInfo.inputType |= 4096;
            } else if (C0987y.m3641i(iM3569c, aVar3.m3649e())) {
                editorInfo.inputType |= 8192;
            } else if (C0987y.m3641i(iM3569c, aVar3.m3647c())) {
                editorInfo.inputType |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (c0977t.m3568b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = C9137t3.m35523n(c0978t0.m3585j());
        editorInfo.initialSelEnd = C9137t3.m35518i(c0978t0.m3585j());
        AbstractC9848a.m38256e(editorInfo, c0978t0.m3586k());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: renamed from: h */
    public static final void m3455h(EditorInfo editorInfo) {
        if (C0644c.m2518i()) {
            C0644c.m2516c().m2531r(editorInfo);
        }
    }
}
