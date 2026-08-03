.class public final synthetic LOb;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfj;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LOb;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    iget v1, v0, LOb;->a:I

    const/4 v2, 0x3

    const/high16 v3, 0x55000000

    const-class v4, Ljava/lang/Object;

    const/4 v5, -0x1

    const-wide v6, -0x20dfbfffff835L

    const/16 v8, 0xd

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    sget-object v13, LTC;->a:LTC;

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x1dee1fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v2, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v3, -0x1deeefffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/app/Activity;

    invoke-static {v2}, Lk5;->d(Landroid/app/Activity;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    new-instance v2, Lvx;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    instance-of v3, v1, Ljava/lang/Class;

    if-eqz v3, :cond_0

    check-cast v1, Ljava/lang/Class;

    iput-object v1, v2, Lvx;->b:Ljava/io/Serializable;

    goto :goto_0

    :cond_0
    iput-object v1, v2, Lvx;->c:Ljava/lang/Object;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    :cond_1
    iput-object v10, v2, Lvx;->b:Ljava/io/Serializable;

    :goto_0
    const-wide v3, -0x1dea8fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lvx;->c(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, v1}, Lvx;->d(Ljava/lang/Object;)V

    :cond_2
    return-object v13

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x1dfc5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v2, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v3, -0x1dfd1fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    new-array v4, v12, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-wide v3, -0x1dfe0fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/view/ViewGroup;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v3, -0x1df9cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-object v3, v1

    check-cast v3, Landroid/app/Activity;

    invoke-static {v3}, Lk5;->d(Landroid/app/Activity;)Z

    move-result v4

    if-eqz v4, :cond_3

    const-wide v4, -0x1de56fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    new-array v5, v12, [Ljava/lang/Object;

    invoke-static {v1, v4, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-wide v4, -0x1de69fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    const-wide v4, -0x1de25fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    new-instance v4, Lz7;

    invoke-direct {v4, v3, v2, v1, v9}, Lz7;-><init>(Landroid/app/Activity;Landroid/view/ViewGroup;Landroid/view/ViewGroup;I)V

    invoke-virtual {v2, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_3
    return-object v13

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    const-wide v2, -0x2a69fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_4

    sget-object v2, LEA;->a:LEA;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, LEA;->j(Ljava/lang/String;)V

    :cond_4
    return-object v13

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x2a0bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v2, -0x2a17fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/app/Activity;

    invoke-static {}, Lgf;->I()Ljava/lang/String;

    move-result-object v2

    sget-object v3, LEA;->a:LEA;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, LEA;->b:Ljava/lang/String;

    invoke-static {v3, v2}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    sget-object v3, Lm0;->a:Lm0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2}, Lm0;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    :try_start_0
    sget-object v2, LY4;->a:LY4;

    new-instance v3, LOb;

    const/16 v4, 0x1b

    invoke-direct {v3, v4}, LOb;-><init>(I)V

    new-instance v4, Lfa;

    invoke-direct {v4, v1, v11}, Lfa;-><init>(Landroid/app/Activity;I)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v3, v4, v12}, LY4;->a(Landroid/content/Context;Lfj;Lfj;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_5
    return-object v13

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x2ba3fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    sget-object v2, LmD;->a:LmD;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v3, -0x2baffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v2, -0x1a57afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-static {}, LmD;->d()Landroid/content/SharedPreferences;

    move-result-object v2

    const-wide v3, -0x1a502fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v12}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_1

    :cond_6
    invoke-static {}, LmD;->d()Landroid/content/SharedPreferences;

    move-result-object v2

    const-wide v3, -0x1a514fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide/16 v4, 0x0

    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v2

    const-wide/32 v2, 0x927c0

    cmp-long v2, v4, v2

    if-gez v2, :cond_7

    goto :goto_1

    :cond_7
    invoke-static {v1, v12}, LmD;->c(Landroid/content/Context;Z)V

    :goto_1
    return-object v13

    :pswitch_4
    move-object/from16 v1, p1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/b;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v3, v2}, Lrz;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const/16 v2, 0x3a

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_5
    move-object/from16 v1, p1

    check-cast v1, LG9;

    new-instance v2, Ld;

    invoke-direct {v2, v8}, Ld;-><init>(I)V

    new-instance v3, Lwm;

    invoke-direct {v3, v2}, Lwm;-><init>(LUi;)V

    const-string v2, "JsonPrimitive"

    invoke-static {v1, v2, v3}, LG9;->a(LG9;Ljava/lang/String;Lwm;)V

    new-instance v2, Ld;

    const/16 v3, 0xe

    invoke-direct {v2, v3}, Ld;-><init>(I)V

    new-instance v3, Lwm;

    invoke-direct {v3, v2}, Lwm;-><init>(LUi;)V

    const-string v2, "JsonNull"

    invoke-static {v1, v2, v3}, LG9;->a(LG9;Ljava/lang/String;Lwm;)V

    new-instance v2, Ld;

    const/16 v3, 0xf

    invoke-direct {v2, v3}, Ld;-><init>(I)V

    new-instance v3, Lwm;

    invoke-direct {v3, v2}, Lwm;-><init>(LUi;)V

    const-string v2, "JsonLiteral"

    invoke-static {v1, v2, v3}, LG9;->a(LG9;Ljava/lang/String;Lwm;)V

    new-instance v2, Ld;

    const/16 v3, 0x10

    invoke-direct {v2, v3}, Ld;-><init>(I)V

    new-instance v3, Lwm;

    invoke-direct {v3, v2}, Lwm;-><init>(LUi;)V

    const-string v2, "JsonObject"

    invoke-static {v1, v2, v3}, LG9;->a(LG9;Ljava/lang/String;Lwm;)V

    new-instance v2, Ld;

    const/16 v3, 0x11

    invoke-direct {v2, v3}, Ld;-><init>(I)V

    new-instance v3, Lwm;

    invoke-direct {v3, v2}, Lwm;-><init>(LUi;)V

    const-string v2, "JsonArray"

    invoke-static {v1, v2, v3}, LG9;->a(LG9;Ljava/lang/String;Lwm;)V

    return-object v13

    :pswitch_6
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x2e71fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v2, -0x2e7dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-array v3, v12, [Ljava/lang/Object;

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v3, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-wide v2, -0x2e19fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sput v1, Lgf;->o:I

    return-object v13

    :pswitch_7
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x2f02fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->c:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    aget-object v1, v1, v12

    const-wide v2, -0x2f0efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/Menu;

    invoke-interface {v1}, Landroid/view/Menu;->size()I

    move-result v2

    if-ne v2, v9, :cond_a

    invoke-interface {v1, v12}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v2

    invoke-interface {v1, v11}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v3

    invoke-interface {v1}, Landroid/view/Menu;->clear()V

    invoke-interface {v2}, Landroid/view/MenuItem;->getItemId()I

    move-result v4

    invoke-interface {v2}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object v5

    invoke-interface {v1, v12, v4, v12, v5}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v4

    sget-object v5, LXA;->a:Ljava/util/HashMap;

    const-wide v5, -0x2fc5fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-nez v5, :cond_8

    invoke-interface {v2}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    :cond_8
    invoke-interface {v4, v5}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    invoke-interface {v3}, Landroid/view/MenuItem;->getItemId()I

    move-result v2

    invoke-interface {v3}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v1, v12, v2, v12, v4}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v1

    const-wide v4, -0x2febfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_9

    invoke-interface {v3}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    :cond_9
    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    :cond_a
    return-object v13

    :pswitch_8
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x24c4fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v2, -0x24d0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/app/Activity;

    const v2, 0x1020002

    invoke-virtual {v1, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    const v3, 0x550a021e

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v4}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    goto/16 :goto_2

    :cond_b
    invoke-virtual {v2, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    const-wide v6, -0x248afffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    check-cast v3, Landroid/view/ViewGroup;

    invoke-virtual {v3, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    const-wide v6, -0x2346fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    check-cast v3, Landroid/view/ViewGroup;

    const-wide v6, -0x2302fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object v4

    const-wide v6, -0x232cfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    check-cast v4, Landroid/view/ViewGroup;

    const-wide v6, -0x23e8fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object v6

    const-wide v9, -0x238ffffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    check-cast v6, Landroid/view/ViewGroup;

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    const-wide v9, -0x224bfffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    check-cast v7, Landroid/view/ViewGroup;

    new-instance v9, Landroid/widget/ImageView;

    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-direct {v9, v10}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    sget-object v10, LXA;->a:Ljava/util/HashMap;

    const-wide v10, -0x2207fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-virtual {v9, v10}, Landroid/view/View;->setElevation(F)V

    new-instance v10, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v11

    const-string v14, "status_bar_height"

    invoke-static {v11, v14}, Ln5;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v11

    invoke-static {v1}, Lgf;->z(Landroid/app/Activity;)I

    move-result v14

    add-int/2addr v14, v11

    invoke-direct {v10, v5, v14}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v7, v9, v12, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    new-instance v10, LMk;

    invoke-direct {v10, v3, v2, v9, v12}, LMk;-><init>(Landroid/view/ViewGroup;Landroid/view/ViewGroup;Landroid/widget/ImageView;I)V

    invoke-virtual {v3, v10}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    new-instance v2, Landroid/widget/ImageView;

    invoke-direct {v2, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const-wide v10, -0x2226fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v5, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {v7, v2, v12, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, LNk;

    invoke-direct {v1, v3, v9, v4, v6}, LNk;-><init>(Landroid/view/ViewGroup;Landroid/widget/ImageView;Landroid/view/ViewGroup;Landroid/view/ViewGroup;)V

    invoke-virtual {v7, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :goto_2
    return-object v13

    :pswitch_9
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x2e40fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    new-instance v2, Lvx;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    instance-of v3, v1, Ljava/lang/Class;

    if-eqz v3, :cond_c

    check-cast v1, Ljava/lang/Class;

    iput-object v1, v2, Lvx;->b:Ljava/io/Serializable;

    goto :goto_3

    :cond_c
    iput-object v1, v2, Lvx;->c:Ljava/lang/Object;

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    :cond_d
    iput-object v10, v2, Lvx;->b:Ljava/io/Serializable;

    :goto_3
    const-wide v3, -0x2e4cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lvx;->e(Ljava/lang/String;)V

    invoke-virtual {v2}, Lvx;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v12}, Landroid/view/Window;->setStatusBarColor(I)V

    return-object v13

    :pswitch_a
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x2f8ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    new-instance v2, Lvx;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    instance-of v3, v1, Ljava/lang/Class;

    if-eqz v3, :cond_e

    check-cast v1, Ljava/lang/Class;

    iput-object v1, v2, Lvx;->b:Ljava/io/Serializable;

    goto :goto_4

    :cond_e
    iput-object v1, v2, Lvx;->c:Ljava/lang/Object;

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    :cond_f
    iput-object v10, v2, Lvx;->b:Ljava/io/Serializable;

    :goto_4
    const-wide v3, -0x2f9bfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lvx;->e(Ljava/lang/String;)V

    invoke-virtual {v2}, Lvx;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v12}, Landroid/view/Window;->setStatusBarColor(I)V

    return-object v13

    :pswitch_b
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x223bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    if-eqz v1, :cond_10

    iget-object v2, v1, Lqs;->b:Ljava/lang/Object;

    goto :goto_5

    :cond_10
    move-object v2, v10

    :goto_5
    const-wide v3, -0x22c7fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/view/ViewGroup;

    iget-object v1, v1, Lqs;->c:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    aget-object v1, v1, v12

    const-wide v3, -0x2283fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v2, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    const-wide v3, -0x22b3fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/widget/LinearLayout;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    :goto_6
    if-ge v12, v3, :cond_1c

    invoke-virtual {v2, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    const-wide v5, -0x2174fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    check-cast v4, Landroid/view/ViewGroup;

    sget v5, LTB;->g:I

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    if-ne v12, v1, :cond_11

    sget-object v6, LXA;->a:Ljava/util/HashMap;

    const-wide v6, -0x2130fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const/high16 v7, -0x1000000

    invoke-static {v7, v6}, Lhw;->a(ILjava/lang/String;)I

    move-result v6

    goto :goto_7

    :cond_11
    sget-object v6, LXA;->a:Ljava/util/HashMap;

    const-wide v6, -0x21cdfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const v7, -0x777778

    invoke-static {v7, v6}, Lhw;->a(ILjava/lang/String;)I

    move-result v6

    :goto_7
    if-eqz v5, :cond_12

    const v7, 0x550a0227

    invoke-virtual {v5, v7, v10}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    const-class v6, Landroid/widget/TextView;

    invoke-virtual {v5, v7, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_12
    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Landroid/widget/ImageView;

    if-eqz v5, :cond_13

    check-cast v4, Landroid/widget/ImageView;

    goto :goto_8

    :cond_13
    move-object v4, v10

    :goto_8
    if-eqz v4, :cond_1b

    if-eqz v12, :cond_19

    if-eq v12, v11, :cond_17

    if-eq v12, v9, :cond_15

    sget-object v5, LXA;->a:Ljava/util/HashMap;

    if-ne v12, v1, :cond_14

    const-wide v5, -0x20fcfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    goto :goto_9

    :cond_14
    const-wide v5, -0x20a1fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    :goto_9
    invoke-static {v5}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    goto :goto_d

    :cond_15
    sget-object v5, LXA;->a:Ljava/util/HashMap;

    if-ne v12, v1, :cond_16

    const-wide v5, -0x2022fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    goto :goto_a

    :cond_16
    const-wide v5, -0x20d0fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    :goto_a
    invoke-static {v5}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    goto :goto_d

    :cond_17
    sget-object v5, LXA;->a:Ljava/util/HashMap;

    if-ne v12, v1, :cond_18

    const-wide v5, -0x204cfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    goto :goto_b

    :cond_18
    const-wide v5, -0x2076fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    :goto_b
    invoke-static {v5}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    goto :goto_d

    :cond_19
    sget-object v5, LXA;->a:Ljava/util/HashMap;

    if-ne v12, v1, :cond_1a

    const-wide v5, -0x21ecfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    goto :goto_c

    :cond_1a
    const-wide v5, -0x219bfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    :goto_c
    invoke-static {v5}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    :goto_d
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1b
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_6

    :cond_1c
    return-object v13

    :pswitch_c
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v4, -0x2ec9fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v4, -0x2ee7fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/View;

    sget-object v2, LXA;->a:Ljava/util/HashMap;

    const-wide v4, -0x2e9efffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lhw;->a(ILjava/lang/String;)I

    move-result v2

    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v3, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-object v13

    :pswitch_d
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x50bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->c:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    sget-object v2, Lak;->c:Landroid/graphics/Typeface;

    aput-object v2, v1, v12

    return-object v13

    :pswitch_e
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x6b1fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v2, -0x54ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/graphics/Paint;

    sget-object v2, Lak;->c:Landroid/graphics/Typeface;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    return-object v13

    :pswitch_f
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x6a4fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->c:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    sget-object v2, Lak;->c:Landroid/graphics/Typeface;

    aput-object v2, v1, v12

    return-object v13

    :pswitch_10
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x697fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->c:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    sget-object v2, Lak;->c:Landroid/graphics/Typeface;

    aput-object v2, v1, v12

    return-object v13

    :pswitch_11
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x63cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v2, -0x6dafffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/widget/TextView;

    sget-object v2, Lak;->c:Landroid/graphics/Typeface;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    return-object v13

    :pswitch_12
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x1844fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    sget-object v2, LYh;->b:LYh;

    invoke-virtual {v2}, LZk;->e()Z

    move-result v2

    if-eqz v2, :cond_1d

    iget-object v1, v1, LhG;->a:Lqs;

    sget v2, LYh;->c:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v1, v2}, Lqs;->C(Ljava/lang/Object;)V

    :cond_1d
    return-object v13

    :pswitch_13
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v3, -0x1a9ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    sget-object v3, Lch;->b:Lch;

    invoke-virtual {v3}, LZk;->e()Z

    move-result v3

    if-eqz v3, :cond_1e

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->c:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    aget-object v1, v1, v12

    const-wide v3, -0x1aabfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    new-instance v3, Ly7;

    invoke-direct {v3, v1, v2}, Ly7;-><init>(Landroid/view/ViewGroup;I)V

    invoke-virtual {v1, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_1e
    return-object v13

    :pswitch_14
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x3199fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v2, -0x31b7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    new-instance v2, Lvx;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v1, v2, Lvx;->c:Ljava/lang/Object;

    if-eqz v1, :cond_1f

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_e

    :cond_1f
    move-object v1, v10

    :goto_e
    iput-object v1, v2, Lvx;->b:Ljava/io/Serializable;

    const-wide v3, -0x3073fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lvx;->e(Ljava/lang/String;)V

    invoke-virtual {v2}, Lvx;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_20

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v10

    :cond_20
    const-wide v1, -0x3026fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    check-cast v10, Landroid/view/ViewGroup;

    invoke-virtual {v10}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    move v2, v12

    :goto_f
    if-ge v2, v1, :cond_21

    invoke-virtual {v10, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    iput v12, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v12, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_f

    :cond_21
    return-object v13

    :pswitch_15
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x3c9bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->c:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    aget-object v1, v1, v12

    const-wide v2, -0x3ca7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    invoke-static {v1}, Lgf;->o(Landroid/view/ViewGroup;)V

    sget-object v2, LXA;->a:Ljava/util/HashMap;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-wide v3, -0x3b63fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v2}, Lhw;->f(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_22

    const v2, -0x11000001

    goto :goto_10

    :cond_22
    const/high16 v2, -0x12000000

    :goto_10
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v3, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-static {v1, v3}, Lgf;->N(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    return-object v13

    :pswitch_16
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v5, -0x329efffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    new-instance v3, Lvx;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    instance-of v5, v1, Ljava/lang/Class;

    if-eqz v5, :cond_23

    check-cast v1, Ljava/lang/Class;

    iput-object v1, v3, Lvx;->b:Ljava/io/Serializable;

    goto :goto_12

    :cond_23
    iput-object v1, v3, Lvx;->c:Ljava/lang/Object;

    if-eqz v1, :cond_24

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_11

    :cond_24
    move-object v1, v10

    :goto_11
    iput-object v1, v3, Lvx;->b:Ljava/io/Serializable;

    :goto_12
    const-wide v5, -0x32aafffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lvx;->e(Ljava/lang/String;)V

    invoke-virtual {v3}, Lvx;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    const v3, 0x550a022b

    if-eqz v1, :cond_25

    invoke-virtual {v1, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_25
    if-eqz v1, :cond_26

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    goto :goto_13

    :cond_26
    move-object v1, v10

    :goto_13
    const-wide v5, -0x315efffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_27

    invoke-virtual {v1, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_27
    return-object v13

    :pswitch_17
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    const-wide v2, -0x3292fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x3295fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    xor-int/2addr v1, v11

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :pswitch_18
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x3d5dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->d:Ljava/lang/Object;

    check-cast v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object v1

    const-wide v2, -0x3d69fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    invoke-static {v1}, Lgf;->o(Landroid/view/ViewGroup;)V

    return-object v13

    :pswitch_19
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x30e2fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v2, v1, Lqs;->d:Ljava/lang/Object;

    check-cast v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-virtual {v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object v2

    const-wide v3, -0x30eefffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x30a5fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_28

    goto/16 :goto_17

    :cond_28
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_34

    move-object v3, v2

    check-cast v3, Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_32

    const-wide v14, -0x97aefffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    const-wide v14, -0x97b2fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    new-instance v5, Lvx;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    instance-of v8, v4, Ljava/lang/Class;

    if-eqz v8, :cond_29

    check-cast v4, Ljava/lang/Class;

    iput-object v4, v5, Lvx;->b:Ljava/io/Serializable;

    goto :goto_14

    :cond_29
    iput-object v4, v5, Lvx;->c:Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    iput-object v4, v5, Lvx;->b:Ljava/io/Serializable;

    :goto_14
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    iput-object v4, v5, Lvx;->d:Ljava/io/Serializable;

    invoke-virtual {v5}, Lvx;->a()Ljava/lang/Object;

    move-result-object v4

    const-wide v14, -0x97bcfffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const-wide v14, -0x9670fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v5

    const-wide v14, -0x967cfffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v8

    const-wide v14, -0x960bfffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v3, v14}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v14

    filled-new-array {v12, v12, v9}, [I

    move-result-object v9

    invoke-static {v3, v9}, Lgf;->F(Landroid/view/ViewGroup;[I)Landroid/view/View;

    move-result-object v9

    const-wide v15, -0x9617fffff835L

    invoke-static/range {v15 .. v16}, LGu;->r(J)Ljava/lang/String;

    check-cast v9, Landroid/widget/ImageView;

    filled-new-array {v12, v12, v11}, [I

    move-result-object v15

    invoke-static {v3, v15}, Lgf;->F(Landroid/view/ViewGroup;[I)Landroid/view/View;

    move-result-object v15

    const-wide v16, -0x96d5fffff835L

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    check-cast v15, Landroid/widget/TextView;

    move-wide/from16 v16, v6

    iget-object v6, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v18, -0x3f42fffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    check-cast v6, Landroid/widget/HeaderViewListAdapter;

    invoke-virtual {v6}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object v6

    iget-object v1, v1, Lqs;->c:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    aget-object v1, v1, v12

    const-wide v18, -0x3f0cfffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v6, v1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2a

    const-wide v6, -0x3f3cfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-array v7, v12, [Ljava/lang/Object;

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v7, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v7

    invoke-static {v1, v6, v7}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-wide v6, -0x3fc6fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/content/ContentValues;

    const-wide v6, -0x3f89fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    :cond_2a
    invoke-static {v12}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v3, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-eqz v4, :cond_2b

    sget-object v4, LXA;->a:Ljava/util/HashMap;

    const-wide v6, -0x3f92fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    goto :goto_15

    :cond_2b
    sget-object v4, LXA;->a:Ljava/util/HashMap;

    const-wide v6, -0x3fbdfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    :goto_15
    invoke-virtual {v1, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget-object v1, LXA;->a:Ljava/util/HashMap;

    const-wide v6, -0x3e6bfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v12, v1}, Lhw;->a(ILjava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_2c

    if-eqz v9, :cond_2c

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v9, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :cond_2c
    const-wide v6, -0x3e10fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_2f

    if-eqz v15, :cond_2f

    invoke-virtual {v15}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    if-eqz v4, :cond_2d

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_2e

    :cond_2d
    invoke-virtual {v15}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-nez v4, :cond_2e

    const-wide v6, -0x3ec1fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2e
    invoke-virtual {v15, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const-wide v6, -0x3ec5fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v12, v1}, Lhw;->a(ILjava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_2f

    invoke-virtual {v15, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_2f
    const-wide v6, -0x3ef1fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v12, v1}, Lhw;->a(ILjava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_30

    if-eqz v5, :cond_30

    const-wide v6, -0x3e94fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v1, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5, v4, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_30
    const-wide v4, -0x3ea1fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v12, v1}, Lhw;->a(ILjava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_32

    if-eqz v8, :cond_31

    const-wide v4, -0x3d43fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v5, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v8, v4, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_31
    if-eqz v14, :cond_32

    const-wide v4, -0x3d50fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v1, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v14, v4, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_32
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    sub-int/2addr v1, v11

    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    instance-of v4, v1, Landroid/view/ViewGroup;

    if-eqz v4, :cond_34

    check-cast v1, Landroid/view/ViewGroup;

    invoke-static {v1}, Lgf;->o(Landroid/view/ViewGroup;)V

    const v1, 0x550a021d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v4

    if-nez v4, :cond_34

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v3, v4}, Lgf;->x(Landroid/view/ViewGroup;Ljava/util/ArrayList;)V

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_33

    goto :goto_16

    :cond_33
    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    :goto_16
    check-cast v10, Landroid/view/View;

    if-eqz v10, :cond_34

    const/4 v3, 0x0

    invoke-virtual {v10, v3}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v2, v1, v10}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_34
    :goto_17
    return-object v13

    :pswitch_1a
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v6, -0x3d28fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v6, -0x3dc6fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    new-instance v2, Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v2, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    sget-object v4, LXA;->a:Ljava/util/HashMap;

    const-wide v6, -0x3d82fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lhw;->a(ILjava/lang/String;)I

    move-result v3

    new-instance v4, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v4, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v3, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v4, 0x64

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    iput v4, v3, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v1, v2, v12, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-object v13

    :pswitch_1b
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x31ecfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    const-wide v3, -0x318afffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    array-length v3, v2

    move v4, v12

    :goto_18
    if-ge v4, v3, :cond_36

    aget-object v5, v2, v4

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v6

    const-class v7, Landroid/graphics/Paint;

    invoke-static {v6, v7}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_35

    invoke-virtual {v5, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v6, LPb;

    invoke-direct {v6, v11}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {v6, v12}, LPb;->setColor(I)V

    invoke-virtual {v5, v1, v6}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_35
    add-int/lit8 v4, v4, 0x1

    goto :goto_18

    :cond_36
    return-object v13

    :pswitch_1c
    move-object/from16 v1, p1

    check-cast v1, [Ljava/lang/Class;

    const-wide v2, -0x3d25fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    array-length v1, v1

    if-nez v1, :cond_37

    goto :goto_19

    :cond_37
    move v11, v12

    :goto_19
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
