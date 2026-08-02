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

/* JADX INFO: renamed from: tg */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0733tg implements jh1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10727a;

    /* JADX INFO: renamed from: b */
    public final Object f10728b;

    /* JADX INFO: renamed from: c */
    public final Object f10729c;

    public C0733tg(Context context, r80 r80Var) {
        this.f10727a = 1;
        this.f10728b = context.getApplicationContext();
        this.f10729c = r80Var;
    }

    @Override // p000.jh1
    /* JADX INFO: renamed from: a */
    public final boolean mo235a(Object obj) {
        int i = this.f10727a;
        Object obj2 = this.f10728b;
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
                    if (((jh1) it.next()).mo235a(obj)) {
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

    @Override // p000.jh1
    /* JADX INFO: renamed from: b */
    public final ih1 mo236b(Object obj, int i, int i2, ov1 ov1Var) {
        ri0 ri0Var;
        ih1 ih1VarMo236b;
        Uri uri;
        int i3 = this.f10727a;
        ih1 ih1VarMo236b2 = null;
        Object obj2 = this.f10728b;
        Object obj3 = this.f10729c;
        switch (i3) {
            case 0:
                Uri uri2 = (Uri) obj;
                String strSubstring = uri2.toString().substring(22);
                is1 is1Var = new is1(uri2);
                AssetManager assetManager = (AssetManager) obj2;
                switch (((C0693sg) obj3).f10108h) {
                    case 0:
                        ri0Var = new ri0(assetManager, strSubstring, 0);
                        break;
                    default:
                        ri0Var = new ri0(assetManager, strSubstring, 1);
                        break;
                }
                return new ih1(is1Var, ri0Var);
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) ov1Var.m3643c(i92.f4500b);
                return new ih1(new is1(num), new s80(theme, theme != null ? theme.getResources() : ((Context) obj2).getResources(), (r80) obj3, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                a51 a51Var = null;
                for (int i4 = 0; i4 < size; i4++) {
                    jh1 jh1Var = (jh1) arrayList.get(i4);
                    if (jh1Var.mo235a(obj) && (ih1VarMo236b = jh1Var.mo236b(obj, i, i2, ov1Var)) != null) {
                        a51Var = ih1VarMo236b.f4616a;
                        arrayList2.add(ih1VarMo236b.f4618c);
                    }
                }
                if (arrayList2.isEmpty() || a51Var == null) {
                    return null;
                }
                return new ih1(a51Var, new ij1(arrayList2, (a22) obj3));
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
                return ((jh1) obj2).mo236b(uri, i, i2, ov1Var);
            default:
                Uri uri3 = (Uri) obj;
                jh1 jh1Var2 = (jh1) obj3;
                List<String> pathSegments = uri3.getPathSegments();
                if (pathSegments.size() == 1) {
                    try {
                        int i5 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i5 != 0) {
                            ih1VarMo236b2 = jh1Var2.mo236b(Integer.valueOf(i5), i, i2, ov1Var);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return ih1VarMo236b2;
                    } catch (NumberFormatException e2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return ih1VarMo236b2;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e2);
                        return ih1VarMo236b2;
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
                    return jh1Var2.mo236b(Integer.valueOf(identifier), i, i2, ov1Var);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    public String toString() {
        switch (this.f10727a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f10728b).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public C0733tg(Resources resources, jh1 jh1Var) {
        this.f10727a = 3;
        this.f10729c = resources;
        this.f10728b = jh1Var;
    }

    public /* synthetic */ C0733tg(int i, Object obj, Object obj2) {
        this.f10727a = i;
        this.f10728b = obj;
        this.f10729c = obj2;
    }

    public C0733tg(Context context, jh1 jh1Var) {
        this.f10727a = 4;
        this.f10728b = context.getApplicationContext();
        this.f10729c = jh1Var;
    }
}
