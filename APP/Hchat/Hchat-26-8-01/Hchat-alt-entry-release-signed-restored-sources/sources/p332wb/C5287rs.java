package p332wb;

import android.content.Context;
import gg.AbstractC1416l;
import java.util.Iterator;
import java.util.regex.Pattern;
import okio.Utf8;
import p080fb.C1113d1;
import p080fb.C1125g1;
import p085fg.InterfaceC1235p;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.rs */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5287rs implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20526g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f20527h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f20528i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C5518yt f20529j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f20530k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f20531l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f20532m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f20533n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f20534o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5287rs(String str, Context context, C5518yt c5518yt, C1845j1 c1845j1, C1845j1 c1845j12, C1845j1 c1845j13, C1845j1 c1845j14, InterfaceC1809a1 interfaceC1809a1) {
        this.f20526g = 1;
        this.f20527h = str;
        this.f20528i = context;
        this.f20529j = c5518yt;
        this.f20530k = c1845j1;
        this.f20531l = c1845j12;
        this.f20532m = c1845j13;
        this.f20533n = c1845j14;
        this.f20534o = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        Long l10;
        int i9 = this.f20526g;
        C3967n c3967n = C3967n.f12976a;
        C5518yt c5518yt = this.f20529j;
        switch (i9) {
            case 0:
                C1113d1 c1113d1M9937M = (C1113d1) obj;
                String str = (String) obj2;
                c1113d1M9937M.getClass();
                str.getClass();
                Pattern patternCompile = Pattern.compile("\\s+");
                patternCompile.getClass();
                String strReplaceAll = patternCompile.matcher(str).replaceAll(" ");
                strReplaceAll.getClass();
                String strM6701P0 = AbstractC3149m.m6701P0(32, AbstractC3149m.m6703R0(strReplaceAll).toString());
                if (!AbstractC3149m.m6721t0(strM6701P0)) {
                    String str2 = c1113d1M9937M.f3636a;
                    String str3 = this.f20527h;
                    if (AbstractC1416l.m3825a(str2, str3)) {
                        c1113d1M9937M = c5518yt.m9937M(c1113d1M9937M.f3639d);
                    }
                    C5491y2.m9835m1(this.f20528i, str3, this.f20530k, this.f20531l, this.f20532m, this.f20533n, this.f20534o, C1113d1.m2848a(c1113d1M9937M, strM6701P0, false, false, 0L, Utf8.REPLACEMENT_CODE_POINT));
                }
                break;
            case 1:
                C1113d1 c1113d1M9937M2 = (C1113d1) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                c1113d1M9937M2.getClass();
                String str4 = c1113d1M9937M2.f3636a;
                String str5 = this.f20527h;
                if (AbstractC1416l.m3825a(str4, str5)) {
                    c1113d1M9937M2 = c5518yt.m9937M(c1113d1M9937M2.f3639d);
                }
                C1113d1 c1113d1 = c1113d1M9937M2;
                long jLongValue = c1113d1.f3649n;
                Context context = this.f20528i;
                if (zBooleanValue) {
                    C1125g1 c1125g1 = C1125g1.f3676a;
                    Iterator it = C1125g1.m2865i(context).iterator();
                    if (it.hasNext()) {
                        Long lValueOf = Long.valueOf(((C1113d1) it.next()).f3649n);
                        while (it.hasNext()) {
                            Long lValueOf2 = Long.valueOf(((C1113d1) it.next()).f3649n);
                            if (lValueOf.compareTo(lValueOf2) < 0) {
                                lValueOf = lValueOf2;
                            }
                        }
                        l10 = lValueOf;
                    } else {
                        l10 = null;
                    }
                    if (l10 != null) {
                        jLongValue = l10.longValue();
                    }
                    jLongValue++;
                }
                C5491y2.m9835m1(context, str5, this.f20530k, this.f20531l, this.f20532m, this.f20533n, this.f20534o, C1113d1.m2848a(c1113d1, null, zBooleanValue, false, jLongValue, 55295));
                break;
            default:
                C1113d1 c1113d1M9937M3 = (C1113d1) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                c1113d1M9937M3.getClass();
                String str6 = c1113d1M9937M3.f3636a;
                String str7 = this.f20527h;
                if (AbstractC1416l.m3825a(str6, str7)) {
                    c1113d1M9937M3 = c5518yt.m9937M(c1113d1M9937M3.f3639d);
                }
                C5491y2.m9835m1(this.f20528i, str7, this.f20530k, this.f20531l, this.f20532m, this.f20533n, this.f20534o, C1113d1.m2848a(c1113d1M9937M3, null, false, zBooleanValue2, 0L, 61439));
                break;
        }
        return c3967n;
    }

    public /* synthetic */ C5287rs(String str, C5518yt c5518yt, Context context, C1845j1 c1845j1, C1845j1 c1845j12, C1845j1 c1845j13, C1845j1 c1845j14, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f20526g = i9;
        this.f20527h = str;
        this.f20529j = c5518yt;
        this.f20528i = context;
        this.f20530k = c1845j1;
        this.f20531l = c1845j12;
        this.f20532m = c1845j13;
        this.f20533n = c1845j14;
        this.f20534o = interfaceC1809a1;
    }
}
