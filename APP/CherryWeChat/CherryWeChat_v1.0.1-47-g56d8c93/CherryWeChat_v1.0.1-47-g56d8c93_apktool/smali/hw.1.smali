.class public Lhw;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LYg;
.implements Lkc;
.implements Lrx;
.implements Lbs;


# static fields
.field public static b:Lhw;

.field public static c:Lhw;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lhw;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;I)V
    .locals 1

    iput p2, p0, Lhw;->a:I

    packed-switch p2, :pswitch_data_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 3
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1e

    if-lt p2, v0, :cond_0

    .line 5
    new-instance p2, LDy;

    const/4 v0, 0x7

    .line 6
    invoke-direct {p2, p1, v0}, Lhw;-><init>(Landroid/view/View;I)V

    goto :goto_0

    .line 7
    :cond_0
    new-instance p2, Lhw;

    const/4 v0, 0x7

    invoke-direct {p2, p1, v0}, Lhw;-><init>(Landroid/view/View;I)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public static a(ILjava/lang/String;)I
    .locals 2

    const-wide v0, -0x2d000fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->b()LCA;

    move-result-object v0

    iget-boolean v0, v0, LCA;->j:Z

    if-eqz v0, :cond_4

    invoke-static {}, Lhw;->h()Z

    move-result v0

    if-eqz v0, :cond_4

    const-wide v0, -0x2d005fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-wide v0, -0x2d023fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-wide v0, -0x2d03ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x3bc40fc1

    if-eq v0, v1, :cond_2

    const v1, 0x1f056ad7

    if-eq v0, v1, :cond_1

    const v1, 0x427219e3    # 60.52528f

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-wide v0, -0x2d0c7fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_1
    const-wide v0, -0x2d0e1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_2
    const-wide v0, -0x2d083fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p0, -0x1

    return p0

    :cond_4
    :goto_1
    sget-object v0, LXA;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    :cond_5
    return p0
.end method

