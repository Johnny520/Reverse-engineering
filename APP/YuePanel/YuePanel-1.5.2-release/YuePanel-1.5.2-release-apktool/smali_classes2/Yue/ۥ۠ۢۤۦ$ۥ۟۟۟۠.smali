.class public final LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۡ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۢۤۦ;->ۥ۟۟۟ۡ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۥ;)LYue/ۥۣ۠ۢۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
        "TT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n1#1,112:1\n133#2,15:113\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۣ۠ۢۡ;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۣ۠ۢۥ;


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۥ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠;->ۥۣ۟۟۠:LYue/ۥۣ۠ۢۡ;

    iput-object p2, p0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:LYue/ۥۣ۠ۢۥ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 11
    .param p1    # LYue/ۥۣۣ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;

    iget v1, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۤ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۤ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;

    invoke-direct {v0, p0, p2}, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;-><init>(LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠;LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۤ:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide v5, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟ۡ:J

    iget-object p1, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    iget-object v2, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    check-cast v2, LYue/ۥۣۣ۠ۢ;

    iget-object v7, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    check-cast v7, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠;

    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟ۡ۟:I

    iget-wide v5, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟ۡ:J

    iget-object v2, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    check-cast v2, LYue/ۥۣۣ۠ۢ;

    iget-object v7, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    check-cast v7, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠;

    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    const-wide/16 v5, 0x0

    move-object p2, p0

    :goto_1
    iget-object v2, p2, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠;->ۥۣ۟۟۠:LYue/ۥۣ۠ۢۡ;

    iput-object p2, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    const/4 v7, 0x0

    iput-object v7, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/Object;

    iput-wide v5, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟ۡ:J

    const/4 v7, 0x0

    iput v7, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟ۡ۟:I

    iput v4, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۤ:I

    invoke-static {v2, p1, v0}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟۠ۥ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v10, v2

    move-object v2, p1

    move p1, v7

    move-object v7, p2

    move-object p2, v10

    :goto_2
    check-cast p2, Ljava/lang/Throwable;

    if-eqz p2, :cond_6

    iget-object p1, v7, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:LYue/ۥۣ۠ۢۥ;

    invoke-static {v5, v6}, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۡ(J)Ljava/lang/Long;

    move-result-object v8

    iput-object v7, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iput-object v2, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    iput-object p2, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/Object;

    iput-wide v5, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟ۡ:J

    iput v3, v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۤ:I

    const/4 v9, 0x6

    invoke-static {v9}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    invoke-interface {p1, v2, p2, v8, v0}, LYue/ۥۣ۠ۢۥ;->ۥ۟۟ۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v8, 0x7

    invoke-static {v8}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    move-object v10, p2

    move-object p2, p1

    move-object p1, v10

    :goto_3
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_7

    const-wide/16 p1, 0x1

    add-long/2addr v5, p1

    move p1, v4

    :cond_6
    move-object p2, v7

    goto :goto_4

    :cond_7
    throw p1

    :goto_4
    if-nez p1, :cond_8

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1

    :cond_8
    move-object p1, v2

    goto :goto_1
.end method
