package defpackage;

import androidx.activity.ComponentActivity;
import androidx.activity.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class sw extends cq implements hm {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sw(int r1, Object r2) {
        this.b = r1;
        this.c = r2;
        super(0);
    }

    @Override // defpackage.hm
    public final Object a() {
        switch(this.b) {
            case 0: goto L35;
            case 1: goto L26;
            case 2: goto L24;
            default: goto L4;
        };
    L4:
        ComponentActivity r0 = (ComponentActivity) this.c;
        ArrayList r1 = new ArrayList();
        j00.a.getClass();
        Class r2 = new ma(q10.class).a();
        ip.m("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>", r2);
        r1.add(new qa0(r2));
        int r22 = 0;
        qa0[] r12 = (qa0[]) r1.toArray(new qa0[0]);
        qa0[] r13 = (qa0[]) Arrays.copyOf(r12, r12.length);
        ip.o("initializers", r13);
        ra0 r4 = r0.d();
        te r02 = r0.a();
        ip.o("store", r4);
        ip.o("defaultCreationExtras", r02);
        LinkedHashMap r42 = r4.a;
        pa0 r6 = (pa0) r42.get("androidx.lifecycle.internal.SavedStateHandlesVM");
        if (q10.class.isInstance(r6) == false) goto L7;
        ip.m("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", r6);
    L19:
        return (q10) r6;
    L7:
        LinkedHashMap r62 = new LinkedHashMap();
        r62.putAll(r02.a);
        r62.put(vh.p, "androidx.lifecycle.internal.SavedStateHandlesVM");
        int r03 = r13.length;     // Catch: AbstractMethodError -> L22
        r6 = null;
    L9:
        if (r22 >= r03) goto L14;
        if (r13[r22].a.equals(q10.class) == false) goto L13;
        r6 = new q10();     // Catch: AbstractMethodError -> L22
    L13:
        r22 = r22 + 1;
        goto L9
    L14:
        if (r6 == null) goto L21;
        pa0 r04 = (pa0) r42.put("androidx.lifecycle.internal.SavedStateHandlesVM", r6);
        if (r04 == null) goto L19;
        r04.a();
        goto L19
    L21:
        throw new IllegalArgumentException("No initializer set for given class ".concat(q10.class.getName()));     // Catch: AbstractMethodError -> L22
    L23:
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    L24:
        ((a) this.c).b();
        return vh.n;
    L26:
        a r05 = (a) this.c;
        k6 r14 = r05.b;
        ListIterator r15 = r14.listIterator(r14.size());
    L28:
        if (r15.hasPrevious() == false) goto L32;
        Object r23 = r15.previous();
        if (((sl) r23).a == false) goto L28;
    L33:
        sl r24 = (sl) r23;
        r05.c = null;
        return vh.n;
    L32:
        r23 = null;
        goto L33
    L35:
        ((a) this.c).b();
        return vh.n;
    }
}
