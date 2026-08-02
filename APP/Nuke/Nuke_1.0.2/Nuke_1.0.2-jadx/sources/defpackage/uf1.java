package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uf1 implements jh1 {
    public final /* synthetic */ int a;
    public final Context b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public uf1(Context context, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = context.getApplicationContext();
                break;
            case 2:
                this.b = context.getApplicationContext();
                break;
            default:
                this.b = context;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jh1
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return se.N((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return se.N(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return se.N(uri2) && uri2.getPathSegments().contains("video");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jh1
    public final ih1 b(Object obj, int i, int i2, ov1 ov1Var) {
        Long l;
        int i3 = this.a;
        int i4 = 0;
        Context context = this.b;
        switch (i3) {
            case 0:
                Uri uri = (Uri) obj;
                return new ih1(new is1(uri), new tf1(i4, context, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                return new ih1(new is1(uri2), ti0.d(context, uri2, new l23(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) ov1Var.c(pa3.d)) == null || l.longValue() != -1) {
                    return null;
                }
                return new ih1(new is1(uri3), ti0.d(context, uri3, new l23(context.getContentResolver(), 1)));
        }
    }
}
