package p218og;

import java.util.Iterator;
import ng.InterfaceC3012j;
import p085fg.InterfaceC1235p;

/* JADX INFO: renamed from: og.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3139c implements InterfaceC3012j {

    /* JADX INFO: renamed from: a */
    public final CharSequence f10187a;

    /* JADX INFO: renamed from: b */
    public final int f10188b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1235p f10189c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3139c(CharSequence charSequence, int i9, InterfaceC1235p interfaceC1235p) {
        charSequence.getClass();
        this.f10187a = charSequence;
        this.f10188b = i9;
        this.f10189c = interfaceC1235p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ng.InterfaceC3012j
    public final Iterator iterator() {
        return new C3138b(this);
    }
}
