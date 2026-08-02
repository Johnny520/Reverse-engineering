package defpackage;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qa implements Comparator {
    public final /* synthetic */ int a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [gf1.<clinit>():void, p7.<clinit>():void, r61.<clinit>():void, rg3.<clinit>():void, s11.b0(java.io.File, java.lang.String):void, sa.<init>(android.view.View):void] */
    public /* synthetic */ qa(int i) {
        this.a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return t11.o(((j32) obj2).a, ((j32) obj).a);
            case 1:
                return t11.o(((b21) obj).b, ((b21) obj2).b);
            case 2:
                c11 c11Var = (c11) obj;
                c11 c11Var2 = (c11) obj2;
                return (c11Var.i - c11Var.h) - (c11Var2.i - c11Var2.h);
            case 3:
                r61 r61Var = (r61) obj;
                r61 r61Var2 = (r61) obj2;
                float f = r61Var.N.p.K;
                float f2 = r61Var2.N.p.K;
                return f == f2 ? t11.o(r61Var.v(), r61Var2.v()) : Float.compare(f, f2);
            case 4:
                return t11.o(((y81) obj).a, ((y81) obj2).a);
            default:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    }
}
