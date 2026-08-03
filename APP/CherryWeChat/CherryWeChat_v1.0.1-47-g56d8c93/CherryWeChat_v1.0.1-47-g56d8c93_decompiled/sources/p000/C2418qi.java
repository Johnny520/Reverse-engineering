package p000;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: qi */
/* JADX INFO: loaded from: classes.dex */
public final class C2418qi implements InterfaceC0731R0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8476a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC2805zi f8477b;

    public /* synthetic */ C2418qi(AbstractC2805zi abstractC2805zi, int i) {
        this.f8476a = i;
        this.f8477b = abstractC2805zi;
    }

    @Override // p000.InterfaceC0731R0
    /* JADX INFO: renamed from: a */
    public final void mo1524a(Object obj) {
        switch (this.f8476a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                AbstractC2805zi abstractC2805zi = this.f8477b;
                C2676wi c2676wi = (C2676wi) abstractC2805zi.f9481D.pollFirst();
                if (c2676wi != null) {
                    abstractC2805zi.f9494c.m4877o(c2676wi.f9236a);
                    break;
                }
                break;
            case 1:
                C0689Q0 c0689q0 = (C0689Q0) obj;
                AbstractC2805zi abstractC2805zi2 = this.f8477b;
                C2676wi c2676wi2 = (C2676wi) abstractC2805zi2.f9481D.pollLast();
                if (c2676wi2 != null) {
                    AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hiM4877o = abstractC2805zi2.f9494c.m4877o(c2676wi2.f9236a);
                    if (abstractComponentCallbacksC1503hiM4877o != null) {
                        int i2 = c0689q0.f2217a;
                        Intent intent = c0689q0.f2218b;
                        if (AbstractC2805zi.m5374G(2)) {
                            abstractComponentCallbacksC1503hiM4877o.toString();
                            Objects.toString(intent);
                        }
                        break;
                    }
                }
                break;
            default:
                C0689Q0 c0689q02 = (C0689Q0) obj;
                AbstractC2805zi abstractC2805zi3 = this.f8477b;
                C2676wi c2676wi3 = (C2676wi) abstractC2805zi3.f9481D.pollFirst();
                if (c2676wi3 != null) {
                    AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hiM4877o2 = abstractC2805zi3.f9494c.m4877o(c2676wi3.f9236a);
                    if (abstractComponentCallbacksC1503hiM4877o2 != null) {
                        int i3 = c0689q02.f2217a;
                        Intent intent2 = c0689q02.f2218b;
                        if (AbstractC2805zi.m5374G(2)) {
                            abstractComponentCallbacksC1503hiM4877o2.toString();
                            Objects.toString(intent2);
                        }
                        break;
                    }
                }
                break;
        }
    }
}
