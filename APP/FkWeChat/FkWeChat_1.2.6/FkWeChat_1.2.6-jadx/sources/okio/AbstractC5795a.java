package okio;

import ae.AbstractC0305d;
import ae.C0316o;
import java.io.Closeable;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.FileSystem;
import java.util.List;
import okio.C5799e;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1057r;
import p172l8.AbstractC4693f;
import p215oc.C5725t;
import p376zd.AbstractC10007o;
import p376zd.AbstractC9988e0;
import p376zd.C10009p;
import p376zd.InterfaceC10020u0;
import p376zd.InterfaceC10024w0;
import p376zd.InterfaceC9997j;
import p376zd.InterfaceC9999k;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: okio.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5795a implements Closeable {
    public static final a Companion = new a(null);
    public static final AbstractC5795a RESOURCES;
    public static final AbstractC5795a SYSTEM;
    public static final C5799e SYSTEM_TEMPORARY_DIRECTORY;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [a9.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX INFO: renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m39022write$default(AbstractC5795a abstractC5795a, C5799e c5799e, boolean z10, InterfaceC0184l interfaceC0184l, int i10, Object obj) throws IllegalAccessException, InvocationTargetException {
        ?? r42;
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: write");
            return null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        c5799e.getClass();
        interfaceC0184l.getClass();
        InterfaceC9997j interfaceC9997jM38647b = AbstractC9988e0.m38647b(abstractC5795a.sink(c5799e, z10));
        Object th = null;
        try {
            Object objMo27m = interfaceC0184l.mo27m(interfaceC9997jM38647b);
            AbstractC1057r.m3834b(1);
            if (interfaceC9997jM38647b != null) {
                try {
                    interfaceC9997jM38647b.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            AbstractC1057r.m3833a(1);
            r42 = th;
            th = objMo27m;
        } catch (Throwable th3) {
            AbstractC1057r.m3834b(1);
            if (interfaceC9997jM38647b != null) {
                try {
                    interfaceC9997jM38647b.close();
                } catch (Throwable th4) {
                    AbstractC4693f.m18753a(th3, th4);
                }
            }
            AbstractC1057r.m3833a(1);
            r42 = th3;
        }
        if (r42 == 0) {
            return th;
        }
        throw r42;
    }

    static {
        AbstractC5795a c5796b;
        try {
            Class.forName("java.nio.file.Files");
            c5796b = new C5798d();
        } catch (ClassNotFoundException unused) {
            c5796b = new C5796b();
        }
        SYSTEM = c5796b;
        C5799e.a aVar = C5799e.f18171r;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        SYSTEM_TEMPORARY_DIRECTORY = C5799e.a.m23310e(aVar, property, false, 1, null);
        ClassLoader classLoader = C0316o.class.getClassLoader();
        classLoader.getClass();
        RESOURCES = new C0316o(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ InterfaceC10020u0 appendingSink$default(AbstractC5795a abstractC5795a, C5799e c5799e, boolean z10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: appendingSink");
            return null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return abstractC5795a.appendingSink(c5799e, z10);
    }

    public static /* synthetic */ void createDirectories$default(AbstractC5795a abstractC5795a, C5799e c5799e, boolean z10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: createDirectories");
            return;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        abstractC5795a.createDirectories(c5799e, z10);
    }

    public static /* synthetic */ void createDirectory$default(AbstractC5795a abstractC5795a, C5799e c5799e, boolean z10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: createDirectory");
            return;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        abstractC5795a.createDirectory(c5799e, z10);
    }

    public static /* synthetic */ void delete$default(AbstractC5795a abstractC5795a, C5799e c5799e, boolean z10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: delete");
            return;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        abstractC5795a.delete(c5799e, z10);
    }

    public static /* synthetic */ void deleteRecursively$default(AbstractC5795a abstractC5795a, C5799e c5799e, boolean z10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: deleteRecursively");
            return;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        abstractC5795a.deleteRecursively(c5799e, z10);
    }

    public static final AbstractC5795a get(FileSystem fileSystem) {
        return Companion.m23287a(fileSystem);
    }

    public static /* synthetic */ InterfaceC7282h listRecursively$default(AbstractC5795a abstractC5795a, C5799e c5799e, boolean z10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: listRecursively");
            return null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return abstractC5795a.listRecursively(c5799e, z10);
    }

    public static /* synthetic */ AbstractC10007o openReadWrite$default(AbstractC5795a abstractC5795a, C5799e c5799e, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: openReadWrite");
            return null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return abstractC5795a.openReadWrite(c5799e, z10, z11);
    }

    public static /* synthetic */ InterfaceC10020u0 sink$default(AbstractC5795a abstractC5795a, C5799e c5799e, boolean z10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: sink");
            return null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return abstractC5795a.sink(c5799e, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [a9.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX INFO: renamed from: -read, reason: not valid java name */
    public final <T> T m39023read(C5799e c5799e, InterfaceC0184l interfaceC0184l) throws IllegalAccessException, InvocationTargetException {
        ?? r52;
        c5799e.getClass();
        interfaceC0184l.getClass();
        InterfaceC9999k interfaceC9999kM38648c = AbstractC9988e0.m38648c(source(c5799e));
        T t10 = null;
        try {
            Object objMo27m = interfaceC0184l.mo27m(interfaceC9999kM38648c);
            AbstractC1057r.m3834b(1);
            if (interfaceC9999kM38648c != null) {
                try {
                    interfaceC9999kM38648c.close();
                } catch (Throwable 
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                    	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
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
                    r4.getClass()
                    r5.getClass()
                    zd.w0 r4 = r3.source(r4)
                    zd.k r4 = p376zd.AbstractC9988e0.m38648c(r4)
                    r0 = 1
                    r1 = 0
                    java.lang.Object r5 = r5.mo27m(r4)     // Catch: java.lang.Throwable -> L25
                    p024b9.AbstractC1057r.m3834b(r0)
                    if (r4 == 0) goto L1e
                    r4.close()     // Catch: java.lang.Throwable -> L1d
                    goto L1e
                L1d:
                    r1 = move-exception
                L1e:
                    p024b9.AbstractC1057r.m3833a(r0)
                    r2 = r1
                    r1 = r5
                    r5 = r2
                    goto L36
                L25:
                    r5 = move-exception
                    p024b9.AbstractC1057r.m3834b(r0)
                    if (r4 == 0) goto L33
                    r4.close()     // Catch: java.lang.Throwable -> L2f
                    goto L33
                L2f:
                    r4 = move-exception
                    p172l8.AbstractC4693f.m18753a(r5, r4)
                L33:
                    p024b9.AbstractC1057r.m3833a(r0)
                L36:
                    if (r5 != 0) goto L39
                    return r1
                L39:
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: okio.AbstractC5795a.m39023read(okio.e, a9.l):java.lang.Object");
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0, types: [a9.l, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r5v4 */
            /* JADX WARN: Type inference failed for: r5v5 */
            /* JADX INFO: renamed from: -write, reason: not valid java name */
            public final <T> T m39024write(C5799e c5799e, boolean z10, InterfaceC0184l interfaceC0184l) throws IllegalAccessException, InvocationTargetException {
                ?? r52;
                c5799e.getClass();
                interfaceC0184l.getClass();
                InterfaceC9997j interfaceC9997jM38647b = AbstractC9988e0.m38647b(sink(c5799e, z10));
                T t10 = null;
                try {
                    Object objMo27m = interfaceC0184l.mo27m(interfaceC9997jM38647b);
                    AbstractC1057r.m3834b(1);
                    if (interfaceC9997jM38647b != null) {
                        try {
                            interfaceC9997jM38647b.close();
                        } catch (Throwable 
                        /*  JADX ERROR: Method code generation error
                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                            	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
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
                            r3.getClass()
                            r5.getClass()
                            zd.u0 r3 = r2.sink(r3, r4)
                            zd.j r3 = p376zd.AbstractC9988e0.m38647b(r3)
                            r4 = 1
                            r0 = 0
                            java.lang.Object r5 = r5.mo27m(r3)     // Catch: java.lang.Throwable -> L25
                            p024b9.AbstractC1057r.m3834b(r4)
                            if (r3 == 0) goto L1e
                            r3.close()     // Catch: java.lang.Throwable -> L1d
                            goto L1e
                        L1d:
                            r0 = move-exception
                        L1e:
                            p024b9.AbstractC1057r.m3833a(r4)
                            r1 = r0
                            r0 = r5
                            r5 = r1
                            goto L36
                        L25:
                            r5 = move-exception
                            p024b9.AbstractC1057r.m3834b(r4)
                            if (r3 == 0) goto L33
                            r3.close()     // Catch: java.lang.Throwable -> L2f
                            goto L33
                        L2f:
                            r3 = move-exception
                            p172l8.AbstractC4693f.m18753a(r5, r3)
                        L33:
                            p024b9.AbstractC1057r.m3833a(r4)
                        L36:
                            if (r5 != 0) goto L39
                            return r0
                        L39:
                            throw r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: okio.AbstractC5795a.m39024write(okio.e, boolean, a9.l):java.lang.Object");
                    }

                    public final InterfaceC10020u0 appendingSink(C5799e c5799e) {
                        c5799e.getClass();
                        return appendingSink(c5799e, false);
                    }

                    public abstract InterfaceC10020u0 appendingSink(C5799e c5799e, boolean z10);

                    public abstract void atomicMove(C5799e c5799e, C5799e c5799e2);

                    public abstract C5799e canonicalize(C5799e c5799e);

                    public void copy(C5799e c5799e, C5799e c5799e2) {
                        c5799e.getClass();
                        c5799e2.getClass();
                        AbstractC0305d.m913b(this, c5799e, c5799e2);
                    }

                    public final void createDirectories(C5799e c5799e) {
                        c5799e.getClass();
                        createDirectories(c5799e, false);
                    }

                    public final void createDirectory(C5799e c5799e) {
                        c5799e.getClass();
                        createDirectory(c5799e, false);
                    }

                    public abstract void createDirectory(C5799e c5799e, boolean z10);

                    public abstract void createSymlink(C5799e c5799e, C5799e c5799e2);

                    public final void delete(C5799e c5799e) {
                        c5799e.getClass();
                        delete(c5799e, false);
                    }

                    public abstract void delete(C5799e c5799e, boolean z10);

                    public final void deleteRecursively(C5799e c5799e) {
                        c5799e.getClass();
                        deleteRecursively(c5799e, false);
                    }

                    public final boolean exists(C5799e c5799e) {
                        c5799e.getClass();
                        return AbstractC0305d.m916e(this, c5799e);
                    }

                    public abstract List list(C5799e c5799e);

                    public abstract List listOrNull(C5799e c5799e);

                    public final InterfaceC7282h listRecursively(C5799e c5799e) {
                        c5799e.getClass();
                        return listRecursively(c5799e, false);
                    }

                    public final C10009p metadata(C5799e c5799e) {
                        c5799e.getClass();
                        return AbstractC0305d.m918g(this, c5799e);
                    }

                    public abstract C10009p metadataOrNull(C5799e c5799e);

                    public abstract AbstractC10007o openReadOnly(C5799e c5799e);

                    public final AbstractC10007o openReadWrite(C5799e c5799e) {
                        c5799e.getClass();
                        return openReadWrite(c5799e, false, false);
                    }

                    public abstract AbstractC10007o openReadWrite(C5799e c5799e, boolean z10, boolean z11);

                    public final InterfaceC10020u0 sink(C5799e c5799e) {
                        c5799e.getClass();
                        return sink(c5799e, false);
                    }

                    public abstract InterfaceC10020u0 sink(C5799e c5799e, boolean z10);

                    public abstract InterfaceC10024w0 source(C5799e c5799e);

                    /* JADX INFO: renamed from: okio.a$a */
                    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
                    public static final class a {
                        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
                            this();
                        }

                        /* JADX INFO: renamed from: a */
                        public final AbstractC5795a m23287a(FileSystem fileSystem) {
                            fileSystem.getClass();
                            return new C5797c(fileSystem);
                        }

                        public a() {
                        }
                    }

                    public final void createDirectories(C5799e c5799e, boolean z10) {
                        c5799e.getClass();
                        AbstractC0305d.m914c(this, c5799e, z10);
                    }

                    public void deleteRecursively(C5799e c5799e, boolean z10) {
                        c5799e.getClass();
                        AbstractC0305d.m915d(this, c5799e, z10);
                    }

                    public InterfaceC7282h listRecursively(C5799e c5799e, boolean z10) {
                        c5799e.getClass();
                        return AbstractC0305d.m917f(this, c5799e, z10);
                    }

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
                    }
                }
