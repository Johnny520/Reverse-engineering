package p000a;

import androidx.activity.OnBackPressedDispatcher;
import java.util.ListIterator;

/* JADX INFO: renamed from: a.Vb */
/* JADX INFO: loaded from: classes.dex */
public final class C0391Vb extends AbstractC0859u9 implements InterfaceC0064D7 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1480b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ OnBackPressedDispatcher f1481c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0391Vb(OnBackPressedDispatcher onBackPressedDispatcher, int i) {
        super(1);
        this.f1480b = i;
        this.f1481c = onBackPressedDispatcher;
    }

    @Override // p000a.InterfaceC0064D7
    /* JADX INFO: renamed from: f */
    public final Object mo53f(Object obj) {
        AbstractC0373Ub abstractC0373UbPrevious;
        AbstractC0373Ub abstractC0373UbPrevious2;
        switch (this.f1480b) {
            case 0:
                C0309R1 c0309r1 = (C0309R1) obj;
                C0631i9.m1482e(c0309r1, "backEvent");
                OnBackPressedDispatcher onBackPressedDispatcher = this.f1481c;
                C0094F1<AbstractC0373Ub> c0094f1 = onBackPressedDispatcher.f3610b;
                c0094f1.getClass();
                ListIterator<AbstractC0373Ub> listIterator = c0094f1.listIterator(c0094f1.f305c);
                while (true) {
                    if (listIterator.hasPrevious()) {
                        abstractC0373UbPrevious = listIterator.previous();
                        if (abstractC0373UbPrevious.f1395a) {
                        }
                    } else {
                        abstractC0373UbPrevious = null;
                    }
                }
                AbstractC0373Ub abstractC0373Ub = abstractC0373UbPrevious;
                onBackPressedDispatcher.f3611c = abstractC0373Ub;
                if (abstractC0373Ub != null) {
                    abstractC0373Ub.mo1001d(c0309r1);
                }
                break;
            default:
                C0309R1 c0309r12 = (C0309R1) obj;
                C0631i9.m1482e(c0309r12, "backEvent");
                OnBackPressedDispatcher onBackPressedDispatcher2 = this.f1481c;
                AbstractC0373Ub abstractC0373Ub2 = onBackPressedDispatcher2.f3611c;
                if (abstractC0373Ub2 == null) {
                    C0094F1<AbstractC0373Ub> c0094f12 = onBackPressedDispatcher2.f3610b;
                    c0094f12.getClass();
                    ListIterator<AbstractC0373Ub> listIterator2 = c0094f12.listIterator(c0094f12.f305c);
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            abstractC0373UbPrevious2 = listIterator2.previous();
                            if (abstractC0373UbPrevious2.f1395a) {
                            }
                        } else {
                            abstractC0373UbPrevious2 = null;
                        }
                    }
                    abstractC0373Ub2 = abstractC0373UbPrevious2;
                }
                if (abstractC0373Ub2 != null) {
                    abstractC0373Ub2.mo1000c(c0309r12);
                }
                break;
        }
        return C0413Wf.f1577a;
    }
}
