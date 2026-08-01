package p228;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import androidx.core.util.InterfaceC2186;
import com.bumptech.glide.load.data.C2972;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p167.C7711;
import p221.C7975;
import p235.C8087;
import p286.C8396;
import p286.InterfaceC8392;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8022 implements InterfaceC8032 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f22157;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f22158;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22159;

    public C8022(Context context, C7711 c7711) {
        this.f22159 = 1;
        this.f22158 = context.getApplicationContext();
        this.f22157 = c7711;
    }

    public String toString() {
        switch (this.f22159) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f22158).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    @Override // p228.InterfaceC8032
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo13473(Object obj) {
        int i = this.f22159;
        Object obj2 = this.f22158;
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
                    if (((InterfaceC8032) it.next()).mo13473(obj)) {
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

    @Override // p228.InterfaceC8032
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8035 mo13474(Object obj, int i, int i2, C8396 c8396) {
        C2972 c2972;
        C8035 c8035Mo13474;
        Uri uri;
        int i3 = this.f22159;
        C8035 c8035Mo134742 = null;
        Object obj2 = this.f22158;
        Object obj3 = this.f22157;
        switch (i3) {
            case 0:
                Uri uri2 = (Uri) obj;
                String strSubstring = uri2.toString().substring(22);
                C7975 c7975 = new C7975(uri2);
                AssetManager assetManager = (AssetManager) obj2;
                switch (((C8023) obj3).f22161) {
                    case 0:
                        c2972 = new C2972(assetManager, strSubstring, 0);
                        break;
                    default:
                        c2972 = new C2972(assetManager, strSubstring, 1);
                        break;
                }
                return new C8035(c7975, c2972);
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) c8396.m13947(C8087.f22315);
                return new C8035(new C7975(num), new C8019(theme, theme != null ? theme.getResources() : ((Context) obj2).getResources(), (C7711) obj3, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                InterfaceC8392 interfaceC8392 = null;
                for (int i4 = 0; i4 < size; i4++) {
                    InterfaceC8032 interfaceC8032 = (InterfaceC8032) arrayList.get(i4);
                    if (interfaceC8032.mo13473(obj) && (c8035Mo13474 = interfaceC8032.mo13474(obj, i, i2, c8396)) != null) {
                        interfaceC8392 = c8035Mo13474.f22191;
                        arrayList2.add(c8035Mo13474.f22189);
                    }
                }
                if (arrayList2.isEmpty() || interfaceC8392 == null) {
                    return null;
                }
                return new C8035(interfaceC8392, new C8028(arrayList2, (InterfaceC2186) obj3));
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
                return ((InterfaceC8032) obj2).mo13474(uri, i, i2, c8396);
            default:
                Uri uri3 = (Uri) obj;
                InterfaceC8032 interfaceC80322 = (InterfaceC8032) obj3;
                List<String> pathSegments = uri3.getPathSegments();
                if (pathSegments.size() == 1) {
                    try {
                        int i5 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i5 != 0) {
                            c8035Mo134742 = interfaceC80322.mo13474(Integer.valueOf(i5), i, i2, c8396);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return c8035Mo134742;
                    } catch (NumberFormatException e2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return c8035Mo134742;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e2);
                        return c8035Mo134742;
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
                    return interfaceC80322.mo13474(Integer.valueOf(identifier), i, i2, c8396);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    public C8022(Resources resources, InterfaceC8032 interfaceC8032) {
        this.f22159 = 3;
        this.f22157 = resources;
        this.f22158 = interfaceC8032;
    }

    public /* synthetic */ C8022(Object obj, int i, Object obj2) {
        this.f22159 = i;
        this.f22158 = obj;
        this.f22157 = obj2;
    }

    public C8022(Context context, InterfaceC8032 interfaceC8032) {
        this.f22159 = 4;
        this.f22158 = context.getApplicationContext();
        this.f22157 = interfaceC8032;
    }
}
