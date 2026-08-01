package p107V1;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.AbstractC1925g;
import me.dartcv.nuke.BuildConfig;
import p078P1.C1147i;
import p083Q1.C1172a;
import p083Q1.C1173b;
import p121Y1.C1739G;
import p189k2.C2452b;

/* JADX INFO: renamed from: V1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1514m implements InterfaceC1518q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5265a;

    /* JADX INFO: renamed from: b */
    public final Context f5266b;

    public C1514m(Context context, int i5) {
        this.f5265a = i5;
        switch (i5) {
            case BuildConfig.VERSION_CODE /* 1 */:
                this.f5266b = context.getApplicationContext();
                break;
            case 2:
                this.f5266b = context.getApplicationContext();
                break;
            default:
                this.f5266b = context;
                break;
        }
    }

    @Override // p107V1.InterfaceC1518q
    /* JADX INFO: renamed from: a */
    public final boolean mo2773a(Object obj) {
        switch (this.f5265a) {
            case 0:
                return AbstractC1925g.m3546w((Uri) obj);
            case BuildConfig.VERSION_CODE /* 1 */:
                Uri uri = (Uri) obj;
                return AbstractC1925g.m3546w(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return AbstractC1925g.m3546w(uri2) && uri2.getPathSegments().contains("video");
        }
    }

    @Override // p107V1.InterfaceC1518q
    /* JADX INFO: renamed from: b */
    public final C1517p mo2774b(Object obj, int i5, int i6, C1147i c1147i) {
        Long l3;
        switch (this.f5265a) {
            case 0:
                Uri uri = (Uri) obj;
                return new C1517p(new C2452b(uri), new C1513l(0, this.f5266b, uri));
            case BuildConfig.VERSION_CODE /* 1 */:
                Uri uri2 = (Uri) obj;
                if (i5 == Integer.MIN_VALUE || i6 == Integer.MIN_VALUE || i5 > 512 || i6 > 384) {
                    return null;
                }
                C2452b c2452b = new C2452b(uri2);
                Context context = this.f5266b;
                return new C1517p(c2452b, C1173b.m2218e(context, uri2, new C1172a(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i5 == Integer.MIN_VALUE || i6 == Integer.MIN_VALUE || i5 > 512 || i6 > 384 || (l3 = (Long) c1147i.m2201c(C1739G.f6000d)) == null || l3.longValue() != -1) {
                    return null;
                }
                C2452b c2452b2 = new C2452b(uri3);
                Context context2 = this.f5266b;
                return new C1517p(c2452b2, C1173b.m2218e(context2, uri3, new C1172a(context2.getContentResolver(), 1)));
        }
    }
}
