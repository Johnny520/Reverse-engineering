.class public final Lkh;
.super LTB;
.source ""


# instance fields
.field public final synthetic l:I

.field public m:LTB;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lkh;->l:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final N(LCh;)I
    .locals 11

    iget v0, p0, Lkh;->l:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkh;->m:LTB;

    check-cast v0, LTr;

    const/4 v1, 0x0

    if-eqz v0, :cond_a

    iget-object v2, v0, LTr;->l:Lqz;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2, p1}, Lqz;->N(LCh;)I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    iget-object v4, v0, LTr;->m:LE9;

    if-eqz v4, :cond_1

    invoke-virtual {v4, p1}, LE9;->N(LCh;)I

    move-result v4

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    iget-object v5, v0, LTr;->n:LE9;

    if-eqz v5, :cond_2

    invoke-virtual {v5, p1}, LE9;->N(LCh;)I

    move-result v5

    goto :goto_2

    :cond_2
    move v5, v3

    :goto_2
    iget-object v6, v0, LTr;->o:LGt;

    if-eqz v6, :cond_7

    iget-object v7, v6, LGt;->l:Ljava/util/List;

    const/4 v8, 0x0

    if-eqz v7, :cond_5

    new-instance v9, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v7, v10}, Lta;->d0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LFt;

    if-eqz v10, :cond_3

    :goto_4
    invoke-virtual {v10, p1}, LFt;->N(LCh;)I

    move-result v10

    goto :goto_5

    :cond_3
    new-instance v10, LFt;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    goto :goto_4

    :goto_5
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-static {v9}, Lra;->q0(Ljava/util/ArrayList;)[I

    move-result-object v7

    invoke-virtual {p1, v7}, LCh;->c([I)I

    move-result v7

    goto :goto_6

    :cond_5
    move v7, v8

    :goto_6
    iget-object v6, v6, LGt;->m:LFl;

    if-eqz v6, :cond_6

    invoke-virtual {v6, p1}, LFl;->N(LCh;)I

    move-result v6

    goto :goto_7

    :cond_6
    move v6, v8

    :goto_7
    const/4 v9, 0x2

    invoke-virtual {p1, v9}, LCh;->i(I)V

    const/4 v9, 0x1

    invoke-virtual {p1, v9, v6}, LCh;->a(II)V

    invoke-virtual {p1, v8, v7}, LCh;->a(II)V

    invoke-virtual {p1}, LCh;->d()I

    move-result v6

    invoke-virtual {p1, v6}, LCh;->e(I)V

    goto :goto_8

    :cond_7
    move v6, v3

    :goto_8
    iget-object v0, v0, LTr;->p:Ljava/util/ArrayList;

    const/16 v7, 0xa

    if-eqz v0, :cond_9

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v0, v7}, Lta;->d0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lqz;

    invoke-virtual {v9, p1}, Lqz;->N(LCh;)I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_8
    invoke-static {v8}, Lra;->q0(Ljava/util/ArrayList;)[I

    move-result-object v0

    invoke-virtual {p1, v0}, LCh;->c([I)I

    move-result v0

    goto :goto_a

    :cond_9
    move v0, v3

    :goto_a
    const/16 v8, 0xe

    invoke-virtual {p1, v8}, LCh;->i(I)V

    const/16 v8, 0xd

    invoke-virtual {p1, v8, v3}, LCh;->a(II)V

    const/16 v8, 0xc

    invoke-virtual {p1, v8, v3}, LCh;->a(II)V

    const/16 v8, 0xb

    invoke-virtual {p1, v8, v3}, LCh;->a(II)V

    invoke-virtual {p1, v7, v3}, LCh;->a(II)V

    const/16 v7, 0x9

    invoke-virtual {p1, v7, v3}, LCh;->a(II)V

    const/16 v7, 0x8

    invoke-virtual {p1, v7, v3}, LCh;->a(II)V

    const/4 v7, 0x7

    invoke-virtual {p1, v7, v0}, LCh;->a(II)V

    const/4 v0, 0x6

    invoke-virtual {p1, v0, v3}, LCh;->a(II)V

    const/4 v0, 0x5

    invoke-virtual {p1, v0, v3}, LCh;->a(II)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0, v6}, LCh;->a(II)V

    const/4 v0, 0x3

    invoke-virtual {p1, v0, v5}, LCh;->a(II)V

    const/4 v0, 0x2

    invoke-virtual {p1, v0, v4}, LCh;->a(II)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0, v3}, LCh;->a(II)V

    invoke-virtual {p1, v3, v2}, LCh;->a(II)V

    invoke-virtual {p1}, LCh;->d()I

    move-result v0

    invoke-virtual {p1, v0}, LCh;->e(I)V

    goto :goto_b

    :cond_a
    move v0, v1

    :goto_b
    const/4 v2, 0x7

    invoke-virtual {p1, v2}, LCh;->i(I)V

    const/4 v2, 0x6

    invoke-virtual {p1, v2, v0}, LCh;->a(II)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0, v1}, LCh;->a(II)V

    const/4 v0, 0x3

    invoke-virtual {p1, v0, v1}, LCh;->a(II)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0, v1}, LCh;->a(II)V

    invoke-virtual {p1, v1, v1}, LCh;->a(II)V

    invoke-virtual {p1}, LCh;->d()I

    move-result v0

    invoke-virtual {p1, v0}, LCh;->e(I)V

    return v0

    :pswitch_0
    iget-object v0, p0, Lkh;->m:LTB;

    check-cast v0, LE9;

    const/4 v1, 0x0

    if-eqz v0, :cond_b

    invoke-virtual {v0, p1}, LE9;->N(LCh;)I

    move-result v0

    goto :goto_c

    :cond_b
    move v0, v1

    :goto_c
    const/4 v2, 0x6

    invoke-virtual {p1, v2}, LCh;->i(I)V

    const/4 v2, 0x5

    invoke-virtual {p1, v2, v0}, LCh;->a(II)V

    const/4 v0, 0x3

    invoke-virtual {p1, v0, v1}, LCh;->a(II)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0, v1}, LCh;->a(II)V

    invoke-virtual {p1, v1, v1}, LCh;->a(II)V

    invoke-virtual {p1}, LCh;->d()I

    move-result v0

    invoke-virtual {p1, v0}, LCh;->e(I)V

    return v0

    :pswitch_1
    iget-object v0, p0, Lkh;->m:LTB;

    check-cast v0, LFl;

    const/4 v1, 0x0

    if-eqz v0, :cond_c

    invoke-virtual {v0, p1}, LFl;->N(LCh;)I

    move-result v0

    goto :goto_d

    :cond_c
    move v0, v1

    :goto_d
    const/4 v2, 0x3

    invoke-virtual {p1, v2}, LCh;->i(I)V

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v0}, LCh;->a(II)V

    invoke-virtual {p1, v1, v1}, LCh;->a(II)V

    invoke-virtual {p1}, LCh;->d()I

    move-result v0

    invoke-virtual {p1, v0}, LCh;->e(I)V

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
