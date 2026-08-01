package p235;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.engine.InterfaceC2989;
import io.ktor.util.C4211;
import java.util.List;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import lin.xposed.hook.javaplugin.C5554;
import p234.C8081;
import p286.C8397;
import p286.C8398;
import p286.InterfaceC8400;

/* JADX INFO: renamed from: 飘花落叶言楪世苏子兰哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8088 implements InterfaceC8400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8398 f22313 = new C8398("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, C8398.f23273);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f22314;

    public C8088(Context context) {
        this.f22314 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC2989 m13566(Uri uri, C8397 c8397) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            C5554.m10883(uri, "Package name for ", " is null or empty");
            return null;
        }
        Context context = this.f22314;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                C4211.m8604(uri, "Failed to find resource id for: ");
                return null;
            }
        } else {
            if (pathSegments.size() != 1) {
                C4211.m8604(uri, "Unrecognized Uri format: ");
                return null;
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e2);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) c8397.m13964(f22313) : null;
        Drawable drawableM9884 = theme == null ? AbstractC4922.m9884(context, contextCreatePackageContext, identifier, null) : AbstractC4922.m9884(context, context, identifier, theme);
        if (drawableM9884 != null) {
            return new C8081(drawableM9884, 1);
        }
        return null;
    }

    @Override // p286.InterfaceC8400
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final /* bridge */ /* synthetic */ InterfaceC2989 mo6524(Object obj, int i, int i2, C8397 c8397) {
        return m13566((Uri) obj, c8397);
    }

    @Override // p286.InterfaceC8400
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo6525(Object obj, C8397 c8397) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
