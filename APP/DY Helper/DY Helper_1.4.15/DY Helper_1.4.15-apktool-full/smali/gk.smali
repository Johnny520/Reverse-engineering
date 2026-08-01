.class public final Lgk;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/lang/reflect/Field;

.field public final β:Ljava/lang/reflect/Field;

.field public final γ:Ljava/lang/reflect/Field;

.field public final δ:Ljava/lang/reflect/Field;

.field public final ε:Ljava/lang/reflect/Field;

.field public final ζ:Ljava/lang/reflect/Field;

.field public final η:Ljava/lang/reflect/Field;

.field public final θ:Ljava/lang/reflect/Field;

.field public final ι:Ljava/lang/reflect/Field;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;I)V
    .locals 2

    .line 1
    and-int/lit8 v0, p10, 0x8

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object p4, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p10, 0x10

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    move-object p5, v1

    .line 12
    :cond_1
    and-int/lit8 v0, p10, 0x20

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    move-object p6, v1

    .line 17
    :cond_2
    and-int/lit8 v0, p10, 0x40

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    move-object p7, v1

    .line 22
    :cond_3
    and-int/lit16 v0, p10, 0x80

    .line 23
    .line 24
    if-eqz v0, :cond_4

    .line 25
    .line 26
    move-object p8, v1

    .line 27
    :cond_4
    and-int/lit16 p10, p10, 0x100

    .line 28
    .line 29
    if-eqz p10, :cond_5

    .line 30
    .line 31
    move-object p9, v1

    .line 32
    :cond_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lgk;->α:Ljava/lang/reflect/Field;

    .line 36
    .line 37
    iput-object p2, p0, Lgk;->β:Ljava/lang/reflect/Field;

    .line 38
    .line 39
    iput-object p3, p0, Lgk;->γ:Ljava/lang/reflect/Field;

    .line 40
    .line 41
    iput-object p4, p0, Lgk;->δ:Ljava/lang/reflect/Field;

    .line 42
    .line 43
    iput-object p5, p0, Lgk;->ε:Ljava/lang/reflect/Field;

    .line 44
    .line 45
    iput-object p6, p0, Lgk;->ζ:Ljava/lang/reflect/Field;

    .line 46
    .line 47
    iput-object p7, p0, Lgk;->η:Ljava/lang/reflect/Field;

    .line 48
    .line 49
    iput-object p8, p0, Lgk;->θ:Ljava/lang/reflect/Field;

    .line 50
    .line 51
    iput-object p9, p0, Lgk;->ι:Ljava/lang/reflect/Field;

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lgk;

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
    check-cast p1, Lgk;

    .line 12
    .line 13
    iget-object v1, p0, Lgk;->α:Ljava/lang/reflect/Field;

    .line 14
    .line 15
    iget-object v3, p1, Lgk;->α:Ljava/lang/reflect/Field;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lgk;->β:Ljava/lang/reflect/Field;

    .line 25
    .line 26
    iget-object v3, p1, Lgk;->β:Ljava/lang/reflect/Field;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lgk;->γ:Ljava/lang/reflect/Field;

    .line 36
    .line 37
    iget-object v3, p1, Lgk;->γ:Ljava/lang/reflect/Field;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lgk;->δ:Ljava/lang/reflect/Field;

    .line 47
    .line 48
    iget-object v3, p1, Lgk;->δ:Ljava/lang/reflect/Field;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lgk;->ε:Ljava/lang/reflect/Field;

    .line 58
    .line 59
    iget-object v3, p1, Lgk;->ε:Ljava/lang/reflect/Field;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget-object v1, p0, Lgk;->ζ:Ljava/lang/reflect/Field;

    .line 69
    .line 70
    iget-object v3, p1, Lgk;->ζ:Ljava/lang/reflect/Field;

    .line 71
    .line 72
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    iget-object v1, p0, Lgk;->η:Ljava/lang/reflect/Field;

    .line 80
    .line 81
    iget-object v3, p1, Lgk;->η:Ljava/lang/reflect/Field;

    .line 82
    .line 83
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_8

    .line 88
    .line 89
    return v2

    .line 90
    :cond_8
    iget-object v1, p0, Lgk;->θ:Ljava/lang/reflect/Field;

    .line 91
    .line 92
    iget-object v3, p1, Lgk;->θ:Ljava/lang/reflect/Field;

    .line 93
    .line 94
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_9

    .line 99
    .line 100
    return v2

    .line 101
    :cond_9
    iget-object p0, p0, Lgk;->ι:Ljava/lang/reflect/Field;

    .line 102
    .line 103
    iget-object p1, p1, Lgk;->ι:Ljava/lang/reflect/Field;

    .line 104
    .line 105
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    if-nez p0, :cond_a

    .line 110
    .line 111
    return v2

    .line 112
    :cond_a
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lgk;->α:Ljava/lang/reflect/Field;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, Lgk;->β:Ljava/lang/reflect/Field;

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    move v2, v0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    :goto_1
    add-int/2addr v1, v2

    .line 25
    mul-int/lit8 v1, v1, 0x1f

    .line 26
    .line 27
    iget-object v2, p0, Lgk;->γ:Ljava/lang/reflect/Field;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    move v2, v0

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    :goto_2
    add-int/2addr v1, v2

    .line 38
    mul-int/lit8 v1, v1, 0x1f

    .line 39
    .line 40
    iget-object v2, p0, Lgk;->δ:Ljava/lang/reflect/Field;

    .line 41
    .line 42
    if-nez v2, :cond_3

    .line 43
    .line 44
    move v2, v0

    .line 45
    goto :goto_3

    .line 46
    :cond_3
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    :goto_3
    add-int/2addr v1, v2

    .line 51
    mul-int/lit8 v1, v1, 0x1f

    .line 52
    .line 53
    iget-object v2, p0, Lgk;->ε:Ljava/lang/reflect/Field;

    .line 54
    .line 55
    if-nez v2, :cond_4

    .line 56
    .line 57
    move v2, v0

    .line 58
    goto :goto_4

    .line 59
    :cond_4
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->hashCode()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    :goto_4
    add-int/2addr v1, v2

    .line 64
    mul-int/lit8 v1, v1, 0x1f

    .line 65
    .line 66
    iget-object v2, p0, Lgk;->ζ:Ljava/lang/reflect/Field;

    .line 67
    .line 68
    if-nez v2, :cond_5

    .line 69
    .line 70
    move v2, v0

    .line 71
    goto :goto_5

    .line 72
    :cond_5
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    :goto_5
    add-int/2addr v1, v2

    .line 77
    mul-int/lit8 v1, v1, 0x1f

    .line 78
    .line 79
    iget-object v2, p0, Lgk;->η:Ljava/lang/reflect/Field;

    .line 80
    .line 81
    if-nez v2, :cond_6

    .line 82
    .line 83
    move v2, v0

    .line 84
    goto :goto_6

    .line 85
    :cond_6
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->hashCode()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    :goto_6
    add-int/2addr v1, v2

    .line 90
    mul-int/lit8 v1, v1, 0x1f

    .line 91
    .line 92
    iget-object v2, p0, Lgk;->θ:Ljava/lang/reflect/Field;

    .line 93
    .line 94
    if-nez v2, :cond_7

    .line 95
    .line 96
    move v2, v0

    .line 97
    goto :goto_7

    .line 98
    :cond_7
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->hashCode()I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    :goto_7
    add-int/2addr v1, v2

    .line 103
    mul-int/lit8 v1, v1, 0x1f

    .line 104
    .line 105
    iget-object p0, p0, Lgk;->ι:Ljava/lang/reflect/Field;

    .line 106
    .line 107
    if-nez p0, :cond_8

    .line 108
    .line 109
    goto :goto_8

    .line 110
    :cond_8
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->hashCode()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    :goto_8
    add-int/2addr v1, v0

    .line 115
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "HolderFields(avatar="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lgk;->α:Ljava/lang/reflect/Field;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", name="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lgk;->β:Ljava/lang/reflect/Field;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", content="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", reply="

    .line 29
    .line 30
    const-string v2, ", time="

    .line 31
    .line 32
    iget-object v3, p0, Lgk;->γ:Ljava/lang/reflect/Field;

    .line 33
    .line 34
    iget-object v4, p0, Lgk;->δ:Ljava/lang/reflect/Field;

    .line 35
    .line 36
    invoke-static {v0, v3, v1, v4, v2}, Llz1;->Β(Ljava/lang/StringBuilder;Ljava/lang/reflect/Field;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", likeArea="

    .line 40
    .line 41
    const-string v2, ", likeIcon="

    .line 42
    .line 43
    iget-object v3, p0, Lgk;->ε:Ljava/lang/reflect/Field;

    .line 44
    .line 45
    iget-object v4, p0, Lgk;->ζ:Ljava/lang/reflect/Field;

    .line 46
    .line 47
    invoke-static {v0, v3, v1, v4, v2}, Llz1;->Β(Ljava/lang/StringBuilder;Ljava/lang/reflect/Field;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v1, ", likeCount="

    .line 51
    .line 52
    const-string v2, ", delegate="

    .line 53
    .line 54
    iget-object v3, p0, Lgk;->η:Ljava/lang/reflect/Field;

    .line 55
    .line 56
    iget-object v4, p0, Lgk;->θ:Ljava/lang/reflect/Field;

    .line 57
    .line 58
    invoke-static {v0, v3, v1, v4, v2}, Llz1;->Β(Ljava/lang/StringBuilder;Ljava/lang/reflect/Field;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object p0, p0, Lgk;->ι:Ljava/lang/reflect/Field;

    .line 62
    .line 63
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string p0, ")"

    .line 67
    .line 68
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method
