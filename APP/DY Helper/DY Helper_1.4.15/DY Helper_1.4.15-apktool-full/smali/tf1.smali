.class public final Ltf1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/lang/String;

.field public final β:Ljava/lang/String;

.field public final γ:I

.field public final δ:Ljava/lang/String;

.field public final ε:Ljava/lang/String;

.field public final ζ:Ljava/lang/String;

.field public final η:Ljava/lang/Integer;

.field public final θ:Ljava/lang/Integer;

.field public final ι:Ljava/lang/Integer;

.field public final κ:Ljava/lang/String;

.field public final λ:Ljava/lang/String;

.field public final μ:Ljava/lang/String;

.field public final ν:Ljava/util/List;

.field public final ξ:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltf1;->α:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ltf1;->β:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, Ltf1;->γ:I

    .line 9
    .line 10
    iput-object p4, p0, Ltf1;->δ:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Ltf1;->ε:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Ltf1;->ζ:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Ltf1;->η:Ljava/lang/Integer;

    .line 17
    .line 18
    iput-object p8, p0, Ltf1;->θ:Ljava/lang/Integer;

    .line 19
    .line 20
    iput-object p9, p0, Ltf1;->ι:Ljava/lang/Integer;

    .line 21
    .line 22
    iput-object p10, p0, Ltf1;->κ:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p11, p0, Ltf1;->λ:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p12, p0, Ltf1;->μ:Ljava/lang/String;

    .line 27
    .line 28
    iput-object p13, p0, Ltf1;->ν:Ljava/util/List;

    .line 29
    .line 30
    iput-object p14, p0, Ltf1;->ξ:Lorg/json/JSONObject;

    .line 31
    .line 32
    return-void
.end method

