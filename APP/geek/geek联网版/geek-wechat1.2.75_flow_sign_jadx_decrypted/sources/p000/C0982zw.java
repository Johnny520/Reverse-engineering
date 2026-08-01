package p000;

import androidx.activity.C0029a;
import com.github.megatronking.stringfog.Base64;
import java.util.ListIterator;

/* JADX INFO: renamed from: zw */
/* JADX INFO: loaded from: classes.dex */
public final class C0982zw extends AbstractC0270gq implements InterfaceC0786um {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f5627b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0029a f5628c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0982zw(C0029a c0029a, int i) {
        super(1);
        this.f5627b = i;
        this.f5628c = c0029a;
    }

    @Override // p000.InterfaceC0786um
    /* JADX INFO: renamed from: f */
    public final Object mo26f(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.f5627b) {
            case Base64.DEFAULT /* 0 */:
                AbstractC0493mp.m1857g("backEvent", (C0401k7) obj);
                C0029a c0029a = this.f5628c;
                C0400k6 c0400k6 = c0029a.f147b;
                ListIterator listIterator = c0400k6.listIterator(c0400k6.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((C0785ul) objPrevious).f4836a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                c0029a.f148c = (C0785ul) objPrevious;
                break;
            default:
                AbstractC0493mp.m1857g("backEvent", (C0401k7) obj);
                C0400k6 c0400k62 = this.f5628c.f147b;
                ListIterator listIterator2 = c0400k62.listIterator(c0400k62.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        objPrevious2 = listIterator2.previous();
                        if (((C0785ul) objPrevious2).f4836a) {
                        }
                    } else {
                        objPrevious2 = null;
                    }
                }
                break;
        }
        return C0893xh.f5258n;
    }
}
