.class public final Landroidx/compose/ui/platform/飘花落叶言子世苏兰哲楪;
.super Ljava/lang/ThreadLocal;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/ui/platform/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final initialValue()Ljava/lang/Object;
    .locals 2

    .line 1
    iget p0, p0, Landroidx/compose/ui/platform/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/text/SimpleDateFormat;

    .line 7
    .line 8
    const-string v0, "EEE, dd MMM yyyy HH:mm:ss \'GMT\'"

    .line 9
    .line 10
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 11
    .line 12
    invoke-direct {p0, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, v0}, Ljava/text/DateFormat;->setLenient(Z)V

    .line 17
    .line 18
    .line 19
    sget-object v0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/TimeZone;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    new-instance p0, Ljava/util/Random;

    .line 26
    .line 27
    invoke-direct {p0}, Ljava/util/Random;-><init>()V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_1
    new-instance p0, Landroidx/compose/ui/platform/飘花落叶言子世哲楪兰苏;

    .line 32
    .line 33
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    invoke-static {v1}, L飘花落叶言世兰苏哲楪子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Landroid/os/Looper;)Landroid/os/Handler;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-direct {p0, v0, v1}, Landroidx/compose/ui/platform/飘花落叶言子世哲楪兰苏;-><init>(Landroid/view/Choreographer;Landroid/os/Handler;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Landroidx/compose/ui/platform/飘花落叶言子世哲楪兰苏;->飘花落叶言子世楪苏兰哲:Landroidx/compose/ui/platform/飘花落叶言子世哲苏兰楪;

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const-string p0, "no Looper on this thread"

    .line 58
    .line 59
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    :goto_0
    return-object p0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
