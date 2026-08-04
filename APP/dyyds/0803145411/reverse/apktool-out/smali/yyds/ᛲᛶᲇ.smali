.class public abstract Lyyds/ᛲᛶᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Lyyds/ᛴᛲᛷᛸ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛴᛲᛷᛸ;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lyyds/ᛴᛲᛷᛸ;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lyyds/ᛲᛶᲇ;->ᛲᲈᲁ:Lyyds/ᛴᛲᛷᛸ;

    .line 9
    .line 10
    return-void
.end method

.method public static final ᛱᛳᲇ(Lyyds/ᛴᛸᛲᛳ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getAnnotatedExceptionTypes()[Ljava/lang/reflect/AnnotatedType;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, [Ljava/lang/reflect/AnnotatedElement;

    .line 6
    .line 7
    invoke-static {p2}, Lyyds/ᛲᛶᲇ;->ᲇᲈᛵᛷ([Ljava/lang/reflect/AnnotatedElement;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-static {p1, p2, p0}, Lyyds/ᛲᛶᲇ;->ᛲᛴᛳᛲ(Ljava/util/Collection;Ljava/util/List;Lyyds/ᛴᛸᛲᛳ;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public static final ᛱᲈᲁ(Lyyds/ᛴᛸᛲᛳ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getAnnotatedReturnType()Ljava/lang/reflect/AnnotatedType;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2}, Ljava/lang/reflect/AnnotatedType;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    array-length v1, p2

    .line 12
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    array-length v1, p2

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    if-ge v2, v1, :cond_0

    .line 18
    .line 19
    aget-object v3, p2, v2

    .line 20
    .line 21
    invoke-static {v3}, Lyyds/ᛳᛴᲁᲇ;->ᲀᛲᛳᲀ(Ljava/lang/annotation/Annotation;)Lyyds/ᲁᛵᛴᲀ;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v3}, Lyyds/ᲈᲇᛶᛷ;->ᛲᲈᲁ()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {p1, v0, p0}, Lyyds/ᛲᛶᲇ;->ᛲᛴᛳᛲ(Ljava/util/Collection;Ljava/util/List;Lyyds/ᛴᛸᛲᛳ;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0
.end method

.method public static final ᛲᛲᲈᲈ(Lyyds/ᛴᛸᛲᛳ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getAnnotatedParameterTypes()[Ljava/lang/reflect/AnnotatedType;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, [Ljava/lang/reflect/AnnotatedElement;

    .line 6
    .line 7
    invoke-static {p2}, Lyyds/ᛲᛶᲇ;->ᲇᲈᛵᛷ([Ljava/lang/reflect/AnnotatedElement;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-static {p1, p2, p0}, Lyyds/ᛲᛶᲇ;->ᛲᛴᛳᛲ(Ljava/util/Collection;Ljava/util/List;Lyyds/ᛴᛸᛲᛳ;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    xor-int/lit8 p0, p0, 0x1

    .line 16
    .line 17
    return p0
.end method

.method public static final ᛲᛳᛶᲁ(Lyyds/ᛴᛸᛲᛳ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getAnnotatedReturnType()Ljava/lang/reflect/AnnotatedType;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2}, Ljava/lang/reflect/AnnotatedType;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    array-length v1, p2

    .line 12
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    array-length v1, p2

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    if-ge v2, v1, :cond_0

    .line 18
    .line 19
    aget-object v3, p2, v2

    .line 20
    .line 21
    invoke-static {v3}, Lyyds/ᛳᛴᲁᲇ;->ᲀᛲᛳᲀ(Ljava/lang/annotation/Annotation;)Lyyds/ᲁᛵᛴᲀ;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v3}, Lyyds/ᲈᲇᛶᛷ;->ᛲᲈᲁ()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {p1, v0, p0}, Lyyds/ᛲᛶᲇ;->ᛲᛴᛳᛲ(Ljava/util/Collection;Ljava/util/List;Lyyds/ᛴᛸᛲᛳ;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    xor-int/lit8 p0, p0, 0x1

    .line 40
    .line 41
    return p0
.end method

.method public static ᛲᛴᛳᛲ(Ljava/util/Collection;Ljava/util/List;Lyyds/ᛴᛸᛲᛳ;)Z
    .locals 6

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    move v0, v2

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    add-int/lit8 v3, v0, 0x1

    .line 29
    .line 30
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Ljava/lang/Class;

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-static {v1, p2, v4}, Lyyds/ᛲᛶᲇ;->ᛳᛸᛴᛶ(Ljava/lang/Object;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-class v4, Lyyds/ᛲᛶᛱᛵ;

    .line 42
    .line 43
    invoke-static {v4}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-static {v5}, Lyyds/ᛳᛴᲁᲇ;->ᛲᛴᛳᛲ(Lyyds/ᲁᛵᛴᲀ;)Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    if-nez v5, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move-object v4, v5

    .line 55
    :goto_1
    invoke-static {v1, v4}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-nez v4, :cond_2

    .line 60
    .line 61
    invoke-static {v0, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_2

    .line 66
    .line 67
    :goto_2
    return v2

    .line 68
    :cond_2
    move v0, v3

    .line 69
    goto :goto_0

    .line 70
    :cond_3
    const/4 p0, 0x1

    .line 71
    return p0
.end method

.method public static ᛲᲈᲁ(Lyyds/ᛳᛳᲀᲀ;Lyyds/ᲇᛴᲇᛶ;Lyyds/ᛴᛸᛲᛳ;)Lyyds/ᛲᲈᲁᛱ;
    .locals 4

    .line 1
    iget-object v0, p1, Lyyds/ᲇᛴᲇᛶ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Lyyds/ᲀᛲᛱᲈ;

    .line 4
    .line 5
    const/16 v2, 0x18

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const-string v2, "name"

    .line 11
    .line 12
    invoke-static {p0, p2, v2, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget-object v0, p1, Lyyds/ᲇᛴᲇᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛸᛸᛶ;

    .line 17
    .line 18
    new-instance v1, Lyyds/ᲀᛲᛱᲈ;

    .line 19
    .line 20
    const/16 v2, 0x19

    .line 21
    .line 22
    invoke-direct {v1, v2}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 23
    .line 24
    .line 25
    const-string v2, "nameCondition"

    .line 26
    .line 27
    invoke-static {p0, p2, v2, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget-object v0, p1, Lyyds/ᲇᛴᲇᛶ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashSet;

    .line 32
    .line 33
    new-instance v1, Lyyds/ᲀᛲᛱᲈ;

    .line 34
    .line 35
    const/16 v2, 0x1a

    .line 36
    .line 37
    invoke-direct {v1, v2}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 38
    .line 39
    .line 40
    const-string v2, "modifiers"

    .line 41
    .line 42
    invoke-static {p0, p2, v2, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    iget-object v0, p1, Lyyds/ᲇᛴᲇᛶ;->ᛲᛴᛳᛲ:Ljava/util/LinkedHashSet;

    .line 47
    .line 48
    new-instance v1, Lyyds/ᲀᛲᛱᲈ;

    .line 49
    .line 50
    const/16 v2, 0x1b

    .line 51
    .line 52
    invoke-direct {v1, v2}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 53
    .line 54
    .line 55
    const-string v2, "modifiersNot"

    .line 56
    .line 57
    invoke-static {p0, p2, v2, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance v0, Lyyds/ᲀᛲᛱᲈ;

    .line 62
    .line 63
    const/16 v1, 0x1c

    .line 64
    .line 65
    invoke-direct {v0, v1}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 66
    .line 67
    .line 68
    const-string v1, "modifiersCondition"

    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    invoke-static {p0, p2, v1, v2, v0}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    new-instance v0, Lyyds/ᲀᛲᛱᲈ;

    .line 76
    .line 77
    const/16 v1, 0x1d

    .line 78
    .line 79
    invoke-direct {v0, v1}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 80
    .line 81
    .line 82
    const-string v1, "isSynthetic"

    .line 83
    .line 84
    invoke-static {p0, p2, v1, v2, v0}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    new-instance v0, Lyyds/ᲈᲈᲁᛴ;

    .line 89
    .line 90
    const/4 v1, 0x0

    .line 91
    invoke-direct {v0, v1}, Lyyds/ᲈᲈᲁᛴ;-><init>(I)V

    .line 92
    .line 93
    .line 94
    const-string v1, "isSyntheticNot"

    .line 95
    .line 96
    invoke-static {p0, p2, v1, v2, v0}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    iget-object v0, p1, Lyyds/ᲇᛴᲇᛶ;->ᲇᲇᲇᛱ:Ljava/util/LinkedHashSet;

    .line 101
    .line 102
    new-instance v1, Lyyds/ᲇᛲᲇ;

    .line 103
    .line 104
    const/16 v3, 0xf

    .line 105
    .line 106
    invoke-direct {v1, p2, v3}, Lyyds/ᲇᛲᲇ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 107
    .line 108
    .line 109
    const-string v3, "annotations"

    .line 110
    .line 111
    invoke-static {p0, p2, v3, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    iget-object p1, p1, Lyyds/ᲇᛴᲇᛶ;->ᛶᛷᛲᲁ:Ljava/util/LinkedHashSet;

    .line 116
    .line 117
    new-instance v0, Lyyds/ᲇᛲᲇ;

    .line 118
    .line 119
    const/16 v1, 0x10

    .line 120
    .line 121
    invoke-direct {v0, p2, v1}, Lyyds/ᲇᛲᲇ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 122
    .line 123
    .line 124
    const-string v1, "annotationsNot"

    .line 125
    .line 126
    invoke-static {p0, p2, v1, p1, v0}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    new-instance p1, Lyyds/ᲈᲈᲁᛴ;

    .line 131
    .line 132
    const/4 v0, 0x1

    .line 133
    invoke-direct {p1, v0}, Lyyds/ᲈᲈᲁᛴ;-><init>(I)V

    .line 134
    .line 135
    .line 136
    const-string v0, "genericString"

    .line 137
    .line 138
    invoke-static {p0, p2, v0, v2, p1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    return-object p0
.end method

.method public static ᛳᛸᛴᛶ(Ljava/lang/Object;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;)Ljava/lang/Class;
    .locals 3

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Class;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    instance-of v0, p0, Lyyds/ᲁᛵᛴᲀ;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Lyyds/ᲁᛵᛴᲀ;

    .line 13
    .line 14
    check-cast p0, Lyyds/ᲈᲇᛶᛷ;

    .line 15
    .line 16
    invoke-interface {p0}, Lyyds/ᲈᲇᛶᛷ;->ᛲᲈᲁ()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    instance-of v0, p0, Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v0, :cond_4

    .line 24
    .line 25
    iget v0, p1, Lyyds/ᛴᛸᛲᛳ;->ᲇᲈᛵᛷ:I

    .line 26
    .line 27
    iget-object p1, p1, Lyyds/ᛴᛸᛲᛳ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    const/4 v2, 0x1

    .line 31
    if-ne v0, v2, :cond_2

    .line 32
    .line 33
    check-cast p0, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p0, p1, v1}, Lyyds/ᛶᛷᛱᲈ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/ClassLoader;I)Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    check-cast p0, Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p0, p1, v1}, Lyyds/ᛶᛷᛱᲈ;->ᲀᛲᛳᲀ(Ljava/lang/String;Ljava/lang/ClassLoader;I)Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-nez p0, :cond_5

    .line 55
    .line 56
    const-class p0, Lyyds/ᲀᲀᛸᛱ;

    .line 57
    .line 58
    invoke-static {p0}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p1}, Lyyds/ᛳᛴᲁᲇ;->ᛲᛴᛳᛲ(Lyyds/ᲁᛵᛴᲀ;)Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-nez p1, :cond_3

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    move-object p0, p1

    .line 70
    goto :goto_0

    .line 71
    :cond_4
    instance-of p1, p0, Lyyds/ᛲᛶᛱᛵ;

    .line 72
    .line 73
    if-eqz p1, :cond_9

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    :cond_5
    :goto_0
    const-class p1, Lyyds/ᛲᛶᛱᛵ;

    .line 80
    .line 81
    invoke-static {p1}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, Lyyds/ᛳᛴᲁᲇ;->ᛲᛴᛳᛲ(Lyyds/ᲁᛵᛴᲀ;)Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-nez v0, :cond_6

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_6
    move-object p1, v0

    .line 93
    :goto_1
    invoke-static {p0, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_8

    .line 98
    .line 99
    if-nez p2, :cond_7

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 103
    .line 104
    new-instance p1, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    const-string v0, "VagueType is not supported for \""

    .line 107
    .line 108
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string p2, "\"."

    .line 115
    .line 116
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p0

    .line 131
    :cond_8
    :goto_2
    return-object p0

    .line 132
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 133
    .line 134
    new-instance p2, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    const-string v0, "Unsupported type: "

    .line 137
    .line 138
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string p0, ", supported types are Class, KClass, String and VagueType."

    .line 145
    .line 146
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw p1
.end method

.method public static final ᛳᲁᲁᲇ(Lyyds/ᛴᛸᛲᛳ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getAnnotatedExceptionTypes()[Ljava/lang/reflect/AnnotatedType;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, [Ljava/lang/reflect/AnnotatedElement;

    .line 6
    .line 7
    invoke-static {p2}, Lyyds/ᛲᛶᲇ;->ᲇᲈᛵᛷ([Ljava/lang/reflect/AnnotatedElement;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-static {p1, p2, p0}, Lyyds/ᛲᛶᲇ;->ᛲᛴᛳᛲ(Ljava/util/Collection;Ljava/util/List;Lyyds/ᛴᛸᛲᛳ;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    xor-int/lit8 p0, p0, 0x1

    .line 16
    .line 17
    return p0
.end method

.method public static ᛵᛶᛲᲀ(Lyyds/ᲇᛴᲇᛶ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/Class;Lyyds/ᛷᛴᲈᲀ;)Ljava/util/List;
    .locals 3

    .line 1
    sget-object v0, Lyyds/ᛸᲀᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛶᲈ;

    .line 2
    .line 3
    if-eqz p2, :cond_4

    .line 4
    .line 5
    const-class v1, Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {v1}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v2}, Lyyds/ᛳᛴᲁᲇ;->ᛲᛴᛳᛲ(Lyyds/ᲁᛵᛴᲀ;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v1, v2

    .line 19
    :goto_0
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_1
    invoke-interface {p3, p2}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/util/Collection;

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    iget-boolean v1, p1, Lyyds/ᛴᛸᛲᛳ;->ᲀᛲᛳᲀ:Z

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-static {p0, p1, p2, p3}, Lyyds/ᛲᛶᲇ;->ᛵᛶᛲᲀ(Lyyds/ᲇᛴᲇᛶ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/Class;Lyyds/ᛷᛴᲈᲀ;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    invoke-static {p0, p1}, Lyyds/ᛲᛶᲇ;->ᲀᛲᛲᲇ(Lyyds/ᲇᛴᲇᛶ;Lyyds/ᛴᛸᛲᛳ;)V

    .line 52
    .line 53
    .line 54
    :goto_1
    move-object v1, v0

    .line 55
    :cond_3
    check-cast v1, Ljava/util/List;

    .line 56
    .line 57
    return-object v1

    .line 58
    :cond_4
    :goto_2
    invoke-static {p0, p1}, Lyyds/ᛲᛶᲇ;->ᲀᛲᛲᲇ(Lyyds/ᲇᛴᲇᛶ;Lyyds/ᛴᛸᛲᛳ;)V

    .line 59
    .line 60
    .line 61
    return-object v0
.end method

.method public static final ᛵᛸᛸᛷ(Ljava/lang/String;)I
    .locals 7

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 5
    .line 6
    .line 7
    move-result v3

    .line 8
    if-ge v2, v3, :cond_1

    .line 9
    .line 10
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    int-to-long v3, v3

    .line 15
    const-wide/16 v5, 0x7f

    .line 16
    .line 17
    cmp-long v3, v3, v5

    .line 18
    .line 19
    if-lez v3, :cond_0

    .line 20
    .line 21
    const-wide/16 v3, 0x2

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const-wide/16 v3, 0x1

    .line 25
    .line 26
    :goto_1
    add-long/2addr v0, v3

    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    long-to-int p0, v0

    .line 31
    return p0
.end method

.method public static ᛶᛳᛶᛵ(Ljava/lang/reflect/Member;)[Ljava/lang/annotation/Annotation;
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/reflect/AnnotatedElement;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/reflect/AnnotatedElement;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/lang/reflect/AnnotatedElement;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string v0, "Unsupported member type: "

    .line 13
    .line 14
    invoke-static {p0, v0}, Lyyds/ᛱᛸᛶᛲ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public static ᛶᛷᛲᲁ(Lyyds/ᛲᲈᲁᛱ;Lyyds/ᲁᛳᛶᛶ;Lyyds/ᛴᛸᛲᛳ;)Lyyds/ᛲᲈᲁᛱ;
    .locals 8

    .line 1
    iget-object v0, p1, Lyyds/ᲁᛳᛶᛶ;->ᛱᲈᲁ:Ljava/util/ArrayList;

    .line 2
    .line 3
    new-instance v1, Lyyds/ᲇᛲᲇ;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p2, v2}, Lyyds/ᲇᛲᲇ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 7
    .line 8
    .line 9
    const-string v2, "parameters"

    .line 10
    .line 11
    invoke-static {p0, p2, v2, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object v0, p1, Lyyds/ᲁᛳᛶᛶ;->ᛲᛳᛶᲁ:Ljava/util/ArrayList;

    .line 16
    .line 17
    new-instance v1, Lyyds/ᲇᛲᲇ;

    .line 18
    .line 19
    const/4 v2, 0x7

    .line 20
    invoke-direct {v1, p2, v2}, Lyyds/ᲇᛲᲇ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 21
    .line 22
    .line 23
    const-string v2, "parametersNot"

    .line 24
    .line 25
    invoke-static {p0, p2, v2, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance v0, Lyyds/ᲀᛲᛱᲈ;

    .line 30
    .line 31
    const/16 v1, 0x11

    .line 32
    .line 33
    invoke-direct {v0, v1}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 34
    .line 35
    .line 36
    const-string v1, "parametersCondition"

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-static {p0, p2, v1, v2, v0}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    iget-object v0, p1, Lyyds/ᲁᛳᛶᛶ;->ᛷᛵᲇᲀ:Ljava/lang/Integer;

    .line 44
    .line 45
    new-instance v1, Lyyds/ᲀᛲᛱᲈ;

    .line 46
    .line 47
    const/16 v3, 0x12

    .line 48
    .line 49
    invoke-direct {v1, v3}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 50
    .line 51
    .line 52
    const-string v3, "parameterCount"

    .line 53
    .line 54
    invoke-static {p0, p2, v3, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    new-instance v0, Lyyds/ᲀᛲᛱᲈ;

    .line 59
    .line 60
    const/16 v1, 0x13

    .line 61
    .line 62
    invoke-direct {v0, v1}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 63
    .line 64
    .line 65
    const-string v1, "parameterCountCondition"

    .line 66
    .line 67
    invoke-static {p0, p2, v1, v2, v0}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    iget-object v0, p1, Lyyds/ᲁᛳᛶᛶ;->ᛷᲈᲈᲁ:Ljava/util/LinkedHashSet;

    .line 72
    .line 73
    new-instance v1, Lyyds/ᲀᛲᛱᲈ;

    .line 74
    .line 75
    const/16 v3, 0x14

    .line 76
    .line 77
    invoke-direct {v1, v3}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 78
    .line 79
    .line 80
    const-string v3, "typeParameters"

    .line 81
    .line 82
    invoke-static {p0, p2, v3, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    iget-object v0, p1, Lyyds/ᲁᛳᛶᛶ;->ᛷᛲᲈᛱ:Ljava/util/LinkedHashSet;

    .line 87
    .line 88
    new-instance v1, Lyyds/ᲀᛲᛱᲈ;

    .line 89
    .line 90
    const/16 v3, 0x15

    .line 91
    .line 92
    invoke-direct {v1, v3}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 93
    .line 94
    .line 95
    const-string v3, "typeParametersNot"

    .line 96
    .line 97
    invoke-static {p0, p2, v3, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    iget-object v0, p1, Lyyds/ᲁᛳᛶᛶ;->ᛲᛲᲈᲈ:Ljava/util/LinkedHashSet;

    .line 102
    .line 103
    new-instance v1, Lyyds/ᲇᛲᲇ;

    .line 104
    .line 105
    const/16 v3, 0xd

    .line 106
    .line 107
    invoke-direct {v1, p2, v3}, Lyyds/ᲇᛲᲇ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 108
    .line 109
    .line 110
    const-string v4, "exceptionTypes"

    .line 111
    .line 112
    invoke-static {p0, p2, v4, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    iget-object v0, p1, Lyyds/ᲁᛳᛶᛶ;->ᛱᛳᲇ:Ljava/util/LinkedHashSet;

    .line 117
    .line 118
    new-instance v1, Lyyds/ᲇᛲᲇ;

    .line 119
    .line 120
    const/16 v4, 0xe

    .line 121
    .line 122
    invoke-direct {v1, p2, v4}, Lyyds/ᲇᛲᲇ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 123
    .line 124
    .line 125
    const-string v5, "exceptionTypesNot"

    .line 126
    .line 127
    invoke-static {p0, p2, v5, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    iget-object v0, p1, Lyyds/ᲁᛳᛶᛶ;->ᛳᲁᲁᲇ:Ljava/util/LinkedHashSet;

    .line 132
    .line 133
    new-instance v1, Lyyds/ᲀᛲᛱᲈ;

    .line 134
    .line 135
    const/16 v5, 0x16

    .line 136
    .line 137
    invoke-direct {v1, v5}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 138
    .line 139
    .line 140
    const-string v5, "genericExceptionTypes"

    .line 141
    .line 142
    invoke-static {p0, p2, v5, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    iget-object v0, p1, Lyyds/ᲁᛳᛶᛶ;->ᲇᛱᛲ:Ljava/util/LinkedHashSet;

    .line 147
    .line 148
    new-instance v1, Lyyds/ᲀᛲᛱᲈ;

    .line 149
    .line 150
    const/16 v5, 0xb

    .line 151
    .line 152
    invoke-direct {v1, v5}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 153
    .line 154
    .line 155
    const-string v6, "genericExceptionTypesNot"

    .line 156
    .line 157
    invoke-static {p0, p2, v6, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    iget-object v0, p1, Lyyds/ᲁᛳᛶᛶ;->ᛶᛳᛶᛵ:Ljava/util/LinkedHashSet;

    .line 162
    .line 163
    new-instance v1, Lyyds/ᲀᛲᛱᲈ;

    .line 164
    .line 165
    const/16 v6, 0xc

    .line 166
    .line 167
    invoke-direct {v1, v6}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 168
    .line 169
    .line 170
    const-string v7, "genericParameters"

    .line 171
    .line 172
    invoke-static {p0, p2, v7, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    iget-object v0, p1, Lyyds/ᲁᛳᛶᛶ;->ᛵᛶᛲᲀ:Ljava/util/LinkedHashSet;

    .line 177
    .line 178
    new-instance v1, Lyyds/ᲀᛲᛱᲈ;

    .line 179
    .line 180
    invoke-direct {v1, v3}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 181
    .line 182
    .line 183
    const-string v3, "genericParametersNot"

    .line 184
    .line 185
    invoke-static {p0, p2, v3, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    new-instance v0, Lyyds/ᲀᛲᛱᲈ;

    .line 190
    .line 191
    invoke-direct {v0, v4}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 192
    .line 193
    .line 194
    const-string v1, "isVarArgs"

    .line 195
    .line 196
    invoke-static {p0, p2, v1, v2, v0}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    new-instance v0, Lyyds/ᲀᛲᛱᲈ;

    .line 201
    .line 202
    const/16 v1, 0xf

    .line 203
    .line 204
    invoke-direct {v0, v1}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 205
    .line 206
    .line 207
    const-string v1, "isVarArgsNot"

    .line 208
    .line 209
    invoke-static {p0, p2, v1, v2, v0}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    iget-object v0, p1, Lyyds/ᲁᛳᛶᛶ;->ᲀᛲᛲᲇ:Ljava/util/ArrayList;

    .line 214
    .line 215
    new-instance v1, Lyyds/ᲇᛲᲇ;

    .line 216
    .line 217
    const/4 v2, 0x1

    .line 218
    invoke-direct {v1, p2, v2}, Lyyds/ᲇᛲᲇ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 219
    .line 220
    .line 221
    const-string v2, "parameterAnnotations"

    .line 222
    .line 223
    invoke-static {p0, p2, v2, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    iget-object v0, p1, Lyyds/ᲁᛳᛶᛶ;->ᛳᛸᛴᛶ:Ljava/util/ArrayList;

    .line 228
    .line 229
    new-instance v1, Lyyds/ᲇᛲᲇ;

    .line 230
    .line 231
    const/4 v2, 0x3

    .line 232
    invoke-direct {v1, p2, v2}, Lyyds/ᲇᛲᲇ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 233
    .line 234
    .line 235
    const-string v2, "parameterAnnotationsNot"

    .line 236
    .line 237
    invoke-static {p0, p2, v2, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    iget-object v0, p1, Lyyds/ᲁᛳᛶᛶ;->ᛶᲈᛴᲈ:Ljava/util/LinkedHashSet;

    .line 242
    .line 243
    new-instance v1, Lyyds/ᲇᛲᲇ;

    .line 244
    .line 245
    const/4 v2, 0x4

    .line 246
    invoke-direct {v1, p2, v2}, Lyyds/ᲇᛲᲇ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 247
    .line 248
    .line 249
    const-string v2, "annotatedReturnType"

    .line 250
    .line 251
    invoke-static {p0, p2, v2, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    iget-object v0, p1, Lyyds/ᲁᛳᛶᛶ;->ᛶᛸᲀᲁ:Ljava/util/LinkedHashSet;

    .line 256
    .line 257
    new-instance v1, Lyyds/ᲇᛲᲇ;

    .line 258
    .line 259
    const/4 v2, 0x5

    .line 260
    invoke-direct {v1, p2, v2}, Lyyds/ᲇᛲᲇ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 261
    .line 262
    .line 263
    const-string v2, "annotatedReturnTypeNot"

    .line 264
    .line 265
    invoke-static {p0, p2, v2, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    iget-object v0, p1, Lyyds/ᲁᛳᛶᛶ;->ᛵᲀᲈᛴ:Ljava/util/LinkedHashSet;

    .line 270
    .line 271
    new-instance v1, Lyyds/ᲇᛲᲇ;

    .line 272
    .line 273
    const/4 v2, 0x6

    .line 274
    invoke-direct {v1, p2, v2}, Lyyds/ᲇᛲᲇ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 275
    .line 276
    .line 277
    const-string v2, "annotatedReceiverType"

    .line 278
    .line 279
    invoke-static {p0, p2, v2, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    iget-object v0, p1, Lyyds/ᲁᛳᛶᛶ;->ᛲᛶᛱᲈ:Ljava/util/LinkedHashSet;

    .line 284
    .line 285
    new-instance v1, Lyyds/ᲇᛲᲇ;

    .line 286
    .line 287
    const/16 v2, 0x8

    .line 288
    .line 289
    invoke-direct {v1, p2, v2}, Lyyds/ᲇᛲᲇ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 290
    .line 291
    .line 292
    const-string v2, "annotatedReceiverTypeNot"

    .line 293
    .line 294
    invoke-static {p0, p2, v2, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    iget-object v0, p1, Lyyds/ᲁᛳᛶᛶ;->ᲈᲀᛲᲀ:Ljava/util/LinkedHashSet;

    .line 299
    .line 300
    new-instance v1, Lyyds/ᲇᛲᲇ;

    .line 301
    .line 302
    const/16 v2, 0x9

    .line 303
    .line 304
    invoke-direct {v1, p2, v2}, Lyyds/ᲇᛲᲇ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 305
    .line 306
    .line 307
    const-string v2, "annotatedParameterTypes"

    .line 308
    .line 309
    invoke-static {p0, p2, v2, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 310
    .line 311
    .line 312
    move-result-object p0

    .line 313
    iget-object v0, p1, Lyyds/ᲁᛳᛶᛶ;->ᛵᲀᛵᛸ:Ljava/util/LinkedHashSet;

    .line 314
    .line 315
    new-instance v1, Lyyds/ᲇᛲᲇ;

    .line 316
    .line 317
    const/16 v2, 0xa

    .line 318
    .line 319
    invoke-direct {v1, p2, v2}, Lyyds/ᲇᛲᲇ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 320
    .line 321
    .line 322
    const-string v2, "annotatedParameterTypesNot"

    .line 323
    .line 324
    invoke-static {p0, p2, v2, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    iget-object v0, p1, Lyyds/ᲁᛳᛶᛶ;->ᛲᛳᛴᛸ:Ljava/util/LinkedHashSet;

    .line 329
    .line 330
    new-instance v1, Lyyds/ᲇᛲᲇ;

    .line 331
    .line 332
    invoke-direct {v1, p2, v5}, Lyyds/ᲇᛲᲇ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 333
    .line 334
    .line 335
    const-string v2, "annotatedExceptionTypes"

    .line 336
    .line 337
    invoke-static {p0, p2, v2, v0, v1}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    iget-object p1, p1, Lyyds/ᲁᛳᛶᛶ;->ᛷᛸᲇᛶ:Ljava/util/LinkedHashSet;

    .line 342
    .line 343
    new-instance v0, Lyyds/ᲇᛲᲇ;

    .line 344
    .line 345
    invoke-direct {v0, p2, v6}, Lyyds/ᲇᛲᲇ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 346
    .line 347
    .line 348
    const-string v1, "annotatedExceptionTypesNot"

    .line 349
    .line 350
    invoke-static {p0, p2, v1, p1, v0}, Lyyds/ᛲᛶᲇ;->ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    return-object p0
.end method

.method public static final ᛷᛲᲈᛱ(Lyyds/ᛴᛸᛲᛳ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getAnnotatedReceiverType()Ljava/lang/reflect/AnnotatedType;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2}, Ljava/lang/reflect/AnnotatedType;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    array-length v1, p2

    .line 12
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    array-length v1, p2

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    if-ge v2, v1, :cond_0

    .line 18
    .line 19
    aget-object v3, p2, v2

    .line 20
    .line 21
    invoke-static {v3}, Lyyds/ᛳᛴᲁᲇ;->ᲀᛲᛳᲀ(Ljava/lang/annotation/Annotation;)Lyyds/ᲁᛵᛴᲀ;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v3}, Lyyds/ᲈᲇᛶᛷ;->ᛲᲈᲁ()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {p1, v0, p0}, Lyyds/ᛲᛶᲇ;->ᛲᛴᛳᛲ(Ljava/util/Collection;Ljava/util/List;Lyyds/ᛴᛸᛲᛳ;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    xor-int/lit8 p0, p0, 0x1

    .line 40
    .line 41
    return p0
.end method

.method public static final ᛷᛵᲇᲀ(Lyyds/ᛴᛸᛲᛳ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getAnnotatedParameterTypes()[Ljava/lang/reflect/AnnotatedType;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, [Ljava/lang/reflect/AnnotatedElement;

    .line 6
    .line 7
    invoke-static {p2}, Lyyds/ᛲᛶᲇ;->ᲇᲈᛵᛷ([Ljava/lang/reflect/AnnotatedElement;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-static {p1, p2, p0}, Lyyds/ᛲᛶᲇ;->ᛲᛴᛳᛲ(Ljava/util/Collection;Ljava/util/List;Lyyds/ᛴᛸᛲᛳ;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public static final ᛷᲈᲈᲁ(Lyyds/ᛴᛸᛲᛳ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getAnnotatedReceiverType()Ljava/lang/reflect/AnnotatedType;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2}, Ljava/lang/reflect/AnnotatedType;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    array-length v1, p2

    .line 12
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    array-length v1, p2

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    if-ge v2, v1, :cond_0

    .line 18
    .line 19
    aget-object v3, p2, v2

    .line 20
    .line 21
    invoke-static {v3}, Lyyds/ᛳᛴᲁᲇ;->ᲀᛲᛳᲀ(Ljava/lang/annotation/Annotation;)Lyyds/ᲁᛵᛴᲀ;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v3}, Lyyds/ᲈᲇᛶᛷ;->ᛲᲈᲁ()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {p1, v0, p0}, Lyyds/ᛲᛶᲇ;->ᛲᛴᛳᛲ(Ljava/util/Collection;Ljava/util/List;Lyyds/ᛴᛸᛲᛳ;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0
.end method

.method public static ᲀᛲᛲᲇ(Lyyds/ᲇᛴᲇᛶ;Lyyds/ᛴᛸᛲᛳ;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v3, " (Kotlin reflection is not available)"

    .line 6
    .line 7
    iget-boolean v0, v2, Lyyds/ᛴᛸᛲᛳ;->ᲀᛲᛳᲀ:Z

    .line 8
    .line 9
    iget-object v4, v2, Lyyds/ᛴᛸᛲᛳ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 10
    .line 11
    const-string v5, ""

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-string v6, " (Also tried for superclass)"

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v6, v5

    .line 19
    :goto_0
    if-nez v0, :cond_1

    .line 20
    .line 21
    const-string v0, "Members in superclass are not reflected in the current class, you can try adding superclass() in your condition and try again. "

    .line 22
    .line 23
    :goto_1
    move-object v7, v0

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    const-string v0, "Check if the conditions are correct and valid, and try again. "

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :goto_2
    const-string v0, "-+"

    .line 29
    .line 30
    const-string v8, "+-"

    .line 31
    .line 32
    const-string v9, "-"

    .line 33
    .line 34
    :try_start_0
    invoke-virtual {v1}, Lyyds/ᲇᛴᲇᛶ;->ᲀᛲᛳᲀ()Ljava/util/Map;

    .line 35
    .line 36
    .line 37
    move-result-object v11

    .line 38
    new-instance v12, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-interface {v11}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 44
    .line 45
    .line 46
    move-result-object v11

    .line 47
    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v11

    .line 51
    :cond_2
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v13

    .line 55
    if-eqz v13, :cond_9

    .line 56
    .line 57
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v13

    .line 61
    check-cast v13, Ljava/util/Map$Entry;

    .line 62
    .line 63
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v14

    .line 67
    check-cast v14, Ljava/lang/String;

    .line 68
    .line 69
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    if-nez v13, :cond_3

    .line 74
    .line 75
    :goto_4
    const/4 v13, 0x0

    .line 76
    goto :goto_5

    .line 77
    :cond_3
    instance-of v15, v13, Lyyds/ᛳᛳᲀᛳ;

    .line 78
    .line 79
    if-eqz v15, :cond_4

    .line 80
    .line 81
    const-string v13, "(Runtime Condition)"

    .line 82
    .line 83
    goto :goto_5

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    move-object/from16 v18, v4

    .line 86
    .line 87
    goto/16 :goto_a

    .line 88
    .line 89
    :cond_4
    instance-of v15, v13, Ljava/util/Collection;

    .line 90
    .line 91
    if-eqz v15, :cond_6

    .line 92
    .line 93
    move-object v15, v13

    .line 94
    check-cast v15, Ljava/util/Collection;

    .line 95
    .line 96
    invoke-interface {v15}, Ljava/util/Collection;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result v15

    .line 100
    if-eqz v15, :cond_5

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_5
    invoke-static {v13}, Lyyds/ᛲᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v13

    .line 107
    goto :goto_5

    .line 108
    :cond_6
    invoke-static {v13}, Lyyds/ᛲᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v13

    .line 112
    :goto_5
    if-eqz v13, :cond_7

    .line 113
    .line 114
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    invoke-static {v13, v3, v5}, Lyyds/ᛳᲀᲈᛷ;->ᛶᛸᲀᲁ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v13

    .line 122
    goto :goto_6

    .line 123
    :cond_7
    const/4 v13, 0x0

    .line 124
    :goto_6
    if-eqz v13, :cond_8

    .line 125
    .line 126
    new-instance v15, Lkotlin/Pair;

    .line 127
    .line 128
    invoke-direct {v15, v14, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    goto :goto_7

    .line 132
    :cond_8
    const/4 v15, 0x0

    .line 133
    :goto_7
    if-eqz v15, :cond_2

    .line 134
    .line 135
    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_9
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result v11

    .line 143
    if-eqz v11, :cond_a

    .line 144
    .line 145
    invoke-virtual {v4}, Ljava/lang/Class;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    move-object/from16 v18, v4

    .line 150
    .line 151
    goto/16 :goto_b

    .line 152
    .line 153
    :cond_a
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v11

    .line 157
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v13

    .line 161
    if-eqz v13, :cond_11

    .line 162
    .line 163
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v13

    .line 167
    check-cast v13, Lkotlin/Pair;

    .line 168
    .line 169
    invoke-virtual {v13}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v13

    .line 173
    check-cast v13, Ljava/lang/String;

    .line 174
    .line 175
    invoke-static {v13}, Lyyds/ᛲᛶᲇ;->ᛵᛸᛸᛷ(Ljava/lang/String;)I

    .line 176
    .line 177
    .line 178
    move-result v13

    .line 179
    :cond_b
    :goto_8
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v14

    .line 183
    if-eqz v14, :cond_c

    .line 184
    .line 185
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v14

    .line 189
    check-cast v14, Lkotlin/Pair;

    .line 190
    .line 191
    invoke-virtual {v14}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v14

    .line 195
    check-cast v14, Ljava/lang/String;

    .line 196
    .line 197
    invoke-static {v14}, Lyyds/ᛲᛶᲇ;->ᛵᛸᛸᛷ(Ljava/lang/String;)I

    .line 198
    .line 199
    .line 200
    move-result v14

    .line 201
    if-ge v13, v14, :cond_b

    .line 202
    .line 203
    move v13, v14

    .line 204
    goto :goto_8

    .line 205
    :cond_c
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v11

    .line 209
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v14

    .line 213
    if-eqz v14, :cond_10

    .line 214
    .line 215
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v14

    .line 219
    check-cast v14, Lkotlin/Pair;

    .line 220
    .line 221
    invoke-virtual {v14}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v14

    .line 225
    check-cast v14, Ljava/lang/String;

    .line 226
    .line 227
    invoke-static {v14}, Lyyds/ᛲᛶᲇ;->ᛵᛸᛸᛷ(Ljava/lang/String;)I

    .line 228
    .line 229
    .line 230
    move-result v14

    .line 231
    :cond_d
    :goto_9
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 232
    .line 233
    .line 234
    move-result v15

    .line 235
    if-eqz v15, :cond_e

    .line 236
    .line 237
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v15

    .line 241
    check-cast v15, Lkotlin/Pair;

    .line 242
    .line 243
    invoke-virtual {v15}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v15

    .line 247
    check-cast v15, Ljava/lang/String;

    .line 248
    .line 249
    invoke-static {v15}, Lyyds/ᛲᛶᲇ;->ᛵᛸᛸᛷ(Ljava/lang/String;)I

    .line 250
    .line 251
    .line 252
    move-result v15

    .line 253
    if-ge v14, v15, :cond_d

    .line 254
    .line 255
    move v14, v15

    .line 256
    goto :goto_9

    .line 257
    :cond_e
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v11

    .line 261
    invoke-static {v11, v3, v5}, Lyyds/ᛳᲀᲈᛷ;->ᛶᛸᲀᲁ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v11

    .line 265
    invoke-static {v11}, Lyyds/ᛲᛶᲇ;->ᛵᛸᛸᛷ(Ljava/lang/String;)I

    .line 266
    .line 267
    .line 268
    move-result v15

    .line 269
    add-int v16, v13, v14

    .line 270
    .line 271
    add-int/lit8 v16, v16, 0x3

    .line 272
    .line 273
    sub-int v15, v15, v16

    .line 274
    .line 275
    if-gez v15, :cond_f

    .line 276
    .line 277
    const/4 v15, 0x0

    .line 278
    :cond_f
    add-int/2addr v14, v15

    .line 279
    invoke-static {v13, v9}, Lyyds/ᛳᲀᲈᛷ;->ᛶᲈᛴᲈ(ILjava/lang/String;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v15

    .line 283
    invoke-static {v14, v9}, Lyyds/ᛳᲀᲈᛷ;->ᛶᲈᛴᲈ(ILjava/lang/String;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 287
    move-object/from16 v18, v4

    .line 288
    .line 289
    :try_start_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    const-string v15, "-+-"

    .line 301
    .line 302
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    add-int v10, v13, v14

    .line 316
    .line 317
    add-int/lit8 v10, v10, 0x3

    .line 318
    .line 319
    invoke-static {v10, v9}, Lyyds/ᛳᲀᲈᛷ;->ᛶᲈᛴᲈ(ILjava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    new-instance v15, Ljava/lang/StringBuilder;

    .line 324
    .line 325
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-static {v10, v11}, Lyyds/ᛲᛶᲇ;->ᲀᛲᛳᲀ(ILjava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v8

    .line 345
    new-instance v9, Ljava/lang/StringBuilder;

    .line 346
    .line 347
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 348
    .line 349
    .line 350
    const-string v10, "| "

    .line 351
    .line 352
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    const-string v8, " |"

    .line 359
    .line 360
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v8

    .line 367
    const-string v9, "\n"

    .line 368
    .line 369
    new-instance v10, Lyyds/ᲀᛱᲁᛸ;

    .line 370
    .line 371
    invoke-direct {v10, v13, v14}, Lyyds/ᲀᛱᲁᛸ;-><init>(II)V

    .line 372
    .line 373
    .line 374
    const/16 v17, 0x1e

    .line 375
    .line 376
    const/4 v14, 0x0

    .line 377
    const/4 v15, 0x0

    .line 378
    move-object v13, v9

    .line 379
    move-object/from16 v16, v10

    .line 380
    .line 381
    invoke-static/range {v12 .. v17}, Lyyds/ᛷᛷᛶᲇ;->ᲈᛷᲈᛶ(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛷᛴᲈᲀ;I)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v9

    .line 385
    filled-new-array {v0, v8, v4, v9, v4}, [Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-static {v0}, Lyyds/ᲈᛸᲁᛶ;->ᲇᛱᛲ([Ljava/lang/Object;)Ljava/util/List;

    .line 390
    .line 391
    .line 392
    move-result-object v8

    .line 393
    const-string v9, "\n"

    .line 394
    .line 395
    const/4 v12, 0x0

    .line 396
    const/16 v13, 0x3e

    .line 397
    .line 398
    const/4 v10, 0x0

    .line 399
    const/4 v11, 0x0

    .line 400
    invoke-static/range {v8 .. v13}, Lyyds/ᛷᛷᛶᲇ;->ᲈᛷᲈᛶ(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛷᛴᲈᲀ;I)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    goto :goto_b

    .line 405
    :catchall_1
    move-exception v0

    .line 406
    goto :goto_a

    .line 407
    :cond_10
    move-object/from16 v18, v4

    .line 408
    .line 409
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 410
    .line 411
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 412
    .line 413
    .line 414
    throw v0

    .line 415
    :cond_11
    move-object/from16 v18, v4

    .line 416
    .line 417
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 418
    .line 419
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 420
    .line 421
    .line 422
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 423
    :goto_a
    new-instance v4, Lyyds/ᲈᛵᛵᛴ;

    .line 424
    .line 425
    invoke-direct {v4, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 426
    .line 427
    .line 428
    move-object v0, v4

    .line 429
    :goto_b
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v4

    .line 433
    invoke-static {v4, v3, v5}, Lyyds/ᛳᲀᲈᛷ;->ᛶᛸᲀᲁ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    const-string v4, "\nFailed to build condition table."

    .line 438
    .line 439
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v3

    .line 443
    instance-of v4, v0, Lyyds/ᲈᛵᛵᛴ;

    .line 444
    .line 445
    if-eqz v4, :cond_12

    .line 446
    .line 447
    move-object v0, v3

    .line 448
    :cond_12
    check-cast v0, Ljava/lang/String;

    .line 449
    .line 450
    instance-of v3, v1, Lyyds/ᛵᲀᲀᛶ;

    .line 451
    .line 452
    const-string v4, "Unsupported condition type: "

    .line 453
    .line 454
    const-string v5, "\nSuggestion: "

    .line 455
    .line 456
    const-string v8, ".\n"

    .line 457
    .line 458
    if-eqz v3, :cond_13

    .line 459
    .line 460
    new-instance v9, Ljava/lang/StringBuilder;

    .line 461
    .line 462
    const-string v10, "No method found matching the condition for current class"

    .line 463
    .line 464
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    goto :goto_c

    .line 487
    :cond_13
    instance-of v9, v1, Lyyds/ᛱᛷᲁᛴ;

    .line 488
    .line 489
    if-eqz v9, :cond_14

    .line 490
    .line 491
    const-string v5, "No constructor found matching the condition for current class.\n"

    .line 492
    .line 493
    const-string v6, "\nSuggestion: Constructors are not inherited from superclass, check if the conditions are correct and valid, and try again. "

    .line 494
    .line 495
    invoke-static {v5, v0, v6}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛲᲈᛱ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    goto :goto_c

    .line 500
    :cond_14
    instance-of v9, v1, Lyyds/ᛴᛲᛶᛶ;

    .line 501
    .line 502
    if-eqz v9, :cond_1a

    .line 503
    .line 504
    new-instance v9, Ljava/lang/StringBuilder;

    .line 505
    .line 506
    const-string v10, "No field found matching the condition for current class"

    .line 507
    .line 508
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    :goto_c
    iget v2, v2, Lyyds/ᛴᛸᛲᛳ;->ᲇᲈᛵᛷ:I

    .line 531
    .line 532
    const/4 v5, 0x1

    .line 533
    if-ne v2, v5, :cond_18

    .line 534
    .line 535
    const-string v2, "\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.0.3 ======\n"

    .line 536
    .line 537
    if-nez v3, :cond_17

    .line 538
    .line 539
    instance-of v3, v1, Lyyds/ᛱᛷᲁᛴ;

    .line 540
    .line 541
    if-nez v3, :cond_16

    .line 542
    .line 543
    instance-of v3, v1, Lyyds/ᛴᛲᛶᛶ;

    .line 544
    .line 545
    if-nez v3, :cond_15

    .line 546
    .line 547
    invoke-static {v1, v4}, Lyyds/ᛱᛸᛶᛲ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    return-void

    .line 551
    :cond_15
    new-instance v1, Ljava/lang/NoSuchFieldException;

    .line 552
    .line 553
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    invoke-direct {v1, v0}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    goto :goto_d

    .line 561
    :cond_16
    new-instance v1, Ljava/lang/NoSuchMethodException;

    .line 562
    .line 563
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    invoke-direct {v1, v0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    goto :goto_d

    .line 571
    :cond_17
    new-instance v1, Ljava/lang/NoSuchMethodException;

    .line 572
    .line 573
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    invoke-direct {v1, v0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    :goto_d
    throw v1

    .line 581
    :cond_18
    const/4 v1, 0x2

    .line 582
    if-ne v2, v1, :cond_19

    .line 583
    .line 584
    sget-object v1, Lyyds/ᲀᛵᛲᲁ;->ᛲᲈᲁ:Lyyds/ᛱᛲᛶᛱ;

    .line 585
    .line 586
    invoke-static {v0}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    const/4 v1, 0x0

    .line 595
    invoke-static {v0, v1}, Lyyds/ᲀᛵᛲᲁ;->ᛲᲈᲁ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 596
    .line 597
    .line 598
    :cond_19
    return-void

    .line 599
    :cond_1a
    invoke-static {v1, v4}, Lyyds/ᛱᛸᛶᛲ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    return-void
.end method

.method public static final ᲀᛲᛳᲀ(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p1}, Lyyds/ᛲᛶᲇ;->ᛵᛸᛸᛷ(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int/2addr p0, v0

    .line 6
    if-lez p0, :cond_0

    .line 7
    .line 8
    const-string v0, " "

    .line 9
    .line 10
    invoke-static {p0, v0}, Lyyds/ᛳᲀᲈᛷ;->ᛶᲈᛴᲈ(ILjava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_0
    return-object p1
.end method

.method public static ᲇᛱᛲ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Lyyds/ᛲᲈᲁᛱ;
    .locals 6

    .line 1
    new-instance v0, Lyyds/ᲇᛲᲇᛵ;

    .line 2
    .line 3
    const/4 v5, 0x2

    .line 4
    move-object v3, p1

    .line 5
    move-object v4, p2

    .line 6
    move-object v1, p3

    .line 7
    move-object v2, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Lyyds/ᲇᛲᲇᛵ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0}, Lyyds/ᛷᛴᛳᛶ;->ᲀᛲᛲᲇ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)Lyyds/ᛲᲈᲁᛱ;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static ᲇᲇᲇᛱ(Lyyds/ᛱᛷᲁᛴ;Lyyds/ᛴᛸᛲᛳ;)Ljava/util/List;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lyyds/ᛴᛸᛲᛳ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    array-length v3, v0

    .line 17
    move v4, v1

    .line 18
    :goto_0
    if-ge v4, v3, :cond_1

    .line 19
    .line 20
    aget-object v5, v0, v4

    .line 21
    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    goto :goto_2

    .line 30
    :cond_0
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_2
    new-instance v2, Lyyds/ᲈᛵᛵᛴ;

    .line 34
    .line 35
    invoke-direct {v2, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-static {v2}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    sget-object v3, Lyyds/ᲀᛵᛲᲁ;->ᛲᲈᲁ:Lyyds/ᛱᛲᛶᛱ;

    .line 45
    .line 46
    new-instance v3, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v4, "Failed to get declared constructors in "

    .line 49
    .line 50
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sget-object v4, Lyyds/ᛲᛶᲇ;->ᛲᲈᲁ:Lyyds/ᛴᛲᛷᛸ;

    .line 54
    .line 55
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v4, " because got an exception."

    .line 59
    .line 60
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {v3, v0}, Lyyds/ᲀᛵᛲᲁ;->ᛲᲈᲁ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    instance-of v0, v2, Lyyds/ᲈᛵᛵᛴ;

    .line 71
    .line 72
    const/4 v3, 0x0

    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    move-object v2, v3

    .line 76
    :cond_3
    check-cast v2, Ljava/util/List;

    .line 77
    .line 78
    if-nez v2, :cond_4

    .line 79
    .line 80
    sget-object v2, Lyyds/ᛸᲀᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛶᲈ;

    .line 81
    .line 82
    :cond_4
    new-instance v0, Lyyds/ᛳᛳᲀᲀ;

    .line 83
    .line 84
    const/4 v4, 0x1

    .line 85
    invoke-direct {v0, v4, v2}, Lyyds/ᛳᛳᲀᲀ;-><init>(ILjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v0, p0, p1}, Lyyds/ᛲᛶᲇ;->ᛲᲈᲁ(Lyyds/ᛳᛳᲀᲀ;Lyyds/ᲇᛴᲇᛶ;Lyyds/ᛴᛸᛲᛳ;)Lyyds/ᛲᲈᲁᛱ;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v0, p0, p1}, Lyyds/ᛲᛶᲇ;->ᛶᛷᛲᲁ(Lyyds/ᛲᲈᲁᛱ;Lyyds/ᲁᛳᛶᛶ;Lyyds/ᛴᛸᛲᛳ;)Lyyds/ᛲᲈᲁᛱ;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    const-class v0, Ljava/lang/reflect/Constructor;

    .line 97
    .line 98
    invoke-static {v0}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    const-class v5, Ljava/lang/reflect/Method;

    .line 103
    .line 104
    invoke-static {v5}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-virtual {v2, v5}, Lyyds/ᲁᛵᛴᲀ;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-eqz v5, :cond_5

    .line 113
    .line 114
    new-instance v0, Lyyds/ᲇᲀᲀᛶ;

    .line 115
    .line 116
    invoke-direct {v0, p1, v1}, Lyyds/ᲇᲀᲀᛶ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 117
    .line 118
    .line 119
    new-instance p1, Lyyds/ᛵᛶᲀᛶ;

    .line 120
    .line 121
    invoke-direct {p1, p0, v0}, Lyyds/ᛵᛶᲀᛶ;-><init>(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_5
    invoke-static {v0}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v2, v0}, Lyyds/ᲁᛵᛴᲀ;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_6

    .line 134
    .line 135
    new-instance v0, Lyyds/ᲇᲀᲀᛶ;

    .line 136
    .line 137
    invoke-direct {v0, p1, v4}, Lyyds/ᲇᲀᲀᛶ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 138
    .line 139
    .line 140
    new-instance p1, Lyyds/ᛵᛶᲀᛶ;

    .line 141
    .line 142
    invoke-direct {p1, p0, v0}, Lyyds/ᛵᛶᲀᛶ;-><init>(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_6
    const-class v0, Ljava/lang/reflect/Field;

    .line 147
    .line 148
    invoke-static {v0}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v2, v0}, Lyyds/ᲁᛵᛴᲀ;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_7

    .line 157
    .line 158
    new-instance v0, Lyyds/ᲇᲀᲀᛶ;

    .line 159
    .line 160
    const/4 v1, 0x2

    .line 161
    invoke-direct {v0, p1, v1}, Lyyds/ᲇᲀᲀᛶ;-><init>(Lyyds/ᛴᛸᛲᛳ;I)V

    .line 162
    .line 163
    .line 164
    new-instance p1, Lyyds/ᛵᛶᲀᛶ;

    .line 165
    .line 166
    invoke-direct {p1, p0, v0}, Lyyds/ᛵᛶᲀᛶ;-><init>(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 167
    .line 168
    .line 169
    :goto_3
    invoke-static {p1}, Lyyds/ᛷᛴᛳᛶ;->ᛲᛳᛴᛸ(Lyyds/ᛵᲈᛴᛷ;)Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    return-object p0

    .line 174
    :cond_7
    const-string p1, "Unsupported member type: "

    .line 175
    .line 176
    invoke-static {p0, p1}, Lyyds/ᛱᛸᛶᛲ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    return-object v3
.end method

.method public static ᲇᲈᛵᛷ([Ljava/lang/reflect/AnnotatedElement;)Ljava/util/List;
    .locals 8

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    move v3, v2

    .line 5
    :goto_0
    if-ge v2, v0, :cond_0

    .line 6
    .line 7
    aget-object v4, p0, v2

    .line 8
    .line 9
    invoke-interface {v4}, Ljava/lang/reflect/AnnotatedElement;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    array-length v4, v4

    .line 14
    add-int/2addr v3, v4

    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    if-nez v3, :cond_1

    .line 19
    .line 20
    sget-object p0, Lyyds/ᛸᲀᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛶᲈ;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-static {}, Lyyds/ᛷᛸ;->ᛲᛴᛳᛲ()Lyyds/ᲈᛱᛱᛴ;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    array-length v2, p0

    .line 28
    move v3, v1

    .line 29
    :goto_1
    if-ge v3, v2, :cond_3

    .line 30
    .line 31
    aget-object v4, p0, v3

    .line 32
    .line 33
    invoke-interface {v4}, Ljava/lang/reflect/AnnotatedElement;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    array-length v5, v4

    .line 38
    move v6, v1

    .line 39
    :goto_2
    if-ge v6, v5, :cond_2

    .line 40
    .line 41
    aget-object v7, v4, v6

    .line 42
    .line 43
    invoke-static {v7}, Lyyds/ᛳᛴᲁᲇ;->ᲀᛲᛳᲀ(Ljava/lang/annotation/Annotation;)Lyyds/ᲁᛵᛴᲀ;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-interface {v7}, Lyyds/ᲈᲇᛶᛷ;->ᛲᲈᲁ()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-virtual {v0, v7}, Lyyds/ᲈᛱᛱᛴ;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    add-int/lit8 v6, v6, 0x1

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {v0}, Lyyds/ᛷᛸ;->ᲇᲈᛵᛷ(Lyyds/ᲈᛱᛱᛴ;)Lyyds/ᲈᛱᛱᛴ;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method
