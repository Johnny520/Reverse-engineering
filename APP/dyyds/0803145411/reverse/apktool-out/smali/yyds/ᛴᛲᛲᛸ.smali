.class public final Lyyds/ᛴᛲᛲᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:J

.field public final ᛲᲈᲁ:Ljava/lang/String;

.field public final ᛵᛸᛸᛷ:J

.field public final ᲀᛲᛳᲀ:J

.field public final ᲇᲈᛵᛷ:J


# direct methods
.method public constructor <init>(Ljava/lang/String;JJJJ)V
    .locals 2

    .line 1
    const-wide v0, -0x628e1e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 13
    .line 14
    iput-wide p2, p0, Lyyds/ᛴᛲᛲᛸ;->ᛵᛸᛸᛷ:J

    .line 15
    .line 16
    iput-wide p4, p0, Lyyds/ᛴᛲᛲᛸ;->ᲀᛲᛳᲀ:J

    .line 17
    .line 18
    iput-wide p6, p0, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 19
    .line 20
    iput-wide p8, p0, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lyyds/ᛴᛲᛲᛸ;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lyyds/ᛴᛲᛲᛸ;

    .line 10
    .line 11
    iget-object v0, p0, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-wide v0, p0, Lyyds/ᛴᛲᛲᛸ;->ᛵᛸᛸᛷ:J

    .line 23
    .line 24
    iget-wide v2, p1, Lyyds/ᛴᛲᛲᛸ;->ᛵᛸᛸᛷ:J

    .line 25
    .line 26
    cmp-long v0, v0, v2

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    iget-wide v0, p0, Lyyds/ᛴᛲᛲᛸ;->ᲀᛲᛳᲀ:J

    .line 32
    .line 33
    iget-wide v2, p1, Lyyds/ᛴᛲᛲᛸ;->ᲀᛲᛳᲀ:J

    .line 34
    .line 35
    cmp-long v0, v0, v2

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-wide v0, p0, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 41
    .line 42
    iget-wide v2, p1, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 43
    .line 44
    cmp-long v0, v0, v2

    .line 45
    .line 46
    if-eqz v0, :cond_5

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_5
    iget-wide v0, p0, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 50
    .line 51
    iget-wide p0, p1, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 52
    .line 53
    cmp-long p0, v0, p0

    .line 54
    .line 55
    if-eqz p0, :cond_6

    .line 56
    .line 57
    :goto_0
    const/4 p0, 0x0

    .line 58
    return p0

    .line 59
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 60
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-wide v1, p0, Lyyds/ᛴᛲᛲᛸ;->ᛵᛸᛸᛷ:J

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-wide v2, p0, Lyyds/ᛴᛲᛲᛸ;->ᲀᛲᛳᲀ:J

    .line 19
    .line 20
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-wide v1, p0, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 28
    .line 29
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v1, v0

    .line 34
    mul-int/lit8 v1, v1, 0x1f

    .line 35
    .line 36
    iget-wide v2, p0, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 37
    .line 38
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    add-int/2addr p0, v1

    .line 43
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-wide v1, -0x628ebe68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lyyds/ᛴᛲᛲᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 16
    .line 17
    const-wide v2, -0x628f5e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, Lyyds/ᛴᛷᛷᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 23
    .line 24
    .line 25
    iget-wide v1, p0, Lyyds/ᛴᛲᛲᛸ;->ᛵᛸᛸᛷ:J

    .line 26
    .line 27
    const-wide v3, -0x628fee68a836eL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1, v2, v3, v4}, Lyyds/ᛴᛷᛷᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;JJ)V

    .line 33
    .line 34
    .line 35
    iget-wide v1, p0, Lyyds/ᛴᛲᛲᛸ;->ᲀᛲᛳᲀ:J

    .line 36
    .line 37
    const-wide v3, -0x62906e68a836eL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1, v2, v3, v4}, Lyyds/ᛴᛷᛷᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;JJ)V

    .line 43
    .line 44
    .line 45
    iget-wide v1, p0, Lyyds/ᛴᛲᛲᛸ;->ᲇᲈᛵᛷ:J

    .line 46
    .line 47
    const-wide v3, -0x62913e68a836eL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1, v2, v3, v4}, Lyyds/ᛴᛷᛷᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;JJ)V

    .line 53
    .line 54
    .line 55
    iget-wide v1, p0, Lyyds/ᛴᛲᛲᛸ;->ᛲᛴᛳᛲ:J

    .line 56
    .line 57
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const/16 p0, 0x29

    .line 61
    .line 62
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method
