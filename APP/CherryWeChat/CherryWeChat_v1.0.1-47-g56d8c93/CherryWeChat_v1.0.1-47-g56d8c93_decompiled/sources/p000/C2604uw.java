package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: renamed from: uw */
/* JADX INFO: loaded from: classes.dex */
public final class C2604uw implements InterfaceC2518sw {

    /* JADX INFO: renamed from: b */
    public static final C2601ut f8991b = new C2601ut("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, C2601ut.f8986e);

    /* JADX INFO: renamed from: a */
    public final Context f8992a;

    public C2604uw(Context context) {
        this.f8992a = context.getApplicationContext();
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC2389pw mo749a(Object obj, int i, int i2, C2644vt c2644vt) {
        return m5117c((Uri) obj, c2644vt);
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: b */
    public final boolean mo750b(Object obj, C2644vt c2644vt) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC2389pw m5117c(Uri uri, C2644vt c2644vt) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f8992a;
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
                throw new IllegalArgumentException("Failed to find resource id for: " + uri);
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e2);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) c2644vt.m5177c(f8991b) : null;
        Drawable drawableM277k = theme == null ? AbstractC0148Dc.m277k(context, contextCreatePackageContext, identifier, null) : AbstractC0148Dc.m277k(context, context, identifier, theme);
        if (drawableM277k != null) {
            return new C0069Bj(drawableM277k, 1);
        }
        return null;
    }
}
