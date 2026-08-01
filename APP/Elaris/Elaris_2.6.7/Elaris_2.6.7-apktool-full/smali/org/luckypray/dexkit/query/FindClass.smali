.class public final Lorg/luckypray/dexkit/query/FindClass;
.super Lorg/luckypray/dexkit/query/base/BaseFinder;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/FindClass$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/FindClass$Companion;


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

.field private matcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

.field private searchClasses:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
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
    new-instance v0, Lorg/luckypray/dexkit/query/FindClass$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/FindClass$Companion;-><init>(Lr2;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/query/FindClass;->Companion:Lorg/luckypray/dexkit/query/FindClass$Companion;

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

.method public static final create()Lorg/luckypray/dexkit/query/FindClass;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/FindClass;->Companion:Lorg/luckypray/dexkit/query/FindClass$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/FindClass$Companion;->create()Lorg/luckypray/dexkit/query/FindClass;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public final excludePackages(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindClass;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/FindClass;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindClass;->excludePackages:Ljava/util/Collection;

    return-object p0
.end method

.method public final varargs excludePackages([Ljava/lang/String;)Lorg/luckypray/dexkit/query/FindClass;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, La1;->k2([Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindClass;->excludePackages:Ljava/util/Collection;

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
    iget-object p0, p0, Lorg/luckypray/dexkit/query/FindClass;->excludePackages:Ljava/util/Collection;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getFindFirst()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/luckypray/dexkit/query/FindClass;->findFirst:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getIgnorePackagesCase()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/luckypray/dexkit/query/FindClass;->ignorePackagesCase:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getMatcher()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/FindClass;->matcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

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
    iget-object p0, p0, Lorg/luckypray/dexkit/query/FindClass;->searchClasses:Ljava/util/Collection;

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
    iget-object p0, p0, Lorg/luckypray/dexkit/query/FindClass;->searchPackages:Ljava/util/Collection;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ignorePackagesCase(Z)Lorg/luckypray/dexkit/query/FindClass;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/FindClass;->ignorePackagesCase:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public innerBuild(Lc5;)I
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/schema/-FindClass;->Companion:Lorg/luckypray/dexkit/schema/-FindClass$Companion;

    .line 5
    .line 6
    iget-object v1, p0, Lorg/luckypray/dexkit/query/FindClass;->searchPackages:Ljava/util/Collection;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    new-instance v3, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-static {v1}, Lj2;->i2(Ljava/lang/Iterable;)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    check-cast v4, Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p1, v4}, Lc5;->j(Ljava/lang/CharSequence;)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-static {v3}, Lh2;->l2(Ljava/util/ArrayList;)[I

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {p1, v1}, Lc5;->k([I)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    move v1, v2

    .line 58
    :goto_1
    iget-object v3, p0, Lorg/luckypray/dexkit/query/FindClass;->excludePackages:Ljava/util/Collection;

    .line 59
    .line 60
    if-eqz v3, :cond_3

    .line 61
    .line 62
    new-instance v4, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-static {v3}, Lj2;->i2(Ljava/lang/Iterable;)I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_2

    .line 80
    .line 81
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {p1, v5}, Lc5;->j(Ljava/lang/CharSequence;)I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    invoke-static {v4}, Lh2;->l2(Ljava/util/ArrayList;)[I

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {p1, v3}, Lc5;->k([I)I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    goto :goto_3

    .line 108
    :cond_3
    move v3, v2

    .line 109
    :goto_3
    iget-boolean v4, p0, Lorg/luckypray/dexkit/query/FindClass;->ignorePackagesCase:Z

    .line 110
    .line 111
    iget-object v5, p0, Lorg/luckypray/dexkit/query/FindClass;->searchClasses:Ljava/util/Collection;

    .line 112
    .line 113
    if-eqz v5, :cond_5

    .line 114
    .line 115
    new-instance v6, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-static {v5}, Lj2;->i2(Ljava/lang/Iterable;)I

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 122
    .line 123
    .line 124
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    if-eqz v7, :cond_4

    .line 133
    .line 134
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    check-cast v7, Lorg/luckypray/dexkit/result/ClassData;

    .line 139
    .line 140
    invoke-virtual {v7}, Lorg/luckypray/dexkit/result/base/BaseData;->getEncodeId()J

    .line 141
    .line 142
    .line 143
    move-result-wide v7

    .line 144
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_4
    invoke-static {v6}, Lh2;->m2(Ljava/util/ArrayList;)[J

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    sget-object v6, Lorg/luckypray/dexkit/schema/-FindClass;->Companion:Lorg/luckypray/dexkit/schema/-FindClass$Companion;

    .line 157
    .line 158
    invoke-virtual {v6, p1, v5}, Lorg/luckypray/dexkit/schema/-FindClass$Companion;->createInClassesVector(Lc5;[J)I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    goto :goto_5

    .line 163
    :cond_5
    move v5, v2

    .line 164
    :goto_5
    iget-boolean v6, p0, Lorg/luckypray/dexkit/query/FindClass;->findFirst:Z

    .line 165
    .line 166
    iget-object p0, p0, Lorg/luckypray/dexkit/query/FindClass;->matcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 167
    .line 168
    if-eqz p0, :cond_6

    .line 169
    .line 170
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lc5;)I

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    :cond_6
    move v7, v2

    .line 175
    move v2, v1

    .line 176
    move-object v1, p1

    .line 177
    invoke-virtual/range {v0 .. v7}, Lorg/luckypray/dexkit/schema/-FindClass$Companion;->createFindClass(Lc5;IIZIZI)I

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    invoke-virtual {v1, p0}, Lc5;->n(I)V

    .line 182
    .line 183
    .line 184
    return p0
.end method

.method public final matcher(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/FindClass;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindClass;->matcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    return-object p0
.end method

.method public final synthetic matcher(Lu5;)Lorg/luckypray/dexkit/query/FindClass;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, Lu5;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/FindClass;->matcher(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/FindClass;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final searchIn(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindClass;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
            ">;)",
            "Lorg/luckypray/dexkit/query/FindClass;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindClass;->searchClasses:Ljava/util/Collection;

    .line 5
    .line 6
    return-object p0
.end method

.method public final searchPackages(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindClass;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/FindClass;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindClass;->searchPackages:Ljava/util/Collection;

    return-object p0
.end method

.method public final varargs searchPackages([Ljava/lang/String;)Lorg/luckypray/dexkit/query/FindClass;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, La1;->k2([Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindClass;->searchPackages:Ljava/util/Collection;

    .line 9
    .line 10
    return-object p0
.end method

.method public final synthetic setExcludePackages(Ljava/util/Collection;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindClass;->excludePackages:Ljava/util/Collection;

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setFindFirst(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/FindClass;->findFirst:Z

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setIgnorePackagesCase(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/FindClass;->ignorePackagesCase:Z

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setSearchClasses(Ljava/util/Collection;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindClass;->searchClasses:Ljava/util/Collection;

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setSearchPackages(Ljava/util/Collection;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindClass;->searchPackages:Ljava/util/Collection;

    .line 2
    .line 3
    return-void
.end method
