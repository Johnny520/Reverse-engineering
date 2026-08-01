.class public final Lky0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/lang/String;

.field public final β:Lvx;

.field public final γ:Ljava/io/BufferedInputStream;

.field public final δ:[B

.field public final ε:Ljava/lang/String;

.field public final ζ:Ljava/lang/String;

.field public final η:Ljava/lang/String;

.field public final θ:Ljava/lang/String;

.field public final ι:Z

.field public final κ:Ljava/lang/String;

.field public final λ:J

.field public final μ:Ljava/lang/String;

.field public final ν:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lvx;Ljava/io/BufferedInputStream;[BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lky0;->α:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lky0;->β:Lvx;

    .line 7
    .line 8
    iput-object p3, p0, Lky0;->γ:Ljava/io/BufferedInputStream;

    .line 9
    .line 10
    iput-object p4, p0, Lky0;->δ:[B

    .line 11
    .line 12
    iput-object p5, p0, Lky0;->ε:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lky0;->ζ:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lky0;->η:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p8, p0, Lky0;->θ:Ljava/lang/String;

    .line 19
    .line 20
    iput-boolean p9, p0, Lky0;->ι:Z

    .line 21
    .line 22
    iput-object p10, p0, Lky0;->κ:Ljava/lang/String;

    .line 23
    .line 24
    iput-wide p11, p0, Lky0;->λ:J

    .line 25
    .line 26
    iput-object p13, p0, Lky0;->μ:Ljava/lang/String;

    .line 27
    .line 28
    iput-object p14, p0, Lky0;->ν:Ljava/lang/String;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Lky0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, Lky0;

    .line 12
    .line 13
    iget-object v0, p0, Lky0;->α:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, Lky0;->α:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, Lky0;->β:Lvx;

    .line 26
    .line 27
    iget-object v1, p1, Lky0;->β:Lvx;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lvx;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_3
    iget-object v0, p0, Lky0;->γ:Ljava/io/BufferedInputStream;

    .line 38
    .line 39
    iget-object v1, p1, Lky0;->γ:Ljava/io/BufferedInputStream;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_4

    .line 46
    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :cond_4
    iget-object v0, p0, Lky0;->δ:[B

    .line 50
    .line 51
    iget-object v1, p1, Lky0;->δ:[B

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_5

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_5
    iget-object v0, p0, Lky0;->ε:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v1, p1, Lky0;->ε:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_6

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_6
    iget-object v0, p0, Lky0;->ζ:Ljava/lang/String;

    .line 72
    .line 73
    iget-object v1, p1, Lky0;->ζ:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_7

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_7
    iget-object v0, p0, Lky0;->η:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v1, p1, Lky0;->η:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_8

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_8
    iget-object v0, p0, Lky0;->θ:Ljava/lang/String;

    .line 94
    .line 95
    iget-object v1, p1, Lky0;->θ:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_9

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_9
    iget-boolean v0, p0, Lky0;->ι:Z

    .line 105
    .line 106
    iget-boolean v1, p1, Lky0;->ι:Z

    .line 107
    .line 108
    if-eq v0, v1, :cond_a

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_a
    iget-object v0, p0, Lky0;->κ:Ljava/lang/String;

    .line 112
    .line 113
    iget-object v1, p1, Lky0;->κ:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-nez v0, :cond_b

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_b
    iget-wide v0, p0, Lky0;->λ:J

    .line 123
    .line 124
    iget-wide v2, p1, Lky0;->λ:J

    .line 125
    .line 126
    cmp-long v0, v0, v2

    .line 127
    .line 128
    if-eqz v0, :cond_c

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_c
    iget-object v0, p0, Lky0;->μ:Ljava/lang/String;

    .line 132
    .line 133
    iget-object v1, p1, Lky0;->μ:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-nez v0, :cond_d

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_d
    iget-object p0, p0, Lky0;->ν:Ljava/lang/String;

    .line 143
    .line 144
    iget-object p1, p1, Lky0;->ν:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    if-nez p0, :cond_e

    .line 151
    .line 152
    :goto_0
    const/4 p0, 0x0

    .line 153
    return p0

    .line 154
    :cond_e
    :goto_1
    const/4 p0, 0x1

    .line 155
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lky0;->α:Ljava/lang/String;

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
    iget-object v2, p0, Lky0;->β:Lvx;

    .line 11
    .line 12
    invoke-virtual {v2}, Lvx;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Lky0;->γ:Ljava/io/BufferedInputStream;

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
    iget-object v2, p0, Lky0;->δ:[B

    .line 27
    .line 28
    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    add-int/2addr v2, v0

    .line 33
    mul-int/2addr v2, v1

    .line 34
    const/4 v0, 0x0

    .line 35
    iget-object v3, p0, Lky0;->ε:Ljava/lang/String;

    .line 36
    .line 37
    if-nez v3, :cond_0

    .line 38
    .line 39
    move v3, v0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    :goto_0
    add-int/2addr v2, v3

    .line 46
    mul-int/2addr v2, v1

    .line 47
    iget-object v3, p0, Lky0;->ζ:Ljava/lang/String;

    .line 48
    .line 49
    if-nez v3, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    :goto_1
    add-int/2addr v2, v0

    .line 57
    mul-int/2addr v2, v1

    .line 58
    iget-object v0, p0, Lky0;->η:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v2, v1, v0}, La12;->β(IILjava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, Lky0;->θ:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-boolean v2, p0, Lky0;->ι:Z

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-object v2, p0, Lky0;->κ:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-wide v2, p0, Lky0;->λ:J

    .line 83
    .line 84
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-object v2, p0, Lky0;->μ:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget-object p0, p0, Lky0;->ν:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    add-int/2addr p0, v0

    .line 101
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lky0;->δ:[B

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "PreparedImageDownload(url="

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lky0;->α:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v2, ", opened="

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Lky0;->β:Lvx;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v2, ", input="

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, Lky0;->γ:Ljava/io/BufferedInputStream;

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v2, ", headBytes="

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, ", headerMime="

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, ", magicMime="

    .line 53
    .line 54
    const-string v2, ", finalMime="

    .line 55
    .line 56
    iget-object v3, p0, Lky0;->ε:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v4, p0, Lky0;->ζ:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v1, v3, v0, v4, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string v0, ", ext="

    .line 64
    .line 65
    const-string v2, ", transcodeToJpeg="

    .line 66
    .line 67
    iget-object v3, p0, Lky0;->η:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v4, p0, Lky0;->θ:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v1, v3, v0, v4, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-boolean v0, p0, Lky0;->ι:Z

    .line 75
    .line 76
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v0, ", sourceMime="

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lky0;->κ:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v0, ", contentLength="

    .line 90
    .line 91
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    iget-wide v2, p0, Lky0;->λ:J

    .line 95
    .line 96
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v0, ", headerHex="

    .line 100
    .line 101
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lky0;->μ:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v0, ", headerTextPreview="

    .line 110
    .line 111
    const-string v2, ")"

    .line 112
    .line 113
    iget-object p0, p0, Lky0;->ν:Ljava/lang/String;

    .line 114
    .line 115
    invoke-static {v1, v0, p0, v2}, Lnx;->μ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    return-object p0
.end method
