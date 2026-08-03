.class public Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;
.super Ljava/lang/ClassLoader;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DynamicClassLoader"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver;
    }
.end annotation


# static fields
.field private static final DUMP_FOLDER:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private static final NO_ARGUMENT:[Ljava/lang/Object;

.field private static final NO_PARAMETER:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Class;

    sput-object v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;->NO_PARAMETER:[Ljava/lang/Class;

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;->NO_ARGUMENT:[Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;

    const-string v1, "net.bytebuddy.dump"

    invoke-direct {v0, v1}, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->access$200(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v0, 0x0

    :goto_0
    sput-object v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;->DUMP_FOLDER:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/ClassLoader;-><init>(Ljava/lang/ClassLoader;)V

    invoke-static {}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->access$300()Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver;->accept(Ljava/lang/ClassLoader;Ljava/lang/Class;)V

    return-void
.end method

.method public static invoker()Lnet/bytebuddy/utility/Invoker;
    .locals 22
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "Expected internal invocation."
        value = {
            "REC_CATCH_EXCEPTION",
            "DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED"
        }
    .end annotation

    new-instance v0, Lnet/bytebuddy/jar/asm/ClassWriter;

    const/4 v8, 0x0

    invoke-direct {v0, v8}, Lnet/bytebuddy/jar/asm/ClassWriter;-><init>(I)V

    sget-object v1, Lnet/bytebuddy/ClassFileVersion;->JAVA_V5:Lnet/bytebuddy/ClassFileVersion;

    invoke-static {v1}, Lnet/bytebuddy/ClassFileVersion;->ofThisVm(Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/ClassFileVersion;

    move-result-object v1

    invoke-virtual {v1}, Lnet/bytebuddy/ClassFileVersion;->getMinorMajorVersion()I

    move-result v2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-class v9, Lnet/bytebuddy/utility/Invoker;

    invoke-static {v9}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "$Dispatcher"

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-class v11, Ljava/lang/Object;

    invoke-static {v11}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v9}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v7

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object v1, v0

    invoke-virtual/range {v1 .. v7}, Lnet/bytebuddy/jar/asm/ClassWriter;->visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    invoke-static {}, Lnet/bytebuddy/utility/GraalImageCode;->getCurrent()Lnet/bytebuddy/utility/GraalImageCode;

    move-result-object v1

    invoke-virtual {v9}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v2

    sget-object v3, Lnet/bytebuddy/utility/MethodComparator;->INSTANCE:Lnet/bytebuddy/utility/MethodComparator;

    invoke-virtual {v1, v2, v3}, Lnet/bytebuddy/utility/GraalImageCode;->sorted([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, [Ljava/lang/reflect/Method;

    array-length v12, v7

    move v13, v8

    :goto_0
    const/4 v14, 0x1

    if-ge v13, v12, :cond_3

    aget-object v15, v7, v13

    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getExceptionTypes()[Ljava/lang/Class;

    move-result-object v1

    array-length v2, v1

    new-array v6, v2, [Ljava/lang/String;

    move v2, v8

    :goto_1
    array-length v3, v1

    if-ge v2, v3, :cond_0

    aget-object v3, v1, v2

    invoke-static {v3}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v6, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_0
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v15}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v2, 0x1

    move-object v1, v0

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;

    move-result-object v1

    invoke-virtual {v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitCode()V

    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    array-length v2, v2

    sub-int/2addr v2, v14

    new-array v2, v2, [Lnet/bytebuddy/jar/asm/Type;

    move v3, v8

    :goto_2
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    array-length v4, v4

    if-ge v3, v4, :cond_2

    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    aget-object v4, v4, v3

    invoke-static {v4}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v4

    if-lez v3, :cond_1

    add-int/lit8 v5, v3, -0x1

    aput-object v4, v2, v5

    :cond_1
    const/16 v5, 0x15

    invoke-virtual {v4, v5}, Lnet/bytebuddy/jar/asm/Type;->getOpcode(I)I

    move-result v5

    invoke-virtual {v1, v5, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v4}, Lnet/bytebuddy/jar/asm/Type;->getSize()I

    move-result v4

    add-int/2addr v14, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    aget-object v3, v3, v8

    invoke-static {v3}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v19

    invoke-static {v15}, Lnet/bytebuddy/jar/asm/Type;->getReturnType(Ljava/lang/reflect/Method;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v3

    invoke-static {v3, v2}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    move-result-object v20

    const/16 v21, 0x0

    const/16 v17, 0xb6

    move-object/from16 v16, v1

    invoke-virtual/range {v16 .. v21}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {v15}, Lnet/bytebuddy/jar/asm/Type;->getReturnType(Ljava/lang/reflect/Method;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    const/16 v3, 0xac

    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/Type;->getOpcode(I)I

    move-result v2

    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    add-int/lit8 v2, v14, -0x1

    invoke-static {v15}, Lnet/bytebuddy/jar/asm/Type;->getReturnType(Ljava/lang/reflect/Method;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v3

    invoke-virtual {v3}, Lnet/bytebuddy/jar/asm/Type;->getSize()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v1, v2, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMaxs(II)V

    invoke-virtual {v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitEnd()V

    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_0

    :cond_3
    sget-object v7, Lnet/bytebuddy/jar/asm/Type;->VOID_TYPE:Lnet/bytebuddy/jar/asm/Type;

    new-array v1, v8, [Lnet/bytebuddy/jar/asm/Type;

    invoke-static {v7, v1}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x1

    const-string v3, "<init>"

    move-object v1, v0

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;

    move-result-object v1

    invoke-virtual {v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitCode()V

    const/16 v2, 0x19

    invoke-virtual {v1, v2, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-static {v11}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v17

    new-array v2, v8, [Lnet/bytebuddy/jar/asm/Type;

    invoke-static {v7, v2}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    move-result-object v19

    const/16 v20, 0x0

    const/16 v16, 0xb7

    const-string v18, "<init>"

    move-object v15, v1

    invoke-virtual/range {v15 .. v20}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v2, 0xb1

    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v1, v14, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMaxs(II)V

    invoke-virtual {v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitEnd()V

    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/ClassWriter;->visitEnd()V

    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/ClassWriter;->toByteArray()[B

    move-result-object v5

    :try_start_0
    const-string v0, "net.bytebuddy.dump"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v1, Ljava/io/FileOutputStream;

    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "$Dispatcher.class"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v1, v5}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    :cond_4
    :goto_3
    :try_start_3
    new-instance v3, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;

    invoke-direct {v3, v9}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;-><init>(Ljava/lang/Class;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    array-length v7, v5

    const-class v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;

    invoke-virtual {v0}, Ljava/lang/Class;->getProtectionDomain()Ljava/security/ProtectionDomain;

    move-result-object v8

    const/4 v6, 0x0

    invoke-virtual/range {v3 .. v8}, Ljava/lang/ClassLoader;->defineClass(Ljava/lang/String;[BIILjava/security/ProtectionDomain;)Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;->NO_PARAMETER:[Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    sget-object v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;->NO_ARGUMENT:[Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/utility/Invoker;
    :try_end_3
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to create invoker for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    new-instance v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DirectInvoker;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DirectInvoker;-><init>(Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$1;)V

    return-object v0
.end method

.method public static proxy(Ljava/lang/Class;Ljava/util/Map;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Method;",
            "Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "Expected internal invocation."
        value = {
            "REC_CATCH_EXCEPTION",
            "DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED"
        }
    .end annotation

    new-instance v0, Lnet/bytebuddy/jar/asm/ClassWriter;

    const/4 v8, 0x0

    invoke-direct {v0, v8}, Lnet/bytebuddy/jar/asm/ClassWriter;-><init>(I)V

    sget-object v1, Lnet/bytebuddy/ClassFileVersion;->JAVA_V5:Lnet/bytebuddy/ClassFileVersion;

    invoke-static {v1}, Lnet/bytebuddy/ClassFileVersion;->ofThisVm(Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/ClassFileVersion;

    move-result-object v1

    invoke-virtual {v1}, Lnet/bytebuddy/ClassFileVersion;->getMinorMajorVersion()I

    move-result v2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static/range {p0 .. p0}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "$Proxy"

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-class v10, Ljava/lang/Object;

    invoke-static {v10}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v6

    invoke-static/range {p0 .. p0}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v7

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object v1, v0

    invoke-virtual/range {v1 .. v7}, Lnet/bytebuddy/jar/asm/ClassWriter;->visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    invoke-interface/range {p1 .. p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v11, 0x1

    if-eqz v1, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Ljava/util/Map$Entry;

    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getExceptionTypes()[Ljava/lang/Class;

    move-result-object v1

    array-length v2, v1

    new-array v6, v2, [Ljava/lang/String;

    move v2, v8

    :goto_1
    array-length v3, v1

    if-ge v2, v3, :cond_0

    aget-object v3, v1, v2

    invoke-static {v3}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v6, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_0
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Method;

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v2, 0x1

    move-object v1, v0

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;

    move-result-object v1

    invoke-virtual {v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitCode()V

    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Method;

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v2

    and-int/lit8 v2, v2, 0x8

    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    move v11, v8

    :goto_2
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Method;

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    array-length v3, v2

    move v4, v8

    :goto_3
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    invoke-static {v5}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v5

    invoke-virtual {v5}, Lnet/bytebuddy/jar/asm/Type;->getSize()I

    move-result v5

    add-int/2addr v11, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_2
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher;

    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Method;

    invoke-interface {v2, v1, v3}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/lang/reflect/Method;)I

    move-result v2

    invoke-virtual {v1, v2, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMaxs(II)V

    invoke-virtual {v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitEnd()V

    goto/16 :goto_0

    :cond_3
    sget-object v7, Lnet/bytebuddy/jar/asm/Type;->VOID_TYPE:Lnet/bytebuddy/jar/asm/Type;

    new-array v1, v8, [Lnet/bytebuddy/jar/asm/Type;

    invoke-static {v7, v1}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x1

    const-string v3, "<init>"

    move-object v1, v0

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;

    move-result-object v1

    invoke-virtual {v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitCode()V

    const/16 v2, 0x19

    invoke-virtual {v1, v2, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-static {v10}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v14

    new-array v2, v8, [Lnet/bytebuddy/jar/asm/Type;

    invoke-static {v7, v2}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    move-result-object v16

    const/16 v17, 0x0

    const/16 v13, 0xb7

    const-string v15, "<init>"

    move-object v12, v1

    invoke-virtual/range {v12 .. v17}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v2, 0xb1

    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v1, v11, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMaxs(II)V

    invoke-virtual {v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitEnd()V

    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/ClassWriter;->visitEnd()V

    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/ClassWriter;->toByteArray()[B

    move-result-object v5

    sget-object v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;->DUMP_FOLDER:Ljava/lang/String;

    if-eqz v0, :cond_4

    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "$Proxy.class"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v1, v5}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    :cond_4
    :goto_4
    :try_start_3
    new-instance v3, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    move-object/from16 v1, p0

    :try_start_4
    invoke-direct {v3, v1}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;-><init>(Ljava/lang/Class;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    array-length v7, v5

    const-class v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;

    invoke-virtual {v0}, Ljava/lang/Class;->getProtectionDomain()Ljava/security/ProtectionDomain;

    move-result-object v8

    const/4 v6, 0x0

    invoke-virtual/range {v3 .. v8}, Ljava/lang/ClassLoader;->defineClass(Ljava/lang/String;[BIILjava/security/ProtectionDomain;)Ljava/lang/Class;

    move-result-object v0

    sget-object v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;->NO_PARAMETER:[Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    sget-object v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;->NO_ARGUMENT:[Ljava/lang/Object;

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_5

    :catch_1
    move-exception v0

    move-object/from16 v1, p0

    :goto_5
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to create proxy for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method
