package p028F;

import android.view.ActionMode;
import android.view.View;
import p021D3.RunnableC0267d;
import p040H.InterfaceC0546d;
import p040H.InterfaceC0547e;
import p047I0.C0724e1;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p158f0.C2088t;
import p160f3.AbstractC2162v;
import p216p.C2828V;

/* JADX INFO: renamed from: F.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0348i implements InterfaceC0547e {

    /* JADX INFO: renamed from: a */
    public final View f1092a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1601c f1093b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1599a f1094c;

    /* JADX INFO: renamed from: d */
    public final C2828V f1095d = new C2828V();

    /* JADX INFO: renamed from: e */
    public final C2088t f1096e = new C2088t(new C0340a(this, 0));

    /* JADX INFO: renamed from: f */
    public final C0340a f1097f = new C0340a(this, 1);

    /* JADX INFO: renamed from: g */
    public final C0340a f1098g = new C0340a(this, 2);

    /* JADX INFO: renamed from: h */
    public ActionMode f1099h;

    /* JADX INFO: renamed from: i */
    public RunnableC0267d f1100i;

    /* JADX INFO: renamed from: j */
    public Runnable f1101j;

    public C0348i(View view, InterfaceC1601c interfaceC1601c, InterfaceC1599a interfaceC1599a) {
        this.f1092a = view;
        this.f1093b = interfaceC1601c;
        this.f1094c = interfaceC1599a;
    }

    @Override // p040H.InterfaceC0547e
    /* JADX INFO: renamed from: a */
    public final Object mo556a(InterfaceC0546d interfaceC0546d, AbstractC1184i abstractC1184i) {
        C0347h c0347h = new C0347h(this, interfaceC0546d, null, 0);
        C2828V c2828v = this.f1095d;
        c2828v.getClass();
        Object objM3982d = AbstractC2162v.m3982d(new C0724e1(c2828v, c0347h, (InterfaceC1046d) null), abstractC1184i);
        return objM3982d == EnumC1152a.f3788d ? objM3982d : C0891q.f2780a;
    }
}
