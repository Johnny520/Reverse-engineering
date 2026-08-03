.class public final La/a8;
.super La/N3;
.source "SourceFile"


# instance fields
.field public e0:F

.field public f0:I

.field public g0:I

.field public h0:La/M3;

.field public i0:I


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, La/N3;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, La/a8;->e0:F

    const/4 v0, -0x1

    iput v0, p0, La/a8;->f0:I

    iput v0, p0, La/a8;->g0:I

    iget-object v0, p0, La/N3;->z:La/M3;

    iput-object v0, p0, La/a8;->h0:La/M3;

    const/4 v0, 0x0

    iput v0, p0, La/a8;->i0:I

    iget-object v1, p0, La/N3;->H:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, La/N3;->H:Ljava/util/ArrayList;

    iget-object v2, p0, La/a8;->h0:La/M3;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, La/N3;->G:[La/M3;

    array-length v1, v1

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, La/N3;->G:[La/M3;

    iget-object v3, p0, La/a8;->h0:La/M3;

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final A(La/B9;)V
    .locals 3

    iget-object v0, p0, La/N3;->K:La/N3;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, La/a8;->h0:La/M3;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/B9;->m(Ljava/lang/Object;)I

    move-result p1

    iget v0, p0, La/a8;->i0:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iput p1, p0, La/N3;->P:I

    iput v2, p0, La/N3;->Q:I

    iget-object p1, p0, La/N3;->K:La/N3;

    invoke-virtual {p1}, La/N3;->i()I

    move-result p1

    invoke-virtual {p0, p1}, La/N3;->v(I)V

    invoke-virtual {p0, v2}, La/N3;->y(I)V

    return-void

    :cond_1
    iput v2, p0, La/N3;->P:I

    iput p1, p0, La/N3;->Q:I

    iget-object p1, p0, La/N3;->K:La/N3;

    invoke-virtual {p1}, La/N3;->l()I

    move-result p1

    invoke-virtual {p0, p1}, La/N3;->y(I)V

    invoke-virtual {p0, v2}, La/N3;->v(I)V

    return-void
.end method

.method public final B(I)V
    .locals 3

    iget v0, p0, La/a8;->i0:I

    if-ne v0, p1, :cond_0

    goto :goto_2

    :cond_0
    iput p1, p0, La/a8;->i0:I

    iget-object p1, p0, La/N3;->H:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget v0, p0, La/a8;->i0:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, La/N3;->y:La/M3;

    iput-object v0, p0, La/a8;->h0:La/M3;

    goto :goto_0

    :cond_1
    iget-object v0, p0, La/N3;->z:La/M3;

    iput-object v0, p0, La/a8;->h0:La/M3;

    :goto_0
    iget-object v0, p0, La/a8;->h0:La/M3;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, La/N3;->G:[La/M3;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_2

    iget-object v2, p0, La/a8;->h0:La/M3;

    aput-object v2, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method

.method public final a(La/B9;)V
    .locals 8

    iget-object v0, p0, La/N3;->K:La/N3;

    check-cast v0, La/O3;

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    sget-object v1, La/M3$a;->a:La/M3$a;

    invoke-virtual {v0, v1}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v1

    sget-object v2, La/M3$a;->c:La/M3$a;

    invoke-virtual {v0, v2}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v2

    iget-object v3, p0, La/N3;->K:La/N3;

    sget-object v4, La/N3$a;->b:La/N3$a;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_1

    iget-object v3, v3, La/N3;->J:[La/N3$a;

    aget-object v3, v3, v6

    if-ne v3, v4, :cond_1

    move v3, v5

    goto :goto_0

    :cond_1
    move v3, v6

    :goto_0
    iget v7, p0, La/a8;->i0:I

    if-nez v7, :cond_3

    sget-object v1, La/M3$a;->b:La/M3$a;

    invoke-virtual {v0, v1}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v1

    sget-object v2, La/M3$a;->d:La/M3$a;

    invoke-virtual {v0, v2}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v2

    iget-object v0, p0, La/N3;->K:La/N3;

    if-eqz v0, :cond_2

    iget-object v0, v0, La/N3;->J:[La/N3$a;

    aget-object v0, v0, v5

    if-ne v0, v4, :cond_2

    goto :goto_1

    :cond_2
    move v5, v6

    :goto_1
    move v3, v5

    :cond_3
    iget v0, p0, La/a8;->f0:I

    const/16 v4, 0x8

    const/4 v5, -0x1

    const/4 v7, 0x5

    if-eq v0, v5, :cond_4

    iget-object v0, p0, La/a8;->h0:La/M3;

    invoke-virtual {p1, v0}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v0

    invoke-virtual {p1, v1}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v1

    iget v5, p0, La/a8;->f0:I

    invoke-virtual {p1, v0, v1, v5, v4}, La/B9;->e(La/le;La/le;II)V

    if-eqz v3, :cond_6

    invoke-virtual {p1, v2}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v1

    invoke-virtual {p1, v1, v0, v6, v7}, La/B9;->f(La/le;La/le;II)V

    return-void

    :cond_4
    iget v0, p0, La/a8;->g0:I

    if-eq v0, v5, :cond_5

    iget-object v0, p0, La/a8;->h0:La/M3;

    invoke-virtual {p1, v0}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v0

    invoke-virtual {p1, v2}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v2

    iget v5, p0, La/a8;->g0:I

    neg-int v5, v5

    invoke-virtual {p1, v0, v2, v5, v4}, La/B9;->e(La/le;La/le;II)V

    if-eqz v3, :cond_6

    invoke-virtual {p1, v1}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v1

    invoke-virtual {p1, v0, v1, v6, v7}, La/B9;->f(La/le;La/le;II)V

    invoke-virtual {p1, v2, v0, v6, v7}, La/B9;->f(La/le;La/le;II)V

    return-void

    :cond_5
    iget v0, p0, La/a8;->e0:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_6

    iget-object v0, p0, La/a8;->h0:La/M3;

    invoke-virtual {p1, v0}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v0

    invoke-virtual {p1, v2}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v2

    iget v3, p0, La/a8;->e0:F

    invoke-virtual {p1}, La/B9;->k()La/K1;

    move-result-object v4

    iget-object v5, v4, La/K1;->d:La/K1$a;

    invoke-interface {v5, v0, v1}, La/K1$a;->c(La/le;F)V

    iget-object v0, v4, La/K1;->d:La/K1$a;

    invoke-interface {v0, v2, v3}, La/K1$a;->c(La/le;F)V

    invoke-virtual {p1, v4}, La/B9;->c(La/K1;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final g(La/M3$a;)La/M3;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget v0, p0, La/a8;->i0:I

    if-nez v0, :cond_0

    iget-object p1, p0, La/a8;->h0:La/M3;

    return-object p1

    :pswitch_1
    iget v0, p0, La/a8;->i0:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object p1, p0, La/a8;->h0:La/M3;

    return-object p1

    :cond_0
    :goto_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :pswitch_2
    const/4 p1, 0x0

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method
