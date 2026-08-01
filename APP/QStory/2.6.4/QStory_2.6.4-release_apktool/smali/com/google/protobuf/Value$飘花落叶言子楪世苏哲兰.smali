.class public final Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
.super Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言苏楪世兰哲子;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/Value;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170"
.end annotation


# instance fields
.field private bitField0_:I

.field private kindCase_:I

.field private kind_:Ljava/lang/Object;

.field private listValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a;"
        }
    .end annotation
.end field

.field private structValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a;"
        }
    .end annotation
.end field


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
    iput v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 6
    .line 7
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言苏楪世兰子哲;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言苏楪世兰子哲;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;-><init>()V

    return-void
.end method

.method private buildPartial0(Lcom/google/protobuf/Value;)V
    .locals 0

    .line 1
    return-void
.end method

.method private buildPartialOneofs(Lcom/google/protobuf/Value;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/google/protobuf/Value;->access$302(Lcom/google/protobuf/Value;I)I

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-static {p1, v0}, Lcom/google/protobuf/Value;->access$402(Lcom/google/protobuf/Value;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 12
    .line 13
    const/4 v1, 0x5

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->structValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏哲兰()Lcom/google/protobuf/GeneratedMessage;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {p1, v0}, Lcom/google/protobuf/Value;->access$402(Lcom/google/protobuf/Value;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    :cond_0
    iget v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 28
    .line 29
    const/4 v1, 0x6

    .line 30
    if-ne v0, v1, :cond_1

    .line 31
    .line 32
    iget-object p0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->listValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 33
    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏哲兰()Lcom/google/protobuf/GeneratedMessage;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p1, p0}, Lcom/google/protobuf/Value;->access$402(Lcom/google/protobuf/Value;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言世兰哲楪子苏;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object v0
.end method

.method private internalGetListValueFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->listValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    invoke-static {}, Lcom/google/protobuf/ListValue;->getDefaultInstance()Lcom/google/protobuf/ListValue;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 15
    .line 16
    :cond_0
    new-instance v0, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lcom/google/protobuf/ListValue;

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->getParentForChildren()Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->isClean()Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-direct {v0, v2, v3, v4}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Z)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->listValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    iput-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 37
    .line 38
    :cond_1
    iput v1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->listValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 44
    .line 45
    return-object p0
.end method

.method private internalGetStructValueFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->structValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    invoke-static {}, Lcom/google/protobuf/Struct;->getDefaultInstance()Lcom/google/protobuf/Struct;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 15
    .line 16
    :cond_0
    new-instance v0, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lcom/google/protobuf/Struct;

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->getParentForChildren()Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->isClean()Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-direct {v0, v2, v3, v4}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Z)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->structValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    iput-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 37
    .line 38
    :cond_1
    iput v1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->structValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 44
    .line 45
    return-object p0
.end method


# virtual methods
.method public build()Lcom/google/protobuf/Value;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/Value;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/Value;->isInitialized()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/Value;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 18
    invoke-virtual {p0}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/Value;

    move-result-object p0

    return-object p0
.end method

.method public buildPartial()Lcom/google/protobuf/Value;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/protobuf/Value;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/Value;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;Lcom/google/protobuf/飘花落叶言苏楪世兰子哲;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->buildPartial0(Lcom/google/protobuf/Value;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-direct {p0, v0}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->buildPartialOneofs(Lcom/google/protobuf/Value;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onBuilt()V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 21
    invoke-virtual {p0}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/Value;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 22
    invoke-virtual {p0}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/Value;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 27
    invoke-virtual {p0}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public clear()Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->structValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏兰哲()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->listValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏兰哲()V

    .line 19
    .line 20
    .line 21
    :cond_1
    iput v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 25
    .line 26
    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 29
    invoke-virtual {p0}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 28
    invoke-virtual {p0}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 30
    invoke-virtual {p0}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public clearBoolValue()Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-object p0
.end method

.method public clearKind()Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public clearListValue()Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->listValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x6

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    if-ne v1, v4, :cond_0

    .line 11
    .line 12
    iput v3, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 13
    .line 14
    iput-object v2, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-object p0

    .line 20
    :cond_1
    if-ne v1, v4, :cond_2

    .line 21
    .line 22
    iput v3, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 23
    .line 24
    iput-object v2, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 25
    .line 26
    :cond_2
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏兰哲()V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method public clearNullValue()Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-object p0
.end method

.method public clearNumberValue()Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-object p0
.end method

.method public clearStringValue()Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-object p0
.end method

.method public clearStructValue()Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->structValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x5

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    if-ne v1, v4, :cond_0

    .line 11
    .line 12
    iput v3, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 13
    .line 14
    iput-object v2, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-object p0

    .line 20
    :cond_1
    if-ne v1, v4, :cond_2

    .line 21
    .line 22
    iput v3, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 23
    .line 24
    iput-object v2, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 25
    .line 26
    :cond_2
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏兰哲()V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method public getBoolValue()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object p0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/Value;
    .locals 0

    .line 7
    invoke-static {}, Lcom/google/protobuf/Value;->getDefaultInstance()Lcom/google/protobuf/Value;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/Value;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/Value;

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
    sget-object p0, Lcom/google/protobuf/飘花落叶言世兰哲楪子苏;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getKindCase()Lcom/google/protobuf/Value$KindCase;
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/protobuf/Value$KindCase;->forNumber(I)Lcom/google/protobuf/Value$KindCase;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getListValue()Lcom/google/protobuf/ListValue;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->listValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lcom/google/protobuf/ListValue;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-static {}, Lcom/google/protobuf/ListValue;->getDefaultInstance()Lcom/google/protobuf/ListValue;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_1
    if-ne v1, v2, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世兰苏哲()Lcom/google/protobuf/GeneratedMessage;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lcom/google/protobuf/ListValue;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_2
    invoke-static {}, Lcom/google/protobuf/ListValue;->getDefaultInstance()Lcom/google/protobuf/ListValue;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public getListValueBuilder()Lcom/google/protobuf/ListValue$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->internalGetListValueFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世哲兰苏()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/google/protobuf/ListValue$飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    return-object p0
.end method

.method public getListValueOrBuilder()Lcom/google/protobuf/飘花落叶言世楪苏子哲兰;
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v2, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->listValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世兰哲苏()Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lcom/google/protobuf/飘花落叶言世楪苏子哲兰;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Lcom/google/protobuf/ListValue;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    invoke-static {}, Lcom/google/protobuf/ListValue;->getDefaultInstance()Lcom/google/protobuf/ListValue;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public getNullValue()Lcom/google/protobuf/NullValue;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    iget-object p0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-static {p0}, Lcom/google/protobuf/NullValue;->forNumber(I)Lcom/google/protobuf/NullValue;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    sget-object p0, Lcom/google/protobuf/NullValue;->UNRECOGNIZED:Lcom/google/protobuf/NullValue;

    .line 21
    .line 22
    :cond_0
    return-object p0

    .line 23
    :cond_1
    sget-object p0, Lcom/google/protobuf/NullValue;->NULL_VALUE:Lcom/google/protobuf/NullValue;

    .line 24
    .line 25
    return-object p0
.end method

.method public getNullValueValue()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object p0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public getNumberValue()D
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object p0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/lang/Double;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0

    .line 15
    :cond_0
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    return-wide v0
.end method

.method public getStringValue()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    const-string p0, ""

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 10
    .line 11
    instance-of v1, v0, Ljava/lang/String;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_1
    check-cast v0, Ljava/lang/String;

    .line 25
    .line 26
    return-object v0
.end method

.method public getStringValueBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    const-string p0, ""

    .line 7
    .line 8
    invoke-static {p0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 14
    .line 15
    instance-of v1, v0, Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    check-cast v0, Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_1
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 29
    .line 30
    return-object v0
.end method

.method public getStructValue()Lcom/google/protobuf/Struct;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->structValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lcom/google/protobuf/Struct;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-static {}, Lcom/google/protobuf/Struct;->getDefaultInstance()Lcom/google/protobuf/Struct;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_1
    if-ne v1, v2, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世兰苏哲()Lcom/google/protobuf/GeneratedMessage;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lcom/google/protobuf/Struct;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_2
    invoke-static {}, Lcom/google/protobuf/Struct;->getDefaultInstance()Lcom/google/protobuf/Struct;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public getStructValueBuilder()Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->internalGetStructValueFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世哲兰苏()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    return-object p0
.end method

.method public getStructValueOrBuilder()Lcom/google/protobuf/飘花落叶言世兰哲子苏楪;
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v2, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->structValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世兰哲苏()Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lcom/google/protobuf/飘花落叶言世兰哲子苏楪;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Lcom/google/protobuf/Struct;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    invoke-static {}, Lcom/google/protobuf/Struct;->getDefaultInstance()Lcom/google/protobuf/Struct;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public hasBoolValue()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public hasListValue()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public hasNullValue()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public hasNumberValue()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public hasStringValue()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public hasStructValue()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;
    .locals 2

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言世兰哲楪子苏;->飘花落叶言子楪世兰苏哲:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    const-class v0, Lcom/google/protobuf/Value;

    .line 4
    .line 5
    const-class v1, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;

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

.method public mergeFrom(Lcom/google/protobuf/Value;)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 3

    .line 152
    invoke-static {}, Lcom/google/protobuf/Value;->getDefaultInstance()Lcom/google/protobuf/Value;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 153
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/Value;->getKindCase()Lcom/google/protobuf/Value$KindCase;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_6

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    const/4 v2, 0x3

    if-eq v0, v1, :cond_4

    if-eq v0, v2, :cond_3

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 154
    :cond_1
    invoke-virtual {p1}, Lcom/google/protobuf/Value;->getListValue()Lcom/google/protobuf/ListValue;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->mergeListValue(Lcom/google/protobuf/ListValue;)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;

    goto :goto_0

    .line 155
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/Value;->getStructValue()Lcom/google/protobuf/Struct;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->mergeStructValue(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;

    goto :goto_0

    .line 156
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/Value;->getBoolValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->setBoolValue(Z)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;

    goto :goto_0

    .line 157
    :cond_4
    iput v2, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 158
    invoke-static {p1}, Lcom/google/protobuf/Value;->access$400(Lcom/google/protobuf/Value;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 159
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    goto :goto_0

    .line 160
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/Value;->getNumberValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->setNumberValue(D)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;

    goto :goto_0

    .line 161
    :cond_6
    invoke-virtual {p1}, Lcom/google/protobuf/Value;->getNullValueValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->setNullValueValue(I)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;

    .line 162
    :goto_0
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownFields(Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 163
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 149
    instance-of v0, p1, Lcom/google/protobuf/Value;

    if-eqz v0, :cond_0

    .line 150
    check-cast p1, Lcom/google/protobuf/Value;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/Value;)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0

    .line 151
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;

    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
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
    if-nez v0, :cond_8

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
    if-eq v1, v3, :cond_7

    .line 17
    .line 18
    const/16 v3, 0x11

    .line 19
    .line 20
    if-eq v1, v3, :cond_6

    .line 21
    .line 22
    const/16 v3, 0x1a

    .line 23
    .line 24
    if-eq v1, v3, :cond_5

    .line 25
    .line 26
    const/16 v3, 0x20

    .line 27
    .line 28
    if-eq v1, v3, :cond_4

    .line 29
    .line 30
    const/16 v3, 0x2a

    .line 31
    .line 32
    if-eq v1, v3, :cond_3

    .line 33
    .line 34
    const/16 v3, 0x32

    .line 35
    .line 36
    if-eq v1, v3, :cond_2

    .line 37
    .line 38
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->parseUnknownField(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;I)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    :cond_1
    move v0, v2

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_2

    .line 48
    :catch_0
    move-exception p1

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-direct {p0}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->internalGetListValueFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世哲兰苏()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲苏世(Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)V

    .line 59
    .line 60
    .line 61
    const/4 v1, 0x6

    .line 62
    iput v1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-direct {p0}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->internalGetStructValueFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世哲兰苏()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲苏世(Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)V

    .line 74
    .line 75
    .line 76
    const/4 v1, 0x5

    .line 77
    iput v1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iput-object v1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 89
    .line 90
    const/4 v1, 0x4

    .line 91
    iput v1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_5
    const/4 v1, 0x3

    .line 95
    iput v1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 96
    .line 97
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世苏哲楪兰()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iput-object v1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_6
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏世兰()D

    .line 105
    .line 106
    .line 107
    move-result-wide v1

    .line 108
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    iput-object v1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 113
    .line 114
    const/4 v1, 0x2

    .line 115
    iput v1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_7
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    iput v2, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 123
    .line 124
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    iput-object v1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 137
    .line 138
    .line 139
    throw p1

    .line 140
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 141
    .line 142
    .line 143
    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 148
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 147
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 146
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 145
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 144
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 164
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public mergeListValue(Lcom/google/protobuf/ListValue;)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->listValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {}, Lcom/google/protobuf/ListValue;->getDefaultInstance()Lcom/google/protobuf/ListValue;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lcom/google/protobuf/ListValue;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/google/protobuf/ListValue;->newBuilder(Lcom/google/protobuf/ListValue;)Lcom/google/protobuf/ListValue$飘花落叶言子楪世苏哲兰;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0, p1}, Lcom/google/protobuf/ListValue$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/ListValue;)Lcom/google/protobuf/ListValue$飘花落叶言子楪世苏哲兰;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Lcom/google/protobuf/ListValue$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/ListValue;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iput-object p1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 38
    .line 39
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    if-ne v1, v2, :cond_2

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪苏世哲兰(Lcom/google/protobuf/GeneratedMessage;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/GeneratedMessage;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    iput v2, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 53
    .line 54
    return-object p0
.end method

.method public mergeStructValue(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->structValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {}, Lcom/google/protobuf/Struct;->getDefaultInstance()Lcom/google/protobuf/Struct;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lcom/google/protobuf/Struct;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/google/protobuf/Struct;->newBuilder(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0, p1}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/Struct;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iput-object p1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 38
    .line 39
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    if-ne v1, v2, :cond_2

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪苏世哲兰(Lcom/google/protobuf/GeneratedMessage;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/GeneratedMessage;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    iput v2, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 53
    .line 54
    return-object p0
.end method

.method public setBoolValue(Z)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public setListValue(Lcom/google/protobuf/ListValue$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->listValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/protobuf/ListValue$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/ListValue;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/ListValue$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/ListValue;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/GeneratedMessage;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    const/4 p1, 0x6

    .line 23
    iput p1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 24
    .line 25
    return-object p0
.end method

.method public setListValue(Lcom/google/protobuf/ListValue;)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->listValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    if-nez v0, :cond_0

    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    iput-object p1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 29
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/GeneratedMessage;)V

    :goto_0
    const/4 p1, 0x6

    .line 31
    iput p1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    return-object p0
.end method

.method public setNullValue(Lcom/google/protobuf/NullValue;)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/google/protobuf/NullValue;->getNumber()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public setNullValueValue(I)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public setNumberValue(D)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 3
    .line 4
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public setStringValue(Ljava/lang/String;)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    iput v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setStringValueBytes(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    iput v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 9
    .line 10
    iput-object p1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setStructValue(Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->structValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/Struct;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/Struct;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/GeneratedMessage;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    const/4 p1, 0x5

    .line 23
    iput p1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    .line 24
    .line 25
    return-object p0
.end method

.method public setStructValue(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->structValueBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    if-nez v0, :cond_0

    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    iput-object p1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kind_:Ljava/lang/Object;

    .line 29
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/GeneratedMessage;)V

    :goto_0
    const/4 p1, 0x5

    .line 31
    iput p1, p0, Lcom/google/protobuf/Value$飘花落叶言子楪世苏哲兰;->kindCase_:I

    return-object p0
.end method
