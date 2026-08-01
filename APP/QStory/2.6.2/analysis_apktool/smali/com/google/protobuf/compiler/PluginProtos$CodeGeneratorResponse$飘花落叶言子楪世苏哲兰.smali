.class public final Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
.super Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/google/protobuf/compiler/飘花落叶言子楪世兰苏哲;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170"
.end annotation


# instance fields
.field private bitField0_:I

.field private error_:Ljava/lang/Object;

.field private fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u5b50\u696a;"
        }
    .end annotation
.end field

.field private file_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;",
            ">;"
        }
    .end annotation
.end field

.field private maximumEdition_:I

.field private minimumEdition_:I

.field private supportedFeatures_:J


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
    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->error_:Ljava/lang/Object;

    .line 7
    .line 8
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    .line 16
    const-string p1, ""

    iput-object p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->error_:Ljava/lang/Object;

    .line 17
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;L飘花落叶言楪哲世苏子兰/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    return-void
.end method

.method public synthetic constructor <init>(L飘花落叶言楪哲世苏子兰/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;-><init>()V

    return-void
.end method

.method private buildPartial0(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->error_:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1, v1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->access$4102(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-wide v2, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->supportedFeatures_:J

    .line 20
    .line 21
    invoke-static {p1, v2, v3}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->access$4202(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;J)J

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
    iget v2, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->minimumEdition_:I

    .line 31
    .line 32
    invoke-static {p1, v2}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->access$4302(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;I)I

    .line 33
    .line 34
    .line 35
    or-int/lit8 v1, v1, 0x4

    .line 36
    .line 37
    :cond_2
    and-int/lit8 v0, v0, 0x8

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    iget p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->maximumEdition_:I

    .line 42
    .line 43
    invoke-static {p1, p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->access$4402(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;I)I

    .line 44
    .line 45
    .line 46
    or-int/lit8 v1, v1, 0x8

    .line 47
    .line 48
    :cond_3
    invoke-static {p1, v1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->access$4576(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;I)I

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method private buildPartialRepeatedFields(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x10

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    .line 18
    .line 19
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 20
    .line 21
    and-int/lit8 v0, v0, -0x11

    .line 22
    .line 23
    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    .line 26
    .line 27
    invoke-static {p1, p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->access$4002(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;Ljava/util/List;)Ljava/util/List;

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
    invoke-static {p1, p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->access$4002(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;Ljava/util/List;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private ensureFileIsMutable()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x10

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 17
    .line 18
    or-int/lit8 v0, v0, 0x10

    .line 19
    .line 20
    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 1

    .line 1
    sget-object v0, L飘花落叶言楪哲世苏子兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object v0
.end method

.method private internalGetFileFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u5b50\u696a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

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
    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 26
    .line 27
    return-object p0
.end method


# virtual methods
.method public addAllFile(Ljava/lang/Iterable;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;",
            ">;)",
            "Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->ensureFileIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

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

.method public addFile(ILcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 42
    invoke-direct {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->ensureFileIsMutable()V

    .line 43
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 44
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 45
    :cond_0
    invoke-virtual {p2}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰苏哲(ILcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public addFile(ILcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-direct {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->ensureFileIsMutable()V

    .line 32
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 33
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 34
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰苏哲(ILcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public addFile(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->ensureFileIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

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
    invoke-virtual {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

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

.method public addFile(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    invoke-direct {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->ensureFileIsMutable()V

    .line 38
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 40
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public addFileBuilder()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->internalGetFileFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->getDefaultInstance()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

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
    check-cast p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$飘花落叶言子楪世苏哲兰;

    .line 14
    .line 15
    return-object p0
.end method

.method public addFileBuilder(I)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 16
    invoke-direct {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->internalGetFileFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    move-result-object p0

    .line 17
    invoke-static {}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->getDefaultInstance()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    move-result-object v0

    .line 18
    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏兰哲(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$飘花落叶言子楪世苏哲兰;

    return-object p0
.end method

.method public build()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->isInitialized()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 18
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    move-result-object p0

    return-object p0
.end method

.method public buildPartial()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;L飘花落叶言楪哲世苏子兰/飘花落叶言子楪世苏哲兰;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->buildPartialRepeatedFields(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;)V

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-direct {p0, v0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->buildPartial0(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;)V

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
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 22
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 41
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public clear()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const-string v1, ""

    .line 8
    .line 9
    iput-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->error_:Ljava/lang/Object;

    .line 10
    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    iput-wide v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->supportedFeatures_:J

    .line 14
    .line 15
    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->minimumEdition_:I

    .line 16
    .line 17
    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->maximumEdition_:I

    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 24
    .line 25
    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x0

    .line 29
    iput-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪苏世兰哲()V

    .line 32
    .line 33
    .line 34
    :goto_0
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 35
    .line 36
    and-int/lit8 v0, v0, -0x11

    .line 37
    .line 38
    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 39
    .line 40
    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 43
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 42
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 44
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public clearError()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getDefaultInstance()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getError()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->error_:Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    and-int/lit8 v0, v0, -0x2

    .line 14
    .line 15
    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public clearFile()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    .line 8
    .line 9
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 10
    .line 11
    and-int/lit8 v0, v0, -0x11

    .line 12
    .line 13
    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public clearMaximumEdition()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x9

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->maximumEdition_:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearMinimumEdition()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x5

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->minimumEdition_:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearSupportedFeatures()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x3

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    iput-wide v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->supportedFeatures_:J

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;
    .locals 0

    .line 7
    invoke-static {}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getDefaultInstance()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

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
    sget-object p0, L飘花落叶言楪哲世苏子兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getError()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->error_:Ljava/lang/Object;

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
    iput-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->error_:Ljava/lang/Object;

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

.method public getErrorBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->error_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->error_:Ljava/lang/Object;

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

.method public getFile(I)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

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
    check-cast p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    .line 20
    .line 21
    return-object p0
.end method

.method public getFileBuilder(I)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->internalGetFileFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

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
    check-cast p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    return-object p0
.end method

.method public getFileBuilderList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->internalGetFileFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

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

.method public getFileCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

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

.method public getFileList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

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

.method public getFileOrBuilder(I)L飘花落叶言楪哲世苏子兰/飘花落叶言子楪世哲苏兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, L飘花落叶言楪哲世苏子兰/飘花落叶言子楪世哲苏兰;

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
    check-cast p0, L飘花落叶言楪哲世苏子兰/飘花落叶言子楪世哲苏兰;

    .line 19
    .line 20
    return-object p0
.end method

.method public getFileOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u54f2\u4e16\u82cf\u5b50\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

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
    iget-object p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

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

.method public getMaximumEdition()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->maximumEdition_:I

    .line 2
    .line 3
    return p0
.end method

.method public getMinimumEdition()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->minimumEdition_:I

    .line 2
    .line 3
    return p0
.end method

.method public getSupportedFeatures()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->supportedFeatures_:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hasError()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasMaximumEdition()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasMinimumEdition()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasSupportedFeatures()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

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
    sget-object p0, L飘花落叶言楪哲世苏子兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    const-class v0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    .line 4
    .line 5
    const-class v1, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

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

.method public mergeFrom(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getDefaultInstance()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

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
    invoke-virtual {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->hasError()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-static {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->access$4100(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->error_:Ljava/lang/Object;

    .line 19
    .line 20
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 21
    .line 22
    or-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->hasSupportedFeatures()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getSupportedFeatures()J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->setSupportedFeatures(J)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->hasMinimumEdition()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getMinimumEdition()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-virtual {p0, v0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->setMinimumEdition(I)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->hasMaximumEdition()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->getMaximumEdition()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-virtual {p0, v0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->setMaximumEdition(I)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    .line 66
    .line 67
    .line 68
    :cond_4
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 69
    .line 70
    if-nez v0, :cond_6

    .line 71
    .line 72
    invoke-static {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->access$4000(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_9

    .line 81
    .line 82
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    invoke-static {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->access$4000(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    .line 95
    .line 96
    iget v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 97
    .line 98
    and-int/lit8 v0, v0, -0x11

    .line 99
    .line 100
    iput v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_5
    invoke-direct {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->ensureFileIsMutable()V

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    .line 107
    .line 108
    invoke-static {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->access$4000(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 113
    .line 114
    .line 115
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_6
    invoke-static {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->access$4000(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_9

    .line 128
    .line 129
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 130
    .line 131
    iget-object v0, v0, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;

    .line 132
    .line 133
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    iget-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 138
    .line 139
    if-eqz v0, :cond_8

    .line 140
    .line 141
    const/4 v0, 0x0

    .line 142
    iput-object v0, v1, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 143
    .line 144
    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 145
    .line 146
    invoke-static {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->access$4000(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;)Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    iput-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    .line 151
    .line 152
    iget v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 153
    .line 154
    and-int/lit8 v1, v1, -0x11

    .line 155
    .line 156
    iput v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 157
    .line 158
    invoke-static {}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->access$4600()Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_7

    .line 163
    .line 164
    invoke-direct {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->internalGetFileFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    :cond_7
    iput-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_8
    invoke-static {p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;->access$4000(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;)Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {v1, v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Iterable;)V

    .line 176
    .line 177
    .line 178
    :cond_9
    :goto_1
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownFields(Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 186
    .line 187
    .line 188
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 194
    instance-of v0, p1, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    if-eqz v0, :cond_0

    .line 195
    check-cast p1, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0

    .line 196
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;

    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 4

    .line 198
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_8

    .line 199
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世苏哲兰楪()I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    const/16 v3, 0xa

    if-eq v1, v3, :cond_7

    const/16 v3, 0x10

    if-eq v1, v3, :cond_6

    const/16 v3, 0x18

    if-eq v1, v3, :cond_5

    const/16 v3, 0x20

    if-eq v1, v3, :cond_4

    const/16 v3, 0x7a

    if-eq v1, v3, :cond_2

    .line 200
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

    .line 201
    :cond_2
    invoke-static {}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;->parser()Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    move-result-object v1

    .line 202
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲世苏(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object v1

    check-cast v1, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

    .line 203
    iget-object v2, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v2, :cond_3

    .line 204
    invoke-direct {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->ensureFileIsMutable()V

    .line 205
    iget-object v2, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 206
    :cond_3
    invoke-virtual {v2, v1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/GeneratedMessage;)V

    goto :goto_0

    .line 207
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰苏世哲()I

    move-result v1

    iput v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->maximumEdition_:I

    .line 208
    iget v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v1, v1, 0x8

    iput v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto :goto_0

    .line 209
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰苏世哲()I

    move-result v1

    iput v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->minimumEdition_:I

    .line 210
    iget v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto :goto_0

    .line 211
    :cond_6
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世苏兰哲楪()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->supportedFeatures_:J

    .line 212
    iget v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto :goto_0

    .line 213
    :cond_7
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/ByteString;

    move-result-object v1

    iput-object v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->error_:Ljava/lang/Object;

    .line 214
    iget v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/2addr v1, v2

    iput v1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 215
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 216
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 217
    throw p1

    .line 218
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 193
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 192
    invoke-virtual {p0, p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 191
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 190
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 189
    invoke-virtual {p0, p1}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 197
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public removeFile(I)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->ensureFileIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

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

.method public setError(Ljava/lang/String;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->error_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setErrorBytes(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->error_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setFile(ILcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->ensureFileIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

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
    invoke-virtual {p2}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;

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

.method public setFile(ILcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$File;)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->fileBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-direct {p0}, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->ensureFileIsMutable()V

    .line 32
    iget-object v0, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->file_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 33
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 34
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪兰世哲苏(ILcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public setMaximumEdition(I)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->maximumEdition_:I

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x8

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setMinimumEdition(I)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->minimumEdition_:I

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x4

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setSupportedFeatures(J)Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->supportedFeatures_:J

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/compiler/PluginProtos$CodeGeneratorResponse$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method
