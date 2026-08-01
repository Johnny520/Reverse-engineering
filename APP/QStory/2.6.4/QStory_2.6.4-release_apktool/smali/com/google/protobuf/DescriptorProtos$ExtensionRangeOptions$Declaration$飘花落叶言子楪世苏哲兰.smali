.class public final Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;
.super Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言子苏哲楪兰世;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170"
.end annotation


# instance fields
.field private bitField0_:I

.field private fullName_:Ljava/lang/Object;

.field private number_:I

.field private repeated_:Z

.field private reserved_:Z

.field private type_:Ljava/lang/Object;


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
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->fullName_:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->type_:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    .line 14
    const-string p1, ""

    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->fullName_:Ljava/lang/Object;

    .line 15
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->type_:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    return-void
.end method

.method private buildPartial0(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->number_:I

    .line 8
    .line 9
    invoke-static {p1, v1}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->access$6702(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;I)I

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
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->fullName_:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->access$6802(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->type_:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->access$6902(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->reserved_:Z

    .line 42
    .line 43
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->access$7002(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;Z)Z

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
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->repeated_:Z

    .line 53
    .line 54
    invoke-static {p1, p0}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->access$7102(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;Z)Z

    .line 55
    .line 56
    .line 57
    or-int/lit8 v1, v1, 0x10

    .line 58
    .line 59
    :cond_4
    invoke-static {p1, v1}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->access$7276(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;I)I

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子楪哲世苏兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public build()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->isInitialized()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 18
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;

    move-result-object p0

    return-object p0
.end method

.method public buildPartial()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->buildPartial0(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;)V

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 19
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;

    move-result-object p0

    return-object p0
.end method

.method public clear()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->number_:I

    .line 8
    .line 9
    const-string v1, ""

    .line 10
    .line 11
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->fullName_:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->type_:Ljava/lang/Object;

    .line 14
    .line 15
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->reserved_:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->repeated_:Z

    .line 18
    .line 19
    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 20
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 22
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 21
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 23
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public clearFullName()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->getFullName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->fullName_:Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    and-int/lit8 v0, v0, -0x3

    .line 14
    .line 15
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public clearNumber()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x2

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->number_:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearRepeated()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x11

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->repeated_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearReserved()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x9

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->reserved_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearType()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->getType()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->type_:Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    and-int/lit8 v0, v0, -0x5

    .line 14
    .line 15
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;
    .locals 0

    .line 7
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;

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
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子楪哲世苏兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getFullName()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->fullName_:Ljava/lang/Object;

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
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->fullName_:Ljava/lang/Object;

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

.method public getFullNameBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->fullName_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->fullName_:Ljava/lang/Object;

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

.method public getNumber()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->number_:I

    .line 2
    .line 3
    return p0
.end method

.method public getRepeated()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->repeated_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getReserved()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->reserved_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getType()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->type_:Ljava/lang/Object;

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
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->type_:Ljava/lang/Object;

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

.method public getTypeBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->type_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->type_:Ljava/lang/Object;

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

.method public hasFullName()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasNumber()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasRepeated()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasReserved()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasType()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;
    .locals 2

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子楪哲世兰苏:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    const-class v0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;

    .line 4
    .line 5
    const-class v1, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;

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

.method public mergeFrom(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 130
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 131
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->hasNumber()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 132
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->getNumber()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->setNumber(I)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;

    .line 133
    :cond_1
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->hasFullName()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 134
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->access$6800(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->fullName_:Ljava/lang/Object;

    .line 135
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 136
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 137
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->hasType()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 138
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->access$6900(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->type_:Ljava/lang/Object;

    .line 139
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 140
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 141
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->hasReserved()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 142
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->getReserved()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->setReserved(Z)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;

    .line 143
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->hasRepeated()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 144
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;->getRepeated()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->setRepeated(Z)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;

    .line 145
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownFields(Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 146
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 127
    instance-of v0, p1, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;

    if-eqz v0, :cond_0

    .line 128
    check-cast p1, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0

    .line 129
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;

    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;
    .locals 5

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :cond_0
    :goto_0
    if-nez v0, :cond_7

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
    if-eq v1, v3, :cond_6

    .line 17
    .line 18
    const/16 v4, 0x12

    .line 19
    .line 20
    if-eq v1, v4, :cond_5

    .line 21
    .line 22
    const/16 v4, 0x1a

    .line 23
    .line 24
    if-eq v1, v4, :cond_4

    .line 25
    .line 26
    const/16 v4, 0x28

    .line 27
    .line 28
    if-eq v1, v4, :cond_3

    .line 29
    .line 30
    const/16 v3, 0x30

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
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->repeated_:Z

    .line 51
    .line 52
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 53
    .line 54
    or-int/lit8 v1, v1, 0x10

    .line 55
    .line 56
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->reserved_:Z

    .line 64
    .line 65
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 66
    .line 67
    or-int/2addr v1, v3

    .line 68
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/ByteString;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->type_:Ljava/lang/Object;

    .line 76
    .line 77
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 78
    .line 79
    or-int/lit8 v1, v1, 0x4

    .line 80
    .line 81
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/ByteString;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->fullName_:Ljava/lang/Object;

    .line 89
    .line 90
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 91
    .line 92
    or-int/lit8 v1, v1, 0x2

    .line 93
    .line 94
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_6
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰苏世哲()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->number_:I

    .line 102
    .line 103
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 104
    .line 105
    or-int/2addr v1, v2

    .line 106
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 114
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 115
    .line 116
    .line 117
    throw p1

    .line 118
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 119
    .line 120
    .line 121
    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 126
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 125
    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 124
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 123
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 122
    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 147
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public setFullName(Ljava/lang/String;)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->fullName_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x2

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setFullNameBytes(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->fullName_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x2

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setNumber(I)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->number_:I

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setRepeated(Z)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->repeated_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x10

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setReserved(Z)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->reserved_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x8

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setType(Ljava/lang/String;)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->type_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x4

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setTypeBytes(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->type_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x4

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method
