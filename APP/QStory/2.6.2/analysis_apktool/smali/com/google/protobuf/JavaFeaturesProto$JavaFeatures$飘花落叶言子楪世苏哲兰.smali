.class public final Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;
.super Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言世子兰楪苏哲;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170"
.end annotation


# instance fields
.field private bitField0_:I

.field private largeEnum_:Z

.field private legacyClosedEnum_:Z

.field private nestInFileClass_:I

.field private useOldOuterClassnameDefault_:Z

.field private utf8Validation_:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->utf8Validation_:I

    .line 6
    .line 7
    iput v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->nestInFileClass_:I

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言世子哲楪苏兰;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    const/4 p1, 0x0

    .line 13
    iput p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->utf8Validation_:I

    .line 14
    iput p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->nestInFileClass_:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言世子哲楪苏兰;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    return-void
.end method

.method private buildPartial0(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-boolean v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->legacyClosedEnum_:Z

    .line 8
    .line 9
    invoke-static {p1, v1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->access$1002(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;Z)Z

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
    iget v2, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->utf8Validation_:I

    .line 20
    .line 21
    invoke-static {p1, v2}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->access$1102(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;I)I

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
    iget-boolean v2, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->largeEnum_:Z

    .line 31
    .line 32
    invoke-static {p1, v2}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->access$1202(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;Z)Z

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
    iget-boolean v2, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->useOldOuterClassnameDefault_:Z

    .line 42
    .line 43
    invoke-static {p1, v2}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->access$1302(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;Z)Z

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
    iget p0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->nestInFileClass_:I

    .line 53
    .line 54
    invoke-static {p1, p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->access$1402(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;I)I

    .line 55
    .line 56
    .line 57
    or-int/lit8 v1, v1, 0x10

    .line 58
    .line 59
    :cond_4
    invoke-static {p1, v1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->access$1576(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;I)I

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言世子兰楪哲苏;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public build()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->isInitialized()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 18
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    move-result-object p0

    return-object p0
.end method

.method public buildPartial()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;Lcom/google/protobuf/飘花落叶言世子哲楪苏兰;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->buildPartial0(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;)V

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
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 19
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 18
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public clear()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->legacyClosedEnum_:Z

    .line 8
    .line 9
    iput v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->utf8Validation_:I

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->largeEnum_:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->useOldOuterClassnameDefault_:Z

    .line 14
    .line 15
    iput v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->nestInFileClass_:I

    .line 16
    .line 17
    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 20
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 19
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 21
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public clearLargeEnum()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x5

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->largeEnum_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearLegacyClosedEnum()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x2

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->legacyClosedEnum_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearNestInFileClass()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x11

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->nestInFileClass_:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearUseOldOuterClassnameDefault()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x9

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->useOldOuterClassnameDefault_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearUtf8Validation()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x3

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->utf8Validation_:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;
    .locals 0

    .line 7
    invoke-static {}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->getDefaultInstance()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

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
    sget-object p0, Lcom/google/protobuf/飘花落叶言世子兰楪哲苏;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLargeEnum()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->largeEnum_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getLegacyClosedEnum()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->legacyClosedEnum_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getNestInFileClass()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$NestInFileClassFeature$NestInFileClass;
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->nestInFileClass_:I

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$NestInFileClassFeature$NestInFileClass;->forNumber(I)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$NestInFileClassFeature$NestInFileClass;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$NestInFileClassFeature$NestInFileClass;->NEST_IN_FILE_CLASS_UNKNOWN:Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$NestInFileClassFeature$NestInFileClass;

    .line 10
    .line 11
    :cond_0
    return-object p0
.end method

.method public getUseOldOuterClassnameDefault()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->useOldOuterClassnameDefault_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getUtf8Validation()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$Utf8Validation;
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->utf8Validation_:I

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$Utf8Validation;->forNumber(I)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$Utf8Validation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$Utf8Validation;->UTF8_VALIDATION_UNKNOWN:Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$Utf8Validation;

    .line 10
    .line 11
    :cond_0
    return-object p0
.end method

.method public hasLargeEnum()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasLegacyClosedEnum()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasNestInFileClass()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasUseOldOuterClassnameDefault()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasUtf8Validation()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;
    .locals 2

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言世子兰楪哲苏;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    const-class v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    .line 4
    .line 5
    const-class v1, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

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

.method public mergeFrom(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 150
    invoke-static {}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->getDefaultInstance()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 151
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasLegacyClosedEnum()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 152
    invoke-virtual {p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->getLegacyClosedEnum()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->setLegacyClosedEnum(Z)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    .line 153
    :cond_1
    invoke-virtual {p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasUtf8Validation()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 154
    invoke-virtual {p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->getUtf8Validation()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$Utf8Validation;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->setUtf8Validation(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$Utf8Validation;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    .line 155
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasLargeEnum()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 156
    invoke-virtual {p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->getLargeEnum()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->setLargeEnum(Z)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    .line 157
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasUseOldOuterClassnameDefault()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 158
    invoke-virtual {p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->getUseOldOuterClassnameDefault()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->setUseOldOuterClassnameDefault(Z)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    .line 159
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->hasNestInFileClass()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 160
    invoke-virtual {p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->getNestInFileClass()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$NestInFileClassFeature$NestInFileClass;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->setNestInFileClass(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$NestInFileClassFeature$NestInFileClass;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    .line 161
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownFields(Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 162
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 147
    instance-of v0, p1, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    if-eqz v0, :cond_0

    .line 148
    check-cast p1, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0

    .line 149
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;

    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :cond_0
    :goto_0
    if-nez v0, :cond_9

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
    const/16 v5, 0x18

    .line 23
    .line 24
    if-eq v1, v5, :cond_5

    .line 25
    .line 26
    const/16 v5, 0x20

    .line 27
    .line 28
    if-eq v1, v5, :cond_4

    .line 29
    .line 30
    const/16 v3, 0x28

    .line 31
    .line 32
    if-eq v1, v3, :cond_2

    .line 33
    .line 34
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->parseUnknownField(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;I)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    :cond_1
    move v0, v2

    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_2

    .line 44
    :catch_0
    move-exception p1

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-static {v1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$NestInFileClassFeature$NestInFileClass;->forNumber(I)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$NestInFileClassFeature$NestInFileClass;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    const/4 v2, 0x5

    .line 57
    invoke-virtual {p0, v2, v1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownVarintField(II)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    iput v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->nestInFileClass_:I

    .line 62
    .line 63
    iget v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 64
    .line 65
    or-int/2addr v1, v4

    .line 66
    iput v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    iput-boolean v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->useOldOuterClassnameDefault_:Z

    .line 74
    .line 75
    iget v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 76
    .line 77
    or-int/2addr v1, v3

    .line 78
    iput v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    iput-boolean v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->largeEnum_:Z

    .line 86
    .line 87
    iget v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 88
    .line 89
    or-int/lit8 v1, v1, 0x4

    .line 90
    .line 91
    iput v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_6
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    invoke-static {v1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$Utf8Validation;->forNumber(I)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$Utf8Validation;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    const/4 v3, 0x2

    .line 103
    if-nez v2, :cond_7

    .line 104
    .line 105
    invoke-virtual {p0, v3, v1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownVarintField(II)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_7
    iput v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->utf8Validation_:I

    .line 110
    .line 111
    iget v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 112
    .line 113
    or-int/2addr v1, v3

    .line 114
    iput v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_8
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    iput-boolean v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->legacyClosedEnum_:Z

    .line 122
    .line 123
    iget v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 124
    .line 125
    or-int/2addr v1, v2

    .line 126
    iput v1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 135
    .line 136
    .line 137
    throw p1

    .line 138
    :cond_9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 139
    .line 140
    .line 141
    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 146
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 145
    invoke-virtual {p0, p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 144
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 143
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 142
    invoke-virtual {p0, p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 163
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public setLargeEnum(Z)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->largeEnum_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x4

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setLegacyClosedEnum(Z)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->legacyClosedEnum_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setNestInFileClass(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$NestInFileClassFeature$NestInFileClass;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x10

    .line 7
    .line 8
    iput v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$NestInFileClassFeature$NestInFileClass;->getNumber()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->nestInFileClass_:I

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public setUseOldOuterClassnameDefault(Z)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->useOldOuterClassnameDefault_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x8

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setUtf8Validation(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$Utf8Validation;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x2

    .line 7
    .line 8
    iput v0, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$Utf8Validation;->getNumber()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->utf8Validation_:I

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method
