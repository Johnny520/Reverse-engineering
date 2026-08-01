package p227;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.AbstractC3064;
import com.bumptech.glide.load.resource.bitmap.C3021;
import p221.C7975;
import p228.C8031;
import p228.C8035;
import p228.C8037;
import p228.InterfaceC8032;
import p231.C8055;
import p286.C8396;

/* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8011 implements InterfaceC8032 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Context f22133;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22134;

    public C8011(Context context, int i) {
        this.f22134 = i;
        switch (i) {
            case 1:
                this.f22133 = context.getApplicationContext();
                break;
            case 2:
                this.f22133 = context;
                break;
            default:
                this.f22133 = context.getApplicationContext();
                break;
        }
    }

    @Override // p228.InterfaceC8032
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo13473(Object obj) {
        switch (this.f22134) {
            case 0:
                Uri uri = (Uri) obj;
                return AbstractC3064.m6779(uri) && !uri.getPathSegments().contains("video");
            case 1:
                Uri uri2 = (Uri) obj;
                return AbstractC3064.m6779(uri2) && uri2.getPathSegments().contains("video");
            default:
                return AbstractC3064.m6779((Uri) obj);
        }
    }

    @Override // p228.InterfaceC8032
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8035 mo13474(Object obj, int i, int i2, C8396 c8396) {
        Long l;
        int i3 = this.f22134;
        Context context = this.f22133;
        switch (i3) {
            case 0:
                Uri uri = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                return new C8035(new C7975(uri), C8037.m13495(context, uri, new C8055(context.getContentResolver(), 0)));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) c8396.m13947(C3021.f9629)) == null || l.longValue() != -1) {
                    return null;
                }
                return new C8035(new C7975(uri2), C8037.m13495(context, uri2, new C8055(context.getContentResolver(), 1)));
            default:
                Uri uri3 = (Uri) obj;
                return new C8035(new C7975(uri3), new C8031(context, 0, uri3));
        }
    }
}
