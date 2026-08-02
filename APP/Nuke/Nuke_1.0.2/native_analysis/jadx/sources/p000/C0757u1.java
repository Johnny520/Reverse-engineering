package p000;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C0099a;

/* JADX INFO: renamed from: u1 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0757u1 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11048h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f11049i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f11050j;

    public /* synthetic */ C0757u1(Context context, String str, int i) {
        this.f11048h = i;
        this.f11049i = context;
        this.f11050j = str;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f11048h;
        a83 a83Var = a83.f116a;
        String str = this.f11050j;
        Context context = this.f11049i;
        ImageView imageView = (ImageView) obj;
        switch (i) {
            case 0:
                imageView.getClass();
                s82 s82VarM6049b = ComponentCallbacks2C0099a.m870c(context).m6049b(str);
                s82VarM6049b.getClass();
                ((s82) s82VarM6049b.m5918t(va0.f11858d, new C0027aq())).m4764C(imageView);
                break;
            case 1:
                imageView.getClass();
                ((s82) ComponentCallbacks2C0099a.m870c(context).m6049b(str).m5905d()).m4764C(imageView);
                break;
            default:
                imageView.getClass();
                ((s82) ComponentCallbacks2C0099a.m870c(context).m6049b(str).m5905d()).m4764C(imageView);
                break;
        }
        return a83Var;
    }
}
