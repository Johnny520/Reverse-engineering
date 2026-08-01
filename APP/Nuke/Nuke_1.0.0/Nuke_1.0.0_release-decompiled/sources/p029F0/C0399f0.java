package p029F0;

import java.util.ArrayList;
import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: F0.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0399f0 extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1222e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ArrayList f1223f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0399f0(int i5, ArrayList arrayList) {
        super(1);
        this.f1222e = i5;
        this.f1223f = arrayList;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f1222e) {
            case 0:
                AbstractC0389a0 abstractC0389a0 = (AbstractC0389a0) obj;
                ArrayList arrayList = this.f1223f;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    AbstractC0389a0.m661l(abstractC0389a0, (AbstractC0391b0) arrayList.get(i5), 0, 0);
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC0389a0 abstractC0389a02 = (AbstractC0389a0) obj;
                ArrayList arrayList2 = this.f1223f;
                int size2 = arrayList2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    AbstractC0389a0.m660k(abstractC0389a02, (AbstractC0391b0) arrayList2.get(i6), 0, 0);
                }
                break;
            case 2:
                AbstractC0389a0 abstractC0389a03 = (AbstractC0389a0) obj;
                ArrayList arrayList3 = this.f1223f;
                int iM4208u = AbstractC2352g.m4208u(arrayList3);
                if (iM4208u >= 0) {
                    int i7 = 0;
                    while (true) {
                        AbstractC0389a0.m660k(abstractC0389a03, (AbstractC0391b0) arrayList3.get(i7), 0, 0);
                        if (i7 != iM4208u) {
                            i7++;
                        }
                    }
                }
                break;
            default:
                AbstractC0389a0 abstractC0389a04 = (AbstractC0389a0) obj;
                ArrayList arrayList4 = this.f1223f;
                int size3 = arrayList4.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    AbstractC0389a0.m658i(abstractC0389a04, (AbstractC0391b0) arrayList4.get(i8), 0, 0);
                }
                break;
        }
        return C0891q.f2780a;
    }
}
