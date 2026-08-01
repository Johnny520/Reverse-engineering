package p047I0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import java.util.LinkedHashMap;
import me.dartcv.nuke.R;
import p095T.AbstractC1391v;
import p121Y1.C1753n;
import p128a.AbstractC1785a;
import p160f3.AbstractC2100C;
import p160f3.C2140i0;
import p172h3.AbstractC2250j;
import p172h3.C2243c;
import p178i3.AbstractC2339t;
import p178i3.C2345z;
import p178i3.InterfaceC2316A;
import p190k3.AbstractC2466n;
import p190k3.C2455c;
import p201m3.C2608e;

/* JADX INFO: renamed from: I0.i1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0736i1 {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f2314a = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC2316A m1232a(Context context) {
        InterfaceC2316A interfaceC2316A;
        LinkedHashMap linkedHashMap = f2314a;
        synchronized (linkedHashMap) {
            try {
                Object objM4171g = linkedHashMap.get(context);
                if (objM4171g == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    C2243c c2243cM4101a = AbstractC2250j.m4101a(-1, 6, null);
                    C1753n c1753n = new C1753n(new C0730g1(contentResolver, uriFor, new C0733h1(c2243cM4101a, AbstractC1785a.m3245e(Looper.getMainLooper())), c2243cM4101a, context, null));
                    C2140i0 c2140i0 = new C2140i0(null);
                    C2608e c2608e = AbstractC2100C.f7029a;
                    objM4171g = AbstractC2339t.m4171g(c1753n, new C2455c(AbstractC1785a.m3254o(c2140i0, AbstractC2466n.f7954a)), new C2345z(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objM4171g);
                }
                interfaceC2316A = (InterfaceC2316A) objM4171g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC2316A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final AbstractC1391v m1233b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC1391v) {
            return (AbstractC1391v) tag;
        }
        return null;
    }
}
