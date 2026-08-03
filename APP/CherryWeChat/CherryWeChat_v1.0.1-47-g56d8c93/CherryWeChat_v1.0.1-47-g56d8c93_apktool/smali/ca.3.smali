.class public final Lca;
.super Landroidx/recyclerview/widget/g;
.source ""


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/util/LinkedHashMap;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/util/List;


# direct methods
.method public constructor <init>(LQC;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lca;->a:I

    const-wide v0, -0x1bb11fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1bb1afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    .line 5
    invoke-direct {p0}, Landroidx/recyclerview/widget/g;-><init>()V

    .line 6
    iput-object p1, p0, Lca;->c:Ljava/lang/Object;

    .line 7
    sget-object p1, LKf;->a:LKf;

    iput-object p1, p0, Lca;->d:Ljava/util/List;

    .line 8
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lca;->b:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Ljava/util/ArrayList;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lca;->a:I

    const-wide v0, -0x5db0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x5db8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/g;-><init>()V

    .line 2
    iput-object p1, p0, Lca;->c:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lca;->d:Ljava/util/List;

    .line 4
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lca;->b:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    iget v0, p0, Lca;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lca;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Lca;->d:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public getItemViewType(I)I
    .locals 2

    iget v0, p0, Lca;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/g;->getItemViewType(I)I

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Lca;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LEC;

    iget-object p1, p1, LEC;->a:Ljava/lang/String;

    const-wide v0, -0x1bb2ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lca;->c:Ljava/lang/Object;

    check-cast p1, LQC;

    iget-object p1, p1, LQC;->k:LDC;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 p1, 0x2

    goto :goto_0

    :cond_1
    move p1, v0

    goto :goto_0

    :cond_2
    const/4 p1, 0x3

    :goto_0
    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final onBindViewHolder(Landroidx/recyclerview/widget/o;I)V
    .locals 28

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v2, p2

    iget v3, v1, Lca;->a:I

    packed-switch v3, :pswitch_data_0

    const/16 v3, 0xc

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-wide v6, -0x1bb84fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    iget-object v6, v1, Lca;->d:Ljava/util/List;

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LEC;

    instance-of v6, v0, LAC;

    const/4 v14, 0x3

    const/4 v15, 0x4

    const/16 v7, 0x8

    const-wide v18, -0x2c528fffff835L

    const v10, 0x5508010e

    if-eqz v6, :cond_d

    check-cast v0, LAC;

    const-wide v21, -0x1bb40fffff835L

    invoke-static/range {v21 .. v22}, LGu;->r(J)Ljava/lang/String;

    iget-object v6, v0, LAC;->a:Lhk;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v21, -0x4158fffff835L

    invoke-static/range {v21 .. v22}, LGu;->r(J)Ljava/lang/String;

    iget-wide v12, v2, LEC;->k:D

    const-wide v23, -0x415efffff835L

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    const-wide v23, -0x416ffffff835L

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    const-wide v23, -0x4105fffff835L

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    const-wide v23, -0x410bfffff835L

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    iget-object v9, v2, LEC;->s:LCC;

    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    const-wide v24, -0x4115fffff835L

    invoke-static/range {v24 .. v25}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v6, Lhk;->b:Landroid/widget/TextView;

    iget-object v11, v2, LEC;->c:Ljava/lang/String;

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, v6, Lhk;->c:Landroid/widget/TextView;

    iget-object v11, v2, LEC;->d:Ljava/lang/String;

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v11, v6, Lhk;->a:Landroid/widget/ImageView;

    iget-object v0, v2, LEC;->f:Ljava/lang/String;

    iget-object v8, v2, LEC;->g:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v26

    if-lez v26, :cond_1

    sget-object v8, LIC;->a:LIC;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v18, -0x2d986fffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    sget-object v8, LIC;->d:Landroid/util/LruCache;

    invoke-virtual {v8, v0}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/graphics/Bitmap;

    if-eqz v8, :cond_0

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v18

    if-nez v18, :cond_0

    invoke-virtual {v11, v8}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto/16 :goto_1

    :cond_0
    invoke-static {v11}, Lcom/bumptech/glide/a;->d(Landroid/view/View;)Lgw;

    move-result-object v8

    invoke-virtual {v8, v0}, Lgw;->n(Ljava/lang/String;)Law;

    move-result-object v0

    sget-object v8, LVd;->b:LVd;

    invoke-virtual {v0, v8}, Ly5;->e(LVd;)Ly5;

    move-result-object v0

    check-cast v0, Law;

    invoke-virtual {v0}, Ly5;->b()Ly5;

    move-result-object v0

    check-cast v0, Law;

    invoke-virtual {v0}, Ly5;->k()Ly5;

    move-result-object v0

    check-cast v0, Law;

    invoke-virtual {v0, v10}, Ly5;->f(I)Ly5;

    move-result-object v0

    check-cast v0, Law;

    new-instance v8, Lgk;

    const/4 v10, 0x0

    invoke-direct {v8, v10, v2}, Lgk;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v8}, Law;->B(Lgk;)Law;

    move-result-object v0

    invoke-virtual {v0, v11}, Law;->A(Landroid/widget/ImageView;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_3

    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-wide v26, -0x412afffff835L

    invoke-static/range {v26 .. v27}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v11, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_1

    :cond_2
    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_1

    :cond_3
    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :goto_1
    iget-object v0, v6, Lhk;->f:Landroid/widget/TextView;

    const-wide/16 v10, 0x0

    cmpl-double v8, v12, v10

    if-lez v8, :cond_4

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v10, "\u00a5"

    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    goto :goto_2

    :cond_4
    const-wide v10, -0x4127fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    :goto_2
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v8, v6, Lhk;->d:Landroid/widget/TextView;

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    const v11, 0x106000b

    if-eq v10, v4, :cond_7

    if-eq v10, v14, :cond_6

    if-eq v10, v15, :cond_5

    invoke-virtual {v8, v7}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_3

    :cond_5
    const-wide v12, -0x413ffffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7, v11}, Landroid/content/Context;->getColor(I)I

    move-result v7

    invoke-virtual {v8, v7}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v7, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v10, 0x55060049

    invoke-virtual {v0, v10}, Landroid/content/Context;->getColor(I)I

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v8, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v7, 0x0

    invoke-virtual {v8, v7}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    :cond_6
    const-wide v12, -0x41c3fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7, v11}, Landroid/content/Context;->getColor(I)I

    move-result v7

    invoke-virtual {v8, v7}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v7, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v10, 0x5506004b

    invoke-virtual {v0, v10}, Landroid/content/Context;->getColor(I)I

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v8, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v7, 0x0

    invoke-virtual {v8, v7}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    :cond_7
    const-wide v12, -0x41c7fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7, v11}, Landroid/content/Context;->getColor(I)I

    move-result v7

    invoke-virtual {v8, v7}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v7, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v10, 0x55060047

    invoke-virtual {v0, v10}, Landroid/content/Context;->getColor(I)I

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v8, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v7, 0x0

    invoke-virtual {v8, v7}, Landroid/view/View;->setVisibility(I)V

    :goto_3
    iget-object v0, v6, Lhk;->e:Landroid/widget/TextView;

    const-wide v7, -0x41cbfffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    const-wide v7, -0x41dcfffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    const-wide v7, -0x4180fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    const-wide v7, -0x4186fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    const-wide v7, -0x4190fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-eqz v7, :cond_c

    if-eq v7, v4, :cond_b

    if-eq v7, v14, :cond_a

    if-eq v7, v15, :cond_9

    const-wide v7, -0x41affffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    const-wide v7, -0x4040fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    const-wide v7, -0x4058fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    iget-boolean v4, v2, LEC;->t:Z

    if-eqz v4, :cond_8

    const-wide v7, -0x406afffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    const-wide v7, -0x407bfffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    const-wide v7, -0x4011fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const v7, 0x5506002f

    invoke-virtual {v4, v7}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v4, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v7, 0x5506002b

    invoke-virtual {v3, v7}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v4, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v5}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const v7, 0x55060039

    invoke-virtual {v5, v7}, Landroid/content/Context;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_4

    :cond_8
    const-wide v4, -0x4015fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v4, -0x4026fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v4, -0x403cfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const v5, 0x5506002e

    invoke-virtual {v4, v5}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v4, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v5, 0x55060029

    invoke-virtual {v3, v5}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v4, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v3, Lck;

    const/4 v4, 0x4

    invoke-direct {v3, v6, v2, v4}, Lck;-><init>(Lhk;LEC;I)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_4

    :cond_9
    const-wide v7, -0x41abfffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const v7, 0x5506002f

    invoke-virtual {v4, v7}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v4, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v7, 0x5506002b

    invoke-virtual {v3, v7}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v4, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v5}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const v7, 0x55060039

    invoke-virtual {v5, v7}, Landroid/content/Context;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_4

    :cond_a
    const-wide v4, -0x41a8fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const v5, 0x5506002e

    invoke-virtual {v4, v5}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v4, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v5, 0x55060029

    invoke-virtual {v3, v5}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v4, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v3, Lck;

    const/4 v4, 0x3

    invoke-direct {v3, v6, v2, v4}, Lck;-><init>(Lhk;LEC;I)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_4

    :cond_b
    const-wide v4, -0x41a5fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const v5, 0x5506002e

    invoke-virtual {v4, v5}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v4, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v5, 0x55060029

    invoke-virtual {v3, v5}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v4, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v3, Lck;

    const/4 v4, 0x2

    invoke-direct {v3, v6, v2, v4}, Lck;-><init>(Lhk;LEC;I)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_4

    :cond_c
    const-wide v4, -0x41a2fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const v5, 0x5506002e

    invoke-virtual {v4, v5}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v4, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v5, 0x55060029

    invoke-virtual {v3, v5}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v4, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v3, Lck;

    const/4 v4, 0x1

    invoke-direct {v3, v6, v2, v4}, Lck;-><init>(Lhk;LEC;I)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_4
    new-instance v0, Lck;

    invoke-direct {v0, v2, v6}, Lck;-><init>(LEC;Lhk;)V

    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_15

    :cond_d
    instance-of v6, v0, LzC;

    if-eqz v6, :cond_22

    check-cast v0, LzC;

    const-wide v8, -0x1bcb5fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    iget-object v6, v0, LzC;->a:LOg;

    iget-object v8, v6, LOg;->a:Lca;

    iget-object v9, v6, LOg;->i:Landroid/widget/TextView;

    iget-object v11, v6, LOg;->g:Landroid/widget/ImageView;

    iget-object v12, v6, LOg;->h:Landroid/widget/LinearLayout;

    iget-object v13, v6, LOg;->b:Landroid/widget/LinearLayout;

    const-wide v14, -0x5abbfffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    iget-object v14, v2, LEC;->a:Ljava/lang/String;

    iput-object v2, v6, LOg;->j:LEC;

    iget-object v0, v6, LOg;->d:Landroid/widget/TextView;

    iget-object v15, v2, LEC;->c:Ljava/lang/String;

    invoke-virtual {v0, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, v6, LOg;->e:Landroid/widget/TextView;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v21, -0x5941fffff835L

    invoke-static/range {v21 .. v22}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v2, LEC;->d:Ljava/lang/String;

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, v6, LOg;->c:Landroid/widget/ImageView;

    iget-object v0, v2, LEC;->f:Ljava/lang/String;

    iget-object v15, v2, LEC;->g:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v21

    if-lez v21, :cond_e

    invoke-static {v4}, Lcom/bumptech/glide/a;->d(Landroid/view/View;)Lgw;

    move-result-object v15

    invoke-virtual {v15, v0}, Lgw;->n(Ljava/lang/String;)Law;

    move-result-object v0

    invoke-virtual {v0}, Ly5;->b()Ly5;

    move-result-object v0

    check-cast v0, Law;

    invoke-virtual {v0}, Ly5;->k()Ly5;

    move-result-object v0

    check-cast v0, Law;

    invoke-virtual {v0, v10}, Ly5;->f(I)Ly5;

    move-result-object v0

    check-cast v0, Law;

    invoke-virtual {v0, v4}, Law;->A(Landroid/widget/ImageView;)V

    goto :goto_6

    :cond_e
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_10

    :try_start_3
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v15}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v10

    if-eqz v10, :cond_f

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-wide v21, -0x5947fffff835L

    invoke-static/range {v21 .. v22}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    :try_start_4
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_5

    :catch_2
    move-exception v0

    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v0, 0x0

    :goto_5
    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_6

    :cond_f
    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_6

    :catch_3
    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_6

    :cond_10
    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :goto_6
    const/16 v0, 0x10

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v4, v6, LOg;->f:Landroid/widget/TextView;

    const-wide v18, -0x595cfffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    const-wide v18, -0x596dfffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    const-wide v18, -0x5917fffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    const-wide v18, -0x591dfffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    iget-object v10, v2, LEC;->s:LCC;

    invoke-static {v10}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    const-wide v18, -0x5927fffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    const-wide v18, -0x5939fffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    invoke-static {v14, v10}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_12

    iget-boolean v10, v2, LEC;->t:Z

    if-eqz v10, :cond_11

    const-wide v15, -0x593bfffff835L

    invoke-static/range {v15 .. v16}, LGu;->r(J)Ljava/lang/String;

    const-wide v15, -0x59ccfffff835L

    invoke-static/range {v15 .. v16}, LGu;->r(J)Ljava/lang/String;

    const-wide v15, -0x59edfffff835L

    invoke-static/range {v15 .. v16}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    const v15, 0x5506002f

    invoke-virtual {v10, v15}, Landroid/content/Context;->getColor(I)I

    move-result v10

    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v10, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v10}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v10, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v15, 0x5506002b

    invoke-virtual {v0, v15}, Landroid/content/Context;->getColor(I)I

    move-result v0

    invoke-virtual {v10, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v5}, LGu;->i(Ljava/lang/Number;)I

    move-result v0

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const v15, 0x55060039

    invoke-virtual {v5, v15}, Landroid/content/Context;->getColor(I)I

    move-result v5

    invoke-virtual {v10, v0, v5}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v4, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_7
    const/4 v5, 0x0

    goto :goto_8

    :cond_11
    const-wide v17, -0x59f1fffff835L

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    const-wide v17, -0x5982fffff835L

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    const-wide v17, -0x59a0fffff835L

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const v10, 0x5506002e

    invoke-virtual {v5, v10}, Landroid/content/Context;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v5, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v10, 0x55060029

    invoke-virtual {v0, v10}, Landroid/content/Context;->getColor(I)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v0, LKg;

    const/4 v5, 0x0

    invoke-direct {v0, v6, v2, v5}, LKg;-><init>(LOg;LEC;I)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_7

    :goto_8
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_9

    :cond_12
    const-wide v15, -0x59a3fffff835L

    invoke-static/range {v15 .. v16}, LGu;->r(J)Ljava/lang/String;

    const-wide v15, -0x59b4fffff835L

    invoke-static/range {v15 .. v16}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    :goto_9
    iget-object v0, v2, LEC;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    iget-object v4, v2, LEC;->p:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_13

    const/4 v4, 0x1

    goto :goto_a

    :cond_13
    const/4 v4, 0x0

    :goto_a
    const-wide v15, -0x5945fffff835L

    invoke-static/range {v15 .. v16}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v14, v5}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v0, :cond_14

    if-eqz v4, :cond_15

    :cond_14
    if-eqz v5, :cond_17

    if-eqz v0, :cond_17

    if-nez v4, :cond_17

    :cond_15
    if-nez v5, :cond_16

    if-eqz v0, :cond_16

    if-nez v4, :cond_16

    goto :goto_b

    :cond_16
    const/4 v10, 0x0

    invoke-virtual {v13, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v10, 0x0

    invoke-virtual {v13, v10}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v13, v10}, Landroid/view/View;->setFocusable(Z)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    const v15, 0x55060049

    invoke-virtual {v10, v15}, Landroid/content/Context;->getColor(I)I

    move-result v10

    const v15, 0x5ffffff

    and-int/2addr v10, v15

    invoke-static {v10}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v10

    new-instance v15, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v15}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v15, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    new-instance v3, Landroid/graphics/drawable/RippleDrawable;

    const/4 v7, 0x0

    invoke-direct {v3, v10, v7, v15}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v13, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_c

    :cond_17
    :goto_b
    new-instance v3, Lh;

    const/4 v7, 0x5

    invoke-direct {v3, v7, v6}, Lh;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v13, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v3, 0x1

    invoke-virtual {v13, v3}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v13, v3}, Landroid/view/View;->setFocusable(Z)V

    :goto_c
    const-wide v15, -0x1bb8bfffff835L

    if-eqz v0, :cond_18

    if-eqz v4, :cond_19

    :cond_18
    if-eqz v5, :cond_1d

    if-eqz v0, :cond_1d

    if-eqz v4, :cond_19

    goto :goto_e

    :cond_19
    if-nez v5, :cond_1c

    const/4 v7, 0x0

    invoke-virtual {v11, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    const/16 v3, 0x8

    invoke-virtual {v9, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static/range {v15 .. v16}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v8, Lca;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_1a

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    goto :goto_d

    :cond_1a
    const/4 v11, 0x0

    :goto_d
    invoke-virtual {v6, v11}, LOg;->c(Z)V

    if-eqz v11, :cond_1b

    invoke-virtual {v6, v2}, LOg;->b(LEC;)V

    goto/16 :goto_15

    :cond_1b
    const/16 v3, 0x8

    invoke-virtual {v12, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v12}, Landroid/view/ViewGroup;->removeAllViews()V

    goto/16 :goto_15

    :cond_1c
    const/16 v3, 0x8

    invoke-virtual {v11, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {v9, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v12, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v12}, Landroid/view/ViewGroup;->removeAllViews()V

    goto/16 :goto_15

    :cond_1d
    :goto_e
    if-eqz v5, :cond_1f

    if-eqz v0, :cond_1f

    if-eqz v4, :cond_1e

    goto :goto_f

    :cond_1e
    const/16 v7, 0x8

    goto :goto_10

    :cond_1f
    :goto_f
    const/4 v7, 0x0

    :goto_10
    invoke-virtual {v11, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static/range {v15 .. v16}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v8, Lca;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    goto :goto_11

    :cond_20
    const/4 v11, 0x0

    :goto_11
    invoke-virtual {v6, v11}, LOg;->c(Z)V

    if-eqz v11, :cond_21

    invoke-virtual {v6, v2}, LOg;->b(LEC;)V

    goto/16 :goto_15

    :cond_21
    const/16 v3, 0x8

    invoke-virtual {v12, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v12}, Landroid/view/ViewGroup;->removeAllViews()V

    goto/16 :goto_15

    :cond_22
    move v3, v7

    const/4 v7, 0x0

    instance-of v4, v0, LyC;

    if-eqz v4, :cond_23

    check-cast v0, LyC;

    const-wide v2, -0x1bcaafffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LyC;->a:Lxg;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v2, -0x5b64fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    goto/16 :goto_15

    :cond_23
    instance-of v4, v0, LBC;

    if-eqz v4, :cond_2c

    check-cast v0, LBC;

    const-wide v4, -0x1bb0bfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    iget-object v4, v0, LBC;->a:LKo;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v5, -0x4f47fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v2, LEC;->f:Ljava/lang/String;

    const-wide v5, -0x4f4dfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    const-wide v5, -0x4f5efffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    const-wide v5, -0x4f74fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    const-wide v5, -0x4f7afffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    iget-object v5, v2, LEC;->s:LCC;

    invoke-static {v5}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    const-wide v8, -0x4f04fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    iget-object v6, v4, LKo;->c:Landroid/widget/TextView;

    iget-object v8, v2, LEC;->c:Ljava/lang/String;

    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v6, v4, LKo;->d:Landroid/widget/TextView;

    iget-object v8, v2, LEC;->d:Ljava/lang/String;

    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v6, v4, LKo;->f:Landroid/widget/TextView;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "v"

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v9, v2, LEC;->i:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v6, v4, LKo;->e:Landroid/widget/TextView;

    iget-object v8, v2, LEC;->e:Ljava/lang/String;

    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_24

    const/4 v3, 0x0

    :cond_24
    invoke-virtual {v6, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v3, v4, LKo;->b:Landroid/widget/ImageView;

    iget-object v6, v2, LEC;->g:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_25

    invoke-static {v3}, Lcom/bumptech/glide/a;->d(Landroid/view/View;)Lgw;

    move-result-object v6

    invoke-virtual {v6, v0}, Lgw;->n(Ljava/lang/String;)Law;

    move-result-object v0

    invoke-virtual {v0}, Ly5;->b()Ly5;

    move-result-object v0

    check-cast v0, Law;

    invoke-virtual {v0}, Ly5;->k()Ly5;

    move-result-object v0

    check-cast v0, Law;

    invoke-virtual {v0, v10}, Ly5;->f(I)Ly5;

    move-result-object v0

    check-cast v0, Law;

    invoke-virtual {v0, v3}, Law;->A(Landroid/widget/ImageView;)V

    goto :goto_13

    :cond_25
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_27

    :try_start_6
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_26

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-wide v8, -0x4f16fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    :try_start_7
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v9
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    goto :goto_12

    :catch_4
    move-exception v0

    :try_start_8
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    move-object v9, v7

    :goto_12
    invoke-virtual {v3, v9}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_13

    :cond_26
    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5

    goto :goto_13

    :catch_5
    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_13

    :cond_27
    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :goto_13
    iget-object v0, v4, LKo;->g:Landroid/widget/TextView;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    const/4 v6, 0x1

    if-eq v3, v6, :cond_2a

    if-eq v3, v14, :cond_29

    if-eq v3, v15, :cond_28

    const-wide v6, -0x4f37fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_14

    :cond_28
    const-wide v6, -0x4f2bfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v15, 0x55060049

    invoke-virtual {v3, v15}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_14

    :cond_29
    const-wide v6, -0x4f2ffffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v10, 0x5506004b

    invoke-virtual {v3, v10}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_14

    :cond_2a
    const-wide v6, -0x4f33fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v10, 0x55060047

    invoke-virtual {v3, v10}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_14
    const-wide v6, -0x4f38fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    const-wide v6, -0x4fc9fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    const-wide v6, -0x4fedfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    const-wide v6, -0x4ff3fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v5}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    const-wide v5, -0x4ffdfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    iget-boolean v0, v2, LEC;->t:Z

    if-eqz v0, :cond_2b

    const-wide v5, -0x4f8ffffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    const-wide v5, -0x4fa0fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    const/4 v3, 0x1

    invoke-virtual {v4, v2, v3}, LKo;->b(LEC;Z)V

    goto :goto_15

    :cond_2b
    const-wide v5, -0x4e4bfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    const-wide v5, -0x4e5cfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    const/4 v7, 0x0

    invoke-virtual {v4, v2, v7}, LKo;->b(LEC;Z)V

    :cond_2c
    :goto_15
    return-void

    :pswitch_0
    move-object v13, v0

    check-cast v13, Lba;

    const-wide v3, -0x5c57fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v1, Lca;->d:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, LBA;

    const/16 v0, 0xc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v2, 0x18

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-wide v7, -0x5d5cfffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    iget-object v7, v14, LBA;->g:Ljava/util/ArrayList;

    iget-object v15, v13, Lba;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v15}, Landroid/view/ViewGroup;->removeAllViews()V

    new-instance v8, Landroid/widget/LinearLayout;

    iget-object v12, v13, Lba;->b:Lca;

    iget-object v9, v12, Lca;->c:Ljava/lang/Object;

    check-cast v9, Landroid/content/Context;

    iget-object v10, v12, Lca;->b:Ljava/util/LinkedHashMap;

    invoke-direct {v8, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v11, 0x1

    invoke-virtual {v8, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    move-object/from16 p2, v0

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v11, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v8, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v11, Landroid/widget/LinearLayout;

    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v11, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    move-object/from16 v17, v2

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v11, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    move-object/from16 v20, v3

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    move-object/from16 v21, v4

    const/high16 v4, 0x3f800000    # 1.0f

    move-object/from16 v22, v5

    const/4 v5, 0x0

    invoke-direct {v2, v5, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v3, 0x10

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v3, Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v3, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v5, v14, LBA;->b:Ljava/lang/String;

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v5, 0x41800000    # 16.0f

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const v4, 0x550603f9

    invoke-virtual {v5, v4}, Landroid/content/Context;->getColor(I)I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object v5, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v3, v14, LBA;->d:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_2d

    new-instance v5, Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v5, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v25, -0x5d62fffff835L

    invoke-static/range {v25 .. v26}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v4, 0x41200000    # 10.0f

    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    move-object/from16 v25, v3

    const v3, 0x106000c

    invoke-virtual {v4, v3}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v4, 0x5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    move-object/from16 v26, v6

    const v6, 0x1060018

    invoke-virtual {v4, v6}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v5, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static/range {v22 .. v22}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    invoke-static/range {v21 .. v21}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-static/range {v22 .. v22}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    move-object/from16 v27, v7

    invoke-static/range {v21 .. v21}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-virtual {v5, v3, v4, v6, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x2

    invoke-direct {v3, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static/range {v20 .. v20}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v5, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_16

    :cond_2d
    move-object/from16 v25, v3

    move-object/from16 v26, v6

    move-object/from16 v27, v7

    :goto_16
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x5d66fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v14, LBA;->c:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v3, 0x41600000    # 14.0f

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const v5, 0x550603f7

    invoke-virtual {v4, v5}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static/range {v26 .. v26}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {v2, v5, v4, v5, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2e

    invoke-virtual/range {v25 .. v25}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_31

    :cond_2e
    new-instance v1, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const v2, 0x550800ec    # 9.3460963E12f

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static/range {v17 .. v17}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-static/range {v17 .. v17}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-direct {v2, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v13}, Landroidx/recyclerview/widget/o;->getAdapterPosition()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v10, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v4}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v5, 0x0

    const/high16 v6, 0x43340000    # 180.0f

    if-eqz v2, :cond_2f

    move v2, v6

    goto :goto_17

    :cond_2f
    move v2, v5

    :goto_17
    invoke-virtual {v1, v2}, Landroid/view/View;->setRotation(F)V

    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v13}, Landroidx/recyclerview/widget/o;->getAdapterPosition()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v10, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v4}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_30

    move v5, v6

    :cond_30
    invoke-virtual {v2, v5}, Landroid/view/ViewPropertyAnimator;->rotation(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const-wide/16 v4, 0x1f4

    invoke-virtual {v2, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    new-instance v2, Ll5;

    const/4 v4, 0x3

    invoke-direct {v2, v4, v12, v13}, Ll5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_31
    invoke-virtual {v11, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v8, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v15, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    invoke-virtual/range {v25 .. v25}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_32

    const/4 v1, 0x1

    goto :goto_18

    :cond_32
    const/4 v1, 0x0

    :goto_18
    if-eqz v0, :cond_33

    if-eqz v1, :cond_36

    :cond_33
    invoke-virtual {v13}, Landroidx/recyclerview/widget/o;->getAdapterPosition()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v10, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v4}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_36

    const v2, 0x55060029

    if-eqz v1, :cond_34

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x0

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v4, 0x10

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, -0x1

    const/4 v6, -0x2

    invoke-direct {v4, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static/range {v26 .. v26}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-static/range {v26 .. v26}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v1, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-direct {v5, v7, v6, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v6, -0x5d6afffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    const v7, 0x550603f9

    invoke-virtual {v6, v7}, Landroid/content/Context;->getColor(I)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v5, -0x5d72fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v5, 0x41500000    # 13.0f

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const v6, 0x5506002e

    invoke-virtual {v5, v6}, Landroid/content/Context;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static/range {v20 .. v20}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6, v2}, Landroid/content/Context;->getColor(I)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static/range {p2 .. p2}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-static/range {v22 .. v22}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-static/range {p2 .. p2}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static/range {v22 .. v22}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-virtual {v4, v5, v6, v7, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    const/16 v5, 0x32

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v5}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setMinWidth(I)V

    const/16 v5, 0x11

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, -0x2

    invoke-direct {v5, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Ll5;

    const/4 v6, 0x4

    invoke-direct {v5, v6, v4, v14}, Ll5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v15, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_34
    if-nez v0, :cond_36

    invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_36

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, LDA;

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x0

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v4, 0x10

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, -0x1

    const/4 v7, -0x2

    invoke-direct {v5, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static/range {v26 .. v26}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    iput v8, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-static/range {v26 .. v26}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    iput v8, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v1, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v5, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v8, 0x1

    invoke-virtual {v5, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-direct {v11, v4, v7, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v5, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v7, Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v11

    invoke-direct {v7, v11}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v11, v10, LDA;->b:Ljava/lang/String;

    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v11

    const v3, 0x550603f9

    invoke-virtual {v11, v3}, Landroid/content/Context;->getColor(I)I

    move-result v11

    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v11, Lqe;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const-wide v20, -0x5d75fffff835L

    invoke-static/range {v20 .. v21}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {v11, v5}, Lqe;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, -0x2

    invoke-direct {v5, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v11, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    move-object v5, v9

    new-instance v9, Ljava/io/File;

    sget-object v17, LEA;->a:LEA;

    iget-object v3, v10, LDA;->a:Ljava/lang/String;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, LEA;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v9, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_35

    const-wide v17, -0x5d05fffff835L

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v4, 0x1060016

    invoke-virtual {v3, v4}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v11, v3}, Lqe;->setBackgroundColor(I)V

    :goto_1a
    move v3, v8

    goto :goto_1b

    :cond_35
    const-wide v3, -0x5d08fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v11, v3}, Lqe;->setBackgroundColor(I)V

    goto :goto_1a

    :goto_1b
    new-instance v8, LU9;

    invoke-direct/range {v8 .. v14}, LU9;-><init>(Ljava/io/File;LDA;Lqe;Lca;Lba;LBA;)V

    invoke-virtual {v11, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v1, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v15, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object v9, v5

    const/high16 v3, 0x41600000    # 14.0f

    goto/16 :goto_19

    :cond_36
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o;
    .locals 3

    iget v0, p0, Lca;->a:I

    packed-switch v0, :pswitch_data_0

    const-wide v0, -0x1bb3dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    const/4 v0, 0x4

    if-eq p2, v0, :cond_0

    new-instance p2, LBC;

    new-instance v0, LKo;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v1, -0x1bbf4fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {v0, p1}, LKo;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, p0, v0}, LBC;-><init>(Lca;LKo;)V

    goto :goto_0

    :cond_0
    new-instance p2, LyC;

    new-instance v0, Lxg;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v1, -0x1bbe4fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, p0, Lca;->c:Ljava/lang/Object;

    check-cast v1, LQC;

    invoke-direct {v0, p1, v1}, Lxg;-><init>(Landroid/content/Context;LQC;)V

    invoke-direct {p2, v0}, LyC;-><init>(Lxg;)V

    goto :goto_0

    :cond_1
    new-instance p2, LzC;

    new-instance v0, LOg;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v1, -0x1bbd4fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {v0, p1, p0}, LOg;-><init>(Landroid/content/Context;Lca;)V

    invoke-direct {p2, v0}, LzC;-><init>(LOg;)V

    goto :goto_0

    :cond_2
    new-instance p2, LAC;

    new-instance v0, Lhk;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v1, -0x1bbc4fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {v0, p1}, Lhk;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, LAC;-><init>(Lhk;)V

    :goto_0
    return-object p2

    :pswitch_0
    const-wide p1, -0x5c50fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    new-instance p1, LS6;

    iget-object p2, p0, Lca;->c:Ljava/lang/Object;

    check-cast p2, Landroid/content/Context;

    invoke-direct {p1, p2}, LS6;-><init>(Landroid/content/Context;)V

    const/16 p2, 0xc

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2}, LGu;->i(Ljava/lang/Number;)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p1, p2}, LS6;->setRadius(F)V

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, LS6;->setCardElevation(F)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, LS6;->setUseCompatPadding(Z)V

    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {p2, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p2, Lba;

    invoke-direct {p2, p0, p1}, Lba;-><init>(Lca;LS6;)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
