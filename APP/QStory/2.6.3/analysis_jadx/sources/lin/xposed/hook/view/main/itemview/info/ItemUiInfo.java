package lin.xposed.hook.view.main.itemview.info;

import androidx.activity.AbstractC0053;
import p026.AbstractC6314;
import p287.AbstractC8405;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class ItemUiInfo extends BaseItemUiInfo {
    public AbstractC6314 item;
    public String tips;

    public ItemUiInfo(String[] strArr) {
        super(strArr);
    }

    public String getGroupPath() {
        String[] strArr = this.paths;
        if (strArr.length != 4) {
            return null;
        }
        String[] strArr2 = new String[3];
        System.arraycopy(strArr, 0, strArr2, 0, 3);
        StringBuffer stringBuffer = new StringBuffer();
        String strM13973 = "";
        for (int i = 0; i < 3; i++) {
            String str = strArr2[i];
            stringBuffer.append(strM13973);
            strM13973 = AbstractC8405.m13973("喵呜喵呜呜呜喵喵");
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(1046));
        sb.append(this.item);
        sb.append(AbstractC8405.m13972(1047));
        return AbstractC0053.m151(sb, this.tips, "'}");
    }
}
