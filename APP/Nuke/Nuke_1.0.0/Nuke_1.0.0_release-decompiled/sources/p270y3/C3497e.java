package p270y3;

import java.util.List;
import p112W2.InterfaceC1601c;

/* JADX INFO: renamed from: y3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3497e implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f10900d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ List f10901e;

    public /* synthetic */ C3497e(int i5, List list) {
        this.f10900d = i5;
        this.f10901e = list;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f10900d) {
            case 0:
                this.f10901e.get(((Number) obj).intValue());
                break;
            default:
                this.f10901e.get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
