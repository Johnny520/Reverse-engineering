package lin.xposed.hook.view.main.itemview.info;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import p026.AbstractC6296;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class ItemUiInfo extends BaseItemUiInfo {
    public AbstractC6296 item;
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
        String strM6668 = "";
        for (int i = 0; i < 3; i++) {
            String str = strArr2[i];
            stringBuffer.append(strM6668);
            strM6668 = "/";
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ItemUiInfo{item=");
        sb.append(this.item);
        sb.append(", tips='");
        return AbstractC0053.m146(sb, this.tips, "'}");
    }
}