.method public static final α(Ljava/util/ArrayList;Ltf1;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Ltf1;->ν:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ltf1;

    .line 21
    .line 22
    invoke-static {p0, v0}, Ltf1;->α(Ljava/util/ArrayList;Ltf1;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
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
    instance-of v0, p1, Ltf1;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, Ltf1;

    .line 12
    .line 13
    iget-object v0, p0, Ltf1;->α:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, Ltf1;->α:Ljava/lang/String;

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
    iget-object v0, p0, Ltf1;->β:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p1, Ltf1;->β:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget v0, p0, Ltf1;->γ:I

    .line 38
    .line 39
    iget v1, p1, Ltf1;->γ:I

    .line 40
    .line 41
    if-eq v0, v1, :cond_4

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_4
    iget-object v0, p0, Ltf1;->δ:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v1, p1, Ltf1;->δ:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_5

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :cond_5
    iget-object v0, p0, Ltf1;->ε:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v1, p1, Ltf1;->ε:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_6

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_6
    iget-object v0, p0, Ltf1;->ζ:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v1, p1, Ltf1;->ζ:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_7

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_7
    iget-object v0, p0, Ltf1;->η:Ljava/lang/Integer;

    .line 80
    .line 81
    iget-object v1, p1, Ltf1;->η:Ljava/lang/Integer;

    .line 82
    .line 83
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_8

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_8
    iget-object v0, p0, Ltf1;->θ:Ljava/lang/Integer;

    .line 91
    .line 92
    iget-object v1, p1, Ltf1;->θ:Ljava/lang/Integer;

    .line 93
    .line 94
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_9

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_9
    iget-object v0, p0, Ltf1;->ι:Ljava/lang/Integer;

    .line 102
    .line 103
    iget-object v1, p1, Ltf1;->ι:Ljava/lang/Integer;

    .line 104
    .line 105
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_a

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_a
    iget-object v0, p0, Ltf1;->κ:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v1, p1, Ltf1;->κ:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_b

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_b
    iget-object v0, p0, Ltf1;->λ:Ljava/lang/String;

    .line 124
    .line 125
    iget-object v1, p1, Ltf1;->λ:Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-nez v0, :cond_c

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_c
    iget-object v0, p0, Ltf1;->μ:Ljava/lang/String;

    .line 135
    .line 136
    iget-object v1, p1, Ltf1;->μ:Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-nez v0, :cond_d

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_d
    iget-object v0, p0, Ltf1;->ν:Ljava/util/List;

    .line 146
    .line 147
    iget-object v1, p1, Ltf1;->ν:Ljava/util/List;

    .line 148
    .line 149
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-nez v0, :cond_e

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_e
    iget-object p0, p0, Ltf1;->ξ:Lorg/json/JSONObject;

    .line 157
    .line 158
    iget-object p1, p1, Ltf1;->ξ:Lorg/json/JSONObject;

    .line 159
    .line 160
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    if-nez p0, :cond_f

    .line 165
    .line 166
    :goto_0
    const/4 p0, 0x0

    .line 167
    return p0

    .line 168
    :cond_f
    :goto_1
    const/4 p0, 0x1

    .line 169
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Ltf1;->α:Ljava/lang/String;

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
    const/4 v2, 0x0

    .line 11
    iget-object v3, p0, Ltf1;->β:Ljava/lang/String;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    move v3, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    :goto_0
    add-int/2addr v0, v3

    .line 22
    mul-int/2addr v0, v1

    .line 23
    iget v3, p0, Ltf1;->γ:I

    .line 24
    .line 25
    invoke-static {v3, v0, v1}, La12;->α(III)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v3, p0, Ltf1;->δ:Ljava/lang/String;

    .line 30
    .line 31
    if-nez v3, :cond_1

    .line 32
    .line 33
    move v3, v2

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    :goto_1
    add-int/2addr v0, v3

    .line 40
    mul-int/2addr v0, v1

    .line 41
    iget-object v3, p0, Ltf1;->ε:Ljava/lang/String;

    .line 42
    .line 43
    if-nez v3, :cond_2

    .line 44
    .line 45
    move v3, v2

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    :goto_2
    add-int/2addr v0, v3

    .line 52
    mul-int/2addr v0, v1

    .line 53
    iget-object v3, p0, Ltf1;->ζ:Ljava/lang/String;

    .line 54
    .line 55
    if-nez v3, :cond_3

    .line 56
    .line 57
    move v3, v2

    .line 58
    goto :goto_3

    .line 59
    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    :goto_3
    add-int/2addr v0, v3

    .line 64
    mul-int/2addr v0, v1

    .line 65
    iget-object v3, p0, Ltf1;->η:Ljava/lang/Integer;

    .line 66
    .line 67
    if-nez v3, :cond_4

    .line 68
    .line 69
    move v3, v2

    .line 70
    goto :goto_4

    .line 71
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    :goto_4
    add-int/2addr v0, v3

    .line 76
    mul-int/2addr v0, v1

    .line 77
    iget-object v3, p0, Ltf1;->θ:Ljava/lang/Integer;

    .line 78
    .line 79
    if-nez v3, :cond_5

    .line 80
    .line 81
    move v3, v2

    .line 82
    goto :goto_5

    .line 83
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    :goto_5
    add-int/2addr v0, v3

    .line 88
    mul-int/2addr v0, v1

    .line 89
    iget-object v3, p0, Ltf1;->ι:Ljava/lang/Integer;

    .line 90
    .line 91
    if-nez v3, :cond_6

    .line 92
    .line 93
    move v3, v2

    .line 94
    goto :goto_6

    .line 95
    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    :goto_6
    add-int/2addr v0, v3

    .line 100
    mul-int/2addr v0, v1

    .line 101
    iget-object v3, p0, Ltf1;->κ:Ljava/lang/String;

    .line 102
    .line 103
    if-nez v3, :cond_7

    .line 104
    .line 105
    move v3, v2

    .line 106
    goto :goto_7

    .line 107
    :cond_7
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    :goto_7
    add-int/2addr v0, v3

    .line 112
    mul-int/2addr v0, v1

    .line 113
    iget-object v3, p0, Ltf1;->λ:Ljava/lang/String;

    .line 114
    .line 115
    if-nez v3, :cond_8

    .line 116
    .line 117
    goto :goto_8

    .line 118
    :cond_8
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    :goto_8
    add-int/2addr v0, v2

    .line 123
    mul-int/2addr v0, v1

    .line 124
    iget-object v2, p0, Ltf1;->μ:Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    iget-object v2, p0, Ltf1;->ν:Ljava/util/List;

    .line 131
    .line 132
    invoke-static {v2, v0, v1}, La12;->γ(Ljava/util/List;II)I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    iget-object p0, p0, Ltf1;->ξ:Lorg/json/JSONObject;

    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    add-int/2addr p0, v0

    .line 143
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", uniqueTaskId="

    .line 2
    .line 3
    const-string v1, ", taskStatus="

    .line 4
    .line 5
    const-string v2, "PetElfTask(taskId="

    .line 6
    .line 7
    iget-object v3, p0, Ltf1;->α:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Ltf1;->β:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", token="

    .line 16
    .line 17
    const-string v2, ", taskKey="

    .line 18
    .line 19
    iget v3, p0, Ltf1;->γ:I

    .line 20
    .line 21
    iget-object v4, p0, Ltf1;->δ:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Llz1;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", taskName="

    .line 27
    .line 28
    const-string v2, ", taskType="

    .line 29
    .line 30
    iget-object v3, p0, Ltf1;->ε:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v4, p0, Ltf1;->ζ:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Ltf1;->η:Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", currentTimes="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Ltf1;->θ:Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, ", totalTimes="

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Ltf1;->ι:Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, ", title="

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Ltf1;->κ:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v1, ", subtitle="

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v1, ", rewardEnterFrom="

    .line 78
    .line 79
    const-string v2, ", subTasks="

    .line 80
    .line 81
    iget-object v3, p0, Ltf1;->λ:Ljava/lang/String;

    .line 82
    .line 83
    iget-object v4, p0, Ltf1;->μ:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, Ltf1;->ν:Ljava/util/List;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", raw="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object p0, p0, Ltf1;->ξ:Lorg/json/JSONObject;

    .line 99
    .line 100
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string p0, ")"

    .line 104
    .line 105
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0
.end method

.method public final β()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ltf1;->γ()Lfg1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_8

    .line 11
    .line 12
    iget-object v2, p0, Ltf1;->ι:Ljava/lang/Integer;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-eq v0, v3, :cond_2

    .line 16
    .line 17
    const/4 p0, 0x2

    .line 18
    if-ne v0, p0, :cond_1

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-lez p0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v2, v1

    .line 30
    :goto_0
    if-eqz v2, :cond_9

    .line 31
    .line 32
    goto :goto_4

    .line 33
    :cond_1
    invoke-static {}, Lγ;->κ()V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return-object p0

    .line 38
    :cond_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object p0, p0, Ltf1;->α:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    const v4, 0x5ee12639

    .line 49
    .line 50
    .line 51
    if-eq v3, v4, :cond_4

    .line 52
    .line 53
    packed-switch v3, :pswitch_data_0

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :pswitch_0
    const-string v3, "601052"

    .line 58
    .line 59
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_5

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :pswitch_1
    const-string v0, "601051"

    .line 67
    .line 68
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-nez p0, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    const/16 p0, 0xa

    .line 76
    .line 77
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    goto :goto_2

    .line 82
    :pswitch_2
    const-string v3, "601050"

    .line 83
    .line 84
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-nez p0, :cond_5

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    const-string v3, "601374"

    .line 92
    .line 93
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-nez p0, :cond_5

    .line 98
    .line 99
    :goto_1
    move-object v0, v1

    .line 100
    :cond_5
    :goto_2
    if-eqz v0, :cond_6

    .line 101
    .line 102
    const-string p0, "task-id-fallback"

    .line 103
    .line 104
    return-object p0

    .line 105
    :cond_6
    if-eqz v2, :cond_7

    .line 106
    .line 107
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-lez p0, :cond_7

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_7
    move-object v2, v1

    .line 115
    :goto_3
    if-eqz v2, :cond_9

    .line 116
    .line 117
    :goto_4
    const-string p0, "server-total-times"

    .line 118
    .line 119
    return-object p0

    .line 120
    :cond_8
    invoke-static {p0}, Lrg1;->β(Ltf1;)Lqg1;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    if-eqz p0, :cond_9

    .line 125
    .line 126
    iget-object p0, p0, Lqg1;->β:Ljava/lang/String;

    .line 127
    .line 128
    return-object p0

    .line 129
    :cond_9
    return-object v1

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x5ee11ab4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final γ()Lfg1;
    .locals 8

    .line 1
    iget-object v0, p0, Ltf1;->ε:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    :goto_0
    if-ge v3, v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-static {v4}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 28
    .line 29
    .line 30
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const/4 v0, 0x0

    .line 48
    :goto_1
    if-nez v0, :cond_3

    .line 49
    .line 50
    const-string v0, ""

    .line 51
    .line 52
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    sget-object v2, Lfg1;->ζ:Lfg1;

    .line 57
    .line 58
    sget-object v3, Lfg1;->η:Lfg1;

    .line 59
    .line 60
    sget-object v4, Lfg1;->ε:Lfg1;

    .line 61
    .line 62
    sparse-switch v1, :sswitch_data_0

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :sswitch_0
    const-string v1, "mutualmessage"

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_4

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :sswitch_1
    const-string v1, "msgsend"

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_4

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :sswitch_2
    const-string v1, "contentshare"

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_5

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :sswitch_3
    const-string v1, "msgsendnum"

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_4

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :sswitch_4
    const-string v1, "pictureshare"

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-nez v0, :cond_5

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :sswitch_5
    const-string v1, "messagesend"

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_4

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_4
    move-object v0, v4

    .line 121
    goto :goto_3

    .line 122
    :sswitch_6
    const-string v1, "imageshare"

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-nez v0, :cond_5

    .line 129
    .line 130
    :goto_2
    move-object v0, v3

    .line 131
    goto :goto_3

    .line 132
    :cond_5
    move-object v0, v2

    .line 133
    :goto_3
    iget-object v1, p0, Ltf1;->α:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    const v6, 0x5ee12639

    .line 140
    .line 141
    .line 142
    iget-object v7, p0, Ltf1;->κ:Ljava/lang/String;

    .line 143
    .line 144
    iget-object p0, p0, Ltf1;->ζ:Ljava/lang/String;

    .line 145
    .line 146
    if-eq v5, v6, :cond_8

    .line 147
    .line 148
    packed-switch v5, :pswitch_data_0

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :pswitch_0
    const-string v2, "601053"

    .line 153
    .line 154
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-nez v1, :cond_6

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :pswitch_1
    const-string v5, "601052"

    .line 162
    .line 163
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-nez v1, :cond_b

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :pswitch_2
    const-string v2, "601051"

    .line 171
    .line 172
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-nez v1, :cond_6

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :pswitch_3
    const-string v2, "601050"

    .line 180
    .line 181
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-nez v1, :cond_6

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_6
    invoke-static {v7, p0}, Le81;->λ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 189
    .line 190
    .line 191
    move-result p0

    .line 192
    if-eqz p0, :cond_7

    .line 193
    .line 194
    return-object v4

    .line 195
    :cond_7
    return-object v3

    .line 196
    :cond_8
    const-string v5, "601374"

    .line 197
    .line 198
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-nez v1, :cond_b

    .line 203
    .line 204
    :goto_4
    sget-object v1, Lxf1;->α:[I

    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    aget v1, v1, v2

    .line 211
    .line 212
    const/4 v2, 0x1

    .line 213
    if-ne v1, v2, :cond_a

    .line 214
    .line 215
    invoke-static {v7, p0}, Le81;->λ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    if-eqz p0, :cond_9

    .line 220
    .line 221
    return-object v4

    .line 222
    :cond_9
    return-object v3

    .line 223
    :cond_a
    return-object v0

    .line 224
    :cond_b
    return-object v2

    .line 225
    :sswitch_data_0
    .sparse-switch
        -0x54eab89c -> :sswitch_6
        -0x33fc8bf1 -> :sswitch_5
        -0x2dc29e5f -> :sswitch_4
        -0x20609ba3 -> :sswitch_3
        0x32a8ff06 -> :sswitch_2
        0x5025ce89 -> :sswitch_1
        0x69040973 -> :sswitch_0
    .end sparse-switch

    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    :pswitch_data_0
    .packed-switch 0x5ee11ab4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final δ()Ljava/lang/Integer;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ltf1;->γ()Lfg1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_8

    .line 11
    .line 12
    iget-object v2, p0, Ltf1;->ι:Ljava/lang/Integer;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-eq v0, v3, :cond_2

    .line 16
    .line 17
    const/4 p0, 0x2

    .line 18
    if-ne v0, p0, :cond_1

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-lez p0, :cond_0

    .line 27
    .line 28
    return-object v2

    .line 29
    :cond_0
    return-object v1

    .line 30
    :cond_1
    invoke-static {}, Lγ;->κ()V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0

    .line 35
    :cond_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object p0, p0, Ltf1;->α:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const v4, 0x5ee12639

    .line 46
    .line 47
    .line 48
    if-eq v3, v4, :cond_4

    .line 49
    .line 50
    packed-switch v3, :pswitch_data_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :pswitch_0
    const-string v3, "601052"

    .line 55
    .line 56
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-nez p0, :cond_5

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :pswitch_1
    const-string v0, "601051"

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-nez p0, :cond_3

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    const/16 p0, 0xa

    .line 73
    .line 74
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    goto :goto_1

    .line 79
    :pswitch_2
    const-string v3, "601050"

    .line 80
    .line 81
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-nez p0, :cond_5

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    const-string v3, "601374"

    .line 89
    .line 90
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    if-nez p0, :cond_5

    .line 95
    .line 96
    :goto_0
    move-object v0, v1

    .line 97
    :cond_5
    :goto_1
    if-nez v0, :cond_7

    .line 98
    .line 99
    if-eqz v2, :cond_6

    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-lez p0, :cond_6

    .line 106
    .line 107
    return-object v2

    .line 108
    :cond_6
    return-object v1

    .line 109
    :cond_7
    return-object v0

    .line 110
    :cond_8
    invoke-static {p0}, Lrg1;->β(Ltf1;)Lqg1;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    if-eqz p0, :cond_9

    .line 115
    .line 116
    iget p0, p0, Lqg1;->α:I

    .line 117
    .line 118
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0

    .line 123
    :cond_9
    return-object v1

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x5ee11ab4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
