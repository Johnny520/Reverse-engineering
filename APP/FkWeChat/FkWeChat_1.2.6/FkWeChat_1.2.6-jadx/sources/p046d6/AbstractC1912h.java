package p046d6;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import p077f6.C2306e;
import p077f6.InterfaceC2339y;
import p264s0.C6977v5;
import p265s1.C7128q1;

/* JADX INFO: renamed from: d6.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1912h {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC2339y m6957a(long j10, long j11, long j12, long j13, long j14, InterfaceC0572r interfaceC0572r, int i10, int i11) {
        long jM26799t = (i11 & 1) != 0 ? C6977v5.f22996a.m27579a(interfaceC0572r, C6977v5.f22997b).m26799t() : j10;
        long jM28129o = (i11 & 2) != 0 ? C7128q1.m28129o(C6977v5.f22996a.m27579a(interfaceC0572r, C6977v5.f22997b).m26799t(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long j15 = (i11 & 4) != 0 ? jM28129o : j12;
        long jM26746L = (i11 & 8) != 0 ? C6977v5.f22996a.m27579a(interfaceC0572r, C6977v5.f22997b).m26746L() : j13;
        long jM28129o2 = (i11 & 16) != 0 ? C7128q1.m28129o(C6977v5.f22996a.m27579a(interfaceC0572r, C6977v5.f22997b).m26799t(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(1349673078, i10, -1, "com.mikepenz.markdown.m3.markdownColor (MarkdownColors.kt:15)");
        }
        C2306e c2306e = new C2306e(jM26799t, jM28129o, j15, jM26746L, jM28129o2, null);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return c2306e;
    }
}
