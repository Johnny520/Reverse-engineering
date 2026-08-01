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
import p222.AbstractC7988;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2981 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Bitmap.Config[] f9425;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Bitmap.Config[] f9426;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Bitmap.Config[] f9427;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final Bitmap.Config[] f9428;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final Bitmap.Config[] f9429;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2974 f9432 = new C2974(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0076 f9431 = new C0076(15);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f9430 = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f9427 = configArr;
        f9426 = configArr;
        f9425 = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f9429 = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f9428 = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m6405(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final String toString() {
        StringBuilder sbM149 = AbstractC0053.m149("SizeConfigStrategy{groupedMap=");
        sbM149.append(this.f9431);
        sbM149.append(", sortedSizes=(");
        HashMap map = this.f9430;
        for (Map.Entry entry : map.entrySet()) {
            sbM149.append(entry.getKey());
            sbM149.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
            sbM149.append(entry.getValue());
            sbM149.append("], ");
        }
        if (!map.isEmpty()) {
            sbM149.replace(sbM149.length() - 2, sbM149.length(), "");
        }
        sbM149.append(")}");
        return sbM149.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m6406(Bitmap bitmap) {
        int iM13440 = AbstractC7988.m13440(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C2974 c2974 = this.f9432;
        InterfaceC2979 interfaceC2979M6392 = (InterfaceC2979) ((ArrayDeque) c2974.f3894).poll();
        if (interfaceC2979M6392 == null) {
            interfaceC2979M6392 = c2974.m6392();
        }
        C2983 c2983 = (C2983) interfaceC2979M6392;
        c2983.f9435 = iM13440;
        c2983.f9434 = config;
        this.f9431.m255(c2983, bitmap);
        NavigableMap navigableMapM6407 = m6407(bitmap.getConfig());
        Integer num = (Integer) navigableMapM6407.get(Integer.valueOf(c2983.f9435));
        navigableMapM6407.put(Integer.valueOf(c2983.f9435), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final NavigableMap m6407(Bitmap.Config config) {
        HashMap map = this.f9430;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Bitmap m6408(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iM13447 = AbstractC7988.m13447(config) * i * i2;
        C2974 c2974 = this.f9432;
        InterfaceC2979 interfaceC2979M6392 = (InterfaceC2979) ((ArrayDeque) c2974.f3894).poll();
        if (interfaceC2979M6392 == null) {
            interfaceC2979M6392 = c2974.m6392();
        }
        C2983 c2983 = (C2983) interfaceC2979M6392;
        c2983.f9435 = iM13447;
        c2983.f9434 = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f9426;
        } else {
            int i3 = AbstractC2982.f9433[config.ordinal()];
            configArr = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? new Bitmap.Config[]{config} : f9428 : f9429 : f9425 : f9427;
        }
        int length = configArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer num = (Integer) m6407(config2).ceilingKey(Integer.valueOf(iM13447));
            if (num == null || num.intValue() > iM13447 * 8) {
                i4++;
            } else if (num.intValue() != iM13447 || (config2 != null ? !config2.equals(config) : config != null)) {
                c2974.m2405(c2983);
                int iIntValue = num.intValue();
                InterfaceC2979 interfaceC2979M63922 = (InterfaceC2979) ((ArrayDeque) c2974.f3894).poll();
                if (interfaceC2979M63922 == null) {
                    interfaceC2979M63922 = c2974.m6392();
                }
                c2983 = (C2983) interfaceC2979M63922;
                c2983.f9435 = iIntValue;
                c2983.f9434 = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.f9431.m257(c2983);
        if (bitmap != null) {
            m6409(Integer.valueOf(c2983.f9435), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m6409(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM6407 = m6407(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM6407.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM6407.remove(num);
                return;
            } else {
                navigableMapM6407.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
        sb.append(num);
        String strM6405 = m6405(AbstractC7988.m13440(bitmap), bitmap.getConfig());
        sb.append(", removed: ");
        sb.append(strM6405);
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }
}
