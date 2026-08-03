package io.github.cherrywechat.lua.api;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import io.github.cherrywechat.lua.LuaLocks;
import io.github.cherrywechat.lua.LuaUiScheduler;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0650P4;
import p000.AbstractC2453ra;
import p000.AbstractC2539ta;
import p000.AbstractC2598uq;
import p000.AbstractC2675wh;
import p000.C0200El;
import p000.C0208Et;
import p000.C0286Gl;
import p000.C0309H7;
import p000.C0829TC;
import p000.C1227bm;
import p000.C2087j8;
import p000.C2131k8;
import p000.C2265n8;
import p000.C2308o8;
import p000.C2402q8;
import p000.DialogInterfaceOnClickListenerC2179l8;
import p000.DialogInterfaceOnDismissListenerC2351p8;
import p000.InterfaceC0884Ui;
import p000.InterfaceC1416fj;
import p000.RunnableC2222m8;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"StaticFieldLeak"})
public final class CherryAPI {
    public static final CherryAPI INSTANCE = null;
    private static final String TAG = null;
    private static volatile Activity currentActivity;
    private static volatile Context currentContext;
    private static final Handler mainHandler = null;
    private static volatile InterfaceC1416fj printListener;

    static {
        TAG = AbstractC0295Gu.m625r(-502481108858933L);
        INSTANCE = new CherryAPI();
        mainHandler = new Handler(Looper.getMainLooper());
    }

