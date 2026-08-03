package androidx.lifecycle;

import androidx.lifecycle.AbstractC1116e;
import java.util.HashMap;
import kotlin.Metadata;
import p000a.InterfaceC0935y9;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m3302d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3303d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/g;", "lifecycle-common"}, m3304k = 1, m3305mv = {1, 8, 0}, m3307xi = 48)
public final class CompositeGeneratedAdaptersObserver implements InterfaceC1118g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1113b[] f4639a;

    public CompositeGeneratedAdaptersObserver(InterfaceC1113b[] interfaceC1113bArr) {
        this.f4639a = interfaceC1113bArr;
    }

    @Override // androidx.lifecycle.InterfaceC1118g
    /* JADX INFO: renamed from: a */
    public final void mo485a(InterfaceC0935y9 interfaceC0935y9, AbstractC1116e.a aVar) {
        new HashMap();
        InterfaceC1113b[] interfaceC1113bArr = this.f4639a;
        for (InterfaceC1113b interfaceC1113b : interfaceC1113bArr) {
            interfaceC1113b.m2589a();
        }
        for (InterfaceC1113b interfaceC1113b2 : interfaceC1113bArr) {
            interfaceC1113b2.m2589a();
        }
    }
}
