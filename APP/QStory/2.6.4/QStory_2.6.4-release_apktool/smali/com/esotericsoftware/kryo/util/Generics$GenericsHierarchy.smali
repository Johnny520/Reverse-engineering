.class public Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/util/Generics;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GenericsHierarchy"
.end annotation


# static fields
.field static final EMPTY:Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;


# instance fields
.field final counts:[I

.field final parameters:[Ljava/lang/reflect/TypeVariable;

.field final rootTotal:I

.field final total:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [I

    .line 5
    .line 6
    new-array v3, v1, [Ljava/lang/reflect/TypeVariable;

    .line 7
    .line 8
    invoke-direct {v0, v1, v1, v2, v3}, Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;-><init>(II[I[Ljava/lang/reflect/TypeVariable;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;->EMPTY:Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(II[I[Ljava/lang/reflect/TypeVariable;)V
    .locals 0

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    iput p1, p0, Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;->total:I

    .line 127
    iput p2, p0, Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;->rootTotal:I

    .line 128
    iput-object p3, p0, Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;->counts:[I

    .line 129
    iput-object p4, p0, Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;->parameters:[Ljava/lang/reflect/TypeVariable;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/esotericsoftware/kryo/util/IntArray;

    .line 7
    .line 8
    invoke-direct {v1}, Lcom/esotericsoftware/kryo/util/IntArray;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    move-object/from16 v4, p1

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    :cond_0
    invoke-virtual {v4}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    array-length v7, v6

    .line 24
    const/4 v8, 0x0

    .line 25
    :goto_0
    if-ge v8, v7, :cond_4

    .line 26
    .line 27
    aget-object v9, v6, v8

    .line 28
    .line 29
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    const/4 v10, 0x1

    .line 33
    invoke-virtual {v1, v10}, Lcom/esotericsoftware/kryo/util/IntArray;->add(I)V

    .line 34
    .line 35
    .line 36
    move-object v11, v4

    .line 37
    :cond_1
    invoke-virtual {v11}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 38
    .line 39
    .line 40
    move-result-object v12

    .line 41
    invoke-virtual {v11}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v11

    .line 45
    instance-of v13, v12, Ljava/lang/reflect/ParameterizedType;

    .line 46
    .line 47
    if-nez v13, :cond_2

    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/esotericsoftware/kryo/util/IntArray;->peek()I

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    add-int/2addr v5, v9

    .line 54
    add-int/lit8 v8, v8, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-virtual {v11}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 58
    .line 59
    .line 60
    move-result-object v13

    .line 61
    check-cast v12, Ljava/lang/reflect/ParameterizedType;

    .line 62
    .line 63
    invoke-interface {v12}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 64
    .line 65
    .line 66
    move-result-object v12

    .line 67
    array-length v14, v12

    .line 68
    const/4 v15, 0x0

    .line 69
    :goto_1
    if-ge v15, v14, :cond_1

    .line 70
    .line 71
    aget-object v3, v12, v15

    .line 72
    .line 73
    if-ne v3, v9, :cond_3

    .line 74
    .line 75
    aget-object v9, v13, v15

    .line 76
    .line 77
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    iget v3, v1, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 81
    .line 82
    sub-int/2addr v3, v10

    .line 83
    invoke-virtual {v1, v3, v10}, Lcom/esotericsoftware/kryo/util/IntArray;->incr(II)V

    .line 84
    .line 85
    .line 86
    :cond_3
    add-int/lit8 v15, v15, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    if-nez v4, :cond_0

    .line 94
    .line 95
    iput v5, v0, Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;->total:I

    .line 96
    .line 97
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    array-length v3, v3

    .line 102
    iput v3, v0, Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;->rootTotal:I

    .line 103
    .line 104
    invoke-virtual {v1}, Lcom/esotericsoftware/kryo/util/IntArray;->toArray()[I

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    iput-object v1, v0, Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;->counts:[I

    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    new-array v1, v1, [Ljava/lang/reflect/TypeVariable;

    .line 115
    .line 116
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, [Ljava/lang/reflect/TypeVariable;

    .line 121
    .line 122
    iput-object v1, v0, Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;->parameters:[Ljava/lang/reflect/TypeVariable;

    .line 123
    .line 124
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, "["

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;->counts:[I

    .line 8
    .line 9
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;->parameters:[Ljava/lang/reflect/TypeVariable;

    .line 10
    .line 11
    array-length v2, v1

    .line 12
    const/4 v3, 0x0

    .line 13
    move v4, v3

    .line 14
    :goto_0
    if-ge v3, v2, :cond_3

    .line 15
    .line 16
    aget v5, v1, v3

    .line 17
    .line 18
    add-int/2addr v5, v4

    .line 19
    :goto_1
    if-ge v4, v5, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    const/4 v7, 0x1

    .line 26
    if-le v6, v7, :cond_0

    .line 27
    .line 28
    const-string v6, ", "

    .line 29
    .line 30
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    :cond_0
    aget-object v6, p0, v4

    .line 34
    .line 35
    invoke-interface {v6}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    instance-of v7, v6, Ljava/lang/Class;

    .line 40
    .line 41
    if-eqz v7, :cond_1

    .line 42
    .line 43
    check-cast v6, Ljava/lang/Class;

    .line 44
    .line 45
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_1
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    :goto_2
    const/16 v6, 0x3c

    .line 57
    .line 58
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    aget-object v6, p0, v4

    .line 62
    .line 63
    invoke-interface {v6}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const/16 v6, 0x3e

    .line 71
    .line 72
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    add-int/lit8 v4, v4, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    const-string p0, "]"

    .line 82
    .line 83
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0
.end method
