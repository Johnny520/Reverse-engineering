.class public final synthetic LZ7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, LZ7;->a:I

    iput-object p2, p0, LZ7;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, LZ7;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LZ7;->b:Ljava/lang/Object;

    check-cast v0, [C

    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v1, 0x0

    invoke-static {p1, v0, p2, v1}, Ltz;->S(Ljava/lang/CharSequence;[CIZ)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-instance v0, LEt;

    invoke-direct {v0, p1, p2}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object p1, v0

    :goto_0
    return-object p1

    :pswitch_0
    iget-object v0, p0, LZ7;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object v3, p1

    check-cast v3, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result p2

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v7, 0x0

    if-ne p2, v2, :cond_5

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    if-eqz p2, :cond_4

    if-ne p2, v2, :cond_3

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v3, p2, p1, v1, v0}, Ltz;->R(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result p1

    if-gez p1, :cond_2

    :cond_1
    :goto_1
    move-object v0, v7

    goto/16 :goto_6

    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v0, LEt;

    invoke-direct {v0, p1, p2}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "List has more than one element."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string p2, "List is empty."

    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p2, LGl;

    if-gez p1, :cond_6

    move p1, v1

    :cond_6
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v4

    invoke-direct {p2, p1, v4, v2}, LDl;-><init>(III)V

    instance-of v2, v3, Ljava/lang/String;

    iget p2, p2, LDl;->b:I

    if-eqz v2, :cond_b

    if-le p1, p2, :cond_7

    goto :goto_1

    :cond_7
    :goto_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    move-object v6, v3

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v8

    invoke-virtual {v5, v1, v6, p1, v8}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_3

    :cond_9
    move-object v4, v7

    :goto_3
    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_a

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v0, LEt;

    invoke-direct {v0, p1, v4}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_6

    :cond_a
    if-eq p1, p2, :cond_1

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_b
    if-le p1, p2, :cond_c

    goto :goto_1

    :cond_c
    move v4, p1

    :goto_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v1, v8

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Ltz;->W(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_5

    :cond_e
    move-object v8, v7

    :goto_5
    check-cast v8, Ljava/lang/String;

    if-eqz v8, :cond_f

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v0, LEt;

    invoke-direct {v0, p1, v8}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_6

    :cond_f
    if-eq v4, p2, :cond_1

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :goto_6
    if-eqz v0, :cond_10

    iget-object p1, v0, LEt;->a:Ljava/lang/Object;

    iget-object p2, v0, LEt;->b:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-instance v7, LEt;

    invoke-direct {v7, p1, p2}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_10
    return-object v7

    :pswitch_1
    iget-object v0, p0, LZ7;->b:Ljava/lang/Object;

    check-cast v0, Lb8;

    check-cast p1, Lve;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    const-wide v1, -0x51aafffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v0, Lb8;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/16 v2, 0x32

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    int-to-float v3, v3

    div-float/2addr p2, v3

    float-to-int p2, p2

    add-int/2addr p2, p1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-static {p2, v3}, LTB;->f(II)I

    move-result p2

    iput p2, v0, Lb8;->f:I

    if-ne p1, p2, :cond_11

    goto :goto_9

    :cond_11
    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-ltz v2, :cond_15

    check-cast v3, Lve;

    if-eq v2, p1, :cond_14

    if-ge p1, p2, :cond_12

    add-int/lit8 v5, p1, 0x1

    if-gt v5, v2, :cond_12

    if-gt v2, p2, :cond_12

    neg-float v2, v0

    goto :goto_8

    :cond_12
    if-le p1, p2, :cond_13

    if-gt p2, v2, :cond_13

    if-ge v2, p1, :cond_13

    move v2, v0

    goto :goto_8

    :cond_13
    const/4 v2, 0x0

    :goto_8
    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const-wide/16 v5, 0xb4

    invoke-virtual {v2, v5, v6}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    :cond_14
    move v2, v4

    goto :goto_7

    :cond_15
    invoke-static {}, Lsa;->c0()V

    const/4 p1, 0x0

    throw p1

    :cond_16
    :goto_9
    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
