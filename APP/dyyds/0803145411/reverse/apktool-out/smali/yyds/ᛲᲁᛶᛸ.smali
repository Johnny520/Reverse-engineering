.class public final Lyyds/ᛲᲁᛶᛸ;
.super Lyyds/ᛸᲀᛷᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public final synthetic ᛱᛳᲇ:Ljava/lang/String;

.field public ᛱᲈᲁ:Lyyds/ᛱᛵᛱᛱ;

.field public final synthetic ᛲᛲᲈᲈ:Lyyds/ᛱᛵᛱᛱ;

.field public ᛲᛳᛶᲁ:Ljava/lang/String;

.field public final synthetic ᛳᲁᲁᲇ:Ljava/lang/String;

.field public ᛶᛷᛲᲁ:Lyyds/ᛱᛷᛸᲈ;

.field public ᛷᛲᲈᛱ:I

.field public ᛷᛵᲇᲀ:I

.field public ᛷᲈᲈᲁ:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Lyyds/ᛱᛵᛱᛱ;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛲᲁᛶᛸ;->ᛲᛲᲈᲈ:Lyyds/ᛱᛵᛱᛱ;

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛲᲁᛶᛸ;->ᛱᛳᲇ:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lyyds/ᛲᲁᛶᛸ;->ᛳᲁᲁᲇ:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lyyds/ᛲᲁᛶᛸ;->ᛷᛵᲇᲀ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    sget-object v3, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 7
    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    if-eq v0, v2, :cond_2

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    if-ne v0, v2, :cond_1

    .line 14
    .line 15
    iget v0, p0, Lyyds/ᛲᲁᛶᛸ;->ᛷᛲᲈᛱ:I

    .line 16
    .line 17
    iget-object v4, p0, Lyyds/ᛲᲁᛶᛸ;->ᛷᲈᲈᲁ:Ljava/util/Iterator;

    .line 18
    .line 19
    iget-object v5, p0, Lyyds/ᛲᲁᛶᛸ;->ᛲᛳᛶᲁ:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v6, p0, Lyyds/ᛲᲁᛶᛸ;->ᛱᲈᲁ:Lyyds/ᛱᛵᛱᛱ;

    .line 22
    .line 23
    iget-object v7, p0, Lyyds/ᛲᲁᛶᛸ;->ᛶᛷᛲᲁ:Lyyds/ᛱᛷᛸᲈ;

    .line 24
    .line 25
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_4

    .line 33
    .line 34
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Ljava/lang/String;

    .line 39
    .line 40
    new-instance v8, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    iget-object v9, v7, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v9, Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const/16 v9, 0x2f

    .line 53
    .line 54
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iput-object p1, v7, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object v7, p0, Lyyds/ᛲᲁᛶᛸ;->ᛶᛷᛲᲁ:Lyyds/ᛱᛷᛸᲈ;

    .line 67
    .line 68
    iput-object v6, p0, Lyyds/ᛲᲁᛶᛸ;->ᛱᲈᲁ:Lyyds/ᛱᛵᛱᛱ;

    .line 69
    .line 70
    iput-object v5, p0, Lyyds/ᛲᲁᛶᛸ;->ᛲᛳᛶᲁ:Ljava/lang/String;

    .line 71
    .line 72
    iput-object v4, p0, Lyyds/ᛲᲁᛶᛸ;->ᛷᲈᲈᲁ:Ljava/util/Iterator;

    .line 73
    .line 74
    iput v0, p0, Lyyds/ᛲᲁᛶᛸ;->ᛷᛲᲈᛱ:I

    .line 75
    .line 76
    iput v2, p0, Lyyds/ᛲᲁᛶᛸ;->ᛷᛵᲇᲀ:I

    .line 77
    .line 78
    invoke-virtual {v6, p1, v5, p0}, Lyyds/ᛱᛵᛱᛱ;->ᛷᛲᲈᛱ(Ljava/lang/String;Ljava/lang/String;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-ne p1, v3, :cond_0

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    const-wide p0, -0x271bee68a836eL

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const/4 p0, 0x0

    .line 98
    return-object p0

    .line 99
    :cond_2
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return-object v1

    .line 103
    :cond_3
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iput v2, p0, Lyyds/ᛲᲁᛶᛸ;->ᛷᛵᲇᲀ:I

    .line 107
    .line 108
    iget-object p1, p0, Lyyds/ᛲᲁᛶᛸ;->ᛲᛲᲈᲈ:Lyyds/ᛱᛵᛱᛱ;

    .line 109
    .line 110
    iget-object v0, p0, Lyyds/ᛲᲁᛶᛸ;->ᛱᛳᲇ:Ljava/lang/String;

    .line 111
    .line 112
    iget-object v2, p0, Lyyds/ᛲᲁᛶᛸ;->ᛳᲁᲁᲇ:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {p1, v0, v2, p0}, Lyyds/ᛱᛵᛱᛱ;->ᛷᛲᲈᛱ(Ljava/lang/String;Ljava/lang/String;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    if-ne p0, v3, :cond_4

    .line 119
    .line 120
    :goto_0
    return-object v3

    .line 121
    :cond_4
    return-object v1
.end method

.method public final ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
    .locals 2

    .line 1
    new-instance p1, Lyyds/ᛲᲁᛶᛸ;

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛲᲁᛶᛸ;->ᛱᛳᲇ:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lyyds/ᛲᲁᛶᛸ;->ᛳᲁᲁᲇ:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᛲᲁᛶᛸ;->ᛲᛲᲈᲈ:Lyyds/ᛱᛵᛱᛱ;

    .line 8
    .line 9
    invoke-direct {p1, p0, v0, v1, p2}, Lyyds/ᛲᲁᛶᛸ;-><init>(Lyyds/ᛱᛵᛱᛱ;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lyyds/ᛴᲈᛳᲀ;

    .line 2
    .line 3
    check-cast p2, Lyyds/ᛲᛱᛶᛸ;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lyyds/ᛲᲁᛶᛸ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lyyds/ᛲᲁᛶᛸ;

    .line 10
    .line 11
    sget-object p1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lyyds/ᛲᲁᛶᛸ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
