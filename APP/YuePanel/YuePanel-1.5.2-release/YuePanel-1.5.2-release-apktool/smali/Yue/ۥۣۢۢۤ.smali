.class public LYue/ۥۣۢۢۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣۢۢۤ$ۥ۟۟۟;
    }
.end annotation


# static fields
.field public static final ۥ۟:Ljava/lang/String; = "TypefaceCompatBaseImpl"

.field public static final ۥ۟۟:I


# instance fields
.field public ۥ:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BanConcurrentHashMap"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Long;",
            "LYue/\u06e5\u06e0\u06e2\u06e6\u06e1$\u06e5\u06df\u06df\u06df;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, LYue/ۥۣۢۢۤ;->ۥ:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static ۥ۟۟۟ۤ([Ljava/lang/Object;ILYue/ۥۣۢۢۤ$ۥ۟۟۟;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;I",
            "LYue/\u06e5\u06e2\u06e2\u06e4\u06e3$\u06e5\u06df\u06df\u06df<",
            "TT;>;)TT;"
        }
    .end annotation

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_0

    const/16 v0, 0x190

    goto :goto_0

    :cond_0
    const/16 v0, 0x2bc

    :goto_0
    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    invoke-static {p0, v0, p1, p2}, LYue/ۥۣۢۢۤ;->ۥ۟۟۟ۥ([Ljava/lang/Object;IZLYue/ۥۣۢۢۤ$ۥ۟۟۟;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۥ([Ljava/lang/Object;IZLYue/ۥۣۢۢۤ$ۥ۟۟۟;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;IZ",
            "LYue/\u06e5\u06e2\u06e2\u06e4\u06e3$\u06e5\u06df\u06df\u06df<",
            "TT;>;)TT;"
        }
    .end annotation

    array-length v0, p0

    const/4 v1, 0x0

    const v2, 0x7fffffff

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v0, :cond_3

    aget-object v5, p0, v4

    invoke-interface {p3, v5}, LYue/ۥۣۢۢۤ$ۥ۟۟۟;->ۥ(Ljava/lang/Object;)I

    move-result v6

    sub-int/2addr v6, p1

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    mul-int/lit8 v6, v6, 0x2

    invoke-interface {p3, v5}, LYue/ۥۣۢۢۤ$ۥ۟۟۟;->ۥ۟(Ljava/lang/Object;)Z

    move-result v7

    if-ne v7, p2, :cond_0

    move v7, v3

    goto :goto_1

    :cond_0
    const/4 v7, 0x1

    :goto_1
    add-int/2addr v6, v7

    if-eqz v1, :cond_1

    if-le v2, v6, :cond_2

    :cond_1
    move-object v1, v5

    move v2, v6

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public static ۥ۟۟۟ۨ(Landroid/graphics/Typeface;)J
    .locals 6
    .param p0    # Landroid/graphics/Typeface;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    const-string v0, "Could not retrieve font from family."

    const-string v1, "TypefaceCompatBaseImpl"

    const-wide/16 v2, 0x0

    if-nez p0, :cond_0

    return-wide v2

    :cond_0
    :try_start_0
    const-class v4, Landroid/graphics/Typeface;

    const-string v5, "native_instance"

    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_1

    :goto_0
    invoke-static {v1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-wide v2

    :goto_1
    invoke-static {v1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-wide v2
.end method


# virtual methods
.method public final ۥ(Landroid/graphics/Typeface;LYue/ۥ۠ۢۦۡ$ۥ۟۟۟;)V
    .locals 4

    invoke-static {p1}, LYue/ۥۣۢۢۤ;->ۥ۟۟۟ۨ(Landroid/graphics/Typeface;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    iget-object p1, p0, LYue/ۥۣۢۢۤ;->ۥ:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public ۥ۟(Landroid/content/Context;LYue/ۥ۠ۢۦۡ$ۥ۟۟۟;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;
    .locals 6
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-virtual {p0, p2, p4}, LYue/ۥۣۢۢۤ;->ۥ۟۟۟ۢ(LYue/ۥ۠ۢۦۡ$ۥ۟۟۟;I)LYue/ۥ۠ۢۦۡ$ۥ۟۟۟۟;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v0}, LYue/ۥ۠ۢۦۡ$ۥ۟۟۟۟;->ۥ۟()I

    move-result v2

    invoke-virtual {v0}, LYue/ۥ۠ۢۦۡ$ۥ۟۟۟۟;->ۥ()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    move-object v0, p1

    move-object v1, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, LYue/ۥۣۢۢۨ;->ۥ۟۟۟ۢ(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;II)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, LYue/ۥۣۢۢۤ;->ۥ(Landroid/graphics/Typeface;LYue/ۥ۠ۢۦۡ$ۥ۟۟۟;)V

    return-object p1
.end method

.method public ۥ۟۟(Landroid/content/Context;LYue/ۥ۠ۢۦۡ$ۥ۟۟۟;Landroid/content/res/Resources;IZ)Landroid/graphics/Typeface;
    .locals 6
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-virtual {p0, p2, p4, p5}, LYue/ۥۣۢۢۤ;->ۥۣ۟۟۟(LYue/ۥ۠ۢۦۡ$ۥ۟۟۟;IZ)LYue/ۥ۠ۢۦۡ$ۥ۟۟۟۟;

    move-result-object p4

    if-nez p4, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p4}, LYue/ۥ۠ۢۦۡ$ۥ۟۟۟۟;->ۥ۟()I

    move-result v2

    invoke-virtual {p4}, LYue/ۥ۠ۢۦۡ$ۥ۟۟۟۟;->ۥ()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    move-object v1, p3

    invoke-static/range {v0 .. v5}, LYue/ۥۣۢۢۨ;->ۥ۟۟۟ۢ(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;II)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, LYue/ۥۣۢۢۤ;->ۥ(Landroid/graphics/Typeface;LYue/ۥ۠ۢۦۡ$ۥ۟۟۟;)V

    return-object p1
.end method

.method public ۥ۟۟۟(Landroid/content/Context;Landroid/os/CancellationSignal;[LYue/ۥ۠ۢۦۢ$ۥ۟۟;I)Landroid/graphics/Typeface;
    .locals 2
    .param p2    # Landroid/os/CancellationSignal;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # [LYue/ۥ۠ۢۦۢ$ۥ۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    array-length p2, p3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ge p2, v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p0, p3, p4}, LYue/ۥۣۢۢۤ;->ۥ۟۟۟ۦ([LYue/ۥ۠ۢۦۢ$ۥ۟۟;I)LYue/ۥ۠ۢۦۢ$ۥ۟۟;

    move-result-object p2

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p3

    invoke-virtual {p2}, LYue/ۥ۠ۢۦۢ$ۥ۟۟;->ۥ۟۟۟()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p3, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p0, p1, p2}, LYue/ۥۣۢۢۤ;->ۥ۟۟۟۟(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {p2}, LYue/ۥۢۢۤۤ;->ۥ(Ljava/io/Closeable;)V

    return-object p1

    :catchall_0
    move-exception p1

    move-object v1, p2

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_0

    :catch_0
    move-object p2, v1

    goto :goto_1

    :goto_0
    invoke-static {v1}, LYue/ۥۢۢۤۤ;->ۥ(Ljava/io/Closeable;)V

    throw p1

    :catch_1
    :goto_1
    invoke-static {p2}, LYue/ۥۢۢۤۤ;->ۥ(Ljava/io/Closeable;)V

    return-object v1
.end method

.method public ۥ۟۟۟۟(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
    .locals 1

    invoke-static {p1}, LYue/ۥۢۢۤۤ;->ۥ۟۟۟۟(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    invoke-static {p1, p2}, LYue/ۥۢۢۤۤ;->ۥ۟۟۟(Ljava/io/File;Ljava/io/InputStream;)Z

    move-result p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object v0

    :cond_1
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p2

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    throw p2

    :catch_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object v0
.end method

.method public ۥ۟۟۟۠(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;
    .locals 0
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-static {p1}, LYue/ۥۢۢۤۤ;->ۥ۟۟۟۟(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    const/4 p4, 0x0

    if-nez p1, :cond_0

    return-object p4

    :cond_0
    :try_start_0
    invoke-static {p1, p2, p3}, LYue/ۥۢۢۤۤ;->ۥ۟۟(Ljava/io/File;Landroid/content/res/Resources;I)Z

    move-result p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p4

    :cond_1
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p2

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    throw p2

    :catch_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p4
.end method

.method public ۥ۟۟۟ۡ(Landroid/content/Context;Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Typeface;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    :try_start_0
    invoke-static {p0, p1, p2, p3, p4}, LYue/ۥۢۥۢۥ;->ۥ(LYue/ۥۣۢۢۤ;Landroid/content/Context;Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    move-object p2, p1

    :goto_1
    return-object p2
.end method

.method public final ۥ۟۟۟ۢ(LYue/ۥ۠ۢۦۡ$ۥ۟۟۟;I)LYue/ۥ۠ۢۦۡ$ۥ۟۟۟۟;
    .locals 1

    invoke-virtual {p1}, LYue/ۥ۠ۢۦۡ$ۥ۟۟۟;->ۥ()[LYue/ۥ۠ۢۦۡ$ۥ۟۟۟۟;

    move-result-object p1

    new-instance v0, LYue/ۥۣۢۢۤ$ۥ۟;

    invoke-direct {v0, p0}, LYue/ۥۣۢۢۤ$ۥ۟;-><init>(LYue/ۥۣۢۢۤ;)V

    invoke-static {p1, p2, v0}, LYue/ۥۣۢۢۤ;->ۥ۟۟۟ۤ([Ljava/lang/Object;ILYue/ۥۣۢۢۤ$ۥ۟۟۟;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥ۠ۢۦۡ$ۥ۟۟۟۟;

    return-object p1
.end method

.method public final ۥۣ۟۟۟(LYue/ۥ۠ۢۦۡ$ۥ۟۟۟;IZ)LYue/ۥ۠ۢۦۡ$ۥ۟۟۟۟;
    .locals 1

    invoke-virtual {p1}, LYue/ۥ۠ۢۦۡ$ۥ۟۟۟;->ۥ()[LYue/ۥ۠ۢۦۡ$ۥ۟۟۟۟;

    move-result-object p1

    new-instance v0, LYue/ۥۣۢۢۤ$ۥ۟۟;

    invoke-direct {v0, p0}, LYue/ۥۣۢۢۤ$ۥ۟۟;-><init>(LYue/ۥۣۢۢۤ;)V

    invoke-static {p1, p2, p3, v0}, LYue/ۥۣۢۢۤ;->ۥ۟۟۟ۥ([Ljava/lang/Object;IZLYue/ۥۣۢۢۤ$ۥ۟۟۟;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥ۠ۢۦۡ$ۥ۟۟۟۟;

    return-object p1
.end method

.method public ۥ۟۟۟ۦ([LYue/ۥ۠ۢۦۢ$ۥ۟۟;I)LYue/ۥ۠ۢۦۢ$ۥ۟۟;
    .locals 1

    new-instance v0, LYue/ۥۣۢۢۤ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۣۢۢۤ$ۥ;-><init>(LYue/ۥۣۢۢۤ;)V

    invoke-static {p1, p2, v0}, LYue/ۥۣۢۢۤ;->ۥ۟۟۟ۤ([Ljava/lang/Object;ILYue/ۥۣۢۢۤ$ۥ۟۟۟;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥ۠ۢۦۢ$ۥ۟۟;

    return-object p1
.end method

.method public ۥ۟۟۟ۧ(Landroid/graphics/Typeface;)LYue/ۥ۠ۢۦۡ$ۥ۟۟۟;
    .locals 4
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-static {p1}, LYue/ۥۣۢۢۤ;->ۥ۟۟۟ۨ(Landroid/graphics/Typeface;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p1, p0, LYue/ۥۣۢۢۤ;->ۥ:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥ۠ۢۦۡ$ۥ۟۟۟;

    return-object p1
.end method
