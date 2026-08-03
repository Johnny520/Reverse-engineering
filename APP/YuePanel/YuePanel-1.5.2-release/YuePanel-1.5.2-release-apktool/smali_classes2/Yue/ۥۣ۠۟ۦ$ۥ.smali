.class public final LYue/ۥۣ۠۟ۦ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۣ۠ۢ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۠۟ۦ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
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
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۣ۠۟ۦ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06df\u06e3\u06e6<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e6\u06e2\u06e5$\u06e5\u06df\u06df\u06df\u06e2<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۣۣ۠ۢ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۠۟ۦ;LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;LYue/ۥۣۣ۠ۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06df\u06e3\u06e6<",
            "TT;>;",
            "LYue/\u06e5\u06e1\u06e6\u06e2\u06e5$\u06e5\u06df\u06df\u06df\u06e2<",
            "Ljava/lang/Object;",
            ">;",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣ۠۟ۦ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۠۟ۦ;

    iput-object p2, p0, LYue/ۥۣ۠۟ۦ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    iput-object p3, p0, LYue/ۥۣ۠۟ۦ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣۣ۠ۢ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 5
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥۣ۠۟ۦ$ۥ$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥۣ۠۟ۦ$ۥ$ۥ;

    iget v1, v0, LYue/ۥۣ۠۟ۦ$ۥ$ۥ;->ۥ۟۟۠ۥ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۠۟ۦ$ۥ$ۥ;->ۥ۟۟۠ۥ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۠۟ۦ$ۥ$ۥ;

    invoke-direct {v0, p0, p2}, LYue/ۥۣ۠۟ۦ$ۥ$ۥ;-><init>(LYue/ۥۣ۠۟ۦ$ۥ;LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥۣ۠۟ۦ$ۥ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۠۟ۦ$ۥ$ۥ;->ۥ۟۟۠ۥ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iget-object p2, p0, LYue/ۥۣ۠۟ۦ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۠۟ۦ;

    iget-object p2, p2, LYue/ۥۣ۠۟ۦ;->ۥ۟۟۠ۤ:LYue/ۥۣ۠ۡ۟;

    invoke-interface {p2, p1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iget-object v2, p0, LYue/ۥۣ۠۟ۦ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    iget-object v2, v2, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    sget-object v4, LYue/ۥۡۢۧ;->ۥ:LYue/ۥۢ۠ۦۢ;

    if-eq v2, v4, :cond_4

    iget-object v4, p0, LYue/ۥۣ۠۟ۦ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۠۟ۦ;

    iget-object v4, v4, LYue/ۥۣ۠۟ۦ;->ۥ۟۟۠ۥ:LYue/ۥۣ۠ۢۢ;

    invoke-interface {v4, v2, p2}, LYue/ۥۣ۠ۢۢ;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1

    :cond_4
    :goto_1
    iget-object v2, p0, LYue/ۥۣ۠۟ۦ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    iput-object p2, v2, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iget-object p2, p0, LYue/ۥۣ۠۟ۦ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣۣ۠ۢ;

    iput v3, v0, LYue/ۥۣ۠۟ۦ$ۥ$ۥ;->ۥ۟۟۠ۥ:I

    invoke-interface {p2, p1, v0}, LYue/ۥۣۣ۠ۢ;->ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method
