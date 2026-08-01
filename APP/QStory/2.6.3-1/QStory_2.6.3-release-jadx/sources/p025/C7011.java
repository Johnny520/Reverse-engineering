package p025;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import p034.AbstractC7082;
import p233.AbstractC8794;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7011 extends AbstractC8794 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final ArrayList f17352 = new ArrayList();

    public C7011() {
        this.f22383.put(1, new C6992(this, 0));
        this.f22383.put(2, new C6992(this, 1));
        this.f22383.put(3, new C6992(this, 2));
        this.f22383.put(4, new C6992(this, 3));
        this.f22384 = new C6755(26);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final void m12127(C7011 c7011, View view, int i, Object obj) {
        boolean z;
        GradientDrawable gradientDrawable;
        int iM12313 = AbstractC7082.m12313(c7011.m14018(), 20.0f);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        if (obj instanceof ItemUiInfoGroupWrapper) {
            float f = iM12313;
            fArr[0] = f;
            fArr[1] = f;
            z = true;
        } else {
            if ((obj instanceof ItemUiInfo) && i != 0) {
                Object objM9377 = AbstractC5176.m9377(i - 1, c7011.f22387);
                if (objM9377 instanceof ItemUiInfo) {
                    ItemUiInfo itemUiInfo = (ItemUiInfo) objM9377;
                    String groupPath = itemUiInfo.getGroupPath();
                    String groupPath2 = itemUiInfo.getGroupPath();
                    if (groupPath2 != null && !groupPath2.equals(groupPath)) {
                        float f2 = iM12313;
                        fArr[0] = f2;
                        fArr[1] = f2;
                    }
                }
            }
            z = false;
        }
        if (i == 0) {
            float f3 = iM12313;
            fArr[0] = f3;
            fArr[1] = f3;
        } else if ((obj instanceof OtherViewItemInfo) && !(AbstractC5176.m9377(i - 1, c7011.f22387) instanceof OtherViewItemInfo)) {
            float f4 = iM12313;
            fArr[0] = f4;
            fArr[1] = f4;
        }
        boolean z2 = i == c7011.f22387.size() - 1;
        int i2 = i + 1;
        boolean z3 = AbstractC5176.m9377(i2, c7011.f22387) instanceof ItemUiInfoGroupWrapper;
        boolean z4 = (AbstractC5176.m9377(i2, c7011.f22387) instanceof OtherViewItemInfo) && !(obj instanceof OtherViewItemInfo);
        if (z2 || z3 || z4) {
            float f5 = iM12313;
            fArr[2] = f5;
            fArr[3] = f5;
        }
        int color = z ? view.getContext().getColor(C0328R.color.itemGroup_themeColors) : view.getContext().getColor(C0328R.color.item_color);
        StringBuilder sb = new StringBuilder();
        String string = Arrays.toString(fArr);
        AbstractC9234.m14531(1296);
        string.getClass();
        sb.append(string);
        sb.append('_');
        sb.append(color);
        String string2 = sb.toString();
        Object tag = view.getTag();
        C7007 c7007 = tag instanceof C7007 ? (C7007) tag : null;
        if (c7007 != null && AbstractC5227.m9466(c7007.f17342, string2)) {
            view.setBackground(c7007.f17346);
            return;
        }
        view.getContext().getColor(C0328R.color.white);
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
        if (c7007 != null) {
            c7007.f17346 = gradientDrawable;
            c7007.f17342 = string2;
            view.setTag(c7007);
        }
    }
}
