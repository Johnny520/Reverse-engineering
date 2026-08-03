package io.github.cherrywechat.lua.api;

import android.app.Activity;
import android.app.AndroidAppHelper;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import io.github.cherrywechat.application.MainApplication;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC1257cG;
import p000.AbstractC1450gG;
import p000.C0465Ks;
import p000.C1214bG;
import p000.C1456gf;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class WeChatAPI {
    public static final WeChatAPI INSTANCE = null;
    private static final String TAG = null;

    static {
        TAG = AbstractC0295Gu.m625r(-335144888039477L);
        INSTANCE = new WeChatAPI();
    }

    private WeChatAPI() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m3489a(Lua r0) {
        return register$lambda$11(r0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m3490b(Lua r0) {
        return register$lambda$0(r0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m3491c(Lua r0) {
        return register$lambda$17(r0);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m3492d(Lua r0) {
        return register$lambda$3(r0);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m3493e(Lua r0) {
        return register$lambda$13(r0);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m3494f(Lua r0) {
        return register$lambda$2(r0);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m3495g(Lua r0) {
        return register$lambda$12(r0);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m3496h(Lua r0) {
        return register$lambda$4(r0);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ int m3497i(Lua r0) {
        return register$lambda$8(r0);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m3498j(Lua r0) {
        return register$lambda$1(r0);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int m3499k(Lua r0) {
        return register$lambda$7(r0);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ int m3500l(Lua r0) {
        return register$lambda$10(r0);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ int m3501m(Lua r0) {
        return register$lambda$16(r0);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ int m3502n(Lua r0) {
        return register$lambda$6(r0);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ int m3503o(Lua r0) {
        return register$lambda$15(r0);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ int m3504p(Lua r0) {
        return register$lambda$18(r0);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ int m3505q(Lua r0) {
        return register$lambda$9(r0);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ int m3506r(Lua r0) {
        return register$lambda$14(r0);
    }

    private static final int register$lambda$0(Lua r2) {
        AbstractC0295Gu.m625r(-338606631680053L);
        r2.push(C1456gf.m2791I());     // Catch: Exception -> L5
        return 1;
    L5:
        AbstractC0295Gu.m625r(-338615221614645L);
        AbstractC0295Gu.m625r(-338108415473717L);
        r2.push(AbstractC0295Gu.m625r(-338168545015861L));
        return 1;
    }

    private static final int register$lambda$1(Lua r2) {
        AbstractC0295Gu.m625r(-338172839983157L);
        r2.push(C1456gf.m2794L());     // Catch: Exception -> L5
        return 1;
    L5:
        AbstractC0295Gu.m625r(-338181429917749L);
        AbstractC0295Gu.m625r(-338224379590709L);
        r2.push(AbstractC0295Gu.m625r(-338297394034741L));
        return 1;
    }

    private static final int register$lambda$10(Lua r3) {
        AbstractC0295Gu.m625r(-337541479790645L);
        Context r0 = MainApplication.f5549a;     // Catch: Exception -> L12
        if (r0 != null) goto L10;
        r0 = C1456gf.f5172p;     // Catch: Exception -> L12
        if (r0 != null) goto L10;
        r0 = AndroidAppHelper.currentApplication();     // Catch: Exception -> L12
        AbstractC0295Gu.m625r(-836852902787125L);     // Catch: Exception -> L12
    L10:
        String r02 = r0.getApplicationInfo().packageName;     // Catch: Exception -> L12
        AbstractC0295Gu.m625r(-837656061671477L);     // Catch: Exception -> L12
        r3.push(r02);     // Catch: Exception -> L12
        return 1;
    L12:
        AbstractC0295Gu.m625r(-337550069725237L);
        AbstractC0295Gu.m625r(-337043263584309L);
        ApplicationInfo r03 = AbstractC1450gG.f5072f;
        if (r03 != null) goto L16;
        AbstractC0295Gu.m625r(-579206404634677L);
        r03 = null;
    L16:
        r3.push(r03.packageName);
        return 1;
    }

    private static final int register$lambda$11(Lua r3) {
        AbstractC0295Gu.m625r(-337133457897525L);
        Context r0 = MainApplication.f5549a;     // Catch: Exception -> L15
        if (r0 != null) goto L10;
        r0 = C1456gf.f5172p;     // Catch: Exception -> L15
        if (r0 != null) goto L10;
        r0 = AndroidAppHelper.currentApplication();     // Catch: Exception -> L15
        AbstractC0295Gu.m625r(-836852902787125L);     // Catch: Exception -> L15
    L10:
        String r02 = r0.getPackageManager().getPackageInfo(r0.getPackageName(), 0).versionName;     // Catch: Exception -> L15
        if (r02 != null) goto L13;
        r02 = AbstractC0295Gu.m625r(-337142047832117L);     // Catch: Exception -> L15
    L13:
        r3.push(r02);     // Catch: Exception -> L15
        return 1;
    L15:
        AbstractC0295Gu.m625r(-337176407570485L);
        AbstractC0295Gu.m625r(-337219357243445L);
        r3.push(AbstractC0295Gu.m625r(-335643104245813L));
        return 1;
    }

    private static final int register$lambda$12(Lua r2) {
        AbstractC0295Gu.m625r(-335677463984181L);
        AbstractC0295Gu.m625r(-335686053918773L);
        AbstractC0295Gu.m625r(-335729003591733L);
        r2.createTable(0, 0);
        return 1;
    }

    private static final int register$lambda$13(Lua r2) {
        AbstractC0295Gu.m625r(-335892212348981L);
        AbstractC0295Gu.m625r(-335900802283573L);
        AbstractC0295Gu.m625r(-335393996142645L);
        r2.createTable(0, 0);
        return 1;
    }

    private static final int register$lambda$14(Lua r3) {
        AbstractC0295Gu.m625r(-335565794834485L);
        r3.toString(1);
        AbstractC0295Gu.m625r(-335574384769077L);
        AbstractC0295Gu.m625r(-335617334442037L);
        AbstractC0295Gu.m625r(-336240104699957L);
        r3.createTable(0, 0);
        return 1;
    }

    private static final int register$lambda$15(Lua r3) {
        AbstractC0295Gu.m625r(-336368953718837L);
        r3.toString(1);
        AbstractC0295Gu.m625r(-336377543653429L);
        AbstractC0295Gu.m625r(-336420493326389L);
        AbstractC0295Gu.m625r(-335960931825717L);
        r3.push(Double.valueOf(0.0d));
        return 1;
    }

    private static final int register$lambda$16(Lua r4) {
        AbstractC0295Gu.m625r(-336089780844597L);
        if (r4.getTop() < 1) goto L5;
        r4.toString(1);
    L5:
        AbstractC0295Gu.m625r(-336098370779189L);
        AbstractC0295Gu.m625r(-336141320452149L);
        AbstractC0295Gu.m625r(-334539297650741L);
        r4.push(AbstractC0295Gu.m625r(-334668146669621L));
        return 1;
    }

    private static final int register$lambda$17(Lua r3) {
        AbstractC0295Gu.m625r(-334672441636917L);
        r3.toString(1);
        AbstractC0295Gu.m625r(-334681031571509L);
        AbstractC0295Gu.m625r(-334723981244469L);
        AbstractC0295Gu.m625r(-334779815819317L);
        r3.push(AbstractC0295Gu.m625r(-334358909024309L));
        return 1;
    }

    private static final int register$lambda$18(Lua r3) {
        AbstractC0295Gu.m625r(-334363203991605L);
        r3.toString(1);
        AbstractC0295Gu.m625r(-334371793926197L);
        AbstractC0295Gu.m625r(-334414743599157L);
        AbstractC0295Gu.m625r(-334461988239413L);
        r3.push(AbstractC0295Gu.m625r(-335140593072181L));
        return 1;
    }

    private static final int register$lambda$2(Lua r2) {
        AbstractC0295Gu.m625r(-338301689002037L);
        r2.push(C1456gf.m2793K());     // Catch: Exception -> L5
        return 1;
    L5:
        AbstractC0295Gu.m625r(-338310278936629L);
        AbstractC0295Gu.m625r(-338353228609589L);
        r2.push(AbstractC0295Gu.m625r(-336764090710069L));
        return 1;
    }

    private static final int register$lambda$3(Lua r2) {
        AbstractC0295Gu.m625r(-336768385677365L);
        r2.push(C1456gf.m2792J());     // Catch: Exception -> L5
        return 1;
    L5:
        AbstractC0295Gu.m625r(-336776975611957L);
        AbstractC0295Gu.m625r(-336819925284917L);
        r2.push(AbstractC0295Gu.m625r(-336888644761653L));
        return 1;
    }

    private static final int register$lambda$4(Lua r2) {
        AbstractC0295Gu.m625r(-336892939728949L);
        r2.push(C1456gf.m2789G());     // Catch: Exception -> L5
        return 1;
    L5:
        AbstractC0295Gu.m625r(-336901529663541L);
        AbstractC0295Gu.m625r(-336944479336501L);
        r2.push(AbstractC0295Gu.m625r(-336463442999349L));
        return 1;
    }

    private static final int register$lambda$6(Lua r5) {
        AbstractC0295Gu.m625r(-336467737966645L);
        C1214bG r1 = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-587212223674421L));     // Catch: Exception -> L19
        if (r1 == null) goto L6;
        Object r12 = r1.f4146a;     // Catch: Exception -> L19
    L8:
        if ((r12 instanceof Method) == false) goto L10;
        Method r13 = (Method) r12;     // Catch: Exception -> L19
    L11:
        Object r14 = r13.invoke(null, null);     // Catch: Exception -> L19
        AbstractC0295Gu.m625r(-837707601279029L);     // Catch: Exception -> L19
        HashMap r15 = (HashMap) r14;     // Catch: Exception -> L19
        r5.createTable(0, r15.size());     // Catch: Exception -> L19
        Iterator r16 = r15.entrySet().iterator();     // Catch: Exception -> L19
    L12:
        if (r16.hasNext() == false) goto L31;
        Map.Entry r2 = (Map.Entry) r16.next();     // Catch: Exception -> L19
        Object r3 = r2.getKey();     // Catch: Exception -> L19
        Object r22 = r2.getValue();     // Catch: Exception -> L19
        if ((r3 instanceof String) == false) goto L12;
        if (r22 == null) goto L12;
        r5.push(r22.toString());     // Catch: Exception -> L19
        r5.setField(-2, (String) r3);     // Catch: Exception -> L19
        goto L12
    L31:
        return 1;
    L10:
        r13 = null;
        goto L11
    L6:
        r12 = null;
    L19:
        AbstractC0295Gu.m625r(-336476327901237L);
        AbstractC0295Gu.m625r(-336519277574197L);
        r5.createTable(0, 0);
        return 1;
    }

    private static final int register$lambda$7(Lua r4) {
        AbstractC0295Gu.m625r(-336596586985525L);
        Object r0 = MainApplication.f5549a;     // Catch: Exception -> L12
        if (r0 != null) goto L10;
        r0 = C1456gf.f5172p;     // Catch: Exception -> L12
        if (r0 != null) goto L10;
        r0 = AndroidAppHelper.currentApplication();     // Catch: Exception -> L12
        AbstractC0295Gu.m625r(-836852902787125L);     // Catch: Exception -> L12
    L10:
        r4.push(r0, Lua.Conversion.SEMI);     // Catch: Exception -> L12
        return 1;
    L12:
        AbstractC0213Ey.m412j(-336605176920117L, -336648126593077L, r4);
        return 1;
    }

    private static final int register$lambda$8(Lua r4) {
        AbstractC0295Gu.m625r(-336721141037109L);
        int r0 = AbstractC1450gG.f5067a;     // Catch: Exception -> L5
        r4.push(AbstractC1450gG.f5069c, Lua.Conversion.SEMI);     // Catch: Exception -> L5
        return 1;
    L5:
        AbstractC0213Ey.m412j(-337279486785589L, -337322436458549L, r4);
        return 1;
    }

    private static final int register$lambda$9(Lua r4) {
        AbstractC0295Gu.m625r(-337412630771765L);
        WeakReference r0 = C1456gf.f5173q;     // Catch: Exception -> L11
        if (r0 == null) goto L6;
        Activity r02 = (Activity) r0.get();     // Catch: Exception -> L11
    L7:
        if (r02 == null) goto L9;
        r4.push(r02, Lua.Conversion.SEMI);     // Catch: Exception -> L11
        return 1;
    L9:
        r4.pushNil();     // Catch: Exception -> L11
        return 1;
    L6:
        r02 = null;
    L11:
        AbstractC0213Ey.m412j(-337421220706357L, -337464170379317L, r4);
        return 1;
    }

    public final void register(Lua r5) {
        AbstractC0295Gu.m625r(-339710438275125L);
        r5.createTable(0, 20);
        r5.push(new C0465Ks(7));
        r5.setField(-2, AbstractC0295Gu.m625r(-339727618144309L));
        r5.push(new C0465Ks(24));
        r5.setField(-2, AbstractC0295Gu.m625r(-339212222068789L));
        r5.push(new C0465Ks(8));
        r5.setField(-2, AbstractC0295Gu.m625r(-339259466709045L));
        r5.push(new C0465Ks(9));
        r5.setField(-2, AbstractC0295Gu.m625r(-339293826447413L));
        r5.push(new C0465Ks(10));
        r5.setField(-2, AbstractC0295Gu.m625r(-339336776120373L));
        r5.push(new C0465Ks(11));
        r5.setField(-2, AbstractC0295Gu.m625r(-339379725793333L));
        r5.push(new C0465Ks(12));
        r5.setField(-2, AbstractC0295Gu.m625r(-339431265400885L));
        r5.push(new C0465Ks(13));
        r5.setField(-2, AbstractC0295Gu.m625r(-337829242599477L));
        r5.push(new C0465Ks(14));
        r5.setField(-2, AbstractC0295Gu.m625r(-337893667108917L));
        r5.push(new C0465Ks(15));
        r5.setField(-2, AbstractC0295Gu.m625r(-337945206716469L));
        r5.push(new C0465Ks(16));
        r5.setField(-2, AbstractC0295Gu.m625r(-338009631225909L));
        r5.push(new C0465Ks(17));
        r5.setField(-2, AbstractC0295Gu.m625r(-338056875866165L));
        r5.push(new C0465Ks(18));
        r5.setField(-2, AbstractC0295Gu.m625r(-338099825539125L));
        r5.push(new C0465Ks(19));
        r5.setField(-2, AbstractC0295Gu.m625r(-337601609332789L));
        r5.push(new C0465Ks(20));
        r5.setField(-2, AbstractC0295Gu.m625r(-337670328809525L));
        r5.push(new C0465Ks(21));
        r5.setField(-2, AbstractC0295Gu.m625r(-337756228155445L));
        r5.push(new C0465Ks(22));
        r5.setField(-2, AbstractC0295Gu.m625r(-337799177828405L));
        r5.push(new C0465Ks(23));
        r5.setField(-2, AbstractC0295Gu.m625r(-338400473249845L));
        r5.setGlobal(AbstractC0295Gu.m625r(-338443422922805L));
        AbstractC0295Gu.m625r(-338473487693877L);
        AbstractC0295Gu.m625r(-338516437366837L);
    }
}
