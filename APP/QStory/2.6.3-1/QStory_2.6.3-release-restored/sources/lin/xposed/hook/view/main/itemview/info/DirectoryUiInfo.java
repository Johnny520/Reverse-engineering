package lin.xposed.hook.view.main.itemview.info;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class DirectoryUiInfo extends BaseItemUiInfo {
    public List<ItemUiInfoGroupWrapper> groupWrapperList;
    public CharSequence rightText;
    public List<BaseItemUiInfo> uiInfoList;

    public DirectoryUiInfo(String[] strArr) {
        super(strArr);
        this.uiInfoList = new ArrayList();
        this.groupWrapperList = new ArrayList();
        if (strArr.length >= 3) {
            this.paths = new String[]{strArr[0], strArr[1]};
        }
    }

    public void addGroupWrapper(ItemUiInfoGroupWrapper itemUiInfoGroupWrapper) {
        Iterator<ItemUiInfoGroupWrapper> it = this.groupWrapperList.iterator();
        while (it.hasNext()) {
            if (it.next().getGroupName().equals(itemUiInfoGroupWrapper.getGroupName())) {
                return;
            }
        }
        this.groupWrapperList.add(itemUiInfoGroupWrapper);
    }

    public void addItemUiInfo(BaseItemUiInfo baseItemUiInfo) {
        this.uiInfoList.add(baseItemUiInfo);
    }

    public String toString() {
        return "DirectoryUiInfo{rightText=" + ((Object) this.rightText) + ", uiInfoList=" + this.uiInfoList + ", groupWrapperList=" + this.groupWrapperList + '}';
    }
}
