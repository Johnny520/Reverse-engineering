package p251;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.engine.InterfaceC3821;
import io.ktor.util.C5043;
import java.util.List;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import lin.xposed.hook.javaplugin.C6385;
import p250.C8910;
import p302.C9226;
import p302.C9227;
import p302.InterfaceC9229;

/* JADX INFO: renamed from: 飘花落叶言楪世苏子兰哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8917 implements InterfaceC9229 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C9227 f22658 = new C9227("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, C9227.f23618);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f22659;

    public C8917(Context context) {
        this.f22659 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC3821 m14125(Uri uri, C9226 c9226) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            C6385.m11442(uri, "Package name for ", " is null or empty");
            return null;
        }
        Context context = this.f22659;
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
                C5043.m9163(uri, "Failed to find resource id for: ");
                return null;
            }
        } else {
            if (pathSegments.size() != 1) {
                C5043.m9163(uri, "Unrecognized Uri format: ");
                return null;
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e2);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) c9226.m14523(f22658) : null;
        Drawable drawableM10443 = theme == null ? AbstractC5754.m10443(context, contextCreatePackageContext, identifier, null) : AbstractC5754.m10443(context, context, identifier, theme);
        if (drawableM10443 != null) {
            return new C8910(drawableM10443, 1);
        }
        return null;
    }

    @Override // p302.InterfaceC9229
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final /* bridge */ /* synthetic */ InterfaceC3821 mo7084(Object obj, int i, int i2, C9226 c9226) {
        return m14125((Uri) obj, c9226);
    }

    @Override // p302.InterfaceC9229
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo7085(Object obj, C9226 c9226) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
