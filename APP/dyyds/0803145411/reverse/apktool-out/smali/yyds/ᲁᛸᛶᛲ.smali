.class public final Lyyds/ᲁᛸᛶᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᛳᲇ:Lyyds/ᲀᲇᛶᲇ;

.field public ᛱᲈᲁ:Lyyds/ᲁᛸᛶᲁ;

.field public ᛲᛲᲈᲈ:J

.field public ᛲᛳᛶᲁ:Lyyds/ᛴᛴᛷᲁ;

.field public ᛲᛴᛳᛲ:Lyyds/ᲀᲈᛴᛴ;

.field public ᛲᲈᲁ:Lyyds/ᲀᲁᲁ;

.field public ᛳᲁᲁᲇ:Lyyds/ᛶᲀᲁᛲ;

.field public ᛵᛸᛸᛷ:Lyyds/ᛴᲀᲁᛲ;

.field public ᛶᛷᛲᲁ:Lyyds/ᛲᛶᲀ;

.field public ᛷᛲᲈᛱ:Lyyds/ᛴᛴᛷᲁ;

.field public ᛷᛵᲇᲀ:J

.field public ᛷᲈᲈᲁ:Lyyds/ᛴᛴᛷᲁ;

.field public ᲀᛲᛳᲀ:I

.field public ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛷᛷ;

.field public ᲇᲈᛵᛷ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lyyds/ᲁᛸᛶᛲ;->ᲀᛲᛳᲀ:I

    .line 6
    .line 7
    sget-object v0, Lyyds/ᛲᛶᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛱᲈᲀ;

    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᲁᛸᛶᛲ;->ᛶᛷᛲᲁ:Lyyds/ᛲᛶᲀ;

    .line 10
    .line 11
    sget-object v0, Lyyds/ᛶᲀᲁᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛶᲇᲁ;

    .line 12
    .line 13
    iput-object v0, p0, Lyyds/ᲁᛸᛶᛲ;->ᛳᲁᲁᲇ:Lyyds/ᛶᲀᲁᛲ;

    .line 14
    .line 15
    new-instance v0, Lyyds/ᲀᲈᛷᛷ;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-direct {v0, v1}, Lyyds/ᲀᲈᛷᛷ;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lyyds/ᲁᛸᛶᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛷᛷ;

    .line 22
    .line 23
    return-void
.end method

