package lin.xposed.hook.view.main.itemview.info;

import com.bumptech.glide.AbstractC3888;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p040.AbstractC7138;
import p042.AbstractC7143;
import p353.AbstractC9632;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class ItemUiInfoManager {
    public static final List<Object> rootContainer = new ArrayList();
    private static final AtomicBoolean isInit = new AtomicBoolean();

    private static void addDirUiInfo(String str, BaseItemUiInfo baseItemUiInfo) {
        for (Object obj : rootContainer) {
            if (obj instanceof ItemUiInfoGroupWrapper) {
                ItemUiInfoGroupWrapper itemUiInfoGroupWrapper = (ItemUiInfoGroupWrapper) obj;
                if (itemUiInfoGroupWrapper.getGroupName().equals(str)) {
                    itemUiInfoGroupWrapper.addDirectoryUIInfo(baseItemUiInfo);
                    return;
                }
            }
        }
    }

    public static int[] findInfoIndex(String str, String str2) {
        int i = 0;
        while (true) {
            List<Object> list = rootContainer;
            if (i >= list.size()) {
                return null;
            }
            Object obj = list.get(i);
            if (obj instanceof ItemUiInfoGroupWrapper) {
                ItemUiInfoGroupWrapper itemUiInfoGroupWrapper = (ItemUiInfoGroupWrapper) obj;
                if (itemUiInfoGroupWrapper.getGroupName().equals(str)) {
                    for (int i2 = 0; i2 < itemUiInfoGroupWrapper.getDirectoryUIInfoList().size(); i2++) {
                        BaseItemUiInfo baseItemUiInfo = itemUiInfoGroupWrapper.getDirectoryUIInfoList().get(i2);
                        if ((baseItemUiInfo instanceof DirectoryUiInfo) && ((DirectoryUiInfo) baseItemUiInfo).getItemName().equals(str2)) {
                            return new int[]{i, i2};
                        }
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    public static void init() {
        if (isInit.getAndSet(true)) {
            return;
        }
        Iterator it = AbstractC7138.f17769.entrySet().iterator();
        while (it.hasNext()) {
            AbstractC7143 abstractC7143 = (AbstractC7143) ((Map.Entry) it.next()).getValue();
            if (!(abstractC7143 instanceof AbstractC9632) || ((AbstractC9632) abstractC7143).mo11810(AbstractC3888.m7268())) {
                if (!abstractC7143.getItemPath().equals("NO_PATH")) {
                    String[] strArrSplit = abstractC7143.getItemPath().split("/");
                    ItemUiInfo itemUiInfo = new ItemUiInfo(strArrSplit);
                    itemUiInfo.item = abstractC7143;
                    int length = strArrSplit.length;
                    if (length == 3) {
                        List<Object> list = rootContainer;
                        if (!isContainsGroup(list, strArrSplit[0])) {
                            ItemUiInfoGroupWrapper itemUiInfoGroupWrapper = new ItemUiInfoGroupWrapper();
                            itemUiInfoGroupWrapper.setGroupName(strArrSplit[0]);
                            list.add(itemUiInfoGroupWrapper);
                        }
                        if (!isContainsDir(strArrSplit[0], strArrSplit[1])) {
                            addDirUiInfo(strArrSplit[0], new DirectoryUiInfo(strArrSplit));
                        }
                        int[] iArrFindInfoIndex = findInfoIndex(strArrSplit[0], strArrSplit[1]);
                        if (iArrFindInfoIndex != null) {
                            ((DirectoryUiInfo) ((ItemUiInfoGroupWrapper) list.get(iArrFindInfoIndex[0])).getDirectoryUIInfoList().get(iArrFindInfoIndex[1])).addItemUiInfo(itemUiInfo);
                        }
                    } else if (length == 4) {
                        List<Object> list2 = rootContainer;
                        if (!isContainsGroup(list2, strArrSplit[0])) {
                            ItemUiInfoGroupWrapper itemUiInfoGroupWrapper2 = new ItemUiInfoGroupWrapper();
                            itemUiInfoGroupWrapper2.setGroupName(strArrSplit[0]);
                            list2.add(itemUiInfoGroupWrapper2);
                        }
                        if (!isContainsDir(strArrSplit[0], strArrSplit[1])) {
                            addDirUiInfo(strArrSplit[0], new DirectoryUiInfo(strArrSplit));
                        }
                        int[] iArrFindInfoIndex2 = findInfoIndex(strArrSplit[0], strArrSplit[1]);
                        if (iArrFindInfoIndex2 != null) {
                            DirectoryUiInfo directoryUiInfo = (DirectoryUiInfo) ((ItemUiInfoGroupWrapper) list2.get(iArrFindInfoIndex2[0])).getDirectoryUIInfoList().get(iArrFindInfoIndex2[1]);
                            List<ItemUiInfoGroupWrapper> list3 = directoryUiInfo.groupWrapperList;
                            if (!isContainsGroup(list3, strArrSplit[2])) {
                                ItemUiInfoGroupWrapper itemUiInfoGroupWrapper3 = new ItemUiInfoGroupWrapper();
                                itemUiInfoGroupWrapper3.setGroupName(strArrSplit[2]);
                                directoryUiInfo.addGroupWrapper(itemUiInfoGroupWrapper3);
                            }
                            for (ItemUiInfoGroupWrapper itemUiInfoGroupWrapper4 : list3) {
                                if (itemUiInfoGroupWrapper4.getGroupName().equals(strArrSplit[2])) {
                                    itemUiInfoGroupWrapper4.getDirectoryUIInfoList().add(itemUiInfo);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean isContainsDir(String str, String str2) {
        for (Object obj : rootContainer) {
            if (obj instanceof ItemUiInfoGroupWrapper) {
                ItemUiInfoGroupWrapper itemUiInfoGroupWrapper = (ItemUiInfoGroupWrapper) obj;
                if (itemUiInfoGroupWrapper.getGroupName().equals(str)) {
                    for (BaseItemUiInfo baseItemUiInfo : itemUiInfoGroupWrapper.getDirectoryUIInfoList()) {
                        if ((baseItemUiInfo instanceof DirectoryUiInfo) && ((DirectoryUiInfo) baseItemUiInfo).getItemName().equals(str2)) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    private static <T> boolean isContainsGroup(List<T> list, String str) {
        for (T t : list) {
            if ((t instanceof ItemUiInfoGroupWrapper) && ((ItemUiInfoGroupWrapper) t).getGroupName().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
