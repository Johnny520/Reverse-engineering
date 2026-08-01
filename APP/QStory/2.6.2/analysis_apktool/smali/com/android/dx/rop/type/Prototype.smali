.class public final Lcom/android/dx/rop/type/Prototype;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/android/dx/rop/type/Prototype;",
        ">;"
    }
.end annotation


# static fields
.field private static final internTable:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/String;",
            "Lcom/android/dx/rop/type/Prototype;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final descriptor:Ljava/lang/String;

.field private parameterFrameTypes:Lcom/android/dx/rop/type/StdTypeList;

.field private final parameterTypes:Lcom/android/dx/rop/type/StdTypeList;

.field private final returnType:Lcom/android/dx/rop/type/Type;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    const/16 v1, 0x2710

    .line 4
    .line 5
    const/high16 v2, 0x3f400000    # 0.75f

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IF)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/android/dx/rop/type/Prototype;->internTable:Ljava/util/concurrent/ConcurrentMap;

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/StdTypeList;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, Lcom/android/dx/rop/type/Prototype;->descriptor:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p2, p0, Lcom/android/dx/rop/type/Prototype;->returnType:Lcom/android/dx/rop/type/Type;

    .line 14
    .line 15
    iput-object p3, p0, Lcom/android/dx/rop/type/Prototype;->parameterTypes:Lcom/android/dx/rop/type/StdTypeList;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/android/dx/rop/type/Prototype;->parameterFrameTypes:Lcom/android/dx/rop/type/StdTypeList;

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p0, "parameterTypes == null"

    .line 21
    .line 22
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :cond_1
    const-string p0, "returnType == null"

    .line 27
    .line 28
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_2
    const-string p0, "descriptor == null"

    .line 33
    .line 34
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0
.end method

