package p279t4;

import android.content.Context;
import java.util.ArrayList;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5114x;
import p293u4.InterfaceC8514k;
import p293u4.InterfaceC8523t;
import p336x3.C9408m0;

/* JADX INFO: renamed from: t4.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8109d implements InterfaceC8108c {

    /* JADX INFO: renamed from: b */
    public final InterfaceC8514k f27059b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f27060c;

    public C8109d(InterfaceC8514k interfaceC8514k) {
        interfaceC8514k.getClass();
        this.f27059b = interfaceC8514k;
        this.f27060c = AbstractC5114x.m20793h(Integer.valueOf(C9408m0.n.m36619h()), Integer.valueOf(C9408m0.n.m36618g()), Integer.valueOf(C9408m0.n.m36613b()), Integer.valueOf(C9408m0.n.m36615d()), Integer.valueOf(C9408m0.n.m36621j()), Integer.valueOf(C9408m0.n.m36617f()), Integer.valueOf(C9408m0.n.m36622k()), Integer.valueOf(C9408m0.n.m36614c()));
    }

    @Override // p279t4.InterfaceC8108c
    /* JADX INFO: renamed from: a */
    public C8106a mo31327a(Context context) {
        context.getClass();
        return InterfaceC8523t.f28412a.m32777a().mo32776a(context, this.f27059b);
    }

    public /* synthetic */ C8109d(InterfaceC8514k interfaceC8514k, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? InterfaceC8514k.f28406a.m32766a() : interfaceC8514k);
    }
}
