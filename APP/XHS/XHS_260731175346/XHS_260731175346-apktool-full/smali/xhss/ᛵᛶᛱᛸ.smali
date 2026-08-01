.class public final Lxhss/ᛵᛶᛱᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛳᲈᲈᛲ:I

.field public static final ᛶᲇᲈᛸ:I

.field public static final ᛷᲁᲁ:Lxhss/ᛱᲁᲈᛷ;

.field public static final ᛸᛶᛴᲈ:I

.field public static final ᛸᛶᲈᛶ:Lxhss/ᛵᛶᛱᛸ;

.field public static final ᛸᛷᲈᲈ:Lxhss/ᛱᲀᛸᛸ;

.field public static final ᲇᛸᛳᲁ:Ljava/util/List;

.field public static final ᲈᛳᲀ:Lxhss/ᛳᛱᛲᲀ;


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/util/HashMap;

.field public final ᛳᲁᲇᛸ:Ljava/util/ArrayList;

.field public ᛷᛴᛷᛱ:Lxhss/ᛱᲀᛸᛸ;

.field public final ᛷᛵᛵᲈ:Lxhss/ᛱᛷᲈᛱ;

.field public final ᛸᛲᲀᛵ:I

.field public final ᛸᛴᛶᛳ:I

.field public final ᲀᲇᛳᲁ:I

.field public final ᲇᛴᲇᛵ:Ljava/util/ArrayList;

