.class public final Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;
.super Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言世哲子楪兰苏;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/Mixin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170"
.end annotation


# instance fields
.field private bitField0_:I

.field private name_:Ljava/lang/Object;

.field private root_:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->root_:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言世哲子楪苏兰;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    .line 14
    const-string p1, ""

    iput-object p1, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

    .line 15
    iput-object p1, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->root_:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言世哲子楪苏兰;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    return-void
.end method

.method private buildPartial0(Lcom/google/protobuf/Mixin;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1, v1}, Lcom/google/protobuf/Mixin;->access$302(Lcom/google/protobuf/Mixin;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    and-int/lit8 v0, v0, 0x2

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object p0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->root_:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-static {p1, p0}, Lcom/google/protobuf/Mixin;->access$402(Lcom/google/protobuf/Mixin;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public build()Lcom/google/protobuf/Mixin;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/Mixin;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/Mixin;->isInitialized()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->newUninitializedMessageException(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/UninitializedMessageException;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    throw p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/Mixin;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 18
    invoke-virtual {p0}, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/Mixin;

    move-result-object p0

    return-object p0
.end method

.method public buildPartial()Lcom/google/protobuf/Mixin;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/protobuf/Mixin;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/Mixin;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;Lcom/google/protobuf/飘花落叶言世哲子楪苏兰;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->buildPartial0(Lcom/google/protobuf/Mixin;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onBuilt()V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 18
    invoke-virtual {p0}, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/Mixin;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 19
    invoke-virtual {p0}, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/Mixin;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public clear()Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const-string v0, ""

    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->root_:Ljava/lang/Object;

    .line 12
    .line 13
    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public clearName()Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/Mixin;->getDefaultInstance()Lcom/google/protobuf/Mixin;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/Mixin;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    and-int/lit8 v0, v0, -0x2

    .line 14
    .line 15
    iput v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public clearRoot()Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/Mixin;->getDefaultInstance()Lcom/google/protobuf/Mixin;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/Mixin;->getRoot()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->root_:Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    and-int/lit8 v0, v0, -0x3

    .line 14
    .line 15
    iput v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/Mixin;
    .locals 0

    .line 7
    invoke-static {}, Lcom/google/protobuf/Mixin;->getDefaultInstance()Lcom/google/protobuf/Mixin;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/Mixin;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/Mixin;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 0

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Ljava/lang/String;

    .line 17
    .line 18
    return-object v0
.end method

.method public getNameBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public getRoot()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->root_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->root_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Ljava/lang/String;

    .line 17
    .line 18
    return-object v0
.end method

.method public getRootBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->root_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->root_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;
    .locals 2

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰哲苏:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    const-class v0, Lcom/google/protobuf/Mixin;

    .line 4
    .line 5
    const-class v1, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final isInitialized()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Mixin;)Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 80
    invoke-static {}, Lcom/google/protobuf/Mixin;->getDefaultInstance()Lcom/google/protobuf/Mixin;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 81
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/Mixin;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 82
    invoke-static {p1}, Lcom/google/protobuf/Mixin;->access$300(Lcom/google/protobuf/Mixin;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

    .line 83
    iget v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 84
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 85
    :cond_1
    invoke-virtual {p1}, Lcom/google/protobuf/Mixin;->getRoot()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 86
    invoke-static {p1}, Lcom/google/protobuf/Mixin;->access$400(Lcom/google/protobuf/Mixin;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->root_:Ljava/lang/Object;

    .line 87
    iget v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 88
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 89
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownFields(Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 90
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 77
    instance-of v0, p1, Lcom/google/protobuf/Mixin;

    if-eqz v0, :cond_0

    .line 78
    check-cast p1, Lcom/google/protobuf/Mixin;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/Mixin;)Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0

    .line 79
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;

    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :cond_0
    :goto_0
    if-nez v0, :cond_4

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世苏哲兰楪()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    const/16 v3, 0xa

    .line 15
    .line 16
    if-eq v1, v3, :cond_3

    .line 17
    .line 18
    const/16 v3, 0x12

    .line 19
    .line 20
    if-eq v1, v3, :cond_2

    .line 21
    .line 22
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->parseUnknownField(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;I)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    :cond_1
    move v0, v2

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_2

    .line 32
    :catch_0
    move-exception p1

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世苏哲楪兰()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iput-object v1, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->root_:Ljava/lang/Object;

    .line 39
    .line 40
    iget v1, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 41
    .line 42
    or-int/lit8 v1, v1, 0x2

    .line 43
    .line 44
    iput v1, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世苏哲楪兰()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iput-object v1, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

    .line 52
    .line 53
    iget v1, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 54
    .line 55
    or-int/2addr v1, v2

    .line 56
    iput v1, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 69
    .line 70
    .line 71
    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 76
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 75
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 74
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 73
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 72
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 91
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public setName(Ljava/lang/String;)Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setNameBytes(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

    .line 8
    .line 9
    iget p1, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    iput p1, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public setRoot(Ljava/lang/String;)Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->root_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x2

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setRootBytes(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->root_:Ljava/lang/Object;

    .line 8
    .line 9
    iget p1, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x2

    .line 12
    .line 13
    iput p1, p0, Lcom/google/protobuf/Mixin$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method
