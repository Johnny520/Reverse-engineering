.class public final Lxhss/ᛱᲁᲈᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛴᛲᲀᛵ;


# static fields
.field public static final ᲇᛴᲇᛵ:Lxhss/ᛸᛵᛷᛴ;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛳᛱᛲᲀ;

.field public final ᛳᲁᲇᛸ:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᛸᛵᛷᛴ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lxhss/ᛸᛵᛷᛴ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lxhss/ᛱᲁᲈᛷ;->ᲇᛴᲇᛵ:Lxhss/ᛸᛵᛷᛴ;

    .line 8
    .line 9
    new-instance v0, Lxhss/ᛸᛵᛷᛴ;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lxhss/ᛸᛵᛷᛴ;-><init>(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lxhss/ᛳᛱᛲᲀ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛱᲁᲈᛷ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛱᛲᲀ;

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lxhss/ᛱᲁᲈᛷ;->ᛳᲁᲇᛸ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Lxhss/ᛳᛱᛲᲀ;Lxhss/ᲈᛲᛶᛴ;Lxhss/ᛱᛳᲈᛷ;Lxhss/ᛸᛱᲀᛷ;Z)Lxhss/ᛲᛱᛶᛴ;
    .locals 2

    .line 1
    invoke-interface {p4}, Lxhss/ᛸᛱᲀᛷ;->value()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lxhss/ᛱᛳᲈᛷ;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lxhss/ᛱᛳᲈᛷ;-><init>(Ljava/lang/reflect/Type;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-virtual {p1, v1, v0}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛶᲈᛶ(Lxhss/ᛱᛳᲈᛷ;Z)Lxhss/ᲁᲀᛶᛲ;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Lxhss/ᲁᲀᛶᛲ;->ᛳᲁᲇᛸ()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p4}, Lxhss/ᛸᛱᲀᛷ;->nullSafe()Z

    .line 20
    .line 21
    .line 22
    move-result p4

    .line 23
    instance-of v0, p1, Lxhss/ᛲᛱᛶᛴ;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    check-cast p1, Lxhss/ᛲᛱᛶᛴ;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    instance-of v0, p1, Lxhss/ᛴᛲᲀᛵ;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    check-cast p1, Lxhss/ᛴᛲᲀᛵ;

    .line 35
    .line 36
    if-eqz p5, :cond_1

    .line 37
    .line 38
    iget-object p5, p3, Lxhss/ᛱᛳᲈᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

    .line 39
    .line 40
    iget-object p0, p0, Lxhss/ᛱᲁᲈᛷ;->ᛳᲁᲇᛸ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 41
    .line 42
    invoke-virtual {p0, p5, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Lxhss/ᛴᛲᲀᛵ;

    .line 47
    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    move-object p1, p0

    .line 51
    :cond_1
    invoke-interface {p1, p2, p3}, Lxhss/ᛴᛲᲀᛵ;->ᛷᛵᛵᲈ(Lxhss/ᲈᛲᛶᛴ;Lxhss/ᛱᛳᲈᛷ;)Lxhss/ᛲᛱᛶᛴ;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :goto_0
    if-eqz p1, :cond_2

    .line 56
    .line 57
    if-eqz p4, :cond_2

    .line 58
    .line 59
    invoke-virtual {p1}, Lxhss/ᛲᛱᛶᛴ;->ᛷᛵᛵᲈ()Lxhss/ᛲᛲᛸᲇ;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :cond_2
    return-object p1

    .line 65
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iget-object p2, p3, Lxhss/ᛱᛳᲈᛷ;->ᛱᛱᛲᲇ:Ljava/lang/reflect/Type;

    .line 76
    .line 77
    invoke-static {p2}, Lxhss/ᲀᲈᛵᛸ;->ᛲᛴᲀᲈ(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    new-instance p3, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    const-string p4, "Invalid attempt to bind an instance of "

    .line 84
    .line 85
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string p1, " as a @JsonAdapter for "

    .line 92
    .line 93
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string p1, ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."

    .line 100
    .line 101
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p0
.end method

.method public final ᛷᛵᛵᲈ(Lxhss/ᲈᛲᛶᛴ;Lxhss/ᛱᛳᲈᛷ;)Lxhss/ᛲᛱᛶᛴ;
    .locals 7

    .line 1
    iget-object v0, p2, Lxhss/ᛱᛳᲈᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

    .line 2
    .line 3
    const-class v1, Lxhss/ᛸᛱᲀᛷ;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v5, v0

    .line 10
    check-cast v5, Lxhss/ᛸᛱᲀᛷ;

    .line 11
    .line 12
    if-nez v5, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object v2, p0, Lxhss/ᛱᲁᲈᛷ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛱᛲᲀ;

    .line 17
    .line 18
    const/4 v6, 0x1

    .line 19
    move-object v1, p0

    .line 20
    move-object v3, p1

    .line 21
    move-object v4, p2

    .line 22
    invoke-virtual/range {v1 .. v6}, Lxhss/ᛱᲁᲈᛷ;->ᛱᛱᛲᲇ(Lxhss/ᛳᛱᛲᲀ;Lxhss/ᲈᛲᛶᛴ;Lxhss/ᛱᛳᲈᛷ;Lxhss/ᛸᛱᲀᛷ;Z)Lxhss/ᛲᛱᛶᛴ;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
