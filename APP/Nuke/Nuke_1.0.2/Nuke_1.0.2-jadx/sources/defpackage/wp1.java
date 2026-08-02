package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wp1 extends yn0 implements in0 {
    public static final wp1 o = new wp1(1, og3.class, "<init>", "<init>(Landroid/content/Context;)V", 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        og3 og3Var = new og3(context);
        og3Var.setEGLContextClientVersion(2);
        og3Var.setEGLConfigChooser(8, 8, 8, 8, 24, 0);
        og3Var.setPreserveEGLContextOnPause(true);
        og3Var.setRenderer(new pg3());
        og3Var.setRenderMode(1);
        return og3Var;
    }
}
