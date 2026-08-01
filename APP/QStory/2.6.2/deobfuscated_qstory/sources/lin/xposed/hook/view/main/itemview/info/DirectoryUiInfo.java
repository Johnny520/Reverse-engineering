package lin.xposed.hook.view.main.itemview.info;

import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
