package kotlin.reflect.jvm.internal;

import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.AbstractC4343;
import kotlin.reflect.InterfaceC5087;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5042 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5044 f14531;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14532;

    public /* synthetic */ C5042(C5044 c5044, int i) {
        this.f14532 = i;
        this.f14531 = c5044;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f14532;
        C5044 c5044 = this.f14531;
        switch (i) {
            case 0:
                boolean zM9999 = c5044.m9999();
                if (zM9999) {
                    C5073 c5073 = c5044.f14549;
                    InterfaceC5087[] interfaceC5087Arr = C5044.f14534;
                    InterfaceC5087 interfaceC5087 = interfaceC5087Arr[10];
                    Object objInvoke = c5073.invoke();
                    objInvoke.getClass();
                    C5073 c50732 = c5044.f14547;
                    InterfaceC5087 interfaceC50872 = interfaceC5087Arr[12];
                    Object objInvoke2 = c50732.invoke();
                    objInvoke2.getClass();
                    return AbstractC4343.m8825((Collection) objInvoke2, (Collection) objInvoke);
                }
                if (zM9999) {
                    C4210.m8621();
                    return null;
                }
                Collection collectionM10003 = c5044.m10003();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionM10003) {
                    if (!AbstractC5056.m10007((AbstractC5023) obj)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                boolean zM99992 = c5044.m9999();
                if (zM99992) {
                    C5073 c50733 = c5044.f14550;
                    InterfaceC5087[] interfaceC5087Arr2 = C5044.f14534;
                    InterfaceC5087 interfaceC50873 = interfaceC5087Arr2[11];
                    Object objInvoke3 = c50733.invoke();
                    objInvoke3.getClass();
                    C5073 c50734 = c5044.f14548;
                    InterfaceC5087 interfaceC50874 = interfaceC5087Arr2[13];
                    Object objInvoke4 = c50734.invoke();
                    objInvoke4.getClass();
                    return AbstractC4343.m8825((Collection) objInvoke4, (Collection) objInvoke3);
                }
                if (zM99992) {
                    C4210.m8621();
                    return null;
                }
                Collection collectionM100032 = c5044.m10003();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : collectionM100032) {
                    if (AbstractC5056.m10007((AbstractC5023) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            default:
                C5073 c50735 = c5044.f14549;
                InterfaceC5087[] interfaceC5087Arr3 = C5044.f14534;
                InterfaceC5087 interfaceC50875 = interfaceC5087Arr3[10];
                Object objInvoke5 = c50735.invoke();
                objInvoke5.getClass();
                C5073 c50736 = c5044.f14550;
                InterfaceC5087 interfaceC50876 = interfaceC5087Arr3[11];
                Object objInvoke6 = c50736.invoke();
                objInvoke6.getClass();
                return AbstractC4343.m8825((Collection) objInvoke6, (Collection) objInvoke5);
        }
    }
}
