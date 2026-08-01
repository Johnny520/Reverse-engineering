package p000;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class k70 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3040a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0791u5 f3041b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ k70(C0791u5 c0791u5, int i) {
        this.f3040a = i;
        this.f3041b = c0791u5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f3040a;
        C0791u5 c0791u5 = this.f3041b;
        switch (i) {
        }
        return pf1.m3056p(Integer.valueOf(c0791u5.m4252c(((w80) obj2).f7036f)), Integer.valueOf(c0791u5.m4252c(((w80) obj).f7036f)));
    }
}
