package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: renamed from: Lu */
/* JADX INFO: loaded from: classes.dex */
public final class C0510Lu implements InterfaceC1189as {

    /* JADX INFO: renamed from: a */
    public final Context f1668a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1189as f1669b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1189as f1670c;

    /* JADX INFO: renamed from: d */
    public final Class f1671d;

    public C0510Lu(Context context, InterfaceC1189as interfaceC1189as, InterfaceC1189as interfaceC1189as2, Class cls) {
        this.f1668a = context.getApplicationContext();
        this.f1669b = interfaceC1189as;
        this.f1670c = interfaceC1189as2;
        this.f1671d = cls;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: a */
    public final boolean mo994a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC0628Oj.m1227H((Uri) obj);
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: b */
    public final C1108Zr mo995b(Object obj, int i, int i2, C2644vt c2644vt) {
        Uri uri = (Uri) obj;
        return new C1108Zr(new C1382et(uri), new C0467Ku(this.f1668a, this.f1669b, this.f1670c, uri, i, i2, c2644vt, this.f1671d));
    }
}
