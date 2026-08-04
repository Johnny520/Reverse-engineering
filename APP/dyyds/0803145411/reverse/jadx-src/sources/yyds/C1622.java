package yyds;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: renamed from: yyds.ᛷᛸᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1622 implements InterfaceC0894 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8257;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Context f8258;

    public C1622(Context context, int i) {
        this.f8257 = i;
        switch (i) {
            case 1:
                this.f8258 = context.getApplicationContext();
                break;
            case 2:
                this.f8258 = context.getApplicationContext();
                break;
            default:
                this.f8258 = context;
                break;
        }
    }

    @Override // yyds.InterfaceC0894
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final C1199 mo940(Object obj, int i, int i2, C0822 c0822) {
        Long l;
        int i3 = this.f8257;
        Context context = this.f8258;
        switch (i3) {
            case 0:
                Uri uri = (Uri) obj;
                return new C1199(new C1818(uri), new C0887(context, 0, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                return new C1199(new C1818(uri2), C1545.m3203(context, uri2, new C1889(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) c0822.m1891(C1687.f8593)) == null || l.longValue() != -1) {
                    return null;
                }
                return new C1199(new C1818(uri3), C1545.m3203(context, uri3, new C1889(context.getContentResolver(), 1)));
        }
    }

    @Override // yyds.InterfaceC0894
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final boolean mo941(Object obj) {
        switch (this.f8257) {
            case 0:
                return AbstractC0598.m1481((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return AbstractC0598.m1481(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return AbstractC0598.m1481(uri2) && uri2.getPathSegments().contains("video");
        }
    }
}
