.class public final synthetic La/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/H7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, La/i0;->a:I

    iput-object p2, p0, La/i0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    iget v1, v0, La/i0;->a:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v4, p1

    check-cast v4, Ljava/lang/CharSequence;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "$this$DelimitedRangesSequence"

    invoke-static {v4, v2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, La/i0;->b:Ljava/lang/Object;

    move-object v8, v2

    check-cast v8, Ljava/util/List;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v9, 0x0

    const/4 v5, 0x1

    if-ne v2, v5, :cond_4

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v2

    if-eqz v2, :cond_3

    if-ne v2, v5, :cond_2

    invoke-interface {v8, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v5, 0x4

    invoke-static {v4, v2, v1, v3, v5}, La/Be;->N(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v1

    if-gez v1, :cond_1

    :cond_0
    :goto_0
    move-object v3, v9

    goto/16 :goto_6

    :cond_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v3, La/mc;

    invoke-direct {v3, v1, v2}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "List has more than one element."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v1, Ljava/util/NoSuchElementException;

    const-string v2, "List is empty."

    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    new-instance v2, La/f9;

    if-gez v1, :cond_5

    move v1, v3

    :cond_5
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v3

    invoke-direct {v2, v1, v3, v5}, La/d9;-><init>(III)V

    instance-of v3, v4, Ljava/lang/String;

    const/4 v15, 0x0

    iget v2, v2, La/d9;->b:I

    if-eqz v3, :cond_a

    if-le v1, v2, :cond_6

    goto :goto_0

    :cond_6
    move v11, v1

    :goto_1
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Ljava/lang/String;

    move-object v14, v4

    check-cast v14, Ljava/lang/String;

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v12

    const/4 v10, 0x0

    invoke-static/range {v10 .. v15}, La/Ae;->E(IIILjava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_2

    :cond_8
    move-object v3, v9

    :goto_2
    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_9

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, La/mc;

    invoke-direct {v2, v1, v3}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v3, v2

    goto :goto_6

    :cond_9
    if-eq v11, v2, :cond_0

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_a
    if-le v1, v2, :cond_b

    goto :goto_0

    :cond_b
    move v5, v1

    :goto_3
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move v3, v2

    move-object v2, v10

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    move v7, v3

    const/4 v3, 0x0

    move v11, v7

    move v7, v15

    invoke-static/range {v2 .. v7}, La/Be;->R(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_5

    :cond_c
    move v2, v11

    goto :goto_4

    :cond_d
    move v11, v2

    move-object v10, v9

    :goto_5
    check-cast v10, Ljava/lang/String;

    if-eqz v10, :cond_e

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v3, La/mc;

    invoke-direct {v3, v1, v10}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_6

    :cond_e
    if-eq v5, v11, :cond_0

    add-int/lit8 v5, v5, 0x1

    move v2, v11

    goto :goto_3

    :goto_6
    if-eqz v3, :cond_f

    iget-object v1, v3, La/mc;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v9, La/mc;

    iget-object v2, v3, La/mc;->a:Ljava/lang/Object;

    invoke-direct {v9, v2, v1}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_f
    return-object v9

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/String;

    const-string v3, "taskName"

    invoke-static {v2, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, La/m0;->b:Landroid/os/Handler;

    new-instance v4, La/k0;

    iget-object v5, v0, La/i0;->b:Ljava/lang/Object;

    check-cast v5, Landroid/app/ProgressDialog;

    const/4 v6, 0x0

    invoke-direct {v4, v5, v1, v2, v6}, La/k0;-><init>(Ljava/lang/Object;ILjava/io/Serializable;I)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-object v1, La/Wf;->a:La/Wf;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
