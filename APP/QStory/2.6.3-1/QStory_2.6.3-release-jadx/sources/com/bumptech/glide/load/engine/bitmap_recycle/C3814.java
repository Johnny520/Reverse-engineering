package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0923;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import net.bytebuddy.pool.TypePool;
import p238.AbstractC8818;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3814 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Bitmap.Config[] f9772;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Bitmap.Config[] f9773;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Bitmap.Config[] f9774;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final Bitmap.Config[] f9775;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final Bitmap.Config[] f9776;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3807 f9779 = new C3807(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0923 f9778 = new C0923(15);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f9777 = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f9774 = configArr;
        f9773 = configArr;
        f9772 = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f9776 = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f9775 = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m7023(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final String toString() {
        StringBuilder sbM700 = AbstractC0900.m700("SizeConfigStrategy{groupedMap=");
        sbM700.append(this.f9778);
        sbM700.append(", sortedSizes=(");
        HashMap map = this.f9777;
        for (Map.Entry entry : map.entrySet()) {
            sbM700.append(entry.getKey());
            sbM700.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
            sbM700.append(entry.getValue());
            sbM700.append("], ");
        }
        if (!map.isEmpty()) {
            sbM700.replace(sbM700.length() - 2, sbM700.length(), "");
        }
        sbM700.append(")}");
        return sbM700.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7024(Bitmap bitmap) {
        int iM14027 = AbstractC8818.m14027(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C3807 c3807 = this.f9779;
        InterfaceC3812 interfaceC3812M7010 = (InterfaceC3812) ((ArrayDeque) c3807.f4240).poll();
        if (interfaceC3812M7010 == null) {
            interfaceC3812M7010 = c3807.m7010();
        }
        C3816 c3816 = (C3816) interfaceC3812M7010;
        c3816.f9782 = iM14027;
        c3816.f9781 = config;
        this.f9778.m816(c3816, bitmap);
        NavigableMap navigableMapM7025 = m7025(bitmap.getConfig());
        Integer num = (Integer) navigableMapM7025.get(Integer.valueOf(c3816.f9782));
        navigableMapM7025.put(Integer.valueOf(c3816.f9782), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final NavigableMap m7025(Bitmap.Config config) {
        HashMap map = this.f9777;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Bitmap m7026(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iM14034 = AbstractC8818.m14034(config) * i * i2;
        C3807 c3807 = this.f9779;
        InterfaceC3812 interfaceC3812M7010 = (InterfaceC3812) ((ArrayDeque) c3807.f4240).poll();
        if (interfaceC3812M7010 == null) {
            interfaceC3812M7010 = c3807.m7010();
        }
        C3816 c3816 = (C3816) interfaceC3812M7010;
        c3816.f9782 = iM14034;
        c3816.f9781 = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f9773;
        } else {
            int i3 = AbstractC3815.f9780[config.ordinal()];
            configArr = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? new Bitmap.Config[]{config} : f9775 : f9776 : f9772 : f9774;
        }
        int length = configArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer num = (Integer) m7025(config2).ceilingKey(Integer.valueOf(iM14034));
            if (num == null || num.intValue() > iM14034 * 8) {
                i4++;
            } else if (num.intValue() != iM14034 || (config2 != null ? !config2.equals(config) : config != null)) {
                c3807.m2975(c3816);
                int iIntValue = num.intValue();
                InterfaceC3812 interfaceC3812M70102 = (InterfaceC3812) ((ArrayDeque) c3807.f4240).poll();
                if (interfaceC3812M70102 == null) {
                    interfaceC3812M70102 = c3807.m7010();
                }
                c3816 = (C3816) interfaceC3812M70102;
                c3816.f9782 = iIntValue;
                c3816.f9781 = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.f9778.m818(c3816);
        if (bitmap != null) {
            m7027(Integer.valueOf(c3816.f9782), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7027(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM7025 = m7025(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM7025.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM7025.remove(num);
                return;
            } else {
                navigableMapM7025.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
        sb.append(num);
        String strM7023 = m7023(AbstractC8818.m14027(bitmap), bitmap.getConfig());
        sb.append(", removed: ");
        sb.append(strM7023);
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }
}
