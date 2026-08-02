package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.a;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u1 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ String j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ u1(Context context, String str, int i) {
        this.h = i;
        this.i = context;
        this.j = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        a83 a83Var = a83.a;
        String str = this.j;
        Context context = this.i;
        ImageView imageView = (ImageView) obj;
        switch (i) {
            case 0:
                imageView.getClass();
                s82 s82VarB = a.c(context).b(str);
                s82VarB.getClass();
                ((s82) s82VarB.t(va0.d, new aq())).C(imageView);
                break;
            case 1:
                imageView.getClass();
                ((s82) a.c(context).b(str).d()).C(imageView);
                break;
            default:
                imageView.getClass();
                ((s82) a.c(context).b(str).d()).C(imageView);
                break;
        }
        return a83Var;
    }
}
