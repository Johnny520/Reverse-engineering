package p193;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.C0107;
import androidx.core.util.C2184;
import androidx.core.util.InterfaceC2186;
import com.bumptech.glide.C3062;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.bumptech.glide.load.engine.InterfaceC2989;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979;
import com.bumptech.glide.load.resource.bitmap.C3026;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p075.C6961;
import p194.C7832;
import p194.C7833;
import p218.InterfaceC7972;
import p218.InterfaceC7973;
import p233.C8075;
import p233.InterfaceC8077;
import p234.C8082;
import p283.C8379;
import p286.C8397;
import p287.AbstractC8405;
import p342.C8818;
import p354.C8886;

/* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7828 implements InterfaceC2186, InterfaceC8077 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f21366;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f21367;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Object f21368;

    public C7828(int i) {
        switch (i) {
            case 1:
                this.f21367 = new C6961(9);
                break;
            case 7:
                this.f21368 = new C8886();
                this.f21367 = new Handler(Looper.getMainLooper());
                break;
            default:
                this.f21368 = new WeakHashMap();
                this.f21366 = new WeakHashMap();
                this.f21367 = new WeakHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C7828 m13189(C7828 c7828, C8379 c8379, C8379 c83792) {
        if (c7828 == null) {
            return null;
        }
        C8379 c83793 = (C8379) c7828.f21368;
        C7828 c7828M13189 = m13189((C7828) c7828.f21367, c8379, c83792);
        c7828.f21367 = c7828M13189;
        int i = c83793.f23169;
        C8379 c83794 = (C8379) c7828.f21366;
        int i2 = c83794.f23169;
        int i3 = c8379.f23169;
        int i4 = c83792 == null ? Integer.MAX_VALUE : c83792.f23169;
        if (i3 >= i2 || i4 <= i) {
            return c7828;
        }
        if (i3 <= i) {
            return i4 >= i2 ? c7828M13189 : new C7828(c7828, c83792, c83794);
        }
        if (i4 >= i2) {
            return new C7828(c7828, c83793, c8379);
        }
        c7828.f21367 = new C7828(c7828, c83792, c83794);
        return new C7828(c7828, c83793, c8379);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m13190(ImageView imageView, ProgressBar progressBar, String str) {
        progressBar.setVisibility(0);
        ((C3062) ((C3062) ComponentCallbacks2C3058.m6764(imageView).m6796(str).m6625(R.drawable.ic_sticker_default)).m6615(R.drawable.ic_sticker_default)).m6787(new C8818(progressBar)).m6789(imageView);
    }

    @Override // androidx.core.util.InterfaceC2186
    public Object acquire() {
        Object objAcquire = ((C2184) this.f21367).acquire();
        if (objAcquire == null) {
            objAcquire = ((InterfaceC7973) this.f21368).create();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objAcquire.getClass());
            }
        }
        if (objAcquire instanceof InterfaceC7972) {
            ((InterfaceC7972) objAcquire).mo6473().f22045 = false;
        }
        return objAcquire;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m13191(TextView textView, Button button) {
        int i;
        LinkedHashMap linkedHashMap = ((C8886) this.f21368).f25052;
        if (linkedHashMap.isEmpty()) {
            i = 0;
        } else {
            Iterator it = linkedHashMap.entrySet().iterator();
            i = 0;
            while (it.hasNext()) {
                if (((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                    i++;
                }
            }
        }
        textView.setText(AbstractC8405.m13972(3104) + i);
        button.setText(AbstractC8405.m13972(3120) + i + ')');
        button.setEnabled(i > 0);
        button.setAlpha(i > 0 ? 1.0f : 0.5f);
    }

    @Override // p233.InterfaceC8077
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC2989 mo340(InterfaceC2989 interfaceC2989, C8397 c8397) {
        Drawable drawable = (Drawable) interfaceC2989.get();
        if (drawable instanceof BitmapDrawable) {
            return ((C0107) this.f21366).mo340(C3026.m6536(((BitmapDrawable) drawable).getBitmap(), (InterfaceC2979) this.f21368), c8397);
        }
        if (drawable instanceof C8082) {
            return ((C8075) this.f21367).mo340(interfaceC2989, c8397);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C7832 m13192() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((C6961) this.f21367)) {
            try {
                C7832 c7832 = (C7832) this.f21366;
                if (c7832 != null && localeList == ((LocaleList) this.f21368)) {
                    return c7832;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new C7833(localeList.get(i)));
                }
                C7832 c78322 = new C7832(arrayList);
                this.f21368 = localeList;
                this.f21366 = c78322;
                return c78322;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.core.util.InterfaceC2186
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo3989(Object obj) {
        if (obj instanceof InterfaceC7972) {
            ((InterfaceC7972) obj).mo6473().f22045 = true;
        }
        switch (((C6961) this.f21366).f18642) {
            case 10:
                break;
            default:
                ((List) obj).clear();
                break;
        }
        return ((C2184) this.f21367).mo3989(obj);
    }

    public C7828(C7828 c7828, C8379 c8379, C8379 c83792) {
        c7828.getClass();
        this.f21368 = c8379;
        this.f21366 = c83792;
        this.f21367 = (C7828) c7828.f21367;
    }

    public C7828(C2184 c2184, InterfaceC7973 interfaceC7973, C6961 c6961) {
        this.f21367 = c2184;
        this.f21368 = interfaceC7973;
        this.f21366 = c6961;
    }
}
