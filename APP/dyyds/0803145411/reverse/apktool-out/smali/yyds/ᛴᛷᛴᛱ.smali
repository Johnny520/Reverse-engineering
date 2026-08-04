.class public final Lyyds/ᛴᛷᛴᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:Landroid/view/View;

.field public final ᛵᛸᛸᛷ:I

.field public final ᲀᛲᛳᲀ:Z

.field public final ᲇᲈᛵᛷ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/view/View;IZLjava/lang/String;)V
    .locals 2

    .line 1
    const-wide v0, -0xb8efe68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0xb8f4e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lyyds/ᛴᛷᛴᛱ;->ᛲᲈᲁ:Landroid/view/View;

    .line 21
    .line 22
    iput p2, p0, Lyyds/ᛴᛷᛴᛱ;->ᛵᛸᛸᛷ:I

    .line 23
    .line 24
    iput-boolean p3, p0, Lyyds/ᛴᛷᛴᛱ;->ᲀᛲᛳᲀ:Z

    .line 25
    .line 26
    iput-object p4, p0, Lyyds/ᛴᛷᛴᛱ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lyyds/ᛴᛷᛴᛱ;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lyyds/ᛴᛷᛴᛱ;

    .line 10
    .line 11
    iget-object v0, p0, Lyyds/ᛴᛷᛴᛱ;->ᛲᲈᲁ:Landroid/view/View;

    .line 12
    .line 13
    iget-object v1, p1, Lyyds/ᛴᛷᛴᛱ;->ᛲᲈᲁ:Landroid/view/View;

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
    iget v0, p0, Lyyds/ᛴᛷᛴᛱ;->ᛵᛸᛸᛷ:I

    .line 23
    .line 24
    iget v1, p1, Lyyds/ᛴᛷᛴᛱ;->ᛵᛸᛸᛷ:I

    .line 25
    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-boolean v0, p0, Lyyds/ᛴᛷᛴᛱ;->ᲀᛲᛳᲀ:Z

    .line 30
    .line 31
    iget-boolean v1, p1, Lyyds/ᛴᛷᛴᛱ;->ᲀᛲᛳᲀ:Z

    .line 32
    .line 33
    if-eq v0, v1, :cond_4

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_4
    iget-object p0, p0, Lyyds/ᛴᛷᛴᛱ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 37
    .line 38
    iget-object p1, p1, Lyyds/ᛴᛷᛴᛱ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-nez p0, :cond_5

    .line 45
    .line 46
    :goto_0
    const/4 p0, 0x0

    .line 47
    return p0

    .line 48
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 49
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛷᛴᛱ;->ᛲᲈᲁ:Landroid/view/View;

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
    iget v2, p0, Lyyds/ᛴᛷᛴᛱ;->ᛵᛸᛸᛷ:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛳᲀ(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, Lyyds/ᛴᛷᛴᛱ;->ᲀᛲᛳᲀ:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lyyds/ᲀᲁᲈᲇ;->ᲇᲈᛵᛷ(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object p0, p0, Lyyds/ᛴᛷᛴᛱ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-wide v1, -0xb905e68a836eL

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
    iget-object v1, p0, Lyyds/ᛴᛷᛴᛱ;->ᛲᲈᲁ:Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-wide v1, -0xb915e68a836eL

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
    iget v1, p0, Lyyds/ᛴᛷᛴᛱ;->ᛵᛸᛸᛷ:I

    .line 33
    .line 34
    const-wide v2, -0xb92be68a836eL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 40
    .line 41
    .line 42
    iget-boolean v1, p0, Lyyds/ᛴᛷᛴᛱ;->ᲀᛲᛳᲀ:Z

    .line 43
    .line 44
    const-wide v2, -0xb938e68a836eL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;ZJ)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, Lyyds/ᛴᛷᛴᛱ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 53
    .line 54
    const/16 v1, 0x29

    .line 55
    .line 56
    invoke-static {v0, p0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛷᛵᲇᲀ(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method
