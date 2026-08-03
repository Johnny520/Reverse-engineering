package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f829b;

    public /* synthetic */ m0(int r1, java.util.ArrayList r2) {
            r0 = this;
            r0.f828a = r1
            r0.f829b = r2
            r0.<init>()
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f828a
            switch(r0) {
                case 0: goto L4a;
                case 1: goto L42;
                case 2: goto L3a;
                case 3: goto L32;
                case 4: goto L23;
                case 5: goto L1b;
                case 6: goto L11;
                default: goto L5;
            }
        L5:
            ud.h r3 = (ud.h) r3
            java.util.List r3 = r3.g()
            java.util.ArrayList r0 = r2.f829b
            r0.addAll(r3)
            return
        L11:
            ud.a r3 = (ud.a) r3
            java.util.ArrayList r3 = r3.f13674l
            java.util.ArrayList r0 = r2.f829b
            r0.addAll(r3)
            return
        L1b:
            java.util.ArrayList r0 = r2.f829b
            te.b r3 = (te.b) r3
            r0.add(r3)
            return
        L23:
            java.util.Map r3 = (java.util.Map) r3
            ae.g r0 = new ae.g
            r1 = 13
            r0.<init>(r3, r1)
            java.util.ArrayList r3 = r2.f829b
            r3.forEach(r0)
            return
        L32:
            java.util.ArrayList r0 = r2.f829b
            ud.a r3 = (ud.a) r3
            r0.add(r3)
            return
        L3a:
            java.util.ArrayList r0 = r2.f829b
            java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3
            com.alibaba.fastjson2.reader.ObjectReaderCreator.d(r0, r3)
            return
        L42:
            java.util.ArrayList r0 = r2.f829b
            java.nio.file.Path r3 = (java.nio.file.Path) r3
            r0.add(r3)
            return
        L4a:
            java.util.ArrayList r0 = r2.f829b
            qd.j r3 = (qd.j) r3
            r0.add(r3)
            return
    }
}
