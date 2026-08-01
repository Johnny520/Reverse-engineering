package p227;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.C3022;
import kotlin.reflect.jvm.internal.AbstractC5062;
import p221.C7976;
import p228.C8032;
import p228.C8036;
import p228.C8038;
import p228.InterfaceC8033;
import p231.C8056;
import p286.C8397;

/* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8012 implements InterfaceC8033 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Context f22130;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22131;

    public C8012(Context context, int i) {
        this.f22131 = i;
        switch (i) {
            case 1:
                this.f22130 = context.getApplicationContext();
                break;
            case 2:
                this.f22130 = context;
                break;
            default:
                this.f22130 = context.getApplicationContext();
                break;
        }
    }

    @Override // p228.InterfaceC8033
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo13501(Object obj) {
        switch (this.f22131) {
            case 0:
                Uri uri = (Uri) obj;
                return AbstractC5062.m10041(uri) && !uri.getPathSegments().contains("video");
            case 1:
                Uri uri2 = (Uri) obj;
                return AbstractC5062.m10041(uri2) && uri2.getPathSegments().contains("video");
            default:
                return AbstractC5062.m10041((Uri) obj);
        }
    }

    @Override // p228.InterfaceC8033
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8036 mo13502(Object obj, int i, int i2, C8397 c8397) {
        Long l;
        int i3 = this.f22131;
        Context context = this.f22130;
        switch (i3) {
            case 0:
                Uri uri = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                return new C8036(new C7976(uri), C8038.m13523(context, uri, new C8056(context.getContentResolver(), 0)));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) c8397.m13964(C3022.f9631)) == null || l.longValue() != -1) {
                    return null;
                }
                return new C8036(new C7976(uri2), C8038.m13523(context, uri2, new C8056(context.getContentResolver(), 1)));
            default:
                Uri uri3 = (Uri) obj;
                return new C8036(new C7976(uri3), new C8032(context, 0, uri3));
        }
    }
}
