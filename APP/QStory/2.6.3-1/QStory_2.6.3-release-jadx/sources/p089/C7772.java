package p089;

import kotlin.C6008;
import kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7772 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f18866;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f18867;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18868;

    public /* synthetic */ C7772(int i, String str, String str2) {
        this.f18868 = i;
        this.f18866 = str;
        this.f18867 = str2;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f18868;
        C6008 c6008 = C6008.f15084;
        String str = this.f18867;
        String str2 = this.f18866;
        C7762 c7762 = (C7762) obj;
        switch (i) {
            case 0:
                c7762.getClass();
                C7754 c7754 = AbstractC7770.f18860;
                c7762.m12789(str2, c7754);
                C7754 c77542 = AbstractC7770.f18861;
                c7762.m12789(str, c7754, c7754, c77542, c77542);
                c7762.m12788(str2, c77542);
                break;
            case 1:
                c7762.getClass();
                C7754 c77543 = AbstractC7770.f18860;
                c7762.m12789(str2, c77543);
                c7762.m12789(str, c77543, c77543, c77543);
                c7762.m12788(str2, c77543);
                break;
            case 2:
                c7762.getClass();
                C7754 c77544 = AbstractC7770.f18860;
                c7762.m12789(str2, c77544);
                C7754 c77545 = AbstractC7770.f18859;
                C7754 c77546 = AbstractC7770.f18861;
                c7762.m12789(str, c77544, c77544, c77545, c77546);
                c7762.m12788(str2, c77546);
                break;
            case 3:
                c7762.getClass();
                C7754 c77547 = AbstractC7770.f18860;
                c7762.m12789(str2, c77547);
                C7754 c77548 = AbstractC7770.f18859;
                c7762.m12789(str2, c77548);
                C7754 c77549 = AbstractC7770.f18861;
                c7762.m12789(str, c77547, c77548, c77548, c77549);
                c7762.m12788(str2, c77549);
                break;
            case 4:
                c7762.getClass();
                C7754 c775410 = AbstractC7770.f18859;
                c7762.m12789(str2, c775410);
                c7762.m12788(str, AbstractC7770.f18860, c775410);
                ReturnValueStatus returnValueStatus = ReturnValueStatus.MustUse;
                break;
            default:
                c7762.getClass();
                c7762.m12789(str2, AbstractC7770.f18861);
                c7762.m12788(str, AbstractC7770.f18860, AbstractC7770.f18859);
                ReturnValueStatus returnValueStatus2 = ReturnValueStatus.MustUse;
                break;
        }
        return c6008;
    }
}
