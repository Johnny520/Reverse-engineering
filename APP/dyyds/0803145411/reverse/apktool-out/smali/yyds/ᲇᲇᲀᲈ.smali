.class public final Lyyds/ᲇᲇᲀᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᛸᛴ;


# static fields
.field public static final ᛲᛴᛳᛲ:Lyyds/ᛳᛷᛱᛲ;


# instance fields
.field public final ᲀᛲᛳᲀ:Lyyds/ᲀᲈᛶᲈ;

.field public final ᲇᲈᛵᛷ:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛳᛷᛱᛲ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᛳᛷᛱᛲ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyyds/ᲇᲇᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛳᛷᛱᛲ;

    .line 8
    .line 9
    new-instance v0, Lyyds/ᛳᛷᛱᛲ;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lyyds/ᛳᛷᛱᛲ;-><init>(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lyyds/ᲀᲈᛶᲈ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲇᲇᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲈᛶᲈ;

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lyyds/ᲇᲇᲀᲈ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Lyyds/ᛱᛴᲇᲀ;Lyyds/ᲈᲈᛸᛳ;)Lyyds/ᲈᛸᛷ;
    .locals 7

    .line 1
    iget-object v0, p2, Lyyds/ᲈᲈᛸᛳ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 2
    .line 3
    const-class v1, Lyyds/ᛱᛱᛱᲇ;

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
    check-cast v5, Lyyds/ᛱᛱᛱᲇ;

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
    iget-object v2, p0, Lyyds/ᲇᲇᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲈᛶᲈ;

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
    invoke-virtual/range {v1 .. v6}, Lyyds/ᲇᲇᲀᲈ;->ᛵᛸᛸᛷ(Lyyds/ᲀᲈᛶᲈ;Lyyds/ᛱᛴᲇᲀ;Lyyds/ᲈᲈᛸᛳ;Lyyds/ᛱᛱᛱᲇ;Z)Lyyds/ᲈᛸᛷ;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ(Lyyds/ᲀᲈᛶᲈ;Lyyds/ᛱᛴᲇᲀ;Lyyds/ᲈᲈᛸᛳ;Lyyds/ᛱᛱᛱᲇ;Z)Lyyds/ᲈᛸᛷ;
    .locals 2

    .line 1
    invoke-interface {p4}, Lyyds/ᛱᛱᛱᲇ;->value()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lyyds/ᲈᲈᛸᛳ;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lyyds/ᲈᲈᛸᛳ;-><init>(Ljava/lang/reflect/Type;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-virtual {p1, v1, v0}, Lyyds/ᲀᲈᛶᲈ;->ᛲᛲᲈᲈ(Lyyds/ᲈᲈᛸᛳ;Z)Lyyds/ᲀᛸᛵᲁ;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Lyyds/ᲀᛸᛵᲁ;->ᛵᛸᛸᛷ()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p4}, Lyyds/ᛱᛱᛱᲇ;->nullSafe()Z

    .line 20
    .line 21
    .line 22
    move-result p4

    .line 23
    instance-of v0, p1, Lyyds/ᲈᛸᛷ;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    check-cast p1, Lyyds/ᲈᛸᛷ;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    instance-of v0, p1, Lyyds/ᛳᛸᛴ;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    check-cast p1, Lyyds/ᛳᛸᛴ;

    .line 35
    .line 36
    if-eqz p5, :cond_1

    .line 37
    .line 38
    iget-object p5, p3, Lyyds/ᲈᲈᛸᛳ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 39
    .line 40
    iget-object p0, p0, Lyyds/ᲇᲇᲀᲈ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 41
    .line 42
    invoke-virtual {p0, p5, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Lyyds/ᛳᛸᛴ;

    .line 47
    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    move-object p1, p0

    .line 51
    :cond_1
    invoke-interface {p1, p2, p3}, Lyyds/ᛳᛸᛴ;->ᛲᲈᲁ(Lyyds/ᛱᛴᲇᲀ;Lyyds/ᲈᲈᛸᛳ;)Lyyds/ᲈᛸᛷ;

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
    invoke-virtual {p1}, Lyyds/ᲈᛸᛷ;->ᛲᲈᲁ()Lyyds/ᛳᲇᛸᛴ;

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
    iget-object p2, p3, Lyyds/ᲈᲈᛸᛳ;->ᛵᛸᛸᛷ:Ljava/lang/reflect/Type;

    .line 76
    .line 77
    invoke-static {p2}, Lyyds/ᲀᛱᛳᲈ;->ᛶᛸᲀᲁ(Ljava/lang/reflect/Type;)Ljava/lang/String;

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
