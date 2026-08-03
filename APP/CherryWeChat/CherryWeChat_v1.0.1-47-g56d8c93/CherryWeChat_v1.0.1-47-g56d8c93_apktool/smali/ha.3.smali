.class public final Lha;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LWk;


# instance fields
.field public final synthetic a:I

.field public b:Landroid/widget/LinearLayout;

.field public c:Landroidx/recyclerview/widget/RecyclerView;

.field public d:Landroid/widget/EditText;

.field public e:Landroid/widget/LinearLayout;

.field public f:Landroid/widget/TextView;

.field public g:LWz;

.field public h:Landroidx/recyclerview/widget/g;

.field public i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lha;->a:I

    packed-switch p1, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lha;->i:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 8

    iget-object v0, p0, Lha;->i:Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, LEA;->e:Ljava/util/ArrayList;

    iput-object v0, p0, Lha;->i:Ljava/lang/Object;

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lha;->i:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lha;->i:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LBA;

    iget-object v5, v4, LBA;->b:Ljava/lang/String;

    invoke-static {v5, p1, v1}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-nez v5, :cond_5

    iget-object v5, v4, LBA;->c:Ljava/lang/String;

    invoke-static {v5, p1, v1}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-nez v5, :cond_5

    iget-object v4, v4, LBA;->g:Ljava/util/ArrayList;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LDA;

    iget-object v5, v5, LDA;->b:Ljava/lang/String;

    invoke-static {v5, p1, v1}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-eqz v5, :cond_4

    :cond_5
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    move-object v0, v2

    :goto_1
    iget-object v2, p0, Lha;->h:Landroidx/recyclerview/widget/g;

    check-cast v2, Lca;

    if-eqz v2, :cond_8

    const-wide v3, -0x5c46fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    iget-object v3, v2, Lca;->d:Ljava/util/List;

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v4, v2, Lca;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->clear()V

    invoke-static {v3}, Lsa;->Z(Ljava/util/Collection;)LGl;

    move-result-object v3

    invoke-virtual {v3}, LDl;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    move-object v5, v3

    check-cast v5, LEl;

    iget-boolean v6, v5, LEl;->c:Z

    if-eqz v6, :cond_7

    invoke-virtual {v5}, LEl;->nextInt()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_7
    invoke-virtual {v2}, Landroidx/recyclerview/widget/g;->notifyDataSetChanged()V

    :cond_8
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_9

    iget-object v2, p0, Lha;->f:Landroid/widget/TextView;

    if-eqz v2, :cond_b

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    :cond_9
    iget-object v3, p0, Lha;->f:Landroid/widget/TextView;

    if-eqz v3, :cond_a

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    :cond_a
    iget-object v3, p0, Lha;->f:Landroid/widget/TextView;

    if-eqz v3, :cond_b

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v6, -0x5c16fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-wide v6, -0x5c1afffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_b
    :goto_3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_c

    goto :goto_4

    :cond_c
    move v1, v4

    :goto_4
    invoke-virtual {p0, v0, v1}, Lha;->h(ZZ)V

    return-void
.end method

