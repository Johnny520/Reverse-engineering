package p040V0;

import java.util.Iterator;
import p009E0.C0180k;
import p029P0.InterfaceC0286l;

/* JADX INFO: renamed from: V0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0403f implements InterfaceC0405h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f899a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0405h f900b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0286l f901c;

    public C0403f(InterfaceC0405h r2, InterfaceC0286l r3) {
        this.f899a = 1;
        this.f900b = r2;
        this.f901c = r3;
    }

    @Override // p040V0.InterfaceC0405h
    public final Iterator iterator() {
        switch(this.f899a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new C0413p(this);
    L7:
        return new C0401d(this);
    }

    public C0403f(C0180k r2, InterfaceC0286l r3) {
        this.f899a = 0;
        C0411n r02 = C0411n.f911i;
        this.f900b = r2;
        this.f901c = r3;
    }
}
