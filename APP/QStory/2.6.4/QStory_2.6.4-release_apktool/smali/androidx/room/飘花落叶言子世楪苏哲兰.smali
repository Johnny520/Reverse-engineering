.class public final Landroidx/room/飘花落叶言子世楪苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroidx/room/飘花落叶言子楪兰哲苏世;

.field public final synthetic 飘花落叶言子楪哲兰苏世:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;Landroidx/room/飘花落叶言子楪兰哲苏世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/room/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/room/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲兰世苏:Landroidx/room/飘花落叶言子楪兰哲苏世;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/room/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/room/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, v0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    sget-object v2, Lkotlin/coroutines/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Lkotlin/coroutines/飘花落叶言子楪世哲兰苏;

    .line 6
    .line 7
    invoke-interface {v1, v2}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->minusKey(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, Landroidx/room/RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1;

    .line 12
    .line 13
    iget-object v3, p0, Landroidx/room/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲兰世苏:Landroidx/room/飘花落叶言子楪兰哲苏世;

    .line 14
    .line 15
    iget-object p0, p0, Landroidx/room/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-direct {v2, v3, v0, p0, v4}, Landroidx/room/RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1;-><init>(Landroidx/room/飘花落叶言子楪兰哲苏世;Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v2}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世苏哲兰楪(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    invoke-virtual {v0, p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)Z

    .line 27
    .line 28
    .line 29
    return-void
.end method
