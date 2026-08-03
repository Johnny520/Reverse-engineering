.class public Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;
.super Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$AbstractBase;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Substitutable"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable$Factory;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field private static final DISPATCHER:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable$Factory;


# instance fields
.field protected volatile classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "java.security.AccessController"

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    const-string v1, "net.bytebuddy.securitymanager"

    const-string v2, "true"

    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v1

    sput-boolean v1, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x1

    :catch_1
    sput-boolean v0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->ACCESS_CONTROLLER:Z

    :goto_0
    sget-object v0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$CreationAction;->INSTANCE:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$CreationAction;

    invoke-static {v0}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable$Factory;

    sput-object v0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->DISPATCHER:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable$Factory;

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)V
    .locals 0

    invoke-direct {p0}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$AbstractBase;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    return-void
.end method

.method private static doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/security/PrivilegedAction<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/AccessControllerPlugin$Enhance;
    .end annotation

    sget-boolean v0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->ACCESS_CONTROLLER:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/security/PrivilegedAction;->run()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static of(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;
    .locals 1

    sget-object v0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->DISPATCHER:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable$Factory;

    invoke-interface {v0, p0}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable$Factory;->make(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    check-cast p1, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;

    iget-object p1, p1, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public iterator(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/Class;Ljava/security/ProtectionDomain;)Ljava/util/Iterator;
    .locals 6
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Lnet/bytebuddy/utility/JavaModule;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/lang/ClassLoader;",
            "Lnet/bytebuddy/utility/JavaModule;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/security/ProtectionDomain;",
            ")",
            "Ljava/util/Iterator<",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;->iterator(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/Class;Ljava/security/ProtectionDomain;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public reset(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;)Z
    .locals 7

    iget-object v0, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;->reset(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;)Z

    move-result p1

    return p1
.end method

.method public substitute(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)V
    .locals 1

    :goto_0
    instance-of v0, p1, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;

    if-eqz v0, :cond_0

    check-cast p1, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;

    invoke-interface {p1}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;->unwrap()Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    move-result-object p1

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    return-void
.end method

.method public transform(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/security/ProtectionDomain;",
            "[B)[B"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/instrument/IllegalClassFormatException;
        }
    .end annotation

    iget-object v0, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;->transform(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B

    move-result-object p1

    return-object p1
.end method

.method public unwrap()Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
    .locals 1

    iget-object v0, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    return-object v0
.end method
