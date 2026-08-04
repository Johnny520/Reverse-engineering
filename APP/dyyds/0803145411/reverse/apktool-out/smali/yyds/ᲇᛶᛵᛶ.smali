.class public final Lyyds/ᲇᛶᛵᛶ;
.super Lyyds/ᛸᲀᛷᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public final synthetic ᛱᲈᲁ:Ljava/lang/String;

.field public final synthetic ᛲᛳᛶᲁ:Ljava/lang/String;

.field public final synthetic ᛶᛷᛲᲁ:Lyyds/ᛱᛵᛱᛱ;

.field public final synthetic ᛷᲈᲈᲁ:Z


# direct methods
.method public constructor <init>(Lyyds/ᛱᛵᛱᛱ;Ljava/lang/String;Ljava/lang/String;ZLyyds/ᛲᛱᛶᛸ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᲇᛶᛵᛶ;->ᛶᛷᛲᲁ:Lyyds/ᛱᛵᛱᛱ;

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᲇᛶᛵᛶ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lyyds/ᲇᛶᛵᛶ;->ᛲᛳᛶᲁ:Ljava/lang/String;

    .line 6
    .line 7
    iput-boolean p4, p0, Lyyds/ᲇᛶᛵᛶ;->ᛷᲈᲈᲁ:Z

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᲇᛶᛵᛶ;->ᛶᛷᛲᲁ:Lyyds/ᛱᛵᛱᛱ;

    .line 2
    .line 3
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Lyyds/ᛱᛵᛱᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lyyds/ᲁᛲᛲᛶ;

    .line 14
    .line 15
    iget-object v1, v1, Lyyds/ᲁᛲᛲᛶ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const/16 v1, 0x2f

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Lyyds/ᲇᛶᛵᛶ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lyyds/ᲇᛶᛵᛶ;->ᛲᛳᛶᲁ:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-boolean p0, p0, Lyyds/ᲇᛶᛵᛶ;->ᛷᲈᲈᲁ:Z

    .line 46
    .line 47
    invoke-static {p1, p0}, Lyyds/ᛱᛵᛱᛱ;->ᛵᛶᛲᲀ(Ljava/lang/String;Z)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v0}, Lyyds/ᛱᛵᛱᛱ;->ᛳᛸᛴᛶ()Lyyds/ᛳᛱᲇ;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    new-instance v0, Lyyds/ᛷᲀᲇᲈ;

    .line 59
    .line 60
    invoke-direct {v0}, Lyyds/ᛷᲀᲇᲈ;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p0}, Lyyds/ᛷᲀᲇᲈ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string p0, "HEAD"

    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    invoke-virtual {v0, p0, v1}, Lyyds/ᛷᲀᲇᲈ;->ᲀᛲᛳᲀ(Ljava/lang/String;Lyyds/ᛳᛸᲀᛵ;)V

    .line 70
    .line 71
    .line 72
    new-instance p0, Lyyds/ᲀᲁᲁ;

    .line 73
    .line 74
    invoke-direct {p0, v0}, Lyyds/ᲀᲁᲁ;-><init>(Lyyds/ᛷᲀᲇᲈ;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p1, Lyyds/ᛳᛱᲇ;->ᛲᲈᲁ:Lyyds/ᛶᛲᛷ;

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    new-instance v0, Lyyds/ᲈᲀᛱᛷ;

    .line 83
    .line 84
    invoke-direct {v0, p1, p0}, Lyyds/ᲈᲀᛱᛷ;-><init>(Lyyds/ᛶᛲᛷ;Lyyds/ᲀᲁᲁ;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Lyyds/ᲈᲀᛱᛷ;->ᲇᲈᛵᛷ()Lyyds/ᛴᛴᛷᲁ;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    iget-boolean p1, p0, Lyyds/ᛴᛴᛷᲁ;->ᛵᛶᛲᲀ:Z

    .line 92
    .line 93
    if-nez p1, :cond_0

    .line 94
    .line 95
    iget p1, p0, Lyyds/ᛴᛴᛷᲁ;->ᲇᲇᲇᛱ:I

    .line 96
    .line 97
    const/16 v0, 0x194

    .line 98
    .line 99
    if-ne p1, v0, :cond_0

    .line 100
    .line 101
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    invoke-static {p0}, Lyyds/ᛷᛸ;->ᛲᛲᲈᲈ(Lyyds/ᛴᛴᛷᲁ;)V

    .line 105
    .line 106
    .line 107
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 108
    .line 109
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 110
    .line 111
    .line 112
    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    goto :goto_1

    .line 114
    :catch_0
    const/4 p0, 0x0

    .line 115
    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    return-object p0
.end method

.method public final ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
    .locals 6

    .line 1
    new-instance v0, Lyyds/ᲇᛶᛵᛶ;

    .line 2
    .line 3
    iget-object v3, p0, Lyyds/ᲇᛶᛵᛶ;->ᛲᛳᛶᲁ:Ljava/lang/String;

    .line 4
    .line 5
    iget-boolean v4, p0, Lyyds/ᲇᛶᛵᛶ;->ᛷᲈᲈᲁ:Z

    .line 6
    .line 7
    iget-object v1, p0, Lyyds/ᲇᛶᛵᛶ;->ᛶᛷᛲᲁ:Lyyds/ᛱᛵᛱᛱ;

    .line 8
    .line 9
    iget-object v2, p0, Lyyds/ᲇᛶᛵᛶ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lyyds/ᲇᛶᛵᛶ;-><init>(Lyyds/ᛱᛵᛱᛱ;Ljava/lang/String;Ljava/lang/String;ZLyyds/ᛲᛱᛶᛸ;)V

    .line 13
    .line 14
    .line 15
    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lyyds/ᲇᛶᛵᛶ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lyyds/ᲇᛶᛵᛶ;

    .line 10
    .line 11
    sget-object p1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lyyds/ᲇᛶᛵᛶ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
