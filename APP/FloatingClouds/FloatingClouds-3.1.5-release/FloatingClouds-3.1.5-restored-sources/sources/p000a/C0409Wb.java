package p000a;

import androidx.activity.OnBackPressedDispatcher;
import java.util.ListIterator;

/* JADX INFO: renamed from: a.Wb */
/* JADX INFO: loaded from: classes.dex */
public final class C0409Wb extends AbstractC0859u9 implements InterfaceC0819s7 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1557b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ OnBackPressedDispatcher f1558c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0409Wb(OnBackPressedDispatcher onBackPressedDispatcher, int i) {
        super(0);
        this.f1557b = i;
        this.f1558c = onBackPressedDispatcher;
    }

    @Override // p000a.InterfaceC0819s7
    /* JADX INFO: renamed from: a */
    public final Object mo31a() {
        AbstractC0373Ub abstractC0373UbPrevious;
        switch (this.f1557b) {
            case 0:
                this.f1558c.m2283b();
                break;
            case 1:
                OnBackPressedDispatcher onBackPressedDispatcher = this.f1558c;
                AbstractC0373Ub abstractC0373Ub = onBackPressedDispatcher.f3611c;
                if (abstractC0373Ub == null) {
                    C0094F1<AbstractC0373Ub> c0094f1 = onBackPressedDispatcher.f3610b;
                    ListIterator<AbstractC0373Ub> listIterator = c0094f1.listIterator(c0094f1.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            abstractC0373UbPrevious = listIterator.previous();
                            if (abstractC0373UbPrevious.f1395a) {
                            }
                        } else {
                            abstractC0373UbPrevious = null;
                        }
                    }
                    abstractC0373Ub = abstractC0373UbPrevious;
                }
                onBackPressedDispatcher.f3611c = null;
                if (abstractC0373Ub != null) {
                    abstractC0373Ub.mo998a();
                }
                break;
            default:
                this.f1558c.m2283b();
                break;
        }
        return C0413Wf.f1577a;
    }
}
