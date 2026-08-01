package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sw extends defpackage.cq implements defpackage.hm {
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ sw(int r1, java.lang.Object r2) {
            r0 = this;
            r0.b = r1
            r0.c = r2
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // defpackage.hm
    public final java.lang.Object a() {
            r8 = this;
            int r0 = r8.b
            switch(r0) {
                case 0: goto Le8;
                case 1: goto Lbf;
                case 2: goto Lb5;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r8.c
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            k00 r2 = defpackage.j00.a
            r2.getClass()
            ma r2 = new ma
            java.lang.Class<q10> r3 = defpackage.q10.class
            r2.<init>(r3)
            qa0 r4 = new qa0
            java.lang.Class r2 = r2.a()
            java.lang.String r5 = "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>"
            defpackage.ip.m(r5, r2)
            r4.<init>(r2)
            r1.add(r4)
            r2 = 0
            qa0[] r4 = new defpackage.qa0[r2]
            java.lang.Object[] r1 = r1.toArray(r4)
            qa0[] r1 = (defpackage.qa0[]) r1
            int r4 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)
            qa0[] r1 = (defpackage.qa0[]) r1
            java.lang.String r4 = "initializers"
            defpackage.ip.o(r4, r1)
            ra0 r4 = r0.d()
            te r0 = r0.a()
            java.lang.String r5 = "store"
            defpackage.ip.o(r5, r4)
            java.lang.String r5 = "defaultCreationExtras"
            defpackage.ip.o(r5, r0)
            java.util.LinkedHashMap r4 = r4.a
            java.lang.String r5 = "androidx.lifecycle.internal.SavedStateHandlesVM"
            java.lang.Object r6 = r4.get(r5)
            pa0 r6 = (defpackage.pa0) r6
            boolean r7 = r3.isInstance(r6)
            if (r7 == 0) goto L68
            java.lang.String r0 = "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"
            defpackage.ip.m(r0, r6)
            goto L9a
        L68:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.LinkedHashMap r0 = r0.a
            r6.putAll(r0)
            vh r0 = defpackage.vh.p
            r6.put(r0, r5)
            int r0 = r1.length     // Catch: java.lang.AbstractMethodError -> Lad
            r6 = 0
        L79:
            if (r2 >= r0) goto L8d
            r7 = r1[r2]     // Catch: java.lang.AbstractMethodError -> Lad
            java.lang.Class r7 = r7.a     // Catch: java.lang.AbstractMethodError -> Lad
            boolean r7 = r7.equals(r3)     // Catch: java.lang.AbstractMethodError -> Lad
            if (r7 == 0) goto L8a
            q10 r6 = new q10     // Catch: java.lang.AbstractMethodError -> Lad
            r6.<init>()     // Catch: java.lang.AbstractMethodError -> Lad
        L8a:
            int r2 = r2 + 1
            goto L79
        L8d:
            if (r6 == 0) goto L9d
            java.lang.Object r0 = r4.put(r5, r6)
            pa0 r0 = (defpackage.pa0) r0
            if (r0 == 0) goto L9a
            r0.a()
        L9a:
            q10 r6 = (defpackage.q10) r6
            return r6
        L9d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.AbstractMethodError -> Lad
            java.lang.String r1 = r3.getName()     // Catch: java.lang.AbstractMethodError -> Lad
            java.lang.String r2 = "No initializer set for given class "
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.AbstractMethodError -> Lad
            r0.<init>(r1)     // Catch: java.lang.AbstractMethodError -> Lad
            throw r0     // Catch: java.lang.AbstractMethodError -> Lad
        Lad:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method."
            r0.<init>(r1)
            throw r0
        Lb5:
            java.lang.Object r0 = r8.c
            androidx.activity.a r0 = (androidx.activity.a) r0
            r0.b()
            vh r0 = defpackage.vh.n
            return r0
        Lbf:
            java.lang.Object r0 = r8.c
            androidx.activity.a r0 = (androidx.activity.a) r0
            k6 r1 = r0.b
            int r2 = r1.size()
            java.util.ListIterator r1 = r1.listIterator(r2)
        Lcd:
            boolean r2 = r1.hasPrevious()
            r3 = 0
            if (r2 == 0) goto Le0
            java.lang.Object r2 = r1.previous()
            r4 = r2
            sl r4 = (defpackage.sl) r4
            boolean r4 = r4.a
            if (r4 == 0) goto Lcd
            goto Le1
        Le0:
            r2 = r3
        Le1:
            sl r2 = (defpackage.sl) r2
            r0.c = r3
            vh r0 = defpackage.vh.n
            return r0
        Le8:
            java.lang.Object r0 = r8.c
            androidx.activity.a r0 = (androidx.activity.a) r0
            r0.b()
            vh r0 = defpackage.vh.n
            return r0
    }
}
