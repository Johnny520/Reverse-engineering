package Yue;

import Yue.C4483;
import java.io.IOException;
import net.bytebuddy.description.type.TypeDescription;

/* JADX INFO: renamed from: Yue.ۥۢۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C8566 extends AbstractC5693 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final boolean f25423;

    public C8566(String str, boolean z) {
        C8159.m26910(str);
        this.f14015 = str;
        this.f25423 = z;
    }

    @Override // Yue.AbstractC6381
    public String toString() {
        return mo12982();
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public String mo9885() {
        return "#declaration";
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    public void mo9886(Appendable appendable, int i, C4483.C0414 c0414) throws IOException {
        Appendable appendableAppend = appendable.append("<");
        boolean z = this.f25423;
        String str = TypeDescription.Generic.OfWildcardType.SYMBOL;
        appendableAppend.append(z ? "!" : TypeDescription.Generic.OfWildcardType.SYMBOL).append(m17596());
        m28536(appendable, c0414);
        if (this.f25423) {
            str = "!";
        }
        appendable.append(str).append(">");
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public void mo9887(Appendable appendable, int i, C4483.C0414 c0414) {
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۡ۟()LYue/ۥۣۡۢۤ; */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C8566 mo12984() {
        return (C8566) super.mo12984();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public String m28535() {
        StringBuilder sbM3765 = C7615.m3765();
        try {
            m28536(sbM3765, new C4483.C0414());
            return C7615.m23825(sbM3765).trim();
        } catch (IOException e) {
            throw new C7370(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public final void m28536(Appendable appendable, C4483.C0414 c0414) throws IOException {
        for (C3454 c3454 : mo13685()) {
            String strM9134 = c3454.getKey();
            String strM9135 = c3454.getValue();
            if (!strM9134.equals(mo9885())) {
                appendable.append(' ');
                appendable.append(strM9134);
                if (!strM9135.isEmpty()) {
                    appendable.append("=\"");
                    C4645.m13969(appendable, strM9135, c0414, true, false, false, false);
                    appendable.append(C8039.f3212);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public String m28537() {
        return m17596();
    }
}