    private CherryAPI() {
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ int m2987A(Lua r0) {
        return registerUtilApi$lambda$26(r0);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ int m2988B(Lua r0) {
        return registerUiApi$lambda$20(r0);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ int m2989C(Lua r0) {
        return registerUtilApi$lambda$28(r0);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m2990D(int r0, Lua r1, DialogInterface r2, int r3) {
        registerUiApi$lambda$20$lambda$19$lambda$14(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ C0829TC m2991E(String r0, String r1, int r2, Lua r3) {
        return registerUiApi$lambda$12$lambda$11(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ int m2992F(Lua r0) {
        return registerConfigApi$lambda$35(r0);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ C0829TC m2993G(Lua r0, int r1) {
        return registerUiApi$lambda$20$lambda$19$lambda$18$lambda$17(r0, r1);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ int m2994H(String r0, String r1) {
        return registerLogApi$lambda$4(r0, r1);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ int m2995I(Lua r0) {
        return registerGlobalFunctions$lambda$57(r0);
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ int m2996J(Lua r0) {
        return registerFileApi$lambda$46(r0);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ C0829TC m2997K(Lua r0, int r1) {
        return registerThreadApi$lambda$42$lambda$41$lambda$40(r0, r1);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ int m2998L(Function2 r0, Lua r1) {
        return registerLogApi$lambda$6$lambda$5(r0, r1);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ int m2999M(Lua r0) {
        return registerFileApi$lambda$53(r0);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m3000N(Lua r0, int r1) {
        registerThreadApi$lambda$45$lambda$44(r0, r1);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ int m3001O(Lua r0) {
        return registerFileApi$lambda$50(r0);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ int m3002P(Lua r0) {
        return registerUtilApi$lambda$27(r0);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ int m3003Q(Lua r0) {
        return registerConfigApi$lambda$34(r0);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ C0829TC m3004R(Lua r0, int r1) {
        return registerThreadApi$lambda$45$lambda$44$lambda$43(r0, r1);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m3005S(Lua r0, int r1) {
        registerThreadApi$lambda$42$lambda$41(r0, r1);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ int m3006T(Lua r0) {
        return registerGlobalFunctions$lambda$55(r0);
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ int m3007U(Lua r0) {
        return registerLogApi$lambda$0(r0);
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ int m3008V(Lua r0) {
        return registerUtilApi$lambda$29(r0);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ C0829TC m3009W(String r0, String r1, int r2, Lua r3) {
        return registerUiApi$lambda$20$lambda$19(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ int m3010X(Lua r0) {
        return registerUtilApi$lambda$31(r0);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ int m3011Y(Lua r0) {
        return registerFileApi$lambda$47(r0);
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ int m3012Z(Lua r0) {
        return registerUtilApi$lambda$24(r0);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m3013a(Lua r0) {
        return registerGlobalFunctions$lambda$60(r0);
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m3014a0(int r0, Lua r1, DialogInterface r2, int r3) {
        registerUiApi$lambda$12$lambda$11$lambda$10(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m3015b(Lua r0) {
        return registerConfigApi$lambda$33(r0);
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ C0829TC m3016b0(Lua r0, int r1) {
        return registerUiApi$lambda$20$lambda$19$lambda$16$lambda$15(r0, r1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m3017c(Lua r0) {
        return registerThreadApi$lambda$42(r0);
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ int m3018c0(String r0, String r1) {
        return registerLogApi$lambda$2(r0, r1);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m3019d(Lua r0) {
        return registerUiApi$lambda$21(r0);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C0829TC m3020e(Lua r0, int r1) {
        return registerThreadApi$lambda$38$lambda$37$lambda$36(r0, r1);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m3021f(Lua r0) {
        return registerConfigApi$lambda$32(r0);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C0829TC m3022g(int r0, String r1) {
        return registerUiApi$lambda$8$lambda$7(r1, r0);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m3023h(Lua r0) {
        return registerThreadApi$lambda$45(r0);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C0829TC m3024i(Lua r0, int r1) {
        return registerThreadApi$lambda$38$lambda$37(r0, r1);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m3025j(Lua r0) {
        return registerFileApi$lambda$52(r0);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ C0829TC m3026k(Lua r0, int r1) {
        return registerThreadApi$lambda$42$lambda$41$lambda$40$lambda$39(r0, r1);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ int m3027l(String r0, String r1) {
        return registerLogApi$lambda$1(r0, r1);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ int m3028m(Lua r0) {
        return registerFileApi$lambda$48(r0);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m3029n(int r0, Lua r1, DialogInterface r2, int r3) {
        registerUiApi$lambda$20$lambda$19$lambda$16(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ int m3030o(Lua r0) {
        return registerUtilApi$lambda$30(r0);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ int m3031p(Lua r0) {
        return registerFileApi$lambda$49(r0);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ int m3032q(Lua r0) {
        return registerUiApi$lambda$12(r0);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ int m3033r(Lua r0) {
        return registerUiApi$lambda$8(r0);
    }

    private final void registerConfigApi(Lua r5) {
        r5.createTable(0, 4);
        r5.push(new C2131k8(23));
        r5.setField(-2, AbstractC0295Gu.m625r(-506067406551093L));
        r5.push(new C2131k8(24));
        r5.setField(-2, AbstractC0295Gu.m625r(-506084586420277L));
        r5.push(new C2131k8(25));
        r5.setField(-2, AbstractC0295Gu.m625r(-506101766289461L));
        r5.push(new C2131k8(26));
        r5.setField(-2, AbstractC0295Gu.m625r(-506131831060533L));
        r5.setField(-2, AbstractC0295Gu.m625r(-506157600864309L));
    }

    private static final int registerConfigApi$lambda$32(Lua r7) {
        AbstractC0295Gu.m625r(-503657929898037L);
        String r1 = r7.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        if (r7.getTop() <= 1) goto L8;
        String r3 = r7.toString(2);
    L9:
        Context r4 = currentContext;
        if (r4 != null) goto L12;
        r4 = currentActivity;
    L12:
        if (r4 == null) goto L17;
        String r12 = r4.getSharedPreferences(AbstractC0295Gu.m625r(-503666519832629L), 0).getString(r1, r3);
        if (r12 == null) goto L16;
        r7.push(r12);
    L20:
        return 1;
    L16:
        r7.pushNil();
        goto L20
    L17:
        if (r3 == null) goto L19;
        r7.push(r3);
        goto L20
    L19:
        r7.pushNil();
        goto L20
    L8:
        r3 = null;
        goto L9
    }

    private static final int registerConfigApi$lambda$33(Lua r7) {
        AbstractC0295Gu.m625r(-503713764472885L);
        String r1 = r7.toString(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        String r3 = r7.toString(2);
        Context r4 = currentContext;
        if (r4 != null) goto L8;
        r4 = currentActivity;
    L8:
        if (r4 == null) goto L10;
        r4.getSharedPreferences(AbstractC0295Gu.m625r(-503722354407477L), 0).edit().putString(r1, r3).apply();
        r7.push(true);
    L11:
        return 1;
    L10:
        r7.push(false);
        goto L11
    }

    private static final int registerConfigApi$lambda$34(Lua r6) {
        AbstractC0295Gu.m625r(-503769599047733L);
        String r1 = r6.toString(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        Context r3 = currentContext;
        if (r3 != null) goto L8;
        r3 = currentActivity;
    L8:
        if (r3 == null) goto L10;
        r3.getSharedPreferences(AbstractC0295Gu.m625r(-503778188982325L), 0).edit().remove(r1).apply();
        r6.push(true);
    L11:
        return 1;
    L10:
        r6.push(false);
        goto L11
    }

    private static final int registerConfigApi$lambda$35(Lua r5) {
        AbstractC0295Gu.m625r(-503825433622581L);
        Context r0 = currentContext;
        if (r0 != null) goto L6;
        r0 = currentActivity;
    L6:
        if (r0 == null) goto L8;
        r0.getSharedPreferences(AbstractC0295Gu.m625r(-503834023557173L), 0).edit().clear().apply();
        r5.push(true);
    L9:
        return 1;
    L8:
        r5.push(false);
        goto L9
    }

    private final void registerFileApi(Lua r5) {
        r5.createTable(0, 6);
        r5.push(new C2131k8(3));
        r5.setField(-2, AbstractC0295Gu.m625r(-506325104588853L));
        r5.push(new C2131k8(4));
        r5.setField(-2, AbstractC0295Gu.m625r(-505796823611445L));
        r5.push(new C2131k8(5));
        r5.setField(-2, AbstractC0295Gu.m625r(-505822593415221L));
        r5.push(new C2131k8(6));
        r5.setField(-2, AbstractC0295Gu.m625r(-505852658186293L));
        r5.push(new C2131k8(7));
        r5.setField(-2, AbstractC0295Gu.m625r(-505882722957365L));
        r5.push(new C2131k8(8));
        r5.setField(-2, AbstractC0295Gu.m625r(-505908492761141L));
        r5.push(new C2131k8(9));
        r5.setField(-2, AbstractC0295Gu.m625r(-505929967597621L));
        r5.setField(-2, AbstractC0295Gu.m625r(-505985802172469L));
    }

    private static final int registerFileApi$lambda$46(Lua r3) {
        AbstractC0295Gu.m625r(-504456793815093L);
        String r1 = r3.toString(1);
        if (r1 != null) goto L10;
        return 0;
    L10:
        r3.push(AbstractC2675wh.m5244g0(new File(r1)));     // Catch: Exception -> L8
        return 1;
    L8:
        r3.pushNil();
        return 1;
    }

    private static final int registerFileApi$lambda$47(Lua r5) {
        AbstractC0295Gu.m625r(-504465383749685L);
        String r1 = r5.toString(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        String r3 = r5.toString(2);
        if (r3 != null) goto L12;
        r3 = AbstractC0295Gu.m625r(-504473973684277L);
    L12:
        AbstractC2675wh.m5246i0(new File(r1), r3);     // Catch: Exception -> L10
        r5.push(true);     // Catch: Exception -> L10
        return 1;
    L10:
        r5.push(false);
        return 1;
    }

    private static final int registerFileApi$lambda$48(Lua r3) {
        AbstractC0295Gu.m625r(-504478268651573L);
        String r1 = r3.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        r3.push(new File(r1).exists());
        return 1;
    }

    private static final int registerFileApi$lambda$49(Lua r3) {
        AbstractC0295Gu.m625r(-504486858586165L);
        String r1 = r3.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        r3.push(new File(r1).delete());
        return 1;
    }

    private static final int registerFileApi$lambda$50(Lua r3) {
        AbstractC0295Gu.m625r(-504495448520757L);
        String r1 = r3.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        r3.push(new File(r1).mkdirs());
        return 1;
    }

    private static final int registerFileApi$lambda$52(Lua r6) {
        AbstractC0295Gu.m625r(-504504038455349L);
        String r1 = r6.toString(1);
        int r2 = 0;
        if (r1 != null) goto L5;
        return 0;
    L5:
        File[] r12 = new File(r1).listFiles();
        if (r12 == null) goto L10;
        r6.createTable(r12.length, 0);
        int r3 = r12.length;
        int r4 = 0;
    L8:
        if (r2 >= r3) goto L11;
        r4 = r4 + 1;
        r6.push(r12[r2].getName());
        r6.rawSetI(-2, r4);
        r2 = r2 + 1;
    L11:
        return 1;
    L10:
        r6.createTable(0, 0);
        goto L11
    }

    private static final int registerFileApi$lambda$53(Lua r4) {
        AbstractC0295Gu.m625r(-504512628389941L);
        Context r0 = currentContext;
        if (r0 != null) goto L5;
        r0 = currentActivity;
    L5:
        if (r0 == null) goto L10;
        File r1 = new File(r0.getFilesDir(), AbstractC0295Gu.m625r(-504521218324533L));
        if (r1.exists() == true) goto L9;
        r1.mkdirs();
    L9:
        r4.push(r1.getAbsolutePath());
        return 1;
    L10:
        r4.pushNil();
        return 1;
    }

    private final void registerGlobalFunctions(Lua r3) {
        r3.push(new C2131k8(19));
        r3.setGlobal(AbstractC0295Gu.m625r(-506007277008949L));
        r3.push(new C2131k8(20));
        r3.setGlobal(AbstractC0295Gu.m625r(-506033046812725L));
        r3.push(new C2131k8(21));
        r3.setGlobal(AbstractC0295Gu.m625r(-506612867397685L));
    }

    private static final int registerGlobalFunctions$lambda$55(Lua r9) {
        AbstractC0295Gu.m625r(-504572757932085L);
        C0286Gl r0 = new C0286Gl(1, r9.getTop(), 1);
        ArrayList r3 = new ArrayList(AbstractC2539ta.m5019d0(r0, 10));
        Iterator r02 = r0.iterator();
    L3:
        C0200El r1 = (C0200El) r02;
        if (r1.f605c == false) goto L11;
        Object r12 = r9.toObject(r1.nextInt());
        if (r12 == null) goto L9;
        String r13 = r12.toString();
        if (r13 == null) goto L9;
    L10:
        r3.add(r13);
    L9:
        r13 = AbstractC0295Gu.m625r(-504581347866677L);
        goto L10
    L11:
        String r92 = AbstractC2453ra.m4901k0(r3, AbstractC0295Gu.m625r(-504598527735861L), null, null, null, 62);
        AbstractC0295Gu.m625r(-504607117670453L);
        InterfaceC1416fj r03 = printListener;
        if (r03 == null) goto L19;
        r03.mo90g(r92);
        return 0;
    L19:
        return 0;
    }

    private static final int registerGlobalFunctions$lambda$57(Lua r6) {
        AbstractC0295Gu.m625r(-504650067343413L);
        if (r6.getTop() >= 1) goto L5;
        return 0;
    L5:
        String r0 = r6.toString(1);
        if (r0 != null) goto L8;
        return 0;
    L8:
        C0286Gl r3 = new C0286Gl(2, r6.getTop(), 1);
        ArrayList r2 = new ArrayList(AbstractC2539ta.m5019d0(r3, 10));
        Iterator r32 = r3.iterator();
    L10:
        if (r32.hasNext() == false) goto L12;
        r2.add(r6.toObject(((C0200El) r32).nextInt()));
        goto L10
    L12:
        Object[] r62 = r2.toArray(new Object[0]);
        Object[] r63 = Arrays.copyOf(r62, r62.length);     // Catch: Exception -> L15
        String.format(r0, Arrays.copyOf(r63, r63.length));     // Catch: Exception -> L15
        AbstractC0295Gu.m625r(-504658657278005L);     // Catch: Exception -> L15
        AbstractC0295Gu.m625r(-504160441071669L);     // Catch: Exception -> L15
    L17:
        return 0;
    L15:
        e = move-exception;
        AbstractC0213Ey.m411i(-504203390744629L, -504246340417589L, e);
        goto L17
    }

    private static final int registerGlobalFunctions$lambda$60(Lua r9) {
        AbstractC0295Gu.m625r(-504310764927029L);
        Object r1 = r9.toObject(1);
        StringBuilder r2 = new StringBuilder();
        r2.append(AbstractC0295Gu.m625r(-504319354861621L));
        r2.append('\n');
        String r4 = AbstractC0295Gu.m625r(-504345124665397L);
        if (r1 == null) goto L5;
        String r5 = r1.getClass().getName();
    L6:
        r2.append(r4.concat(r5));
        r2.append('\n');
        if (r1 == null) goto L21;
        r2.append(AbstractC0295Gu.m625r(-504392369305653L) + r1);
        r2.append('\n');
        if ((r1 instanceof String) == true) goto L21;
        if ((r1 instanceof Number) == true) goto L21;
        if ((r1 instanceof Boolean) == true) goto L21;
        r2.append(AbstractC0295Gu.m625r(-502777461602357L));
        r2.append('\n');
        Field[] r42 = r1.getClass().getDeclaredFields();
        AbstractC0295Gu.m625r(-502811821340725L);
        Iterator r43 = AbstractC0650P4.m1315J(r42, 10).iterator();
    L16:
        if (r43.hasNext() == false) goto L21;
        Field r52 = (Field) r43.next();
        r52.setAccessible(true);
        r2.append(AbstractC0295Gu.m625r(-502910605588533L) + r52.getName() + AbstractC0295Gu.m625r(-502923490490421L) + r52.get(r1));     // Catch: Exception -> L20
        r2.append('\n');     // Catch: Exception -> L20
    L20:
        r2.append(AbstractC0295Gu.m625r(-502936375392309L) + r52.getName() + AbstractC0295Gu.m625r(-502949260294197L));
        r2.append('\n');
    L21:
        r2.append(AbstractC0295Gu.m625r(-502992209967157L));
        r2.append('\n');
        String r12 = r2.toString();
        AbstractC0295Gu.m625r(-502996504934453L);
        r9.push(r12);
        return 1;
    L5:
        r5 = AbstractC0295Gu.m625r(-504375189436469L);
        goto L6
    }

    private final void registerLogApi(Lua r9) {
        r9.push(new C2131k8(10));
        r9.setField(-2, AbstractC0295Gu.m625r(-507119673538613L));
        Iterator r0 = AbstractC2598uq.m5110L(new C0208Et[]{new C0208Et(AbstractC0295Gu.m625r(-507136853407797L), new C0309H7(1)), new C0208Et(AbstractC0295Gu.m625r(-507708084058165L), new C0309H7(2)), new C0208Et(AbstractC0295Gu.m625r(-507729558894645L), new C0309H7(3)), new C0208Et(AbstractC0295Gu.m625r(-507751033731125L), new C0309H7(4))}).entrySet().iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        Map.Entry r2 = (Map.Entry) r0.next();
        String r3 = (String) r2.getKey();
        int r5 = 3;
        r9.push(new C1227bm(r5, (Function2) r2.getValue()));
        r9.setField(-2, r3);
        goto L4
    }

    private static final int registerLogApi$lambda$0(Lua r2) {
        AbstractC0295Gu.m625r(-506634342234165L);
        if (r2.getTop() != 1) goto L9;
        if (r2.toString(1) != null) goto L7;
        AbstractC0295Gu.m625r(-506642932168757L);
    L7:
        AbstractC0295Gu.m625r(-506660112037941L);
        return 0;
    L9:
        if (r2.toString(1) != null) goto L12;
        AbstractC0295Gu.m625r(-506703061710901L);
    L12:
        if (r2.toString(2) != null) goto L17;
        AbstractC0295Gu.m625r(-506746011383861L);
        return 0;
    L17:
        return 0;
    }

    private static final int registerLogApi$lambda$1(String r2, String r3) {
        AbstractC0295Gu.m625r(-506763191253045L);
        AbstractC0295Gu.m625r(-506780371122229L);
        return Log.d(r2, r3);
    }

    private static final int registerLogApi$lambda$2(String r2, String r3) {
        AbstractC0295Gu.m625r(-506797550991413L);
        AbstractC0295Gu.m625r(-506814730860597L);
        return Log.i(r2, r3);
    }

    private static final int registerLogApi$lambda$3(String r2, String r3) {
        AbstractC0295Gu.m625r(-506831910729781L);
        AbstractC0295Gu.m625r(-506849090598965L);
        return Log.w(r2, r3);
    }

    private static final int registerLogApi$lambda$4(String r2, String r3) {
        AbstractC0295Gu.m625r(-506866270468149L);
        AbstractC0295Gu.m625r(-506333694523445L);
        return Log.e(r2, r3);
    }

    private static final int registerLogApi$lambda$6$lambda$5(Function2 r4, Lua r5) {
        AbstractC0295Gu.m625r(-506350874392629L);
        if (r5.getTop() <= 1) goto L8;
        String r0 = r5.toString(1);
        if (r0 != null) goto L10;
        long r2 = -506359464327221L;
    L7:
        r0 = AbstractC0295Gu.m625r(r2);
    L10:
        if (r5.getTop() <= 1) goto L15;
        String r52 = r5.toString(2);
        if (r52 != null) goto L18;
        long r1 = -506445363673141L;
    L14:
        r52 = AbstractC0295Gu.m625r(r1);
    L18:
        r4.mo446d(r0, r52);
        return 0;
    L15:
        r52 = r5.toString(1);
        if (r52 != null) goto L18;
        r1 = -506462543542325L;
        goto L14
    L8:
        r2 = -506402414000181L;
        goto L7
    }

    private final void registerThreadApi(Lua r5) {
        r5.push(new C2131k8(11));
        r5.setField(-2, AbstractC0295Gu.m625r(-506187665635381L));
        r5.push(new C2131k8(12));
        r5.setField(-2, AbstractC0295Gu.m625r(-506247795177525L));
        r5.push(new C2131k8(13));
        r5.setField(-2, AbstractC0295Gu.m625r(-506299334785077L));
    }

    private static final int registerThreadApi$lambda$38(Lua r5) {
        AbstractC0295Gu.m625r(-504431024011317L);
        if (r5.isFunction(1) == true) goto L5;
        return 0;
    L5:
        r5.pushValue(1);
        int r0 = r5.ref();
        INSTANCE.runOnUiThread(new C2087j8(r5, r0, 0));
        return 0;
    }

    private static final C0829TC registerThreadApi$lambda$38$lambda$37(Lua r3, int r4) {
        LuaLocks.INSTANCE.withLock(r3, new C2087j8(r3, r4, 8));
        return C0829TC.f2620a;
    }

    private static final C0829TC registerThreadApi$lambda$38$lambda$37$lambda$36(Lua r1, int r2) {
        r1.refGet(r2);
        r1.pCall(0, 0);
        r1.unref(r2);
        return C0829TC.f2620a;
    }

    private static final int registerThreadApi$lambda$42(Lua r7) {
        AbstractC0295Gu.m625r(-504439613945909L);
        if (r7.isFunction(1) == true) goto L5;
        return 0;
    L5:
        long r3 = (long) r7.toNumber(2);
        r7.pushValue(1);
        int r0 = r7.ref();
        mainHandler.postDelayed(new RunnableC2222m8(r7, r0, 0), r3);
        return 0;
    }

    private static final void registerThreadApi$lambda$42$lambda$41(Lua r3, int r4) {
        LuaUiScheduler.INSTANCE.runOnUiThread(new C2087j8(r3, r4, 2));
    }

    private static final C0829TC registerThreadApi$lambda$42$lambda$41$lambda$40(Lua r3, int r4) {
        LuaLocks.INSTANCE.withLock(r3, new C2087j8(r3, r4, 6));
        return C0829TC.f2620a;
    }

    private static final C0829TC registerThreadApi$lambda$42$lambda$41$lambda$40$lambda$39(Lua r1, int r2) {
        r1.refGet(r2);
        r1.pCall(0, 0);
        r1.unref(r2);
        return C0829TC.f2620a;
    }

    private static final int registerThreadApi$lambda$45(Lua r5) {
        AbstractC0295Gu.m625r(-504448203880501L);
        if (r5.isFunction(1) == true) goto L5;
        return 0;
    L5:
        r5.pushValue(1);
        new Thread(new RunnableC2222m8(r5, r5.ref(), 1)).start();
        return 0;
    }

    private static final void registerThreadApi$lambda$45$lambda$44(Lua r3, int r4) {
        LuaLocks.INSTANCE.withLock(r3, new C2087j8(r3, r4, 1));
    }

    private static final C0829TC registerThreadApi$lambda$45$lambda$44$lambda$43(Lua r1, int r2) {
        r1.refGet(r2);
        r1.pCall(0, 0);
        r1.unref(r2);
        return C0829TC.f2620a;
    }

    private final void registerUiApi(Lua r5) {
        r5.push(new C2131k8(14));
        r5.setField(-2, AbstractC0295Gu.m625r(-507772508567605L));
        r5.push(new C2131k8(15));
        r5.setField(-2, AbstractC0295Gu.m625r(-507798278371381L));
        r5.push(new C2131k8(16));
        r5.setField(-2, AbstractC0295Gu.m625r(-507824048175157L));
        r5.push(new C2131k8(17));
        r5.setField(-2, AbstractC0295Gu.m625r(-507858407913525L));
        r5.push(new C2131k8(18));
        r5.setField(-2, AbstractC0295Gu.m625r(-507909947521077L));
    }

    private static final int registerUiApi$lambda$12(Lua r7) {
        AbstractC0295Gu.m625r(-505148283549749L);
        String r0 = r7.toString(1);
        if (r0 != null) goto L5;
        r0 = AbstractC0295Gu.m625r(-505156873484341L);
    L5:
        String r2 = r0;
        String r02 = r7.toString(2);
        if (r02 != null) goto L8;
        r02 = AbstractC0295Gu.m625r(-505161168451637L);
    L8:
        String r3 = r02;
        if (r7.getTop() >= 3) goto L11;
    L14:
        int r03 = -1;
    L13:
        int r4 = r03;
        INSTANCE.runOnUiThread(new C2265n8(r2, r3, r4, r7, 1));
        return 0;
    L11:
        if (r7.isFunction(3) == false) goto L14;
        r7.pushValue(3);
        r03 = r7.ref();
        goto L13
    }

    private static final C0829TC registerUiApi$lambda$12$lambda$11(String r2, String r3, int r4, Lua r5) {
        Activity r0 = currentActivity;
        if (r0 != null) goto L5;
    L7:
        AbstractC0295Gu.m625r(-505010844596277L);
        AbstractC0295Gu.m625r(-505053794269237L);
    L9:
        return C0829TC.f2620a;
    L5:
        if (r0.isFinishing() == true) goto L7;
        new AlertDialog.Builder(r0).setTitle(r2).setMessage(r3).setPositiveButton(AbstractC0295Gu.m625r(-504997959694389L), new DialogInterfaceOnClickListenerC2179l8(r4, r5, 0)).show();
        goto L9
    }

    private static final void registerUiApi$lambda$12$lambda$11$lambda$10(int r1, Lua r2, DialogInterface r3, int r4) {
        r3.dismiss();
        if (r1 == (-1)) goto L6;
        LuaLocks.INSTANCE.withLock(r2, new C2087j8(r2, r1, 4));
        return;
    }

    private static final C0829TC registerUiApi$lambda$12$lambda$11$lambda$10$lambda$9(Lua r2, int r3) {
        r2.refGet(r3);
        r2.push(true);
        r2.pCall(1, 0);
        r2.unref(r3);
        return C0829TC.f2620a;
    }

    private static final int registerUiApi$lambda$20(Lua r7) {
        AbstractC0295Gu.m625r(-505208413091893L);
        String r0 = r7.toString(1);
        if (r0 != null) goto L5;
        r0 = AbstractC0295Gu.m625r(-505217003026485L);
    L5:
        String r2 = r0;
        String r02 = r7.toString(2);
        if (r02 != null) goto L8;
        r02 = AbstractC0295Gu.m625r(-505221297993781L);
    L8:
        String r3 = r02;
        if (r7.getTop() >= 3) goto L11;
    L14:
        int r03 = -1;
    L13:
        int r4 = r03;
        INSTANCE.runOnUiThread(new C2265n8(r2, r3, r4, r7, 0));
        return 0;
    L11:
        if (r7.isFunction(3) == false) goto L14;
        r7.pushValue(3);
        r03 = r7.ref();
        goto L13
    }

    private static final C0829TC registerUiApi$lambda$20$lambda$19(String r2, String r3, final int r4, final Lua r5) {
        Activity r0 = currentActivity;
        if (r0 == null) goto L8;
        if (r0.isFinishing() == true) goto L8;
        new AlertDialog.Builder(r0).setTitle(r2).setMessage(r3).setPositiveButton(AbstractC0295Gu.m625r(-505165463418933L), new DialogInterfaceOnClickListenerC2179l8(r4, r5, 1)).setNegativeButton(AbstractC0295Gu.m625r(-505178348320821L), new DialogInterfaceOnClickListenerC2179l8(r4, r5, 2)).setOnDismissListener(new DialogInterfaceOnDismissListenerC2351p8(r5, r4)).show();
    L8:
        return C0829TC.f2620a;
    }

    private static final void registerUiApi$lambda$20$lambda$19$lambda$14(int r1, Lua r2, DialogInterface r3, int r4) {
        r3.dismiss();
        if (r1 == (-1)) goto L6;
        LuaLocks.INSTANCE.withLock(r2, new C2087j8(r2, r1, 5));
        return;
    }

    private static final C0829TC registerUiApi$lambda$20$lambda$19$lambda$14$lambda$13(Lua r1, int r2) {
        r1.refGet(r2);
        r1.push(true);
        r1.pCall(1, 0);
        return C0829TC.f2620a;
    }

    private static final void registerUiApi$lambda$20$lambda$19$lambda$16(int r1, Lua r2, DialogInterface r3, int r4) {
        r3.dismiss();
        if (r1 == (-1)) goto L6;
        LuaLocks.INSTANCE.withLock(r2, new C2087j8(r2, r1, 7));
        return;
    }

    private static final C0829TC registerUiApi$lambda$20$lambda$19$lambda$16$lambda$15(Lua r1, int r2) {
        r1.refGet(r2);
        r1.push(false);
        r1.pCall(1, 0);
        return C0829TC.f2620a;
    }

    private static final void registerUiApi$lambda$20$lambda$19$lambda$18(int r2, Lua r3, DialogInterface r4) {
        if (r2 == (-1)) goto L6;
        LuaLocks.INSTANCE.withLock(r3, new C2087j8(r3, r2, 3));
        return;
    }

    private static final C0829TC registerUiApi$lambda$20$lambda$19$lambda$18$lambda$17(Lua r0, int r1) {
        r0.unref(r1);
        return C0829TC.f2620a;
    }

    private static final int registerUiApi$lambda$21(Lua r2) {
        AbstractC0295Gu.m625r(-505225592961077L);
        Activity r0 = currentActivity;
        if (r0 == null) goto L5;
        r2.push(r0, Lua.Conversion.SEMI);
        return 1;
    L5:
        r2.pushNil();
        return 1;
    }

    private static final int registerUiApi$lambda$22(Lua r2) {
        AbstractC0295Gu.m625r(-504684427081781L);
        Object r0 = currentActivity;
        if (r0 != null) goto L6;
        r0 = currentContext;
    L6:
        if (r0 == null) goto L8;
        r2.push(r0, Lua.Conversion.SEMI);
        return 1;
    L8:
        r2.pushNil();
        return 1;
    }

    private static final int registerUiApi$lambda$8(Lua r6) {
        AbstractC0295Gu.m625r(-504972189890613L);
        int r0 = 1;
        String r1 = r6.toString(1);
        if (r1 != null) goto L6;
        r1 = AbstractC0295Gu.m625r(-504980779825205L);
    L6:
        if (r6.getTop() > 1) goto L8;
    L10:
        r0 = 0;
    L11:
        INSTANCE.runOnUiThread(new C2308o8(r1, r0, 0));
        return 0;
    L8:
        if (((int) r6.toNumber(2)) <= 0) goto L10;
        goto L10
    }

    private static final C0829TC registerUiApi$lambda$8$lambda$7(String r1, int r2) {
        Context r0 = currentActivity;
        if (r0 != null) goto L6;
        r0 = currentContext;
    L6:
        if (r0 == null) goto L8;
        Toast.makeText(r0, r1, r2).show();
    L10:
        return C0829TC.f2620a;
    L8:
        AbstractC0295Gu.m625r(-506479723411509L);
        AbstractC0295Gu.m625r(-506522673084469L);
        goto L10
    }

    private final void registerUtilApi(Lua r5) {
        r5.push(new C2131k8(22));
        r5.setField(-2, AbstractC0295Gu.m625r(-507957192161333L));
        r5.push(new C2131k8(27));
        r5.setField(-2, AbstractC0295Gu.m625r(-507433206151221L));
        r5.push(new C2131k8(28));
        r5.setField(-2, AbstractC0295Gu.m625r(-507489040726069L));
        r5.push(new C2131k8(29));
        r5.setField(-2, AbstractC0295Gu.m625r(-507544875300917L));
        r5.push(new C2402q8(0));
        r5.setField(-2, AbstractC0295Gu.m625r(-507566350137397L));
        r5.push(new C2402q8(1));
        r5.setField(-2, AbstractC0295Gu.m625r(-507587824973877L));
        r5.push(new C2131k8(0));
        r5.setField(-2, AbstractC0295Gu.m625r(-507613594777653L));
        r5.push(new C2131k8(1));
        r5.setField(-2, AbstractC0295Gu.m625r(-507647954516021L));
        r5.push(new C2131k8(2));
        r5.setField(-2, AbstractC0295Gu.m625r(-507669429352501L));
    }

    private static final int registerUtilApi$lambda$23(Lua r4) {
        AbstractC0295Gu.m625r(-504693017016373L);
        long r0 = (long) r4.toNumber(1);
        if (r0 <= 0) goto L7;
        Thread.sleep(r0);
        return 0;
    L7:
        return 0;
    }

    private static final int registerUtilApi$lambda$24(Lua r2) {
        AbstractC0295Gu.m625r(-504701606950965L);
        r2.push(LuaUiScheduler.INSTANCE.isForeground());
        return 1;
    }

    private static final int registerUtilApi$lambda$25(Lua r2) {
        AbstractC0295Gu.m625r(-504710196885557L);
        r2.push(!LuaUiScheduler.INSTANCE.isForeground());
        return 1;
    }

    private static final int registerUtilApi$lambda$26(Lua r2) {
        AbstractC0295Gu.m625r(-504718786820149L);
        r2.push(Double.valueOf(System.currentTimeMillis()));
        return 1;
    }

    private static final int registerUtilApi$lambda$27(Lua r6) {
        AbstractC0295Gu.m625r(-504727376754741L);
        String r1 = r6.toString(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        Context r3 = currentActivity;
        if (r3 != null) goto L9;
        r3 = currentContext;
    L9:
        if (r3 == null) goto L11;
        Object r2 = r3.getSystemService(AbstractC0295Gu.m625r(-504735966689333L));
        AbstractC0295Gu.m625r(-504778916362293L);
        ((ClipboardManager) r2).setPrimaryClip(ClipData.newPlainText(AbstractC0295Gu.m625r(-505629319886901L), r1));
        r6.push(true);
    L12:
        return 1;
    L11:
        r6.push(false);
        goto L12
    }

    private static final int registerUtilApi$lambda$28(Lua r3) {
        AbstractC0295Gu.m625r(-505667974592565L);
        Context r0 = currentActivity;
        if (r0 != null) goto L6;
        r0 = currentContext;
    L6:
        if (r0 == null) goto L18;
        Object r02 = r0.getSystemService(AbstractC0295Gu.m625r(-505676564527157L));
        AbstractC0295Gu.m625r(-505719514200117L);
        ClipData r03 = ((ClipboardManager) r02).getPrimaryClip();
        if (r03 == null) goto L14;
        ClipData.Item r04 = r03.getItemAt(0);
        if (r04 == null) goto L14;
        CharSequence r05 = r04.getText();
        if (r05 == null) goto L14;
        String r06 = r05.toString();
    L15:
        if (r06 == null) goto L17;
        r3.push(r06);
        return 1;
    L17:
        r3.pushNil();
        return 1;
    L14:
        r06 = null;
        goto L15
    L18:
        r3.pushNil();
        return 1;
    }

    private static final int registerUtilApi$lambda$29(Lua r7) {
        AbstractC0295Gu.m625r(-505470406096949L);
        String r1 = r7.toString(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        Context r3 = currentActivity;
        if (r3 != null) goto L9;
        r3 = currentContext;
    L9:
        if (r3 != null) goto L15;
        r7.push(false);
    L14:
        return 1;
    L15:
        Intent r4 = new Intent(AbstractC0295Gu.m625r(-505478996031541L), Uri.parse(r1));     // Catch: Exception -> L12
        r4.addFlags(268435456);     // Catch: Exception -> L12
        r3.startActivity(r4);     // Catch: Exception -> L12
        r7.push(true);     // Catch: Exception -> L12
    L12:
        AbstractC0295Gu.m625r(-503945692706869L);
        AbstractC0295Gu.m625r(-503988642379829L);
        r7.push(false);
        goto L14
    }

    private static final int registerUtilApi$lambda$30(Lua r3) {
        AbstractC0295Gu.m625r(-504078836693045L);
        Object r1 = r3.toObject(1);
        if (r1 != null) goto L6;
        String r12 = AbstractC0295Gu.m625r(-504087426627637L);
    L15:
        r3.push(r12);
        return 1;
    L6:
        if ((r1 instanceof String) == false) goto L9;
        r12 = AbstractC0295Gu.m625r(-504104606496821L);
        goto L15
    L9:
        if ((r1 instanceof Number) == false) goto L12;
        r12 = AbstractC0295Gu.m625r(-503584915454005L);
        goto L15
    L12:
        if ((r1 instanceof Boolean) == false) goto L14;
        r12 = AbstractC0295Gu.m625r(-503614980225077L);
        goto L15
    L14:
        r12 = r1.getClass().getSimpleName();
        goto L15
    }

    private static final int registerUtilApi$lambda$31(Lua r4) {
        AbstractC0295Gu.m625r(-503649339963445L);
        Object r1 = r4.toObject(1);
        String r2 = r4.toString(2);
        if (r1 == null) goto L8;
        if (r2 == null) goto L8;
        r4.push(Class.forName(r2).isInstance(r1));     // Catch: ClassNotFoundException -> L7
    L9:
        return 1;
    L7:
        r4.push(false);
    L8:
        r4.push(false);
        goto L9
    }

    private final void runOnUiThread(InterfaceC0884Ui r2) {
        LuaUiScheduler.INSTANCE.runOnUiThread(r2);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ int m3034s(Lua r0) {
        return registerThreadApi$lambda$38(r0);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m3035t(int r0, Lua r1, DialogInterface r2) {
        registerUiApi$lambda$20$lambda$19$lambda$18(r0, r1, r2);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ int m3036u(Lua r0) {
        return registerUiApi$lambda$22(r0);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ C0829TC m3037v(Lua r0, int r1) {
        return registerUiApi$lambda$12$lambda$11$lambda$10$lambda$9(r0, r1);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ C0829TC m3038w(Lua r0, int r1) {
        return registerUiApi$lambda$20$lambda$19$lambda$14$lambda$13(r0, r1);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ int m3039x(String r0, String r1) {
        return registerLogApi$lambda$3(r0, r1);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ int m3040y(Lua r0) {
        return registerUtilApi$lambda$23(r0);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ int m3041z(Lua r0) {
        return registerUtilApi$lambda$25(r0);
    }

    public final Activity getCurrentActivity() {
        return currentActivity;
    }

    public final Context getCurrentContext() {
        return currentContext;
    }

    public final InterfaceC1416fj getPrintListener() {
        return printListener;
    }

    public final void register(Lua r3) {
        AbstractC0295Gu.m625r(-506939284912181L);
        r3.createTable(0, 20);
        registerLogApi(r3);
        registerUiApi(r3);
        registerUtilApi(r3);
        registerConfigApi(r3);
        registerThreadApi(r3);
        registerFileApi(r3);
        r3.setGlobal(AbstractC0295Gu.m625r(-506956464781365L));
        registerGlobalFunctions(r3);
        AbstractC0295Gu.m625r(-506986529552437L);
        AbstractC0295Gu.m625r(-507029479225397L);
    }

    public final void setCurrentActivity(Activity r1) {
        currentActivity = r1;
    }

    public final void setCurrentContext(Context r1) {
        currentContext = r1;
    }

    public final void setPrintListener(InterfaceC1416fj r1) {
        printListener = r1;
    }
}
