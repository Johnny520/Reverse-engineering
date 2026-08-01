package p093S1;

import android.graphics.Bitmap;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p000A.C0038T0;
import p195l2.AbstractC2511o;

/* JADX INFO: renamed from: S1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1299k {

    /* JADX INFO: renamed from: d */
    public static final Bitmap.Config[] f4651d;

    /* JADX INFO: renamed from: e */
    public static final Bitmap.Config[] f4652e;

    /* JADX INFO: renamed from: f */
    public static final Bitmap.Config[] f4653f;

    /* JADX INFO: renamed from: g */
    public static final Bitmap.Config[] f4654g;

    /* JADX INFO: renamed from: h */
    public static final Bitmap.Config[] f4655h;

    /* JADX INFO: renamed from: a */
    public final C1293e f4656a = new C1293e(1);

    /* JADX INFO: renamed from: b */
    public final C0038T0 f4657b = new C0038T0(12);

    /* JADX INFO: renamed from: c */
    public final HashMap f4658c = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f4651d = configArr;
        f4652e = configArr;
        f4653f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f4654g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f4655h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* JADX INFO: renamed from: c */
    public static String m2392c(int i5, Bitmap.Config config) {
        return "[" + i5 + "](" + config + ")";
    }

    /* JADX INFO: renamed from: a */
    public final void m2393a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM2395d = m2395d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM2395d.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM2395d.remove(num);
                return;
            } else {
                navigableMapM2395d.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + m2392c(AbstractC2511o.m4454c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m2394b(int i5, int i6, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iM4455d = AbstractC2511o.m4455d(config) * i5 * i6;
        C1293e c1293e = this.f4656a;
        InterfaceC1296h interfaceC1296hM2381f = (InterfaceC1296h) ((ArrayDeque) c1293e.f1354d).poll();
        if (interfaceC1296hM2381f == null) {
            interfaceC1296hM2381f = c1293e.m2381f();
        }
        C1298j c1298j = (C1298j) interfaceC1296hM2381f;
        c1298j.f4649b = iM4455d;
        c1298j.f4650c = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f4652e;
        } else {
            int i7 = AbstractC1297i.f4647a[config.ordinal()];
            configArr = i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? new Bitmap.Config[]{config} : f4655h : f4654g : f4653f : f4651d;
        }
        int length = configArr.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i8];
            Integer num = (Integer) m2395d(config2).ceilingKey(Integer.valueOf(iM4455d));
            if (num == null || num.intValue() > iM4455d * 8) {
                i8++;
            } else if (num.intValue() != iM4455d || (config2 != null ? !config2.equals(config) : config != null)) {
                c1293e.m741d(c1298j);
                int iIntValue = num.intValue();
                InterfaceC1296h interfaceC1296hM2381f2 = (InterfaceC1296h) ((ArrayDeque) c1293e.f1354d).poll();
                if (interfaceC1296hM2381f2 == null) {
                    interfaceC1296hM2381f2 = c1293e.m2381f();
                }
                c1298j = (C1298j) interfaceC1296hM2381f2;
                c1298j.f4649b = iIntValue;
                c1298j.f4650c = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.f4657b.m53x(c1298j);
        if (bitmap != null) {
            m2393a(Integer.valueOf(c1298j.f4649b), bitmap);
            bitmap.reconfigure(i5, i6, config);
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: d */
    public final NavigableMap m2395d(Bitmap.Config config) {
        HashMap map = this.f4658c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: e */
    public final void m2396e(Bitmap bitmap) {
        int iM4454c = AbstractC2511o.m4454c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C1293e c1293e = this.f4656a;
        InterfaceC1296h interfaceC1296hM2381f = (InterfaceC1296h) ((ArrayDeque) c1293e.f1354d).poll();
        if (interfaceC1296hM2381f == null) {
            interfaceC1296hM2381f = c1293e.m2381f();
        }
        C1298j c1298j = (C1298j) interfaceC1296hM2381f;
        c1298j.f4649b = iM4454c;
        c1298j.f4650c = config;
        this.f4657b.m28B(c1298j, bitmap);
        NavigableMap navigableMapM2395d = m2395d(bitmap.getConfig());
        Integer num = (Integer) navigableMapM2395d.get(Integer.valueOf(c1298j.f4649b));
        navigableMapM2395d.put(Integer.valueOf(c1298j.f4649b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f4657b);
        sb.append(", sortedSizes=(");
        HashMap map = this.f4658c;
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
