.class public final Lxhss/ᛵᛳᲀᛶ;
.super Lxhss/ᛲᛱᛶᛴ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᲇᛴᲇᛵ:Lxhss/ᛸᛵᛳᛵ;


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/util/HashMap;

.field public final ᛳᲁᲇᛸ:Ljava/util/HashMap;

.field public final ᛷᛵᛵᲈ:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᛸᛵᛳᛵ;

    .line 2
    .line 3
    invoke-direct {v0}, Lxhss/ᛸᛵᛳᛵ;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxhss/ᛵᛳᲀᛶ;->ᲇᛴᲇᛵ:Lxhss/ᛸᛵᛳᛵ;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    array-length v0, p1

    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    move v3, v2

    .line 12
    :goto_0
    if-ge v2, v0, :cond_1

    .line 13
    .line 14
    aget-object v4, p1, v2

    .line 15
    .line 16
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->isEnumConstant()Z

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    add-int/lit8 v5, v3, 0x1

    .line 23
    .line 24
    aput-object v4, p1, v3

    .line 25
    .line 26
    move v3, v5

    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, [Ljava/lang/reflect/Field;

    .line 35
    .line 36
    int-to-float v0, v3

    .line 37
    const/high16 v2, 0x3f400000    # 0.75f

    .line 38
    .line 39
    div-float/2addr v0, v2

    .line 40
    float-to-double v2, v0

    .line 41
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    double-to-int v0, v2

    .line 46
    new-instance v2, Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 49
    .line 50
    .line 51
    iput-object v2, p0, Lxhss/ᛵᛳᲀᛶ;->ᛷᛵᛵᲈ:Ljava/util/HashMap;

    .line 52
    .line 53
    new-instance v2, Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 56
    .line 57
    .line 58
    iput-object v2, p0, Lxhss/ᛵᛳᲀᛶ;->ᛱᛱᛲᲇ:Ljava/util/HashMap;

    .line 59
    .line 60
    new-instance v2, Ljava/util/HashMap;

    .line 61
    .line 62
    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 63
    .line 64
    .line 65
    iput-object v2, p0, Lxhss/ᛵᛳᲀᛶ;->ᛳᲁᲇᛸ:Ljava/util/HashMap;

    .line 66
    .line 67
    const/4 v0, 0x1

    .line 68
    invoke-static {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible([Ljava/lang/reflect/AccessibleObject;Z)V

    .line 69
    .line 70
    .line 71
    array-length v0, p1

    .line 72
    move v2, v1

    .line 73
    :goto_1
    if-ge v2, v0, :cond_3

    .line 74
    .line 75
    aget-object v3, p1, v2

    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    check-cast v4, Ljava/lang/Enum;

    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-virtual {v4}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    const-class v7, Lxhss/ᛶᲁᲈᛲ;

    .line 93
    .line 94
    invoke-virtual {v3, v7}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    check-cast v3, Lxhss/ᛶᲁᲈᛲ;

    .line 99
    .line 100
    if-eqz v3, :cond_2

    .line 101
    .line 102
    invoke-interface {v3}, Lxhss/ᛶᲁᲈᛲ;->value()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-interface {v3}, Lxhss/ᛶᲁᲈᛲ;->alternate()[Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    array-length v7, v3

    .line 111
    move v8, v1

    .line 112
    :goto_2
    if-ge v8, v7, :cond_2

    .line 113
    .line 114
    aget-object v9, v3, v8

    .line 115
    .line 116
    iget-object v10, p0, Lxhss/ᛵᛳᲀᛶ;->ᛷᛵᛵᲈ:Ljava/util/HashMap;

    .line 117
    .line 118
    invoke-virtual {v10, v9, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    add-int/lit8 v8, v8, 0x1

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_2
    iget-object v3, p0, Lxhss/ᛵᛳᲀᛶ;->ᛷᛵᛵᲈ:Ljava/util/HashMap;

    .line 125
    .line 126
    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    iget-object v3, p0, Lxhss/ᛵᛳᲀᛶ;->ᛱᛱᛲᲇ:Ljava/util/HashMap;

    .line 130
    .line 131
    invoke-virtual {v3, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    iget-object v3, p0, Lxhss/ᛵᛳᲀᛶ;->ᛳᲁᲇᛸ:Ljava/util/HashMap;

    .line 135
    .line 136
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    .line 138
    .line 139
    add-int/lit8 v2, v2, 0x1

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_3
    return-void

    .line 143
    :catch_0
    move-exception p0

    .line 144
    new-instance p1, Ljava/lang/AssertionError;

    .line 145
    .line 146
    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    throw p1
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᲁᲁᛴᲁ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᲀᛷᲁᲀ()V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛲᛴᲀᲈ()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v0, p0, Lxhss/ᛵᛳᲀᛶ;->ᛷᛵᛵᲈ:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/lang/Enum;

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    iget-object p0, p0, Lxhss/ᛵᛳᲀᛶ;->ᛱᛱᛲᲇ:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Ljava/lang/Enum;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_1
    return-object v0
.end method

.method public final ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Enum;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object p0, p0, Lxhss/ᛵᛳᲀᛶ;->ᛳᲁᲇᛸ:Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {p0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/lang/String;

    .line 14
    .line 15
    :goto_0
    invoke-virtual {p1, p0}, Lxhss/ᛸᲈᲈᛶ;->ᲁᛲᛴᛴ(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
