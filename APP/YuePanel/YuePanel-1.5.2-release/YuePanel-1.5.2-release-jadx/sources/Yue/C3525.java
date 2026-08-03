package Yue;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.IMarkerFactory;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3525 implements IMarkerFactory {

    /* JADX INFO: renamed from: ۥ */
    public final ConcurrentMap<String, InterfaceC5949> f360 = new ConcurrentHashMap();

    @Override // org.slf4j.IMarkerFactory
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC5949 mo589(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Marker name cannot be null");
        }
        InterfaceC5949 interfaceC5949 = this.f360.get(str);
        if (interfaceC5949 != null) {
            return interfaceC5949;
        }
        C3524 c3524 = new C3524(str);
        InterfaceC5949 interfaceC5949PutIfAbsent = this.f360.putIfAbsent(str, c3524);
        return interfaceC5949PutIfAbsent != null ? interfaceC5949PutIfAbsent : c3524;
    }

    @Override // org.slf4j.IMarkerFactory
    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC5949 mo590(String str) {
        return new C3524(str);
    }

    @Override // org.slf4j.IMarkerFactory
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean mo9449(String str) {
        return (str == null || this.f360.remove(str) == null) ? false : true;
    }

    @Override // org.slf4j.IMarkerFactory
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean mo9450(String str) {
        if (str == null) {
            return false;
        }
        return this.f360.containsKey(str);
    }
}
