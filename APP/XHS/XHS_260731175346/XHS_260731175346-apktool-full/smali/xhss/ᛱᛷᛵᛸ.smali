.class public abstract Lxhss/ᛱᛷᛵᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᛶᛵᲇᛸ;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lxhss/ᛶᛵᲇᛸ;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lxhss/ᛱᛷᛵᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 9
    .line 10
    return-void
.end method

.method public static final ᛱᛱᛲᲇ(Ljava/lang/String;)I
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

.method public static final ᛳᲁᲇᛸ(Ljava/lang/String;I)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Lxhss/ᛱᛷᛵᛸ;->ᛱᛱᛲᲇ(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int/2addr p1, v0

    .line 6
    if-lez p1, :cond_0

    .line 7
    .line 8
    const-string v0, " "

    .line 9
    .line 10
    invoke-static {v0, p1}, Lxhss/ᛲᲈᛷᛸ;->ᲁᛷᲇᲇ(Ljava/lang/String;I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :cond_0
    return-object p0
.end method

.method public static ᛳᲈᲈᛲ(Ljava/lang/reflect/Member;)[Ljava/lang/annotation/Annotation;
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
    invoke-static {p0, v0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᲈᲈᛲ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public static ᛶᲇᲈᛸ(Lxhss/ᛵᛷᛴᲁ;Lxhss/ᛸᛵᲇᲈ;Ljava/lang/Class;Lxhss/ᛷᛴᛲᛲ;)Ljava/util/List;
    .locals 3

    .line 1
    sget-object v0, Lxhss/ᛵᛷᛶᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛷᛶᛱ;

    .line 2
    .line 3
    if-eqz p2, :cond_4

    .line 4
    .line 5
    const-class v1, Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {v1}, Lxhss/ᛳᛳᲀᲀ;->ᛷᛵᛵᲈ(Ljava/lang/Class;)Lxhss/ᛱᛸᛷᛸ;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v2}, Lxhss/ᛶᲈᛴᛲ;->ᲇᛸᛳᲁ(Lxhss/ᛱᛸᛷᛸ;)Ljava/lang/Class;

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
    invoke-interface {p3, p2}, Lxhss/ᛷᛴᛲᛲ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-boolean v1, p1, Lxhss/ᛸᛵᲇᲈ;->ᛳᲁᲇᛸ:Z

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
    invoke-static {p0, p1, p2, p3}, Lxhss/ᛱᛷᛵᛸ;->ᛶᲇᲈᛸ(Lxhss/ᛵᛷᛴᲁ;Lxhss/ᛸᛵᲇᲈ;Ljava/lang/Class;Lxhss/ᛷᛴᛲᛲ;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    invoke-static {p0, p1}, Lxhss/ᛱᛷᛵᛸ;->ᛸᛶᛴᲈ(Lxhss/ᛵᛷᛴᲁ;Lxhss/ᛸᛵᲇᲈ;)V

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
    invoke-static {p0, p1}, Lxhss/ᛱᛷᛵᛸ;->ᛸᛶᛴᲈ(Lxhss/ᛵᛷᛴᲁ;Lxhss/ᛸᛵᲇᲈ;)V

    .line 59
    .line 60
    .line 61
    return-object v0
.end method

.method public static ᛷᛴᛷᛱ(Ljava/util/Collection;Ljava/util/List;Lxhss/ᛸᛵᲇᲈ;)Z
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
    invoke-static {v1, p2, v4}, Lxhss/ᛱᛷᛵᛸ;->ᛸᛲᛷᛱ(Ljava/lang/Object;Lxhss/ᛸᛵᲇᲈ;Ljava/lang/String;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-class v4, Lxhss/ᲇᛱᲁᛸ;

    .line 42
    .line 43
    invoke-static {v4}, Lxhss/ᛳᛳᲀᲀ;->ᛷᛵᛵᲈ(Ljava/lang/Class;)Lxhss/ᛱᛸᛷᛸ;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-static {v5}, Lxhss/ᛶᲈᛴᛲ;->ᲇᛸᛳᲁ(Lxhss/ᛱᛸᛷᛸ;)Ljava/lang/Class;

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
    invoke-static {v1, v4}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-nez v4, :cond_2

    .line 60
    .line 61
    invoke-static {v0, v1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

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

.method public static ᛷᛵᛵᲈ(Lxhss/ᲈᛱᛱᲀ;Lxhss/ᛵᛷᛴᲁ;Lxhss/ᛸᛵᲇᲈ;)Lxhss/ᛶᲇᲇᛲ;
    .locals 4

    .line 1
    iget-object v0, p1, Lxhss/ᛵᛷᛴᲁ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Lxhss/ᲇᛵᲈᛵ;

    .line 4
    .line 5
    const/16 v2, 0x15

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lxhss/ᲇᛵᲈᛵ;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const-string v2, "name"

    .line 11
    .line 12
    invoke-static {p0, p2, v2, v0, v1}, Lxhss/ᛱᛷᛵᛸ;->ᲇᛸᛳᲁ(Lxhss/ᲁᛷᛴᲇ;Lxhss/ᛸᛵᲇᲈ;Ljava/lang/String;Ljava/lang/Object;Lxhss/ᛵᲇᛱᛴ;)Lxhss/ᛶᲇᲇᛲ;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance v0, Lxhss/ᲇᛵᲈᛵ;

    .line 17
    .line 18
    const/16 v1, 0x16

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lxhss/ᲇᛵᲈᛵ;-><init>(I)V

    .line 21
    .line 22
    .line 23
    const-string v1, "nameCondition"

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-static {p0, p2, v1, v2, v0}, Lxhss/ᛱᛷᛵᛸ;->ᲇᛸᛳᲁ(Lxhss/ᲁᛷᛴᲇ;Lxhss/ᛸᛵᲇᲈ;Ljava/lang/String;Ljava/lang/Object;Lxhss/ᛵᲇᛱᛴ;)Lxhss/ᛶᲇᲇᛲ;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget-object v0, p1, Lxhss/ᛵᛷᛴᲁ;->ᛳᲁᲇᛸ:Ljava/util/LinkedHashSet;

    .line 31
    .line 32
    new-instance v1, Lxhss/ᲇᛵᲈᛵ;

    .line 33
    .line 34
    const/16 v3, 0x17

    .line 35
    .line 36
    invoke-direct {v1, v3}, Lxhss/ᲇᛵᲈᛵ;-><init>(I)V

    .line 37
    .line 38
    .line 39
    const-string v3, "modifiers"

    .line 40
    .line 41
    invoke-static {p0, p2, v3, v0, v1}, Lxhss/ᛱᛷᛵᛸ;->ᲇᛸᛳᲁ(Lxhss/ᲁᛷᛴᲇ;Lxhss/ᛸᛵᲇᲈ;Ljava/lang/String;Ljava/lang/Object;Lxhss/ᛵᲇᛱᛴ;)Lxhss/ᛶᲇᲇᛲ;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iget-object v0, p1, Lxhss/ᛵᛷᛴᲁ;->ᲇᛴᲇᛵ:Ljava/util/LinkedHashSet;

    .line 46
    .line 47
    new-instance v1, Lxhss/ᲇᛵᲈᛵ;

    .line 48
    .line 49
    const/16 v3, 0x18

    .line 50
    .line 51
    invoke-direct {v1, v3}, Lxhss/ᲇᛵᲈᛵ;-><init>(I)V

    .line 52
    .line 53
    .line 54
    const-string v3, "modifiersNot"

    .line 55
    .line 56
    invoke-static {p0, p2, v3, v0, v1}, Lxhss/ᛱᛷᛵᛸ;->ᲇᛸᛳᲁ(Lxhss/ᲁᛷᛴᲇ;Lxhss/ᛸᛵᲇᲈ;Ljava/lang/String;Ljava/lang/Object;Lxhss/ᛵᲇᛱᛴ;)Lxhss/ᛶᲇᲇᛲ;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    new-instance v0, Lxhss/ᲇᛵᲈᛵ;

    .line 61
    .line 62
    const/16 v1, 0x19

    .line 63
    .line 64
    invoke-direct {v0, v1}, Lxhss/ᲇᛵᲈᛵ;-><init>(I)V

    .line 65
    .line 66
    .line 67
    const-string v1, "modifiersCondition"

    .line 68
    .line 69
    invoke-static {p0, p2, v1, v2, v0}, Lxhss/ᛱᛷᛵᛸ;->ᲇᛸᛳᲁ(Lxhss/ᲁᛷᛴᲇ;Lxhss/ᛸᛵᲇᲈ;Ljava/lang/String;Ljava/lang/Object;Lxhss/ᛵᲇᛱᛴ;)Lxhss/ᛶᲇᲇᛲ;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    new-instance v0, Lxhss/ᲇᛵᲈᛵ;

    .line 74
    .line 75
    const/16 v1, 0x1a

    .line 76
    .line 77
    invoke-direct {v0, v1}, Lxhss/ᲇᛵᲈᛵ;-><init>(I)V

    .line 78
    .line 79
    .line 80
    const-string v1, "isSynthetic"

    .line 81
    .line 82
    invoke-static {p0, p2, v1, v2, v0}, Lxhss/ᛱᛷᛵᛸ;->ᲇᛸᛳᲁ(Lxhss/ᲁᛷᛴᲇ;Lxhss/ᛸᛵᲇᲈ;Ljava/lang/String;Ljava/lang/Object;Lxhss/ᛵᲇᛱᛴ;)Lxhss/ᛶᲇᲇᛲ;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    new-instance v0, Lxhss/ᲇᛵᲈᛵ;

    .line 87
    .line 88
    const/16 v1, 0x1b

    .line 89
    .line 90
    invoke-direct {v0, v1}, Lxhss/ᲇᛵᲈᛵ;-><init>(I)V

    .line 91
    .line 92
    .line 93
    const-string v1, "isSyntheticNot"

    .line 94
    .line 95
    invoke-static {p0, p2, v1, v2, v0}, Lxhss/ᛱᛷᛵᛸ;->ᲇᛸᛳᲁ(Lxhss/ᲁᛷᛴᲇ;Lxhss/ᛸᛵᲇᲈ;Ljava/lang/String;Ljava/lang/Object;Lxhss/ᛵᲇᛱᛴ;)Lxhss/ᛶᲇᲇᛲ;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    iget-object v0, p1, Lxhss/ᛵᛷᛴᲁ;->ᛷᛴᛷᛱ:Ljava/util/LinkedHashSet;

    .line 100
    .line 101
    new-instance v1, Lxhss/ᛱᲀᲇᛵ;

    .line 102
    .line 103
    const/16 v3, 0xf

    .line 104
    .line 105
    invoke-direct {v1, p2, v3}, Lxhss/ᛱᲀᲇᛵ;-><init>(Lxhss/ᛸᛵᲇᲈ;I)V

    .line 106
    .line 107
    .line 108
    const-string v3, "annotations"

    .line 109
    .line 110
    invoke-static {p0, p2, v3, v0, v1}, Lxhss/ᛱᛷᛵᛸ;->ᲇᛸᛳᲁ(Lxhss/ᲁᛷᛴᲇ;Lxhss/ᛸᛵᲇᲈ;Ljava/lang/String;Ljava/lang/Object;Lxhss/ᛵᲇᛱᛴ;)Lxhss/ᛶᲇᲇᛲ;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    iget-object p1, p1, Lxhss/ᛵᛷᛴᲁ;->ᲇᛶᛴᲀ:Ljava/util/LinkedHashSet;

    .line 115
    .line 116
    new-instance v0, Lxhss/ᛱᲀᲇᛵ;

    .line 117
    .line 118
    const/16 v1, 0x10

    .line 119
    .line 120
    invoke-direct {v0, p2, v1}, Lxhss/ᛱᲀᲇᛵ;-><init>(Lxhss/ᛸᛵᲇᲈ;I)V

    .line 121
    .line 122
    .line 123
    const-string v1, "annotationsNot"

    .line 124
    .line 125
    invoke-static {p0, p2, v1, p1, v0}, Lxhss/ᛱᛷᛵᛸ;->ᲇᛸᛳᲁ(Lxhss/ᲁᛷᛴᲇ;Lxhss/ᛸᛵᲇᲈ;Ljava/lang/String;Ljava/lang/Object;Lxhss/ᛵᲇᛱᛴ;)Lxhss/ᛶᲇᲇᛲ;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    new-instance p1, Lxhss/ᲇᛵᲈᛵ;

    .line 130
    .line 131
    const/16 v0, 0x1c

    .line 132
    .line 133
    invoke-direct {p1, v0}, Lxhss/ᲇᛵᲈᛵ;-><init>(I)V

    .line 134
    .line 135
    .line 136
    const-string v0, "genericString"

    .line 137
    .line 138
    invoke-static {p0, p2, v0, v2, p1}, Lxhss/ᛱᛷᛵᛸ;->ᲇᛸᛳᲁ(Lxhss/ᲁᛷᛴᲇ;Lxhss/ᛸᛵᲇᲈ;Ljava/lang/String;Ljava/lang/Object;Lxhss/ᛵᲇᛱᛴ;)Lxhss/ᛶᲇᲇᛲ;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    return-object p0
.end method

.method public static final ᛷᲁᲁ(Lxhss/ᛸᛵᲇᲈ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z
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
    invoke-static {p2}, Lxhss/ᛱᛷᛵᛸ;->ᲇᛴᲇᛵ([Ljava/lang/reflect/AnnotatedElement;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-static {p1, p2, p0}, Lxhss/ᛱᛷᛵᛸ;->ᛷᛴᛷᛱ(Ljava/util/Collection;Ljava/util/List;Lxhss/ᛸᛵᲇᲈ;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public static ᛸᛲᛷᛱ(Ljava/lang/Object;Lxhss/ᛸᛵᲇᲈ;Ljava/lang/String;)Ljava/lang/Class;
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
    instance-of v0, p0, Lxhss/ᛱᛸᛷᛸ;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Lxhss/ᛱᛸᛷᛸ;

    .line 13
    .line 14
    check-cast p0, Lxhss/ᛲᛵᲀᲈ;

    .line 15
    .line 16
    invoke-interface {p0}, Lxhss/ᛲᛵᲀᲈ;->ᛷᛵᛵᲈ()Ljava/lang/Class;

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
    iget v0, p1, Lxhss/ᛸᛵᲇᲈ;->ᲇᛴᲇᛵ:I

    .line 26
    .line 27
    iget-object p1, p1, Lxhss/ᛸᛵᲇᲈ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

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
    invoke-static {p0, p1, v1}, Lxhss/ᛱᛳᛵᛳ;->ᛱᛱᛲᲇ(Ljava/lang/String;Ljava/lang/ClassLoader;I)Ljava/lang/Class;

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
    invoke-static {p0, p1, v1}, Lxhss/ᛱᛳᛵᛳ;->ᛳᲁᲇᛸ(Ljava/lang/String;Ljava/lang/ClassLoader;I)Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-nez p0, :cond_5

    .line 55
    .line 56
    const-class p0, Lxhss/ᛶᲈᛴᛲ;

    .line 57
    .line 58
    invoke-static {p0}, Lxhss/ᛳᛳᲀᲀ;->ᛷᛵᛵᲈ(Ljava/lang/Class;)Lxhss/ᛱᛸᛷᛸ;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p1}, Lxhss/ᛶᲈᛴᛲ;->ᲇᛸᛳᲁ(Lxhss/ᛱᛸᛷᛸ;)Ljava/lang/Class;

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
    instance-of p1, p0, Lxhss/ᲇᛱᲁᛸ;

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
    const-class p1, Lxhss/ᲇᛱᲁᛸ;

    .line 80
    .line 81
    invoke-static {p1}, Lxhss/ᛳᛳᲀᲀ;->ᛷᛵᛵᲈ(Ljava/lang/Class;)Lxhss/ᛱᛸᛷᛸ;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, Lxhss/ᛶᲈᛴᛲ;->ᲇᛸᛳᲁ(Lxhss/ᛱᛸᛷᛸ;)Ljava/lang/Class;

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
    invoke-static {p0, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

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

.method public static final ᛸᛲᲀᛵ(Lxhss/ᛸᛵᲇᲈ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z
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
    invoke-static {v3}, Lxhss/ᛶᲈᛴᛲ;->ᲈᛳᲀ(Ljava/lang/annotation/Annotation;)Lxhss/ᛱᛸᛷᛸ;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v3}, Lxhss/ᛲᛵᲀᲈ;->ᛷᛵᛵᲈ()Ljava/lang/Class;

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
    invoke-static {p1, v0, p0}, Lxhss/ᛱᛷᛵᛸ;->ᛷᛴᛷᛱ(Ljava/util/Collection;Ljava/util/List;Lxhss/ᛸᛵᲇᲈ;)Z

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

.method public static final ᛸᛴᛶᛳ(Lxhss/ᛸᛵᲇᲈ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z
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
    invoke-static {v3}, Lxhss/ᛶᲈᛴᛲ;->ᲈᛳᲀ(Ljava/lang/annotation/Annotation;)Lxhss/ᛱᛸᛷᛸ;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v3}, Lxhss/ᛲᛵᲀᲈ;->ᛷᛵᛵᲈ()Ljava/lang/Class;

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
    invoke-static {p1, v0, p0}, Lxhss/ᛱᛷᛵᛸ;->ᛷᛴᛷᛱ(Ljava/util/Collection;Ljava/util/List;Lxhss/ᛸᛵᲇᲈ;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0
.end method

.method public static ᛸᛶᛴᲈ(Lxhss/ᛵᛷᛴᲁ;Lxhss/ᛸᛵᲇᲈ;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v0, "\n"

    .line 6
    .line 7
    const-string v3, " (Kotlin reflection is not available)"

    .line 8
    .line 9
    iget-boolean v4, v2, Lxhss/ᛸᛵᲇᲈ;->ᛳᲁᲇᛸ:Z

    .line 10
    .line 11
    iget-object v5, v2, Lxhss/ᛸᛵᲇᲈ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

    .line 12
    .line 13
    const-string v6, ""

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    const-string v7, " (Also tried for superclass)"

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v7, v6

    .line 21
    :goto_0
    if-nez v4, :cond_1

    .line 22
    .line 23
    const-string v4, "Members in superclass are not reflected in the current class, you can try adding superclass() in your condition and try again. "

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const-string v4, "Check if the conditions are correct and valid, and try again. "

    .line 27
    .line 28
    :goto_1
    const-string v8, "-+"

    .line 29
    .line 30
    const-string v9, "+-"

    .line 31
    .line 32
    const-string v10, "-"

    .line 33
    .line 34
    :try_start_0
    invoke-virtual {v1}, Lxhss/ᛵᛷᛴᲁ;->ᛷᛵᛵᲈ()Ljava/util/Map;

    .line 35
    .line 36
    .line 37
    move-result-object v12

    .line 38
    new-instance v13, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-interface {v12}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 44
    .line 45
    .line 46
    move-result-object v12

    .line 47
    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v12

    .line 51
    :cond_2
    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v14

    .line 55
    if-eqz v14, :cond_9

    .line 56
    .line 57
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v14

    .line 61
    check-cast v14, Ljava/util/Map$Entry;

    .line 62
    .line 63
    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v15

    .line 67
    check-cast v15, Ljava/lang/String;

    .line 68
    .line 69
    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v14

    .line 73
    if-nez v14, :cond_3

    .line 74
    .line 75
    :goto_3
    const/4 v11, 0x0

    .line 76
    goto :goto_4

    .line 77
    :cond_3
    instance-of v11, v14, Lxhss/ᲁᛳᲀᛴ;

    .line 78
    .line 79
    if-eqz v11, :cond_4

    .line 80
    .line 81
    const-string v11, "(Runtime Condition)"

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    move-object/from16 v16, v5

    .line 86
    .line 87
    goto/16 :goto_9

    .line 88
    .line 89
    :cond_4
    instance-of v11, v14, Ljava/util/Collection;

    .line 90
    .line 91
    if-eqz v11, :cond_6

    .line 92
    .line 93
    move-object v11, v14

    .line 94
    check-cast v11, Ljava/util/Collection;

    .line 95
    .line 96
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    if-eqz v11, :cond_5

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_5
    invoke-static {v14}, Lxhss/ᲇᛱᲁᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v11

    .line 107
    goto :goto_4

    .line 108
    :cond_6
    invoke-static {v14}, Lxhss/ᲇᛱᲁᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v11

    .line 112
    :goto_4
    if-eqz v11, :cond_7

    .line 113
    .line 114
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    invoke-static {v11, v3, v6}, Lxhss/ᛲᲈᛷᛸ;->ᛴᲀᛸᛵ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    goto :goto_5

    .line 123
    :cond_7
    const/4 v11, 0x0

    .line 124
    :goto_5
    if-eqz v11, :cond_8

    .line 125
    .line 126
    new-instance v14, Lxhss/ᲀᛴᛳᛸ;

    .line 127
    .line 128
    invoke-direct {v14, v15, v11}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_8
    const/4 v14, 0x0

    .line 133
    :goto_6
    if-eqz v14, :cond_2

    .line 134
    .line 135
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_9
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result v11

    .line 143
    if-eqz v11, :cond_a

    .line 144
    .line 145
    invoke-virtual {v5}, Ljava/lang/Class;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    move-object/from16 v16, v5

    .line 150
    .line 151
    goto/16 :goto_a

    .line 152
    .line 153
    :cond_a
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v11

    .line 157
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v12

    .line 161
    if-eqz v12, :cond_11

    .line 162
    .line 163
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v12

    .line 167
    check-cast v12, Lxhss/ᲀᛴᛳᛸ;

    .line 168
    .line 169
    iget-object v12, v12, Lxhss/ᲀᛴᛳᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v12, Ljava/lang/String;

    .line 172
    .line 173
    invoke-static {v12}, Lxhss/ᛱᛷᛵᛸ;->ᛱᛱᛲᲇ(Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    move-result v12

    .line 177
    :cond_b
    :goto_7
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v14

    .line 181
    if-eqz v14, :cond_c

    .line 182
    .line 183
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v14

    .line 187
    check-cast v14, Lxhss/ᲀᛴᛳᛸ;

    .line 188
    .line 189
    iget-object v14, v14, Lxhss/ᲀᛴᛳᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v14, Ljava/lang/String;

    .line 192
    .line 193
    invoke-static {v14}, Lxhss/ᛱᛷᛵᛸ;->ᛱᛱᛲᲇ(Ljava/lang/String;)I

    .line 194
    .line 195
    .line 196
    move-result v14

    .line 197
    if-ge v12, v14, :cond_b

    .line 198
    .line 199
    move v12, v14

    .line 200
    goto :goto_7

    .line 201
    :cond_c
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v11

    .line 205
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v14

    .line 209
    if-eqz v14, :cond_10

    .line 210
    .line 211
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v14

    .line 215
    check-cast v14, Lxhss/ᲀᛴᛳᛸ;

    .line 216
    .line 217
    iget-object v14, v14, Lxhss/ᲀᛴᛳᛸ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v14, Ljava/lang/String;

    .line 220
    .line 221
    invoke-static {v14}, Lxhss/ᛱᛷᛵᛸ;->ᛱᛱᛲᲇ(Ljava/lang/String;)I

    .line 222
    .line 223
    .line 224
    move-result v14

    .line 225
    :cond_d
    :goto_8
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 226
    .line 227
    .line 228
    move-result v15

    .line 229
    if-eqz v15, :cond_e

    .line 230
    .line 231
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v15

    .line 235
    check-cast v15, Lxhss/ᲀᛴᛳᛸ;

    .line 236
    .line 237
    iget-object v15, v15, Lxhss/ᲀᛴᛳᛸ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v15, Ljava/lang/String;

    .line 240
    .line 241
    invoke-static {v15}, Lxhss/ᛱᛷᛵᛸ;->ᛱᛱᛲᲇ(Ljava/lang/String;)I

    .line 242
    .line 243
    .line 244
    move-result v15

    .line 245
    if-ge v14, v15, :cond_d

    .line 246
    .line 247
    move v14, v15

    .line 248
    goto :goto_8

    .line 249
    :cond_e
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v11

    .line 253
    invoke-static {v11, v3, v6}, Lxhss/ᛲᲈᛷᛸ;->ᛴᲀᛸᛵ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v11

    .line 257
    invoke-static {v11}, Lxhss/ᛱᛷᛵᛸ;->ᛱᛱᛲᲇ(Ljava/lang/String;)I

    .line 258
    .line 259
    .line 260
    move-result v15

    .line 261
    add-int v16, v12, v14

    .line 262
    .line 263
    add-int/lit8 v16, v16, 0x3

    .line 264
    .line 265
    sub-int v15, v15, v16

    .line 266
    .line 267
    if-gez v15, :cond_f

    .line 268
    .line 269
    const/4 v15, 0x0

    .line 270
    :cond_f
    add-int/2addr v14, v15

    .line 271
    invoke-static {v10, v12}, Lxhss/ᛲᲈᛷᛸ;->ᲁᛷᲇᲇ(Ljava/lang/String;I)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 275
    move-object/from16 v16, v5

    .line 276
    .line 277
    :try_start_1
    invoke-static {v10, v14}, Lxhss/ᛲᲈᛷᛸ;->ᲁᛷᲇᲇ(Ljava/lang/String;I)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    new-instance v2, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    const-string v15, "-+-"

    .line 293
    .line 294
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    add-int v5, v12, v14

    .line 308
    .line 309
    add-int/lit8 v5, v5, 0x3

    .line 310
    .line 311
    invoke-static {v10, v5}, Lxhss/ᛲᲈᛷᛸ;->ᲁᛷᲇᲇ(Ljava/lang/String;I)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v10

    .line 315
    new-instance v15, Ljava/lang/StringBuilder;

    .line 316
    .line 317
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v8

    .line 333
    invoke-static {v11, v5}, Lxhss/ᛱᛷᛵᛸ;->ᛳᲁᲇᛸ(Ljava/lang/String;I)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    new-instance v9, Ljava/lang/StringBuilder;

    .line 338
    .line 339
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 340
    .line 341
    .line 342
    const-string v10, "| "

    .line 343
    .line 344
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    const-string v5, " |"

    .line 351
    .line 352
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v5

    .line 359
    new-instance v9, Lxhss/ᛴᲇᲁᲀ;

    .line 360
    .line 361
    invoke-direct {v9, v12, v14}, Lxhss/ᛴᲇᲁᲀ;-><init>(II)V

    .line 362
    .line 363
    .line 364
    const/16 v10, 0x1e

    .line 365
    .line 366
    invoke-static {v13, v0, v9, v10}, Lxhss/ᛷᲇᛵᛳ;->ᛴᲀᛸᛵ(Ljava/util/Collection;Ljava/lang/String;Lxhss/ᛷᛴᛲᛲ;I)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v9

    .line 370
    filled-new-array {v8, v5, v2, v9, v2}, [Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    invoke-static {v2}, Lxhss/ᛱᲀᛷᛳ;->ᲁᲁᛴᲁ([Ljava/lang/Object;)Ljava/util/List;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    const/16 v5, 0x3e

    .line 379
    .line 380
    const/4 v8, 0x0

    .line 381
    invoke-static {v2, v0, v8, v5}, Lxhss/ᛷᲇᛵᛳ;->ᛴᲀᛸᛵ(Ljava/util/Collection;Ljava/lang/String;Lxhss/ᛷᛴᛲᛲ;I)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    goto :goto_a

    .line 386
    :catchall_1
    move-exception v0

    .line 387
    goto :goto_9

    .line 388
    :cond_10
    move-object/from16 v16, v5

    .line 389
    .line 390
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 391
    .line 392
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 393
    .line 394
    .line 395
    throw v0

    .line 396
    :cond_11
    move-object/from16 v16, v5

    .line 397
    .line 398
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 399
    .line 400
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 401
    .line 402
    .line 403
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 404
    :goto_9
    new-instance v2, Lxhss/ᲈᛳᛱᲇ;

    .line 405
    .line 406
    invoke-direct {v2, v0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 407
    .line 408
    .line 409
    move-object v0, v2

    .line 410
    :goto_a
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    invoke-static {v2, v3, v6}, Lxhss/ᛲᲈᛷᛸ;->ᛴᲀᛸᛵ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    const-string v3, "\nFailed to build condition table."

    .line 419
    .line 420
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    instance-of v3, v0, Lxhss/ᲈᛳᛱᲇ;

    .line 425
    .line 426
    if-eqz v3, :cond_12

    .line 427
    .line 428
    move-object v0, v2

    .line 429
    :cond_12
    check-cast v0, Ljava/lang/String;

    .line 430
    .line 431
    instance-of v2, v1, Lxhss/ᛷᛴᲀᛳ;

    .line 432
    .line 433
    const-string v3, "Unsupported condition type: "

    .line 434
    .line 435
    const-string v5, "\nSuggestion: "

    .line 436
    .line 437
    const-string v6, ".\n"

    .line 438
    .line 439
    if-eqz v2, :cond_13

    .line 440
    .line 441
    new-instance v8, Ljava/lang/StringBuilder;

    .line 442
    .line 443
    const-string v9, "No method found matching the condition for current class"

    .line 444
    .line 445
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    :goto_b
    move-object/from16 v4, p1

    .line 468
    .line 469
    goto :goto_c

    .line 470
    :cond_13
    instance-of v8, v1, Lxhss/ᛵᛸᲈᛲ;

    .line 471
    .line 472
    if-eqz v8, :cond_18

    .line 473
    .line 474
    new-instance v8, Ljava/lang/StringBuilder;

    .line 475
    .line 476
    const-string v9, "No field found matching the condition for current class"

    .line 477
    .line 478
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    goto :goto_b

    .line 501
    :goto_c
    iget v4, v4, Lxhss/ᛸᛵᲇᲈ;->ᲇᛴᲇᛵ:I

    .line 502
    .line 503
    const/4 v5, 0x1

    .line 504
    if-ne v4, v5, :cond_16

    .line 505
    .line 506
    const-string v4, "\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.0.3 ======\n"

    .line 507
    .line 508
    if-nez v2, :cond_15

    .line 509
    .line 510
    instance-of v2, v1, Lxhss/ᛵᛸᲈᛲ;

    .line 511
    .line 512
    if-nez v2, :cond_14

    .line 513
    .line 514
    invoke-static {v1, v3}, Lxhss/ᛵᲈᲁᲈ;->ᛳᲈᲈᛲ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    return-void

    .line 518
    :cond_14
    new-instance v1, Ljava/lang/NoSuchFieldException;

    .line 519
    .line 520
    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    invoke-direct {v1, v0}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    goto :goto_d

    .line 528
    :cond_15
    new-instance v1, Ljava/lang/NoSuchMethodException;

    .line 529
    .line 530
    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    invoke-direct {v1, v0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    :goto_d
    throw v1

    .line 538
    :cond_16
    const/4 v1, 0x2

    .line 539
    if-ne v4, v1, :cond_17

    .line 540
    .line 541
    sget-object v1, Lxhss/ᲁᛴᛱᛱ;->ᛷᛵᛵᲈ:Lxhss/ᛴᛷᛱ;

    .line 542
    .line 543
    invoke-static {v0}, Lxhss/ᛲᛱᛲᲀ;->ᛵᛳᛸᲇ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    const/4 v8, 0x0

    .line 552
    invoke-static {v0, v8}, Lxhss/ᲁᛴᛱᛱ;->ᛷᛵᛵᲈ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 553
    .line 554
    .line 555
    :cond_17
    return-void

    .line 556
    :cond_18
    invoke-static {v1, v3}, Lxhss/ᛵᲈᲁᲈ;->ᛳᲈᲈᛲ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 557
    .line 558
    .line 559
    return-void
.end method

.method public static final ᛸᛶᲈᛶ(Lxhss/ᛸᛵᲇᲈ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z
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
    invoke-static {p2}, Lxhss/ᛱᛷᛵᛸ;->ᲇᛴᲇᛵ([Ljava/lang/reflect/AnnotatedElement;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-static {p1, p2, p0}, Lxhss/ᛱᛷᛵᛸ;->ᛷᛴᛷᛱ(Ljava/util/Collection;Ljava/util/List;Lxhss/ᛸᛵᲇᲈ;)Z

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

.method public static final ᛸᛷᲈᲈ(Lxhss/ᛸᛵᲇᲈ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z
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
    invoke-static {p2}, Lxhss/ᛱᛷᛵᛸ;->ᲇᛴᲇᛵ([Ljava/lang/reflect/AnnotatedElement;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-static {p1, p2, p0}, Lxhss/ᛱᛷᛵᛸ;->ᛷᛴᛷᛱ(Ljava/util/Collection;Ljava/util/List;Lxhss/ᛸᛵᲇᲈ;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public static final ᲀᲇᛳᲁ(Lxhss/ᛸᛵᲇᲈ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z
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
    invoke-static {v3}, Lxhss/ᛶᲈᛴᛲ;->ᲈᛳᲀ(Ljava/lang/annotation/Annotation;)Lxhss/ᛱᛸᛷᛸ;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v3}, Lxhss/ᛲᛵᲀᲈ;->ᛷᛵᛵᲈ()Ljava/lang/Class;

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
    invoke-static {p1, v0, p0}, Lxhss/ᛱᛷᛵᛸ;->ᛷᛴᛷᛱ(Ljava/util/Collection;Ljava/util/List;Lxhss/ᛸᛵᲇᲈ;)Z

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

.method public static ᲇᛴᲇᛵ([Ljava/lang/reflect/AnnotatedElement;)Ljava/util/List;
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
    sget-object p0, Lxhss/ᛵᛷᛶᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛷᛶᛱ;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    new-instance v0, Lxhss/ᲈᛶᲀᲈ;

    .line 24
    .line 25
    const/16 v2, 0xa

    .line 26
    .line 27
    invoke-direct {v0, v2}, Lxhss/ᲈᛶᲀᲈ;-><init>(I)V

    .line 28
    .line 29
    .line 30
    array-length v2, p0

    .line 31
    move v3, v1

    .line 32
    :goto_1
    if-ge v3, v2, :cond_3

    .line 33
    .line 34
    aget-object v4, p0, v3

    .line 35
    .line 36
    invoke-interface {v4}, Ljava/lang/reflect/AnnotatedElement;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    array-length v5, v4

    .line 41
    move v6, v1

    .line 42
    :goto_2
    if-ge v6, v5, :cond_2

    .line 43
    .line 44
    aget-object v7, v4, v6

    .line 45
    .line 46
    invoke-static {v7}, Lxhss/ᛶᲈᛴᛲ;->ᲈᛳᲀ(Ljava/lang/annotation/Annotation;)Lxhss/ᛱᛸᛷᛸ;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    invoke-interface {v7}, Lxhss/ᛲᛵᲀᲈ;->ᛷᛵᛵᲈ()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-virtual {v0, v7}, Lxhss/ᲈᛶᲀᲈ;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    add-int/lit8 v6, v6, 0x1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-virtual {v0}, Lxhss/ᲈᛶᲀᲈ;->ᲇᛶᛴᲀ()V

    .line 64
    .line 65
    .line 66
    const/4 p0, 0x1

    .line 67
    iput-boolean p0, v0, Lxhss/ᲈᛶᲀᲈ;->ᲇᛴᲇᛵ:Z

    .line 68
    .line 69
    iget p0, v0, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 70
    .line 71
    if-lez p0, :cond_4

    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_4
    sget-object p0, Lxhss/ᲈᛶᲀᲈ;->ᛷᛴᛷᛱ:Lxhss/ᲈᛶᲀᲈ;

    .line 75
    .line 76
    return-object p0
.end method

.method public static final ᲇᛶᛴᲀ(Lxhss/ᛸᛵᲇᲈ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z
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
    invoke-static {v3}, Lxhss/ᛶᲈᛴᛲ;->ᲈᛳᲀ(Ljava/lang/annotation/Annotation;)Lxhss/ᛱᛸᛷᛸ;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v3}, Lxhss/ᛲᛵᲀᲈ;->ᛷᛵᛵᲈ()Ljava/lang/Class;

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
    invoke-static {p1, v0, p0}, Lxhss/ᛱᛷᛵᛸ;->ᛷᛴᛷᛱ(Ljava/util/Collection;Ljava/util/List;Lxhss/ᛸᛵᲇᲈ;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0
.end method

.method public static ᲇᛸᛳᲁ(Lxhss/ᲁᛷᛴᲇ;Lxhss/ᛸᛵᲇᲈ;Ljava/lang/String;Ljava/lang/Object;Lxhss/ᛵᲇᛱᛴ;)Lxhss/ᛶᲇᲇᛲ;
    .locals 6

    .line 1
    new-instance v0, Lxhss/ᛴᲁᲀᲁ;

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    move-object v3, p1

    .line 5
    move-object v4, p2

    .line 6
    move-object v1, p3

    .line 7
    move-object v2, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Lxhss/ᛴᲁᲀᲁ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Lxhss/ᛶᲇᲇᛲ;

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    invoke-direct {p1, p0, p2, v0}, Lxhss/ᛶᲇᲇᛲ;-><init>(Lxhss/ᲁᛷᛴᲇ;ZLxhss/ᛷᛴᛲᛲ;)V

    .line 15
    .line 16
    .line 17
    return-object p1
.end method

.method public static final ᲈᛳᲀ(Lxhss/ᛸᛵᲇᲈ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z
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
    invoke-static {p2}, Lxhss/ᛱᛷᛵᛸ;->ᲇᛴᲇᛵ([Ljava/lang/reflect/AnnotatedElement;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-static {p1, p2, p0}, Lxhss/ᛱᛷᛵᛸ;->ᛷᛴᛷᛱ(Ljava/util/Collection;Ljava/util/List;Lxhss/ᛸᛵᲇᲈ;)Z

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
