.class public abstract Lc0/U;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lc0/U;->a:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static a(Landroid/graphics/Bitmap;ZZ)Ljava/util/ArrayList;
    .locals 11

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    add-int/lit8 v2, v0, -0x1

    const/4 v3, 0x1

    const/4 v4, -0x1

    move v5, v3

    move v6, v4

    :goto_1
    if-ge v5, v2, :cond_7

    const/4 v7, 0x0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    sub-int/2addr v8, v3

    invoke-virtual {p0, v5, v8}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v8

    goto :goto_2

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0, v5, v7}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v8

    goto :goto_2

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    sub-int/2addr v8, v3

    invoke-virtual {p0, v8, v5}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v8

    goto :goto_2

    :cond_3
    invoke-virtual {p0, v7, v5}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v8

    :goto_2
    invoke-static {v8}, Landroid/graphics/Color;->alpha(I)I

    move-result v9

    const/16 v10, 0xff

    if-ne v9, v10, :cond_4

    invoke-static {v8}, Landroid/graphics/Color;->red(I)I

    move-result v9

    if-nez v9, :cond_4

    invoke-static {v8}, Landroid/graphics/Color;->green(I)I

    move-result v9

    if-nez v9, :cond_4

    invoke-static {v8}, Landroid/graphics/Color;->blue(I)I

    move-result v8

    if-nez v8, :cond_4

    move v7, v3

    :cond_4
    if-eqz v7, :cond_5

    if-ne v6, v4, :cond_5

    add-int/lit8 v6, v5, -0x1

    goto :goto_3

    :cond_5
    if-nez v7, :cond_6

    if-eq v6, v4, :cond_6

    new-instance v7, Lc0/T;

    add-int/lit8 v8, v5, -0x1

    invoke-direct {v7, v6, v8}, Lc0/T;-><init>(II)V

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v6, v4

    :cond_6
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_7
    if-eq v6, v4, :cond_8

    new-instance p0, Lc0/T;

    add-int/lit8 v0, v0, -0x2

    invoke-direct {p0, v6, v0}, Lc0/T;-><init>(II)V

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    return-object v1
.end method

