.class public final synthetic Lyyds/ᛳᲈᛵᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛷᛴᛷᲈ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᲀᛵᲁᛴ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᲀᛵᲁᛴ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛳᲈᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛵᲁᛴ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛷᲈᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    check-cast p2, Landroid/database/sqlite/SQLiteCursorDriver;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/String;

    .line 6
    .line 7
    check-cast p4, Landroid/database/sqlite/SQLiteQuery;

    .line 8
    .line 9
    new-instance p1, Lyyds/ᛸᲈᛲᛳ;

    .line 10
    .line 11
    invoke-direct {p1, p4}, Lyyds/ᛸᲈᛲᛳ;-><init>(Landroid/database/sqlite/SQLiteProgram;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lyyds/ᛳᲈᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛵᲁᛴ;

    .line 15
    .line 16
    iget-object p0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lyyds/ᲈᛴᛶᛳ;

    .line 19
    .line 20
    iget-object v0, p0, Lyyds/ᲈᛴᛶᛳ;->ᲇᲇᲇᛱ:[I

    .line 21
    .line 22
    array-length v0, v0

    .line 23
    const/4 v1, 0x1

    .line 24
    move v2, v1

    .line 25
    :goto_0
    if-ge v2, v0, :cond_5

    .line 26
    .line 27
    iget-object v3, p0, Lyyds/ᲈᛴᛶᛳ;->ᲇᲇᲇᛱ:[I

    .line 28
    .line 29
    aget v3, v3, v2

    .line 30
    .line 31
    if-eq v3, v1, :cond_4

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    if-eq v3, v4, :cond_3

    .line 35
    .line 36
    const/4 v4, 0x3

    .line 37
    if-eq v3, v4, :cond_2

    .line 38
    .line 39
    const/4 v4, 0x4

    .line 40
    if-eq v3, v4, :cond_1

    .line 41
    .line 42
    const/4 v4, 0x5

    .line 43
    if-eq v3, v4, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    invoke-interface {p1, v2}, Lyyds/ᛷᛳᲈᲇ;->ᛵᛸᛸᛷ(I)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    iget-object v3, p0, Lyyds/ᲈᛴᛶᛳ;->ᛷᲈᲈᲁ:[[B

    .line 51
    .line 52
    aget-object v3, v3, v2

    .line 53
    .line 54
    invoke-interface {p1, v2, v3}, Lyyds/ᛷᛳᲈᲇ;->ᲈᲀᛲᲀ(I[B)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    iget-object v3, p0, Lyyds/ᲈᛴᛶᛳ;->ᛲᛳᛶᲁ:[Ljava/lang/String;

    .line 59
    .line 60
    aget-object v3, v3, v2

    .line 61
    .line 62
    invoke-interface {p1, v2, v3}, Lyyds/ᛷᛳᲈᲇ;->ᛲᛳᛶᲁ(ILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    iget-object v3, p0, Lyyds/ᲈᛴᛶᛳ;->ᛱᲈᲁ:[D

    .line 67
    .line 68
    aget-wide v3, v3, v2

    .line 69
    .line 70
    invoke-interface {p1, v2, v3, v4}, Lyyds/ᛷᛳᲈᲇ;->ᛷᛵᲇᲀ(ID)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    iget-object v3, p0, Lyyds/ᲈᛴᛶᛳ;->ᛶᛷᛲᲁ:[J

    .line 75
    .line 76
    aget-wide v3, v3, v2

    .line 77
    .line 78
    invoke-interface {p1, v2, v3, v4}, Lyyds/ᛷᛳᲈᲇ;->ᲇᲈᛵᛷ(IJ)V

    .line 79
    .line 80
    .line 81
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    new-instance p0, Landroid/database/sqlite/SQLiteCursor;

    .line 85
    .line 86
    invoke-direct {p0, p2, p3, p4}, Landroid/database/sqlite/SQLiteCursor;-><init>(Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)V

    .line 87
    .line 88
    .line 89
    return-object p0
.end method
