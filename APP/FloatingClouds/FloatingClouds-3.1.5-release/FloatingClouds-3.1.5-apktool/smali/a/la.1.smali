.class public final synthetic La/la;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:La/ra;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(La/ra;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/la;->a:La/ra;

    iput p2, p0, La/la;->b:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 11

    iget-object p1, p0, La/la;->a:La/ra;

    iget-object v0, p1, La/ra;->e:Landroid/widget/LinearLayout;

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget v1, p0, La/la;->b:I

    iput v1, p1, La/ra;->g:I

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x0

    iput-object v2, p1, La/ra;->h:Landroid/widget/Switch;

    :cond_1
    sget-object v2, La/K3;->a:La/K3$a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v2

    iget-object v3, p1, La/ra;->k:La/Me;

    invoke-virtual {v3}, La/Me;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/ra$b;

    new-instance v3, Landroid/widget/LinearLayout;

    iget-object v4, p1, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v3, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v6, 0x10

    invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/4 v6, 0x4

    invoke-virtual {p1, v6}, La/ra;->b(I)I

    move-result v7

    const/16 v8, 0x8

    invoke-virtual {p1, v8}, La/ra;->b(I)I

    move-result v8

    invoke-virtual {p1, v6}, La/ra;->b(I)I

    move-result v6

    const/16 v9, 0xc

    invoke-virtual {p1, v9}, La/ra;->b(I)I

    move-result v9

    invoke-virtual {v3, v7, v8, v6, v9}, Landroid/view/View;->setPadding(IIII)V

    new-instance v6, La/ga;

    const/4 v7, 0x1

    invoke-direct {v6, p1, v7}, La/ga;-><init>(La/ra;I)V

    invoke-virtual {v3, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v6, Landroid/widget/TextView;

    invoke-direct {v6, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v7, "\u2190"

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v7, 0x41a00000    # 20.0f

    const/4 v8, 0x2

    invoke-virtual {v6, v8, v7}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v7, p1, La/ra;->b:La/ra$a;

    iget v9, v7, La/ra$a;->g:I

    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v9, 0xa

    invoke-virtual {p1, v9}, La/ra;->b(I)I

    move-result v10

    invoke-virtual {v6, v5, v5, v10, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v6, Landroid/widget/TextView;

    invoke-direct {v6, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v10, v1, La/ra$b;->a:Ljava/lang/String;

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v10, 0x41880000    # 17.0f

    invoke-virtual {v6, v8, v10}, Landroid/widget/TextView;->setTextSize(IF)V

    sget-object v8, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget v8, v7, La/ra$a;->d:I

    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/4 v3, 0x1

    invoke-virtual {p1, v3}, La/ra;->b(I)I

    move-result v3

    new-instance v6, Landroid/view/View;

    invoke-direct {v6, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v8, -0x1

    invoke-direct {v4, v8, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget v3, v7, La/ra$a;->c:I

    invoke-virtual {v6, v3}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p1, v9}, La/ra;->b(I)I

    move-result v3

    invoke-virtual {p1, v3}, La/ra;->n(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v1, v1, La/ra$b;->c:La/H7;

    invoke-interface {v1, v0, v2}, La/H7;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p1, La/ra;->f:Landroid/widget/ScrollView;

    if-eqz p1, :cond_2

    invoke-virtual {p1, v5, v5}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    :cond_2
    :goto_0
    return-void
.end method
