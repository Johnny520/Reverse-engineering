.class public final Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field private final cgiId:I

.field private final data:[B

.field private final direction:Ljava/lang/String;

.field private volatile json:Ljava/lang/String;

.field private final timestamp:J

.field private final uri:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I[BJ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    move-object p1, v0

    .line 9
    :cond_0
    iput-object p1, p0, Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;->direction:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    const-string p1, "null"

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    :cond_1
    move-object p2, v0

    .line 22
    :cond_2
    iput-object p2, p0, Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;->uri:Ljava/lang/String;

    .line 23
    .line 24
    iput p3, p0, Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;->cgiId:I

    .line 25
    .line 26
    if-nez p4, :cond_3

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    new-array p1, p1, [B

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_3
    invoke-virtual {p4}, [B->clone()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, [B

    .line 37
    .line 38
    :goto_0
    iput-object p1, p0, Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;->data:[B

    .line 39
    .line 40
    iput-wide p5, p0, Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;->timestamp:J

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public getCgiId()I
    .locals 1

    .line 1
    iget v0, p0, Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;->cgiId:I

    .line 2
    .line 3
    return v0
.end method

.method public getData()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;->data:[B

    .line 2
    .line 3
    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [B

    .line 8
    .line 9
    return-object v0
.end method

.method public getDirection()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;->direction:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getJson()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;->json:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    monitor-enter p0

    .line 7
    :try_start_0
    iget-object v0, p0, Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;->json:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :try_start_1
    iget-object v0, p0, Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;->data:[B

    .line 12
    .line 13
    invoke-static {v0}, Lig/a;->Z([B)Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    :try_start_2
    const-string v0, "{}"

    .line 23
    .line 24
    :goto_0
    iput-object v0, p0, Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;->json:Ljava/lang/String;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :catchall_1
    move-exception v0

    .line 28
    goto :goto_2

    .line 29
    :cond_1
    :goto_1
    monitor-exit p0

    .line 30
    return-object v0

    .line 31
    :goto_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 32
    throw v0
.end method

.method public getJsonObject()Lorg/json/JSONObject;
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-virtual {p0}, Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;->getJson()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :catchall_0
    new-instance v0, Lorg/json/JSONObject;

    .line 12
    .line 13
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public getLength()I
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;->data:[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    return v0
.end method

.method public getTimestamp()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;->timestamp:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getUri()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;->uri:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public isRequest()Z
    .locals 2

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    iget-object v1, p0, Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;->direction:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public isResponse()Z
    .locals 2

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    iget-object v1, p0, Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;->direction:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method
