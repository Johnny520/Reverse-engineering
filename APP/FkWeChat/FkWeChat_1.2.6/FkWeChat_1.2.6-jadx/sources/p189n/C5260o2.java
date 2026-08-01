package p189n;

import android.view.View;
import android.widget.Magnifier;
import p049d9.AbstractC1927c;
import p121i3.InterfaceC3175e;
import p189n.C5255n2;

/* JADX INFO: renamed from: n.o2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5260o2 implements InterfaceC5250m2 {

    /* JADX INFO: renamed from: b */
    public static final C5260o2 f16176b = new C5260o2();

    /* JADX INFO: renamed from: c */
    public static final boolean f16177c = true;

    /* JADX INFO: renamed from: n.o2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends C5255n2.a {
        public a(Magnifier magnifier) {
            super(magnifier);
        }

        @Override // p189n.C5255n2.a, p189n.InterfaceC5245l2
        /* JADX INFO: renamed from: b */
        public void mo21481b(long j10, long j11, float f10) {
            if (!Float.isNaN(f10)) {
                m21490d().setZoom(f10);
            }
            if ((9223372034707292159L & j11) != 9205357640488583168L) {
                m21490d().show(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
            } else {
                m21490d().show(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
            }
        }
    }

    @Override // p189n.InterfaceC5250m2
    /* JADX INFO: renamed from: a */
    public boolean mo21485a() {
        return f16177c;
    }

    @Override // p189n.InterfaceC5250m2
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a mo21486b(View view, boolean z10, long j10, float f10, float f11, boolean z11, InterfaceC3175e interfaceC3175e, float f12) {
        if (z10) {
            return new a(new Magnifier(view));
        }
        long jMo1224J1 = interfaceC3175e.mo1224J1(j10);
        float fMo1233i1 = interfaceC3175e.mo1233i1(f10);
        float fMo1233i12 = interfaceC3175e.mo1233i1(f11);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jMo1224J1 != 9205357640488583168L) {
            builder.setSize(AbstractC1927c.m6980d(Float.intBitsToFloat((int) (jMo1224J1 >> 32))), AbstractC1927c.m6980d(Float.intBitsToFloat((int) (jMo1224J1 & 4294967295L))));
        }
        if (!Float.isNaN(fMo1233i1)) {
            builder.setCornerRadius(fMo1233i1);
        }
        if (!Float.isNaN(fMo1233i12)) {
            builder.setElevation(fMo1233i12);
        }
        if (!Float.isNaN(f12)) {
            builder.setInitialZoom(f12);
        }
        builder.setClippingEnabled(z11);
        return new a(builder.build());
    }
}
