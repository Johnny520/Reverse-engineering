package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0076;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import net.bytebuddy.pool.TypePool;
import p222.AbstractC7989;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2982 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Bitmap.Config[] f9427;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Bitmap.Config[] f9428;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Bitmap.Config[] f9429;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final Bitmap.Config[] f9430;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final Bitmap.Config[] f9431;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2975 f9434 = new C2975(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0076 f9433 = new C0076(15);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f9432 = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f9429 = configArr;
        f9428 = configArr;
        f9427 = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f9431 = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f9430 = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m6463(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final String toString() {
        StringBuilder sbM140 = AbstractC0053.m140("SizeConfigStrategy{groupedMap=");
        sbM140.append(this.f9433);
        sbM140.append(", sortedSizes=(");
        HashMap map = this.f9432;
        for (Map.Entry entry : map.entrySet()) {
            sbM140.append(entry.getKey());
            sbM140.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
            sbM140.append(entry.getValue());
            sbM140.append("], ");
        }
        if (!map.isEmpty()) {
            sbM140.replace(sbM140.length() - 2, sbM140.length(), "");
        }
        sbM140.append(")}");
        return sbM140.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m6464(Bitmap bitmap) {
        int iM13468 = AbstractC7989.m13468(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C2975 c2975 = this.f9434;
        InterfaceC2980 interfaceC2980M6450 = (InterfaceC2980) ((ArrayDeque) c2975.f3895).poll();
        if (interfaceC2980M6450 == null) {
            interfaceC2980M6450 = c2975.m6450();
        }
        C2984 c2984 = (C2984) interfaceC2980M6450;
        c2984.f9437 = iM13468;
        c2984.f9436 = config;
        this.f9433.m256(c2984, bitmap);
        NavigableMap navigableMapM6465 = m6465(bitmap.getConfig());
        Integer num = (Integer) navigableMapM6465.get(Integer.valueOf(c2984.f9437));
        navigableMapM6465.put(Integer.valueOf(c2984.f9437), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final NavigableMap m6465(Bitmap.Config config) {
        HashMap map = this.f9432;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Bitmap m6466(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iM13475 = AbstractC7989.m13475(config) * i * i2;
        C2975 c2975 = this.f9434;
        InterfaceC2980 interfaceC2980M6450 = (InterfaceC2980) ((ArrayDeque) c2975.f3895).poll();
        if (interfaceC2980M6450 == null) {
            interfaceC2980M6450 = c2975.m6450();
        }
        C2984 c2984 = (C2984) interfaceC2980M6450;
        c2984.f9437 = iM13475;
        c2984.f9436 = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f9428;
        } else {
            int i3 = AbstractC2983.f9435[config.ordinal()];
            configArr = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? new Bitmap.Config[]{config} : f9430 : f9431 : f9427 : f9429;
        }
        int length = configArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer num = (Integer) m6465(config2).ceilingKey(Integer.valueOf(iM13475));
            if (num == null || num.intValue() > iM13475 * 8) {
                i4++;
            } else if (num.intValue() != iM13475 || (config2 != null ? !config2.equals(config) : config != null)) {
                c2975.m2415(c2984);
                int iIntValue = num.intValue();
                InterfaceC2980 interfaceC2980M64502 = (InterfaceC2980) ((ArrayDeque) c2975.f3895).poll();
                if (interfaceC2980M64502 == null) {
                    interfaceC2980M64502 = c2975.m6450();
                }
                c2984 = (C2984) interfaceC2980M64502;
                c2984.f9437 = iIntValue;
                c2984.f9436 = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.f9433.m258(c2984);
        if (bitmap != null) {
            m6467(Integer.valueOf(c2984.f9437), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m6467(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM6465 = m6465(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM6465.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM6465.remove(num);
                return;
            } else {
                navigableMapM6465.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
        sb.append(num);
        String strM6463 = m6463(AbstractC7989.m13468(bitmap), bitmap.getConfig());
        sb.append(", removed: ");
        sb.append(strM6463);
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }
}
