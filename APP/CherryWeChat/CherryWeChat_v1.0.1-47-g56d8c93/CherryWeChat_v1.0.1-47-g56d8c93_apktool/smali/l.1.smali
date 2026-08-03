.class public final Ll;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LWk;LEb;I)V
    .locals 0

    .line 1
    iput p3, p0, Ll;->e:I

    iput-object p1, p0, Ll;->g:Ljava/lang/Object;

    invoke-direct {p0, p2}, LOz;-><init>(LEb;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILEb;I)V
    .locals 0

    .line 2
    iput p4, p0, Ll;->e:I

    iput-object p1, p0, Ll;->g:Ljava/lang/Object;

    iput p2, p0, Ll;->f:I

    invoke-direct {p0, p3}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ll;->e:I

    check-cast p1, Lfc;

    check-cast p2, LEb;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p2, p1}, Ll;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Ll;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Ll;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p2, p1}, Ll;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Ll;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Ll;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p2, p1}, Ll;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Ll;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Ll;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_2
    invoke-virtual {p0, p2, p1}, Ll;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Ll;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Ll;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_3
    invoke-virtual {p0, p2, p1}, Ll;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Ll;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Ll;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0, p2, p1}, Ll;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Ll;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Ll;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-virtual {p0, p2, p1}, Ll;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Ll;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Ll;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_6
    invoke-virtual {p0, p2, p1}, Ll;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Ll;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Ll;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 3

    iget p2, p0, Ll;->e:I

    packed-switch p2, :pswitch_data_0

    new-instance p2, Ll;

    iget-object v0, p0, Ll;->g:Ljava/lang/Object;

    check-cast v0, LkD;

    const/4 v1, 0x7

    invoke-direct {p2, v0, p1, v1}, Ll;-><init>(LWk;LEb;I)V

    return-object p2

    :pswitch_0
    new-instance p2, Ll;

    iget-object v0, p0, Ll;->g:Ljava/lang/Object;

    check-cast v0, LWA;

    const/4 v1, 0x6

    invoke-direct {p2, v0, p1, v1}, Ll;-><init>(LWk;LEb;I)V

    return-object p2

    :pswitch_1
    new-instance p2, Ll;

    iget-object v0, p0, Ll;->g:Ljava/lang/Object;

    check-cast v0, Lfj;

    iget v1, p0, Ll;->f:I

    const/4 v2, 0x5

    invoke-direct {p2, v0, v1, p1, v2}, Ll;-><init>(Ljava/lang/Object;ILEb;I)V

    return-object p2

    :pswitch_2
    new-instance p2, Ll;

    iget-object v0, p0, Ll;->g:Ljava/lang/Object;

    check-cast v0, Lhk;

    iget v1, p0, Ll;->f:I

    const/4 v2, 0x4

    invoke-direct {p2, v0, v1, p1, v2}, Ll;-><init>(Ljava/lang/Object;ILEb;I)V

    return-object p2

    :pswitch_3
    new-instance p2, Ll;

    iget-object v0, p0, Ll;->g:Ljava/lang/Object;

    check-cast v0, LPi;

    const/4 v1, 0x3

    invoke-direct {p2, v0, p1, v1}, Ll;-><init>(LWk;LEb;I)V

    return-object p2

    :pswitch_4
    new-instance p2, Ll;

    iget-object v0, p0, Ll;->g:Ljava/lang/Object;

    check-cast v0, LXg;

    const/4 v1, 0x2

    invoke-direct {p2, v0, p1, v1}, Ll;-><init>(LWk;LEb;I)V

    return-object p2

    :pswitch_5
    new-instance p2, Ll;

    iget-object v0, p0, Ll;->g:Ljava/lang/Object;

    check-cast v0, Lqe;

    iget v1, p0, Ll;->f:I

    const/4 v2, 0x1

    invoke-direct {p2, v0, v1, p1, v2}, Ll;-><init>(Ljava/lang/Object;ILEb;I)V

    return-object p2

    :pswitch_6
    new-instance p2, Ll;

    iget-object v0, p0, Ll;->g:Ljava/lang/Object;

    check-cast v0, Lm;

    const/4 v1, 0x0

    invoke-direct {p2, v0, p1, v1}, Ll;-><init>(LWk;LEb;I)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Ll;->e:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    sget-object v3, Lgc;->a:Lgc;

    const/4 v4, 0x1

    sget-object v5, LTC;->a:LTC;

    iget-object v6, p0, Ll;->g:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v6, LkD;

    iget v0, p0, Ll;->f:I

    if-eqz v0, :cond_1

    if-ne v0, v4, :cond_0

    :try_start_0
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-wide v0, -0x2ea29fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_1
    sget-object p1, LZ2;->a:Lgf;

    iput v4, p0, Ll;->f:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lhe;->a:Lhd;

    sget-object p1, LVc;->b:LVc;

    new-instance v0, LY2;

    invoke-direct {v0, v4, v2}, LY2;-><init>(ILEb;)V

    invoke-static {p1, v0, p0}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_2

    goto :goto_3

    :cond_2
    :goto_0
    check-cast p1, Ljava/util/List;

    invoke-static {v6, p1}, LkD;->a(LkD;Ljava/util/List;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x2ea1efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, p1}, LkD;->e(Ljava/lang/String;)V

    :goto_2
    move-object v3, v5

    :goto_3
    return-object v3

    :pswitch_0
    check-cast v6, LWA;

    iget v0, p0, Ll;->f:I

    if-eqz v0, :cond_4

    if-ne v0, v4, :cond_3

    :try_start_2
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_4

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-wide v0, -0x1bdaffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_3
    sget-object p1, LNs;->a:LNs;

    iput v4, p0, Ll;->f:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v0, -0x16bf6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, LNs;->e(Ljava/lang/String;LEb;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_5

    goto :goto_6

    :cond_5
    :goto_4
    check-cast p1, Ljava/lang/String;

    invoke-static {v6, p1}, LWA;->a(LWA;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-static {v6, p1}, LWA;->e(LWA;Ljava/util/List;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_5

    :catch_1
    sget-object p1, LKf;->a:LKf;

    invoke-static {v6, p1}, LWA;->e(LWA;Ljava/util/List;)V

    :goto_5
    move-object v3, v5

    :goto_6
    return-object v3

    :pswitch_1
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    check-cast v6, Lfj;

    iget p1, p0, Ll;->f:I

    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {v6, v0}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v5

    :pswitch_2
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    check-cast v6, Lhk;

    iget-object p1, v6, Lhk;->e:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Ll;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object v5

    :pswitch_3
    check-cast v6, LPi;

    iget v0, p0, Ll;->f:I

    if-eqz v0, :cond_7

    if-ne v0, v4, :cond_6

    :try_start_4
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_7

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-wide v0, -0x4724fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_5
    sget-object p1, LNs;->a:LNs;

    iput v4, p0, Ll;->f:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v7, -0x16db7fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, LNs;->e(Ljava/lang/String;LEb;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_8

    goto/16 :goto_a

    :cond_8
    :goto_7
    check-cast p1, Ljava/lang/String;

    invoke-static {v6, p1}, LPi;->a(LPi;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-static {v6, p1}, LPi;->e(LPi;Ljava/util/List;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto/16 :goto_9

    :catch_2
    const-wide v3, -0x4716fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x471dfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const/16 p1, 0x20

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v0, v6, LPi;->a:Landroid/widget/LinearLayout;

    if-nez v0, :cond_9

    const-wide v3, -0x4608fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-object v0, v2

    :cond_9
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v3, 0x2

    if-le v0, v3, :cond_b

    iget-object v4, v6, LPi;->a:Landroid/widget/LinearLayout;

    if-nez v4, :cond_a

    const-wide v7, -0x4616fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-object v4, v2

    :cond_a
    sub-int/2addr v0, v3

    invoke-virtual {v4, v3, v0}, Landroid/view/ViewGroup;->removeViews(II)V

    :cond_b
    iget-object v0, v6, LPi;->a:Landroid/widget/LinearLayout;

    if-nez v0, :cond_c

    const-wide v3, -0x4624fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    goto :goto_8

    :cond_c
    move-object v2, v0

    :goto_8
    new-instance v0, Landroid/widget/TextView;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v0, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v3, -0x4632fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v3, 0x41800000    # 16.0f

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v4, 0x550603f7

    invoke-virtual {v3, v4}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v3, 0x11

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setGravity(I)V

    invoke-static {p1}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    invoke-static {p1}, LGu;->i(Ljava/lang/Number;)I

    move-result p1

    invoke-virtual {v0, v1, v3, v1, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :goto_9
    move-object v3, v5

    :goto_a
    return-object v3

    :pswitch_4
    check-cast v6, LXg;

    iget-object v0, v6, LXg;->c:Landroid/widget/LinearLayout;

    iget v7, p0, Ll;->f:I

    if-eqz v7, :cond_e

    if-ne v7, v4, :cond_d

    :try_start_6
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_b

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-wide v0, -0x2e3b0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_7
    sget-object p1, LZ2;->a:Lgf;

    iput v4, p0, Ll;->f:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lhe;->a:Lhd;

    sget-object p1, LVc;->b:LVc;

    new-instance v7, LY2;

    invoke-direct {v7, v1, v2}, LY2;-><init>(ILEb;)V

    invoke-static {p1, v7, p0}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_f

    goto/16 :goto_e

    :cond_f
    :goto_b
    check-cast p1, Ljava/util/List;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move v3, v1

    :goto_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_15

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v8, v3, 0x1

    if-ltz v3, :cond_14

    check-cast v7, Lio/github/cherrywechat/network/model/FAQCategory;

    if-lez v3, :cond_10

    invoke-static {v6}, LXg;->a(LXg;)V

    :cond_10
    invoke-virtual {v7}, Lio/github/cherrywechat/network/model/FAQCategory;->getCategoryName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, LXg;->e(LXg;Ljava/lang/String;)V

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-direct {v3, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v10, -0x1

    const/4 v11, -0x2

    invoke-direct {v9, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    const v10, 0x55060043

    invoke-virtual {v9, v10}, Landroid/content/Context;->getColor(I)I

    move-result v9

    new-instance v10, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v10, v9}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v3, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v9, Lk;

    const/4 v10, 0x3

    invoke-direct {v9, v10}, Lk;-><init>(I)V

    invoke-virtual {v3, v9}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setClipToOutline(Z)V

    invoke-virtual {v6, v0, v3}, LXg;->h(Landroid/widget/LinearLayout;Landroid/view/View;)V

    invoke-virtual {v7}, Lio/github/cherrywechat/network/model/FAQCategory;->getItems()Ljava/util/List;

    move-result-object v7

    new-instance v9, LWb;

    invoke-direct {v9, v10}, LWb;-><init>(I)V

    invoke-static {v7, v9}, Lra;->n0(Ljava/util/List;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v9, v1

    :goto_d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_13

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v11, v9, 0x1

    if-ltz v9, :cond_12

    check-cast v10, Lio/github/cherrywechat/network/model/FAQItem;

    if-lez v9, :cond_11

    invoke-static {v6}, LXg;->f(LXg;)V

    :cond_11
    new-instance v9, LWg;

    invoke-virtual {v10}, Lio/github/cherrywechat/network/model/FAQItem;->getQuestion()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10}, Lio/github/cherrywechat/network/model/FAQItem;->getAnswer()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v12, v10}, LWg;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v6, v9, v3}, LXg;->g(LXg;LWg;Landroid/widget/LinearLayout;)V

    move v9, v11

    goto :goto_d

    :cond_12
    invoke-static {}, Lsa;->c0()V

    throw v2

    :cond_13
    move v3, v8

    goto/16 :goto_c

    :cond_14
    invoke-static {}, Lsa;->c0()V

    throw v2
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    :catch_3
    const-wide v0, -0x2e391fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2e399fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    :cond_15
    move-object v3, v5

    :goto_e
    return-object v3

    :pswitch_5
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    check-cast v6, Lqe;

    iget p1, p0, Ll;->f:I

    invoke-virtual {v6, p1}, Lqe;->b(I)V

    return-object v5

    :pswitch_6
    check-cast v6, Lm;

    iget v0, p0, Ll;->f:I

    if-eqz v0, :cond_17

    if-ne v0, v4, :cond_16

    :try_start_8
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    goto :goto_f

    :catch_4
    move-exception p1

    goto :goto_10

    :cond_16
    new-instance p1, Ljava/lang/IllegalStateException;

    const-wide v0, -0x2e7ebfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_17
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_9
    sget-object p1, LNs;->a:LNs;

    iput v4, p0, Ll;->f:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v0, -0x16c52fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, LNs;->e(Ljava/lang/String;LEb;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_18

    goto :goto_12

    :cond_18
    :goto_f
    check-cast p1, Ljava/lang/String;

    invoke-static {v6, p1}, Lm;->a(Lm;Ljava/lang/String;)Lio/github/cherrywechat/network/model/AboutData;

    move-result-object p1

    if-eqz p1, :cond_19

    invoke-virtual {p1}, Lio/github/cherrywechat/network/model/AboutData;->getAppInfo()Lio/github/cherrywechat/network/model/AppInfo;

    move-result-object v0

    invoke-static {v6, v0}, Lm;->e(Lm;Lio/github/cherrywechat/network/model/AppInfo;)V

    invoke-virtual {p1}, Lio/github/cherrywechat/network/model/AboutData;->getFeatures()Ljava/util/List;

    move-result-object v0

    invoke-static {v6, v0}, Lm;->f(Lm;Ljava/util/List;)V

    invoke-virtual {p1}, Lio/github/cherrywechat/network/model/AboutData;->getDevelopers()Lio/github/cherrywechat/network/model/DeveloperGroups;

    move-result-object v0

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/DeveloperGroups;->getCore()Ljava/util/List;

    move-result-object v1

    iput-object v1, v6, Lm;->d:Ljava/util/List;

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/DeveloperGroups;->getSpecial()Ljava/util/List;

    move-result-object v0

    iput-object v0, v6, Lm;->e:Ljava/util/List;

    invoke-virtual {p1}, Lio/github/cherrywechat/network/model/AboutData;->getLinks()Ljava/util/List;

    move-result-object p1

    invoke-static {v6, p1}, Lm;->g(Lm;Ljava/util/List;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4

    goto :goto_11

    :goto_10
    const-wide v0, -0x2e7defffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :cond_19
    :goto_11
    move-object v3, v5

    :goto_12
    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
