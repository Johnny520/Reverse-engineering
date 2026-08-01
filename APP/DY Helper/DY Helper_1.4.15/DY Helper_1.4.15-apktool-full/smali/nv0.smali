.class public final Lnv0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/lang/String;

.field public final β:Ljava/lang/String;

.field public final γ:Llv0;

.field public final δ:Ljava/util/Set;

.field public final ε:I

.field public final ζ:La80;

.field public final η:La80;

.field public final θ:La80;

.field public final ι:La80;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Llv0;Ljava/util/Set;ILa80;Lgp0;I)V
    .locals 3

    .line 1
    new-instance v0, Lgp0;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lgp0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lgp0;

    .line 9
    .line 10
    const/16 v2, 0x18

    .line 11
    .line 12
    invoke-direct {v1, v2}, Lgp0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    and-int/lit16 p8, p8, 0x200

    .line 16
    .line 17
    if-eqz p8, :cond_0

    .line 18
    .line 19
    const/4 p7, 0x0

    .line 20
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lnv0;->α:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p2, p0, Lnv0;->β:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p3, p0, Lnv0;->γ:Llv0;

    .line 28
    .line 29
    iput-object p4, p0, Lnv0;->δ:Ljava/util/Set;

    .line 30
    .line 31
    iput p5, p0, Lnv0;->ε:I

    .line 32
    .line 33
    iput-object v0, p0, Lnv0;->ζ:La80;

    .line 34
    .line 35
    iput-object v1, p0, Lnv0;->η:La80;

    .line 36
    .line 37
    iput-object p6, p0, Lnv0;->θ:La80;

    .line 38
    .line 39
    iput-object p7, p0, Lnv0;->ι:La80;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Lnv0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Lnv0;

    .line 11
    .line 12
    iget-object v0, p0, Lnv0;->α:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v1, p1, Lnv0;->α:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget-object v0, p0, Lnv0;->β:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v1, p1, Lnv0;->β:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    iget-object v0, p0, Lnv0;->γ:Llv0;

    .line 35
    .line 36
    iget-object v1, p1, Lnv0;->γ:Llv0;

    .line 37
    .line 38
    if-eq v0, v1, :cond_4

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_4
    iget-object v0, p0, Lnv0;->δ:Ljava/util/Set;

    .line 42
    .line 43
    iget-object v1, p1, Lnv0;->δ:Ljava/util/Set;

    .line 44
    .line 45
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_5

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_5
    iget v0, p0, Lnv0;->ε:I

    .line 53
    .line 54
    iget v1, p1, Lnv0;->ε:I

    .line 55
    .line 56
    if-eq v0, v1, :cond_6

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_6
    iget-object v0, p0, Lnv0;->ζ:La80;

    .line 60
    .line 61
    iget-object v1, p1, Lnv0;->ζ:La80;

    .line 62
    .line 63
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_7

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_7
    iget-object v0, p0, Lnv0;->η:La80;

    .line 71
    .line 72
    iget-object v1, p1, Lnv0;->η:La80;

    .line 73
    .line 74
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_8

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_8
    iget-object v0, p0, Lnv0;->θ:La80;

    .line 82
    .line 83
    iget-object v1, p1, Lnv0;->θ:La80;

    .line 84
    .line 85
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_9

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_9
    iget-object p0, p0, Lnv0;->ι:La80;

    .line 93
    .line 94
    iget-object p1, p1, Lnv0;->ι:La80;

    .line 95
    .line 96
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-nez p0, :cond_a

    .line 101
    .line 102
    :goto_0
    const/4 p0, 0x0

    .line 103
    return p0

    .line 104
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 105
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lnv0;->α:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget-object v2, p0, Lnv0;->β:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lnv0;->γ:Llv0;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/lit16 v2, v2, 0x3c1

    .line 24
    .line 25
    iget-object v0, p0, Lnv0;->δ:Ljava/util/Set;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    add-int/2addr v0, v2

    .line 32
    mul-int/2addr v0, v1

    .line 33
    iget v2, p0, Lnv0;->ε:I

    .line 34
    .line 35
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget-object v2, p0, Lnv0;->ζ:La80;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    add-int/2addr v2, v0

    .line 46
    mul-int/2addr v2, v1

    .line 47
    iget-object v0, p0, Lnv0;->η:La80;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    add-int/2addr v0, v2

    .line 54
    mul-int/2addr v0, v1

    .line 55
    iget-object v2, p0, Lnv0;->θ:La80;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    add-int/2addr v2, v0

    .line 62
    mul-int/2addr v2, v1

    .line 63
    iget-object p0, p0, Lnv0;->ι:La80;

    .line 64
    .line 65
    if-nez p0, :cond_0

    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    :goto_0
    add-int/2addr v2, p0

    .line 74
    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", title="

    .line 2
    .line 3
    const-string v1, ", iconType="

    .line 4
    .line 5
    const-string v2, "LongPressPanelAction(id="

    .line 6
    .line 7
    iget-object v3, p0, Lnv0;->α:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lnv0;->β:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lnv0;->γ:Llv0;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", customIconRes=null, targets="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lnv0;->δ:Ljava/util/Set;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", order="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget v1, p0, Lnv0;->ε:I

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", enabled="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lnv0;->ζ:La80;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", visible="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lnv0;->η:La80;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, ", onClick="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lnv0;->θ:La80;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ", onLongClick="

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-object p0, p0, Lnv0;->ι:La80;

    .line 76
    .line 77
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string p0, ")"

    .line 81
    .line 82
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0
.end method
