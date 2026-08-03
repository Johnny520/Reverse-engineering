package Yue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۢۦۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8545 implements InterfaceC8544 {

    /* JADX INFO: renamed from: ۥ */
    public AbstractC8547 f3550 = AbstractC8547.m28424();

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static Iterator m28409(InterfaceC8561 interfaceC8561) {
        if (interfaceC8561.mo18351() == 0) {
            return C4632.f9944;
        }
        int iMo18351 = interfaceC8561.mo18351();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iMo18351; i++) {
            arrayList.add(new C3455(interfaceC8561.mo18343(i), interfaceC8561.mo18339(i), interfaceC8561.mo18344(i), interfaceC8561.mo18331(i), interfaceC8561.mo18353(i)));
        }
        return arrayList.iterator();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static Iterator m28410(InterfaceC8561 interfaceC8561) {
        if (interfaceC8561.mo18345() == 0) {
            return C4632.f9944;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < interfaceC8561.mo18345(); i++) {
            String strMo18337 = interfaceC8561.mo18337(i);
            if (strMo18337 == null || strMo18337.equals("")) {
                arrayList.add(new C6348(interfaceC8561.mo18350(i)));
            } else {
                arrayList.add(new C6348(strMo18337, interfaceC8561.mo18350(i)));
            }
        }
        return arrayList.iterator();
    }

    public String toString() {
        return "NonStaticAllocator";
    }

    @Override // Yue.InterfaceC8544
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC8543 mo3751(InterfaceC8561 interfaceC8561) throws C8559 {
        switch (interfaceC8561.mo18329()) {
            case 1:
                return m28421(interfaceC8561);
            case 2:
                return m28416(interfaceC8561);
            case 3:
                return m28418(interfaceC8561);
            case 4:
                return m28412(interfaceC8561);
            case 5:
                return m28413(interfaceC8561);
            case 6:
                return m28412(interfaceC8561);
            case 7:
                return m28420(interfaceC8561);
            case 8:
                return m28415(interfaceC8561);
            case 9:
                return m28417(interfaceC8561);
            case 10:
            default:
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unable to allocate event[");
                stringBuffer.append(interfaceC8561.mo18329());
                stringBuffer.append(" , ");
                stringBuffer.append(C4606.m1561(interfaceC8561.mo18329()));
                stringBuffer.append("]");
                throw new C8559(stringBuffer.toString());
            case 11:
                return m28414(interfaceC8561);
            case 12:
                return m28411(interfaceC8561);
        }
    }

    @Override // Yue.InterfaceC8544
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo3752(InterfaceC8561 interfaceC8561, InterfaceC8546 interfaceC8546) throws C8559 {
        interfaceC8546.mo28423(mo3751(interfaceC8561));
    }

    @Override // Yue.InterfaceC8544
    /* JADX INFO: renamed from: ۥ۟۟ */
    public InterfaceC8544 mo23777() {
        return new C8545();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public InterfaceC3788 m28411(InterfaceC8561 interfaceC8561) throws C8559 {
        return this.f3550.mo14009(interfaceC8561.getText());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public InterfaceC3788 m28412(InterfaceC8561 interfaceC8561) throws C8559 {
        String str = new String(interfaceC8561.mo18332(), interfaceC8561.mo18349(), interfaceC8561.mo18336());
        return interfaceC8561.mo18324() ? this.f3550.mo14022(str) : this.f3550.mo14010(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public InterfaceC3930 m28413(InterfaceC8561 interfaceC8561) throws C8559 {
        return this.f3550.mo14011(interfaceC8561.getText());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public InterfaceC4269 m28414(InterfaceC8561 interfaceC8561) throws C8559 {
        if (!(interfaceC8561 instanceof C5901)) {
            return this.f3550.mo14012(interfaceC8561.getText());
        }
        C5901 c5901 = (C5901) interfaceC8561;
        C4283 c4283 = new C4283(interfaceC8561.getText());
        c4283.m12378((List) c5901.getProperty("javax.xml.stream.notations"));
        c4283.m12377((List) c5901.getProperty("javax.xml.stream.entities"));
        return c4283;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public InterfaceC4641 m28415(InterfaceC8561 interfaceC8561) throws C8559 {
        return this.f3550.mo14013();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public InterfaceC4643 m28416(InterfaceC8561 interfaceC8561) throws C8559 {
        String prefix = interfaceC8561.getPrefix();
        String strMo18325 = interfaceC8561.mo18325();
        if (prefix == null) {
            prefix = "";
        }
        if (strMo18325 == null) {
            strMo18325 = "";
        }
        return this.f3550.mo14016(prefix, strMo18325, interfaceC8561.mo18348(), m28410(interfaceC8561));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public InterfaceC4651 m28417(InterfaceC8561 interfaceC8561) throws C8559 {
        String strMo18348 = interfaceC8561.mo18348();
        boolean z = interfaceC8561 instanceof C5901;
        return this.f3550.mo14017(strMo18348, new C4649(strMo18348, interfaceC8561.getText()));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public InterfaceC6804 m28418(InterfaceC8561 interfaceC8561) throws C8559 {
        return this.f3550.mo14021(interfaceC8561.mo18335(), interfaceC8561.mo18346());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public InterfaceC3788 m28419(InterfaceC8561 interfaceC8561) throws C8559 {
        return this.f3550.mo14022(interfaceC8561.getText());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public InterfaceC7572 m28420(InterfaceC8561 interfaceC8561) throws C8559 {
        return m28422(interfaceC8561);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public InterfaceC7574 m28421(InterfaceC8561 interfaceC8561) throws C8559 {
        String prefix = interfaceC8561.getPrefix();
        String strMo18325 = interfaceC8561.mo18325();
        return this.f3550.mo14029(prefix == null ? "" : prefix, strMo18325 == null ? "" : strMo18325, interfaceC8561.mo18348(), m28409(interfaceC8561), m28410(interfaceC8561));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public InterfaceC7572 m28422(InterfaceC8561 interfaceC8561) throws C8559 {
        String strMo18323 = interfaceC8561.mo18323();
        String version = interfaceC8561.getVersion();
        boolean zMo18327 = interfaceC8561.mo18327();
        return (strMo18323 == null || version == null || zMo18327) ? (version == null || strMo18323 == null) ? strMo18323 != null ? this.f3550.mo14024(strMo18323) : this.f3550.mo14023() : this.f3550.mo14025(strMo18323, version) : this.f3550.mo14026(strMo18323, version, zMo18327);
    }
}
