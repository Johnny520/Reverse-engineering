package p073;

import kotlin.C5176;
import kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6943 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f18521;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f18522;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18523;

    public /* synthetic */ C6943(int i, String str, String str2) {
        this.f18523 = i;
        this.f18521 = str;
        this.f18522 = str2;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f18523;
        C5176 c5176 = C5176.f14739;
        String str = this.f18522;
        String str2 = this.f18521;
        C6933 c6933 = (C6933) obj;
        switch (i) {
            case 0:
                c6933.getClass();
                C6925 c6925 = AbstractC6941.f18515;
                c6933.m12230(str2, c6925);
                C6925 c69252 = AbstractC6941.f18516;
                c6933.m12230(str, c6925, c6925, c69252, c69252);
                c6933.m12229(str2, c69252);
                break;
            case 1:
                c6933.getClass();
                C6925 c69253 = AbstractC6941.f18515;
                c6933.m12230(str2, c69253);
                c6933.m12230(str, c69253, c69253, c69253);
                c6933.m12229(str2, c69253);
                break;
            case 2:
                c6933.getClass();
                C6925 c69254 = AbstractC6941.f18515;
                c6933.m12230(str2, c69254);
                C6925 c69255 = AbstractC6941.f18514;
                C6925 c69256 = AbstractC6941.f18516;
                c6933.m12230(str, c69254, c69254, c69255, c69256);
                c6933.m12229(str2, c69256);
                break;
            case 3:
                c6933.getClass();
                C6925 c69257 = AbstractC6941.f18515;
                c6933.m12230(str2, c69257);
                C6925 c69258 = AbstractC6941.f18514;
                c6933.m12230(str2, c69258);
                C6925 c69259 = AbstractC6941.f18516;
                c6933.m12230(str, c69257, c69258, c69258, c69259);
                c6933.m12229(str2, c69259);
                break;
            case 4:
                c6933.getClass();
                C6925 c692510 = AbstractC6941.f18514;
                c6933.m12230(str2, c692510);
                c6933.m12229(str, AbstractC6941.f18515, c692510);
                ReturnValueStatus returnValueStatus = ReturnValueStatus.MustUse;
                break;
            default:
                c6933.getClass();
                c6933.m12230(str2, AbstractC6941.f18516);
                c6933.m12229(str, AbstractC6941.f18515, AbstractC6941.f18514);
                ReturnValueStatus returnValueStatus2 = ReturnValueStatus.MustUse;
                break;
        }
        return c5176;
    }
}
