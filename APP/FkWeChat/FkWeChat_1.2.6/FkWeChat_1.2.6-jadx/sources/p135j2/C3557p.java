package p135j2;

import java.util.ArrayList;
import java.util.Arrays;
import p135j2.InterfaceC3553n1;
import p185m8.AbstractC5106t;

/* JADX INFO: renamed from: j2.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3557p implements InterfaceC3538j2 {

    /* JADX INFO: renamed from: b */
    public final String f9898b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3538j2[] f9899c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3553n1 f9900d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3553n1 f9901e;

    public C3557p(String str, InterfaceC3538j2[] interfaceC3538j2Arr) {
        this.f9898b = str;
        this.f9899c = interfaceC3538j2Arr;
        InterfaceC3553n1.a aVar = InterfaceC3553n1.f9886a;
        ArrayList arrayList = new ArrayList(interfaceC3538j2Arr.length);
        for (InterfaceC3538j2 interfaceC3538j2 : interfaceC3538j2Arr) {
            arrayList.add(interfaceC3538j2.mo13223a());
        }
        InterfaceC3553n1[] interfaceC3553n1Arr = (InterfaceC3553n1[]) arrayList.toArray(new InterfaceC3553n1[0]);
        this.f9900d = AbstractC3559p1.m13331b(aVar, (InterfaceC3553n1[]) Arrays.copyOf(interfaceC3553n1Arr, interfaceC3553n1Arr.length));
        InterfaceC3553n1.a aVar2 = InterfaceC3553n1.f9886a;
        InterfaceC3538j2[] interfaceC3538j2Arr2 = this.f9899c;
        ArrayList arrayList2 = new ArrayList(interfaceC3538j2Arr2.length);
        for (InterfaceC3538j2 interfaceC3538j22 : interfaceC3538j2Arr2) {
            arrayList2.add(interfaceC3538j22.mo13224b());
        }
        InterfaceC3553n1[] interfaceC3553n1Arr2 = (InterfaceC3553n1[]) arrayList2.toArray(new InterfaceC3553n1[0]);
        this.f9901e = AbstractC3559p1.m13331b(aVar2, (InterfaceC3553n1[]) Arrays.copyOf(interfaceC3553n1Arr2, interfaceC3553n1Arr2.length));
    }

    @Override // p135j2.InterfaceC3538j2
    /* JADX INFO: renamed from: a */
    public InterfaceC3553n1 mo13223a() {
        return this.f9900d;
    }

    @Override // p135j2.InterfaceC3538j2
    /* JADX INFO: renamed from: b */
    public InterfaceC3553n1 mo13224b() {
        return this.f9901e;
    }

    public String toString() {
        String str = this.f9898b;
        return str == null ? AbstractC5106t.m20754u0(this.f9899c, null, "innermostOf(", ")", 0, null, null, 57, null) : str;
    }
}
