package p164l0;

import android.view.inputmethod.EditorInfo;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import okhttp3.internal.http2.Http2;
import p018b3.C0975s;
import p018b3.C0977t;
import p018b3.C0987y;
import p018b3.C0989z;
import p133j0.AbstractC3496d;
import p319w2.C9137t3;
import p367z3.AbstractC9848a;
import p376zd.C10010p0;

/* JADX INFO: renamed from: l0.q0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4462q0 {
    /* JADX INFO: renamed from: a */
    public static final boolean m17308a(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    /* JADX INFO: renamed from: b */
    public static final void m17309b(EditorInfo editorInfo, CharSequence charSequence, long j10, C0977t c0977t, String[] strArr) {
        int iM3571e = c0977t.m3571e();
        C0975s.a aVar = C0975s.f2976b;
        int i10 = 3;
        int i11 = 6;
        if (C0975s.m3554m(iM3571e, aVar.m3558a())) {
            if (!c0977t.m3574h()) {
                i11 = 0;
            }
        } else if (C0975s.m3554m(iM3571e, aVar.m3562e())) {
            i11 = 1;
        } else if (C0975s.m3554m(iM3571e, aVar.m3560c())) {
            i11 = 2;
        } else if (C0975s.m3554m(iM3571e, aVar.m3561d())) {
            i11 = 5;
        } else if (C0975s.m3554m(iM3571e, aVar.m3563f())) {
            i11 = 7;
        } else if (C0975s.m3554m(iM3571e, aVar.m3564g())) {
            i11 = 3;
        } else if (C0975s.m3554m(iM3571e, aVar.m3565h())) {
            i11 = 4;
        } else if (!C0975s.m3554m(iM3571e, aVar.m3559b())) {
            C10010p0.m38820a("invalid ImeAction");
            return;
        }
        editorInfo.imeOptions = i11;
        c0977t.m3573g();
        C4460p2.f12982a.m17307a(editorInfo, c0977t.m3570d());
        int iM3572f = c0977t.m3572f();
        C0989z.a aVar2 = C0989z.f3042b;
        if (C0989z.m3663n(iM3572f, aVar2.m3674h())) {
            i10 = 1;
        } else if (C0989z.m3663n(iM3572f, aVar2.m3667a())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i10 = 1;
        } else if (C0989z.m3663n(iM3572f, aVar2.m3670d())) {
            i10 = 2;
        } else if (!C0989z.m3663n(iM3572f, aVar2.m3673g())) {
            if (C0989z.m3663n(iM3572f, aVar2.m3676j())) {
                i10 = 17;
            } else if (C0989z.m3663n(iM3572f, aVar2.m3669c())) {
                i10 = 33;
            } else if (C0989z.m3663n(iM3572f, aVar2.m3672f())) {
                i10 = Opcodes.LOR;
            } else if (C0989z.m3663n(iM3572f, aVar2.m3671e())) {
                i10 = 18;
            } else {
                if (!C0989z.m3663n(iM3572f, aVar2.m3668b())) {
                    C10010p0.m38820a("Invalid Keyboard Type");
                    return;
                }
                i10 = 8194;
            }
        }
        editorInfo.inputType = i10;
        if (!c0977t.m3574h() && m17308a(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (C0975s.m3554m(c0977t.m3571e(), aVar.m3558a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (m17308a(editorInfo.inputType, 1)) {
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
        editorInfo.initialSelStart = C9137t3.m35523n(j10);
        editorInfo.initialSelEnd = C9137t3.m35518i(j10);
        AbstractC9848a.m38256e(editorInfo, charSequence);
        if (strArr != null) {
            AbstractC9848a.m38254c(editorInfo, strArr);
        }
        editorInfo.imeOptions |= 33554432;
        if (!AbstractC3496d.m13028a() || C0989z.m3663n(c0977t.m3572f(), aVar2.m3672f()) || C0989z.m3663n(c0977t.m3572f(), aVar2.m3671e())) {
            AbstractC9848a.m38257f(editorInfo, false);
        } else {
            AbstractC9848a.m38257f(editorInfo, true);
            C4458p0.f12981a.m17305a(editorInfo);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m17310c(EditorInfo editorInfo, CharSequence charSequence, long j10, C0977t c0977t, String[] strArr, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            strArr = null;
        }
        m17309b(editorInfo, charSequence, j10, c0977t, strArr);
    }
}
