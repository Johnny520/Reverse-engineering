package kotlin.reflect.jvm.internal;

import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.AbstractC5176;
import kotlin.reflect.InterfaceC5920;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5875 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5877 f14878;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14879;

    public /* synthetic */ C5875(C5877 c5877, int i) {
        this.f14879 = i;
        this.f14878 = c5877;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f14879;
        C5877 c5877 = this.f14878;
        switch (i) {
            case 0:
                boolean zM10555 = c5877.m10555();
                if (zM10555) {
                    C5906 c5906 = c5877.f14896;
                    InterfaceC5920[] interfaceC5920Arr = C5877.f14881;
                    InterfaceC5920 interfaceC5920 = interfaceC5920Arr[10];
                    Object objInvoke = c5906.invoke();
                    objInvoke.getClass();
                    C5906 c59062 = c5877.f14894;
                    InterfaceC5920 interfaceC59202 = interfaceC5920Arr[12];
                    Object objInvoke2 = c59062.invoke();
                    objInvoke2.getClass();
                    return AbstractC5176.m9352((Collection) objInvoke2, (Collection) objInvoke);
                }
                if (zM10555) {
                    C5043.m9170();
                    return null;
                }
                Collection collectionM10559 = c5877.m10559();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionM10559) {
                    if (!AbstractC5889.m10563((AbstractC5856) obj)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                boolean zM105552 = c5877.m10555();
                if (zM105552) {
                    C5906 c59063 = c5877.f14897;
                    InterfaceC5920[] interfaceC5920Arr2 = C5877.f14881;
                    InterfaceC5920 interfaceC59203 = interfaceC5920Arr2[11];
                    Object objInvoke3 = c59063.invoke();
                    objInvoke3.getClass();
                    C5906 c59064 = c5877.f14895;
                    InterfaceC5920 interfaceC59204 = interfaceC5920Arr2[13];
                    Object objInvoke4 = c59064.invoke();
                    objInvoke4.getClass();
                    return AbstractC5176.m9352((Collection) objInvoke4, (Collection) objInvoke3);
                }
                if (zM105552) {
                    C5043.m9170();
                    return null;
                }
                Collection collectionM105592 = c5877.m10559();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : collectionM105592) {
                    if (AbstractC5889.m10563((AbstractC5856) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            default:
                C5906 c59065 = c5877.f14896;
                InterfaceC5920[] interfaceC5920Arr3 = C5877.f14881;
                InterfaceC5920 interfaceC59205 = interfaceC5920Arr3[10];
                Object objInvoke5 = c59065.invoke();
                objInvoke5.getClass();
                C5906 c59066 = c5877.f14897;
                InterfaceC5920 interfaceC59206 = interfaceC5920Arr3[11];
                Object objInvoke6 = c59066.invoke();
                objInvoke6.getClass();
                return AbstractC5176.m9352((Collection) objInvoke6, (Collection) objInvoke5);
        }
    }
}
