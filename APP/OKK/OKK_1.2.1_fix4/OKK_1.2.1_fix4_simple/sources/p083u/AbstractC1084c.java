package p083u;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.reflect.Array;
import org.luckypray.dexkit.C1031R;
import org.xmlpull.v1.XmlPullParserException;
import p056f0.AbstractC0805P;
import p080s.AbstractC1066a;

/* JADX INFO: renamed from: u.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1084c {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f4193a = null;

    static {
        f4193a = new ThreadLocal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /* JADX INFO: renamed from: a */
    public static ColorStateList m2577a(Resources r34, XmlResourceParser r35, Resources.Theme r36) {
        ?? r02 = r34;
        Resources.Theme r1 = r36;
        AttributeSet r2 = Xml.asAttributeSet(r35);
    L3:
        int r3 = r35.next();
        if (r3 == 2) goto L8;
        if (r3 != 1) goto L3;
    L8:
        if (r3 != 2) goto L160;
        String r32 = r35.getName();
        if (r32.equals("selector") == false) goto L158;
        ?? r4 = 1;
        int r33 = r35.getDepth() + 1;
        Object[] r6 = new int[20][];
        int[] r5 = new int[20];
        int r7 = 0;
        int r8 = 0;
    L12:
        int r9 = r35.next();
        if (r9 == r4) goto L155;
        int r10 = r35.getDepth();
        if (r10 >= r33) goto L18;
        if (r9 == 3) goto L155;
    L18:
        if (r9 != 2) goto L22;
        if (r10 > r33) goto L22;
        if (r35.getName().equals("item") == false) goto L22;
        int[] r92 = AbstractC1066a.f4090a;
        if (r1 != null) goto L26;
        ?? r93 = r02.obtainAttributes(r2, r92);
    L27:
        int r13 = r93.getResourceId(r7, -1);
        if (r13 == (-1)) goto L40;
        ThreadLocal r102 = f4193a;
        TypedValue r16 = (TypedValue) r102.get();
        if (r16 != null) goto L32;
        TypedValue r12 = new TypedValue();
        r102.set(r12);
    L33:
        r02.getValue(r13, r12, r4);
        int r103 = r12.type;
        if (r103 < 28) goto L161;
        if (r103 <= 31) goto L40;
    L161:
        int r104 = m2577a(r02, r02.getXml(r13), r1).getDefaultColor();     // Catch: Exception -> L39
    L42:
        if (r93.hasValue(r4) == false) goto L45;
        float r11 = r93.getFloat(r4, 1.0f);
    L49:
        if (Build.VERSION.SDK_INT >= 31) goto L51;
    L53:
        float r42 = r93.getFloat(4, -1.0f);
    L54:
        r93.recycle();
        int r94 = r2.getAttributeCount();
        int[] r122 = new int[r94];
        int r14 = r7;
        int r15 = r14;
    L55:
        if (r15 >= r94) goto L70;
        int r132 = r2.getAttributeNameResource(r15);
        if (r132 == 16843173) goto L69;
        if (r132 == 16843551) goto L69;
        if (r132 == C1031R.attr.alpha) goto L69;
        if (r132 == C1031R.attr.lStar) goto L69;
        int r72 = r14 + 1;
        if (r2.getAttributeBooleanValue(r15, false) == true) goto L68;
        r132 = -r132;
    L68:
        r122[r14] = r132;
        r14 = r72;
    L69:
        r15 = r15 + 1;
        goto L55
    L70:
        int[] r03 = StateSet.trimStateSet(r122, r14);
        float r73 = 0.0f;
        float r123 = 100.0f;
        if (r42 >= 0.0f) goto L73;
    L76:
        boolean r95 = false;
    L78:
        if (r11 != 1.0f) goto L81;
        if (r95 == true) goto L81;
        int[] r74 = r03;
        AttributeSet r28 = r2;
        int r29 = r33;
        boolean r162 = true;
    L139:
        int r04 = r8 + 1;
        int r22 = 8;
        if (r04 > r5.length) goto L142;
    L146:
        r5[r8] = r104;
        if (r04 <= r6.length) goto L153;
        Class<?> r17 = r6.getClass().getComponentType();
        if (r8 <= 4) goto L152;
        r22 = r8 * 2;
    L152:
        Object[] r18 = (Object[]) Array.newInstance(r17, r22);
        System.arraycopy(r6, 0, r18, 0, r8);
        r6 = r18;
    L153:
        r6[r8] = r74;
        r6 = (int[][]) r6;
        r1 = r36;
        r8 = r04;
        r4 = r162;
        r2 = r28;
        r33 = r29;
        r7 = 0;
        r02 = r34;
        goto L12
    L142:
        if (r8 > 4) goto L144;
        int r19 = 8;
    L145:
        int[] r110 = new int[r19];
        System.arraycopy(r5, 0, r110, 0, r8);
        r5 = r110;
        goto L146
    L144:
        r19 = r8 * 2;
    L81:
        int r112 = AbstractC0805P.m2043f((int) ((Color.alpha(r104) * r11) + 0.5f), 0, 255);
        if (r95 == false) goto L137;
        C1082a r96 = C1082a.m2565a(r104);
        C1095n r105 = C1095n.f4213k;
        float r133 = r96.f4184b;
        if (r133 >= 1.0d) goto L86;
    L89:
        r74 = r03;
        r28 = r2;
        r29 = r33;
        r162 = true;
        int r05 = AbstractC1083b.m2570d(r42);
    L125:
        r104 = r05;
    L138:
        r104 = (16777215 & r104) | (r112 << 24);
        goto L139
    L86:
        if (Math.round(r42) <= 0.0d) goto L89;
        if (Math.round(r42) >= 100.0d) goto L89;
        float r97 = r96.f4183a;
        if (r97 >= 0.0f) goto L93;
        float r98 = 0.0f;
    L94:
        float r20 = 0.0f;
        float r152 = r133;
        C1082a r142 = null;
        boolean r192 = true;
    L96:
        if (Math.abs(r20 - r133) < 0.4f) goto L132;
        float r21 = 1000.0f;
        float r23 = r73;
        float r24 = r123;
        float r222 = 1000.0f;
        C1082a r25 = null;
    L99:
        if (Math.abs(r23 - r24) <= 0.01f) goto L121;
        float r75 = ((r24 - r23) / 2.0f) + r23;
        int r111 = C1082a.m2566b(r75, r152, r98).m2567c(C1095n.f4213k);
        float r124 = AbstractC1083b.m2571e(Color.red(r111));
        float r282 = AbstractC1083b.m2571e(Color.green(r111));
        float r292 = AbstractC1083b.m2571e(Color.blue(r111));
        r162 = true;
        float[] r30 = AbstractC1083b.f4192d[1];
        float r172 = 100.0f;
        float r125 = ((r292 * r30[2]) + ((r282 * r30[1]) + (r124 * r30[0]))) / 100.0f;
        if (r125 > 0.008856452f) goto L103;
        float r126 = r125 * 903.2963f;
        r28 = r2;
        r29 = r33;
    L104:
        float r26 = Math.abs(r42 - r126);
        if (r26 >= 0.2f) goto L110;
        C1082a r113 = C1082a.m2565a(r111);
        C1082a r27 = C1082a.m2566b(r113.f4185c, r113.f4184b, r98);
        float r31 = r75;
        float r37 = r113.f4186d - r27.f4186d;
        float r322 = r98;
        float r76 = r113.f4187e - r27.f4187e;
        float r99 = r113.f4188f - r27.f4188f;
        float r77 = r76 * r76;
        float r910 = r99 * r99;
        double r210 = Math.sqrt(r910 + (r77 + (r37 * r37)));
        r74 = r03;
        float r06 = (float) (Math.pow(r210, 0.63d) * 1.41d);
        if (r06 > 1.0f) goto L109;
        r222 = r06;
        r25 = r113;
        r21 = r26;
    L109:
        float r07 = 0.0f;
        if (r21 != 0.0f) goto L117;
        if (r222 != 0.0f) goto L117;
    L115:
        C1082a r211 = r25;
        if (r192 == false) goto L128;
        if (r211 != null) goto L124;
        r152 = ((r133 - r20) / 2.0f) + r20;
        r123 = r172;
        r2 = r28;
        r33 = r29;
        r98 = r322;
        r192 = false;
    L127:
        int[] r332 = r74;
        r73 = r07;
        r03 = r332;
        goto L96
    L124:
        r05 = r211.m2567c(r105);
        goto L125
    L128:
        if (r211 != null) goto L130;
        r133 = r152;
    L131:
        r152 = ((r133 - r20) / 2.0f) + r20;
        r123 = r172;
        r2 = r28;
        r33 = r29;
        r98 = r322;
        goto L127
    L130:
        r142 = r211;
        r20 = r152;
    L117:
        if (r126 >= r42) goto L119;
        r23 = r31;
    L120:
        r123 = 100.0f;
        r2 = r28;
        r33 = r29;
        r98 = r322;
        int[] r333 = r74;
        r73 = 0.0f;
        r03 = r333;
        goto L99
    L119:
        r24 = r31;
        goto L120
    L110:
        r31 = r75;
        r322 = r98;
        r74 = r03;
        goto L109
    L103:
        r28 = r2;
        r29 = r33;
        r126 = (((float) Math.cbrt(r125)) * 116.0f) - 16.0f;
        goto L104
    L121:
        r28 = r2;
        r29 = r33;
        r322 = r98;
        r172 = r123;
        r162 = true;
        float r334 = r73;
        r74 = r03;
        r07 = r334;
        goto L115
    L132:
        r74 = r03;
        r28 = r2;
        r29 = r33;
        r162 = true;
        if (r142 != null) goto L135;
        r05 = AbstractC1083b.m2570d(r42);
        goto L125
    L135:
        r05 = r142.m2567c(r105);
        goto L125
    L93:
        r98 = Math.min(360.0f, r97);
        goto L94
    L137:
        r74 = r03;
        r28 = r2;
        r29 = r33;
        r162 = true;
        goto L138
    L73:
        if (r42 > 100.0f) goto L76;
        r95 = true;
        goto L78
    L51:
        if (r93.hasValue(2) == false) goto L53;
        r42 = r93.getFloat(2, -1.0f);
        goto L54
    L45:
        if (r93.hasValue(3) == false) goto L47;
        r11 = r93.getFloat(3, 1.0f);
        goto L49
    L47:
        r11 = 1.0f;
    L39:
        r104 = r93.getColor(r7, -65281);
        goto L42
    L32:
        r12 = r16;
    L40:
        r104 = r93.getColor(r7, -65281);
        goto L42
    L26:
        r93 = r1.obtainStyledAttributes(r2, r92, r7, r7);
    L22:
        AttributeSet r283 = r2;
        int r293 = r33;
        r02 = r34;
        r1 = r36;
        r4 = r4 == true ? 1 : 0;
        r2 = r283;
        r33 = r293;
        r7 = 0;
    L155:
        int[] r08 = new int[r8];
        int[][] r114 = new int[r8][];
        System.arraycopy(r5, 0, r08, 0, r8);
        System.arraycopy(r6, 0, r114, 0, r8);
        return new ColorStateList(r114, r08);
    L158:
        throw new XmlPullParserException(r35.getPositionDescription() + ": invalid color state list tag " + r32);
    L160:
        throw new XmlPullParserException("No start tag found");
    }
}
