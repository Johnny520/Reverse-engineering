package p073;

import kotlin.C5175;
import kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6943 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f18529;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18530;

    public /* synthetic */ C6943(String str, int i) {
        this.f18530 = i;
        this.f18529 = str;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f18530;
        C5175 c5175 = C5175.f14739;
        String str = this.f18529;
        C6932 c6932 = (C6932) obj;
        switch (i) {
            case 0:
                c6932.getClass();
                c6932.m12201(str, AbstractC6940.f18520);
                break;
            case 1:
                c6932.getClass();
                C6924 c6924 = AbstractC6940.f18520;
                c6932.m12201(str, c6924, c6924);
                ReturnValueStatus returnValueStatus = ReturnValueStatus.MustUse;
                break;
            case 2:
                c6932.getClass();
                C6924 c69242 = AbstractC6940.f18520;
                c6932.m12202(str, c69242, c69242);
                break;
            case 3:
                c6932.getClass();
                c6932.m12202(str, AbstractC6940.f18520);
                break;
            case 4:
                c6932.getClass();
                c6932.m12202(str, AbstractC6940.f18520);
                break;
            case 5:
                c6932.getClass();
                c6932.m12201(str, AbstractC6940.f18520);
                break;
            default:
                c6932.getClass();
                c6932.m12201(str, AbstractC6940.f18520);
                break;
        }
        return c5175;
    }
}
