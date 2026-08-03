.class public final L۟/z7$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/z7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final ۥ:Landroid/content/Context;

.field public ۥ۟:L۟/x1;

.field public ۥ۟۟:L۟/b8;

.field public ۥ۟۠:L۟/h5;

.field public ۥ۟ۡ:L۟/z7$f$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, L۟/z7$b;->ۥ:Landroid/content/Context;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Context must not be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ۥ()L۟/z7;
    .locals 10

    .line 1
    iget-object v7, p0, L۟/z7$b;->ۥ:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v0, p0, L۟/z7$b;->ۥ۟:L۟/x1;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    sget-object v0, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    .line 8
    .line 9
    :try_start_0
    const-string v0, "com.squareup.okhttp.OkHttpClient"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v0, L۟/x6;

    .line 15
    .line 16
    new-instance v1, Ljava/io/File;

    .line 17
    .line 18
    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, "picasso-cache"

    .line 27
    .line 28
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-static {v1}, L۟/ic;->ۥ(Ljava/io/File;)J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    invoke-direct {v0, v1, v2, v3}, L۟/x6;-><init>(Ljava/io/File;J)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catch_0
    new-instance v0, L۟/xb;

    .line 49
    .line 50
    invoke-direct {v0, v7}, L۟/xb;-><init>(Landroid/content/Context;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    iput-object v0, p0, L۟/z7$b;->ۥ۟:L۟/x1;

    .line 54
    .line 55
    :cond_1
    iget-object v0, p0, L۟/z7$b;->ۥ۟۠:L۟/h5;

    .line 56
    .line 57
    if-nez v0, :cond_2

    .line 58
    .line 59
    new-instance v0, L۟/h5;

    .line 60
    .line 61
    invoke-direct {v0, v7}, L۟/h5;-><init>(Landroid/content/Context;)V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, L۟/z7$b;->ۥ۟۠:L۟/h5;

    .line 65
    .line 66
    :cond_2
    iget-object v0, p0, L۟/z7$b;->ۥ۟۟:L۟/b8;

    .line 67
    .line 68
    if-nez v0, :cond_3

    .line 69
    .line 70
    new-instance v0, L۟/b8;

    .line 71
    .line 72
    invoke-direct {v0}, L۟/b8;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, L۟/z7$b;->ۥ۟۟:L۟/b8;

    .line 76
    .line 77
    :cond_3
    iget-object v0, p0, L۟/z7$b;->ۥ۟ۡ:L۟/z7$f$a;

    .line 78
    .line 79
    if-nez v0, :cond_4

    .line 80
    .line 81
    sget-object v0, L۟/z7$f;->ۥ:L۟/z7$f$a;

    .line 82
    .line 83
    iput-object v0, p0, L۟/z7$b;->ۥ۟ۡ:L۟/z7$f$a;

    .line 84
    .line 85
    :cond_4
    new-instance v8, L۟/fa;

    .line 86
    .line 87
    iget-object v0, p0, L۟/z7$b;->ۥ۟۠:L۟/h5;

    .line 88
    .line 89
    invoke-direct {v8, v0}, L۟/fa;-><init>(L۟/e0;)V

    .line 90
    .line 91
    .line 92
    new-instance v9, L۟/s1;

    .line 93
    .line 94
    iget-object v2, p0, L۟/z7$b;->ۥ۟۟:L۟/b8;

    .line 95
    .line 96
    sget-object v3, L۟/z7;->ۥ۠:L۟/z7$a;

    .line 97
    .line 98
    iget-object v4, p0, L۟/z7$b;->ۥ۟:L۟/x1;

    .line 99
    .line 100
    iget-object v5, p0, L۟/z7$b;->ۥ۟۠:L۟/h5;

    .line 101
    .line 102
    move-object v0, v9

    .line 103
    move-object v1, v7

    .line 104
    move-object v6, v8

    .line 105
    invoke-direct/range {v0 .. v6}, L۟/s1;-><init>(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;L۟/z7$a;L۟/x1;L۟/e0;L۟/fa;)V

    .line 106
    .line 107
    .line 108
    new-instance v6, L۟/z7;

    .line 109
    .line 110
    iget-object v3, p0, L۟/z7$b;->ۥ۟۠:L۟/h5;

    .line 111
    .line 112
    iget-object v4, p0, L۟/z7$b;->ۥ۟ۡ:L۟/z7$f$a;

    .line 113
    .line 114
    move-object v0, v6

    .line 115
    move-object v2, v9

    .line 116
    move-object v5, v8

    .line 117
    invoke-direct/range {v0 .. v5}, L۟/z7;-><init>(Landroid/content/Context;L۟/s1;L۟/e0;L۟/z7$f;L۟/fa;)V

    .line 118
    .line 119
    .line 120
    return-object v6
.end method
