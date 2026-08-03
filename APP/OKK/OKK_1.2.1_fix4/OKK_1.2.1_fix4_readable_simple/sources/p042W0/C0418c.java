package p042W0;

import java.util.Iterator;
import p029P0.InterfaceC0290p;
import p040V0.InterfaceC0405h;

/* JADX INFO: renamed from: W0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0418c implements InterfaceC0405h {

    /* JADX INFO: renamed from: a */
    public final CharSequence f928a;

    /* JADX INFO: renamed from: b */
    public final int f929b;

    /* JADX INFO: renamed from: c */
    public final int f930c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0290p f931d;

    public C0418c(CharSequence r1, int r2, int r3, InterfaceC0290p r4) {
        this.f928a = r1;
        this.f929b = r2;
        this.f930c = r3;
        this.f931d = r4;
    }

    @Override // p040V0.InterfaceC0405h
    public final Iterator iterator() {
        return new C0417b(this);
    }
}
