package p050c0;

import java.util.Map;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.y1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0712y1 implements InterfaceC0286l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f2244a;

    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        AbstractC0307g.m703e(entry, "<destruct>");
        Object value = entry.getValue();
        AbstractC0307g.m702d(value, "component2(...)");
        return Boolean.valueOf(this.f2244a - ((Long) value).longValue() > 604800000);
    }
}
