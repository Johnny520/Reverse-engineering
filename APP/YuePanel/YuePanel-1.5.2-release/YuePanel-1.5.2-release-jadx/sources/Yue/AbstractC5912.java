package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5912 extends AbstractC4232 {
    @Override // Yue.AbstractC4232
    @InterfaceC6399
    public AbstractC4232 limitedParallelism(int i) {
        C5699.m2376(i);
        return this;
    }

    @Override // Yue.AbstractC4232
    @InterfaceC6399
    public String toString() {
        String strM18478 = m18478();
        if (strM18478 != null) {
            return strM18478;
        }
        return C4325.m1288(this) + '@' + C4325.m1289(this);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟ */
    public abstract AbstractC5912 mo16039();

    @InterfaceC5495
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final String m18478() {
        AbstractC5912 abstractC5912Mo16039;
        AbstractC5912 abstractC5912M12872 = C4423.m12872();
        if (this == abstractC5912M12872) {
            return "Dispatchers.Main";
        }
        try {
            abstractC5912Mo16039 = abstractC5912M12872.mo16039();
        } catch (UnsupportedOperationException unused) {
            abstractC5912Mo16039 = null;
        }
        if (this == abstractC5912Mo16039) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
