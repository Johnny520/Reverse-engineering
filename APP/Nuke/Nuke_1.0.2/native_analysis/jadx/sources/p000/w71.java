package p000;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w71 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12382a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0158e9 f12383b;

    public /* synthetic */ w71(C0158e9 c0158e9, int i) {
        this.f12382a = i;
        this.f12383b = c0158e9;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f12382a;
        C0158e9 c0158e9 = this.f12383b;
        switch (i) {
        }
        return Integer.valueOf(c0158e9.m1300g(((y81) obj2).f13353g)).compareTo(Integer.valueOf(c0158e9.m1300g(((y81) obj).f13353g)));
    }
}
