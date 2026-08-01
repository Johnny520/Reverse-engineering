package p111W1;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.bumptech.glide.AbstractC1925g;
import p078P1.C1147i;
import p107V1.C1517p;
import p107V1.InterfaceC1518q;
import p189k2.C2452b;

/* JADX INFO: renamed from: W1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1598d implements InterfaceC1518q {

    /* JADX INFO: renamed from: a */
    public final Context f5535a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1518q f5536b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1518q f5537c;

    /* JADX INFO: renamed from: d */
    public final Class f5538d;

    public C1598d(Context context, InterfaceC1518q interfaceC1518q, InterfaceC1518q interfaceC1518q2, Class cls) {
        this.f5535a = context.getApplicationContext();
        this.f5536b = interfaceC1518q;
        this.f5537c = interfaceC1518q2;
        this.f5538d = cls;
    }

    @Override // p107V1.InterfaceC1518q
    /* JADX INFO: renamed from: a */
    public final boolean mo2773a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC1925g.m3546w((Uri) obj);
    }

    @Override // p107V1.InterfaceC1518q
    /* JADX INFO: renamed from: b */
    public final C1517p mo2774b(Object obj, int i5, int i6, C1147i c1147i) {
        Uri uri = (Uri) obj;
        return new C1517p(new C2452b(uri), new C1597c(this.f5535a, this.f5536b, this.f5537c, uri, i5, i6, c1147i, this.f5538d));
    }
}
