package p032c5;

import bsh.C1259t2;
import p254r5.AbstractC6487a;

/* JADX INFO: renamed from: c5.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1327a extends AbstractC1347u {

    /* JADX INFO: renamed from: b */
    public final AbstractC6487a f3967b;

    /* JADX INFO: renamed from: c */
    public final int f3968c;

    public C1327a(AbstractC6487a abstractC6487a, int i10) {
        super("AnnotationDefault");
        if (abstractC6487a == null) {
            C1259t2.m5095a("value == null");
            throw null;
        }
        this.f3967b = abstractC6487a;
        this.f3968c = i10;
    }

    @Override // p094g5.InterfaceC2518a
    /* JADX INFO: renamed from: a */
    public int mo5336a() {
        return this.f3968c + 6;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC6487a m5337b() {
        return this.f3967b;
    }
}
