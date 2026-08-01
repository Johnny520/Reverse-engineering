package p313v9;

import java.util.ArrayList;
import java.util.List;
import p081fa.InterfaceC2377e;
import p213oa.C5695f;
import p313v9.AbstractC8869h;

/* JADX INFO: renamed from: v9.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8874l extends AbstractC8869h implements InterfaceC2377e {

    /* JADX INFO: renamed from: c */
    public final Object[] f29447c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8874l(C5695f c5695f, Object[] objArr) {
        super(c5695f, null);
        objArr.getClass();
        this.f29447c = objArr;
    }

    @Override // p081fa.InterfaceC2377e
    /* JADX INFO: renamed from: e */
    public List mo8606e() {
        Object[] objArr = this.f29447c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            AbstractC8869h.a aVar = AbstractC8869h.f29441b;
            obj.getClass();
            arrayList.add(aVar.m34042a(obj, null));
        }
        return arrayList;
    }
}
