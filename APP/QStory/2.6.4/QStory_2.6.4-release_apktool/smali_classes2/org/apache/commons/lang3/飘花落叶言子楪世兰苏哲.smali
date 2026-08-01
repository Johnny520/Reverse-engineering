.class public abstract Lorg/apache/commons/lang3/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:[Ljava/lang/reflect/Type;

.field public static final 飘花落叶言子楪世哲苏兰:[Ljava/lang/String;

.field public static final 飘花落叶言子楪世苏兰哲:[Ljava/lang/Object;

.field public static final 飘花落叶言子楪世苏哲兰:[C


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [C

    .line 3
    .line 4
    sput-object v1, Lorg/apache/commons/lang3/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:[C

    .line 5
    .line 6
    new-array v1, v0, [Ljava/lang/Object;

    .line 7
    .line 8
    sput-object v1, Lorg/apache/commons/lang3/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:[Ljava/lang/Object;

    .line 9
    .line 10
    new-array v1, v0, [Ljava/lang/String;

    .line 11
    .line 12
    sput-object v1, Lorg/apache/commons/lang3/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:[Ljava/lang/String;

    .line 13
    .line 14
    new-array v0, v0, [Ljava/lang/reflect/Type;

    .line 15
    .line 16
    sput-object v0, Lorg/apache/commons/lang3/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:[Ljava/lang/reflect/Type;

    .line 17
    .line 18
    return-void
.end method

.method public static 飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lorg/apache/commons/lang3/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public static 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)I
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, -0x1

    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    invoke-static {v0, v0}, Ljava/lang/Math;->max(II)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-nez p0, :cond_2

    .line 11
    .line 12
    :goto_0
    array-length p0, p1

    .line 13
    if-ge v2, p0, :cond_4

    .line 14
    .line 15
    aget-object p0, p1, v2

    .line 16
    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    goto :goto_3

    .line 20
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    :goto_1
    array-length v3, p1

    .line 24
    if-ge v2, v3, :cond_4

    .line 25
    .line 26
    aget-object v3, p1, v2

    .line 27
    .line 28
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_3

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_4
    :goto_2
    move v2, v1

    .line 39
    :goto_3
    if-eq v2, v1, :cond_5

    .line 40
    .line 41
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_5
    return v0
.end method
