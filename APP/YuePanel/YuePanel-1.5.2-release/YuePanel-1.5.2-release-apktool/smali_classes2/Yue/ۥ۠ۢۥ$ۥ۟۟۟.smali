.class public final LYue/ۥ۠ۢۥ$ۥ۟۟۟;
.super LYue/ۥۢ۠ۦ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۤ;


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2"
    f = "Migration.kt"
    i = {}
    l = {
        0x132
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۢۥ;->ۥ۟۟۠ۤ(LYue/ۥۣ۠ۢۡ;Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;)LYue/ۥۣ۠ۢۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e2\u06e0\u06e6;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
        "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
        "-TT;>;",
        "Ljava/lang/Throwable;",
        "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
        "-",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public ۥۣ۟۟۠:I

.field public synthetic ۥ۟۟۠ۤ:Ljava/lang/Object;

.field public synthetic ۥ۟۟۠ۥ:Ljava/lang/Object;

.field public final synthetic ۥ۟۟۠ۦ:LYue/ۥۣ۠ۡ۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "Ljava/lang/Throwable;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۧ:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/lang/Throwable;",
            "Ljava/lang/Boolean;",
            ">;TT;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e0\u06e2\u06e5$\u06e5\u06df\u06df\u06df;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۢۥ$ۥ۟۟۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۡ۟;

    iput-object p2, p0, LYue/ۥ۠ۢۥ$ۥ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, LYue/ۥۢ۠ۦ;-><init>(ILYue/ۥ۟ۧۤۢ;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LYue/ۥ۠ۢۥ$ۥ۟۟۟;->ۥۣ۟۟۠:I

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

    iget-object p1, p0, LYue/ۥ۠ۢۥ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۣۣ۠ۢ;

    iget-object v1, p0, LYue/ۥ۠ۢۥ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    iget-object v3, p0, LYue/ۥ۠ۢۥ$ۥ۟۟۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۡ۟;

    invoke-interface {v3, v1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v1, p0, LYue/ۥ۠ۢۥ$ۥ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    const/4 v3, 0x0

    iput-object v3, p0, LYue/ۥ۠ۢۥ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v2, p0, LYue/ۥ۠ۢۥ$ۥ۟۟۟;->ۥۣ۟۟۠:I

    invoke-interface {p1, v1, p0}, LYue/ۥۣۣ۠ۢ;->ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1

    :cond_3
    throw v1
.end method

.method public bridge synthetic ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥۣۣ۠ۢ;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, LYue/ۥ۟ۧۤۢ;

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥ۠ۢۥ$ۥ۟۟۟;->ۥ۟۟۠ۦ(LYue/ۥۣۣ۠ۢ;Ljava/lang/Throwable;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۠ۦ(LYue/ۥۣۣ۠ۢ;Ljava/lang/Throwable;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 3
    .param p1    # LYue/ۥۣۣ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
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
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۢۥ$ۥ۟۟۟;

    iget-object v1, p0, LYue/ۥ۠ۢۥ$ۥ۟۟۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۡ۟;

    iget-object v2, p0, LYue/ۥ۠ۢۥ$ۥ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    invoke-direct {v0, v1, v2, p3}, LYue/ۥ۠ۢۥ$ۥ۟۟۟;-><init>(LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)V

    iput-object p1, v0, LYue/ۥ۠ۢۥ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p2, v0, LYue/ۥ۠ۢۥ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۢۥ$ۥ۟۟۟;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
