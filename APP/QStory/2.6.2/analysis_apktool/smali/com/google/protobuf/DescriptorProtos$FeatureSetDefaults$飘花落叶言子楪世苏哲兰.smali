.class public final Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;
.super Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言子哲世楪苏兰;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170"
.end annotation


# instance fields
.field private bitField0_:I

.field private defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u5b50\u696a;"
        }
    .end annotation
.end field

.field private defaults_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;",
            ">;"
        }
    .end annotation
.end field

.field private maximumEdition_:I

.field private minimumEdition_:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->minimumEdition_:I

    .line 10
    .line 11
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->maximumEdition_:I

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    .line 17
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    const/4 p1, 0x0

    .line 18
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->minimumEdition_:I

    .line 19
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->maximumEdition_:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    return-void
.end method

.method private buildPartial0(Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->minimumEdition_:I

    .line 8
    .line 9
    invoke-static {p1, v1}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;->access$34002(Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;I)I

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
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->maximumEdition_:I

    .line 20
    .line 21
    invoke-static {p1, p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;->access$34102(Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;I)I

    .line 22
    .line 23
    .line 24
    or-int/lit8 v1, v1, 0x2

    .line 25
    .line 26
    :cond_1
    invoke-static {p1, v1}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;->access$34276(Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;I)I

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private buildPartialRepeatedFields(Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    .line 18
    .line 19
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 20
    .line 21
    and-int/lit8 v0, v0, -0x2

    .line 22
    .line 23
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    .line 26
    .line 27
    invoke-static {p1, p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;->access$33902(Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;Ljava/util/List;)Ljava/util/List;

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
    invoke-static {p1, p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;->access$33902(Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;Ljava/util/List;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private ensureDefaultsIsMutable()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 17
    .line 18
    or-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子苏世哲楪兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object v0
.end method

.method private internalGetDefaultsFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u5b50\u696a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

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
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 26
    .line 27
    return-object p0
.end method


# virtual methods
.method public addAllDefaults(Ljava/lang/Iterable;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;",
            ">;)",
            "Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->ensureDefaultsIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

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

.method public addDefaults(ILcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 42
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->ensureDefaultsIsMutable()V

    .line 43
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 44
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 45
    :cond_0
    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰苏哲(ILcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public addDefaults(ILcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->ensureDefaultsIsMutable()V

    .line 32
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 33
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 34
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰苏哲(ILcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public addDefaults(Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->ensureDefaultsIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;

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
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;

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

.method public addDefaults(Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->ensureDefaultsIsMutable()V

    .line 38
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 40
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public addDefaultsBuilder()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->internalGetDefaultsFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;

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
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault$飘花落叶言子楪世苏哲兰;

    .line 14
    .line 15
    return-object p0
.end method

.method public addDefaultsBuilder(I)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 16
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->internalGetDefaultsFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    move-result-object p0

    .line 17
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;

    move-result-object v0

    .line 18
    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏兰哲(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault$飘花落叶言子楪世苏哲兰;

    return-object p0
.end method

.method public build()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;->isInitialized()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 18
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;

    move-result-object p0

    return-object p0
.end method

.method public buildPartial()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->buildPartialRepeatedFields(Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;)V

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-direct {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->buildPartial0(Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;)V

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 22
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;

    move-result-object p0

    return-object p0
.end method

.method public clear()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 12
    .line 13
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v2, 0x0

    .line 17
    iput-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪苏世兰哲()V

    .line 20
    .line 21
    .line 22
    :goto_0
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 23
    .line 24
    and-int/lit8 v1, v1, -0x2

    .line 25
    .line 26
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 27
    .line 28
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->minimumEdition_:I

    .line 29
    .line 30
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->maximumEdition_:I

    .line 31
    .line 32
    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 33
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 35
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 34
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 36
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public clearDefaults()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    .line 8
    .line 9
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 10
    .line 11
    and-int/lit8 v0, v0, -0x2

    .line 12
    .line 13
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public clearMaximumEdition()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x5

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->maximumEdition_:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearMinimumEdition()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x3

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->minimumEdition_:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;
    .locals 0

    .line 7
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getDefaults(I)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;

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
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;

    .line 20
    .line 21
    return-object p0
.end method

.method public getDefaultsBuilder(I)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->internalGetDefaultsFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

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
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault$飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    return-object p0
.end method

.method public getDefaultsBuilderList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->internalGetDefaultsFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

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

.method public getDefaultsCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

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

.method public getDefaultsList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

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

.method public getDefaultsOrBuilder(I)Lcom/google/protobuf/飘花落叶言子哲楪兰苏世;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/google/protobuf/飘花落叶言子哲楪兰苏世;

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
    check-cast p0, Lcom/google/protobuf/飘花落叶言子哲楪兰苏世;

    .line 19
    .line 20
    return-object p0
.end method

.method public getDefaultsOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u696a\u5170\u82cf\u4e16;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

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
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

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

.method public getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 0

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子苏世哲楪兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMaximumEdition()Lcom/google/protobuf/DescriptorProtos$Edition;
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->maximumEdition_:I

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

.method public getMinimumEdition()Lcom/google/protobuf/DescriptorProtos$Edition;
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->minimumEdition_:I

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

.method public hasMaximumEdition()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasMinimumEdition()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

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
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子苏世哲兰楪:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    const-class v0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;

    .line 4
    .line 5
    const-class v1, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->getDefaultsCount()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->getDefaults(I)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;->isInitialized()Z

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
    const/4 p0, 0x1

    .line 24
    return p0
.end method

.method public mergeFrom(Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;

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
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 9
    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;->access$33900(Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_5

    .line 21
    .line 22
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;->access$33900(Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    .line 35
    .line 36
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 37
    .line 38
    and-int/lit8 v0, v0, -0x2

    .line 39
    .line 40
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->ensureDefaultsIsMutable()V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    .line 47
    .line 48
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;->access$33900(Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;->access$33900(Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_5

    .line 68
    .line 69
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 70
    .line 71
    iget-object v0, v0, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;

    .line 72
    .line 73
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 78
    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    const/4 v0, 0x0

    .line 82
    iput-object v0, v1, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 83
    .line 84
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 85
    .line 86
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;->access$33900(Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    .line 91
    .line 92
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 93
    .line 94
    and-int/lit8 v1, v1, -0x2

    .line 95
    .line 96
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 97
    .line 98
    sget-boolean v1, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 99
    .line 100
    if-eqz v1, :cond_3

    .line 101
    .line 102
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->internalGetDefaultsFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    :cond_3
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;->access$33900(Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;)Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v1, v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Iterable;)V

    .line 114
    .line 115
    .line 116
    :cond_5
    :goto_1
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;->hasMinimumEdition()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_6

    .line 121
    .line 122
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;->getMinimumEdition()Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->setMinimumEdition(Lcom/google/protobuf/DescriptorProtos$Edition;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;

    .line 127
    .line 128
    .line 129
    :cond_6
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;->hasMaximumEdition()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_7

    .line 134
    .line 135
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;->getMaximumEdition()Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->setMaximumEdition(Lcom/google/protobuf/DescriptorProtos$Edition;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;

    .line 140
    .line 141
    .line 142
    :cond_7
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownFields(Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 150
    .line 151
    .line 152
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 158
    instance-of v0, p1, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;

    if-eqz v0, :cond_0

    .line 159
    check-cast p1, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0

    .line 160
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;

    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;
    .locals 5

    .line 162
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_8

    .line 163
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世苏哲兰楪()I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    const/16 v3, 0xa

    if-eq v1, v3, :cond_6

    const/16 v3, 0x20

    const/4 v4, 0x4

    if-eq v1, v3, :cond_4

    const/16 v3, 0x28

    if-eq v1, v3, :cond_2

    .line 164
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

    .line 165
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()I

    move-result v1

    .line 166
    invoke-static {v1}, Lcom/google/protobuf/DescriptorProtos$Edition;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$Edition;

    move-result-object v2

    if-nez v2, :cond_3

    const/4 v2, 0x5

    .line 167
    invoke-virtual {p0, v2, v1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownVarintField(II)V

    goto :goto_0

    .line 168
    :cond_3
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->maximumEdition_:I

    .line 169
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/2addr v1, v4

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto :goto_0

    .line 170
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()I

    move-result v1

    .line 171
    invoke-static {v1}, Lcom/google/protobuf/DescriptorProtos$Edition;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$Edition;

    move-result-object v2

    if-nez v2, :cond_5

    .line 172
    invoke-virtual {p0, v4, v1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownVarintField(II)V

    goto :goto_0

    .line 173
    :cond_5
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->minimumEdition_:I

    .line 174
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto :goto_0

    .line 175
    :cond_6
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;->parser()Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    move-result-object v1

    .line 176
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲世苏(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object v1

    check-cast v1, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;

    .line 177
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v2, :cond_7

    .line 178
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->ensureDefaultsIsMutable()V

    .line 179
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 180
    :cond_7
    invoke-virtual {v2, v1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/GeneratedMessage;)V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 181
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 182
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 183
    throw p1

    .line 184
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 157
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 156
    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 155
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 154
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 153
    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 161
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public removeDefaults(I)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->ensureDefaultsIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

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

.method public setDefaults(ILcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->ensureDefaultsIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;

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
    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;

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

.method public setDefaults(ILcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->ensureDefaultsIsMutable()V

    .line 32
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->defaults_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 33
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 34
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪兰世哲苏(ILcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public setMaximumEdition(Lcom/google/protobuf/DescriptorProtos$Edition;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x4

    .line 7
    .line 8
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$Edition;->getNumber()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->maximumEdition_:I

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public setMinimumEdition(Lcom/google/protobuf/DescriptorProtos$Edition;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x2

    .line 7
    .line 8
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$Edition;->getNumber()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$飘花落叶言子楪世苏哲兰;->minimumEdition_:I

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method
