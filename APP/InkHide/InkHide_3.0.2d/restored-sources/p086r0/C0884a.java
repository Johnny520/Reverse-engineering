package p086r0;

import java.util.Map;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: r0.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0884a implements InterfaceC0204l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f3060a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    public final Object mo8c(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        AbstractC0223g.m418e(entry, "it");
        Object value = entry.getValue();
        AbstractC0223g.m417d(value, "<get-value>(...)");
        return Boolean.valueOf(this.f3060a - ((Number) value).longValue() > 300000);
    }
}
