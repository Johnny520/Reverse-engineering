package androidx.lifecycle;

import androidx.lifecycle.AbstractC1116e;
import androidx.savedstate.C1224a;
import kotlin.Metadata;
import p000a.InterfaceC0935y9;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m3302d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3303d2 = {"androidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1", "Landroidx/lifecycle/g;", "lifecycle-viewmodel-savedstate_release"}, m3304k = 1, m3305mv = {1, 8, 0}, m3307xi = 48)
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements InterfaceC1118g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC1116e f4642a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1224a f4643b;

    public LegacySavedStateHandleController$tryToAddRecreator$1(AbstractC1116e abstractC1116e, C1224a c1224a) {
        this.f4642a = abstractC1116e;
        this.f4643b = c1224a;
    }

    @Override // androidx.lifecycle.InterfaceC1118g
    /* JADX INFO: renamed from: a */
    public final void mo485a(InterfaceC0935y9 interfaceC0935y9, AbstractC1116e.a aVar) {
        if (aVar == AbstractC1116e.a.ON_START) {
            this.f4642a.mo2594c(this);
            this.f4643b.m3010d();
        }
    }
}
