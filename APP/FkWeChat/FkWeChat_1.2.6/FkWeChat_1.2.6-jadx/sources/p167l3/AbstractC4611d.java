package p167l3;

import android.view.View;
import p058e2.InterfaceC1999a;
import p135j2.AbstractC3581x;
import p166l2.C4554j0;

/* JADX INFO: renamed from: l3.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4611d {

    /* JADX INFO: renamed from: a */
    public static final a f13699a = new a();

    /* JADX INFO: renamed from: l3.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC1999a {
    }

    /* JADX INFO: renamed from: d */
    public static final void m18508d(View view, C4554j0 c4554j0) {
        long jM13416g = AbstractC3581x.m13416g(c4554j0.mo13083n());
        int iRound = Math.round(Float.intBitsToFloat((int) (jM13416g >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jM13416g & 4294967295L)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }

    /* JADX INFO: renamed from: e */
    public static final float m18509e(float f10) {
        return f10 * (-1.0f);
    }
}
