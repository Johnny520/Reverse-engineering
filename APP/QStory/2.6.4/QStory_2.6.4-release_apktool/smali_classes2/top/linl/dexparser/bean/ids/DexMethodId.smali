.class public Ltop/linl/dexparser/bean/ids/DexMethodId;
.super Ltop/linl/dexparser/bean/ids/BaseId;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public class_ids:S

.field public name_idx:I

.field public proto_idx:S

.field private usedStringList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ltop/linl/dexparser/bean/ids/BaseId;-><init>()V

    return-void
.end method

.method public constructor <init>(SSI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ltop/linl/dexparser/bean/ids/BaseId;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-short p1, p0, Ltop/linl/dexparser/bean/ids/DexMethodId;->class_ids:S

    .line 5
    .line 6
    iput-short p2, p0, Ltop/linl/dexparser/bean/ids/DexMethodId;->proto_idx:S

    .line 7
    .line 8
    iput p3, p0, Ltop/linl/dexparser/bean/ids/DexMethodId;->name_idx:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public getMethodParams(Ltop/linl/dexparser/DexParser;)[Ltop/linl/dexparser/bean/ids/DexTypeId;
    .locals 7

    .line 1
    iget-object v0, p1, Ltop/linl/dexparser/DexParser;->dexDexProtoIdsList:[Ltop/linl/dexparser/bean/ids/DexProtoId;

    .line 2
    .line 3
    iget-short p0, p0, Ltop/linl/dexparser/bean/ids/DexMethodId;->proto_idx:S

    .line 4
    .line 5
    aget-object p0, v0, p0

    .line 6
    .line 7
    iget v0, p0, Ltop/linl/dexparser/bean/ids/DexProtoId;->parameters_off:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-array p0, v1, [Ltop/linl/dexparser/bean/ids/DexTypeId;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    iget-object v2, p1, Ltop/linl/dexparser/DexParser;->dexData:[B

    .line 16
    .line 17
    const/4 v3, 0x4

    .line 18
    invoke-static {v2, v0, v3}, Ltop/linl/dexparser/util/Utils;->copyArrays([BII)[B

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    new-array v2, v0, [Ltop/linl/dexparser/bean/ids/DexTypeId;

    .line 27
    .line 28
    :goto_0
    if-ge v1, v0, :cond_1

    .line 29
    .line 30
    iget-object v4, p1, Ltop/linl/dexparser/DexParser;->dexData:[B

    .line 31
    .line 32
    iget v5, p0, Ltop/linl/dexparser/bean/ids/DexProtoId;->parameters_off:I

    .line 33
    .line 34
    const/4 v6, 0x2

    .line 35
    invoke-static {v1, v6, v5, v3}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-static {v4, v5, v6}, Ltop/linl/dexparser/util/Utils;->copyArrays([BII)[B

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-static {v4}, Ltop/linl/dexparser/util/ConversionUtils;->bytesToUnsignedShort([B)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    iget-object v5, p1, Ltop/linl/dexparser/DexParser;->dexTypeIdsList:[Ltop/linl/dexparser/bean/ids/DexTypeId;

    .line 48
    .line 49
    aget-object v4, v5, v4

    .line 50
    .line 51
    aput-object v4, v2, v1

    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    return-object v2
.end method

.method public getReturnType(Ltop/linl/dexparser/DexParser;)Ltop/linl/dexparser/bean/ids/DexTypeId;
    .locals 1

    .line 1
    iget-object v0, p1, Ltop/linl/dexparser/DexParser;->dexDexProtoIdsList:[Ltop/linl/dexparser/bean/ids/DexProtoId;

    .line 2
    .line 3
    iget-short p0, p0, Ltop/linl/dexparser/bean/ids/DexMethodId;->proto_idx:S

    .line 4
    .line 5
    aget-object p0, v0, p0

    .line 6
    .line 7
    iget-object p1, p1, Ltop/linl/dexparser/DexParser;->dexTypeIdsList:[Ltop/linl/dexparser/bean/ids/DexTypeId;

    .line 8
    .line 9
    iget p0, p0, Ltop/linl/dexparser/bean/ids/DexProtoId;->return_type_idx:I

    .line 10
    .line 11
    aget-object p0, p1, p0

    .line 12
    .line 13
    return-object p0
.end method

.method public getUsedStringList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Ltop/linl/dexparser/bean/ids/DexMethodId;->usedStringList:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public initUsedStringList()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Ltop/linl/dexparser/bean/ids/DexMethodId;->usedStringList:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method
