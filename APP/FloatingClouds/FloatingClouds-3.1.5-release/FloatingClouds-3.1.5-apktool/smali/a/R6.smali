.class public final La/R6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/R6$a;
    }
.end annotation


# static fields
.field public static final a:La/W9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/W9<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Ljava/util/concurrent/ThreadPoolExecutor;

.field public static final c:Ljava/lang/Object;

.field public static final d:La/ge;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/ge<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "La/Q3<",
            "La/R6$a;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, La/W9;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, La/W9;-><init>(I)V

    sput-object v0, La/R6;->a:La/W9;

    new-instance v9, La/Zc;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/util/concurrent/ThreadPoolExecutor;

    const/16 v0, 0x2710

    int-to-long v5, v0

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v8, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct/range {v2 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    sput-object v2, La/R6;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/R6;->c:Ljava/lang/Object;

    new-instance v0, La/ge;

    invoke-direct {v0}, La/ge;-><init>()V

    sput-object v0, La/R6;->d:La/ge;

    return-void
.end method

.method public static a(Ljava/lang/String;Landroid/content/Context;La/M6;I)La/R6$a;
    .locals 6

    sget-object v0, La/R6;->a:La/W9;

    invoke-virtual {v0, p0}, La/W9;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    new-instance p0, La/R6$a;

    invoke-direct {p0, v1}, La/R6$a;-><init>(Landroid/graphics/Typeface;)V

    return-object p0

    :cond_0
    :try_start_0
    invoke-static {p1, p2}, La/L6;->a(Landroid/content/Context;La/M6;)La/Cc;

    move-result-object p2
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x1

    const/4 v2, -0x3

    iget-object v3, p2, La/Cc;->b:[Ljava/lang/Object;

    check-cast v3, [La/T6;

    iget p2, p2, La/Cc;->c:I

    if-eqz p2, :cond_2

    if-eq p2, v1, :cond_1

    :goto_0
    move v1, v2

    goto :goto_2

    :cond_1
    const/4 v1, -0x2

    goto :goto_2

    :cond_2
    if-eqz v3, :cond_6

    array-length p2, v3

    if-nez p2, :cond_3

    goto :goto_2

    :cond_3
    array-length p2, v3

    const/4 v1, 0x0

    move v4, v1

    :goto_1
    if-ge v4, p2, :cond_6

    aget-object v5, v3, v4

    iget v5, v5, La/T6;->e:I

    if-eqz v5, :cond_5

    if-gez v5, :cond_4

    goto :goto_0

    :cond_4
    move v1, v5

    goto :goto_2

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_6
    :goto_2
    if-eqz v1, :cond_7

    new-instance p0, La/R6$a;

    invoke-direct {p0, v1}, La/R6$a;-><init>(I)V

    return-object p0

    :cond_7
    sget-object p2, La/Mf;->a:La/Rf;

    invoke-virtual {p2, p1, v3, p3}, La/Rf;->b(Landroid/content/Context;[La/T6;I)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {v0, p0, p1}, La/W9;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, La/R6$a;

    invoke-direct {p0, p1}, La/R6$a;-><init>(Landroid/graphics/Typeface;)V

    return-object p0

    :cond_8
    new-instance p0, La/R6$a;

    invoke-direct {p0, v2}, La/R6$a;-><init>(I)V

    return-object p0

    :catch_0
    new-instance p0, La/R6$a;

    const/4 p1, -0x1

    invoke-direct {p0, p1}, La/R6$a;-><init>(I)V

    return-object p0
.end method
