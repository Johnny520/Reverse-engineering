package p089;

import kotlin.C6008;
import kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7773 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f18869;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18870;

    public /* synthetic */ C7773(String str, int i) {
        this.f18870 = i;
        this.f18869 = str;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f18870;
        C6008 c6008 = C6008.f15084;
        String str = this.f18869;
        C7762 c7762 = (C7762) obj;
        switch (i) {
            case 0:
                c7762.getClass();
                c7762.m12788(str, AbstractC7770.f18860);
                break;
            case 1:
                c7762.getClass();
                C7754 c7754 = AbstractC7770.f18860;
                c7762.m12788(str, c7754, c7754);
                ReturnValueStatus returnValueStatus = ReturnValueStatus.MustUse;
                break;
            case 2:
                c7762.getClass();
                C7754 c77542 = AbstractC7770.f18860;
                c7762.m12789(str, c77542, c77542);
                break;
            case 3:
                c7762.getClass();
                c7762.m12789(str, AbstractC7770.f18860);
                break;
            case 4:
                c7762.getClass();
                c7762.m12789(str, AbstractC7770.f18860);
                break;
            case 5:
                c7762.getClass();
                c7762.m12788(str, AbstractC7770.f18860);
                break;
            default:
                c7762.getClass();
                c7762.m12788(str, AbstractC7770.f18860);
                break;
        }
        return c6008;
    }
}
