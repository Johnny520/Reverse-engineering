package me;

import java.util.Objects;
import p025bc.AbstractC0255e;
import p302ud.InterfaceC4312h;
import p302ud.InterfaceC4318n;

/* JADX INFO: renamed from: me.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2837e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4318n f9228a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4312h f9229b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2837e(InterfaceC4318n interfaceC4318n, InterfaceC4312h interfaceC4312h) {
        this.f9228a = interfaceC4318n;
        this.f9229b = interfaceC4312h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2837e.class == obj.getClass()) {
            C2837e c2837e = (C2837e) obj;
            if (Objects.equals(this.f9228a, c2837e.f9228a) && Objects.equals(this.f9229b, c2837e.f9229b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Objects.hash(this.f9228a, this.f9229b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("UsePlace{region=", String.valueOf(this.f9228a), ", block=", String.valueOf(this.f9229b), "}");
    }
}
