package top.suzhelan.qstory.hook.item.chat;

import p049.AbstractC7165;
import p068.InterfaceC7387;
import p303.AbstractC9234;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6693 implements InterfaceC7387 {
    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        Integer num;
        try {
            num = (Integer) AbstractC7165.m12418(Integer.TYPE, AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵呜"), obj);
        } catch (Exception unused) {
        }
        if (num != null) {
            boolean z = num.intValue() == 19;
            return Boolean.valueOf(z);
        }
        return Boolean.valueOf(z);
    }
}
