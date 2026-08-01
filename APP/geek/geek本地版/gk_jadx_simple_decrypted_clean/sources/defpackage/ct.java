package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ct implements ya0 {
    public static long a;
    public static long b;
    public static Method c;

    public ct() {
        new ConcurrentHashMap();
    }

    public static int d(int r0, int r1, int r2) {
        if (r0 >= r1) goto L4;
        return r1;
    L4:
        if (r0 <= r2) goto L6;
        return r2;
    L6:
        return r0;
    }

    public static float[] e(float[] r2, int r3) {
        if (r3 < 0) goto L10;
        int r0 = r2.length;
        if (r0 < 0) goto L8;
        int r02 = Math.min(r3, r0);
        float[] r32 = new float[r3];
        System.arraycopy(r2, 0, r32, 0, r02);
        return r32;
    L8:
        throw new ArrayIndexOutOfBoundsException();
    L10:
        throw new IllegalArgumentException();
    }

    public static final e10 f(Throwable r1) {
        ip.o("exception", r1);
        return new e10(r1);
    }

    public static ox[] j(String r17) {
        if (r17 != null) goto L6;
        return null;
    L6:
        ArrayList r1 = new ArrayList();
        int r2 = 0;
        int r5 = 0;
        int r4 = 1;
    L8:
        if (r4 >= r17.length()) goto L65;
    L10:
        if (r4 >= r17.length()) goto L19;
        char r6 = r17.charAt(r4);
        if (((r6 - 'Z') * (r6 - 'A')) > 0) goto L14;
    L15:
        if (r6 == 'e') goto L18;
        if (r6 != 'E') goto L19;
    L18:
        r4 = r4 + 1;
        goto L10
    L14:
        if (((r6 - 'z') * (r6 - 'a')) > 0) goto L18;
    L19:
        String r52 = r17.substring(r5, r4).trim();
        if (r52.length() <= 0) goto L63;
        if (r52.charAt(r2) != 'z') goto L24;
    L61:
        float[] r3 = new float[r2];
    L62:
        char r53 = r52.charAt(r2);
        ox r22 = new ox();
        r22.a = r53;
        r22.b = r3;
        r1.add(r22);
        goto L63
    L24:
        if (r52.charAt(r2) == 'Z') goto L61;
        float[] r62 = new float[r52.length()];     // Catch: NumberFormatException -> L51
        int r9 = r52.length();     // Catch: NumberFormatException -> L51
        int r11 = r2;
        int r10 = 1;
    L27:
        if (r10 >= r9) goto L58;
        int r13 = r2;
        int r14 = r13;
        int r15 = r14;
        int r16 = r15;
        int r12 = r10;
    L30:
        if (r12 >= r52.length()) goto L49;
        char r32 = r52.charAt(r12);     // Catch: NumberFormatException -> L51
        if (r32 == ' ') goto L45;
        if (r32 == 'E') goto L44;
        if (r32 == 'e') goto L44;
        switch(r32) {
            case 44: goto L45;
            case 45: goto L40;
            case 46: goto L37;
            default: goto L43;
        };     // Catch: NumberFormatException -> L51
    L37:
        if (r14 != 0) goto L39;
        r13 = 0;
        r14 = 1;
    L46:
        if (r15 != 0) goto L49;
        r12 = r12 + 1;     // Catch: NumberFormatException -> L51
    L39:
        r13 = 0;
        r15 = 1;
        r16 = 1;
        goto L46
    L40:
        if (r12 == r10) goto L43;
        if (r13 == 0) goto L39;
    L43:
        r13 = 0;
    L44:
        r13 = 1;
    L45:
        r13 = 0;
        r15 = 1;
    L49:
        if (r10 >= r12) goto L53;
        r62[r11] = Float.parseFloat(r52.substring(r10, r12));     // Catch: NumberFormatException -> L51
        r11 = r11 + 1;     // Catch: NumberFormatException -> L51
    L53:
        if (r16 == 0) goto L56;
        r10 = r12;
    L55:
        r2 = 0;
        goto L27
    L56:
        r10 = r12 + 1;     // Catch: NumberFormatException -> L51
        goto L55
    L58:
        r3 = e(r62, r11);     // Catch: NumberFormatException -> L51
        r2 = 0;
    L51:
        e = move-exception;
        throw new RuntimeException(z30.j("error in parsing \"", r52, "\""), e);
    L63:
        r5 = r4;
        r4 = r4 + 1;
        r2 = 0;
        goto L8
    L65:
        if ((r4 - r5) != 1) goto L70;
        if (r5 >= r17.length()) goto L70;
        char r0 = r17.charAt(r5);
        ox r33 = new ox();
        r33.a = r0;
        r33.b = new float[0];
        r1.add(r33);
    L70:
        return (ox[]) r1.toArray(new ox[r1.size()]);
    }

    public static ox[] k(ox[] r5) {
        if (r5 != null) goto L5;
        return null;
    L5:
        ox[] r0 = new ox[r5.length];
        int r1 = 0;
    L7:
        if (r1 >= r5.length) goto L9;
        ox r3 = r5[r1];
        ox r2 = new ox();
        r2.a = r3.a;
        float[] r32 = r3.b;
        r2.b = e(r32, r32.length);
        r0[r1] = r2;
        r1 = r1 + 1;
        goto L7
    L9:
        return r0;
    }

    public static ColorStateList m(Context r2, r5 r3, int r4) {
        TypedArray r0 = (TypedArray) r3.b;
        if (r0.hasValue(r4) == false) goto L10;
        int r02 = r0.getResourceId(r4, 0);
        if (r02 == 0) goto L10;
        ColorStateList r22 = ip.v(r2, r02);
        if (r22 == null) goto L10;
        return r22;
    L10:
        return r3.l(r4);
    }

    public static ColorStateList n(Context r1, TypedArray r2, int r3) {
        if (r2.hasValue(r3) == false) goto L10;
        int r0 = r2.getResourceId(r3, 0);
        if (r0 == 0) goto L10;
        ColorStateList r12 = ip.v(r1, r0);
        if (r12 == null) goto L10;
        return r12;
    L10:
        return r2.getColorStateList(r3);
    }

    public static Drawable o(Context r1, TypedArray r2, int r3) {
        if (r2.hasValue(r3) == false) goto L10;
        int r0 = r2.getResourceId(r3, 0);
        if (r0 == 0) goto L10;
        Drawable r12 = ff.r(r1, r0);
        if (r12 == null) goto L10;
        return r12;
    L10:
        return r2.getDrawable(r3);
    }

    public static float p(String[] r2, int r3) {
        float r22 = Float.parseFloat(r2[r3]);
        if (r22 < 0.0f) goto L8;
        if (r22 > 1.0f) goto L8;
        return r22;
    L8:
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + r22);
    }

    public static int q(int r3) {
        if (r3 != 1) goto L5;
        return 0;
    L5:
        if (r3 != 2) goto L7;
        return 1;
    L7:
        if (r3 != 4) goto L9;
        return 2;
    L9:
        if (r3 != 8) goto L11;
        return 3;
    L11:
        if (r3 != 16) goto L13;
        return 4;
    L13:
        if (r3 != 32) goto L15;
        return 5;
    L15:
        if (r3 != 64) goto L17;
        return 6;
    L17:
        if (r3 != 128) goto L19;
        return 7;
    L19:
        if (r3 != 256) goto L22;
        return 8;
    L22:
        throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + r3);
    }

    public static boolean r() {
        if (c != null) goto L26;
        return f0.s();
    L26:
    L12:
        e = move-exception;
        if ((e instanceof InvocationTargetException) == false) goto L21;
        Throwable r0 = e.getCause();
        if ((r0 instanceof RuntimeException) == false) goto L20;
        throw ((RuntimeException) r0);
    L20:
        throw new RuntimeException(r0);
    L21:
        Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
        return false;
    L8:
        if (c != null) goto L10;
        b = Trace.class.getField("TRACE_TAG_APP").getLong(null);     // Catch: Exception -> L12
        c = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});     // Catch: Exception -> L12
    L10:
        return ((Boolean) c.invoke(null, new Object[]{Long.valueOf(b)})).booleanValue();
    }

    public static boolean s(Context r1) {
        if (r1.getResources().getConfiguration().fontScale < 1.3f) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean t(String r1, String r2) {
        if (r1.startsWith(r2.concat("(")) == true) goto L5;
        return false;
    L5:
        if (r1.endsWith(")") == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static final int u(hp r3) {
        m r0 = az.a;
        int r02 = r3.a;
        if (r3.isEmpty() == true) goto L15;
        int r32 = r3.b;
        if (r32 >= Integer.MAX_VALUE) goto L9;
        return az.a.c(r02, r32 + 1);
    L9:
        if (r02 <= Integer.MIN_VALUE) goto L13;
        return az.a.c(r02 - 1, r32) + 1;
    L13:
        return az.a.b();
    L15:
        throw new IllegalArgumentException("Cannot get random in empty range: " + r3);
    }

    public static int v(Context r1, int r2, int r3) {
        TypedValue r12 = gt.y(r1, r2);
        if (r12 != null) goto L5;
    L8:
        return r3;
    L5:
        if (r12.type != 16) goto L8;
        return r12.data;
    }

    public static TimeInterpolator w(Context r5, int r6, TimeInterpolator r7) {
        TypedValue r0 = new TypedValue();
        if (r5.getTheme().resolveAttribute(r6, r0, true) == true) goto L6;
        return r7;
    L6:
        if (r0.type != 3) goto L37;
        String r62 = String.valueOf(r0.string);
        if (t(r62, "cubic-bezier") == true) goto L15;
        if (t(r62, "path") == true) goto L15;
        return AnimationUtils.loadInterpolator(r5, r0.resourceId);
    L15:
        if (t(r62, "cubic-bezier") == false) goto L23;
        String[] r52 = r62.substring(13, r62.length() - 1).split(",");
        if (r52.length != 4) goto L21;
        return nx.b(p(r52, 0), p(r52, 1), p(r52, 2), p(r52, 3));
    L21:
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + r52.length);
    L23:
        if (t(r62, "path") == false) goto L35;
        String r53 = r62.substring(5, r62.length() - 1);
        Path r63 = new Path();
        ox[] r72 = j(r53);
        if (r72 != null) goto L38;
        r63 = null;
    L33:
        return nx.c(r63);
    L38:
        ox.b(r72, r63);     // Catch: RuntimeException -> L28
    L28:
        e = move-exception;
        throw new RuntimeException("Error in parsing " + r53, e);
    L35:
        throw new IllegalArgumentException("Invalid motion easing type: ".concat(r62));
    L37:
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x(w10 r1, w10 r2, wm r3) {
        a80.b((m50) r3);     // Catch: Throwable -> L4
        Object r22 = r3.e(r2, r1);     // Catch: Throwable -> L4
    L6:
        pe r32 = pe.a;
        if (r22 == r32) goto L30;
        Object r12 = r1.C(r22);
        if (r12 != ip.g) goto L13;
        return r32;
    L13:
        if ((r12 instanceof nb) == true) goto L26;
        if ((r12 instanceof wo) == false) goto L17;
        wo r23 = (wo) r12;
    L18:
        if (r23 == null) goto L24;
        vo r24 = r23.a;
        if (r24 == null) goto L24;
        return r24;
    L24:
        return r12;
    L17:
        r23 = null;
        goto L18
    L26:
        throw ((nb) r12).a;
    L30:
        return r32;
    L4:
        th = move-exception;
        r22 = new nb(th, false);
        goto L6
    }

    public static final void y(Object r1) {
        if ((r1 instanceof e10) == true) goto L6;
        return;
    L6:
        throw ((e10) r1).a;
    }

    public abstract Typeface g(Context r1, dl r2, Resources r3, int r4);

    public abstract Typeface h(Context r1, gl[] r2, int r3);

    public Typeface i(Context r1, Resources r2, int r3, String r4, int r5) {
        /*  JADX ERROR: Simple mode code generation failed
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
            	at java.base/java.util.Objects.checkIndex(Objects.java:365)
            	at java.base/java.util.ArrayList.get(ArrayList.java:428)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:368)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:330)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:293)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:88)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
            */
        /*
            this = this;
            java.io.File r1 = defpackage.gt.k(r1)
            r4 = 0
            if (r1 != 0) goto L8
            return r4
        L8:
            boolean r2 = defpackage.gt.f(r1, r2, r3)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            if (r2 != 0) goto L12
            r1.delete()
            return r4
        L12:
            java.lang.String r2 = r1.getPath()     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromFile(r2)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            r1.delete()
            return r2
        L1e:
            r2 = move-exception
            r1.delete()
            throw r2
        L23:
            r1.delete()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct.i(android.content.Context, android.content.res.Resources, int, java.lang.String, int):android.graphics.Typeface");
    }

    public gl l(int r11, gl[] r12) {
        new iy(9);
        if ((r11 & 1) != 0) goto L5;
        int r0 = 400;
    L7:
        if ((r11 & 2) == 0) goto L9;
        boolean r112 = true;
    L10:
        int r3 = r12.length;
        gl r4 = null;
        int r5 = Integer.MAX_VALUE;
        int r6 = 0;
    L11:
        if (r6 >= r3) goto L21;
        gl r7 = r12[r6];
        int r8 = Math.abs(r7.c - r0) * 2;
        if (r7.d != r112) goto L15;
        int r9 = 0;
    L16:
        int r82 = r8 + r9;
        if (r4 == null) goto L19;
        if (r5 > r82) goto L19;
    L20:
        r6 = r6 + 1;
    L19:
        r4 = r7;
        r5 = r82;
        goto L20
    L15:
        r9 = 1;
        goto L16
    L21:
        return r4;
    L9:
        r112 = false;
        goto L10
    L5:
        r0 = 700;
        goto L7
    }

    @Override // defpackage.ya0
    public void b(View r1) {
    }

    @Override // defpackage.ya0
    public void c() {
    }
}
