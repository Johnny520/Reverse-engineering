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

    public C0510Lu(Context r1, InterfaceC1189as r2, InterfaceC1189as r3, Class r4) {
        this.f1668a = r1.getApplicationContext();
        this.f1669b = r2;
        this.f1670c = r3;
        this.f1671d = r4;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: a */
    public final boolean mo994a(Object r3) {
        Uri r32 = (Uri) r3;
        if (Build.VERSION.SDK_INT >= 29) goto L5;
        return false;
    L5:
        if (AbstractC0628Oj.m1227H(r32) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: b */
    public final C1108Zr mo995b(Object r11, int r12, int r13, C2644vt r14) {
        Uri r4 = (Uri) r11;
        C1382et r9 = new C1382et(r4);
        InterfaceC1189as r3 = this.f1670c;
        Class r8 = this.f1671d;
        return new C1108Zr(r9, new C0467Ku(this.f1668a, this.f1669b, r3, r4, r12, r13, r14, r8));
    }
}
