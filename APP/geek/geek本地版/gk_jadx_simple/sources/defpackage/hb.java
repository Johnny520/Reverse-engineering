package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.ljx.wechatmod.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class hb {
    public static final ThreadLocal a = null;

    static {
        a = new ThreadLocal();
    }

    public static ColorStateList a(Resources r4, XmlResourceParser r5, Resources.Theme r6) {
        AttributeSet r0 = Xml.asAttributeSet(r5);
    L3:
        int r1 = r5.next();
        if (r1 == 2) goto L8;
        if (r1 != 1) goto L3;
    L8:
        if (r1 != 2) goto L12;
        return b(r4, r5, r0, r6);
    L12:
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    public static ColorStateList b(Resources r36, XmlPullParser r37, AttributeSet r38, Resources.Theme r39) {
        ?? r0 = r36;
        AttributeSet r1 = r38;
        Resources.Theme r2 = r39;
        String r3 = r37.getName();
        if (r3.equals("selector") == false) goto L148;
        ?? r4 = 1;
        int r32 = r37.getDepth() + 1;
        Object[] r6 = new int[20][];
        int[] r5 = new int[20];
        int r7 = 0;
        int r8 = 0;
    L5:
        int r9 = r37.next();
        if (r9 == r4) goto L145;
        int r10 = r37.getDepth();
        if (r10 >= r32) goto L11;
        if (r9 == 3) goto L145;
    L11:
        if (r9 != 2) goto L15;
        if (r10 > r32) goto L15;
        if (r37.getName().equals("item") == false) goto L15;
        int[] r92 = ty.a;
        if (r2 != null) goto L19;
        ?? r93 = r0.obtainAttributes(r1, r92);
    L20:
        int r13 = r93.getResourceId(r7, -1);
        if (r13 == (-1)) goto L33;
        ThreadLocal r102 = a;
        TypedValue r16 = (TypedValue) r102.get();
        if (r16 != null) goto L25;
        TypedValue r12 = new TypedValue();
        r102.set(r12);
    L26:
        r0.getValue(r13, r12, r4);
        int r103 = r12.type;
        if (r103 < 28) goto L149;
        if (r103 <= 31) goto L33;
    L149:
        int r104 = a(r0, r0.getXml(r13), r2).getDefaultColor();     // Catch: Exception -> L32
    L35:
        if (r93.hasValue(r4) == false) goto L38;
        float r11 = r93.getFloat(r4, 1.0f);
    L41:
        ?? r162 = r4;
        if (Build.VERSION.SDK_INT >= 31) goto L44;
    L46:
        float r42 = r93.getFloat(4, -1.0f);
    L47:
        r93.recycle();
        int r94 = r1.getAttributeCount();
        int[] r122 = new int[r94];
        int r15 = r7;
        int r132 = r15;
    L48:
        if (r15 >= r94) goto L63;
        int r14 = r1.getAttributeNameResource(r15);
        if (r14 == 16843173) goto L62;
        if (r14 == 16843551) goto L62;
        if (r14 == R.attr.alpha) goto L62;
        if (r14 == R.attr.lStar) goto L62;
        int r72 = r132 + 1;
        if (r1.getAttributeBooleanValue(r15, false) == true) goto L61;
        r14 = -r14;
    L61:
        r122[r132] = r14;
        r132 = r72;
    L62:
        r15 = r15 + 1;
        goto L48
    L63:
        int[] r02 = StateSet.trimStateSet(r122, r132);
        float r123 = 100.0f;
        if (r42 >= 0.0f) goto L66;
    L68:
        boolean r95 = false;
    L70:
        if (r11 != 1.0f) goto L73;
        if (r95 == true) goto L73;
        int[] r31 = r02;
        int r34 = r32;
    L129:
        int r03 = r8 + 1;
        int r22 = 8;
        if (r03 > r5.length) goto L132;
    L136:
        r5[r8] = r104;
        if (r03 <= r6.length) goto L143;
        Class<?> r17 = r6.getClass().getComponentType();
        if (r8 <= 4) goto L142;
        r22 = r8 * 2;
    L142:
        Object[] r18 = (Object[]) Array.newInstance(r17, r22);
        System.arraycopy(r6, 0, r18, 0, r8);
        r6 = r18;
    L143:
        r6[r8] = r31;
        r6 = (int[][]) r6;
        r1 = r38;
        r2 = r39;
        r8 = r03;
        r4 = r162 == true ? 1 : 0;
        r32 = r34;
        r7 = 0;
        r0 = r36;
        goto L5
    L132:
        if (r8 > 4) goto L134;
        int r19 = 8;
    L135:
        int[] r110 = new int[r19];
        System.arraycopy(r5, 0, r110, 0, r8);
        r5 = r110;
        goto L136
    L134:
        r19 = r8 * 2;
    L73:
        int r112 = ct.d((int) ((Color.alpha(r104) * r11) + 0.5f), 0, 255);
        if (r95 == false) goto L127;
        f8 r96 = f8.a(r104);
        float r105 = r96.a;
        float r97 = r96.b;
        gb0 r133 = gb0.k;
        if (r97 >= 1.0d) goto L78;
    L81:
        r31 = r02;
        r34 = r32;
        int r04 = ff.w(r42);
    L116:
        r104 = r04;
    L128:
        r104 = (16777215 & r104) | (r112 << 24);
        goto L129
    L78:
        if (Math.round(r42) <= 0.0d) goto L81;
        if (Math.round(r42) >= 100.0d) goto L81;
        if (r105 >= 0.0f) goto L85;
        float r106 = 0.0f;
    L86:
        float r21 = 0.0f;
        float r152 = r97;
        boolean r20 = r162 == true ? 1 : 0;
        f8 r73 = null;
    L88:
        if (Math.abs(r21 - r97) < 0.4f) goto L122;
        float r23 = 1000.0f;
        float r26 = r123;
        float r25 = 0.0f;
        float r24 = 1000.0f;
        f8 r27 = null;
    L91:
        if (Math.abs(r25 - r26) <= 0.01f) goto L112;
        float r30 = r123;
        float r124 = ((r26 - r25) / 2.0f) + r25;
        r31 = r02;
        int r05 = f8.b(r124, r152, r106).c(gb0.k);
        float r142 = ff.z(Color.red(r05));
        float r322 = ff.z(Color.green(r05));
        float r33 = ff.z(Color.blue(r05));
        float[] r342 = ff.j[r162 == true ? 1 : 0];
        float r143 = ((r33 * r342[2]) + ((r322 * r342[r162 == true ? 1 : 0]) + (r142 * r342[0]))) / r30;
        if (r143 > 0.008856452f) goto L95;
        float r144 = r143 * 903.2963f;
        int r323 = r05;
    L96:
        float r06 = Math.abs(r42 - r144);
        if (r06 >= 0.2f) goto L101;
        f8 r111 = f8.a(r323);
        f8 r07 = f8.b(r111.c, r111.b, r106);
        float r28 = r111.d - r07.d;
        float r29 = r111.e - r07.e;
        float r210 = r111.f - r07.f;
        float r332 = (r29 * r29) + (r28 * r28);
        r34 = r32;
        float r08 = (float) (Math.pow(Math.sqrt((r210 * r210) + r332), 0.63d) * 1.41d);
        if (r08 > 1.0f) goto L103;
        r24 = r08;
        r23 = r06;
        r27 = r111;
    L103:
        if (r23 != 0.0f) goto L108;
        if (r24 != 0.0f) goto L108;
    L106:
        f8 r09 = r27;
        if (r20 == true) goto L114;
        if (r09 != null) goto L120;
        r97 = r152;
    L121:
        r152 = ((r97 - r21) / 2.0f) + r21;
        r123 = r30;
        r02 = r31;
        r32 = r34;
        goto L88
    L120:
        r73 = r09;
        r21 = r152;
        goto L121
    L114:
        if (r09 != null) goto L115;
        r152 = ((r97 - r21) / 2.0f) + r21;
        r123 = r30;
        r02 = r31;
        r32 = r34;
        r20 = false;
        goto L88
    L115:
        r04 = r09.c(r133);
    L108:
        if (r144 >= r42) goto L110;
        r25 = r124;
    L111:
        r123 = r30;
        r02 = r31;
        r32 = r34;
        goto L91
    L110:
        r26 = r124;
        goto L111
    L101:
        r34 = r32;
        goto L103
    L95:
        r323 = r05;
        r144 = (((float) Math.cbrt(r143)) * 116.0f) - 16.0f;
        goto L96
    L112:
        r31 = r02;
        r34 = r32;
        r30 = r123;
        goto L106
    L122:
        r31 = r02;
        r34 = r32;
        if (r73 != null) goto L125;
        r04 = ff.w(r42);
        goto L116
    L125:
        r04 = r73.c(r133);
        goto L116
    L85:
        r106 = Math.min(360.0f, r105);
        goto L86
    L127:
        r31 = r02;
        r34 = r32;
        goto L128
    L66:
        if (r42 > 100.0f) goto L68;
        r95 = r162 == true ? 1 : 0;
        goto L70
    L44:
        if (r93.hasValue(2) == false) goto L46;
        r42 = r93.getFloat(2, -1.0f);
        goto L47
    L38:
        if (r93.hasValue(3) == false) goto L40;
        r11 = r93.getFloat(3, 1.0f);
        goto L41
    L40:
        r11 = 1.0f;
    L32:
        r104 = r93.getColor(r7, -65281);
        goto L35
    L25:
        r12 = r16;
    L33:
        r104 = r93.getColor(r7, -65281);
        goto L35
    L19:
        r93 = r2.obtainStyledAttributes(r1, r92, r7, r7);
    L15:
        int r343 = r32;
        r0 = r36;
        r1 = r38;
        r2 = r39;
        r4 = r4 == true ? 1 : 0;
        r32 = r343;
        r7 = 0;
    L145:
        int[] r010 = new int[r8];
        int[][] r113 = new int[r8][];
        System.arraycopy(r5, 0, r010, 0, r8);
        System.arraycopy(r6, 0, r113, 0, r8);
        return new ColorStateList(r113, r010);
    L148:
        throw new XmlPullParserException(r37.getPositionDescription() + ": invalid color state list tag " + r3);
    }
}