.field public final ᲇᛶᛴᲀ:Ljava/util/ArrayDeque;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lxhss/ᛱᲀᛸᛸ;->ᲇᛴᲇᛵ:Lxhss/ᛱᲀᛸᛸ;

    .line 2
    .line 3
    sput-object v0, Lxhss/ᛵᛶᛱᛸ;->ᛸᛷᲈᲈ:Lxhss/ᛱᲀᛸᛸ;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    sput v0, Lxhss/ᛵᛶᛱᛸ;->ᛳᲈᲈᛲ:I

    .line 7
    .line 8
    sput v0, Lxhss/ᛵᛶᛱᛸ;->ᛶᲇᲈᛸ:I

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    sput v0, Lxhss/ᛵᛶᛱᛸ;->ᛸᛶᛴᲈ:I

    .line 12
    .line 13
    new-instance v0, Lxhss/ᛳᛱᛲᲀ;

    .line 14
    .line 15
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 16
    .line 17
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 18
    .line 19
    const/4 v3, 0x4

    .line 20
    invoke-direct {v0, v3, v1, v2}, Lxhss/ᛳᛱᛲᲀ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lxhss/ᛵᛶᛱᛸ;->ᲈᛳᲀ:Lxhss/ᛳᛱᛲᲀ;

    .line 24
    .line 25
    new-instance v1, Lxhss/ᛱᲁᲈᛷ;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Lxhss/ᛱᲁᲈᛷ;-><init>(Lxhss/ᛳᛱᛲᲀ;)V

    .line 28
    .line 29
    .line 30
    sput-object v1, Lxhss/ᛵᛶᛱᛸ;->ᛷᲁᲁ:Lxhss/ᛱᲁᲈᛷ;

    .line 31
    .line 32
    new-instance v2, Lxhss/ᛵᛶᛱᛸ;

    .line 33
    .line 34
    invoke-direct {v2}, Lxhss/ᛵᛶᛱᛸ;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v2, Lxhss/ᛵᛶᛱᛸ;->ᛸᛶᲈᛶ:Lxhss/ᛵᛶᛱᛸ;

    .line 38
    .line 39
    invoke-virtual {v2, v0, v1}, Lxhss/ᛵᛶᛱᛸ;->ᛷᛵᛵᲈ(Lxhss/ᛳᛱᛲᲀ;Lxhss/ᛱᲁᲈᛷ;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Lxhss/ᛵᛶᛱᛸ;->ᲇᛸᛳᲁ:Ljava/util/List;

    .line 44
    .line 45
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lxhss/ᛱᛷᲈᛱ;->ᲇᛴᲇᛵ:Lxhss/ᛱᛷᲈᛱ;

    .line 5
    .line 6
    iput-object v0, p0, Lxhss/ᛵᛶᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᲈᛱ;

    .line 7
    .line 8
    sget v0, Lxhss/ᛵᛶᛱᛸ;->ᛳᲈᲈᛲ:I

    .line 9
    .line 10
    iput v0, p0, Lxhss/ᛵᛶᛱᛸ;->ᲀᲇᛳᲁ:I

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lxhss/ᛵᛶᛱᛸ;->ᛱᛱᛲᲇ:Ljava/util/HashMap;

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lxhss/ᛵᛶᛱᛸ;->ᛳᲁᲇᛸ:Ljava/util/ArrayList;

    .line 25
    .line 26
    new-instance v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lxhss/ᛵᛶᛱᛸ;->ᲇᛴᲇᛵ:Ljava/util/ArrayList;

    .line 32
    .line 33
    sget-object v0, Lxhss/ᛵᛶᛱᛸ;->ᛸᛷᲈᲈ:Lxhss/ᛱᲀᛸᛸ;

    .line 34
    .line 35
    iput-object v0, p0, Lxhss/ᛵᛶᛱᛸ;->ᛷᛴᛷᛱ:Lxhss/ᛱᲀᛸᛸ;

    .line 36
    .line 37
    sget v0, Lxhss/ᛵᛶᛱᛸ;->ᛶᲇᲈᛸ:I

    .line 38
    .line 39
    iput v0, p0, Lxhss/ᛵᛶᛱᛸ;->ᛸᛴᛶᛳ:I

    .line 40
    .line 41
    sget v0, Lxhss/ᛵᛶᛱᛸ;->ᛸᛶᛴᲈ:I

    .line 42
    .line 43
    iput v0, p0, Lxhss/ᛵᛶᛱᛸ;->ᛸᛲᲀᛵ:I

    .line 44
    .line 45
    new-instance v0, Ljava/util/ArrayDeque;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Lxhss/ᛵᛶᛱᛸ;->ᲇᛶᛴᲀ:Ljava/util/ArrayDeque;

    .line 51
    .line 52
    return-void
.end method

.method public static ᛱᛱᛲᲇ(Ljava/util/AbstractCollection;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-ne v0, v1, :cond_2

    .line 16
    .line 17
    instance-of v0, p0, Ljava/util/List;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    check-cast p0, Ljava/util/List;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :goto_0
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_2
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ(Lxhss/ᛳᛱᛲᲀ;Lxhss/ᛱᲁᲈᛷ;)Ljava/util/List;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᲁᲁᛴᲁ:Lxhss/ᲀᛲᛵᛲ;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    iget v1, p0, Lxhss/ᛵᛶᛱᛸ;->ᛸᛴᛶᛳ:I

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    sget-object v1, Lxhss/ᲁᛲᛸᲁ;->ᛳᲁᲇᛸ:Lxhss/ᛸᲁᲀᛵ;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v3, Lxhss/ᛸᲁᲀᛵ;

    .line 20
    .line 21
    invoke-direct {v3, v1}, Lxhss/ᛸᲁᲀᛵ;-><init>(I)V

    .line 22
    .line 23
    .line 24
    move-object v1, v3

    .line 25
    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lxhss/ᛵᛶᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᲈᛱ;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lxhss/ᛵᛶᛱᛸ;->ᛳᲁᲇᛸ:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_1

    .line 40
    .line 41
    new-instance v3, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v3}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 50
    .line 51
    .line 52
    :cond_1
    iget-object v1, p0, Lxhss/ᛵᛶᛱᛸ;->ᲇᛴᲇᛵ:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-nez v3, :cond_2

    .line 59
    .line 60
    new-instance v3, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v3}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 69
    .line 70
    .line 71
    :cond_2
    sget-object v1, Lxhss/ᛷᛸᛵᛲ;->ᛷᛵᛵᲈ:Ljava/util/List;

    .line 72
    .line 73
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᛸᛲᛷᛱ:Lxhss/ᲀᛲᛵᛲ;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᲀᲇᛳᲁ:Lxhss/ᛵᲇᛸᛴ;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛵᲇᛸᛴ;

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᛷᛴᛷᛱ:Lxhss/ᛵᲇᛸᛴ;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᲇᛶᛴᲀ:Lxhss/ᛵᲇᛸᛴ;

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᲈᛳᲀ:Lxhss/ᲁᛶᲇᛳ;

    .line 99
    .line 100
    new-instance v3, Lxhss/ᛵᲇᛸᛴ;

    .line 101
    .line 102
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 103
    .line 104
    const-class v5, Ljava/lang/Long;

    .line 105
    .line 106
    invoke-direct {v3, v4, v5, v1}, Lxhss/ᛵᲇᛸᛴ;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lxhss/ᛲᛱᛶᛴ;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    sget-object v3, Lxhss/ᛱᛸᛴᛴ;->ᛸᛶᲈᛶ:Lxhss/ᛴᛷᲀᲈ;

    .line 113
    .line 114
    new-instance v4, Lxhss/ᛵᲇᛸᛴ;

    .line 115
    .line 116
    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 117
    .line 118
    const-class v6, Ljava/lang/Double;

    .line 119
    .line 120
    invoke-direct {v4, v5, v6, v3}, Lxhss/ᛵᲇᛸᛴ;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lxhss/ᛲᛱᛶᛴ;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    sget-object v3, Lxhss/ᛱᛸᛴᛴ;->ᛷᲁᲁ:Lxhss/ᛴᛷᲀᲈ;

    .line 127
    .line 128
    new-instance v4, Lxhss/ᛵᲇᛸᛴ;

    .line 129
    .line 130
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 131
    .line 132
    const-class v6, Ljava/lang/Float;

    .line 133
    .line 134
    invoke-direct {v4, v5, v6, v3}, Lxhss/ᛵᲇᛸᛴ;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lxhss/ᛲᛱᛶᛴ;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    const/4 v3, 0x2

    .line 141
    const/4 v4, 0x0

    .line 142
    iget v5, p0, Lxhss/ᛵᛶᛱᛸ;->ᛸᛲᲀᛵ:I

    .line 143
    .line 144
    if-ne v5, v3, :cond_3

    .line 145
    .line 146
    sget-object v3, Lxhss/ᛸᲁᲈᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲈᛷᲁ;

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_3
    new-instance v3, Lxhss/ᛸᲁᲈᛳ;

    .line 150
    .line 151
    invoke-direct {v3, v5}, Lxhss/ᛸᲁᲈᛳ;-><init>(I)V

    .line 152
    .line 153
    .line 154
    new-instance v5, Lxhss/ᲇᲈᛷᲁ;

    .line 155
    .line 156
    invoke-direct {v5, v3, v4}, Lxhss/ᲇᲈᛷᲁ;-><init>(Lxhss/ᛲᛱᛶᛴ;I)V

    .line 157
    .line 158
    .line 159
    move-object v3, v5

    .line 160
    :goto_1
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    sget-object v3, Lxhss/ᛱᛸᛴᛴ;->ᛸᛴᛶᛳ:Lxhss/ᲀᛲᛵᛲ;

    .line 164
    .line 165
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    sget-object v3, Lxhss/ᛱᛸᛴᛴ;->ᛸᛲᲀᛵ:Lxhss/ᲀᛲᛵᛲ;

    .line 169
    .line 170
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    new-instance v3, Lxhss/ᛴᛸᛸᛱ;

    .line 174
    .line 175
    invoke-direct {v3, v1, v2}, Lxhss/ᛴᛸᛸᛱ;-><init>(Lxhss/ᛲᛱᛶᛴ;I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v3}, Lxhss/ᛲᛱᛶᛴ;->ᛷᛵᛵᲈ()Lxhss/ᛲᛲᛸᲇ;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    new-instance v5, Lxhss/ᲀᛲᛵᛲ;

    .line 183
    .line 184
    const-class v6, Ljava/util/concurrent/atomic/AtomicLong;

    .line 185
    .line 186
    invoke-direct {v5, v6, v3, v4}, Lxhss/ᲀᛲᛵᛲ;-><init>(Ljava/lang/Class;Lxhss/ᛲᛱᛶᛴ;I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    new-instance v3, Lxhss/ᛴᛸᛸᛱ;

    .line 193
    .line 194
    invoke-direct {v3, v1, v4}, Lxhss/ᛴᛸᛸᛱ;-><init>(Lxhss/ᛲᛱᛶᛴ;I)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v3}, Lxhss/ᛲᛱᛶᛴ;->ᛷᛵᛵᲈ()Lxhss/ᛲᛲᛸᲇ;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    new-instance v3, Lxhss/ᲀᛲᛵᛲ;

    .line 202
    .line 203
    const-class v5, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 204
    .line 205
    invoke-direct {v3, v5, v1, v4}, Lxhss/ᲀᛲᛵᛲ;-><init>(Ljava/lang/Class;Lxhss/ᛲᛱᛶᛴ;I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᛸᛷᲈᲈ:Lxhss/ᲀᛲᛵᛲ;

    .line 212
    .line 213
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᲇᛸᛳᲁ:Lxhss/ᛵᲇᛸᛴ;

    .line 217
    .line 218
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᛴᲈᛱᛴ:Lxhss/ᲀᛲᛵᛲ;

    .line 222
    .line 223
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᛳᛶᛷᲀ:Lxhss/ᲀᛲᛵᛲ;

    .line 227
    .line 228
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᛳᲈᲈᛲ:Lxhss/ᲀᛲᛵᛲ;

    .line 232
    .line 233
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᛶᲇᲈᛸ:Lxhss/ᲀᛲᛵᛲ;

    .line 237
    .line 238
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᛸᛶᛴᲈ:Lxhss/ᲀᛲᛵᛲ;

    .line 242
    .line 243
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᲁᛲᛴᛴ:Lxhss/ᲀᛲᛵᛲ;

    .line 247
    .line 248
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᲈᛲᛵᲁ:Lxhss/ᲀᛲᛵᛲ;

    .line 252
    .line 253
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᲀᛷᲁᲀ:Lxhss/ᲀᛲᛵᛲ;

    .line 257
    .line 258
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᛱᛳᲁᲈ:Lxhss/ᲀᛲᛵᛲ;

    .line 262
    .line 263
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᛲᛴᲇᛲ:Lxhss/ᲀᛲᛵᛲ;

    .line 267
    .line 268
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᲁᛴᲇᛲ:Lxhss/ᲀᛲᛵᛲ;

    .line 272
    .line 273
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᛱᛱᛲᲇ:Lxhss/ᲀᛲᛵᛲ;

    .line 277
    .line 278
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    sget-object v1, Lxhss/ᛱᛵᛳᲈ;->ᛳᲁᲇᛸ:Lxhss/ᲀᛶᲈᛲ;

    .line 282
    .line 283
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᛲᛴᲀᲈ:Lxhss/ᲇᲈᛷᲁ;

    .line 287
    .line 288
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    const/4 v1, 0x0

    .line 292
    :try_start_0
    const-class v3, Lxhss/ᲇᛸᲀᲁ;

    .line 293
    .line 294
    sget-object v5, Lxhss/ᲇᛸᲀᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛳᲈᛷᛸ;

    .line 295
    .line 296
    invoke-virtual {v3, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    check-cast v3, Lxhss/ᛴᛴᛷᛸ;

    .line 305
    .line 306
    check-cast v3, Lxhss/ᲇᛸᲀᲁ;

    .line 307
    .line 308
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    sget-object v1, Lxhss/ᲇᛸᲀᲁ;->ᛸᛷᲈᲈ:Lxhss/ᲇᛸᲀᲁ$ᛱᛱᛲᲇ;
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_0

    .line 312
    .line 313
    :catch_0
    if-eqz v1, :cond_4

    .line 314
    .line 315
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    :cond_4
    sget-object v1, Lxhss/ᛷᛸᛵᛲ;->ᛷᛵᛵᲈ:Ljava/util/List;

    .line 319
    .line 320
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 321
    .line 322
    .line 323
    sget-object v1, Lxhss/ᛲᛵᲈᲁ;->ᛳᲁᲇᛸ:Lxhss/ᲈᛲᛶ;

    .line 324
    .line 325
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛲᛵᛲ;

    .line 329
    .line 330
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    new-instance v1, Lxhss/ᲇᲈᛸᛱ;

    .line 334
    .line 335
    invoke-direct {v1, p1, v4}, Lxhss/ᲇᲈᛸᛱ;-><init>(Lxhss/ᛳᛱᛲᲀ;I)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    new-instance v1, Lxhss/ᲇᲈᛸᛱ;

    .line 342
    .line 343
    invoke-direct {v1, p1, v2}, Lxhss/ᲇᲈᛸᛱ;-><init>(Lxhss/ᛳᛱᛲᲀ;I)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    sget-object v1, Lxhss/ᛱᛸᛴᛴ;->ᛳᛸᛵᲀ:Lxhss/ᛸᛵᛳᛵ;

    .line 353
    .line 354
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    new-instance v2, Lxhss/ᛷᛲᲀᲀ;

    .line 358
    .line 359
    iget-object v1, p0, Lxhss/ᛵᛶᛱᛸ;->ᲇᛶᛴᲀ:Ljava/util/ArrayDeque;

    .line 360
    .line 361
    invoke-static {v1}, Lxhss/ᛵᛶᛱᛸ;->ᛱᛱᛲᲇ(Ljava/util/AbstractCollection;)Ljava/util/List;

    .line 362
    .line 363
    .line 364
    move-result-object v7

    .line 365
    iget v4, p0, Lxhss/ᛵᛶᛱᛸ;->ᲀᲇᛳᲁ:I

    .line 366
    .line 367
    iget-object v5, p0, Lxhss/ᛵᛶᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᲈᛱ;

    .line 368
    .line 369
    move-object v3, p1

    .line 370
    move-object v6, p2

    .line 371
    invoke-direct/range {v2 .. v7}, Lxhss/ᛷᛲᲀᲀ;-><init>(Lxhss/ᛳᛱᛲᲀ;ILxhss/ᛱᛷᲈᛱ;Lxhss/ᛱᲁᲈᛷ;Ljava/util/List;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0}, Ljava/util/ArrayList;->trimToSize()V

    .line 378
    .line 379
    .line 380
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 381
    .line 382
    .line 383
    move-result-object p0

    .line 384
    return-object p0
.end method
