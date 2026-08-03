.class public final enum Lf5/c;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final j:[Lf5/c;

.field public static final k:[Lf5/c;

.field public static final l:Ljava/util/HashMap;

.field public static final synthetic m:[Lf5/c;


# instance fields
.field public final g:I

.field public final h:Ljava/lang/String;

.field public final i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, Lf5/c;

    .line 2
    .line 3
    const-string v4, "whitelist"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const-string v1, "WHITELIST"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct/range {v0 .. v5}, Lf5/c;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lf5/c;

    .line 14
    .line 15
    const-string v5, "greylist"

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    const-string v2, "GREYLIST"

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v4, 0x1

    .line 22
    invoke-direct/range {v1 .. v6}, Lf5/c;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Lf5/c;

    .line 26
    .line 27
    const-string v6, "blacklist"

    .line 28
    .line 29
    const/4 v7, 0x0

    .line 30
    const-string v3, "BLACKLIST"

    .line 31
    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x2

    .line 34
    invoke-direct/range {v2 .. v7}, Lf5/c;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    new-instance v3, Lf5/c;

    .line 38
    .line 39
    const-string v7, "greylist-max-o"

    .line 40
    .line 41
    const/4 v8, 0x0

    .line 42
    const-string v4, "GREYLIST_MAX_O"

    .line 43
    .line 44
    const/4 v5, 0x3

    .line 45
    const/4 v6, 0x3

    .line 46
    invoke-direct/range {v3 .. v8}, Lf5/c;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    new-instance v4, Lf5/c;

    .line 50
    .line 51
    const-string v8, "greylist-max-p"

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    const-string v5, "GREYLIST_MAX_P"

    .line 55
    .line 56
    const/4 v6, 0x4

    .line 57
    const/4 v7, 0x4

    .line 58
    invoke-direct/range {v4 .. v9}, Lf5/c;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    .line 59
    .line 60
    .line 61
    new-instance v5, Lf5/c;

    .line 62
    .line 63
    const-string v9, "greylist-max-q"

    .line 64
    .line 65
    const/4 v10, 0x0

    .line 66
    const-string v6, "GREYLIST_MAX_Q"

    .line 67
    .line 68
    const/4 v7, 0x5

    .line 69
    const/4 v8, 0x5

    .line 70
    invoke-direct/range {v5 .. v10}, Lf5/c;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    new-instance v6, Lf5/c;

    .line 74
    .line 75
    const-string v10, "greylist-max-r"

    .line 76
    .line 77
    const/4 v11, 0x0

    .line 78
    const-string v7, "GREYLIST_MAX_R"

    .line 79
    .line 80
    const/4 v8, 0x6

    .line 81
    const/4 v9, 0x6

    .line 82
    invoke-direct/range {v6 .. v11}, Lf5/c;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    .line 83
    .line 84
    .line 85
    new-instance v7, Lf5/c;

    .line 86
    .line 87
    const-string v11, "core-platform-api"

    .line 88
    .line 89
    const/4 v12, 0x1

    .line 90
    const-string v8, "CORE_PLATFORM_API"

    .line 91
    .line 92
    const/4 v9, 0x7

    .line 93
    const/16 v10, 0x8

    .line 94
    .line 95
    invoke-direct/range {v7 .. v12}, Lf5/c;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    .line 96
    .line 97
    .line 98
    new-instance v8, Lf5/c;

    .line 99
    .line 100
    const-string v12, "test-api"

    .line 101
    .line 102
    const/4 v13, 0x1

    .line 103
    const-string v9, "TEST_API"

    .line 104
    .line 105
    const/16 v11, 0x10

    .line 106
    .line 107
    invoke-direct/range {v8 .. v13}, Lf5/c;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    .line 108
    .line 109
    .line 110
    filled-new-array/range {v0 .. v8}, [Lf5/c;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    sput-object v9, Lf5/c;->m:[Lf5/c;

    .line 115
    .line 116
    filled-new-array/range {v0 .. v6}, [Lf5/c;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    sput-object v0, Lf5/c;->j:[Lf5/c;

    .line 121
    .line 122
    filled-new-array {v7, v8}, [Lf5/c;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    sput-object v0, Lf5/c;->k:[Lf5/c;

    .line 127
    .line 128
    new-instance v0, Ljava/util/HashMap;

    .line 129
    .line 130
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 131
    .line 132
    .line 133
    sput-object v0, Lf5/c;->l:Ljava/util/HashMap;

    .line 134
    .line 135
    invoke-static {}, Lf5/c;->values()[Lf5/c;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    array-length v1, v0

    .line 140
    const/4 v2, 0x0

    .line 141
    :goto_0
    if-ge v2, v1, :cond_0

    .line 142
    .line 143
    aget-object v3, v0, v2

    .line 144
    .line 145
    sget-object v4, Lf5/c;->l:Ljava/util/HashMap;

    .line 146
    .line 147
    iget-object v5, v3, Lf5/c;->h:Ljava/lang/String;

    .line 148
    .line 149
    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    add-int/lit8 v2, v2, 0x1

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lf5/c;->g:I

    .line 5
    .line 6
    iput-object p4, p0, Lf5/c;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-boolean p5, p0, Lf5/c;->i:Z

    .line 9
    .line 10
    return-void
.end method

.method public static a(I)Ljava/util/Set;
    .locals 6

    .line 1
    and-int/lit8 v0, p0, 0x7

    .line 2
    .line 3
    sget-object v1, Lf5/c;->j:[Lf5/c;

    .line 4
    .line 5
    aget-object v1, v1, v0

    .line 6
    .line 7
    new-instance v2, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    and-int/lit8 v3, p0, -0x8

    .line 13
    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    :goto_0
    const/4 v3, 0x2

    .line 29
    if-ge v1, v3, :cond_3

    .line 30
    .line 31
    sget-object v3, Lf5/c;->k:[Lf5/c;

    .line 32
    .line 33
    aget-object v3, v3, v1

    .line 34
    .line 35
    iget-boolean v4, v3, Lf5/c;->i:Z

    .line 36
    .line 37
    iget v5, v3, Lf5/c;->g:I

    .line 38
    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    and-int v4, p0, v5

    .line 42
    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    if-ne v0, v5, :cond_2

    .line 47
    .line 48
    :goto_1
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lf5/c;
    .locals 1

    .line 1
    const-class v0, Lf5/c;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lf5/c;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lf5/c;
    .locals 1

    .line 1
    sget-object v0, Lf5/c;->m:[Lf5/c;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lf5/c;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lf5/c;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lf5/c;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
