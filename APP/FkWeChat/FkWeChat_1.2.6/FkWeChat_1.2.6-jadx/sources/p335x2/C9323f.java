package p335x2;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;
import p010a9.InterfaceC0188p;
import p351y2.C9532a;
import p351y2.C9541j;

/* JADX INFO: renamed from: x2.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9323f {

    /* JADX INFO: renamed from: a */
    public static final C9323f f31897a = new C9323f();

    /* JADX INFO: renamed from: a */
    public static boolean m36324a(InterfaceC0188p interfaceC0188p, RectF rectF, RectF rectF2) {
        return ((Boolean) interfaceC0188p.invoke(rectF, rectF2)).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public final int[] m36325b(C9331h1 c9331h1, RectF rectF, int i10, final InterfaceC0188p interfaceC0188p) {
        SegmentFinder segmentFinderM36282a;
        if (i10 == 1) {
            segmentFinderM36282a = C9532a.f32523a.m37318a(new C9541j(c9331h1.m36354G(), c9331h1.m36356I()));
        } else {
            AbstractC9317d.m36295a();
            segmentFinderM36282a = AbstractC9308a.m36282a(AbstractC9314c.m36288a(c9331h1.m36354G(), c9331h1.m36355H()));
        }
        return c9331h1.m36368i().getRangeForRect(rectF, segmentFinderM36282a, new Layout.TextInclusionStrategy() { // from class: x2.e
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return C9323f.m36324a(interfaceC0188p, rectF2, rectF3);
            }
        });
    }
}
