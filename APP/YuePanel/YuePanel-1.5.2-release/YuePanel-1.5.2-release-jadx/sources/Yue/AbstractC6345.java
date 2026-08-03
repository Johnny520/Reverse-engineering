package Yue;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: renamed from: Yue.ۥۡۢ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6345 implements InterfaceC5866, Serializable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final long f16116 = 7535258609338176893L;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public String f16117;

    @Override // Yue.InterfaceC5866
    public String getName() {
        return this.f16117;
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public Object m19841() throws ObjectStreamException {
        return C5867.m18163(getName());
    }
}
