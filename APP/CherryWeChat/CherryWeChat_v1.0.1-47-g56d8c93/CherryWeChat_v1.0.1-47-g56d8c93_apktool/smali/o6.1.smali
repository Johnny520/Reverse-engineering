.class public final Lo6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lsw;


# static fields
.field public static final f:Lm6;

.field public static final g:Ln6;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ln6;

.field public final d:Lm6;

.field public final e:LP3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm6;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lm6;-><init>(I)V

    sput-object v0, Lo6;->f:Lm6;

    new-instance v0, Ln6;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln6;-><init>(I)V

    sput-object v0, Lo6;->g:Ln6;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;LN5;Lzp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lo6;->a:Landroid/content/Context;

    iput-object p2, p0, Lo6;->b:Ljava/util/ArrayList;

    sget-object p1, Lo6;->f:Lm6;

    iput-object p1, p0, Lo6;->d:Lm6;

    new-instance p1, LP3;

    const/16 p2, 0x12

    invoke-direct {p1, p2, p3, p4}, LP3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lo6;->e:LP3;

    sget-object p1, Lo6;->g:Ln6;

    iput-object p1, p0, Lo6;->c:Ln6;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILvt;)Lpw;
    .locals 7

    move-object v2, p1

    check-cast v2, Ljava/nio/ByteBuffer;

    iget-object p1, p0, Lo6;->c:Ln6;

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Ln6;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJj;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-nez v0, :cond_0

    :try_start_1
    new-instance v0, LJj;

    invoke-direct {v0}, LJj;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    move-object v5, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p2, v0

    move-object v1, p0

    goto :goto_2

    :goto_0
    const/4 v0, 0x0

    :try_start_2
    iput-object v0, v5, LJj;->b:Ljava/nio/ByteBuffer;

    iget-object v0, v5, LJj;->a:[B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([BB)V

    new-instance v0, LIj;

    invoke-direct {v0}, LIj;-><init>()V

    iput-object v0, v5, LJj;->c:LIj;

    iput v1, v5, LJj;->d:I

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v5, LJj;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, v5, LJj;->b:Ljava/nio/ByteBuffer;

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    monitor-exit p1

    move-object v1, p0

    move v3, p2

    move v4, p3

    move-object v6, p4

    :try_start_3
    invoke-virtual/range {v1 .. v6}, Lo6;->c(Ljava/nio/ByteBuffer;IILJj;Lvt;)LBj;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    iget-object p2, v1, Lo6;->c:Ln6;

    invoke-virtual {p2, v5}, Ln6;->a(LJj;)V

    return-object p1

    :catchall_1
    move-exception v0

    move-object p1, v0

    iget-object p2, v1, Lo6;->c:Ln6;

    invoke-virtual {p2, v5}, Ln6;->a(LJj;)V

    throw p1

    :catchall_2
    move-exception v0

    move-object v1, p0

    :goto_1
    move-object p2, v0

    :goto_2
    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    throw p2

    :catchall_3
    move-exception v0

    goto :goto_1
.end method

.method public final b(Ljava/lang/Object;Lvt;)Z
    .locals 1

    check-cast p1, Ljava/nio/ByteBuffer;

    sget-object v0, LKj;->b:Lut;

    invoke-virtual {p2, v0}, Lvt;->c(Lut;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lo6;->b:Ljava/util/ArrayList;

    invoke-static {p2, p1}, LfG;->X(Ljava/util/List;Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object p1

    sget-object p2, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->GIF:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c(Ljava/nio/ByteBuffer;IILJj;Lvt;)LBj;
    .locals 17

    move-object/from16 v1, p0

    const-string v2, "BufferGifDecoder"

    sget v0, Lhp;->a:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    const/4 v3, 0x2

    :try_start_0
    invoke-virtual/range {p4 .. p4}, LJj;->b()LIj;

    move-result-object v0

    iget v4, v0, LIj;->c:I

    const/4 v5, 0x0

    if-lez v4, :cond_5

    iget v4, v0, LIj;->b:I

    if-eqz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    sget-object v4, LKj;->a:Lut;

    move-object/from16 v6, p5

    invoke-virtual {v6, v4}, Lvt;->c(Lut;)Ljava/lang/Object;

    move-result-object v4

    sget-object v6, LEc;->b:LEc;

    if-ne v4, v6, :cond_1

    sget-object v4, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_1
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :goto_0
    iget v6, v0, LIj;->g:I

    div-int v6, v6, p3

    iget v7, v0, LIj;->f:I

    div-int v7, v7, p2

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    const/4 v7, 0x0

    if-nez v6, :cond_2

    move v6, v7

    goto :goto_1

    :cond_2
    invoke-static {v6}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v6

    :goto_1
    const/4 v8, 0x1

    invoke-static {v8, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    iget-object v9, v1, Lo6;->d:Lm6;

    iget-object v10, v1, Lo6;->e:LP3;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v13, LWy;

    move-object/from16 v9, p1

    invoke-direct {v13, v10, v0, v9, v6}, LWy;-><init>(LP3;LIj;Ljava/nio/ByteBuffer;I)V

    invoke-virtual {v13, v4}, LWy;->c(Landroid/graphics/Bitmap$Config;)V

    iget v0, v13, LWy;->k:I

    add-int/2addr v0, v8

    iget-object v4, v13, LWy;->l:LIj;

    iget v4, v4, LIj;->c:I

    rem-int/2addr v0, v4

    iput v0, v13, LWy;->k:I

    invoke-virtual {v13}, LWy;->b()Landroid/graphics/Bitmap;

    move-result-object v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v16, :cond_3

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    return-object v5

    :cond_3
    :try_start_1
    new-instance v0, LAj;

    iget-object v4, v1, Lo6;->a:Landroid/content/Context;

    new-instance v5, LL2;

    new-instance v11, LHj;

    invoke-static {v4}, Lcom/bumptech/glide/a;->a(Landroid/content/Context;)Lcom/bumptech/glide/a;

    move-result-object v12

    move/from16 v14, p2

    move/from16 v15, p3

    invoke-direct/range {v11 .. v16}, LHj;-><init>(Lcom/bumptech/glide/a;LWy;IILandroid/graphics/Bitmap;)V

    invoke-direct {v5, v8, v11}, LL2;-><init>(ILjava/lang/Object;)V

    invoke-direct {v0, v5}, LAj;-><init>(LL2;)V

    new-instance v4, LBj;

    invoke-direct {v4, v0, v7}, LBj;-><init>(Landroid/graphics/drawable/Drawable;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    :cond_4
    return-object v4

    :cond_5
    :goto_2
    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    :cond_6
    return-object v5

    :goto_3
    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    :cond_7
    throw v0
.end method
