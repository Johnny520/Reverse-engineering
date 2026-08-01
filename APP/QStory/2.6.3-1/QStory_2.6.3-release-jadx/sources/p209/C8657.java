package p209;

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
import androidx.appcompat.app.C0954;
import androidx.core.util.C3017;
import androidx.core.util.InterfaceC3019;
import com.bumptech.glide.C3894;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.bumptech.glide.load.engine.InterfaceC3821;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811;
import com.bumptech.glide.load.resource.bitmap.C3858;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p091.C7790;
import p210.C8661;
import p210.C8662;
import p234.InterfaceC8801;
import p234.InterfaceC8802;
import p249.C8904;
import p249.InterfaceC8906;
import p250.C8911;
import p299.C9208;
import p302.C9226;
import p303.AbstractC9234;
import p358.C9647;
import p370.C9715;

/* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8657 implements InterfaceC3019, InterfaceC8906 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f21711;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f21712;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Object f21713;

    public C8657(int i) {
        switch (i) {
            case 1:
                this.f21712 = new C7790(9);
                break;
            case 7:
                this.f21713 = new C9715();
                this.f21712 = new Handler(Looper.getMainLooper());
                break;
            default:
                this.f21713 = new WeakHashMap();
                this.f21711 = new WeakHashMap();
                this.f21712 = new WeakHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C8657 m13748(C8657 c8657, C9208 c9208, C9208 c92082) {
        if (c8657 == null) {
            return null;
        }
        C9208 c92083 = (C9208) c8657.f21713;
        C8657 c8657M13748 = m13748((C8657) c8657.f21712, c9208, c92082);
        c8657.f21712 = c8657M13748;
        int i = c92083.f23514;
        C9208 c92084 = (C9208) c8657.f21711;
        int i2 = c92084.f23514;
        int i3 = c9208.f23514;
        int i4 = c92082 == null ? Integer.MAX_VALUE : c92082.f23514;
        if (i3 >= i2 || i4 <= i) {
            return c8657;
        }
        if (i3 <= i) {
            return i4 >= i2 ? c8657M13748 : new C8657(c8657, c92082, c92084);
        }
        if (i4 >= i2) {
            return new C8657(c8657, c92083, c9208);
        }
        c8657.f21712 = new C8657(c8657, c92082, c92084);
        return new C8657(c8657, c92083, c9208);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m13749(ImageView imageView, ProgressBar progressBar, String str) {
        progressBar.setVisibility(0);
        ((C3894) ((C3894) ComponentCallbacks2C3890.m7324(imageView).m7356(str).m7185(C0328R.drawable.ic_sticker_default)).m7175(C0328R.drawable.ic_sticker_default)).m7347(new C9647(progressBar)).m7349(imageView);
    }

    @Override // androidx.core.util.InterfaceC3019
    public Object acquire() {
        Object objAcquire = ((C3017) this.f21712).acquire();
        if (objAcquire == null) {
            objAcquire = ((InterfaceC8802) this.f21713).create();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objAcquire.getClass());
            }
        }
        if (objAcquire instanceof InterfaceC8801) {
            ((InterfaceC8801) objAcquire).mo7033().f22390 = false;
        }
        return objAcquire;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m13750(TextView textView, Button button) {
        int i;
        LinkedHashMap linkedHashMap = ((C9715) this.f21713).f25397;
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
        textView.setText(AbstractC9234.m14531(3104) + i);
        button.setText(AbstractC9234.m14531(3120) + i + ')');
        button.setEnabled(i > 0);
        button.setAlpha(i > 0 ? 1.0f : 0.5f);
    }

    @Override // p249.InterfaceC8906
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC3821 mo900(InterfaceC3821 interfaceC3821, C9226 c9226) {
        Drawable drawable = (Drawable) interfaceC3821.get();
        if (drawable instanceof BitmapDrawable) {
            return ((C0954) this.f21711).mo900(C3858.m7096(((BitmapDrawable) drawable).getBitmap(), (InterfaceC3811) this.f21713), c9226);
        }
        if (drawable instanceof C8911) {
            return ((C8904) this.f21712).mo900(interfaceC3821, c9226);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C8661 m13751() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((C7790) this.f21712)) {
            try {
                C8661 c8661 = (C8661) this.f21711;
                if (c8661 != null && localeList == ((LocaleList) this.f21713)) {
                    return c8661;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new C8662(localeList.get(i)));
                }
                C8661 c86612 = new C8661(arrayList);
                this.f21713 = localeList;
                this.f21711 = c86612;
                return c86612;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.core.util.InterfaceC3019
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo4549(Object obj) {
        if (obj instanceof InterfaceC8801) {
            ((InterfaceC8801) obj).mo7033().f22390 = true;
        }
        switch (((C7790) this.f21711).f18987) {
            case 10:
                break;
            default:
                ((List) obj).clear();
                break;
        }
        return ((C3017) this.f21712).mo4549(obj);
    }

    public C8657(C8657 c8657, C9208 c9208, C9208 c92082) {
        c8657.getClass();
        this.f21713 = c9208;
        this.f21711 = c92082;
        this.f21712 = (C8657) c8657.f21712;
    }

    public C8657(C3017 c3017, InterfaceC8802 interfaceC8802, C7790 c7790) {
        this.f21712 = c3017;
        this.f21713 = interfaceC8802;
        this.f21711 = c7790;
    }
}
