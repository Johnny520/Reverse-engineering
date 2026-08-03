package p000;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* JADX INFO: renamed from: Ba */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0060Ba implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f139a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f140b;

    public /* synthetic */ C0060Ba(int r1, Object r2) {
        this.f139a = r1;
        this.f140b = r2;
    }

    @Override // java.util.Comparator
    public final int compare(Object r7, Object r8) {
        switch(this.f139a) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        MaterialButtonToggleGroup r0 = (MaterialButtonToggleGroup) this.f140b;
        MaterialButton r72 = (MaterialButton) r7;
        MaterialButton r82 = (MaterialButton) r8;
        int r1 = Boolean.valueOf(r72.f4486o).compareTo(Boolean.valueOf(r82.f4486o));
        if (r1 != 0) goto L21;
        int r12 = Boolean.valueOf(r72.isPressed()).compareTo(Boolean.valueOf(r82.isPressed()));
        if (r12 == 0) goto L11;
        return r12;
    L11:
        return Integer.compare(r0.indexOfChild(r72), r0.indexOfChild(r82));
    L21:
        return r1;
    L12:
        InterfaceC1416fj[] r02 = (InterfaceC1416fj[]) this.f140b;
        int r13 = r02.length;
        int r3 = 0;
    L13:
        if (r3 >= r13) goto L23;
        InterfaceC1416fj r4 = r02[r3];
        int r42 = AbstractC0671Pj.m1346d((Comparable) r4.mo90g(r7), (Comparable) r4.mo90g(r8));
        if (r42 != 0) goto L18;
        r3 = r3 + 1;
        goto L13
    L18:
        return r42;
    L23:
        return 0;
    }
}
