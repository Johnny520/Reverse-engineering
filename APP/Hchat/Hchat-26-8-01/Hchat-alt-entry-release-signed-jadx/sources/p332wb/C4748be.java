package p332wb;

import android.content.SharedPreferences;
import java.io.File;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p158l.C2416g;
import p218og.AbstractC3149m;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;

/* JADX INFO: renamed from: wb.be */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4748be implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16018g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f16019h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f16020i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f16021j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f16022k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f16023l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f16024m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4748be(SharedPreferences sharedPreferences, String str, String str2, String str3, boolean z9, int i9) {
        this.f16018g = 0;
        this.f16023l = sharedPreferences;
        this.f16019h = str;
        this.f16020i = str2;
        this.f16024m = str3;
        this.f16021j = z9;
        this.f16022k = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        String name;
        switch (this.f16018g) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9402O3((SharedPreferences) this.f16023l, this.f16019h, this.f16020i, (String) this.f16024m, this.f16021j, (C1836h0) obj, AbstractC1874r.m4617C(this.f16022k | 1));
                break;
            case 1:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f16023l;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f16024m;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str = this.f16019h;
                    boolean zM6721t0 = AbstractC3149m.m6721t0(str);
                    String str2 = this.f16020i;
                    if (zM6721t0) {
                        name = "未选择";
                    } else if (AbstractC3149m.m6721t0(str2)) {
                        name = new File(str).getName();
                        if (AbstractC3149m.m6721t0(name)) {
                            name = "已选择文件";
                        }
                    } else {
                        name = str2;
                    }
                    boolean z9 = this.f16021j;
                    boolean zM4536g = c1836h0.m4536g(z9) | c1836h0.m4534f(interfaceC1220a);
                    Object objM4514P = c1836h0.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (zM4536g || objM4514P == c1823e) {
                        objM4514P = new C2416g(z9, interfaceC1220a, 1);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9503b("选择输入文件", name, (InterfaceC1220a) objM4514P, c1836h0, 6);
                    if (AbstractC3149m.m6721t0(str)) {
                        c1836h0.m4525a0(-1184273031);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-1184468114);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        boolean zM4536g2 = c1836h0.m4536g(z9) | c1836h0.m4534f(interfaceC1220a2);
                        Object objM4514P2 = c1836h0.m4514P();
                        if (zM4536g2 || objM4514P2 == c1823e) {
                            objM4514P2 = new C2416g(z9, interfaceC1220a2, 2);
                            c1836h0.m4545k0(objM4514P2);
                        }
                        AbstractC4955ho.m9503b("清空输入文件", "移除当前已选文件", (InterfaceC1220a) objM4514P2, c1836h0, 54);
                        c1836h0.m4553p(false);
                    }
                    int i9 = this.f16022k;
                    if (i9 != 1) {
                        c1836h0.m4525a0(-1184187967);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        AbstractC4955ho.m9296B1("输出文件", AbstractC4955ho.m9315D4(i9, str2), null, c1836h0, 6, 4);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-1184041895);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            default:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9466W3(this.f16019h, this.f16020i, this.f16021j, (InterfaceC1220a) this.f16023l, (InterfaceC1231l) this.f16024m, (C1836h0) obj, AbstractC1874r.m4617C(this.f16022k | 1));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4748be(String str, String str2, boolean z9, InterfaceC1220a interfaceC1220a, InterfaceC3955b interfaceC3955b, int i9, int i10) {
        this.f16018g = i10;
        this.f16019h = str;
        this.f16020i = str2;
        this.f16021j = z9;
        this.f16023l = interfaceC1220a;
        this.f16024m = interfaceC3955b;
        this.f16022k = i9;
    }
}
