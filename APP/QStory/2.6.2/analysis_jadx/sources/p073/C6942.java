package p073;

import kotlin.C5175;
import kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6942 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f18526;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f18527;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18528;

    public /* synthetic */ C6942(int i, String str, String str2) {
        this.f18528 = i;
        this.f18526 = str;
        this.f18527 = str2;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f18528;
        C5175 c5175 = C5175.f14739;
        String str = this.f18527;
        String str2 = this.f18526;
        C6932 c6932 = (C6932) obj;
        switch (i) {
            case 0:
                c6932.getClass();
                C6924 c6924 = AbstractC6940.f18520;
                c6932.m12202(str2, c6924);
                C6924 c69242 = AbstractC6940.f18521;
                c6932.m12202(str, c6924, c6924, c69242, c69242);
                c6932.m12201(str2, c69242);
                break;
            case 1:
                c6932.getClass();
                C6924 c69243 = AbstractC6940.f18520;
                c6932.m12202(str2, c69243);
                c6932.m12202(str, c69243, c69243, c69243);
                c6932.m12201(str2, c69243);
                break;
            case 2:
                c6932.getClass();
                C6924 c69244 = AbstractC6940.f18520;
                c6932.m12202(str2, c69244);
                C6924 c69245 = AbstractC6940.f18519;
                C6924 c69246 = AbstractC6940.f18521;
                c6932.m12202(str, c69244, c69244, c69245, c69246);
                c6932.m12201(str2, c69246);
                break;
            case 3:
                c6932.getClass();
                C6924 c69247 = AbstractC6940.f18520;
                c6932.m12202(str2, c69247);
                C6924 c69248 = AbstractC6940.f18519;
                c6932.m12202(str2, c69248);
                C6924 c69249 = AbstractC6940.f18521;
                c6932.m12202(str, c69247, c69248, c69248, c69249);
                c6932.m12201(str2, c69249);
                break;
            case 4:
                c6932.getClass();
                C6924 c692410 = AbstractC6940.f18519;
                c6932.m12202(str2, c692410);
                c6932.m12201(str, AbstractC6940.f18520, c692410);
                ReturnValueStatus returnValueStatus = ReturnValueStatus.MustUse;
                break;
            default:
                c6932.getClass();
                c6932.m12202(str2, AbstractC6940.f18521);
                c6932.m12201(str, AbstractC6940.f18520, AbstractC6940.f18519);
                ReturnValueStatus returnValueStatus2 = ReturnValueStatus.MustUse;
                break;
        }
        return c5175;
    }
}