.method public final b()V
    .locals 2

    iget v0, p0, Lha;->a:I

    packed-switch v0, :pswitch_data_0

    const-wide v0, -0x4ba8fffff835L

    :goto_0
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void

    :pswitch_0
    const-wide v0, -0x5c30fffff835L

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 0

    iget p1, p0, Lha;->a:I

    packed-switch p1, :pswitch_data_0

    const-wide p1, -0x4bb1fffff835L

    :goto_0
    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    return-void

    :pswitch_0
    const-wide p1, -0x5c39fffff835L

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Landroid/app/Activity;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lha;->a:I

    packed-switch v2, :pswitch_data_0

    const/16 v2, 0x50

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x20

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-wide v5, -0x4bd6fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    new-instance v5, LWz;

    invoke-direct {v5, v1}, LWz;-><init>(Landroid/app/Activity;)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, -0x1

    invoke-direct {v6, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v6, 0x55060049

    invoke-virtual {v1, v6}, Landroid/content/Context;->getColor(I)I

    move-result v6

    const v8, 0x5506004b

    invoke-virtual {v1, v8}, Landroid/content/Context;->getColor(I)I

    move-result v8

    const v9, 0x55060047

    invoke-virtual {v1, v9}, Landroid/content/Context;->getColor(I)I

    move-result v9

    filled-new-array {v6, v8, v9}, [I

    move-result-object v6

    invoke-virtual {v5, v6}, LWz;->setColorSchemeColors([I)V

    new-instance v6, LQ9;

    const/4 v8, 0x2

    invoke-direct {v6, v8, v0, v1}, LQ9;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v6}, LWz;->setOnRefreshListener(LUz;)V

    iput-object v5, v0, Lha;->g:LWz;

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const v8, 0x55060040

    invoke-virtual {v1, v8}, Landroid/content/Context;->getColor(I)I

    move-result v8

    invoke-virtual {v5, v8}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v8, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v5, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v8, 0xc

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    const/4 v11, 0x0

    invoke-virtual {v5, v11, v9, v11, v10}, Landroid/view/View;->setPadding(IIII)V

    iput-object v5, v0, Lha;->b:Landroid/widget/LinearLayout;

    iget-object v9, v0, Lha;->g:LWz;

    invoke-virtual {v9, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v10, -0x2

    invoke-direct {v9, v7, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v12, 0x10

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    const/16 v7, 0x8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-virtual {v9, v14, v11, v15, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v5, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    const v14, 0x55060035

    invoke-virtual {v9, v14}, Landroid/content/Context;->getColor(I)I

    move-result v9

    invoke-virtual {v7, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v9, 0x18

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v7, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v14

    const v15, 0x55060039

    invoke-virtual {v14, v15}, Landroid/content/Context;->getColor(I)I

    move-result v14

    invoke-virtual {v7, v9, v14}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v5, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-virtual {v5, v7, v9, v14, v15}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {v5, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v7, Landroid/widget/ImageView;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-direct {v7, v9}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v14, 0x14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-direct {v9, v15, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-virtual {v9, v12}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v7, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v9, 0x55080109

    invoke-virtual {v7, v9}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v12

    const v15, 0x550603f5

    invoke-virtual {v12, v15}, Landroid/content/Context;->getColor(I)I

    move-result v12

    invoke-virtual {v7, v12}, Landroid/widget/ImageView;->setColorFilter(I)V

    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v7, Landroid/widget/EditText;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v12

    invoke-direct {v7, v12}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-direct {v12, v11, v10, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v7, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const-wide v18, -0x4bdffffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v7, v12}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v12

    invoke-virtual {v12, v15}, Landroid/content/Context;->getColor(I)I

    move-result v12

    invoke-virtual {v7, v12}, Landroid/widget/TextView;->setHintTextColor(I)V

    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v12

    const v9, 0x550603f9

    invoke-virtual {v12, v9}, Landroid/content/Context;->getColor(I)I

    move-result v9

    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v9, 0x41800000    # 16.0f

    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v12, 0x0

    invoke-virtual {v7, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setSingleLine(Z)V

    const/4 v12, 0x3

    invoke-virtual {v7, v12}, Landroid/widget/TextView;->setImeOptions(I)V

    new-instance v12, Le5;

    const/4 v9, 0x4

    invoke-direct {v12, v9, v0}, Le5;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v7, v12}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iput-object v7, v0, Lha;->d:Landroid/widget/EditText;

    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v7, Landroid/widget/ImageView;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-direct {v7, v9}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-direct {v9, v12, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-virtual {v9, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v7, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v6, 0x550800e6    # 9.34609E12f

    invoke-virtual {v7, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6, v15}, Landroid/content/Context;->getColor(I)I

    move-result v6

    invoke-virtual {v7, v6}, Landroid/widget/ImageView;->setColorFilter(I)V

    const/16 v6, 0x8

    invoke-virtual {v7, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    new-instance v6, Ll5;

    const/16 v8, 0xc

    invoke-direct {v6, v8, v0, v7}, Ll5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v6, v0, Lha;->d:Landroid/widget/EditText;

    if-eqz v6, :cond_0

    new-instance v8, Lea;

    const/4 v9, 0x1

    invoke-direct {v8, v7, v9}, Lea;-><init>(Landroid/widget/ImageView;I)V

    invoke-virtual {v6, v8}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_0
    iget-object v6, v0, Lha;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, -0x1

    invoke-direct {v6, v7, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-virtual {v6, v7, v8, v9, v11}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v6, 0x10

    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v6, Landroid/widget/ImageView;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-direct {v6, v7}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-direct {v7, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v7, 0x550800f1

    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7, v15}, Landroid/content/Context;->getColor(I)I

    move-result v7

    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setColorFilter(I)V

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setFocusable(Z)V

    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v8, v7}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    const v9, 0x5506002b

    invoke-virtual {v7, v9}, Landroid/content/Context;->getColor(I)I

    move-result v7

    invoke-virtual {v8, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v6, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-virtual {v6, v7, v8, v9, v4}, Landroid/view/View;->setPadding(IIII)V

    new-instance v4, LC7;

    const/4 v7, 0x1

    invoke-direct {v4, v0, v1, v7}, LC7;-><init>(Lha;Landroid/app/Activity;I)V

    invoke-virtual {v6, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v4, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v6, -0x4beffffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v6, 0x41400000    # 12.0f

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6, v15}, Landroid/content/Context;->getColor(I)I

    move-result v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {v6, v11, v10, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v4, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v7, 0x1

    invoke-virtual {v4, v7}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v4, v7}, Landroid/view/View;->setFocusable(Z)V

    new-instance v6, LC7;

    const/4 v7, 0x2

    invoke-direct {v6, v0, v1, v7}, LC7;-><init>(Lha;Landroid/app/Activity;I)V

    invoke-virtual {v4, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v4, v0, Lha;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v5, v10, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-virtual {v5, v6, v11, v7, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/high16 v5, 0x41600000    # 14.0f

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5, v15}, Landroid/content/Context;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v6, 0x8

    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    iput-object v4, v0, Lha;->f:Landroid/widget/TextView;

    iget-object v5, v0, Lha;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v7, 0x1

    invoke-virtual {v4, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, -0x1

    invoke-direct {v5, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v5, 0x11

    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    invoke-virtual {v4, v6, v11, v3, v11}, Landroid/view/View;->setPadding(IIII)V

    const/16 v6, 0x8

    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    new-instance v3, Landroid/widget/ImageView;

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v3, v6}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    invoke-direct {v6, v7, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    iput v2, v6, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v3, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v2, 0x55080109

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v15}, Landroid/content/Context;->getColor(I)I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setColorFilter(I)V

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-virtual {v3, v2}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v6, -0x4b84fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v3, 0x41800000    # 16.0f

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3, v15}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v10, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object v4, v0, Lha;->e:Landroid/widget/LinearLayout;

    iget-object v2, v0, Lha;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setId(I)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, -0x1

    invoke-direct {v3, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v7, 0x1

    invoke-direct {v3, v7}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/i;)V

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Landroid/view/View;->setOverScrollMode(I)V

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-virtual {v2, v3, v11, v4, v11}, Landroid/view/View;->setPadding(IIII)V

    new-instance v3, Lda;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lda;-><init>(I)V

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Lmv;)V

    iput-object v2, v0, Lha;->c:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v0, Lha;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v2, LEA;->a:LEA;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->i()Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, v0, Lha;->i:Ljava/lang/Object;

    new-instance v3, LQ7;

    new-instance v4, LQ4;

    const/4 v5, 0x4

    invoke-direct {v4, v5, v0}, LQ4;-><init>(ILjava/lang/Object;)V

    invoke-direct {v3, v2, v4}, LQ7;-><init>(Ljava/util/ArrayList;LQ4;)V

    iput-object v3, v0, Lha;->h:Landroidx/recyclerview/widget/g;

    iget-object v2, v0, Lha;->c:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v2, :cond_1

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/g;)V

    :cond_1
    iget-object v2, v0, Lha;->i:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    invoke-virtual {v0, v2, v11}, Lha;->i(ZZ)V

    invoke-virtual {v0, v1, v11}, Lha;->f(Landroid/app/Activity;Z)V

    return-void

    :pswitch_0
    const/16 v2, 0x50

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x20

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-wide v4, -0x5c5efffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v4, -0x5c67fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-wide v7, -0x5c79fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    new-instance v8, LJz;

    invoke-direct {v8, v0, v1}, LJz;-><init>(Lha;Landroid/app/Activity;)V

    filled-new-array {v6, v7, v8}, [Ljava/lang/Object;

    move-result-object v6

    const-wide v7, -0x20dfbfffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    const/4 v7, 0x3

    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v1, v4, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, LWz;

    invoke-direct {v4, v1}, LWz;-><init>(Landroid/app/Activity;)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v8, -0x1

    invoke-direct {v6, v8, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v6, 0x55060049

    invoke-virtual {v1, v6}, Landroid/content/Context;->getColor(I)I

    move-result v6

    const v9, 0x5506004b

    invoke-virtual {v1, v9}, Landroid/content/Context;->getColor(I)I

    move-result v9

    const v10, 0x55060047

    invoke-virtual {v1, v10}, Landroid/content/Context;->getColor(I)I

    move-result v10

    filled-new-array {v6, v9, v10}, [I

    move-result-object v6

    invoke-virtual {v4, v6}, LWz;->setColorSchemeColors([I)V

    new-instance v6, LQ9;

    const/4 v9, 0x0

    invoke-direct {v6, v9, v0, v1}, LQ9;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v6}, LWz;->setOnRefreshListener(LUz;)V

    iput-object v4, v0, Lha;->g:LWz;

    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x1

    invoke-virtual {v4, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const v9, 0x55060040

    invoke-virtual {v1, v9}, Landroid/content/Context;->getColor(I)I

    move-result v9

    invoke-virtual {v4, v9}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v9, v8, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v9, 0xc

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    invoke-virtual {v4, v5, v10, v5, v11}, Landroid/view/View;->setPadding(IIII)V

    iput-object v4, v0, Lha;->b:Landroid/widget/LinearLayout;

    iget-object v10, v0, Lha;->g:LWz;

    invoke-virtual {v10, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v11, -0x2

    invoke-direct {v10, v8, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v12, 0x10

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    const/16 v8, 0x8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-virtual {v10, v14, v5, v15, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v4, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v10, 0x55060035

    invoke-virtual {v1, v10}, Landroid/content/Context;->getColor(I)I

    move-result v10

    invoke-virtual {v8, v10}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v10, 0x18

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v10}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    int-to-float v10, v10

    invoke-virtual {v8, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v10}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    const v14, 0x55060039

    invoke-virtual {v1, v14}, Landroid/content/Context;->getColor(I)I

    move-result v14

    invoke-virtual {v8, v10, v14}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v4, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-virtual {v4, v8, v10, v14, v15}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {v4, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v8, Landroid/widget/ImageView;

    invoke-direct {v8, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v12, 0x14

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v12}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-static {v12}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-direct {v10, v14, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-virtual {v10, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v8, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v10, 0x55080109

    invoke-virtual {v8, v10}, Landroid/widget/ImageView;->setImageResource(I)V

    const v14, 0x550603f5

    invoke-virtual {v1, v14}, Landroid/content/Context;->getColor(I)I

    move-result v15

    invoke-virtual {v8, v15}, Landroid/widget/ImageView;->setColorFilter(I)V

    invoke-virtual {v4, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v8, Landroid/widget/EditText;

    invoke-direct {v8, v1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    new-instance v15, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-direct {v15, v5, v11, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v8, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const-wide v17, -0x5c7cfffff835L

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    invoke-virtual {v1, v14}, Landroid/content/Context;->getColor(I)I

    move-result v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setHintTextColor(I)V

    const v10, 0x550603f9

    invoke-virtual {v1, v10}, Landroid/content/Context;->getColor(I)I

    move-result v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v10, 0x41800000    # 16.0f

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v15, 0x0

    invoke-virtual {v8, v15}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setSingleLine(Z)V

    invoke-virtual {v8, v7}, Landroid/widget/TextView;->setImeOptions(I)V

    new-instance v7, Le5;

    const/4 v15, 0x1

    invoke-direct {v7, v15, v0}, Le5;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v8, v7}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iput-object v8, v0, Lha;->d:Landroid/widget/EditText;

    invoke-virtual {v4, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v7, Landroid/widget/ImageView;

    invoke-direct {v7, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v12}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-static {v12}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-direct {v8, v15, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-virtual {v8, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v7, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v8, 0x550800e6    # 9.34609E12f

    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v1, v14}, Landroid/content/Context;->getColor(I)I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setColorFilter(I)V

    const/16 v8, 0x8

    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    new-instance v8, Ll5;

    const/4 v9, 0x2

    invoke-direct {v8, v9, v0, v7}, Ll5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v8, v0, Lha;->d:Landroid/widget/EditText;

    if-eqz v8, :cond_2

    new-instance v9, Lea;

    const/4 v12, 0x0

    invoke-direct {v9, v7, v12}, Lea;-><init>(Landroid/widget/ImageView;I)V

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_2
    iget-object v7, v0, Lha;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v7, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v7, v11, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static/range {v16 .. v16}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-virtual {v7, v8, v5, v9, v12}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v4, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/high16 v7, 0x41600000    # 14.0f

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v1, v14}, Landroid/content/Context;->getColor(I)I

    move-result v7

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v8, 0x8

    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    iput-object v4, v0, Lha;->f:Landroid/widget/TextView;

    iget-object v7, v0, Lha;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v7, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v8, -0x1

    invoke-direct {v7, v8, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v7, 0x11

    invoke-virtual {v4, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    invoke-virtual {v4, v8, v5, v3, v5}, Landroid/view/View;->setPadding(IIII)V

    const/16 v8, 0x8

    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    new-instance v3, Landroid/widget/ImageView;

    invoke-direct {v3, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    invoke-direct {v8, v9, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    iput v2, v8, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v3, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v2, 0x55080109

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v1, v14}, Landroid/content/Context;->getColor(I)I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setColorFilter(I)V

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-virtual {v3, v2}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v8, -0x5c0cfffff835L

    invoke-static {v8, v9, v2, v10}, LEy;->l(JLandroid/widget/TextView;F)V

    invoke-virtual {v1, v14}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v11, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object v4, v0, Lha;->e:Landroid/widget/LinearLayout;

    iget-object v2, v0, Lha;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setId(I)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v8, -0x1

    invoke-direct {v3, v8, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v3, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/i;)V

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Landroid/view/View;->setOverScrollMode(I)V

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-virtual {v2, v3, v5, v4, v5}, Landroid/view/View;->setPadding(IIII)V

    new-instance v3, Lda;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lda;-><init>(I)V

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Lmv;)V

    iput-object v2, v0, Lha;->c:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v0, Lha;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v2, LEA;->a:LEA;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, LEA;->e:Ljava/util/ArrayList;

    iput-object v2, v0, Lha;->i:Ljava/lang/Object;

    new-instance v3, Lca;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {v3, v1, v4}, Lca;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;)V

    iput-object v3, v0, Lha;->h:Landroidx/recyclerview/widget/g;

    iget-object v2, v0, Lha;->c:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v2, :cond_3

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/g;)V

    :cond_3
    iget-object v2, v0, Lha;->i:Ljava/lang/Object;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    invoke-virtual {v0, v2, v5}, Lha;->h(ZZ)V

    sget-object v2, LY4;->a:LY4;

    new-instance v3, LR9;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v5, v1, v4}, LR9;-><init>(Lha;ZLandroid/app/Activity;I)V

    new-instance v4, LR9;

    const/4 v7, 0x1

    invoke-direct {v4, v0, v5, v1, v7}, LR9;-><init>(Lha;ZLandroid/app/Activity;I)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v3, v4, v6}, LY4;->a(Landroid/content/Context;Lfj;Lfj;Z)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e(Ljava/lang/String;)V
    .locals 8

    iget-object v0, p0, Lha;->i:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->i()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lha;->i:Ljava/lang/Object;

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    sget-object v2, LEA;->a:LEA;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->i()Ljava/util/ArrayList;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lha;->i:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LCA;

    iget-object v5, v4, LCA;->b:Ljava/lang/String;

    invoke-static {v5, p1, v1}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-nez v5, :cond_3

    iget-object v5, v4, LCA;->c:Ljava/lang/String;

    invoke-static {v5, p1, v1}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-nez v5, :cond_3

    iget-object v4, v4, LCA;->e:Ljava/lang/String;

    invoke-static {v4, p1, v1}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-eqz v4, :cond_2

    :cond_3
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    move-object v0, v2

    :goto_1
    iget-object v2, p0, Lha;->h:Landroidx/recyclerview/widget/g;

    check-cast v2, LQ7;

    if-eqz v2, :cond_5

    const-wide v3, -0x4df0fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    iget-object v3, v2, LQ7;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v2}, Landroidx/recyclerview/widget/g;->notifyDataSetChanged()V

    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_6

    iget-object v2, p0, Lha;->f:Landroid/widget/TextView;

    if-eqz v2, :cond_8

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_6
    iget-object v3, p0, Lha;->f:Landroid/widget/TextView;

    if-eqz v3, :cond_7

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    :cond_7
    iget-object v3, p0, Lha;->f:Landroid/widget/TextView;

    if-eqz v3, :cond_8

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v6, -0x4b8efffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-wide v6, -0x4b92fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_8
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_9

    goto :goto_3

    :cond_9
    move v1, v4

    :goto_3
    invoke-virtual {p0, v0, v1}, Lha;->i(ZZ)V

    return-void
.end method

.method public f(Landroid/app/Activity;Z)V
    .locals 4

    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->i()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lha;->i:Ljava/lang/Object;

    iget-object v0, p0, Lha;->d:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const-wide v0, -0x4a40fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-virtual {p0, v0}, Lha;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lha;->g:LWz;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, LWz;->setRefreshing(Z)V

    :cond_2
    if-eqz p2, :cond_3

    const-wide v2, -0x4a41fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_3
    return-void
.end method

.method public g()V
    .locals 2

    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, LEA;->e:Ljava/util/ArrayList;

    iput-object v0, p0, Lha;->i:Ljava/lang/Object;

    iget-object v0, p0, Lha;->d:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const-wide v0, -0x5cc7fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-virtual {p0, v0}, Lha;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final getContentView()Landroid/view/View;
    .locals 1

    iget v0, p0, Lha;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lha;->g:LWz;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lha;->g:LWz;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lha;->a:I

    packed-switch v0, :pswitch_data_0

    const-wide v0, -0x4bbafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-wide v0, -0x5cc2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public h(ZZ)V
    .locals 2

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-eqz p1, :cond_5

    iget-object p1, p0, Lha;->e:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_0

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    iget-object p1, p0, Lha;->c:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    iget-object p1, p0, Lha;->e:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    :cond_2
    move-object p1, v0

    :goto_0
    instance-of v1, p1, Landroid/widget/TextView;

    if-eqz v1, :cond_3

    move-object v0, p1

    check-cast v0, Landroid/widget/TextView;

    :cond_3
    if-eqz v0, :cond_7

    if-eqz p2, :cond_4

    const-wide p1, -0x5c1ffffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_4
    const-wide p1, -0x5c29fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    :goto_1
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_5
    iget-object p1, p0, Lha;->e:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_6

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_6
    iget-object p1, p0, Lha;->c:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p1, :cond_7

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_7
    return-void
.end method

.method public i(ZZ)V
    .locals 2

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-eqz p1, :cond_5

    iget-object p1, p0, Lha;->e:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_0

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    iget-object p1, p0, Lha;->c:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    iget-object p1, p0, Lha;->e:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    :cond_2
    move-object p1, v0

    :goto_0
    instance-of v1, p1, Landroid/widget/TextView;

    if-eqz v1, :cond_3

    move-object v0, p1

    check-cast v0, Landroid/widget/TextView;

    :cond_3
    if-eqz v0, :cond_7

    if-eqz p2, :cond_4

    const-wide p1, -0x4b97fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_4
    const-wide p1, -0x4ba1fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    :goto_1
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_5
    iget-object p1, p0, Lha;->e:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_6

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_6
    iget-object p1, p0, Lha;->c:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p1, :cond_7

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_7
    return-void
.end method
