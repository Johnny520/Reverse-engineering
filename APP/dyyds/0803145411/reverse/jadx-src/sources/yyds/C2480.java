package yyds;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲇᛷᛵᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2480 implements InterfaceC0894 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f12268;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object f12269;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object f12270;

    public C2480(Context context, C1483 c1483) {
        this.f12268 = 1;
        this.f12269 = context.getApplicationContext();
        this.f12270 = c1483;
    }

    public String toString() {
        switch (this.f12268) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f12269).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    @Override // yyds.InterfaceC0894
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final C1199 mo940(Object obj, int i, int i2, C0822 c0822) {
        C1338 c1338;
        C1199 c1199Mo940;
        Uri uri;
        int i3 = this.f12268;
        C1199 c1199Mo9402 = null;
        Object obj2 = this.f12269;
        Object obj3 = this.f12270;
        switch (i3) {
            case 0:
                Uri uri2 = (Uri) obj;
                String strSubstring = uri2.toString().substring(22);
                C1818 c1818 = new C1818(uri2);
                AssetManager assetManager = (AssetManager) obj2;
                switch (((C2733) obj3).f13436) {
                    case 0:
                        c1338 = new C1338(assetManager, strSubstring, 0);
                        break;
                    default:
                        c1338 = new C1338(assetManager, strSubstring, 1);
                        break;
                }
                return new C1199(c1818, c1338);
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) c0822.m1891(C0064.f593);
                return new C1199(new C1818(num), new C2082(theme, theme != null ? theme.getResources() : ((Context) obj2).getResources(), (C1483) obj3, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                InterfaceC1410 interfaceC1410 = null;
                for (int i4 = 0; i4 < size; i4++) {
                    InterfaceC0894 interfaceC0894 = (InterfaceC0894) arrayList.get(i4);
                    if (interfaceC0894.mo941(obj) && (c1199Mo940 = interfaceC0894.mo940(obj, i, i2, c0822)) != null) {
                        interfaceC1410 = c1199Mo940.f5472;
                        arrayList2.add(c1199Mo940.f5473);
                    }
                }
                if (arrayList2.isEmpty() || interfaceC1410 == null) {
                    return null;
                }
                return new C1199(interfaceC1410, new C1255(arrayList2, (C0644) obj3));
            case 3:
                Integer num2 = (Integer) obj;
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) obj3).getResourcePackageName(num2.intValue()) + '/' + num2);
                    break;
                } catch (Resources.NotFoundException e) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((InterfaceC0894) obj2).mo940(uri, i, i2, c0822);
            default:
                Uri uri3 = (Uri) obj;
                InterfaceC0894 interfaceC08942 = (InterfaceC0894) obj3;
                List<String> pathSegments = uri3.getPathSegments();
                if (pathSegments.size() == 1) {
                    try {
                        int i5 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i5 != 0) {
                            c1199Mo9402 = interfaceC08942.mo940(Integer.valueOf(i5), i, i2, c0822);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return c1199Mo9402;
                    } catch (NumberFormatException e2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return c1199Mo9402;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e2);
                        return c1199Mo9402;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri3);
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                Context context = (Context) obj2;
                int identifier = context.getResources().getIdentifier(pathSegments2.get(1), pathSegments2.get(0), context.getPackageName());
                if (identifier != 0) {
                    return interfaceC08942.mo940(Integer.valueOf(identifier), i, i2, c0822);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    @Override // yyds.InterfaceC0894
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final boolean mo941(Object obj) {
        int i = this.f12268;
        Object obj2 = this.f12269;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj;
                if ("file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0))) {
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                Iterator it = ((ArrayList) obj2).iterator();
                while (it.hasNext()) {
                    if (((InterfaceC0894) it.next()).mo941(obj)) {
                        break;
                    }
                }
                break;
            case 3:
                break;
            default:
                Uri uri2 = (Uri) obj;
                if ("android.resource".equals(uri2.getScheme()) && ((Context) obj2).getPackageName().equals(uri2.getAuthority())) {
                    break;
                }
                break;
        }
        return true;
    }

    public C2480(Resources resources, InterfaceC0894 interfaceC0894) {
        this.f12268 = 3;
        this.f12270 = resources;
        this.f12269 = interfaceC0894;
    }

    public /* synthetic */ C2480(Object obj, int i, Object obj2) {
        this.f12268 = i;
        this.f12269 = obj;
        this.f12270 = obj2;
    }

    public C2480(Context context, InterfaceC0894 interfaceC0894) {
        this.f12268 = 4;
        this.f12269 = context.getApplicationContext();
        this.f12270 = interfaceC0894;
    }
}
