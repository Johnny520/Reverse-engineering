.class final Lcom/esotericsoftware/kryo/serializers/UnsafeField$DoubleUnsafeField;
.super Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/serializers/UnsafeField;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DoubleUnsafeField"
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;-><init>(Ljava/lang/reflect/Field;)V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iput-wide v0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->offset:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public copy(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    .line 1
    sget-object v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 2
    .line 3
    iget-wide v2, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->offset:J

    .line 4
    .line 5
    invoke-virtual {v0, p1, v2, v3}, Lsun/misc/Unsafe;->getDouble(Ljava/lang/Object;J)D

    .line 6
    .line 7
    .line 8
    move-result-wide v4

    .line 9
    move-object v1, p2

    .line 10
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putDouble(Ljava/lang/Object;JD)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public read(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Object;)V
    .locals 6

    .line 1
    sget-object v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 2
    .line 3
    iget-wide v2, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->offset:J

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Input;->readDouble()D

    .line 6
    .line 7
    .line 8
    move-result-wide v4

    .line 9
    move-object v1, p2

    .line 10
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putDouble(Ljava/lang/Object;JD)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public write(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->offset:J

    .line 4
    .line 5
    invoke-virtual {v0, p2, v1, v2}, Lsun/misc/Unsafe;->getDouble(Ljava/lang/Object;J)D

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-virtual {p1, v0, v1}, Lcom/esotericsoftware/kryo/io/Output;->writeDouble(D)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
