.class public Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback;
.super Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WithCallback"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final DISPATCHER:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory;


# instance fields
.field private final callback:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Callback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Callback<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$CreationAction;->INSTANCE:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory$CreationAction;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation;->access$100(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory;

    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback;->DISPATCHER:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Callback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;",
            "Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Callback<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation;-><init>(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback;->callback:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Callback;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic access$000()Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback;->DISPATCHER:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback$Factory;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public doTransform(Ljava/lang/Object;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B
    .locals 0
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
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
            "Ljava/lang/Object;",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/security/ProtectionDomain;",
            "[B)[B"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    if-ne p0, p1, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    if-nez p1, :cond_2

    .line 14
    .line 15
    return v1

    .line 16
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eq v2, v3, :cond_3

    .line 25
    .line 26
    return v1

    .line 27
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback;->callback:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Callback;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback;

    .line 30
    .line 31
    iget-object p1, p1, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback;->callback:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Callback;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback;->callback:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Callback;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-int/2addr p0, v0

    .line 14
    return p0
.end method

.method public transform(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B
    .locals 10
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

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback;->callback:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Callback;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move-object v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    move-object v6, p5

    .line 9
    invoke-interface/range {v0 .. v6}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Callback;->onBeforeTransform(Lnet/bytebuddy/utility/JavaModule;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    move-object v7, v4

    .line 14
    move-object v8, v5

    .line 15
    move-object v9, v6

    .line 16
    move-object v5, v2

    .line 17
    move-object v6, v3

    .line 18
    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    .line 20
    move-object v1, v5

    .line 21
    move-object v2, v6

    .line 22
    move-object v3, v7

    .line 23
    move-object v4, v8

    .line 24
    move-object v5, v9

    .line 25
    :try_start_1
    invoke-interface/range {v0 .. v5}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;->transform(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B

    .line 26
    .line 27
    .line 28
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    move-object v6, v2

    .line 30
    move-object v7, v3

    .line 31
    move-object v8, v4

    .line 32
    move-object v9, v5

    .line 33
    move-object v5, v1

    .line 34
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback;->callback:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Callback;

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    move-object v3, p1

    .line 38
    invoke-interface/range {v2 .. v9}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Callback;->onAfterTransform(Ljava/lang/Object;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)V

    .line 39
    .line 40
    .line 41
    return-object p2

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    move-object v6, v2

    .line 44
    move-object v7, v3

    .line 45
    move-object v8, v4

    .line 46
    move-object v9, v5

    .line 47
    move-object v5, v1

    .line 48
    :goto_0
    move-object v3, p1

    .line 49
    move-object p1, v0

    .line 50
    goto :goto_1

    .line 51
    :catchall_1
    move-exception v0

    .line 52
    goto :goto_0

    .line 53
    :goto_1
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback;->callback:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Callback;

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-interface/range {v2 .. v9}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Callback;->onAfterTransform(Ljava/lang/Object;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)V

    .line 57
    .line 58
    .line 59
    throw p1
.end method

.method public transform(Ljava/lang/Object;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B
    .locals 9
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
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
            "Ljava/lang/Object;",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/security/ProtectionDomain;",
            "[B)[B"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 60
    invoke-static {p1}, Lnet/bytebuddy/utility/JavaModule;->of(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaModule;

    move-result-object v2

    .line 61
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback;->callback:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Callback;

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object v1, v2

    move-object v2, p2

    invoke-interface/range {v0 .. v6}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Callback;->onBeforeTransform(Lnet/bytebuddy/utility/JavaModule;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)Ljava/lang/Object;

    move-result-object p2

    move-object v7, v5

    move-object v8, v6

    move-object v5, v3

    move-object v6, v4

    move-object v3, p1

    move-object v4, v2

    move-object v2, p0

    .line 62
    :try_start_0
    invoke-virtual/range {v2 .. v8}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback;->doTransform(Ljava/lang/Object;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    .line 63
    iget-object v0, v2, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback;->callback:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Callback;

    move-object v2, v1

    move-object v1, p2

    invoke-interface/range {v0 .. v7}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Callback;->onAfterTransform(Ljava/lang/Object;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)V

    return-object p0

    :catchall_0
    move-exception v0

    move-object p0, p2

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object p1, v0

    iget-object v0, v2, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$WithCallback;->callback:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Callback;

    move-object v2, v1

    move-object v1, p0

    invoke-interface/range {v0 .. v7}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$WithDelegation$Callback;->onAfterTransform(Ljava/lang/Object;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)V

    .line 64
    throw p1
.end method
