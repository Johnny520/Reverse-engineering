.class public final synthetic Lb;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfj;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lb;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v1, -0xb3f2fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v1, v0, Lqs;->c:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aget-object v3, v1, v2

    const/4 v4, 0x1

    aget-object v1, v1, v4

    const-wide v5, -0xb3fefffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Lvx;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    instance-of v6, v3, Ljava/lang/Class;

    const/4 v7, 0x0

    if-eqz v6, :cond_0

    check-cast v3, Ljava/lang/Class;

    iput-object v3, v5, Lvx;->b:Ljava/io/Serializable;

    goto :goto_1

    :cond_0
    iput-object v3, v5, Lvx;->c:Ljava/lang/Object;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v7

    :goto_0
    iput-object v3, v5, Lvx;->b:Ljava/io/Serializable;

    :goto_1
    const-class v3, Landroid/view/View;

    iput-object v3, v5, Lvx;->d:Ljava/io/Serializable;

    invoke-virtual {v5}, Lvx;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    new-instance v5, LC2;

    invoke-direct {v5, v4, v3}, LC2;-><init>(ILjava/lang/Object;)V

    iget-object v0, v0, Lqs;->b:Ljava/lang/Object;

    new-instance v3, LiG;

    invoke-direct {v3, v0}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v8, -0xb3aefffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, LiG;->f(Ljava/lang/String;)V

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v7, v0}, LiG;->c(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, LC2;

    const/4 v3, 0x3

    invoke-direct {v1, v3, v0}, LC2;-><init>(ILjava/lang/Object;)V

    sget-object v0, LXA;->a:Ljava/util/HashMap;

    const-wide v8, -0xb350fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lhw;->a(ILjava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_2

    iget-object v3, v5, LC2;->g:Ljava/lang/Object;

    check-cast v3, Landroid/widget/TextView;

    if-eqz v3, :cond_2

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_2
    iget-object v0, v1, LC2;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v3, v4, :cond_4

    invoke-static {v5, v1}, LPj;->h(LC2;LC2;)V

    goto/16 :goto_2f

    :cond_4
    :goto_2
    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const v6, 0x1000031

    if-ne v3, v6, :cond_6

    invoke-static {v5, v1}, LPj;->h(LC2;LC2;)V

    goto/16 :goto_2f

    :cond_6
    :goto_3
    if-nez v0, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const v6, 0x31000031

    if-ne v3, v6, :cond_8

    invoke-static {v5, v1}, LPj;->h(LC2;LC2;)V

    goto/16 :goto_2f

    :cond_8
    :goto_4
    if-nez v0, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const v6, 0x30000031

    if-ne v3, v6, :cond_a

    invoke-static {v5, v1}, LPj;->h(LC2;LC2;)V

    goto/16 :goto_2f

    :cond_a
    :goto_5
    if-nez v0, :cond_b

    goto :goto_6

    :cond_b
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const v6, 0x22000031

    if-ne v3, v6, :cond_c

    invoke-static {v5}, LPj;->g(LC2;)V

    goto/16 :goto_2f

    :cond_c
    :goto_6
    if-nez v0, :cond_d

    goto :goto_7

    :cond_d
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v6, 0x2710

    if-ne v3, v6, :cond_e

    invoke-static {v5}, LPj;->g(LC2;)V

    goto/16 :goto_2f

    :cond_e
    :goto_7
    if-nez v0, :cond_f

    goto :goto_8

    :cond_f
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const v6, 0x10002710

    if-ne v3, v6, :cond_10

    invoke-static {v5}, LPj;->g(LC2;)V

    goto/16 :goto_2f

    :cond_10
    :goto_8
    if-nez v0, :cond_11

    goto :goto_9

    :cond_11
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const v6, 0x37000031

    if-ne v3, v6, :cond_12

    invoke-static {v5}, LPj;->g(LC2;)V

    goto/16 :goto_2f

    :cond_12
    :goto_9
    if-nez v0, :cond_13

    goto/16 :goto_11

    :cond_13
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const v6, 0x41000031    # 8.000047f

    if-ne v3, v6, :cond_1d

    invoke-virtual {v1}, LC2;->d()Z

    move-result v0

    if-eqz v0, :cond_14

    const-wide v8, -0xb52dfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_a

    :cond_14
    const-wide v8, -0xb5cafffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :goto_a
    if-eqz v0, :cond_47

    invoke-virtual {v5}, LC2;->c()Landroid/view/View;

    move-result-object v3

    iget-object v6, v5, LC2;->h:Ljava/lang/Object;

    invoke-static {v3}, LPj;->k(Landroid/view/View;)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_15

    invoke-virtual {v3, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v3, v7}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    :cond_15
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    const-wide v8, -0xb5e6fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    array-length v3, v0

    move v8, v2

    :goto_b
    if-ge v8, v3, :cond_18

    aget-object v9, v0, v8

    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v10

    const-class v11, Landroid/widget/LinearLayout;

    invoke-static {v10, v11}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_17

    invoke-virtual {v9, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v9, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Landroid/view/View;

    if-eqz v10, :cond_16

    check-cast v9, Landroid/view/View;

    goto :goto_c

    :cond_16
    move-object v9, v7

    :goto_c
    if-eqz v9, :cond_17

    invoke-virtual {v9, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_17
    add-int/lit8 v8, v8, 0x1

    goto :goto_b

    :cond_18
    sget-object v0, LXA;->a:Ljava/util/HashMap;

    invoke-virtual {v1}, LC2;->d()Z

    move-result v0

    if-eqz v0, :cond_19

    const-wide v7, -0xb5fdfffff835L

    :goto_d
    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_e

    :cond_19
    const-wide v7, -0xb59efffff835L

    goto :goto_d

    :goto_e
    invoke-static {v2, v0}, Lhw;->a(ILjava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1b

    new-instance v3, Lvx;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    instance-of v7, v6, Ljava/lang/Class;

    if-eqz v7, :cond_1a

    check-cast v6, Ljava/lang/Class;

    iput-object v6, v3, Lvx;->b:Ljava/io/Serializable;

    goto :goto_f

    :cond_1a
    iput-object v6, v3, Lvx;->c:Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    iput-object v6, v3, Lvx;->b:Ljava/io/Serializable;

    :goto_f
    const-wide v6, -0xb440fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lvx;->e(Ljava/lang/String;)V

    invoke-virtual {v3}, Lvx;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_1b

    const-wide v6, -0xb468fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    const-wide v8, -0x20dfbfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v7, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v7

    invoke-static {v3, v6, v7}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1b
    invoke-virtual {v5}, LC2;->c()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    invoke-interface {v3}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    const-wide v6, -0xb475fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    check-cast v3, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1c

    goto :goto_10

    :cond_1c
    move v4, v2

    :goto_10
    invoke-virtual {v1}, LC2;->d()Z

    move-result v1

    invoke-static {v3, v0, v4, v1}, LPj;->f(Landroid/view/ViewGroup;IZZ)V

    goto/16 :goto_2f

    :cond_1d
    :goto_11
    const-class v3, Landroid/widget/TextView;

    if-nez v0, :cond_1e

    goto/16 :goto_19

    :cond_1e
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/16 v8, 0x22

    if-ne v6, v8, :cond_26

    invoke-virtual {v5}, LC2;->c()Landroid/view/View;

    move-result-object v0

    iget-object v6, v5, LC2;->h:Ljava/lang/Object;

    const-wide v8, -0xb679fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1}, LC2;->d()Z

    move-result v8

    if-eqz v8, :cond_1f

    const-wide v8, -0xb635fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    goto :goto_12

    :cond_1f
    const-wide v8, -0xb6d4fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    :goto_12
    invoke-virtual {v0, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1}, LC2;->d()Z

    move-result v9

    invoke-static {v0, v9}, LPj;->e(Landroid/view/View;Z)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    const-wide v9, -0xb6f2fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    array-length v9, v0

    move v10, v2

    :goto_13
    if-ge v10, v9, :cond_47

    aget-object v11, v0, v10

    invoke-virtual {v11, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v12

    const-wide v13, -0xb689fffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_25

    invoke-virtual {v11, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    instance-of v12, v11, Landroid/view/View;

    if-eqz v12, :cond_20

    check-cast v11, Landroid/view/View;

    goto :goto_14

    :cond_20
    move-object v11, v7

    :goto_14
    if-eqz v11, :cond_25

    invoke-virtual {v11}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v12

    instance-of v12, v12, Landroid/widget/FrameLayout;

    if-eqz v12, :cond_25

    invoke-virtual {v11, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v11}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v11

    const-wide v12, -0xb6aefffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    check-cast v11, Landroid/view/ViewGroup;

    invoke-virtual {v11}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v12

    move v13, v2

    :goto_15
    if-ge v13, v12, :cond_25

    invoke-virtual {v11, v13}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v14

    instance-of v15, v14, Landroid/widget/TextView;

    if-eqz v15, :cond_24

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v15, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_24

    sget-object v7, LXA;->a:Ljava/util/HashMap;

    invoke-virtual {v1}, LC2;->d()Z

    move-result v7

    if-eqz v7, :cond_21

    const-wide v15, -0xb56afffff835L

    :goto_16
    invoke-static/range {v15 .. v16}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    goto :goto_17

    :cond_21
    const-wide v15, -0xb50cfffff835L

    goto :goto_16

    :goto_17
    invoke-static {v2, v7}, Lhw;->a(ILjava/lang/String;)I

    move-result v7

    if-eqz v7, :cond_24

    check-cast v14, Landroid/widget/TextView;

    invoke-virtual {v14}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v15

    invoke-virtual {v1}, LC2;->d()Z

    move-result v16

    if-eqz v16, :cond_22

    const/16 v16, 0x2

    goto :goto_18

    :cond_22
    move/from16 v16, v2

    :goto_18
    aget-object v15, v15, v16

    if-eqz v15, :cond_23

    new-instance v4, Landroid/graphics/PorterDuffColorFilter;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v4, v7, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v15, v4}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_23
    invoke-virtual {v14, v7}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_24
    add-int/lit8 v13, v13, 0x1

    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v7, 0x0

    goto :goto_15

    :cond_25
    add-int/lit8 v10, v10, 0x1

    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v7, 0x0

    goto/16 :goto_13

    :cond_26
    :goto_19
    if-nez v0, :cond_27

    goto/16 :goto_25

    :cond_27
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const v4, 0x19000031

    if-ne v2, v4, :cond_38

    iget-object v0, v5, LC2;->h:Ljava/lang/Object;

    if-eqz v0, :cond_28

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_1a

    :cond_28
    const/4 v2, 0x0

    :goto_1a
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    const-wide v6, -0x89eafffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    array-length v4, v2

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_1b
    if-ge v6, v4, :cond_2a

    aget-object v8, v2, v6

    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v9

    invoke-static {v9, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_29

    invoke-virtual {v8, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    const-wide v9, -0x8981fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    check-cast v8, Landroid/widget/TextView;

    invoke-virtual {v8}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v8

    const-wide v9, -0x89befffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    const-wide v9, -0x884bfffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    invoke-static {v8, v9, v10}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v8

    if-eqz v8, :cond_29

    const/4 v7, 0x1

    :cond_29
    add-int/lit8 v6, v6, 0x1

    goto :goto_1b

    :cond_2a
    if-eqz v7, :cond_2c

    invoke-virtual {v1}, LC2;->d()Z

    move-result v2

    if-eqz v2, :cond_2b

    sget-object v2, LXA;->a:Ljava/util/HashMap;

    const-wide v8, -0x884dfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_1c

    :cond_2b
    sget-object v2, LXA;->a:Ljava/util/HashMap;

    const-wide v8, -0x8876fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_1c

    :cond_2c
    invoke-virtual {v1}, LC2;->d()Z

    move-result v2

    if-eqz v2, :cond_2d

    sget-object v2, LXA;->a:Ljava/util/HashMap;

    const-wide v8, -0x881efffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_1c

    :cond_2d
    sget-object v2, LXA;->a:Ljava/util/HashMap;

    const-wide v8, -0x883ffffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    :goto_1c
    if-eqz v2, :cond_47

    invoke-virtual {v5}, LC2;->c()Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_2e

    invoke-virtual {v4, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1}, LC2;->d()Z

    move-result v2

    invoke-static {v4, v2}, LPj;->e(Landroid/view/View;Z)V

    :cond_2e
    sget-object v2, LXA;->a:Ljava/util/HashMap;

    if-eqz v7, :cond_30

    invoke-virtual {v1}, LC2;->d()Z

    move-result v2

    if-eqz v2, :cond_2f

    const-wide v6, -0x88dffffff835L

    :goto_1d
    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    goto :goto_1f

    :cond_2f
    const-wide v6, -0x888dfffff835L

    goto :goto_1d

    :cond_30
    invoke-virtual {v1}, LC2;->d()Z

    move-result v2

    if-eqz v2, :cond_31

    const-wide v6, -0x88bafffff835L

    :goto_1e
    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    goto :goto_1f

    :cond_31
    const-wide v6, -0xb760fffff835L

    goto :goto_1e

    :goto_1f
    const/high16 v4, -0x10000

    invoke-static {v4, v2}, Lhw;->a(ILjava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_34

    if-eqz v0, :cond_32

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    goto :goto_20

    :cond_32
    const/4 v4, 0x0

    :goto_20
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v4

    const-wide v6, -0xb705fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    array-length v6, v4

    const/4 v7, 0x0

    :goto_21
    if-ge v7, v6, :cond_34

    aget-object v8, v4, v7

    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v9

    invoke-static {v9, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_33

    invoke-virtual {v8, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    const-wide v9, -0xb71cfffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    check-cast v8, Landroid/widget/TextView;

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_33
    add-int/lit8 v7, v7, 0x1

    goto :goto_21

    :cond_34
    invoke-virtual {v1}, LC2;->d()Z

    move-result v1

    if-eqz v1, :cond_35

    sget-object v1, LXA;->a:Ljava/util/HashMap;

    const-wide v1, -0xb7d9fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    goto :goto_22

    :cond_35
    sget-object v1, LXA;->a:Ljava/util/HashMap;

    const-wide v1, -0xb7fffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :goto_22
    if-eqz v1, :cond_47

    if-eqz v0, :cond_36

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    goto :goto_23

    :cond_36
    const/4 v7, 0x0

    :goto_23
    invoke-virtual {v7}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    const-wide v3, -0xb7a4fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_24
    if-ge v4, v3, :cond_47

    aget-object v6, v2, v4

    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Landroid/widget/ImageView;

    invoke-static {v7, v8}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_37

    invoke-virtual {v6, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    const-wide v7, -0xb7bbfffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    check-cast v6, Landroid/widget/ImageView;

    invoke-virtual {v6, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_37
    add-int/lit8 v4, v4, 0x1

    goto :goto_24

    :cond_38
    :goto_25
    if-nez v0, :cond_39

    goto/16 :goto_29

    :cond_39
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const v3, 0x1a000031

    if-ne v2, v3, :cond_42

    invoke-virtual {v5}, LC2;->c()Landroid/view/View;

    move-result-object v0

    iget-object v2, v5, LC2;->d:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const-wide v3, -0x8d9bfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/view/ViewGroup;

    const-wide v3, -0x8c57fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const-wide v3, -0x8c7bfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/view/ViewGroup;

    const-wide v3, -0x8c37fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const/4 v10, 0x0

    invoke-static {v10, v3}, Lhw;->a(ILjava/lang/String;)I

    move-result v3

    if-eqz v3, :cond_3a

    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    const-wide v6, -0x8cdefffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    check-cast v4, Landroid/widget/TextView;

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_3a
    const-wide v3, -0x8c9bfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v10, v3}, Lhw;->a(ILjava/lang/String;)I

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_3b

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    const-wide v7, -0x8b43fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    check-cast v6, Landroid/widget/TextView;

    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_3b
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    const-wide v6, -0x8b00fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_3d

    invoke-virtual {v1}, LC2;->d()Z

    move-result v3

    if-eqz v3, :cond_3c

    const-wide v3, -0x8b10fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    goto :goto_26

    :cond_3c
    const-wide v3, -0x8b3bfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    goto :goto_26

    :cond_3d
    invoke-virtual {v1}, LC2;->d()Z

    move-result v3

    if-eqz v3, :cond_3e

    const-wide v3, -0x8be5fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    goto :goto_26

    :cond_3e
    const-wide v3, -0x8b88fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    :goto_26
    if-eqz v3, :cond_47

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const-wide v6, -0x8baafffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/view/ViewGroup;

    const/4 v10, 0x0

    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    const-wide v6, -0x8a66fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/widget/ImageView;

    const-wide v6, -0x8a24fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz v2, :cond_3f

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1}, LC2;->d()Z

    move-result v0

    invoke-static {v2, v0}, LPj;->e(Landroid/view/View;Z)V

    :cond_3f
    invoke-virtual {v5}, LC2;->c()Landroid/view/View;

    move-result-object v0

    const-wide v3, -0x8ac4fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/view/ViewGroup;

    const-wide v3, -0x8a80fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_40

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_27

    :cond_40
    const/4 v0, 0x0

    :goto_27
    const-wide v3, -0x8ab3fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    const-wide v3, -0x896ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/view/ViewGroup;

    const-wide v3, -0x892bfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lgf;->w(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_41

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    goto :goto_28

    :cond_41
    const/4 v7, 0x0

    :goto_28
    const-wide v2, -0x892efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v7, Landroid/view/ViewGroup;

    invoke-virtual {v7, v1}, Landroid/view/View;->setAlpha(F)V

    goto/16 :goto_2f

    :cond_42
    :goto_29
    if-nez v0, :cond_43

    goto/16 :goto_2f

    :cond_43
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v2, 0x32

    if-ne v0, v2, :cond_47

    invoke-virtual {v5}, LC2;->c()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1}, LC2;->d()Z

    move-result v2

    if-eqz v2, :cond_44

    const-wide v2, -0x8d5ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_2a

    :cond_44
    const-wide v2, -0x8d7efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    :goto_2a
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v5}, LC2;->c()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1}, LC2;->d()Z

    move-result v2

    invoke-static {v0, v2}, LPj;->e(Landroid/view/View;Z)V

    invoke-virtual {v1}, LC2;->d()Z

    move-result v0

    if-eqz v0, :cond_45

    const-wide v0, -0x8d1cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :goto_2b
    const/4 v10, 0x0

    goto :goto_2c

    :cond_45
    const-wide v0, -0x8d3efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_2b

    :goto_2c
    invoke-static {v10, v0}, Lhw;->a(ILjava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_47

    invoke-virtual {v5}, LC2;->c()Landroid/view/View;

    move-result-object v1

    const-wide v2, -0x8ddffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    const/4 v10, 0x0

    :goto_2d
    if-ge v10, v2, :cond_47

    invoke-virtual {v1, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    instance-of v4, v3, Landroid/widget/TextView;

    if-eqz v4, :cond_46

    check-cast v3, Landroid/widget/TextView;

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_2e

    :cond_46
    invoke-virtual {v3}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    new-instance v6, Landroid/graphics/PorterDuffColorFilter;

    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    move-result v7

    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    move-result v8

    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    move-result v9

    const/16 v11, 0xff

    invoke-static {v11, v7, v8, v9}, Landroid/graphics/Color;->argb(IIII)I

    move-result v7

    sget-object v8, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v6, v7, v8}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v4, v6}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v6

    invoke-virtual {v4, v6}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :goto_2e
    add-int/lit8 v10, v10, 0x1

    goto :goto_2d

    :cond_47
    :goto_2f
    sget-object v0, LXA;->a:Ljava/util/HashMap;

    const-wide v0, -0x8d45fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x0

    invoke-static {v10, v0}, Lhw;->a(ILjava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_48

    iget-object v1, v5, LC2;->f:Ljava/lang/Object;

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_48

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_48
    sget-object v0, LTC;->a:LTC;

    return-object v0
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget v0, p0, Lb;->a:I

    const-class v1, Landroid/widget/Button;

    const/4 v2, 0x0

    const-wide v3, -0x81d0fffff835L

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    sget-object v8, LTC;->a:LTC;

    packed-switch v0, :pswitch_data_0

    check-cast p1, LhG;

    const/16 v0, 0x19

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-wide v3, -0xb1c8fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->b:Ljava/lang/Object;

    const-wide v3, -0xb1e6fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/widget/FrameLayout;

    sget-object v1, LXA;->a:Ljava/util/HashMap;

    const-wide v3, -0xb1a6fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-wide v3, -0xb048fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v2, v1}, Lgf;->t(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)Landroid/widget/ImageView;

    move-result-object v1

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v0

    invoke-direct {v2, v3, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v0, 0x11

    iput v0, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {p1, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-object v8

    :pswitch_0
    check-cast p1, LhG;

    const-wide v0, -0xb2f5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->b:Ljava/lang/Object;

    const-wide v0, -0xb293fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/widget/EditText;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0xb150fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, LXA;->a:Ljava/util/HashMap;

    const-wide v0, -0xb174fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0xb10ffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lhw;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    sget-object v1, LE7;->b:LE7;

    invoke-virtual {v1}, LZk;->e()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    :cond_1
    const-wide v0, -0xb110fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const v1, -0x777778

    invoke-static {v1, v0}, Lhw;->a(ILjava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setHintTextColor(I)V

    const-wide v0, -0xb12cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lhw;->a(ILjava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_2

    const v1, 0x550a0227

    invoke-virtual {p1, v1, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    const-class v0, Landroid/widget/TextView;

    invoke-virtual {p1, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_2
    return-object v8

    :pswitch_1
    check-cast p1, LhG;

    const-wide v0, -0xf9f5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object v0, p1, Lqs;->b:Ljava/lang/Object;

    iget-object p1, p1, Lqs;->c:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    const-wide v1, -0xf982fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0xf9bffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, LE7;->b:LE7;

    invoke-virtual {v0}, LZk;->e()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, LZk;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    aput-object v0, p1, v7

    goto :goto_0

    :cond_4
    sget-object v0, LXA;->a:Ljava/util/HashMap;

    const-wide v0, -0xf863fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0xf87efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lhw;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_5

    aput-object v0, p1, v7

    :cond_5
    :goto_0
    return-object v8

    :pswitch_2
    check-cast p1, LhG;

    const-wide v0, -0xf95afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->b:Ljava/lang/Object;

    const-wide v0, -0xf978fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/widget/EditText;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0xf935fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, LE7;->b:LE7;

    invoke-virtual {v0}, LZk;->e()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {v0}, LZk;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_7
    sget-object v0, LXA;->a:Ljava/util/HashMap;

    const-wide v0, -0xf9d9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0xf9f4fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lhw;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    :cond_8
    :goto_1
    return-object v8

    :pswitch_3
    check-cast p1, LhG;

    const-wide v0, -0xb3b6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object v0, p1, Lqs;->b:Ljava/lang/Object;

    iget-object p1, p1, Lqs;->c:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v6

    :cond_9
    const-class v0, Landroid/text/style/ClickableSpan;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_3

    :cond_a
    sget-object v0, LXA;->a:Ljava/util/HashMap;

    const-wide v0, -0xb243fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lhw;->a(ILjava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_f

    aget-object v1, p1, v7

    const-wide v2, -0xb25ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aget-object v2, p1, v5

    const-wide v3, -0xb20ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const v3, -0xa8946b

    if-ne v1, v3, :cond_b

    const/high16 v3, 0x1a000000

    if-eq v2, v3, :cond_c

    :cond_b
    const v3, -0xc8af7e

    if-ne v1, v3, :cond_f

    const v1, 0xdffffff

    if-ne v2, v1, :cond_f

    :cond_c
    const-wide v1, -0xb23ffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x2f8effffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v2

    move v3, v7

    :goto_2
    array-length v4, v2

    if-ge v3, v4, :cond_e

    add-int/lit8 v4, v3, 0x1

    :try_start_0
    aget-object v3, v2, v3
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v3

    const-wide v9, -0x2f8f4fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v3, v1, v7}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_d

    goto :goto_3

    :cond_d
    move v3, v4

    goto :goto_2

    :catch_0
    move-exception p1

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, p1, v7

    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    move-result v1

    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    move-result v2

    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    move-result v0

    const/16 v3, 0x42

    invoke-static {v3, v1, v2, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p1, v5

    :cond_f
    :goto_3
    return-object v8

    :pswitch_4
    invoke-direct {p0, p1}, Lb;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, LhG;

    const-wide v0, -0x8e6bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LXA;->a:Ljava/util/HashMap;

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_10

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->b:Ljava/lang/Object;

    const-wide v1, -0x8e09fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_10
    return-object v8

    :pswitch_6
    check-cast p1, LhG;

    const-wide v0, -0x8fe5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LXA;->a:Ljava/util/HashMap;

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_13

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->b:Ljava/lang/Object;

    new-instance v1, Lvx;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    instance-of v2, p1, Ljava/lang/Class;

    if-eqz v2, :cond_11

    check-cast p1, Ljava/lang/Class;

    iput-object p1, v1, Lvx;->b:Ljava/io/Serializable;

    goto :goto_4

    :cond_11
    iput-object p1, v1, Lvx;->c:Ljava/lang/Object;

    if-eqz p1, :cond_12

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    :cond_12
    iput-object v6, v1, Lvx;->b:Ljava/io/Serializable;

    :goto_4
    const-class p1, Landroid/widget/ImageView;

    iput-object p1, v1, Lvx;->d:Ljava/io/Serializable;

    invoke-virtual {v1}, Lvx;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    const-wide v1, -0x8ff1fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    const-wide v1, -0x8fadfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    instance-of v1, v1, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v1, :cond_13

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_13
    return-object v8

    :pswitch_7
    check-cast p1, LhG;

    const-wide v0, -0x8f10fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->b:Ljava/lang/Object;

    const-wide v0, -0x8f2efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    return-object v8

    :pswitch_8
    check-cast p1, LhG;

    const-wide v0, -0x8004fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->b:Ljava/lang/Object;

    const-wide v0, -0x8022fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_6

    :sswitch_0
    const-wide v1, -0x8f4dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_6

    :sswitch_1
    const-wide v1, -0x809afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_6

    :sswitch_2
    const-wide v1, -0x8f6afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    goto :goto_5

    :sswitch_3
    const-wide v1, -0x80defffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_6

    :cond_14
    :goto_5
    sget-object v0, LXA;->a:Ljava/util/HashMap;

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_15

    new-instance v1, Ln3;

    invoke-direct {v1, v5, p1, v0}, Ln3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_15
    :goto_6
    return-object v8

    :pswitch_9
    check-cast p1, LhG;

    const-wide v0, -0x81e5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->c:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    aget-object p1, p1, v7

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-wide v1, -0x81f1fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x81abfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-wide v3, -0xbf85fffff835L

    const/4 v9, -0x1

    if-eqz v2, :cond_16

    new-instance v1, Landroid/view/View;

    invoke-direct {v1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    sget-object v2, LXA;->a:Ljava/util/HashMap;

    const-wide v10, -0x859ffffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const-wide v10, -0x85befffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object v2

    const-wide v10, -0x8470fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2}, Lgf;->r(Landroid/view/View;)V

    invoke-virtual {v2, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    const-wide v10, -0x842cfffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    check-cast v6, Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v10

    const-wide v11, -0x84e8fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    check-cast v10, Landroid/view/ViewGroup;

    invoke-static {v6}, Lgf;->o(Landroid/view/ViewGroup;)V

    new-instance v11, Landroid/view/ViewGroup$LayoutParams;

    new-instance v12, Ln5;

    invoke-direct {v12, v0}, Ln5;-><init>(Landroid/app/Activity;)V

    iget v12, v12, Ln5;->a:I

    invoke-static {v0}, Lgf;->z(Landroid/app/Activity;)I

    move-result v13

    add-int/2addr v13, v12

    invoke-direct {v11, v9, v13}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v10, v1, v7, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    new-instance v9, LD7;

    invoke-direct {v9, v6, v0, v7}, LD7;-><init>(Landroid/view/ViewGroup;Landroid/app/Activity;I)V

    invoke-virtual {v6, v9}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    new-instance v0, LA7;

    invoke-direct {v0, v6, v2, v1, v5}, LA7;-><init>(Landroid/view/ViewGroup;Landroid/view/ViewGroup;Landroid/view/View;I)V

    invoke-virtual {v6, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    const-wide v0, -0x84a4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object p1

    const-wide v0, -0x8350fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/view/ViewGroup;

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Ly7;

    invoke-direct {v0, p1, v5}, Ly7;-><init>(Landroid/view/ViewGroup;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_8

    :cond_16
    const-wide v10, -0x8048fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    const v10, 0x1020002

    if-eqz v1, :cond_1a

    invoke-virtual {v0, v10}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-static {v1}, Lgf;->o(Landroid/view/ViewGroup;)V

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    const-wide v10, -0x830cfffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    check-cast v6, Landroid/view/ViewGroup;

    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    const-wide v10, -0x83c8fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    check-cast v6, Landroid/view/ViewGroup;

    new-instance v10, LD7;

    invoke-direct {v10, v0, v1}, LD7;-><init>(Landroid/app/Activity;Landroid/view/ViewGroup;)V

    invoke-virtual {p1, v10}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    new-instance v10, LD7;

    const/4 v11, 0x2

    invoke-direct {v10, v6, v0, v11}, LD7;-><init>(Landroid/view/ViewGroup;Landroid/app/Activity;I)V

    invoke-virtual {v6, v10}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    invoke-static {v6}, Lgf;->o(Landroid/view/ViewGroup;)V

    new-instance v6, Landroid/widget/ImageView;

    invoke-direct {v6, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    sget-object v10, LXA;->a:Ljava/util/HashMap;

    const-wide v10, -0x8384fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v10

    invoke-virtual {v6, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v6, v2}, Landroid/view/View;->setElevation(F)V

    new-instance v10, Landroid/view/ViewGroup$LayoutParams;

    new-instance v11, Ln5;

    invoke-direct {v11, v0}, Ln5;-><init>(Landroid/app/Activity;)V

    iget v11, v11, Ln5;->a:I

    invoke-static {v0}, Lgf;->z(Landroid/app/Activity;)I

    move-result v12

    add-int/2addr v12, v11

    invoke-direct {v10, v9, v12}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v6, v7, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    const-class v6, Landroid/widget/ListView;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object v6

    if-eqz v6, :cond_17

    invoke-static {v0}, Lgf;->z(Landroid/app/Activity;)I

    move-result v10

    invoke-virtual {v6, v7, v10, v7, v7}, Landroid/view/View;->setPadding(IIII)V

    new-instance v10, Landroid/widget/ImageView;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v10, v6}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const-wide v11, -0x8138fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v10, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget-object v6, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v10, v6}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    new-instance v6, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v6, v9, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v10, v7, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    :cond_17
    const-wide v10, -0x83a6fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object v1

    const-wide v10, -0x8258fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    invoke-static {v1}, Lgf;->r(Landroid/view/View;)V

    const-wide v10, -0x8214fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-static {p1, v6}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object p1

    const-wide v10, -0x82c0fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/view/ViewGroup;

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, Ly7;

    invoke-direct {v3, p1, v5}, Ly7;-><init>(Landroid/view/ViewGroup;I)V

    invoke-virtual {p1, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    const-wide v10, -0x82fcfffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    check-cast v3, Landroid/view/ViewGroup;

    invoke-virtual {v1, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    const-wide v10, -0x82b8fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    check-cast v4, Landroid/view/ViewGroup;

    new-instance v6, Ly7;

    invoke-direct {v6, v4, v7}, Ly7;-><init>(Landroid/view/ViewGroup;I)V

    invoke-virtual {v4, v6}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    invoke-static {v4}, Lgf;->o(Landroid/view/ViewGroup;)V

    new-instance v6, Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-direct {v6, v10}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v6, v2}, Landroid/view/View;->setElevation(F)V

    new-instance v2, Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-direct {v2, v10}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const-wide v10, -0x8174fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v10

    invoke-virtual {v2, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v10, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v11

    const-string v12, "status_bar_height"

    invoke-static {v11, v12}, Ln5;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v11

    invoke-static {v0}, Lgf;->z(Landroid/app/Activity;)I

    move-result v13

    add-int/2addr v13, v11

    invoke-direct {v10, v9, v13}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v2, v7, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-direct {v2, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v5, Landroid/widget/Space;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v5, p1}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    sget-object p1, Lio/github/cherrywechat/application/MainApplication;->a:Lio/github/cherrywechat/application/MainApplication;

    if-eqz p1, :cond_18

    goto :goto_7

    :cond_18
    sget-object p1, Lgf;->p:Landroid/app/Application;

    if-eqz p1, :cond_19

    goto :goto_7

    :cond_19
    invoke-static {}, Landroid/app/AndroidAppHelper;->currentApplication()Landroid/app/Application;

    move-result-object p1

    const-wide v10, -0x2f91cfffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    :goto_7
    const-wide v10, -0x2fab3fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    invoke-static {p1, v12}, Ln5;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v2, v5, v9, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const/4 p1, -0x2

    invoke-virtual {v2, v4, v9, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    invoke-virtual {v6, v2, v9, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v2, v9, p1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v6, v7, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    new-instance p1, Landroid/widget/Space;

    invoke-direct {p1, v0}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-static {v0}, Lgf;->z(Landroid/app/Activity;)I

    move-result v0

    invoke-direct {v2, v9, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, p1, v7, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_8

    :cond_1a
    invoke-virtual {v0, v10}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v10

    const-wide v11, -0x878cfffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    check-cast v10, Landroid/view/ViewGroup;

    invoke-virtual {v10, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    const-wide v11, -0x8648fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    check-cast v10, Landroid/view/ViewGroup;

    const-wide v11, -0x8604fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    invoke-static {p1, v11}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object v11

    const-wide v12, -0x8636fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    check-cast v11, Landroid/view/ViewGroup;

    invoke-static {v11}, Lgf;->r(Landroid/view/View;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v11

    const-wide v12, -0x86f2fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1c

    const-wide v11, -0x8698fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    invoke-static {p1, v11}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object v11

    if-eqz v11, :cond_1b

    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    :cond_1b
    const-wide v11, -0x854bfffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    check-cast v6, Landroid/widget/FrameLayout$LayoutParams;

    invoke-static {v0}, Lgf;->z(Landroid/app/Activity;)I

    move-result v11

    iput v11, v6, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    :cond_1c
    invoke-static {v10}, Lgf;->o(Landroid/view/ViewGroup;)V

    new-instance v6, Landroid/view/View;

    invoke-direct {v6, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    sget-object v11, LXA;->a:Ljava/util/HashMap;

    const-wide v11, -0x8518fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v11

    invoke-virtual {v6, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v6, v2}, Landroid/view/View;->setElevation(F)V

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    new-instance v11, Ln5;

    invoke-direct {v11, v0}, Ln5;-><init>(Landroid/app/Activity;)V

    iget v11, v11, Ln5;->a:I

    invoke-static {v0}, Lgf;->z(Landroid/app/Activity;)I

    move-result v12

    add-int/2addr v12, v11

    invoke-direct {v2, v9, v12}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v6, v7, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Lz7;

    invoke-direct {v2, v10, v0, v1, v7}, Lz7;-><init>(Landroid/view/ViewGroup;Landroid/app/Activity;Landroid/view/ViewGroup;I)V

    invoke-virtual {v10, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    new-instance v0, LA7;

    invoke-direct {v0, v10, v1, v6, v7}, LA7;-><init>(Landroid/view/ViewGroup;Landroid/view/ViewGroup;Landroid/view/View;I)V

    invoke-virtual {v10, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    const-wide v0, -0x8537fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object p1

    const-wide v0, -0x85e3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/view/ViewGroup;

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Ly7;

    invoke-direct {v0, p1, v5}, Ly7;-><init>(Landroid/view/ViewGroup;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :goto_8
    return-object v8

    :pswitch_a
    check-cast p1, LhG;

    const-wide v0, -0x1a124fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object v0, p1, Lqs;->b:Ljava/lang/Object;

    const-wide v1, -0x1a131fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x1a1e8fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1d

    iget-object p1, p1, Lqs;->c:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    if-eqz p1, :cond_1d

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p1, v7

    :cond_1d
    return-object v8

    :pswitch_b
    check-cast p1, LhG;

    const-wide v0, -0x994cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object v0, p1, Lqs;->b:Ljava/lang/Object;

    const-wide v1, -0x9959fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1e

    move v0, v7

    goto :goto_9

    :cond_1e
    const v1, 0x550a022b

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    const-class v1, Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    :goto_9
    if-eqz v0, :cond_1f

    iget-object p1, p1, Lqs;->c:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    aput-object v6, p1, v7

    :cond_1f
    return-object v8

    :pswitch_c
    check-cast p1, LhG;

    const-wide v2, -0xd748fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object v0, p1, Lqs;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    const-wide v2, -0xd754fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    array-length v2, v0

    move v3, v7

    :goto_a
    if-ge v3, v2, :cond_21

    aget-object v4, v0, v3

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v6

    invoke-static {v6, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_20

    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    iget-object v6, p1, Lqs;->b:Ljava/lang/Object;

    invoke-virtual {v4, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const-wide v9, -0xd76bfffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    check-cast v4, Landroid/widget/Button;

    new-instance v6, Le5;

    invoke-direct {v6, v7, v4}, Le5;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_20
    add-int/lit8 v3, v3, 0x1

    goto :goto_a

    :cond_21
    return-object v8

    :pswitch_d
    check-cast p1, LhG;

    const-wide v0, -0xa868fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lc5;->b:Lc5;

    invoke-virtual {v0}, LZk;->e()Z

    move-result v0

    if-eqz v0, :cond_22

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->b:Ljava/lang/Object;

    const-wide v0, -0xa875fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-wide v0, -0xa82ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_22
    return-object v8

    :pswitch_e
    check-cast p1, LhG;

    const-wide v2, -0xa939fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, La5;->b:La5;

    invoke-virtual {v0}, LZk;->e()Z

    move-result v0

    if-eqz v0, :cond_25

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->b:Ljava/lang/Object;

    new-instance v0, Lvx;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    instance-of v2, p1, Ljava/lang/Class;

    if-eqz v2, :cond_23

    check-cast p1, Ljava/lang/Class;

    iput-object p1, v0, Lvx;->b:Ljava/io/Serializable;

    goto :goto_b

    :cond_23
    iput-object p1, v0, Lvx;->c:Ljava/lang/Object;

    if-eqz p1, :cond_24

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    :cond_24
    iput-object v6, v0, Lvx;->b:Ljava/io/Serializable;

    :goto_b
    iput-object v1, v0, Lvx;->d:Ljava/io/Serializable;

    invoke-virtual {v0}, Lvx;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    if-eqz p1, :cond_25

    invoke-virtual {p1}, Landroid/view/View;->callOnClick()Z

    :cond_25
    return-object v8

    :pswitch_f
    check-cast p1, LhG;

    const-wide v0, -0xaaaafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, La5;->b:La5;

    invoke-virtual {v0}, LZk;->e()Z

    move-result v0

    if-eqz v0, :cond_28

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->b:Ljava/lang/Object;

    const-wide v0, -0xaab7fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/app/Activity;

    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v0, -0xa971fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, LNx;->a(Ljava/lang/String;Z)Z

    move-result v0

    const-wide v1, -0xa97dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, LNx;->a(Ljava/lang/String;Z)Z

    move-result v1

    const-wide v2, -0xa90dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v7}, LNx;->a(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v1, :cond_26

    or-int/lit8 v0, v0, 0x2

    :cond_26
    if-eqz v2, :cond_27

    or-int/lit8 v0, v0, 0x4

    :cond_27
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-wide v1, -0xa91dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    :cond_28
    return-object v8

    :pswitch_10
    check-cast p1, Ljava/lang/Byte;

    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    const-wide v0, -0x1642ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-wide v0, -0x16434fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-object p1

    :pswitch_11
    check-cast p1, LhG;

    const-wide v0, -0x1a226fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->b:Ljava/lang/Object;

    const-wide v0, -0x1a233fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/app/Activity;

    if-nez p1, :cond_29

    sput-object v6, Lgf;->q:Ljava/lang/ref/WeakReference;

    goto :goto_c

    :cond_29
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lgf;->q:Ljava/lang/ref/WeakReference;

    :goto_c
    return-object v8

    :pswitch_12
    check-cast p1, LhG;

    const-wide v0, -0x1a25ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->b:Ljava/lang/Object;

    const-wide v0, -0x1a26cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/app/Activity;

    if-nez p1, :cond_2a

    sput-object v6, Lgf;->q:Ljava/lang/ref/WeakReference;

    goto :goto_d

    :cond_2a
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lgf;->q:Ljava/lang/ref/WeakReference;

    :goto_d
    return-object v8

    :pswitch_13
    check-cast p1, LhG;

    const-wide v0, -0x1a252fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object p1, Lio/github/cherrywechat/lua/LuaUiScheduler;->INSTANCE:Lio/github/cherrywechat/lua/LuaUiScheduler;

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/LuaUiScheduler;->onActivityPaused()V

    return-object v8

    :pswitch_14
    check-cast p1, LhG;

    const-wide v0, -0x1a245fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object p1, Lio/github/cherrywechat/lua/LuaUiScheduler;->INSTANCE:Lio/github/cherrywechat/lua/LuaUiScheduler;

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/LuaUiScheduler;->onActivityPaused()V

    return-object v8

    :pswitch_15
    check-cast p1, LhG;

    const-wide v0, -0x1a3fefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->b:Ljava/lang/Object;

    const-wide v0, -0x1a38bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/app/Activity;

    if-nez p1, :cond_2b

    sput-object v6, Lgf;->q:Ljava/lang/ref/WeakReference;

    goto :goto_e

    :cond_2b
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lgf;->q:Ljava/lang/ref/WeakReference;

    :goto_e
    sget-object p1, Lio/github/cherrywechat/lua/LuaUiScheduler;->INSTANCE:Lio/github/cherrywechat/lua/LuaUiScheduler;

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/LuaUiScheduler;->onActivityResumed()V

    return-object v8

    :pswitch_16
    check-cast p1, LhG;

    const-wide v0, -0x1a337fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->b:Ljava/lang/Object;

    const-wide v0, -0x1a3c4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/app/Activity;

    if-nez p1, :cond_2c

    sput-object v6, Lgf;->q:Ljava/lang/ref/WeakReference;

    goto :goto_f

    :cond_2c
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lgf;->q:Ljava/lang/ref/WeakReference;

    :goto_f
    sget-object p1, Lio/github/cherrywechat/lua/LuaUiScheduler;->INSTANCE:Lio/github/cherrywechat/lua/LuaUiScheduler;

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/LuaUiScheduler;->onActivityResumed()V

    return-object v8

    :pswitch_17
    check-cast p1, LhG;

    const-wide v0, -0x1a370fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->b:Ljava/lang/Object;

    const-wide v0, -0x1a37dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/app/Activity;

    if-nez p1, :cond_2d

    sput-object v6, Lgf;->q:Ljava/lang/ref/WeakReference;

    goto :goto_10

    :cond_2d
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lgf;->q:Ljava/lang/ref/WeakReference;

    :goto_10
    return-object v8

    :pswitch_18
    check-cast p1, LhG;

    const-wide v0, -0x1a4a9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->b:Ljava/lang/Object;

    const-wide v0, -0x1a4b6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/app/Activity;

    if-nez p1, :cond_2e

    sput-object v6, Lgf;->q:Ljava/lang/ref/WeakReference;

    goto :goto_11

    :cond_2e
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lgf;->q:Ljava/lang/ref/WeakReference;

    :goto_11
    return-object v8

    :pswitch_19
    check-cast p1, LhG;

    const-wide v0, -0xaca7fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lc;->b:Lc;

    invoke-virtual {v0}, LZk;->e()Z

    move-result v0

    if-nez v0, :cond_2f

    goto/16 :goto_17

    :cond_2f
    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->c:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    aget-object p1, p1, v7

    sget-object v0, Lc;->c:Ljava/lang/reflect/Field;

    if-nez v0, :cond_31

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    const-wide v1, -0xacb4fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    array-length v1, v0

    move v2, v7

    :goto_12
    if-ge v2, v1, :cond_31

    aget-object v3, v0, v2

    :try_start_1
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v4

    new-instance v5, LiG;

    invoke-direct {v5, v4}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v9, -0xab43fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, LiG;->f(Ljava/lang/String;)V

    invoke-virtual {v5}, LiG;->e()Ljava/lang/reflect/Method;

    move-result-object v4

    if-eqz v4, :cond_30

    sput-object v3, Lc;->c:Ljava/lang/reflect/Field;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_30
    add-int/lit8 v2, v2, 0x1

    goto :goto_12

    :cond_31
    sget-object v0, Lc;->c:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_32

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_13

    :cond_32
    move-object p1, v6

    :goto_13
    if-eqz p1, :cond_36

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    if-eqz v0, :cond_36

    array-length v1, v0

    :goto_14
    if-ge v7, v1, :cond_36

    aget-object v2, v0, v7

    :try_start_2
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Ljava/lang/String;

    invoke-static {v3, v4}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_35

    invoke-virtual {v2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_33

    check-cast v3, Ljava/lang/String;

    goto :goto_15

    :cond_33
    move-object v3, v6

    :goto_15
    if-eqz v3, :cond_35

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_34

    goto :goto_16

    :cond_34
    const-wide v4, -0xab52fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-wide v9, -0xab5efffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_35

    const-wide v3, -0xab6bfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, p1, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :cond_35
    :goto_16
    add-int/lit8 v7, v7, 0x1

    goto :goto_14

    :cond_36
    :goto_17
    return-object v8

    :pswitch_1a
    check-cast p1, LhG;

    const-wide v0, -0xab3ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lc;->b:Lc;

    invoke-virtual {v0}, LZk;->e()Z

    move-result v0

    if-eqz v0, :cond_37

    iget-object p1, p1, LhG;->a:Lqs;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lqs;->C(Ljava/lang/Object;)V

    :cond_37
    return-object v8

    :pswitch_1b
    check-cast p1, LhG;

    const-wide v0, -0xab6efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    sget-object v0, Lc;->b:Lc;

    invoke-virtual {v0}, LZk;->e()Z

    move-result v0

    if-nez v0, :cond_38

    goto/16 :goto_19

    :cond_38
    iget-object v0, p1, Lqs;->c:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    array-length v1, v0

    :goto_18
    if-ge v7, v1, :cond_3a

    aget-object v2, v0, v7

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_39

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    const-wide v4, -0xab0dfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_39

    :try_start_3
    new-instance v3, Lorg/json/JSONObject;

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    invoke-direct {v3, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-wide v4, -0xab0ffffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0xab18fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_39

    const-wide v4, -0xab29fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    const-wide v5, -0xab2efffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v9, -0xab39fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-wide v5, -0xab3afffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v4, p1, Lqs;->c:Ljava/lang/Object;

    check-cast v4, [Ljava/lang/Object;

    invoke-static {v2, v4}, LP4;->G(Ljava/lang/Object;[Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v4, v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :cond_39
    add-int/lit8 v7, v7, 0x1

    goto :goto_18

    :cond_3a
    :goto_19
    return-object v8

    :pswitch_1c
    check-cast p1, LhG;

    const-wide v0, -0xac9afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lc;->b:Lc;

    invoke-virtual {v0}, LZk;->e()Z

    move-result v0

    if-eqz v0, :cond_3b

    iget-object p1, p1, LhG;->a:Lqs;

    invoke-virtual {p1, v6}, Lqs;->C(Ljava/lang/Object;)V

    :cond_3b
    return-object v8

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

    :sswitch_data_0
    .sparse-switch
        -0x5bc1d702 -> :sswitch_3
        0x318ff340 -> :sswitch_2
        0x544d5b6d -> :sswitch_1
        0x606a0576 -> :sswitch_0
    .end sparse-switch
.end method
