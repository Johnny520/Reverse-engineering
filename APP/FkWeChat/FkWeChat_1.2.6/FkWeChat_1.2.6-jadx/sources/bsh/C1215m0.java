package bsh;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: bsh.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1215m0 extends AbstractC1195i4 {
    private static final long serialVersionUID = 1;

    public C1215m0(int i10) {
        super(i10);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ String mo4038a() {
        return super.mo4038a();
    }

    @Override // bsh.AbstractC1195i4
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ void add(InterfaceC1188h3 interfaceC1188h3) {
        super.add(interfaceC1188h3);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ void mo4040e() {
        super.mo4040e();
    }

    @Override // bsh.AbstractC1195i4
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ InterfaceC1188h3 next() {
        return super.next();
    }

    @Override // bsh.AbstractC1195i4
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ InterfaceC1188h3 previous() {
        return super.previous();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    public /* bridge */ /* synthetic */ int getLineNumber() {
        return super.getLineNumber();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    public /* bridge */ /* synthetic */ String getText() {
        return super.getText();
    }

    @Override // bsh.AbstractC1195i4
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ void set(InterfaceC1188h3 interfaceC1188h3) {
        super.set(interfaceC1188h3);
    }

    @Override // bsh.AbstractC1195i4, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ boolean hasNext() {
        return super.hasNext();
    }

    @Override // bsh.AbstractC1195i4, java.util.ListIterator
    public /* bridge */ /* synthetic */ boolean hasPrevious() {
        return super.hasPrevious();
    }

    @Override // bsh.AbstractC1195i4
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ String mo4044i(String str) {
        return super.mo4044i(str);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ void mo4045j(InterfaceC1188h3 interfaceC1188h3, int i10) {
        super.mo4045j(interfaceC1188h3, i10);
    }

    /* JADX INFO: renamed from: k */
    public List m4513k() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < mo4050r(); i10++) {
            try {
                ((C1184h) mo4051s(i10)).m4410x();
            } catch (Throwable th) {
                arrayList.add(th);
            }
        }
        return arrayList;
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: m */
    public /* bridge */ /* synthetic */ void mo4046m(InterfaceC1188h3 interfaceC1188h3) {
        super.mo4046m(interfaceC1188h3);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ void mo4047n(String str) {
        super.mo4047n(str);
    }

    @Override // bsh.AbstractC1195i4, java.util.ListIterator
    public /* bridge */ /* synthetic */ int nextIndex() {
        return super.nextIndex();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: p */
    public Object mo4048p(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        for (int i10 = 0; i10 < mo4050r(); i10++) {
            mo4051s(i10).mo4048p(c1174f1, runnableC1205k2);
        }
        return Primitive.VOID;
    }

    @Override // bsh.AbstractC1195i4, java.util.ListIterator
    public /* bridge */ /* synthetic */ int previousIndex() {
        return super.previousIndex();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: q */
    public /* bridge */ /* synthetic */ InterfaceC1188h3[] mo4049q() {
        return super.mo4049q();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: r */
    public /* bridge */ /* synthetic */ int mo4050r() {
        return super.mo4050r();
    }

    @Override // bsh.AbstractC1195i4, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ void remove() {
        super.remove();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: s */
    public /* bridge */ /* synthetic */ InterfaceC1188h3 mo4051s(int i10) {
        return super.mo4051s(i10);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: t */
    public /* bridge */ /* synthetic */ void mo4052t() {
        super.mo4052t();
    }

    @Override // bsh.AbstractC1195i4
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: u */
    public /* bridge */ /* synthetic */ void mo4053u(String str) {
        super.mo4053u(str);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: w */
    public /* bridge */ /* synthetic */ InterfaceC1188h3 mo4054w() {
        return super.mo4054w();
    }
}
