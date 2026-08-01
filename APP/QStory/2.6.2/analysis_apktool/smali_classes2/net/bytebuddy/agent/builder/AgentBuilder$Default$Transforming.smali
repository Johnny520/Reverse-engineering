.class public Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;
.super Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator$Matchable;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Extendable;
.implements Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Transforming"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator$Matchable<",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;",
        ">;",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Extendable;",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field private final rawMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

.field private final terminal:Z

.field final synthetic this$0:Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

.field private final transformers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/agent/builder/AgentBuilder$Default;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->this$0:Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator$Matchable;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->rawMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->transformers:Ljava/util/List;

    .line 9
    .line 10
    iput-boolean p4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->terminal:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public and(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;
    .locals 6

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->this$0:Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    .line 4
    .line 5
    new-instance v2, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$Conjunction;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->rawMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    new-array v4, v4, [Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    aput-object v3, v4, v5

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    aput-object p1, v4, v3

    .line 17
    .line 18
    invoke-direct {v2, v4}, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$Conjunction;-><init>([Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->transformers:Ljava/util/List;

    .line 22
    .line 23
    iget-boolean p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->terminal:Z

    .line 24
    .line 25
    invoke-direct {v0, v1, v2, p1, p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$Default;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;Z)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public bridge synthetic and(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Matchable;
    .locals 0

    .line 29
    invoke-virtual {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->and(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;

    move-result-object p0

    return-object p0
.end method

.method public asTerminalTransformation()Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 4

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->this$0:Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->rawMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->transformers:Ljava/util/List;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    invoke-direct {v0, v1, v2, p0, v3}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$Default;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;Z)V

    .line 11
    .line 12
    .line 13
    return-object v0
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
    iget-boolean v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->terminal:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->terminal:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->rawMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->rawMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->transformers:Ljava/util/List;

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->transformers:Ljava/util/List;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->this$0:Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    .line 52
    .line 53
    iget-object p1, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->this$0:Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_6

    .line 60
    .line 61
    return v1

    .line 62
    :cond_6
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
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->rawMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/2addr v2, v0

    .line 19
    mul-int/2addr v2, v1

    .line 20
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->transformers:Ljava/util/List;

    .line 21
    .line 22
    invoke-static {v0, v2, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-boolean v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->terminal:Z

    .line 27
    .line 28
    add-int/2addr v0, v2

    .line 29
    mul-int/2addr v0, v1

    .line 30
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->this$0:Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    .line 31
    .line 32
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    add-int/2addr p0, v0

    .line 37
    return p0
.end method

.method public materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    .line 4
    .line 5
    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->this$0:Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    .line 6
    .line 7
    move-object v3, v1

    .line 8
    iget-object v1, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 9
    .line 10
    iget-object v4, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    .line 11
    .line 12
    move-object v5, v3

    .line 13
    iget-object v3, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    .line 14
    .line 15
    move-object v6, v4

    .line 16
    iget-object v4, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    .line 17
    .line 18
    move-object v7, v5

    .line 19
    iget-object v5, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    .line 20
    .line 21
    move-object v8, v6

    .line 22
    iget-object v6, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    .line 23
    .line 24
    move-object v9, v7

    .line 25
    iget-object v7, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 26
    .line 27
    move-object v10, v8

    .line 28
    iget-object v8, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    .line 29
    .line 30
    move-object v11, v9

    .line 31
    iget-object v9, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    .line 32
    .line 33
    move-object v12, v10

    .line 34
    iget-object v10, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    .line 35
    .line 36
    move-object v13, v11

    .line 37
    iget-object v11, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    .line 38
    .line 39
    move-object v14, v12

    .line 40
    iget-object v12, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    .line 41
    .line 42
    move-object v15, v13

    .line 43
    iget-object v13, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    .line 44
    .line 45
    move-object/from16 v16, v14

    .line 46
    .line 47
    iget-object v14, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    .line 48
    .line 49
    move-object/from16 v17, v15

    .line 50
    .line 51
    iget-object v15, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    .line 52
    .line 53
    move-object/from16 v18, v1

    .line 54
    .line 55
    iget-object v1, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    .line 56
    .line 57
    move-object/from16 v19, v1

    .line 58
    .line 59
    iget-object v1, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    .line 60
    .line 61
    move-object/from16 v20, v1

    .line 62
    .line 63
    iget-object v1, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    .line 64
    .line 65
    move-object/from16 v21, v1

    .line 66
    .line 67
    iget-object v1, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    .line 68
    .line 69
    move-object/from16 v22, v1

    .line 70
    .line 71
    iget-object v1, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    .line 72
    .line 73
    move-object/from16 v23, v1

    .line 74
    .line 75
    iget-object v1, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    .line 76
    .line 77
    move-object/from16 v24, v1

    .line 78
    .line 79
    iget-object v1, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    .line 80
    .line 81
    move-object/from16 v25, v1

    .line 82
    .line 83
    iget-object v1, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 84
    .line 85
    iget-object v2, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    .line 86
    .line 87
    move-object/from16 v26, v1

    .line 88
    .line 89
    new-instance v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;

    .line 90
    .line 91
    move-object/from16 v27, v3

    .line 92
    .line 93
    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->rawMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 94
    .line 95
    move-object/from16 v28, v4

    .line 96
    .line 97
    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->transformers:Ljava/util/List;

    .line 98
    .line 99
    iget-boolean v0, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->terminal:Z

    .line 100
    .line 101
    invoke-direct {v1, v3, v4, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;Z)V

    .line 102
    .line 103
    .line 104
    invoke-static {v2, v1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    move-object/from16 v2, v16

    .line 109
    .line 110
    move-object/from16 v1, v18

    .line 111
    .line 112
    move-object/from16 v16, v19

    .line 113
    .line 114
    move-object/from16 v18, v21

    .line 115
    .line 116
    move-object/from16 v19, v22

    .line 117
    .line 118
    move-object/from16 v21, v24

    .line 119
    .line 120
    move-object/from16 v22, v25

    .line 121
    .line 122
    move-object/from16 v3, v27

    .line 123
    .line 124
    move-object/from16 v4, v28

    .line 125
    .line 126
    move-object/from16 v24, v0

    .line 127
    .line 128
    move-object/from16 v0, v17

    .line 129
    .line 130
    move-object/from16 v17, v20

    .line 131
    .line 132
    move-object/from16 v20, v23

    .line 133
    .line 134
    move-object/from16 v23, v26

    .line 135
    .line 136
    invoke-direct/range {v0 .. v24}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    .line 137
    .line 138
    .line 139
    move-object v15, v0

    .line 140
    return-object v15
.end method

.method public or(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;
    .locals 6

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->this$0:Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    .line 4
    .line 5
    new-instance v2, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$Disjunction;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->rawMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    new-array v4, v4, [Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    aput-object v3, v4, v5

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    aput-object p1, v4, v3

    .line 17
    .line 18
    invoke-direct {v2, v4}, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$Disjunction;-><init>([Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->transformers:Ljava/util/List;

    .line 22
    .line 23
    iget-boolean p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->terminal:Z

    .line 24
    .line 25
    invoke-direct {v0, v1, v2, p1, p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$Default;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;Z)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public bridge synthetic or(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Matchable;
    .locals 0

    .line 29
    invoke-virtual {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->or(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;

    move-result-object p0

    return-object p0
.end method

.method public transform(Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer;)Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Extendable;
    .locals 4

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->this$0:Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->rawMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->transformers:Ljava/util/List;

    .line 8
    .line 9
    invoke-static {v3, p1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-boolean p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;->terminal:Z

    .line 14
    .line 15
    invoke-direct {v0, v1, v2, p1, p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$Default;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;Z)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
