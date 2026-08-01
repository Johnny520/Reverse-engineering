.class public Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForAdvice"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$LazyDynamicType;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$Entry;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final advice:Lnet/bytebuddy/asm/Advice$WithCustomMapping;

.field private final assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

.field private final auxiliaries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

.field private final entries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$Entry;",
            ">;"
        }
    .end annotation
.end field

.field private final exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

.field private final locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

.field private final poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-static {}, Lnet/bytebuddy/asm/Advice;->withCustomMapping()Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;-><init>(Lnet/bytebuddy/asm/Advice$WithCustomMapping;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/asm/Advice$WithCustomMapping;)V
    .locals 9

    .line 21
    sget-object v2, Lnet/bytebuddy/asm/Advice$ExceptionHandler$Default;->SUPPRESSING:Lnet/bytebuddy/asm/Advice$ExceptionHandler$Default;

    sget-object v3, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    sget-object v4, Lnet/bytebuddy/dynamic/ClassFileLocator$NoOp;->INSTANCE:Lnet/bytebuddy/dynamic/ClassFileLocator$NoOp;

    sget-object v5, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$Default;->FAST:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$Default;

    sget-object v6, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;->STRONG:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;

    .line 22
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    move-object v8, v7

    move-object v0, p0

    move-object v1, p1

    .line 23
    invoke-direct/range {v0 .. v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;-><init>(Lnet/bytebuddy/asm/Advice$WithCustomMapping;Lnet/bytebuddy/asm/Advice$ExceptionHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/asm/Advice$WithCustomMapping;Lnet/bytebuddy/asm/Advice$ExceptionHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;",
            "Lnet/bytebuddy/asm/Advice$ExceptionHandler;",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$Entry;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->advice:Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    .line 13
    .line 14
    iput-object p6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    .line 15
    .line 16
    iput-object p7, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->entries:Ljava/util/List;

    .line 17
    .line 18
    iput-object p8, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->auxiliaries:Ljava/util/List;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public advice(Lnet/bytebuddy/matcher/ElementMatcher;Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;"
        }
    .end annotation

    .line 32
    new-instance v0, Lnet/bytebuddy/matcher/LatentMatcher$Resolved;

    invoke-direct {v0, p1}, Lnet/bytebuddy/matcher/LatentMatcher$Resolved;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    invoke-virtual {p0, v0, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->advice(Lnet/bytebuddy/matcher/LatentMatcher;Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;

    move-result-object p0

    return-object p0
.end method

.method public advice(Lnet/bytebuddy/matcher/ElementMatcher;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;"
        }
    .end annotation

    .line 33
    new-instance v0, Lnet/bytebuddy/matcher/LatentMatcher$Resolved;

    invoke-direct {v0, p1}, Lnet/bytebuddy/matcher/LatentMatcher$Resolved;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    invoke-virtual {p0, v0, p2, p3}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->advice(Lnet/bytebuddy/matcher/LatentMatcher;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;

    move-result-object p0

    return-object p0
.end method

.method public advice(Lnet/bytebuddy/matcher/LatentMatcher;Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/LatentMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;"
        }
    .end annotation

    .line 1
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->advice:Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    .line 2
    .line 3
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

    .line 4
    .line 5
    iget-object v3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 6
    .line 7
    iget-object v4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 8
    .line 9
    iget-object v5, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    .line 10
    .line 11
    iget-object v6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    .line 12
    .line 13
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->entries:Ljava/util/List;

    .line 14
    .line 15
    new-instance v7, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$Entry$ForUnifiedAdvice;

    .line 16
    .line 17
    invoke-direct {v7, p1, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$Entry$ForUnifiedAdvice;-><init>(Lnet/bytebuddy/matcher/LatentMatcher;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v7}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v7

    .line 24
    iget-object v8, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->auxiliaries:Ljava/util/List;

    .line 25
    .line 26
    move-object v0, p0

    .line 27
    invoke-virtual/range {v0 .. v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->make(Lnet/bytebuddy/asm/Advice$WithCustomMapping;Lnet/bytebuddy/asm/Advice$ExceptionHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Ljava/util/List;Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public advice(Lnet/bytebuddy/matcher/LatentMatcher;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/LatentMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;"
        }
    .end annotation

    .line 34
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->advice:Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

    iget-object v3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v5, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->entries:Ljava/util/List;

    new-instance v7, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$Entry$ForSplitAdvice;

    invoke-direct {v7, p1, p2, p3}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$Entry$ForSplitAdvice;-><init>(Lnet/bytebuddy/matcher/LatentMatcher;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    invoke-static {v0, v7}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    iget-object v8, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->auxiliaries:Ljava/util/List;

    move-object v0, p0

    .line 36
    invoke-virtual/range {v0 .. v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->make(Lnet/bytebuddy/asm/Advice$WithCustomMapping;Lnet/bytebuddy/asm/Advice$ExceptionHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Ljava/util/List;Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;

    move-result-object p0

    return-object p0
.end method

.method public auxiliary(Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;"
        }
    .end annotation

    .line 1
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->advice:Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    .line 2
    .line 3
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

    .line 4
    .line 5
    iget-object v3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 6
    .line 7
    iget-object v4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 8
    .line 9
    iget-object v5, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    .line 10
    .line 11
    iget-object v6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    .line 12
    .line 13
    iget-object v7, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->entries:Ljava/util/List;

    .line 14
    .line 15
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->auxiliaries:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v0, p1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v8

    .line 21
    move-object v0, p0

    .line 22
    invoke-virtual/range {v0 .. v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->make(Lnet/bytebuddy/asm/Advice$WithCustomMapping;Lnet/bytebuddy/asm/Advice$ExceptionHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Ljava/util/List;Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public varargs auxiliary([Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;
    .locals 0

    .line 27
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->auxiliary(Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;

    move-result-object p0

    return-object p0
.end method

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
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->advice:Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->advice:Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 56
    .line 57
    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_6

    .line 64
    .line 65
    return v1

    .line 66
    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    .line 67
    .line 68
    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_7

    .line 75
    .line 76
    return v1

    .line 77
    :cond_7
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    .line 78
    .line 79
    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-nez v2, :cond_8

    .line 86
    .line 87
    return v1

    .line 88
    :cond_8
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->entries:Ljava/util/List;

    .line 89
    .line 90
    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->entries:Ljava/util/List;

    .line 91
    .line 92
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_9

    .line 97
    .line 98
    return v1

    .line 99
    :cond_9
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->auxiliaries:Ljava/util/List;

    .line 100
    .line 101
    iget-object p1, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->auxiliaries:Ljava/util/List;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-nez p0, :cond_a

    .line 108
    .line 109
    return v1

    .line 110
    :cond_a
    return v0
.end method

.method public hashCode()I
    .locals 3

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
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->advice:Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    .line 13
    .line 14
    invoke-virtual {v2}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/2addr v2, v0

    .line 19
    mul-int/2addr v2, v1

    .line 20
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v2

    .line 27
    mul-int/2addr v0, v1

    .line 28
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    add-int/2addr v0, v2

    .line 49
    mul-int/2addr v0, v1

    .line 50
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    add-int/2addr v2, v0

    .line 57
    mul-int/2addr v2, v1

    .line 58
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->entries:Ljava/util/List;

    .line 59
    .line 60
    invoke-static {v0, v2, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->auxiliaries:Ljava/util/List;

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    add-int/2addr p0, v0

    .line 71
    return p0
.end method

.method public include(Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;"
        }
    .end annotation

    .line 33
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->advice:Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

    iget-object v3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    new-instance v4, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;

    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 34
    invoke-static {v0, p1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v4, p1}, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;-><init>(Ljava/util/List;)V

    iget-object v5, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v7, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->entries:Ljava/util/List;

    iget-object v8, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->auxiliaries:Ljava/util/List;

    move-object v0, p0

    .line 35
    invoke-virtual/range {v0 .. v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->make(Lnet/bytebuddy/asm/Advice$WithCustomMapping;Lnet/bytebuddy/asm/Advice$ExceptionHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Ljava/util/List;Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;

    move-result-object p0

    return-object p0
.end method

.method public varargs include([Ljava/lang/ClassLoader;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_0

    .line 9
    .line 10
    aget-object v3, p1, v2

    .line 11
    .line 12
    invoke-static {v3}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->include(Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public varargs include([Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;
    .locals 0

    .line 32
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->include(Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;

    move-result-object p0

    return-object p0
.end method

.method public make(Lnet/bytebuddy/asm/Advice$WithCustomMapping;Lnet/bytebuddy/asm/Advice$ExceptionHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Ljava/util/List;Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/asm/Advice$WithCustomMapping;",
            "Lnet/bytebuddy/asm/Advice$ExceptionHandler;",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$Entry;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;"
        }
    .end annotation

    .line 1
    new-instance p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;

    .line 2
    .line 3
    invoke-direct/range {p0 .. p8}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;-><init>(Lnet/bytebuddy/asm/Advice$WithCustomMapping;Lnet/bytebuddy/asm/Advice$ExceptionHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Ljava/util/List;Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public transform(Lnet/bytebuddy/dynamic/DynamicType$Builder;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/security/ProtectionDomain;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 13
    .param p3    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Lnet/bytebuddy/utility/JavaModule;
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
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/lang/ClassLoader;",
            "Lnet/bytebuddy/utility/JavaModule;",
            "Ljava/security/ProtectionDomain;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    .line 1
    move-object/from16 v2, p3

    .line 2
    .line 3
    new-instance v6, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;

    .line 4
    .line 5
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 6
    .line 7
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    .line 8
    .line 9
    move-object/from16 v3, p4

    .line 10
    .line 11
    invoke-interface {v1, v2, v3}, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;->classFileLocator(Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v4, 0x2

    .line 16
    new-array v4, v4, [Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    aput-object v0, v4, v7

    .line 20
    .line 21
    const/4 v8, 0x1

    .line 22
    aput-object v1, v4, v8

    .line 23
    .line 24
    invoke-direct {v6, v4}, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;-><init>([Lnet/bytebuddy/dynamic/ClassFileLocator;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    .line 28
    .line 29
    invoke-interface {v0, v6, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;->typePool(Lnet/bytebuddy/dynamic/ClassFileLocator;Ljava/lang/ClassLoader;)Lnet/bytebuddy/pool/TypePool;

    .line 30
    .line 31
    .line 32
    move-result-object v9

    .line 33
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->auxiliaries:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ljava/lang/String;

    .line 50
    .line 51
    new-instance v4, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$LazyDynamicType;

    .line 52
    .line 53
    invoke-interface {v9, v1}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v1}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-direct {v4, v1, v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$LazyDynamicType;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)V

    .line 62
    .line 63
    .line 64
    new-array v1, v8, [Lnet/bytebuddy/dynamic/DynamicType;

    .line 65
    .line 66
    aput-object v4, v1, v7

    .line 67
    .line 68
    invoke-interface {p1, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->require([Lnet/bytebuddy/dynamic/DynamicType;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    new-instance v0, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;

    .line 74
    .line 75
    invoke-direct {v0}, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;-><init>()V

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->entries:Ljava/util/List;

    .line 79
    .line 80
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    move-object v11, v0

    .line 85
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_1

    .line 90
    .line 91
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$Entry;

    .line 96
    .line 97
    invoke-virtual {v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$Entry;->getMatcher()Lnet/bytebuddy/matcher/LatentMatcher;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-interface {v1, p2}, Lnet/bytebuddy/matcher/LatentMatcher;->resolve(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher;

    .line 102
    .line 103
    .line 104
    move-result-object v12

    .line 105
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->advice:Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    .line 106
    .line 107
    invoke-virtual {v0, v1, v9, v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$Entry;->resolve(Lnet/bytebuddy/asm/Advice$WithCustomMapping;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/asm/Advice;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Lnet/bytebuddy/asm/Advice;->withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)Lnet/bytebuddy/asm/Advice;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Lnet/bytebuddy/asm/Advice;->withExceptionHandler(Lnet/bytebuddy/asm/Advice$ExceptionHandler;)Lnet/bytebuddy/asm/Advice;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    move-object v0, p0

    .line 124
    move-object v1, p2

    .line 125
    move-object/from16 v4, p5

    .line 126
    .line 127
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->wrap(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/security/ProtectionDomain;Lnet/bytebuddy/asm/Advice;)Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    new-array v0, v8, [Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper;

    .line 132
    .line 133
    aput-object v5, v0, v7

    .line 134
    .line 135
    invoke-virtual {v11, v12, v0}, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;->invokable(Lnet/bytebuddy/matcher/ElementMatcher;[Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper;)Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;

    .line 136
    .line 137
    .line 138
    move-result-object v11

    .line 139
    move-object/from16 v2, p3

    .line 140
    .line 141
    move-object/from16 v3, p4

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_1
    invoke-interface {p1, v11}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->visit(Lnet/bytebuddy/asm/AsmVisitorWrapper;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;
    .locals 9

    .line 22
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->advice:Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

    iget-object v3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v5, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v7, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->entries:Ljava/util/List;

    iget-object v8, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->auxiliaries:Ljava/util/List;

    move-object v0, p0

    move-object v6, p1

    invoke-virtual/range {v0 .. v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->make(Lnet/bytebuddy/asm/Advice$WithCustomMapping;Lnet/bytebuddy/asm/Advice$ExceptionHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Ljava/util/List;Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;

    move-result-object p0

    return-object p0
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;
    .locals 9

    .line 1
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->advice:Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    .line 2
    .line 3
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

    .line 4
    .line 5
    iget-object v3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 6
    .line 7
    iget-object v4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 8
    .line 9
    iget-object v6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    .line 10
    .line 11
    iget-object v7, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->entries:Ljava/util/List;

    .line 12
    .line 13
    iget-object v8, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->auxiliaries:Ljava/util/List;

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    move-object v5, p1

    .line 17
    invoke-virtual/range {v0 .. v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->make(Lnet/bytebuddy/asm/Advice$WithCustomMapping;Lnet/bytebuddy/asm/Advice$ExceptionHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Ljava/util/List;Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public with(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;
    .locals 9

    .line 23
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->advice:Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->exceptionHandler:Lnet/bytebuddy/asm/Advice$ExceptionHandler;

    iget-object v4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v5, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v7, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->entries:Ljava/util/List;

    iget-object v8, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->auxiliaries:Ljava/util/List;

    move-object v0, p0

    move-object v3, p1

    invoke-virtual/range {v0 .. v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->make(Lnet/bytebuddy/asm/Advice$WithCustomMapping;Lnet/bytebuddy/asm/Advice$ExceptionHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Ljava/util/List;Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;

    move-result-object p0

    return-object p0
.end method

.method public withExceptionHandler(Lnet/bytebuddy/asm/Advice$ExceptionHandler;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;
    .locals 9

    .line 1
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->advice:Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    .line 2
    .line 3
    iget-object v3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 4
    .line 5
    iget-object v4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 6
    .line 7
    iget-object v5, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    .line 8
    .line 9
    iget-object v6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    .line 10
    .line 11
    iget-object v7, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->entries:Ljava/util/List;

    .line 12
    .line 13
    iget-object v8, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->auxiliaries:Ljava/util/List;

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    move-object v2, p1

    .line 17
    invoke-virtual/range {v0 .. v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;->make(Lnet/bytebuddy/asm/Advice$WithCustomMapping;Lnet/bytebuddy/asm/Advice$ExceptionHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Ljava/util/List;Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public wrap(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/security/ProtectionDomain;Lnet/bytebuddy/asm/Advice;)Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper;
    .locals 0
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Lnet/bytebuddy/utility/JavaModule;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Ljava/security/ProtectionDomain;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    return-object p5
.end method
