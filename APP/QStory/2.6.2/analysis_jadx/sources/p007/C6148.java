package p007;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import p217.AbstractC7964;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲楪苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6148 extends AbstractC7964 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final ArrayList f16765 = new ArrayList();

    public C6148() {
        this.f22041.put(1, new C6129(this, 0));
        this.f22041.put(2, new C6129(this, 1));
        this.f22041.put(3, new C6129(this, 2));
        this.f22041.put(4, new C6129(this, 3));
        this.f22042 = new C5919(24);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final void m11560(C6148 c6148, View view, int i, Object obj) {
        boolean z;
        GradientDrawable gradientDrawable;
        int iM6267 = AbstractC2904.m6267(c6148.m13431(), 20.0f);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        if (obj instanceof ItemUiInfoGroupWrapper) {
            float f = iM6267;
            fArr[0] = f;
            fArr[1] = f;
            z = true;
        } else {
            if ((obj instanceof ItemUiInfo) && i != 0) {
                Object objM8831 = AbstractC4343.m8831(i - 1, c6148.f22045);
                if (objM8831 instanceof ItemUiInfo) {
                    ItemUiInfo itemUiInfo = (ItemUiInfo) objM8831;
                    String groupPath = itemUiInfo.getGroupPath();
                    String groupPath2 = itemUiInfo.getGroupPath();
                    if (groupPath2 != null && !groupPath2.equals(groupPath)) {
                        float f2 = iM6267;
                        fArr[0] = f2;
                        fArr[1] = f2;
                    }
                }
            }
            z = false;
        }
        if (i == 0) {
            float f3 = iM6267;
            fArr[0] = f3;
            fArr[1] = f3;
        } else if ((obj instanceof OtherViewItemInfo) && !(AbstractC4343.m8831(i - 1, c6148.f22045) instanceof OtherViewItemInfo)) {
            float f4 = iM6267;
            fArr[0] = f4;
            fArr[1] = f4;
        }
        boolean z2 = i == c6148.f22045.size() - 1;
        int i2 = i + 1;
        boolean z3 = AbstractC4343.m8831(i2, c6148.f22045) instanceof ItemUiInfoGroupWrapper;
        boolean z4 = (AbstractC4343.m8831(i2, c6148.f22045) instanceof OtherViewItemInfo) && !(obj instanceof OtherViewItemInfo);
        if (z2 || z3 || z4) {
            float f5 = iM6267;
            fArr[2] = f5;
            fArr[3] = f5;
        }
        int color = z ? view.getContext().getColor(R.color.itemGroup_themeColors) : view.getContext().getColor(R.color.item_color);
        StringBuilder sb = new StringBuilder();
        String string = Arrays.toString(fArr);
        AbstractC3056.m6668(-3937690351373125031L);
        string.getClass();
        sb.append(string);
        sb.append('_');
        sb.append(color);
        String string2 = sb.toString();
        Object tag = view.getTag();
        C6144 c6144 = tag instanceof C6144 ? (C6144) tag : null;
        if (c6144 != null && AbstractC4394.m8917(c6144.f16750, string2)) {
            view.setBackground(c6144.f16754);
            return;
        }
        view.getContext().getColor(R.color.white);
        try {
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(color);
            float f6 = fArr[0];
            float f7 = fArr[1];
            float f8 = fArr[2];
            float f9 = fArr[3];
            gradientDrawable.setCornerRadii(new float[]{f6, f6, f7, f7, f8, f8, f9, f9});
        } catch (Exception unused) {
            gradientDrawable = new GradientDrawable();
        }
        view.setBackground(gradientDrawable);
        if (c6144 != null) {
            c6144.f16754 = gradientDrawable;
            c6144.f16750 = string2;
            view.setTag(c6144);
        }
    }
}
