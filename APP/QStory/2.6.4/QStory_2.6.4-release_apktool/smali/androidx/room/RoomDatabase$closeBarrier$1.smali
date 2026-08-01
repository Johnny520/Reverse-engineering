.class final synthetic Landroidx/room/RoomDatabase$closeBarrier$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    .line 1
    const-string v5, "onClosed()V"

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    const-class v3, Landroidx/room/飘花落叶言子楪兰哲苏世;

    .line 6
    .line 7
    const-string v4, "onClosed"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    move-object v2, p1

    .line 11
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 49
    invoke-virtual {p0}, Landroidx/room/RoomDatabase$closeBarrier$1;->invoke()V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke()V
    .locals 2

    .line 1
    iget-object p0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/room/飘花落叶言子楪兰哲苏世;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/internal/飘花落叶言子楪世哲兰苏;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏兰世哲(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Ljava/util/concurrent/CancellationException;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世兰苏哲()Landroidx/room/飘花落叶言子楪苏哲世兰;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世兰苏哲:Landroidx/constraintlayout/core/widgets/analyzer/飘花落叶言子楪世兰苏哲;

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/constraintlayout/core/widgets/analyzer/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Landroidx/room/coroutines/飘花落叶言子楪世哲苏兰;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Landroidx/constraintlayout/core/widgets/analyzer/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏兰哲;

    .line 30
    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void

    .line 37
    :cond_1
    const-string p0, "connectionManager"

    .line 38
    .line 39
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v1

    .line 43
    :cond_2
    const-string p0, "coroutineScope"

    .line 44
    .line 45
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v1
.end method
