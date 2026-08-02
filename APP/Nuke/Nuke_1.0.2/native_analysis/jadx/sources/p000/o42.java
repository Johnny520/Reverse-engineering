package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o42 implements jh1 {

    /* JADX INFO: renamed from: a */
    public final Context f7481a;

    /* JADX INFO: renamed from: b */
    public final jh1 f7482b;

    /* JADX INFO: renamed from: c */
    public final jh1 f7483c;

    /* JADX INFO: renamed from: d */
    public final Class f7484d;

    public o42(Context context, jh1 jh1Var, jh1 jh1Var2, Class cls) {
        this.f7481a = context.getApplicationContext();
        this.f7482b = jh1Var;
        this.f7483c = jh1Var2;
        this.f7484d = cls;
    }

    @Override // p000.jh1
    /* JADX INFO: renamed from: a */
    public final boolean mo235a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC0691se.m4825N((Uri) obj);
    }

    @Override // p000.jh1
    /* JADX INFO: renamed from: b */
    public final ih1 mo236b(Object obj, int i, int i2, ov1 ov1Var) {
        Uri uri = (Uri) obj;
        return new ih1(new is1(uri), new n42(this.f7481a, this.f7482b, this.f7483c, uri, i, i2, ov1Var, this.f7484d));
    }
}
