.class public final LMw;
.super LZk;
.source ""


# static fields
.field public static final b:LMw;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const-wide v0, -0xfccfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, LMw;

    new-instance v1, LZz;

    const-wide v2, -0x72fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x77fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x8fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v6, -0xdfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    const/16 v8, 0x64

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, LZz;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lvx;I)V

    invoke-direct {v0, v1}, LZk;-><init>(LZz;)V

    sput-object v0, LMw;->b:LMw;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    invoke-virtual {p0}, LZk;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v1, -0x2e829fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LbG;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, LbG;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    instance-of v2, v0, Ljava/lang/reflect/Method;

    if-eqz v2, :cond_1

    move-object v1, v0

    check-cast v1, Ljava/lang/reflect/Method;

    :cond_1
    new-instance v0, LTp;

    const/16 v2, 0x16

    invoke-direct {v0, v2}, LTp;-><init>(I)V

    const-wide v2, -0x20d85fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x20d8cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, LiG;->b(Lfj;)V

    const-wide v0, -0xe1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x20df5fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    new-instance v1, LiG;

    sget v2, LgG;->a:I

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v1, v0}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v2, -0x83fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, LiG;->f(Ljava/lang/String;)V

    new-instance v0, LTp;

    const/16 v2, 0x17

    invoke-direct {v0, v2}, LTp;-><init>(I)V

    invoke-virtual {v1, v0}, LiG;->a(Lfj;)V

    :cond_2
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    const-wide v0, -0x14fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 12

    const-wide v0, -0x24fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-super {p0, p1}, LZk;->d(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    sget-object v2, LMw;->b:LMw;

    invoke-virtual {v2}, LZk;->e()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/16 v2, 0x8

    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v2, 0x10

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x1

    const/4 v5, -0x2

    invoke-direct {v2, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v2, 0x28

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    const/4 v4, 0x0

    :try_start_0
    invoke-static {}, Lgf;->H()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    instance-of v7, v6, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v7, :cond_1

    check-cast v6, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v6}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v6

    goto :goto_2

    :cond_1
    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v7

    const/4 v8, 0x1

    if-ge v7, v8, :cond_2

    move v7, v8

    :cond_2
    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v9

    if-ge v9, v8, :cond_3

    goto :goto_1

    :cond_3
    move v8, v9

    :goto_1
    sget-object v9, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v7, v8, v9}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v9

    new-instance v10, Landroid/graphics/Canvas;

    invoke-direct {v10, v9}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v6, v3, v3, v7, v8}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {v6, v10}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v6, v9

    goto :goto_2

    :catch_0
    move-object v6, v4

    :goto_2
    new-instance v7, Landroid/widget/ImageView;

    invoke-direct {v7, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v8, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    invoke-virtual {v8, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    const/16 v2, 0xc

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    invoke-virtual {v8, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v7, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v7, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    sget-object v2, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v8, -0x2cfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v8, -0x2fbeefffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    sget-object v8, LNx;->a:Landroid/content/SharedPreferences;

    const/16 v9, 0x64

    invoke-interface {v8, v2, v9}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v8

    if-eqz v8, :cond_4

    goto :goto_3

    :cond_4
    invoke-static {v6, v2}, LDc;->m(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_5
    :goto_3
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v8, Lxx;

    invoke-direct {v8, p1}, Lxx;-><init>(Landroid/content/Context;)V

    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {p1, v3, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v5, 0x3f800000    # 1.0f

    iput v5, p1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    invoke-virtual {v8, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const-wide v10, -0xc4fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v8, p1}, Lxx;->setKey(Ljava/lang/String;)V

    const-wide v10, -0xdcfffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v8, p1}, Lxx;->setTitle(Ljava/lang/String;)V

    invoke-virtual {v8, v9}, Lxx;->setMax(I)V

    invoke-virtual {v8, v2}, Lxx;->setProgress(I)V

    new-instance p1, LTp;

    const/16 v2, 0x18

    invoke-direct {p1, v2}, LTp;-><init>(I)V

    invoke-virtual {v8, p1}, Lxx;->setValueFormatter(Lfj;)V

    new-instance p1, Lmk;

    const/4 v2, 0x3

    invoke-direct {p1, v2, v7, v6}, Lmk;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, p1}, Lxx;->setOnValueChangedListener(Lfj;)V

    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    instance-of v2, p1, LaA;

    if-eqz v2, :cond_6

    move-object v4, p1

    check-cast v4, LaA;

    :cond_6
    if-eqz v4, :cond_7

    new-instance p1, Ls;

    const/4 v2, 0x5

    invoke-direct {p1, v2, v0}, Ls;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v4, p1}, LaA;->setOnCheckedChangeListener(Lfj;)V

    :cond_7
    return-object v1
.end method
