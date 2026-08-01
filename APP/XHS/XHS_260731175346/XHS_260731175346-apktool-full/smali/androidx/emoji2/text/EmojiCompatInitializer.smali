.class public Landroidx/emoji2/text/EmojiCompatInitializer;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛶᛲᛵᲁ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lxhss/\u16f6\u16f2\u16f5\u1c81;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Landroid/content/Context;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lxhss/ᛸᛶᛱᲀ;

    .line 2
    .line 3
    new-instance v1, Lxhss/ᲇᛵᛲᲁ;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Lxhss/ᲇᛵᛲᲁ;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lxhss/ᛸᛶᛱᲀ;-><init>(Lxhss/ᛳᛶᛸᛷ;)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    iput v1, v0, Lxhss/ᛸᛶᛱᲀ;->ᛱᛱᛲᲇ:I

    .line 13
    .line 14
    sget-object v1, Lxhss/ᛵᲁᛱᲁ;->ᲈᛳᲀ:Lxhss/ᛵᲁᛱᲁ;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    sget-object v1, Lxhss/ᛵᲁᛱᲁ;->ᛸᛷᲈᲈ:Ljava/lang/Object;

    .line 19
    .line 20
    monitor-enter v1

    .line 21
    :try_start_0
    sget-object v2, Lxhss/ᛵᲁᛱᲁ;->ᲈᛳᲀ:Lxhss/ᛵᲁᛱᲁ;

    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    new-instance v2, Lxhss/ᛵᲁᛱᲁ;

    .line 26
    .line 27
    invoke-direct {v2, v0}, Lxhss/ᛵᲁᛱᲁ;-><init>(Lxhss/ᛸᛶᛱᲀ;)V

    .line 28
    .line 29
    .line 30
    sput-object v2, Lxhss/ᛵᲁᛱᲁ;->ᲈᛳᲀ:Lxhss/ᛵᲁᛱᲁ;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    :goto_0
    monitor-exit v1

    .line 36
    goto :goto_2

    .line 37
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    throw p0

    .line 39
    :cond_1
    :goto_2
    invoke-static {p1}, Lxhss/ᛷᛱᛳᲁ;->ᛷᲁᲁ(Landroid/content/Context;)Lxhss/ᛷᛱᛳᲁ;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-class v0, Landroidx/lifecycle/ProcessLifecycleInitializer;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    sget-object v1, Lxhss/ᛷᛱᛳᲁ;->ᲀᲇᛳᲁ:Ljava/lang/Object;

    .line 49
    .line 50
    monitor-enter v1

    .line 51
    :try_start_1
    iget-object v2, p1, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-nez v2, :cond_2

    .line 60
    .line 61
    new-instance v2, Ljava/util/HashSet;

    .line 62
    .line 63
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0, v2}, Lxhss/ᛷᛱᛳᲁ;->ᛸᛷᲈᲈ(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    goto :goto_3

    .line 71
    :catchall_1
    move-exception p0

    .line 72
    goto :goto_4

    .line 73
    :cond_2
    :goto_3
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    check-cast v2, Lxhss/ᛴᛷᲀᲁ;

    .line 75
    .line 76
    invoke-interface {v2}, Lxhss/ᛴᛷᲀᲁ;->ᲇᛴᲇᛵ()Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    new-instance v0, Landroidx/emoji2/text/EmojiCompatInitializer$1;

    .line 81
    .line 82
    invoke-direct {v0, p0, p1}, Landroidx/emoji2/text/EmojiCompatInitializer$1;-><init>(Landroidx/emoji2/text/EmojiCompatInitializer;Landroidx/lifecycle/ᛷᛵᛵᲈ;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v0}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ(Lxhss/ᛱᲀᛲᲁ;)V

    .line 86
    .line 87
    .line 88
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 89
    .line 90
    return-object p0

    .line 91
    :goto_4
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 92
    throw p0
.end method

.method public final ᛷᛵᛵᲈ()Ljava/util/List;
    .locals 0

    .line 1
    const-class p0, Landroidx/lifecycle/ProcessLifecycleInitializer;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
