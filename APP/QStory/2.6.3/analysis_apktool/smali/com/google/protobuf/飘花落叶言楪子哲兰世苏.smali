.class public final Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;
.super Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言世子楪苏兰哲;


# static fields
.field public static final 飘花落叶言子楪兰哲世苏:Lcom/google/protobuf/飘花落叶言楪子哲苏兰世;

.field public static final 飘花落叶言子楪兰苏哲世:Lcom/google/protobuf/飘花落叶言子楪兰哲世苏;


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:Ljava/lang/String;

.field public volatile 飘花落叶言子楪兰世苏哲:Lcom/google/protobuf/DescriptorProtos$EnumValueOptions;

.field public final 飘花落叶言子楪兰苏世哲:Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

.field public final 飘花落叶言子楪哲兰世苏:I

.field public final 飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/protobuf/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lcom/google/protobuf/飘花落叶言子楪兰哲世苏;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪兰苏哲世:Lcom/google/protobuf/飘花落叶言子楪兰哲世苏;

    .line 8
    .line 9
    new-instance v0, Lcom/google/protobuf/飘花落叶言楪子哲苏兰世;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1}, Lcom/google/protobuf/飘花落叶言楪子哲苏兰世;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪兰哲世苏:Lcom/google/protobuf/飘花落叶言楪子哲苏兰世;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;I)V
    .locals 1

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    iput p3, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪哲兰世苏:I

    .line 90
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;

    .line 91
    iput-object p2, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪兰苏世哲:Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 92
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    iget-object v0, p2, Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 94
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x2e

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 95
    iget-object p1, p2, Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;->飘花落叶言子楪兰世苏哲:Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;

    .line 96
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;->飘花落叶言子楪世哲苏兰()Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    move-result-object p1

    .line 97
    iget-object p1, p1, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰哲苏世:Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;

    .line 98
    invoke-virtual {p1, p0}, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世苏兰哲(Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;Ljava/lang/Integer;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v1, "UNKNOWN_ENUM_VALUE_"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p1, Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProto;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProto;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, "_"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;->newBuilder()Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto$飘花落叶言子楪世苏哲兰;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1, v0}, Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto$飘花落叶言子楪世苏哲兰;->setName(Ljava/lang/String;)Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto$飘花落叶言子楪世苏哲兰;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    invoke-virtual {v0, p2}, Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto$飘花落叶言子楪世苏哲兰;->setNumber(I)Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto$飘花落叶言子楪世苏哲兰;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    const/4 v0, -0x1

    .line 53
    iput v0, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪哲兰世苏:I

    .line 54
    .line 55
    iput-object p2, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;

    .line 56
    .line 57
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪兰苏世哲:Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 58
    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    iget-object p1, p1, Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const/16 p1, 0x2e

    .line 70
    .line 71
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;->getName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 86
    .line 87
    return-void
.end method


# virtual methods
.method public final getNumber()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;->getNumber()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰哲苏()Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪兰苏世哲:Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰()Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪兰苏世哲:Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;->飘花落叶言子楪世哲苏兰()Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/DescriptorProtos$EnumValueOptions;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪兰世苏哲:Lcom/google/protobuf/DescriptorProtos$EnumValueOptions;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;->getOptions()Lcom/google/protobuf/DescriptorProtos$EnumValueOptions;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$EnumValueOptions;->hasFeatures()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$EnumValueOptions;->toBuilder()Lcom/google/protobuf/DescriptorProtos$EnumValueOptions$飘花落叶言子楪世苏哲兰;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$EnumValueOptions$飘花落叶言子楪世苏哲兰;->clearFeatures()Lcom/google/protobuf/DescriptorProtos$EnumValueOptions$飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$EnumValueOptions$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$EnumValueOptions;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :cond_0
    monitor-enter p0

    .line 30
    :try_start_0
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪兰世苏哲:Lcom/google/protobuf/DescriptorProtos$EnumValueOptions;

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪兰世苏哲:Lcom/google/protobuf/DescriptorProtos$EnumValueOptions;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    monitor-exit p0

    .line 40
    goto :goto_2

    .line 41
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    throw v0

    .line 43
    :cond_2
    :goto_2
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪兰世苏哲:Lcom/google/protobuf/DescriptorProtos$EnumValueOptions;

    .line 44
    .line 45
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰哲世()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;

    .line 2
    .line 3
    return-object p0
.end method
