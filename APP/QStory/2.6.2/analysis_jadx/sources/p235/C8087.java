package p235;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.engine.InterfaceC2988;
import io.ktor.client.plugins.AbstractC3932;
import io.ktor.util.C4210;
import java.util.List;
import lin.xposed.hook.javaplugin.C5553;
import p234.C8080;
import p286.C8396;
import p286.C8397;
import p286.InterfaceC8399;

/* JADX INFO: renamed from: 飘花落叶言楪世苏子兰哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8087 implements InterfaceC8399 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8397 f22315 = new C8397("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, C8397.f23274);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f22316;

    public C8087(Context context) {
        this.f22316 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC2988 m13537(Uri uri, C8396 c8396) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            C5553.m10826(uri, "Package name for ", " is null or empty");
            return null;
        }
        Context context = this.f22316;
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
                C4210.m8614(uri, "Failed to find resource id for: ");
                return null;
            }
        } else {
            if (pathSegments.size() != 1) {
                C4210.m8614(uri, "Unrecognized Uri format: ");
                return null;
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e2);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) c8396.m13947(f22315) : null;
        Drawable drawableM8320 = theme == null ? AbstractC3932.m8320(context, contextCreatePackageContext, identifier, null) : AbstractC3932.m8320(context, context, identifier, theme);
        if (drawableM8320 != null) {
            return new C8080(drawableM8320, 1);
        }
        return null;
    }

    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final /* bridge */ /* synthetic */ InterfaceC2988 mo6464(Object obj, int i, int i2, C8396 c8396) {
        return m13537((Uri) obj, c8396);
    }

    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo6465(Object obj, C8396 c8396) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
