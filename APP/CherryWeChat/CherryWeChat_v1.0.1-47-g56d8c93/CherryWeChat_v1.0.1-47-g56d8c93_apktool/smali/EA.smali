.class public final LEA;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:LEA;

.field public static b:Ljava/lang/String;

.field public static c:Ljava/lang/String;

.field public static d:J

.field public static final e:Ljava/util/ArrayList;

.field public static final f:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-wide v0, -0x2d2b7fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2d145fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2d14ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2d156fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, LEA;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LEA;->a:LEA;

    const-wide v0, -0x2d158fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LEA;->b:Ljava/lang/String;

    const-wide v0, -0x2d159fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LEA;->c:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, LEA;->e:Ljava/util/ArrayList;

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
    const-wide v1, -0x2d15afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    sput-object v0, LEA;->f:Landroid/content/SharedPreferences;

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 3

    const-wide v0, -0x2d3f8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x2d382fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    sget-object v2, LEA;->f:Landroid/content/SharedPreferences;

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide v0, -0x2d384fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public static b()LCA;
    .locals 4

    invoke-static {}, LEA;->a()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x2d257fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, LEA;->d()LCA;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, LEA;->i()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LCA;

    iget-object v3, v3, LCA;->a:Ljava/lang/String;

    invoke-static {v3, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    check-cast v2, LCA;

    if-nez v2, :cond_3

    invoke-static {}, LEA;->d()LCA;

    move-result-object v0

    return-object v0

    :cond_3
    return-object v2
.end method

.method public static c()Landroid/graphics/Bitmap;
    .locals 3

    const-wide v0, -0x2a01cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x2c51efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    :try_start_0
    invoke-static {v0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    array-length v2, v0

    invoke-static {v0, v1, v2}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-wide v1, -0x2d3edfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static d()LCA;
    .locals 11

    new-instance v0, LCA;

    const-wide v1, -0x2d3bffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x2d241fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x2d246fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x2d249fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0x2d24dfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v6, -0x2d254fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const-wide v7, -0x2d255fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    const-wide v8, -0x2d256fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-direct/range {v0 .. v10}, LCA;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-object v0
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-wide v0, -0x2a06ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lio/github/cherrywechat/application/MainApplication;->a:Lio/github/cherrywechat/application/MainApplication;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lgf;->p:Landroid/app/Application;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Landroid/app/AndroidAppHelper;->currentApplication()Landroid/app/Application;

    move-result-object v1

    const-wide v2, -0x2f91cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    :goto_0
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-wide v1, -0x2a077fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x2f

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static f(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-wide v0, -0x2a000fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lio/github/cherrywechat/application/MainApplication;->a:Lio/github/cherrywechat/application/MainApplication;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lgf;->p:Landroid/app/Application;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Landroid/app/AndroidAppHelper;->currentApplication()Landroid/app/Application;

    move-result-object v1

    const-wide v2, -0x2f91cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    :goto_0
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-wide v1, -0x2a008fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v1, -0x2a011fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ljava/lang/String;)Z
    .locals 3

    const-wide v0, -0x2d259fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2d25cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, LEA;->e:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBA;

    iget-object v1, v1, LBA;->g:Ljava/util/ArrayList;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LDA;

    iget-object v2, v2, LDA;->a:Ljava/lang/String;

    invoke-static {v2, p0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_4
    :goto_1
    const/4 p0, 0x0

    return p0

    :cond_5
    :goto_2
    const/4 p0, 0x1

    return p0
.end method

.method public static h()Z
    .locals 4

    sget-object v0, LEA;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/16 v2, 0x3e8

    int-to-long v2, v2

    div-long/2addr v0, v2

    sget-wide v2, LEA;->d:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static i()Ljava/util/ArrayList;
    .locals 18

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, LEA;->d()LCA;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lio/github/cherrywechat/application/MainApplication;->a:Lio/github/cherrywechat/application/MainApplication;

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    sget-object v3, Lgf;->p:Landroid/app/Application;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Landroid/app/AndroidAppHelper;->currentApplication()Landroid/app/Application;

    move-result-object v3

    const-wide v4, -0x2f91cfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    :goto_0
    invoke-virtual {v3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-wide v3, -0x2a066fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_4

    array-length v3, v2

    const/4 v0, 0x0

    move v4, v0

    :goto_1
    if-ge v4, v3, :cond_4

    aget-object v0, v2, v4

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    new-instance v5, Ljava/io/File;

    const-wide v8, -0x2d25efffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v0, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v6, Ljava/io/File;

    const-wide v8, -0x2d268fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v6, v0, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v8, Ljava/io/File;

    const-wide v9, -0x2d275fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v0, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    :try_start_0
    invoke-static {v6}, Lwh;->g0(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    sget-object v9, Lzm;->a:LAm;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, Lio/github/cherrywechat/network/model/ThemeConfig;->Companion:Lio/github/cherrywechat/network/model/ThemeConfig$Companion;

    invoke-virtual {v10}, Lio/github/cherrywechat/network/model/ThemeConfig$Companion;->serializer()LQm;

    move-result-object v10

    check-cast v10, LQm;

    invoke-virtual {v9, v10, v0}, Lmm;->a(LQm;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const-wide v9, -0x2d204fffff835L

    :try_start_2
    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    const-class v9, Lio/github/cherrywechat/network/model/ThemeConfig;

    invoke-static {v9}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v9

    invoke-virtual {v9}, LF9;->b()Ljava/lang/String;

    const-wide v9, -0x2d21ffffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    const/4 v0, 0x0

    :goto_2
    check-cast v0, Lio/github/cherrywechat/network/model/ThemeConfig;

    if-nez v0, :cond_2

    new-instance v9, Lio/github/cherrywechat/network/model/ThemeConfig;

    const/16 v16, 0x3f

    const/16 v17, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v9 .. v17}, Lio/github/cherrywechat/network/model/ThemeConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILOc;)V

    move-object v0, v9

    :cond_2
    move-object v9, v6

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_4

    :goto_3
    new-instance v6, LCA;

    move-object v10, v8

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ThemeConfig;->getName()Ljava/lang/String;

    move-result-object v8

    move-object v11, v9

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ThemeConfig;->getAuthor()Ljava/lang/String;

    move-result-object v9

    move-object v12, v10

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ThemeConfig;->getVersion()Ljava/lang/String;

    move-result-object v10

    move-object v13, v11

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ThemeConfig;->getDescription()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v12

    const-wide v14, -0x2d223fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v13

    const-wide v14, -0x2d238fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v14

    const-wide v15, -0x2d2cdfffff835L

    invoke-static/range {v15 .. v16}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ThemeConfig;->isFullBg()Z

    move-result v15

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ThemeConfig;->getAutoDarkTheme()Z

    move-result v16

    invoke-direct/range {v6 .. v16}, LCA;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_5

    :goto_4
    const-wide v5, -0x2d2e2fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    const-wide v5, -0x2d2f0fffff835L

    const-wide v7, -0x2d2fcfffff835L

    invoke-static {v5, v6, v7, v8, v0}, LEy;->i(JJLjava/lang/Exception;)V

    :cond_3
    :goto_5
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    :cond_4
    return-object v1
.end method

.method public static j(Ljava/lang/String;)V
    .locals 21

    const-wide v0, -0x2d2fffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    :try_start_0
    sget-object v0, Lzm;->a:LAm;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lio/github/cherrywechat/network/model/ApiResponse;->Companion:Lio/github/cherrywechat/network/model/ApiResponse$Companion;

    sget-object v2, Lio/github/cherrywechat/network/model/CustomerData;->Companion:Lio/github/cherrywechat/network/model/CustomerData$Companion;

    invoke-virtual {v2}, Lio/github/cherrywechat/network/model/CustomerData$Companion;->serializer()LQm;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/github/cherrywechat/network/model/ApiResponse$Companion;->serializer(LQm;)LQm;

    move-result-object v1

    check-cast v1, LQm;

    move-object/from16 v2, p0

    invoke-virtual {v0, v1, v2}, Lmm;->a(LQm;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-wide v1, -0x2d28cfffff835L

    :try_start_1
    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-class v1, Lio/github/cherrywechat/network/model/ApiResponse;

    invoke-static {v1}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v1

    invoke-virtual {v1}, LF9;->b()Ljava/lang/String;

    const-wide v1, -0x2d2a7fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lio/github/cherrywechat/network/model/ApiResponse;

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getCode()I

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/github/cherrywechat/network/model/CustomerData;

    if-nez v0, :cond_2

    goto/16 :goto_3

    :cond_2
    invoke-static {}, Lgf;->I()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/CustomerData;->getCustomer()Lio/github/cherrywechat/network/model/CustomerInfo;

    move-result-object v2

    if-nez v2, :cond_3

    goto/16 :goto_3

    :cond_3
    invoke-virtual {v2}, Lio/github/cherrywechat/network/model/CustomerInfo;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto/16 :goto_3

    :cond_4
    invoke-virtual {v2}, Lio/github/cherrywechat/network/model/CustomerInfo;->getStatus()Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x2d2abfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const-wide v3, -0x2d39cfffff835L

    const-wide v5, -0x2d394fffff835L

    sget-object v7, LEA;->f:Landroid/content/SharedPreferences;

    const-wide v8, -0x2d391fffff835L

    sget-object v10, LEA;->e:Ljava/util/ArrayList;

    if-nez v2, :cond_5

    :try_start_2
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    const-wide v0, -0x2d2b3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto/16 :goto_3

    :cond_5
    sput-object v1, LEA;->b:Ljava/lang/String;

    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/CustomerData;->getAccessToken()Ljava/lang/String;

    move-result-object v1

    sput-object v1, LEA;->c:Ljava/lang/String;

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/CustomerData;->getExpires()J

    move-result-wide v1

    sput-wide v1, LEA;->d:J

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/CustomerData;->getAuthorizedThemes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/github/cherrywechat/network/model/AuthorizedThemeData;

    invoke-virtual {v1}, Lio/github/cherrywechat/network/model/AuthorizedThemeData;->getVersions()Ljava/util/List;

    move-result-object v2

    new-instance v11, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v2, v12}, Lta;->d0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lio/github/cherrywechat/network/model/ThemeVersionData;

    new-instance v13, LDA;

    invoke-virtual {v12}, Lio/github/cherrywechat/network/model/ThemeVersionData;->getId()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12}, Lio/github/cherrywechat/network/model/ThemeVersionData;->getVersionName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v12}, Lio/github/cherrywechat/network/model/ThemeVersionData;->getFileName()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v12}, Lio/github/cherrywechat/network/model/ThemeVersionData;->getFileExt()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v12}, Lio/github/cherrywechat/network/model/ThemeVersionData;->getFileSize()J

    move-result-wide v18

    invoke-virtual {v12}, Lio/github/cherrywechat/network/model/ThemeVersionData;->getCreatedAt()Ljava/lang/String;

    move-result-object v20

    invoke-direct/range {v13 .. v20}, LDA;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    move-object/from16 v18, v11

    new-instance v11, LBA;

    invoke-virtual {v1}, Lio/github/cherrywechat/network/model/AuthorizedThemeData;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lio/github/cherrywechat/network/model/AuthorizedThemeData;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lio/github/cherrywechat/network/model/AuthorizedThemeData;->getAuthor()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lio/github/cherrywechat/network/model/AuthorizedThemeData;->getBaiduSkinDownloadUrl()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1}, Lio/github/cherrywechat/network/model/AuthorizedThemeData;->getAuthType()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v1}, Lio/github/cherrywechat/network/model/AuthorizedThemeData;->getCreatedAt()Ljava/lang/String;

    move-result-object v17

    invoke-direct/range {v11 .. v18}, LBA;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_7
    invoke-static {}, LEA;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LEA;->g(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    const-wide v0, -0x2d2b5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_3

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_8
    :goto_3
    return-void
.end method

.method public static k(Ljava/lang/String;)V
    .locals 4

    const-wide v0, -0x2d3a3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2d3a6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LEA;->f:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-wide v1, -0x2d3aefffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-wide v2, -0x2d3b8fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
