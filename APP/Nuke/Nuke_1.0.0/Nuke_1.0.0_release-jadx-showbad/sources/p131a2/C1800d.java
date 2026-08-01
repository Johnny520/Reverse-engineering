package p131a2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import p078P1.C1146h;
import p078P1.C1147i;
import p078P1.InterfaceC1149k;
import p088R1.InterfaceC1194D;

/* JADX INFO: renamed from: a2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1800d implements InterfaceC1149k {

    /* JADX INFO: renamed from: b */
    public static final C1146h f6137b = new C1146h("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, C1146h.f3780e);

    /* JADX INFO: renamed from: a */
    public final Context f6138a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1800d(Context context) {
        this.f6138a = context.getApplicationContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1149k
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC1194D mo2202a(Object obj, int i5, int i6, C1147i c1147i) {
        return m3273c((Uri) obj, c1147i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1149k
    /* JADX INFO: renamed from: b */
    public final boolean mo2203b(Object obj, C1147i c1147i) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final InterfaceC1194D m3273c(Uri uri, C1147i c1147i) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f6138a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e5) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e5);
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
                throw new IllegalArgumentException("Failed to find resource id for: " + uri);
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e6) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e6);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) c1147i.m2201c(f6137b) : null;
        Drawable drawableM3270a = theme == null ? AbstractC1798b.m3270a(context, contextCreatePackageContext, identifier, null) : AbstractC1798b.m3270a(context, context, identifier, theme);
        if (drawableM3270a != null) {
            return new C1799c(drawableM3270a, 0);
        }
        return null;
    }
}
