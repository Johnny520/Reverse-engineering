.class final Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$copy$1;
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
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1"
    f = "TextFieldSelectionManager.kt"
    l = {
        0x37b
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $cancelSelection:Z

.field label:I

.field final synthetic this$0:Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;ZLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/selection/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u54f2\u82cf\u696a;",
            "Z",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$copy$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$copy$1;->this$0:Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;

    .line 2
    .line 3
    iput-boolean p2, p0, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$copy$1;->$cancelSelection:Z

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 1
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
    new-instance p1, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$copy$1;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$copy$1;->this$0:Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;

    .line 4
    .line 5
    iget-boolean p0, p0, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$copy$1;->$cancelSelection:Z

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$copy$1;-><init>(Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;ZLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$copy$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$copy$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$copy$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$copy$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$copy$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    sget-object v4, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object v4

    .line 17
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$copy$1;->this$0:Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;

    .line 27
    .line 28
    iget-boolean v1, p0, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$copy$1;->$cancelSelection:Z

    .line 29
    .line 30
    invoke-virtual {p1}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪兰世哲苏()Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    iget-wide v5, v5, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:J

    .line 35
    .line 36
    invoke-static {v5, v6}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏(J)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-nez v5, :cond_3

    .line 41
    .line 42
    invoke-virtual {p1}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪兰世哲苏()Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-static {v2}, Lcom/bumptech/glide/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲(Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;)Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-nez v1, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-virtual {p1}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪兰世哲苏()Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-wide v5, v1, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:J

    .line 58
    .line 59
    invoke-static {v5, v6}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏(J)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-virtual {p1}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪兰世哲苏()Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    iget-object v5, v5, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 68
    .line 69
    invoke-static {v1, v1}, Landroidx/compose/ui/text/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲(II)J

    .line 70
    .line 71
    .line 72
    move-result-wide v6

    .line 73
    invoke-static {v5, v6, v7}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪苏哲世兰(Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;J)Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget-object v5, p1, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 78
    .line 79
    invoke-interface {v5, v1}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    sget-object v1, Landroidx/compose/foundation/text/HandleState;->None:Landroidx/compose/foundation/text/HandleState;

    .line 83
    .line 84
    invoke-virtual {p1, v1}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪兰哲苏世(Landroidx/compose/foundation/text/HandleState;)V

    .line 85
    .line 86
    .line 87
    :cond_3
    :goto_0
    if-nez v2, :cond_4

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    iget-object p1, p0, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$copy$1;->this$0:Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;

    .line 91
    .line 92
    iget-object p1, p1, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪苏世哲兰:Landroidx/compose/ui/platform/飘花落叶言子苏楪兰世哲;

    .line 93
    .line 94
    if-eqz p1, :cond_5

    .line 95
    .line 96
    invoke-static {v2}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;)Landroidx/compose/ui/platform/飘花落叶言子苏楪哲兰世;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iput v3, p0, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$copy$1;->label:I

    .line 101
    .line 102
    check-cast p1, Landroidx/compose/ui/platform/飘花落叶言子楪苏哲世兰;

    .line 103
    .line 104
    invoke-virtual {p1, v1}, Landroidx/compose/ui/platform/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/platform/飘花落叶言子苏楪哲兰世;)V

    .line 105
    .line 106
    .line 107
    if-ne v4, v0, :cond_5

    .line 108
    .line 109
    return-object v0

    .line 110
    :cond_5
    :goto_1
    return-object v4
.end method
