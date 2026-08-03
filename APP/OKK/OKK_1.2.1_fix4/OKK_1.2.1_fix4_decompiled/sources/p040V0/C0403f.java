package p040V0;

import java.util.Iterator;
import p009E0.C0180k;
import p029P0.InterfaceC0286l;

/* JADX INFO: renamed from: V0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0403f implements InterfaceC0405h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f899a = 0;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0405h f900b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0286l f901c;

    public C0403f(InterfaceC0405h interfaceC0405h, InterfaceC0286l interfaceC0286l) {
        this.f900b = interfaceC0405h;
        this.f901c = interfaceC0286l;
    }

    @Override // p040V0.InterfaceC0405h
    public final Iterator iterator() {
        switch (this.f899a) {
            case 0:
                return new C0401d(this);
            default:
                return new C0413p(this);
        }
    }

    public C0403f(C0180k c0180k, InterfaceC0286l interfaceC0286l) {
        C0411n c0411n = C0411n.f911i;
        this.f900b = c0180k;
        this.f901c = interfaceC0286l;
    }
}
