.class public abstract Lcom/highcapable/kavaref/extension/TypeRef;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final rawType$delegate:Lxhss/ᛵᛷᲀᛵ;

.field private final type$delegate:Lxhss/ᛵᛷᲀᛵ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxhss/ᲁᛴᛴᛳ;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lxhss/ᲁᛴᛴᛳ;-><init>(Lcom/highcapable/kavaref/extension/TypeRef;I)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lxhss/ᛴᛷᛱ;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lxhss/ᛴᛷᛱ;-><init>(Lxhss/ᛱᛳᲇᛶ;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lcom/highcapable/kavaref/extension/TypeRef;->type$delegate:Lxhss/ᛵᛷᲀᛵ;

    .line 16
    .line 17
    new-instance v0, Lxhss/ᲁᛴᛴᛳ;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, v1}, Lxhss/ᲁᛴᛴᛳ;-><init>(Lcom/highcapable/kavaref/extension/TypeRef;I)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lxhss/ᛴᛷᛱ;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lxhss/ᛴᛷᛱ;-><init>(Lxhss/ᛱᛳᲇᛶ;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lcom/highcapable/kavaref/extension/TypeRef;->rawType$delegate:Lxhss/ᛵᛷᲀᛵ;

    .line 29
    .line 30
    return-void
.end method

.method private static final rawType_delegate$lambda$0(Lcom/highcapable/kavaref/extension/TypeRef;)Ljava/lang/Class;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/highcapable/kavaref/extension/TypeRef;->getType()Ljava/lang/reflect/Type;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lxhss/ᛵᛶᲀᲇ;->ᛸᛷᲈᲈ(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method private static final type_delegate$lambda$0(Lcom/highcapable/kavaref/extension/TypeRef;)Ljava/lang/reflect/Type;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const-string v2, "Must only create direct subclasses of TypeRef."

    .line 13
    .line 14
    const-class v3, Lcom/highcapable/kavaref/extension/TypeRef;

    .line 15
    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v3}, Lxhss/ᛳᛳᲀᲀ;->ᛷᛵᛵᲈ(Ljava/lang/Class;)Lxhss/ᛱᛸᛷᛸ;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-static {v4}, Lxhss/ᛶᲈᛴᛲ;->ᲇᛸᛳᲁ(Lxhss/ᛱᛸᛷᛸ;)Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    if-nez v4, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v3, v4

    .line 36
    :goto_0
    invoke-static {v0, v3}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    array-length v0, p0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    move-object p0, v1

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/4 v0, 0x0

    .line 52
    aget-object p0, p0, v0

    .line 53
    .line 54
    :goto_1
    if-eqz p0, :cond_2

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_2
    const-string p0, "Type argument cannot be null."

    .line 58
    .line 59
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_3
    invoke-static {v2}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_4
    invoke-static {v3}, Lxhss/ᛳᛳᲀᲀ;->ᛷᛵᛵᲈ(Ljava/lang/Class;)Lxhss/ᛱᛸᛷᛸ;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, Lxhss/ᛶᲈᛴᛲ;->ᲇᛸᛳᲁ(Lxhss/ᛱᛸᛷᛸ;)Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-nez v0, :cond_5

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_5
    move-object v3, v0

    .line 79
    :goto_2
    invoke-static {p0, v3}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-eqz p0, :cond_6

    .line 84
    .line 85
    const-string p0, "TypeRef must be created with a type argument: object : TypeRef<...>() {}."

    .line 86
    .line 87
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-object v1

    .line 91
    :cond_6
    invoke-static {v2}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-object v1
.end method

.method public static synthetic ᛱᛱᛲᲇ(Lcom/highcapable/kavaref/extension/TypeRef;)Ljava/lang/Class;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/highcapable/kavaref/extension/TypeRef;->rawType_delegate$lambda$0(Lcom/highcapable/kavaref/extension/TypeRef;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic ᛷᛵᛵᲈ(Lcom/highcapable/kavaref/extension/TypeRef;)Ljava/lang/reflect/Type;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/highcapable/kavaref/extension/TypeRef;->type_delegate$lambda$0(Lcom/highcapable/kavaref/extension/TypeRef;)Ljava/lang/reflect/Type;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/highcapable/kavaref/extension/TypeRef;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/highcapable/kavaref/extension/TypeRef;->getType()Ljava/lang/reflect/Type;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p1, Lcom/highcapable/kavaref/extension/TypeRef;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/highcapable/kavaref/extension/TypeRef;->getType()Ljava/lang/reflect/Type;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p0, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

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

.method public final getRawType()Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/highcapable/kavaref/extension/TypeRef;->rawType$delegate:Lxhss/ᛵᛷᲀᛵ;

    .line 2
    .line 3
    check-cast p0, Lxhss/ᛴᛷᛱ;

    .line 4
    .line 5
    invoke-virtual {p0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Class;

    .line 10
    .line 11
    return-object p0
.end method

.method public final getType()Ljava/lang/reflect/Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/highcapable/kavaref/extension/TypeRef;->type$delegate:Lxhss/ᛵᛷᲀᛵ;

    .line 2
    .line 3
    check-cast p0, Lxhss/ᛴᛷᛱ;

    .line 4
    .line 5
    invoke-virtual {p0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/reflect/Type;

    .line 10
    .line 11
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/highcapable/kavaref/extension/TypeRef;->getType()Ljava/lang/reflect/Type;

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

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/highcapable/kavaref/extension/TypeRef;->getType()Ljava/lang/reflect/Type;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
