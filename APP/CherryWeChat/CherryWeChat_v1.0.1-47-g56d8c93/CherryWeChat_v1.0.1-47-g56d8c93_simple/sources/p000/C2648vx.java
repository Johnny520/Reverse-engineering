package p000;

import android.text.TextUtils;
import android.view.View;
import java.io.Serializable;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: vx */
/* JADX INFO: loaded from: classes.dex */
public final class C2648vx {

    /* JADX INFO: renamed from: a */
    public Object f9162a;

    /* JADX INFO: renamed from: b */
    public Serializable f9163b;

    /* JADX INFO: renamed from: c */
    public Object f9164c;

    /* JADX INFO: renamed from: d */
    public Serializable f9165d;

    /* JADX INFO: renamed from: e */
    public Object f9166e;

    public C2648vx(Boolean r7, Double r8) {
        this(r7, r8, null, Boolean.FALSE, null);
    }

    /* JADX INFO: renamed from: a */
    public Object m5178a() {
        Field r0 = m5179b();
        if (r0 == null) goto L12;
        return r0.get(this.f9164c);
    L6:
        e = move-exception;
        e.printStackTrace();
        return null;
    L12:
        return null;
    }

    /* JADX INFO: renamed from: b */
    public Field m5179b() {
        Class r0 = (Class) this.f9163b;
        if (((Field) this.f9166e) != null) goto L31;
        Field r2 = null;
        if (TextUtils.isEmpty((String) this.f9162a) == false) goto L16;
        Class r1 = (Class) this.f9165d;
    L7:
        Field[] r5 = r0.getDeclaredFields();
        AbstractC0295Gu.m625r(-577415403272245L);
        int r6 = r5.length;
        int r7 = 0;
    L8:
        if (r7 >= r6) goto L13;
        Field r8 = r5[r7];
        if (AbstractC0585Nj.m1134a(r8.getType(), r1) == true) goto L11;
        r7 = r7 + 1;
        goto L8
    L11:
        r8.setAccessible(true);
        r2 = r8;
    L29:
        this.f9166e = r2;
        goto L31
    L13:
        r0 = r0.getSuperclass();
        if (r0 != null) goto L7;
    L16:
        Class r12 = (Class) this.f9165d;
        String r52 = (String) this.f9162a;
    L17:
        Field[] r62 = r0.getDeclaredFields();
        AbstractC0295Gu.m625r(-577316619024437L);
        int r72 = r62.length;
        int r82 = 0;
    L18:
        if (r82 >= r72) goto L27;
        Field r9 = r62[r82];
        if (r12 == null) goto L24;
        if (AbstractC0585Nj.m1134a(r9.getType(), r12) == true) goto L24;
    L26:
        r82 = r82 + 1;
    L24:
        if (AbstractC0585Nj.m1134a(r9.getName(), r52) == false) goto L26;
        r9.setAccessible(true);
        r2 = r9;
        goto L29
    L27:
        r0 = r0.getSuperclass();
        if (r0 != null) goto L17;
    L31:
        return (Field) this.f9166e;
    }

    /* JADX INFO: renamed from: c */
    public void m5180c(String r3) {
        AbstractC0295Gu.m625r(-577295144187957L);
        this.f9162a = r3;
    }

    /* JADX INFO: renamed from: d */
    public void m5181d(Object r4) {
        Object r0 = this.f9164c;
        if (r0 != null) goto L6;
        return;
    L6:
        if (((Field) this.f9166e) != null) goto L8;
        this.f9166e = m5179b();
    L8:
        Field r1 = (Field) this.f9166e;
        if (r1 != null) goto L16;
        return;
    L16:
        r1.setAccessible(true);     // Catch: IllegalAccessException -> L13
        ((Field) this.f9166e).set(r0, r4);     // Catch: IllegalAccessException -> L13
        return;
    L13:
        e = move-exception;
        e.printStackTrace();
    }

    /* JADX INFO: renamed from: e */
    public void m5182e(String r3) {
        AbstractC0295Gu.m625r(-577273669351477L);
        int r0 = AbstractC1450gG.f5067a;
        this.f9165d = AbstractC1406fG.m2718r0(r3);
    }

    public C2648vx(String r3, String r4, String r5, String r6, View.OnClickListener r7) {
        AbstractC0295Gu.m625r(-47455093651509L);
        AbstractC0295Gu.m625r(-47472273520693L);
        AbstractC0295Gu.m625r(-47510928226357L);
        this.f9162a = r3;
        this.f9163b = r4;
        this.f9164c = r5;
        this.f9165d = r6;
        this.f9166e = r7;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ C2648vx(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, android.view.View.OnClickListener r11, int r12) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0000: ARITH (r0v0 ?? I:??[int, boolean]) = (r12v0 ?? I:??[int, boolean, short, byte, char]) & (2 ??[int, float, short, byte, char]) A[DECLARE_VAR] in method: vx.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.view.View$OnClickListener, int):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:362)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:330)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:293)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
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
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.ArgType.getPrimitiveType()" because "type" is null
            	at jadx.core.codegen.ClassGen.useType(ClassGen.java:556)
            	at jadx.core.codegen.InsnGen.useType(InsnGen.java:269)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:166)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:159)
            	at jadx.core.codegen.InsnGen.assignVar(InsnGen.java:152)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:299)
            	... 31 more
            */
        /*
            r6 = this;
            r0 = r12 & 2
            if (r0 == 0) goto Ld
            r0 = -47536698030133(0xffffd4c4000007cb, double:NaN)
            java.lang.String r8 = p000.AbstractC0295Gu.m625r(r0)
        Ld:
            r2 = r8
            r8 = r12 & 8
            r0 = 0
            if (r8 == 0) goto L15
            r4 = r0
            goto L16
        L15:
            r4 = r10
        L16:
            r8 = r12 & 16
            if (r8 == 0) goto L1f
            r5 = r0
            r1 = r7
            r3 = r9
            r0 = r6
            goto L23
        L1f:
            r5 = r11
            r0 = r6
            r1 = r7
            r3 = r9
        L23:
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2648vx.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.view.View$OnClickListener, int):void");
    }

    public C2648vx(Boolean r1, Double r2, Double r3, Boolean r4, Double r5) {
        this.f9162a = r1;
        this.f9163b = r2;
        this.f9164c = r3;
        if (r1.booleanValue() == true) goto L5;
    L7:
        boolean r12 = false;
    L8:
        this.f9165d = Boolean.valueOf(r12);
        this.f9166e = r5;
        return;
    L5:
        if (r4.booleanValue() == false) goto L7;
        r12 = true;
        goto L8
    }
}
