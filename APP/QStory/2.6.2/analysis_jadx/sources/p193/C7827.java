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
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3061;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.bumptech.glide.load.engine.InterfaceC2988;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978;
import com.bumptech.glide.load.resource.bitmap.C3025;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p075.C6960;
import p194.C7831;
import p194.C7832;
import p218.InterfaceC7971;
import p218.InterfaceC7972;
import p233.C8074;
import p233.InterfaceC8076;
import p234.C8081;
import p283.C8378;
import p286.C8396;
import p343.C8832;
import p356.C8907;

/* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7827 implements InterfaceC2186, InterfaceC8076 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f21369;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f21370;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Object f21371;

    public C7827(int i) {
        switch (i) {
            case 1:
                this.f21370 = new C6960(9);
                break;
            case 7:
                this.f21371 = new C8907();
                this.f21370 = new Handler(Looper.getMainLooper());
                break;
            default:
                this.f21371 = new WeakHashMap();
                this.f21369 = new WeakHashMap();
                this.f21370 = new WeakHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C7827 m13161(C7827 c7827, C8378 c8378, C8378 c83782) {
        if (c7827 == null) {
            return null;
        }
        C8378 c83783 = (C8378) c7827.f21371;
        C7827 c7827M13161 = m13161((C7827) c7827.f21370, c8378, c83782);
        c7827.f21370 = c7827M13161;
        int i = c83783.f23170;
        C8378 c83784 = (C8378) c7827.f21369;
        int i2 = c83784.f23170;
        int i3 = c8378.f23170;
        int i4 = c83782 == null ? Integer.MAX_VALUE : c83782.f23170;
        if (i3 >= i2 || i4 <= i) {
            return c7827;
        }
        if (i3 <= i) {
            return i4 >= i2 ? c7827M13161 : new C7827(c7827, c83782, c83784);
        }
        if (i4 >= i2) {
            return new C7827(c7827, c83783, c8378);
        }
        c7827.f21370 = new C7827(c7827, c83782, c83784);
        return new C7827(c7827, c83783, c8378);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m13162(ImageView imageView, ProgressBar progressBar, String str) {
        progressBar.setVisibility(0);
        ((C3061) ((C3061) ComponentCallbacks2C3057.m6719(imageView).m6751(str).m6565(R.drawable.ic_sticker_default)).m6555(R.drawable.ic_sticker_default)).m6742(new C8832(progressBar)).m6744(imageView);
    }

    @Override // androidx.core.util.InterfaceC2186
    public Object acquire() {
        Object objAcquire = ((C2184) this.f21370).acquire();
        if (objAcquire == null) {
            objAcquire = ((InterfaceC7972) this.f21371).create();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objAcquire.getClass());
            }
        }
        if (objAcquire instanceof InterfaceC7971) {
            ((InterfaceC7971) objAcquire).mo6415().f22048 = false;
        }
        return objAcquire;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m13163(TextView textView, Button button) {
        int i;
        LinkedHashMap linkedHashMap = ((C8907) this.f21371).f25091;
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
        textView.setText(AbstractC3056.m6668(-3937328173960922535L) + i);
        button.setText(AbstractC3056.m6668(-3937327534010795431L) + i + ')');
        button.setEnabled(i > 0);
        button.setAlpha(i > 0 ? 1.0f : 0.5f);
    }

    @Override // p233.InterfaceC8076
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC2988 mo339(InterfaceC2988 interfaceC2988, C8396 c8396) {
        Drawable drawable = (Drawable) interfaceC2988.get();
        if (drawable instanceof BitmapDrawable) {
            return ((C0107) this.f21369).mo339(C3025.m6476(((BitmapDrawable) drawable).getBitmap(), (InterfaceC2978) this.f21371), c8396);
        }
        if (drawable instanceof C8081) {
            return ((C8074) this.f21370).mo339(interfaceC2988, c8396);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C7831 m13164() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((C6960) this.f21370)) {
            try {
                C7831 c7831 = (C7831) this.f21369;
                if (c7831 != null && localeList == ((LocaleList) this.f21371)) {
                    return c7831;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new C7832(localeList.get(i)));
                }
                C7831 c78312 = new C7831(arrayList);
                this.f21371 = localeList;
                this.f21369 = c78312;
                return c78312;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.core.util.InterfaceC2186
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo3979(Object obj) {
        if (obj instanceof InterfaceC7971) {
            ((InterfaceC7971) obj).mo6415().f22048 = true;
        }
        switch (((C6960) this.f21369).f18647) {
            case 10:
                break;
            default:
                ((List) obj).clear();
                break;
        }
        return ((C2184) this.f21370).mo3979(obj);
    }

    public C7827(C7827 c7827, C8378 c8378, C8378 c83782) {
        c7827.getClass();
        this.f21371 = c8378;
        this.f21369 = c83782;
        this.f21370 = (C7827) c7827.f21370;
    }

    public C7827(C2184 c2184, InterfaceC7972 interfaceC7972, C6960 c6960) {
        this.f21370 = c2184;
        this.f21371 = interfaceC7972;
        this.f21369 = c6960;
    }
}
