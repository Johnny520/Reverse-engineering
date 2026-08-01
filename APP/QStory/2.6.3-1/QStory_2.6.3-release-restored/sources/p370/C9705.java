package p370;

import kotlin.jvm.internal.AbstractC5227;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9705 extends AbstractC9703 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final NewFriendInfo f25369;

    public C9705(NewFriendInfo newFriendInfo) {
        "friend";
        newFriendInfo.getClass();
        this.f25369 = newFriendInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9705) && AbstractC5227.m9466(this.f25369, ((C9705) obj).f25369);
    }

    public final int hashCode() {
        return this.f25369.hashCode();
    }

    public final String toString() {
        return "FriendItem(friend=" + this.f25369 + ')';
    }
}
