.class public final Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl;
.super Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;
.source "SourceFile"


# instance fields
.field public volatile ۥ۠۠:L۟/zb;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟()L۟/k4;
    .locals 7

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v3, L۟/k4;

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x5

    new-array v5, v5, [B

    fill-array-data v5, :array_0

    const/4 v6, 0x6

    new-array v6, v6, [B

    fill-array-data v6, :array_1

    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-direct {v3, p0, v0, v2, v4}, L۟/k4;-><init>(L۟/a9;Ljava/util/HashMap;Ljava/util/HashMap;[Ljava/lang/String;)V

    return-object v3

    :array_0
    .array-data 1
        -0x6bt
        0x2bt
        -0x4bt
        0x62t
        0x61t
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x3t
        0x5et
        -0x3at
        0x7t
        0x13t
        -0x22t
    .end array-data
.end method

.method public final ۥ۟۠(L۟/f1;)L۟/bb;
    .locals 6

    .line 1
    new-instance v0, L۟/b9;

    .line 2
    .line 3
    new-instance v1, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl$a;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl$a;-><init>(Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl;)V

    .line 6
    .line 7
    .line 8
    const/16 v2, 0x20

    .line 9
    .line 10
    new-array v3, v2, [B

    .line 11
    .line 12
    fill-array-data v3, :array_0

    .line 13
    .line 14
    .line 15
    const/4 v4, 0x6

    .line 16
    new-array v5, v4, [B

    .line 17
    .line 18
    fill-array-data v5, :array_1

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    new-array v2, v2, [B

    .line 26
    .line 27
    fill-array-data v2, :array_2

    .line 28
    .line 29
    .line 30
    new-array v4, v4, [B

    .line 31
    .line 32
    fill-array-data v4, :array_3

    .line 33
    .line 34
    .line 35
    invoke-static {v2, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-direct {v0, p1, v1, v3, v2}, L۟/b9;-><init>(L۟/f1;Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl$a;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p1, L۟/f1;->ۥ۟:Landroid/content/Context;

    .line 43
    .line 44
    iget-object v2, p1, L۟/f1;->ۥ۟۟:Ljava/lang/String;

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    iget-object p1, p1, L۟/f1;->ۥ:L۟/bb$b;

    .line 49
    .line 50
    check-cast p1, L۟/d3;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    new-instance p1, L۟/c3;

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    invoke-direct {p1, v1, v2, v0, v3}, L۟/c3;-><init>(Landroid/content/Context;Ljava/lang/String;L۟/bb$a;Z)V

    .line 59
    .line 60
    .line 61
    return-object p1

    .line 62
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 63
    .line 64
    const-string v0, "Must set a non-null context to create the configuration."

    .line 65
    .line 66
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    nop

    .line 71
    :array_0
    .array-data 1
        -0xft
        0x46t
        -0x70t
        0x22t
        -0x3at
        -0x6at
        -0x5dt
        0x14t
        -0x40t
        0x23t
        -0x3at
        -0x3et
        -0x53t
        0x44t
        -0x69t
        0x2at
        -0x3ft
        -0x70t
        -0xdt
        0x17t
        -0x6bt
        0x77t
        -0x37t
        -0x6at
        -0x59t
        0x4et
        -0x3bt
        0x70t
        -0x38t
        -0x6ft
        -0xft
        0x41t
    .end array-data

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    :array_1
    .array-data 1
        -0x6bt
        0x76t
        -0xft
        0x13t
        -0xft
        -0x5ct
    .end array-data

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    nop

    .line 99
    :array_2
    .array-data 1
        -0x53t
        -0x32t
        0x5at
        -0x7ct
        0x41t
        0x15t
        -0x8t
        -0x68t
        0x9t
        -0x30t
        0x17t
        0x1dt
        -0x54t
        -0x32t
        0x5at
        -0x7dt
        0x17t
        0x1ct
        -0x1t
        -0x61t
        0x58t
        -0x7at
        0x41t
        0x40t
        -0x52t
        -0x31t
        0x5bt
        -0x22t
        0x46t
        0x46t
        -0x53t
        -0x38t
    .end array-data

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    :array_3
    .array-data 1
        -0x66t
        -0x5t
        0x6bt
        -0x19t
        0x71t
        0x24t
    .end array-data
.end method

.method public final ۥ۟ۡ()Ljava/util/List;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [L۟/t5;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟ۢ()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "L\u06df/z;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0
.end method

.method public final ۥۣ۟()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, L۟/yb;

    .line 7
    .line 8
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final ۥ۟ۧ()L۟/yb;
    .locals 1

    iget-object v0, p0, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl;->ۥ۠۠:L۟/zb;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl;->ۥ۠۠:L۟/zb;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl;->ۥ۠۠:L۟/zb;

    if-nez v0, :cond_1

    new-instance v0, L۟/zb;

    invoke-direct {v0, p0}, L۟/zb;-><init>(L۟/a9;)V

    iput-object v0, p0, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl;->ۥ۠۠:L۟/zb;

    :cond_1
    iget-object v0, p0, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl;->ۥ۠۠:L۟/zb;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
