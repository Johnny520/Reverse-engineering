package Yue;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3524 implements InterfaceC5949 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final long f5952 = -2849567615646933777L;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static String f5953 = "[ ";

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static String f5954 = " ]";

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static String f5955 = ", ";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final String f5956;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public List<InterfaceC5949> f5957 = new CopyOnWriteArrayList();

    public C3524(String str) {
        if (str == null) {
            throw new IllegalArgumentException("A marker name cannot be null");
        }
        this.f5956 = str;
    }

    @Override // Yue.InterfaceC5949
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof InterfaceC5949)) {
            return this.f5956.equals(((InterfaceC5949) obj).getName());
        }
        return false;
    }

    @Override // Yue.InterfaceC5949
    public String getName() {
        return this.f5956;
    }

    @Override // Yue.InterfaceC5949
    public int hashCode() {
        return this.f5956.hashCode();
    }

    @Override // Yue.InterfaceC5949
    public Iterator<InterfaceC5949> iterator() {
        return this.f5957.iterator();
    }

    public String toString() {
        if (!mo9443()) {
            return getName();
        }
        Iterator<InterfaceC5949> it = iterator();
        StringBuilder sb = new StringBuilder(getName());
        sb.append(' ');
        sb.append(f5953);
        while (it.hasNext()) {
            sb.append(it.next().getName());
            if (it.hasNext()) {
                sb.append(f5955);
            }
        }
        sb.append(f5954);
        return sb.toString();
    }

    @Override // Yue.InterfaceC5949
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean mo9443() {
        return this.f5957.size() > 0;
    }

    @Override // Yue.InterfaceC5949
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public boolean mo9444(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Other cannot be null");
        }
        if (this.f5956.equals(str)) {
            return true;
        }
        if (!mo9443()) {
            return false;
        }
        Iterator<InterfaceC5949> it = this.f5957.iterator();
        while (it.hasNext()) {
            if (it.next().mo9444(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // Yue.InterfaceC5949
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void mo9445(InterfaceC5949 interfaceC5949) {
        if (interfaceC5949 == null) {
            throw new IllegalArgumentException("A null value cannot be added to a Marker as reference.");
        }
        if (mo9447(interfaceC5949) || interfaceC5949.mo9447(this)) {
            return;
        }
        this.f5957.add(interfaceC5949);
    }

    @Override // Yue.InterfaceC5949
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public boolean mo9446(InterfaceC5949 interfaceC5949) {
        return this.f5957.remove(interfaceC5949);
    }

    @Override // Yue.InterfaceC5949
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public boolean mo9447(InterfaceC5949 interfaceC5949) {
        if (interfaceC5949 == null) {
            throw new IllegalArgumentException("Other cannot be null");
        }
        if (equals(interfaceC5949)) {
            return true;
        }
        if (!mo9443()) {
            return false;
        }
        Iterator<InterfaceC5949> it = this.f5957.iterator();
        while (it.hasNext()) {
            if (it.next().mo9447(interfaceC5949)) {
                return true;
            }
        }
        return false;
    }

    @Override // Yue.InterfaceC5949
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public boolean mo9448() {
        return mo9443();
    }
}
