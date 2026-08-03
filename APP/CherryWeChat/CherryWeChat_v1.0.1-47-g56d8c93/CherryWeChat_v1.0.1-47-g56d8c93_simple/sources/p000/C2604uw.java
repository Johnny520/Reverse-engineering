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
    public static final C2601ut f8991b = null;

    /* JADX INFO: renamed from: a */
    public final Context f8992a;

    static {
        f8991b = new C2601ut("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, C2601ut.f8986e);
    }

    public C2604uw(Context r1) {
        this.f8992a = r1.getApplicationContext();
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC2389pw mo749a(Object r1, int r2, int r3, C2644vt r4) {
        return m5117c((Uri) r1, r4);
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: b */
    public final boolean mo750b(Object r1, C2644vt r2) {
        String r12 = ((Uri) r1).getScheme();
        if (r12 != null) goto L5;
        return false;
    L5:
        if (r12.equals("android.resource") == false) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC2389pw m5117c(Uri r9, C2644vt r10) {
        String r0 = r9.getAuthority();
        if (TextUtils.isEmpty(r0) == true) goto L44;
        Context r1 = this.f8992a;
        if (r0.equals(r1.getPackageName()) == false) goto L47;
    L6:
        Context r2 = r1;
    L13:
        List<String> r4 = r9.getPathSegments();
        if (r4.size() != 2) goto L23;
        List<String> r42 = r9.getPathSegments();
        String r5 = r9.getAuthority();
        String r3 = r42.get(0);
        String r43 = r42.get(1);
        int r52 = r2.getResources().getIdentifier(r43, r3, r5);
        if (r52 != 0) goto L18;
        r52 = Resources.getSystem().getIdentifier(r43, r3, "android");
    L18:
        if (r52 != 0) goto L27;
        throw new IllegalArgumentException("Failed to find resource id for: " + r9);
    L27:
        if (r0.equals(r1.getPackageName()) == false) goto L29;
        Resources.Theme r92 = (Resources.Theme) r10.m5177c(f8991b);
    L30:
        if (r92 != null) goto L32;
        Drawable r93 = AbstractC0148Dc.m277k(r1, r2, r52, null);
    L33:
        if (r93 != null) goto L35;
        return null;
    L35:
        return new C0069Bj(r93, 1);
    L32:
        r93 = AbstractC0148Dc.m277k(r1, r1, r52, r92);
        goto L33
    L29:
        r92 = null;
        goto L30
    L23:
        if (r4.size() != 1) goto L40;
        r52 = Integer.parseInt(r9.getPathSegments().get(0));     // Catch: NumberFormatException -> L36
    L36:
        e = move-exception;
        throw new IllegalArgumentException("Unrecognized Uri format: " + r9, e);
    L40:
        throw new IllegalArgumentException("Unrecognized Uri format: " + r9);
    L47:
        r2 = r1.createPackageContext(r0, 0);     // Catch: PackageManager.NameNotFoundException -> L9
    L9:
        e = move-exception;
        if (r0.contains(r1.getPackageName()) == true) goto L6;
        throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + r9, e);
    L44:
        throw new IllegalStateException("Package name for " + r9 + " is null or empty");
    }
}
