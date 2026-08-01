.class public Lcom/google/protobuf/Descriptors$DescriptorValidationException;
.super Ljava/lang/Exception;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field private static final serialVersionUID:J = 0x4fccd5afd98283ccL


# instance fields
.field private final description:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final proto:Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;


# direct methods
.method private constructor <init>(Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;Ljava/lang/String;)V
    .locals 2

    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    iget-object v1, p1, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    .line 50
    invoke-virtual {v1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getName()Ljava/lang/String;

    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 52
    iget-object p1, p1, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getName()Ljava/lang/String;

    move-result-object v0

    .line 53
    iput-object v0, p0, Lcom/google/protobuf/Descriptors$DescriptorValidationException;->name:Ljava/lang/String;

    .line 54
    iput-object p1, p0, Lcom/google/protobuf/Descriptors$DescriptorValidationException;->proto:Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 55
    iput-object p2, p0, Lcom/google/protobuf/Descriptors$DescriptorValidationException;->description:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;Ljava/lang/String;Lcom/google/protobuf/飘花落叶言楪子苏兰哲世;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2}, Lcom/google/protobuf/Descriptors$DescriptorValidationException;-><init>(Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ": "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/google/protobuf/Descriptors$DescriptorValidationException;->name:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;->飘花落叶言子楪苏哲世兰()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lcom/google/protobuf/Descriptors$DescriptorValidationException;->proto:Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 39
    .line 40
    iput-object p2, p0, Lcom/google/protobuf/Descriptors$DescriptorValidationException;->description:Ljava/lang/String;

    .line 41
    .line 42
    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;Ljava/lang/String;Lcom/google/protobuf/飘花落叶言楪子苏兰哲世;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2}, Lcom/google/protobuf/Descriptors$DescriptorValidationException;-><init>(Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Lcom/google/protobuf/Descriptors$DescriptorValidationException;-><init>(Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;Ljava/lang/String;)V

    .line 47
    invoke-virtual {p0, p3}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;Ljava/lang/String;Ljava/lang/Throwable;Lcom/google/protobuf/飘花落叶言楪子苏兰哲世;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2, p3}, Lcom/google/protobuf/Descriptors$DescriptorValidationException;-><init>(Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Descriptors$DescriptorValidationException;->description:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getProblemProto()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Descriptors$DescriptorValidationException;->proto:Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getProblemSymbolName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Descriptors$DescriptorValidationException;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
