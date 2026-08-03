package p227p4;

import bsh.C0353j;
import p136j8.C2104o;
import p295u4.C4270t;

/* JADX INFO: renamed from: p4.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3317v {

    /* JADX INFO: renamed from: a */
    public final int f10687a;

    /* JADX INFO: renamed from: b */
    public final C4270t f10688b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3317v(int i9, C4270t c4270t) {
        if (i9 < 0) {
            C2104o.m5294t("address < 0");
            throw null;
        }
        if (c4270t == null) {
            C0353j.m1305c("position == null");
            throw null;
        }
        this.f10687a = i9;
        this.f10688b = c4270t;
    }
}
