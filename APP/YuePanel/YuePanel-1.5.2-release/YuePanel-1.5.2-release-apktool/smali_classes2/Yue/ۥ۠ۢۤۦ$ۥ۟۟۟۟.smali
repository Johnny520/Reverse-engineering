.class public final LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۟;
.super LYue/ۥۢ۠ۦ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۥ;


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3"
    f = "Errors.kt"
    i = {}
    l = {
        0x5f
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۢۤۦ;->ۥ۟۟۟۟(LYue/ۥۣ۠ۢۡ;JLYue/ۥۣ۠ۢۢ;)LYue/ۥۣ۠ۢۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e2\u06e0\u06e6;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e5<",
        "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
        "-TT;>;",
        "Ljava/lang/Throwable;",
        "Ljava/lang/Long;",
        "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
        "-",
        "Ljava/lang/Boolean;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public ۥۣ۟۟۠:I

.field public synthetic ۥ۟۟۠ۤ:Ljava/lang/Object;

.field public synthetic ۥ۟۟۠ۥ:J

.field public final synthetic ۥ۟۟۠ۦ:J

.field public final synthetic ۥ۟۟۠ۧ:LYue/ۥۣ۠ۢۢ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(JLYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "Ljava/lang/Throwable;",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/lang/Boolean;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e0\u06e2\u06e4\u06e6$\u06e5\u06df\u06df\u06df\u06df;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۟;->ۥ۟۟۠ۦ:J

    iput-object p3, p0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥۣ۠ۢۢ;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p4}, LYue/ۥۢ۠ۦ;-><init>(ILYue/ۥ۟ۧۤۢ;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۟;->ۥۣ۟۟۠:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iget-object p1, p0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    iget-wide v3, p0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۟;->ۥ۟۟۠ۥ:J

    iget-wide v5, p0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۟;->ۥ۟۟۠ۦ:J

    cmp-long v1, v3, v5

    if-gez v1, :cond_3

    iget-object v1, p0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥۣ۠ۢۢ;

    iput v2, p0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۟;->ۥۣ۟۟۠:I

    invoke-interface {v1, p1, p0}, LYue/ۥۣ۠ۢۢ;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    invoke-static {v2}, LYue/ۥۣ۟ۢ۟;->ۥ(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۠ۦ(LYue/ۥۣۣ۠ۢ;Ljava/lang/Throwable;JLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 3
    .param p1    # LYue/ۥۣۣ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p5    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;",
            "Ljava/lang/Throwable;",
            "J",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۟;

    iget-wide v0, p0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۟;->ۥ۟۟۠ۦ:J

    iget-object v2, p0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥۣ۠ۢۢ;

    invoke-direct {p1, v0, v1, v2, p5}, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۟;-><init>(JLYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)V

    iput-object p2, p1, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-wide p3, p1, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۟;->ۥ۟۟۠ۥ:J

    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {p1, p2}, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۟;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟ۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v1, p1

    check-cast v1, LYue/ۥۣۣ۠ۢ;

    move-object v2, p2

    check-cast v2, Ljava/lang/Throwable;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    move-object v5, p4

    check-cast v5, LYue/ۥ۟ۧۤۢ;

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۟;->ۥ۟۟۠ۦ(LYue/ۥۣۣ۠ۢ;Ljava/lang/Throwable;JLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
