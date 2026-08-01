.class final Lcom/esotericsoftware/kryo/serializers/AsmField$LongAsmField;
.super Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/serializers/AsmField;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LongAsmField"
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;-><init>(Ljava/lang/reflect/Field;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public copy(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->access:Lcom/esotericsoftware/reflectasm/FieldAccess;

    .line 2
    .line 3
    iget p0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->accessIndex:I

    .line 4
    .line 5
    invoke-virtual {v0, p1, p0}, Lcom/esotericsoftware/reflectasm/FieldAccess;->getLong(Ljava/lang/Object;I)J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {v0, p2, p0, v1, v2}, Lcom/esotericsoftware/reflectasm/FieldAccess;->setLong(Ljava/lang/Object;IJ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public read(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->varEncoding:Z

    .line 2
    .line 3
    iget-object v1, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->access:Lcom/esotericsoftware/reflectasm/FieldAccess;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget p0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->accessIndex:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/kryo/io/Input;->readVarLong(Z)J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    invoke-virtual {v1, p2, p0, v2, v3}, Lcom/esotericsoftware/reflectasm/FieldAccess;->setLong(Ljava/lang/Object;IJ)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget p0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->accessIndex:I

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Input;->readLong()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    invoke-virtual {v1, p2, p0, v2, v3}, Lcom/esotericsoftware/reflectasm/FieldAccess;->setLong(Ljava/lang/Object;IJ)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public write(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->varEncoding:Z

    .line 2
    .line 3
    iget-object v1, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->access:Lcom/esotericsoftware/reflectasm/FieldAccess;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget p0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->accessIndex:I

    .line 8
    .line 9
    invoke-virtual {v1, p2, p0}, Lcom/esotericsoftware/reflectasm/FieldAccess;->getLong(Ljava/lang/Object;I)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const/4 p0, 0x0

    .line 14
    invoke-virtual {p1, v0, v1, p0}, Lcom/esotericsoftware/kryo/io/Output;->writeVarLong(JZ)I

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget p0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->accessIndex:I

    .line 19
    .line 20
    invoke-virtual {v1, p2, p0}, Lcom/esotericsoftware/reflectasm/FieldAccess;->getLong(Ljava/lang/Object;I)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    invoke-virtual {p1, v0, v1}, Lcom/esotericsoftware/kryo/io/Output;->writeLong(J)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
