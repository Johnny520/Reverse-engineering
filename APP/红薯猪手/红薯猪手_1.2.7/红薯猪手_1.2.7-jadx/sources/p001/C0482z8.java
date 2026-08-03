package p001;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.util.List;
import p001.AbstractC0469y8;

/* JADX INFO: renamed from: ۟.z8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0482z8 extends AbstractC0469y8 {

    /* JADX INFO: renamed from: ۥ */
    public final Context f1239;

    public C0482z8(Context context) {
        this.f1239 = context;
    }

    @Override // p001.AbstractC0469y8
    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean mo831(C0443w8 c0443w8) {
        if (c0443w8.f1843 != 0) {
            return true;
        }
        return "android.resource".equals(c0443w8.f1842.getScheme());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.AbstractC0469y8
    /* JADX INFO: renamed from: ۥ۟ۡ */
    public final AbstractC0469y8.a mo1030(C0443w8 c0443w8) throws FileNotFoundException {
        Resources resources;
        Uri uri;
        Uri uri2;
        Context context = this.f1239;
        StringBuilder sb = C0259ic.f866;
        if (c0443w8.f1843 != 0 || (uri2 = c0443w8.f1842) == null) {
            resources = context.getResources();
        } else {
            String authority = uri2.getAuthority();
            if (authority == null) {
                StringBuilder sbM1039 = C0167c4.m1039("No package provided: ");
                sbM1039.append(c0443w8.f1842);
                throw new FileNotFoundException(sbM1039.toString());
            }
            try {
                resources = context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException unused) {
                StringBuilder sbM10392 = C0167c4.m1039("Unable to obtain resources for package: ");
                sbM10392.append(c0443w8.f1842);
                throw new FileNotFoundException(sbM10392.toString());
            }
        }
        int identifier = c0443w8.f1843;
        if (identifier == 0 && (uri = c0443w8.f1842) != null) {
            String authority2 = uri.getAuthority();
            if (authority2 == null) {
                StringBuilder sbM10393 = C0167c4.m1039("No package provided: ");
                sbM10393.append(c0443w8.f1842);
                throw new FileNotFoundException(sbM10393.toString());
            }
            List<String> pathSegments = c0443w8.f1842.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                StringBuilder sbM10394 = C0167c4.m1039("No path segments: ");
                sbM10394.append(c0443w8.f1842);
                throw new FileNotFoundException(sbM10394.toString());
            }
            if (pathSegments.size() == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused2) {
                    StringBuilder sbM10395 = C0167c4.m1039("Last path segment is not a resource ID: ");
                    sbM10395.append(c0443w8.f1842);
                    throw new FileNotFoundException(sbM10395.toString());
                }
            } else {
                if (pathSegments.size() != 2) {
                    StringBuilder sbM10396 = C0167c4.m1039("More than two path segments: ");
                    sbM10396.append(c0443w8.f1842);
                    throw new FileNotFoundException(sbM10396.toString());
                }
                identifier = resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
            }
        }
        BitmapFactory.Options optionsM1276 = AbstractC0469y8.m1276(c0443w8);
        if (optionsM1276 != null && optionsM1276.inJustDecodeBounds) {
            BitmapFactory.decodeResource(resources, identifier, optionsM1276);
            AbstractC0469y8.m968(c0443w8.f1845, c0443w8.f1846, optionsM1276.outWidth, optionsM1276.outHeight, optionsM1276, c0443w8);
        }
        return new AbstractC0469y8.a(BitmapFactory.decodeResource(resources, identifier, optionsM1276));
    }
}
