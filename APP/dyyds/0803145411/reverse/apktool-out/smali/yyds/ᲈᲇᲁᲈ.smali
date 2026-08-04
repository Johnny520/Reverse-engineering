.class public final Lyyds/ᲈᲇᲁᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:I

.field public final ᛵᛸᛸᛷ:J

.field public final ᲀᛲᛳᲀ:I


# direct methods
.method public constructor <init>(IJI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lyyds/ᲈᲇᲁᲈ;->ᛲᲈᲁ:I

    .line 5
    .line 6
    iput-wide p2, p0, Lyyds/ᲈᲇᲁᲈ;->ᛵᛸᛸᛷ:J

    .line 7
    .line 8
    iput p4, p0, Lyyds/ᲈᲇᲁᲈ;->ᲀᛲᛳᲀ:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lyyds/ᲈᲇᲁᲈ;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lyyds/ᲈᲇᲁᲈ;

    .line 12
    .line 13
    iget v1, p0, Lyyds/ᲈᲇᲁᲈ;->ᛲᲈᲁ:I

    .line 14
    .line 15
    iget v3, p1, Lyyds/ᲈᲇᲁᲈ;->ᛲᲈᲁ:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-wide v3, p0, Lyyds/ᲈᲇᲁᲈ;->ᛵᛸᛸᛷ:J

    .line 21
    .line 22
    iget-wide v5, p1, Lyyds/ᲈᲇᲁᲈ;->ᛵᛸᛸᛷ:J

    .line 23
    .line 24
    cmp-long v1, v3, v5

    .line 25
    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    return v2

    .line 29
    :cond_3
    iget p0, p0, Lyyds/ᲈᲇᲁᲈ;->ᲀᛲᛳᲀ:I

    .line 30
    .line 31
    iget p1, p1, Lyyds/ᲈᲇᲁᲈ;->ᲀᛲᛳᲀ:I

    .line 32
    .line 33
    if-eq p0, p1, :cond_4

    .line 34
    .line 35
    return v2

    .line 36
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᲈᲇᲁᲈ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-wide v1, p0, Lyyds/ᲈᲇᲁᲈ;->ᛵᛸᛸᛷ:J

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
    iget p0, p0, Lyyds/ᲈᲇᲁᲈ;->ᲀᛲᛳᲀ:I

    .line 19
    .line 20
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v1

    .line 25
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-wide v1, -0x6250be68a836eL

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
    iget v1, p0, Lyyds/ᲈᲇᲁᲈ;->ᛲᲈᲁ:I

    .line 16
    .line 17
    const-wide v2, -0x62527e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 23
    .line 24
    .line 25
    iget-wide v1, p0, Lyyds/ᲈᲇᲁᲈ;->ᛵᛸᛸᛷ:J

    .line 26
    .line 27
    const-wide v3, -0x62531e68a836eL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1, v2, v3, v4}, Lyyds/ᛴᛷᛷᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;JJ)V

    .line 33
    .line 34
    .line 35
    iget p0, p0, Lyyds/ᲈᲇᲁᲈ;->ᲀᛲᛳᲀ:I

    .line 36
    .line 37
    const/16 v1, 0x29

    .line 38
    .line 39
    invoke-static {v0, p0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛷᛲᲈᛱ(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method
