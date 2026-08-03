package p339x1;

import p041d1.InterfaceC0672r;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: x1.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5589c implements InterfaceC0672r {

    /* JADX INFO: renamed from: a */
    public static final C5589c f22725a = new C5589c();

    /* JADX INFO: renamed from: b */
    public static Boolean f22726b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041d1.InterfaceC0672r
    /* JADX INFO: renamed from: a */
    public final boolean mo1853a() {
        Boolean bool = f22726b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw AbstractC4855en.m9257a("canFocus is read before it is written");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041d1.InterfaceC0672r
    /* JADX INFO: renamed from: c */
    public final void mo1855c(boolean z9) {
        f22726b = Boolean.valueOf(z9);
    }
}
