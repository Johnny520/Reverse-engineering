.class public abstract Lcom/highcapable/kavaref/extension/TypeRef;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


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
.field private final rawType$delegate:Lyyds/ᛴᛳᲈᛵ;

.field private final type$delegate:Lyyds/ᛴᛳᲈᛵ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛷᲀᲁᛶ;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lyyds/ᛷᲀᲁᛶ;-><init>(Lcom/highcapable/kavaref/extension/TypeRef;I)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lyyds/ᛱᛲᛶᛱ;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lyyds/ᛱᛲᛶᛱ;-><init>(Lyyds/ᲁᛶᲁᲀ;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lcom/highcapable/kavaref/extension/TypeRef;->type$delegate:Lyyds/ᛴᛳᲈᛵ;

    .line 16
    .line 17
    new-instance v0, Lyyds/ᛷᲀᲁᛶ;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, v1}, Lyyds/ᛷᲀᲁᛶ;-><init>(Lcom/highcapable/kavaref/extension/TypeRef;I)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lyyds/ᛱᛲᛶᛱ;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lyyds/ᛱᛲᛶᛱ;-><init>(Lyyds/ᲁᛶᲁᲀ;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lcom/highcapable/kavaref/extension/TypeRef;->rawType$delegate:Lyyds/ᛴᛳᲈᛵ;

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
    invoke-static {p0}, Lyyds/ᲁᛴᛵᛱ;->ᛷᛲᲈᛱ(Ljava/lang/reflect/Type;)Ljava/lang/Class;

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
    if-eqz v0, :cond_3

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
    invoke-static {v3}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-static {v4}, Lyyds/ᛳᛴᲁᲇ;->ᛲᛴᛳᛲ(Lyyds/ᲁᛵᛴᲀ;)Ljava/lang/Class;

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
    invoke-static {v0, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0}, Lyyds/ᲀᲀᛷᛸ;->ᛷᛸᲇᛶ([Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, Ljava/lang/reflect/Type;

    .line 51
    .line 52
    if-eqz p0, :cond_1

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_1
    const-string p0, "Type argument cannot be null."

    .line 56
    .line 57
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_2
    invoke-static {v2}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    invoke-static {v3}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v0}, Lyyds/ᛳᛴᲁᲇ;->ᛲᛴᛳᛲ(Lyyds/ᲁᛵᛴᲀ;)Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-nez v0, :cond_4

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    move-object v3, v0

    .line 77
    :goto_1
    invoke-static {p0, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_5

    .line 82
    .line 83
    const-string p0, "TypeRef must be created with a type argument: object : TypeRef<...>() {}."

    .line 84
    .line 85
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-object v1

    .line 89
    :cond_5
    invoke-static {v2}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object v1
.end method

.method public static synthetic ᛲᲈᲁ(Lcom/highcapable/kavaref/extension/TypeRef;)Ljava/lang/reflect/Type;
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

.method public static synthetic ᛵᛸᛸᛷ(Lcom/highcapable/kavaref/extension/TypeRef;)Ljava/lang/Class;
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
    invoke-static {p0, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lcom/highcapable/kavaref/extension/TypeRef;->rawType$delegate:Lyyds/ᛴᛳᲈᛵ;

    .line 2
    .line 3
    invoke-interface {p0}, Lyyds/ᛴᛳᲈᛵ;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Class;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getType()Ljava/lang/reflect/Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/highcapable/kavaref/extension/TypeRef;->type$delegate:Lyyds/ᛴᛳᲈᛵ;

    .line 2
    .line 3
    invoke-interface {p0}, Lyyds/ᛴᛳᲈᛵ;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/reflect/Type;

    .line 8
    .line 9
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
