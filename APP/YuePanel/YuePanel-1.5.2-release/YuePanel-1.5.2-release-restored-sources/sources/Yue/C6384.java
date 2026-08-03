package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6384 extends C5848 implements InterfaceC5424 {
    @Override // Yue.C5850
    @InterfaceC6399
    public String toString() {
        return super.toString();
    }

    @Override // Yue.InterfaceC5424
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo13919() {
        return true;
    }

    @Override // Yue.InterfaceC5424
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public C6384 mo13920() {
        return this;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public final String m19938(@InterfaceC6399 String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        boolean z = true;
        for (C5850 c5850M18105 = (C5850) m18104(); !C5499.m17094(c5850M18105, this); c5850M18105 = c5850M18105.m18105()) {
            if (c5850M18105 instanceof AbstractC5556) {
                AbstractC5556 abstractC5556 = (AbstractC5556) c5850M18105;
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(abstractC5556);
            }
        }
        sb.append("]");
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
