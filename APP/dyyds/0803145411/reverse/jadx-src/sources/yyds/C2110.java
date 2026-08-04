package yyds;

import android.graphics.Bitmap;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: yyds.ᲀᲇᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2110 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final Bitmap.Config[] f10440;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final Bitmap.Config[] f10441;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final Bitmap.Config[] f10442;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final Bitmap.Config[] f10443;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final Bitmap.Config[] f10444;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1075 f10445 = new C1075(1);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2133 f10446 = new C2133(27);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final HashMap f10447 = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f10444 = configArr;
        f10441 = configArr;
        f10443 = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f10442 = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f10440 = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static String m4024(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f10446);
        sb.append(", sortedSizes=(");
        HashMap map = this.f10447;
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

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m4025(Bitmap bitmap) {
        int iM756 = AbstractC0181.m756(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C1075 c1075 = this.f10445;
        InterfaceC1490 interfaceC1490M2282 = (InterfaceC1490) ((ArrayDeque) c1075.f3409).poll();
        if (interfaceC1490M2282 == null) {
            interfaceC1490M2282 = c1075.m2282();
        }
        C0730 c0730 = (C0730) interfaceC1490M2282;
        c0730.f3411 = iM756;
        c0730.f3412 = config;
        this.f10446.m4062(c0730, bitmap);
        NavigableMap navigableMapM4028 = m4028(bitmap.getConfig());
        Integer num = (Integer) navigableMapM4028.get(Integer.valueOf(c0730.f3411));
        navigableMapM4028.put(Integer.valueOf(c0730.f3411), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4026(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM4028 = m4028(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM4028.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM4028.remove(num);
                return;
            } else {
                navigableMapM4028.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
        sb.append(num);
        String strM4024 = m4024(AbstractC0181.m756(bitmap), bitmap.getConfig());
        sb.append(", removed: ");
        sb.append(strM4024);
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Bitmap m4027(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iM749 = AbstractC0181.m749(config) * i * i2;
        C1075 c1075 = this.f10445;
        ArrayDeque arrayDeque = (ArrayDeque) c1075.f3409;
        InterfaceC1490 interfaceC1490M2282 = (InterfaceC1490) arrayDeque.poll();
        if (interfaceC1490M2282 == null) {
            interfaceC1490M2282 = c1075.m2282();
        }
        C0730 c0730 = (C0730) interfaceC1490M2282;
        c0730.f3411 = iM749;
        c0730.f3412 = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f10441;
        } else {
            int i3 = AbstractC0389.f2010[config.ordinal()];
            configArr = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? new Bitmap.Config[]{config} : f10440 : f10442 : f10443 : f10444;
        }
        int length = configArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer num = (Integer) m4028(config2).ceilingKey(Integer.valueOf(iM749));
            if (num == null || num.intValue() > iM749 * 8) {
                i4++;
            } else if (num.intValue() != iM749 || (config2 != null ? !config2.equals(config) : config != null)) {
                c1075.m1677(c0730);
                int iIntValue = num.intValue();
                InterfaceC1490 interfaceC1490M22822 = (InterfaceC1490) arrayDeque.poll();
                if (interfaceC1490M22822 == null) {
                    interfaceC1490M22822 = c1075.m2282();
                }
                c0730 = (C0730) interfaceC1490M22822;
                c0730.f3411 = iIntValue;
                c0730.f3412 = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.f10446.m4060(c0730);
        if (bitmap != null) {
            m4026(Integer.valueOf(c0730.f3411), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final NavigableMap m4028(Bitmap.Config config) {
        HashMap map = this.f10447;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }
}
