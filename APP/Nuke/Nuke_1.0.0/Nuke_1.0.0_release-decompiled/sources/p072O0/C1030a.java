package p072O0;

import p084Q2.AbstractC1178c;
import p153e1.C2015k;

/* JADX INFO: renamed from: O0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1030a extends AbstractC1178c {

    /* JADX INFO: renamed from: g */
    public Object f3204g;

    /* JADX INFO: renamed from: h */
    public C2015k f3205h;

    /* JADX INFO: renamed from: i */
    public int f3206i;

    /* JADX INFO: renamed from: j */
    public int f3207j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f3208k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ ScrollCaptureCallbackC1033d f3209l;

    /* JADX INFO: renamed from: m */
    public int f3210m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1030a(ScrollCaptureCallbackC1033d scrollCaptureCallbackC1033d, AbstractC1178c abstractC1178c) {
        super(abstractC1178c);
        this.f3209l = scrollCaptureCallbackC1033d;
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        this.f3208k = obj;
        this.f3210m |= Integer.MIN_VALUE;
        return ScrollCaptureCallbackC1033d.m2110a(this.f3209l, null, null, this);
    }
}
