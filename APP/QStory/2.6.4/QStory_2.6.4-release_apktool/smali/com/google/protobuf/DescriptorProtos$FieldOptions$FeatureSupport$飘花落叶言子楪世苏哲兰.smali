.class public final Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;
.super Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言子哲兰楪世苏;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170"
.end annotation


# instance fields
.field private bitField0_:I

.field private deprecationWarning_:Ljava/lang/Object;

.field private editionDeprecated_:I

.field private editionIntroduced_:I

.field private editionRemoved_:I

.field private removalError_:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionIntroduced_:I

    .line 6
    .line 7
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionDeprecated_:I

    .line 8
    .line 9
    const-string v1, ""

    .line 10
    .line 11
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->deprecationWarning_:Ljava/lang/Object;

    .line 12
    .line 13
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionRemoved_:I

    .line 14
    .line 15
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->removalError_:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V
    .locals 1

    .line 20
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    const/4 p1, 0x0

    .line 21
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionIntroduced_:I

    .line 22
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionDeprecated_:I

    .line 23
    const-string v0, ""

    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->deprecationWarning_:Ljava/lang/Object;

    .line 24
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionRemoved_:I

    .line 25
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->removalError_:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    return-void
.end method

.method private buildPartial0(Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionIntroduced_:I

    .line 8
    .line 9
    invoke-static {p1, v1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->access$21102(Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;I)I

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    :goto_0
    and-int/lit8 v2, v0, 0x2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionDeprecated_:I

    .line 20
    .line 21
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->access$21202(Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;I)I

    .line 22
    .line 23
    .line 24
    or-int/lit8 v1, v1, 0x2

    .line 25
    .line 26
    :cond_1
    and-int/lit8 v2, v0, 0x4

    .line 27
    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->deprecationWarning_:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->access$21302(Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    or-int/lit8 v1, v1, 0x4

    .line 36
    .line 37
    :cond_2
    and-int/lit8 v2, v0, 0x8

    .line 38
    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    iget v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionRemoved_:I

    .line 42
    .line 43
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->access$21402(Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;I)I

    .line 44
    .line 45
    .line 46
    or-int/lit8 v1, v1, 0x8

    .line 47
    .line 48
    :cond_3
    and-int/lit8 v0, v0, 0x10

    .line 49
    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->removalError_:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-static {p1, p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->access$21502(Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    or-int/lit8 v1, v1, 0x10

    .line 58
    .line 59
    :cond_4
    invoke-static {p1, v1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->access$21676(Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;I)I

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世哲楪苏兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public build()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->isInitialized()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 18
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    move-result-object p0

    return-object p0
.end method

.method public buildPartial()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->buildPartial0(Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;)V

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 19
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    move-result-object p0

    return-object p0
.end method

.method public clear()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionIntroduced_:I

    .line 8
    .line 9
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionDeprecated_:I

    .line 10
    .line 11
    const-string v1, ""

    .line 12
    .line 13
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->deprecationWarning_:Ljava/lang/Object;

    .line 14
    .line 15
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionRemoved_:I

    .line 16
    .line 17
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->removalError_:Ljava/lang/Object;

    .line 18
    .line 19
    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 20
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 22
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 21
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 23
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public clearDeprecationWarning()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->getDeprecationWarning()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->deprecationWarning_:Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    and-int/lit8 v0, v0, -0x5

    .line 14
    .line 15
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public clearEditionDeprecated()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x3

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionDeprecated_:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearEditionIntroduced()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x2

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionIntroduced_:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearEditionRemoved()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x9

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionRemoved_:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearRemovalError()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->getRemovalError()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->removalError_:Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    and-int/lit8 v0, v0, -0x11

    .line 14
    .line 15
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;
    .locals 0

    .line 7
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getDeprecationWarning()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->deprecationWarning_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->deprecationWarning_:Ljava/lang/Object;

    .line 20
    .line 21
    :cond_0
    return-object v1

    .line 22
    :cond_1
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    return-object v0
.end method

.method public getDeprecationWarningBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->deprecationWarning_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->deprecationWarning_:Ljava/lang/Object;

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

.method public getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 0

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世哲楪苏兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getEditionDeprecated()Lcom/google/protobuf/DescriptorProtos$Edition;
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionDeprecated_:I

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/protobuf/DescriptorProtos$Edition;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 10
    .line 11
    :cond_0
    return-object p0
.end method

.method public getEditionIntroduced()Lcom/google/protobuf/DescriptorProtos$Edition;
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionIntroduced_:I

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/protobuf/DescriptorProtos$Edition;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 10
    .line 11
    :cond_0
    return-object p0
.end method

.method public getEditionRemoved()Lcom/google/protobuf/DescriptorProtos$Edition;
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionRemoved_:I

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/protobuf/DescriptorProtos$Edition;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 10
    .line 11
    :cond_0
    return-object p0
.end method

.method public getRemovalError()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->removalError_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->removalError_:Ljava/lang/Object;

    .line 20
    .line 21
    :cond_0
    return-object v1

    .line 22
    :cond_1
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    return-object v0
.end method

.method public getRemovalErrorBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->removalError_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->removalError_:Ljava/lang/Object;

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

.method public hasDeprecationWarning()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x4

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public hasEditionDeprecated()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x2

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public hasEditionIntroduced()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    and-int/2addr p0, v0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public hasEditionRemoved()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x8

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public hasRemovalError()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x10

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;
    .locals 2

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世哲楪兰苏:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    const-class v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 4
    .line 5
    const-class v1, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;

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

.method public mergeFrom(Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 160
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 161
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->hasEditionIntroduced()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 162
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->getEditionIntroduced()Lcom/google/protobuf/DescriptorProtos$Edition;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->setEditionIntroduced(Lcom/google/protobuf/DescriptorProtos$Edition;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;

    .line 163
    :cond_1
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->hasEditionDeprecated()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 164
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->getEditionDeprecated()Lcom/google/protobuf/DescriptorProtos$Edition;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->setEditionDeprecated(Lcom/google/protobuf/DescriptorProtos$Edition;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;

    .line 165
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->hasDeprecationWarning()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 166
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->access$21300(Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->deprecationWarning_:Ljava/lang/Object;

    .line 167
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 168
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 169
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->hasEditionRemoved()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 170
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->getEditionRemoved()Lcom/google/protobuf/DescriptorProtos$Edition;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->setEditionRemoved(Lcom/google/protobuf/DescriptorProtos$Edition;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;

    .line 171
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->hasRemovalError()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 172
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->access$21500(Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->removalError_:Ljava/lang/Object;

    .line 173
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 174
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 175
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownFields(Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 176
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 157
    instance-of v0, p1, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    if-eqz v0, :cond_0

    .line 158
    check-cast p1, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0

    .line 159
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;

    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :cond_0
    :goto_0
    if-nez v0, :cond_a

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
    const/16 v3, 0x8

    .line 15
    .line 16
    if-eq v1, v3, :cond_8

    .line 17
    .line 18
    const/16 v4, 0x10

    .line 19
    .line 20
    if-eq v1, v4, :cond_6

    .line 21
    .line 22
    const/16 v5, 0x1a

    .line 23
    .line 24
    const/4 v6, 0x4

    .line 25
    if-eq v1, v5, :cond_5

    .line 26
    .line 27
    const/16 v5, 0x20

    .line 28
    .line 29
    if-eq v1, v5, :cond_3

    .line 30
    .line 31
    const/16 v3, 0x2a

    .line 32
    .line 33
    if-eq v1, v3, :cond_2

    .line 34
    .line 35
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->parseUnknownField(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;I)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    :cond_1
    move v0, v2

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_2

    .line 45
    :catch_0
    move-exception p1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/ByteString;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->removalError_:Ljava/lang/Object;

    .line 52
    .line 53
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 54
    .line 55
    or-int/2addr v1, v4

    .line 56
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-static {v1}, Lcom/google/protobuf/DescriptorProtos$Edition;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    if-nez v2, :cond_4

    .line 68
    .line 69
    invoke-virtual {p0, v6, v1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownVarintField(II)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionRemoved_:I

    .line 74
    .line 75
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 76
    .line 77
    or-int/2addr v1, v3

    .line 78
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/ByteString;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->deprecationWarning_:Ljava/lang/Object;

    .line 86
    .line 87
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 88
    .line 89
    or-int/2addr v1, v6

    .line 90
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_6
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    invoke-static {v1}, Lcom/google/protobuf/DescriptorProtos$Edition;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    const/4 v3, 0x2

    .line 102
    if-nez v2, :cond_7

    .line 103
    .line 104
    invoke-virtual {p0, v3, v1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownVarintField(II)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_7
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionDeprecated_:I

    .line 109
    .line 110
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 111
    .line 112
    or-int/2addr v1, v3

    .line 113
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_8
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    invoke-static {v1}, Lcom/google/protobuf/DescriptorProtos$Edition;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    if-nez v3, :cond_9

    .line 125
    .line 126
    invoke-virtual {p0, v2, v1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownVarintField(II)V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_9
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionIntroduced_:I

    .line 131
    .line 132
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 133
    .line 134
    or-int/2addr v1, v2

    .line 135
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    .line 137
    goto/16 :goto_0

    .line 138
    .line 139
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 144
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 145
    .line 146
    .line 147
    throw p1

    .line 148
    :cond_a
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 149
    .line 150
    .line 151
    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 156
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 155
    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 154
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 153
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 152
    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 177
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public setDeprecationWarning(Ljava/lang/String;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->deprecationWarning_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x4

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setDeprecationWarningBytes(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->deprecationWarning_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x4

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setEditionDeprecated(Lcom/google/protobuf/DescriptorProtos$Edition;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x2

    .line 7
    .line 8
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$Edition;->getNumber()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionDeprecated_:I

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public setEditionIntroduced(Lcom/google/protobuf/DescriptorProtos$Edition;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$Edition;->getNumber()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionIntroduced_:I

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public setEditionRemoved(Lcom/google/protobuf/DescriptorProtos$Edition;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x8

    .line 7
    .line 8
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$Edition;->getNumber()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->editionRemoved_:I

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public setRemovalError(Ljava/lang/String;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->removalError_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x10

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setRemovalErrorBytes(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->removalError_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x10

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method
