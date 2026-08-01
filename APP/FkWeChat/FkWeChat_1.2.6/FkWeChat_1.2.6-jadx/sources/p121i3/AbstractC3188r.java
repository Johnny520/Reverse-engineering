package p121i3;

import p250r1.C6457g;

/* JADX INFO: renamed from: i3.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3188r {
    /* JADX INFO: renamed from: a */
    public static final C3187q m12077a(long j10, long j11) {
        return new C3187q(C3185o.m12049i(j10), C3185o.m12050j(j10), C3185o.m12049i(j10) + ((int) (j11 >> 32)), C3185o.m12050j(j10) + ((int) (j11 & 4294967295L)));
    }

    /* JADX INFO: renamed from: b */
    public static final C3187q m12078b(C6457g c6457g) {
        return new C3187q(Math.round(c6457g.m25583l()), Math.round(c6457g.m25586o()), Math.round(c6457g.m25584m()), Math.round(c6457g.m25580i()));
    }

    /* JADX INFO: renamed from: c */
    public static final C6457g m12079c(C3187q c3187q) {
        return new C6457g(c3187q.m12068g(), c3187q.m12071j(), c3187q.m12069h(), c3187q.m12065d());
    }
}
