package p009;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import p018.AbstractC6253;
import p217.AbstractC7965;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6182 extends AbstractC7965 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final ArrayList f17007 = new ArrayList();

    public C6182() {
        this.f22038.put(1, new C6163(this, 0));
        this.f22038.put(2, new C6163(this, 1));
        this.f22038.put(3, new C6163(this, 2));
        this.f22038.put(4, new C6163(this, 3));
        this.f22039 = new C5925(26);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final void m11568(C6182 c6182, View view, int i, Object obj) {
        boolean z;
        GradientDrawable gradientDrawable;
        int iM11754 = AbstractC6253.m11754(c6182.m13459(), 20.0f);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        if (obj instanceof ItemUiInfoGroupWrapper) {
            float f = iM11754;
            fArr[0] = f;
            fArr[1] = f;
            z = true;
        } else {
            if ((obj instanceof ItemUiInfo) && i != 0) {
                Object objM8818 = AbstractC4344.m8818(i - 1, c6182.f22042);
                if (objM8818 instanceof ItemUiInfo) {
                    ItemUiInfo itemUiInfo = (ItemUiInfo) objM8818;
                    String groupPath = itemUiInfo.getGroupPath();
                    String groupPath2 = itemUiInfo.getGroupPath();
                    if (groupPath2 != null && !groupPath2.equals(groupPath)) {
                        float f2 = iM11754;
                        fArr[0] = f2;
                        fArr[1] = f2;
                    }
                }
            }
            z = false;
        }
        if (i == 0) {
            float f3 = iM11754;
            fArr[0] = f3;
            fArr[1] = f3;
        } else if ((obj instanceof OtherViewItemInfo) && !(AbstractC4344.m8818(i - 1, c6182.f22042) instanceof OtherViewItemInfo)) {
            float f4 = iM11754;
            fArr[0] = f4;
            fArr[1] = f4;
        }
        boolean z2 = i == c6182.f22042.size() - 1;
        int i2 = i + 1;
        boolean z3 = AbstractC4344.m8818(i2, c6182.f22042) instanceof ItemUiInfoGroupWrapper;
        boolean z4 = (AbstractC4344.m8818(i2, c6182.f22042) instanceof OtherViewItemInfo) && !(obj instanceof OtherViewItemInfo);
        if (z2 || z3 || z4) {
            float f5 = iM11754;
            fArr[2] = f5;
            fArr[3] = f5;
        }
        int color = z ? view.getContext().getColor(R.color.itemGroup_themeColors) : view.getContext().getColor(R.color.item_color);
        StringBuilder sb = new StringBuilder();
        String string = Arrays.toString(fArr);
        AbstractC8405.m13972(1296);
        string.getClass();
        sb.append(string);
        sb.append('_');
        sb.append(color);
        String string2 = sb.toString();
        Object tag = view.getTag();
        C6178 c6178 = tag instanceof C6178 ? (C6178) tag : null;
        if (c6178 != null && AbstractC4395.m8907(c6178.f16997, string2)) {
            view.setBackground(c6178.f17001);
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
        if (c6178 != null) {
            c6178.f17001 = gradientDrawable;
            c6178.f16997 = string2;
            view.setTag(c6178);
        }
    }
}
