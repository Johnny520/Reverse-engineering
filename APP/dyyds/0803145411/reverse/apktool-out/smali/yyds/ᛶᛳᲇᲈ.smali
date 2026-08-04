.class public final synthetic Lyyds/ᛶᛳᲇᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛷᛴᲈᲀ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/String;

.field public final synthetic ᲀᛲᛳᲀ:Ljava/lang/String;

.field public final synthetic ᲇᲈᛵᛷ:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛶᛳᲇᲈ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lyyds/ᛶᛳᲇᲈ;->ᲇᲈᛵᛷ:I

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛶᛳᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᛶᛳᲇᲈ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛶᛳᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛱᛵᛷ;

    .line 6
    .line 7
    const-wide v2, -0x503bfe68a836eL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lyyds/ᛶᛳᲇᲈ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-interface {p1, p0}, Lyyds/ᛱᛵᛷ;->ᲀᛲᛱᛱ(Ljava/lang/String;)Lyyds/ᛵᲇᛱᛸ;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    int-to-long v2, v0

    .line 22
    const/4 p1, 0x1

    .line 23
    :try_start_0
    invoke-interface {p0, p1, v2, v3}, Lyyds/ᛵᲇᛱᛸ;->ᲇᲈᛵᛷ(IJ)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x2

    .line 27
    invoke-interface {p0, v0, v2, v3}, Lyyds/ᛵᲇᛱᛸ;->ᲇᲈᛵᛷ(IJ)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x3

    .line 31
    invoke-interface {p0, v0, v2, v3}, Lyyds/ᛵᲇᛱᛸ;->ᲇᲈᛵᛷ(IJ)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x4

    .line 35
    invoke-interface {p0, v0, v2, v3}, Lyyds/ᛵᲇᛱᛸ;->ᲇᲈᛵᛷ(IJ)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x5

    .line 39
    invoke-interface {p0, v0, v1}, Lyyds/ᛵᲇᛱᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x6

    .line 43
    invoke-interface {p0, v0, v1}, Lyyds/ᛵᲇᛱᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x7

    .line 47
    invoke-interface {p0, v0, v1}, Lyyds/ᛵᲇᛱᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/16 v0, 0x8

    .line 51
    .line 52
    invoke-interface {p0, v0, v1}, Lyyds/ᛵᲇᛱᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/16 v0, 0x9

    .line 56
    .line 57
    invoke-interface {p0, v0, v1}, Lyyds/ᛵᲇᛱᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    new-instance v0, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    :goto_0
    invoke-interface {p0}, Lyyds/ᛵᲇᛱᛸ;->ᛵᲀᛵᛸ()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_0

    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    invoke-interface {p0, v1}, Lyyds/ᛵᲇᛱᛸ;->ᛱᲈᲁ(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-interface {p0, p1}, Lyyds/ᛵᲇᛱᛸ;->getLong(I)J

    .line 77
    .line 78
    .line 79
    move-result-wide v2

    .line 80
    long-to-int v2, v2

    .line 81
    new-instance v3, Lyyds/ᲁᛳᲇᛸ;

    .line 82
    .line 83
    invoke-direct {v3, v1, v2}, Lyyds/ᲁᛳᲇᛸ;-><init>(Ljava/lang/String;I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :catchall_0
    move-exception p1

    .line 91
    goto :goto_1

    .line 92
    :cond_0
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 93
    .line 94
    .line 95
    return-object v0

    .line 96
    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 97
    .line 98
    .line 99
    throw p1
.end method
