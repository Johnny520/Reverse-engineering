.class final Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰苏世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u82cf\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"
    }
    d2 = {
        "T",
        "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u54f2\u696a\u82cf;",
        "anchors",
        "latestTarget",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2"
    f = "AnchoredDraggable.kt"
    l = {
        0x591,
        0x5a3,
        0x5bb
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $decayAnimationSpec:Landroidx/compose/animation/core/飘花落叶言子楪兰世苏哲;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u4e16\u82cf\u54f2;"
        }
    .end annotation
.end field

.field final synthetic $remainingVelocity:Lkotlin/jvm/internal/Ref$FloatRef;

.field final synthetic $snapAnimationSpec:Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;"
        }
    .end annotation
.end field

.field final synthetic $this_animateToWithDecay:Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世哲兰;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u54f2\u5170;"
        }
    .end annotation
.end field

.field final synthetic $velocity:F

.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field synthetic L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世哲兰;FLandroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/animation/core/飘花落叶言子楪兰世苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u54f2\u5170;",
            "F",
            "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;",
            "Lkotlin/jvm/internal/Ref$FloatRef;",
            "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u4e16\u82cf\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput p2, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;->$velocity:F

    .line 2
    .line 3
    iput-object p3, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;->$snapAnimationSpec:Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;

    .line 4
    .line 5
    iput-object p4, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;->$remainingVelocity:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 6
    .line 7
    iput-object p5, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;->$decayAnimationSpec:Landroidx/compose/animation/core/飘花落叶言子楪兰世苏哲;

    .line 8
    .line 9
    const/4 p1, 0x4

    .line 10
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private static final invokeSuspend$lambda$2(FLkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 3

    .line 1
    iget-object v0, p4, Landroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Ljava/lang/Number;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    cmpg-float v1, v1, p0

    .line 17
    .line 18
    if-gez v1, :cond_0

    .line 19
    .line 20
    iget v1, p1, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 21
    .line 22
    cmpl-float v1, v1, p0

    .line 23
    .line 24
    if-gtz v1, :cond_1

    .line 25
    .line 26
    :cond_0
    move-object v1, v0

    .line 27
    check-cast v1, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/lang/Number;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    cmpl-float v2, v2, p0

    .line 40
    .line 41
    if-lez v2, :cond_6

    .line 42
    .line 43
    iget v2, p1, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 44
    .line 45
    cmpg-float v2, v2, p0

    .line 46
    .line 47
    if-gez v2, :cond_6

    .line 48
    .line 49
    :cond_1
    check-cast v0, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    const/4 v1, 0x0

    .line 62
    cmpg-float v2, p0, v1

    .line 63
    .line 64
    if-nez v2, :cond_2

    .line 65
    .line 66
    move p0, v1

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    cmpl-float v2, p0, v1

    .line 69
    .line 70
    if-lez v2, :cond_3

    .line 71
    .line 72
    cmpl-float v2, v0, p0

    .line 73
    .line 74
    if-lez v2, :cond_4

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    cmpg-float v2, v0, p0

    .line 78
    .line 79
    if-gez v2, :cond_4

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    move p0, v0

    .line 83
    :goto_0
    invoke-virtual {p4}, Landroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Ljava/lang/Number;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 90
    .line 91
    .line 92
    invoke-interface {p2}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p4}, Landroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    check-cast p2, Ljava/lang/Number;

    .line 100
    .line 101
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    if-eqz p2, :cond_5

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_5
    invoke-virtual {p4}, Landroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    check-cast p2, Ljava/lang/Number;

    .line 117
    .line 118
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    :goto_1
    iput v1, p3, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 123
    .line 124
    iput p0, p1, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 125
    .line 126
    invoke-virtual {p4}, Landroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰()V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_6
    invoke-virtual {v1}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    check-cast p0, Ljava/lang/Number;

    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 137
    .line 138
    .line 139
    invoke-virtual {p4}, Landroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    check-cast p0, Ljava/lang/Number;

    .line 144
    .line 145
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 146
    .line 147
    .line 148
    invoke-interface {p2}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p4}, Landroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    check-cast p0, Ljava/lang/Number;

    .line 156
    .line 157
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    iput p0, p3, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 162
    .line 163
    invoke-virtual {v1}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    check-cast p0, Ljava/lang/Number;

    .line 168
    .line 169
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 170
    .line 171
    .line 172
    move-result p0

    .line 173
    iput p0, p1, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 174
    .line 175
    :goto_2
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 176
    .line 177
    return-object p0
.end method


# virtual methods
.method public final invoke(Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;Landroidx/compose/foundation/gestures/飘花落叶言子世兰哲楪苏;Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u54f2\u696a\u82cf;",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;

    .line 2
    .line 3
    iget v2, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;->$velocity:F

    .line 4
    .line 5
    iget-object v3, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;->$snapAnimationSpec:Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;

    .line 6
    .line 7
    iget-object v4, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;->$remainingVelocity:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 8
    .line 9
    iget-object v5, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;->$decayAnimationSpec:Landroidx/compose/animation/core/飘花落叶言子楪兰世苏哲;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    move-object v6, p4

    .line 13
    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;-><init>(Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世哲兰;FLandroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/animation/core/飘花落叶言子楪兰世苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;->L$0:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p2, v0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;->L$1:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object p3, v0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;->L$2:Ljava/lang/Object;

    .line 21
    .line 22
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 29
    if-nez p1, :cond_1

    if-nez p2, :cond_0

    check-cast p4, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1, p3, p4}, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;->invoke(Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;Landroidx/compose/foundation/gestures/飘花落叶言子世兰哲楪苏;Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    const/4 p0, 0x0

    return-object p0

    :cond_1
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    const/4 p0, 0x0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;->label:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eq v0, v2, :cond_2

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    if-eq v0, v2, :cond_1

    .line 14
    .line 15
    const/4 v2, 0x3

    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;->$remainingVelocity:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 22
    .line 23
    iput v3, p0, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;->$remainingVelocity:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 40
    .line 41
    iput v3, p0, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 42
    .line 43
    :goto_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;->L$0:Ljava/lang/Object;

    .line 50
    .line 51
    if-eqz p1, :cond_4

    .line 52
    .line 53
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :cond_4
    iget-object p0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;->L$1:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-static {p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    throw p0
.end method
