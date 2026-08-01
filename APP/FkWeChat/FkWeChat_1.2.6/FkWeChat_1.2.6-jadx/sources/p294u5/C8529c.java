package p294u5;

import java.util.ArrayList;
import p280t5.AbstractC8127r;
import p309v5.InterfaceC8830l;

/* JADX INFO: renamed from: u5.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C8529c {

    /* JADX INFO: renamed from: a */
    public final ArrayList f28438a;

    public C8529c(int i10) {
        this.f28438a = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f28438a.add(AbstractC8127r.m31460b(i10));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m32824a(int i10, int i11) {
        m32825b(Math.max(i10, i11) + 1);
        ((InterfaceC8830l) this.f28438a.get(i10)).add(i11);
        ((InterfaceC8830l) this.f28438a.get(i11)).add(i10);
    }

    /* JADX INFO: renamed from: b */
    public final void m32825b(int i10) {
        this.f28438a.ensureCapacity(i10);
        for (int size = this.f28438a.size(); size < i10; size++) {
            this.f28438a.add(AbstractC8127r.m31460b(i10));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m32826c(int i10, InterfaceC8830l interfaceC8830l) {
        if (i10 < this.f28438a.size()) {
            interfaceC8830l.mo33829a((InterfaceC8830l) this.f28438a.get(i10));
        }
    }
}
