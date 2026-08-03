.class public final synthetic LF7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfj;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LF7;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LHb;

    const-wide v0, -0x1c226fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, [Ljava/lang/Class;

    const-wide v0, -0x138dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    array-length v0, p1

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    aget-object v0, p1, v2

    const-class v1, Ljava/lang/String;

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    aget-object p1, p1, v0

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v2, 0x1

    :cond_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    check-cast p1, LhG;

    const-wide v0, -0x1390fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LNb;->b:LNb;

    invoke-virtual {v0}, LZk;->e()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    :try_start_0
    iget-object v0, p1, LhG;->a:Lqs;

    iget-object v0, v0, Lqs;->c:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_1

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    goto/16 :goto_1

    :cond_2
    const-wide v2, -0x139dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    const-wide v2, -0x12b0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    :cond_3
    sget-object v2, LNb;->c:LHb;

    sget-object v3, LHb;->c:LHb;

    if-ne v2, v3, :cond_4

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->c:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    const-wide v2, -0x119ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x1044fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, LBz;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, p1, v1

    goto/16 :goto_1

    :cond_4
    sget-object v2, LNb;->c:LHb;

    sget-object v3, LHb;->d:LHb;

    if-ne v2, v3, :cond_5

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->c:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    const-wide v2, -0x101dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x10c2fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, LBz;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, p1, v1

    goto/16 :goto_1

    :cond_5
    sget-object v2, LNb;->c:LHb;

    sget-object v3, LHb;->e:LHb;

    if-ne v2, v3, :cond_6

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->c:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    const-wide v2, -0x1089fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x10b5fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, LBz;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-wide v2, -0x10b6fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, LNb;->g(Z)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, LBz;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, p1, v1

    goto :goto_1

    :cond_6
    sget-object v2, LNb;->c:LHb;

    sget-object v3, LHb;->f:LHb;

    if-ne v2, v3, :cond_7

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->c:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    const-wide v2, -0x1f5bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x1f00fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, LNb;->g(Z)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, LBz;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, p1, v1

    goto :goto_1

    :cond_7
    sget-object v2, LNb;->c:LHb;

    sget-object v3, LHb;->g:LHb;

    if-ne v2, v3, :cond_8

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->c:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    const-wide v2, -0x1f2efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x1fdafffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, LBz;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-wide v2, -0x1fdbfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v3}, LNb;->g(Z)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, LBz;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, p1, v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_8
    :goto_1
    sget-object p1, LTC;->a:LTC;

    return-object p1
.end method

