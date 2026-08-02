package p000;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: renamed from: qa */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0612qa implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8850a;

    public /* synthetic */ C0612qa(int i) {
        this.f8850a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8850a) {
            case 0:
                return t11.m5089o(((j32) obj2).f4886a, ((j32) obj).f4886a);
            case 1:
                return t11.m5089o(((b21) obj).f536b, ((b21) obj2).f536b);
            case 2:
                c11 c11Var = (c11) obj;
                c11 c11Var2 = (c11) obj2;
                return (c11Var.f26i - c11Var.f25h) - (c11Var2.f26i - c11Var2.f25h);
            case 3:
                r61 r61Var = (r61) obj;
                r61 r61Var2 = (r61) obj2;
                float f = r61Var.f9373N.f11795p.f6611K;
                float f2 = r61Var2.f9373N.f11795p.f6611K;
                return f == f2 ? t11.m5089o(r61Var.m4390v(), r61Var2.m4390v()) : Float.compare(f, f2);
            case 4:
                return t11.m5089o(((y81) obj).f13347a, ((y81) obj2).f13347a);
            default:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    }
}
