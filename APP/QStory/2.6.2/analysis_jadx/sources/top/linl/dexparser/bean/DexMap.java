package top.linl.dexparser.bean;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class DexMap {
    public static final int TYPE_ANNOTATIONS_DIRECTORY_ITEM = 8198;
    public static final int TYPE_ANNOTATION_ITEM = 8196;
    public static final int TYPE_ANNOTATION_SET_ITEM = 4099;
    public static final int TYPE_ANNOTATION_SET_REF_LIST = 4098;
    public static final int TYPE_CALL_SITE_ID_ITEM = 7;
    public static final int TYPE_CLASS_DATA_ITEM = 8192;
    public static final int TYPE_CLASS_DEF_ITEM = 6;
    public static final int TYPE_CODE_ITEM = 8193;
    public static final int TYPE_DEBUG_INFO_ITEM = 8195;
    public static final int TYPE_ENCODED_ARRAY_ITEM = 8197;
    public static final int TYPE_FIELD_ID_ITEM = 4;
    public static final int TYPE_HEADER_ITEM = 0;
    public static final int TYPE_HIDDENAPI_CLASS_DATA_ITEM = 61440;
    public static final int TYPE_MAP_LIST = 4096;
    public static final int TYPE_METHOD_HANDLE_ITEM = 8;
    public static final int TYPE_METHOD_ID_ITEM = 5;
    public static final int TYPE_PROTO_ID_ITEM = 3;
    public static final int TYPE_STRING_DATA_ITEM = 8194;
    public static final int TYPE_STRING_ID_ITEM = 1;
    public static final int TYPE_TYPE_ID_ITEM = 2;
    public static final int TYPE_TYPE_LIST = 4097;
    private final LinkedHashMap<Integer, Item> itemList = new LinkedHashMap<>();

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    /* JADX INFO: loaded from: classes2.dex */
    public static class Item {
        public int offset;
        public int size;
        public int type;
        public int unused;

        public Item(int i, int i2, int i3) {
            this.type = i;
            this.size = i2;
            this.offset = i3;
        }
    }

    public void addItem(int i, int i2, int i3) {
        this.itemList.put(Integer.valueOf(i), new Item(i, i2, i3));
    }

    public Item findItem(int i) {
        return this.itemList.get(Integer.valueOf(i));
    }
}
