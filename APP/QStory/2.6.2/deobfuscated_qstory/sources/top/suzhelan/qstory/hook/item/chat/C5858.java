package top.suzhelan.qstory.hook.item.chat;

import com.bumptech.glide.AbstractC3056;
import p032.AbstractC6317;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5858 implements InterfaceC6557 {
    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        Integer num;
        try {
            num = (Integer) AbstractC6317.m11831(Integer.TYPE, "type", obj);
        } catch (Exception unused) {
        }
        if (num != null) {
            boolean z = num.intValue() == 19;
            return Boolean.valueOf(z);
        }
        return Boolean.valueOf(z);
    }
}
