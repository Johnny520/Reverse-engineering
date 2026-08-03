package p000;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: sd */
/* JADX INFO: loaded from: classes.dex */
public final class C2499sd implements InterfaceC2777yx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8784a;

    /* JADX INFO: renamed from: b */
    public final int f8785b;

    /* JADX INFO: renamed from: c */
    public final Function2 f8786c;

    /* JADX INFO: renamed from: d */
    public final Object f8787d;

    public /* synthetic */ C2499sd(Object r1, int r2, Function2 r3, int r4) {
        this.f8784a = r4;
        this.f8787d = r1;
        this.f8785b = r2;
        this.f8786c = r3;
    }

    @Override // p000.InterfaceC2777yx
    public final Iterator iterator() {
        switch(this.f8784a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new C2589uh(this);
    L7:
        return new C2456rd(this);
    }
}
