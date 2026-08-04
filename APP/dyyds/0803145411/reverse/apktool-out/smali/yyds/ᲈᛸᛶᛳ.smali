.class public final Lyyds/ᲈᛸᛶᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛱᲈᲁ:Ljava/util/ArrayList;

.field public final ᛲᛴᛳᛲ:Ljava/util/List;

.field public final ᛲᲈᲁ:Lyyds/ᛷᛸᲇᛴ;

.field public final ᛵᛸᛸᛷ:Lyyds/ᲀᛵᲁᛴ;

.field public ᛶᛷᛲᲁ:Ljava/util/List;

.field public final ᲀᛲᛳᲀ:Lyyds/ᲈᲀᛱᛷ;

.field public ᲇᲇᲇᛱ:I

.field public final ᲇᲈᛵᛷ:Z


# direct methods
.method public constructor <init>(Lyyds/ᛷᛸᲇᛴ;Lyyds/ᲀᛵᲁᛴ;Lyyds/ᲈᲀᛱᛷ;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲈᛸᛶᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛸᲇᛴ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲈᛸᛶᛳ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛵᲁᛴ;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᲈᛸᛶᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲈᲀᛱᛷ;

    .line 9
    .line 10
    iput-boolean p4, p0, Lyyds/ᲈᛸᛶᛳ;->ᲇᲈᛵᛷ:Z

    .line 11
    .line 12
    sget-object p2, Lyyds/ᛸᲀᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛶᲈ;

    .line 13
    .line 14
    iput-object p2, p0, Lyyds/ᲈᛸᛶᛳ;->ᛲᛴᛳᛲ:Ljava/util/List;

    .line 15
    .line 16
    iput-object p2, p0, Lyyds/ᲈᛸᛶᛳ;->ᛶᛷᛲᲁ:Ljava/util/List;

    .line 17
    .line 18
    new-instance p2, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p2, p0, Lyyds/ᲈᛸᛶᛳ;->ᛱᲈᲁ:Ljava/util/ArrayList;

    .line 24
    .line 25
    iget-object p2, p1, Lyyds/ᛷᛸᲇᛴ;->ᛱᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 26
    .line 27
    iget-object p4, p3, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 28
    .line 29
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Lyyds/ᛱᛲᲀᛶ;->ᛱᲈᲁ()Ljava/net/URI;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p2}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p4

    .line 40
    if-nez p4, :cond_0

    .line 41
    .line 42
    sget-object p1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    .line 43
    .line 44
    filled-new-array {p1}, [Ljava/net/Proxy;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, Lyyds/ᛴᛲᛲᲇ;->ᛷᛲᲈᛱ([Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    iget-object p1, p1, Lyyds/ᛷᛸᲇᛴ;->ᛶᛷᛲᲁ:Ljava/net/ProxySelector;

    .line 54
    .line 55
    invoke-virtual {p1, p2}, Ljava/net/ProxySelector;->select(Ljava/net/URI;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-eqz p2, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-static {p1}, Lyyds/ᛴᛲᛲᲇ;->ᛷᲈᲈᲁ(Ljava/util/List;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    :goto_0
    sget-object p1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    .line 74
    .line 75
    filled-new-array {p1}, [Ljava/net/Proxy;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1}, Lyyds/ᛴᛲᛲᲇ;->ᛷᛲᲈᛱ([Ljava/lang/Object;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    :goto_1
    iput-object p1, p0, Lyyds/ᲈᛸᛶᛳ;->ᛲᛴᛳᛲ:Ljava/util/List;

    .line 84
    .line 85
    const/4 p1, 0x0

    .line 86
    iput p1, p0, Lyyds/ᲈᛸᛶᛳ;->ᲇᲇᲇᛱ:I

    .line 87
    .line 88
    iget-object p0, p3, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()Z
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᲈᛸᛶᛳ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᲈᛸᛶᛳ;->ᛲᛴᛳᛲ:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p0, p0, Lyyds/ᲈᛸᛶᛳ;->ᛱᲈᲁ:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    return p0
.end method
