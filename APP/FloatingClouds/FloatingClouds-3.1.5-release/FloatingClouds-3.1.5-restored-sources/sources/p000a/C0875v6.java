package p000a;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: renamed from: a.v6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0875v6 implements InterfaceC0286Pd<File> {

    /* JADX INFO: renamed from: a */
    public final File f3427a;

    /* JADX INFO: renamed from: b */
    public final EnumC0894w6 f3428b;

    /* JADX INFO: renamed from: a.v6$a */
    public static abstract class a extends c {
    }

    /* JADX INFO: renamed from: a.v6$b */
    public final class b extends AbstractC0868v<File> {

        /* JADX INFO: renamed from: c */
        public final ArrayDeque<c> f3429c;

        /* JADX INFO: renamed from: a.v6$b$a */
        public final class a extends a {

            /* JADX INFO: renamed from: b */
            public boolean f3431b;

            /* JADX INFO: renamed from: c */
            public File[] f3432c;

            /* JADX INFO: renamed from: d */
            public int f3433d;

            /* JADX INFO: renamed from: e */
            public boolean f3434e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ b f3435f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File file) {
                super(file);
                C0631i9.m1482e(file, "rootDir");
                this.f3435f = bVar;
            }

            @Override // p000a.C0875v6.c
            /* JADX INFO: renamed from: a */
            public final File mo2102a() {
                boolean z = this.f3434e;
                File file = this.f3441a;
                b bVar = this.f3435f;
                if (!z && this.f3432c == null) {
                    C0875v6.this.getClass();
                    File[] fileArrListFiles = file.listFiles();
                    this.f3432c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        C0875v6.this.getClass();
                        this.f3434e = true;
                    }
                }
                File[] fileArr = this.f3432c;
                if (fileArr != null && this.f3433d < fileArr.length) {
                    C0631i9.m1479b(fileArr);
                    int i = this.f3433d;
                    this.f3433d = i + 1;
                    return fileArr[i];
                }
                if (this.f3431b) {
                    C0875v6.this.getClass();
                    return null;
                }
                this.f3431b = true;
                return file;
            }
        }

        /* JADX INFO: renamed from: a.v6$b$b, reason: collision with other inner class name */
        public final class C1340b extends c {

            /* JADX INFO: renamed from: b */
            public boolean f3436b;

            @Override // p000a.C0875v6.c
            /* JADX INFO: renamed from: a */
            public final File mo2102a() {
                if (this.f3436b) {
                    return null;
                }
                this.f3436b = true;
                return this.f3441a;
            }
        }

        /* JADX INFO: renamed from: a.v6$b$c */
        public final class c extends a {

            /* JADX INFO: renamed from: b */
            public boolean f3437b;

            /* JADX INFO: renamed from: c */
            public File[] f3438c;

            /* JADX INFO: renamed from: d */
            public int f3439d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ b f3440e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File file) {
                super(file);
                C0631i9.m1482e(file, "rootDir");
                this.f3440e = bVar;
            }

            @Override // p000a.C0875v6.c
            /* JADX INFO: renamed from: a */
            public final File mo2102a() {
                boolean z = this.f3437b;
                File file = this.f3441a;
                b bVar = this.f3440e;
                if (!z) {
                    C0875v6.this.getClass();
                    this.f3437b = true;
                    return file;
                }
                File[] fileArr = this.f3438c;
                if (fileArr != null && this.f3439d >= fileArr.length) {
                    C0875v6.this.getClass();
                    return null;
                }
                if (fileArr == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.f3438c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        C0875v6.this.getClass();
                    }
                    File[] fileArr2 = this.f3438c;
                    if (fileArr2 == null || fileArr2.length == 0) {
                        C0875v6.this.getClass();
                        return null;
                    }
                }
                File[] fileArr3 = this.f3438c;
                C0631i9.m1479b(fileArr3);
                int i = this.f3439d;
                this.f3439d = i + 1;
                return fileArr3[i];
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f3429c = arrayDeque;
            if (C0875v6.this.f3427a.isDirectory()) {
                arrayDeque.push(m2101b(C0875v6.this.f3427a));
            } else {
                if (!C0875v6.this.f3427a.isFile()) {
                    this.f3410a = 2;
                    return;
                }
                File file = C0875v6.this.f3427a;
                C0631i9.m1482e(file, "rootFile");
                arrayDeque.push(new C1340b(file));
            }
        }

        /* JADX INFO: renamed from: b */
        public final a m2101b(File file) {
            int iOrdinal = C0875v6.this.f3428b.ordinal();
            if (iOrdinal == 0) {
                return new c(this, file);
            }
            if (iOrdinal == 1) {
                return new a(this, file);
            }
            throw new C0266Ob();
        }
    }

    /* JADX INFO: renamed from: a.v6$c */
    public static abstract class c {

        /* JADX INFO: renamed from: a */
        public final File f3441a;

        public c(File file) {
            C0631i9.m1482e(file, "root");
            this.f3441a = file;
        }

        /* JADX INFO: renamed from: a */
        public abstract File mo2102a();
    }

    public C0875v6(File file) {
        EnumC0894w6 enumC0894w6 = EnumC0894w6.f3496a;
        this.f3427a = file;
        this.f3428b = enumC0894w6;
    }

    @Override // p000a.InterfaceC0286Pd
    public final Iterator<File> iterator() {
        return new b();
    }
}
