package gg;

import java.io.Serializable;
import mg.InterfaceC2839a;

/* JADX INFO: renamed from: gg.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1408d implements InterfaceC2839a, Serializable {

    /* JADX INFO: renamed from: g */
    public transient InterfaceC2839a f4722g;

    /* JADX INFO: renamed from: h */
    public final Object f4723h;

    /* JADX INFO: renamed from: i */
    public final Class f4724i;

    /* JADX INFO: renamed from: j */
    public final String f4725j;

    /* JADX INFO: renamed from: k */
    public final String f4726k;

    /* JADX INFO: renamed from: l */
    public final boolean f4727l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1408d(Object obj, Class cls, String str, String str2, boolean z9) {
        this.f4723h = obj;
        this.f4724i = cls;
        this.f4725j = str;
        this.f4726k = str2;
        this.f4727l = z9;
    }

    /* JADX INFO: renamed from: e */
    public abstract InterfaceC2839a mo3816e();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final InterfaceC1409e m3817f() {
        boolean z9 = this.f4727l;
        Class cls = this.f4724i;
        if (!z9) {
            return AbstractC1426v.m3834a(cls);
        }
        AbstractC1426v.f4739a.getClass();
        return new C1419o(cls);
    }
}
