package p332wb;

import android.content.SharedPreferences;
import java.util.List;
import p036c9.C0499x;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.g9 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4907g9 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17385g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f17386h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SharedPreferences f17387i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f17388j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f17389k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4907g9(SharedPreferences sharedPreferences, boolean z9, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f17387i = sharedPreferences;
        this.f17388j = z9;
        this.f17386h = interfaceC1809a1;
        this.f17389k = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17385g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    SharedPreferences sharedPreferences = this.f17387i;
                    AbstractC4955ho.m9402O3(sharedPreferences, "anti_recall_enable", "防撤回", "保留被撤回的消息，并在下方插入提示", false, c1836h0, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences, "anti_recall_keep_self", "保留自己撤回", "开启后自己撤回的消息也会保留", false, c1836h0, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences, "anti_recall_show_notice", "显示撤回提示", "在被撤回消息下方插入提示", true, c1836h0, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    InterfaceC1809a1 interfaceC1809a1 = this.f17386h;
                    String str = (String) interfaceC1809a1.getValue();
                    List list = AbstractC4955ho.f17693h;
                    Object objM4514P = c1836h0.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (objM4514P == c1823e) {
                        objM4514P = new C4712ab(interfaceC1809a1, 27);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9571i4("提示文案", "点击下方变量插入到光标位置", str, list, 0, (InterfaceC1231l) objM4514P, c1836h0, 196662, 16);
                    if (this.f17388j) {
                        c1836h0.m4525a0(1891111495);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        InterfaceC1809a1 interfaceC1809a12 = this.f17389k;
                        String str2 = (String) interfaceC1809a12.getValue();
                        Object objM4514P2 = c1836h0.m4514P();
                        if (objM4514P2 == c1823e) {
                            objM4514P2 = new C4712ab(interfaceC1809a12, 28);
                            c1836h0.m4545k0(objM4514P2);
                        }
                        AbstractC4955ho.m9304C1("时间格式", "使用日期格式，例如 yyyy-MM-dd HH:mm:ss", str2, 0, (InterfaceC1231l) objM4514P2, c1836h0, 24630, 8);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(1891390185);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a13 = this.f17386h;
                    boolean zBooleanValue = ((Boolean) interfaceC1809a13.getValue()).booleanValue();
                    boolean zM4534f = c1836h02.m4534f(interfaceC1809a13);
                    SharedPreferences sharedPreferences2 = this.f17387i;
                    boolean zM4538h = zM4534f | c1836h02.m4538h(sharedPreferences2);
                    Object objM4514P3 = c1836h02.m4514P();
                    C1823e c1823e2 = C1851l.f6155a;
                    if (zM4538h || objM4514P3 == c1823e2) {
                        objM4514P3 = new C5108me(sharedPreferences2, interfaceC1809a13, 1);
                        c1836h02.m4545k0(objM4514P3);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue, "悬浮底栏", "使用悬浮样式的底部导航栏", false, (InterfaceC1231l) objM4514P3, c1836h02, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    boolean z9 = this.f17388j;
                    InterfaceC1809a1 interfaceC1809a14 = this.f17389k;
                    boolean z10 = z9 && ((Boolean) interfaceC1809a14.getValue()).booleanValue();
                    String str3 = z9 ? "启用悬浮底栏的液态玻璃效果" : "Android 13 以下不支持液态玻璃效果";
                    boolean zM4534f2 = c1836h02.m4534f(interfaceC1809a14) | c1836h02.m4538h(sharedPreferences2);
                    Object objM4514P4 = c1836h02.m4514P();
                    if (zM4534f2 || objM4514P4 == c1823e2) {
                        objM4514P4 = new C0499x(z9, sharedPreferences2, interfaceC1809a14);
                        c1836h02.m4545k0(objM4514P4);
                    }
                    AbstractC4955ho.m9410P3(z10, "液态玻璃", str3, z9, (InterfaceC1231l) objM4514P4, c1836h02, 3120, 0);
                } else {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4907g9(InterfaceC1809a1 interfaceC1809a1, SharedPreferences sharedPreferences, boolean z9, InterfaceC1809a1 interfaceC1809a12) {
        this.f17386h = interfaceC1809a1;
        this.f17387i = sharedPreferences;
        this.f17388j = z9;
        this.f17389k = interfaceC1809a12;
    }
}
