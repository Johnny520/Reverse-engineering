.class public final Lcom/esotericsoftware/kryo/serializers/OptionalSerializers;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/esotericsoftware/kryo/serializers/OptionalSerializers$OptionalDoubleSerializer;,
        Lcom/esotericsoftware/kryo/serializers/OptionalSerializers$OptionalLongSerializer;,
        Lcom/esotericsoftware/kryo/serializers/OptionalSerializers$OptionalIntSerializer;,
        Lcom/esotericsoftware/kryo/serializers/OptionalSerializers$OptionalSerializer;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static addDefaultSerializers(Lcom/esotericsoftware/kryo/Kryo;)V
    .locals 2

    .line 1
    const-string v0, "java.util.Optional"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->isClassAvailable(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-class v0, Ljava/util/Optional;

    .line 10
    .line 11
    const-class v1, Lcom/esotericsoftware/kryo/serializers/OptionalSerializers$OptionalSerializer;

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const-string v0, "java.util.OptionalInt"

    .line 17
    .line 18
    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->isClassAvailable(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const-class v0, Ljava/util/OptionalInt;

    .line 25
    .line 26
    const-class v1, Lcom/esotericsoftware/kryo/serializers/OptionalSerializers$OptionalIntSerializer;

    .line 27
    .line 28
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    const-string v0, "java.util.OptionalLong"

    .line 32
    .line 33
    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->isClassAvailable(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    const-class v0, Ljava/util/OptionalLong;

    .line 40
    .line 41
    const-class v1, Lcom/esotericsoftware/kryo/serializers/OptionalSerializers$OptionalLongSerializer;

    .line 42
    .line 43
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    const-string v0, "java.util.OptionalDouble"

    .line 47
    .line 48
    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->isClassAvailable(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    const-class v0, Ljava/util/OptionalDouble;

    .line 55
    .line 56
    const-class v1, Lcom/esotericsoftware/kryo/serializers/OptionalSerializers$OptionalDoubleSerializer;

    .line 57
    .line 58
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    return-void
.end method
