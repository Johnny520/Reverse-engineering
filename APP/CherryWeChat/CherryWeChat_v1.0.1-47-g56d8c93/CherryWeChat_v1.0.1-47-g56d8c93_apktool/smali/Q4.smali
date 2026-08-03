.class public final synthetic LQ4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, LQ4;->a:I

    iput-object p2, p0, LQ4;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    iget v1, v0, LQ4;->a:I

    const/4 v2, 0x1

    sget-object v3, LTC;->a:LTC;

    iget-object v4, v0, LQ4;->b:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v4, LEx;

    iget-object v1, v4, LEx;->j:[LCx;

    invoke-static {v4, v1}, LNj;->E(LCx;[LCx;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    return-object v1

    :pswitch_0
    check-cast v4, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;

    invoke-static {v4}, Lio/github/cherrywechat/lua/api/MessageAPI;->e(Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;)LTC;

    move-result-object v1

    return-object v1

    :pswitch_1
    check-cast v4, Lha;

    sget-object v1, LEA;->a:LEA;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->i()Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v4, Lha;->i:Ljava/lang/Object;

    iget-object v1, v4, Lha;->d:Landroid/widget/EditText;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    const-wide v1, -0x4bbffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-virtual {v4, v1}, Lha;->e(Ljava/lang/String;)V

    return-object v3

    :pswitch_2
    check-cast v4, Ljava/util/ArrayList;

    invoke-static {v4}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->u(Ljava/util/ArrayList;)LTC;

    move-result-object v1

    return-object v1

    :pswitch_3
    check-cast v4, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;

    invoke-static {v4}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->o(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;)LTC;

    move-result-object v1

    return-object v1

    :pswitch_4
    check-cast v4, Landroid/view/View;

    sget-object v1, Lg8;->b:Lg8;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const-wide v6, -0xec2efffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    invoke-static {}, Lg8;->m()Z

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v6, :cond_d

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    sget-object v10, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v10, -0xed7cfffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    const-wide v11, -0xed13fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, LNx;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v11

    if-lez v11, :cond_b

    iget v11, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    :try_start_0
    new-instance v12, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v12}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput-boolean v2, v12, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-static {v10, v12}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    iget v13, v12, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-lez v13, :cond_3

    iget v14, v12, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-gtz v14, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v13, v14, v11, v6}, Lg8;->f(IIII)I

    move-result v6

    iput v6, v12, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    iput-boolean v7, v12, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-static {v10, v12}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v13, :cond_4

    :catchall_0
    :cond_3
    :goto_0
    move-object v13, v9

    goto :goto_2

    :cond_4
    :try_start_1
    new-instance v6, Landroid/media/ExifInterface;

    invoke-direct {v6, v10}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    const-wide v10, -0xecfafffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v10, v2}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I

    move-result v2

    const/4 v6, 0x3

    if-eq v2, v6, :cond_7

    const/4 v6, 0x6

    if-eq v2, v6, :cond_6

    const/16 v6, 0x8

    if-eq v2, v6, :cond_5

    move v2, v8

    goto :goto_1

    :cond_5
    const/high16 v2, 0x43870000    # 270.0f

    goto :goto_1

    :cond_6
    const/high16 v2, 0x42b40000    # 90.0f

    goto :goto_1

    :cond_7
    const/high16 v2, 0x43340000    # 180.0f

    :goto_1
    cmpg-float v6, v2, v8

    if-nez v6, :cond_8

    goto :goto_2

    :cond_8
    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v6, v2}, Landroid/graphics/Matrix;->postRotate(F)Z

    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v16

    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v17

    const/16 v19, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v18, v6

    invoke-static/range {v13 .. v19}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v2

    const-wide v10, -0xec86fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v2, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    invoke-virtual {v13}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_9
    move-object v13, v2

    :catchall_1
    :goto_2
    if-nez v13, :cond_a

    :goto_3
    move-object v2, v9

    goto/16 :goto_6

    :cond_a
    new-instance v2, Landroid/widget/ImageView;

    invoke-direct {v2, v5}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    sget-object v5, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    invoke-virtual {v2, v13}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    invoke-virtual {v2, v7}, Landroid/view/View;->setClickable(Z)V

    const-wide v5, -0xec3efffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_b
    invoke-static {}, Lg8;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v10

    if-nez v10, :cond_c

    goto :goto_3

    :cond_c
    new-instance v10, Landroid/widget/ImageView;

    invoke-direct {v10, v5}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    sget-object v5, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v10, v5}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    invoke-virtual {v10, v7}, Landroid/view/View;->setClickable(Z)V

    const-wide v11, -0xecd2fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v10, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    iget v5, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    new-instance v11, Ljava/lang/Thread;

    new-instance v12, Lc8;

    invoke-direct {v12, v2, v5, v6, v10}, Lc8;-><init>(Ljava/lang/String;IILandroid/widget/ImageView;)V

    invoke-direct {v11, v12}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v11}, Ljava/lang/Thread;->start()V

    :goto_4
    move-object v2, v10

    goto :goto_6

    :cond_d
    sget-object v6, Lg8;->c:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v10

    if-nez v10, :cond_e

    goto :goto_3

    :cond_e
    new-instance v10, Lry;

    invoke-direct {v10, v5}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    iput-boolean v7, v10, Lry;->c:Z

    invoke-virtual {v10, v10}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    invoke-virtual {v10, v2}, Landroid/view/View;->setKeepScreenOn(Z)V

    invoke-virtual {v1}, LZk;->e()Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-static {}, Lg8;->m()Z

    move-result v5

    if-nez v5, :cond_f

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_f

    sget-object v5, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v11, -0xedd1fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v7}, LNx;->a(Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_f

    goto :goto_5

    :cond_f
    move v2, v7

    :goto_5
    invoke-virtual {v10, v2}, Lry;->setPlayWithSound(Z)V

    invoke-virtual {v10, v6}, Lry;->setVideoPath(Ljava/lang/String;)V

    const-wide v5, -0xece6fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_4

    :goto_6
    if-nez v2, :cond_10

    goto/16 :goto_b

    :cond_10
    invoke-virtual {v1}, Lg8;->j()Z

    move-result v1

    const/4 v5, -0x1

    if-eqz v1, :cond_1e

    sget-object v1, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v10, -0xed2ffffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, LNx;->a(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1e

    move-object v1, v4

    :cond_11
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v6, v1, Landroid/view/View;

    if-eqz v6, :cond_12

    check-cast v1, Landroid/view/View;

    goto :goto_7

    :cond_12
    move-object v1, v9

    :goto_7
    if-nez v1, :cond_14

    :cond_13
    move-object v1, v9

    goto :goto_8

    :cond_14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    const-wide v10, -0xec98fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v6, v1, Landroid/view/ViewGroup;

    if-eqz v6, :cond_13

    check-cast v1, Landroid/view/ViewGroup;

    :goto_8
    if-nez v1, :cond_18

    move-object v1, v4

    :goto_9
    if-eqz v1, :cond_17

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v6

    const v10, 0x1020002

    if-ne v6, v10, :cond_15

    instance-of v6, v1, Landroid/view/ViewGroup;

    if-eqz v6, :cond_15

    check-cast v1, Landroid/view/ViewGroup;

    goto :goto_a

    :cond_15
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v6, v1, Landroid/view/View;

    if-eqz v6, :cond_16

    check-cast v1, Landroid/view/View;

    goto :goto_9

    :cond_16
    move-object v1, v9

    goto :goto_9

    :cond_17
    move-object v1, v9

    :cond_18
    :goto_a
    if-eqz v1, :cond_1a

    invoke-virtual {v4, v8}, Landroid/view/View;->setAlpha(F)V

    invoke-static {v4, v1}, Lg8;->h(Landroid/view/View;Landroid/view/ViewGroup;)V

    invoke-static {v1}, Lg8;->k(Landroid/view/ViewGroup;)Z

    move-result v6

    if-nez v6, :cond_19

    new-instance v6, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v6, v5, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2, v7, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    :cond_19
    new-instance v1, Ld8;

    invoke-direct {v1, v4, v7}, Ld8;-><init>(Landroid/view/View;I)V

    invoke-virtual {v4, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_b

    :cond_1a
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v6, v1, Landroid/view/ViewGroup;

    if-eqz v6, :cond_1b

    move-object v9, v1

    check-cast v9, Landroid/view/ViewGroup;

    :cond_1b
    if-nez v9, :cond_1c

    goto :goto_b

    :cond_1c
    invoke-virtual {v4, v8}, Landroid/view/View;->setAlpha(F)V

    invoke-static {v4, v9}, Lg8;->h(Landroid/view/View;Landroid/view/ViewGroup;)V

    invoke-static {v9}, Lg8;->k(Landroid/view/ViewGroup;)Z

    move-result v1

    if-nez v1, :cond_1d

    invoke-virtual {v9, v2, v5, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    :cond_1d
    new-instance v1, Ld8;

    invoke-direct {v1, v4, v7}, Ld8;-><init>(Landroid/view/View;I)V

    invoke-virtual {v4, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_b

    :cond_1e
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v4, v1, Landroid/view/ViewGroup;

    if-eqz v4, :cond_1f

    move-object v9, v1

    check-cast v9, Landroid/view/ViewGroup;

    :cond_1f
    if-nez v9, :cond_20

    goto :goto_b

    :cond_20
    invoke-static {v9}, Lg8;->k(Landroid/view/ViewGroup;)Z

    move-result v1

    if-nez v1, :cond_21

    invoke-virtual {v9, v2, v5, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    :cond_21
    :goto_b
    return-object v3

    :pswitch_5
    check-cast v4, [Ljava/lang/Object;

    new-instance v1, Lx;

    invoke-direct {v1, v2, v4}, Lx;-><init>(ILjava/lang/Object;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
