package androidx.profileinstaller;

import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
enum FileSectionType {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    FileSectionType(long j) {
        this.mValue = j;
    }

    public static FileSectionType fromValue(long j) {
        FileSectionType[] fileSectionTypeArrValues = values();
        for (int i = 0; i < fileSectionTypeArrValues.length; i++) {
            if (fileSectionTypeArrValues[i].getValue() == j) {
                return fileSectionTypeArrValues[i];
            }
        }
        C5919.m11249(AbstractC2442.m4572(j, "Unsupported FileSection Type "));
        return null;
    }

    public long getValue() {
        return this.mValue;
    }
}
