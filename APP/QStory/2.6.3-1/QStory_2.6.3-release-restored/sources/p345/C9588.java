package p345;

import com.alibaba.fastjson2.AbstractC3738;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p103.C7897;
import p104.AbstractC8005;
import p104.C7981;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9588 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7380 f25029;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25030;

    public /* synthetic */ C9588(InterfaceC7380 interfaceC7380, int i) {
        this.f25030 = i;
        this.f25029 = interfaceC7380;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f25030;
        InterfaceC7380 interfaceC7380 = this.f25029;
        C7981 c7981 = (C7981) obj;
        AbstractC8005 abstractC8005 = (AbstractC8005) obj2;
        switch (i) {
            case 0:
                "args";
                c7981.getClass();
                return AbstractC3738.m6853(AbstractC9594.m15026(new C7897(interfaceC7380, 5, c7981)), abstractC8005);
            default:
                "args";
                c7981.getClass();
                interfaceC7380.invoke(AbstractC3738.m6899("config_name", c7981), AbstractC3738.m6899("key", c7981), c7981);
                return AbstractC3738.m6891("保存成功", abstractC8005, false);
        }
    }
}
