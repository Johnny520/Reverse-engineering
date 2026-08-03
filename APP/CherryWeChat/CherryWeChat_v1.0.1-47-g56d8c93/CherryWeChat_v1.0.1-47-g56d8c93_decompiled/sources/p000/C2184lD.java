package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import io.github.cherrywechat.network.model.UpdateInfo;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lD */
/* JADX INFO: loaded from: classes.dex */
public final class C2184lD extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public int f7614e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Context f7615f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f7616g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2184lD(Context context, boolean z, InterfaceC0190Eb interfaceC0190Eb) {
        super(interfaceC0190Eb);
        this.f7615f = context;
        this.f7616g = z;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) {
        return ((C2184lD) mo447h((InterfaceC0190Eb) obj2, (InterfaceC1409fc) obj)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        return new C2184lD(this.f7615f, this.f7616g, interfaceC0190Eb);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        int i = this.f7614e;
        boolean z = this.f7616g;
        Context context = this.f7615f;
        try {
            if (i == 0) {
                AbstractC0628Oj.m1232T(obj);
                C2227mD.f7746a.getClass();
                SharedPreferences.Editor editorEdit = C2227mD.m4485d().edit();
                editorEdit.putLong(AbstractC0295Gu.m625r(-464629562079285L), System.currentTimeMillis());
                editorEdit.apply();
                C0594Ns c0594Ns = C0594Ns.f1925a;
                this.f7614e = 1;
                c0594Ns.getClass();
                C1498hd c1498hd = AbstractC1499he.f5282a;
                obj = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C1034Y2(3, null), this);
                EnumC1453gc enumC1453gc = EnumC1453gc.f5148a;
                if (obj == enumC1453gc) {
                    return enumC1453gc;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException(AbstractC0295Gu.m625r(-464805655738421L));
                }
                AbstractC0628Oj.m1232T(obj);
            }
            C2227mD c2227mD = C2227mD.f7746a;
            UpdateInfo updateInfoM4482a = C2227mD.m4482a(c2227mD, (String) obj);
            if (Integer.parseInt(updateInfoM4482a.getVersionName()) > 10724) {
                C2227mD.m4483b(c2227mD, context, updateInfoM4482a);
            } else if (z) {
                Toast.makeText(context, AbstractC0295Gu.m625r(-464698281556021L), 0).show();
            }
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-464736936261685L);
            e.getMessage();
            if (z) {
                AbstractC0213Ey.m413k(-464775590967349L, context, 0);
            }
        }
        return C0829TC.f2620a;
    }
}
