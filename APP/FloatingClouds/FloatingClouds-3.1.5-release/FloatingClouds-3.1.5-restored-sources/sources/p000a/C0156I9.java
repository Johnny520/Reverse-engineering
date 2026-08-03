package p000a;

import androidx.lifecycle.C1133q;
import java.io.PrintWriter;

/* JADX INFO: renamed from: a.I9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0156I9 extends AbstractC0138H9 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0935y9 f534a;

    /* JADX INFO: renamed from: b */
    public final b f535b;

    /* JADX INFO: renamed from: a.I9$a */
    public static class a<D> extends C0031Bb<D> {
        @Override // androidx.lifecycle.LiveData
        /* JADX INFO: renamed from: e */
        public final void mo436e() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        /* JADX INFO: renamed from: f */
        public final void mo437f() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #0 : ");
            sb.append("null");
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: a.I9$b */
    public static class b extends AbstractC0073Dg {

        /* JADX INFO: renamed from: e */
        public static final a f536e = new a();

        /* JADX INFO: renamed from: d */
        public final C0750oe<a> f537d = new C0750oe<>();

        /* JADX INFO: renamed from: a.I9$b$a */
        public static class a implements C1133q.b {
            @Override // androidx.lifecycle.C1133q.b
            /* JADX INFO: renamed from: a */
            public final <T extends AbstractC0073Dg> T mo438a(Class<T> cls) {
                return new b();
            }
        }

        @Override // p000a.AbstractC0073Dg
        /* JADX INFO: renamed from: b */
        public final void mo174b() {
            C0750oe<a> c0750oe = this.f537d;
            int i = c0750oe.f2958c;
            if (i > 0) {
                ((a) c0750oe.f2957b[0]).getClass();
                throw null;
            }
            Object[] objArr = c0750oe.f2957b;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            c0750oe.f2958c = 0;
        }
    }

    public C0156I9(InterfaceC0935y9 interfaceC0935y9, C0109Fg c0109Fg) {
        this.f534a = interfaceC0935y9;
        C1133q c1133q = new C1133q(c0109Fg, b.f536e);
        String canonicalName = b.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.f535b = (b) c1133q.m2615a(b.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public final void m435a(String str, PrintWriter printWriter) {
        C0750oe<a> c0750oe = this.f535b.f537d;
        if (c0750oe.f2958c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (c0750oe.f2958c <= 0) {
                return;
            }
            a aVar = (a) c0750oe.f2957b[0];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c0750oe.f2956a[0]);
            printWriter.print(": ");
            printWriter.println(aVar.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            throw null;
        }
    }

    public final String toString() {
        int iLastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        InterfaceC0935y9 interfaceC0935y9 = this.f534a;
        if (interfaceC0935y9 == null) {
            sb.append("null");
        } else {
            String simpleName = interfaceC0935y9.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = interfaceC0935y9.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(iLastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(interfaceC0935y9)));
        }
        sb.append("}}");
        return sb.toString();
    }
}
