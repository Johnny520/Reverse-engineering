package androidx.compose.runtime;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: androidx.compose.runtime.s2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0582s2 {

    /* JADX INFO: renamed from: a */
    public final String f1593a;

    public C0582s2(String str) {
        this.f1593a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0582s2) && AbstractC1061t.m3842c(this.f1593a, ((C0582s2) obj).f1593a);
    }

    public int hashCode() {
        return this.f1593a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.f1593a + ')';
    }
}
