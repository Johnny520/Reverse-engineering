package p345;

import kotlin.C6008;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9589 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f25031;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ String f25032;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25033;

    public /* synthetic */ C9589(int i, String str, String str2) {
        this.f25033 = i;
        this.f25031 = str;
        this.f25032 = str2;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f25033;
        C6008 c6008 = C6008.f15084;
        String str = this.f25032;
        String str2 = this.f25031;
        C9595 c9595 = (C9595) obj;
        switch (i) {
            case 0:
                "$this$jsonObject";
                c9595.getClass();
                c9595.m15027(str2, "name");
                c9595.m15027("boolean", "type");
                c9595.m15027(str, "description");
                break;
            case 1:
                "$this$jsonObject";
                c9595.getClass();
                c9595.m15027(str2, "name");
                c9595.m15027("integer", "type");
                c9595.m15027(str, "description");
                break;
            case 2:
                "$this$jsonObject";
                c9595.getClass();
                c9595.m15027(str2, "name");
                c9595.m15027("number", "type");
                c9595.m15027(str, "description");
                break;
            case 3:
                "$this$jsonObject";
                c9595.getClass();
                c9595.m15027(str2, "name");
                c9595.m15027("object", "type");
                c9595.m15027(str, "description");
                break;
            default:
                "$this$jsonObject";
                c9595.getClass();
                c9595.m15027(str2, "name");
                c9595.m15027("string", "type");
                c9595.m15027(str, "description");
                break;
        }
        return c6008;
    }
}
