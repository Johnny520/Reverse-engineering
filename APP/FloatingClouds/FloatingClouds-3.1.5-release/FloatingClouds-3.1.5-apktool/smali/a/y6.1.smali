.class public final La/y6;
.super La/Z1;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/List;

.field public b:La/e3;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, La/Z1;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(La/B6;)I
    .locals 4

    iget-object v0, p0, La/y6;->a:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, La/B6;->c(Ljava/lang/CharSequence;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v2}, La/t3;->v0(Ljava/util/ArrayList;)[I

    move-result-object v0

    invoke-virtual {p1, v0}, La/B6;->d([I)I

    move-result v0

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    iget-object v2, p0, La/y6;->b:La/e3;

    if-eqz v2, :cond_2

    invoke-virtual {v2, p1}, La/e3;->b(La/B6;)I

    move-result v2

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    const/4 v3, 0x6

    invoke-virtual {p1, v3}, La/B6;->i(I)V

    const/4 v3, 0x5

    invoke-virtual {p1, v3, v2}, La/B6;->a(II)V

    const/4 v2, 0x3

    invoke-virtual {p1, v2, v1}, La/B6;->a(II)V

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v1}, La/B6;->a(II)V

    invoke-virtual {p1, v1, v0}, La/B6;->a(II)V

    invoke-virtual {p1}, La/B6;->e()I

    move-result v0

    invoke-virtual {p1, v0}, La/B6;->f(I)V

    return v0
.end method
