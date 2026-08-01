.class final Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/coroutines/jvm/internal/ContinuationImpl;"
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

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt"
    f = "RoomDatabase.kt"
    l = {
        0x1f5,
        0x1f5
    }
    m = "useWriterConnection"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iput-object p1, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1;->label:I

    .line 10
    .line 11
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x2

    .line 15
    const/4 v4, 0x1

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    if-eq v0, v4, :cond_1

    .line 19
    .line 20
    if-ne v0, v3, :cond_0

    .line 21
    .line 22
    iget-object p0, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1;->L$0:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Landroidx/room/飘花落叶言子楪兰哲苏世;

    .line 25
    .line 26
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v2

    .line 36
    :cond_1
    iget-object v0, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1;->L$1:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 39
    .line 40
    iget-object v4, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v4, Landroidx/room/飘花落叶言子楪兰哲苏世;

    .line 43
    .line 44
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iput-object v2, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1;->L$0:Ljava/lang/Object;

    .line 52
    .line 53
    iput-object v2, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    iput v4, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1;->label:I

    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    invoke-static {v2, p1, p0}, Landroidx/room/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(Landroidx/room/飘花落叶言子楪兰哲苏世;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v1, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    move-object v0, v2

    .line 66
    move-object v4, v0

    .line 67
    :goto_0
    check-cast p1, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 68
    .line 69
    sget-object v5, Landroidx/room/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲苏兰世:Landroidx/room/飘花落叶言子世楪哲苏兰;

    .line 70
    .line 71
    invoke-interface {p1, v5}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    new-instance v5, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2;

    .line 76
    .line 77
    invoke-direct {v5, v4, v0, v2}, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2;-><init>(Landroidx/room/飘花落叶言子楪兰哲苏世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 78
    .line 79
    .line 80
    iput-object v4, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1;->L$0:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object v2, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1;->L$1:Ljava/lang/Object;

    .line 83
    .line 84
    iput v3, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1;->label:I

    .line 85
    .line 86
    invoke-static {p1, v5, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏兰楪(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v1, :cond_4

    .line 91
    .line 92
    :goto_1
    return-object v1

    .line 93
    :cond_4
    move-object p0, v4

    .line 94
    :goto_2
    invoke-virtual {p0}, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世兰苏哲()Landroidx/room/飘花落叶言子楪苏哲世兰;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p0}, Landroidx/room/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰()V

    .line 99
    .line 100
    .line 101
    return-object p1
.end method
