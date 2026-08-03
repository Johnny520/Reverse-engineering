.class public final La/a7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/LayoutInflater$Factory2;


# instance fields
.field public final a:La/e7;


# direct methods
.method public constructor <init>(La/e7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/a7;->a:La/e7;

    return-void
.end method


# virtual methods
.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    const/4 v4, -0x1

    .line 2
    const-class v5, Landroidx/fragment/app/FragmentContainerView;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    iget-object v6, v0, La/a7;->a:La/e7;

    if-eqz v5, :cond_0

    .line 3
    new-instance v1, Landroidx/fragment/app/FragmentContainerView;

    invoke-direct {v1, v2, v3, v6}, Landroidx/fragment/app/FragmentContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;La/e7;)V

    return-object v1

    .line 4
    :cond_0
    const-string v5, "fragment"

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v5, 0x0

    if-nez v1, :cond_1

    goto/16 :goto_9

    .line 5
    :cond_1
    const-string v1, "class"

    invoke-interface {v3, v5, v1}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 6
    sget-object v7, Landroidx/fragment/R$styleable;->Fragment:[I

    invoke-virtual {v2, v3, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v7

    if-nez v1, :cond_2

    .line 7
    sget v1, Landroidx/fragment/R$styleable;->Fragment_android_name:I

    invoke-virtual {v7, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 8
    :cond_2
    sget v8, Landroidx/fragment/R$styleable;->Fragment_android_id:I

    invoke-virtual {v7, v8, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    .line 9
    sget v9, Landroidx/fragment/R$styleable;->Fragment_android_tag:I

    invoke-virtual {v7, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 10
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v1, :cond_19

    .line 11
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v7

    const/4 v10, 0x0

    .line 12
    :try_start_0
    invoke-static {v7, v1}, Landroidx/fragment/app/d;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    .line 13
    const-class v11, Landroidx/fragment/app/b;

    invoke-virtual {v11, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move v7, v10

    :goto_0
    if-nez v7, :cond_3

    goto/16 :goto_9

    :cond_3
    if-eqz p1, :cond_4

    .line 14
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getId()I

    move-result v10

    :cond_4
    if-ne v10, v4, :cond_6

    if-ne v8, v4, :cond_6

    if-eqz v9, :cond_5

    goto :goto_1

    .line 15
    :cond_5
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": Must specify unique android:id, android:tag, or have a parent with an id for "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_6
    :goto_1
    if-eq v8, v4, :cond_7

    .line 16
    invoke-virtual {v6, v8}, La/e7;->C(I)Landroidx/fragment/app/b;

    move-result-object v7

    goto :goto_2

    :cond_7
    move-object v7, v5

    :goto_2
    const/4 v11, 0x1

    if-nez v7, :cond_c

    if-eqz v9, :cond_c

    .line 17
    iget-object v7, v6, La/e7;->c:La/A2;

    iget-object v12, v7, La/A2;->a:Ljava/lang/Object;

    check-cast v12, Ljava/util/ArrayList;

    .line 18
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v13

    sub-int/2addr v13, v11

    :goto_3
    if-ltz v13, :cond_9

    .line 19
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/fragment/app/b;

    if-eqz v14, :cond_8

    .line 20
    iget-object v15, v14, Landroidx/fragment/app/b;->z:Ljava/lang/String;

    invoke-virtual {v9, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_8

    move-object v7, v14

    goto :goto_4

    :cond_8
    add-int/2addr v13, v4

    goto :goto_3

    .line 21
    :cond_9
    iget-object v7, v7, La/A2;->b:Ljava/lang/Object;

    check-cast v7, Ljava/util/HashMap;

    .line 22
    invoke-virtual {v7}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/fragment/app/e;

    if-eqz v12, :cond_a

    .line 23
    iget-object v12, v12, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    iget-object v13, v12, Landroidx/fragment/app/b;->z:Ljava/lang/String;

    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    move-object v7, v12

    goto :goto_4

    :cond_b
    move-object v7, v5

    :cond_c
    :goto_4
    if-nez v7, :cond_d

    if-eq v10, v4, :cond_d

    .line 24
    invoke-virtual {v6, v10}, La/e7;->C(I)Landroidx/fragment/app/b;

    move-result-object v7

    .line 25
    :cond_d
    const-string v4, "Fragment "

    const-string v12, "FragmentManager"

    const/4 v13, 0x2

    if-nez v7, :cond_11

    .line 26
    invoke-virtual {v6}, La/e7;->G()Landroidx/fragment/app/d;

    move-result-object v3

    .line 27
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 28
    invoke-virtual {v3, v1}, Landroidx/fragment/app/d;->a(Ljava/lang/String;)Landroidx/fragment/app/b;

    move-result-object v7

    .line 29
    iput-boolean v11, v7, Landroidx/fragment/app/b;->n:Z

    if-eqz v8, :cond_e

    move v2, v8

    goto :goto_5

    :cond_e
    move v2, v10

    .line 30
    :goto_5
    iput v2, v7, Landroidx/fragment/app/b;->x:I

    .line 31
    iput v10, v7, Landroidx/fragment/app/b;->y:I

    .line 32
    iput-object v9, v7, Landroidx/fragment/app/b;->z:Ljava/lang/String;

    .line 33
    iput-boolean v11, v7, Landroidx/fragment/app/b;->o:Z

    .line 34
    iput-object v6, v7, Landroidx/fragment/app/b;->t:La/e7;

    .line 35
    iget-object v2, v6, La/e7;->v:La/X6$a;

    .line 36
    iput-object v2, v7, Landroidx/fragment/app/b;->u:La/X6$a;

    .line 37
    iget-object v3, v2, La/Z6;->b:La/X6;

    .line 38
    iput-boolean v11, v7, Landroidx/fragment/app/b;->E:Z

    if-nez v2, :cond_f

    goto :goto_6

    .line 39
    :cond_f
    iget-object v5, v2, La/Z6;->a:La/X6;

    :goto_6
    if-eqz v5, :cond_10

    .line 40
    iput-boolean v11, v7, Landroidx/fragment/app/b;->E:Z

    .line 41
    :cond_10
    invoke-virtual {v6, v7}, La/e7;->a(Landroidx/fragment/app/b;)Landroidx/fragment/app/e;

    move-result-object v2

    .line 42
    invoke-static {v13}, La/e7;->J(I)Z

    move-result v3

    if-eqz v3, :cond_14

    .line 43
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " has been inflated via the <fragment> tag: id=0x"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    invoke-static {v8}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 45
    invoke-static {v12, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_8

    .line 46
    :cond_11
    iget-boolean v2, v7, Landroidx/fragment/app/b;->o:Z

    if-nez v2, :cond_18

    .line 47
    iput-boolean v11, v7, Landroidx/fragment/app/b;->o:Z

    .line 48
    iput-object v6, v7, Landroidx/fragment/app/b;->t:La/e7;

    .line 49
    iget-object v2, v6, La/e7;->v:La/X6$a;

    .line 50
    iput-object v2, v7, Landroidx/fragment/app/b;->u:La/X6$a;

    .line 51
    iget-object v3, v2, La/Z6;->b:La/X6;

    .line 52
    iput-boolean v11, v7, Landroidx/fragment/app/b;->E:Z

    if-nez v2, :cond_12

    goto :goto_7

    .line 53
    :cond_12
    iget-object v5, v2, La/Z6;->a:La/X6;

    :goto_7
    if-eqz v5, :cond_13

    .line 54
    iput-boolean v11, v7, Landroidx/fragment/app/b;->E:Z

    .line 55
    :cond_13
    invoke-virtual {v6, v7}, La/e7;->g(Landroidx/fragment/app/b;)Landroidx/fragment/app/e;

    move-result-object v2

    .line 56
    invoke-static {v13}, La/e7;->J(I)Z

    move-result v3

    if-eqz v3, :cond_14

    .line 57
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Retained Fragment "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " has been re-attached via the <fragment> tag: id=0x"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    invoke-static {v8}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 59
    invoke-static {v12, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    :cond_14
    :goto_8
    move-object/from16 v3, p1

    check-cast v3, Landroid/view/ViewGroup;

    sget-object v5, La/o7;->a:La/o7$b;

    .line 61
    new-instance v5, La/m7;

    .line 62
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v10, "Attempting to use <fragment> tag to add fragment "

    invoke-direct {v6, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, " to container "

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 63
    invoke-direct {v5, v7, v6}, La/m7;-><init>(Landroidx/fragment/app/b;Ljava/lang/String;)V

    .line 64
    invoke-static {v5}, La/o7;->b(La/m7;)V

    .line 65
    invoke-static {v7}, La/o7;->a(Landroidx/fragment/app/b;)La/o7$b;

    move-result-object v5

    .line 66
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    iput-object v3, v7, Landroidx/fragment/app/b;->F:Landroid/view/ViewGroup;

    .line 68
    invoke-virtual {v2}, Landroidx/fragment/app/e;->k()V

    .line 69
    invoke-virtual {v2}, Landroidx/fragment/app/e;->j()V

    .line 70
    iget-object v3, v7, Landroidx/fragment/app/b;->G:Landroid/view/View;

    if-eqz v3, :cond_17

    if-eqz v8, :cond_15

    .line 71
    invoke-virtual {v3, v8}, Landroid/view/View;->setId(I)V

    .line 72
    :cond_15
    iget-object v1, v7, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_16

    .line 73
    iget-object v1, v7, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-virtual {v1, v9}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 74
    :cond_16
    iget-object v1, v7, Landroidx/fragment/app/b;->G:Landroid/view/View;

    new-instance v3, La/a7$a;

    invoke-direct {v3, v0, v2}, La/a7$a;-><init>(La/a7;Landroidx/fragment/app/e;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 75
    iget-object v1, v7, Landroidx/fragment/app/b;->G:Landroid/view/View;

    return-object v1

    .line 76
    :cond_17
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, " did not create a view."

    .line 77
    invoke-static {v4, v1, v3}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 78
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 79
    :cond_18
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": Duplicate id 0x"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    invoke-static {v8}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", tag "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", or parent id 0x"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " with another fragment for "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_19
    :goto_9
    return-object v5
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1, p2, p3}, La/a7;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
