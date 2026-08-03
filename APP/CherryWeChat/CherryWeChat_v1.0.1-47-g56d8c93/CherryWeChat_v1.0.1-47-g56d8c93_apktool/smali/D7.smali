.class public final synthetic LD7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LD7;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD7;->b:Landroid/app/Activity;

    iput-object p2, p0, LD7;->c:Landroid/view/ViewGroup;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Landroid/app/Activity;I)V
    .locals 0

    .line 2
    iput p3, p0, LD7;->a:I

    iput-object p1, p0, LD7;->c:Landroid/view/ViewGroup;

    iput-object p2, p0, LD7;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget v0, p0, LD7;->a:I

    const/4 v1, 0x0

    iget-object v2, p0, LD7;->b:Landroid/app/Activity;

    iget-object v3, p0, LD7;->c:Landroid/view/ViewGroup;

    packed-switch v0, :pswitch_data_0

    const-wide v4, -0x1d90cfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-wide v4, -0x1d935fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/view/ViewGroup;

    invoke-static {v0, v1}, LGu;->k(Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object v0

    const-wide v4, -0x1d9f1fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/view/ViewGroup;

    const-wide v4, -0x1d9adfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object v4

    const-wide v5, -0x1d85afffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    check-cast v4, Landroid/view/ViewGroup;

    new-instance v5, Lz7;

    const/4 v6, 0x3

    invoke-direct {v5, v2, v0, v4, v6}, Lz7;-><init>(Landroid/app/Activity;Landroid/view/ViewGroup;Landroid/view/ViewGroup;I)V

    const-wide/16 v6, 0x12c

    invoke-static {v5, v6, v7}, LbA;->b(Ljava/lang/Runnable;J)V

    invoke-static {v3}, Lgf;->q(Landroid/view/ViewGroup;)V

    const-wide v3, -0x1dde7fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    sget-object v4, LXA;->a:Ljava/util/HashMap;

    const-wide v4, -0x1ddeffffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const-string v6, "status_bar_height"

    invoke-static {v5, v6}, Ln5;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    sget v6, Lgf;->o:I

    add-int/2addr v5, v6

    const/4 v6, -0x1

    invoke-direct {v4, v6, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v3, v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    invoke-static {v0}, Lgf;->u(Landroid/view/ViewGroup;)V

    sget-object v3, LXA;->a:Ljava/util/HashMap;

    const-wide v3, -0x1d816fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-static {v2, v3}, Lgf;->t(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)Landroid/widget/ImageView;

    move-result-object v2

    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v3, v6, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void

    :pswitch_0
    invoke-static {v3}, LNj;->j(Landroid/view/ViewGroup;)V

    sget v0, LTB;->i:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    iput v1, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    sget-object v3, LXA;->a:Ljava/util/HashMap;

    const-wide v3, -0x8ec7fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-static {v2, v3}, Lgf;->t(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)Landroid/widget/ImageView;

    move-result-object v3

    new-instance v4, LC7;

    invoke-direct {v4, v2, v1}, LC7;-><init>(Landroid/app/Activity;I)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v4, 0x20

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-direct {v2, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v4, 0x10

    iput v4, v2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    const/16 v4, 0xa

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    iput v4, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    const/4 v4, 0x6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    iput v4, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    invoke-virtual {v0, v3, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void

    :pswitch_1
    invoke-static {v2}, LOj;->p(Landroid/app/Activity;)V

    invoke-virtual {v3, v1}, Landroid/view/View;->setFitsSystemWindows(Z)V

    invoke-virtual {v3, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    return-void

    :pswitch_2
    invoke-static {v3}, LNj;->j(Landroid/view/ViewGroup;)V

    invoke-static {v2}, LOj;->p(Landroid/app/Activity;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