.method public static b(Landroid/graphics/Bitmap;)[B
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lc0/U;->a(Landroid/graphics/Bitmap;ZZ)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {p0, v1, v1}, Lc0/U;->a(Landroid/graphics/Bitmap;ZZ)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-static {p0}, Lc0/U;->d(Landroid/graphics/Bitmap;)Landroid/graphics/Rect;

    move-result-object p0

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x8

    add-int/lit8 v5, v5, 0x44

    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v4, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x2

    mul-int/2addr v5, v6

    int-to-byte v5, v5

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    mul-int/2addr v5, v6

    int-to-byte v5, v5

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    const/16 v5, 0x9

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move v7, v1

    :goto_0
    if-ge v7, v6, :cond_1

    invoke-virtual {v4, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    iget v6, p0, Landroid/graphics/Rect;->left:I

    invoke-virtual {v4, v6}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    iget v6, p0, Landroid/graphics/Rect;->right:I

    invoke-virtual {v4, v6}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    iget v6, p0, Landroid/graphics/Rect;->top:I

    invoke-virtual {v4, v6}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v4, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    invoke-virtual {v4, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc0/T;

    iget v6, v2, Lc0/T;->a:I

    invoke-virtual {v4, v6}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    iget v2, v2, Lc0/T;->b:I

    invoke-virtual {v4, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc0/T;

    iget v3, v2, Lc0/T;->a:I

    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    iget v2, v2, Lc0/T;->b:I

    invoke-virtual {v4, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    goto :goto_2

    :cond_3
    :goto_3
    if-ge v1, v5, :cond_4

    invoke-virtual {v4, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_4
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    return-object p0

    :cond_5
    :goto_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static c(Ljava/lang/String;)V
    .locals 8

    sget-object v0, Lc0/U;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    const-string v2, "<get-keys>(...)"

    invoke-static {v1, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, LQ0/g;->b(Ljava/lang/Object;)V

    const/4 v5, 0x0

    invoke-static {v4, p0, v5}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-nez v6, :cond_1

    new-instance v6, Ljava/io/File;

    invoke-direct {v6, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "getName(...)"

    invoke-static {v6, v7}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v6, v5}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-eqz v4, :cond_0

    :cond_1
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    return-void
.end method

.method public static d(Landroid/graphics/Bitmap;)Landroid/graphics/Rect;
    .locals 7

    const/4 v0, 0x1

    invoke-static {p0, v0, v0}, Lc0/U;->a(Landroid/graphics/Bitmap;ZZ)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, LE0/l;->p0(Ljava/util/ArrayList;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc0/T;

    const/4 v2, 0x0

    invoke-static {p0, v2, v0}, Lc0/U;->a(Landroid/graphics/Bitmap;ZZ)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, LE0/l;->p0(Ljava/util/ArrayList;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc0/T;

    if-eqz v1, :cond_5

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    add-int/lit8 v3, v3, -0x2

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p0

    add-int/lit8 p0, p0, -0x2

    new-instance v4, Landroid/graphics/Rect;

    iget v5, v1, Lc0/T;->a:I

    if-gez v5, :cond_1

    move v5, v2

    :cond_1
    iget v6, v0, Lc0/T;->a:I

    if-gez v6, :cond_2

    move v6, v2

    :cond_2
    iget v1, v1, Lc0/T;->b:I

    sub-int/2addr v3, v1

    if-gez v3, :cond_3

    move v3, v2

    :cond_3
    iget v0, v0, Lc0/T;->b:I

    sub-int/2addr p0, v0

    if-gez p0, :cond_4

    goto :goto_0

    :cond_4
    move v2, p0

    :goto_0
    invoke-direct {v4, v5, v6, v3, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v4

    :cond_5
    :goto_1
    new-instance p0, Landroid/graphics/Rect;

    invoke-direct {p0}, Landroid/graphics/Rect;-><init>()V

    return-object p0
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;Z)Lc0/Q;
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p2}, Lc0/U;->f(Z)Ljava/io/File;

    move-result-object v2

    sget-object v3, Lc0/U;->a:Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v4, 0x0

    const-string v5, ":"

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2}, Ljava/io/File;->lastModified()J

    move-result-wide v6

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "file:"

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v5, Lc0/H;

    invoke-direct {v5, v1, v2}, Lc0/H;-><init>(ILjava/lang/Object;)V

    new-instance v1, Lc0/O;

    invoke-direct {v1, v5, v0}, Lc0/O;-><init>(LP0/l;I)V

    invoke-virtual {v3, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc0/S;

    goto :goto_1

    :cond_0
    if-nez p1, :cond_1

    return-object v4

    :cond_1
    if-eqz p2, :cond_2

    const-string v2, "right_bubble.9.png"

    goto :goto_0

    :cond_2
    const-string v2, "left_bubble.9.png"

    :goto_0
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "asset:"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lc0/P;

    invoke-direct {v6, v0, p1, v2}, Lc0/P;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lc0/O;

    invoke-direct {p1, v6, v1}, Lc0/O;-><init>(LP0/l;I)V

    invoke-virtual {v3, v5, p1}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc0/S;

    :goto_1
    if-nez p1, :cond_3

    return-object v4

    :cond_3
    sget-object v0, Lc0/K;->a:LW0/g;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iget-object v1, p1, Lc0/S;->c:Landroid/graphics/Rect;

    const-string v2, "padding"

    invoke-static {v1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, v1, Landroid/graphics/Rect;->left:I

    if-nez v2, :cond_6

    iget v3, v1, Landroid/graphics/Rect;->top:I

    if-nez v3, :cond_6

    iget v3, v1, Landroid/graphics/Rect;->right:I

    if-nez v3, :cond_6

    iget v3, v1, Landroid/graphics/Rect;->bottom:I

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    const/high16 v1, 0x418c0000    # 17.5f

    mul-float/2addr v1, v0

    invoke-static {v1}, LA0/p;->P(F)I

    move-result v1

    const/high16 v2, 0x41480000    # 12.5f

    mul-float/2addr v2, v0

    invoke-static {v2}, LA0/p;->P(F)I

    move-result v2

    const/high16 v3, 0x41000000    # 8.0f

    mul-float/2addr v3, v0

    invoke-static {v3}, LA0/p;->P(F)I

    move-result v0

    if-eqz p2, :cond_5

    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput v1, p2, Landroid/graphics/Rect;->left:I

    iput v0, p2, Landroid/graphics/Rect;->top:I

    iput v2, p2, Landroid/graphics/Rect;->right:I

    iput v0, p2, Landroid/graphics/Rect;->bottom:I

    goto :goto_3

    :cond_5
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput v2, p2, Landroid/graphics/Rect;->left:I

    iput v0, p2, Landroid/graphics/Rect;->top:I

    iput v1, p2, Landroid/graphics/Rect;->right:I

    iput v0, p2, Landroid/graphics/Rect;->bottom:I

    goto :goto_3

    :cond_6
    :goto_2
    iget p2, v1, Landroid/graphics/Rect;->top:I

    iget v0, v1, Landroid/graphics/Rect;->right:I

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput v2, v3, Landroid/graphics/Rect;->left:I

    iput p2, v3, Landroid/graphics/Rect;->top:I

    iput v0, v3, Landroid/graphics/Rect;->right:I

    iput v1, v3, Landroid/graphics/Rect;->bottom:I

    move-object p2, v3

    :goto_3
    new-instance v6, Landroid/graphics/drawable/NinePatchDrawable;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4, p2}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iget-object v2, p1, Lc0/S;->a:Landroid/graphics/Bitmap;

    iget-object v3, p1, Lc0/S;->b:[B

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Landroid/graphics/drawable/NinePatchDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;[BLandroid/graphics/Rect;Ljava/lang/String;)V

    new-instance p0, Lc0/Q;

    invoke-direct {p0, v6, p2}, Lc0/Q;-><init>(Landroid/graphics/drawable/NinePatchDrawable;Landroid/graphics/Rect;)V

    return-object p0
.end method

.method public static f(Z)Ljava/io/File;
    .locals 11

    sget-object v0, Lc0/h1;->a:Lc0/h1;

    if-eqz p0, :cond_0

    const-string v0, "bubble_path_right"

    goto :goto_0

    :cond_0
    const-string v0, "bubble_path_left"

    :goto_0
    const-string v1, ""

    invoke-static {v0, v1}, Lc0/h1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_1

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v4

    cmp-long v0, v4, v2

    if-lez v0, :cond_1

    return-object v1

    :cond_1
    new-instance v0, Ljava/io/File;

    const-string v1, "/storage/emulated/0/Android/media/com.tencent.mm/OKK"

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    const/4 v4, 0x0

    if-nez v1, :cond_2

    return-object v4

    :cond_2
    if-eqz p0, :cond_3

    const-string v7, "right.png"

    const-string v8, "righ.png"

    const-string v5, "right.9.png"

    const-string v6, "righ.9.png"

    const-string v9, "right"

    const-string v10, "righ"

    filled-new-array/range {v5 .. v10}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_1

    :cond_3
    const-string p0, "left"

    const-string v1, "left.9.png"

    const-string v5, "left.png"

    filled-new-array {v1, v5, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    :goto_1
    new-instance v1, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {p0, v5}, LE0/n;->k0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v0, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v5

    cmp-long v1, v5, v2

    if-lez v1, :cond_5

    move-object v4, v0

    :cond_6
    check-cast v4, Ljava/io/File;

    return-object v4
.end method

.method public static g(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 4

    invoke-static {p1}, Lc0/U;->f(Z)Ljava/io/File;

    move-result-object v0

    const-string v1, ":"

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "file:"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    if-eqz p1, :cond_1

    const-string p1, "right_bubble.9.png"

    goto :goto_0

    :cond_1
    const-string p1, "left_bubble.9.png"

    :goto_0
    if-nez p0, :cond_2

    const-string p0, ""

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "asset:"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
