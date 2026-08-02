package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: renamed from: uk */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0776uk implements n92, kh1 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11337h;

    /* JADX INFO: renamed from: i */
    public final Resources f11338i;

    public /* synthetic */ C0776uk(Resources resources, int i) {
        this.f11337h = i;
        this.f11338i = resources;
    }

    @Override // p000.n92
    /* JADX INFO: renamed from: i */
    public d92 mo422i(d92 d92Var, ov1 ov1Var) {
        if (d92Var == null) {
            return null;
        }
        return new C0022al(this.f11338i, d92Var);
    }

    @Override // p000.kh1
    /* JADX INFO: renamed from: q */
    public jh1 mo1330q(kj1 kj1Var) {
        int i = this.f11337h;
        Resources resources = this.f11338i;
        switch (i) {
            case 1:
                return new C0733tg(resources, kj1Var.m2708g(Uri.class, AssetFileDescriptor.class));
            case 2:
                return new C0733tg(resources, kj1Var.m2708g(Uri.class, InputStream.class));
            default:
                return new C0733tg(resources, b83.f738b);
        }
    }
}
