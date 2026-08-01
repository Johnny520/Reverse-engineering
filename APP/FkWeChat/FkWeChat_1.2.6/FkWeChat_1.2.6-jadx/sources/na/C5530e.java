package na;

import java.util.List;
import java.util.Set;
import ma.AbstractC5140a;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5081g0;

/* JADX INFO: renamed from: na.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5530e extends AbstractC5531f {

    /* JADX INFO: renamed from: h */
    public final AbstractC5140a.e f17296h;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5530e(AbstractC5140a.e eVar, String[] strArr) {
        eVar.getClass();
        strArr.getClass();
        List listM21085x = eVar.m21085x();
        Set setM20483e = listM21085x.isEmpty() ? AbstractC5068b1.m20483e() : AbstractC5081g0.m20564c1(listM21085x);
        List listM21086y = eVar.m21086y();
        listM21086y.getClass();
        super(strArr, setM20483e, AbstractC5532g.m22542a(listM21086y));
        this.f17296h = eVar;
    }
}
