package p047I0;

import me.dartcv.nuke.BuildConfig;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p198m0.C2567A;

/* JADX INFO: renamed from: I0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0762t extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2381e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f2382f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0762t(int i5, int i6) {
        super(1);
        this.f2381e = i6;
        this.f2382f = i5;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f2381e) {
            case 0:
                return Boolean.valueOf(((C2567A) obj).m4490Q0(this.f2382f));
            case BuildConfig.VERSION_CODE /* 1 */:
                return Boolean.valueOf(((C2567A) obj).m4490Q0(this.f2382f));
            case 2:
                return Boolean.valueOf(((C2567A) obj).m4490Q0(this.f2382f));
            case 3:
                return Boolean.valueOf(((C2567A) obj).m4490Q0(this.f2382f));
            default:
                return Boolean.valueOf(((C2567A) obj).m4483J0(this.f2382f));
        }
    }
}
