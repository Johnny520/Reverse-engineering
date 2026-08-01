package p073;

import kotlin.C5176;
import kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6944 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f18524;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18525;

    public /* synthetic */ C6944(String str, int i) {
        this.f18525 = i;
        this.f18524 = str;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f18525;
        C5176 c5176 = C5176.f14739;
        String str = this.f18524;
        C6933 c6933 = (C6933) obj;
        switch (i) {
            case 0:
                c6933.getClass();
                c6933.m12229(str, AbstractC6941.f18515);
                break;
            case 1:
                c6933.getClass();
                C6925 c6925 = AbstractC6941.f18515;
                c6933.m12229(str, c6925, c6925);
                ReturnValueStatus returnValueStatus = ReturnValueStatus.MustUse;
                break;
            case 2:
                c6933.getClass();
                C6925 c69252 = AbstractC6941.f18515;
                c6933.m12230(str, c69252, c69252);
                break;
            case 3:
                c6933.getClass();
                c6933.m12230(str, AbstractC6941.f18515);
                break;
            case 4:
                c6933.getClass();
                c6933.m12230(str, AbstractC6941.f18515);
                break;
            case 5:
                c6933.getClass();
                c6933.m12229(str, AbstractC6941.f18515);
                break;
            default:
                c6933.getClass();
                c6933.m12229(str, AbstractC6941.f18515);
                break;
        }
        return c5176;
    }
}
