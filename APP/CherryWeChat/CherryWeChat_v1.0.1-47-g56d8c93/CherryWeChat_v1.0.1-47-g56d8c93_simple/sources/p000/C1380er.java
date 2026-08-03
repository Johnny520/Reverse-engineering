package p000;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: renamed from: er */
/* JADX INFO: loaded from: classes.dex */
public final class C1380er implements InterfaceC1189as {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4923a;

    /* JADX INFO: renamed from: b */
    public final Context f4924b;

    public C1380er(Context r1, int r2) {
        this.f4923a = r2;
        switch(r2) {
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        this.f4924b = r1;
        return;
    L6:
        this.f4924b = r1.getApplicationContext();
        return;
    L8:
        this.f4924b = r1.getApplicationContext();
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: a */
    public final boolean mo994a(Object r2) {
        switch(this.f4923a) {
            case 0: goto L19;
            case 1: goto L11;
            default: goto L4;
        };
    L4:
        Uri r22 = (Uri) r2;
        if (AbstractC0628Oj.m1227H(r22) == true) goto L7;
    L9:
        return false;
    L7:
        if (r22.getPathSegments().contains("video") == false) goto L9;
        return true;
    L11:
        Uri r23 = (Uri) r2;
        if (AbstractC0628Oj.m1227H(r23) == true) goto L14;
    L16:
        return false;
    L14:
        if (r23.getPathSegments().contains("video") == true) goto L16;
        return true;
    L19:
        return AbstractC0628Oj.m1227H((Uri) r2);
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: b */
    public final C1108Zr mo995b(Object r4, int r5, int r6, C2644vt r7) {
        switch(this.f4923a) {
            case 0: goto L28;
            case 1: goto L18;
            default: goto L4;
        };
    L4:
        Uri r42 = (Uri) r4;
        if (r5 == Integer.MIN_VALUE) goto L16;
        if (r6 == Integer.MIN_VALUE) goto L16;
        if (r5 > 512) goto L16;
        if (r6 > 384) goto L16;
        Long r52 = (Long) r7.m5177c(C0916VD.f2857d);
        if (r52 == null) goto L16;
        if (r52.longValue() != (-1)) goto L16;
        C1382et r62 = new C1382et(r42);
        Context r0 = this.f4924b;
        return new C1108Zr(r62, C2799zc.m5368b(r0, r42, new C1314dB(r0.getContentResolver(), 1)));
    L16:
        return null;
    L18:
        Uri r43 = (Uri) r4;
        if (r5 == Integer.MIN_VALUE) goto L26;
        if (r6 == Integer.MIN_VALUE) goto L26;
        if (r5 > 512) goto L26;
        if (r6 > 384) goto L26;
        C1382et r63 = new C1382et(r43);
        Context r02 = this.f4924b;
        return new C1108Zr(r63, C2799zc.m5368b(r02, r43, new C1314dB(r02.getContentResolver(), 0)));
    L26:
        return null;
    L28:
        Uri r44 = (Uri) r4;
        return new C1108Zr(new C1382et(r44), new C1336dr(0, this.f4924b, r44));
    }
}
