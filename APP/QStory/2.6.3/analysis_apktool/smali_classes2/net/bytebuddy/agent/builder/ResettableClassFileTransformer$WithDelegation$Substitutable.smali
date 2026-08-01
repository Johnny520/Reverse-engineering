.class public Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;
.super Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$AbstractBase;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
.field private static final DISPATCHER:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable$Factory;


# instance fields
.field protected volatile classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$CreationAction;->INSTANCE:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$CreationAction;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation;->access$100(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable$Factory;

    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->DISPATCHER:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable$Factory;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    .line 5
    .line 6
    return-void
.end method

.method public static of(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->DISPATCHER:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable$Factory;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable$Factory;->make(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public iterator(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/Class;Ljava/security/ProtectionDomain;)Ljava/util/Iterator;
    .locals 0
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
    .param p5    # Ljava/security/ProtectionDomain;
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

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    .line 2
    .line 3
    invoke-interface/range {p0 .. p5}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;->iterator(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/Class;Ljava/security/ProtectionDomain;)Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public reset(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    .line 2
    .line 3
    invoke-interface/range {p0 .. p6}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;->reset(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public substitute(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)V
    .locals 1

    .line 1
    :goto_0
    instance-of v0, p1, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;

    .line 6
    .line 7
    invoke-interface {p1}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;->unwrap()Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    .line 13
    .line 14
    return-void
.end method

.method public transform(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B
    .locals 0
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Ljava/security/ProtectionDomain;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
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

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    .line 2
    .line 3
    invoke-interface/range {p0 .. p5}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;->transform(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public unwrap()Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Substitutable;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    .line 2
    .line 3
    return-object p0
.end method