.method public static ᛵᛸᛸᛷ(Ljava/lang/String;Lyyds/ᛴᛴᛷᲁ;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    iget-object v0, p1, Lyyds/ᛴᛴᛷᲁ;->ᛷᛲᲈᛱ:Lyyds/ᛴᛴᛷᲁ;

    .line 4
    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p1, Lyyds/ᛴᛴᛷᲁ;->ᛷᛵᲇᲀ:Lyyds/ᛴᛴᛷᲁ;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object p1, p1, Lyyds/ᛴᛴᛷᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛴᛴᛷᲁ;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p1, ".priorResponse != null"

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const-string p1, ".cacheResponse != null"

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    const-string p1, ".networkResponse != null"

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()Lyyds/ᛴᛴᛷᲁ;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v4, v0, Lyyds/ᲁᛸᛶᛲ;->ᲀᛲᛳᲀ:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-ltz v4, :cond_3

    .line 7
    .line 8
    move-object v2, v1

    .line 9
    iget-object v1, v0, Lyyds/ᲁᛸᛶᛲ;->ᛲᲈᲁ:Lyyds/ᲀᲁᲁ;

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    move-object v3, v2

    .line 14
    iget-object v2, v0, Lyyds/ᲁᛸᛶᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛴᲀᲁᛲ;

    .line 15
    .line 16
    move-object v5, v3

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-object v3, v0, Lyyds/ᲁᛸᛶᛲ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    iget-object v5, v0, Lyyds/ᲁᛸᛶᛲ;->ᛲᛴᛳᛲ:Lyyds/ᲀᲈᛴᛴ;

    .line 24
    .line 25
    iget-object v6, v0, Lyyds/ᲁᛸᛶᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛷᛷ;

    .line 26
    .line 27
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v6}, Lyyds/ᛴᛲᛴᛲ;->ᛵᛸᛸᛷ(Lyyds/ᲀᲈᛷᛷ;)Lyyds/ᛷᛸᛱᛴ;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    iget-object v7, v0, Lyyds/ᲁᛸᛶᛲ;->ᛶᛷᛲᲁ:Lyyds/ᛲᛶᲀ;

    .line 35
    .line 36
    iget-object v8, v0, Lyyds/ᲁᛸᛶᛲ;->ᛱᲈᲁ:Lyyds/ᲁᛸᛶᲁ;

    .line 37
    .line 38
    iget-object v9, v0, Lyyds/ᲁᛸᛶᛲ;->ᛲᛳᛶᲁ:Lyyds/ᛴᛴᛷᲁ;

    .line 39
    .line 40
    iget-object v10, v0, Lyyds/ᲁᛸᛶᛲ;->ᛷᲈᲈᲁ:Lyyds/ᛴᛴᛷᲁ;

    .line 41
    .line 42
    iget-object v11, v0, Lyyds/ᲁᛸᛶᛲ;->ᛷᛲᲈᛱ:Lyyds/ᛴᛴᛷᲁ;

    .line 43
    .line 44
    iget-wide v12, v0, Lyyds/ᲁᛸᛶᛲ;->ᛷᛵᲇᲀ:J

    .line 45
    .line 46
    iget-wide v14, v0, Lyyds/ᲁᛸᛶᛲ;->ᛲᛲᲈᲈ:J

    .line 47
    .line 48
    move-object/from16 v16, v1

    .line 49
    .line 50
    iget-object v1, v0, Lyyds/ᲁᛸᛶᛲ;->ᛱᛳᲇ:Lyyds/ᲀᲇᛶᲇ;

    .line 51
    .line 52
    iget-object v0, v0, Lyyds/ᲁᛸᛶᛲ;->ᛳᲁᲁᲇ:Lyyds/ᛶᲀᲁᛲ;

    .line 53
    .line 54
    move-object/from16 v17, v0

    .line 55
    .line 56
    new-instance v0, Lyyds/ᛴᛴᛷᲁ;

    .line 57
    .line 58
    move-object/from16 v18, v16

    .line 59
    .line 60
    move-object/from16 v16, v1

    .line 61
    .line 62
    move-object/from16 v1, v18

    .line 63
    .line 64
    invoke-direct/range {v0 .. v17}, Lyyds/ᛴᛴᛷᲁ;-><init>(Lyyds/ᲀᲁᲁ;Lyyds/ᛴᲀᲁᛲ;Ljava/lang/String;ILyyds/ᲀᲈᛴᛴ;Lyyds/ᛷᛸᛱᛴ;Lyyds/ᛲᛶᲀ;Lyyds/ᲁᛸᛶᲁ;Lyyds/ᛴᛴᛷᲁ;Lyyds/ᛴᛴᛷᲁ;Lyyds/ᛴᛴᛷᲁ;JJLyyds/ᲀᲇᛶᲇ;Lyyds/ᛶᲀᲁᛲ;)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_0
    const-string v0, "message == null"

    .line 69
    .line 70
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v5

    .line 74
    :cond_1
    const-string v0, "protocol == null"

    .line 75
    .line 76
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-object v5

    .line 80
    :cond_2
    move-object v5, v2

    .line 81
    const-string v0, "request == null"

    .line 82
    .line 83
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-object v5

    .line 87
    :cond_3
    move-object v5, v1

    .line 88
    const-string v1, "code < 0: "

    .line 89
    .line 90
    iget v0, v0, Lyyds/ᲁᛸᛶᛲ;->ᲀᛲᛳᲀ:I

    .line 91
    .line 92
    invoke-static {v0, v1}, Lyyds/ᛷᲈᲈᛶ;->ᛵᛸᛸᛷ(ILjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-object v5
.end method
