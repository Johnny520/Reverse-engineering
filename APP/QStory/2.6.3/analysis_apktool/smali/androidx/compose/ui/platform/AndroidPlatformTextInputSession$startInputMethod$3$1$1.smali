.class final Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$3$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "it",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "invoke",
        "(Ljava/lang/Throwable;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $methodSession:Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;

.field final synthetic this$0:Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$3$1$1;->$methodSession:Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$3$1$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 70
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$3$1$1;->invoke(Ljava/lang/Throwable;)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 7

    .line 1
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$3$1$1;->$methodSession:Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;

    .line 2
    .line 3
    iget-object v0, p1, Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    const/4 v1, 0x1

    .line 7
    :try_start_0
    iput-boolean v1, p1, Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世兰苏哲:Z

    .line 8
    .line 9
    iget-object v1, p1, Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世哲兰苏:Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 10
    .line 11
    iget-object v2, v1, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;

    .line 12
    .line 13
    iget v1, v1, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    const/4 v4, 0x0

    .line 17
    if-ge v3, v1, :cond_1

    .line 18
    .line 19
    aget-object v5, v2, v3

    .line 20
    .line 21
    check-cast v5, Landroidx/compose/ui/node/飘花落叶言子哲楪兰世苏;

    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    check-cast v5, Landroidx/compose/ui/text/input/飘花落叶言子楪哲世苏兰;

    .line 28
    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    check-cast v5, Landroidx/compose/ui/text/input/飘花落叶言子楪哲世兰苏;

    .line 32
    .line 33
    iget-object v6, v5, Landroidx/compose/ui/text/input/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Landroid/view/inputmethod/InputConnection;

    .line 34
    .line 35
    if-eqz v6, :cond_0

    .line 36
    .line 37
    invoke-interface {v6}, Landroid/view/inputmethod/InputConnection;->closeConnection()V

    .line 38
    .line 39
    .line 40
    iput-object v4, v5, Landroidx/compose/ui/text/input/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Landroid/view/inputmethod/InputConnection;

    .line 41
    .line 42
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    iget-object p1, p1, Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世哲兰苏:Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    monitor-exit v0

    .line 53
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$3$1$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;

    .line 54
    .line 55
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰世苏:Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲苏世;

    .line 56
    .line 57
    iget-object p1, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/atomic/AtomicReference;

    .line 58
    .line 59
    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰苏世;

    .line 63
    .line 64
    invoke-interface {p0}, Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :goto_1
    monitor-exit v0

    .line 69
    throw p0
.end method