.method private final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Ljava/lang/String;

    const-wide v0, -0x1f80fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x1f87fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x27

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Ljava/lang/String;

    const-wide v0, -0x1fa3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x1faafffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x27

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    check-cast p1, LhG;

    const-wide v0, -0x311afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object v0, p1, Lqs;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    const-wide v1, -0x3126fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Landroid/view/View;

    invoke-static {v4, v5}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p1, Lqs;->b:Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const-wide v6, -0x3135fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    instance-of v5, v4, Landroid/widget/FrameLayout$LayoutParams;

    if-eqz v5, :cond_0

    check-cast v4, Landroid/widget/FrameLayout$LayoutParams;

    iget v4, v4, Landroid/widget/FrameLayout$LayoutParams;->width:I

    const/4 v5, -0x1

    if-ne v4, v5, :cond_0

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const v4, 0x550a022b

    const-class v5, Ljava/lang/Object;

    invoke-virtual {v3, v4, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    sget-object p1, LTC;->a:LTC;

    return-object p1
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    iget v1, v0, LF7;->a:I

    const/16 v2, 0xd

    const-class v3, Landroid/view/View;

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/16 v6, 0x8

    const/4 v7, 0x0

    const-wide v8, -0x20dfbfffff835L

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    sget-object v13, LTC;->a:LTC;

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x3da0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v2, -0x3dbefffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    const-wide v2, -0x3c7afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    new-instance v2, Lwq;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-wide v4, -0x3c36fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v4, -0x1c1a3fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {v2, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    sget-object v3, LXA;->a:Ljava/util/HashMap;

    const-wide v3, -0x3cc6fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-nez v3, :cond_0

    const-wide v3, -0x3ce8fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    :cond_0
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget-object v3, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const-wide v3, -0x3cfdfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const/high16 v4, 0x55000000

    invoke-static {v4, v3}, Lhw;->a(ILjava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Lwq;->setMaskColor(I)V

    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    const/4 v4, -0x1

    invoke-direct {v3, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2, v12, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-object v13

    :pswitch_0
    invoke-direct/range {p0 .. p1}, LF7;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :pswitch_1
    invoke-direct/range {p0 .. p1}, LF7;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :pswitch_2
    invoke-direct/range {p0 .. p1}, LF7;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :pswitch_3
    invoke-direct/range {p0 .. p1}, LF7;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :pswitch_4
    invoke-direct/range {p0 .. p1}, LF7;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :pswitch_5
    invoke-direct/range {p0 .. p1}, LF7;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :pswitch_6
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x367efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v2, -0x361cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    invoke-static {v1}, Lgf;->o(Landroid/view/ViewGroup;)V

    const-wide v2, -0x36d8fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    const-wide v3, -0x36fafffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v2, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    const-wide v3, -0x36b6fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v2, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    const-wide v3, -0x3572fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/widget/TextView;

    sget-object v3, LXA;->a:Ljava/util/HashMap;

    const-wide v3, -0x352ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v12, v3}, Lhw;->a(ILjava/lang/String;)I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_1
    const-wide v2, -0x35ccfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_2

    const-wide v3, -0x35f7fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object v1

    const-wide v3, -0x3599fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    new-array v4, v12, [Ljava/lang/Object;

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v4, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-wide v3, -0x35a8fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    return-object v13

    :pswitch_7
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x376cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v2, -0x370afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    invoke-static {v1}, Lgf;->o(Landroid/view/ViewGroup;)V

    const-wide v2, -0x37c6fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    const-wide v2, -0x37e8fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    const-wide v2, -0x37a4fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/widget/TextView;

    sget-object v2, LXA;->a:Ljava/util/HashMap;

    const-wide v2, -0x3661fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v12, v2}, Lhw;->a(ILjava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_3
    return-object v13

    :pswitch_8
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x856fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v2, -0x862fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    invoke-static {v1}, Lgf;->o(Landroid/view/ViewGroup;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const-wide v3, -0x81efffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v1, v2, v4, v11}, Landroid/view/ViewGroup;->findViewsWithText(Ljava/util/ArrayList;Ljava/lang/CharSequence;I)V

    goto :goto_0

    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    const-wide v3, -0x823fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/widget/TextView;

    sget-object v3, LXA;->a:Ljava/util/HashMap;

    const-wide v3, -0x8e0fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v12, v3}, Lhw;->a(ILjava/lang/String;)I

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_5
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    sget-object v3, LKk;->a:Ljava/lang/Object;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_6

    const-wide v3, -0x8fdfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object v1

    const-wide v3, -0x89ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    new-array v4, v12, [Ljava/lang/Object;

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v4, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-wide v3, -0x8aefffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_6
    return-object v13

    :pswitch_9
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x9c3fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v2, -0x9e1fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    invoke-static {v1}, Lgf;->o(Landroid/view/ViewGroup;)V

    sget-object v2, LXA;->a:Ljava/util/HashMap;

    const-wide v2, -0x99dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v12, v2}, Lhw;->a(ILjava/lang/String;)I

    move-result v2

    const-wide v3, -0x9bafffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v12, v3}, Lhw;->a(ILjava/lang/String;)I

    move-result v3

    invoke-static {v1, v2, v3, v12}, Lgf;->M(Landroid/view/ViewGroup;IIZ)V

    return-object v13

    :pswitch_a
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0x942fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->c:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    aget-object v1, v1, v11

    const-wide v2, -0x94efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    invoke-static {v1}, Lgf;->o(Landroid/view/ViewGroup;)V

    invoke-static {v1}, Lgf;->q(Landroid/view/ViewGroup;)V

    sget-object v2, LXA;->a:Ljava/util/HashMap;

    const-wide v2, -0x90afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v12, v2}, Lhw;->a(ILjava/lang/String;)I

    move-result v2

    const-wide v3, -0x927fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v12, v3}, Lhw;->a(ILjava/lang/String;)I

    move-result v3

    invoke-static {v1, v2, v3, v12}, Lgf;->M(Landroid/view/ViewGroup;IIZ)V

    return-object v13

    :pswitch_b
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0xb25fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    new-instance v2, Lvx;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    instance-of v3, v1, Ljava/lang/Class;

    if-eqz v3, :cond_7

    check-cast v1, Ljava/lang/Class;

    iput-object v1, v2, Lvx;->b:Ljava/io/Serializable;

    goto :goto_2

    :cond_7
    iput-object v1, v2, Lvx;->c:Ljava/lang/Object;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_1

    :cond_8
    move-object v1, v10

    :goto_1
    iput-object v1, v2, Lvx;->b:Ljava/io/Serializable;

    :goto_2
    const-wide v3, -0xb31fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lvx;->e(Ljava/lang/String;)V

    invoke-virtual {v2}, Lvx;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v10

    :cond_9
    const-wide v1, -0xbe2fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    check-cast v10, Landroid/widget/LinearLayout;

    invoke-virtual {v10}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    move v2, v12

    :goto_3
    if-ge v2, v1, :cond_e

    invoke-virtual {v10, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    const-wide v4, -0xba3fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v3, Landroid/view/ViewGroup;

    instance-of v4, v3, Landroid/widget/LinearLayout;

    if-eqz v4, :cond_a

    new-instance v4, LN2;

    move-object v5, v3

    check-cast v5, Landroid/widget/LinearLayout;

    invoke-direct {v4, v6, v5}, LN2;-><init>(ILjava/lang/Object;)V

    const-wide/16 v14, 0x96

    invoke-virtual {v3, v4, v14, v15}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_4

    :cond_a
    invoke-static {v3}, Lgf;->o(Landroid/view/ViewGroup;)V

    :goto_4
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const-wide v14, -0xa5ffffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v16

    const-wide v14, -0xa64fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v17

    const-wide v14, -0xa6bfffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v18

    const-wide v14, -0xa6efffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v19

    const-wide v14, -0xa71fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v20

    const-wide v14, -0xa75fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v21

    filled-new-array/range {v16 .. v21}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lsa;->b0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v3, v4, v7, v11}, Landroid/view/ViewGroup;->findViewsWithText(Ljava/util/ArrayList;Ljava/lang/CharSequence;I)V

    goto :goto_5

    :cond_b
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_d

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    const-wide v14, -0xa79fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    check-cast v4, Landroid/widget/TextView;

    sget-object v5, LXA;->a:Ljava/util/HashMap;

    const-wide v14, -0xa36fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v12, v5}, Lhw;->a(ILjava/lang/String;)I

    move-result v5

    if-eqz v5, :cond_c

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_c
    invoke-virtual {v4}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    sget-object v5, LKk;->a:Ljava/lang/Object;

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    if-eqz v4, :cond_d

    const-wide v14, -0xad3fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object v3

    const-wide v14, -0xaf5fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    new-array v7, v12, [Ljava/lang/Object;

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v7, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v7

    invoke-static {v3, v5, v7}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const-wide v14, -0xa84fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    check-cast v3, Landroid/widget/ImageView;

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_d
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_3

    :cond_e
    return-object v13

    :pswitch_c
    move-object/from16 v1, p1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-static {v1}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->i(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;

    move-result-object v1

    return-object v1

    :pswitch_d
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Class;

    invoke-static {v1}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->w(Ljava/lang/Class;)Ljava/lang/CharSequence;

    move-result-object v1

    return-object v1

    :pswitch_e
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sget-object v2, Lg8;->b:Lg8;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ne v1, v11, :cond_f

    invoke-static {}, Lg8;->o()V

    goto :goto_6

    :cond_f
    sget-object v1, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v3, -0xeefffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v12}, LNx;->c(Ljava/lang/String;Z)V

    const-wide v3, -0xee95fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v3, -0xeeacfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, LNx;->e(Ljava/lang/String;Ljava/lang/String;)V

    const-wide v3, -0xeeadfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v3, -0xed47fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, LNx;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lg8;->n()V

    return-object v13

    :pswitch_f
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0xea33fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    sget-object v2, Lg8;->b:Lg8;

    invoke-virtual {v2}, Lg8;->j()Z

    move-result v2

    if-nez v2, :cond_10

    goto :goto_7

    :cond_10
    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v2, -0xead1fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/View;

    new-instance v2, LQ4;

    invoke-direct {v2, v11, v1}, LQ4;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v3

    if-eqz v3, :cond_11

    new-instance v3, Lf8;

    invoke-direct {v3, v2, v12}, Lf8;-><init>(LQ4;I)V

    invoke-virtual {v1, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_7

    :cond_11
    new-instance v3, LX6;

    invoke-direct {v3, v11, v2}, LX6;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :goto_7
    return-object v13

    :pswitch_10
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0xe1f9fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    sget-object v2, LS7;->b:LS7;

    invoke-virtual {v2}, LZk;->e()Z

    move-result v2

    if-eqz v2, :cond_12

    iget-object v2, v1, Lqs;->c:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/Object;

    aget-object v2, v2, v12

    const-wide v3, -0xe185fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Ljava/lang/String;

    const-wide v3, -0xe1b8fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    const-wide v2, -0xe056fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v2, v1, Lqs;->d:Ljava/lang/Object;

    check-cast v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-virtual {v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lqs;->C(Ljava/lang/Object;)V

    :cond_12
    return-object v13

    :pswitch_11
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0xe131fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    sget-object v2, LS7;->b:LS7;

    invoke-virtual {v2}, LZk;->e()Z

    move-result v2

    if-eqz v2, :cond_14

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v2, v1, Lqs;->c:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/Object;

    aget-object v2, v2, v12

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_13

    move-object v10, v2

    check-cast v10, Ljava/lang/String;

    :cond_13
    if-eqz v10, :cond_14

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v2, -0xe13dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    const v2, 0x550a021b

    invoke-virtual {v1, v2, v10}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_14
    return-object v13

    :pswitch_12
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0xe2c7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    sget-object v2, LS7;->b:LS7;

    invoke-virtual {v2}, LZk;->e()Z

    move-result v2

    if-eqz v2, :cond_15

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->c:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    aget-object v1, v1, v12

    const-wide v2, -0xe2d3fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-wide v3, -0xe28ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/app/Activity;

    const-wide v3, -0xe149fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object v3

    const-wide v4, -0xe175fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v3, Landroid/view/ViewGroup;

    new-instance v4, Lz7;

    invoke-direct {v4, v3, v2, v1, v11}, Lz7;-><init>(Landroid/view/ViewGroup;Landroid/app/Activity;Landroid/view/ViewGroup;I)V

    const-wide/16 v1, 0xc8

    invoke-virtual {v3, v4, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_15
    return-object v13

    :pswitch_13
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0xac4dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v2, -0xac6bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    new-instance v2, Ly7;

    invoke-direct {v2, v1, v5}, Ly7;-><init>(Landroid/view/ViewGroup;I)V

    const-wide/16 v3, 0x64

    invoke-virtual {v1, v2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-object v13

    :pswitch_14
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const/16 v2, 0x14

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-wide v3, -0xa099fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    new-instance v3, Lvx;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    instance-of v4, v1, Ljava/lang/Class;

    if-eqz v4, :cond_16

    check-cast v1, Ljava/lang/Class;

    iput-object v1, v3, Lvx;->b:Ljava/io/Serializable;

    goto :goto_8

    :cond_16
    iput-object v1, v3, Lvx;->c:Ljava/lang/Object;

    if-eqz v1, :cond_17

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    :cond_17
    iput-object v10, v3, Lvx;->b:Ljava/io/Serializable;

    :goto_8
    const-class v1, Landroid/widget/TextView;

    iput-object v1, v3, Lvx;->d:Ljava/io/Serializable;

    invoke-virtual {v3}, Lvx;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-nez v1, :cond_18

    goto/16 :goto_9

    :cond_18
    sget-object v3, LXA;->a:Ljava/util/HashMap;

    const-wide v3, -0xa0a5fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v12, v3}, Lhw;->a(ILjava/lang/String;)I

    move-result v3

    if-eqz v3, :cond_19

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_19
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    const-wide v3, -0xaf40fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    const-wide v3, -0xaf7cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_1a

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_1a
    invoke-static {v1, v12}, LGu;->k(Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object v1

    const-wide v3, -0xaf1cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/widget/ImageView;

    const-wide v3, -0xafdafffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_1b

    invoke-virtual {v1}, Landroid/view/View;->getRotation()F

    move-result v4

    cmpg-float v4, v4, v7

    if-nez v4, :cond_1b

    const-wide v4, -0xaf83fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v5, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v1, v4, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    iput v3, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    goto :goto_9

    :cond_1b
    const-wide v3, -0xaf98fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_1c

    invoke-virtual {v1}, Landroid/view/View;->getRotation()F

    move-result v4

    const/high16 v5, 0x43340000    # 180.0f

    cmpg-float v4, v4, v5

    if-nez v4, :cond_1c

    const-wide v4, -0xae43fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v5, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v1, v4, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    iput v3, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    :cond_1c
    :goto_9
    return-object v13

    :pswitch_15
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v14, -0xe661fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v2, v1, Lqs;->c:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/Object;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    aget-object v5, v2, v12

    aget-object v2, v2, v11

    const-wide v14, -0xe66dfffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    new-instance v14, Lvx;

    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    instance-of v15, v5, Ljava/lang/Class;

    if-eqz v15, :cond_1d

    check-cast v5, Ljava/lang/Class;

    iput-object v5, v14, Lvx;->b:Ljava/io/Serializable;

    goto :goto_b

    :cond_1d
    iput-object v5, v14, Lvx;->c:Ljava/lang/Object;

    if-eqz v5, :cond_1e

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    goto :goto_a

    :cond_1e
    move-object v5, v10

    :goto_a
    iput-object v5, v14, Lvx;->b:Ljava/io/Serializable;

    :goto_b
    iput-object v3, v14, Lvx;->d:Ljava/io/Serializable;

    invoke-virtual {v14}, Lvx;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    new-instance v5, LiG;

    invoke-direct {v5, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v14, -0xe61dfffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v5, v14}, LiG;->f(Ljava/lang/String;)V

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v5, v10, v2}, LiG;->c(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-wide v14, -0xe625fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    new-array v14, v12, [Ljava/lang/Object;

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v14, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v14

    invoke-static {v2, v5, v14}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    const-wide v14, -0xe633fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    new-instance v5, Lvx;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    move-wide/from16 v16, v8

    instance-of v8, v3, Ljava/lang/Class;

    if-eqz v8, :cond_1f

    move-object v8, v3

    check-cast v8, Ljava/lang/Class;

    iput-object v8, v5, Lvx;->b:Ljava/io/Serializable;

    goto :goto_d

    :cond_1f
    iput-object v3, v5, Lvx;->c:Ljava/lang/Object;

    if-eqz v3, :cond_20

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    goto :goto_c

    :cond_20
    move-object v8, v10

    :goto_c
    iput-object v8, v5, Lvx;->b:Ljava/io/Serializable;

    :goto_d
    const-wide v8, -0xe6e4fffff835L

    invoke-static {v8, v9, v5}, LEy;->b(JLvx;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    if-nez v5, :cond_21

    goto/16 :goto_11

    :cond_21
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v8

    const-wide v18, -0xe6edfffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    check-cast v8, Landroid/view/ViewGroup;

    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v9

    const-wide v18, -0xe6a9fffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    check-cast v9, Landroid/view/ViewGroup;

    const-wide v18, -0xe565fffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v9, v6}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    if-nez v6, :cond_25

    new-instance v6, Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-direct {v6, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v21, -0xe571fffff835L

    invoke-static/range {v21 .. v22}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v10}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-virtual {v6, v11}, Landroid/widget/TextView;->setGravity(I)V

    sget-object v10, LM7;->c:Ljava/text/SimpleDateFormat;

    if-nez v10, :cond_22

    const-wide v21, -0xe57dfffff835L

    invoke-static/range {v21 .. v22}, LGu;->r(J)Ljava/lang/String;

    const/4 v10, 0x0

    :cond_22
    new-instance v11, Ljava/util/Date;

    invoke-direct {v11, v14, v15}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v10, v11}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v10, LXA;->a:Ljava/util/HashMap;

    const-wide v10, -0xe507fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    const/high16 v11, -0x1000000

    invoke-static {v11, v10}, Lhw;->a(ILjava/lang/String;)I

    move-result v10

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v10, 0x41200000    # 10.0f

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setTextSize(F)V

    instance-of v10, v9, Landroid/widget/RelativeLayout;

    const/4 v11, -0x2

    if-eqz v10, :cond_24

    const-wide v14, -0xe521fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    new-array v14, v12, [Ljava/lang/Object;

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v14, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v14

    invoke-static {v2, v10, v14}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-wide v14, -0xe529fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v10, 0x2b

    const/4 v14, 0x5

    const/4 v15, 0x7

    if-ne v2, v10, :cond_23

    invoke-virtual {v8, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v2

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    invoke-virtual {v8, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    new-instance v10, Landroid/widget/RelativeLayout;

    move/from16 v21, v12

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v12

    invoke-direct {v10, v12}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iget v12, v9, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v9, v9, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v10, v5, v12, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    new-instance v9, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v9, v11, v11}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v12

    invoke-virtual {v9, v4, v12}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v4

    invoke-virtual {v9, v15, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v4

    invoke-virtual {v9, v14, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    invoke-virtual {v10, v6, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v4, v11, v11}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v8, v10, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_f

    :cond_23
    move/from16 v21, v12

    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v2, v11, v11}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v8}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {v2, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    invoke-virtual {v8}, Landroid/view/View;->getId()I

    move-result v4

    invoke-virtual {v2, v15, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    invoke-virtual {v8}, Landroid/view/View;->getId()I

    move-result v4

    invoke-virtual {v2, v14, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    invoke-virtual {v9, v6, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_f

    :cond_24
    move/from16 v21, v12

    invoke-virtual {v9, v8}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v2

    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    invoke-virtual {v9, v8}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    new-instance v10, Landroid/widget/LinearLayout;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v10, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x1

    invoke-virtual {v10, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    iget v12, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v14, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v10, v8, v12, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-direct {v8, v4, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v5, v8, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    invoke-virtual {v10, v6, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v4, v11, v11}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v9, v10, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_f

    :cond_25
    move/from16 v21, v12

    sget-object v2, LM7;->c:Ljava/text/SimpleDateFormat;

    if-nez v2, :cond_26

    const-wide v4, -0xe5d9fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const/4 v10, 0x0

    goto :goto_e

    :cond_26
    move-object v10, v2

    :goto_e
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2, v14, v15}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v10, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_f
    sget-object v2, LJ7;->b:LJ7;

    invoke-virtual {v2}, LZk;->e()Z

    move-result v2

    if-eqz v2, :cond_28

    new-instance v2, LC2;

    const/4 v5, 0x1

    invoke-direct {v2, v5, v3}, LC2;-><init>(ILjava/lang/Object;)V

    invoke-static {v2, v1, v7}, LJ7;->f(LC2;Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_27

    move/from16 v1, v21

    goto :goto_10

    :cond_27
    const/16 v1, 0x8

    :goto_10
    invoke-virtual {v6, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_28
    :goto_11
    return-object v13

    :pswitch_16
    move-wide/from16 v16, v8

    move/from16 v21, v12

    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v4, -0xf8a8fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    :try_start_0
    iget-object v2, v1, Lqs;->c:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/Object;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    aget-object v4, v2, v21

    const/16 v19, 0x1

    aget-object v2, v2, v19

    const-wide v5, -0xf8b4fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    new-instance v6, Lvx;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    instance-of v7, v4, Ljava/lang/Class;

    if-eqz v7, :cond_29

    check-cast v4, Ljava/lang/Class;

    iput-object v4, v6, Lvx;->b:Ljava/io/Serializable;

    goto :goto_13

    :cond_29
    iput-object v4, v6, Lvx;->c:Ljava/lang/Object;

    if-eqz v4, :cond_2a

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    goto :goto_12

    :cond_2a
    const/4 v4, 0x0

    :goto_12
    iput-object v4, v6, Lvx;->b:Ljava/io/Serializable;

    :goto_13
    iput-object v3, v6, Lvx;->d:Ljava/io/Serializable;

    invoke-virtual {v6}, Lvx;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_30

    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_2b

    goto/16 :goto_14

    :cond_2b
    new-instance v4, LC2;

    const/4 v6, 0x1

    invoke-direct {v4, v6, v3}, LC2;-><init>(ILjava/lang/Object;)V

    iget-object v3, v4, LC2;->b:Ljava/lang/Object;

    check-cast v3, Landroid/widget/ImageView;

    if-nez v3, :cond_2c

    goto/16 :goto_14

    :cond_2c
    sget-object v6, LJ7;->b:LJ7;

    invoke-virtual {v6}, LZk;->e()Z

    move-result v6

    if-nez v6, :cond_2d

    move/from16 v6, v21

    invoke-virtual {v3, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_14

    :cond_2d
    move/from16 v6, v21

    invoke-static {v4, v1, v5}, LJ7;->f(LC2;Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_2f

    invoke-virtual {v3, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v3, v4, LC2;->g:Ljava/lang/Object;

    check-cast v3, Landroid/widget/TextView;

    if-eqz v3, :cond_30

    new-instance v4, LiG;

    invoke-direct {v4, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v5, -0xe764fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, LiG;->f(Ljava/lang/String;)V

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v4, v2, v1}, LiG;->c(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-wide v4, -0x9692fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v4, -0x9697fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    new-array v4, v6, [Ljava/lang/Object;

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v4, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1, v2, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-wide v4, -0x96a5fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Ljava/lang/Long;

    const-wide v4, -0x9556fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    new-array v4, v6, [Ljava/lang/Object;

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v4, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1, v2, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-wide v4, -0x955efffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Ljava/lang/Integer;

    invoke-static {v1}, LfG;->J(Ljava/lang/Object;)Lvx;

    move-result-object v2

    const-wide v4, -0x950efffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lvx;->c(Ljava/lang/String;)V

    invoke-virtual {v2}, Lvx;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v1}, LfG;->J(Ljava/lang/Object;)Lvx;

    move-result-object v2

    const-wide v4, -0x951cfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lvx;->c(Ljava/lang/String;)V

    invoke-virtual {v2}, Lvx;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v1}, LfG;->J(Ljava/lang/Object;)Lvx;

    move-result-object v4

    const-wide v5, -0x9529fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lvx;->c(Ljava/lang/String;)V

    invoke-virtual {v4}, Lvx;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-static {v1}, LfG;->J(Ljava/lang/Object;)Lvx;

    move-result-object v1

    const-wide v4, -0x9535fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lvx;->c(Ljava/lang/String;)V

    invoke-virtual {v1}, Lvx;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v2, :cond_30

    const-wide v4, -0xe76cfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x0

    invoke-static {v2, v1, v6}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_2e

    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    goto :goto_14

    :cond_2e
    const/16 v1, 0x8

    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_14

    :cond_2f
    const/4 v1, 0x4

    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v1, v4, LC2;->g:Ljava/lang/Object;

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_30

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_30
    :goto_14
    return-object v13

    :pswitch_17
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0xa160fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v2, -0xa16cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/app/Activity;

    new-instance v2, Lvx;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v1, v2, Lvx;->c:Ljava/lang/Object;

    if-eqz v1, :cond_31

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    goto :goto_15

    :cond_31
    const/4 v10, 0x0

    :goto_15
    iput-object v10, v2, Lvx;->b:Ljava/io/Serializable;

    const-class v3, Landroid/view/ViewGroup;

    iput-object v3, v2, Lvx;->d:Ljava/io/Serializable;

    invoke-virtual {v2}, Lvx;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    sget-object v3, LXA;->a:Ljava/util/HashMap;

    const-wide v3, -0xa126fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_35

    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-wide v4, -0xa1cbfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    invoke-virtual {v1, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-static {v2}, LQj;->o(Landroid/view/ViewGroup;)Landroid/view/ViewGroup;

    move-result-object v1

    if-eqz v1, :cond_32

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v7}, Landroid/view/View;->setAlpha(F)V

    :cond_32
    const-wide v3, -0xa1d0fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_34

    invoke-static {v2}, LQj;->q(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_33

    invoke-virtual {v3, v7}, Landroid/view/View;->setAlpha(F)V

    :cond_33
    invoke-static {v2}, LQj;->p(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_34

    invoke-virtual {v3, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_34
    const-wide v3, -0xa1f5fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x0

    invoke-static {v6, v1}, Lhw;->a(ILjava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_35

    const/4 v5, 0x1

    invoke-static {v2, v1, v1, v5}, Lgf;->M(Landroid/view/ViewGroup;IIZ)V

    :cond_35
    return-object v13

    :pswitch_18
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0xa42efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v2, -0xa43bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-wide v2, -0xa4f5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    const-wide v2, -0xa497fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    invoke-virtual {v1, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-wide v2, -0xa4a9fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-wide v2, -0xa4b7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-wide v2, -0xa4bffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-wide v2, -0xa367fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    const-wide v2, -0xa308fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    const-wide v2, -0xa329fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-wide v2, -0xa33bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-wide v2, -0xa3ddfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    const-wide v2, -0xa3ebfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    const-wide v2, -0xa384fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    const-wide v2, -0xa39dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    const-wide v2, -0xa3b5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    const-wide v2, -0xa24dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    const-wide v2, -0xa26dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    const-wide v2, -0xa20dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    const-wide v2, -0xa22dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    const-wide v2, -0xa2cdfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    const-wide v2, -0xa2dbfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    const-wide v2, -0xa287fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    const-wide v2, -0xa2b2fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0xa141fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    if-eqz v2, :cond_36

    const-wide v4, -0xa150fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0xa15efffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v4, v5}, LBz;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    goto :goto_16

    :cond_36
    const/4 v10, 0x0

    :goto_16
    invoke-virtual {v1, v3, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object v13

    :pswitch_19
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0xa536fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v2, -0xa5d4fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_37

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const v2, 0x550a022b

    const-class v3, Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_37
    return-object v13

    :pswitch_1a
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v2, -0xa55cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    const-wide v2, -0xa57afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    invoke-static {v1}, Lgf;->o(Landroid/view/ViewGroup;)V

    return-object v13

    :pswitch_1b
    move-object v3, v10

    move-object/from16 v1, p1

    check-cast v1, LhG;

    const-wide v8, -0xa58bfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->d:Ljava/lang/Object;

    check-cast v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object v1

    instance-of v6, v1, Landroid/view/View;

    if-eqz v6, :cond_38

    move-object v10, v1

    check-cast v10, Landroid/view/View;

    goto :goto_17

    :cond_38
    move-object v10, v3

    :goto_17
    if-nez v10, :cond_39

    goto/16 :goto_1a

    :cond_39
    const-wide v8, -0xae58fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    invoke-static {}, LNj;->y()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3a
    :goto_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object v6, v10

    check-cast v6, Landroid/view/ViewGroup;

    invoke-static {v6, v3}, Lgf;->y(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/widget/ImageView;

    move-result-object v6

    if-eqz v6, :cond_3a

    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    invoke-interface {v6}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    const-wide v8, -0xae5dfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    check-cast v6, Landroid/view/ViewGroup;

    const/4 v8, 0x0

    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    const-wide v11, -0xae19fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    check-cast v9, Landroid/view/ViewGroup;

    sget-object v11, LXA;->a:Ljava/util/HashMap;

    const-wide v11, -0xaed5fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    invoke-static {v8, v11}, Lhw;->a(ILjava/lang/String;)I

    move-result v11

    if-eqz v11, :cond_3b

    const/4 v8, 0x1

    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    const-wide v14, -0xaeeffffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    check-cast v6, Landroid/widget/TextView;

    invoke-static {v6, v11}, Lgf;->O(Landroid/widget/TextView;I)V

    :cond_3b
    const/high16 v6, 0x42200000    # 40.0f

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v9}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v8

    if-ne v8, v4, :cond_3c

    invoke-virtual {v9, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/view/View;->setAlpha(F)V

    const/4 v8, 0x1

    invoke-virtual {v9, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    invoke-virtual {v11, v7}, Landroid/view/View;->setAlpha(F)V

    const/4 v8, 0x0

    invoke-virtual {v9, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    invoke-virtual {v11, v7}, Landroid/view/View;->setAlpha(F)V

    new-instance v8, Landroid/widget/ImageView;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v11

    invoke-direct {v8, v11}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    sget-object v11, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v8, v11}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    new-instance v11, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-direct {v11, v12, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v11, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {v9, v8, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_19

    :cond_3c
    invoke-virtual {v9, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    const-wide v8, -0xaeacfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-object v8, v6

    check-cast v8, Landroid/widget/ImageView;

    :goto_19
    invoke-static {}, LNj;->y()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_3a

    invoke-virtual {v8, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_18

    :cond_3d
    :goto_1a
    return-object v13

    :pswitch_1c
    move-object/from16 v1, p1

    check-cast v1, LhG;

    const/16 v3, 0x1e

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-wide v8, -0xb069fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    iget-object v1, v1, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->c:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    const/16 v21, 0x0

    aget-object v6, v1, v21

    const/16 v19, 0x1

    aget-object v1, v1, v19

    const-wide v8, -0xb075fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v8

    const-wide v9, -0xb025fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    array-length v9, v8

    move/from16 v10, v21

    :goto_1b
    if-ge v10, v9, :cond_45

    aget-object v11, v8, v10

    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v12

    const-class v14, Landroid/widget/ImageView;

    invoke-static {v12, v14}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_43

    invoke-virtual {v11, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    const-wide v14, -0xb034fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    check-cast v11, Landroid/widget/ImageView;

    invoke-virtual {v11}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v11

    const-wide v14, -0xb0f2fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    check-cast v11, Landroid/view/ViewGroup;

    sget-object v12, LXA;->a:Ljava/util/HashMap;

    if-eqz v1, :cond_41

    const/4 v12, 0x1

    if-eq v1, v12, :cond_40

    if-eq v1, v5, :cond_3f

    if-eq v1, v4, :cond_3e

    const-wide v14, -0xbfc8fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    goto :goto_1c

    :cond_3e
    const-wide v14, -0xbf23fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    goto :goto_1c

    :cond_3f
    const-wide v14, -0xbf7efffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    goto :goto_1c

    :cond_40
    const-wide v14, -0xbf56fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    goto :goto_1c

    :cond_41
    const-wide v14, -0xb0aefffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    :goto_1c
    invoke-static {v12}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v12

    if-eqz v12, :cond_43

    invoke-virtual {v11}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v14

    const/16 v19, 0x1

    add-int/lit8 v14, v14, -0x1

    invoke-virtual {v11, v14}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v14

    invoke-virtual {v14}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v14

    const-wide v15, -0xbfedfffff835L

    invoke-static/range {v15 .. v16}, LGu;->r(J)Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_44

    invoke-virtual {v11}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v14

    move/from16 v15, v21

    :goto_1d
    if-ge v15, v14, :cond_42

    invoke-virtual {v11, v15}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v7}, Landroid/view/View;->setAlpha(F)V

    add-int/lit8 v15, v15, 0x1

    const/4 v4, 0x3

    goto :goto_1d

    :cond_42
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-wide v14, -0xbff1fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v4, v12}, Lgf;->t(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)Landroid/widget/ImageView;

    move-result-object v4

    const-wide v14, -0xbf81fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v12}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    new-instance v12, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-direct {v12, v14, v15}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v12, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {v11, v4, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1e

    :cond_43
    const/16 v19, 0x1

    :cond_44
    :goto_1e
    add-int/lit8 v10, v10, 0x1

    const/4 v4, 0x3

    goto/16 :goto_1b

    :cond_45
    return-object v13

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
