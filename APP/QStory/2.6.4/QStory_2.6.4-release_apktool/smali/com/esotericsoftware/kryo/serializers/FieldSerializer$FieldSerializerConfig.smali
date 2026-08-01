.class public Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/serializers/FieldSerializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FieldSerializerConfig"
.end annotation


# instance fields
.field copyTransient:Z

.field extendedFieldNames:Z

.field fieldsCanBeNull:Z

.field fixedFieldTypes:Z

.field ignoreSyntheticFields:Z

.field serializeTransient:Z

.field setFieldsAsAccessible:Z

.field varEncoding:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->fieldsCanBeNull:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->setFieldsAsAccessible:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->ignoreSyntheticFields:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->copyTransient:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->varEncoding:Z

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public clone()Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;
    .locals 1

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :catch_0
    move-exception p0

    .line 9
    new-instance v0, Lcom/esotericsoftware/kryo/KryoException;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    throw v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 0

    .line 15
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->clone()Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;

    move-result-object p0

    return-object p0
.end method

.method public getCopyTransient()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->copyTransient:Z

    .line 2
    .line 3
    return p0
.end method

.method public getExtendedFieldNames()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->extendedFieldNames:Z

    .line 2
    .line 3
    return p0
.end method

.method public getFieldsCanBeNull()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->fieldsCanBeNull:Z

    .line 2
    .line 3
    return p0
.end method

.method public getFixedFieldTypes()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->fixedFieldTypes:Z

    .line 2
    .line 3
    return p0
.end method

.method public getIgnoreSyntheticFields()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->ignoreSyntheticFields:Z

    .line 2
    .line 3
    return p0
.end method

.method public getSerializeTransient()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->serializeTransient:Z

    .line 2
    .line 3
    return p0
.end method

.method public getSetFieldsAsAccessible()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->setFieldsAsAccessible:Z

    .line 2
    .line 3
    return p0
.end method

.method public getVariableLengthEncoding()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->varEncoding:Z

    .line 2
    .line 3
    return p0
.end method

.method public setCopyTransient(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->copyTransient:Z

    .line 2
    .line 3
    sget-boolean p0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v0, "FieldSerializerConfig copyTransient: "

    .line 10
    .line 11
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "kryo"

    .line 22
    .line 23
    invoke-static {p1, p0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public setExtendedFieldNames(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->extendedFieldNames:Z

    .line 2
    .line 3
    sget-boolean p0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v0, "FieldSerializerConfig extendedFieldNames: "

    .line 10
    .line 11
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "kryo"

    .line 22
    .line 23
    invoke-static {p1, p0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public setFieldsAsAccessible(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->setFieldsAsAccessible:Z

    .line 2
    .line 3
    sget-boolean p0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v0, "FieldSerializerConfig setFieldsAsAccessible: "

    .line 10
    .line 11
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "kryo"

    .line 22
    .line 23
    invoke-static {p1, p0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public setFieldsCanBeNull(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->fieldsCanBeNull:Z

    .line 2
    .line 3
    sget-boolean p0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v0, "FieldSerializerConfig fieldsCanBeNull: "

    .line 10
    .line 11
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "kryo"

    .line 22
    .line 23
    invoke-static {p1, p0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public setFixedFieldTypes(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->fixedFieldTypes:Z

    .line 2
    .line 3
    sget-boolean p0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v0, "FieldSerializerConfig fixedFieldTypes: "

    .line 10
    .line 11
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "kryo"

    .line 22
    .line 23
    invoke-static {p1, p0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public setIgnoreSyntheticFields(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->ignoreSyntheticFields:Z

    .line 2
    .line 3
    sget-boolean p0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v0, "FieldSerializerConfig ignoreSyntheticFields: "

    .line 10
    .line 11
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "kryo"

    .line 22
    .line 23
    invoke-static {p1, p0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public setSerializeTransient(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->serializeTransient:Z

    .line 2
    .line 3
    sget-boolean p0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v0, "FieldSerializerConfig serializeTransient: "

    .line 10
    .line 11
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "kryo"

    .line 22
    .line 23
    invoke-static {p1, p0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public setVariableLengthEncoding(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->varEncoding:Z

    .line 2
    .line 3
    sget-boolean p0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v0, "FieldSerializerConfig variable length encoding: "

    .line 10
    .line 11
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "kryo"

    .line 22
    .line 23
    invoke-static {p1, p0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method
