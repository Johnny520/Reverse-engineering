package gf;

import java.util.Objects;

/* JADX INFO: renamed from: gf.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2794c {

    /* JADX INFO: renamed from: a */
    public final String f7287a;

    /* JADX INFO: renamed from: b */
    public final Object f7288b;

    public C2794c(String str, Object obj) {
        this.f7287a = str;
        this.f7288b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2794c c2794c = (C2794c) obj;
            if (Objects.equals(this.f7287a, c2794c.f7287a) && Objects.equals(this.f7288b, c2794c.f7288b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f7287a, this.f7288b);
    }

    public String toString() {
        return String.valueOf(this.f7287a) + "=\"" + String.valueOf(this.f7288b) + "\"";
    }
}
