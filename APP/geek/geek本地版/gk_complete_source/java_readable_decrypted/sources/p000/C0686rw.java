package p000;

import androidx.activity.C0029a;
import com.github.megatronking.stringfog.Base64;
import java.util.ListIterator;

/* JADX INFO: renamed from: rw */
/* JADX INFO: loaded from: classes.dex */
public final class C0686rw extends AbstractC0123cq implements InterfaceC0713sm {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f4347b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0029a f4348c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0686rw(C0029a c0029a, int i) {
        super(1);
        this.f4347b = i;
        this.f4348c = c0029a;
    }

    @Override // p000.InterfaceC0713sm
    /* JADX INFO: renamed from: f */
    public final Object mo96f(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.f4347b) {
            case Base64.DEFAULT /* 0 */:
                AbstractC0346ip.m1503o("backEvent", (C0008a7) obj);
                C0029a c0029a = this.f4348c;
                C0400k6 c0400k6 = c0029a.f184b;
                ListIterator listIterator = c0400k6.listIterator(c0400k6.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((C0712sl) objPrevious).f4446a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                c0029a.f185c = (C0712sl) objPrevious;
                break;
            default:
                AbstractC0346ip.m1503o("backEvent", (C0008a7) obj);
                C0400k6 c0400k62 = this.f4348c.f184b;
                ListIterator listIterator2 = c0400k62.listIterator(c0400k62.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        objPrevious2 = listIterator2.previous();
                        if (((C0712sl) objPrevious2).f4446a) {
                        }
                    } else {
                        objPrevious2 = null;
                    }
                }
                break;
        }
        return C0819vh.f4855n;
    }
}
