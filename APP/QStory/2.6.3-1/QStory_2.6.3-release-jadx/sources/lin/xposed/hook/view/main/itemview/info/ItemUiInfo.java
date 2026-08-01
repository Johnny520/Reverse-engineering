package lin.xposed.hook.view.main.itemview.info;

import androidx.activity.AbstractC0900;
import p042.AbstractC7143;
import p303.AbstractC9234;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class ItemUiInfo extends BaseItemUiInfo {
    public AbstractC7143 item;
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
        String strM14532 = "";
        for (int i = 0; i < 3; i++) {
            String str = strArr2[i];
            stringBuffer.append(strM14532);
            strM14532 = AbstractC9234.m14532("喵呜喵呜呜呜喵喵");
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC9234.m14531(1046));
        sb.append(this.item);
        sb.append(AbstractC9234.m14531(1047));
        return AbstractC0900.m711(sb, this.tips, "'}");
    }
}
