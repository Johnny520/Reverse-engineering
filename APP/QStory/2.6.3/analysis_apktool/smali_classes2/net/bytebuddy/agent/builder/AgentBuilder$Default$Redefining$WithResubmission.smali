.class public Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;
.super Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "WithResubmission"
.end annotation


# instance fields
.field private final resubmissionImmediateMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionImmediateMatcher;

.field private final resubmissionOnErrorMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionOnErrorMatcher;

.field private final resubmissionScheduler:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionScheduler;

.field final synthetic this$0:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionScheduler;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionOnErrorMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionImmediateMatcher;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->this$0:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->resubmissionScheduler:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionScheduler;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->resubmissionOnErrorMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionOnErrorMatcher;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->resubmissionImmediateMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionImmediateMatcher;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    .line 4
    .line 5
    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->this$0:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining;

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
    iget-object v2, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    .line 50
    .line 51
    move-object/from16 v17, v1

    .line 52
    .line 53
    new-instance v1, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy$Enabled;

    .line 54
    .line 55
    move-object/from16 v18, v2

    .line 56
    .line 57
    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->resubmissionScheduler:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionScheduler;

    .line 58
    .line 59
    move-object/from16 v19, v3

    .line 60
    .line 61
    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->resubmissionOnErrorMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionOnErrorMatcher;

    .line 62
    .line 63
    move-object/from16 v20, v4

    .line 64
    .line 65
    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->resubmissionImmediateMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionImmediateMatcher;

    .line 66
    .line 67
    invoke-direct {v1, v2, v3, v4}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy$Enabled;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionScheduler;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionOnErrorMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionImmediateMatcher;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->this$0:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining;

    .line 71
    .line 72
    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    .line 73
    .line 74
    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    .line 75
    .line 76
    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    .line 77
    .line 78
    move-object/from16 v21, v1

    .line 79
    .line 80
    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    .line 81
    .line 82
    move-object/from16 v22, v1

    .line 83
    .line 84
    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    .line 85
    .line 86
    move-object/from16 v23, v1

    .line 87
    .line 88
    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    .line 89
    .line 90
    move-object/from16 v24, v1

    .line 91
    .line 92
    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 93
    .line 94
    iget-object v0, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    .line 95
    .line 96
    move-object/from16 v25, v24

    .line 97
    .line 98
    move-object/from16 v24, v0

    .line 99
    .line 100
    move-object v0, v15

    .line 101
    move-object/from16 v15, v18

    .line 102
    .line 103
    move-object/from16 v18, v3

    .line 104
    .line 105
    move-object/from16 v3, v19

    .line 106
    .line 107
    move-object/from16 v19, v4

    .line 108
    .line 109
    move-object/from16 v4, v20

    .line 110
    .line 111
    move-object/from16 v20, v22

    .line 112
    .line 113
    move-object/from16 v22, v25

    .line 114
    .line 115
    move-object/from16 v25, v23

    .line 116
    .line 117
    move-object/from16 v23, v1

    .line 118
    .line 119
    move-object/from16 v1, v17

    .line 120
    .line 121
    move-object/from16 v17, v2

    .line 122
    .line 123
    move-object/from16 v2, v16

    .line 124
    .line 125
    move-object/from16 v16, v21

    .line 126
    .line 127
    move-object/from16 v21, v25

    .line 128
    .line 129
    invoke-direct/range {v0 .. v24}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    .line 130
    .line 131
    .line 132
    move-object v15, v0

    .line 133
    return-object v15
.end method

.method public resubmitImmediate()Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;
    .locals 1

    .line 32
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->resubmitImmediate(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;

    move-result-object p0

    return-object p0
.end method

.method public resubmitImmediate(Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionImmediateMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;
    .locals 7

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->this$0:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->resubmissionScheduler:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionScheduler;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->resubmissionOnErrorMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionOnErrorMatcher;

    .line 8
    .line 9
    new-instance v4, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionImmediateMatcher$Disjunction;

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->resubmissionImmediateMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionImmediateMatcher;

    .line 12
    .line 13
    const/4 v5, 0x2

    .line 14
    new-array v5, v5, [Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionImmediateMatcher;

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    aput-object p0, v5, v6

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    aput-object p1, v5, p0

    .line 21
    .line 22
    invoke-direct {v4, v5}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionImmediateMatcher$Disjunction;-><init>([Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionImmediateMatcher;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1, v2, v3, v4}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionScheduler;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionOnErrorMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionImmediateMatcher;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public resubmitImmediate(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "Ljava/lang/String;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;"
        }
    .end annotation

    .line 29
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->resubmitImmediate(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;

    move-result-object p0

    return-object p0
.end method

.method public resubmitImmediate(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "Ljava/lang/String;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/ClassLoader;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;"
        }
    .end annotation

    .line 30
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->resubmitImmediate(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;

    move-result-object p0

    return-object p0
.end method

.method public resubmitImmediate(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "Ljava/lang/String;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/ClassLoader;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/utility/JavaModule;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;"
        }
    .end annotation

    .line 31
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionImmediateMatcher$ForElementMatchers;

    invoke-direct {v0, p1, p2, p3}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionImmediateMatcher$ForElementMatchers;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->resubmitImmediate(Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionImmediateMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;

    move-result-object p0

    return-object p0
.end method

.method public resubmitOnError()Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;
    .locals 1

    .line 33
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->resubmitOnError(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;

    move-result-object p0

    return-object p0
.end method

.method public resubmitOnError(Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionOnErrorMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;
    .locals 7

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->this$0:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->resubmissionScheduler:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionScheduler;

    .line 6
    .line 7
    new-instance v3, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionOnErrorMatcher$Disjunction;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->resubmissionOnErrorMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionOnErrorMatcher;

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    new-array v5, v5, [Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionOnErrorMatcher;

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    aput-object v4, v5, v6

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    aput-object p1, v5, v4

    .line 19
    .line 20
    invoke-direct {v3, v5}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionOnErrorMatcher$Disjunction;-><init>([Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionOnErrorMatcher;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->resubmissionImmediateMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionImmediateMatcher;

    .line 24
    .line 25
    invoke-direct {v0, v1, v2, v3, p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionScheduler;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionOnErrorMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionImmediateMatcher;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public resubmitOnError(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;"
        }
    .end annotation

    .line 29
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->resubmitOnError(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;

    move-result-object p0

    return-object p0
.end method

.method public resubmitOnError(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/Throwable;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "Ljava/lang/String;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;"
        }
    .end annotation

    .line 30
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->resubmitOnError(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;

    move-result-object p0

    return-object p0
.end method

.method public resubmitOnError(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/Throwable;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "Ljava/lang/String;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/ClassLoader;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;"
        }
    .end annotation

    .line 31
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->resubmitOnError(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;

    move-result-object p0

    return-object p0
.end method

.method public resubmitOnError(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/Throwable;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "Ljava/lang/String;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/ClassLoader;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/utility/JavaModule;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;"
        }
    .end annotation

    .line 32
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionOnErrorMatcher$ForElementMatchers;

    invoke-direct {v0, p1, p2, p3, p4}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionOnErrorMatcher$ForElementMatchers;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining$WithResubmission;->resubmitOnError(Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$ResubmissionOnErrorMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithResubmissionSpecification;

    move-result-object p0

    return-object p0
.end method
