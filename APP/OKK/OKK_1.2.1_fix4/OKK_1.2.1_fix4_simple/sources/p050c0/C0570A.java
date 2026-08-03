package p050c0;

import android.content.ContentValues;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import de.robv.android.xposed.C0760b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import p001A0.AbstractC0040p;
import p007D0.C0139e;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p040V0.C0406i;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;
import p042W0.C0422g;
import p052d0.C0758s;

/* JADX INFO: renamed from: c0.A */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0570A implements InterfaceC0286l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1691a;

    public /* synthetic */ C0570A(int r1) {
        this.f1691a = r1;
    }

    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object r23) {
        long r5 = 0;
        Integer r9 = null;
        boolean r11 = true;
        int r12 = 0;
        switch(this.f1691a) {
            case 0: goto L179;
            case 1: goto L177;
            case 2: goto L148;
            case 3: goto L142;
            case 4: goto L140;
            case 5: goto L132;
            case 6: goto L121;
            case 7: goto L106;
            case 8: goto L93;
            case 9: goto L91;
            case 10: goto L76;
            case 11: goto L74;
            case 12: goto L66;
            case 13: goto L60;
            case 14: goto L58;
            case 15: goto L56;
            case 16: goto L54;
            case 17: goto L52;
            case 18: goto L42;
            case 19: goto L40;
            case 20: goto L38;
            case 21: goto L36;
            case 22: goto L31;
            case 23: goto L28;
            case 24: goto L26;
            case 25: goto L21;
            case 26: goto L18;
            case 27: goto L16;
            case 28: goto L14;
            default: goto L4;
        };
    L4:
        String r02 = (String) r23;
        AbstractC0307g.m703e(r02, "it");
        if (r02.length() > 0) goto L7;
    L11:
        r11 = false;
    L13:
        return Boolean.valueOf(r11);
    L7:
        if (AbstractC0433r.m1033H0(r02, "#", false) == true) goto L11;
        if (AbstractC0425j.m1006K0(r02, '=') == false) goto L11;
    L14:
        String r03 = (String) r23;
        AbstractC0307g.m703e(r03, "it");
        return AbstractC0425j.m1022a1(r03).toString();
    L16:
        String r04 = (String) r23;
        AbstractC0307g.m703e(r04, "it");
        return Boolean.valueOf(AbstractC0425j.m1006K0(r04, '='));
    L18:
        String r05 = (String) r23;
        AbstractC0307g.m703e(r05, "it");
        return AbstractC0425j.m1022a1(r05).toString();
    L26:
        AbstractC0307g.m703e((String) r23, "it");
        return new CopyOnWriteArrayList();
    L28:
        Map.Entry r06 = (Map.Entry) r23;
        AbstractC0307g.m703e(r06, "<destruct>");
        Object r1 = r06.getKey();
        AbstractC0307g.m702d(r1, "component1(...)");
        Object r07 = r06.getValue();
        AbstractC0307g.m702d(r07, "component2(...)");
        return "\"" + AbstractC0433r.m1031F0((String) r1, "\"", "", false) + "\":\"" + AbstractC0433r.m1031F0((String) r07, "\"", "", false) + "\"";
    L36:
        Method r08 = (Method) r23;
        AbstractC0307g.m703e(r08, "it");
        String r09 = r08.getName();
        AbstractC0307g.m702d(r09, "getName(...)");
        return r09;
    L38:
        AbstractC0307g.m703e((C0139e) r23, "<destruct>");
        return Boolean.valueOf(!AbstractC0307g.m699a((String) r0.f328a, "updated"));
    L40:
        String r010 = (String) r23;
        AbstractC0307g.m703e(r010, "it");
        int r13 = AbstractC0425j.m1010O0(r010, '=', 0, false, 6);
        String r2 = r010.substring(0, r13);
        AbstractC0307g.m702d(r2, "substring(...)");
        String r22 = AbstractC0425j.m1022a1(r2).toString();
        String r011 = r010.substring(r13 + 1);
        AbstractC0307g.m702d(r011, "substring(...)");
        return new C0139e(r22, AbstractC0425j.m1022a1(r011).toString());
    L42:
        String r012 = (String) r23;
        AbstractC0307g.m703e(r012, "it");
        if (r012.length() > 0) goto L45;
    L49:
        r11 = false;
    L51:
        return Boolean.valueOf(r11);
    L45:
        if (AbstractC0433r.m1033H0(r012, "#", false) == true) goto L49;
        if (AbstractC0425j.m1006K0(r012, '=') == false) goto L49;
    L52:
        String r013 = (String) r23;
        AbstractC0307g.m703e(r013, "it");
        return AbstractC0425j.m1022a1(r013).toString();
    L54:
        Field r014 = (Field) r23;
        AbstractC0307g.m703e(r014, "it");
        return Boolean.valueOf(Modifier.isStatic(r014.getModifiers()));
    L56:
        Field r015 = (Field) r23;
        AbstractC0307g.m703e(r015, "it");
        return Boolean.valueOf(Modifier.isStatic(r015.getModifiers()));
    L58:
        Field r016 = (Field) r23;
        AbstractC0307g.m703e(r016, "it");
        return Boolean.valueOf(Modifier.isStatic(r016.getModifiers()));
    L60:
        TextView r017 = (TextView) r23;
        AbstractC0307g.m703e(r017, "it");
        if (r017.getText().length() <= 80) goto L65;
        r11 = false;
    L65:
        return Boolean.valueOf(r11);
    L66:
        TextView r018 = (TextView) r23;
        AbstractC0307g.m703e(r018, "it");
        if (AbstractC0425j.m1005J0(r018.getText().toString(), "小时前", false) == true) goto L73;
        if (AbstractC0425j.m1005J0(r018.getText().toString(), "分钟前", false) == true) goto L73;
        r11 = false;
    L73:
        return Boolean.valueOf(r11);
    L74:
        TextView r019 = (TextView) r23;
        AbstractC0307g.m703e(r019, "it");
        String r020 = r019.getText().toString();
        Pattern r14 = Pattern.compile(".*\\d{1,2}:\\d{2}.*");
        AbstractC0307g.m702d(r14, "compile(...)");
        AbstractC0307g.m703e(r020, "input");
        return Boolean.valueOf(r14.matcher(r020).matches());
    L76:
        Class r021 = (Class) r23;
        AbstractC0307g.m703e(r021, "clazz");
        C0621R0 r15 = C0621R0.f1913a;
        C0406i r022 = AbstractC0358S.m861K(new C0616P0(r021, null));
    L78:
        if (r022.hasNext() == false) goto L86;
        Object r16 = r022.next();
        Method r4 = (Method) r16;
        Class<?>[] r52 = r4.getParameterTypes();
        AbstractC0307g.m702d(r52, "getParameterTypes(...)");
        if (r52.length != 0) goto L78;
        if (AbstractC0307g.m699a(r4.getReturnType(), String.class) == false) goto L78;
        if (AbstractC0040p.m92W(new String[]{"R1", "P1", "o0", "x0", "j0", "getSender", "getSendTalker"}).contains(r4.getName()) == false) goto L78;
    L87:
        Method r17 = (Method) r16;
        if (r17 == null) goto L223;
        r17.setAccessible(true);
        return r17;
    L223:
        return null;
    L86:
        r16 = null;
        goto L87
    L91:
        EnumC0583E0 r023 = (EnumC0583E0) r23;
        AbstractC0307g.m703e(r023, "it");
        return r023.f1756a;
    L93:
        Class r024 = (Class) r23;
        AbstractC0307g.m703e(r024, "clazz");
        C0678n0 r24 = C0678n0.f2116a;
        C0406i r025 = AbstractC0358S.m861K(new C0672l0(r024, null));
    L95:
        if (r025.hasNext() == false) goto L101;
        Object r25 = r025.next();
        Method r42 = (Method) r25;
        Class<?>[] r53 = r42.getParameterTypes();
        AbstractC0307g.m702d(r53, "getParameterTypes(...)");
        if (r53.length != 0) goto L95;
        Class<?> r43 = r42.getReturnType();
        AbstractC0307g.m702d(r43, "getReturnType(...)");
        if (AbstractC0433r.m1033H0(r43.getName(), "com.tencent.mm.storage.", false) == false) goto L95;
    L102:
        Method r26 = (Method) r25;
        if (r26 == null) goto L224;
        r26.setAccessible(true);
        return r26;
    L224:
        return null;
    L101:
        r25 = null;
        goto L102
    L106:
        Class r026 = (Class) r23;
        AbstractC0307g.m703e(r026, "it");
        Method[] r027 = r026.getMethods();
        AbstractC0307g.m702d(r027, "getMethods(...)");
        int r18 = r027.length;
        int r3 = 0;
    L107:
        if (r3 >= r18) goto L118;
        Method r44 = r027[r3];
        if (AbstractC0307g.m699a(r44.getName(), "update") == false) goto L117;
        if (r44.getParameterTypes().length < 4) goto L117;
        if (AbstractC0307g.m699a(r44.getParameterTypes()[0], String.class) == false) goto L117;
        if (ContentValues.class.isAssignableFrom(r44.getParameterTypes()[1]) == false) goto L117;
    L120:
        return Boolean.valueOf(r11);
    L117:
        r3 = r3 + 1;
        goto L107
    L118:
        r11 = false;
        goto L120
    L121:
        Class r028 = (Class) r23;
        AbstractC0307g.m703e(r028, "clazz");
        C0678n0 r27 = C0678n0.f2116a;
        C0406i r029 = AbstractC0358S.m861K(new C0669k0(r028, null));
    L123:
        if (r029.hasNext() == false) goto L127;
        Object r28 = r029.next();
        Class<?> r32 = ((Field) r28).getType();
        AbstractC0307g.m702d(r32, "getType(...)");
        if (AbstractC0433r.m1033H0(r32.getName(), "com.tencent.mm.storage.", false) == false) goto L123;
    L128:
        Field r29 = (Field) r28;
        if (r29 == null) goto L225;
        r29.setAccessible(true);
        return r29;
    L225:
        return null;
    L127:
        r28 = null;
        goto L128
    L132:
        View r19 = (View) r23;
        AbstractC0307g.m703e(r19, "view");
        String r030 = r19.getClass().getName();
        if (AbstractC0425j.m1005J0(r030, "RTChattingEmojiView", false) == true) goto L139;
        if (AbstractC0425j.m1005J0(r030, "RTChattingEmoji", false) == true) goto L139;
        r11 = false;
    L139:
        return Boolean.valueOf(r11);
    L140:
        View r110 = (View) r23;
        AbstractC0307g.m703e(r110, "view");
        C0422g r031 = AbstractC0600K.f1833a;
        return Boolean.valueOf(AbstractC0425j.m1005J0(r110.getClass().getName(), "MMNeat7extView", false));
    L142:
        int r032 = ((Integer) r23).intValue();
        C0588G r111 = C0588G.f1768a;
        if (r032 < 0) goto L146;
        r12 = r032;
    L146:
        C0588G.f1778k = r12;
        C0588G.m1416c();
        return C0146l.f339a;
    L148:
        int r033 = ((Integer) r23).intValue();
        C0588G r112 = C0588G.f1768a;
        long r113 = SystemClock.uptimeMillis();
        if (r033 == 0) goto L151;
    L171:
        C0588G.m1432s(r033);
        if (r033 != 0) goto L174;
        r5 = r113;
    L174:
        C0588G.f1776i = r5;
    L176:
        return C0146l.f339a;
    L151:
        if (C0588G.f1773f == null) goto L171;
        if ((r113 - C0588G.f1776i) > 300) goto L171;
        C0758s r33 = C0588G.f1770c;
        if (r33 == null) goto L176;
        Context r34 = r33.getContext();
        if (r34 == null) goto L176;
        View r034 = new View(r34);
        r034.setTag(0);
        View.OnClickListener r35 = C0588G.f1773f;     // Catch: Throwable -> L163
        if (r35 == null) goto L165;
        r35.onClick(r034);     // Catch: Throwable -> L163
    L165:
        View.OnClickListener r36 = C0588G.f1773f;     // Catch: Throwable -> L163
        if (r36 == null) goto L170;
        r36.onClick(r034);     // Catch: Throwable -> L163
    L170:
        C0588G.f1776i = r113;
    L163:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L170
    L177:
        int r035 = ((Integer) r23).intValue();
        C0588G r114 = C0588G.f1768a;
        C0588G.m1432s(r035);
        return C0146l.f339a;
    L179:
        C0760b r036 = (C0760b) r23;
        AbstractC0307g.m703e(r036, "param");
        Object[] r037 = r036.f2670c;
        AbstractC0307g.m702d(r037, "args");
        Object r038 = AbstractC0179j.m537n0(0, r037);
        if ((r038 instanceof Number) == false) goto L182;
        Number r039 = (Number) r038;
    L183:
        if (r039 == null) goto L185;
        r9 = Integer.valueOf(r039.intValue());
    L185:
        if (r9 != null) goto L188;
    L190:
        if (r9 != null) goto L193;
    L195:
        C0588G.f1774g = false;
        C0588G.f1775h = false;
    L197:
        return C0146l.f339a;
    L193:
        if (r9.intValue() != 2) goto L195;
        C0588G.f1774g = C0588G.f1775h;
        goto L197
    L188:
        if (r9.intValue() != 1) goto L190;
        C0588G.f1775h = true;
        C0588G.f1774g = true;
        goto L197
    L182:
        r039 = null;
        goto L183
    L21:
        if (((Long) r23).longValue() > 0) goto L25;
        r11 = false;
    L25:
        return Boolean.valueOf(r11);
    L31:
        if (((WeakReference) r23).get() == null) goto L35;
        r11 = false;
    L35:
        return Boolean.valueOf(r11);
    }
}
