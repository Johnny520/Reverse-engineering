.class public final LtE;
.super LFw;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;LEb;)V
    .locals 0

    iput-object p1, p0, LtE;->e:Landroid/view/View;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, LFw;-><init>(ILEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzx;

    check-cast p2, LEb;

    invoke-virtual {p0, p2, p1}, LtE;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LtE;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LtE;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 2

    new-instance v0, LtE;

    iget-object v1, p0, LtE;->e:Landroid/view/View;

    invoke-direct {v0, v1, p1}, LtE;-><init>(Landroid/view/View;LEb;)V

    iput-object p2, v0, LtE;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, LtE;->c:I

    iget-object v1, p0, LtE;->e:Landroid/view/View;

    const/4 v2, 0x1

    sget-object v3, Lgc;->a:Lgc;

    if-eqz v0, :cond_5

    sget-object v4, LTC;->a:LTC;

    const/4 v5, 0x2

    if-eq v0, v2, :cond_1

    if-ne v0, v5, :cond_0

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    return-object v4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, LtE;->d:Ljava/lang/Object;

    check-cast v0, Lzx;

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    instance-of p1, v1, Landroid/view/ViewGroup;

    if-eqz p1, :cond_4

    check-cast v1, Landroid/view/ViewGroup;

    const/4 p1, 0x0

    iput-object p1, p0, LtE;->d:Ljava/lang/Object;

    iput v5, p0, LtE;->c:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, LQB;

    new-instance v2, Lx;

    const/4 v6, 0x7

    invoke-direct {v2, v6, v1}, Lx;-><init>(ILjava/lang/Object;)V

    invoke-direct {p1, v2}, LQB;-><init>(Lx;)V

    iget-object v1, p1, LQB;->b:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_2

    move-object p1, v4

    goto :goto_0

    :cond_2
    iput-object p1, v0, Lzx;->c:Ljava/util/Iterator;

    iput v5, v0, Lzx;->a:I

    iput-object p0, v0, Lzx;->d:LEb;

    move-object p1, v3

    :goto_0
    if-ne p1, v3, :cond_3

    goto :goto_1

    :cond_3
    move-object p1, v4

    :goto_1
    if-ne p1, v3, :cond_4

    return-object v3

    :cond_4
    return-object v4

    :cond_5
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    iget-object p1, p0, LtE;->d:Ljava/lang/Object;

    check-cast p1, Lzx;

    iput-object p1, p0, LtE;->d:Ljava/lang/Object;

    iput v2, p0, LtE;->c:I

    iput-object v1, p1, Lzx;->b:Ljava/lang/Object;

    const/4 v0, 0x3

    iput v0, p1, Lzx;->a:I

    iput-object p0, p1, Lzx;->d:LEb;

    return-object v3
.end method
