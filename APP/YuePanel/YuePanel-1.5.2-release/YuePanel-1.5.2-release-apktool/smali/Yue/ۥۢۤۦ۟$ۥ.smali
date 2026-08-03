.class public final LYue/ۥۢۤۦ۟$ۥ;
.super LYue/ۥۡۦۧۢ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۢ;


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "androidx.core.view.ViewKt$allViews$1"
    f = "View.kt"
    i = {
        0x0
    }
    l = {
        0x199,
        0x19b
    }
    m = "invokeSuspend"
    n = {
        "$this$sequence"
    }
    s = {
        "L$0"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۤۦ۟;->ۥۣ۟۟۟(Landroid/view/View;)LYue/ۥۡۨۢ;
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
        "Landroid/view/View;",
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
.field public ۥ۟۟۠ۤ:I

.field public synthetic ۥ۟۟۠ۥ:Ljava/lang/Object;

.field public final synthetic ۥ۟۟۠ۦ:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;LYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e4\u06e6\u06df$\u06e5;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۢۤۦ۟$ۥ;->ۥ۟۟۠ۦ:Landroid/view/View;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, LYue/ۥۡۦۧۢ;-><init>(ILYue/ۥ۟ۧۤۢ;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;
    .locals 2
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

    new-instance v0, LYue/ۥۢۤۦ۟$ۥ;

    iget-object v1, p0, LYue/ۥۢۤۦ۟$ۥ;->ۥ۟۟۠ۦ:Landroid/view/View;

    invoke-direct {v0, v1, p2}, LYue/ۥۢۤۦ۟$ۥ;-><init>(Landroid/view/View;LYue/ۥ۟ۧۤۢ;)V

    iput-object p1, v0, LYue/ۥۢۤۦ۟$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥۡۨۢ۠;

    check-cast p2, LYue/ۥ۟ۧۤۢ;

    invoke-virtual {p0, p1, p2}, LYue/ۥۢۤۦ۟$ۥ;->ۥ۟۟۠ۦ(LYue/ۥۡۨۢ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

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

    iget v1, p0, LYue/ۥۢۤۦ۟$ۥ;->ۥ۟۟۠ۤ:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LYue/ۥۢۤۦ۟$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast v1, LYue/ۥۡۨۢ۠;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iget-object p1, p0, LYue/ۥۢۤۦ۟$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, LYue/ۥۡۨۢ۠;

    iget-object p1, p0, LYue/ۥۢۤۦ۟$ۥ;->ۥ۟۟۠ۦ:Landroid/view/View;

    iput-object v1, p0, LYue/ۥۢۤۦ۟$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v3, p0, LYue/ۥۢۤۦ۟$ۥ;->ۥ۟۟۠ۤ:I

    invoke-virtual {v1, p1, p0}, LYue/ۥۡۨۢ۠;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    iget-object p1, p0, LYue/ۥۢۤۦ۟$ۥ;->ۥ۟۟۠ۦ:Landroid/view/View;

    instance-of v3, p1, Landroid/view/ViewGroup;

    if-eqz v3, :cond_4

    check-cast p1, Landroid/view/ViewGroup;

    invoke-static {p1}, LYue/ۥۢۤۥۦ;->ۥ۟۟۟۠(Landroid/view/ViewGroup;)LYue/ۥۡۨۢ;

    move-result-object p1

    const/4 v3, 0x0

    iput-object v3, p0, LYue/ۥۢۤۦ۟$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v2, p0, LYue/ۥۢۤۦ۟$ۥ;->ۥ۟۟۠ۤ:I

    invoke-virtual {v1, p1, p0}, LYue/ۥۡۨۢ۠;->ۥ۟(LYue/ۥۡۨۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
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
            "Landroid/view/View;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, LYue/ۥۢۤۦ۟$ۥ;->create(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object p1

    check-cast p1, LYue/ۥۢۤۦ۟$ۥ;

    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {p1, p2}, LYue/ۥۢۤۦ۟$ۥ;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
