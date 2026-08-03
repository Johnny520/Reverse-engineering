package io.sentry.android.replay.capture;

import io.sentry.android.replay.C1789j;
import io.sentry.android.replay.C1821w;
import p000.AbstractC0073Bn;
import p000.C0829TC;
import p000.InterfaceC0884Ui;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1766d extends AbstractC0073Bn implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6424b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6425c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC1767e f6426d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f6427e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1766d(Object obj, Object obj2, AbstractC1767e abstractC1767e, int i) {
        super(0);
        this.f6424b = i;
        this.f6425c = obj;
        this.f6427e = obj2;
        this.f6426d = abstractC1767e;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f6424b) {
            case 0:
                Integer num = (Integer) this.f6427e;
                C1789j c1789j = this.f6426d.f6436h;
                if (c1789j != null) {
                    c1789j.m3973i("segment.id", String.valueOf(num));
                }
                break;
            default:
                C1821w c1821w = (C1821w) this.f6427e;
                AbstractC1767e abstractC1767e = this.f6426d;
                C1789j c1789j2 = abstractC1767e.f6436h;
                if (c1789j2 != null) {
                    c1789j2.m3973i("config.height", String.valueOf(c1821w.f6590b));
                }
                C1789j c1789j3 = abstractC1767e.f6436h;
                if (c1789j3 != null) {
                    c1789j3.m3973i("config.width", String.valueOf(c1821w.f6589a));
                }
                C1789j c1789j4 = abstractC1767e.f6436h;
                if (c1789j4 != null) {
                    c1789j4.m3973i("config.frame-rate", String.valueOf(c1821w.f6593e));
                }
                C1789j c1789j5 = abstractC1767e.f6436h;
                if (c1789j5 != null) {
                    c1789j5.m3973i("config.bit-rate", String.valueOf(c1821w.f6594f));
                }
                break;
        }
        return C0829TC.f2620a;
    }
}
