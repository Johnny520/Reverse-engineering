package p000;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uf1 implements jh1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11267a;

    /* JADX INFO: renamed from: b */
    public final Context f11268b;

    public uf1(Context context, int i) {
        this.f11267a = i;
        switch (i) {
            case 1:
                this.f11268b = context.getApplicationContext();
                break;
            case 2:
                this.f11268b = context.getApplicationContext();
                break;
            default:
                this.f11268b = context;
                break;
        }
    }

    @Override // p000.jh1
    /* JADX INFO: renamed from: a */
    public final boolean mo235a(Object obj) {
        switch (this.f11267a) {
            case 0:
                return AbstractC0691se.m4825N((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return AbstractC0691se.m4825N(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return AbstractC0691se.m4825N(uri2) && uri2.getPathSegments().contains("video");
        }
    }

    @Override // p000.jh1
    /* JADX INFO: renamed from: b */
    public final ih1 mo236b(Object obj, int i, int i2, ov1 ov1Var) {
        Long l;
        int i3 = this.f11267a;
        int i4 = 0;
        Context context = this.f11268b;
        switch (i3) {
            case 0:
                Uri uri = (Uri) obj;
                return new ih1(new is1(uri), new tf1(i4, context, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                return new ih1(new is1(uri2), ti0.m5269d(context, uri2, new l23(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) ov1Var.m3643c(pa3.f8231d)) == null || l.longValue() != -1) {
                    return null;
                }
                return new ih1(new is1(uri3), ti0.m5269d(context, uri3, new l23(context.getContentResolver(), 1)));
        }
    }
}
