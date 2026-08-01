package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: y1 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0947y1 implements InterfaceC0225fx, Serializable {

    /* JADX INFO: renamed from: d */
    public final Object f7484d;

    /* JADX INFO: renamed from: e */
    public final Class f7485e;

    /* JADX INFO: renamed from: f */
    public final String f7486f;

    /* JADX INFO: renamed from: g */
    public final String f7487g;

    /* JADX INFO: renamed from: h */
    public final boolean f7488h = false;

    /* JADX INFO: renamed from: i */
    public final int f7489i;

    /* JADX INFO: renamed from: j */
    public final int f7490j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0947y1(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.f7484d = obj;
        this.f7485e = cls;
        this.f7486f = str;
        this.f7487g = str2;
        this.f7489i = i;
        this.f7490j = i2 >> 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0947y1)) {
            return false;
        }
        AbstractC0947y1 abstractC0947y1 = (AbstractC0947y1) obj;
        return this.f7488h == abstractC0947y1.f7488h && this.f7489i == abstractC0947y1.f7489i && this.f7490j == abstractC0947y1.f7490j && this.f7484d.equals(abstractC0947y1.f7484d) && this.f7485e.equals(abstractC0947y1.f7485e) && this.f7486f.equals(abstractC0947y1.f7486f) && this.f7487g.equals(abstractC0947y1.f7487g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0225fx
    public final int getArity() {
        return this.f7489i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return ((((((this.f7487g.hashCode() + ((this.f7486f.hashCode() + ((this.f7485e.hashCode() + (this.f7484d.hashCode() * 31)) * 31)) * 31)) * 31) + (this.f7488h ? 1231 : 1237)) * 31) + this.f7489i) * 31) + this.f7490j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        au0.f267a.getClass();
        return bu0.m373a(this);
    }
}
