package Yue;

import Yue.C7060;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4937 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۦ$ۥ */
    public static final class C0563<T> implements InterfaceC4890<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4890 f11503;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5140 f11504;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۦ$ۥ$ۥ, reason: contains not printable characters */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", m1273f = "Errors.kt", m1274i = {0, 0}, m1275l = {113, 114}, m1276m = "collect", m1277n = {"this", "$this$catch_u24lambda_u2d0"}, m1278s = {"L$0", "L$1"})
        public static final class C4938 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11505;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f11506;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public Object f11508;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public Object f11509;

            public C4938(InterfaceC4199 interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11505 = obj;
                this.f11506 |= Integer.MIN_VALUE;
                return C0563.this.mo48(null, this);
            }
        }

        public C0563(InterfaceC4890 interfaceC4890, InterfaceC5140 interfaceC5140) {
            this.f11503 = interfaceC4890;
            this.f11504 = interfaceC5140;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) throws Throwable {
            C4938 c4938;
            C0563<T> c0563;
            if (interfaceC4199 instanceof C4938) {
                c4938 = (C4938) interfaceC4199;
                int i = c4938.f11506;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c4938.f11506 = i - Integer.MIN_VALUE;
                } else {
                    c4938 = new C4938(interfaceC4199);
                }
            }
            Object objM15166 = c4938.f11505;
            Object objM17142 = C5508.m17142();
            int i2 = c4938.f11506;
            if (i2 == 0) {
                C7149.m22422(objM15166);
                InterfaceC4890 interfaceC4890 = this.f11503;
                c4938.f11508 = this;
                c4938.f11509 = interfaceC4892;
                c4938.f11506 = 1;
                objM15166 = C4896.m15166(interfaceC4890, interfaceC4892, c4938);
                if (objM15166 == objM17142) {
                    return objM17142;
                }
                c0563 = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7149.m22422(objM15166);
                    return C8107.f3222;
                }
                interfaceC4892 = (InterfaceC4892) c4938.f11509;
                c0563 = (C0563) c4938.f11508;
                C7149.m22422(objM15166);
            }
            Throwable th = (Throwable) objM15166;
            if (th != null) {
                InterfaceC5140 interfaceC5140 = c0563.f11504;
                c4938.f11508 = null;
                c4938.f11509 = null;
                c4938.f11506 = 2;
                C5437.m16931(6);
                Object objMo15350 = interfaceC5140.mo15350(interfaceC4892, th, c4938);
                C5437.m16931(7);
                if (objMo15350 == objM17142) {
                    return objM17142;
                }
            }
            return C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۦ$ۥ۟ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", m1273f = "Errors.kt", m1274i = {0}, m1275l = {156}, m1276m = "catchImpl", m1277n = {"fromDownstream"}, m1278s = {"L$0"})
    public static final class C0564<T> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f11510;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f11511;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f11512;

        public C0564(InterfaceC4199<? super C0564> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f11511 = obj;
            this.f11512 |= Integer.MIN_VALUE;
            return C4896.m15166(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۦ$ۥ۟۟, reason: contains not printable characters */
    public static final class C4939<T> implements InterfaceC4892 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4892<T> f11513;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7066<Throwable> f11514;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۦ$ۥ۟۟$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", m1273f = "Errors.kt", m1274i = {0}, m1275l = {158}, m1276m = "emit", m1277n = {"this"}, m1278s = {"L$0"})
        public static final class C0565 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public Object f11515;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public /* synthetic */ Object f11516;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ C4939<T> f11517;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public int f11518;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۠ۢۤۦ$ۥ۟۟<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0565(C4939<? super T> c4939, InterfaceC4199<? super C0565> interfaceC4199) {
                super(interfaceC4199);
                this.f11517 = c4939;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11516 = obj;
                this.f11518 |= Integer.MIN_VALUE;
                return this.f11517.mo10059(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣۣ۠ۢ<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public C4939(InterfaceC4892<? super T> interfaceC4892, C7060.C7066<Throwable> c7066) {
            this.f11513 = interfaceC4892;
            this.f11514 = c7066;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Yue.InterfaceC4892
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) throws Throwable {
            C0565 c0565;
            C4939<T> c4939;
            if (interfaceC4199 instanceof C0565) {
                c0565 = (C0565) interfaceC4199;
                int i = c0565.f11518;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0565.f11518 = i - Integer.MIN_VALUE;
                } else {
                    c0565 = new C0565(this, interfaceC4199);
                }
            }
            Object obj = c0565.f11516;
            Object objM17142 = C5508.m17142();
            int i2 = c0565.f11518;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4939 = (C4939) c0565.f11515;
                try {
                    C7149.m22422(obj);
                    return C8107.f3222;
                } catch (Throwable 
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                    	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
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
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
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
                    */
                /*
                    this = this;
                    boolean r0 = r6 instanceof Yue.C4937.C4939.C0565
                    if (r0 == 0) goto L13
                    r0 = r6
                    Yue.ۥ۠ۢۤۦ$ۥ۟۟$ۥ r0 = (Yue.C4937.C4939.C0565) r0
                    int r1 = r0.f11518
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f11518 = r1
                    goto L18
                L13:
                    Yue.ۥ۠ۢۤۦ$ۥ۟۟$ۥ r0 = new Yue.ۥ۠ۢۤۦ$ۥ۟۟$ۥ
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f11516
                    java.lang.Object r1 = Yue.C5508.m17142()
                    int r2 = r0.f11518
                    r3 = 1
                    if (r2 == 0) goto L37
                    if (r2 != r3) goto L2f
                    java.lang.Object r5 = r0.f11515
                    Yue.ۥ۠ۢۤۦ$ۥ۟۟ r5 = (Yue.C4937.C4939) r5
                    Yue.C7149.m22422(r6)     // Catch: java.lang.Throwable -> L2d
                    goto L47
                L2d:
                    r6 = move-exception
                    goto L4c
                L2f:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L37:
                    Yue.C7149.m22422(r6)
                    Yue.ۥۣۣ۠ۢ<T> r6 = r4.f11513     // Catch: java.lang.Throwable -> L4a
                    r0.f11515 = r4     // Catch: java.lang.Throwable -> L4a
                    r0.f11518 = r3     // Catch: java.lang.Throwable -> L4a
                    java.lang.Object r5 = r6.mo10059(r5, r0)     // Catch: java.lang.Throwable -> L4a
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    Yue.ۥۣۢ۠ۤ r5 = Yue.C8107.f3222
                    return r5
                L4a:
                    r6 = move-exception
                    r5 = r4
                L4c:
                    Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ<java.lang.Throwable> r5 = r5.f11514
                    r5.f21353 = r6
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: Yue.C4937.C4939.mo10059(java.lang.Object, Yue.ۥ۟ۧۤۢ):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۦ$ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", m1273f = "Errors.kt", m1274i = {}, m1275l = {}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
        public static final class C4940 extends AbstractC7690 implements InterfaceC5138<Throwable, InterfaceC4199<? super Boolean>, Object> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public int f11519;

            public C4940(InterfaceC4199<? super C4940> interfaceC4199) {
                super(2, interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6399
            public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
                return new C4940(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                C5508.m17142();
                if (this.f11519 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7149.m22422(obj);
                return C3590.m636(true);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // Yue.InterfaceC5138
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public final Object invoke(@InterfaceC6399 Throwable th, @InterfaceC6489 InterfaceC4199<? super Boolean> interfaceC4199) {
                return ((C4940) create(th, interfaceC4199)).invokeSuspend(C8107.f3222);
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۦ$ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", m1273f = "Errors.kt", m1274i = {}, m1275l = {95}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
        public static final class C4941<T> extends AbstractC7690 implements InterfaceC5141<InterfaceC4892<? super T>, Throwable, Long, InterfaceC4199<? super Boolean>, Object> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public int f11520;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public /* synthetic */ Object f11521;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public /* synthetic */ long f11522;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final /* synthetic */ long f11523;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC5138<Throwable, InterfaceC4199<? super Boolean>, Object> f11524;

            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۢۢ<? super java.lang.Throwable, ? super Yue.ۥ۟ۧۤۢ<? super java.lang.Boolean>, ? extends java.lang.Object> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C4941(long j, InterfaceC5138<? super Throwable, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5138, InterfaceC4199<? super C4941> interfaceC4199) {
                super(4, interfaceC4199);
                this.f11523 = j;
                this.f11524 = interfaceC5138;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                Object objM17142 = C5508.m17142();
                int i = this.f11520;
                if (i == 0) {
                    C7149.m22422(obj);
                    Throwable th = (Throwable) this.f11521;
                    if (this.f11522 < this.f11523) {
                        InterfaceC5138<Throwable, InterfaceC4199<? super Boolean>, Object> interfaceC5138 = this.f11524;
                        this.f11520 = 1;
                        obj = interfaceC5138.invoke(th, this);
                        if (obj == objM17142) {
                            return objM17142;
                        }
                    }
                    return C3590.m636(z);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7149.m22422(obj);
                boolean z = ((Boolean) obj).booleanValue();
                return C3590.m636(z);
            }

            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final Object m15380(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 Throwable th, long j, @InterfaceC6489 InterfaceC4199<? super Boolean> interfaceC4199) {
                C4941 c4941 = new C4941(this.f11523, this.f11524, interfaceC4199);
                c4941.f11521 = th;
                c4941.f11522 = j;
                return c4941.invokeSuspend(C8107.f3222);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // Yue.InterfaceC5141
            /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
            public /* bridge */ /* synthetic */ Object mo15381(Object obj, Throwable th, Long l, InterfaceC4199<? super Boolean> interfaceC4199) {
                return m15380((InterfaceC4892) obj, th, l.longValue(), interfaceC4199);
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۦ$ۥ۟۟۟۠, reason: contains not printable characters */
        public static final class C4942<T> implements InterfaceC4890<T> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC4890 f11525;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC5141 f11526;

            /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ */
            @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", m1273f = "Errors.kt", m1274i = {0, 0, 0, 0, 1, 1, 1, 1}, m1275l = {117, 119}, m1276m = "collect", m1277n = {"this", "$this$retryWhen_u24lambda_u2d2", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u2d2", "cause", "attempt"}, m1278s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
            public static final class C0566 extends AbstractC4201 {

                /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
                public /* synthetic */ Object f11527;

                /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
                public int f11528;

                /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
                public Object f11530;

                /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
                public Object f11531;

                /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
                public Object f11532;

                /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
                public long f11533;

                /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
                public int f11534;

                public C0566(InterfaceC4199 interfaceC4199) {
                    super(interfaceC4199);
                }

                @Override // Yue.AbstractC3513
                @InterfaceC6489
                public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                    this.f11527 = obj;
                    this.f11528 |= Integer.MIN_VALUE;
                    return C4942.this.mo48(null, this);
                }
            }

            public C4942(InterfaceC4890 interfaceC4890, InterfaceC5141 interfaceC5141) {
                this.f11525 = interfaceC4890;
                this.f11526 = interfaceC5141;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0076 -> B:30:0x00a6). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0097 -> B:27:0x009a). Please report as a decompilation issue!!! */
            @Override // Yue.InterfaceC4890
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) throws Throwable {
                C0566 c0566;
                long j;
                C4942<T> c4942;
                int i;
                C4942<T> c49422;
                InterfaceC4892<? super T> interfaceC48922;
                Throwable th;
                Object objM15166;
                if (interfaceC4199 instanceof C0566) {
                    c0566 = (C0566) interfaceC4199;
                    int i2 = c0566.f11528;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0566.f11528 = i2 - Integer.MIN_VALUE;
                    } else {
                        c0566 = new C0566(interfaceC4199);
                    }
                }
                Object obj = c0566.f11527;
                Object objM17142 = C5508.m17142();
                int i3 = c0566.f11528;
                if (i3 == 0) {
                    C7149.m22422(obj);
                    j = 0;
                    c4942 = this;
                    InterfaceC4890 interfaceC4890 = c4942.f11525;
                    c0566.f11530 = c4942;
                    c0566.f11531 = interfaceC4892;
                    c0566.f11532 = null;
                    c0566.f11533 = j;
                    c0566.f11534 = 0;
                    c0566.f11528 = 1;
                    objM15166 = C4896.m15166(interfaceC4890, interfaceC4892, c0566);
                    if (objM15166 != objM17142) {
                    }
                } else if (i3 == 1) {
                    i = c0566.f11534;
                    j = c0566.f11533;
                    interfaceC48922 = (InterfaceC4892) c0566.f11531;
                    c49422 = (C4942) c0566.f11530;
                    C7149.m22422(obj);
                    th = (Throwable) obj;
                    if (th != null) {
                    }
                    c4942 = c49422;
                    if (i == 0) {
                    }
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = c0566.f11533;
                    Throwable th2 = (Throwable) c0566.f11532;
                    interfaceC48922 = (InterfaceC4892) c0566.f11531;
                    c49422 = (C4942) c0566.f11530;
                    C7149.m22422(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        j++;
                        i = 1;
                        c4942 = c49422;
                        if (i == 0) {
                            return C8107.f3222;
                        }
                        interfaceC4892 = interfaceC48922;
                        InterfaceC4890 interfaceC48902 = c4942.f11525;
                        c0566.f11530 = c4942;
                        c0566.f11531 = interfaceC4892;
                        c0566.f11532 = null;
                        c0566.f11533 = j;
                        c0566.f11534 = 0;
                        c0566.f11528 = 1;
                        objM15166 = C4896.m15166(interfaceC48902, interfaceC4892, c0566);
                        if (objM15166 != objM17142) {
                            return objM17142;
                        }
                        interfaceC48922 = interfaceC4892;
                        i = 0;
                        c49422 = c4942;
                        obj = objM15166;
                        th = (Throwable) obj;
                        if (th != null) {
                            InterfaceC5141 interfaceC5141 = c49422.f11526;
                            Long lM9585 = C3590.m9585(j);
                            c0566.f11530 = c49422;
                            c0566.f11531 = interfaceC48922;
                            c0566.f11532 = th;
                            c0566.f11533 = j;
                            c0566.f11528 = 2;
                            C5437.m16931(6);
                            Object objMo15381 = interfaceC5141.mo15381(interfaceC48922, th, lM9585, c0566);
                            C5437.m16931(7);
                            if (objMo15381 == objM17142) {
                                return objM17142;
                            }
                            obj = objMo15381;
                            th2 = th;
                            if (!((Boolean) obj).booleanValue()) {
                                throw th2;
                            }
                        }
                        c4942 = c49422;
                        if (i == 0) {
                        }
                    }
                }
            }
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public static final <T> InterfaceC4890<T> m1829(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5140<? super InterfaceC4892<? super T>, ? super Throwable, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5140) {
            return new C0563(interfaceC4890, interfaceC5140);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final <T> Object m1830(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super Throwable> interfaceC4199) throws Throwable {
            C0564 c0564;
            C7060.C7066 c7066;
            if (interfaceC4199 instanceof C0564) {
                c0564 = (C0564) interfaceC4199;
                int i = c0564.f11512;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0564.f11512 = i - Integer.MIN_VALUE;
                } else {
                    c0564 = new C0564(interfaceC4199);
                }
            }
            Object obj = c0564.f11511;
            Object objM17142 = C5508.m17142();
            int i2 = c0564.f11512;
            if (i2 == 0) {
                C7149.m22422(obj);
                C7060.C7066 c70662 = new C7060.C7066();
                try {
                    InterfaceC4892<? super Object> c4939 = new C4939<>(interfaceC4892, c70662);
                    c0564.f11510 = c70662;
                    c0564.f11512 = 1;
                    if (interfaceC4890.mo48(c4939, c0564) == objM17142) {
                        return objM17142;
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    c7066 = c70662;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c7066 = (C7060.C7066) c0564.f11510;
                try {
                    C7149.m22422(obj);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            Throwable th3 = (Throwable) c7066.f21353;
            if (m15375(th, th3) || m15374(th, c0564.getContext())) {
                throw th;
            }
            if (th3 == null) {
                return th;
            }
            if (th instanceof CancellationException) {
                C4741.m1656(th3, th);
                throw th3;
            }
            C4741.m1656(th, th3);
            throw th;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final boolean m15374(Throwable th, InterfaceC4225 interfaceC4225) {
            InterfaceC5542 interfaceC5542 = (InterfaceC5542) interfaceC4225.get(InterfaceC5542.f13507);
            if (interfaceC5542 == null || !interfaceC5542.isCancelled()) {
                return false;
            }
            return m15375(th, interfaceC5542.mo17161());
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final boolean m15375(Throwable th, Throwable th2) {
            return th2 != null && C5499.m17094(th2, th);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final <T> InterfaceC4890<T> m15376(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, long j, @InterfaceC6399 InterfaceC5138<? super Throwable, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5138) {
            if (j > 0) {
                return C4896.m15272(interfaceC4890, new C4941(j, interfaceC5138, null));
            }
            throw new IllegalArgumentException(("Expected positive amount of retries, but had " + j).toString());
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static /* synthetic */ InterfaceC4890 m15377(InterfaceC4890 interfaceC4890, long j, InterfaceC5138 interfaceC5138, int i, Object obj) {
            if ((i & 1) != 0) {
                j = Long.MAX_VALUE;
            }
            if ((i & 2) != 0) {
                interfaceC5138 = new C4940(null);
            }
            return C4896.m15270(interfaceC4890, j, interfaceC5138);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final <T> InterfaceC4890<T> m15378(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5141<? super InterfaceC4892<? super T>, ? super Throwable, ? super Long, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5141) {
            return new C4942(interfaceC4890, interfaceC5141);
        }
    }
