.class public final L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲兰苏;
.super L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:I

.field public 飘花落叶言子楪世兰苏哲:Ljava/lang/Class;

.field public 飘花落叶言子楪世哲兰苏:Ljava/lang/String;

.field public 飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

.field public final 飘花落叶言子楪苏世兰哲:Ljava/util/ArrayList;

.field public 飘花落叶言子楪苏世哲兰:Lorg/luckypray/dexkit/query/enums/MatchType;

.field public final 飘花落叶言子楪苏兰世哲:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪苏哲世兰:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪苏哲兰世:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:I

    .line 6
    .line 7
    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 8
    .line 9
    iput-object v0, p0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰:Ljava/util/ArrayList;

    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世:Ljava/util/ArrayList;

    .line 31
    .line 32
    new-instance v0, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲:Ljava/util/ArrayList;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ff"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v1, p0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v1, p0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Class;

    .line 27
    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    :cond_2
    iget v1, p0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:I

    .line 38
    .line 39
    const/4 v2, -0x1

    .line 40
    if-eq v1, v2, :cond_3

    .line 41
    .line 42
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->toString(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    :cond_3
    iget-object v1, p0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_4

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    :cond_4
    iget-object v1, p0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_5

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    :cond_5
    iget-object v1, p0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-nez v2, :cond_6

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    :cond_6
    iget-object p0, p0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-nez v1, :cond_7

    .line 89
    .line 90
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    :cond_7
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0
.end method

.method public final 飘花落叶言子苏楪世兰哲()Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲世兰;
    .locals 5

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Lorg/luckypray/dexkit/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v2, v1}, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏兰楪哲(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object v2, v0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;

    .line 23
    .line 24
    :cond_0
    iget-object v1, p0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    sget-object v2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance v3, L飘花落叶言苏子兰哲楪世/飘花落叶言子楪世哲兰苏;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-direct {v3, v1, v2, v4}, L飘花落叶言苏子兰哲楪世/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 37
    .line 38
    .line 39
    iput-object v3, v0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏子兰哲楪世/飘花落叶言子楪世哲兰苏;

    .line 40
    .line 41
    :cond_1
    iget-object v1, p0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Class;

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;

    .line 46
    .line 47
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lorg/luckypray/dexkit/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-static {v2, v1}, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏兰楪哲(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iput-object v2, v0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏:Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;

    .line 58
    .line 59
    :cond_2
    iget v1, p0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:I

    .line 60
    .line 61
    const/4 v2, -0x1

    .line 62
    if-eq v1, v2, :cond_3

    .line 63
    .line 64
    iget-object v2, p0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    new-instance v3, L飘花落叶言苏子兰哲楪世/飘花落叶言子楪世苏哲兰;

    .line 70
    .line 71
    invoke-direct {v3, v1, v2}, L飘花落叶言苏子兰哲楪世/飘花落叶言子楪世苏哲兰;-><init>(ILorg/luckypray/dexkit/query/enums/MatchType;)V

    .line 72
    .line 73
    .line 74
    iput-object v3, v0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏子兰哲楪世/飘花落叶言子楪世苏哲兰;

    .line 75
    .line 76
    :cond_3
    iget-object v1, p0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-nez v2, :cond_5

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_5

    .line 93
    .line 94
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世兰苏哲;

    .line 99
    .line 100
    invoke-virtual {v2}, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏楪哲世兰()Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iget-object v3, v0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲:Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;

    .line 105
    .line 106
    if-nez v3, :cond_4

    .line 107
    .line 108
    new-instance v3, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;

    .line 109
    .line 110
    invoke-direct {v3}, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;-><init>()V

    .line 111
    .line 112
    .line 113
    :cond_4
    iput-object v3, v0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲:Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;

    .line 114
    .line 115
    invoke-virtual {v3, v2}, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏哲兰楪(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_5
    iget-object p0, p0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲:Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-nez v1, :cond_7

    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_7

    .line 136
    .line 137
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    check-cast v1, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世兰苏哲;

    .line 142
    .line 143
    invoke-virtual {v1}, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏楪哲世兰()Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏:Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;

    .line 148
    .line 149
    if-nez v2, :cond_6

    .line 150
    .line 151
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;

    .line 152
    .line 153
    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;-><init>()V

    .line 154
    .line 155
    .line 156
    :cond_6
    iput-object v2, v0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏:Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;

    .line 157
    .line 158
    invoke-virtual {v2, v1}, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏哲兰楪(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;)V

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_7
    return-object v0
.end method
