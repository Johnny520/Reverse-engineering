package p179m2;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewParent;
import p010a9.InterfaceC0184l;
import p018b3.InterfaceC0964m0;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p191n1.InterfaceC5486o;
import p222p2.AbstractC5944d;
import p265s1.C7114n2;

/* JADX INFO: renamed from: m2.h0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4849h0 {

    /* JADX INFO: renamed from: a */
    public static InterfaceC0184l f14418a = a.f14419r;

    /* JADX INFO: renamed from: f */
    public static final boolean m19366f(View view, View view2) {
        if (AbstractC1061t.m3842c(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m19367g(Configuration configuration, Configuration configuration2) {
        return (configuration.diff(configuration2) & (-1342235264)) != 0;
    }

    /* JADX INFO: renamed from: h */
    public static final float m19368h(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12] * fArr2[i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 3] * fArr2[12 + i11]);
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC5486o m19369i(View view) {
        AbstractC5944d.m23900c(view, 1);
        return AbstractC5944d.m23899b(view);
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC0184l m19370j() {
        return f14418a;
    }

    /* JADX INFO: renamed from: k */
    public static final void m19371k(float[] fArr, float[] fArr2) {
        float fM19368h = m19368h(fArr2, 0, fArr, 0);
        float fM19368h2 = m19368h(fArr2, 0, fArr, 1);
        float fM19368h3 = m19368h(fArr2, 0, fArr, 2);
        float fM19368h4 = m19368h(fArr2, 0, fArr, 3);
        float fM19368h5 = m19368h(fArr2, 1, fArr, 0);
        float fM19368h6 = m19368h(fArr2, 1, fArr, 1);
        float fM19368h7 = m19368h(fArr2, 1, fArr, 2);
        float fM19368h8 = m19368h(fArr2, 1, fArr, 3);
        float fM19368h9 = m19368h(fArr2, 2, fArr, 0);
        float fM19368h10 = m19368h(fArr2, 2, fArr, 1);
        float fM19368h11 = m19368h(fArr2, 2, fArr, 2);
        float fM19368h12 = m19368h(fArr2, 2, fArr, 3);
        float fM19368h13 = m19368h(fArr2, 3, fArr, 0);
        float fM19368h14 = m19368h(fArr2, 3, fArr, 1);
        float fM19368h15 = m19368h(fArr2, 3, fArr, 2);
        float fM19368h16 = m19368h(fArr2, 3, fArr, 3);
        fArr[0] = fM19368h;
        fArr[1] = fM19368h2;
        fArr[2] = fM19368h3;
        fArr[3] = fM19368h4;
        fArr[4] = fM19368h5;
        fArr[5] = fM19368h6;
        fArr[6] = fM19368h7;
        fArr[7] = fM19368h8;
        fArr[8] = fM19368h9;
        fArr[9] = fM19368h10;
        fArr[10] = fM19368h11;
        fArr[11] = fM19368h12;
        fArr[12] = fM19368h13;
        fArr[13] = fM19368h14;
        fArr[14] = fM19368h15;
        fArr[15] = fM19368h16;
    }

    /* JADX INFO: renamed from: l */
    public static final void m19372l(float[] fArr, float f10, float f11, float[] fArr2) {
        C7114n2.m28026h(fArr2);
        C7114n2.m28035q(fArr2, f10, f11, 0.0f, 4, null);
        m19371k(fArr, fArr2);
    }

    /* JADX INFO: renamed from: m2.h0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public static final a f14419r = new a();

        public a() {
            super(1);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0964m0 mo27m(InterfaceC0964m0 interfaceC0964m0) {
            return interfaceC0964m0;
        }
    }
}
