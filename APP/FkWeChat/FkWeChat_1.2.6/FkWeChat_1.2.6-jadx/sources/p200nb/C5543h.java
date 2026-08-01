package p200nb;

import java.util.Arrays;
import java.util.Collection;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p200nb.AbstractC5542g;
import p213oa.C5695f;
import p229p9.InterfaceC6056z;
import p299ub.C8632n;

/* JADX INFO: renamed from: nb.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5543h {

    /* JADX INFO: renamed from: a */
    public final C5695f f17323a;

    /* JADX INFO: renamed from: b */
    public final C8632n f17324b;

    /* JADX INFO: renamed from: c */
    public final Collection f17325c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0184l f17326d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5541f[] f17327e;

    /* JADX INFO: renamed from: nb.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0184l {

        /* JADX INFO: renamed from: q */
        public static final a f17328q = new a();

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void mo27m(InterfaceC6056z interfaceC6056z) {
            interfaceC6056z.getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: nb.h$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC0184l {

        /* JADX INFO: renamed from: q */
        public static final b f17329q = new b();

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void mo27m(InterfaceC6056z interfaceC6056z) {
            interfaceC6056z.getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: nb.h$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements InterfaceC0184l {

        /* JADX INFO: renamed from: q */
        public static final c f17330q = new c();

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void mo27m(InterfaceC6056z interfaceC6056z) {
            interfaceC6056z.getClass();
            return null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5543h(C5695f c5695f, InterfaceC5541f[] interfaceC5541fArr, InterfaceC0184l interfaceC0184l) {
        this(c5695f, (C8632n) null, (Collection) null, interfaceC0184l, (InterfaceC5541f[]) Arrays.copyOf(interfaceC5541fArr, interfaceC5541fArr.length));
        c5695f.getClass();
        interfaceC5541fArr.getClass();
        interfaceC0184l.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC5542g m22573a(InterfaceC6056z interfaceC6056z) {
        interfaceC6056z.getClass();
        for (InterfaceC5541f interfaceC5541f : this.f17327e) {
            String strMo22561a = interfaceC5541f.mo22561a(interfaceC6056z);
            if (strMo22561a != null) {
                return new AbstractC5542g.b(strMo22561a);
            }
        }
        String str = (String) this.f17326d.mo27m(interfaceC6056z);
        return str != null ? new AbstractC5542g.b(str) : AbstractC5542g.c.f17322b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m22574b(InterfaceC6056z interfaceC6056z) {
        interfaceC6056z.getClass();
        if (this.f17323a != null && !AbstractC1061t.m3842c(interfaceC6056z.getName(), this.f17323a)) {
            return false;
        }
        if (this.f17324b != null) {
            String strM23030c = interfaceC6056z.getName().m23030c();
            strM23030c.getClass();
            if (!this.f17324b.m33217i(strM23030c)) {
                return false;
            }
        }
        Collection collection = this.f17325c;
        return collection == null || collection.contains(interfaceC6056z.getName());
    }

    public /* synthetic */ C5543h(C5695f c5695f, InterfaceC5541f[] interfaceC5541fArr, InterfaceC0184l interfaceC0184l, int i10, AbstractC1043k abstractC1043k) {
        this(c5695f, interfaceC5541fArr, (i10 & 4) != 0 ? a.f17328q : interfaceC0184l);
    }

    public C5543h(C5695f c5695f, C8632n c8632n, Collection collection, InterfaceC0184l interfaceC0184l, InterfaceC5541f... interfaceC5541fArr) {
        this.f17323a = c5695f;
        this.f17324b = c8632n;
        this.f17325c = collection;
        this.f17326d = interfaceC0184l;
        this.f17327e = interfaceC5541fArr;
    }

    public /* synthetic */ C5543h(C8632n c8632n, InterfaceC5541f[] interfaceC5541fArr, InterfaceC0184l interfaceC0184l, int i10, AbstractC1043k abstractC1043k) {
        this(c8632n, interfaceC5541fArr, (i10 & 4) != 0 ? b.f17329q : interfaceC0184l);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5543h(C8632n c8632n, InterfaceC5541f[] interfaceC5541fArr, InterfaceC0184l interfaceC0184l) {
        this((C5695f) null, c8632n, (Collection) null, interfaceC0184l, (InterfaceC5541f[]) Arrays.copyOf(interfaceC5541fArr, interfaceC5541fArr.length));
        c8632n.getClass();
        interfaceC5541fArr.getClass();
        interfaceC0184l.getClass();
    }

    public /* synthetic */ C5543h(Collection collection, InterfaceC5541f[] interfaceC5541fArr, InterfaceC0184l interfaceC0184l, int i10, AbstractC1043k abstractC1043k) {
        this(collection, interfaceC5541fArr, (i10 & 4) != 0 ? c.f17330q : interfaceC0184l);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5543h(Collection collection, InterfaceC5541f[] interfaceC5541fArr, InterfaceC0184l interfaceC0184l) {
        this((C5695f) null, (C8632n) null, collection, interfaceC0184l, (InterfaceC5541f[]) Arrays.copyOf(interfaceC5541fArr, interfaceC5541fArr.length));
        collection.getClass();
        interfaceC5541fArr.getClass();
        interfaceC0184l.getClass();
    }
}
