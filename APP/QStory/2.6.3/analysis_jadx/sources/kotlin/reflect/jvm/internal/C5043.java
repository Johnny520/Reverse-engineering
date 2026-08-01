package kotlin.reflect.jvm.internal;

import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.InterfaceC5088;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5043 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5045 f14533;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14534;

    public /* synthetic */ C5043(C5045 c5045, int i) {
        this.f14534 = i;
        this.f14533 = c5045;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f14534;
        C5045 c5045 = this.f14533;
        switch (i) {
            case 0:
                boolean zM9996 = c5045.m9996();
                if (zM9996) {
                    C5074 c5074 = c5045.f14551;
                    InterfaceC5088[] interfaceC5088Arr = C5045.f14536;
                    InterfaceC5088 interfaceC5088 = interfaceC5088Arr[10];
                    Object objInvoke = c5074.invoke();
                    objInvoke.getClass();
                    C5074 c50742 = c5045.f14549;
                    InterfaceC5088 interfaceC50882 = interfaceC5088Arr[12];
                    Object objInvoke2 = c50742.invoke();
                    objInvoke2.getClass();
                    return AbstractC4344.m8793((Collection) objInvoke2, (Collection) objInvoke);
                }
                if (zM9996) {
                    C4211.m8611();
                    return null;
                }
                Collection collectionM10000 = c5045.m10000();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionM10000) {
                    if (!AbstractC5057.m10004((AbstractC5024) obj)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                boolean zM99962 = c5045.m9996();
                if (zM99962) {
                    C5074 c50743 = c5045.f14552;
                    InterfaceC5088[] interfaceC5088Arr2 = C5045.f14536;
                    InterfaceC5088 interfaceC50883 = interfaceC5088Arr2[11];
                    Object objInvoke3 = c50743.invoke();
                    objInvoke3.getClass();
                    C5074 c50744 = c5045.f14550;
                    InterfaceC5088 interfaceC50884 = interfaceC5088Arr2[13];
                    Object objInvoke4 = c50744.invoke();
                    objInvoke4.getClass();
                    return AbstractC4344.m8793((Collection) objInvoke4, (Collection) objInvoke3);
                }
                if (zM99962) {
                    C4211.m8611();
                    return null;
                }
                Collection collectionM100002 = c5045.m10000();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : collectionM100002) {
                    if (AbstractC5057.m10004((AbstractC5024) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            default:
                C5074 c50745 = c5045.f14551;
                InterfaceC5088[] interfaceC5088Arr3 = C5045.f14536;
                InterfaceC5088 interfaceC50885 = interfaceC5088Arr3[10];
                Object objInvoke5 = c50745.invoke();
                objInvoke5.getClass();
                C5074 c50746 = c5045.f14552;
                InterfaceC5088 interfaceC50886 = interfaceC5088Arr3[11];
                Object objInvoke6 = c50746.invoke();
                objInvoke6.getClass();
                return AbstractC4344.m8793((Collection) objInvoke6, (Collection) objInvoke5);
        }
    }
}
