package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: V4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0907V4 implements InterfaceC1189as {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2826a;

    /* JADX INFO: renamed from: b */
    public final Object f2827b;

    /* JADX INFO: renamed from: c */
    public final Object f2828c;

    public /* synthetic */ C0907V4(int i, Object obj, Object obj2) {
        this.f2826a = i;
        this.f2828c = obj;
        this.f2827b = obj2;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: a */
    public final boolean mo994a(Object obj) {
        switch (this.f2826a) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                return true;
            case 2:
                Iterator it = ((ArrayList) this.f2828c).iterator();
                while (it.hasNext()) {
                    if (((InterfaceC1189as) it.next()).mo994a(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                return "android.resource".equals(uri2.getScheme()) && ((Context) this.f2828c).getPackageName().equals(uri2.getAuthority());
        }
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: b */
    public final C1108Zr mo995b(Object obj, int i, int i2, C2644vt c2644vt) {
        C2237mh c2237mh;
        C1108Zr c1108ZrMo995b;
        Uri uri;
        switch (this.f2826a) {
            case 0:
                Uri uri2 = (Uri) obj;
                String strSubstring = uri2.toString().substring(22);
                C1382et c1382et = new C1382et(uri2);
                AssetManager assetManager = (AssetManager) this.f2828c;
                switch (((C0864U4) this.f2827b).f2732a) {
                    case 0:
                        c2237mh = new C2237mh(assetManager, strSubstring, 0);
                        break;
                    default:
                        c2237mh = new C2237mh(assetManager, strSubstring, 1);
                        break;
                }
                return new C1108Zr(c1382et, c2237mh);
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) c2644vt.m5177c(C2604uw.f8991b);
                return new C1108Zr(new C1382et(num), new C0836Td(theme, theme != null ? theme.getResources() : ((Context) this.f2828c).getResources(), (C0793Sd) this.f2827b, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) this.f2828c;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                InterfaceC0802Sm interfaceC0802Sm = null;
                for (int i3 = 0; i3 < size; i3++) {
                    InterfaceC1189as interfaceC1189as = (InterfaceC1189as) arrayList.get(i3);
                    if (interfaceC1189as.mo994a(obj) && (c1108ZrMo995b = interfaceC1189as.mo995b(obj, i, i2, c2644vt)) != null) {
                        interfaceC0802Sm = c1108ZrMo995b.f3501a;
                        arrayList2.add(c1108ZrMo995b.f3503c);
                    }
                }
                if (arrayList2.isEmpty() || interfaceC0802Sm == null) {
                    return null;
                }
                return new C1108Zr(interfaceC0802Sm, new C2334os(arrayList2, (InterfaceC1024Xt) this.f2827b));
            case 3:
                Integer num2 = (Integer) obj;
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) this.f2827b).getResourcePackageName(num2.intValue()) + '/' + num2);
                    break;
                } catch (Resources.NotFoundException unused) {
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((InterfaceC1189as) this.f2828c).mo995b(uri, i, i2, c2644vt);
            default:
                Uri uri3 = (Uri) obj;
                InterfaceC1189as interfaceC1189as2 = (InterfaceC1189as) this.f2827b;
                List<String> pathSegments = uri3.getPathSegments();
                C1108Zr c1108ZrMo995b2 = null;
                if (pathSegments.size() == 1) {
                    try {
                        int i4 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i4 != 0) {
                            c1108ZrMo995b2 = interfaceC1189as2.mo995b(Integer.valueOf(i4), i, i2, c2644vt);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            uri3.toString();
                        }
                        return c1108ZrMo995b2;
                    } catch (NumberFormatException unused2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return c1108ZrMo995b2;
                        }
                        Objects.toString(uri3);
                        return c1108ZrMo995b2;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    uri3.toString();
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                Context context = (Context) this.f2828c;
                int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                if (identifier != 0) {
                    return interfaceC1189as2.mo995b(Integer.valueOf(identifier), i, i2, c2644vt);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                uri3.toString();
                return null;
        }
    }

    public String toString() {
        switch (this.f2826a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f2828c).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public C0907V4(Resources resources, InterfaceC1189as interfaceC1189as) {
        this.f2826a = 3;
        this.f2827b = resources;
        this.f2828c = interfaceC1189as;
    }

    public C0907V4(Context context, C0793Sd c0793Sd) {
        this.f2826a = 1;
        this.f2828c = context.getApplicationContext();
        this.f2827b = c0793Sd;
    }

    public C0907V4(Context context, InterfaceC1189as interfaceC1189as) {
        this.f2826a = 4;
        this.f2828c = context.getApplicationContext();
        this.f2827b = interfaceC1189as;
    }
}
