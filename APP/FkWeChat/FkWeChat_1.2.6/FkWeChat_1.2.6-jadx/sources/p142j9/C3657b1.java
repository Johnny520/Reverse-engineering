package p142j9;

import java.util.Comparator;
import p010a9.InterfaceC0188p;

/* JADX INFO: renamed from: j9.b1 */
/* JADX INFO: loaded from: classes2.dex */
public class C3657b1 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0188p f10156a;

    public C3657b1(InterfaceC0188p interfaceC0188p) {
        this.f10156a = interfaceC0188p;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return AbstractC3672e1.m13669z(this.f10156a, obj, obj2);
    }
}
