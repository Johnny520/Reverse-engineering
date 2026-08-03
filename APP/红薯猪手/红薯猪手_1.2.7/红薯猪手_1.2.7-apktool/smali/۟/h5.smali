.class public final L۟/h5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements L۟/e0;


# instance fields
.field public final ۥ:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟:I

.field public ۥ۟۟:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    sget-object v0, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v0, "activity"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/app/ActivityManager;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 16
    .line 17
    const/high16 v1, 0x100000

    .line 18
    .line 19
    and-int/2addr p1, v1

    .line 20
    const/4 v2, 0x1

    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    move p1, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move p1, v3

    .line 27
    :goto_0
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getLargeMemoryClass()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    :cond_1
    mul-int/2addr v4, v1

    .line 38
    div-int/lit8 v4, v4, 0x7

    .line 39
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    if-lez v4, :cond_2

    .line 44
    .line 45
    iput v4, p0, L۟/h5;->ۥ۟:I

    .line 46
    .line 47
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 48
    .line 49
    const/high16 v0, 0x3f400000    # 0.75f

    .line 50
    .line 51
    invoke-direct {p1, v3, v0, v2}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, L۟/h5;->ۥ:Ljava/util/LinkedHashMap;

    .line 55
    .line 56
    return-void

    .line 57
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 58
    .line 59
    const-string v0, "Max size must be positive."

    .line 60
    .line 61
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1
.end method


# virtual methods
.method public final ۥ(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1

    if-eqz p1, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, L۟/h5;->ۥ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    if-eqz p1, :cond_0

    monitor-exit p0

    return-object p1

    :cond_0
    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "key == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
