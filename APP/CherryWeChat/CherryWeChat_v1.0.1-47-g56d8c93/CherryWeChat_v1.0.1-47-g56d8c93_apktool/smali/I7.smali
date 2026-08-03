.class public final synthetic LI7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfj;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Class;)V
    .locals 0

    iput p1, p0, LI7;->a:I

    iput-object p2, p0, LI7;->b:Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, LI7;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LI7;->b:Ljava/lang/Class;

    check-cast p1, Ljava/lang/Class;

    const-wide v1, -0x20c99fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, LI7;->b:Ljava/lang/Class;

    check-cast p1, LhG;

    const-wide v3, -0x136efffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    sget-object v3, LNb;->b:LNb;

    invoke-virtual {v3}, LZk;->e()Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v3, p1, LhG;->a:Lqs;

    iget-object v3, v3, Lqs;->c:Ljava/lang/Object;

    check-cast v3, [Ljava/lang/Object;

    aget-object v3, v3, v1

    const-wide v4, -0x137bfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v3, Ljava/util/List;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, LfG;->J(Ljava/lang/Object;)Lvx;

    move-result-object v6

    invoke-virtual {v0}, Ljava/lang/Class;->getTypeName()Ljava/lang/String;

    move-result-object v7

    const-wide v8, -0x133bfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v6, v7}, Lvx;->e(Ljava/lang/String;)V

    invoke-virtual {v6}, Lvx;->a()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, LfG;->J(Ljava/lang/Object;)Lvx;

    move-result-object v7

    const-wide v8, -0x13ccfffff835L

    invoke-static {v8, v9, v7}, LEy;->b(JLvx;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    goto :goto_1

    :cond_2
    move v7, v1

    :goto_1
    invoke-static {v6}, LfG;->J(Ljava/lang/Object;)Lvx;

    move-result-object v8

    const-wide v9, -0x13defffff835L

    invoke-static {v9, v10, v8}, LEy;->b(JLvx;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-nez v8, :cond_3

    const-wide v8, -0x13edfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    :cond_3
    invoke-static {v6}, LfG;->J(Ljava/lang/Object;)Lvx;

    move-result-object v6

    const-wide v9, -0x13eefffff835L

    invoke-static {v9, v10, v6}, LEy;->b(JLvx;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    const-wide/16 v9, 0x0

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    goto :goto_2

    :cond_4
    move-wide v11, v9

    :goto_2
    :try_start_0
    sget-object v6, LNb;->c:LHb;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eq v6, v2, :cond_9

    const/4 v9, 0x2

    if-eq v6, v9, :cond_8

    const/4 v7, 0x3

    if-eq v6, v7, :cond_7

    const/4 v7, 0x4

    if-eq v6, v7, :cond_6

    const/4 v7, 0x5

    if-eq v6, v7, :cond_5

    :goto_3
    move v6, v2

    goto :goto_4

    :cond_5
    sget-object v6, LNb;->d:Ljava/util/List;

    invoke-interface {v6, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_4

    :cond_6
    const-wide v6, -0x1383fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-static {v8, v1, v6}, LBz;->J(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v6

    goto :goto_4

    :cond_7
    const-wide v6, -0x13f9fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-static {v8, v1, v6}, LBz;->J(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_a

    sget-object v6, LNb;->d:Ljava/util/List;

    invoke-interface {v6, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v6, :cond_a

    goto :goto_3

    :cond_8
    if-lez v7, :cond_a

    goto :goto_3

    :cond_9
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    and-long/2addr v6, v11

    cmp-long v6, v6, v9

    if-eqz v6, :cond_a

    goto :goto_3

    :catchall_0
    :cond_a
    move v6, v1

    :goto_4
    if-eqz v6, :cond_1

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_b
    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->c:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    aput-object v4, p1, v1

    :goto_5
    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_1
    iget-object v0, p0, LI7;->b:Ljava/lang/Class;

    check-cast p1, LhG;

    const-wide v3, -0xa195fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->b:Ljava/lang/Object;

    const-wide v3, -0xa1a1fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    const-wide v4, -0xa05bfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v3

    if-nez v3, :cond_c

    goto/16 :goto_8

    :cond_c
    sget-object v3, LXA;->a:Ljava/util/HashMap;

    const-wide v3, -0xa060fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lhw;->a(ILjava/lang/String;)I

    move-result v3

    if-eqz v3, :cond_f

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    const-wide v4, -0xa000fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    array-length v4, v0

    :goto_6
    if-ge v1, v4, :cond_f

    aget-object v5, v0, v1

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v6

    const-class v7, Landroid/widget/TextView;

    invoke-static {v6, v7}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-virtual {v5, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v5, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Landroid/widget/TextView;

    if-eqz v6, :cond_d

    check-cast v5, Landroid/widget/TextView;

    goto :goto_7

    :cond_d
    const/4 v5, 0x0

    :goto_7
    if-eqz v5, :cond_e

    invoke-virtual {v5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    const-wide v7, -0xa017fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    const-wide v7, -0xa01ffffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    check-cast v6, Landroid/view/ViewGroup;

    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v5

    add-int/2addr v5, v2

    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    const-wide v6, -0xa0dbfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    check-cast v5, Landroid/widget/ImageView;

    new-instance v6, Landroid/graphics/PorterDuffColorFilter;

    invoke-static {v3}, Landroid/graphics/Color;->red(I)I

    move-result v7

    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    move-result v8

    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    move-result v9

    invoke-static {v7, v8, v9}, Landroid/graphics/Color;->rgb(III)I

    move-result v7

    sget-object v8, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v6, v7, v8}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {v5, v6}, Landroid/view/View;->setAlpha(F)V

    :cond_e
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_6

    :cond_f
    :goto_8
    sget-object p1, LTC;->a:LTC;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
