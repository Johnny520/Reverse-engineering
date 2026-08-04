.class public final Lyyds/ᲀᛲᲈᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᛴᛳᛲ:Z

.field public final ᛲᲈᲁ:Lyyds/ᲀᲁᲀᛷ;

.field public final ᛵᛸᛸᛷ:Lyyds/ᛳᛵᲇᛷ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛳᛶ;

.field public ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(Lyyds/ᲀᲁᲀᛷ;Lyyds/ᛳᛵᲇᛷ;Lyyds/ᛵᲇᛳᛶ;)V
    .locals 2

    .line 1
    const-wide v0, -0x35827e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x3582ce68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    const-wide v0, -0x3583be68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lyyds/ᲀᛲᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲀᲁᲀᛷ;

    .line 29
    .line 30
    iput-object p2, p0, Lyyds/ᲀᛲᲈᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛵᲇᛷ;

    .line 31
    .line 32
    iput-object p3, p0, Lyyds/ᲀᛲᲈᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛳᛶ;

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    iput p1, p0, Lyyds/ᲀᛲᲈᛴ;->ᲇᲈᛵᛷ:I

    .line 36
    .line 37
    iput-boolean p1, p0, Lyyds/ᲀᛲᲈᛴ;->ᛲᛴᛳᛲ:Z

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lyyds/ᲀᛲᲈᛴ;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Lyyds/ᲀᛲᲈᛴ;

    .line 11
    .line 12
    iget-object v0, p0, Lyyds/ᲀᛲᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲀᲁᲀᛷ;

    .line 13
    .line 14
    iget-object v2, p1, Lyyds/ᲀᛲᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲀᲁᲀᛷ;

    .line 15
    .line 16
    if-eq v0, v2, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    iget-object v0, p0, Lyyds/ᲀᛲᲈᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛵᲇᛷ;

    .line 20
    .line 21
    iget-object v2, p1, Lyyds/ᲀᛲᲈᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛵᲇᛷ;

    .line 22
    .line 23
    if-eq v0, v2, :cond_3

    .line 24
    .line 25
    return v1

    .line 26
    :cond_3
    iget-object v0, p0, Lyyds/ᲀᛲᲈᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛳᛶ;

    .line 27
    .line 28
    iget-object v2, p1, Lyyds/ᲀᛲᲈᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛳᛶ;

    .line 29
    .line 30
    if-eq v0, v2, :cond_4

    .line 31
    .line 32
    return v1

    .line 33
    :cond_4
    iget v0, p0, Lyyds/ᲀᛲᲈᛴ;->ᲇᲈᛵᛷ:I

    .line 34
    .line 35
    iget v2, p1, Lyyds/ᲀᛲᲈᛴ;->ᲇᲈᛵᛷ:I

    .line 36
    .line 37
    if-eq v0, v2, :cond_5

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_5
    iget-boolean p0, p0, Lyyds/ᲀᛲᲈᛴ;->ᛲᛴᛳᛲ:Z

    .line 41
    .line 42
    iget-boolean p1, p1, Lyyds/ᲀᛲᲈᛴ;->ᛲᛴᛳᛲ:Z

    .line 43
    .line 44
    if-eq p0, p1, :cond_6

    .line 45
    .line 46
    :goto_0
    return v1

    .line 47
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 48
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᲀᛲᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲀᲁᲀᛷ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lyyds/ᲀᛲᲈᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛵᲇᛷ;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Lyyds/ᲀᛲᲈᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛳᛶ;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget v2, p0, Lyyds/ᲀᛲᲈᛴ;->ᲇᲈᛵᛷ:I

    .line 27
    .line 28
    invoke-static {v2, v0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛳᲀ(III)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-boolean p0, p0, Lyyds/ᲀᛲᲈᛴ;->ᛲᛴᛳᛲ:Z

    .line 33
    .line 34
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    add-int/2addr p0, v0

    .line 39
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-wide v1, -0x3586de68a836eL

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
    iget-object v1, p0, Lyyds/ᲀᛲᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲀᲁᲀᛷ;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-wide v1, -0x3587fe68a836eL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lyyds/ᲀᛲᲈᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛵᲇᛷ;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-wide v1, -0x35891e68a836eL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lyyds/ᲀᛲᲈᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛳᛶ;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-wide v1, -0x358a3e68a836eL

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget v1, p0, Lyyds/ᲀᛲᲈᛴ;->ᲇᲈᛵᛷ:I

    .line 67
    .line 68
    const-wide v2, -0x358b6e68a836eL

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 74
    .line 75
    .line 76
    iget-boolean p0, p0, Lyyds/ᲀᛲᲈᛴ;->ᛲᛴᛳᛲ:Z

    .line 77
    .line 78
    const/16 v1, 0x29

    .line 79
    .line 80
    invoke-static {v0, p0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛱᛳᲇ(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0
.end method
