package p056f0;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.BaseAdapter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: f0.Y */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0813Y implements InterfaceC0286l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2955a;

    public /* synthetic */ C0813Y(int r1) {
        this.f2955a = r1;
    }

    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object r5) {
        switch(this.f2955a) {
            case 0: goto L115;
            case 1: goto L113;
            case 2: goto L111;
            case 3: goto L109;
            case 4: goto L107;
            case 5: goto L105;
            case 6: goto L95;
            case 7: goto L83;
            case 8: goto L81;
            case 9: goto L72;
            case 10: goto L70;
            case 11: goto L61;
            case 12: goto L59;
            case 13: goto L57;
            case 14: goto L55;
            case 15: goto L53;
            case 16: goto L43;
            case 17: goto L34;
            case 18: goto L32;
            case 19: goto L30;
            case 20: goto L28;
            case 21: goto L20;
            case 22: goto L18;
            case 23: goto L16;
            case 24: goto L14;
            case 25: goto L6;
            default: goto L4;
        };
    L4:
        Class r52 = (Class) r5;
        AbstractC0307g.m703e(r52, "it");
        Method[] r53 = r52.getDeclaredMethods();
        AbstractC0307g.m702d(r53, "getDeclaredMethods(...)");
        return AbstractC0179j.m531h0(r53);
    L6:
        Method r54 = (Method) r5;
        if (AbstractC0307g.m699a(r54.getName(), "getCount") == false) goto L11;
        Class<?>[] r55 = r54.getParameterTypes();
        AbstractC0307g.m702d(r55, "getParameterTypes(...)");
        if (r55.length != 0) goto L11;
        boolean r56 = true;
    L13:
        return Boolean.valueOf(r56);
    L11:
        r56 = false;
        goto L13
    L14:
        Class r57 = (Class) r5;
        AbstractC0307g.m703e(r57, "it");
        Method[] r58 = r57.getDeclaredMethods();
        AbstractC0307g.m702d(r58, "getDeclaredMethods(...)");
        return AbstractC0179j.m531h0(r58);
    L16:
        Class r59 = (Class) r5;
        AbstractC0307g.m703e(r59, "it");
        return r59.getName();
    L18:
        Field r510 = (Field) r5;
        AbstractC0307g.m703e(r510, "it");
        return Boolean.valueOf(Context.class.isAssignableFrom(r510.getType()));
    L20:
        Method r511 = (Method) r5;
        Class<?>[] r02 = r511.getParameterTypes();
        AbstractC0307g.m702d(r02, "getParameterTypes(...)");
        if (r02.length == 0) goto L23;
    L25:
        boolean r512 = false;
    L27:
        return Boolean.valueOf(r512);
    L23:
        if (BaseAdapter.class.isAssignableFrom(r511.getReturnType()) == false) goto L25;
        r512 = true;
        goto L27
    L28:
        Class r513 = (Class) r5;
        AbstractC0307g.m703e(r513, "it");
        Method[] r514 = r513.getDeclaredMethods();
        AbstractC0307g.m702d(r514, "getDeclaredMethods(...)");
        return AbstractC0179j.m531h0(r514);
    L30:
        Class r515 = (Class) r5;
        AbstractC0307g.m703e(r515, "it");
        Field[] r516 = r515.getDeclaredFields();
        AbstractC0307g.m702d(r516, "getDeclaredFields(...)");
        return AbstractC0179j.m531h0(r516);
    L32:
        Class r517 = (Class) r5;
        AbstractC0307g.m703e(r517, "it");
        Method[] r518 = r517.getDeclaredMethods();
        AbstractC0307g.m702d(r518, "getDeclaredMethods(...)");
        return AbstractC0179j.m531h0(r518);
    L34:
        Field r519 = (Field) r5;
        Class<?> r03 = r519.getType();
        Class r1 = Integer.TYPE;
        if (AbstractC0307g.m699a(r03, r1) == false) goto L37;
    L40:
        boolean r520 = true;
    L42:
        return Boolean.valueOf(r520);
    L37:
        if (AbstractC0307g.m699a(r519.getType(), r1) == true) goto L40;
        r520 = false;
        goto L42
    L43:
        Method r521 = (Method) r5;
        Class<?>[] r04 = r521.getParameterTypes();
        AbstractC0307g.m702d(r04, "getParameterTypes(...)");
        if (r04.length == 0) goto L46;
    L50:
        boolean r522 = false;
    L52:
        return Boolean.valueOf(r522);
    L46:
        if (AbstractC0307g.m699a(r521.getReturnType(), Boolean.TYPE) == false) goto L48;
    L49:
        r522 = true;
        goto L52
    L48:
        if (AbstractC0307g.m699a(r521.getReturnType(), Void.TYPE) == false) goto L50;
    L53:
        Class r523 = (Class) r5;
        AbstractC0307g.m703e(r523, "it");
        Field[] r524 = r523.getDeclaredFields();
        AbstractC0307g.m702d(r524, "getDeclaredFields(...)");
        return AbstractC0179j.m531h0(r524);
    L55:
        Class r525 = (Class) r5;
        AbstractC0307g.m703e(r525, "it");
        Method[] r526 = r525.getDeclaredMethods();
        AbstractC0307g.m702d(r526, "getDeclaredMethods(...)");
        return AbstractC0179j.m531h0(r526);
    L57:
        Field r527 = (Field) r5;
        AbstractC0307g.m703e(r527, "it");
        return Boolean.valueOf(BaseAdapter.class.isAssignableFrom(r527.getType()));
    L59:
        Field r528 = (Field) r5;
        AbstractC0307g.m703e(r528, "it");
        return Boolean.valueOf(SparseArray.class.isAssignableFrom(r528.getType()));
    L61:
        Field r529 = (Field) r5;
        Class<?> r05 = r529.getType();
        Class r12 = Integer.TYPE;
        if (AbstractC0307g.m699a(r05, r12) == false) goto L64;
    L67:
        boolean r530 = true;
    L69:
        return Boolean.valueOf(r530);
    L64:
        if (AbstractC0307g.m699a(r529.getType(), r12) == true) goto L67;
        r530 = false;
        goto L69
    L70:
        Class r531 = (Class) r5;
        AbstractC0307g.m703e(r531, "it");
        Field[] r532 = r531.getDeclaredFields();
        AbstractC0307g.m702d(r532, "getDeclaredFields(...)");
        return AbstractC0179j.m531h0(r532);
    L72:
        Method r533 = (Method) r5;
        boolean r13 = false;
        if (r533.getParameterTypes().length != 1) goto L80;
        if (AbstractC0307g.m699a(r533.getParameterTypes()[0], Boolean.TYPE) == false) goto L80;
        if (AbstractC0307g.m699a(r533.getReturnType(), Void.TYPE) == false) goto L80;
        r13 = true;
    L80:
        return Boolean.valueOf(r13);
    L81:
        Class r534 = (Class) r5;
        AbstractC0307g.m703e(r534, "it");
        Method[] r535 = r534.getDeclaredMethods();
        AbstractC0307g.m702d(r535, "getDeclaredMethods(...)");
        return AbstractC0179j.m531h0(r535);
    L83:
        Field r536 = (Field) r5;
        AbstractC0307g.m703e(r536, "f");
        Class<?> r537 = r536.getType();
        if (r537.isPrimitive() == false) goto L86;
    L92:
        boolean r538 = false;
    L94:
        return Boolean.valueOf(r538);
    L86:
        if (r537.equals(String.class) == true) goto L92;
        if (r537.equals(CharSequence.class) == true) goto L92;
        if (r537.isArray() == true) goto L92;
        r538 = true;
        goto L94
    L95:
        Method r539 = (Method) r5;
        if (AbstractC0307g.m699a(r539.getName(), "getView") == true) goto L98;
    L102:
        boolean r540 = false;
    L104:
        return Boolean.valueOf(r540);
    L98:
        if (r539.getParameterTypes().length != 3) goto L102;
        if (View.class.isAssignableFrom(r539.getReturnType()) == false) goto L102;
        r540 = true;
        goto L104
    L105:
        Class r541 = (Class) r5;
        AbstractC0307g.m703e(r541, "it");
        Method[] r542 = r541.getDeclaredMethods();
        AbstractC0307g.m702d(r542, "getDeclaredMethods(...)");
        return AbstractC0179j.m531h0(r542);
    L107:
        Activity r543 = (Activity) r5;
        AbstractC0307g.m703e(r543, "act");
        C0810V.f2933a.m2106w(r543, new C0801L("theme_wallpaper_enabled"));
        return C0146l.f339a;
    L109:
        Activity r544 = (Activity) r5;
        AbstractC0307g.m703e(r544, "act");
        C0810V.f2933a.m2106w(r544, new C0801L("bottom_tab_floating"));
        return C0146l.f339a;
    L111:
        Activity r545 = (Activity) r5;
        AbstractC0307g.m703e(r545, "act");
        C0810V.f2933a.m2106w(r545, new C0801L("virtual_location_enabled"));
        return C0146l.f339a;
    L113:
        Activity r546 = (Activity) r5;
        AbstractC0307g.m703e(r546, "act");
        C0810V.f2933a.m2106w(r546, C0804O.f2919b);
        return C0146l.f339a;
    L115:
        Activity r547 = (Activity) r5;
        AbstractC0307g.m703e(r547, "act");
        C0810V.f2933a.m2106w(r547, C0802M.f2917b);
        return C0146l.f339a;
    }
}
