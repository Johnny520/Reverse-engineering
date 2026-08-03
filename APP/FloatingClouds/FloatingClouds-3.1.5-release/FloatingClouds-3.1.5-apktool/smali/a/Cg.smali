.class public final La/Cg;
.super La/vd;
.source "SourceFile"

# interfaces
.implements La/H7;
.implements La/Q7;


# annotations
.annotation runtime La/L4;
    c = "androidx.core.view.ViewKt$allViews$1"
    f = "View.kt"
    l = {
        0x199,
        0x19b
    }
    m = "invokeSuspend"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/vd;",
        "La/H7<",
        "La/Rd<",
        "-",
        "Landroid/view/View;",
        ">;",
        "La/a4<",
        "-",
        "La/Wf;",
        ">;",
        "Ljava/lang/Object;",
        ">;",
        "La/Q7<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:I

.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;La/a4;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "La/a4<",
            "-",
            "La/Cg;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, La/Cg;->e:Landroid/view/View;

    invoke-direct {p0, p2}, La/vd;-><init>(La/a4;)V

    const/4 p1, 0x2

    iput p1, p0, La/Cg;->b:I

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, La/Cg;->b:I

    return v0
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La/Rd;

    check-cast p2, La/a4;

    invoke-virtual {p0, p1, p2}, La/Cg;->g(Ljava/lang/Object;La/a4;)La/a4;

    move-result-object p1

    check-cast p1, La/Cg;

    sget-object p2, La/Wf;->a:La/Wf;

    invoke-virtual {p1, p2}, La/Cg;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/lang/Object;La/a4;)La/a4;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "La/a4<",
            "*>;)",
            "La/a4<",
            "La/Wf;",
            ">;"
        }
    .end annotation

    new-instance v0, La/Cg;

    iget-object v1, p0, La/Cg;->e:Landroid/view/View;

    invoke-direct {v0, v1, p2}, La/Cg;-><init>(Landroid/view/View;La/a4;)V

    iput-object p1, v0, La/Cg;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, La/y4;->a:La/y4;

    iget v1, p0, La/Cg;->c:I

    iget-object v2, p0, La/Cg;->e:Landroid/view/View;

    const/4 v3, 0x1

    if-eqz v1, :cond_4

    const/4 v4, 0x2

    if-eq v1, v3, :cond_1

    if-ne v1, v4, :cond_0

    invoke-static {p1}, La/xd;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, La/Cg;->d:Ljava/lang/Object;

    check-cast v1, La/Rd;

    invoke-static {p1}, La/xd;->b(Ljava/lang/Object;)V

    instance-of p1, v2, Landroid/view/ViewGroup;

    if-eqz p1, :cond_3

    check-cast v2, Landroid/view/ViewGroup;

    const/4 p1, 0x0

    iput-object p1, p0, La/Cg;->d:Ljava/lang/Object;

    iput v4, p0, La/Cg;->c:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, La/Gf;

    new-instance v3, La/G1;

    invoke-direct {v3, v2}, La/G1;-><init>(Landroid/view/ViewGroup;)V

    invoke-direct {p1, v3}, La/Gf;-><init>(La/G1;)V

    invoke-virtual {v1, p1, p0}, La/Rd;->b(Ljava/util/Iterator;La/Cg;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, La/Wf;->a:La/Wf;

    :goto_0
    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :cond_4
    invoke-static {p1}, La/xd;->b(Ljava/lang/Object;)V

    iget-object p1, p0, La/Cg;->d:Ljava/lang/Object;

    check-cast p1, La/Rd;

    iput-object p1, p0, La/Cg;->d:Ljava/lang/Object;

    iput v3, p0, La/Cg;->c:I

    invoke-virtual {p1, v2, p0}, La/Rd;->a(Ljava/lang/Object;La/Cg;)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, La/W1;->a:La/a4;

    if-nez v0, :cond_0

    sget-object v0, La/Tc;->a:La/Uc;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, La/Uc;->a(La/Q7;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "renderLambdaToString(...)"

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    invoke-super {p0}, La/W1;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
