package p025bc;

import af.C0081d;
import java.io.File;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: bc.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0258h {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2844b f758a = AbstractC2846d.m6274b(AbstractC0258h.class);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1037a(File file, String str) {
        if (file != null && file.exists() && !file.isDirectory()) {
            throw new C0081d(AbstractC4855en.m9264h(str, " directory exists as file ", String.valueOf(file)));
        }
    }
}
