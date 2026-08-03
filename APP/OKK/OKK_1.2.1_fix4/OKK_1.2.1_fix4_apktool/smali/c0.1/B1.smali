.class public final Lc0/B1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc0/B1;

.field public static final b:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static volatile c:J

.field public static volatile d:Z

.field public static volatile e:F

.field public static volatile f:Ljava/lang/String;

.field public static volatile g:Ljava/lang/String;

.field public static volatile h:Landroid/graphics/Bitmap;

.field public static volatile i:Ljava/lang/String;

.field public static volatile j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc0/B1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lc0/B1;->a:Lc0/B1;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v0, Lc0/B1;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    const v0, 0x3e8f5c29    # 0.28f

    sput v0, Lc0/B1;->e:F

    const-string v0, ""

    sput-object v0, Lc0/B1;->f:Ljava/lang/String;

    sput-object v0, Lc0/B1;->g:Ljava/lang/String;

    sput-object v0, Lc0/B1;->i:Ljava/lang/String;

    sput-object v0, Lc0/B1;->j:Ljava/lang/String;

    return-void
.end method

.method public static c(F)F
    .locals 2

    const v0, 0x3c23d70a    # 0.01f

    const v1, 0x3f59999a    # 0.85f

    invoke-static {p0, v0, v1}, LA0/p;->o(FFF)F

    move-result p0

    return p0
.end method

.method public static d(F)Ljava/lang/String;
    .locals 2

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const/4 v1, 0x1

    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string v1, "%.2f"

    invoke-static {v0, v1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static f()V
    .locals 2

    sget-object v0, Lc0/B1;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LP0/a;

    :try_start_0
    invoke-interface {v1}, LP0/a;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static g(Z)V
    .locals 6

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    if-nez p0, :cond_0

    sget-wide v2, Lc0/B1;->c:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x320

    cmp-long p0, v2, v4

    if-gez p0, :cond_0

    sget-wide v2, Lc0/B1;->c:J

    const-wide/16 v4, 0x0

    cmp-long p0, v2, v4

    if-lez p0, :cond_0

    return-void

    :cond_0
    sget-object p0, Lc0/h1;->a:Lc0/h1;

    const-string p0, "theme_wallpaper_enabled"

    const/4 v2, 0x0

    invoke-static {p0, v2}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result p0

    sput-boolean p0, Lc0/B1;->d:Z

    const-string p0, "theme_wallpaper_alpha"

    const-string v2, "0.28"

    invoke-static {p0, v2}, Lc0/h1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LW0/p;->z0(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    goto :goto_0

    :cond_1
    const p0, 0x3e8f5c29    # 0.28f

    :goto_0
    invoke-static {p0}, Lc0/B1;->c(F)F

    move-result p0

    sput p0, Lc0/B1;->e:F

    const-string p0, "theme_wallpaper_path"

    const-string v2, ""

    invoke-static {p0, v2}, Lc0/h1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v3, "theme_wallpaper_updated"

    invoke-static {v3, v2}, Lc0/h1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lc0/B1;->g:Ljava/lang/String;

    new-instance v3, Ljava/io/File;

    const-string v4, "/storage/emulated/0/Android/media/com.tencent.mm/OKK"

    const-string v5, "theme_wallpaper.jpg"

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_2

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v4

    if-eqz v4, :cond_2

    move-object v2, p0

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const-string p0, "getAbsolutePath(...)"

    invoke-static {v2, p0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    :goto_1
    sput-object v2, Lc0/B1;->f:Ljava/lang/String;

    sput-wide v0, Lc0/B1;->c:J

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lc0/B1;->g(Z)V

    sget v0, Lc0/B1;->e:F

    return v0
.end method

.method public final b()Landroid/graphics/Bitmap;
    .locals 9

    const/4 v0, 0x0

    invoke-static {v0}, Lc0/B1;->g(Z)V

    sget-object v1, Lc0/B1;->f:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return-object v3

    :cond_0
    sget-object v2, Lc0/B1;->h:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_1

    sget-object v2, Lc0/B1;->h:Landroid/graphics/Bitmap;

    invoke-static {v2}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v2, Lc0/B1;->i:Ljava/lang/String;

    invoke-static {v2, v1}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, Lc0/B1;->j:Ljava/lang/String;

    sget-object v4, Lc0/B1;->g:Ljava/lang/String;

    invoke-static {v2, v4}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v0, Lc0/B1;->h:Landroid/graphics/Bitmap;

    return-object v0

    :cond_1
    :try_start_0
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v4, 0x1

    iput-boolean v4, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-static {v1, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    iget v5, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v6, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    move v7, v4

    :goto_0
    const/16 v8, 0x640

    if-gt v5, v8, :cond_4

    if-le v6, v8, :cond_2

    goto :goto_2

    :cond_2
    if-ge v7, v4, :cond_3

    goto :goto_1

    :cond_3
    move v4, v7

    :goto_1
    iput v4, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    iput-boolean v0, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-static {v1, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_4
    :goto_2
    mul-int/lit8 v7, v7, 0x2

    div-int/lit8 v5, v5, 0x2

    div-int/lit8 v6, v6, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :goto_3
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_4
    instance-of v2, v0, LD0/f;

    if-eqz v2, :cond_5

    goto :goto_5

    :cond_5
    move-object v3, v0

    :goto_5
    check-cast v3, Landroid/graphics/Bitmap;

    if-eqz v3, :cond_6

    sput-object v3, Lc0/B1;->h:Landroid/graphics/Bitmap;

    sput-object v1, Lc0/B1;->i:Ljava/lang/String;

    sget-object v0, Lc0/B1;->g:Ljava/lang/String;

    sput-object v0, Lc0/B1;->j:Ljava/lang/String;

    :cond_6
    return-object v3
.end method

.method public final e()Z
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lc0/B1;->g(Z)V

    sget-boolean v0, Lc0/B1;->d:Z

    return v0
.end method
