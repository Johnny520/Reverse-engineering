package gb;

/* JADX INFO: renamed from: gb.b2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2647b2 implements InterfaceC2643a2 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC2643a2)) {
            return false;
        }
        InterfaceC2643a2 interfaceC2643a2 = (InterfaceC2643a2) obj;
        return mo9336c() == interfaceC2643a2.mo9336c() && mo9335b() == interfaceC2643a2.mo9335b() && getType().equals(interfaceC2643a2.getType());
    }

    public int hashCode() {
        int iHashCode = mo9335b().hashCode();
        if (AbstractC2675i2.m9475w(getType())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (mo9336c() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (mo9336c()) {
            return "*";
        }
        if (mo9335b() == EnumC2691m2.f7042u) {
            return getType().toString();
        }
        return mo9335b() + " " + getType();
    }
}
