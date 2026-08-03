.class public final Lc0/H1;
.super Lde/robv/android/xposed/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lc0/J1;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc0/H1;->b:I

    packed-switch p1, :pswitch_data_0

    sget-object p1, Lc0/J1;->a:Lc0/J1;

    iput-object p1, p0, Lc0/H1;->c:Lc0/J1;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_0
    sget-object p1, Lc0/J1;->a:Lc0/J1;

    iput-object p1, p0, Lc0/H1;->c:Lc0/J1;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_1
    sget-object p1, Lc0/J1;->a:Lc0/J1;

    iput-object p1, p0, Lc0/H1;->c:Lc0/J1;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_2
    sget-object p1, Lc0/J1;->a:Lc0/J1;

    iput-object p1, p0, Lc0/H1;->c:Lc0/J1;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_3
    sget-object p1, Lc0/J1;->a:Lc0/J1;

    iput-object p1, p0, Lc0/H1;->c:Lc0/J1;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_4
    sget-object p1, Lc0/J1;->a:Lc0/J1;

    iput-object p1, p0, Lc0/H1;->c:Lc0/J1;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Lde/robv/android/xposed/b;)V
    .locals 12

    const-string v0, "args"

    const-string v1, "thisObject"

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    iget v5, p0, Lc0/H1;->b:I

    packed-switch v5, :pswitch_data_0

    :pswitch_0
    return-void

    :pswitch_1
    sget-object v0, Lc0/B1;->a:Lc0/B1;

    invoke-virtual {v0}, Lc0/B1;->e()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lde/robv/android/xposed/b;->e:Ljava/lang/Object;

    instance-of v3, v0, Ljava/lang/Boolean;

    if-eqz v3, :cond_1

    move-object v4, v0

    check-cast v4, Ljava/lang/Boolean;

    :cond_1
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :cond_2
    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lc0/H1;->c:Lc0/J1;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lc0/J1;->b(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_4

    sget-object v0, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {}, Lc0/G1;->z()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    sget-object v2, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v0}, Lc0/G1;->B(Landroid/app/Activity;)V

    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {p1, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lc0/J1;->a(Ljava/lang/Object;)V

    const-string p1, "NewChattingTabUI.f restore"

    invoke-static {p1}, Lc0/J1;->c(Ljava/lang/String;)V

    :goto_0
    return-void

    :pswitch_2
    sget-object v3, Lc0/B1;->a:Lc0/B1;

    invoke-virtual {v3}, Lc0/B1;->e()Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_1

    :cond_5
    iget-object v3, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v3, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/Integer;

    if-eqz v2, :cond_6

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    :cond_6
    if-nez v4, :cond_7

    goto :goto_1

    :cond_7
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_1

    :cond_8
    iget-object v0, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lc0/H1;->c:Lc0/J1;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lc0/J1;->b(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_9

    sget-object v0, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {}, Lc0/G1;->z()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_9

    goto :goto_1

    :cond_9
    sget-object v2, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v0}, Lc0/G1;->v(Landroid/app/Activity;)V

    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {p1, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lc0/J1;->a(Ljava/lang/Object;)V

    const-string p1, "NewChattingTabUI.q reveal after"

    invoke-static {p1}, Lc0/J1;->c(Ljava/lang/String;)V

    :goto_1
    return-void

    :pswitch_3
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_a

    move-object v4, p1

    check-cast v4, Landroid/app/Activity;

    :cond_a
    if-nez v4, :cond_b

    goto :goto_4

    :cond_b
    sget-object p1, Lc0/B1;->a:Lc0/B1;

    invoke-virtual {p1}, Lc0/B1;->e()Z

    move-result p1

    if-nez p1, :cond_c

    goto :goto_4

    :cond_c
    sget-object p1, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v4}, Lc0/G1;->q(Landroid/app/Activity;)Z

    move-result p1

    if-nez p1, :cond_d

    goto :goto_4

    :cond_d
    :try_start_0
    invoke-static {v4}, Lc0/G1;->q(Landroid/app/Activity;)Z

    move-result p1

    if-nez p1, :cond_e

    invoke-static {v4}, Lc0/G1;->l(Landroid/app/Activity;)V

    goto :goto_2

    :cond_e
    invoke-static {v4}, Lc0/G1;->x(Landroid/app/Activity;)V

    invoke-static {v4}, Lc0/G1;->a(Landroid/app/Activity;)Z

    :goto_2
    sget-object p1, LD0/l;->a:LD0/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    invoke-static {p1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object p1

    :goto_3
    invoke-static {p1}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "resume: "

    invoke-static {v0, p1}, LS/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lc0/H1;->c:Lc0/J1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/J1;->c(Ljava/lang/String;)V

    :cond_f
    :goto_4
    return-void

    :pswitch_4
    const-string v1, "theme_wallpaper_enabled"

    const-string v5, "/storage/emulated/0/Android/media/com.tencent.mm/OKK"

    iget-object v6, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v6, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v6}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Ljava/lang/Integer;

    if-eqz v7, :cond_10

    check-cast v6, Ljava/lang/Integer;

    goto :goto_5

    :cond_10
    move-object v6, v4

    :goto_5
    if-nez v6, :cond_11

    goto/16 :goto_11

    :cond_11
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const v7, 0xa0c11

    if-eq v6, v7, :cond_12

    goto/16 :goto_11

    :cond_12
    iget-object v6, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v6, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x1

    invoke-static {v7, v6}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    instance-of v8, v6, Ljava/lang/Integer;

    if-eqz v8, :cond_13

    check-cast v6, Ljava/lang/Integer;

    goto :goto_6

    :cond_13
    move-object v6, v4

    :goto_6
    if-nez v6, :cond_14

    goto/16 :goto_11

    :cond_14
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/4 v8, -0x1

    if-eq v6, v8, :cond_15

    goto/16 :goto_11

    :cond_15
    iget-object v6, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v6, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v6}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v6, v0, Landroid/content/Intent;

    if-eqz v6, :cond_16

    check-cast v0, Landroid/content/Intent;

    goto :goto_7

    :cond_16
    move-object v0, v4

    :goto_7
    if-eqz v0, :cond_22

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_17

    goto/16 :goto_11

    :cond_17
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v6, p1, Landroid/app/Activity;

    if-eqz v6, :cond_18

    check-cast p1, Landroid/app/Activity;

    goto :goto_8

    :cond_18
    move-object p1, v4

    :goto_8
    if-nez p1, :cond_19

    goto/16 :goto_11

    :cond_19
    sget-object v6, Lc0/B1;->a:Lc0/B1;

    :try_start_1
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v8

    if-nez v8, :cond_1a

    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    goto :goto_9

    :catchall_1
    move-exception v0

    goto/16 :goto_f

    :cond_1a
    :goto_9
    new-instance v6, Ljava/io/File;

    const-string v8, "theme_wallpaper.jpg"

    invoke-direct {v6, v5, v8}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    invoke-virtual {v5, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v0, :cond_20

    :try_start_2
    new-instance v5, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v8

    const/16 v9, 0x2000

    invoke-static {v9, v8}, Ljava/lang/Math;->max(II)I

    move-result v8

    invoke-direct {v5, v8}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    invoke-static {v0, v5, v9}, LA0/p;->t(Ljava/io/InputStream;Ljava/io/OutputStream;I)J

    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v5

    const-string v8, "toByteArray(...)"

    invoke-static {v5, v8}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v8}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput-boolean v7, v8, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    array-length v9, v5

    invoke-static {v5, v2, v9, v8}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    iget v9, v8, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v8, v8, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    move v10, v7

    :goto_a
    const/16 v11, 0x5a0

    if-gt v9, v11, :cond_1f

    if-le v8, v11, :cond_1b

    goto/16 :goto_c

    :cond_1b
    if-ge v10, v7, :cond_1c

    move v10, v7

    :cond_1c
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput v10, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    array-length v8, v5

    invoke-static {v5, v2, v8, v3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-nez v3, :cond_1d

    :try_start_3
    invoke-static {v0, v4}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_e

    :cond_1d
    :try_start_4
    new-instance v5, Ljava/io/FileOutputStream;

    invoke-direct {v5, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    sget-object v8, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v9, 0x58

    invoke-virtual {v3, v8, v9, v5}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :try_start_6
    invoke-static {v5, v4}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    sget-object v5, Lc0/B1;->h:Landroid/graphics/Bitmap;

    if-eq v3, v5, :cond_1e

    sput-object v3, Lc0/B1;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lc0/B1;->i:Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_b

    :catchall_2
    move-exception v2

    goto :goto_d

    :cond_1e
    :goto_b
    :try_start_7
    invoke-static {v0, v4}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lc0/h1;->a:Lc0/h1;

    const-string v4, "theme_wallpaper_path"

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    const-string v8, "getAbsolutePath(...)"

    invoke-static {v5, v8}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4, v5, v2}, Lc0/h1;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v3, v1, v7, v2}, Lc0/h1;->g(Ljava/lang/String;ZZ)V

    const-string v4, "theme_wallpaper_updated"

    invoke-virtual {v3, v4, v0, v2}, Lc0/h1;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    sput-boolean v7, Lc0/B1;->d:Z

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lc0/B1;->f:Ljava/lang/String;

    sput-object v0, Lc0/B1;->g:Ljava/lang/String;

    sput-object v0, Lc0/B1;->j:Ljava/lang/String;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    sput-wide v2, Lc0/B1;->c:J

    invoke-static {}, Lc0/B1;->f()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    move v2, v7

    goto :goto_e

    :catchall_3
    move-exception v2

    :try_start_8
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :catchall_4
    move-exception v3

    :try_start_9
    invoke-static {v5, v2}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3

    :cond_1f
    :goto_c
    mul-int/2addr v10, v3

    div-int/2addr v9, v3

    div-int/2addr v8, v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    goto :goto_a

    :goto_d
    :try_start_a
    throw v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    :catchall_5
    move-exception v3

    :try_start_b
    invoke-static {v0, v2}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3

    :cond_20
    :goto_e
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    goto :goto_10

    :goto_f
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_10
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v3, v0, LD0/f;

    if-eqz v3, :cond_21

    move-object v0, v2

    :cond_21
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v2, p0, Lc0/H1;->c:Lc0/J1;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "pick ok="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Lc0/J1;->c(Ljava/lang/String;)V

    if-eqz v0, :cond_22

    sget-object v0, Lc0/B1;->a:Lc0/B1;

    sget-object v0, Lc0/h1;->a:Lc0/h1;

    invoke-virtual {v0, v1, v7, v7}, Lc0/h1;->g(Ljava/lang/String;ZZ)V

    sput-boolean v7, Lc0/B1;->d:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    sput-wide v0, Lc0/B1;->c:J

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_22

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_22

    new-instance v0, LA0/d;

    invoke-direct {v0}, LA0/d;-><init>()V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_22
    :goto_11
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public b(Lde/robv/android/xposed/b;)V
    .locals 6

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, "thisObject"

    iget-object v4, p0, Lc0/H1;->c:Lc0/J1;

    iget v5, p0, Lc0/H1;->b:I

    packed-switch v5, :pswitch_data_0

    return-void

    :pswitch_0
    sget-object v0, Lc0/B1;->a:Lc0/B1;

    invoke-virtual {v0}, Lc0/B1;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {v0, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lc0/J1;->b(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {}, Lc0/G1;->z()Landroid/app/Activity;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_1

    sget-object v1, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v0}, Lc0/G1;->t(Landroid/app/Activity;)V

    :cond_1
    iget-object v0, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {v0, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lc0/J1;->a(Ljava/lang/Object;)V

    iget-object p1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v0, p1, v2

    :cond_2
    return-void

    :pswitch_1
    sget-object v0, Lc0/B1;->a:Lc0/B1;

    invoke-virtual {v0}, Lc0/B1;->e()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const-string v5, "args"

    invoke-static {v0, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v0}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/Integer;

    if-eqz v2, :cond_4

    move-object v1, v0

    check-cast v1, Ljava/lang/Integer;

    :cond_4
    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_0

    :cond_6
    iget-object v0, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {v0, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lc0/J1;->b(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_7

    sget-object v0, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {}, Lc0/G1;->z()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    sget-object v1, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v0}, Lc0/G1;->v(Landroid/app/Activity;)V

    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {p1, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lc0/J1;->a(Ljava/lang/Object;)V

    const-string p1, "NewChattingTabUI.q reveal before"

    invoke-static {p1}, Lc0/J1;->c(Ljava/lang/String;)V

    :goto_0
    return-void

    :pswitch_2
    sget-object v1, Lc0/B1;->a:Lc0/B1;

    invoke-virtual {v1}, Lc0/B1;->e()Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_1

    :cond_8
    iget-object v1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {v1, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lc0/J1;->b(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v1

    if-nez v1, :cond_9

    sget-object v1, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {}, Lc0/G1;->z()Landroid/app/Activity;

    move-result-object v1

    if-nez v1, :cond_9

    goto :goto_1

    :cond_9
    sget-object v2, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v1}, Lc0/G1;->u(Landroid/app/Activity;)V

    iget-object p1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v1, p1, v0

    const-string p1, "NewChattingTabUI.r snapshot noAnim"

    invoke-static {p1}, Lc0/J1;->c(Ljava/lang/String;)V

    :goto_1
    return-void

    :pswitch_3
    sget-object v2, Lc0/B1;->a:Lc0/B1;

    invoke-virtual {v2}, Lc0/B1;->e()Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_2

    :cond_a
    iget-object v2, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v3, v2, Landroid/app/Activity;

    if-eqz v3, :cond_b

    move-object v1, v2

    check-cast v1, Landroid/app/Activity;

    :cond_b
    if-nez v1, :cond_c

    goto :goto_2

    :cond_c
    sget-object v2, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v1}, Lc0/G1;->u(Landroid/app/Activity;)V

    iget-object p1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v1, p1, v0

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "LauncherUI.startChatting snapshot noAnim"

    invoke-static {p1}, Lc0/J1;->c(Ljava/lang/String;)V

    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
