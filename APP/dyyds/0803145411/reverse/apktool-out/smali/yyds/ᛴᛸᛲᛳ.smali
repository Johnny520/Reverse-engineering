.class public final Lyyds/ᛴᛸᛲᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:Ljava/lang/Class;

.field public final ᛵᛸᛸᛷ:Ljava/lang/Object;

.field public ᲀᛲᛳᲀ:Z

.field public ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(ILjava/lang/Class;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lyyds/ᛴᛸᛲᛳ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p3, p0, Lyyds/ᛴᛸᛲᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    iput-boolean p2, p0, Lyyds/ᛴᛸᛲᛳ;->ᲀᛲᛳᲀ:Z

    .line 10
    .line 11
    iput p1, p0, Lyyds/ᛴᛸᛲᛳ;->ᲇᲈᛵᛷ:I

    .line 12
    .line 13
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
    instance-of v0, p1, Lyyds/ᛴᛸᛲᛳ;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lyyds/ᛴᛸᛲᛳ;

    .line 10
    .line 11
    iget-object v0, p0, Lyyds/ᛴᛸᛲᛳ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 12
    .line 13
    iget-object v1, p1, Lyyds/ᛴᛸᛲᛳ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, Lyyds/ᛴᛸᛲᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v1, p1, Lyyds/ᛴᛸᛲᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-boolean v0, p0, Lyyds/ᛴᛸᛲᛳ;->ᲀᛲᛳᲀ:Z

    .line 34
    .line 35
    iget-boolean v1, p1, Lyyds/ᛴᛸᛲᛳ;->ᲀᛲᛳᲀ:Z

    .line 36
    .line 37
    if-eq v0, v1, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget p0, p0, Lyyds/ᛴᛸᛲᛳ;->ᲇᲈᛵᛷ:I

    .line 41
    .line 42
    iget p1, p1, Lyyds/ᛴᛸᛲᛳ;->ᲇᲈᛵᛷ:I

    .line 43
    .line 44
    if-eq p0, p1, :cond_5

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
    iget-object v0, p0, Lyyds/ᛴᛸᛲᛳ;->ᛲᲈᲁ:Ljava/lang/Class;

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
    iget-object v2, p0, Lyyds/ᛴᛸᛲᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    :goto_0
    add-int/2addr v0, v2

    .line 21
    mul-int/lit16 v0, v0, 0x3c1

    .line 22
    .line 23
    iget-boolean v2, p0, Lyyds/ᛴᛸᛲᛳ;->ᲀᛲᛳᲀ:Z

    .line 24
    .line 25
    invoke-static {v0, v1, v2}, Lyyds/ᲀᲁᲈᲇ;->ᲇᲈᛵᛷ(IIZ)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget p0, p0, Lyyds/ᛴᛸᛲᛳ;->ᲇᲈᛵᛷ:I

    .line 30
    .line 31
    invoke-static {p0}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    add-int/2addr p0, v0

    .line 36
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛸᛲᛳ;->ᲀᛲᛳᲀ:Z

    .line 2
    .line 3
    iget v1, p0, Lyyds/ᛴᛸᛲᛳ;->ᲇᲈᛵᛷ:I

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v3, "Configuration(declaringClass="

    .line 8
    .line 9
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v3, p0, Lyyds/ᛴᛸᛲᛳ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v3, ", memberInstance="

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Lyyds/ᛴᛸᛲᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p0, ", processorResolver=null, superclass="

    .line 28
    .line 29
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p0, ", optional="

    .line 36
    .line 37
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    if-eq v1, p0, :cond_2

    .line 42
    .line 43
    const/4 p0, 0x2

    .line 44
    if-eq v1, p0, :cond_1

    .line 45
    .line 46
    const/4 p0, 0x3

    .line 47
    if-eq v1, p0, :cond_0

    .line 48
    .line 49
    const-string p0, "null"

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const-string p0, "SILENT"

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const-string p0, "NOTICE"

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    const-string p0, "NO"

    .line 59
    .line 60
    :goto_0
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p0, ")"

    .line 64
    .line 65
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method
