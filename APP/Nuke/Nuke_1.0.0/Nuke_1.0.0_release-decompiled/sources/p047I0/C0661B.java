package p047I0;

import p084Q2.AbstractC1178c;
import p172h3.C2242b;
import p186k.C2440v;

/* JADX INFO: renamed from: I0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0661B extends AbstractC1178c {

    /* JADX INFO: renamed from: g */
    public C2440v f2096g;

    /* JADX INFO: renamed from: h */
    public C2242b f2097h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f2098i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC0667E f2099j;

    /* JADX INFO: renamed from: k */
    public int f2100k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0661B(ViewOnAttachStateChangeListenerC0667E viewOnAttachStateChangeListenerC0667E, AbstractC1178c abstractC1178c) {
        super(abstractC1178c);
        this.f2099j = viewOnAttachStateChangeListenerC0667E;
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        this.f2098i = obj;
        this.f2100k |= Integer.MIN_VALUE;
        return this.f2099j.m1147e(this);
    }
}
