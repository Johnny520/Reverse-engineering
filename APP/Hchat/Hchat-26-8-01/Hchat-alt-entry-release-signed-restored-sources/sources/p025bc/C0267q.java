package p025bc;

import af.C0082e;
import bf.AbstractC0310b;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import nf.C3001c;
import nf.InterfaceC2999a;
import p012ah.C0086a;
import p053df.C0780h;
import p063e9.C0830a;
import p302ud.C4325u;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: bc.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0267q {

    /* JADX INFO: renamed from: a */
    public final C0261k f793a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f794b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f795c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(C0267q.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0267q(C0261k c0261k) {
        ArrayList arrayList = new ArrayList();
        this.f794b = arrayList;
        this.f795c = new ArrayList();
        this.f793a = c0261k;
        arrayList.add(new C0780h());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Object m1047a(C0265o c0265o, C0830a c0830a) throws C0082e {
        String str = c0265o.f783a;
        try {
            InterfaceC2999a interfaceC2999a = c0265o.f785c;
            if (interfaceC2999a == null) {
                File file = new File(str);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    Object objM2113c = c0830a.m2113c(bufferedInputStream, file.length());
                    bufferedInputStream.close();
                    return objM2113c;
                } finally {
                }
            }
            InputStream inputStreamMo6398b = interfaceC2999a.mo6398b();
            try {
                Object objM2113c2 = c0830a.m2113c(inputStreamMo6398b, interfaceC2999a.mo6399c());
                if (inputStreamMo6398b == null) {
                    return objM2113c2;
                }
                inputStreamMo6398b.close();
                return objM2113c2;
            } finally {
            }
        } catch (Exception e6) {
            throw new C0082e(AbstractC4855en.m9263g("Error decode: ", str), e6);
        }
        throw new C0082e(AbstractC4855en.m9263g("Error decode: ", str), e6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final ArrayList m1048b(C4325u c4325u) {
        FileInputStream fileInputStream;
        for (C0780h c0780h : this.f794b) {
            try {
                c0780h.f2349a = c4325u;
            } catch (Exception unused) {
                C0086a.m452k("Failed to init res table provider: ".concat(String.valueOf(c0780h)));
                return null;
            }
        }
        Iterator it = this.f795c.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C0086a.m445d();
                return null;
            }
            try {
                throw null;
            } catch (Exception unused2) {
                C0086a.m452k("Failed to init res container factory: ".concat("null"));
                return null;
            }
        }
        C0261k c0261k = this.f793a;
        ArrayList<File> arrayList = c0261k.f764g.f738g;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (File file : arrayList) {
            if (file != null && !file.isDirectory()) {
                Iterator it2 = c0261k.f772o.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    C0086a.m445d();
                    return null;
                }
                InterfaceC2844b interfaceC2844b = AbstractC0310b.f883a;
                boolean z9 = false;
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (Exception e6) {
                    AbstractC0310b.f883a.mo6260n(file.getAbsolutePath(), "Failed to read zip file: {}", e6);
                }
                try {
                    byte[] bArr = AbstractC0310b.f887e;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    boolean z10 = fileInputStream.read(bArr2) == length && Arrays.equals(bArr2, bArr);
                    fileInputStream.close();
                    z9 = z10;
                    if (z9) {
                        try {
                            C3001c c3001cM6036r = c0261k.f767j.m6036r(file);
                            c0261k.f774q.add(c3001cM6036r);
                            for (InterfaceC2999a interfaceC2999a : c3001cM6036r.f9779h) {
                                if (!interfaceC2999a.isDirectory()) {
                                    String name = interfaceC2999a.getName();
                                    C0265o c0265o = !c0261k.f764g.f725K.f226b.mo439c(name) ? null : new C0265o(name, EnumC0266p.m1046a(name));
                                    if (c0265o != null) {
                                        c0265o.f785c = interfaceC2999a;
                                        arrayList2.add(c0265o);
                                    }
                                }
                            }
                        } catch (Exception e7) {
                            C0086a.m457p(AbstractC4855en.m9263g("Failed to open zip file: ", file.getAbsolutePath()), e7);
                            return null;
                        }
                    } else {
                        arrayList2.add(new C0265o(file.getAbsolutePath(), EnumC0266p.m1046a(file.getAbsolutePath())));
                    }
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        return arrayList2;
    }
}
