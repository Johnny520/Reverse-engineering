package p000a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: a.S4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0330S4 implements InterfaceC0286Pd<C0574f9> {

    /* JADX INFO: renamed from: a */
    public final String f1173a;

    /* JADX INFO: renamed from: b */
    public final C0622i0 f1174b;

    /* JADX INFO: renamed from: a.S4$a */
    public static final class a implements Iterator<C0574f9>, InterfaceC0783q9 {

        /* JADX INFO: renamed from: a */
        public int f1175a = -1;

        /* JADX INFO: renamed from: b */
        public int f1176b;

        /* JADX INFO: renamed from: c */
        public int f1177c;

        /* JADX INFO: renamed from: d */
        public C0574f9 f1178d;

        /* JADX INFO: renamed from: e */
        public int f1179e;

        public a() {
            C0330S4.this.getClass();
            int iM748C = C0267Oc.m748C(0, 0, C0330S4.this.f1173a.length());
            this.f1176b = iM748C;
            this.f1177c = iM748C;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: B */
        /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: A */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final void m910a() {
            C0710mc c0710mc;
            int i = this.f1177c;
            if (i < 0) {
                this.f1175a = 0;
                this.f1178d = null;
                return;
            }
            C0330S4 c0330s4 = C0330S4.this;
            c0330s4.getClass();
            int i2 = this.f1179e + 1;
            this.f1179e = i2;
            String str = c0330s4.f1173a;
            if (i2 >= 4 || i > str.length() || (c0710mc = (C0710mc) c0330s4.f1174b.mo146e(str, Integer.valueOf(this.f1177c))) == null) {
                this.f1178d = new C0574f9(this.f1176b, C0034Be.m96K(str), 1);
                this.f1177c = -1;
            } else {
                int iIntValue = ((Number) c0710mc.f2680a).intValue();
                int iIntValue2 = ((Number) c0710mc.f2681b).intValue();
                this.f1178d = C0267Oc.m749D(this.f1176b, iIntValue);
                int i3 = iIntValue + iIntValue2;
                this.f1176b = i3;
                this.f1177c = i3 + (iIntValue2 == 0 ? 1 : 0);
            }
            this.f1175a = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f1175a == -1) {
                m910a();
            }
            return this.f1175a == 1;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public final C0574f9 next() {
            if (this.f1175a == -1) {
                m910a();
            }
            if (this.f1175a == 0) {
                throw new NoSuchElementException();
            }
            C0574f9 c0574f9 = this.f1178d;
            C0631i9.m1480c(c0574f9, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f1178d = null;
            this.f1175a = -1;
            return c0574f9;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0330S4(String str, C0622i0 c0622i0) {
        this.f1173a = str;
        this.f1174b = c0622i0;
    }

    @Override // p000a.InterfaceC0286Pd
    public final Iterator<C0574f9> iterator() {
        return new a();
    }
}
