package p243;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.C3854;
import kotlin.reflect.jvm.internal.AbstractC5894;
import p237.C8805;
import p244.C8861;
import p244.C8865;
import p244.C8867;
import p244.InterfaceC8862;
import p247.C8885;
import p302.C9226;

/* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8841 implements InterfaceC8862 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Context f22475;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22476;

    public C8841(Context context, int i) {
        this.f22476 = i;
        switch (i) {
            case 1:
                this.f22475 = context.getApplicationContext();
                break;
            case 2:
                this.f22475 = context;
                break;
            default:
                this.f22475 = context.getApplicationContext();
                break;
        }
    }

    @Override // p244.InterfaceC8862
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo14060(Object obj) {
        switch (this.f22476) {
            case 0:
                Uri uri = (Uri) obj;
                return AbstractC5894.m10600(uri) && !uri.getPathSegments().contains("video");
            case 1:
                Uri uri2 = (Uri) obj;
                return AbstractC5894.m10600(uri2) && uri2.getPathSegments().contains("video");
            default:
                return AbstractC5894.m10600((Uri) obj);
        }
    }

    @Override // p244.InterfaceC8862
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8865 mo14061(Object obj, int i, int i2, C9226 c9226) {
        Long l;
        int i3 = this.f22476;
        Context context = this.f22475;
        switch (i3) {
            case 0:
                Uri uri = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                return new C8865(new C8805(uri), C8867.m14082(context, uri, new C8885(context.getContentResolver(), 0)));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) c9226.m14523(C3854.f9976)) == null || l.longValue() != -1) {
                    return null;
                }
                return new C8865(new C8805(uri2), C8867.m14082(context, uri2, new C8885(context.getContentResolver(), 1)));
            default:
                Uri uri3 = (Uri) obj;
                return new C8865(new C8805(uri3), new C8861(context, 0, uri3));
        }
    }
}
