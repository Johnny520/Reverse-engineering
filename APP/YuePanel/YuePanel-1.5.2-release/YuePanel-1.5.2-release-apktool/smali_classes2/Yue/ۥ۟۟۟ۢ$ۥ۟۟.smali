.class public final LYue/ۥ۟۟۟ۢ$ۥ۟۟;
.super LYue/ۥۡۦۧۢ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۢ;


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "okio.internal.-FileSystem$commonListRecursively$1"
    f = "FileSystem.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x60
    }
    m = "invokeSuspend"
    n = {
        "$this$sequence",
        "stack"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟۟۟ۢ;->ۥ۟۟۟۠(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;Z)LYue/ۥۡۨۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e1\u06e6\u06e7\u06e2;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
        "LYue/\u06e5\u06e1\u06e8\u06e2\u06e0<",
        "-",
        "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
        ">;",
        "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
        "-",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public ۥ۟۟۠ۤ:Ljava/lang/Object;

.field public ۥ۟۟۠ۥ:Ljava/lang/Object;

.field public ۥ۟۟۠ۦ:I

.field public synthetic ۥ۟۟۠ۧ:Ljava/lang/Object;

.field public final synthetic ۥ۟۟۠ۨ:LYue/ۥۣۡۧۧ;

.field public final synthetic ۥ۟۟ۡ:LYue/ۥ۠ۡۨۤ;

.field public final synthetic ۥ۟۟ۡ۟:Z


# direct methods
.method public constructor <init>(LYue/ۥۣۡۧۧ;LYue/ۥ۠ۡۨۤ;ZLYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            "LYue/\u06e5\u06e0\u06e1\u06e8\u06e4;",
            "Z",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06df\u06df\u06df\u06e2$\u06e5\u06df\u06df;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->ۥ۟۟۠ۨ:LYue/ۥۣۡۧۧ;

    iput-object p2, p0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥ۠ۡۨۤ;

    iput-boolean p3, p0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->ۥ۟۟ۡ۟:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, LYue/ۥۡۦۧۢ;-><init>(ILYue/ۥ۟ۧۤۢ;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "*>;)",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;

    iget-object v1, p0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->ۥ۟۟۠ۨ:LYue/ۥۣۡۧۧ;

    iget-object v2, p0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥ۠ۡۨۤ;

    iget-boolean v3, p0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->ۥ۟۟ۡ۟:Z

    invoke-direct {v0, v1, v2, v3, p2}, LYue/ۥ۟۟۟ۢ$ۥ۟۟;-><init>(LYue/ۥۣۡۧۧ;LYue/ۥ۠ۡۨۤ;ZLYue/ۥ۟ۧۤۢ;)V

    iput-object p1, v0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥۡۨۢ۠;

    check-cast p2, LYue/ۥ۟ۧۤۢ;

    invoke-virtual {p0, p1, p2}, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->ۥ۟۟۠ۦ(LYue/ۥۡۨۢ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->ۥ۟۟۠ۦ:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    iget-object v3, p0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v3, LYue/ۥ۟ۡۧۡ;

    iget-object v4, p0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    check-cast v4, LYue/ۥۡۨۢ۠;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    move-object p1, v3

    move-object v10, v4

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iget-object p1, p0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۨۢ۠;

    new-instance v1, LYue/ۥ۟ۡۧۡ;

    invoke-direct {v1}, LYue/ۥ۟ۡۧۡ;-><init>()V

    iget-object v3, p0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->ۥ۟۟۠ۨ:LYue/ۥۣۡۧۧ;

    invoke-virtual {v1, v3}, LYue/ۥ۟ۡۧۡ;->addLast(Ljava/lang/Object;)V

    iget-object v3, p0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥ۠ۡۨۤ;

    iget-object v4, p0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->ۥ۟۟۠ۨ:LYue/ۥۣۡۧۧ;

    invoke-virtual {v3, v4}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۠ۨ(LYue/ۥۣۡۧۧ;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v10, p1

    move-object p1, v1

    move-object v1, v3

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, LYue/ۥۣۡۧۧ;

    iget-object v4, p0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥ۠ۡۨۤ;

    iget-boolean v7, p0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->ۥ۟۟ۡ۟:Z

    iput-object v10, p0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    iput-object p1, p0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object v1, p0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v2, p0, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->ۥ۟۟۠ۦ:I

    const/4 v8, 0x0

    move-object v3, v10

    move-object v5, p1

    move-object v9, p0

    invoke-static/range {v3 .. v9}, LYue/ۥ۟۟۟ۢ;->ۥ(LYue/ۥۡۨۢ۠;LYue/ۥ۠ۡۨۤ;LYue/ۥ۟ۡۧۡ;LYue/ۥۣۡۧۧ;ZZLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_2

    return-object v0

    :cond_3
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public final ۥ۟۟۠ۦ(LYue/ۥۡۨۢ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .param p1    # LYue/ۥۡۨۢ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e8\u06e2\u06e0<",
            "-",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->create(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object p1

    check-cast p1, LYue/ۥ۟۟۟ۢ$ۥ۟۟;

    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {p1, p2}, LYue/ۥ۟۟۟ۢ$ۥ۟۟;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
