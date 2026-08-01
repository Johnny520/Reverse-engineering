.class final Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/input/pointer/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Landroidx/compose/ui/input/pointer/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1"
    f = "PointerMoveDetector.kt"
    l = {
        0x2c
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $currentContext:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

.field final synthetic $onMove:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
        }
    .end annotation
.end field

.field final synthetic $pointerEventPass:Landroidx/compose/ui/input/pointer/PointerEventPass;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Landroidx/compose/ui/input/pointer/PointerEventPass;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            "Landroidx/compose/ui/input/pointer/PointerEventPass;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;->$currentContext:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;->$pointerEventPass:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;->$onMove:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

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
    new-instance v0, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;->$currentContext:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;->$pointerEventPass:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;->$onMove:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p0, p2}, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Landroidx/compose/ui/input/pointer/PointerEventPass;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    check-cast p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;->invoke(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;->L$1:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 14
    .line 15
    iget-object v4, p0, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v2

    .line 29
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;->L$0:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 35
    .line 36
    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 37
    .line 38
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 39
    .line 40
    .line 41
    :goto_0
    iget-object v4, p0, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;->$currentContext:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 42
    .line 43
    invoke-static {v4}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪苏哲兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_8

    .line 48
    .line 49
    iget-object v4, p0, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;->$pointerEventPass:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 50
    .line 51
    iput-object p1, p0, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;->L$0:Ljava/lang/Object;

    .line 52
    .line 53
    iput-object v1, p0, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    iput v3, p0, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;->label:I

    .line 56
    .line 57
    check-cast p1, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 58
    .line 59
    invoke-virtual {p1, v4, p0}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    if-ne v4, v0, :cond_2

    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_2
    move-object v9, v4

    .line 67
    move-object v4, p1

    .line 68
    move-object p1, v9

    .line 69
    :goto_1
    check-cast p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 70
    .line 71
    iget v5, p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏:I

    .line 72
    .line 73
    const/4 v6, 0x3

    .line 74
    if-ne v5, v6, :cond_3

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_3
    const/4 v6, 0x4

    .line 78
    if-ne v5, v6, :cond_4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    const/4 v6, 0x5

    .line 82
    if-ne v5, v6, :cond_7

    .line 83
    .line 84
    :goto_2
    iget-object p1, p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 85
    .line 86
    invoke-static {p1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲楪世苏兰(Ljava/util/List;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 91
    .line 92
    iget-wide v5, p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:J

    .line 93
    .line 94
    new-instance p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 95
    .line 96
    invoke-direct {p1, v5, v6}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 97
    .line 98
    .line 99
    iget-object v7, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 100
    .line 101
    instance-of v8, v7, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 102
    .line 103
    if-nez v8, :cond_5

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_5
    check-cast v7, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 107
    .line 108
    iget-wide v7, v7, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:J

    .line 109
    .line 110
    cmp-long v5, v5, v7

    .line 111
    .line 112
    if-eqz v5, :cond_6

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_6
    move-object p1, v2

    .line 116
    :goto_3
    if-eqz p1, :cond_7

    .line 117
    .line 118
    iget-object v5, p0, Landroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1;->$onMove:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 119
    .line 120
    iget-wide v6, p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:J

    .line 121
    .line 122
    new-instance p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 123
    .line 124
    invoke-direct {p1, v6, v7}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 125
    .line 126
    .line 127
    iput-object p1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 128
    .line 129
    new-instance p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 130
    .line 131
    invoke-direct {p1, v6, v7}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 132
    .line 133
    .line 134
    invoke-interface {v5, p1}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    :cond_7
    move-object p1, v4

    .line 138
    goto :goto_0

    .line 139
    :cond_8
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 140
    .line 141
    return-object p0
.end method
