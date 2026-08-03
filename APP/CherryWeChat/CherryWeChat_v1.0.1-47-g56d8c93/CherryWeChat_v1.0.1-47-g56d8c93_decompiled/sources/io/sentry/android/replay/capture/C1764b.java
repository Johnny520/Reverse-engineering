package io.sentry.android.replay.capture;

import io.sentry.android.replay.C1789j;
import io.sentry.config.AbstractC1856a;
import java.util.Date;
import p000.AbstractC0073Bn;
import p000.C0829TC;
import p000.InterfaceC0884Ui;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1764b extends AbstractC0073Bn implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6417b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6418c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f6419d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC1767e f6420e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1764b(Object obj, Object obj2, AbstractC1767e abstractC1767e, int i) {
        super(0);
        this.f6417b = i;
        this.f6418c = obj;
        this.f6419d = obj2;
        this.f6420e = abstractC1767e;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f6417b) {
            case 0:
                C1789j c1789j = this.f6420e.f6436h;
                if (c1789j != null) {
                    c1789j.m3973i("replay.id", String.valueOf(this.f6419d));
                }
                break;
            case 1:
                C1789j c1789j2 = this.f6420e.f6436h;
                if (c1789j2 != null) {
                    c1789j2.m3973i("replay.type", String.valueOf(this.f6419d));
                }
                break;
            case 2:
                Date date = (Date) this.f6419d;
                C1789j c1789j3 = this.f6420e.f6436h;
                if (c1789j3 != null) {
                    c1789j3.m3973i("segment.timestamp", date == null ? null : AbstractC1856a.m4073t(date));
                }
                break;
            default:
                C1789j c1789j4 = this.f6420e.f6436h;
                if (c1789j4 != null) {
                    c1789j4.m3973i("replay.screen-at-start", String.valueOf(this.f6419d));
                }
                break;
        }
        return C0829TC.f2620a;
    }
}
