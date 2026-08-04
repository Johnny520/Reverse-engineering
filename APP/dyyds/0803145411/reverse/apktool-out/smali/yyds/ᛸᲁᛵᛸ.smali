.class public abstract Lyyds/ᛸᲁᛵᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Ljava/util/ArrayList;

.field public static final ᛵᛸᛸᛷ:Ljava/util/Random;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛸᲁᛵᛸ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 7
    .line 8
    new-instance v0, Ljava/util/Random;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lyyds/ᛸᲁᛵᛸ;->ᛵᛸᛸᛷ:Ljava/util/Random;

    .line 14
    .line 15
    return-void
.end method

.method public static declared-synchronized ᛲᲈᲁ(I)I
    .locals 4

    .line 1
    const-class v0, Lyyds/ᛸᲁᛵᛸ;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :cond_0
    const/16 v1, 0x4e20

    .line 5
    .line 6
    if-le p0, v1, :cond_1

    .line 7
    .line 8
    add-int/lit16 v1, p0, -0x2710

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    :try_start_0
    div-int/lit8 v1, p0, 0x2

    .line 12
    .line 13
    :goto_0
    sget-object v2, Lyyds/ᛸᲁᛵᛸ;->ᛵᛸᛸᛷ:Ljava/util/Random;

    .line 14
    .line 15
    sub-int v3, p0, v1

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Ljava/util/Random;->nextInt(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    add-int/2addr v2, v1

    .line 22
    const/16 v1, 0x401

    .line 23
    .line 24
    if-eq v2, v1, :cond_0

    .line 25
    .line 26
    sget-object v1, Lyyds/ᛸᲁᛵᛸ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_0

    .line 37
    .line 38
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    monitor-exit v0

    .line 46
    return v2

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    throw p0
.end method
