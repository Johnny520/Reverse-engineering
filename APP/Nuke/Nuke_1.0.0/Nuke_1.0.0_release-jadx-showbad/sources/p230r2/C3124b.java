package p230r2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p213o2.AbstractC2770B;
import p213o2.C2785n;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3124b extends AbstractC2770B {

    /* JADX INFO: renamed from: c */
    public static final C3122a f9828c = new C3122a();

    /* JADX INFO: renamed from: a */
    public final Class f9829a;

    /* JADX INFO: renamed from: b */
    public final C3138n f9830b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3124b(C2785n c2785n, AbstractC2770B abstractC2770B, Class cls) {
        this.f9830b = new C3138n(c2785n, abstractC2770B, cls);
        this.f9829a = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) {
        if (c3390a.m5630J() == 9) {
            c3390a.m5626F();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c3390a.m5639b();
        while (c3390a.m5647n()) {
            arrayList.add(this.f9830b.f9879c.mo4964b(c3390a));
        }
        c3390a.m5643h();
        int size = arrayList.size();
        Class cls = this.f9829a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i5 = 0; i5 < size; i5++) {
            Array.set(objNewInstance, i5, arrayList.get(i5));
        }
        return objNewInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        if (obj == null) {
            c3391b.m5666n();
            return;
        }
        c3391b.m5659c();
        int length = Array.getLength(obj);
        for (int i5 = 0; i5 < length; i5++) {
            this.f9830b.mo4965c(c3391b, Array.get(obj, i5));
        }
        c3391b.m5662h();
    }
}
