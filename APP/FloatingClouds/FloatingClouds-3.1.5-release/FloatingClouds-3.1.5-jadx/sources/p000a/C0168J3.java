package p000a;

import io.github.libxposed.api.XposedInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p000a.C0186K3;
import top.mmjz.floatingclouds.bean.MaskItemBean;

/* JADX INFO: renamed from: a.J3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0168J3 implements InterfaceC0064D7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f596a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f597b;

    public /* synthetic */ C0168J3(String str, int i) {
        this.f596a = i;
        this.f597b = str;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:8:0x001a */
    /* JADX DEBUG: Multi-variable search result rejected for r7v9, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    @Override // p000a.InterfaceC0064D7
    /* JADX INFO: renamed from: f */
    public final Object mo53f(Object obj) {
        switch (this.f596a) {
            case 0:
                MaskItemBean maskItemBean = (MaskItemBean) obj;
                C0631i9.m1482e(maskItemBean, "it");
                return Boolean.valueOf(C0631i9.m1478a(maskItemBean.getMaskId(), this.f597b));
            case 1:
                String str = this.f597b;
                XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain, "chain");
                Object objProceed = chain.proceed();
                C0915x8 c0915x8 = C0915x8.f3530a;
                if (C0915x8.m2203a()) {
                    C0816s4.f3219H = true;
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"[ChatInfoWhitelist] 临时解除期间打开聊天信息页: ".concat(str)}, 1));
                }
                return objProceed;
            default:
                XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain2, "chain");
                Object objProceed2 = chain2.proceed();
                List list = objProceed2 instanceof List ? (List) objProceed2 : null;
                if (list != null) {
                    C0186K3.f638a.getClass();
                    if (C0186K3.a.m511l() && C0186K3.a.m508i().f2446p) {
                        ArrayList arrayListM505f = C0186K3.a.m505f();
                        ArrayList arrayList = new ArrayList(C0758p3.m1800g0(arrayListM505f, 10));
                        Iterator it = arrayListM505f.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((MaskItemBean) it.next()).getMaskId());
                        }
                        HashSet hashSetM1957u0 = C0834t3.m1957u0(arrayList);
                        if (!hashSetM1957u0.isEmpty()) {
                            objProceed2 = new ArrayList(list.size());
                            for (Object obj2 : list) {
                                if (obj2 != null && !hashSetM1957u0.contains(obj2.toString())) {
                                    objProceed2.add(obj2);
                                }
                            }
                            if (objProceed2.size() != list.size()) {
                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideContactLabel: " + this.f597b + "() filtered: " + list.size() + " → " + objProceed2.size()}, 1));
                            }
                        }
                    }
                }
                return objProceed2;
        }
    }
}
