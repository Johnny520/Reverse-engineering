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

    public C1380er(Context context, int i) {
        this.f4923a = i;
        switch (i) {
            case 1:
                this.f4924b = context.getApplicationContext();
                break;
            case 2:
                this.f4924b = context.getApplicationContext();
                break;
            default:
                this.f4924b = context;
                break;
        }
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: a */
    public final boolean mo994a(Object obj) {
        switch (this.f4923a) {
            case 0:
                return AbstractC0628Oj.m1227H((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return AbstractC0628Oj.m1227H(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return AbstractC0628Oj.m1227H(uri2) && uri2.getPathSegments().contains("video");
        }
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: b */
    public final C1108Zr mo995b(Object obj, int i, int i2, C2644vt c2644vt) {
        Long l;
        switch (this.f4923a) {
            case 0:
                Uri uri = (Uri) obj;
                return new C1108Zr(new C1382et(uri), new C1336dr(0, this.f4924b, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                C1382et c1382et = new C1382et(uri2);
                Context context = this.f4924b;
                return new C1108Zr(c1382et, C2799zc.m5368b(context, uri2, new C1314dB(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) c2644vt.m5177c(C0916VD.f2857d)) == null || l.longValue() != -1) {
                    return null;
                }
                C1382et c1382et2 = new C1382et(uri3);
                Context context2 = this.f4924b;
                return new C1108Zr(c1382et2, C2799zc.m5368b(context2, uri3, new C1314dB(context2.getContentResolver(), 1)));
        }
    }
}
