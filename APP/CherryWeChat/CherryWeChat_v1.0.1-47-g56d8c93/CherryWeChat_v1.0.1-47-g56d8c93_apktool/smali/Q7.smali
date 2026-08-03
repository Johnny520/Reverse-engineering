.class public final LQ7;
.super Landroidx/recyclerview/widget/g;
.source ""


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;LQ4;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, LQ7;->a:I

    const-wide v0, -0x4d33fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x4d3bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    .line 2
    invoke-direct {p0}, Landroidx/recyclerview/widget/g;-><init>()V

    .line 3
    iput-object p1, p0, LQ7;->b:Ljava/util/ArrayList;

    .line 4
    iput-object p2, p0, LQ7;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p3, p0, LQ7;->a:I

    iput-object p1, p0, LQ7;->b:Ljava/util/ArrayList;

    iput-object p2, p0, LQ7;->c:Ljava/lang/Object;

    invoke-direct {p0}, Landroidx/recyclerview/widget/g;-><init>()V

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    iget v0, p0, LQ7;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LQ7;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, LQ7;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0

    :pswitch_1
    iget-object v0, p0, LQ7;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onBindViewHolder(Landroidx/recyclerview/widget/o;I)V
    .locals 10

    iget v0, p0, LQ7;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, LTo;

    const-wide v0, -0x4de0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, p0, LQ7;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    const-wide v1, -0x4de7fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, LCA;

    const-wide v1, -0x4d29fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LTo;->a:LWo;

    const/16 v1, 0x10

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p1, LWo;->f:Landroid/widget/TextView;

    iget-object v3, p1, LWo;->b:Landroid/widget/ImageView;

    iget-object v4, p1, LWo;->g:Landroid/widget/TextView;

    const-wide v5, -0x4c4ffffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    iget-object v5, v0, LCA;->e:Ljava/lang/String;

    iget-object v6, v0, LCA;->f:Ljava/lang/String;

    const/4 v7, 0x0

    :try_start_0
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_1

    if-nez v3, :cond_0

    const-wide v8, -0x4c59fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-object v6, v7

    goto :goto_0

    :cond_0
    move-object v6, v3

    :goto_0
    sget-object v8, LEA;->a:LEA;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->c()Landroid/graphics/Bitmap;

    move-result-object v8

    invoke-virtual {v6, v8}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto/16 :goto_4

    :cond_1
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    const-wide v8, -0x4c63fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    const-wide v8, -0x2c528fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {v6}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v6

    :try_start_2
    invoke-virtual {v6}, Ljava/lang/Throwable;->printStackTrace()V

    move-object v6, v7

    :goto_1
    if-nez v3, :cond_2

    const-wide v8, -0x4c78fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-object v8, v7

    goto :goto_2

    :cond_2
    move-object v8, v3

    :goto_2
    invoke-virtual {v8, v6}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_4

    :cond_3
    if-nez v3, :cond_4

    const-wide v8, -0x4c02fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-object v6, v7

    goto :goto_3

    :cond_4
    move-object v6, v3

    :goto_3
    sget-object v8, LEA;->a:LEA;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->c()Landroid/graphics/Bitmap;

    move-result-object v8

    invoke-virtual {v6, v8}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_4

    :catch_1
    if-nez v3, :cond_5

    const-wide v8, -0x4c0cfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-object v3, v7

    :cond_5
    sget-object v6, LEA;->a:LEA;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->c()Landroid/graphics/Bitmap;

    move-result-object v6

    invoke-virtual {v3, v6}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :goto_4
    iget-object v3, p1, LWo;->c:Landroid/widget/TextView;

    if-nez v3, :cond_6

    const-wide v8, -0x4c16fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-object v3, v7

    :cond_6
    iget-object v6, v0, LCA;->b:Ljava/lang/String;

    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, p1, LWo;->d:Landroid/widget/TextView;

    if-nez v3, :cond_7

    const-wide v8, -0x4c20fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-object v3, v7

    :cond_7
    iget-object v6, v0, LCA;->c:Ljava/lang/String;

    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, p1, LWo;->e:Landroid/widget/TextView;

    if-nez v3, :cond_8

    const-wide v8, -0x4c2cfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-object v3, v7

    :cond_8
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "v"

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v8, v0, LCA;->d:Ljava/lang/String;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-nez v2, :cond_9

    const-wide v8, -0x4c39fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-object v3, v7

    goto :goto_5

    :cond_9
    move-object v3, v2

    :goto_5
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-nez v2, :cond_a

    const-wide v2, -0x4ccafffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-object v2, v7

    :cond_a
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v5, 0x0

    if-lez v3, :cond_b

    move v3, v5

    goto :goto_6

    :cond_b
    const/16 v3, 0x8

    :goto_6
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    sget-object v2, LEA;->a:LEA;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, LCA;->a:Ljava/lang/String;

    invoke-static {v3, v2}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    new-instance v3, LUo;

    invoke-direct {v3, p2, p1, v0}, LUo;-><init>(ILWo;LCA;)V

    invoke-virtual {p1, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const/4 p2, 0x1

    if-eqz v2, :cond_10

    if-nez v4, :cond_c

    const-wide v2, -0x4cdbfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-object v0, v7

    goto :goto_7

    :cond_c
    move-object v0, v4

    :goto_7
    const-wide v2, -0x4ce5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-nez v4, :cond_d

    const-wide v2, -0x4ce8fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-object v0, v7

    goto :goto_8

    :cond_d
    move-object v0, v4

    :goto_8
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setEnabled(Z)V

    if-nez v4, :cond_e

    const-wide v2, -0x4cf2fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-object v0, v7

    goto :goto_9

    :cond_e
    move-object v0, v4

    :goto_9
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v5, 0x5506002b

    invoke-virtual {v3, v5}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2}, LGu;->i(Ljava/lang/Number;)I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v3, 0x55060039

    invoke-virtual {v1, v3}, Landroid/content/Context;->getColor(I)I

    move-result v1

    invoke-virtual {v2, p2, v1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    if-nez v4, :cond_f

    const-wide v0, -0x4cfcfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-object v4, v7

    :cond_f
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const p2, 0x5506002f

    invoke-virtual {p1, p2}, Landroid/content/Context;->getColor(I)I

    move-result p1

    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_e

    :cond_10
    if-nez v4, :cond_11

    const-wide v2, -0x4c86fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-object v2, v7

    goto :goto_a

    :cond_11
    move-object v2, v4

    :goto_a
    const-wide v5, -0x4c90fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-nez v4, :cond_12

    const-wide v2, -0x4c93fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-object v2, v7

    goto :goto_b

    :cond_12
    move-object v2, v4

    :goto_b
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setEnabled(Z)V

    if-nez v4, :cond_13

    const-wide v2, -0x4c9dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-object p2, v7

    goto :goto_c

    :cond_13
    move-object p2, v4

    :goto_c
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v5, 0x55060029

    invoke-virtual {v3, v5}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {p2, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    if-nez v4, :cond_14

    const-wide v1, -0x4ca7fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-object p2, v7

    goto :goto_d

    :cond_14
    move-object p2, v4

    :goto_d
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x5506002e

    invoke-virtual {v1, v2}, Landroid/content/Context;->getColor(I)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    if-nez v4, :cond_15

    const-wide v1, -0x4cb1fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-object v4, v7

    :cond_15
    new-instance p2, Ll5;

    const/16 v1, 0xd

    invoke-direct {p2, v1, p1, v0}, Ll5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_e
    return-void

    :pswitch_0
    const-wide v0, -0x177cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    const-wide v0, -0x1703fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/widget/LinearLayout;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    const-wide v0, -0x17c4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/widget/TextView;

    sget-object v0, LGb;->g:Lm6;

    iget-object v1, p0, LQ7;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LHb;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v0, -0x1c221fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-static {}, Lm6;->j()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_16

    iget-object v0, p2, LHb;->a:Ljava/lang/String;

    :cond_16
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_1
    const-wide v0, -0xe5ecfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, p1, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    const-wide v1, -0xe5f3fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, LQ7;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LO7;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    const-wide v3, -0xe5b4fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/widget/TextView;

    iget-object v3, p2, LO7;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    const-wide v2, -0xe471fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, LXz;

    iget-boolean p2, p2, LO7;->c:Z

    invoke-virtual {v0, p2}, LXz;->setChecked(Z)V

    new-instance p2, Lmk;

    const/4 v2, 0x1

    invoke-direct {p2, v2, p1, v1}, Lmk;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, LXz;->setOnCheckedChangeListener(Lfj;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o;
    .locals 7

    iget p2, p0, LQ7;->a:I

    packed-switch p2, :pswitch_data_0

    const-wide v0, -0x4dc9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance p2, LWo;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v0, -0x4dd0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, p0, LQ7;->c:Ljava/lang/Object;

    check-cast v0, LQ4;

    invoke-direct {p2, p1, v0}, LWo;-><init>(Landroid/content/Context;LQ4;)V

    new-instance p1, LTo;

    invoke-direct {p1, p2}, LTo;-><init>(LWo;)V

    return-object p1

    :pswitch_0
    const-wide p1, -0x1773fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    new-instance p1, Landroid/widget/LinearLayout;

    iget-object p2, p0, LQ7;->c:Ljava/lang/Object;

    check-cast p2, Landroid/content/Context;

    invoke-direct {p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v1, 0x10

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v1, 0x34

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/View;->setMinimumHeight(I)V

    const/16 v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {p1, v2, v0, v1, v0}, Landroid/view/View;->setPadding(IIII)V

    const v1, 0x55060035

    invoke-virtual {p2, v1}, Landroid/content/Context;->getColor(I)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v1, Lqv;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Lqv;-><init>(II)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v4, -0x177afffff835L

    const/high16 v2, 0x41a00000    # 20.0f

    invoke-static {v4, v5, v1, v2}, LEy;->l(JLandroid/widget/TextView;F)V

    const v2, 0x550603f7

    invoke-virtual {p2, v2}, Landroid/content/Context;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v4, 0xc

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/high16 v2, 0x41700000    # 15.0f

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    const v2, 0x550603f9

    invoke-virtual {p2, v2}, Landroid/content/Context;->getColor(I)I

    move-result p2

    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {p2, v0, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p2, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    invoke-virtual {v1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance p2, LP7;

    invoke-direct {p2, p1}, Landroidx/recyclerview/widget/o;-><init>(Landroid/view/View;)V

    return-object p2

    :pswitch_1
    const-wide p1, -0xe5e3fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    new-instance p1, Landroid/widget/LinearLayout;

    iget-object p2, p0, LQ7;->c:Ljava/lang/Object;

    check-cast p2, Landroid/content/Context;

    invoke-direct {p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v1, 0x10

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v2, 0x34

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/View;->setMinimumHeight(I)V

    const/16 v2, 0xe

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    invoke-virtual {p1, v3, v0, v2, v0}, Landroid/view/View;->setPadding(IIII)V

    const v2, 0x55060035

    invoke-virtual {p2, v2}, Landroid/content/Context;->getColor(I)I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v2, Lqv;

    const/4 v3, -0x1

    const/4 v4, -0x2

    invoke-direct {v2, v3, v4}, Lqv;-><init>(II)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v5, -0xe5eafffff835L

    const/high16 v3, 0x41a00000    # 20.0f

    invoke-static {v5, v6, v2, v3}, LEy;->l(JLandroid/widget/TextView;F)V

    const v3, 0x550603f7

    invoke-virtual {p2, v3}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v5, 0xc

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v5}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/high16 v3, 0x41700000    # 15.0f

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    const v3, 0x550603f9

    invoke-virtual {p2, v3}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v0, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, v3, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, LXz;

    invoke-direct {v0, p2}, LXz;-><init>(Landroid/content/Context;)V

    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v2, 0x28

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    const/16 v3, 0x19

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    invoke-direct {p2, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v1, p2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    invoke-virtual {p1, v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p2, LP7;

    invoke-direct {p2, p1}, Landroidx/recyclerview/widget/o;-><init>(Landroid/view/View;)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
