.class public abstract Ltop/linl/dexparser/process/BaseFinder;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final result:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ltop/linl/dexparser/process/BaseFinder;->result:Ljava/util/ArrayList;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final addMethodToResult(Ltop/linl/dexparser/DexParser;Ltop/linl/dexparser/bean/ids/DexMethodId;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ltop/linl/dexparser/process/BaseFinder;->result:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ltop/linl/dexparser/process/BaseFinder;->getMethodJSON(Ltop/linl/dexparser/DexParser;Ltop/linl/dexparser/bean/ids/DexMethodId;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public checkListContain(Ljava/util/List;[Ljava/lang/Object;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;[TT;)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    move v0, p1

    .line 7
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    array-length v2, p2

    .line 18
    if-lt v0, v2, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    array-length v2, p2

    .line 22
    move v3, p1

    .line 23
    :goto_0
    if-ge v3, v2, :cond_0

    .line 24
    .line 25
    aget-object v4, p2, v3

    .line 26
    .line 27
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_2

    .line 32
    .line 33
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    :goto_1
    array-length p0, p2

    .line 39
    if-lt v0, p0, :cond_4

    .line 40
    .line 41
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_4
    return p1
.end method

.method public final getMethodJSON(Ltop/linl/dexparser/DexParser;Ltop/linl/dexparser/bean/ids/DexMethodId;)Ljava/lang/String;
    .locals 5

    .line 1
    iget-object p0, p1, Ltop/linl/dexparser/DexParser;->dexStringIdsList:[Ltop/linl/dexparser/bean/ids/DexStringId;

    .line 2
    .line 3
    iget v0, p2, Ltop/linl/dexparser/bean/ids/DexMethodId;->name_idx:I

    .line 4
    .line 5
    aget-object p0, p0, v0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ltop/linl/dexparser/bean/ids/DexStringId;->getString(Ltop/linl/dexparser/DexParser;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object v0, p1, Ltop/linl/dexparser/DexParser;->dexStringIdsList:[Ltop/linl/dexparser/bean/ids/DexStringId;

    .line 12
    .line 13
    iget-object v1, p1, Ltop/linl/dexparser/DexParser;->dexTypeIdsList:[Ltop/linl/dexparser/bean/ids/DexTypeId;

    .line 14
    .line 15
    iget-short v2, p2, Ltop/linl/dexparser/bean/ids/DexMethodId;->class_ids:S

    .line 16
    .line 17
    aget-object v1, v1, v2

    .line 18
    .line 19
    iget v1, v1, Ltop/linl/dexparser/bean/ids/DexTypeId;->descriptor_idx:I

    .line 20
    .line 21
    aget-object v0, v0, v1

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ltop/linl/dexparser/bean/ids/DexStringId;->getString(Ltop/linl/dexparser/DexParser;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Ltop/linl/dexparser/util/DexTypeUtils;->conversionTypeName(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p2, p1}, Ltop/linl/dexparser/bean/ids/DexMethodId;->getMethodParams(Ltop/linl/dexparser/DexParser;)[Ltop/linl/dexparser/bean/ids/DexTypeId;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v2, Lcom/alibaba/fastjson2/JSONObject;

    .line 36
    .line 37
    invoke-direct {v2}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v3, "DeclareClass"

    .line 41
    .line 42
    invoke-virtual {v2, v3, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    const-string v0, "MethodName"

    .line 46
    .line 47
    invoke-virtual {v2, v0, p0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    new-instance p0, Lcom/alibaba/fastjson2/JSONArray;

    .line 51
    .line 52
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 53
    .line 54
    .line 55
    array-length v0, v1

    .line 56
    const/4 v3, 0x0

    .line 57
    :goto_0
    if-ge v3, v0, :cond_0

    .line 58
    .line 59
    aget-object v4, v1, v3

    .line 60
    .line 61
    invoke-virtual {v4, p1}, Ltop/linl/dexparser/bean/ids/DexTypeId;->getString(Ltop/linl/dexparser/DexParser;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-static {v4}, Ltop/linl/dexparser/util/DexTypeUtils;->conversionTypeName(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {p0, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    add-int/lit8 v3, v3, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    const-string v0, "Params"

    .line 76
    .line 77
    invoke-virtual {v2, v0, p0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, p1}, Ltop/linl/dexparser/bean/ids/DexMethodId;->getReturnType(Ltop/linl/dexparser/DexParser;)Ltop/linl/dexparser/bean/ids/DexTypeId;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p0, p1}, Ltop/linl/dexparser/bean/ids/DexTypeId;->getString(Ltop/linl/dexparser/DexParser;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p0}, Ltop/linl/dexparser/util/DexTypeUtils;->conversionTypeName(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    const-string p1, "ReturnType"

    .line 93
    .line 94
    invoke-virtual {v2, p1, p0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONObject;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0
.end method

.method public final getResult()Ljava/util/ArrayList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Ltop/linl/dexparser/process/BaseFinder;->result:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public startFind(Ltop/linl/dexparser/DexParser;)V
    .locals 6

    .line 1
    iget-object v0, p1, Ltop/linl/dexparser/DexParser;->dexMethodIdsList:[Ltop/linl/dexparser/bean/ids/DexMethodId;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_2

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    iget-object v4, p1, Ltop/linl/dexparser/DexParser;->dexStringIdsList:[Ltop/linl/dexparser/bean/ids/DexStringId;

    .line 10
    .line 11
    iget v5, v3, Ltop/linl/dexparser/bean/ids/DexMethodId;->name_idx:I

    .line 12
    .line 13
    aget-object v4, v4, v5

    .line 14
    .line 15
    invoke-virtual {v4, p1}, Ltop/linl/dexparser/bean/ids/DexStringId;->getString(Ltop/linl/dexparser/DexParser;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const-string v5, "<init>"

    .line 20
    .line 21
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-nez v5, :cond_1

    .line 26
    .line 27
    const-string v5, "<cinit>"

    .line 28
    .line 29
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    invoke-virtual {p0, p1, v3}, Ltop/linl/dexparser/process/BaseFinder;->startParserMethodId(Ltop/linl/dexparser/DexParser;Ltop/linl/dexparser/bean/ids/DexMethodId;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    return-void
.end method

.method public abstract startParserMethodId(Ltop/linl/dexparser/DexParser;Ltop/linl/dexparser/bean/ids/DexMethodId;)V
.end method
