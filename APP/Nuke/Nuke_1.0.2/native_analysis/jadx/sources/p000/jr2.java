package p000;

import android.graphics.Bitmap;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jr2 {

    /* JADX INFO: renamed from: d */
    public static final Bitmap.Config[] f5180d;

    /* JADX INFO: renamed from: e */
    public static final Bitmap.Config[] f5181e;

    /* JADX INFO: renamed from: f */
    public static final Bitmap.Config[] f5182f;

    /* JADX INFO: renamed from: g */
    public static final Bitmap.Config[] f5183g;

    /* JADX INFO: renamed from: h */
    public static final Bitmap.Config[] f5184h;

    /* JADX INFO: renamed from: a */
    public final sd1 f5185a = new sd1(1);

    /* JADX INFO: renamed from: b */
    public final sz0 f5186b = new sz0(20);

    /* JADX INFO: renamed from: c */
    public final HashMap f5187c = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f5180d = configArr;
        f5181e = configArr;
        f5182f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f5183g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f5184h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* JADX INFO: renamed from: c */
    public static String m2551c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* JADX INFO: renamed from: a */
    public final void m2552a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM2554d = m2554d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM2554d.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM2554d.remove(num);
                return;
            } else {
                navigableMapM2554d.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
        sb.append(num);
        String strM2551c = m2551c(b93.m496c(bitmap), bitmap.getConfig());
        sb.append(", removed: ");
        sb.append(strM2551c);
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m2553b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iM497d = b93.m497d(config) * i * i2;
        sd1 sd1Var = this.f5185a;
        y12 y12VarM4809k = (y12) ((ArrayDeque) sd1Var.f10161h).poll();
        if (y12VarM4809k == null) {
            y12VarM4809k = sd1Var.m4809k();
        }
        ir2 ir2Var = (ir2) y12VarM4809k;
        ir2Var.f4769b = iM497d;
        ir2Var.f4770c = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f5181e;
        } else {
            int i3 = hr2.f4122a[config.ordinal()];
            configArr = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? new Bitmap.Config[]{config} : f5184h : f5183g : f5182f : f5180d;
        }
        int length = configArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer num = (Integer) m2554d(config2).ceilingKey(Integer.valueOf(iM497d));
            if (num == null || num.intValue() > iM497d * 8) {
                i4++;
            } else if (num.intValue() != iM497d || (config2 != null ? !config2.equals(config) : config != null)) {
                sd1Var.m4875g(ir2Var);
                int iIntValue = num.intValue();
                y12 y12VarM4809k2 = (y12) ((ArrayDeque) sd1Var.f10161h).poll();
                if (y12VarM4809k2 == null) {
                    y12VarM4809k2 = sd1Var.m4809k();
                }
                ir2Var = (ir2) y12VarM4809k2;
                ir2Var.f4769b = iIntValue;
                ir2Var.f4770c = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.f5186b.m5032E(ir2Var);
        if (bitmap != null) {
            m2552a(Integer.valueOf(ir2Var.f4769b), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: d */
    public final NavigableMap m2554d(Bitmap.Config config) {
        HashMap map = this.f5187c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: e */
    public final void m2555e(Bitmap bitmap) {
        int iM496c = b93.m496c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        sd1 sd1Var = this.f5185a;
        y12 y12VarM4809k = (y12) ((ArrayDeque) sd1Var.f10161h).poll();
        if (y12VarM4809k == null) {
            y12VarM4809k = sd1Var.m4809k();
        }
        ir2 ir2Var = (ir2) y12VarM4809k;
        ir2Var.f4769b = iM496c;
        ir2Var.f4770c = config;
        this.f5186b.m5037J(ir2Var, bitmap);
        NavigableMap navigableMapM2554d = m2554d(bitmap.getConfig());
        Integer num = (Integer) navigableMapM2554d.get(Integer.valueOf(ir2Var.f4769b));
        navigableMapM2554d.put(Integer.valueOf(ir2Var.f4769b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f5186b);
        sb.append(", sortedSizes=(");
        HashMap map = this.f5187c;
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
