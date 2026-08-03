package p001;

import java.util.List;

/* JADX INFO: renamed from: ۟.h9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0242h9 extends AbstractC0335o4 implements InterfaceC0222g3<C0368qb, Boolean> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C0365q8<C0413u4> f843;

    public C0242h9(C0365q8<C0413u4> c0365q8) {
        this.f843 = c0365q8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final Boolean mo984(C0368qb c0368qb) {
        List<C0439w4> list;
        C0439w4 c0439w4;
        String str;
        String strM915;
        List<C0439w4> list2;
        C0439w4 c0439w42;
        List<C0439w4> list3;
        List<C0439w4> list4;
        C0237h4.m1090("$this$$receiver", c0368qb);
        String str2 = C0436w1.f1166;
        C0413u4 c0413u4 = this.f843.f1047;
        C0426v4 c0426v4 = c0413u4.f1125;
        boolean z = (c0426v4 == null || (list4 = c0426v4.f1149) == null || !(list4.isEmpty() ^ true)) ? false : true;
        C0426v4 c0426v42 = c0413u4.f1125;
        if (!z ? c0426v42 == null || (list = c0426v42.f1148) == null || (c0439w4 = list.get(0)) == null || (str = c0439w4.f1168) == null : (str = c0426v42.f1149.get(0).f1168) == null) {
            str = "";
        }
        List listM1105 = C0272jb.m1105(str);
        C0413u4 c0413u42 = this.f843.f1047;
        C0426v4 c0426v43 = c0413u42.f1125;
        boolean z2 = (c0426v43 == null || (list3 = c0426v43.f1149) == null || !(list3.isEmpty() ^ true)) ? false : true;
        C0426v4 c0426v44 = c0413u42.f1125;
        if (z2) {
            strM915 = c0426v44.f1149.get(0).f1169;
            if (strM915 == null) {
                strM915 = "mp4";
            }
        } else if (c0426v44 == null || (list2 = c0426v44.f1148) == null || (c0439w42 = list2.get(0)) == null || (strM915 = c0439w42.f1169) == null) {
            strM915 = "mp4";
        }
        C0436w1.m953(strM915, listM1105);
        return Boolean.TRUE;
    }
}
