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

    public C0418c(CharSequence charSequence, int i2, int i3, InterfaceC0290p interfaceC0290p) {
        this.f928a = charSequence;
        this.f929b = i2;
        this.f930c = i3;
        this.f931d = interfaceC0290p;
    }

    @Override // p040V0.InterfaceC0405h
    public final Iterator iterator() {
        return new C0417b(this);
    }
}
