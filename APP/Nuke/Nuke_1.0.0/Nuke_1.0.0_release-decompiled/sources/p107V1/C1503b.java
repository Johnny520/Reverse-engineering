package p107V1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.C1939i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import p078P1.C1147i;
import p078P1.InterfaceC1144f;
import p097T1.C1416e;
import p131a2.C1800d;
import p189k2.C2452b;
import p223q1.InterfaceC2909c;

/* JADX INFO: renamed from: V1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1503b implements InterfaceC1518q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5237a;

    /* JADX INFO: renamed from: b */
    public final Object f5238b;

    /* JADX INFO: renamed from: c */
    public final Object f5239c;

    public /* synthetic */ C1503b(int i5, Object obj, Object obj2) {
        this.f5237a = i5;
        this.f5239c = obj;
        this.f5238b = obj2;
    }

    @Override // p107V1.InterfaceC1518q
    /* JADX INFO: renamed from: a */
    public final boolean mo2773a(Object obj) {
        switch (this.f5237a) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case BuildConfig.VERSION_CODE /* 1 */:
                return true;
            case 2:
                Iterator it = ((ArrayList) this.f5239c).iterator();
                while (it.hasNext()) {
                    if (((InterfaceC1518q) it.next()).mo2773a(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                return "android.resource".equals(uri2.getScheme()) && ((Context) this.f5239c).getPackageName().equals(uri2.getAuthority());
        }
    }

    @Override // p107V1.InterfaceC1518q
    /* JADX INFO: renamed from: b */
    public final C1517p mo2774b(Object obj, int i5, int i6, C1147i c1147i) {
        C1939i c1939i;
        C1517p c1517pMo2774b;
        Uri uri;
        switch (this.f5237a) {
            case 0:
                Uri uri2 = (Uri) obj;
                String strSubstring = uri2.toString().substring(22);
                C2452b c2452b = new C2452b(uri2);
                AssetManager assetManager = (AssetManager) this.f5239c;
                switch (((C1502a) this.f5238b).f5235d) {
                    case 0:
                        c1939i = new C1939i(assetManager, strSubstring, 0);
                        break;
                    default:
                        c1939i = new C1939i(assetManager, strSubstring, 1);
                        break;
                }
                return new C1517p(c2452b, c1939i);
            case BuildConfig.VERSION_CODE /* 1 */:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) c1147i.m2201c(C1800d.f6137b);
                return new C1517p(new C2452b(num), new C1506e(theme, theme != null ? theme.getResources() : ((Context) this.f5239c).getResources(), (C1416e) this.f5238b, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) this.f5239c;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                InterfaceC1144f interfaceC1144f = null;
                for (int i7 = 0; i7 < size; i7++) {
                    InterfaceC1518q interfaceC1518q = (InterfaceC1518q) arrayList.get(i7);
                    if (interfaceC1518q.mo2773a(obj) && (c1517pMo2774b = interfaceC1518q.mo2774b(obj, i5, i6, c1147i)) != null) {
                        interfaceC1144f = c1517pMo2774b.f5269a;
                        arrayList2.add(c1517pMo2774b.f5271c);
                    }
                }
                if (arrayList2.isEmpty() || interfaceC1144f == null) {
                    return null;
                }
                return new C1517p(interfaceC1144f, new C1522u(arrayList2, (InterfaceC2909c) this.f5238b));
            case 3:
                Integer num2 = (Integer) obj;
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) this.f5238b).getResourcePackageName(num2.intValue()) + '/' + num2);
                    break;
                } catch (Resources.NotFoundException e5) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e5);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((InterfaceC1518q) this.f5239c).mo2774b(uri, i5, i6, c1147i);
            default:
                Uri uri3 = (Uri) obj;
                InterfaceC1518q interfaceC1518q2 = (InterfaceC1518q) this.f5238b;
                List<String> pathSegments = uri3.getPathSegments();
                C1517p c1517pMo2774b2 = null;
                if (pathSegments.size() == 1) {
                    try {
                        int i8 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i8 != 0) {
                            c1517pMo2774b2 = interfaceC1518q2.mo2774b(Integer.valueOf(i8), i5, i6, c1147i);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return c1517pMo2774b2;
                    } catch (NumberFormatException e6) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return c1517pMo2774b2;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e6);
                        return c1517pMo2774b2;
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
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                Context context = (Context) this.f5239c;
                int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                if (identifier != 0) {
                    return interfaceC1518q2.mo2774b(Integer.valueOf(identifier), i5, i6, c1147i);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    public String toString() {
        switch (this.f5237a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f5239c).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public C1503b(Resources resources, InterfaceC1518q interfaceC1518q) {
        this.f5237a = 3;
        this.f5238b = resources;
        this.f5239c = interfaceC1518q;
    }

    public C1503b(Context context, C1416e c1416e) {
        this.f5237a = 1;
        this.f5239c = context.getApplicationContext();
        this.f5238b = c1416e;
    }

    public C1503b(Context context, InterfaceC1518q interfaceC1518q) {
        this.f5237a = 4;
        this.f5239c = context.getApplicationContext();
        this.f5238b = interfaceC1518q;
    }
}
