package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i92 implements g92 {

    /* JADX INFO: renamed from: b */
    public static final mv1 f4500b = new mv1("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, mv1.f6895e);

    /* JADX INFO: renamed from: a */
    public final Context f4501a;

    public i92(Context context) {
        this.f4501a = context.getApplicationContext();
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ d92 mo866a(Object obj, int i, int i2, ov1 ov1Var) {
        return m2306c((Uri) obj, ov1Var);
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: b */
    public final boolean mo867b(Object obj, ov1 ov1Var) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    /* JADX INFO: renamed from: c */
    public final d92 m2306c(Uri uri, ov1 ov1Var) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f4501a;
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
                C0676s.m4648g("Failed to find resource id for: ", uri);
                return null;
            }
        } else {
            if (pathSegments.size() != 1) {
                C0676s.m4648g("Unrecognized Uri format: ", uri);
                return null;
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e2);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) ov1Var.m3643c(f4500b) : null;
        Drawable drawableM4790a = theme == null ? sc0.m4790a(context, contextCreatePackageContext, identifier, null) : sc0.m4790a(context, context, identifier, theme);
        if (drawableM4790a != null) {
            return new zo0(drawableM4790a, 1);
        }
        return null;
    }
}
