.class public abstract Luh1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/List;

.field public static final β:Ljava/util/List;

.field public static final γ:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "~78D3ECFA63DB52E5A19E9BAEB1F7800A11F1EB5A04E5B7A2213D6E40D73B64D2CFAB2BF3453CD724F602BB72FC397513878027005AD60AEE524CF1864F51F0DEF2DDE34DD2898511ABD01797C56C3FB142"

    .line 2
    .line 3
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "~78DF588B0EC79FAF9E614C08184F8649CB64E2954C8C7DAB572BB3C2A9299E9BCE8825914D3DB8B9F8590905F4E937A431C60F7208EEC85640FA1107547F45B41D607111278821B9052396C905CB55FFAC8A"

    .line 8
    .line 9
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620FEAAB3DBAA5CCFF1590144F37A6DE6F2EAA8DBD42A1363F91426A14D158A14EDA2BF"

    .line 14
    .line 15
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "~7883762E03D36847EFF3BA0793C09F8E02F6EC9E30B4641E11011259BDF55608B48CC91FD029A4395A8C64B5A72F95D909085133E615B4B3A770D599D5F2BCB790FCEB9014"

    .line 20
    .line 21
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Luh1;->α:Ljava/util/List;

    .line 34
    .line 35
    const-string v0, "X.C15Z0"

    .line 36
    .line 37
    const-string v1, "X.15Z0"

    .line 38
    .line 39
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Luh1;->β:Ljava/util/List;

    .line 48
    .line 49
    const-string v0, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB444E45EFE5413F312250C3EB77D079E4AFD3F67A87735342D1C21387EB"

    .line 50
    .line 51
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Luh1;->γ:Ljava/util/List;

    .line 60
    .line 61
    return-void
.end method

