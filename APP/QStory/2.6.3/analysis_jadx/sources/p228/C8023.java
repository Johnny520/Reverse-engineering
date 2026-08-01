package p228;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import androidx.core.util.InterfaceC2186;
import com.bumptech.glide.load.data.C2973;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p167.C7712;
import p221.C7976;
import p235.C8088;
import p286.C8397;
import p286.InterfaceC8393;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8023 implements InterfaceC8033 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f22154;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f22155;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22156;

    public C8023(Context context, C7712 c7712) {
        this.f22156 = 1;
        this.f22155 = context.getApplicationContext();
        this.f22154 = c7712;
    }

    public String toString() {
        switch (this.f22156) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f22155).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    @Override // p228.InterfaceC8033
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo13501(Object obj) {
        int i = this.f22156;
        Object obj2 = this.f22155;
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
                    if (((InterfaceC8033) it.next()).mo13501(obj)) {
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

    @Override // p228.InterfaceC8033
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8036 mo13502(Object obj, int i, int i2, C8397 c8397) {
        C2973 c2973;
        C8036 c8036Mo13502;
        Uri uri;
        int i3 = this.f22156;
        C8036 c8036Mo135022 = null;
        Object obj2 = this.f22155;
        Object obj3 = this.f22154;
        switch (i3) {
            case 0:
                Uri uri2 = (Uri) obj;
                String strSubstring = uri2.toString().substring(22);
                C7976 c7976 = new C7976(uri2);
                AssetManager assetManager = (AssetManager) obj2;
                switch (((C8024) obj3).f22158) {
                    case 0:
                        c2973 = new C2973(assetManager, strSubstring, 0);
                        break;
                    default:
                        c2973 = new C2973(assetManager, strSubstring, 1);
                        break;
                }
                return new C8036(c7976, c2973);
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) c8397.m13964(C8088.f22313);
                return new C8036(new C7976(num), new C8020(theme, theme != null ? theme.getResources() : ((Context) obj2).getResources(), (C7712) obj3, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                InterfaceC8393 interfaceC8393 = null;
                for (int i4 = 0; i4 < size; i4++) {
                    InterfaceC8033 interfaceC8033 = (InterfaceC8033) arrayList.get(i4);
                    if (interfaceC8033.mo13501(obj) && (c8036Mo13502 = interfaceC8033.mo13502(obj, i, i2, c8397)) != null) {
                        interfaceC8393 = c8036Mo13502.f22188;
                        arrayList2.add(c8036Mo13502.f22186);
                    }
                }
                if (arrayList2.isEmpty() || interfaceC8393 == null) {
                    return null;
                }
                return new C8036(interfaceC8393, new C8029(arrayList2, (InterfaceC2186) obj3));
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
                return ((InterfaceC8033) obj2).mo13502(uri, i, i2, c8397);
            default:
                Uri uri3 = (Uri) obj;
                InterfaceC8033 interfaceC80332 = (InterfaceC8033) obj3;
                List<String> pathSegments = uri3.getPathSegments();
                if (pathSegments.size() == 1) {
                    try {
                        int i5 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i5 != 0) {
                            c8036Mo135022 = interfaceC80332.mo13502(Integer.valueOf(i5), i, i2, c8397);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return c8036Mo135022;
                    } catch (NumberFormatException e2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return c8036Mo135022;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e2);
                        return c8036Mo135022;
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
                    return interfaceC80332.mo13502(Integer.valueOf(identifier), i, i2, c8397);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    public C8023(Resources resources, InterfaceC8033 interfaceC8033) {
        this.f22156 = 3;
        this.f22154 = resources;
        this.f22155 = interfaceC8033;
    }

    public /* synthetic */ C8023(Object obj, int i, Object obj2) {
        this.f22156 = i;
        this.f22155 = obj;
        this.f22154 = obj2;
    }

    public C8023(Context context, InterfaceC8033 interfaceC8033) {
        this.f22156 = 4;
        this.f22155 = context.getApplicationContext();
        this.f22154 = interfaceC8033;
    }
}
