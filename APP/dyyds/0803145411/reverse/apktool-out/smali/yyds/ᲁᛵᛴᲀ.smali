.class public final Lyyds/ᲁᛵᛴᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲈᲇᛶᛷ;


# static fields
.field public static final ᛵᛸᛸᛷ:Ljava/util/Map;


# instance fields
.field public final ᛲᲈᲁ:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 24

    .line 1
    const-class v22, Lyyds/ᲇᲀᛶᲀ;

    .line 2
    .line 3
    const-class v23, Lyyds/ᛳᲈᛸᲁ;

    .line 4
    .line 5
    const-class v1, Lyyds/ᲁᛶᲁᲀ;

    .line 6
    .line 7
    const-class v2, Lyyds/ᛷᛴᲈᲀ;

    .line 8
    .line 9
    const-class v3, Lyyds/ᛲᲇᲁᛴ;

    .line 10
    .line 11
    const-class v4, Lyyds/ᛲᛲᲀᛷ;

    .line 12
    .line 13
    const-class v5, Lyyds/ᛷᛴᛷᲈ;

    .line 14
    .line 15
    const-class v6, Lyyds/ᛵᲁᛱᛶ;

    .line 16
    .line 17
    const-class v7, Lyyds/ᛵᲁᲈᲈ;

    .line 18
    .line 19
    const-class v8, Lyyds/ᛶᛳᛴᛴ;

    .line 20
    .line 21
    const-class v9, Lyyds/ᲁᲇᲀᛳ;

    .line 22
    .line 23
    const-class v10, Lyyds/ᲈᲀᛳᛴ;

    .line 24
    .line 25
    const-class v11, Lyyds/ᛵᛱᲁᛸ;

    .line 26
    .line 27
    const-class v12, Lyyds/ᛱᛷᲀᲀ;

    .line 28
    .line 29
    const-class v13, Lyyds/ᛶᛴᛶᲈ;

    .line 30
    .line 31
    const-class v14, Lyyds/ᲇᛳᛶᲈ;

    .line 32
    .line 33
    const-class v15, Lyyds/ᛳᛸᛴᛴ;

    .line 34
    .line 35
    const-class v16, Lyyds/ᛲᛷᲁᛵ;

    .line 36
    .line 37
    const-class v17, Lyyds/ᲀᲈᛶᛳ;

    .line 38
    .line 39
    const-class v18, Lyyds/ᲈᛱᛷᛲ;

    .line 40
    .line 41
    const-class v19, Lyyds/ᛷᛴᛲᲈ;

    .line 42
    .line 43
    const-class v20, Lyyds/ᲈᲇᛲᲈ;

    .line 44
    .line 45
    const-class v21, Lyyds/ᛵᛳᛳᲇ;

    .line 46
    .line 47
    filled-new-array/range {v1 .. v23}, [Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Lyyds/ᲈᛸᲁᛶ;->ᲇᛱᛲ([Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    new-instance v1, Ljava/util/ArrayList;

    .line 56
    .line 57
    const/16 v2, 0xa

    .line 58
    .line 59
    invoke-static {v0, v2}, Lyyds/ᛱᛱᛵᛲ;->ᛳᛸᛴᛶ(Ljava/lang/Iterable;I)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const/4 v2, 0x0

    .line 71
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_1

    .line 76
    .line 77
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    add-int/lit8 v4, v2, 0x1

    .line 82
    .line 83
    if-ltz v2, :cond_0

    .line 84
    .line 85
    check-cast v3, Ljava/lang/Class;

    .line 86
    .line 87
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    new-instance v5, Lkotlin/Pair;

    .line 92
    .line 93
    invoke-direct {v5, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move v2, v4

    .line 100
    goto :goto_0

    .line 101
    :cond_0
    invoke-static {}, Lyyds/ᲈᛸᲁᛶ;->ᲀᛲᛲᲇ()V

    .line 102
    .line 103
    .line 104
    const/4 v0, 0x0

    .line 105
    throw v0

    .line 106
    :cond_1
    invoke-static {v1}, Lyyds/ᲁᲈᛶᛴ;->ᛵᲀᲈᛴ(Ljava/util/List;)Ljava/util/Map;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    sput-object v0, Lyyds/ᲁᛵᛴᲀ;->ᛵᛸᛸᛷ:Ljava/util/Map;

    .line 111
    .line 112
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲁᛵᛴᲀ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lyyds/ᲁᛵᛴᲀ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lyyds/ᛳᛴᲁᲇ;->ᲇᲈᛵᛷ(Lyyds/ᲁᛵᛴᲀ;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p1, Lyyds/ᲁᛵᛴᲀ;

    .line 10
    .line 11
    invoke-static {p1}, Lyyds/ᛳᛴᲁᲇ;->ᲇᲈᛵᛷ(Lyyds/ᲁᛵᛴᲀ;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    invoke-static {p0}, Lyyds/ᛳᛴᲁᲇ;->ᲇᲈᛵᛷ(Lyyds/ᲁᛵᛴᲀ;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᲁᛵᛴᲀ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Class;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p0, " (Kotlin reflection is not available)"

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final ᛲᲈᲁ()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲁᛵᛴᲀ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lyyds/ᲁᛵᛴᲀ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->isLocalClass()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    :goto_0
    return-object v1

    .line 18
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_4

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Lyyds/ᛷᛴᲇᛲ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    const-string v0, "Array"

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    :cond_2
    if-nez v1, :cond_3

    .line 51
    .line 52
    const-string p0, "kotlin.Array"

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_3
    return-object v1

    .line 56
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Lyyds/ᛷᛴᲇᛲ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-nez v0, :cond_5

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :cond_5
    return-object v0
.end method

.method public final ᲀᛲᛳᲀ(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᲁᛵᛴᲀ;->ᛵᛸᛸᛷ:Ljava/util/Map;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᲁᛵᛴᲀ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Integer;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p0, p1}, Lyyds/ᛲᛷᛵᲇ;->ᛷᛲᲈᛱ(ILjava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-static {p0}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Lyyds/ᛳᛴᲁᲇ;->ᲇᲈᛵᛷ(Lyyds/ᲁᛵᛴᲀ;)Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    return p0
.end method
