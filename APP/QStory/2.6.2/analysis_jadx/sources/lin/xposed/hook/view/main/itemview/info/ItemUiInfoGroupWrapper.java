package lin.xposed.hook.view.main.itemview.info;

import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class ItemUiInfoGroupWrapper {
    private final List<BaseItemUiInfo> directoryUIInfoList = new ArrayList();
    private String groupName;

    public void addDirectoryUIInfo(BaseItemUiInfo baseItemUiInfo) {
        Iterator<BaseItemUiInfo> it = this.directoryUIInfoList.iterator();
        while (it.hasNext()) {
            if (it.next().getItemName().equals(baseItemUiInfo.getItemName())) {
                return;
            }
        }
        this.directoryUIInfoList.add(baseItemUiInfo);
    }

    public List<BaseItemUiInfo> getDirectoryUIInfoList() {
        return this.directoryUIInfoList;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public String toString() {
        return AbstractC3056.m6668(-3937663116985501095L) + this.groupName + '\'' + AbstractC3056.m6668(-3937662958071711143L) + this.directoryUIInfoList + '}';
    }
}
