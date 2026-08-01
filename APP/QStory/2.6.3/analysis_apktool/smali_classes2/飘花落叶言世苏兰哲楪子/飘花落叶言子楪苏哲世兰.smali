.class public final L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Ljava/lang/String;

.field public final 飘花落叶言子楪世兰苏哲:Z

.field public final 飘花落叶言子楪世哲兰苏:Z

.field public final 飘花落叶言子楪世哲苏兰:Z

.field public final 飘花落叶言子楪世苏兰哲:Z

.field public final 飘花落叶言子楪世苏哲兰:Z

.field public final 飘花落叶言子楪苏世兰哲:Z

.field public final 飘花落叶言子楪苏世哲兰:Ljava/lang/String;

.field public final 飘花落叶言子楪苏哲世兰:Lkotlinx/serialization/json/ClassDiscriminatorMode;

.field public final 飘花落叶言子楪苏哲兰世:Z


# direct methods
.method public constructor <init>(ZZZZZLjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/json/ClassDiscriminatorMode;Z)V
    .locals 0

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-boolean p1, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Z

    .line 14
    .line 15
    iput-boolean p2, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Z

    .line 16
    .line 17
    iput-boolean p3, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Z

    .line 18
    .line 19
    iput-boolean p4, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏:Z

    .line 20
    .line 21
    iput-boolean p5, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲:Z

    .line 22
    .line 23
    iput-object p6, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p7, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰:Ljava/lang/String;

    .line 26
    .line 27
    iput-boolean p8, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:Z

    .line 28
    .line 29
    iput-object p9, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰:Lkotlinx/serialization/json/ClassDiscriminatorMode;

    .line 30
    .line 31
    iput-boolean p10, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲兰世:Z

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "JsonConfiguration(encodeDefaults="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", ignoreUnknownKeys="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", isLenient="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-boolean v1, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Z

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", allowStructuredMapKeys=false, prettyPrint="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean v1, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏:Z

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", explicitNulls="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-boolean v1, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲:Z

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", prettyPrintIndent=\'"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, "\', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator=\'"

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, "\', allowSpecialFloatingPointValues=false, useAlternativeNames="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-boolean v1, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:Z

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰:Lkotlinx/serialization/json/ClassDiscriminatorMode;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", exceptionsWithDebugInfo="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-boolean p0, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲兰世:Z

    .line 99
    .line 100
    const/16 v1, 0x29

    .line 101
    .line 102
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏哲世(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0
.end method
