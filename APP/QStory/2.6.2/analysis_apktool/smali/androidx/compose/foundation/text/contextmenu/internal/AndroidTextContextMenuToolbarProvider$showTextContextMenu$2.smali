.class final Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2"
    f = "AndroidTextContextMenuToolbarProvider.android.kt"
    l = {
        0xb6
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $dataProvider:Landroidx/compose/foundation/text/contextmenu/provider/飘花落叶言子楪世兰哲苏;

.field label:I

.field final synthetic this$0:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;Landroidx/compose/foundation/text/contextmenu/provider/飘花落叶言子楪世兰哲苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/contextmenu/internal/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16;",
            "Landroidx/compose/foundation/text/contextmenu/provider/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->this$0:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->$dataProvider:Landroidx/compose/foundation/text/contextmenu/provider/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final invokeSuspend$lambda$0(Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏哲兰;Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏世哲兰;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 2
    .line 3
    new-instance v1, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰哲世苏;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰哲世苏;-><init>(Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏哲兰;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    invoke-virtual {v0, v1, p1}, Landroid/view/View;->startActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object p0, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世兰哲:Landroid/view/ActionMode;

    .line 14
    .line 15
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p2}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏世哲兰;->close()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method private static final invokeSuspend$lambda$2(Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世兰哲:Landroid/view/ActionMode;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/ActionMode;->finish()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世兰哲苏(Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->invokeSuspend$lambda$2(Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏哲兰;Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏世哲兰;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->invokeSuspend$lambda$0(Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏哲兰;Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏世哲兰;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "*>;)",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->this$0:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->$dataProvider:Landroidx/compose/foundation/text/contextmenu/provider/飘花落叶言子楪世兰哲苏;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;-><init>(Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;Landroidx/compose/foundation/text/contextmenu/provider/飘花落叶言子楪世兰哲苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->invoke(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->create(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->label:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-ne v1, v4, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    goto/16 :goto_4

    .line 18
    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto/16 :goto_7

    .line 21
    .line 22
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v5

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance p1, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏世哲兰;

    .line 32
    .line 33
    invoke-direct {p1}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏世哲兰;-><init>()V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->this$0:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;

    .line 37
    .line 38
    iget-object v6, p0, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->$dataProvider:Landroidx/compose/foundation/text/contextmenu/provider/飘花落叶言子楪世兰哲苏;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v7, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世兰哲苏;

    .line 44
    .line 45
    new-instance v8, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世苏兰哲;

    .line 46
    .line 47
    invoke-direct {v8, v1, v6, v2}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世苏兰哲;-><init>(Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;Landroidx/compose/foundation/text/contextmenu/provider/飘花落叶言子楪世兰哲苏;I)V

    .line 48
    .line 49
    .line 50
    new-instance v9, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世苏兰哲;

    .line 51
    .line 52
    invoke-direct {v9, v1, v6, v4}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世苏兰哲;-><init>(Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;Landroidx/compose/foundation/text/contextmenu/provider/飘花落叶言子楪世兰哲苏;I)V

    .line 53
    .line 54
    .line 55
    iget-object v6, v1, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 56
    .line 57
    invoke-direct {v7, p1, v8, v9, v6}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世兰哲苏;-><init>(Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏世哲兰;Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世苏兰哲;Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世苏兰哲;Landroid/view/View;)V

    .line 58
    .line 59
    .line 60
    iget-object v1, v1, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 61
    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    invoke-interface {v1, v7}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏哲兰;

    .line 69
    .line 70
    if-nez v1, :cond_2

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    move-object v7, v1

    .line 74
    :cond_3
    :goto_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iget-object v6, p0, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->this$0:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;

    .line 79
    .line 80
    iget-object v6, v6, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 81
    .line 82
    invoke-virtual {v6}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    if-eqz v6, :cond_4

    .line 87
    .line 88
    invoke-virtual {v6}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    goto :goto_1

    .line 93
    :cond_4
    move-object v6, v5

    .line 94
    :goto_1
    iget-object v8, p0, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->this$0:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;

    .line 95
    .line 96
    if-eq v1, v6, :cond_6

    .line 97
    .line 98
    iget-object v1, v8, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏世兰哲;

    .line 99
    .line 100
    if-nez v1, :cond_5

    .line 101
    .line 102
    new-instance v1, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏世兰哲;

    .line 103
    .line 104
    invoke-direct {v1, v8, v7, p1}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏世兰哲;-><init>(Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏哲兰;Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏世哲兰;)V

    .line 105
    .line 106
    .line 107
    iput-object v1, v8, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏世兰哲;

    .line 108
    .line 109
    :cond_5
    iget-object v6, v8, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 110
    .line 111
    invoke-virtual {v6, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_6
    iget-object v1, v8, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 116
    .line 117
    new-instance v6, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰哲世苏;

    .line 118
    .line 119
    invoke-direct {v6, v7}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪兰哲世苏;-><init>(Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏哲兰;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v6, v4}, Landroid/view/View;->startActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    if-nez v1, :cond_7

    .line 127
    .line 128
    return-object v3

    .line 129
    :cond_7
    iput-object v1, v8, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世兰哲:Landroid/view/ActionMode;

    .line 130
    .line 131
    :goto_2
    :try_start_1
    iput v4, p0, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->label:I

    .line 132
    .line 133
    iget-object p1, p1, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-static {p1, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏兰哲楪(Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 142
    if-ne p1, v0, :cond_8

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_8
    move-object p1, v3

    .line 146
    :goto_3
    if-ne p1, v0, :cond_9

    .line 147
    .line 148
    return-object v0

    .line 149
    :cond_9
    :goto_4
    iget-object p1, p0, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->this$0:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;

    .line 150
    .line 151
    iget-object p1, p1, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲:Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;

    .line 152
    .line 153
    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰()V

    .line 154
    .line 155
    .line 156
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    iget-object v0, p0, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->this$0:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;

    .line 161
    .line 162
    iget-object v0, v0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 163
    .line 164
    invoke-virtual {v0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    if-eqz v0, :cond_a

    .line 169
    .line 170
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    goto :goto_5

    .line 175
    :cond_a
    move-object v0, v5

    .line 176
    :goto_5
    iget-object v1, p0, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->this$0:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;

    .line 177
    .line 178
    if-eq p1, v0, :cond_c

    .line 179
    .line 180
    iget-object p1, v1, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世:Ljava/lang/Runnable;

    .line 181
    .line 182
    if-nez p1, :cond_b

    .line 183
    .line 184
    new-instance p1, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲世兰;

    .line 185
    .line 186
    invoke-direct {p1, v1, v2}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲世兰;-><init>(Ljava/lang/Object;I)V

    .line 187
    .line 188
    .line 189
    iput-object p1, v1, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世:Ljava/lang/Runnable;

    .line 190
    .line 191
    :cond_b
    iget-object v0, v1, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 192
    .line 193
    invoke-virtual {v0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 194
    .line 195
    .line 196
    goto :goto_6

    .line 197
    :cond_c
    iget-object p1, v1, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世兰哲:Landroid/view/ActionMode;

    .line 198
    .line 199
    if-eqz p1, :cond_d

    .line 200
    .line 201
    invoke-virtual {p1}, Landroid/view/ActionMode;->finish()V

    .line 202
    .line 203
    .line 204
    :cond_d
    :goto_6
    iget-object p1, p0, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->this$0:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;

    .line 205
    .line 206
    iget-object v0, p1, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏世兰哲;

    .line 207
    .line 208
    if-eqz v0, :cond_e

    .line 209
    .line 210
    iget-object p1, p1, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 211
    .line 212
    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 213
    .line 214
    .line 215
    :cond_e
    iget-object p0, p0, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->this$0:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;

    .line 216
    .line 217
    iput-object v5, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世兰哲:Landroid/view/ActionMode;

    .line 218
    .line 219
    return-object v3

    .line 220
    :goto_7
    iget-object v0, p0, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->this$0:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;

    .line 221
    .line 222
    iget-object v0, v0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲:Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;

    .line 223
    .line 224
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰()V

    .line 225
    .line 226
    .line 227
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    iget-object v1, p0, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->this$0:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;

    .line 232
    .line 233
    iget-object v1, v1, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 234
    .line 235
    invoke-virtual {v1}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    if-eqz v1, :cond_f

    .line 240
    .line 241
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    goto :goto_8

    .line 246
    :cond_f
    move-object v1, v5

    .line 247
    :goto_8
    iget-object v3, p0, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->this$0:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;

    .line 248
    .line 249
    if-eq v0, v1, :cond_11

    .line 250
    .line 251
    iget-object v0, v3, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世:Ljava/lang/Runnable;

    .line 252
    .line 253
    if-nez v0, :cond_10

    .line 254
    .line 255
    new-instance v0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲世兰;

    .line 256
    .line 257
    invoke-direct {v0, v3, v2}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲世兰;-><init>(Ljava/lang/Object;I)V

    .line 258
    .line 259
    .line 260
    iput-object v0, v3, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世:Ljava/lang/Runnable;

    .line 261
    .line 262
    :cond_10
    iget-object v1, v3, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 263
    .line 264
    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 265
    .line 266
    .line 267
    goto :goto_9

    .line 268
    :cond_11
    iget-object v0, v3, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世兰哲:Landroid/view/ActionMode;

    .line 269
    .line 270
    if-eqz v0, :cond_12

    .line 271
    .line 272
    invoke-virtual {v0}, Landroid/view/ActionMode;->finish()V

    .line 273
    .line 274
    .line 275
    :cond_12
    :goto_9
    iget-object v0, p0, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->this$0:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;

    .line 276
    .line 277
    iget-object v1, v0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏世兰哲;

    .line 278
    .line 279
    if-eqz v1, :cond_13

    .line 280
    .line 281
    iget-object v0, v0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 282
    .line 283
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 284
    .line 285
    .line 286
    :cond_13
    iget-object p0, p0, Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$showTextContextMenu$2;->this$0:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;

    .line 287
    .line 288
    iput-object v5, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世兰哲:Landroid/view/ActionMode;

    .line 289
    .line 290
    throw p1
.end method