.method public static clearInternTable()V
    .locals 1

    .line 1
    sget-object v0, Lcom/android/dx/rop/type/Prototype;->internTable:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static fromDescriptor(Ljava/lang/String;)Lcom/android/dx/rop/type/Prototype;
    .locals 8

    .line 1
    sget-object v0, Lcom/android/dx/rop/type/Prototype;->internTable:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/android/dx/rop/type/Prototype;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-static {p0}, Lcom/android/dx/rop/type/Prototype;->makeParameterArray(Ljava/lang/String;)[Lcom/android/dx/rop/type/Type;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    move v4, v1

    .line 19
    move v3, v2

    .line 20
    :goto_0
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    const/16 v6, 0x29

    .line 25
    .line 26
    if-ne v5, v6, :cond_2

    .line 27
    .line 28
    add-int/2addr v3, v2

    .line 29
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v2}, Lcom/android/dx/rop/type/Type;->internReturnType(Ljava/lang/String;)Lcom/android/dx/rop/type/Type;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-instance v3, Lcom/android/dx/rop/type/StdTypeList;

    .line 38
    .line 39
    invoke-direct {v3, v4}, Lcom/android/dx/rop/type/StdTypeList;-><init>(I)V

    .line 40
    .line 41
    .line 42
    :goto_1
    if-ge v1, v4, :cond_1

    .line 43
    .line 44
    aget-object v5, v0, v1

    .line 45
    .line 46
    invoke-virtual {v3, v1, v5}, Lcom/android/dx/rop/type/StdTypeList;->set(ILcom/android/dx/rop/type/Type;)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    new-instance v0, Lcom/android/dx/rop/type/Prototype;

    .line 53
    .line 54
    invoke-direct {v0, p0, v2, v3}, Lcom/android/dx/rop/type/Prototype;-><init>(Ljava/lang/String;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/StdTypeList;)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_2
    move v6, v3

    .line 59
    :goto_2
    const/16 v7, 0x5b

    .line 60
    .line 61
    if-ne v5, v7, :cond_3

    .line 62
    .line 63
    add-int/lit8 v6, v6, 0x1

    .line 64
    .line 65
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    goto :goto_2

    .line 70
    :cond_3
    const/16 v7, 0x4c

    .line 71
    .line 72
    if-ne v5, v7, :cond_5

    .line 73
    .line 74
    const/16 v5, 0x3b

    .line 75
    .line 76
    invoke-virtual {p0, v5, v6}, Ljava/lang/String;->indexOf(II)I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    const/4 v6, -0x1

    .line 81
    if-eq v5, v6, :cond_4

    .line 82
    .line 83
    add-int/lit8 v5, v5, 0x1

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    const-string p0, "bad descriptor"

    .line 87
    .line 88
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    const/4 p0, 0x0

    .line 92
    return-object p0

    .line 93
    :cond_5
    add-int/lit8 v5, v6, 0x1

    .line 94
    .line 95
    :goto_3
    invoke-virtual {p0, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-static {v3}, Lcom/android/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/android/dx/rop/type/Type;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    aput-object v3, v0, v4

    .line 104
    .line 105
    add-int/lit8 v4, v4, 0x1

    .line 106
    .line 107
    move v3, v5

    .line 108
    goto :goto_0
.end method

.method public static intern(Ljava/lang/String;)Lcom/android/dx/rop/type/Prototype;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    sget-object v0, Lcom/android/dx/rop/type/Prototype;->internTable:Ljava/util/concurrent/ConcurrentMap;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/android/dx/rop/type/Prototype;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-static {p0}, Lcom/android/dx/rop/type/Prototype;->fromDescriptor(Ljava/lang/String;)Lcom/android/dx/rop/type/Prototype;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Lcom/android/dx/rop/type/Prototype;->putIntern(Lcom/android/dx/rop/type/Prototype;)Lcom/android/dx/rop/type/Prototype;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    const-string p0, "descriptor == null"

    .line 24
    .line 25
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public static intern(Ljava/lang/String;Lcom/android/dx/rop/type/Type;ZZ)Lcom/android/dx/rop/type/Prototype;
    .locals 0

    .line 30
    invoke-static {p0}, Lcom/android/dx/rop/type/Prototype;->intern(Ljava/lang/String;)Lcom/android/dx/rop/type/Prototype;

    move-result-object p0

    if-eqz p2, :cond_0

    return-object p0

    :cond_0
    if-eqz p3, :cond_1

    const p2, 0x7fffffff

    .line 31
    invoke-virtual {p1, p2}, Lcom/android/dx/rop/type/Type;->asUninitialized(I)Lcom/android/dx/rop/type/Type;

    move-result-object p1

    .line 32
    :cond_1
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/type/Prototype;->withFirstParameter(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Prototype;

    move-result-object p0

    return-object p0
.end method

.method public static internInts(Lcom/android/dx/rop/type/Type;I)Lcom/android/dx/rop/type/Prototype;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/16 v1, 0x28

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-ge v1, p1, :cond_0

    .line 15
    .line 16
    const/16 v2, 0x49

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/16 p1, 0x29

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->getDescriptor()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, Lcom/android/dx/rop/type/Prototype;->intern(Ljava/lang/String;)Lcom/android/dx/rop/type/Prototype;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method private static makeParameterArray(Ljava/lang/String;)[Lcom/android/dx/rop/type/Type;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const/16 v3, 0x28

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    const-string v5, "bad descriptor"

    .line 14
    .line 15
    if-ne v2, v3, :cond_5

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    move v6, v1

    .line 19
    move v3, v2

    .line 20
    :goto_0
    const/16 v7, 0x29

    .line 21
    .line 22
    if-ge v3, v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v8

    .line 28
    if-ne v8, v7, :cond_0

    .line 29
    .line 30
    move v1, v3

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    const/16 v7, 0x41

    .line 33
    .line 34
    if-lt v8, v7, :cond_1

    .line 35
    .line 36
    const/16 v7, 0x5a

    .line 37
    .line 38
    if-gt v8, v7, :cond_1

    .line 39
    .line 40
    add-int/lit8 v6, v6, 0x1

    .line 41
    .line 42
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    :goto_1
    if-eqz v1, :cond_4

    .line 46
    .line 47
    sub-int/2addr v0, v2

    .line 48
    if-eq v1, v0, :cond_4

    .line 49
    .line 50
    add-int/2addr v1, v2

    .line 51
    invoke-virtual {p0, v7, v1}, Ljava/lang/String;->indexOf(II)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    const/4 v0, -0x1

    .line 56
    if-ne p0, v0, :cond_3

    .line 57
    .line 58
    new-array p0, v6, [Lcom/android/dx/rop/type/Type;

    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_3
    invoke-static {v5}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v4

    .line 65
    :cond_4
    invoke-static {v5}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-object v4

    .line 69
    :cond_5
    invoke-static {v5}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object v4
.end method

.method private static putIntern(Lcom/android/dx/rop/type/Prototype;)Lcom/android/dx/rop/type/Prototype;
    .locals 2

    .line 1
    sget-object v0, Lcom/android/dx/rop/type/Prototype;->internTable:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Prototype;->getDescriptor()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1, p0}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/android/dx/rop/type/Prototype;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    return-object p0
.end method


# virtual methods
.method public compareTo(Lcom/android/dx/rop/type/Prototype;)I
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/android/dx/rop/type/Prototype;->returnType:Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    iget-object v2, p1, Lcom/android/dx/rop/type/Prototype;->returnType:Lcom/android/dx/rop/type/Type;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Lcom/android/dx/rop/type/Type;->compareTo(Lcom/android/dx/rop/type/Type;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    iget-object v1, p0, Lcom/android/dx/rop/type/Prototype;->parameterTypes:Lcom/android/dx/rop/type/StdTypeList;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget-object v2, p1, Lcom/android/dx/rop/type/Prototype;->parameterTypes:Lcom/android/dx/rop/type/StdTypeList;

    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    move v4, v0

    .line 33
    :goto_0
    if-ge v4, v3, :cond_3

    .line 34
    .line 35
    iget-object v5, p0, Lcom/android/dx/rop/type/Prototype;->parameterTypes:Lcom/android/dx/rop/type/StdTypeList;

    .line 36
    .line 37
    invoke-virtual {v5, v4}, Lcom/android/dx/rop/type/StdTypeList;->get(I)Lcom/android/dx/rop/type/Type;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    iget-object v6, p1, Lcom/android/dx/rop/type/Prototype;->parameterTypes:Lcom/android/dx/rop/type/StdTypeList;

    .line 42
    .line 43
    invoke-virtual {v6, v4}, Lcom/android/dx/rop/type/StdTypeList;->get(I)Lcom/android/dx/rop/type/Type;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-virtual {v5, v6}, Lcom/android/dx/rop/type/Type;->compareTo(Lcom/android/dx/rop/type/Type;)I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_2

    .line 52
    .line 53
    return v5

    .line 54
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    if-ge v1, v2, :cond_4

    .line 58
    .line 59
    const/4 p0, -0x1

    .line 60
    return p0

    .line 61
    :cond_4
    if-le v1, v2, :cond_5

    .line 62
    .line 63
    const/4 p0, 0x1

    .line 64
    return p0

    .line 65
    :cond_5
    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 66
    check-cast p1, Lcom/android/dx/rop/type/Prototype;

    invoke-virtual {p0, p1}, Lcom/android/dx/rop/type/Prototype;->compareTo(Lcom/android/dx/rop/type/Prototype;)I

    move-result p0

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Lcom/android/dx/rop/type/Prototype;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    iget-object p0, p0, Lcom/android/dx/rop/type/Prototype;->descriptor:Ljava/lang/String;

    .line 12
    .line 13
    check-cast p1, Lcom/android/dx/rop/type/Prototype;

    .line 14
    .line 15
    iget-object p1, p1, Lcom/android/dx/rop/type/Prototype;->descriptor:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public getDescriptor()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/type/Prototype;->descriptor:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getParameterFrameTypes()Lcom/android/dx/rop/type/StdTypeList;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/type/Prototype;->parameterFrameTypes:Lcom/android/dx/rop/type/StdTypeList;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lcom/android/dx/rop/type/Prototype;->parameterTypes:Lcom/android/dx/rop/type/StdTypeList;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    new-instance v1, Lcom/android/dx/rop/type/StdTypeList;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lcom/android/dx/rop/type/StdTypeList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    move v3, v2

    .line 18
    :goto_0
    if-ge v2, v0, :cond_1

    .line 19
    .line 20
    iget-object v4, p0, Lcom/android/dx/rop/type/Prototype;->parameterTypes:Lcom/android/dx/rop/type/StdTypeList;

    .line 21
    .line 22
    invoke-virtual {v4, v2}, Lcom/android/dx/rop/type/StdTypeList;->get(I)Lcom/android/dx/rop/type/Type;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v4}, Lcom/android/dx/rop/type/Type;->isIntlike()Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    sget-object v4, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    :cond_0
    invoke-virtual {v1, v2, v4}, Lcom/android/dx/rop/type/StdTypeList;->set(ILcom/android/dx/rop/type/Type;)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    if-eqz v3, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    iget-object v1, p0, Lcom/android/dx/rop/type/Prototype;->parameterTypes:Lcom/android/dx/rop/type/StdTypeList;

    .line 45
    .line 46
    :goto_1
    iput-object v1, p0, Lcom/android/dx/rop/type/Prototype;->parameterFrameTypes:Lcom/android/dx/rop/type/StdTypeList;

    .line 47
    .line 48
    :cond_3
    iget-object p0, p0, Lcom/android/dx/rop/type/Prototype;->parameterFrameTypes:Lcom/android/dx/rop/type/StdTypeList;

    .line 49
    .line 50
    return-object p0
.end method

.method public getParameterTypes()Lcom/android/dx/rop/type/StdTypeList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/type/Prototype;->parameterTypes:Lcom/android/dx/rop/type/StdTypeList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getReturnType()Lcom/android/dx/rop/type/Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/type/Prototype;->returnType:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/type/Prototype;->descriptor:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/type/Prototype;->descriptor:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public withFirstParameter(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Prototype;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->getDescriptor()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lcom/android/dx/rop/type/Prototype;->descriptor:Ljava/lang/String;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lcom/android/dx/rop/type/Prototype;->parameterTypes:Lcom/android/dx/rop/type/StdTypeList;

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Lcom/android/dx/rop/type/StdTypeList;->withFirst(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/StdTypeList;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 36
    .line 37
    .line 38
    new-instance v1, Lcom/android/dx/rop/type/Prototype;

    .line 39
    .line 40
    iget-object p0, p0, Lcom/android/dx/rop/type/Prototype;->returnType:Lcom/android/dx/rop/type/Type;

    .line 41
    .line 42
    invoke-direct {v1, v0, p0, p1}, Lcom/android/dx/rop/type/Prototype;-><init>(Ljava/lang/String;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/StdTypeList;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v1}, Lcom/android/dx/rop/type/Prototype;->putIntern(Lcom/android/dx/rop/type/Prototype;)Lcom/android/dx/rop/type/Prototype;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method
