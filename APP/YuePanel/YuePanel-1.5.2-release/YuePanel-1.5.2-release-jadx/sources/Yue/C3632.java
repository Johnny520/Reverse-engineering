package Yue;

import Yue.C4483;
import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3632 extends C7755 {
    public C3632(String str) {
        super(str);
    }

    @Override // Yue.C7755, Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public String mo9885() {
        return "#cdata";
    }

    @Override // Yue.C7755, Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public void mo9886(Appendable appendable, int i, C4483.C0414 c0414) throws IOException {
        appendable.append("<![CDATA[").append(m24631());
    }

    @Override // Yue.C7755, Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void mo9887(Appendable appendable, int i, C4483.C0414 c0414) throws IOException {
        appendable.append("]]>");
    }

    @Override // Yue.C7755
    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public String mo9889() {
        return m24631();
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۡ۟()LYue/ۥۣۡۢۤ; */
    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۦ۠()LYue/ۥۢۡ۠ۦ; */
    @Override // Yue.C7755
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3632 mo12984() {
        return (C3632) super.mo12984();
    }
}
