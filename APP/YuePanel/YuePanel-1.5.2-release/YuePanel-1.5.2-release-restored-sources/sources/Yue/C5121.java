package Yue;

import java.io.Serializable;

/* JADX INFO: renamed from: Yue.ۥۣ۠۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.7")
public class C5121 extends C5152 implements Serializable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Class f12140;

    public C5121(Class cls) {
        super(1);
        this.f12140 = cls;
    }

    @Override // Yue.C5152
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5121) {
            return this.f12140.equals(((C5121) obj).f12140);
        }
        return false;
    }

    @Override // Yue.C5152
    public int hashCode() {
        return this.f12140.hashCode();
    }

    @Override // Yue.C5152
    public String toString() {
        return "fun interface " + this.f12140.getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getReflected()LYue/ۥ۠ۦۢۡ; */
    @Override // Yue.C5152, Yue.AbstractC3648
    public InterfaceC5590 getReflected() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }
}
