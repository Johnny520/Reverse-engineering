.class public Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$DateSerializer;
.super Lcom/esotericsoftware/kryo/Serializer;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/serializers/DefaultSerializers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DateSerializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/esotericsoftware/kryo/Serializer<",
        "Ljava/util/Date;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/Serializer;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private create(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;J)Ljava/util/Date;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/Kryo;",
            "Ljava/lang/Class<",
            "+",
            "Ljava/util/Date;",
            ">;J)",
            "Ljava/util/Date;"
        }
    .end annotation

    .line 1
    const-class p0, Ljava/util/Date;

    .line 2
    .line 3
    if-eq p2, p0, :cond_5

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-class p0, Ljava/sql/Timestamp;

    .line 9
    .line 10
    if-ne p2, p0, :cond_1

    .line 11
    .line 12
    new-instance p0, Ljava/sql/Timestamp;

    .line 13
    .line 14
    invoke-direct {p0, p3, p4}, Ljava/sql/Timestamp;-><init>(J)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_1
    const-class p0, Ljava/sql/Date;

    .line 19
    .line 20
    if-ne p2, p0, :cond_2

    .line 21
    .line 22
    new-instance p0, Ljava/sql/Date;

    .line 23
    .line 24
    invoke-direct {p0, p3, p4}, Ljava/sql/Date;-><init>(J)V

    .line 25
    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    const-class p0, Ljava/sql/Time;

    .line 29
    .line 30
    if-ne p2, p0, :cond_3

    .line 31
    .line 32
    new-instance p0, Ljava/sql/Time;

    .line 33
    .line 34
    invoke-direct {p0, p3, p4}, Ljava/sql/Time;-><init>(J)V

    .line 35
    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_3
    :try_start_0
    sget-object p0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 39
    .line 40
    filled-new-array {p0}, [Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p2, p0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 49
    .line 50
    .line 51
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 52
    if-nez v0, :cond_4

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    :try_start_1
    invoke-virtual {p0, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 56
    .line 57
    .line 58
    :catch_0
    :cond_4
    :try_start_2
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, Ljava/util/Date;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 71
    .line 72
    return-object p0

    .line 73
    :catch_1
    invoke-virtual {p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->newInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, Ljava/util/Date;

    .line 78
    .line 79
    invoke-virtual {p0, p3, p4}, Ljava/util/Date;->setTime(J)V

    .line 80
    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_5
    :goto_0
    new-instance p0, Ljava/util/Date;

    .line 84
    .line 85
    invoke-direct {p0, p3, p4}, Ljava/util/Date;-><init>(J)V

    .line 86
    .line 87
    .line 88
    return-object p0
.end method


# virtual methods
.method public bridge synthetic copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p2, Ljava/util/Date;

    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$DateSerializer;->copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/util/Date;)Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method

.method public copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/util/Date;)Ljava/util/Date;
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-direct {p0, p1, v0, v1, v2}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$DateSerializer;->create(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;J)Ljava/util/Date;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public bridge synthetic read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 11
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$DateSerializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method

.method public read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/util/Date;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/Kryo;",
            "Lcom/esotericsoftware/kryo/io/Input;",
            "Ljava/lang/Class<",
            "+",
            "Ljava/util/Date;",
            ">;)",
            "Ljava/util/Date;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p2, v0}, Lcom/esotericsoftware/kryo/io/Input;->readVarLong(Z)J

    .line 3
    .line 4
    .line 5
    move-result-wide v0

    .line 6
    invoke-direct {p0, p1, p3, v0, v1}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$DateSerializer;->create(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;J)Ljava/util/Date;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public bridge synthetic write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    .locals 0

    .line 10
    check-cast p3, Ljava/util/Date;

    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$DateSerializer;->write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/util/Date;)V

    return-void
.end method

.method public write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/util/Date;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/util/Date;->getTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    const/4 p3, 0x1

    .line 6
    invoke-virtual {p2, p0, p1, p3}, Lcom/esotericsoftware/kryo/io/Output;->writeVarLong(JZ)I

    .line 7
    .line 8
    .line 9
    return-void
.end method
