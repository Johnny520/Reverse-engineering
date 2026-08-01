package defpackage;

import android.app.Activity;
import android.support.v4.graphics.drawable.C0005;
import android.view.C0007;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.activity.C0010;
import androidx.activity.C0011;
import androidx.constraintlayout.helper.widget.C0017;
import androidx.constraintlayout.widget.C0018;
import androidx.core.content.C0023;
import androidx.core.widget.C0025;
import androidx.lifecycle.C0029;
import androidx.recyclerview.widget.C0033;
import androidx.savedstate.C0034;
import androidx.savedstate.C0035;
import androidx.startup.C0037;
import androidx.versionedparcelable.C0038;
import androidx.versionedparcelable.C0039;
import androidx.versionedparcelable.C0040;
import com.github.megatronking.stringfog.C0047;
import com.google.android.material.behavior.C0050;
import com.google.android.material.chip.C0057;
import com.google.android.material.datepicker.C0059;
import com.google.android.material.theme.C0062;
import com.ljx.wechatmod.hook.C0066;
import com.ljx.wechatmod.ui.C0067;
import kotlinx.coroutines.C0069;

/* JADX INFO: loaded from: classes.dex */
public final class qs implements ViewTreeObserver.OnPreDrawListener {
    public int a;
    public final ViewGroup b;
    public final k9 c;
    public final Activity d;

    public qs(ViewGroup r4, k9 r5, Activity r6) {
        int r2 = C0039.m159("ۣۨۤ");
        Float r1 = null;
    L3:
        switch(r2) {
            case 1746940: goto L5;
            case 1746944: goto L12;
            case 1749730: goto L6;
            case 1749853: goto L22;
            case 1751624: goto L25;
            case 1753452: goto L16;
            case 1753542: goto L18;
            case 1755465: goto L29;
            case 1755619: goto L30;
            default: goto L3;
        };
    L5:
        Float r0 = Float.decode(C0017.m68("JBP"));
        r2 = 1749754 + (C0011.f11 % C0005.f5);
        r1 = r0;
        goto L3
    L6:
        System.out.println(r1);
        if ((C0010.f10 + (C0071.f71 % (-7608))) >= 0) goto L8;
        String r02 = "ۣۨۨ";
    L10:
        r2 = C0007.m28(r02);
        goto L3
    L8:
        C0018.f18 = 33;
        r2 = C0005.m23("ۦۣۣ");
        goto L3
    L12:
        if (C0067.m269() > 0) goto L22;
        if ((C0035.f35 * (C0033.f33 - 1503)) >= 0) goto L15;
    L27:
        r2 = C0035.m140("۟ۧۤ");
        goto L3
    L15:
        C0062.m248();
        r2 = C0040.m160("ۣۢۨ");
        goto L3
    L16:
        this.d = r6;
        r02 = "۟ۧۨ";
        goto L10
    L18:
        if (C0023.m92() >= 0) goto L19;
        r2 = (C0069.f69 - C0047.f47) + 1755490;
        goto L3
    L19:
        C0047.m191();
        r02 = "ۧۨۤ";
    L22:
        if ((C0059.f59 ^ (C0038.f38 / 9473)) >= 0) goto L23;
        r2 = (C0007.f7 % C0050.f50) ^ 1755618;
        goto L3
    L23:
        r2 = C0037.m149("ۧ۠۠");
        goto L3
    L25:
        this.c = r5;
        if ((C0057.f57 - (C0066.f66 + 9770)) >= 0) goto L27;
        r2 = (C0029.f29 + C0034.f34) + 1754619;
        goto L3
    L29:
        this.b = r4;
        r2 = (C0029.f29 + C0025.f25) + 1752685;
        goto L3
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0003: CONST (r19v0 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[DECLARE_VAR] in method: qs.onPreDraw():boolean, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:362)
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
            Method dump skipped, instruction units count: 2010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qs.onPreDraw():boolean");
    }
}
