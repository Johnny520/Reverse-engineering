.class public final LYue/ۥۣ۠ۢۤ$ۥ۟۟;
.super LYue/ۥۢ۠ۦ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۤ;


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1"
    f = "Delay.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0xde,
        0x163
    }
    m = "invokeSuspend"
    n = {
        "downstream",
        "values",
        "lastValue",
        "timeoutMillis",
        "downstream",
        "values",
        "lastValue",
        "timeoutMillis"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0",
        "L$1",
        "L$2",
        "L$3"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۠ۢۤ;->ۥ۟۟۟۟(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۣ۠ۢۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e2\u06e0\u06e6;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
        "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
        "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
        "-TT;>;",
        "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
        "-",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,348:1\n18#2:349\n18#2:351\n1#3:350\n199#4,11:352\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n*L\n219#1:349\n222#1:351\n229#1:352,11\n*E\n"
.end annotation


# instance fields
.field public ۥۣ۟۟۠:Ljava/lang/Object;

.field public ۥ۟۟۠ۤ:Ljava/lang/Object;

.field public ۥ۟۟۠ۥ:I

.field public synthetic ۥ۟۟۠ۦ:Ljava/lang/Object;

.field public synthetic ۥ۟۟۠ۧ:Ljava/lang/Object;

.field public final synthetic ۥ۟۟۠ۨ:LYue/ۥۣ۠ۡ۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "TT;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟ۡ:LYue/ۥۣ۠ۢۡ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;",
            "Ljava/lang/Long;",
            ">;",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e0\u06e2\u06e4\u06e3$\u06e5\u06df\u06df;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۨ:LYue/ۥۣ۠ۡ۟;

    iput-object p2, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۠ۢۡ;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, LYue/ۥۢ۠ۦ;-><init>(ILYue/ۥ۟ۧۤۢ;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۥ:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object v1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;

    iget-object v1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    iget-object v5, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    check-cast v5, LYue/ۥۡۦۡۡ;

    iget-object v6, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    check-cast v6, LYue/ۥۣۣ۠ۢ;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :cond_0
    move-object v7, v6

    move-object v6, v5

    move-object v5, v1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;

    iget-object v5, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v5, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    iget-object v6, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    check-cast v6, LYue/ۥۡۦۡۡ;

    iget-object v7, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    check-cast v7, LYue/ۥۣۣ۠ۢ;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iget-object p1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, LYue/ۥ۟ۧۧۥ;

    iget-object p1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۣۣ۠ۢ;

    new-instance v8, LYue/ۥۣ۠ۢۤ$ۥ۟۟$ۥ۟۟;

    iget-object v1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۠ۢۡ;

    invoke-direct {v8, v1, v4}, LYue/ۥۣ۠ۢۤ$ۥ۟۟$ۥ۟۟;-><init>(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۤۢ;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, LYue/ۥۡۥۡۢ;->ۥ۟۟۟ۢ(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;

    move-result-object v1

    new-instance v5, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-direct {v5}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;-><init>()V

    move-object v7, p1

    move-object v6, v1

    :goto_0
    iget-object p1, v5, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    sget-object v1, LYue/ۥۡۢۧ;->ۥ۟۟:LYue/ۥۢ۠ۦۢ;

    if-eq p1, v1, :cond_b

    new-instance v1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;

    invoke-direct {v1}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;-><init>()V

    iget-object p1, v5, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    if-eqz p1, :cond_7

    iget-object v8, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۨ:LYue/ۥۣ۠ۡ۟;

    sget-object v9, LYue/ۥۡۢۧ;->ۥ:LYue/ۥۢ۠ۦۢ;

    if-ne p1, v9, :cond_4

    move-object p1, v4

    :cond_4
    invoke-interface {v8, p1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v10

    iput-wide v10, v1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:J

    const-wide/16 v12, 0x0

    cmp-long p1, v10, v12

    if-ltz p1, :cond_8

    cmp-long p1, v10, v12

    if-nez p1, :cond_7

    iget-object p1, v5, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    if-ne p1, v9, :cond_5

    move-object p1, v4

    :cond_5
    iput-object v7, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iput-object v6, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    iput-object v5, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object v1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v3, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۥ:I

    invoke-interface {v7, p1, p0}, LYue/ۥۣۣ۠ۢ;->ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_1
    iput-object v4, v5, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    :cond_7
    move-object p1, v1

    move-object v1, v5

    move-object v5, v6

    move-object v6, v7

    goto :goto_2

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Debounce timeout should not be negative"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_2
    iput-object v6, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iput-object v5, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    iput-object v1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v2, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۥ:I

    new-instance v7, LYue/ۥۡۧۨۥ;

    invoke-direct {v7, p0}, LYue/ۥۡۧۨۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :try_start_0
    iget-object v8, v1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    if-eqz v8, :cond_9

    iget-wide v8, p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:J

    new-instance p1, LYue/ۥۣ۠ۢۤ$ۥ۟۟$ۥ;

    invoke-direct {p1, v6, v1, v4}, LYue/ۥۣ۠ۢۤ$ۥ۟۟$ۥ;-><init>(LYue/ۥۣۣ۠ۢ;LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;LYue/ۥ۟ۧۤۢ;)V

    invoke-interface {v7, v8, v9, p1}, LYue/ۥۡۧۨۤ;->ۥۣ۟۟ۢ(JLYue/ۥۣ۠ۡ۟;)V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_9
    :goto_3
    invoke-interface {v5}, LYue/ۥۡۦۡۡ;->ۥ۟۟۟ۧ()LYue/ۥۡۧۨۧ;

    move-result-object p1

    new-instance v8, LYue/ۥۣ۠ۢۤ$ۥ۟۟$ۥ۟;

    invoke-direct {v8, v1, v6, v4}, LYue/ۥۣ۠ۢۤ$ۥ۟۟$ۥ۟;-><init>(LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)V

    invoke-interface {v7, p1, v8}, LYue/ۥۡۧۨۤ;->ۥ۟۟۠ۦ(LYue/ۥۡۧۨۧ;LYue/ۥۣ۠ۢۢ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :goto_4
    invoke-virtual {v7, p1}, LYue/ۥۡۧۨۥ;->ۥ۟۟ۧۢ(Ljava/lang/Throwable;)V

    :goto_5
    invoke-virtual {v7}, LYue/ۥۡۧۨۥ;->ۥ۟۟ۧۡ()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v7

    if-ne p1, v7, :cond_a

    invoke-static {p0}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_a
    if-ne p1, v0, :cond_0

    return-object v0

    :cond_b
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥ۟ۧۧۥ;

    check-cast p2, LYue/ۥۣۣ۠ۢ;

    check-cast p3, LYue/ۥ۟ۧۤۢ;

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۦ(LYue/ۥ۟ۧۧۥ;LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۠ۦ(LYue/ۥ۟ۧۧۥ;LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 3
    .param p1    # LYue/ۥ۟ۧۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣۣ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;

    iget-object v1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۨ:LYue/ۥۣ۠ۡ۟;

    iget-object v2, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۠ۢۡ;

    invoke-direct {v0, v1, v2, p3}, LYue/ۥۣ۠ۢۤ$ۥ۟۟;-><init>(LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۤۢ;)V

    iput-object p1, v0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iput-object p2, v0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۢۤ$ۥ۟۟;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
