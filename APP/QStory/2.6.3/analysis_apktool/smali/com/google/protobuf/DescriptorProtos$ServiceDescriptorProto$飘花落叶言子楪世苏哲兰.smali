.class public final Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;
.super Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言子兰哲苏世楪;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170"
.end annotation


# instance fields
.field private bitField0_:I

.field private methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u5b50\u696a;"
        }
    .end annotation
.end field

.field private method_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;",
            ">;"
        }
    .end annotation
.end field

.field private name_:Ljava/lang/Object;

.field private optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a;"
        }
    .end annotation
.end field

.field private options_:Lcom/google/protobuf/DescriptorProtos$ServiceOptions;


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
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

    .line 7
    .line 8
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 11
    .line 12
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->maybeForceBuilderInitialization()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    .line 19
    const-string p1, ""

    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

    .line 20
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 21
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    return-void
.end method

.method private buildPartial0(Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1, v1}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;->access$14102(Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;Ljava/lang/Object;)Ljava/lang/Object;

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
    and-int/lit8 v0, v0, 0x4

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->options_:Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏哲兰()Lcom/google/protobuf/GeneratedMessage;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

    .line 31
    .line 32
    :goto_1
    invoke-static {p1, p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;->access$14202(Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;Lcom/google/protobuf/DescriptorProtos$ServiceOptions;)Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

    .line 33
    .line 34
    .line 35
    or-int/lit8 v1, v1, 0x2

    .line 36
    .line 37
    :cond_2
    invoke-static {p1, v1}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;->access$14376(Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;I)I

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method private buildPartialRepeatedFields(Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 18
    .line 19
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 20
    .line 21
    and-int/lit8 v0, v0, -0x3

    .line 22
    .line 23
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 26
    .line 27
    invoke-static {p1, p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;->access$14002(Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;Ljava/util/List;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪苏世哲兰()Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p1, p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;->access$14002(Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;Ljava/util/List;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private ensureMethodIsMutable()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 17
    .line 18
    or-int/lit8 v0, v0, 0x2

    .line 19
    .line 20
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世楪苏哲兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object v0
.end method

.method private internalGetMethodFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u5b50\u696a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->getParentForChildren()Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->isClean()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;-><init>(Ljava/util/List;Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Z)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 26
    .line 27
    return-object p0
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
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->getOptions()Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

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
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->options_:Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

    .line 26
    .line 27
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

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
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->internalGetMethodFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->internalGetOptionsFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllMethod(Ljava/lang/Iterable;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;",
            ">;)",
            "Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->ensureMethodIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {p1, v0}, Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Iterable;)V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public addMethod(ILcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 42
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->ensureMethodIsMutable()V

    .line 43
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 44
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 45
    :cond_0
    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰苏哲(ILcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public addMethod(ILcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->ensureMethodIsMutable()V

    .line 32
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 33
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 34
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰苏哲(ILcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public addMethod(Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->ensureMethodIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/GeneratedMessage;)V

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public addMethod(Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->ensureMethodIsMutable()V

    .line 38
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 40
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public addMethodBuilder()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->internalGetMethodFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;

    .line 14
    .line 15
    return-object p0
.end method

.method public addMethodBuilder(I)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 16
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->internalGetMethodFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    move-result-object p0

    .line 17
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    move-result-object v0

    .line 18
    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏兰哲(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;

    return-object p0
.end method

.method public build()Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;->isInitialized()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 18
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;

    move-result-object p0

    return-object p0
.end method

.method public buildPartial()Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->buildPartialRepeatedFields(Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;)V

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-direct {p0, v0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->buildPartial0(Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onBuilt()V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 21
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 22
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;

    move-result-object p0

    return-object p0
.end method

.method public clear()Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const-string v0, ""

    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪苏世兰哲()V

    .line 24
    .line 25
    .line 26
    :goto_0
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 27
    .line 28
    and-int/lit8 v0, v0, -0x3

    .line 29
    .line 30
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 31
    .line 32
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->options_:Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

    .line 33
    .line 34
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iput-object v1, v0, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 39
    .line 40
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 41
    .line 42
    :cond_1
    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 43
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 45
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 44
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 46
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public clearMethod()Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 8
    .line 9
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 10
    .line 11
    and-int/lit8 v0, v0, -0x3

    .line 12
    .line 13
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 16
    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪苏世兰哲()V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public clearName()Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    and-int/lit8 v0, v0, -0x2

    .line 14
    .line 15
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public clearOptions()Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x5

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->options_:Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iput-object v0, v1, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;
    .locals 0

    .line 7
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;

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
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世楪苏哲兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMethod(I)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    invoke-virtual {v0, p1, p0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪哲世苏兰(IZ)Lcom/google/protobuf/GeneratedMessage;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    .line 20
    .line 21
    return-object p0
.end method

.method public getMethodBuilder(I)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->internalGetMethodFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪苏兰世哲(I)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    return-object p0
.end method

.method public getMethodBuilderList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->internalGetMethodFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪苏兰哲世()Lcom/google/protobuf/飘花落叶言世哲兰子苏楪;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getMethodCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    iget-object p0, v0, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public getMethodList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 6
    .line 7
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/飘花落叶言世哲兰楪子苏;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public getMethodOrBuilder(I)Lcom/google/protobuf/飘花落叶言子兰苏世楪哲;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/google/protobuf/飘花落叶言子兰苏世楪哲;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪哲苏世兰(I)Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lcom/google/protobuf/飘花落叶言子兰苏世楪哲;

    .line 19
    .line 20
    return-object p0
.end method

.method public getMethodOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u5170\u82cf\u4e16\u696a\u54f2;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪哲苏兰世()Lcom/google/protobuf/飘花落叶言世哲兰楪苏子;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

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
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

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

.method public getNameBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

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

.method public getOptions()Lcom/google/protobuf/DescriptorProtos$ServiceOptions;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->options_:Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$ServiceOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

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
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

    .line 19
    .line 20
    return-object p0
.end method

.method public getOptionsBuilder()Lcom/google/protobuf/DescriptorProtos$ServiceOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->internalGetOptionsFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

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
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$ServiceOptions$飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    return-object p0
.end method

.method public getOptionsOrBuilder()Lcom/google/protobuf/飘花落叶言楪子世苏兰哲;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

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
    check-cast p0, Lcom/google/protobuf/飘花落叶言楪子世苏兰哲;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->options_:Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

    .line 13
    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$ServiceOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :cond_1
    return-object p0
.end method

.method public hasName()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasOptions()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

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
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世楪苏兰哲:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    const-class v0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;

    .line 4
    .line 5
    const-class v1, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final isInitialized()Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->getMethodCount()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->getMethod(I)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->isInitialized()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    return v0

    .line 20
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->hasOptions()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->getOptions()Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceOptions;->isInitialized()Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_2

    .line 38
    .line 39
    return v0

    .line 40
    :cond_2
    const/4 p0, 0x1

    .line 41
    return p0
.end method

.method public mergeFrom(Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;->hasName()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;->access$14100(Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

    .line 19
    .line 20
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 21
    .line 22
    or-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 30
    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;->access$14000(Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_6

    .line 42
    .line 43
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;->access$14000(Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 56
    .line 57
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 58
    .line 59
    and-int/lit8 v0, v0, -0x3

    .line 60
    .line 61
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->ensureMethodIsMutable()V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 68
    .line 69
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;->access$14000(Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 74
    .line 75
    .line 76
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;->access$14000(Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_6

    .line 89
    .line 90
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 91
    .line 92
    iget-object v0, v0, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;

    .line 93
    .line 94
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 99
    .line 100
    if-eqz v0, :cond_5

    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    iput-object v0, v1, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 104
    .line 105
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 106
    .line 107
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;->access$14000(Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 112
    .line 113
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 114
    .line 115
    and-int/lit8 v1, v1, -0x3

    .line 116
    .line 117
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 118
    .line 119
    sget-boolean v1, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 120
    .line 121
    if-eqz v1, :cond_4

    .line 122
    .line 123
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->internalGetMethodFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    :cond_4
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_5
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;->access$14000(Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;)Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v1, v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Iterable;)V

    .line 135
    .line 136
    .line 137
    :cond_6
    :goto_1
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;->hasOptions()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_7

    .line 142
    .line 143
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;->getOptions()Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->mergeOptions(Lcom/google/protobuf/DescriptorProtos$ServiceOptions;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;

    .line 148
    .line 149
    .line 150
    :cond_7
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownFields(Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 158
    .line 159
    .line 160
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 166
    instance-of v0, p1, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;

    if-eqz v0, :cond_0

    .line 167
    check-cast p1, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0

    .line 168
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;

    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 4

    .line 170
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_6

    .line 171
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世苏哲兰楪()I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    const/16 v3, 0xa

    if-eq v1, v3, :cond_5

    const/16 v3, 0x12

    if-eq v1, v3, :cond_3

    const/16 v3, 0x1a

    if-eq v1, v3, :cond_2

    .line 172
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->parseUnknownField(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;I)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_1
    move v0, v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    .line 173
    :cond_2
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->internalGetOptionsFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世哲兰苏()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    move-result-object v1

    .line 174
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲苏世(Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)V

    .line 175
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto :goto_0

    .line 176
    :cond_3
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->parser()Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    move-result-object v1

    .line 177
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲世苏(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object v1

    check-cast v1, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    .line 178
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v2, :cond_4

    .line 179
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->ensureMethodIsMutable()V

    .line 180
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 181
    :cond_4
    invoke-virtual {v2, v1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/GeneratedMessage;)V

    goto :goto_0

    .line 182
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/ByteString;

    move-result-object v1

    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

    .line 183
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/2addr v1, v2

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 184
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 185
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 186
    throw p1

    .line 187
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 165
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 164
    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 163
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 162
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 161
    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 169
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public mergeOptions(Lcom/google/protobuf/DescriptorProtos$ServiceOptions;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x4

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->options_:Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$ServiceOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->getOptionsBuilder()Lcom/google/protobuf/DescriptorProtos$ServiceOptions$飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Lcom/google/protobuf/DescriptorProtos$ServiceOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$ServiceOptions;)Lcom/google/protobuf/DescriptorProtos$ServiceOptions$飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->options_:Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

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
    iget-object p1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->options_:Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 40
    .line 41
    or-int/lit8 p1, p1, 0x4

    .line 42
    .line 43
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-object p0
.end method

.method public removeMethod(I)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->ensureMethodIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪兰世苏哲(I)V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public setMethod(ILcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->ensureMethodIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪兰世哲苏(ILcom/google/protobuf/GeneratedMessage;)V

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public setMethod(ILcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->methodBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->ensureMethodIsMutable()V

    .line 32
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->method_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 33
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 34
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪兰世哲苏(ILcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public setName(Ljava/lang/String;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setNameBytes(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->name_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setOptions(Lcom/google/protobuf/DescriptorProtos$ServiceOptions$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$ServiceOptions$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->options_:Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$ServiceOptions$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

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
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 20
    .line 21
    or-int/lit8 p1, p1, 0x4

    .line 22
    .line 23
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public setOptions(Lcom/google/protobuf/DescriptorProtos$ServiceOptions;)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->optionsBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->options_:Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/GeneratedMessage;)V

    .line 33
    :goto_0
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 34
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0
.end method
