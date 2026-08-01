package p351y2;

import android.text.SegmentFinder;
import p335x2.AbstractC9308a;

/* JADX INFO: renamed from: y2.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9532a {

    /* JADX INFO: renamed from: a */
    public static final C9532a f32523a = new C9532a();

    /* JADX INFO: renamed from: y2.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends SegmentFinder {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9537f f32524a;

        public a(InterfaceC9537f interfaceC9537f) {
            this.f32524a = interfaceC9537f;
        }

        public int nextEndBoundary(int i10) {
            return this.f32524a.mo37322d(i10);
        }

        public int nextStartBoundary(int i10) {
            return this.f32524a.mo37319a(i10);
        }

        public int previousEndBoundary(int i10) {
            return this.f32524a.mo37320b(i10);
        }

        public int previousStartBoundary(int i10) {
            return this.f32524a.mo37321c(i10);
        }
    }

    /* JADX INFO: renamed from: a */
    public final SegmentFinder m37318a(InterfaceC9537f interfaceC9537f) {
        return AbstractC9308a.m36282a(new a(interfaceC9537f));
    }
}
