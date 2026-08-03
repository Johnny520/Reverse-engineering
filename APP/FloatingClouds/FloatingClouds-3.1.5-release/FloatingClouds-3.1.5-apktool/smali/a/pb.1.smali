.class public final La/pb;
.super La/a2;
.source "SourceFile"


# instance fields
.field public a:La/e3;

.field public b:La/e3;

.field public c:La/pc;

.field public d:Ljava/util/List;
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

.method public static g(La/pb;Ljava/lang/String;)V
    .locals 3

    const-string v0, "usingString"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    const/4 v1, 0x1

    invoke-static {v0, v1}, La/z;->j(Ljava/lang/String;I)V

    iget-object v0, p0, La/pb;->d:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    iput-object v0, p0, La/pb;->d:Ljava/util/List;

    new-instance p0, La/ve;

    const/4 v2, 0x0

    invoke-direct {p0, p1, v1, v2}, La/ve;-><init>(Ljava/lang/String;IZ)V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static h(La/pb;Ljava/lang/String;)V
    .locals 3

    const-string v0, "className"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    const/4 v1, 0x5

    invoke-static {v0, v1}, La/z;->j(Ljava/lang/String;I)V

    new-instance v0, La/e3;

    invoke-direct {v0}, La/e3;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, La/e3;->h(Ljava/lang/String;IZ)V

    iput-object v0, p0, La/pb;->a:La/e3;

    return-void
.end method

.method public static j(La/pb;Ljava/lang/String;)V
    .locals 3

    const-string v0, "typeName"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    const/4 v1, 0x5

    invoke-static {v0, v1}, La/z;->j(Ljava/lang/String;I)V

    new-instance v0, La/e3;

    invoke-direct {v0}, La/e3;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, La/e3;->h(Ljava/lang/String;IZ)V

    iput-object v0, p0, La/pb;->b:La/e3;

    return-void
.end method


# virtual methods
.method public final b(La/B6;)I
    .locals 8

    iget-object v0, p0, La/pb;->a:La/e3;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, La/e3;->b(La/B6;)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, La/pb;->b:La/e3;

    if-eqz v2, :cond_1

    invoke-virtual {v2, p1}, La/e3;->b(La/B6;)I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    iget-object v3, p0, La/pb;->c:La/pc;

    if-eqz v3, :cond_2

    invoke-virtual {v3, p1}, La/pc;->b(La/B6;)I

    move-result v3

    goto :goto_2

    :cond_2
    move v3, v1

    :goto_2
    iget-object v4, p0, La/pb;->d:Ljava/util/List;

    const/16 v5, 0xa

    if-eqz v4, :cond_4

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v4, v5}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La/ve;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7, p1}, La/ve;->b(La/B6;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    invoke-static {v6}, La/t3;->v0(Ljava/util/ArrayList;)[I

    move-result-object v4

    invoke-virtual {p1, v4}, La/B6;->d([I)I

    move-result v4

    goto :goto_4

    :cond_4
    move v4, v1

    :goto_4
    const/16 v6, 0x11

    invoke-virtual {p1, v6}, La/B6;->i(I)V

    const/16 v6, 0x10

    invoke-virtual {p1, v6, v1}, La/B6;->a(II)V

    const/16 v6, 0xf

    invoke-virtual {p1, v6, v1}, La/B6;->a(II)V

    const/16 v6, 0xe

    invoke-virtual {p1, v6, v1}, La/B6;->a(II)V

    const/16 v6, 0xd

    invoke-virtual {p1, v6, v1}, La/B6;->a(II)V

    const/16 v6, 0xc

    invoke-virtual {p1, v6, v1}, La/B6;->a(II)V

    const/16 v6, 0xb

    invoke-virtual {p1, v6, v1}, La/B6;->a(II)V

    invoke-virtual {p1, v5, v1}, La/B6;->a(II)V

    const/16 v5, 0x9

    invoke-virtual {p1, v5, v1}, La/B6;->a(II)V

    const/16 v5, 0x8

    invoke-virtual {p1, v5, v1}, La/B6;->a(II)V

    const/4 v5, 0x7

    invoke-virtual {p1, v5, v4}, La/B6;->a(II)V

    const/4 v4, 0x6

    invoke-virtual {p1, v4, v1}, La/B6;->a(II)V

    const/4 v4, 0x5

    invoke-virtual {p1, v4, v1}, La/B6;->a(II)V

    const/4 v4, 0x4

    invoke-virtual {p1, v4, v3}, La/B6;->a(II)V

    const/4 v3, 0x3

    invoke-virtual {p1, v3, v2}, La/B6;->a(II)V

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v0}, La/B6;->a(II)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0, v1}, La/B6;->a(II)V

    invoke-virtual {p1, v1, v1}, La/B6;->a(II)V

    invoke-virtual {p1}, La/B6;->e()I

    move-result v0

    invoke-virtual {p1, v0}, La/B6;->f(I)V

    return v0
.end method

.method public final i(Ljava/util/Collection;)V
    .locals 6

    const-string v0, "paramTypes"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La/pc;

    invoke-direct {v0}, La/a2;-><init>()V

    sget-object v1, La/Y5;->a:La/Y5;

    invoke-static {v1}, La/t3;->y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v0, La/pc;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    new-instance v2, La/oc;

    invoke-direct {v2}, La/oc;-><init>()V

    new-instance v3, La/e3;

    invoke-direct {v3}, La/e3;-><init>()V

    const/4 v4, 0x0

    const/4 v5, 0x5

    invoke-virtual {v3, v1, v5, v4}, La/e3;->h(Ljava/lang/String;IZ)V

    iput-object v3, v2, La/oc;->a:La/e3;

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    iget-object v1, v0, La/pc;->a:Ljava/util/List;

    if-nez v1, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    iput-object v1, v0, La/pc;->a:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iput-object v0, p0, La/pb;->c:La/pc;

    return-void
.end method
