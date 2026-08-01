package lin.xposed.hook.view.main.itemview.info;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p303.AbstractC9234;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
        return AbstractC9234.m14531(1048) + this.groupName + '\'' + AbstractC9234.m14531(1049) + this.directoryUIInfoList + '}';
    }
}
