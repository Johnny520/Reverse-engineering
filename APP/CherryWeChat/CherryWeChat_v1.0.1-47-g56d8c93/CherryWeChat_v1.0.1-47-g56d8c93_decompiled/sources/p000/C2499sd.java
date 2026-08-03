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

    public /* synthetic */ C2499sd(Object obj, int i, Function2 function2, int i2) {
        this.f8784a = i2;
        this.f8787d = obj;
        this.f8785b = i;
        this.f8786c = function2;
    }

    @Override // p000.InterfaceC2777yx
    public final Iterator iterator() {
        switch (this.f8784a) {
            case 0:
                return new C2456rd(this);
            default:
                return new C2589uh(this);
        }
    }
}
