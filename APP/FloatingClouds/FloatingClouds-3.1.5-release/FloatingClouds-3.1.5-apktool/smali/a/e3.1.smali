.class public final La/e3;
.super La/a2;
.source "SourceFile"


# instance fields
.field public a:La/ve;

.field public b:La/h9;

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "La/ve;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, La/a2;-><init>()V

    return-void
.end method

.method public static g(La/e3;Ljava/lang/String;)V
    .locals 3

    const-string v0, "usingString"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    const/4 v1, 0x1

    invoke-static {v0, v1}, La/z;->j(Ljava/lang/String;I)V

    new-instance v0, La/ve;

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, La/ve;-><init>(Ljava/lang/String;IZ)V

    iget-object p1, p0, La/e3;->c:Ljava/util/List;

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    iput-object p1, p0, La/e3;->c:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic i(La/e3;Ljava/lang/String;II)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x5

    :cond_0
    const/4 p3, 0x0

    invoke-virtual {p0, p1, p2, p3}, La/e3;->h(Ljava/lang/String;IZ)V

    return-void
.end method


# virtual methods
.method public final b(La/B6;)I
    .locals 7

    iget-object v0, p0, La/e3;->a:La/ve;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, La/ve;->b(La/B6;)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, La/e3;->b:La/h9;

    if-eqz v2, :cond_1

    invoke-virtual {v2, p1}, La/h9;->b(La/B6;)I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    iget-object v3, p0, La/e3;->c:Ljava/util/List;

    const/16 v4, 0xa

    if-eqz v3, :cond_3

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v3, v4}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/ve;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v6, p1}, La/ve;->b(La/B6;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-static {v5}, La/t3;->v0(Ljava/util/ArrayList;)[I

    move-result-object v3

    invoke-virtual {p1, v3}, La/B6;->d([I)I

    move-result v3

    goto :goto_3

    :cond_3
    move v3, v1

    :goto_3
    const/16 v5, 0xc

    invoke-virtual {p1, v5}, La/B6;->i(I)V

    const/16 v5, 0xb

    invoke-virtual {p1, v5, v1}, La/B6;->a(II)V

    invoke-virtual {p1, v4, v1}, La/B6;->a(II)V

    const/16 v4, 0x9

    invoke-virtual {p1, v4, v1}, La/B6;->a(II)V

    const/16 v4, 0x8

    invoke-virtual {p1, v4, v3}, La/B6;->a(II)V

    const/4 v3, 0x7

    invoke-virtual {p1, v3, v1}, La/B6;->a(II)V

    const/4 v3, 0x6

    invoke-virtual {p1, v3, v1}, La/B6;->a(II)V

    const/4 v3, 0x5

    invoke-virtual {p1, v3, v1}, La/B6;->a(II)V

    const/4 v3, 0x4

    invoke-virtual {p1, v3, v2}, La/B6;->a(II)V

    const/4 v2, 0x3

    invoke-virtual {p1, v2, v1}, La/B6;->a(II)V

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v1}, La/B6;->a(II)V

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0}, La/B6;->a(II)V

    invoke-virtual {p1, v1, v1}, La/B6;->a(II)V

    invoke-virtual {p1}, La/B6;->e()I

    move-result v0

    invoke-virtual {p1, v0}, La/B6;->f(I)V

    return v0
.end method

.method public final h(Ljava/lang/String;IZ)V
    .locals 1

    const-string v0, "className"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {v0, p2}, La/z;->j(Ljava/lang/String;I)V

    new-instance v0, La/ve;

    invoke-direct {v0, p1, p2, p3}, La/ve;-><init>(Ljava/lang/String;IZ)V

    iput-object v0, p0, La/e3;->a:La/ve;

    return-void
.end method
