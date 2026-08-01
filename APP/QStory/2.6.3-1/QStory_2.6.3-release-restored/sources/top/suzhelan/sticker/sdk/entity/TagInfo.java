package top.suzhelan.sticker.sdk.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p283.InterfaceC9094;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m151d2 = {"Ltop/suzhelan/sticker/sdk/entity/TagInfo;", "", "name", "", "count", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "online-sticker-sdk_release"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final /* data */ class TagInfo {

    @InterfaceC9094("count")
    private final int count;

    @InterfaceC9094("name")
    private final String name;

    public TagInfo(String str, int i) {
        str.getClass();
        this.name = str;
        this.count = i;
    }

    public static /* synthetic */ TagInfo copy$default(TagInfo tagInfo, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tagInfo.name;
        }
        if ((i2 & 2) != 0) {
            i = tagInfo.count;
        }
        return tagInfo.copy(str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final TagInfo copy(String name, int count) {
        name.getClass();
        return new TagInfo(name, count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagInfo)) {
            return false;
        }
        TagInfo tagInfo = (TagInfo) other;
        return AbstractC5227.m9466(this.name, tagInfo.name) && this.count == tagInfo.count;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Integer.hashCode(this.count) + (this.name.hashCode() * 31);
    }

    public String toString() {
        return "TagInfo(name=" + this.name + ", count=" + this.count + ")";
    }
}
