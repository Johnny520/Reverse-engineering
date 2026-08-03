.class public final LYue/ۥۣ۟ۤۡ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۣ۠ۢ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟ۤۡ;->ۥ۟۟۟ۡ(LYue/ۥۡۥۡۤ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۠ۦ۟ۡ;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۣۡۨ۟;

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۡۥۡۤ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e5\u06e1\u06e4<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۦ:LYue/ۥۡۨۡۧ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e8\u06e1\u06e7<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۠ۦ۟ۡ;LYue/ۥۣۡۨ۟;LYue/ۥۡۥۡۤ;LYue/ۥۡۨۡۧ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e6\u06df\u06e1;",
            "LYue/\u06e5\u06e1\u06e8\u06df\u06e3;",
            "LYue/\u06e5\u06e1\u06e5\u06e1\u06e4<",
            "-TT;>;",
            "LYue/\u06e5\u06e1\u06e8\u06e1\u06e7<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣ۟ۤۡ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۦ۟ۡ;

    iput-object p2, p0, LYue/ۥۣ۟ۤۡ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۨ۟;

    iput-object p3, p0, LYue/ۥۣ۟ۤۡ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۥۡۤ;

    iput-object p4, p0, LYue/ۥۣ۟ۤۡ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥۡۨۡۧ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 7
    .param p1    # LYue/ۥۣ۠ۢۡ;
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
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥۣ۟ۤۡ$ۥ$ۥ۟;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥۣ۟ۤۡ$ۥ$ۥ۟;

    iget v1, v0, LYue/ۥۣ۟ۤۡ$ۥ$ۥ۟;->ۥ۟۟۠ۧ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۤۡ$ۥ$ۥ۟;->ۥ۟۟۠ۧ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۤۡ$ۥ$ۥ۟;

    invoke-direct {v0, p0, p2}, LYue/ۥۣ۟ۤۡ$ۥ$ۥ۟;-><init>(LYue/ۥۣ۟ۤۡ$ۥ;LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥۣ۟ۤۡ$ۥ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۤۡ$ۥ$ۥ۟;->ۥ۟۟۠ۧ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LYue/ۥۣ۟ۤۡ$ۥ$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۣ۠ۢۡ;

    iget-object v0, v0, LYue/ۥۣ۟ۤۡ$ۥ$ۥ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v0, LYue/ۥۣ۟ۤۡ$ۥ;

    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iget-object p2, p0, LYue/ۥۣ۟ۤۡ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۦ۟ۡ;

    if-eqz p2, :cond_3

    invoke-static {p2}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟۟ۡ۟(LYue/ۥ۠ۦ۟ۡ;)V

    :cond_3
    iget-object p2, p0, LYue/ۥۣ۟ۤۡ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۨ۟;

    iput-object p0, v0, LYue/ۥۣ۟ۤۡ$ۥ$ۥ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۣ۟ۤۡ$ۥ$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۣ۟ۤۡ$ۥ$ۥ۟;->ۥ۟۟۠ۧ:I

    invoke-interface {p2, v0}, LYue/ۥۣۡۨ۟;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v0, p0

    :goto_1
    iget-object v1, v0, LYue/ۥۣ۟ۤۡ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۥۡۤ;

    new-instance v4, LYue/ۥۣ۟ۤۡ$ۥ$ۥ;

    iget-object p2, v0, LYue/ۥۣ۟ۤۡ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥۡۨۡۧ;

    iget-object v0, v0, LYue/ۥۣ۟ۤۡ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۨ۟;

    const/4 v2, 0x0

    invoke-direct {v4, p1, p2, v0, v2}, LYue/ۥۣ۟ۤۡ$ۥ$ۥ;-><init>(LYue/ۥۣ۠ۢۡ;LYue/ۥۡۨۡۧ;LYue/ۥۣۡۨ۟;LYue/ۥ۟ۧۤۢ;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LYue/ۥۣ۟ۤ۠;->ۥ۟۟۟۟(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥ۠ۦ۟ۡ;

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥۣ۠ۢۡ;

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۟ۤۡ$ۥ;->ۥ(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
