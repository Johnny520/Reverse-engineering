.class public final Lsd0;
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


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsd0;->α:Ljava/lang/reflect/Field;

    .line 5
    .line 6
    iput-object p2, p0, Lsd0;->β:Ljava/lang/reflect/Field;

    .line 7
    .line 8
    iput-object p3, p0, Lsd0;->γ:Ljava/lang/reflect/Field;

    .line 9
    .line 10
    iput-object p4, p0, Lsd0;->δ:Ljava/lang/reflect/Field;

    .line 11
    .line 12
    iput-object p5, p0, Lsd0;->ε:Ljava/lang/reflect/Field;

    .line 13
    .line 14
    iput-object p6, p0, Lsd0;->ζ:Ljava/lang/reflect/Field;

    .line 15
    .line 16
    iput-object p7, p0, Lsd0;->η:Ljava/lang/reflect/Field;

    .line 17
    .line 18
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
    instance-of v1, p1, Lsd0;

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
    check-cast p1, Lsd0;

    .line 12
    .line 13
    iget-object v1, p0, Lsd0;->α:Ljava/lang/reflect/Field;

    .line 14
    .line 15
    iget-object v3, p1, Lsd0;->α:Ljava/lang/reflect/Field;

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
    iget-object v1, p0, Lsd0;->β:Ljava/lang/reflect/Field;

    .line 25
    .line 26
    iget-object v3, p1, Lsd0;->β:Ljava/lang/reflect/Field;

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
    iget-object v1, p0, Lsd0;->γ:Ljava/lang/reflect/Field;

    .line 36
    .line 37
    iget-object v3, p1, Lsd0;->γ:Ljava/lang/reflect/Field;

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
    iget-object v1, p0, Lsd0;->δ:Ljava/lang/reflect/Field;

    .line 47
    .line 48
    iget-object v3, p1, Lsd0;->δ:Ljava/lang/reflect/Field;

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
    iget-object v1, p0, Lsd0;->ε:Ljava/lang/reflect/Field;

    .line 58
    .line 59
    iget-object v3, p1, Lsd0;->ε:Ljava/lang/reflect/Field;

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
    iget-object v1, p0, Lsd0;->ζ:Ljava/lang/reflect/Field;

    .line 69
    .line 70
    iget-object v3, p1, Lsd0;->ζ:Ljava/lang/reflect/Field;

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
    iget-object p0, p0, Lsd0;->η:Ljava/lang/reflect/Field;

    .line 80
    .line 81
    iget-object p1, p1, Lsd0;->η:Ljava/lang/reflect/Field;

    .line 82
    .line 83
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    if-nez p0, :cond_8

    .line 88
    .line 89
    return v2

    .line 90
    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lsd0;->α:Ljava/lang/reflect/Field;

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
    iget-object v2, p0, Lsd0;->β:Ljava/lang/reflect/Field;

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
    iget-object v2, p0, Lsd0;->γ:Ljava/lang/reflect/Field;

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
    iget-object v2, p0, Lsd0;->δ:Ljava/lang/reflect/Field;

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
    iget-object v2, p0, Lsd0;->ε:Ljava/lang/reflect/Field;

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
    iget-object v2, p0, Lsd0;->ζ:Ljava/lang/reflect/Field;

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
    iget-object p0, p0, Lsd0;->η:Ljava/lang/reflect/Field;

    .line 80
    .line 81
    if-nez p0, :cond_6

    .line 82
    .line 83
    goto :goto_6

    .line 84
    :cond_6
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->hashCode()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    :goto_6
    add-int/2addr v1, v0

    .line 89
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "SerializedIdentityFields(uid="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lsd0;->α:Ljava/lang/reflect/Field;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", secUid="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lsd0;->β:Ljava/lang/reflect/Field;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", conversationId="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", uniqueId="

    .line 29
    .line 30
    const-string v2, ", shortId="

    .line 31
    .line 32
    iget-object v3, p0, Lsd0;->γ:Ljava/lang/reflect/Field;

    .line 33
    .line 34
    iget-object v4, p0, Lsd0;->δ:Ljava/lang/reflect/Field;

    .line 35
    .line 36
    invoke-static {v0, v3, v1, v4, v2}, Llz1;->Β(Ljava/lang/StringBuilder;Ljava/lang/reflect/Field;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", remarkName="

    .line 40
    .line 41
    const-string v2, ", nickname="

    .line 42
    .line 43
    iget-object v3, p0, Lsd0;->ε:Ljava/lang/reflect/Field;

    .line 44
    .line 45
    iget-object v4, p0, Lsd0;->ζ:Ljava/lang/reflect/Field;

    .line 46
    .line 47
    invoke-static {v0, v3, v1, v4, v2}, Llz1;->Β(Ljava/lang/StringBuilder;Ljava/lang/reflect/Field;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, Lsd0;->η:Ljava/lang/reflect/Field;

    .line 51
    .line 52
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p0, ")"

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method