.method public static α(Ljava/util/LinkedHashMap;Ljava/lang/reflect/Method;)V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, "#"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, "("

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance v2, Lcf1;

    .line 46
    .line 47
    const/16 v3, 0x15

    .line 48
    .line 49
    invoke-direct {v2, v3}, Lcf1;-><init>(I)V

    .line 50
    .line 51
    .line 52
    const/16 v3, 0x1e

    .line 53
    .line 54
    const-string v4, ","

    .line 55
    .line 56
    const/4 v5, 0x0

    .line 57
    invoke-static {v1, v4, v5, v2, v3}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const-string v2, "):"

    .line 62
    .line 63
    invoke-static {v0, v1, v2, p1}, Llz1;->ρ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public static β(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lxh;->э(Ljava/util/AbstractCollection;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-object v0
.end method

.method public static γ(Ljava/lang/Class;Ljava/lang/String;)Z
    .locals 5

    .line 1
    :goto_0
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    const-class v1, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    array-length v2, v1

    .line 20
    :goto_1
    if-ge v0, v2, :cond_2

    .line 21
    .line 22
    aget-object v3, v1, v0

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    invoke-static {v3, p1}, Luh1;->γ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    :goto_2
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    goto :goto_0

    .line 51
    :cond_3
    return v0
.end method

.method public static δ(Ljava/lang/Class;Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Luh1;->β(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ljava/lang/reflect/Method;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    array-length v0, v0

    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    const/4 p0, 0x1

    .line 59
    return p0

    .line 60
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 61
    return p0
.end method

.method public static ε(Ljava/lang/reflect/Method;)Z
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 9
    .line 10
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_b

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    goto/16 :goto_b

    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 39
    .line 40
    invoke-static {v2, v0, v2}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v4, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    new-instance v6, Ljava/util/ArrayList;

    .line 67
    .line 68
    array-length v7, v5

    .line 69
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 70
    .line 71
    .line 72
    array-length v7, v5

    .line 73
    move v8, v1

    .line 74
    :goto_0
    const/4 v9, 0x1

    .line 75
    if-ge v8, v7, :cond_2

    .line 76
    .line 77
    aget-object v10, v5, v8

    .line 78
    .line 79
    invoke-static {v10, v6, v8, v9}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    goto :goto_0

    .line 84
    :cond_2
    const-string v7, "onPlayCompleted"

    .line 85
    .line 86
    invoke-virtual {v0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-nez v7, :cond_4

    .line 91
    .line 92
    const-string v7, "beforeNotifyCompletedPlay"

    .line 93
    .line 94
    invoke-virtual {v0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-nez v7, :cond_4

    .line 99
    .line 100
    const-string v7, "onPlayCompletedFirst"

    .line 101
    .line 102
    invoke-virtual {v0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-nez v7, :cond_4

    .line 107
    .line 108
    const-string v7, "onPlayCompletedFirstTime"

    .line 109
    .line 110
    invoke-virtual {v0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-nez v7, :cond_4

    .line 115
    .line 116
    const-string v7, "onplaycompleted"

    .line 117
    .line 118
    invoke-static {v3, v7, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-nez v7, :cond_4

    .line 123
    .line 124
    const-string v7, "completedfirst"

    .line 125
    .line 126
    invoke-static {v3, v7, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    if-nez v7, :cond_4

    .line 131
    .line 132
    const-string v7, "beforenotifycompletedplay"

    .line 133
    .line 134
    invoke-static {v3, v7, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    if-eqz v3, :cond_3

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_3
    move v3, v1

    .line 142
    goto :goto_2

    .line 143
    :cond_4
    :goto_1
    move v3, v9

    .line 144
    :goto_2
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    if-eqz v7, :cond_6

    .line 149
    .line 150
    :cond_5
    move v6, v1

    .line 151
    goto :goto_3

    .line 152
    :cond_6
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    :cond_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v7

    .line 160
    if-eqz v7, :cond_5

    .line 161
    .line 162
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    check-cast v7, Ljava/lang/String;

    .line 167
    .line 168
    const-string v8, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB444045E5F45F7E1B2B50D5955DD465C390D2E76F87756154E0D31183F4"

    .line 169
    .line 170
    invoke-static {v8}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    if-nez v8, :cond_8

    .line 179
    .line 180
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    const-string v8, "FeedPlayCompletedParam"

    .line 184
    .line 185
    invoke-static {v7, v8, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    if-nez v8, :cond_8

    .line 190
    .line 191
    const-string v8, "PlayCompleted"

    .line 192
    .line 193
    invoke-static {v7, v8, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 194
    .line 195
    .line 196
    move-result v7

    .line 197
    if-eqz v7, :cond_7

    .line 198
    .line 199
    :cond_8
    move v6, v9

    .line 200
    :goto_3
    array-length v7, v5

    .line 201
    move v8, v1

    .line 202
    :goto_4
    const-class v10, Ljava/lang/String;

    .line 203
    .line 204
    if-ge v8, v7, :cond_a

    .line 205
    .line 206
    aget-object v11, v5, v8

    .line 207
    .line 208
    invoke-static {v11, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v11

    .line 212
    if-eqz v11, :cond_9

    .line 213
    .line 214
    move v7, v9

    .line 215
    goto :goto_5

    .line 216
    :cond_9
    add-int/lit8 v8, v8, 0x1

    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_a
    move v7, v1

    .line 220
    :goto_5
    const-string v8, "~78DF588B0EC79FAF9E614C08184F8649CB64E2954C8C7DAB572BB3C2A9299E9BCE8825914D3DB8B9F8590905F4E937A431C60F7208EEC85640FA1107547F45B41D607111278821B9052396C905CB55FFAC8A"

    .line 221
    .line 222
    invoke-static {v8}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    invoke-virtual {v4, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v8

    .line 230
    if-nez v8, :cond_c

    .line 231
    .line 232
    const-string v8, "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620FEAAB3DBAA5CCFF1590144F37A6DE6F2EAA8DBD42A1363F91426A14D158A14EDA2BF"

    .line 233
    .line 234
    invoke-static {v8}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v8

    .line 238
    invoke-virtual {v4, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v8

    .line 242
    if-nez v8, :cond_c

    .line 243
    .line 244
    const-string v8, "~7883762E03D36847EFF3BA0793C09F8E02F6EC9E30B4641E11011259BDF55608B48CC91FD029A4395A8C64B5A72F95D909085133E615B4B3A770D599D5F2BCB790FCEB9014"

    .line 245
    .line 246
    invoke-static {v8}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v8

    .line 250
    invoke-virtual {v4, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    if-eqz v8, :cond_b

    .line 255
    .line 256
    goto :goto_6

    .line 257
    :cond_b
    move v8, v1

    .line 258
    goto :goto_7

    .line 259
    :cond_c
    :goto_6
    move v8, v9

    .line 260
    :goto_7
    const-string v11, "~78D3ECFA63DB52E5A19E9BAEB1F7800A11F1EB5A04E5B7A2213D6E40D73B64D2CFAB2BF3453CD724F602BB72FC397513878027005AD60AEE524CF1864F51F0DEF2DDE34DD2898511ABD01797C56C3FB142"

    .line 261
    .line 262
    invoke-static {v11}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v11

    .line 266
    invoke-virtual {v4, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v4

    .line 270
    if-eqz v4, :cond_10

    .line 271
    .line 272
    const-string v4, "LJIIJJI"

    .line 273
    .line 274
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    if-eqz v4, :cond_d

    .line 279
    .line 280
    array-length v4, v5

    .line 281
    if-ne v4, v9, :cond_d

    .line 282
    .line 283
    aget-object v4, v5, v1

    .line 284
    .line 285
    invoke-static {v4, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    if-nez v4, :cond_15

    .line 290
    .line 291
    :cond_d
    const-string v4, "LLILII"

    .line 292
    .line 293
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    const/4 v11, 0x2

    .line 298
    if-eqz v4, :cond_e

    .line 299
    .line 300
    array-length v4, v5

    .line 301
    if-ne v4, v11, :cond_e

    .line 302
    .line 303
    aget-object v4, v5, v1

    .line 304
    .line 305
    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 306
    .line 307
    invoke-static {v4, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    if-eqz v4, :cond_e

    .line 312
    .line 313
    aget-object v4, v5, v9

    .line 314
    .line 315
    invoke-static {v4, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    if-nez v4, :cond_15

    .line 320
    .line 321
    :cond_e
    const-string v4, "LJJIIJZLJL"

    .line 322
    .line 323
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v4

    .line 327
    if-eqz v4, :cond_f

    .line 328
    .line 329
    array-length v4, v5

    .line 330
    if-ne v4, v9, :cond_f

    .line 331
    .line 332
    aget-object v4, v5, v1

    .line 333
    .line 334
    invoke-static {v4, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result v4

    .line 338
    if-nez v4, :cond_15

    .line 339
    .line 340
    :cond_f
    const-string v4, "h5"

    .line 341
    .line 342
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    if-eqz v0, :cond_10

    .line 347
    .line 348
    array-length v0, v5

    .line 349
    if-ne v0, v11, :cond_10

    .line 350
    .line 351
    aget-object v0, v5, v1

    .line 352
    .line 353
    invoke-static {v0, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    if-eqz v0, :cond_10

    .line 358
    .line 359
    goto :goto_a

    .line 360
    :cond_10
    const-string v0, "feedplay"

    .line 361
    .line 362
    invoke-static {v2, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    if-nez v0, :cond_12

    .line 367
    .line 368
    const-string v0, "onui"

    .line 369
    .line 370
    invoke-static {v2, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    if-nez v0, :cond_12

    .line 375
    .line 376
    const-string v0, "player"

    .line 377
    .line 378
    invoke-static {v2, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    if-nez v0, :cond_12

    .line 383
    .line 384
    const-string v0, "playlistener"

    .line 385
    .line 386
    invoke-static {v2, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    if-eqz v0, :cond_11

    .line 391
    .line 392
    goto :goto_8

    .line 393
    :cond_11
    move v0, v1

    .line 394
    goto :goto_9

    .line 395
    :cond_12
    :goto_8
    move v0, v9

    .line 396
    :goto_9
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    move-result-object p0

    .line 400
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    const-string v2, "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56E13C3BB1FAB793F47C4E6BF47D1570A6EF06A1C4AD72C3045F30CB1B2665A2"

    .line 404
    .line 405
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    invoke-static {p0, v2}, Luh1;->γ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 410
    .line 411
    .line 412
    move-result p0

    .line 413
    if-eqz v8, :cond_13

    .line 414
    .line 415
    if-nez v3, :cond_15

    .line 416
    .line 417
    if-eqz v6, :cond_13

    .line 418
    .line 419
    goto :goto_a

    .line 420
    :cond_13
    if-eqz v6, :cond_14

    .line 421
    .line 422
    if-nez v0, :cond_15

    .line 423
    .line 424
    if-eqz v3, :cond_14

    .line 425
    .line 426
    goto :goto_a

    .line 427
    :cond_14
    if-eqz v3, :cond_16

    .line 428
    .line 429
    if-eqz v7, :cond_16

    .line 430
    .line 431
    if-nez v0, :cond_15

    .line 432
    .line 433
    if-eqz p0, :cond_16

    .line 434
    .line 435
    :cond_15
    :goto_a
    return v9

    .line 436
    :cond_16
    :goto_b
    return v1
.end method

.method public static ζ(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_3

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v1, "pause"

    .line 10
    .line 11
    invoke-static {p0, v1}, Luh1;->δ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const-string v2, "resume"

    .line 16
    .line 17
    invoke-static {p0, v2}, Luh1;->δ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const-string v3, "stop"

    .line 22
    .line 23
    invoke-static {p0, v3}, Luh1;->δ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, 0x1

    .line 28
    if-nez v3, :cond_2

    .line 29
    .line 30
    const-string v3, "stopPlay"

    .line 31
    .line 32
    invoke-static {p0, v3}, Luh1;->δ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move v3, v0

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    :goto_0
    move v3, v4

    .line 42
    :goto_1
    invoke-static {p0}, Luh1;->β(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_4

    .line 51
    .line 52
    :cond_3
    move p0, v0

    .line 53
    goto :goto_2

    .line 54
    :cond_4
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_3

    .line 63
    .line 64
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    check-cast v5, Ljava/lang/reflect/Method;

    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    const-string v6, "seek"

    .line 75
    .line 76
    invoke-static {v5, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_5

    .line 81
    .line 82
    move p0, v4

    .line 83
    :goto_2
    if-eqz v1, :cond_7

    .line 84
    .line 85
    if-nez v2, :cond_6

    .line 86
    .line 87
    if-nez v3, :cond_6

    .line 88
    .line 89
    if-eqz p0, :cond_7

    .line 90
    .line 91
    :cond_6
    return v4

    .line 92
    :cond_7
    :goto_3
    return v0
.end method

.method public static varargs η(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/LinkedHashMap;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Lth1;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v1, p3, p4, v2}, Lth1;-><init>(Ljava/lang/String;[Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result p4

    .line 20
    if-eqz p4, :cond_3

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    check-cast p4, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 27
    .line 28
    :try_start_1
    invoke-virtual {p4, p1}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 29
    .line 30
    .line 31
    move-result-object p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    goto :goto_1

    .line 33
    :catchall_0
    move-exception p4

    .line 34
    :try_start_2
    new-instance v1, Leo1;

    .line 35
    .line 36
    invoke-direct {v1, p4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object p4, v1

    .line 40
    :goto_1
    instance-of v1, p4, Leo1;

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    move-object p4, v0

    .line 45
    :cond_1
    check-cast p4, Ljava/lang/reflect/Method;

    .line 46
    .line 47
    if-nez p4, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-static {p4}, Luh1;->ε(Ljava/lang/reflect/Method;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_0

    .line 55
    .line 56
    invoke-static {p2, p4}, Luh1;->α(Ljava/util/LinkedHashMap;Ljava/lang/reflect/Method;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_1
    move-exception p0

    .line 61
    goto :goto_2

    .line 62
    :cond_3
    sget-object p0, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :goto_2
    new-instance p1, Leo1;

    .line 66
    .line 67
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    move-object p0, p1

    .line 71
    :goto_3
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    if-eqz p0, :cond_4

    .line 76
    .line 77
    new-instance p1, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    const-string p2, "query named completed method failed: "

    .line 80
    .line 81
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string p2, ", err="

    .line 88
    .line 89
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    :try_start_3
    const-string p1, "r5fd016b85524a7fd"

    .line 100
    .line 101
    const/4 p2, 0x4

    .line 102
    invoke-static {p1, p0, v0, p2, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 103
    .line 104
    .line 105
    :catchall_2
    :cond_4
    return-void
.end method

.method public static θ(Lkx;Ljava/lang/Object;Ljava/lang/ClassLoader;Ljava/util/List;Ljava/util/List;)Ljava/lang/reflect/Method;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {p0, p2}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz p2, :cond_2

    .line 15
    .line 16
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    move-object v3, v2

    .line 31
    check-cast v3, Ljava/lang/reflect/Method;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v4, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-static {v4, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_0

    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    array-length v4, v4

    .line 61
    if-nez v4, :cond_0

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-nez v3, :cond_0

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    move-object v2, v1

    .line 75
    :goto_0
    check-cast v2, Ljava/lang/reflect/Method;

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    move-object v2, v1

    .line 79
    :goto_1
    const/4 p2, 0x1

    .line 80
    if-eqz v2, :cond_3

    .line 81
    .line 82
    invoke-virtual {v2, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 83
    .line 84
    .line 85
    return-object v2

    .line 86
    :cond_3
    invoke-static {p1}, Luh1;->β(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    new-instance v2, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_5

    .line 104
    .line 105
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    move-object v4, v3

    .line 110
    check-cast v4, Ljava/lang/reflect/Method;

    .line 111
    .line 112
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-nez v5, :cond_4

    .line 121
    .line 122
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    invoke-static {v5, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    if-eqz v5, :cond_4

    .line 131
    .line 132
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    array-length v4, v4

    .line 140
    if-nez v4, :cond_4

    .line 141
    .line 142
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_5
    new-instance p1, Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    :cond_6
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-eqz v2, :cond_e

    .line 160
    .line 161
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    check-cast v2, Ljava/lang/reflect/Method;

    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 175
    .line 176
    invoke-static {v4, v3, v4}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    const/4 v5, 0x0

    .line 185
    if-eqz v4, :cond_7

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_7
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    :cond_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v6

    .line 196
    if-eqz v6, :cond_9

    .line 197
    .line 198
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    check-cast v6, Ljava/lang/String;

    .line 203
    .line 204
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    if-eqz v6, :cond_8

    .line 213
    .line 214
    const/16 v4, 0x78

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_9
    :goto_4
    move v4, v5

    .line 218
    :goto_5
    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    .line 219
    .line 220
    .line 221
    move-result v6

    .line 222
    if-eqz v6, :cond_a

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_a
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    :cond_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 230
    .line 231
    .line 232
    move-result v7

    .line 233
    if-eqz v7, :cond_c

    .line 234
    .line 235
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v7

    .line 239
    check-cast v7, Ljava/lang/String;

    .line 240
    .line 241
    invoke-static {v3, v7, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 242
    .line 243
    .line 244
    move-result v7

    .line 245
    if-eqz v7, :cond_b

    .line 246
    .line 247
    add-int/lit8 v4, v4, 0x3c

    .line 248
    .line 249
    :cond_c
    :goto_6
    if-lez v4, :cond_d

    .line 250
    .line 251
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    new-instance v4, Ll91;

    .line 256
    .line 257
    invoke-direct {v4, v2, v3}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    goto :goto_7

    .line 261
    :cond_d
    move-object v4, v1

    .line 262
    :goto_7
    if-eqz v4, :cond_6

    .line 263
    .line 264
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    goto :goto_3

    .line 268
    :cond_e
    new-instance p3, Lib1;

    .line 269
    .line 270
    const/16 p4, 0x12

    .line 271
    .line 272
    invoke-direct {p3, p4}, Lib1;-><init>(I)V

    .line 273
    .line 274
    .line 275
    invoke-static {p1, p3}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    invoke-static {p1}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    check-cast p1, Ll91;

    .line 284
    .line 285
    if-eqz p1, :cond_10

    .line 286
    .line 287
    iget-object p1, p1, Ll91;->ε:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast p1, Ljava/lang/reflect/Method;

    .line 290
    .line 291
    if-nez p1, :cond_f

    .line 292
    .line 293
    goto :goto_8

    .line 294
    :cond_f
    invoke-virtual {p1, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 295
    .line 296
    .line 297
    sget-object p2, Lox;->α:Ljava/lang/Object;

    .line 298
    .line 299
    invoke-static {p1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 300
    .line 301
    .line 302
    move-result-object p2

    .line 303
    invoke-static {p0, p2}, Lox;->χ(Lkx;Ljava/util/List;)V

    .line 304
    .line 305
    .line 306
    return-object p1

    .line 307
    :cond_10
    :goto_8
    return-object v1
.end method

.method public static ι(Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lox;->α:Ljava/lang/Object;

    .line 10
    .line 11
    sget-object v1, Lkx;->Ш:Lkx;

    .line 12
    .line 13
    invoke-static {v1, p0}, Lox;->π(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    sget-object v1, Ljz;->ε:Ljz;

    .line 20
    .line 21
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Ljava/lang/Class;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    sget-object v1, Luh1;->γ:Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_3

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {p0, v2}, Lbx;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    if-nez v2, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    check-cast p0, Ljava/lang/Iterable;

    .line 86
    .line 87
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
.end method

.method public static κ(Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Luh1;->α:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_3

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p0, v2}, Lbx;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    array-length v3, v2

    .line 39
    const/4 v4, 0x0

    .line 40
    :goto_1
    if-ge v4, v3, :cond_0

    .line 41
    .line 42
    aget-object v5, v2, v4

    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v5}, Luh1;->ε(Ljava/lang/reflect/Method;)Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_2

    .line 52
    .line 53
    invoke-static {v0, v5}, Luh1;->α(Ljava/util/LinkedHashMap;Ljava/lang/reflect/Method;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    check-cast p0, Ljava/lang/Iterable;

    .line 67
    .line 68
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method

.method public static λ(Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lox;->α:Ljava/lang/Object;

    .line 7
    .line 8
    sget-object v1, Lkx;->Ц:Lkx;

    .line 9
    .line 10
    invoke-static {v1, p0}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    sget-object v2, Ljz;->ε:Ljz;

    .line 17
    .line 18
    :cond_0
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Ljava/lang/reflect/Method;

    .line 33
    .line 34
    invoke-static {v0, v3}, Luh1;->α(Ljava/util/LinkedHashMap;Ljava/lang/reflect/Method;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    check-cast p0, Ljava/lang/Iterable;

    .line 52
    .line 53
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_2
    invoke-static {p0}, Luh1;->κ(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_3

    .line 71
    .line 72
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, Ljava/lang/reflect/Method;

    .line 77
    .line 78
    invoke-static {v0, v3}, Luh1;->α(Ljava/util/LinkedHashMap;Ljava/lang/reflect/Method;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-nez v2, :cond_4

    .line 87
    .line 88
    sget-object p0, Lox;->α:Ljava/lang/Object;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    check-cast p0, Ljava/lang/Iterable;

    .line 98
    .line 99
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {v1, p0}, Lox;->χ(Lkx;Ljava/util/List;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    check-cast p0, Ljava/lang/Iterable;

    .line 114
    .line 115
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    return-object p0

    .line 120
    :cond_4
    sget-object v2, Lox;->α:Ljava/lang/Object;

    .line 121
    .line 122
    new-instance v2, Lt20;

    .line 123
    .line 124
    const/16 v3, 0x18

    .line 125
    .line 126
    invoke-direct {v2, p0, v3}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 127
    .line 128
    .line 129
    const-string v3, "\u626b\u63cf\u64ad\u653e\u5b8c\u6210\u56de\u8c03\u65b9\u6cd5"

    .line 130
    .line 131
    invoke-static {v1, p0, v3, v2}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_5

    .line 144
    .line 145
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    check-cast v1, Ljava/lang/reflect/Method;

    .line 150
    .line 151
    invoke-static {v0, v1}, Luh1;->α(Ljava/util/LinkedHashMap;Ljava/lang/reflect/Method;)V

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_5
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    check-cast p0, Ljava/lang/Iterable;

    .line 163
    .line 164
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    return-object p0
.end method
