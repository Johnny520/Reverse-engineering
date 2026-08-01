package p189n;

import android.view.View;
import android.widget.Magnifier;
import p121i3.C3189s;
import p121i3.InterfaceC3175e;

/* JADX INFO: renamed from: n.n2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5255n2 implements InterfaceC5250m2 {

    /* JADX INFO: renamed from: b */
    public static final C5255n2 f16154b = new C5255n2();

    /* JADX INFO: renamed from: c */
    public static final boolean f16155c = false;

    /* JADX INFO: renamed from: n.n2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a implements InterfaceC5245l2 {

        /* JADX INFO: renamed from: a */
        public final Magnifier f16156a;

        public a(Magnifier magnifier) {
            this.f16156a = magnifier;
        }

        @Override // p189n.InterfaceC5245l2
        /* JADX INFO: renamed from: a */
        public long mo21480a() {
            return C3189s.m12082c((((long) this.f16156a.getHeight()) & 4294967295L) | (((long) this.f16156a.getWidth()) << 32));
        }

        @Override // p189n.InterfaceC5245l2
        /* JADX INFO: renamed from: b */
        public void mo21481b(long j10, long j11, float f10) {
            this.f16156a.show(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }

        @Override // p189n.InterfaceC5245l2
        /* JADX INFO: renamed from: c */
        public void mo21482c() {
            this.f16156a.update();
        }

        /* JADX INFO: renamed from: d */
        public final Magnifier m21490d() {
            return this.f16156a;
        }

        @Override // p189n.InterfaceC5245l2
        public void dismiss() {
            this.f16156a.dismiss();
        }
    }

    @Override // p189n.InterfaceC5250m2
    /* JADX INFO: renamed from: a */
    public boolean mo21485a() {
        return f16155c;
    }

    @Override // p189n.InterfaceC5250m2
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a mo21486b(View view, boolean z10, long j10, float f10, float f11, boolean z11, InterfaceC3175e interfaceC3175e, float f12) {
        return new a(new Magnifier(view));
    }
}
