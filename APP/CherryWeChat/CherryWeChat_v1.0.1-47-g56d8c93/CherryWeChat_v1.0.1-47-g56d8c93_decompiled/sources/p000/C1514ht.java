package p000;

import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.AbstractC1767e;
import io.sentry.android.replay.capture.InterfaceC1776n;
import java.util.Date;
import java.util.ListIterator;

/* JADX INFO: renamed from: ht */
/* JADX INFO: loaded from: classes.dex */
public final class C1514ht extends AbstractC0073Bn implements InterfaceC1416fj {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f5362b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5363c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1514ht(int i, Object obj) {
        super(1);
        this.f5362b = i;
        this.f5363c = obj;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.f5362b) {
            case 0:
                C2335ot c2335ot = (C2335ot) this.f5363c;
                C0134D4 c0134d4 = c2335ot.f8204b;
                ListIterator listIterator = c0134d4.listIterator(c0134d4.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((C2461ri) objPrevious).f8673a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                C2461ri c2461ri = (C2461ri) objPrevious;
                if (c2335ot.f8205c != null) {
                    c2335ot.m4741a();
                }
                c2335ot.f8205c = c2461ri;
                break;
            case 1:
                C2335ot c2335ot2 = (C2335ot) this.f5363c;
                if (c2335ot2.f8205c == null) {
                    C0134D4 c0134d42 = c2335ot2.f8204b;
                    ListIterator listIterator2 = c0134d42.listIterator(c0134d42.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            objPrevious2 = listIterator2.previous();
                            if (((C2461ri) objPrevious2).f8673a) {
                            }
                        } else {
                            objPrevious2 = null;
                        }
                    }
                }
                break;
            default:
                Date date = (Date) obj;
                ReplayIntegration replayIntegration = (ReplayIntegration) this.f5363c;
                InterfaceC1776n interfaceC1776n = replayIntegration.f6393l;
                if (interfaceC1776n != null) {
                    ((AbstractC1767e) interfaceC1776n).m3957l(Integer.valueOf(((AbstractC1767e) interfaceC1776n).m3955j()).intValue() + 1);
                }
                InterfaceC1776n interfaceC1776n2 = replayIntegration.f6393l;
                if (interfaceC1776n2 != null) {
                    ((AbstractC1767e) interfaceC1776n2).m3958m(date);
                }
                break;
        }
        return C0829TC.f2620a;
    }
}
