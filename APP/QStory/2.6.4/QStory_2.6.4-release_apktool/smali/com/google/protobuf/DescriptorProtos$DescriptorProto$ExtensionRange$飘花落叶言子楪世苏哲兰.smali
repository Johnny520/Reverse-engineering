.class public final Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;
.super Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言子世兰苏哲楪;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170"
.end annotation


# instance fields
.field private bitField0_:I

.field private end_:I

.field private optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a;"
        }
    .end annotation
.end field

.field private options_:Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

.field private start_:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->maybeForceBuilderInitialization()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    .line 11
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    return-void
.end method

.method private buildPartial0(Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->start_:I

    .line 8
    .line 9
    invoke-static {p1, v1}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;->access$3302(Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;I)I

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
    iget v2, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->end_:I

    .line 20
    .line 21
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;->access$3402(Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;I)I

    .line 22
    .line 23
    .line 24
    or-int/lit8 v1, v1, 0x2

    .line 25
    .line 26
    :cond_1
    and-int/lit8 v0, v0, 0x4

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->options_:Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏哲兰()Lcom/google/protobuf/GeneratedMessage;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

    .line 42
    .line 43
    :goto_1
    invoke-static {p1, p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;->access$3502(Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

    .line 44
    .line 45
    .line 46
    or-int/lit8 v1, v1, 0x4

    .line 47
    .line 48
    :cond_3
    invoke-static {p1, v1}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;->access$3676(Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;I)I

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子楪苏世哲兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object v0
.end method

.method private internalGetOptionsFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->getOptions()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->getParentForChildren()Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->isClean()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Z)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->options_:Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

    .line 26
    .line 27
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 28
    .line 29
    return-object p0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->internalGetOptionsFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method


# virtual methods
.method public build()Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;->isInitialized()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 18
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;

    move-result-object p0

    return-object p0
.end method

.method public buildPartial()Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->buildPartial0(Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;)V

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 19
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;

    move-result-object p0

    return-object p0
.end method

.method public clear()Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->start_:I

    .line 8
    .line 9
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->end_:I

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->options_:Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iput-object v0, v1, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 21
    .line 22
    :cond_0
    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 23
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 25
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 24
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 26
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public clearEnd()Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x3

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->end_:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearOptions()Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x5

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->options_:Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iput-object v0, v1, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public clearStart()Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x2

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->start_:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;
    .locals 0

    .line 7
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;

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
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子楪苏世哲兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getEnd()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->end_:I

    .line 2
    .line 3
    return p0
.end method

.method public getOptions()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->options_:Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    return-object p0

    .line 14
    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世兰苏哲()Lcom/google/protobuf/GeneratedMessage;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

    .line 19
    .line 20
    return-object p0
.end method

.method public getOptionsBuilder()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->internalGetOptionsFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世哲兰苏()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    return-object p0
.end method

.method public getOptionsOrBuilder()Lcom/google/protobuf/飘花落叶言子苏哲世兰楪;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世兰哲苏()Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/google/protobuf/飘花落叶言子苏哲世兰楪;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->options_:Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

    .line 13
    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :cond_1
    return-object p0
.end method

.method public getStart()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->start_:I

    .line 2
    .line 3
    return p0
.end method

.method public hasEnd()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasOptions()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasStart()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;
    .locals 2

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子楪苏世兰哲:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    const-class v0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;

    .line 4
    .line 5
    const-class v1, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->hasOptions()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->getOptions()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;->isInitialized()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x1

    .line 20
    return p0
.end method

.method public mergeFrom(Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;)Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 102
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 103
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;->hasStart()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 104
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;->getStart()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->setStart(I)Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;

    .line 105
    :cond_1
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;->hasEnd()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 106
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;->getEnd()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->setEnd(I)Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;

    .line 107
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;->hasOptions()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 108
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;->getOptions()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->mergeOptions(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;)Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;

    .line 109
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownFields(Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 110
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 99
    instance-of v0, p1, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;

    if-eqz v0, :cond_0

    .line 100
    check-cast p1, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;)Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0

    .line 101
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;

    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;
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
    if-nez v0, :cond_5

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
    if-eq v1, v3, :cond_4

    .line 17
    .line 18
    const/16 v3, 0x10

    .line 19
    .line 20
    if-eq v1, v3, :cond_3

    .line 21
    .line 22
    const/16 v3, 0x1a

    .line 23
    .line 24
    if-eq v1, v3, :cond_2

    .line 25
    .line 26
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->parseUnknownField(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;I)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    :cond_1
    move v0, v2

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_2

    .line 36
    :catch_0
    move-exception p1

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->internalGetOptionsFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世哲兰苏()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲苏世(Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)V

    .line 47
    .line 48
    .line 49
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 50
    .line 51
    or-int/lit8 v1, v1, 0x4

    .line 52
    .line 53
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰苏世哲()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->end_:I

    .line 61
    .line 62
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 63
    .line 64
    or-int/lit8 v1, v1, 0x2

    .line 65
    .line 66
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰苏世哲()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->start_:I

    .line 74
    .line 75
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 76
    .line 77
    or-int/2addr v1, v2

    .line 78
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 91
    .line 92
    .line 93
    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 98
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 97
    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 96
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 95
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 94
    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 111
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public mergeOptions(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;)Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x4

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->options_:Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->getOptionsBuilder()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->options_:Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪苏世哲兰(Lcom/google/protobuf/GeneratedMessage;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object p1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->options_:Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 40
    .line 41
    or-int/lit8 p1, p1, 0x4

    .line 42
    .line 43
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-object p0
.end method

.method public setEnd(I)Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->end_:I

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setOptions(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->options_:Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/GeneratedMessage;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 20
    .line 21
    or-int/lit8 p1, p1, 0x4

    .line 22
    .line 23
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public setOptions(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;)Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->options_:Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;

    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/GeneratedMessage;)V

    .line 33
    :goto_0
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 34
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0
.end method

.method public setStart(I)Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->start_:I

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method
