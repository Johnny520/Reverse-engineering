.class public final Lyyds/ᲈᲁᛷᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Z

.field public final ᛲᲈᲁ:I

.field public final ᛵᛸᛸᛷ:Ljava/lang/String;

.field public final ᲀᛲᛳᲀ:Ljava/lang/String;

.field public final ᲇᲈᛵᛷ:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lyyds/ᲈᲁᛷᲀ;->ᛲᲈᲁ:I

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲈᲁᛷᲀ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᲈᲁᛷᲀ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lyyds/ᲈᲁᛷᲀ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 11
    .line 12
    iput-boolean p5, p0, Lyyds/ᲈᲁᛷᲀ;->ᛲᛴᛳᛲ:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lyyds/ᲈᲁᛷᲀ;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lyyds/ᲈᲁᛷᲀ;

    .line 10
    .line 11
    iget v0, p0, Lyyds/ᲈᲁᛷᲀ;->ᛲᲈᲁ:I

    .line 12
    .line 13
    iget v1, p1, Lyyds/ᲈᲁᛷᲀ;->ᛲᲈᲁ:I

    .line 14
    .line 15
    if-ne v0, v1, :cond_2

    .line 16
    .line 17
    iget-boolean v0, p0, Lyyds/ᲈᲁᛷᲀ;->ᛲᛴᛳᛲ:Z

    .line 18
    .line 19
    iget-boolean v1, p1, Lyyds/ᲈᲁᛷᲀ;->ᛲᛴᛳᛲ:Z

    .line 20
    .line 21
    if-ne v0, v1, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lyyds/ᲈᲁᛷᲀ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v1, p1, Lyyds/ᲈᲁᛷᲀ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, Lyyds/ᲈᲁᛷᲀ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, Lyyds/ᲈᲁᛷᲀ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object p0, p0, Lyyds/ᲈᲁᛷᲀ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 44
    .line 45
    iget-object p1, p1, Lyyds/ᲈᲁᛷᲀ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_2

    .line 52
    .line 53
    :goto_0
    const/4 p0, 0x1

    .line 54
    return p0

    .line 55
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 56
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, Lyyds/ᲈᲁᛷᲀ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x40

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget v1, p0, Lyyds/ᲈᲁᛷᲀ;->ᛲᲈᲁ:I

    .line 10
    .line 11
    add-int/2addr v1, v0

    .line 12
    iget-object v0, p0, Lyyds/ᲈᲁᛷᲀ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lyyds/ᲈᲁᛷᲀ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    mul-int/2addr v2, v0

    .line 25
    iget-object p0, p0, Lyyds/ᲈᲁᛷᲀ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    mul-int/2addr p0, v2

    .line 32
    add-int/2addr p0, v1

    .line 33
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lyyds/ᲈᲁᛷᲀ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, " itf"

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v0, ""

    .line 9
    .line 10
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lyyds/ᲈᲁᛷᲀ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, "."

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Lyyds/ᲈᲁᛷᲀ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lyyds/ᲈᲁᛷᲀ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v2, " ("

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget p0, p0, Lyyds/ᲈᲁᛷᲀ;->ᛲᲈᲁ:I

    .line 41
    .line 42
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string p0, ")"

    .line 49
    .line 50
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method
