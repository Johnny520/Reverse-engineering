.class public final Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
.super Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言子兰苏楪世哲;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/DescriptorProtos$MessageOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170"
.end annotation


# instance fields
.field private bitField0_:I

.field private deprecatedLegacyJsonFieldConflicts_:Z

.field private deprecated_:Z

.field private featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a;"
        }
    .end annotation
.end field

.field private features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

.field private mapEntry_:Z

.field private messageSetWireFormat_:Z

.field private noStandardDescriptorAccessor_:Z

.field private uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u5b50\u696a;"
        }
    .end annotation
.end field

.field private uninterpretedOption_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->maybeForceBuilderInitialization()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    .line 15
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 16
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    return-void
.end method

.method private buildPartial0(Lcom/google/protobuf/DescriptorProtos$MessageOptions;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->messageSetWireFormat_:Z

    .line 8
    .line 9
    invoke-static {p1, v1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->access$18902(Lcom/google/protobuf/DescriptorProtos$MessageOptions;Z)Z

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
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->noStandardDescriptorAccessor_:Z

    .line 20
    .line 21
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->access$19002(Lcom/google/protobuf/DescriptorProtos$MessageOptions;Z)Z

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
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->deprecated_:Z

    .line 31
    .line 32
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->access$19102(Lcom/google/protobuf/DescriptorProtos$MessageOptions;Z)Z

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
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->mapEntry_:Z

    .line 42
    .line 43
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->access$19202(Lcom/google/protobuf/DescriptorProtos$MessageOptions;Z)Z

    .line 44
    .line 45
    .line 46
    or-int/lit8 v1, v1, 0x8

    .line 47
    .line 48
    :cond_3
    and-int/lit8 v2, v0, 0x10

    .line 49
    .line 50
    if-eqz v2, :cond_4

    .line 51
    .line 52
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->deprecatedLegacyJsonFieldConflicts_:Z

    .line 53
    .line 54
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->access$19302(Lcom/google/protobuf/DescriptorProtos$MessageOptions;Z)Z

    .line 55
    .line 56
    .line 57
    or-int/lit8 v1, v1, 0x10

    .line 58
    .line 59
    :cond_4
    and-int/lit8 v0, v0, 0x20

    .line 60
    .line 61
    if-eqz v0, :cond_6

    .line 62
    .line 63
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 64
    .line 65
    if-nez v0, :cond_5

    .line 66
    .line 67
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_5
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏哲兰()Lcom/google/protobuf/GeneratedMessage;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 75
    .line 76
    :goto_1
    invoke-static {p1, p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->access$19402(Lcom/google/protobuf/DescriptorProtos$MessageOptions;Lcom/google/protobuf/DescriptorProtos$FeatureSet;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 77
    .line 78
    .line 79
    or-int/lit8 v1, v1, 0x20

    .line 80
    .line 81
    :cond_6
    invoke-static {p1, v1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->access$19576(Lcom/google/protobuf/DescriptorProtos$MessageOptions;I)I

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method private buildPartialRepeatedFields(Lcom/google/protobuf/DescriptorProtos$MessageOptions;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x40

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 18
    .line 19
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 20
    .line 21
    and-int/lit8 v0, v0, -0x41

    .line 22
    .line 23
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 26
    .line 27
    invoke-static {p1, p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->access$18802(Lcom/google/protobuf/DescriptorProtos$MessageOptions;Ljava/util/List;)Ljava/util/List;

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
    invoke-static {p1, p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->access$18802(Lcom/google/protobuf/DescriptorProtos$MessageOptions;Ljava/util/List;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private ensureUninterpretedOptionIsMutable()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x40

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 17
    .line 18
    or-int/lit8 v0, v0, 0x40

    .line 19
    .line 20
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世苏楪哲兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object v0
.end method

.method private internalGetFeaturesFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

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
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 26
    .line 27
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 28
    .line 29
    return-object p0
.end method

.method private internalGetUninterpretedOptionFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u5b50\u696a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

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
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 26
    .line 27
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
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->internalGetFeaturesFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->internalGetUninterpretedOptionFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllUninterpretedOption(Ljava/lang/Iterable;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;",
            ">;)",
            "Lcom/google/protobuf/DescriptorProtos$MessageOptions$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

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

.method public addExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;Ljava/lang/Object;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u54f2\u4e16\u82cf;",
            "TType;)",
            "Lcom/google/protobuf/DescriptorProtos$MessageOptions$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->addExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    return-object p0
.end method

.method public addUninterpretedOption(ILcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 42
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 43
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 44
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 45
    :cond_0
    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰苏哲(ILcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public addUninterpretedOption(ILcom/google/protobuf/DescriptorProtos$UninterpretedOption;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 32
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 33
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 34
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰苏哲(ILcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public addUninterpretedOption(Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

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
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

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

.method public addUninterpretedOption(Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 38
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 40
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public addUninterpretedOptionBuilder()Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->internalGetUninterpretedOptionFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

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
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;

    .line 14
    .line 15
    return-object p0
.end method

.method public addUninterpretedOptionBuilder(I)Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 16
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->internalGetUninterpretedOptionFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    move-result-object p0

    .line 17
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

    move-result-object v0

    .line 18
    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏兰哲(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;

    return-object p0
.end method

.method public build()Lcom/google/protobuf/DescriptorProtos$MessageOptions;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->isInitialized()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 18
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    move-result-object p0

    return-object p0
.end method

.method public buildPartial()Lcom/google/protobuf/DescriptorProtos$MessageOptions;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->buildPartialRepeatedFields(Lcom/google/protobuf/DescriptorProtos$MessageOptions;)V

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-direct {p0, v0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->buildPartial0(Lcom/google/protobuf/DescriptorProtos$MessageOptions;)V

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 22
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    move-result-object p0

    return-object p0
.end method

.method public clear()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->messageSetWireFormat_:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->noStandardDescriptorAccessor_:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->deprecated_:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->mapEntry_:Z

    .line 14
    .line 15
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->deprecatedLegacyJsonFieldConflicts_:Z

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    iput-object v0, v1, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 27
    .line 28
    :cond_0
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 29
    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 33
    .line 34
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪苏世兰哲()V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 43
    .line 44
    and-int/lit8 v0, v0, -0x41

    .line 45
    .line 46
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 47
    .line 48
    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;
    .locals 0

    .line 50
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 49
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 52
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 51
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 53
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public clearDeprecated()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x5

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->deprecated_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearDeprecatedLegacyJsonFieldConflicts()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x11

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->deprecatedLegacyJsonFieldConflicts_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u54f2\u4e16\u82cf;",
            ")",
            "Lcom/google/protobuf/DescriptorProtos$MessageOptions$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->clearExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    return-object p0
.end method

.method public clearFeatures()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x21

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iput-object v0, v1, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public clearMapEntry()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x9

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->mapEntry_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearMessageSetWireFormat()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x2

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->messageSetWireFormat_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearNoStandardDescriptorAccessor()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x3

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->noStandardDescriptorAccessor_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearUninterpretedOption()Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 8
    .line 9
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 10
    .line 11
    and-int/lit8 v0, v0, -0x41

    .line 12
    .line 13
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$MessageOptions;
    .locals 0

    .line 7
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getDeprecated()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->deprecated_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getDeprecatedLegacyJsonFieldConflicts()Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->deprecatedLegacyJsonFieldConflicts_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 0

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世苏楪哲兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic getExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic getExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;I)Ljava/lang/Object;
    .locals 0

    .line 6
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)Ljava/lang/Object;
    .locals 0

    .line 7
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;I)Ljava/lang/Object;
    .locals 0

    .line 8
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getExtensionCount(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtensionCount(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public bridge synthetic getExtensionCount(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)I
    .locals 0

    .line 6
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtensionCount(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)I

    move-result p0

    return p0
.end method

.method public getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

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
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 19
    .line 20
    return-object p0
.end method

.method public getFeaturesBuilder()Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x20

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->internalGetFeaturesFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

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
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    return-object p0
.end method

.method public getFeaturesOrBuilder()Lcom/google/protobuf/飘花落叶言子哲世楪兰苏;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

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
    check-cast p0, Lcom/google/protobuf/飘花落叶言子哲世楪兰苏;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 13
    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :cond_1
    return-object p0
.end method

.method public getMapEntry()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->mapEntry_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getMessageSetWireFormat()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->messageSetWireFormat_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getNoStandardDescriptorAccessor()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->noStandardDescriptorAccessor_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getUninterpretedOption(I)Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

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
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

    .line 20
    .line 21
    return-object p0
.end method

.method public getUninterpretedOptionBuilder(I)Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->internalGetUninterpretedOptionFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

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
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    return-object p0
.end method

.method public getUninterpretedOptionBuilderList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->internalGetUninterpretedOptionFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

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

.method public getUninterpretedOptionCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

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

.method public getUninterpretedOptionList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

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

.method public getUninterpretedOptionOrBuilder(I)Lcom/google/protobuf/飘花落叶言楪子苏哲兰世;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/google/protobuf/飘花落叶言楪子苏哲兰世;

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
    check-cast p0, Lcom/google/protobuf/飘花落叶言楪子苏哲兰世;

    .line 19
    .line 20
    return-object p0
.end method

.method public getUninterpretedOptionOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u82cf\u54f2\u5170\u4e16;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

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
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

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

.method public hasDeprecated()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasDeprecatedLegacyJsonFieldConflicts()Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public bridge synthetic hasExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->hasExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public bridge synthetic hasExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)Z
    .locals 0

    .line 6
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->hasExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)Z

    move-result p0

    return p0
.end method

.method public hasFeatures()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x20

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

.method public hasMapEntry()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasMessageSetWireFormat()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasNoStandardDescriptorAccessor()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

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
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世苏楪兰哲:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    const-class v0, Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    .line 4
    .line 5
    const-class v1, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->hasFeatures()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->isInitialized()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return v1

    .line 19
    :cond_0
    move v0, v1

    .line 20
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->getUninterpretedOptionCount()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-ge v0, v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->getUninterpretedOption(I)Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;->isInitialized()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    return v1

    .line 37
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->extensionsAreInitialized()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-nez p0, :cond_3

    .line 45
    .line 46
    return v1

    .line 47
    :cond_3
    const/4 p0, 0x1

    .line 48
    return p0
.end method

.method public mergeFeatures(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x20

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->getFeaturesBuilder()Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

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
    iget-object p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 40
    .line 41
    or-int/lit8 p1, p1, 0x20

    .line 42
    .line 43
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/DescriptorProtos$MessageOptions;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$MessageOptions;

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
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasMessageSetWireFormat()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getMessageSetWireFormat()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->setMessageSetWireFormat(Z)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasNoStandardDescriptorAccessor()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getNoStandardDescriptorAccessor()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->setNoStandardDescriptorAccessor(Z)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasDeprecated()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getDeprecated()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->setDeprecated(Z)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasMapEntry()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getMapEntry()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->setMapEntry(Z)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    .line 58
    .line 59
    .line 60
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasDeprecatedLegacyJsonFieldConflicts()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getDeprecatedLegacyJsonFieldConflicts()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->setDeprecatedLegacyJsonFieldConflicts(Z)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    .line 71
    .line 72
    .line 73
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->hasFeatures()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_6

    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->mergeFeatures(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    .line 84
    .line 85
    .line 86
    :cond_6
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 87
    .line 88
    if-nez v0, :cond_8

    .line 89
    .line 90
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->access$18800(Lcom/google/protobuf/DescriptorProtos$MessageOptions;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_b

    .line 99
    .line 100
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 101
    .line 102
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_7

    .line 107
    .line 108
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->access$18800(Lcom/google/protobuf/DescriptorProtos$MessageOptions;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 113
    .line 114
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 115
    .line 116
    and-int/lit8 v0, v0, -0x41

    .line 117
    .line 118
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_7
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 122
    .line 123
    .line 124
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 125
    .line 126
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->access$18800(Lcom/google/protobuf/DescriptorProtos$MessageOptions;)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 131
    .line 132
    .line 133
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_8
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->access$18800(Lcom/google/protobuf/DescriptorProtos$MessageOptions;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-nez v0, :cond_b

    .line 146
    .line 147
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 148
    .line 149
    iget-object v0, v0, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;

    .line 150
    .line 151
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 156
    .line 157
    if-eqz v0, :cond_a

    .line 158
    .line 159
    const/4 v0, 0x0

    .line 160
    iput-object v0, v1, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 161
    .line 162
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 163
    .line 164
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->access$18800(Lcom/google/protobuf/DescriptorProtos$MessageOptions;)Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 169
    .line 170
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 171
    .line 172
    and-int/lit8 v1, v1, -0x41

    .line 173
    .line 174
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 175
    .line 176
    sget-boolean v1, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 177
    .line 178
    if-eqz v1, :cond_9

    .line 179
    .line 180
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->internalGetUninterpretedOptionFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    :cond_9
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_a
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->access$18800(Lcom/google/protobuf/DescriptorProtos$MessageOptions;)Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {v1, v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Iterable;)V

    .line 192
    .line 193
    .line 194
    :cond_b
    :goto_1
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->mergeExtensionFields(Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownFields(Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 205
    .line 206
    .line 207
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 213
    instance-of v0, p1, Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    if-eqz v0, :cond_0

    .line 214
    check-cast p1, Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$MessageOptions;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0

    .line 215
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;

    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 6

    .line 217
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_a

    .line 218
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世苏哲兰楪()I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    const/16 v3, 0x8

    if-eq v1, v3, :cond_9

    const/16 v4, 0x10

    if-eq v1, v4, :cond_8

    const/16 v5, 0x18

    if-eq v1, v5, :cond_7

    const/16 v5, 0x38

    if-eq v1, v5, :cond_6

    const/16 v3, 0x58

    if-eq v1, v3, :cond_5

    const/16 v3, 0x62

    if-eq v1, v3, :cond_4

    const/16 v3, 0x1f3a

    if-eq v1, v3, :cond_2

    .line 219
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->parseUnknownField(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;I)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_1
    move v0, v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    .line 220
    :cond_2
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;->parser()Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    move-result-object v1

    .line 221
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲世苏(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object v1

    check-cast v1, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

    .line 222
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v2, :cond_3

    .line 223
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 224
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 225
    :cond_3
    invoke-virtual {v2, v1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/GeneratedMessage;)V

    goto :goto_0

    .line 226
    :cond_4
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->internalGetFeaturesFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世哲兰苏()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    move-result-object v1

    .line 227
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲苏世(Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)V

    .line 228
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v1, v1, 0x20

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto :goto_0

    .line 229
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->deprecatedLegacyJsonFieldConflicts_:Z

    .line 230
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/2addr v1, v4

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto :goto_0

    .line 231
    :cond_6
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->mapEntry_:Z

    .line 232
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/2addr v1, v3

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto :goto_0

    .line 233
    :cond_7
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->deprecated_:Z

    .line 234
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 235
    :cond_8
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->noStandardDescriptorAccessor_:Z

    .line 236
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 237
    :cond_9
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->messageSetWireFormat_:Z

    .line 238
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/2addr v1, v2

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 239
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 240
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 241
    throw p1

    .line 242
    :cond_a
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 212
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 211
    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 210
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 209
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 208
    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 216
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public removeUninterpretedOption(I)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

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

.method public setDeprecated(Z)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->deprecated_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x4

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setDeprecatedLegacyJsonFieldConflicts(Z)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->deprecatedLegacyJsonFieldConflicts_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x10

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;ILjava/lang/Object;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u54f2\u4e16\u82cf;",
            "ITType;)",
            "Lcom/google/protobuf/DescriptorProtos$MessageOptions$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 8
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->setExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    return-object p0
.end method

.method public setExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;Ljava/lang/Object;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u54f2\u4e16\u82cf;",
            "TType;)",
            "Lcom/google/protobuf/DescriptorProtos$MessageOptions$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->setExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    return-object p0
.end method

.method public setFeatures(Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

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
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 20
    .line 21
    or-int/lit8 p1, p1, 0x20

    .line 22
    .line 23
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public setFeatures(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/GeneratedMessage;)V

    .line 33
    :goto_0
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 34
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0
.end method

.method public setMapEntry(Z)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->mapEntry_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x8

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setMessageSetWireFormat(Z)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->messageSetWireFormat_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setNoStandardDescriptorAccessor(Z)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->noStandardDescriptorAccessor_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setUninterpretedOption(ILcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

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
    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

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

.method public setUninterpretedOption(ILcom/google/protobuf/DescriptorProtos$UninterpretedOption;)Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 32
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$MessageOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 33
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 34
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪兰世哲苏(ILcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method
