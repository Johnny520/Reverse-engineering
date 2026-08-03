package p351xe;

import java.util.Objects;
import p025bc.AbstractC0255e;
import p302ud.InterfaceC4312h;
import p302ud.InterfaceC4314j;

/* JADX INFO: renamed from: xe.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5782c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4314j f23522a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4312h f23523b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5782c(InterfaceC4312h interfaceC4312h, InterfaceC4314j interfaceC4314j) {
        Objects.requireNonNull(interfaceC4314j);
        this.f23522a = interfaceC4314j;
        Objects.requireNonNull(interfaceC4312h);
        this.f23523b = interfaceC4312h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("BlockParentContainer{", String.valueOf(this.f23523b), ", parent=", String.valueOf(this.f23522a), "}");
    }
}
