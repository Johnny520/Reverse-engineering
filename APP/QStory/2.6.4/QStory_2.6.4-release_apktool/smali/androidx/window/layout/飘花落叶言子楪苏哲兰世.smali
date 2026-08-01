.class public final Landroidx/window/layout/飘花落叶言子楪苏哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/window/layout/飘花落叶言子楪苏世哲兰;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世苏哲兰;


# direct methods
.method public constructor <init>(Landroidx/window/layout/飘花落叶言子楪哲苏世兰;L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世苏哲兰;L飘花落叶言世哲苏子楪兰/飘花落叶言子苏楪世哲兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Landroidx/window/layout/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世苏哲兰;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Landroid/content/Context;)Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/window/layout/WindowInfoTrackerImpl$windowLayoutInfo$1;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, p1, v1}, Landroidx/window/layout/WindowInfoTrackerImpl$windowLayoutInfo$1;-><init>(Landroidx/window/layout/飘花落叶言子楪苏哲兰世;Landroid/content/Context;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 8
    .line 9
    .line 10
    new-instance p0, Lkotlinx/coroutines/flow/飘花落叶言子楪世苏兰哲;

    .line 11
    .line 12
    sget-object p1, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 13
    .line 14
    const/4 v2, -0x2

    .line 15
    sget-object v3, Lkotlinx/coroutines/channels/BufferOverflow;->SUSPEND:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 16
    .line 17
    invoke-direct {p0, v0, p1, v2, v3}, Lkotlinx/coroutines/flow/飘花落叶言子楪世苏兰哲;-><init>(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;ILkotlinx/coroutines/channels/BufferOverflow;)V

    .line 18
    .line 19
    .line 20
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 21
    .line 22
    sget-object v0, Lkotlinx/coroutines/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲兰子楪/飘花落叶言子楪世哲兰苏;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    sget-object v2, Lkotlinx/coroutines/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏世哲兰楪;

    .line 28
    .line 29
    invoke-static {v0, v2}, L飘花落叶言楪兰哲世苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪兰哲苏(Lkotlin/coroutines/飘花落叶言子楪世兰苏哲;Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0, p1}, L飘花落叶言世苏哲兰子楪/飘花落叶言子楪世哲兰苏;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_0
    const/4 p1, 0x0

    .line 43
    const/4 v2, 0x6

    .line 44
    invoke-static {p0, v0, p1, v1, v2}, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏(Lkotlinx/coroutines/flow/internal/飘花落叶言子楪哲苏世兰;L飘花落叶言世苏哲兰子楪/飘花落叶言子楪世哲兰苏;ILkotlinx/coroutines/channels/BufferOverflow;I)Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :cond_1
    const-string p0, "Flow context cannot contain job in it. Had "

    .line 50
    .line 51
    invoke-static {v0, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v1
.end method
