package Yue;

import Yue.C4483;
import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4299 extends AbstractC5693 {
    public C4299(String str) {
        this.f14015 = str;
    }

    @Override // Yue.AbstractC6381
    public String toString() {
        return mo12982();
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public String mo9885() {
        return "#data";
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    public void mo9886(Appendable appendable, int i, C4483.C0414 c0414) throws IOException {
        String strM12417 = m12417();
        if (c0414.m13028() != C4483.C0414.EnumC4484.xml || strM12417.contains("<![CDATA[")) {
            appendable.append(m12417());
            return;
        }
        if (m19920("script")) {
            appendable.append("//<![CDATA[\n").append(strM12417).append("\n//]]>");
        } else if (m19920("style")) {
            appendable.append("/*<![CDATA[*/\n").append(strM12417).append("\n/*]]>*/");
        } else {
            appendable.append("<![CDATA[").append(strM12417).append("]]>");
        }
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public void mo9887(Appendable appendable, int i, C4483.C0414 c0414) {
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۡ۟()LYue/ۥۣۡۢۤ; */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4299 mo12984() {
        return (C4299) super.mo12984();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public String m12417() {
        return m17596();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public C4299 m12418(String str) {
        m17597(str);
        return this;
    }
}
