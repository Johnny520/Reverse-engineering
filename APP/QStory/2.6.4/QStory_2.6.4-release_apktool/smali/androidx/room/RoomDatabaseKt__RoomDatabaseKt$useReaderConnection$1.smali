.class final Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1;
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
        0x1d7,
        0x1d7
    }
    m = "useReaderConnection"
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
            "Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1;",
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
    iput-object p1, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1;->label:I

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
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v2

    .line 32
    :cond_1
    iget-object v0, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1;->L$1:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 35
    .line 36
    iget-object v4, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1;->L$0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v4, Landroidx/room/飘花落叶言子楪兰哲苏世;

    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iput-object v2, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    iput-object v2, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1;->L$1:Ljava/lang/Object;

    .line 50
    .line 51
    iput v4, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1;->label:I

    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    invoke-static {v2, p1, p0}, Landroidx/room/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(Landroidx/room/飘花落叶言子楪兰哲苏世;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v1, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    move-object v0, v2

    .line 62
    move-object v4, v0

    .line 63
    :goto_0
    check-cast p1, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 64
    .line 65
    sget-object v5, Landroidx/room/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲苏兰世:Landroidx/room/飘花落叶言子世楪哲苏兰;

    .line 66
    .line 67
    invoke-interface {p1, v5}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance v5, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2;

    .line 72
    .line 73
    invoke-direct {v5, v4, v0, v2}, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2;-><init>(Landroidx/room/飘花落叶言子楪兰哲苏世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 74
    .line 75
    .line 76
    iput-object v2, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1;->L$0:Ljava/lang/Object;

    .line 77
    .line 78
    iput-object v2, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1;->L$1:Ljava/lang/Object;

    .line 79
    .line 80
    iput v3, p0, Landroidx/room/RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1;->label:I

    .line 81
    .line 82
    invoke-static {p1, v5, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏兰楪(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-ne p0, v1, :cond_4

    .line 87
    .line 88
    :goto_1
    return-object v1

    .line 89
    :cond_4
    return-object p0
.end method
