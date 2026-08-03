.class public final LsE;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lsy;

.field public final b:Lvp;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lsy;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsy;-><init>(I)V

    iput-object v0, p0, LsE;->a:Lsy;

    new-instance v0, Lvp;

    invoke-direct {v0}, Lvp;-><init>()V

    iput-object v0, p0, LsE;->b:Lvp;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/o;Llv;)V
    .locals 2

    iget-object v0, p0, LsE;->a:Lsy;

    invoke-virtual {v0, p1}, Lsy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LqE;

    if-nez v1, :cond_0

    invoke-static {}, LqE;->a()LqE;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lsy;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iput-object p2, v1, LqE;->c:Llv;

    iget p1, v1, LqE;->a:I

    or-int/lit8 p1, p1, 0x8

    iput p1, v1, LqE;->a:I

    return-void
.end method

.method public final b(Landroidx/recyclerview/widget/o;I)Llv;
    .locals 5

    iget-object v0, p0, LsE;->a:Lsy;

    invoke-virtual {v0, p1}, Lsy;->d(Ljava/lang/Object;)I

    move-result p1

    const/4 v1, 0x0

    if-gez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0, p1}, Lsy;->j(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LqE;

    if-eqz v2, :cond_4

    iget v3, v2, LqE;->a:I

    and-int v4, v3, p2

    if-eqz v4, :cond_4

    not-int v4, p2

    and-int/2addr v3, v4

    iput v3, v2, LqE;->a:I

    const/4 v4, 0x4

    if-ne p2, v4, :cond_1

    iget-object p2, v2, LqE;->b:Llv;

    goto :goto_0

    :cond_1
    const/16 v4, 0x8

    if-ne p2, v4, :cond_3

    iget-object p2, v2, LqE;->c:Llv;

    :goto_0
    and-int/lit8 v3, v3, 0xc

    if-nez v3, :cond_2

    invoke-virtual {v0, p1}, Lsy;->h(I)Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v2, LqE;->a:I

    iput-object v1, v2, LqE;->b:Llv;

    iput-object v1, v2, LqE;->c:Llv;

    sget-object p1, LqE;->d:LYt;

    invoke-virtual {p1, v2}, LYt;->a(Ljava/lang/Object;)Z

    :cond_2
    return-object p2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must provide flag PRE or POST"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    return-object v1
.end method

.method public final c(Landroidx/recyclerview/widget/o;)V
    .locals 1

    iget-object v0, p0, LsE;->a:Lsy;

    invoke-virtual {v0, p1}, Lsy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LqE;

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget v0, p1, LqE;->a:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p1, LqE;->a:I

    return-void
.end method

.method public final d(Landroidx/recyclerview/widget/o;)V
    .locals 6

    iget-object v0, p0, LsE;->b:Lvp;

    invoke-virtual {v0}, Lvp;->g()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_0
    if-ltz v1, :cond_1

    invoke-virtual {v0, v1}, Lvp;->h(I)Ljava/lang/Object;

    move-result-object v3

    if-ne p1, v3, :cond_0

    iget-object v3, v0, Lvp;->c:[Ljava/lang/Object;

    aget-object v4, v3, v1

    sget-object v5, LfG;->d:Ljava/lang/Object;

    if-eq v4, v5, :cond_1

    aput-object v5, v3, v1

    iput-boolean v2, v0, Lvp;->a:Z

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v0, p0, LsE;->a:Lsy;

    invoke-virtual {v0, p1}, Lsy;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LqE;

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    iput v0, p1, LqE;->a:I

    const/4 v0, 0x0

    iput-object v0, p1, LqE;->b:Llv;

    iput-object v0, p1, LqE;->c:Llv;

    sget-object v0, LqE;->d:LYt;

    invoke-virtual {v0, p1}, LYt;->a(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method
