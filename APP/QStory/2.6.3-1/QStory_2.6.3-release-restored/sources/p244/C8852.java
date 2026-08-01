package p244;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import androidx.core.util.InterfaceC3019;
import com.bumptech.glide.load.data.C3805;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p183.C8541;
import p237.C8805;
import p251.C8917;
import p302.C9226;
import p302.InterfaceC9222;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8852 implements InterfaceC8862 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f22499;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f22500;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22501;

    public C8852(Context context, C8541 c8541) {
        this.f22501 = 1;
        this.f22500 = context.getApplicationContext();
        this.f22499 = c8541;
    }

    public String toString() {
        switch (this.f22501) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f22500).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    @Override // p244.InterfaceC8862
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo14060(Object obj) {
        int i = this.f22501;
        Object obj2 = this.f22500;
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
                    if (((InterfaceC8862) it.next()).mo14060(obj)) {
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

    @Override // p244.InterfaceC8862
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8865 mo14061(Object obj, int i, int i2, C9226 c9226) {
        C3805 c3805;
        C8865 c8865Mo14061;
        Uri uri;
        int i3 = this.f22501;
        C8865 c8865Mo140612 = null;
        Object obj2 = this.f22500;
        Object obj3 = this.f22499;
        switch (i3) {
            case 0:
                Uri uri2 = (Uri) obj;
                String strSubstring = uri2.toString().substring(22);
                C8805 c8805 = new C8805(uri2);
                AssetManager assetManager = (AssetManager) obj2;
                switch (((C8853) obj3).f22503) {
                    case 0:
                        c3805 = new C3805(assetManager, strSubstring, 0);
                        break;
                    default:
                        c3805 = new C3805(assetManager, strSubstring, 1);
                        break;
                }
                return new C8865(c8805, c3805);
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) c9226.m14523(C8917.f22658);
                return new C8865(new C8805(num), new C8849(theme, theme != null ? theme.getResources() : ((Context) obj2).getResources(), (C8541) obj3, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                InterfaceC9222 interfaceC9222 = null;
                for (int i4 = 0; i4 < size; i4++) {
                    InterfaceC8862 interfaceC8862 = (InterfaceC8862) arrayList.get(i4);
                    if (interfaceC8862.mo14060(obj) && (c8865Mo14061 = interfaceC8862.mo14061(obj, i, i2, c9226)) != null) {
                        interfaceC9222 = c8865Mo14061.f22533;
                        arrayList2.add(c8865Mo14061.f22531);
                    }
                }
                if (arrayList2.isEmpty() || interfaceC9222 == null) {
                    return null;
                }
                return new C8865(interfaceC9222, new C8858(arrayList2, (InterfaceC3019) obj3));
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
                return ((InterfaceC8862) obj2).mo14061(uri, i, i2, c9226);
            default:
                Uri uri3 = (Uri) obj;
                InterfaceC8862 interfaceC88622 = (InterfaceC8862) obj3;
                List<String> pathSegments = uri3.getPathSegments();
                if (pathSegments.size() == 1) {
                    try {
                        int i5 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i5 != 0) {
                            c8865Mo140612 = interfaceC88622.mo14061(Integer.valueOf(i5), i, i2, c9226);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return c8865Mo140612;
                    } catch (NumberFormatException e2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return c8865Mo140612;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e2);
                        return c8865Mo140612;
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
                    return interfaceC88622.mo14061(Integer.valueOf(identifier), i, i2, c9226);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    public C8852(Resources resources, InterfaceC8862 interfaceC8862) {
        this.f22501 = 3;
        this.f22499 = resources;
        this.f22500 = interfaceC8862;
    }

    public /* synthetic */ C8852(Object obj, int i, Object obj2) {
        this.f22501 = i;
        this.f22500 = obj;
        this.f22499 = obj2;
    }

    public C8852(Context context, InterfaceC8862 interfaceC8862) {
        this.f22501 = 4;
        this.f22500 = context.getApplicationContext();
        this.f22499 = interfaceC8862;
    }
}
