package p000;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import io.github.cherrywechat.R;
import io.github.cherrywechat.lua.api.CherryMessageAPI;
import io.github.cherrywechat.lua.api.NetworkAPI;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: Tp */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0848Tp implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2693a;

    public /* synthetic */ C0848Tp(int r1) {
        this.f2693a = r1;
    }

    /* JADX INFO: renamed from: c */
    private final Object m1670c(Object r8) {
        AbstractC0295Gu.m625r(-50470160693301L);
        C2428qs r82 = ((C1494hG) r8).f5263a;
        Field[] r0 = r82.f8521b.getClass().getFields();
        int r1 = 0;
    L4:
        if (r1 >= r0.length) goto L26;
        int r2 = r1 + 1;
        Field r12 = r0[r1];     // Catch: ArrayIndexOutOfBoundsException -> L22
        if (AbstractC0585Nj.m1134a(r12.getType(), View.class) == false) goto L21;
        Object r13 = r12.get(r82.f8521b);     // Catch: IllegalAccessException -> L27
        if ((r13 instanceof View) == false) goto L12;
        View r14 = (View) r13;     // Catch: IllegalAccessException -> L27
    L13:
        if (r14 == null) goto L21;
        ViewGroup.LayoutParams r3 = r14.getLayoutParams();     // Catch: IllegalAccessException -> L27
        if ((r3 instanceof RelativeLayout.LayoutParams) == false) goto L21;
        if (((RelativeLayout.LayoutParams) r3).width != (-1)) goto L21;
        if (((RelativeLayout.LayoutParams) r3).height != (-1)) goto L21;
        r14.setBackground(null);     // Catch: IllegalAccessException -> L27
        r14.setTag(R.id.tag_view_bg_ban, Object.class);     // Catch: IllegalAccessException -> L27
        ViewParent r15 = r14.getParent();     // Catch: IllegalAccessException -> L27
        AbstractC0295Gu.m625r(-50521700300853L);     // Catch: IllegalAccessException -> L27
        ((ViewGroup) r15).setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC2071is());     // Catch: IllegalAccessException -> L27
        goto L21
    L12:
        r14 = null;
    L21:
        r1 = r2;
    L22:
        e = move-exception;
        throw new NoSuchElementException(e.getMessage());
    L26:
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: e */
    private final Object m1671e(Object r8) {
        C1494hG r82 = (C1494hG) r8;
        AbstractC0295Gu.m625r(-474542346598453L);
        String r0 = AbstractC0295Gu.m625r(-474598181173301L);
        AbstractC0295Gu.m625r(-836659629258805L);
        StackTraceElement[] r1 = Thread.currentThread().getStackTrace();
        int r3 = 0;
    L4:
        if (r3 >= r1.length) goto L17;
        int r4 = r3 + 1;
        String r32 = r1[r3].toString();
        AbstractC0295Gu.m625r(-836681104095285L);
        if (AbstractC2564tz.m5051L(r32, r0, false) == true) goto L9;
        r3 = r4;
        goto L4
    L9:
        HashMap r02 = AbstractC0999XA.f3193a;
        Drawable r03 = C1517hw.m2890b(AbstractC0295Gu.m625r(-474692670453813L));
        if (r03 == null) goto L17;
        ((Object[]) r82.f5263a.f8522c)[0] = r03;
    L13:
        e = move-exception;
        throw new NoSuchElementException(e.getMessage());
    L17:
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: f */
    private final Object m1672f(Object r13) {
        AbstractC0295Gu.m625r(-473155072161845L);
        int r0 = 0;
        Object r132 = ((Object[]) ((C1494hG) r13).f5263a.f8522c)[0];
        if ((r132 instanceof ViewGroup) == false) goto L5;
        ViewGroup r133 = (ViewGroup) r132;
    L6:
        if (r133 == null) goto L57;
        String r1 = r133.getContext().getClass().getName();
        if (r1.equals(AbstractC0295Gu.m625r(-837870810036277L)) == false) goto L10;
    L13:
        int r6 = 1;
        if (r133.getChildCount() != 3) goto L39;
        if ((r133.getChildAt(0) instanceof ImageView) == false) goto L39;
        if ((r133.getChildAt(1) instanceof LinearLayout) == false) goto L39;
        if ((r133.getChildAt(2) instanceof ImageView) == false) goto L39;
        View r12 = r133.getChildAt(1);
        AbstractC0295Gu.m625r(-473210906736693L);
        ViewGroup r14 = (ViewGroup) r12;
        HashMap r2 = AbstractC0999XA.f3193a;
        Drawable r22 = C1517hw.m2890b(AbstractC0295Gu.m625r(-472918848960565L));
        if (r22 == null) goto L57;
        r133.getChildAt(1).setBackground(r22);
        Drawable r23 = C1517hw.m2890b(AbstractC0295Gu.m625r(-473627518564405L));
        if (r23 == null) goto L26;
        View r7 = r133.getChildAt(0);
        AbstractC0295Gu.m625r(-473825087060021L);
        ImageView r72 = (ImageView) r7;
        String r8 = AbstractC0295Gu.m625r(-473541619218485L);
        Object[] r9 = {Boolean.FALSE};
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r72, r8, Arrays.copyOf(r9, 1));
        r72.setImageDrawable(r23);
    L26:
        Drawable r24 = C1517hw.m2890b(AbstractC0295Gu.m625r(-471982546090037L));
        if (r24 == null) goto L29;
        View r134 = r133.getChildAt(2);
        AbstractC0295Gu.m625r(-472188704520245L);
        ImageView r135 = (ImageView) r134;
        String r73 = AbstractC0295Gu.m625r(-471905236678709L);
        Object[] r82 = {Boolean.FALSE};
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r135, r73, Arrays.copyOf(r82, 1));
        r135.setImageDrawable(r24);
    L29:
        r14.getChildAt(1).setAlpha(0.0f);
        int r136 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-472545186805813L));
        if (r136 == 0) goto L57;
        View r25 = r14.getChildAt(0);
        AbstractC0295Gu.m625r(-472682625759285L);
        ViewGroup r26 = (ViewGroup) r25;
        View r15 = r14.getChildAt(2);
        AbstractC0295Gu.m625r(-472390567983157L);
        ViewGroup r16 = (ViewGroup) r15;
        int r5 = r26.getChildCount();
        int r74 = 0;
    L32:
        if (r74 >= r5) goto L34;
        View r83 = r26.getChildAt(r74);
        AbstractC0295Gu.m625r(-470998998579253L);
        ViewGroup r84 = (ViewGroup) r83;
        View r92 = r84.findViewById(AbstractC0828TB.f2614f);
        String r10 = AbstractC0295Gu.m625r(-470706940803125L);
        Object[] r11 = {Integer.valueOf(r136)};
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r92, r10, Arrays.copyOf(r11, 1));
        ((TextView) r84.findViewById(AbstractC0828TB.f2616h)).setTextColor(r136);
        r74 = r74 + 1;
        goto L32
    L34:
        r26.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC1191au(r136, r0));
        int r27 = r16.getChildCount();
    L35:
        if (r0 >= r27) goto L37;
        View r52 = r16.getChildAt(r0);
        AbstractC0295Gu.m625r(-470762775377973L);
        ViewGroup r53 = (ViewGroup) r52;
        View r75 = r53.findViewById(AbstractC0828TB.f2614f);
        String r85 = AbstractC0295Gu.m625r(-471570229229621L);
        Object[] r93 = {Integer.valueOf(r136)};
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r75, r85, Arrays.copyOf(r93, 1));
        ((TextView) r53.findViewById(AbstractC0828TB.f2616h)).setTextColor(r136);
        r0 = r0 + 1;
        goto L35
    L37:
        r16.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC1191au(r136, r6));
    L39:
        if (r133.getChildCount() != 2) goto L57;
        if ((r133.getChildAt(0) instanceof LinearLayout) == false) goto L57;
        if ((r133.getChildAt(1) instanceof ImageView) == false) goto L57;
        View r17 = r133.getChildAt(0);
        AbstractC0295Gu.m625r(-471626063804469L);
        LinearLayout r18 = (LinearLayout) r17;
        View r28 = r18.getChildAt(0);
        if ((r28 instanceof TextView) == false) goto L57;
        TextView r29 = (TextView) r28;
        if (AbstractC0585Nj.m1134a(r29.getText(), AbstractC0295Gu.m625r(-471355480864821L)) == false) goto L57;
        HashMap r54 = AbstractC0999XA.f3193a;
        Drawable r55 = C1517hw.m2890b(AbstractC0295Gu.m625r(-471389840603189L));
        if (r55 == null) goto L57;
        r18.setBackground(r55);
        Drawable r19 = C1517hw.m2890b(AbstractC0295Gu.m625r(-469899486951477L));
        if (r19 == null) goto L53;
        View r137 = r133.getChildAt(1);
        AbstractC0295Gu.m625r(-469555889567797L);
        ImageView r138 = (ImageView) r137;
        String r56 = AbstractC0295Gu.m625r(-470371933354037L);
        Object[] r76 = {Boolean.FALSE};
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r138, r56, Arrays.copyOf(r76, 1));
        r138.setImageDrawable(r19);
    L53:
        int r139 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-470462127667253L));
        if (r139 == 0) goto L57;
        r29.setTextColor(r139);
        goto L57
    L10:
        if (r1.equals(AbstractC0295Gu.m625r(-837995364087861L)) == true) goto L13;
        if (r1.equals(AbstractC0295Gu.m625r(-838708328658997L)) == true) goto L13;
    L57:
        return C0829TC.f2620a;
    L5:
        r133 = null;
        goto L6
    }

    /* JADX INFO: renamed from: h */
    private final Object m1673h(Object r38) {
        AbstractC0295Gu.m625r(-524733334419509L);
        C2428qs r0 = ((C1494hG) r38).f5263a;
        Object r2 = ((XC_MethodHook.MethodHookParam) r0.f8523d).getResult();
        if ((r2 instanceof View) == false) goto L5;
        View r22 = (View) r2;
    L6:
        if (r22 == null) goto L48;
        if ((r22 instanceof ViewGroup) == false) goto L46;
        ViewGroup r3 = (ViewGroup) r22;
        C1456gf.m2806q(r3);
        TextView r23 = (TextView) r22.findViewById(android.R.id.title);
        if (r23 == null) goto L48;
        C1339du r5 = C1339du.f4823a;
        ImageView r32 = C1339du.m2594c(r3);
        if (r32 == null) goto L48;
        if (r32.getContext().getClass().getName().equals(AbstractC0295Gu.m625r(-838296011798581L)) == false) goto L48;
        if (r32.getVisibility() != 0) goto L48;
        HashMap r52 = AbstractC0999XA.f3193a;
        Map r1 = AbstractC2598uq.m5110L(new C0208Et[]{new C0208Et(AbstractC0295Gu.m625r(-770637391984693L), AbstractC0295Gu.m625r(-770658866821173L)), new C0208Et(AbstractC0295Gu.m625r(-770276614731829L), AbstractC0295Gu.m625r(-770306679502901L)), new C0208Et(AbstractC0295Gu.m625r(-770474183227445L), AbstractC0295Gu.m625r(-768837800687669L)), new C0208Et(AbstractC0295Gu.m625r(-768988124543029L), AbstractC0295Gu.m625r(-769001009444917L)), new C0208Et(AbstractC0295Gu.m625r(-768601577486389L), AbstractC0295Gu.m625r(-768618757355573L)), new C0208Et(AbstractC0295Gu.m625r(-768816325851189L), AbstractC0295Gu.m625r(-768833505720373L)), new C0208Et(AbstractC0295Gu.m625r(-769576535062581L), AbstractC0295Gu.m625r(-769610894800949L)), new C0208Et(AbstractC0295Gu.m625r(-769245822580789L), AbstractC0295Gu.m625r(-769357491730485L)), new C0208Et(AbstractC0295Gu.m625r(-767875728013365L), AbstractC0295Gu.m625r(-767974512261173L)), new C0208Et(AbstractC0295Gu.m625r(-767583670237237L), AbstractC0295Gu.m625r(-767703929321525L)), new C0208Et(AbstractC0295Gu.m625r(-768408303958069L), AbstractC0295Gu.m625r(-768507088205877L)), new C0208Et(AbstractC0295Gu.m625r(-768111951214645L), AbstractC0295Gu.m625r(-768202145527861L)), new C0208Et(AbstractC0295Gu.m625r(-766716086843445L), AbstractC0295Gu.m625r(-766806281156661L)), new C0208Et(AbstractC0295Gu.m625r(-766411144165429L), AbstractC0295Gu.m625r(-766509928413237L)), new C0208Et(AbstractC0295Gu.m625r(-767222892984373L), AbstractC0295Gu.m625r(-767334562134069L)), new C0208Et(AbstractC0295Gu.m625r(-766939425142837L), AbstractC0295Gu.m625r(-767029619456053L)), new C0208Et(AbstractC0295Gu.m625r(-767184238278709L), AbstractC0295Gu.m625r(-765638050052149L)), new C0208Et(AbstractC0295Gu.m625r(-765792668874805L), AbstractC0295Gu.m625r(-765324517439541L)), new C0208Et(AbstractC0295Gu.m625r(-765479136262197L), AbstractC0295Gu.m625r(-766131971291189L)), new C0208Et(AbstractC0295Gu.m625r(-766286590113845L), AbstractC0295Gu.m625r(-765818438678581L)), new C0208Et(AbstractC0295Gu.m625r(-765985942403125L), AbstractC0295Gu.m625r(-766067546781749L)), new C0208Et(AbstractC0295Gu.m625r(-746963532249141L), AbstractC0295Gu.m625r(-747053726562357L)), new C0208Et(AbstractC0295Gu.m625r(-746624229832757L), AbstractC0295Gu.m625r(-746701539244085L)), new C0208Et(AbstractC0295Gu.m625r(-746838978197557L), AbstractC0295Gu.m625r(-747496108193845L)), new C0208Et(AbstractC0295Gu.m625r(-747633547147317L), AbstractC0295Gu.m625r(-747199755450421L)), new C0208Et(AbstractC0295Gu.m625r(-747337194403893L), AbstractC0295Gu.m625r(-745791006177333L)), new C0208Et(AbstractC0295Gu.m625r(-745915560228917L), AbstractC0295Gu.m625r(-745486063499317L)), new C0208Et(AbstractC0295Gu.m625r(-745610617550901L), AbstractC0295Gu.m625r(-745700811864117L)), new C0208Et(AbstractC0295Gu.m625r(-746370826762293L), AbstractC0295Gu.m625r(-746426661337141L))});
        Object r02 = r0.f8521b;
        if (C1339du.f4824b.length() <= 0) goto L29;
        C2648vx r4 = new C2648vx();
        if ((r02 instanceof Class) == false) goto L23;
        r4.f9163b = (Class) r02;
    L28:
        r4.m5180c(C1339du.f4824b);
        String r03 = (String) r4.m5178a();
    L40:
        Drawable r04 = C1517hw.m2890b((String) r1.get(r03));
        if (r04 == null) goto L48;
        HashMap r12 = AbstractC0999XA.f3193a;
        int r13 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-525334629840949L));
        if (r13 == 0) goto L45;
        r23.setTextColor(r13);
    L45:
        r32.setLayerPaint(null);
        ViewGroup.LayoutParams r14 = r32.getLayoutParams();
        r14.width = AbstractC0295Gu.m616i(32);
        r14.height = AbstractC0295Gu.m616i(32);
        r32.setImageDrawable(r04);
        goto L48
    L23:
        r4.f9164c = r02;
        if (r02 == null) goto L26;
        Class<?> r05 = r02.getClass();
    L27:
        r4.f9163b = r05;
        goto L28
    L26:
        r05 = null;
        goto L27
    L29:
        int r42 = AbstractC1450gG.f5067a;
        Field[] r43 = AbstractC1406fG.m2718r0(AbstractC0295Gu.m625r(-524956672718901L)).getFields();
        AbstractC0295Gu.m625r(-524600190433333L);
        int r6 = r43.length;
        int r7 = 0;
    L30:
        if (r7 >= r6) goto L39;
        Field r8 = r43[r7];
        if (AbstractC0585Nj.m1134a(r8.getType(), String.class) == false) goto L38;
        String r9 = (String) r8.get(r02);
        if (r9 == null) goto L38;
        if (AbstractC2564tz.m5051L(r9, AbstractC0295Gu.m625r(-524664614942773L), false) == false) goto L38;
        String r06 = r8.getName();
        AbstractC0295Gu.m625r(-524673204877365L);
        C1339du.f4824b = r06;
        r03 = r9;
    L38:
        r7 = r7 + 1;
        goto L30
    L39:
        r03 = AbstractC0295Gu.m625r(-524729039452213L);
        goto L40
    L46:
        r22.setBackground(null);
        r22.setTag(R.id.tag_view_bg_ban, Object.class);
    L48:
        return C0829TC.f2620a;
    L5:
        r22 = null;
        goto L6
    }

    /* JADX INFO: renamed from: i */
    private final Object m1674i(Object r3) {
        C1494hG r32 = (C1494hG) r3;
        AbstractC0295Gu.m625r(-3045131810869L);
        if (C0811Sv.f2565b.m2024e() == false) goto L6;
        r32.f5263a.m4864C(Boolean.FALSE);
    L6:
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: j */
    private final Object m1675j(Object r10) {
        AbstractC0295Gu.m625r(-2838973380661L);
        C2428qs r102 = ((C1494hG) r10).f5263a;
        if (C0469Kw.f1524b.m2024e() == false) goto L8;
        Object[] r0 = (Object[]) r102.f8522c;
        Object r2 = r0[0];
        AbstractC0295Gu.m625r(-2894807955509L);
        String r22 = (String) r2;
        Object r3 = r0[3];
        AbstractC0295Gu.m625r(-1464583845941L);
        String r32 = (String) r3;
        Object r02 = r0[1];
        AbstractC0295Gu.m625r(-1133871364149L);
        long r5 = ((Long) r02).longValue();
        C2813zq r03 = AbstractC1406fG.m2680E(Pattern.compile(AbstractC0295Gu.m625r(-1344324761653L)).matcher(r32), 0, r32);
        if (r03 == null) goto L8;
        r102.m4864C(null);
        String r103 = (String) ((C2770yq) r03.m5446a()).get(1);
        JSONObject r04 = new JSONObject();
        String r1 = AbstractC0295Gu.m625r(-1971389986869L);
        StringBuilder r33 = new StringBuilder("\"");
        r33.append(r103);
        r33.append('\"');
        SharedPreferences r104 = AbstractC0599Nx.f1939a;
        r33.append(AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-1992864823349L), AbstractC0295Gu.m625r(-2057289332789L)));
        r04.put(r1, r33.toString());
        r04.put(AbstractC0295Gu.m625r(-2095944038453L), r5);
        r04.put(AbstractC0295Gu.m625r(-2134598744117L), r22);
        C0668Pg r105 = AbstractC2248ms.f7951a;
        String r05 = r04.toString();
        AbstractC0295Gu.m625r(-2164663515189L);
        r105.getClass();
        C0668Pg.m1328h(r22, r05);
    L8:
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: k */
    private final Object m1676k(Object r9) {
        C1494hG r92 = (C1494hG) r9;
        AbstractC0295Gu.m625r(-1675037243445L);
        if (C0469Kw.f1524b.m2024e() == false) goto L20;
        C2428qs r93 = r92.f5263a;
        Object r0 = r93.f8521b;
        Object r94 = ((Object[]) r93.f8522c)[0];
        JSONObject r2 = new JSONObject((String) AbstractC0213Ey.m404b(-1730871818293L, AbstractC1406fG.m2685J(r94)));     // Catch: Throwable -> L21
        long r3 = r2.optLong(AbstractC0295Gu.m625r(-1791001360437L));     // Catch: Throwable -> L21
        if (r3 == 0) goto L20;
        String r1 = r2.optString(AbstractC0295Gu.m625r(-1829656066101L));     // Catch: Throwable -> L21
        String r22 = r2.optString(AbstractC0295Gu.m625r(-1859720837173L));     // Catch: Throwable -> L21
        C1214bG r5 = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-587603065698357L));     // Catch: Throwable -> L21
        Object r6 = null;
        if (r5 == null) goto L10;
        Object r52 = r5.f4146a;     // Catch: Throwable -> L21
    L12:
        if ((r52 instanceof Method) == false) goto L14;
        Method r53 = (Method) r52;     // Catch: Throwable -> L21
    L15:
        if (r53 == null) goto L17;
        r6 = r53.invoke(r0, new Object[]{r1, Long.valueOf(r3)});     // Catch: Throwable -> L21
    L17:
        if (r6 == null) goto L20;
        C2648vx r02 = AbstractC1406fG.m2685J(r6);     // Catch: Throwable -> L21
        r02.m5180c(AbstractC0295Gu.m625r(-1881195673653L));     // Catch: Throwable -> L21
        long r03 = ((Number) r02.m5178a()).longValue();     // Catch: Throwable -> L21
        C2648vx r32 = AbstractC1406fG.m2685J(r94);     // Catch: Throwable -> L21
        r32.m5180c(AbstractC0295Gu.m625r(-304942676021L));     // Catch: Throwable -> L21
        r32.m5181d(Long.valueOf(r03 + 1));     // Catch: Throwable -> L21
        C2648vx r95 = AbstractC1406fG.m2685J(r94);     // Catch: Throwable -> L21
        r95.m5180c(AbstractC0295Gu.m625r(-377957120053L));     // Catch: Throwable -> L21
        r95.m5181d(r22);     // Catch: Throwable -> L21
        goto L20
    L14:
        r53 = null;
        goto L15
    L10:
        r52 = null;
    L20:
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: l */
    private final Object m1677l(Object r10) {
        AbstractC0295Gu.m625r(-816043784245L);
        C2428qs r102 = ((C1494hG) r10).f5263a;
        if (AbstractC0585Nj.m1134a(((Object[]) r102.f8522c)[3], Boolean.FALSE) == false) goto L33;
        Object[] r0 = (Object[]) r102.f8522c;
        if (r0[4] != null) goto L33;
        int r1 = 0;
        Object r02 = r0[0];
        if ((r02 instanceof Bitmap) == false) goto L9;
        Bitmap r03 = (Bitmap) r02;
    L10:
        if (r03 == null) goto L33;
        if (r03.isRecycled() == true) goto L33;
        C0555Mw.f1823b.getClass();
        StackTraceElement[] r2 = new Throwable().getStackTrace();
        AbstractC0295Gu.m625r(-635655157813L);
        int r4 = r2.length;
    L15:
        if (r1 >= r4) goto L31;
        String r5 = r2[r1].getClassName();
        C1214bG r6 = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-585691805251637L));
        if (r6 == null) goto L19;
        Object r62 = r6.f4146a;
    L21:
        if ((r62 instanceof Class) == false) goto L23;
        Class r63 = (Class) r62;
    L24:
        if (r63 == null) goto L26;
        String r64 = r63.getName();
    L28:
        if (AbstractC0585Nj.m1134a(r5, r64) == true) goto L33;
        r1 = r1 + 1;
        goto L15
    L26:
        r64 = null;
        goto L28
    L23:
        r63 = null;
        goto L24
    L19:
        r62 = null;
        goto L21
    L31:
        SharedPreferences r12 = AbstractC0599Nx.f1939a;
        String r13 = AbstractC0295Gu.m625r(-16814796961845L);
        AbstractC0295Gu.m625r(-839953869174837L);
        r102.m4864C(AbstractC0148Dc.m279m(r03, AbstractC0599Nx.f1939a.getInt(r13, 100)));
        goto L33
    L9:
        r03 = null;
    L33:
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: m */
    private final Object m1678m(Object r6) {
        AbstractC0295Gu.m625r(-16917876176949L);
        Object r62 = ((C1494hG) r6).f5263a.f8521b;
        String r0 = AbstractC0295Gu.m625r(-16969415784501L);
        AbstractC0295Gu.m625r(-578325936338997L);
        Object r63 = XposedHelpers.callMethod(r62, r0, Arrays.copyOf(new Object[0], 0));
        AbstractC0295Gu.m625r(-17033840293941L);
        View r64 = (View) r63;
        SharedPreferences r02 = AbstractC0599Nx.f1939a;
        String r03 = AbstractC0295Gu.m625r(-16720307681333L);
        AbstractC0295Gu.m625r(-839953869174837L);
        r64.setOutlineProvider(new C0512Lw((r64.getLayoutParams().width / 2.0f) * (AbstractC0828TB.m1639f(AbstractC0599Nx.f1939a.getInt(r03, 100), 100) / 100.0f)));
        r64.setClipToOutline(true);
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: n */
    private final Object m1679n(Object r3) {
        int r32 = ((Integer) r3).intValue();
        if (r32 > 0) goto L7;
        return AbstractC0295Gu.m625r(-717259536437L);
    L7:
        if (r32 >= 100) goto L9;
        StringBuilder r0 = new StringBuilder();
        r0.append(r32);
        r0.append('%');
        return r0.toString();
    L9:
        return AbstractC0295Gu.m625r(-730144438325L);
    }

    /* JADX INFO: renamed from: o */
    private final Object m1680o(Object r20) {
        AbstractC0295Gu.m625r(-517444774918197L);
        C2428qs r0 = ((C1494hG) r20).f5263a;
        Object r1 = r0.f8521b;
        Object[] r02 = (Object[]) r0.f8522c;
        int r2 = 0;
        if (r1 != null) goto L63;
    L14:
        Object r12 = r02[0];
        AbstractC0295Gu.m625r(-517500609493045L);
        if (AbstractC0585Nj.m1134a((String) r12, AbstractC0295Gu.m625r(-516070385383477L)) == false) goto L61;
        Object r03 = r02[2];
        AbstractC0295Gu.m625r(-516104745121845L);
        C1017Xm r13 = new C1017Xm((ContentValues) r03);
        ContentValues r04 = (ContentValues) r13.f3226b;
        C0852Tt.f2702a.getClass();
        AbstractC0295Gu.m625r(-727021999093813L);
    L59:
        AbstractC0295Gu.m625r(-727820863010869L);
        AbstractC0295Gu.m625r(-727331236739125L);
        goto L61
    L18:
        if (AbstractC0085Bz.m132J(r13.m1911h(), false, AbstractC0295Gu.m625r(-727606114646069L)) == false) goto L21;
        int r4 = 1;
    L25:
        if (r4 == 1) goto L27;
    L33:
        String r7 = r13.m1911h();     // Catch: Exception -> L59
    L31:
        String r8 = r7;
        if (r4 == 1) goto L36;
    L42:
        String r3 = r13.m1909e();     // Catch: Exception -> L59
    L40:
        String r16 = r3;
        String r72 = r13.m1911h();     // Catch: Exception -> L59
        boolean r9 = r13.m1912i();     // Catch: Exception -> L59
        Integer r32 = r04.getAsInteger(AbstractC0295Gu.m625r(-729873857378357L));     // Catch: Exception -> L59
        if (r32 == null) goto L46;
        int r10 = r32.intValue();     // Catch: Exception -> L59
    L47:
        Integer r33 = r04.getAsInteger(AbstractC0295Gu.m625r(-729500195223605L));     // Catch: Exception -> L59
        if (r33 == null) goto L50;
        r2 = r33.intValue();     // Catch: Exception -> L59
    L50:
        int r11 = r2;
        Long r22 = r04.getAsLong(AbstractC0295Gu.m625r(-729435770714165L));     // Catch: Exception -> L59
        long r122 = 0;
        if (r22 == null) goto L53;
        long r23 = r22.longValue();     // Catch: Exception -> L59
    L54:
        Long r05 = r04.getAsLong(AbstractC0295Gu.m625r(-729083583395893L));     // Catch: Exception -> L59
        if (r05 == null) goto L57;
        r122 = r05.longValue();     // Catch: Exception -> L59
    L57:
        ContentValues r18 = (ContentValues) r13.f3226b;     // Catch: Exception -> L59
        int r92 = r9 ? 1 : 0;
        CherryMessageAPI.INSTANCE.dispatchMessage(new CherryMessageAPI.MessageData(r72, r8, r92, r10, r11, r23, r122, r16, r4, r18));     // Catch: Exception -> L59
        goto L61
    L53:
        r23 = 0;
        goto L54
    L46:
        r10 = 0;
        goto L47
    L36:
        if (r13.m1912i() == true) goto L42;
        int r5 = AbstractC2564tz.m5057R(r13.m1909e(), AbstractC0295Gu.m625r(-727743553599541L), 0, false, 6);     // Catch: Exception -> L59
        if (r5 <= 0) goto L41;
        r3 = r13.m1909e().substring(r5 + 2);     // Catch: Exception -> L59
        AbstractC0295Gu.m625r(-727756438501429L);     // Catch: Exception -> L59
        goto L40
    L41:
        r3 = r13.m1909e();     // Catch: Exception -> L59
        goto L40
    L27:
        if (r13.m1912i() == true) goto L33;
        int r73 = AbstractC2564tz.m5057R(r13.m1909e(), AbstractC0295Gu.m625r(-727666244188213L), 0, false, 6);     // Catch: Exception -> L59
        if (r73 <= 0) goto L32;
        r7 = r13.m1909e().substring(0, r73);     // Catch: Exception -> L59
        AbstractC0295Gu.m625r(-727679129090101L);     // Catch: Exception -> L59
        goto L31
    L32:
        r7 = r13.m1911h();     // Catch: Exception -> L59
        goto L31
    L21:
        if (r13.m1911h().startsWith(AbstractC0295Gu.m625r(-727649064319029L)) == false) goto L23;
        r4 = 2;
        goto L25
    L23:
        r4 = 0;
    L61:
        return C0829TC.f2620a;
    L63:
        String r34 = AbstractC0295Gu.m625r(-727584639809589L);     // Catch: Exception -> L62
        AbstractC0295Gu.m625r(-578325936338997L);     // Catch: Exception -> L62
        Object r35 = XposedHelpers.callMethod(r1, r34, Arrays.copyOf(new Object[0], 0));     // Catch: Exception -> L62
        if ((r35 instanceof String) == false) goto L9;
        String r36 = (String) r35;     // Catch: Exception -> L62
    L10:
        if (r36 == null) goto L14;
        if (AbstractC2564tz.m5051L(r36, AbstractC0295Gu.m625r(-725969732106293L), false) == false) goto L14;
        AbstractC0671Pj.f2143f = r1;     // Catch: Exception -> L62
        goto L14
    L9:
        r36 = null;
        goto L10
    }

    /* JADX INFO: renamed from: p */
    private final Object m1681p(Object r10) {
        AbstractC0295Gu.m625r(-515842752116789L);
        C2428qs r102 = ((C1494hG) r10).f5263a;
        Object r0 = r102.f8521b;
        if (r0 != null) goto L55;
    L14:
        Object[] r103 = (Object[]) r102.f8522c;
        Object r02 = r103[0];
        AbstractC0295Gu.m625r(-515898586691637L);
        Object r104 = r103[1];
        AbstractC0295Gu.m625r(-516667385837621L);
        ContentValues r105 = (ContentValues) r104;
        if (AbstractC0585Nj.m1134a((String) r02, AbstractC0295Gu.m625r(-516405392832565L)) == false) goto L53;
        String r03 = r105.getAsString(AbstractC0295Gu.m625r(-516444047538229L));
        String r3 = r105.getAsString(AbstractC0295Gu.m625r(-514850614671413L));
        Integer r106 = r105.getAsInteger(AbstractC0295Gu.m625r(-514897859311669L));
        Cursor r04 = AbstractC0671Pj.m1357w(AbstractC0295Gu.m625r(-514949398919221L), new String[]{r03});
        if (r04 == null) goto L53;
        if (r04.moveToFirst() == false) goto L51;
        int r4 = r04.getInt(r04.getColumnIndex(AbstractC0295Gu.m625r(-514691700881461L)));
        String r5 = r04.getString(r04.getColumnIndex(AbstractC0295Gu.m625r(-514743240489013L)));
        if (r106 != null) goto L24;
    L25:
        Set r107 = C0538Mf.f1751a;
        if (r5 == null) goto L34;
        List r52 = AbstractC2564tz.m5066a0(r5, new char[]{';'});
        ArrayList r6 = new ArrayList();
        Iterator r53 = r52.iterator();
    L29:
        if (r53.hasNext() == false) goto L33;
        Object r7 = r53.next();
        if (AbstractC2564tz.m5059T((String) r7) == true) goto L29;
        r6.add(r7);
        goto L29
    L33:
        Set r54 = AbstractC2453ra.m4909s0(r6);
    L35:
        if (r3 == null) goto L43;
        List r108 = AbstractC2564tz.m5066a0(r3, new char[]{';'});
        ArrayList r1 = new ArrayList();
        Iterator r109 = r108.iterator();
    L38:
        if (r109.hasNext() == false) goto L42;
        Object r2 = r109.next();
        if (AbstractC2564tz.m5059T((String) r2) == true) goto L38;
        r1.add(r2);
        goto L38
    L42:
        r107 = AbstractC2453ra.m4909s0(r1);
    L43:
        Set r12 = AbstractC0513Lx.m996A(r107, r54);
        Set r1010 = AbstractC0513Lx.m996A(r54, r107);
        Iterator r13 = r12.iterator();
    L45:
        if (r13.hasNext() == false) goto L47;
        String r22 = (String) r13.next();
        C0852Tt.f2702a.getClass();
        AbstractC0295Gu.m625r(-727442905888821L);
        AbstractC0295Gu.m625r(-727485855561781L);
        goto L45
    L47:
        Iterator r1011 = r1010.iterator();
    L49:
        if (r1011.hasNext() == false) goto L51;
        String r14 = (String) r1011.next();
        C0852Tt.f2702a.getClass();
        AbstractC0295Gu.m625r(-727442905888821L);
        AbstractC0295Gu.m625r(-727485855561781L);
        goto L49
    L34:
        r54 = r107;
        goto L35
    L24:
        if (r4 != r106.intValue()) goto L25;
    L51:
        r04.close();
    L53:
        return C0829TC.f2620a;
    L55:
        String r23 = AbstractC0295Gu.m625r(-727584639809589L);     // Catch: Exception -> L54
        AbstractC0295Gu.m625r(-578325936338997L);     // Catch: Exception -> L54
        Object r24 = XposedHelpers.callMethod(r0, r23, Arrays.copyOf(new Object[0], 0));     // Catch: Exception -> L54
        if ((r24 instanceof String) == false) goto L9;
        String r25 = (String) r24;     // Catch: Exception -> L54
    L10:
        if (r25 == null) goto L14;
        if (AbstractC2564tz.m5051L(r25, AbstractC0295Gu.m625r(-725969732106293L), false) == false) goto L14;
        AbstractC0671Pj.f2143f = r0;     // Catch: Exception -> L54
        goto L14
    L9:
        r25 = null;
        goto L10
    }

    /* JADX INFO: renamed from: q */
    private final Object m1682q(Object r4) {
        AbstractC0295Gu.m625r(-522147764107317L);
        Object r42 = ((Object[]) ((C1494hG) r4).f5263a.f8522c)[0];
        AbstractC0295Gu.m625r(-522199303714869L);
        ViewGroup r43 = (ViewGroup) r42;
        Context r0 = r43.getContext();
        AbstractC0295Gu.m625r(-521907245938741L);
        String r02 = ((Activity) r0).getClass().getName();
        if (r02.equals(AbstractC0295Gu.m625r(-522920858220597L)) == true) goto L8;
        if (r02.equals(AbstractC0295Gu.m625r(-521486339143733L)) == true) goto L8;
        r43.post(new RunnableC2745y7(r43, 4));
    L8:
        return C0829TC.f2620a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v170 */
    /* JADX WARN: Type inference failed for: r0v171 */
    /* JADX WARN: Type inference failed for: r0v172 */
    /* JADX WARN: Type inference failed for: r0v173 */
    /* JADX WARN: Type inference failed for: r0v174 */
    /* JADX WARN: Type inference failed for: r0v175 */
    /* JADX WARN: Type inference failed for: r0v176 */
    /* JADX WARN: Type inference failed for: r0v177 */
    /* JADX WARN: Type inference failed for: r0v178 */
    /* JADX WARN: Type inference failed for: r0v179 */
    /* JADX WARN: Type inference failed for: r0v180 */
    /* JADX WARN: Type inference failed for: r0v181 */
    /* JADX WARN: Type inference failed for: r0v182 */
    /* JADX WARN: Type inference failed for: r0v183 */
    /* JADX WARN: Type inference failed for: r0v184 */
    /* JADX WARN: Type inference failed for: r0v185 */
    /* JADX WARN: Type inference failed for: r0v186 */
    /* JADX WARN: Type inference failed for: r0v41, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object, oy] */
    /* JADX WARN: Type inference failed for: r0v42, types: [Pi, Wk, android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r0v45, types: [Wk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v45, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r2v46, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v69, types: [android.view.View, android.view.ViewGroup] */
    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r25) {
        int r0 = this.f2693a;
        int r5 = 3;
        boolean r8 = true;
        C0829TC r9 = C0829TC.f2620a;
        int r10 = 0;
        switch(r0) {
            case 0: goto L311;
            case 1: goto L309;
            case 2: goto L300;
            case 3: goto L298;
            case 4: goto L253;
            case 5: goto L223;
            case 6: goto L219;
            case 7: goto L82;
            case 8: goto L76;
            case 9: goto L72;
            case 10: goto L70;
            case 11: goto L68;
            case 12: goto L42;
            case 13: goto L41;
            case 14: goto L34;
            case 15: goto L33;
            case 16: goto L31;
            case 17: goto L29;
            case 18: goto L27;
            case 19: goto L25;
            case 20: goto L23;
            case 21: goto L21;
            case 22: goto L19;
            case 23: goto L17;
            case 24: goto L15;
            case 25: goto L13;
            case 26: goto L11;
            case 27: goto L8;
            case 28: goto L7;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-519171351771189L);
        Object r02 = ((C1494hG) r25).f5263a.f8521b;
        AbstractC0295Gu.m625r(-519222891378741L);
        Activity r03 = (Activity) r02;
        View r2 = r03.getWindow().getDecorView();
        AbstractC0295Gu.m625r(-520021755295797L);
        ViewGroup r22 = (ViewGroup) r2;
        r22.post(new RunnableC0137D7(r22, r03, r5));
        return r9;
    L8:
        AbstractC1111Zu.f3507a.getClass();
        return Integer.valueOf(AbstractC1111Zu.f3508b.mo134a().nextInt(2147418112) + 65536);
    L34:
        AbstractC0295Gu.m625r(-4453881083957L);
        C2428qs r04 = ((C1494hG) r25).f5263a;
        if (C2471rs.f8696b.m2024e() == false) goto L39;
        Object r23 = ((Object[]) r04.f8522c)[2];
        AbstractC0295Gu.m625r(-4509715658805L);
        if (AbstractC0585Nj.m1134a((String) r23, AbstractC0295Gu.m625r(-5278514804789L)) == false) goto L39;
        Object r05 = ((Object[]) r04.f8522c)[3];
        AbstractC0295Gu.m625r(-5450313496629L);
        Intent r06 = (Intent) r05;
        r06.addFlags(524288);
        r06.addFlags(134217728);
    L39:
        return r9;
    L42:
        AbstractC0295Gu.m625r(-49611167234101L);
        C2428qs r07 = ((C1494hG) r25).f5263a;
        Field[] r24 = r07.f8521b.getClass().getFields();
    L44:
        if (r10 >= r24.length) goto L67;
        int r3 = r10 + 1;
        Field r4 = r24[r10];     // Catch: ArrayIndexOutOfBoundsException -> L64
        if (AbstractC0585Nj.m1134a(r4.getType(), View.class) == false) goto L63;
        Object r42 = r4.get(r07.f8521b);     // Catch: IllegalAccessException -> L322
        if ((r42 instanceof View) == false) goto L52;
        View r43 = (View) r42;     // Catch: IllegalAccessException -> L322
    L53:
        if (r43 == null) goto L63;
        ViewGroup.LayoutParams r52 = r43.getLayoutParams();     // Catch: IllegalAccessException -> L322
        if ((r43 instanceof ViewGroup) == true) goto L63;
        if ((r52 instanceof RelativeLayout.LayoutParams) == false) goto L63;
        if (((RelativeLayout.LayoutParams) r52).width != (-1)) goto L63;
        if (((RelativeLayout.LayoutParams) r52).height != (-1)) goto L63;
        ViewParent r44 = r43.getParent();     // Catch: IllegalAccessException -> L322
        AbstractC0295Gu.m625r(-49662706841653L);     // Catch: IllegalAccessException -> L322
        C1456gf.m2805o((ViewGroup) r44);     // Catch: IllegalAccessException -> L322
        goto L63
    L52:
        r43 = null;
    L63:
        r10 = r3;
    L64:
        e = move-exception;
        throw new NoSuchElementException(e.getMessage());
    L67:
        return r9;
    L68:
        C1494hG r08 = (C1494hG) r25;
        AbstractC0295Gu.m625r(-49091476191285L);
        Object r26 = ((Object[]) r08.f5263a.f8522c)[0];
        AbstractC0295Gu.m625r(-49143015798837L);
        ViewGroup r27 = (ViewGroup) r26;
        r27.post(new RunnableC2260n3(14, r27, r08));
        return r9;
    L70:
        AbstractC0295Gu.m625r(-50229642524725L);
        ((C1494hG) r25).f5263a.m4864C(null);
        return r9;
    L72:
        AbstractC0295Gu.m625r(-91809220917301L);
        C2428qs r09 = ((C1494hG) r25).f5263a;
        Object r28 = r09.f8521b;
        AbstractC0295Gu.m625r(-91315299678261L);
        if (((Activity) r28).getIntent().getIntExtra(AbstractC0295Gu.m625r(-92114163595317L), -1) == (-1)) goto L75;
        r09.m4864C(null);
    L75:
        return r9;
    L76:
        AbstractC0295Gu.m625r(-91796336015413L);
        if (((Class[]) r25).length == 0) goto L81;
        r8 = false;
    L81:
        return Boolean.valueOf(r8);
    L82:
        AbstractC0295Gu.m625r(-94373316393013L);
        C2428qs r010 = ((C1494hG) r25).f5263a;
        Object r53 = r010.f8521b;
        Object[] r11 = (Object[]) r010.f8522c;
        AbstractC0295Gu.m625r(-94424856000565L);
        Activity r54 = (Activity) r53;
        String r011 = AbstractC0295Gu.m625r(-94124208289845L);
        AbstractC0295Gu.m625r(-578325936338997L);
        Object r012 = XposedHelpers.callMethod(r54, r011, Arrays.copyOf(new Object[0], 0));
        AbstractC0295Gu.m625r(-94188632799285L);
        ViewGroup r013 = (ViewGroup) r012;
        if ((r013.getTag() instanceof InterfaceC0972Wk) == false) goto L89;
        Object r014 = r013.getTag();
        AbstractC0295Gu.m625r(-92797063395381L);
        InterfaceC0972Wk r015 = (InterfaceC0972Wk) r014;
        Object r29 = r11[0];
        AbstractC0295Gu.m625r(-92620969736245L);
        int r210 = ((Integer) r29).intValue();
        Object r32 = r11[1];
        AbstractC0295Gu.m625r(-93376883980341L);
        int r33 = ((Integer) r32).intValue();
        Object r12 = r11[2];
        if ((r12 instanceof Intent) == false) goto L87;
        Intent r122 = (Intent) r12;
    L88:
        r015.mo1338c(r54, r210, r33, r122);
        goto L89
    L87:
        r122 = null;
    L89:
        Iterator r211 = C1337ds.f4822b.iterator();
    L91:
        if (r211.hasNext() == false) goto L218;
        C1354e8 r016 = (C1354e8) r211.next();
        Object r34 = r11[0];
        AbstractC0295Gu.m625r(-93033286596661L);
        Integer r35 = (Integer) r34;
        Object r123 = r11[1];
        AbstractC0295Gu.m625r(-91590177585205L);
        Integer r124 = (Integer) r123;
        Object r13 = r11[2];
        if ((r13 instanceof Intent) == false) goto L95;
        Intent r132 = (Intent) r13;
    L97:
        switch(r016.f4856a) {
            case 0: goto L160;
            default: goto L98;
        };
    L160:
        int r017 = r35.intValue();
        int r36 = r124.intValue();
        AbstractC0295Gu.m625r(-257470404491317L);
        if (r017 != 18754) goto L91;
        if (r36 != (-1)) goto L91;
        C1442g8.f5046b.getClass();
        if (r132 == null) goto L91;
        Uri r15 = r132.getData();
        if (r15 == null) goto L91;
        String r018 = AbstractC0295Gu.m625r(-261249975711797L);     // Catch: Exception -> L181
        Cursor r37 = r54.getContentResolver().query(r15, null, null, null, null);     // Catch: Exception -> L181
        if (r37 != null) goto L344;
    L187:
        File r38 = new File(r54.getFilesDir(), AbstractC0295Gu.m625r(-259789686831157L));     // Catch: Exception -> L181
        if (r38.exists() == true) goto L190;
        r38.mkdirs();     // Catch: Exception -> L181
    L190:
        File r125 = new File(r38, r018);     // Catch: Exception -> L181
        InputStream r39 = r54.getContentResolver().openInputStream(r15);     // Catch: Exception -> L181
        if (r39 == null) goto L209;
        FileOutputStream r133 = new FileOutputStream(r125);     // Catch: Throwable -> L197
        AbstractC1293cr.m2555p(r39, r133);     // Catch: Throwable -> L199
    L194:
        r133.close();     // Catch: Throwable -> L197
        r39.close();     // Catch: Exception -> L181
    L199:
        th = move-exception;
        throw th;     // Catch: Throwable -> L202
    L202:
        th = move-exception;
        AbstractC0585Nj.m1138f(r133, th);     // Catch: Throwable -> L197
        throw th;     // Catch: Throwable -> L197
    L197:
        th = move-exception;
        throw th;     // Catch: Throwable -> L206
    L206:
        th = move-exception;
        AbstractC0585Nj.m1138f(r39, th);     // Catch: Exception -> L181
        throw th;     // Catch: Exception -> L181
    L209:
        BitmapFactory.Options r310 = new BitmapFactory.Options();     // Catch: Exception -> L181
        r310.inJustDecodeBounds = true;     // Catch: Exception -> L181
        BitmapFactory.decodeFile(r125.getAbsolutePath(), r310);     // Catch: Exception -> L181
        if (r310.outWidth <= 0) goto L215;
        if (r310.outHeight <= 0) goto L215;
        SharedPreferences r311 = AbstractC0599Nx.f1939a;     // Catch: Exception -> L181
        String r312 = AbstractC0295Gu.m625r(-259875586177077L);     // Catch: Exception -> L181
        String r126 = r125.getAbsolutePath();     // Catch: Exception -> L181
        AbstractC0295Gu.m625r(-259974370424885L);     // Catch: Exception -> L181
        AbstractC0599Nx.m1176e(r312, r126);     // Catch: Exception -> L181
        C1442g8.m2761o();     // Catch: Exception -> L181
        C1442g8.m2760n();     // Catch: Exception -> L181
        Toast.makeText(r54, AbstractC0295Gu.m625r(-259514808924213L) + r018 + AbstractC0295Gu.m625r(-259557758597173L), 1).show();     // Catch: Exception -> L181
    L215:
        Toast.makeText(r54, AbstractC0295Gu.m625r(-259854111340597L), 0).show();     // Catch: Exception -> L181
        r125.delete();     // Catch: Exception -> L181
        goto L91
    L344:
        if (r37.moveToFirst() == false) goto L179;
        int r127 = r37.getColumnIndex(AbstractC0295Gu.m625r(-261314400221237L));     // Catch: Throwable -> L177
        if (r127 < 0) goto L179;
        r018 = r37.getString(r127);     // Catch: Throwable -> L177
        AbstractC0295Gu.m625r(-261374529763381L);     // Catch: Throwable -> L177
    L179:
        r37.close();     // Catch: Exception -> L181
        goto L187
    L177:
        th = move-exception;
        throw th;     // Catch: Throwable -> L184
    L184:
        th = move-exception;
        AbstractC0585Nj.m1138f(r37, th);     // Catch: Exception -> L181
        throw th;     // Catch: Exception -> L181
    L181:
        e = move-exception;
        Toast.makeText(r54, AbstractC0213Ey.m405c(-259647952910389L, new StringBuilder(), e), 0).show();
        goto L91
    L98:
        int r019 = r35.intValue();
        int r313 = r124.intValue();
        AbstractC0295Gu.m625r(-6820408064053L);
        if (C1145ak.f3636b.m2024e() == false) goto L91;
        if (r019 != 20302) goto L91;
        if (r313 != (-1)) goto L91;
        if (r132 == null) goto L91;
        Uri r152 = r132.getData();
        if (r152 == null) goto L91;
        String r020 = AbstractC0295Gu.m625r(-27324581935157L);     // Catch: Exception -> L121
        Cursor r314 = r54.getContentResolver().query(r152, null, null, null, null);     // Catch: Exception -> L121
        if (r314 == null) goto L128;
        if (r314.moveToFirst() == false) goto L119;
        int r128 = r314.getColumnIndex(AbstractC0295Gu.m625r(-27393301411893L));     // Catch: Throwable -> L117
        if (r128 < 0) goto L119;
        r020 = r314.getString(r128);     // Catch: Throwable -> L117
        AbstractC0295Gu.m625r(-27453430954037L);     // Catch: Throwable -> L117
    L119:
        r314.close();     // Catch: Exception -> L121
        goto L128
    L117:
        th = move-exception;
        throw th;     // Catch: Throwable -> L124
    L124:
        th = move-exception;
        AbstractC0585Nj.m1138f(r314, th);     // Catch: Exception -> L121
        throw th;     // Catch: Exception -> L121
    L128:
        if (AbstractC0085Bz.m132J(r020, true, AbstractC0295Gu.m625r(-26968099649589L)) == true) goto L132;
        if (AbstractC0085Bz.m132J(r020, true, AbstractC0295Gu.m625r(-26989574486069L)) == true) goto L132;
        Toast.makeText(r54, AbstractC0295Gu.m625r(-27011049322549L), 0).show();     // Catch: Exception -> L121
    L132:
        File r315 = new File(r54.getFilesDir(), AbstractC0295Gu.m625r(-27268747360309L));     // Catch: Exception -> L121
        if (r315.exists() == true) goto L135;
        r315.mkdirs();     // Catch: Exception -> L121
    L135:
        File r129 = new File(r315, r020);     // Catch: Exception -> L121
        InputStream r316 = r54.getContentResolver().openInputStream(r152);     // Catch: Exception -> L121
        if (r316 == null) goto L155;
        FileOutputStream r134 = new FileOutputStream(r129);     // Catch: Throwable -> L142
        AbstractC1293cr.m2555p(r316, r134);     // Catch: Throwable -> L144
    L139:
        r134.close();     // Catch: Throwable -> L142
        r316.close();     // Catch: Exception -> L121
    L144:
        th = move-exception;
        throw th;     // Catch: Throwable -> L147
    L147:
        th = move-exception;
        AbstractC0585Nj.m1138f(r134, th);     // Catch: Throwable -> L142
        throw th;     // Catch: Throwable -> L142
    L142:
        th = move-exception;
        throw th;     // Catch: Throwable -> L151
    L151:
        th = move-exception;
        AbstractC0585Nj.m1138f(r316, th);     // Catch: Exception -> L121
        throw th;     // Catch: Exception -> L121
    L155:
        if (Typeface.createFromFile(r129) == null) goto L156;
        SharedPreferences r317 = AbstractC0599Nx.f1939a;     // Catch: Exception -> L121
        String r318 = AbstractC0295Gu.m625r(-27131308406837L);     // Catch: Exception -> L121
        String r1210 = r129.getAbsolutePath();     // Catch: Exception -> L121
        AbstractC0295Gu.m625r(-7997229103157L);     // Catch: Exception -> L121
        AbstractC0599Nx.m1176e(r318, r1210);     // Catch: Exception -> L121
        Toast.makeText(r54, AbstractC0295Gu.m625r(-8087423416373L) + r020 + AbstractC0295Gu.m625r(-8121783154741L), 1).show();     // Catch: Exception -> L121
        goto L91
    L156:
        Toast.makeText(r54, AbstractC0295Gu.m625r(-27101243635765L), 0).show();     // Catch: Exception -> L121
        r129.delete();     // Catch: Exception -> L121
    L121:
        e = move-exception;
        Toast.makeText(r54, AbstractC0213Ey.m405c(-8156142893109L, new StringBuilder(), e), 0).show();
        goto L91
    L95:
        r132 = null;
        goto L97
    L218:
        return r9;
    L219:
        AbstractC0295Gu.m625r(-95575907235893L);
        Object r021 = ((C1494hG) r25).f5263a.f8521b;
        AbstractC0295Gu.m625r(-95627446843445L);
        String r45 = AbstractC0295Gu.m625r(-95326799132725L);
        AbstractC0295Gu.m625r(-578325936338997L);
        Object r022 = XposedHelpers.callMethod((Activity) r021, r45, Arrays.copyOf(new Object[0], 0));
        AbstractC0295Gu.m625r(-93741956200501L);
        ViewGroup r023 = (ViewGroup) r022;
        if ((r023.getTag() instanceof InterfaceC0972Wk) == false) goto L222;
        Object r024 = r023.getTag();
        AbstractC0295Gu.m625r(-93999654238261L);
        ((InterfaceC0972Wk) r024).mo1337b();
    L222:
        return r9;
    L223:
        AbstractC0295Gu.m625r(-94845762795573L);
        C2428qs r025 = ((C1494hG) r25).f5263a;
        Object r112 = r025.f8521b;
        AbstractC0295Gu.m625r(-94897302403125L);
        Activity r113 = (Activity) r112;
        Object r026 = ((Object[]) r025.f8522c)[0];
        int r027 = r113.getIntent().getIntExtra(AbstractC0295Gu.m625r(-94596654692405L), -1);
        if (r027 == (-1)) goto L252;
        C1337ds.f4821a.getClass();
        switch(r027) {
            case 1: goto L250;
            case 2: goto L249;
            case 3: goto L248;
            case 4: goto L247;
            case 5: goto L246;
            case 6: goto L245;
            case 7: goto L238;
            case 8: goto L237;
            case 9: goto L236;
            default: goto L227;
        };
    L227:
        switch(r027) {
            case 1002: goto L235;
            case 1003: goto L234;
            case 1004: goto L233;
            case 1005: goto L232;
            case 1006: goto L231;
            case 1007: goto L230;
            case 1008: goto L229;
            default: goto L228;
        };
    L228:
        ?? r028 = new C2112jq(r113);
    L251:
        r028.mo1339d(r113);
        String r212 = AbstractC0295Gu.m625r(-94656784234549L);
        Object[] r319 = {r028.getTitle()};
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r113, r212, Arrays.copyOf(r319, 1));
        String r213 = AbstractC0295Gu.m625r(-94704028874805L);
        AbstractC0295Gu.m625r(-578325936338997L);
        Object r214 = XposedHelpers.callMethod(r113, r213, Arrays.copyOf(new Object[0], 0));
        AbstractC0295Gu.m625r(-94768453384245L);
        ?? r215 = (ViewGroup) r214;
        r215.setTag(r028);
        r215.addView(r028.getContentView(), -1, -1);
        goto L252
    L229:
        r028 = new C0701QC();
        goto L251
    L230:
        r028 = new C2288np();
        goto L251
    L231:
        r028 = new C0784SA();
        goto L251
    L232:
        r028 = new C0956WA();
        goto L251
    L233:
        r028 = new C1206b8();
        goto L251
    L234:
        r028 = new C0841Ti();
        goto L251
    L235:
        r028 = new C0762Rp();
        goto L251
    L236:
        r028 = new C1495ha(1);
        goto L251
    L237:
        r028 = new C1495ha(1);
        goto L251
    L238:
        AbstractC0295Gu.m625r(-78980153604149L);
        ?? r029 = new C0670Pi(r113);
        r029.setOrientation(1);
        r029.setBackgroundColor(r029.getContext().getColor(R.color.colorBackground));
        ScrollView r216 = new ScrollView(r029.getContext());
        r216.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r216.setVerticalScrollBarEnabled(false);
        r216.setOverScrollMode(2);
        r029.addView(r216);
        LinearLayout r46 = new LinearLayout(r029.getContext());
        r46.setOrientation(1);
        r46.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r46.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(24));
        r029.f2137a = r46;
        r216.addView(r46);
        LinearLayout r217 = r029.f2137a;
        if (r217 != null) goto L241;
        AbstractC0295Gu.m625r(-79074642884661L);
        r217 = null;
    L241:
        LinearLayout r47 = new LinearLayout(r029.getContext());
        r47.setOrientation(0);
        r47.setGravity(16);
        r47.setPadding(0, 0, 0, AbstractC0295Gu.m616i(24));
        TextView r55 = new TextView(r47.getContext());
        r55.setText(AbstractC0295Gu.m625r(-79134772426805L));
        r55.setTextSize(24.0f);
        r55.setPadding(0, 0, AbstractC0295Gu.m616i(12), 0);
        r47.addView(r55);
        TextView r56 = new TextView(r47.getContext());
        r56.setText(AbstractC0295Gu.m625r(-79147657328693L));
        r56.setTextSize(22.0f);
        r56.setTextColor(r56.getContext().getColor(R.color.textTitle));
        r56.setTypeface(Typeface.DEFAULT_BOLD);
        r47.addView(r56);
        r217.addView(r47);
        LinearLayout r218 = r029.f2137a;
        if (r218 != null) goto L244;
        AbstractC0295Gu.m625r(-78619376351285L);
        r218 = null;
    L244:
        TextView r320 = new TextView(r029.getContext());
        r320.setText(AbstractC0295Gu.m625r(-78679505893429L));
        r320.setTextSize(14.0f);
        r320.setTextColor(r320.getContext().getColor(R.color.textSummary));
        r320.setPadding(0, 0, 0, AbstractC0295Gu.m616i(20));
        r218.addView(r320);
        C1498hd r219 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C2170l(r029, null, 3), 3);
        r028 = r029;
        goto L251
    L245:
        AbstractC0295Gu.m625r(-477712032462901L);
        ?? r030 = new C2340oy(r113);
        r030.setOrientation(1);
        r030.setClickable(true);
        r030.setBackgroundColor(r030.getContext().getColor(R.color.colorBackground));
        r030.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(24));
        ?? r220 = new LinearLayout(r030.getContext());
        r220.setOrientation(1);
        GradientDrawable r7 = new GradientDrawable();
        r220.setBackgroundColor(r220.getContext().getColor(R.color.colorForeground));
        r7.setCornerRadius(AbstractC0295Gu.m616i(16));
        r220.setBackground(r7);
        r220.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        TextView r48 = new TextView(r220.getContext());
        r48.setTextSize(16.0f);
        r48.setTextColor(r48.getContext().getColor(R.color.textTitle));
        r48.setGravity(17);
        r48.setPadding(0, 0, 0, AbstractC0295Gu.m616i(16));
        r030.f8213b = r48;
        r220.addView(r48);
        TextView r49 = new TextView(r220.getContext());
        r49.setTextSize(14.0f);
        r49.setTextColor(r49.getContext().getColor(R.color.colorSuccess));
        r49.setGravity(17);
        r49.setPadding(0, 0, 0, AbstractC0295Gu.m616i(16));
        r030.f8214c = r49;
        r220.addView(r49);
        TextView r321 = new TextView(r220.getContext());
        r321.setTextSize(16.0f);
        r321.setTextColor(-1);
        r321.setGravity(17);
        r321.setPadding(0, AbstractC0295Gu.m616i(10), 0, AbstractC0295Gu.m616i(10));
        r321.setOnClickListener(new ViewOnClickListenerC1477h(10, r030));
        GradientDrawable r410 = new GradientDrawable();
        r410.setColor(-1499549);
        r410.setCornerRadius(AbstractC0295Gu.m616i(45));
        r321.setBackground(r410);
        r030.f8212a = r321;
        r220.addView(r321);
        r030.addView(r220);
        ?? r221 = new LinearLayout(r030.getContext());
        r221.setOrientation(0);
        GradientDrawable r322 = new GradientDrawable();
        r322.setColor(r221.getContext().getColor(R.color.colorForeground));
        r322.setCornerRadius(AbstractC0295Gu.m616i(16));
        r221.setBackground(r322);
        r221.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        r221.setOnClickListener(new ViewOnClickListenerC1477h(11, r221));
        r221.setOnTouchListener(new ViewOnTouchListenerC2586ue(2, r221));
        LinearLayout.LayoutParams r323 = new LinearLayout.LayoutParams(-1, -2);
        r323.topMargin = AbstractC0295Gu.m616i(16);
        r221.setLayoutParams(r323);
        r221.setVisibility(8);
        ImageView r411 = new ImageView(r221.getContext());
        r411.setImageResource(R.drawable.ic_settings);
        r411.setScaleType(ImageView.ScaleType.FIT_CENTER);
        r411.setColorFilter(r411.getContext().getColor(R.color.textTitle));
        LinearLayout.LayoutParams r6 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24));
        r6.gravity = 16;
        r221.addView(r411, r6);
        TextView r412 = new TextView(r221.getContext());
        r412.setText(AbstractC0295Gu.m625r(-477398499850293L));
        r412.setTextSize(16.0f);
        r412.setTextColor(r412.getContext().getColor(R.color.textTitle));
        Typeface r62 = Typeface.DEFAULT_BOLD;
        r412.setTypeface(r62);
        LinearLayout.LayoutParams r72 = new LinearLayout.LayoutParams(-2, -2);
        r72.setMarginStart(AbstractC0295Gu.m616i(12));
        r72.gravity = 16;
        r412.setLayoutParams(r72);
        r221.addView(r412);
        r030.f8215d = r221;
        r030.addView(r221);
        LinearLayout r222 = new LinearLayout(r030.getContext());
        r222.setOrientation(1);
        GradientDrawable r413 = new GradientDrawable();
        r413.setColor(r222.getContext().getColor(R.color.colorForeground));
        r413.setCornerRadius(AbstractC0295Gu.m616i(16));
        r222.setBackground(r413);
        r222.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        LinearLayout.LayoutParams r414 = new LinearLayout.LayoutParams(-1, -2);
        r414.topMargin = AbstractC0295Gu.m616i(16);
        r222.setLayoutParams(r414);
        TextView r415 = new TextView(r222.getContext());
        r415.setText(AbstractC0295Gu.m625r(-478047039911989L));
        r415.setTextSize(16.0f);
        r415.setTextColor(r415.getContext().getColor(R.color.textTitle));
        r415.setTypeface(r62);
        r415.setPadding(0, 0, 0, AbstractC0295Gu.m616i(12));
        r222.addView(r415);
        TextView r416 = new TextView(r222.getContext());
        r416.setText(AbstractC0295Gu.m625r(-478068514748469L));
        r416.setTextSize(14.0f);
        r416.setTextColor(r416.getContext().getColor(R.color.textSummary));
        r416.setPadding(AbstractC0295Gu.m616i(8), 0, 0, 0);
        r416.setLineSpacing(6.0f, 1.0f);
        r222.addView(r416);
        r030.addView(r222);
        C1498hd r223 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C2297ny(r030, null, r10), 3);
        r028 = r030;
        goto L251
    L246:
        r028 = new C2136kD();
        goto L251
    L247:
        r028 = new C1011Xg(r113);
        goto L251
    L248:
        C1495ha r031 = new C1495ha(0);
        r031.f5272i = C0452Kf.f1484a;
        r028 = r031;
        goto L251
    L249:
        r028 = new C2213m(r113);
        goto L251
    L250:
        r028 = new C2112jq(r113);
    L252:
        return r9;
    L253:
        C1494hG r032 = (C1494hG) r25;
        AbstractC0295Gu.m625r(-6536940222517L);
        if (C0979Wr.f3063b.m2024e() == false) goto L297;
        Object[] r033 = (Object[]) r032.f5263a.f8522c;
        if (r033.length < 4) goto L297;
        int r417 = r033.length - 2;
    L261:
        if ((-1) >= r417) goto L280;
        Object r224 = r033[r417];
        Object r324 = r033[r417 + 1];
        if ((r224 instanceof Integer) == false) goto L279;
        if ((r324 instanceof Integer) == false) goto L279;
        C2322og r63 = EnumC0936Vr.f2923g;
        if (r63 != null) goto L269;
    L271:
        r63.getClass();
        C2694x r73 = new C2694x(0, r63);
    L273:
        if (r73.hasNext() == false) goto L279;
        EnumC0936Vr r64 = (EnumC0936Vr) r73.next();
        if (r64.f2924a != ((Number) r224).intValue()) goto L273;
        if (r64.f2925b != ((Number) r324).intValue()) goto L273;
    L281:
        if (r417 == (-1)) goto L297;
        Object r225 = r033[r417];
        AbstractC0295Gu.m625r(-6592774797365L);
        int r226 = ((Integer) r225).intValue();
        int r325 = r417 + 1;
        Object r65 = r033[r325];
        AbstractC0295Gu.m625r(-6249177413685L);
        int r66 = ((Integer) r65).intValue();
        C2322og r74 = EnumC0936Vr.f2923g;
        r74.getClass();
        C2694x r82 = new C2694x(0, r74);
    L285:
        if (r82.hasNext() == false) goto L291;
        Object r75 = r82.next();
        EnumC0936Vr r102 = (EnumC0936Vr) r75;
        if (r102.f2924a != r226) goto L285;
        if (r102.f2925b != r66) goto L285;
        Object r67 = r75;
    L292:
        EnumC0936Vr r68 = (EnumC0936Vr) r67;
        if (r68 != EnumC0936Vr.f2920d) goto L295;
    L296:
        EnumC0936Vr r227 = EnumC0936Vr.f2919c;
        r033[r417] = Integer.valueOf(r227.f2924a);
        r033[r325] = Integer.valueOf(r227.f2925b);
        goto L297
    L295:
        if (r68 != EnumC0936Vr.f2921e) goto L297;
    L291:
        r67 = null;
        goto L292
    L269:
        if (r63.isEmpty() == false) goto L271;
    L279:
        r417 = r417 - 1;
        goto L261
    L280:
        r417 = -1;
    L297:
        return r9;
    L298:
        AbstractC0295Gu.m625r(-44276817852469L);
        C2428qs r034 = ((C1494hG) r25).f5263a;
        Object r228 = ((Object[]) r034.f8522c)[0];
        AbstractC0295Gu.m625r(-44324062492725L);
        int r229 = ((Integer) r228).intValue();
        Object r035 = ((XC_MethodHook.MethodHookParam) r034.f8523d).getResult();
        AbstractC0295Gu.m625r(-44530220922933L);
        C2111jp.m4300c((ViewGroup) r035, r229);
        return r9;
    L300:
        AbstractC0295Gu.m625r(-45402099284021L);
        C2428qs r036 = ((C1494hG) r25).f5263a;
        Object[] r230 = (Object[]) r036.f8522c;
        Object r326 = r230[0];
        AbstractC0295Gu.m625r(-45449343924277L);
        int r327 = ((Integer) r326).intValue();
        Object r418 = r036.f8521b;
        AbstractC0295Gu.m625r(-45105746540597L);
        BaseAdapter r419 = (BaseAdapter) r418;
        if (r327 != (r419.getCount() - 1)) goto L308;
        r230[0] = Integer.valueOf(r327 - 1);
        Object r231 = XposedBridge.invokeOriginalMethod((Member) r036.f8520a, r419, r230);
        AbstractC0295Gu.m625r(-45930380261429L);
        ViewGroup r232 = (ViewGroup) r231;
        r036.m4864C(r232);
        Context r037 = r232.getContext();
        AbstractC0295Gu.m625r(-45638322485301L);
        r232.setOnClickListener(new ViewOnClickListenerC0094C7((Activity) r037, 3));
        TextView r038 = (TextView) r232.findViewById(AbstractC0828TB.f2616h);
        if (r038 == null) goto L308;
        if (r327 != (r419.getCount() - 1)) goto L307;
        r038.setText(AbstractC0295Gu.m625r(-45887430588469L));
    L307:
        C2111jp.m4300c(r232, r327);
    L308:
        return r9;
    L309:
        AbstractC0295Gu.m625r(-46793668687925L);
        C2428qs r039 = ((C1494hG) r25).f5263a;
        Object r233 = ((XC_MethodHook.MethodHookParam) r039.f8523d).getResult();
        AbstractC0295Gu.m625r(-46845208295477L);
        r039.m4864C(Integer.valueOf(((Integer) r233).intValue() + 1));
        return r9;
    L311:
        AbstractC0295Gu.m625r(-457585815713845L);
        Object r040 = ((C1494hG) r25).f5263a.f8521b;
        HashMap r234 = AbstractC0999XA.f3193a;
        int r235 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-458264420546613L));
        if (r235 == 0) goto L321;
        int r328 = AbstractC1450gG.f5067a;
        Field[] r329 = AbstractC1406fG.m2718r0(AbstractC0295Gu.m625r(-458380384663605L)).getDeclaredFields();
        AbstractC0295Gu.m625r(-457989542639669L);
        int r420 = r329.length;
    L314:
        if (r10 >= r420) goto L321;
        Field r57 = r329[r10];
        if (AbstractC0585Nj.m1134a(r57.getType(), Integer.TYPE) == false) goto L320;
        r57.setAccessible(true);
        Object r69 = r57.get(r040);
        AbstractC0295Gu.m625r(-458088326887477L);
        if (((Integer) r69).intValue() != (-16268960)) goto L320;
        r57.set(r040, Integer.valueOf(r235));
    L320:
        r10 = r10 + 1;
    L321:
        return r9;
    L7:
        return m1682q(r25);
    L11:
        return m1681p(r25);
    L13:
        return m1680o(r25);
    L15:
        return m1679n(r25);
    L17:
        return m1678m(r25);
    L19:
        return m1677l(r25);
    L21:
        return m1676k(r25);
    L23:
        return m1675j(r25);
    L25:
        return m1674i(r25);
    L27:
        return m1673h(r25);
    L29:
        return m1672f(r25);
    L31:
        return m1671e(r25);
    L33:
        return NetworkAPI.m3479j((Map.Entry) r25);
    L41:
        return m1670c(r25);
    }
}
