package p000;

import android.graphics.Bitmap;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: zy */
/* JADX INFO: loaded from: classes.dex */
public final class C2821zy {

    /* JADX INFO: renamed from: d */
    public static final Bitmap.Config[] f9542d;

    /* JADX INFO: renamed from: e */
    public static final Bitmap.Config[] f9543e;

    /* JADX INFO: renamed from: f */
    public static final Bitmap.Config[] f9544f;

    /* JADX INFO: renamed from: g */
    public static final Bitmap.Config[] f9545g;

    /* JADX INFO: renamed from: h */
    public static final Bitmap.Config[] f9546h;

    /* JADX INFO: renamed from: a */
    public final C2769yp f9547a = new C2769yp(1);

    /* JADX INFO: renamed from: b */
    public final C0649P3 f9548b = new C0649P3(21);

    /* JADX INFO: renamed from: c */
    public final HashMap f9549c = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f9542d = configArr;
        f9543e = configArr;
        f9544f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f9545g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f9546h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* JADX INFO: renamed from: c */
    public static String m5455c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* JADX INFO: renamed from: a */
    public final void m5456a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM5458d = m5458d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM5458d.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM5458d.remove(num);
                return;
            } else {
                navigableMapM5458d.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + m5455c(AbstractC2622vD.m5132c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m5457b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iM5133d = AbstractC2622vD.m5133d(config) * i * i2;
        C2769yp c2769yp = this.f9547a;
        InterfaceC0938Vt interfaceC0938VtM5340g = (InterfaceC0938Vt) ((ArrayDeque) c2769yp.f9067a).poll();
        if (interfaceC0938VtM5340g == null) {
            interfaceC0938VtM5340g = c2769yp.m5340g();
        }
        C2778yy c2778yy = (C2778yy) interfaceC0938VtM5340g;
        c2778yy.f9435b = iM5133d;
        c2778yy.f9436c = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f9543e;
        } else {
            int i3 = AbstractC2735xy.f9342a[config.ordinal()];
            configArr = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? new Bitmap.Config[]{config} : f9546h : f9545g : f9544f : f9542d;
        }
        int length = configArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer num = (Integer) m5458d(config2).ceilingKey(Integer.valueOf(iM5133d));
            if (num == null || num.intValue() > iM5133d * 8) {
                i4++;
            } else if (num.intValue() != iM5133d || (config2 != null ? !config2.equals(config) : config != null)) {
                c2769yp.m5128d(c2778yy);
                int iIntValue = num.intValue();
                InterfaceC0938Vt interfaceC0938VtM5340g2 = (InterfaceC0938Vt) ((ArrayDeque) c2769yp.f9067a).poll();
                if (interfaceC0938VtM5340g2 == null) {
                    interfaceC0938VtM5340g2 = c2769yp.m5340g();
                }
                c2778yy = (C2778yy) interfaceC0938VtM5340g2;
                c2778yy.f9435b = iIntValue;
                c2778yy.f9436c = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.f9548b.m1272B(c2778yy);
        if (bitmap != null) {
            m5456a(Integer.valueOf(c2778yy.f9435b), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: d */
    public final NavigableMap m5458d(Bitmap.Config config) {
        HashMap map = this.f9549c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: e */
    public final void m5459e(Bitmap bitmap) {
        int iM5132c = AbstractC2622vD.m5132c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C2769yp c2769yp = this.f9547a;
        InterfaceC0938Vt interfaceC0938VtM5340g = (InterfaceC0938Vt) ((ArrayDeque) c2769yp.f9067a).poll();
        if (interfaceC0938VtM5340g == null) {
            interfaceC0938VtM5340g = c2769yp.m5340g();
        }
        C2778yy c2778yy = (C2778yy) interfaceC0938VtM5340g;
        c2778yy.f9435b = iM5132c;
        c2778yy.f9436c = config;
        this.f9548b.m1283N(c2778yy, bitmap);
        NavigableMap navigableMapM5458d = m5458d(bitmap.getConfig());
        Integer num = (Integer) navigableMapM5458d.get(Integer.valueOf(c2778yy.f9435b));
        navigableMapM5458d.put(Integer.valueOf(c2778yy.f9435b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f9548b);
        sb.append(", sortedSizes=(");
        HashMap map = this.f9549c;
        for (Map.Entry entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!map.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
