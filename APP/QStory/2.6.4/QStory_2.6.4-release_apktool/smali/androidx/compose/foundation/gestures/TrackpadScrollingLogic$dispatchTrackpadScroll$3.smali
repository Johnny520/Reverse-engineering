.class final Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u5170\u696a\u4e16;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u5170\u696a\u4e16;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$3"
    f = "TrackpadScrollingLogic.kt"
    l = {
        0xb2
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $targetScrollDelta:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u5170\u82cf\u696a\u4e16;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $this_dispatchTrackpadScroll:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏世楪;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏世楪;Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u5170\u82cf\u4e16\u696a;",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u5170\u696a\u4e16\u82cf;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u5170\u82cf\u696a\u4e16;",
            ">;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->this$0:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏世楪;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->$this_dispatchTrackpadScroll:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->$targetScrollDelta:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "*>;)",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->this$0:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏世楪;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->$this_dispatchTrackpadScroll:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->$targetScrollDelta:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p0, p2}, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;-><init>(Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏世楪;Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u5170\u696a\u4e16;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->invoke(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->label:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    if-ne v2, v4, :cond_0

    .line 12
    .line 13
    iget-object v2, v0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->L$1:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 16
    .line 17
    iget-object v5, v0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->L$0:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v5, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    move-object/from16 v6, p1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v3

    .line 33
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, v0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->L$0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;

    .line 39
    .line 40
    iget-object v5, v0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->this$0:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏世楪;

    .line 41
    .line 42
    iget-object v6, v0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->$this_dispatchTrackpadScroll:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 43
    .line 44
    iget-object v7, v0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->$targetScrollDelta:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 45
    .line 46
    iget-object v7, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v7, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏楪世;

    .line 49
    .line 50
    iget-wide v7, v7, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪世苏哲兰:J

    .line 51
    .line 52
    invoke-virtual {v6, v7, v8}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世兰苏哲(J)J

    .line 53
    .line 54
    .line 55
    move-result-wide v7

    .line 56
    invoke-virtual {v6, v7, v8}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏哲世兰(J)F

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    iget-object v5, v5, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 61
    .line 62
    invoke-virtual {v5, v6}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世哲兰苏(F)F

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    invoke-virtual {v5, v6}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏世兰哲(F)J

    .line 67
    .line 68
    .line 69
    move-result-wide v6

    .line 70
    move-object v8, v2

    .line 71
    check-cast v8, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏兰楪世;

    .line 72
    .line 73
    invoke-virtual {v8, v4, v6, v7}, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪世苏哲兰(IJ)J

    .line 74
    .line 75
    .line 76
    move-result-wide v6

    .line 77
    invoke-virtual {v5, v6, v7}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世兰苏哲(J)J

    .line 78
    .line 79
    .line 80
    move-result-wide v6

    .line 81
    invoke-virtual {v5, v6, v7}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏世哲兰(J)F

    .line 82
    .line 83
    .line 84
    move-object v5, v2

    .line 85
    :goto_0
    iget-object v2, v0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->$targetScrollDelta:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 86
    .line 87
    iget-object v6, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v6, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏楪世;

    .line 90
    .line 91
    iget-boolean v6, v6, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪世哲苏兰:Z

    .line 92
    .line 93
    if-nez v6, :cond_4

    .line 94
    .line 95
    iget-object v6, v0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->this$0:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏世楪;

    .line 96
    .line 97
    iget-object v6, v6, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世兰哲苏:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 98
    .line 99
    iput-object v5, v0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->L$0:Ljava/lang/Object;

    .line 100
    .line 101
    iput-object v2, v0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->L$1:Ljava/lang/Object;

    .line 102
    .line 103
    iput v4, v0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->label:I

    .line 104
    .line 105
    new-instance v7, Landroidx/compose/foundation/gestures/NonTouchScrollingLogicKt$busyReceive$2;

    .line 106
    .line 107
    invoke-direct {v7, v6, v3}, Landroidx/compose/foundation/gestures/NonTouchScrollingLogicKt$busyReceive$2;-><init>(Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v7, v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲世苏兰(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    if-ne v6, v1, :cond_2

    .line 115
    .line 116
    return-object v1

    .line 117
    :cond_2
    :goto_1
    iput-object v6, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 118
    .line 119
    iget-object v2, v0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->this$0:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏世楪;

    .line 120
    .line 121
    iget-object v6, v0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->$targetScrollDelta:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 122
    .line 123
    iget-object v6, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v6, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏楪世;

    .line 126
    .line 127
    iget-object v2, v2, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世兰苏哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 128
    .line 129
    iget-wide v7, v6, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪世苏兰哲:J

    .line 130
    .line 131
    iget-wide v9, v6, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪世苏哲兰:J

    .line 132
    .line 133
    iget-object v6, v2, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v6, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;

    .line 136
    .line 137
    const/16 v11, 0x20

    .line 138
    .line 139
    shr-long v12, v9, v11

    .line 140
    .line 141
    long-to-int v12, v12

    .line 142
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 143
    .line 144
    .line 145
    move-result v12

    .line 146
    invoke-virtual {v6, v12, v7, v8}, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(FJ)V

    .line 147
    .line 148
    .line 149
    iget-object v2, v2, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v2, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;

    .line 152
    .line 153
    const-wide v12, 0xffffffffL

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    and-long/2addr v9, v12

    .line 159
    long-to-int v6, v9

    .line 160
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    invoke-virtual {v2, v6, v7, v8}, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(FJ)V

    .line 165
    .line 166
    .line 167
    iget-object v2, v0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->this$0:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏世楪;

    .line 168
    .line 169
    iget-object v2, v2, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世兰哲苏:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 170
    .line 171
    invoke-static {v2}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世兰苏哲(Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;)Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏楪世;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    if-eqz v2, :cond_3

    .line 176
    .line 177
    iget-object v6, v0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->this$0:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏世楪;

    .line 178
    .line 179
    iget-object v7, v0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->$targetScrollDelta:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 180
    .line 181
    iget-object v6, v6, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世兰苏哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 182
    .line 183
    iget-wide v8, v2, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪世苏兰哲:J

    .line 184
    .line 185
    iget-wide v14, v2, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪世苏哲兰:J

    .line 186
    .line 187
    iget-object v10, v6, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v10, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;

    .line 190
    .line 191
    move-wide/from16 v16, v12

    .line 192
    .line 193
    shr-long v12, v14, v11

    .line 194
    .line 195
    long-to-int v11, v12

    .line 196
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 197
    .line 198
    .line 199
    move-result v11

    .line 200
    invoke-virtual {v10, v11, v8, v9}, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(FJ)V

    .line 201
    .line 202
    .line 203
    iget-object v6, v6, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v6, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;

    .line 206
    .line 207
    and-long v10, v14, v16

    .line 208
    .line 209
    long-to-int v10, v10

    .line 210
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    invoke-virtual {v6, v10, v8, v9}, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(FJ)V

    .line 215
    .line 216
    .line 217
    iget-object v6, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v6, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏楪世;

    .line 220
    .line 221
    invoke-virtual {v6, v2}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏楪世;)Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏楪世;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    iput-object v2, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 226
    .line 227
    :cond_3
    iget-object v2, v0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->this$0:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏世楪;

    .line 228
    .line 229
    iget-object v6, v0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->$this_dispatchTrackpadScroll:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 230
    .line 231
    iget-object v7, v0, Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$dispatchTrackpadScroll$3;->$targetScrollDelta:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 232
    .line 233
    iget-object v7, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v7, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏楪世;

    .line 236
    .line 237
    iget-wide v7, v7, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪世苏哲兰:J

    .line 238
    .line 239
    invoke-virtual {v6, v7, v8}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世兰苏哲(J)J

    .line 240
    .line 241
    .line 242
    move-result-wide v7

    .line 243
    invoke-virtual {v6, v7, v8}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏哲世兰(J)F

    .line 244
    .line 245
    .line 246
    move-result v6

    .line 247
    iget-object v2, v2, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 248
    .line 249
    invoke-virtual {v2, v6}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世哲兰苏(F)F

    .line 250
    .line 251
    .line 252
    move-result v6

    .line 253
    invoke-virtual {v2, v6}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏世兰哲(F)J

    .line 254
    .line 255
    .line 256
    move-result-wide v6

    .line 257
    move-object v8, v5

    .line 258
    check-cast v8, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏兰楪世;

    .line 259
    .line 260
    invoke-virtual {v8, v4, v6, v7}, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪世苏哲兰(IJ)J

    .line 261
    .line 262
    .line 263
    move-result-wide v6

    .line 264
    invoke-virtual {v2, v6, v7}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世兰苏哲(J)J

    .line 265
    .line 266
    .line 267
    move-result-wide v6

    .line 268
    invoke-virtual {v2, v6, v7}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏世哲兰(J)F

    .line 269
    .line 270
    .line 271
    goto/16 :goto_0

    .line 272
    .line 273
    :cond_4
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 274
    .line 275
    return-object v0
.end method
