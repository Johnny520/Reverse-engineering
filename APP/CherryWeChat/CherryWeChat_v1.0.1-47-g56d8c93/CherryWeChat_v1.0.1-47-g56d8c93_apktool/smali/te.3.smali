.class public final Lte;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final f:Lut;

.field public static final g:Lut;

.field public static final h:Lut;

.field public static final i:Lut;

.field public static final j:Lm6;

.field public static final k:Ljava/util/ArrayDeque;


# instance fields
.field public final a:LN5;

.field public final b:Landroid/util/DisplayMetrics;

.field public final c:Lzp;

.field public final d:Ljava/util/ArrayList;

.field public final e:Lpk;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat"

    sget-object v1, LEc;->c:LEc;

    invoke-static {v0, v1}, Lut;->a(Ljava/lang/String;Ljava/lang/Object;)Lut;

    move-result-object v0

    sput-object v0, Lte;->f:Lut;

    new-instance v0, Lut;

    const/4 v1, 0x0

    sget-object v2, Lut;->e:LPg;

    const-string v3, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace"

    invoke-direct {v0, v3, v1, v2}, Lut;-><init>(Ljava/lang/String;Ljava/lang/Object;Ltt;)V

    sput-object v0, Lte;->g:Lut;

    sget-object v0, Lre;->b:Lre;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize"

    invoke-static {v1, v0}, Lut;->a(Ljava/lang/String;Ljava/lang/Object;)Lut;

    move-result-object v1

    sput-object v1, Lte;->h:Lut;

    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode"

    invoke-static {v1, v0}, Lut;->a(Ljava/lang/String;Ljava/lang/Object;)Lut;

    move-result-object v0

    sput-object v0, Lte;->i:Lut;

    new-instance v0, Ljava/util/HashSet;

    const-string v1, "image/vnd.wap.wbmp"

    const-string v2, "image/x-ico"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    new-instance v0, Lm6;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lm6;-><init>(I)V

    sput-object v0, Lte;->j:Lm6;

    sget-object v0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->JPEG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    sget-object v1, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG_A:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    sget-object v2, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    sget-object v0, LvD;->a:[C

    new-instance v0, Ljava/util/ArrayDeque;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    sput-object v0, Lte;->k:Ljava/util/ArrayDeque;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Landroid/util/DisplayMetrics;LN5;Lzp;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lpk;->a()Lpk;

    move-result-object v0

    iput-object v0, p0, Lte;->e:Lpk;

    iput-object p1, p0, Lte;->d:Ljava/util/ArrayList;

    const-string p1, "Argument must not be null"

    invoke-static {p1, p2}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p2, p0, Lte;->b:Landroid/util/DisplayMetrics;

    invoke-static {p1, p3}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p3, p0, Lte;->a:LN5;

    invoke-static {p1, p4}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p4, p0, Lte;->c:Lzp;

    return-void
.end method

.method public static c(Lw4;Landroid/graphics/BitmapFactory$Options;Lse;LN5;)Landroid/graphics/Bitmap;
    .locals 4

    iget-boolean v0, p1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    if-nez v0, :cond_0

    invoke-interface {p2}, Lse;->f()V

    iget v0, p0, Lw4;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v0, LD2;

    iget-object v0, v0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Ldv;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Ldv;->a:[B

    array-length v1, v1

    iput v1, v0, Ldv;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    :cond_0
    :goto_0
    :pswitch_1
    iget v0, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v1, p1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iget-object v2, p1, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    sget-object v3, LEB;->d:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_2
    invoke-virtual {p0, p1}, Lw4;->k(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p0
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object p0

    :catch_0
    move-exception v3

    :try_start_3
    invoke-static {v3, v0, v1, v2, p1}, Lte;->e(Ljava/lang/IllegalArgumentException;IILjava/lang/String;Landroid/graphics/BitmapFactory$Options;)Ljava/io/IOException;

    move-result-object v0

    iget-object v1, p1, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v1, :cond_1

    :try_start_4
    invoke-interface {p3, v1}, LN5;->h(Landroid/graphics/Bitmap;)V

    const/4 v1, 0x0

    iput-object v1, p1, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    invoke-static {p0, p1, p2, p3}, Lte;->c(Lw4;Landroid/graphics/BitmapFactory$Options;Lse;LN5;)Landroid/graphics/Bitmap;

    move-result-object p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    sget-object p1, LEB;->d:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object p0

    :catch_1
    :try_start_5
    throw v0

    :cond_1
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception p0

    sget-object p1, LEB;->d:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static d(Landroid/graphics/Bitmap;)Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ljava/lang/IllegalArgumentException;IILjava/lang/String;Landroid/graphics/BitmapFactory$Options;)Ljava/io/IOException;
    .locals 3

    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Exception decoding bitmap, outWidth: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", outHeight: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", outMimeType: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", inBitmap: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p4, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    invoke-static {p1}, Lte;->d(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static f(Landroid/graphics/BitmapFactory$Options;)V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->inTempStorage:[B

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    iput-boolean v1, p0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    const/4 v2, 0x1

    iput v2, p0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    iput-boolean v1, p0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->inPreferredColorSpace:Landroid/graphics/ColorSpace;

    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->outColorSpace:Landroid/graphics/ColorSpace;

    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->outConfig:Landroid/graphics/Bitmap$Config;

    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    iput-boolean v2, p0, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    return-void
.end method


# virtual methods
.method public final a(Lw4;IILvt;Lse;)LO5;
    .locals 14

    move-object/from16 v0, p4

    iget-object v2, p0, Lte;->c:Lzp;

    const/high16 v3, 0x10000

    const-class v4, [B

    invoke-virtual {v2, v3, v4}, Lzp;->c(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, [B

    const-class v2, Lte;

    monitor-enter v2

    :try_start_0
    sget-object v13, Lte;->k:Ljava/util/ArrayDeque;

    monitor-enter v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v13}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/BitmapFactory$Options;

    monitor-exit v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    if-nez v3, :cond_0

    :try_start_2
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    invoke-static {v3}, Lte;->f(Landroid/graphics/BitmapFactory$Options;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_0
    :goto_0
    monitor-exit v2

    iput-object v12, v3, Landroid/graphics/BitmapFactory$Options;->inTempStorage:[B

    sget-object v2, Lte;->f:Lut;

    invoke-virtual {v0, v2}, Lvt;->c(Lut;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, LEc;

    sget-object v2, Lte;->g:Lut;

    invoke-virtual {v0, v2}, Lvt;->c(Lut;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Leu;

    sget-object v2, Lre;->g:Lut;

    invoke-virtual {v0, v2}, Lvt;->c(Lut;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lre;

    sget-object v2, Lte;->h:Lut;

    invoke-virtual {v0, v2}, Lvt;->c(Lut;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    sget-object v2, Lte;->i:Lut;

    invoke-virtual {v0, v2}, Lvt;->c(Lut;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_1

    invoke-virtual {v0, v2}, Lvt;->c(Lut;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move/from16 v8, p2

    move/from16 v9, p3

    move-object/from16 v11, p5

    move v7, v0

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :goto_2
    :try_start_3
    invoke-virtual/range {v1 .. v11}, Lte;->b(Lw4;Landroid/graphics/BitmapFactory$Options;Lre;LEc;Leu;ZIIZLse;)Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v2, p0, Lte;->a:LN5;

    invoke-static {v2, v0}, LO5;->c(LN5;Landroid/graphics/Bitmap;)LO5;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-static {v3}, Lte;->f(Landroid/graphics/BitmapFactory$Options;)V

    monitor-enter v13

    :try_start_4
    invoke-virtual {v13, v3}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    monitor-exit v13
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    iget-object v2, p0, Lte;->c:Lzp;

    invoke-virtual {v2, v12}, Lzp;->g(Ljava/lang/Object;)V

    return-object v0

    :catchall_1
    move-exception v0

    :try_start_5
    monitor-exit v13
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0

    :catchall_2
    move-exception v0

    invoke-static {v3}, Lte;->f(Landroid/graphics/BitmapFactory$Options;)V

    sget-object v4, Lte;->k:Ljava/util/ArrayDeque;

    monitor-enter v4

    :try_start_6
    invoke-virtual {v4, v3}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    iget-object v2, p0, Lte;->c:Lzp;

    invoke-virtual {v2, v12}, Lzp;->g(Ljava/lang/Object;)V

    throw v0

    :catchall_3
    move-exception v0

    :try_start_7
    monitor-exit v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw v0

    :catchall_4
    move-exception v0

    :try_start_8
    monitor-exit v13
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :try_start_9
    throw v0

    :goto_3
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    throw v0
.end method

.method public final b(Lw4;Landroid/graphics/BitmapFactory$Options;Lre;LEc;Leu;ZIIZLse;)Landroid/graphics/Bitmap;
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v5, p10

    sget v6, Lhp;->a:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    const/4 v6, 0x1

    iput-boolean v6, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    iget-object v7, v1, Lte;->a:LN5;

    invoke-static {v0, v2, v5, v7}, Lte;->c(Lw4;Landroid/graphics/BitmapFactory$Options;Lse;LN5;)Landroid/graphics/Bitmap;

    const/4 v8, 0x0

    iput-boolean v8, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    iget v9, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v10, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    filled-new-array {v9, v10}, [I

    move-result-object v9

    aget v10, v9, v8

    aget v9, v9, v6

    const/4 v11, -0x1

    if-eq v10, v11, :cond_1

    if-ne v9, v11, :cond_0

    goto :goto_0

    :cond_0
    move/from16 v12, p6

    goto :goto_1

    :cond_1
    :goto_0
    move v12, v8

    :goto_1
    iget v13, v0, Lw4;->a:I

    packed-switch v13, :pswitch_data_0

    iget-object v13, v0, Lw4;->c:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    iget-object v15, v0, Lw4;->d:Ljava/lang/Object;

    check-cast v15, Lcom/bumptech/glide/load/data/a;

    iget-object v14, v0, Lw4;->b:Ljava/lang/Object;

    check-cast v14, Lzp;

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v6

    :goto_2
    if-ge v8, v6, :cond_4

    invoke-interface {v13, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v11, v17

    check-cast v11, Ldl;

    move/from16 v17, v6

    :try_start_0
    new-instance v6, Ldv;

    move/from16 v19, v8

    new-instance v8, Ljava/io/FileInputStream;

    invoke-virtual {v15}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    move-result-object v20

    move-object/from16 v21, v13

    invoke-virtual/range {v20 .. v20}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v13

    invoke-direct {v8, v13}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    invoke-direct {v6, v8, v14}, Ldv;-><init>(Ljava/io/InputStream;Lzp;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {v11, v6, v14}, Ldl;->b(Ljava/io/InputStream;Lzp;)I

    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v6}, Ldv;->f()V

    invoke-virtual {v15}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    const/4 v6, -0x1

    if-eq v8, v6, :cond_2

    move v11, v8

    goto/16 :goto_6

    :cond_2
    add-int/lit8 v8, v19, 0x1

    move/from16 v6, v17

    move-object/from16 v13, v21

    const/4 v11, -0x1

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v14, v6

    goto :goto_3

    :catchall_1
    move-exception v0

    const/4 v14, 0x0

    :goto_3
    if-eqz v14, :cond_3

    invoke-virtual {v14}, Ldv;->f()V

    :cond_3
    invoke-virtual {v15}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    throw v0

    :cond_4
    const/4 v11, -0x1

    goto :goto_6

    :pswitch_0
    iget-object v6, v0, Lw4;->d:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v8, v0, Lw4;->b:Ljava/lang/Object;

    check-cast v8, LD2;

    iget-object v8, v8, LD2;->b:Ljava/lang/Object;

    check-cast v8, Ldv;

    invoke-virtual {v8}, Ldv;->reset()V

    iget-object v11, v0, Lw4;->c:Ljava/lang/Object;

    check-cast v11, Lzp;

    invoke-static {v6, v8, v11}, LfG;->V(Ljava/util/List;Ljava/io/InputStream;Lzp;)I

    move-result v11

    goto :goto_6

    :pswitch_1
    iget-object v6, v0, Lw4;->c:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v8, v0, Lw4;->b:Ljava/lang/Object;

    check-cast v8, Ljava/nio/ByteBuffer;

    invoke-static {v8}, Lt6;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v8

    iget-object v11, v0, Lw4;->d:Ljava/lang/Object;

    check-cast v11, Lzp;

    if-nez v8, :cond_6

    :cond_5
    const/4 v6, -0x1

    goto :goto_5

    :cond_6
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v13

    const/4 v14, 0x0

    :goto_4
    if-ge v14, v13, :cond_5

    invoke-interface {v6, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ldl;

    :try_start_2
    invoke-interface {v15, v8, v11}, Ldl;->d(Ljava/nio/ByteBuffer;Lzp;)I

    move-result v15
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object/from16 v17, v6

    const/4 v6, 0x0

    invoke-virtual {v8, v6}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v16

    check-cast v16, Ljava/nio/ByteBuffer;

    const/4 v6, -0x1

    if-eq v15, v6, :cond_7

    move v11, v15

    goto :goto_6

    :cond_7
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v6, v17

    goto :goto_4

    :catchall_2
    move-exception v0

    const/4 v6, 0x0

    invoke-virtual {v8, v6}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v2

    check-cast v2, Ljava/nio/ByteBuffer;

    throw v0

    :goto_5
    move v11, v6

    :goto_6
    const/16 v6, 0x5a

    packed-switch v11, :pswitch_data_1

    const/4 v13, 0x0

    goto :goto_7

    :pswitch_2
    const/16 v13, 0x10e

    goto :goto_7

    :pswitch_3
    move v13, v6

    goto :goto_7

    :pswitch_4
    const/16 v13, 0xb4

    :goto_7
    packed-switch v11, :pswitch_data_2

    const/4 v14, 0x0

    goto :goto_8

    :pswitch_5
    const/4 v14, 0x1

    :goto_8
    const/high16 v15, -0x80000000

    move/from16 v8, p7

    if-ne v8, v15, :cond_9

    const/16 v8, 0x10e

    if-eq v13, v6, :cond_a

    if-ne v13, v8, :cond_8

    goto :goto_a

    :cond_8
    move v8, v10

    :cond_9
    :goto_9
    move/from16 v18, v11

    move/from16 v11, p8

    goto :goto_b

    :cond_a
    :goto_a
    move v8, v9

    goto :goto_9

    :goto_b
    if-ne v11, v15, :cond_d

    if-eq v13, v6, :cond_c

    const/16 v11, 0x10e

    if-ne v13, v11, :cond_b

    goto :goto_c

    :cond_b
    move v11, v9

    goto :goto_d

    :cond_c
    :goto_c
    move v11, v10

    :cond_d
    :goto_d
    invoke-virtual {v0}, Lw4;->t()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v15

    const-string v6, "Downsampler"

    if-lez v10, :cond_e

    if-gtz v9, :cond_f

    :cond_e
    move v4, v9

    move v3, v10

    move/from16 v17, v12

    move/from16 v19, v14

    const/high16 p8, 0x3f800000    # 1.0f

    const/4 v1, 0x3

    goto/16 :goto_18

    :cond_f
    const/high16 p8, 0x3f800000    # 1.0f

    const/16 v4, 0x5a

    if-eq v13, v4, :cond_11

    const/16 v4, 0x10e

    if-ne v13, v4, :cond_10

    goto :goto_f

    :cond_10
    move v13, v9

    move v4, v10

    :goto_e
    move/from16 v17, v12

    goto :goto_10

    :cond_11
    :goto_f
    move v4, v9

    move v13, v10

    goto :goto_e

    :goto_10
    invoke-virtual {v3, v4, v13, v8, v11}, Lre;->b(IIII)F

    move-result v12

    const/16 v19, 0x0

    cmpg-float v19, v12, v19

    if-lez v19, :cond_1f

    move/from16 v19, v14

    invoke-virtual {v3, v4, v13, v8, v11}, Lre;->a(IIII)I

    move-result v14

    if-eqz v14, :cond_1e

    int-to-float v1, v4

    move/from16 v20, v1

    mul-float v1, v12, v20

    move/from16 v22, v9

    move/from16 v21, v10

    float-to-double v9, v1

    const-wide/high16 v23, 0x3fe0000000000000L    # 0.5

    add-double v9, v9, v23

    double-to-int v1, v9

    int-to-float v9, v13

    mul-float v10, v12, v9

    move/from16 v25, v9

    float-to-double v9, v10

    add-double v9, v9, v23

    double-to-int v9, v9

    div-int v1, v4, v1

    div-int v9, v13, v9

    const/4 v10, 0x1

    if-ne v14, v10, :cond_12

    invoke-static {v1, v9}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_11

    :cond_12
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    move-result v1

    :goto_11
    invoke-static {v1}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v1

    invoke-static {v10, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ne v14, v10, :cond_13

    int-to-float v9, v1

    div-float v10, p8, v12

    cmpg-float v9, v9, v10

    if-gez v9, :cond_13

    shl-int/lit8 v1, v1, 0x1

    :cond_13
    iput v1, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    sget-object v9, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->JPEG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-ne v15, v9, :cond_14

    const/16 v4, 0x8

    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v9

    int-to-float v9, v9

    div-float v10, v20, v9

    float-to-double v12, v10

    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v12

    double-to-int v10, v12

    div-float v9, v25, v9

    float-to-double v12, v9

    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v12

    double-to-int v9, v12

    div-int/2addr v1, v4

    if-lez v1, :cond_1a

    div-int/2addr v10, v1

    div-int/2addr v9, v1

    goto :goto_14

    :cond_14
    sget-object v9, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-eq v15, v9, :cond_19

    sget-object v9, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG_A:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-ne v15, v9, :cond_15

    goto :goto_13

    :cond_15
    invoke-virtual {v15}, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->isWebp()Z

    move-result v9

    if-eqz v9, :cond_16

    int-to-float v1, v1

    div-float v4, v20, v1

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v10

    div-float v9, v25, v1

    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    move-result v9

    goto :goto_14

    :cond_16
    rem-int v9, v4, v1

    if-nez v9, :cond_17

    rem-int v9, v13, v1

    if-eqz v9, :cond_18

    :cond_17
    const/4 v10, 0x1

    goto :goto_12

    :cond_18
    div-int v10, v4, v1

    div-int v9, v13, v1

    goto :goto_14

    :goto_12
    iput-boolean v10, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-static {v0, v2, v5, v7}, Lte;->c(Lw4;Landroid/graphics/BitmapFactory$Options;Lse;LN5;)Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    iput-boolean v1, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    iget v4, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v9, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    filled-new-array {v4, v9}, [I

    move-result-object v4

    aget v9, v4, v1

    aget v1, v4, v10

    move v10, v9

    move v9, v1

    goto :goto_14

    :cond_19
    :goto_13
    int-to-float v1, v1

    div-float v4, v20, v1

    float-to-double v9, v4

    invoke-static {v9, v10}, Ljava/lang/Math;->floor(D)D

    move-result-wide v9

    double-to-int v10, v9

    div-float v9, v25, v1

    float-to-double v12, v9

    invoke-static {v12, v13}, Ljava/lang/Math;->floor(D)D

    move-result-wide v12

    double-to-int v9, v12

    :cond_1a
    :goto_14
    invoke-virtual {v3, v10, v9, v8, v11}, Lre;->b(IIII)F

    move-result v1

    float-to-double v3, v1

    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    cmpg-double v1, v3, v9

    if-gtz v1, :cond_1b

    move-wide v12, v3

    goto :goto_15

    :cond_1b
    div-double v12, v9, v3

    :goto_15
    const-wide v14, 0x41dfffffffc00000L    # 2.147483647E9

    mul-double/2addr v12, v14

    invoke-static {v12, v13}, Ljava/lang/Math;->round(D)J

    move-result-wide v12

    long-to-int v12, v12

    move-wide/from16 v25, v9

    int-to-double v9, v12

    mul-double/2addr v9, v3

    add-double v9, v9, v23

    double-to-int v9, v9

    int-to-float v10, v9

    int-to-float v12, v12

    div-float/2addr v10, v12

    float-to-double v12, v10

    div-double v12, v3, v12

    int-to-double v9, v9

    mul-double/2addr v12, v9

    add-double v12, v12, v23

    double-to-int v9, v12

    iput v9, v2, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    if-gtz v1, :cond_1c

    goto :goto_16

    :cond_1c
    div-double v3, v25, v3

    :goto_16
    mul-double/2addr v3, v14

    invoke-static {v3, v4}, Ljava/lang/Math;->round(D)J

    move-result-wide v3

    long-to-int v1, v3

    iput v1, v2, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    iget v3, v2, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    if-lez v3, :cond_1d

    if-lez v1, :cond_1d

    if-eq v3, v1, :cond_1d

    const/4 v10, 0x1

    iput-boolean v10, v2, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    goto :goto_17

    :cond_1d
    const/4 v1, 0x0

    iput v1, v2, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    iput v1, v2, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    :goto_17
    move-object/from16 v1, p0

    move/from16 v3, v21

    move/from16 v4, v22

    goto :goto_19

    :cond_1e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot round with null rounding"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1f
    move/from16 v22, v9

    move/from16 v21, v10

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot scale with factor: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, " from: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", source: ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v3, v21

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v4, v22

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "], target: ["

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_18
    invoke-static {v6, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v9

    if-eqz v9, :cond_20

    invoke-static {v15}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_20
    move-object/from16 v1, p0

    :goto_19
    iget-object v9, v1, Lte;->e:Lpk;

    move/from16 v10, v17

    move/from16 v12, v19

    invoke-virtual {v9, v8, v11, v10, v12}, Lpk;->c(IIZZ)Z

    move-result v9

    if-eqz v9, :cond_21

    sget-object v10, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    iput-object v10, v2, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    const/4 v10, 0x0

    iput-boolean v10, v2, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    goto :goto_1a

    :cond_21
    const/4 v10, 0x0

    :goto_1a
    if-eqz v9, :cond_23

    :cond_22
    const/4 v9, 0x1

    goto :goto_1d

    :cond_23
    sget-object v9, LEc;->a:LEc;

    move-object/from16 v12, p4

    if-eq v12, v9, :cond_26

    :try_start_3
    invoke-virtual {v0}, Lw4;->t()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v9

    invoke-virtual {v9}, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->hasAlpha()Z

    move-result v9
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1b

    :catch_0
    const/4 v9, 0x3

    invoke-static {v6, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v9

    if-eqz v9, :cond_24

    invoke-static {v12}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_24
    move v9, v10

    :goto_1b
    if-eqz v9, :cond_25

    sget-object v9, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_1c

    :cond_25
    sget-object v9, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    :goto_1c
    iput-object v9, v2, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    sget-object v12, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    if-ne v9, v12, :cond_22

    const/4 v9, 0x1

    iput-boolean v9, v2, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    goto :goto_1d

    :cond_26
    const/4 v9, 0x1

    sget-object v12, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v12, v2, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    :goto_1d
    if-ltz v3, :cond_27

    if-ltz v4, :cond_27

    if-eqz p9, :cond_27

    goto :goto_20

    :cond_27
    iget v8, v2, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    if-lez v8, :cond_28

    iget v11, v2, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    if-lez v11, :cond_28

    if-eq v8, v11, :cond_28

    move v11, v9

    goto :goto_1e

    :cond_28
    move v11, v10

    :goto_1e
    if-eqz v11, :cond_29

    int-to-float v8, v8

    iget v11, v2, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    int-to-float v11, v11

    div-float/2addr v8, v11

    goto :goto_1f

    :cond_29
    move/from16 v8, p8

    :goto_1f
    iget v11, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    int-to-float v3, v3

    int-to-float v11, v11

    div-float/2addr v3, v11

    float-to-double v12, v3

    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v12

    double-to-int v3, v12

    int-to-float v4, v4

    div-float/2addr v4, v11

    float-to-double v11, v4

    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v11

    double-to-int v4, v11

    int-to-float v3, v3

    mul-float/2addr v3, v8

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    int-to-float v4, v4

    mul-float/2addr v4, v8

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v11

    move v8, v3

    :goto_20
    if-lez v8, :cond_2c

    if-lez v11, :cond_2c

    iget-object v3, v2, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    sget-object v4, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    if-ne v3, v4, :cond_2a

    goto :goto_22

    :cond_2a
    iget-object v4, v2, Landroid/graphics/BitmapFactory$Options;->outConfig:Landroid/graphics/Bitmap$Config;

    if-nez v4, :cond_2b

    goto :goto_21

    :cond_2b
    move-object v3, v4

    :goto_21
    invoke-interface {v7, v8, v11, v3}, LN5;->e(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    iput-object v3, v2, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    :cond_2c
    :goto_22
    if-eqz p5, :cond_2f

    sget-object v3, Leu;->a:Leu;

    move-object/from16 v4, p5

    if-ne v4, v3, :cond_2d

    iget-object v3, v2, Landroid/graphics/BitmapFactory$Options;->outColorSpace:Landroid/graphics/ColorSpace;

    if-eqz v3, :cond_2d

    invoke-virtual {v3}, Landroid/graphics/ColorSpace;->isWideGamut()Z

    move-result v3

    if-eqz v3, :cond_2d

    goto :goto_23

    :cond_2d
    move v9, v10

    :goto_23
    if-eqz v9, :cond_2e

    sget-object v3, Landroid/graphics/ColorSpace$Named;->DISPLAY_P3:Landroid/graphics/ColorSpace$Named;

    goto :goto_24

    :cond_2e
    sget-object v3, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    :goto_24
    invoke-static {v3}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v3

    iput-object v3, v2, Landroid/graphics/BitmapFactory$Options;->inPreferredColorSpace:Landroid/graphics/ColorSpace;

    :cond_2f
    invoke-static {v0, v2, v5, v7}, Lte;->c(Lw4;Landroid/graphics/BitmapFactory$Options;Lse;LN5;)Landroid/graphics/Bitmap;

    move-result-object v8

    invoke-interface {v5, v7, v8}, Lse;->c(LN5;Landroid/graphics/Bitmap;)V

    const/4 v0, 0x2

    invoke-static {v6, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_30

    invoke-static {v8}, Lte;->d(Landroid/graphics/Bitmap;)Ljava/lang/String;

    iget-object v0, v2, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lte;->d(Landroid/graphics/Bitmap;)Ljava/lang/String;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    :cond_30
    if-eqz v8, :cond_31

    iget-object v0, v1, Lte;->b:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    invoke-virtual {v8, v0}, Landroid/graphics/Bitmap;->setDensity(I)V

    packed-switch v18, :pswitch_data_3

    move-object v14, v8

    goto :goto_26

    :pswitch_6
    new-instance v13, Landroid/graphics/Matrix;

    invoke-direct {v13}, Landroid/graphics/Matrix;-><init>()V

    const/high16 v0, 0x43340000    # 180.0f

    const/high16 v2, 0x42b40000    # 90.0f

    const/high16 v3, -0x3d4c0000    # -90.0f

    const/high16 v4, -0x40800000    # -1.0f

    packed-switch v18, :pswitch_data_4

    goto :goto_25

    :pswitch_7
    invoke-virtual {v13, v3}, Landroid/graphics/Matrix;->setRotate(F)V

    goto :goto_25

    :pswitch_8
    invoke-virtual {v13, v3}, Landroid/graphics/Matrix;->setRotate(F)V

    move/from16 v3, p8

    invoke-virtual {v13, v4, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    goto :goto_25

    :pswitch_9
    invoke-virtual {v13, v2}, Landroid/graphics/Matrix;->setRotate(F)V

    goto :goto_25

    :pswitch_a
    move/from16 v3, p8

    invoke-virtual {v13, v2}, Landroid/graphics/Matrix;->setRotate(F)V

    invoke-virtual {v13, v4, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    goto :goto_25

    :pswitch_b
    move/from16 v3, p8

    invoke-virtual {v13, v0}, Landroid/graphics/Matrix;->setRotate(F)V

    invoke-virtual {v13, v4, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    goto :goto_25

    :pswitch_c
    invoke-virtual {v13, v0}, Landroid/graphics/Matrix;->setRotate(F)V

    goto :goto_25

    :pswitch_d
    move/from16 v3, p8

    invoke-virtual {v13, v4, v3}, Landroid/graphics/Matrix;->setScale(FF)V

    :goto_25
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v11

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v12

    const/4 v14, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v8 .. v14}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v14, v0

    :goto_26
    invoke-virtual {v8, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_32

    invoke-interface {v7, v8}, LN5;->h(Landroid/graphics/Bitmap;)V

    goto :goto_27

    :cond_31
    const/4 v14, 0x0

    :cond_32
    :goto_27
    return-object v14

    nop

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x2
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x2
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch
.end method
