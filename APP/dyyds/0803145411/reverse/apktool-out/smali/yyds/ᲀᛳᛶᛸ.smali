.class public final Lyyds/ᲀᛳᛶᛸ;
.super Lyyds/ᛶᛴᲈᲀ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛵᛸᛸᛷ:Landroid/content/Context;

.field public final ᲀᛲᛳᲀ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛱᲀᛷᛱ;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lyyds/ᛸᛲᛷ;

    .line 10
    .line 11
    sget-object v2, Lyyds/ᛳᲀᲇᛸ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛲᛷᛸ;

    .line 12
    .line 13
    invoke-direct {v1, v2}, Lyyds/ᛸᛲᛷ;-><init>(Lyyds/ᛷᛲᲇᛵ;)V

    .line 14
    .line 15
    .line 16
    new-instance v2, Lyyds/ᛸᛲᛷ;

    .line 17
    .line 18
    sget-object v3, Lyyds/ᛶᛷᛲᲀ;->ᛲᲈᲁ:Lyyds/ᲇᛳᛱᛶ;

    .line 19
    .line 20
    invoke-direct {v2, v3}, Lyyds/ᛸᛲᛷ;-><init>(Lyyds/ᛷᛲᲇᛵ;)V

    .line 21
    .line 22
    .line 23
    new-instance v3, Lyyds/ᛸᛲᛷ;

    .line 24
    .line 25
    sget-object v4, Lyyds/ᲀᲈᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲇᛳ;

    .line 26
    .line 27
    invoke-direct {v3, v4}, Lyyds/ᛸᛲᛷ;-><init>(Lyyds/ᛷᛲᲇᛵ;)V

    .line 28
    .line 29
    .line 30
    const/4 v4, 0x4

    .line 31
    new-array v4, v4, [Lyyds/ᛴᛶᲀᲀ;

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    aput-object v0, v4, v5

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v1, v4, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v2, v4, v0

    .line 41
    .line 42
    const/4 v0, 0x3

    .line 43
    aput-object v3, v4, v0

    .line 44
    .line 45
    invoke-static {v4}, Lyyds/ᲀᲀᛷᛸ;->ᛲᛳᛴᛸ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    new-instance v1, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    move-object v3, v2

    .line 69
    check-cast v3, Lyyds/ᛴᛶᲀᲀ;

    .line 70
    .line 71
    invoke-interface {v3}, Lyyds/ᛴᛶᲀᲀ;->ᲀᛲᛳᲀ()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_0

    .line 76
    .line 77
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    iput-object v1, p0, Lyyds/ᲀᛳᛶᛸ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 82
    .line 83
    return-void
.end method
