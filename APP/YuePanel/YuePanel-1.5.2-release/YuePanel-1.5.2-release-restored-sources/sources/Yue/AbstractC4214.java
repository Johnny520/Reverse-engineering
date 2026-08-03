package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4214 extends AbstractC5115 {
    public AbstractC4214(EnumC6568 enumC6568) {
        super(enumC6568);
    }

    @Override // Yue.AbstractC5115
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo10646() throws C5509 {
        if (!mo15784()) {
            throw new C5511("Control frame can't have fin==false set");
        }
        if (mo1929()) {
            throw new C5511("Control frame can't have rsv1==true set");
        }
        if (mo15780()) {
            throw new C5511("Control frame can't have rsv2==true set");
        }
        if (mo15783()) {
            throw new C5511("Control frame can't have rsv3==true set");
        }
    }
}
