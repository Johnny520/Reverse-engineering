.class public final Lorg/luckypray/dexkit/query/FindMethod;
.super Lorg/luckypray/dexkit/query/base/BaseFinder;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/FindMethod$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/FindMethod$Companion;


# instance fields
.field private excludePackages:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private findFirst:Z

.field private ignorePackagesCase:Z

.field private matcher:Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

.field private searchClasses:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
            ">;"
        }
    .end annotation
.end field

.field private searchMethods:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/MethodData;",
            ">;"
        }
    .end annotation
.end field

.field private searchPackages:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/FindMethod$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/query/FindMethod;->Companion:Lorg/luckypray/dexkit/query/FindMethod$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseFinder;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final create()Lorg/luckypray/dexkit/query/FindMethod;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/FindMethod;->Companion:Lorg/luckypray/dexkit/query/FindMethod$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/FindMethod$Companion;->create()Lorg/luckypray/dexkit/query/FindMethod;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public final excludePackages(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindMethod;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/FindMethod;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->excludePackages:Ljava/util/Collection;

    return-object p0
.end method

.method public final varargs excludePackages([Ljava/lang/String;)Lorg/luckypray/dexkit/query/FindMethod;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lg7;->н([Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->excludePackages:Ljava/util/Collection;

    .line 9
    .line 10
    return-object p0
.end method

.method public final getExcludePackages()Ljava/util/Collection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/FindMethod;->excludePackages:Ljava/util/Collection;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getFindFirst()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/luckypray/dexkit/query/FindMethod;->findFirst:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getIgnorePackagesCase()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/luckypray/dexkit/query/FindMethod;->ignorePackagesCase:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getMatcher()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/FindMethod;->matcher:Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSearchClasses()Ljava/util/Collection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchClasses:Ljava/util/Collection;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSearchMethods()Ljava/util/Collection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/MethodData;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchMethods:Ljava/util/Collection;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSearchPackages()Ljava/util/Collection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchPackages:Ljava/util/Collection;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ignorePackagesCase(Z)Lorg/luckypray/dexkit/query/FindMethod;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->ignorePackagesCase:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public innerBuild(Lb40;)I
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/schema/-FindMethod;->Companion:Lorg/luckypray/dexkit/schema/-FindMethod$Companion;

    .line 5
    .line 6
    iget-object v1, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchPackages:Ljava/util/Collection;

    .line 7
    .line 8
    const/16 v2, 0xa

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    check-cast v1, Ljava/lang/Iterable;

    .line 14
    .line 15
    new-instance v4, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-static {v1, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    check-cast v5, Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p1, v5}, Lb40;->κ(Ljava/lang/CharSequence;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-static {v4}, Lxh;->ｄ(Ljava/util/List;)[I

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {p1, v1}, Lb40;->λ([I)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move v1, v3

    .line 62
    :goto_1
    iget-object v4, p0, Lorg/luckypray/dexkit/query/FindMethod;->excludePackages:Ljava/util/Collection;

    .line 63
    .line 64
    if-eqz v4, :cond_3

    .line 65
    .line 66
    check-cast v4, Ljava/lang/Iterable;

    .line 67
    .line 68
    new-instance v5, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-static {v4, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_2

    .line 86
    .line 87
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    check-cast v6, Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {p1, v6}, Lb40;->κ(Ljava/lang/CharSequence;)I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_2
    invoke-static {v5}, Lxh;->ｄ(Ljava/util/List;)[I

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-virtual {p1, v4}, Lb40;->λ([I)I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    goto :goto_3

    .line 114
    :cond_3
    move v4, v3

    .line 115
    :goto_3
    iget-boolean v5, p0, Lorg/luckypray/dexkit/query/FindMethod;->ignorePackagesCase:Z

    .line 116
    .line 117
    iget-object v6, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchClasses:Ljava/util/Collection;

    .line 118
    .line 119
    if-eqz v6, :cond_5

    .line 120
    .line 121
    check-cast v6, Ljava/lang/Iterable;

    .line 122
    .line 123
    new-instance v7, Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-static {v6, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    if-eqz v8, :cond_4

    .line 141
    .line 142
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    check-cast v8, Lorg/luckypray/dexkit/result/ClassData;

    .line 147
    .line 148
    invoke-virtual {v8}, Lorg/luckypray/dexkit/result/base/BaseData;->getEncodeId()J

    .line 149
    .line 150
    .line 151
    move-result-wide v8

    .line 152
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_4
    invoke-static {v7}, Lxh;->ｆ(Ljava/util/ArrayList;)[J

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    sget-object v7, Lorg/luckypray/dexkit/schema/-FindMethod;->Companion:Lorg/luckypray/dexkit/schema/-FindMethod$Companion;

    .line 165
    .line 166
    invoke-virtual {v7, p1, v6}, Lorg/luckypray/dexkit/schema/-FindMethod$Companion;->createInClassesVector(Lb40;[J)I

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    goto :goto_5

    .line 171
    :cond_5
    move v6, v3

    .line 172
    :goto_5
    iget-object v7, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchMethods:Ljava/util/Collection;

    .line 173
    .line 174
    if-eqz v7, :cond_7

    .line 175
    .line 176
    check-cast v7, Ljava/lang/Iterable;

    .line 177
    .line 178
    new-instance v8, Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-static {v7, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    invoke-direct {v8, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 185
    .line 186
    .line 187
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    if-eqz v7, :cond_6

    .line 196
    .line 197
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    check-cast v7, Lorg/luckypray/dexkit/result/MethodData;

    .line 202
    .line 203
    invoke-virtual {v7}, Lorg/luckypray/dexkit/result/base/BaseData;->getEncodeId()J

    .line 204
    .line 205
    .line 206
    move-result-wide v9

    .line 207
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_6
    invoke-static {v8}, Lxh;->ｆ(Ljava/util/ArrayList;)[J

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    sget-object v7, Lorg/luckypray/dexkit/schema/-FindMethod;->Companion:Lorg/luckypray/dexkit/schema/-FindMethod$Companion;

    .line 220
    .line 221
    invoke-virtual {v7, p1, v2}, Lorg/luckypray/dexkit/schema/-FindMethod$Companion;->createInMethodsVector(Lb40;[J)I

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    goto :goto_7

    .line 226
    :cond_7
    move v2, v3

    .line 227
    :goto_7
    iget-boolean v7, p0, Lorg/luckypray/dexkit/query/FindMethod;->findFirst:Z

    .line 228
    .line 229
    iget-object p0, p0, Lorg/luckypray/dexkit/query/FindMethod;->matcher:Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 230
    .line 231
    if-eqz p0, :cond_8

    .line 232
    .line 233
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    :cond_8
    move v8, v3

    .line 238
    move v3, v4

    .line 239
    move v4, v5

    .line 240
    move v5, v6

    .line 241
    move v6, v2

    .line 242
    move v2, v1

    .line 243
    move-object v1, p1

    .line 244
    invoke-virtual/range {v0 .. v8}, Lorg/luckypray/dexkit/schema/-FindMethod$Companion;->createFindMethod(Lb40;IIZIIZI)I

    .line 245
    .line 246
    .line 247
    move-result p0

    .line 248
    invoke-virtual {v1, p0}, Lb40;->ξ(I)V

    .line 249
    .line 250
    .line 251
    return p0
.end method

.method public final synthetic matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final matcher(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/FindMethod;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->matcher:Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-object p0
.end method

.method public final searchInClass(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindMethod;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
            ">;)",
            "Lorg/luckypray/dexkit/query/FindMethod;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchClasses:Ljava/util/Collection;

    .line 5
    .line 6
    return-object p0
.end method

.method public final searchInMethod(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindMethod;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/MethodData;",
            ">;)",
            "Lorg/luckypray/dexkit/query/FindMethod;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchMethods:Ljava/util/Collection;

    .line 5
    .line 6
    return-object p0
.end method

.method public final searchPackages(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindMethod;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/FindMethod;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchPackages:Ljava/util/Collection;

    return-object p0
.end method

.method public final varargs searchPackages([Ljava/lang/String;)Lorg/luckypray/dexkit/query/FindMethod;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lg7;->н([Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchPackages:Ljava/util/Collection;

    .line 9
    .line 10
    return-object p0
.end method

.method public final synthetic setExcludePackages(Ljava/util/Collection;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->excludePackages:Ljava/util/Collection;

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setFindFirst(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->findFirst:Z

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setIgnorePackagesCase(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->ignorePackagesCase:Z

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setSearchClasses(Ljava/util/Collection;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchClasses:Ljava/util/Collection;

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setSearchMethods(Ljava/util/Collection;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchMethods:Ljava/util/Collection;

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setSearchPackages(Ljava/util/Collection;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchPackages:Ljava/util/Collection;

    .line 2
    .line 3
    return-void
.end method
