.class public abstract LDc;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:[I

.field public static final b:[I

.field public static final c:[I

.field public static final d:[I

.field public static final e:[I

.field public static final f:[I

.field public static final g:Lwe;

.field public static final h:[I

.field public static final i:[I

.field public static final j:[B

.field public static final k:[B

.field public static final l:[B

.field public static final m:[B

.field public static final n:[B

.field public static final o:[B

.field public static final p:[B

.field public static volatile q:Z = true


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, LDc;->a:[I

    const/16 v0, 0x8

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, LDc;->b:[I

    const/16 v0, 0xe

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    sput-object v0, LDc;->c:[I

    const v0, 0x1010003

    const v1, 0x1010405

    const v2, 0x101051e

    filled-new-array {v0, v1, v2}, [I

    move-result-object v1

    sput-object v1, LDc;->d:[I

    const v1, 0x1010199

    filled-new-array {v1}, [I

    move-result-object v1

    sput-object v1, LDc;->e:[I

    const v1, 0x10101cd

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, LDc;->f:[I

    new-instance v0, Lwe;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    sput-object v0, LDc;->g:Lwe;

    const/high16 v0, 0x1010000

    const v1, 0x5504052b

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, LDc;->h:[I

    const v0, 0x5504037a

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, LDc;->i:[I

    const/4 v0, 0x4

    new-array v1, v0, [B

    fill-array-data v1, :array_3

    sput-object v1, LDc;->j:[B

    new-array v1, v0, [B

    fill-array-data v1, :array_4

    sput-object v1, LDc;->k:[B

    new-array v1, v0, [B

    fill-array-data v1, :array_5

    sput-object v1, LDc;->l:[B

    new-array v1, v0, [B

    fill-array-data v1, :array_6

    sput-object v1, LDc;->m:[B

    new-array v1, v0, [B

    fill-array-data v1, :array_7

    sput-object v1, LDc;->n:[B

    new-array v1, v0, [B

    fill-array-data v1, :array_8

    sput-object v1, LDc;->o:[B

    new-array v0, v0, [B

    fill-array-data v0, :array_9

    sput-object v0, LDc;->p:[B

    return-void

    :array_0
    .array-data 4
        0x1010003
        0x1010121
        0x1010155
        0x1010159
        0x101031f
        0x10103ea
        0x10103fb
        0x1010402
        0x1010403
    .end array-data

    :array_1
    .array-data 4
        0x1010003
        0x10101b5
        0x10101b6
        0x1010324
        0x1010325
        0x1010326
        0x101045a
        0x101045b
    .end array-data

    :array_2
    .array-data 4
        0x1010003
        0x1010404
        0x1010405
        0x1010406
        0x1010407
        0x1010408
        0x1010409
        0x101040a
        0x101040b
        0x101040c
        0x101040d
        0x10104cb
        0x10104cc
        0x101051e
    .end array-data

    :array_3
    .array-data 1
        0x30t
        0x31t
        0x35t
        0x0t
    .end array-data

    :array_4
    .array-data 1
        0x30t
        0x31t
        0x30t
        0x0t
    .end array-data

    :array_5
    .array-data 1
        0x30t
        0x30t
        0x39t
        0x0t
    .end array-data

    :array_6
    .array-data 1
        0x30t
        0x30t
        0x35t
        0x0t
    .end array-data

    :array_7
    .array-data 1
        0x30t
        0x30t
        0x31t
        0x0t
    .end array-data

    :array_8
    .array-data 1
        0x30t
        0x30t
        0x31t
        0x0t
    .end array-data

    :array_9
    .array-data 1
        0x30t
        0x30t
        0x32t
        0x0t
    .end array-data
.end method

.method public static final a(LQm;Ljava/lang/String;)Lpl;
    .locals 2

    new-instance v0, Lpl;

    new-instance v1, Lql;

    invoke-direct {v1, p0}, Lql;-><init>(LQm;)V

    invoke-direct {v0, p1, v1}, Lpl;-><init>(Ljava/lang/String;Lql;)V

    return-object v0
.end method

.method public static b(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    if-eq p0, p1, :cond_2

    sget-object v0, LXl;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, LPt;->a:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_2

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    return-void
.end method

.method public static final c(C)B
    .locals 1

    const/16 v0, 0x7e

    if-ge p0, v0, :cond_0

    sget-object v0, Lu7;->b:[B

    aget-byte p0, v0, p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)I
    .locals 6

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p1, v0, v1}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroid/app/AppOpsManager;->permissionToOp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    goto/16 :goto_5

    :cond_1
    if-nez v2, :cond_4

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    array-length v4, v2

    if-gtz v4, :cond_2

    goto :goto_0

    :cond_2
    aget-object v2, v2, v0

    goto :goto_1

    :cond_3
    :goto_0
    return v3

    :cond_4
    :goto_1
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const-class v5, Landroid/app/AppOpsManager;

    if-ne v3, v1, :cond_9

    invoke-static {v4, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1d

    if-lt v3, v4, :cond_8

    invoke-virtual {p0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/AppOpsManager;

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v4

    const/4 v5, 0x1

    if-nez v3, :cond_5

    move v2, v5

    goto :goto_2

    :cond_5
    invoke-virtual {v3, p1, v4, v2}, Landroid/app/AppOpsManager;->checkOpNoThrow(Ljava/lang/String;ILjava/lang/String;)I

    move-result v2

    :goto_2
    if-eqz v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-static {p0}, Lz4;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    if-nez v3, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v3, p1, v1, p0}, Landroid/app/AppOpsManager;->checkOpNoThrow(Ljava/lang/String;ILjava/lang/String;)I

    move-result v5

    :goto_3
    move v2, v5

    goto :goto_4

    :cond_8
    invoke-virtual {p0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/AppOpsManager;

    invoke-virtual {p0, p1, v2}, Landroid/app/AppOpsManager;->noteProxyOpNoThrow(Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    goto :goto_4

    :cond_9
    invoke-virtual {p0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/AppOpsManager;

    invoke-virtual {p0, p1, v2}, Landroid/app/AppOpsManager;->noteProxyOpNoThrow(Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    :goto_4
    if-nez v2, :cond_a

    :goto_5
    return v0

    :cond_a
    const/4 p0, -0x2

    return p0
.end method

.method public static e(LN5;Landroid/graphics/drawable/Drawable;II)LO5;
    .locals 6

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    goto/16 :goto_2

    :cond_0
    instance-of v0, p1, Landroid/graphics/drawable/Animatable;

    const/4 v2, 0x0

    if-nez v0, :cond_6

    const/4 v0, 0x5

    const-string v3, "DrawableToBitmap"

    const/high16 v4, -0x80000000

    if-ne p2, v4, :cond_2

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v5

    if-gtz v5, :cond_2

    invoke-static {v3, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_1
    :goto_0
    move-object p1, v2

    goto :goto_1

    :cond_2
    if-ne p3, v4, :cond_3

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    if-gtz v4, :cond_3

    invoke-static {v3, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    if-lez v0, :cond_4

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result p2

    :cond_4
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    if-lez v0, :cond_5

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p3

    :cond_5
    sget-object v0, LEB;->d:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-interface {p0, p2, p3, v3}, LN5;->g(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    :try_start_0
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {p1, v1, v1, p2, p3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {p1, v4}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {v4, v2}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    move-object p1, v3

    :goto_1
    const/4 v1, 0x1

    goto :goto_2

    :catchall_0
    move-exception p0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p0

    :cond_6
    move-object p1, v2

    :goto_2
    if-eqz v1, :cond_7

    goto :goto_3

    :cond_7
    sget-object p0, LDc;->g:Lwe;

    :goto_3
    invoke-static {p0, p1}, LO5;->c(LN5;Landroid/graphics/Bitmap;)LO5;

    move-result-object p0

    return-object p0
.end method

.method public static f(Ljava/lang/String;)LiG;
    .locals 2

    const-wide v0, -0x20df5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, LiG;

    sget v1, LgG;->a:I

    invoke-static {p0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    invoke-direct {v0, p0}, LiG;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static g(Lcom/bumptech/glide/a;Ljava/util/ArrayList;)LPv;
    .locals 38

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/bumptech/glide/a;->a:LN5;

    iget-object v2, v0, Lcom/bumptech/glide/a;->d:Lzp;

    iget-object v0, v0, Lcom/bumptech/glide/a;->c:LRj;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    iget-object v0, v0, LRj;->h:LD2;

    new-instance v4, LPv;

    invoke-direct {v4}, LPv;-><init>()V

    const-class v5, LWy;

    const-string v6, "BitmapDrawable"

    const-class v7, Ljava/lang/String;

    const-string v8, "legacy_append"

    const-class v9, LAj;

    const-string v10, "Animation"

    const-class v11, [B

    const-class v12, Ljava/lang/Integer;

    const-class v13, Landroid/graphics/drawable/BitmapDrawable;

    const-string v14, "Bitmap"

    const-class v15, Ljava/io/File;

    move-object/from16 p0, v11

    const-class v11, Landroid/os/ParcelFileDescriptor;

    move-object/from16 v16, v7

    const-class v7, Landroid/content/res/AssetFileDescriptor;

    move-object/from16 v17, v12

    const-class v12, Ljava/nio/ByteBuffer;

    move-object/from16 v18, v15

    const-class v15, Landroid/graphics/drawable/Drawable;

    move-object/from16 v19, v8

    const-class v8, Landroid/graphics/Bitmap;

    move-object/from16 v20, v5

    const-class v5, Landroid/net/Uri;

    move-object/from16 v21, v5

    const-class v5, Ljava/io/InputStream;

    move-object/from16 v22, v9

    new-instance v9, LUc;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    move-object/from16 v23, v6

    iget-object v6, v4, LPv;->g:LRf;

    monitor-enter v6

    move-object/from16 v24, v13

    :try_start_0
    iget-object v13, v6, LRf;->a:Ljava/util/ArrayList;

    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v6

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    new-instance v9, LGg;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    iget-object v13, v4, LPv;->g:LRf;

    monitor-enter v13

    move/from16 v25, v6

    :try_start_1
    iget-object v6, v13, LRf;->a:Ljava/util/ArrayList;

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v13

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v4}, LPv;->e()Ljava/util/ArrayList;

    move-result-object v9

    new-instance v13, Lo6;

    invoke-direct {v13, v3, v9, v1, v2}, Lo6;-><init>(Landroid/content/Context;Ljava/util/ArrayList;LN5;Lzp;)V

    move-object/from16 v26, v13

    new-instance v13, LVD;

    move-object/from16 v27, v6

    new-instance v6, Lhw;

    move-object/from16 v28, v7

    const/16 v7, 0x18

    invoke-direct {v6, v7}, Lhw;-><init>(I)V

    invoke-direct {v13, v1, v6}, LVD;-><init>(LN5;Lhw;)V

    new-instance v6, Lte;

    invoke-virtual {v4}, LPv;->e()Ljava/util/ArrayList;

    move-result-object v7

    move-object/from16 v29, v13

    invoke-virtual/range {v27 .. v27}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v13

    invoke-direct {v6, v7, v13, v1, v2}, Lte;-><init>(Ljava/util/ArrayList;Landroid/util/DisplayMetrics;LN5;Lzp;)V

    const-class v7, LNj;

    iget-object v13, v0, LD2;->b:Ljava/lang/Object;

    check-cast v13, Ljava/util/Map;

    invoke-interface {v13, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    new-instance v7, Lk6;

    const/4 v13, 0x1

    invoke-direct {v7, v13}, Lk6;-><init>(I)V

    new-instance v13, Lk6;

    move-object/from16 v30, v7

    const/4 v7, 0x0

    invoke-direct {v13, v7}, Lk6;-><init>(I)V

    move-object/from16 v7, v30

    :goto_0
    move-object/from16 v30, v0

    goto :goto_1

    :cond_0
    new-instance v13, Lj6;

    const/4 v7, 0x0

    invoke-direct {v13, v6, v7}, Lj6;-><init>(Lte;I)V

    new-instance v7, LI5;

    move-object/from16 v30, v13

    const/4 v13, 0x2

    invoke-direct {v7, v13, v6, v2}, LI5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v13, v30

    goto :goto_0

    :goto_1
    new-instance v0, LI2;

    move-object/from16 v31, v1

    new-instance v1, LP3;

    move-object/from16 v32, v11

    const/4 v11, 0x1

    invoke-direct {v1, v11, v9, v2}, LP3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v0, v1, v11}, LI2;-><init>(LP3;I)V

    invoke-virtual {v4, v10, v5, v15, v0}, LPv;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lsw;)V

    new-instance v0, LI2;

    new-instance v1, LP3;

    invoke-direct {v1, v11, v9, v2}, LP3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v11, 0x0

    invoke-direct {v0, v1, v11}, LI2;-><init>(LP3;I)V

    invoke-virtual {v4, v10, v12, v15, v0}, LPv;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lsw;)V

    new-instance v0, Luw;

    invoke-direct {v0, v3}, Luw;-><init>(Landroid/content/Context;)V

    new-instance v1, LK5;

    invoke-direct {v1, v2}, LK5;-><init>(Lzp;)V

    new-instance v11, LH5;

    move-object/from16 v33, v3

    const/4 v3, 0x0

    move-object/from16 v34, v0

    const/4 v0, 0x0

    invoke-direct {v11, v3, v0}, LH5;-><init>(IZ)V

    new-instance v0, LPg;

    const/16 v3, 0xa

    invoke-direct {v0, v3}, LPg;-><init>(I)V

    invoke-virtual/range {v33 .. v33}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    move-object/from16 v35, v0

    new-instance v0, Lgf;

    move-object/from16 v36, v11

    const/16 v11, 0x1d

    invoke-direct {v0, v11}, Lgf;-><init>(I)V

    invoke-virtual {v4, v12, v0}, LPv;->a(Ljava/lang/Class;LPf;)V

    new-instance v0, LXm;

    const/16 v11, 0xf

    invoke-direct {v0, v11, v2}, LXm;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v4, v5, v0}, LPv;->a(Ljava/lang/Class;LPf;)V

    invoke-virtual {v4, v14, v12, v8, v13}, LPv;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lsw;)V

    invoke-virtual {v4, v14, v5, v8, v7}, LPv;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lsw;)V

    const-string v0, "robolectric"

    sget-object v11, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lj6;

    move-object/from16 v37, v3

    const/4 v3, 0x1

    invoke-direct {v0, v6, v3}, Lj6;-><init>(Lte;I)V

    move-object/from16 v3, v32

    invoke-virtual {v4, v14, v3, v8, v0}, LPv;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lsw;)V

    goto :goto_2

    :cond_1
    move-object/from16 v37, v3

    move-object/from16 v3, v32

    :goto_2
    new-instance v0, LVD;

    new-instance v6, Lhw;

    move-object/from16 v32, v11

    const/16 v11, 0x15

    invoke-direct {v6, v11}, Lhw;-><init>(I)V

    move-object/from16 v11, v31

    invoke-direct {v0, v11, v6}, LVD;-><init>(LN5;Lhw;)V

    move-object/from16 v6, v28

    invoke-virtual {v4, v14, v6, v8, v0}, LPv;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lsw;)V

    move-object/from16 v0, v29

    invoke-virtual {v4, v14, v3, v8, v0}, LPv;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lsw;)V

    sget-object v6, Lgf;->k:Lgf;

    invoke-virtual {v4, v8, v8, v6}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    move-object/from16 v29, v15

    new-instance v15, Llh;

    move-object/from16 v31, v6

    const/4 v6, 0x1

    invoke-direct {v15, v6}, Llh;-><init>(I)V

    invoke-virtual {v4, v14, v8, v8, v15}, LPv;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lsw;)V

    invoke-virtual {v4, v8, v1}, LPv;->b(Ljava/lang/Class;Lvw;)V

    new-instance v6, LI5;

    move-object/from16 v15, v27

    invoke-direct {v6, v15, v13}, LI5;-><init>(Landroid/content/res/Resources;Lsw;)V

    move-object/from16 v13, v23

    move-object/from16 v23, v8

    move-object/from16 v8, v24

    invoke-virtual {v4, v13, v12, v8, v6}, LPv;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lsw;)V

    new-instance v6, LI5;

    invoke-direct {v6, v15, v7}, LI5;-><init>(Landroid/content/res/Resources;Lsw;)V

    invoke-virtual {v4, v13, v5, v8, v6}, LPv;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lsw;)V

    new-instance v6, LI5;

    invoke-direct {v6, v15, v0}, LI5;-><init>(Landroid/content/res/Resources;Lsw;)V

    invoke-virtual {v4, v13, v3, v8, v6}, LPv;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lsw;)V

    new-instance v0, LP3;

    const/4 v6, 0x7

    invoke-direct {v0, v6, v11, v1}, LP3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v8, v0}, LPv;->b(Ljava/lang/Class;Lvw;)V

    new-instance v0, Liz;

    move-object/from16 v1, v26

    invoke-direct {v0, v9, v1, v2}, Liz;-><init>(Ljava/util/ArrayList;Lo6;Lzp;)V

    move-object/from16 v6, v22

    invoke-virtual {v4, v10, v5, v6, v0}, LPv;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lsw;)V

    invoke-virtual {v4, v10, v12, v6, v1}, LPv;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lsw;)V

    new-instance v0, LPg;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, LPg;-><init>(I)V

    invoke-virtual {v4, v6, v0}, LPv;->b(Ljava/lang/Class;Lvw;)V

    move-object/from16 v0, v20

    move-object/from16 v1, v31

    invoke-virtual {v4, v0, v0, v1}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v7, LL5;

    invoke-direct {v7, v11}, LL5;-><init>(LN5;)V

    move-object/from16 v9, v23

    invoke-virtual {v4, v14, v0, v9, v7}, LPv;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lsw;)V

    move-object/from16 v0, v19

    move-object/from16 v10, v21

    move-object/from16 v7, v29

    move-object/from16 v13, v34

    invoke-virtual {v4, v0, v10, v7, v13}, LPv;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lsw;)V

    new-instance v14, LI5;

    const/4 v6, 0x1

    invoke-direct {v14, v6, v13, v11}, LI5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v0, v10, v9, v14}, LPv;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lsw;)V

    new-instance v6, Lp6;

    const/4 v13, 0x0

    invoke-direct {v6, v13}, Lp6;-><init>(I)V

    invoke-virtual {v4, v6}, LPv;->h(Lwc;)V

    new-instance v6, Lm6;

    invoke-direct {v6, v13}, Lm6;-><init>(I)V

    move-object/from16 v13, v18

    invoke-virtual {v4, v13, v12, v6}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v6, Lnh;

    new-instance v14, LPg;

    move-object/from16 v31, v11

    const/4 v11, 0x6

    invoke-direct {v14, v11}, LPg;-><init>(I)V

    invoke-direct {v6, v14}, Lv5;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4, v13, v5, v6}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v6, Llh;

    const/4 v11, 0x0

    invoke-direct {v6, v11}, Llh;-><init>(I)V

    invoke-virtual {v4, v0, v13, v13, v6}, LPv;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lsw;)V

    new-instance v6, Lnh;

    new-instance v11, LPg;

    const/4 v14, 0x5

    invoke-direct {v11, v14}, LPg;-><init>(I)V

    invoke-direct {v6, v11}, Lv5;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4, v13, v3, v6}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    invoke-virtual {v4, v13, v13, v1}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v6, Ltl;

    invoke-direct {v6, v2}, Ltl;-><init>(Lzp;)V

    invoke-virtual {v4, v6}, LPv;->h(Lwc;)V

    const-string v2, "robolectric"

    move-object/from16 v6, v32

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    new-instance v2, Lp6;

    const/4 v6, 0x2

    invoke-direct {v2, v6}, Lp6;-><init>(I)V

    invoke-virtual {v4, v2}, LPv;->h(Lwc;)V

    :cond_2
    new-instance v2, LSd;

    const/4 v6, 0x2

    move-object/from16 v11, v33

    invoke-direct {v2, v11, v6}, LSd;-><init>(Landroid/content/Context;I)V

    new-instance v6, LSd;

    const/4 v14, 0x0

    invoke-direct {v6, v11, v14}, LSd;-><init>(Landroid/content/Context;I)V

    new-instance v14, LSd;

    move-object/from16 v24, v8

    const/4 v8, 0x1

    invoke-direct {v14, v11, v8}, LSd;-><init>(Landroid/content/Context;I)V

    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v4, v8, v5, v2}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    move-object/from16 v23, v9

    move-object/from16 v9, v17

    invoke-virtual {v4, v9, v5, v2}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    move-object/from16 v2, v28

    invoke-virtual {v4, v8, v2, v6}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    invoke-virtual {v4, v9, v2, v6}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    invoke-virtual {v4, v8, v7, v14}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    invoke-virtual {v4, v9, v7, v14}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v6, LSd;

    const/16 v14, 0x9

    invoke-direct {v6, v11, v14}, LSd;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v10, v5, v6}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v6, LSd;

    const/16 v14, 0x8

    invoke-direct {v6, v11, v14}, LSd;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v10, v2, v6}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v6, LJ5;

    const/4 v14, 0x3

    invoke-direct {v6, v15, v14}, LJ5;-><init>(Landroid/content/res/Resources;I)V

    new-instance v14, LJ5;

    move-object/from16 v19, v0

    const/4 v0, 0x1

    invoke-direct {v14, v15, v0}, LJ5;-><init>(Landroid/content/res/Resources;I)V

    new-instance v0, LJ5;

    move-object/from16 v29, v7

    const/4 v7, 0x2

    invoke-direct {v0, v15, v7}, LJ5;-><init>(Landroid/content/res/Resources;I)V

    invoke-virtual {v4, v9, v10, v6}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    invoke-virtual {v4, v8, v10, v6}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    invoke-virtual {v4, v9, v2, v14}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    invoke-virtual {v4, v8, v2, v14}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    invoke-virtual {v4, v9, v5, v0}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    invoke-virtual {v4, v8, v5, v0}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v0, LD2;

    const/16 v6, 0xe

    invoke-direct {v0, v6}, LD2;-><init>(I)V

    move-object/from16 v6, v16

    invoke-virtual {v4, v6, v5, v0}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v0, LD2;

    const/16 v7, 0xe

    invoke-direct {v0, v7}, LD2;-><init>(I)V

    invoke-virtual {v4, v10, v5, v0}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v0, Lhw;

    const/16 v7, 0xb

    invoke-direct {v0, v7}, Lhw;-><init>(I)V

    invoke-virtual {v4, v6, v5, v0}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v0, Lhw;

    const/16 v7, 0xa

    invoke-direct {v0, v7}, Lhw;-><init>(I)V

    invoke-virtual {v4, v6, v3, v0}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v0, Lhw;

    const/16 v7, 0x9

    invoke-direct {v0, v7}, Lhw;-><init>(I)V

    invoke-virtual {v4, v6, v2, v0}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v0, LU4;

    invoke-virtual {v11}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v6

    const/4 v7, 0x1

    invoke-direct {v0, v6, v7}, LU4;-><init>(Landroid/content/res/AssetManager;I)V

    invoke-virtual {v4, v10, v5, v0}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v0, LU4;

    invoke-virtual {v11}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v6

    const/4 v7, 0x0

    invoke-direct {v0, v6, v7}, LU4;-><init>(Landroid/content/res/AssetManager;I)V

    invoke-virtual {v4, v10, v2, v0}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v0, LSd;

    const/4 v6, 0x6

    invoke-direct {v0, v11, v6}, LSd;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v10, v5, v0}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v0, LSd;

    const/4 v6, 0x7

    invoke-direct {v0, v11, v6}, LSd;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v10, v5, v0}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    const/16 v0, 0x1d

    move/from16 v6, v25

    if-lt v6, v0, :cond_3

    new-instance v0, LJu;

    invoke-direct {v0, v11, v5}, LB3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v10, v5, v0}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v0, LJu;

    invoke-direct {v0, v11, v3}, LB3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v10, v3, v0}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    :cond_3
    const-class v0, LQj;

    move-object/from16 v6, v30

    iget-object v6, v6, LD2;->b:Ljava/lang/Object;

    check-cast v6, Ljava/util/Map;

    invoke-interface {v6, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    new-instance v6, LnD;

    const/4 v7, 0x2

    move-object/from16 v8, v37

    invoke-direct {v6, v8, v0, v7}, LnD;-><init>(Landroid/content/ContentResolver;ZI)V

    invoke-virtual {v4, v10, v5, v6}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v6, LnD;

    const/4 v7, 0x1

    invoke-direct {v6, v8, v0, v7}, LnD;-><init>(Landroid/content/ContentResolver;ZI)V

    invoke-virtual {v4, v10, v3, v6}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v3, LnD;

    const/4 v6, 0x0

    invoke-direct {v3, v8, v0, v6}, LnD;-><init>(Landroid/content/ContentResolver;ZI)V

    invoke-virtual {v4, v10, v2, v3}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v0, Lhw;

    const/16 v2, 0x12

    invoke-direct {v0, v2}, Lhw;-><init>(I)V

    invoke-virtual {v4, v10, v5, v0}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    const-class v0, Ljava/net/URL;

    new-instance v2, Lhw;

    const/16 v3, 0x11

    invoke-direct {v2, v3}, Lhw;-><init>(I)V

    invoke-virtual {v4, v0, v5, v2}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v0, LSd;

    const/4 v2, 0x5

    invoke-direct {v0, v11, v2}, LSd;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v10, v13, v0}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    const-class v0, LYj;

    new-instance v2, LD2;

    const/16 v3, 0x19

    invoke-direct {v2, v3}, LD2;-><init>(I)V

    invoke-virtual {v4, v0, v5, v2}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v0, Lgf;

    const/16 v2, 0x1a

    invoke-direct {v0, v2}, Lgf;-><init>(I)V

    move-object/from16 v2, p0

    invoke-virtual {v4, v2, v12, v0}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v0, Lgf;

    const/16 v3, 0x1c

    invoke-direct {v0, v3}, Lgf;-><init>(I)V

    invoke-virtual {v4, v2, v5, v0}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    invoke-virtual {v4, v10, v10, v1}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    move-object/from16 v7, v29

    invoke-virtual {v4, v7, v7, v1}, LPv;->c(Ljava/lang/Class;Ljava/lang/Class;Lbs;)V

    new-instance v0, Llh;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Llh;-><init>(I)V

    move-object/from16 v1, v19

    invoke-virtual {v4, v1, v7, v7, v0}, LPv;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lsw;)V

    new-instance v0, LJ5;

    const/4 v1, 0x0

    invoke-direct {v0, v15, v1}, LJ5;-><init>(Landroid/content/res/Resources;I)V

    move-object/from16 v9, v23

    move-object/from16 v8, v24

    invoke-virtual {v4, v9, v8, v0}, LPv;->i(Ljava/lang/Class;Ljava/lang/Class;Lzw;)V

    move-object/from16 v0, v36

    invoke-virtual {v4, v9, v2, v0}, LPv;->i(Ljava/lang/Class;Ljava/lang/Class;Lzw;)V

    new-instance v1, Lw4;

    const/16 v3, 0xa

    move-object/from16 v11, v31

    move-object/from16 v5, v35

    invoke-direct {v1, v11, v0, v5, v3}, Lw4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v4, v7, v2, v1}, LPv;->i(Ljava/lang/Class;Ljava/lang/Class;Lzw;)V

    move-object/from16 v6, v22

    invoke-virtual {v4, v6, v2, v5}, LPv;->i(Ljava/lang/Class;Ljava/lang/Class;Lzw;)V

    new-instance v0, LVD;

    new-instance v1, Lhw;

    const/16 v2, 0x16

    invoke-direct {v1, v2}, Lhw;-><init>(I)V

    invoke-direct {v0, v11, v1}, LVD;-><init>(LN5;Lhw;)V

    const-class v1, Ljava/nio/ByteBuffer;

    const-string v2, "legacy_append"

    invoke-virtual {v4, v2, v1, v9, v0}, LPv;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lsw;)V

    new-instance v1, LI5;

    invoke-direct {v1, v15, v0}, LI5;-><init>(Landroid/content/res/Resources;Lsw;)V

    const-class v0, Ljava/nio/ByteBuffer;

    const-string v2, "legacy_append"

    invoke-virtual {v4, v2, v0, v8, v1}, LPv;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lsw;)V

    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_4

    return-object v4

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public static final h(CCZ)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p2, :cond_1

    return v1

    :cond_1
    invoke-static {p0}, Ljava/lang/Character;->toUpperCase(C)C

    move-result p0

    invoke-static {p1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result p1

    if-eq p0, p1, :cond_3

    invoke-static {p0}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p0

    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    if-ne p0, p1, :cond_2

    goto :goto_0

    :cond_2
    return v1

    :cond_3
    :goto_0
    return v0
.end method

.method public static i(Lrb;ILjava/util/ArrayList;LfF;)LfF;
    .locals 7

    if-nez p1, :cond_0

    iget v0, p0, Lrb;->n0:I

    goto :goto_0

    :cond_0
    iget v0, p0, Lrb;->o0:I

    :goto_0
    const/4 v1, 0x0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_4

    if-eqz p3, :cond_1

    iget v3, p3, LfF;->b:I

    if-eq v0, v3, :cond_4

    :cond_1
    move v3, v1

    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_5

    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LfF;

    iget v5, v4, LfF;->b:I

    if-ne v5, v0, :cond_3

    if-eqz p3, :cond_2

    invoke-virtual {p3, p1, v4}, LfF;->c(ILfF;)V

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_2
    move-object p3, v4

    goto :goto_2

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    if-eq v0, v2, :cond_5

    return-object p3

    :cond_5
    :goto_2
    const/4 v0, 0x1

    if-nez p3, :cond_c

    instance-of v3, p0, Luk;

    if-eqz v3, :cond_a

    move-object v3, p0

    check-cast v3, Luk;

    move v4, v1

    :goto_3
    iget v5, v3, Luk;->r0:I

    if-ge v4, v5, :cond_8

    iget-object v5, v3, Luk;->q0:[Lrb;

    aget-object v5, v5, v4

    if-nez p1, :cond_6

    iget v6, v5, Lrb;->n0:I

    if-eq v6, v2, :cond_6

    goto :goto_4

    :cond_6
    if-ne p1, v0, :cond_7

    iget v6, v5, Lrb;->o0:I

    if-eq v6, v2, :cond_7

    goto :goto_4

    :cond_7
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_8
    move v6, v2

    :goto_4
    if-eq v6, v2, :cond_a

    move v3, v1

    :goto_5
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_a

    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LfF;

    iget v5, v4, LfF;->b:I

    if-ne v5, v6, :cond_9

    move-object p3, v4

    goto :goto_6

    :cond_9
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_a
    :goto_6
    if-nez p3, :cond_b

    new-instance p3, LfF;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p3, LfF;->a:Ljava/util/ArrayList;

    const/4 v3, 0x0

    iput-object v3, p3, LfF;->d:Ljava/util/ArrayList;

    iput v2, p3, LfF;->e:I

    sget v2, LfF;->f:I

    add-int/lit8 v3, v2, 0x1

    sput v3, LfF;->f:I

    iput v2, p3, LfF;->b:I

    iput p1, p3, LfF;->c:I

    :cond_b
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    iget v2, p3, LfF;->b:I

    iget-object v3, p3, LfF;->a:Ljava/util/ArrayList;

    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    return-object p3

    :cond_d
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    instance-of v3, p0, Lkk;

    if-eqz v3, :cond_f

    move-object v3, p0

    check-cast v3, Lkk;

    iget-object v4, v3, Lkk;->t0:Lcb;

    iget v3, v3, Lkk;->u0:I

    if-nez v3, :cond_e

    move v1, v0

    :cond_e
    invoke-virtual {v4, v1, p3, p2}, Lcb;->c(ILfF;Ljava/util/ArrayList;)V

    :cond_f
    if-nez p1, :cond_10

    iput v2, p0, Lrb;->n0:I

    iget-object v0, p0, Lrb;->I:Lcb;

    invoke-virtual {v0, p1, p3, p2}, Lcb;->c(ILfF;Ljava/util/ArrayList;)V

    iget-object v0, p0, Lrb;->K:Lcb;

    invoke-virtual {v0, p1, p3, p2}, Lcb;->c(ILfF;Ljava/util/ArrayList;)V

    goto :goto_7

    :cond_10
    iput v2, p0, Lrb;->o0:I

    iget-object v0, p0, Lrb;->J:Lcb;

    invoke-virtual {v0, p1, p3, p2}, Lcb;->c(ILfF;Ljava/util/ArrayList;)V

    iget-object v0, p0, Lrb;->M:Lcb;

    invoke-virtual {v0, p1, p3, p2}, Lcb;->c(ILfF;Ljava/util/ArrayList;)V

    iget-object v0, p0, Lrb;->L:Lcb;

    invoke-virtual {v0, p1, p3, p2}, Lcb;->c(ILfF;Ljava/util/ArrayList;)V

    :goto_7
    iget-object p0, p0, Lrb;->P:Lcb;

    invoke-virtual {p0, p1, p3, p2}, Lcb;->c(ILfF;Ljava/util/ArrayList;)V

    return-object p3
.end method

.method public static final j(Lac;Lac;Z)Lac;
    .locals 3

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v0, LH7;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, LH7;-><init>(I)V

    invoke-interface {p0, p2, v0}, Lac;->q(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    new-instance v1, LH7;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, LH7;-><init>(I)V

    invoke-interface {p1, p2, v1}, Lac;->q(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    invoke-interface {p0, p1}, Lac;->l(Lac;)Lac;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LH7;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, LH7;-><init>(I)V

    sget-object v1, LIf;->a:LIf;

    invoke-interface {p0, v1, v0}, Lac;->q(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lac;

    if-eqz p2, :cond_1

    check-cast p1, Lac;

    new-instance p2, LH7;

    const/16 v0, 0x9

    invoke-direct {p2, v0}, LH7;-><init>(I)V

    invoke-interface {p1, v1, p2}, Lac;->q(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p1

    :cond_1
    check-cast p1, Lac;

    invoke-interface {p0, p1}, Lac;->l(Lac;)Lac;

    move-result-object p0

    return-object p0
.end method

.method public static k(Landroid/content/Context;Landroid/content/Context;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
    .locals 1

    :try_start_0
    sget-boolean v0, LDc;->q:Z

    if-eqz v0, :cond_1

    invoke-static {p1, p2, p3}, LDc;->o(Landroid/content/Context;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    return-object p0

    :catch_0
    move-exception p3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {p1, p2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0

    :cond_0
    throw p3

    :catch_1
    const/4 p0, 0x0

    sput-boolean p0, LDc;->q:Z

    :catch_2
    :cond_1
    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p3

    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget-object p1, LCw;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {p0, p2, p3}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static m(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 10

    const-wide v0, -0x2c505fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    const-wide v2, -0x2c50cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    new-instance v4, Landroid/graphics/Rect;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v5, v0, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    new-instance v6, Landroid/graphics/RectF;

    invoke-direct {v6, v4}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    const/4 v7, 0x1

    invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/high16 v7, -0x1000000

    invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v2, v5, v5, v5, v5}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    const/16 v7, 0x64

    invoke-static {p1, v7}, LTB;->f(II)I

    move-result p1

    int-to-float v8, p1

    const/high16 v9, 0x42c80000    # 100.0f

    div-float/2addr v8, v9

    int-to-float v0, v0

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v0, v9

    mul-float/2addr v0, v8

    if-lt p1, v7, :cond_0

    invoke-virtual {v2, v6, v3}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    goto :goto_0

    :cond_0
    if-gtz p1, :cond_1

    invoke-virtual {v2, v6, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v2, v6, v0, v0, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :goto_0
    new-instance p1, Landroid/graphics/PorterDuffXfermode;

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p1, v0}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    new-instance p1, Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    invoke-direct {p1, v5, v5, v0, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {v2, p0, p1, v4, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-object v1
.end method

.method public static n(ILUi;)LDn;
    .locals 2

    sget-object v0, Lgf;->j:Lgf;

    invoke-static {p0}, LEy;->v(I)I

    move-result p0

    if-eqz p0, :cond_2

    const/4 v1, 0x1

    if-eq p0, v1, :cond_1

    const/4 v1, 0x2

    if-ne p0, v1, :cond_0

    new-instance p0, LeD;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LeD;->a:LUi;

    iput-object v0, p0, LeD;->b:Ljava/lang/Object;

    return-object p0

    :cond_0
    new-instance p0, LFa;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_1
    new-instance p0, LZw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZw;->a:LUi;

    iput-object v0, p0, LZw;->b:Ljava/lang/Object;

    return-object p0

    :cond_2
    new-instance p0, LcA;

    invoke-direct {p0, p1}, LcA;-><init>(LUi;)V

    return-object p0
.end method

.method public static o(Landroid/content/Context;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
    .locals 1

    if-eqz p2, :cond_0

    new-instance v0, LDb;

    invoke-direct {v0, p0}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    iput-object p2, v0, LDb;->b:Landroid/content/res/Resources$Theme;

    invoke-virtual {p2}, Landroid/content/res/Resources$Theme;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    invoke-virtual {v0, p0}, LDb;->a(Landroid/content/res/Configuration;)V

    move-object p0, v0

    :cond_0
    invoke-static {p0, p1}, LfG;->U(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static p(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
    .locals 1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x5

    if-eq p0, v0, :cond_1

    const/16 v0, 0x9

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    return-object p1

    :pswitch_0
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->ADD:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_1
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SCREEN:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_2
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :cond_0
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :cond_1
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :cond_2
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static q(F)I
    .locals 1

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    return p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot round NaN value."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static r(Landroid/widget/TextView;I)V
    .locals 2

    invoke-static {p1}, Lcr;->e(I)V

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    move-result v0

    if-eq p1, v0, :cond_0

    sub-int/2addr p1, v0

    int-to-float p1, p1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, p1, v0}, Landroid/widget/TextView;->setLineSpacing(FF)V

    :cond_0
    return-void
.end method

.method public static s(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    packed-switch v0, :pswitch_data_2

    goto/16 :goto_0

    :pswitch_0
    const-string v0, "kotlin.jvm.functions.Function9"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string p0, "Function9"

    return-object p0

    :pswitch_1
    const-string v0, "kotlin.jvm.functions.Function8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto/16 :goto_0

    :cond_1
    const-string p0, "Function8"

    return-object p0

    :pswitch_2
    const-string v0, "kotlin.jvm.functions.Function7"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_0

    :cond_2
    const-string p0, "Function7"

    return-object p0

    :pswitch_3
    const-string v0, "kotlin.jvm.functions.Function6"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto/16 :goto_0

    :cond_3
    const-string p0, "Function6"

    return-object p0

    :pswitch_4
    const-string v0, "kotlin.jvm.functions.Function5"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto/16 :goto_0

    :cond_4
    const-string p0, "Function5"

    return-object p0

    :pswitch_5
    const-string v0, "kotlin.jvm.functions.Function4"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto/16 :goto_0

    :cond_5
    const-string p0, "Function4"

    return-object p0

    :pswitch_6
    const-string v0, "kotlin.jvm.functions.Function3"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto/16 :goto_0

    :cond_6
    const-string p0, "Function3"

    return-object p0

    :pswitch_7
    const-string v0, "kotlin.jvm.functions.Function2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto/16 :goto_0

    :cond_7
    const-string p0, "Function2"

    return-object p0

    :pswitch_8
    const-string v0, "kotlin.jvm.functions.Function1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto/16 :goto_0

    :cond_8
    const-string p0, "Function1"

    return-object p0

    :pswitch_9
    const-string v0, "kotlin.jvm.functions.Function0"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto/16 :goto_0

    :cond_9
    const-string p0, "Function0"

    return-object p0

    :pswitch_a
    const-string v0, "kotlin.jvm.functions.Function22"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto/16 :goto_0

    :cond_a
    const-string p0, "Function22"

    return-object p0

    :pswitch_b
    const-string v0, "kotlin.jvm.functions.Function21"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto/16 :goto_0

    :cond_b
    const-string p0, "Function21"

    return-object p0

    :pswitch_c
    const-string v0, "kotlin.jvm.functions.Function20"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto/16 :goto_0

    :cond_c
    const-string p0, "Function20"

    return-object p0

    :pswitch_d
    const-string v0, "kotlin.jvm.functions.Function19"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_d

    goto/16 :goto_0

    :cond_d
    const-string p0, "Function19"

    return-object p0

    :pswitch_e
    const-string v0, "kotlin.jvm.functions.Function18"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_e

    goto/16 :goto_0

    :cond_e
    const-string p0, "Function18"

    return-object p0

    :pswitch_f
    const-string v0, "kotlin.jvm.functions.Function17"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_f

    goto/16 :goto_0

    :cond_f
    const-string p0, "Function17"

    return-object p0

    :pswitch_10
    const-string v0, "kotlin.jvm.functions.Function16"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_10

    goto/16 :goto_0

    :cond_10
    const-string p0, "Function16"

    return-object p0

    :pswitch_11
    const-string v0, "kotlin.jvm.functions.Function15"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_11

    goto/16 :goto_0

    :cond_11
    const-string p0, "Function15"

    return-object p0

    :pswitch_12
    const-string v0, "kotlin.jvm.functions.Function14"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_12

    goto/16 :goto_0

    :cond_12
    const-string p0, "Function14"

    return-object p0

    :pswitch_13
    const-string v0, "kotlin.jvm.functions.Function13"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_13

    goto/16 :goto_0

    :cond_13
    const-string p0, "Function13"

    return-object p0

    :pswitch_14
    const-string v0, "kotlin.jvm.functions.Function12"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_14

    goto/16 :goto_0

    :cond_14
    const-string p0, "Function12"

    return-object p0

    :pswitch_15
    const-string v0, "kotlin.jvm.functions.Function11"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_15

    goto/16 :goto_0

    :cond_15
    const-string p0, "Function11"

    return-object p0

    :pswitch_16
    const-string v0, "kotlin.jvm.functions.Function10"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_16

    goto/16 :goto_0

    :cond_16
    const-string p0, "Function10"

    return-object p0

    :sswitch_0
    const-string v0, "kotlin.jvm.internal.IntCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "java.lang.Throwable"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_17

    goto/16 :goto_0

    :cond_17
    const-string p0, "Throwable"

    return-object p0

    :sswitch_2
    const-string v0, "kotlin.jvm.internal.BooleanCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "java.lang.Iterable"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_18

    goto/16 :goto_0

    :cond_18
    const-string p0, "Iterable"

    return-object p0

    :sswitch_4
    const-string v0, "java.lang.String"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_19

    goto/16 :goto_0

    :cond_19
    const-string p0, "String"

    return-object p0

    :sswitch_5
    const-string v0, "java.lang.Object"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const-string p0, "Any"

    return-object p0

    :sswitch_6
    const-string v0, "java.lang.Number"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1b

    goto/16 :goto_0

    :cond_1b
    const-string p0, "Number"

    return-object p0

    :sswitch_7
    const-string v0, "java.lang.Double"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_29

    goto/16 :goto_0

    :sswitch_8
    const-string v0, "kotlin.jvm.internal.StringCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "java.util.ListIterator"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1c

    goto/16 :goto_0

    :cond_1c
    const-string p0, "ListIterator"

    return-object p0

    :sswitch_a
    const-string v0, "java.util.Iterator"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1d

    goto/16 :goto_0

    :cond_1d
    const-string p0, "Iterator"

    return-object p0

    :sswitch_b
    const-string v0, "kotlin.jvm.internal.FloatCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    goto/16 :goto_0

    :sswitch_c
    const-string v0, "java.lang.Long"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_21

    goto/16 :goto_0

    :sswitch_d
    const-string v0, "java.lang.Enum"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1e

    goto/16 :goto_0

    :cond_1e
    const-string p0, "Enum"

    return-object p0

    :sswitch_e
    const-string v0, "java.lang.Byte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_23

    goto/16 :goto_0

    :sswitch_f
    const-string v0, "java.lang.Boolean"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_20

    goto/16 :goto_0

    :sswitch_10
    const-string v0, "kotlin.jvm.internal.EnumCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    goto/16 :goto_0

    :sswitch_11
    const-string v0, "java.lang.Character"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_22

    goto/16 :goto_0

    :sswitch_12
    const-string v0, "short"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_25

    goto/16 :goto_0

    :sswitch_13
    const-string v0, "float"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_26

    goto/16 :goto_0

    :sswitch_14
    const-string v0, "kotlin.jvm.internal.ShortCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    goto/16 :goto_0

    :sswitch_15
    const-string v0, "java.util.List"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1f

    goto/16 :goto_0

    :cond_1f
    const-string p0, "List"

    return-object p0

    :sswitch_16
    const-string v0, "boolean"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_20

    goto/16 :goto_0

    :cond_20
    const-string p0, "Boolean"

    return-object p0

    :sswitch_17
    const-string v0, "long"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_21

    goto/16 :goto_0

    :cond_21
    const-string p0, "Long"

    return-object p0

    :sswitch_18
    const-string v0, "char"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_22

    goto/16 :goto_0

    :cond_22
    const-string p0, "Char"

    return-object p0

    :sswitch_19
    const-string v0, "byte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_23

    goto/16 :goto_0

    :cond_23
    const-string p0, "Byte"

    return-object p0

    :sswitch_1a
    const-string v0, "int"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2f

    goto/16 :goto_0

    :sswitch_1b
    const-string v0, "java.util.Map$Entry"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_24

    goto/16 :goto_0

    :cond_24
    const-string p0, "Entry"

    return-object p0

    :sswitch_1c
    const-string v0, "kotlin.jvm.internal.LongCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    goto/16 :goto_0

    :sswitch_1d
    const-string v0, "kotlin.jvm.internal.CharCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    goto/16 :goto_0

    :sswitch_1e
    const-string v0, "java.lang.Short"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_25

    goto/16 :goto_0

    :cond_25
    const-string p0, "Short"

    return-object p0

    :sswitch_1f
    const-string v0, "java.lang.Float"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_26

    goto/16 :goto_0

    :cond_26
    const-string p0, "Float"

    return-object p0

    :sswitch_20
    const-string v0, "java.util.Collection"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_27

    goto/16 :goto_0

    :cond_27
    const-string p0, "Collection"

    return-object p0

    :sswitch_21
    const-string v0, "java.lang.CharSequence"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_28

    goto/16 :goto_0

    :cond_28
    const-string p0, "CharSequence"

    return-object p0

    :sswitch_22
    const-string v0, "kotlin.jvm.internal.ByteCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    goto :goto_0

    :sswitch_23
    const-string v0, "double"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_29

    goto :goto_0

    :cond_29
    const-string p0, "Double"

    return-object p0

    :sswitch_24
    const-string v0, "java.util.Set"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2a

    goto :goto_0

    :cond_2a
    const-string p0, "Set"

    return-object p0

    :sswitch_25
    const-string v0, "java.util.Map"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2b

    goto :goto_0

    :cond_2b
    const-string p0, "Map"

    return-object p0

    :sswitch_26
    const-string v0, "java.lang.Comparable"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2c

    goto :goto_0

    :cond_2c
    const-string p0, "Comparable"

    return-object p0

    :sswitch_27
    const-string v0, "java.lang.annotation.Annotation"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2d

    goto :goto_0

    :cond_2d
    const-string p0, "Annotation"

    return-object p0

    :sswitch_28
    const-string v0, "java.lang.Cloneable"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2e

    goto :goto_0

    :cond_2e
    const-string p0, "Cloneable"

    return-object p0

    :sswitch_29
    const-string v0, "java.lang.Integer"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2f

    goto :goto_0

    :cond_2f
    const-string p0, "Int"

    return-object p0

    :sswitch_2a
    const-string v0, "kotlin.jvm.internal.DoubleCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_30
    const-string p0, "Companion"

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ae0c43d -> :sswitch_2a
        -0x7a988a96 -> :sswitch_29
        -0x793eea9d -> :sswitch_28
        -0x75fda146 -> :sswitch_27
        -0x5dab6ad2 -> :sswitch_26
        -0x52743c64 -> :sswitch_25
        -0x5274255e -> :sswitch_24
        -0x4f08842f -> :sswitch_23
        -0x46781814 -> :sswitch_22
        -0x3f507f75 -> :sswitch_21
        -0x2906f7a2 -> :sswitch_20
        -0x1f76ce78 -> :sswitch_1f
        -0x1ec16c58 -> :sswitch_1e
        -0xeb0f022 -> :sswitch_1d
        -0xc5a9408 -> :sswitch_1c
        -0x9d7d2b6 -> :sswitch_1b
        0x197ef -> :sswitch_1a
        0x2e6108 -> :sswitch_19
        0x2e9356 -> :sswitch_18
        0x32c67c -> :sswitch_17
        0x3db6c28 -> :sswitch_16
        0x3ec5a5e -> :sswitch_15
        0x49a71c6 -> :sswitch_14
        0x5d0225c -> :sswitch_13
        0x685847c -> :sswitch_12
        0x9415455 -> :sswitch_11
        0xd7b22d3 -> :sswitch_10
        0x148d6054 -> :sswitch_f
        0x17c0bc5c -> :sswitch_e
        0x17c1f055 -> :sswitch_d
        0x17c521d0 -> :sswitch_c
        0x1cc457e6 -> :sswitch_b
        0x1dcad22e -> :sswitch_a
        0x226988ec -> :sswitch_9
        0x23b44f83 -> :sswitch_8
        0x2d605225 -> :sswitch_7
        0x3ec1b19d -> :sswitch_6
        0x3f697993 -> :sswitch_5
        0x473e3665 -> :sswitch_4
        0x4c0855c6 -> :sswitch_3
        0x52797ada -> :sswitch_2
        0x612cf26c -> :sswitch_1
        0x6fe35bb3 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch -0x6bf3d83c
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
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x6bf3d81d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x4c695eb
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

.method public static final t(Lox;Lox;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 3

    sget-object v0, LGu;->c:Lv1;

    const/4 v1, 0x0

    const/4 v2, 0x2

    :try_start_0
    invoke-static {v2, p2}, LTB;->c(ILjava/lang/Object;)V

    invoke-interface {p2, p1, p0}, Lkotlin/jvm/functions/Function2;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Lde; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_5

    :goto_0
    new-instance p2, LEa;

    invoke-direct {p2, p1, v1}, LEa;-><init>(Ljava/lang/Throwable;Z)V

    move-object p1, p2

    :goto_1
    sget-object p2, Lgc;->a:Lgc;

    if-ne p1, p2, :cond_0

    goto :goto_4

    :cond_0
    invoke-virtual {p0, p1}, Lkm;->E(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    goto :goto_4

    :cond_1
    invoke-virtual {p0}, Lox;->O()V

    instance-of p0, p1, LEa;

    if-nez p0, :cond_5

    instance-of p0, p1, Lgl;

    if-eqz p0, :cond_2

    move-object p0, p1

    check-cast p0, Lgl;

    goto :goto_2

    :cond_2
    const/4 p0, 0x0

    :goto_2
    if-eqz p0, :cond_4

    iget-object p0, p0, Lgl;->a:Lfl;

    if-nez p0, :cond_3

    goto :goto_3

    :cond_3
    move-object p2, p0

    goto :goto_4

    :cond_4
    :goto_3
    move-object p2, p1

    :goto_4
    return-object p2

    :cond_5
    check-cast p1, LEa;

    iget-object p0, p1, LEa;->a:Ljava/lang/Throwable;

    throw p0

    :goto_5
    new-instance p2, LEa;

    iget-object p1, p1, Lde;->a:Ljava/lang/Throwable;

    invoke-direct {p2, p1, v1}, LEa;-><init>(Ljava/lang/Throwable;Z)V

    :goto_6
    sget-object v1, Lkm;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1, p2}, Lkm;->M(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LGu;->b:Lv1;

    if-eq v1, v2, :cond_7

    if-eq v1, v0, :cond_7

    sget-object v2, LGu;->d:Lv1;

    if-ne v1, v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {p0, v1}, Lox;->b(Ljava/lang/Object;)V

    :cond_7
    throw p1
.end method

.method public static final u(LEb;)Ljava/lang/String;
    .locals 3

    instance-of v0, p0, Lee;

    if-eqz v0, :cond_0

    check-cast p0, Lee;

    invoke-virtual {p0}, Lee;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 v0, 0x40

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, LDc;->l(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    new-instance v2, LGw;

    invoke-direct {v2, v1}, LGw;-><init>(Ljava/lang/Throwable;)V

    move-object v1, v2

    :goto_0
    invoke-static {v1}, LHw;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, LDc;->l(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_1
    check-cast v1, Ljava/lang/String;

    return-object v1
.end method

.method public static final v(B)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const-string p0, "quotation mark \'\"\'"

    return-object p0

    :cond_0
    const/4 v0, 0x2

    if-ne p0, v0, :cond_1

    const-string p0, "string escape sequence \'\\\'"

    return-object p0

    :cond_1
    const/4 v0, 0x4

    if-ne p0, v0, :cond_2

    const-string p0, "comma \',\'"

    return-object p0

    :cond_2
    const/4 v0, 0x5

    if-ne p0, v0, :cond_3

    const-string p0, "colon \':\'"

    return-object p0

    :cond_3
    const/4 v0, 0x6

    if-ne p0, v0, :cond_4

    const-string p0, "start of the object \'{\'"

    return-object p0

    :cond_4
    const/4 v0, 0x7

    if-ne p0, v0, :cond_5

    const-string p0, "end of the object \'}\'"

    return-object p0

    :cond_5
    const/16 v0, 0x8

    if-ne p0, v0, :cond_6

    const-string p0, "start of the array \'[\'"

    return-object p0

    :cond_6
    const/16 v0, 0x9

    if-ne p0, v0, :cond_7

    const-string p0, "end of the array \']\'"

    return-object p0

    :cond_7
    const/16 v0, 0xa

    if-ne p0, v0, :cond_8

    const-string p0, "end of the input"

    return-object p0

    :cond_8
    const/16 v0, 0x7f

    if-ne p0, v0, :cond_9

    const-string p0, "invalid token"

    return-object p0

    :cond_9
    const-string p0, "valid token"

    return-object p0
.end method

.method public static final w(LEb;Lac;Ljava/lang/Object;)LwC;
    .locals 2

    instance-of v0, p0, Lhc;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, LxC;->a:LxC;

    invoke-interface {p1, v0}, Lac;->m(LZb;)LYb;

    move-result-object v0

    if-eqz v0, :cond_4

    check-cast p0, Lhc;

    :cond_1
    instance-of v0, p0, Lfe;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {p0}, Lhc;->c()Lhc;

    move-result-object p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    instance-of v0, p0, LwC;

    if-eqz v0, :cond_1

    move-object v1, p0

    check-cast v1, LwC;

    :goto_0
    if-eqz v1, :cond_4

    invoke-virtual {v1, p1, p2}, LwC;->R(Lac;Ljava/lang/Object;)V

    :cond_4
    :goto_1
    return-object v1
.end method

.method public static x(IIII)Z
    .locals 4

    const/4 v0, 0x4

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq p2, v2, :cond_1

    if-eq p2, v1, :cond_1

    if-ne p2, v0, :cond_0

    if-eq p0, v1, :cond_0

    goto :goto_0

    :cond_0
    move p0, v3

    goto :goto_1

    :cond_1
    :goto_0
    move p0, v2

    :goto_1
    if-eq p3, v2, :cond_3

    if-eq p3, v1, :cond_3

    if-ne p3, v0, :cond_2

    if-eq p1, v1, :cond_2

    goto :goto_2

    :cond_2
    move p1, v3

    goto :goto_3

    :cond_3
    :goto_2
    move p1, v2

    :goto_3
    if-nez p0, :cond_5

    if-eqz p1, :cond_4

    goto :goto_4

    :cond_4
    return v3

    :cond_5
    :goto_4
    return v2
.end method

.method public static y(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    invoke-static {p0, p1, p2, p3, v0}, LDc;->z(Landroid/content/Context;Landroid/util/AttributeSet;II[I)Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method public static z(Landroid/content/Context;Landroid/util/AttributeSet;II[I)Landroid/content/Context;
    .locals 6

    const/4 v0, 0x1

    new-array v1, v0, [I

    sget-object v2, LDc;->i:[I

    invoke-virtual {p0, p1, v2, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    aput v4, v1, v3

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    aget v1, v1, v3

    instance-of v2, p0, LDb;

    if-eqz v2, :cond_0

    move-object v2, p0

    check-cast v2, LDb;

    iget v2, v2, LDb;->a:I

    if-ne v2, v1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    if-eqz v1, :cond_8

    if-eqz v2, :cond_1

    goto :goto_4

    :cond_1
    new-instance v2, LDb;

    invoke-direct {v2, p0, v1}, LDb;-><init>(Landroid/content/Context;I)V

    array-length v1, p4

    new-array v4, v1, [I

    array-length v5, p4

    if-lez v5, :cond_3

    invoke-virtual {p0, p1, p4, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    move p3, v3

    :goto_1
    array-length v5, p4

    if-ge p3, v5, :cond_2

    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    aput v5, v4, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    :cond_3
    move p2, v3

    :goto_2
    if-ge p2, v1, :cond_5

    aget p3, v4, p2

    if-eqz p3, :cond_4

    invoke-virtual {v2}, LDb;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p4

    invoke-virtual {p4, p3, v0}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_4
    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_5
    sget-object p2, LDc;->h:[I

    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p0

    invoke-virtual {p0, v3, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    invoke-virtual {p0, v0, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p1, :cond_6

    goto :goto_3

    :cond_6
    move p1, p2

    :goto_3
    if-eqz p1, :cond_7

    invoke-virtual {v2}, LDb;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    invoke-virtual {p0, p1, v0}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_7
    return-object v2

    :cond_8
    :goto_4
    return-object p0
.end method