.method public static b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 14

    const/16 v0, 0x20

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-eqz p0, :cond_d

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_6

    :cond_0
    sget-object v1, Lio/github/cherrywechat/application/MainApplication;->a:Lio/github/cherrywechat/application/MainApplication;

    const-wide v2, -0x2f91cfffff835L

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v1, Lgf;->p:Landroid/app/Application;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {}, Landroid/app/AndroidAppHelper;->currentApplication()Landroid/app/Application;

    move-result-object v1

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    :goto_0
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-wide v4, -0x2f934fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    invoke-static {}, Lhw;->h()Z

    move-result v6

    const/16 v7, 0x2f

    const/4 v8, 0x1

    if-eqz v6, :cond_5

    invoke-static {p0, v7}, Ltz;->V(Ljava/lang/String;C)I

    move-result v9

    if-ltz v9, :cond_3

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    add-int/2addr v9, v8

    const/4 v11, 0x0

    invoke-virtual {p0, v11, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    const-wide v12, -0x2d1fbfffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    const-wide v12, -0x2d18afffff835L

    invoke-static {v10, v11, v12, v13}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    invoke-virtual {p0, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    const-wide v11, -0x2d190fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    goto :goto_1

    :cond_3
    const-wide v9, -0x2d19ffffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    :goto_1
    invoke-static {v9}, Lhw;->e(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    invoke-static {v1, v9, v10, v11}, Lio/github/cherrywechat/theme/ThemeProvider;->getDrawableForSize(Landroid/content/res/Resources;Ljava/lang/String;II)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    goto :goto_2

    :cond_4
    invoke-static {v1, v9}, Lio/github/cherrywechat/theme/ThemeProvider;->getDrawable(Landroid/content/res/Resources;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    :goto_2
    if-eqz v9, :cond_5

    return-object v9

    :cond_5
    invoke-static {p0}, Lhw;->e(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v0

    invoke-static {v1, p0, v9, v0}, Lio/github/cherrywechat/theme/ThemeProvider;->getDrawableForSize(Landroid/content/res/Resources;Ljava/lang/String;II)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_3

    :cond_6
    invoke-static {v1, p0}, Lio/github/cherrywechat/theme/ThemeProvider;->getDrawable(Landroid/content/res/Resources;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :goto_3
    if-nez v0, :cond_7

    goto/16 :goto_6

    :cond_7
    sget-object v1, LEA;->a:LEA;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->b()LCA;

    move-result-object v1

    iget-boolean v1, v1, LCA;->j:Z

    if-eqz v1, :cond_c

    if-eqz v6, :cond_c

    invoke-static {p0, v7}, Ltz;->c0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    const-wide v6, -0x2d1a5fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    const/high16 v1, -0x40000000    # -2.0f

    goto :goto_4

    :cond_8
    const/high16 v1, 0x20000000

    :goto_4
    invoke-static {p0}, Lhw;->e(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_b

    const-wide v6, -0x2d1a9fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p0

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-virtual {p0, v0, v8}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object p0

    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, p0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v1, Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {v6}, Landroid/graphics/Paint;->getColor()I

    move-result v7

    sget-object v8, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v7, v8}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, v1, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    sget-object v0, Lio/github/cherrywechat/application/MainApplication;->a:Lio/github/cherrywechat/application/MainApplication;

    if-eqz v0, :cond_9

    goto :goto_5

    :cond_9
    sget-object v0, Lgf;->p:Landroid/app/Application;

    if-eqz v0, :cond_a

    goto :goto_5

    :cond_a
    invoke-static {}, Landroid/app/AndroidAppHelper;->currentApplication()Landroid/app/Application;

    move-result-object v0

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    :goto_5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v1, v0, p0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    return-object v1

    :cond_b
    new-instance p0, Landroid/graphics/PorterDuffColorFilter;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p0, v1, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_c
    return-object v0

    :cond_d
    :goto_6
    const/4 p0, 0x0

    return-object p0
.end method

.method public static c(FFFF)Landroid/graphics/Path;
    .locals 1

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    invoke-virtual {v0, p0, p1}, Landroid/graphics/Path;->moveTo(FF)V

    invoke-virtual {v0, p2, p3}, Landroid/graphics/Path;->lineTo(FF)V

    return-object v0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-wide v0, -0x2d077fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2d07cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LXA;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    return-object p0
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 4

    const-wide v0, -0x2d1e9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide v2, -0x2d1f3fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v1}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide v2, -0x2d1f7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v1}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    return v1
.end method

.method public static f(Landroid/content/Context;)Z
    .locals 2

    const-wide v0, -0x2d1d7fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p0, p0, 0x30

    const/16 v0, 0x20

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static h()Z
    .locals 3

    sget-object v0, Lio/github/cherrywechat/application/MainApplication;->a:Lio/github/cherrywechat/application/MainApplication;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lgf;->p:Landroid/app/Application;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Landroid/app/AndroidAppHelper;->currentApplication()Landroid/app/Application;

    move-result-object v0

    const-wide v1, -0x2f91cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    :goto_0
    invoke-static {v0}, Lhw;->f(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public g()Ljava/lang/Object;
    .locals 2

    :try_start_0
    new-instance v0, LYw;

    const-string v1, "SHA-256"

    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    invoke-direct {v0, v1}, LYw;-><init>(Ljava/security/MessageDigest;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public onScrollLimit(IIIZ)V
    .locals 0

    return-void
.end method

.method public onScrollProgress(IIII)V
    .locals 0

    return-void
.end method

.method public p(Lqs;)Las;
    .locals 3

    iget v0, p0, Lhw;->a:I

    sparse-switch v0, :sswitch_data_0

    new-instance v0, LpD;

    const-class v1, LYj;

    const-class v2, Ljava/io/InputStream;

    invoke-virtual {p1, v1, v2}, Lqs;->j(Ljava/lang/Class;Ljava/lang/Class;)Las;

    move-result-object p1

    invoke-direct {v0, p1}, LpD;-><init>(Las;)V

    return-object v0

    :sswitch_0
    new-instance v0, Lpz;

    const-class v1, LYj;

    const-class v2, Ljava/io/InputStream;

    invoke-virtual {p1, v1, v2}, Lqs;->j(Ljava/lang/Class;Ljava/lang/Class;)Las;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lpz;-><init>(Las;I)V

    return-object v0

    :sswitch_1
    new-instance v0, Lpz;

    const-class v1, Landroid/net/Uri;

    const-class v2, Ljava/io/InputStream;

    invoke-virtual {p1, v1, v2}, Lqs;->j(Ljava/lang/Class;Ljava/lang/Class;)Las;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lpz;-><init>(Las;I)V

    return-object v0

    :sswitch_2
    new-instance v0, Lpz;

    const-class v1, Landroid/net/Uri;

    const-class v2, Landroid/os/ParcelFileDescriptor;

    invoke-virtual {p1, v1, v2}, Lqs;->j(Ljava/lang/Class;Ljava/lang/Class;)Las;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lpz;-><init>(Las;I)V

    return-object v0

    :sswitch_3
    new-instance v0, Lpz;

    const-class v1, Landroid/net/Uri;

    const-class v2, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {p1, v1, v2}, Lqs;->j(Ljava/lang/Class;Ljava/lang/Class;)Las;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lpz;-><init>(Las;I)V

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_3
        0xa -> :sswitch_2
        0xb -> :sswitch_1
        0x11 -> :sswitch_0
    .end sparse-switch
.end method
