package p015b0;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import na.C2920h;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p036c9.C0414a;
import p057e1.C0807b;
import p085fg.InterfaceC1231l;
import p088g0.C1265i;
import p117i0.C1808a0;
import p117i0.InterfaceC1809a1;
import p119i2.C1935k0;
import p276sf.C3967n;
import p308v1.InterfaceC4428t;
import p332wb.C4737b3;
import p332wb.C5457x0;
import p339x1.C5610h0;
import tf.AbstractC4156d0;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: b0.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0146l implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f387g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f388h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0146l(InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f387g = i9;
        this.f388h = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f387g) {
            case 0:
                this.f388h.setValue((InterfaceC4428t) obj);
                break;
            case 1:
                this.f388h.setValue((InterfaceC4428t) obj);
                break;
            case 2:
                String str = (String) obj;
                str.getClass();
                this.f388h.setValue(str);
                break;
            case 3:
                String str2 = (String) obj;
                AbstractC0255e.m1029r(str2, str2, 50, this.f388h);
                break;
            case 4:
                this.f388h.setValue((String) obj);
                break;
            case 5:
                String str3 = (String) obj;
                str3.getClass();
                InterfaceC1809a1 interfaceC1809a1 = this.f388h;
                interfaceC1809a1.setValue(((Set) interfaceC1809a1.getValue()).contains(str3) ? AbstractC4156d0.m8351S((Set) interfaceC1809a1.getValue(), str3) : AbstractC4156d0.m8354V((Set) interfaceC1809a1.getValue(), str3));
                break;
            case 6:
                this.f388h.setValue((String) obj);
                break;
            case 7:
                this.f388h.setValue((InterfaceC4428t) obj);
                break;
            case 8:
                Float f3 = (Float) obj;
                f3.getClass();
                ((InterfaceC1231l) this.f388h.getValue()).invoke(f3);
                break;
            case 9:
                Float f10 = (Float) obj;
                f10.getClass();
                break;
            case 10:
                C1935k0 c1935k0 = (C1935k0) obj;
                c1935k0.getClass();
                this.f388h.setValue(Integer.valueOf((int) (c1935k0.f6563c & 4294967295L)));
                break;
            case 11:
                C5610h0 c5610h0 = (C5610h0) obj;
                c5610h0.getClass();
                ((InterfaceC1231l) this.f388h.getValue()).invoke(c5610h0);
                break;
            case 12:
                C1265i c1265i = (C1265i) obj;
                this.f388h.setValue(c1265i.f4181c ? c1265i.f4180b : c1265i.f4179a);
                break;
            case 13:
                List list = (List) obj;
                InterfaceC1809a1 interfaceC1809a12 = this.f388h;
                if (interfaceC1809a12 != null) {
                    interfaceC1809a12.setValue(list);
                }
                break;
            case 14:
                break;
            case 15:
                ((InterfaceC1231l) this.f388h.getValue()).invoke((C0807b) obj);
                break;
            case 16:
                String str4 = (String) obj;
                str4.getClass();
                this.f388h.setValue(str4);
                break;
            case 17:
                String str5 = (String) obj;
                str5.getClass();
                this.f388h.setValue(str5);
                break;
            case 18:
                String str6 = (String) obj;
                str6.getClass();
                this.f388h.setValue(str6);
                break;
            case 19:
                C0414a c0414a = (C0414a) obj;
                c0414a.getClass();
                this.f388h.setValue(new C5457x0(c0414a, true));
                break;
            case 20:
                String str7 = (String) obj;
                AbstractC0255e.m1029r(str7, str7, 8, this.f388h);
                break;
            case 21:
                String str8 = (String) obj;
                AbstractC0255e.m1029r(str8, str8, 19, this.f388h);
                break;
            case 22:
                String str9 = (String) obj;
                AbstractC0255e.m1029r(str9, str9, 19, this.f388h);
                break;
            case 23:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                this.f388h.setValue(bool);
                break;
            case 24:
                ((C1808a0) obj).getClass();
                break;
            case 25:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue > 0) {
                    InterfaceC1809a1 interfaceC1809a13 = this.f388h;
                    ArrayList arrayListM8409R1 = AbstractC4166m.m8409R1((List) interfaceC1809a13.getValue());
                    arrayListM8409R1.add(iIntValue - 1, (C2920h) arrayListM8409R1.remove(iIntValue));
                    interfaceC1809a13.setValue(arrayListM8409R1);
                }
                break;
            case 26:
                int iIntValue2 = ((Integer) obj).intValue();
                InterfaceC1809a1 interfaceC1809a14 = this.f388h;
                if (iIntValue2 < AbstractC0000a.m54b0((List) interfaceC1809a14.getValue())) {
                    ArrayList arrayListM8409R12 = AbstractC4166m.m8409R1((List) interfaceC1809a14.getValue());
                    arrayListM8409R12.add(iIntValue2 + 1, (C2920h) arrayListM8409R12.remove(iIntValue2));
                    interfaceC1809a14.setValue(arrayListM8409R12);
                }
                break;
            case 27:
                int iIntValue3 = ((Integer) obj).intValue();
                if (iIntValue3 >= 0) {
                    InterfaceC1809a1 interfaceC1809a15 = this.f388h;
                    if (iIntValue3 < ((List) interfaceC1809a15.getValue()).size()) {
                        ArrayList arrayListM8409R13 = AbstractC4166m.m8409R1((List) interfaceC1809a15.getValue());
                        arrayListM8409R13.remove(iIntValue3);
                        interfaceC1809a15.setValue(arrayListM8409R13);
                    }
                }
                break;
            case 28:
                C4737b3 c4737b3 = (C4737b3) obj;
                c4737b3.getClass();
                this.f388h.setValue(c4737b3);
                break;
            default:
                Integer num = (Integer) obj;
                num.getClass();
                this.f388h.setValue(num);
                break;
        }
        return C3967n.f12976a;
    }
}
