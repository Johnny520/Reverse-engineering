.class public Ltop/linl/dexparser/process/MethodStringFinder;
.super Ltop/linl/dexparser/process/BaseFinder;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final findString:[Ljava/lang/String;


# direct methods
.method public varargs constructor <init>([Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ltop/linl/dexparser/process/BaseFinder;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltop/linl/dexparser/process/MethodStringFinder;->findString:[Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public startParserMethodId(Ltop/linl/dexparser/DexParser;Ltop/linl/dexparser/bean/ids/DexMethodId;)V
    .locals 8

    .line 1
    invoke-virtual {p2}, Ltop/linl/dexparser/bean/ids/DexMethodId;->getUsedStringList()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p2}, Ltop/linl/dexparser/bean/ids/DexMethodId;->getUsedStringList()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    move v2, v1

    .line 18
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_4

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Ljava/lang/Integer;

    .line 29
    .line 30
    iget-object v4, p1, Ltop/linl/dexparser/DexParser;->dexStringIdsList:[Ltop/linl/dexparser/bean/ids/DexStringId;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    aget-object v3, v4, v3

    .line 37
    .line 38
    invoke-virtual {v3, p1}, Ltop/linl/dexparser/bean/ids/DexStringId;->getString(Ltop/linl/dexparser/DexParser;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    iget-object v4, p0, Ltop/linl/dexparser/process/MethodStringFinder;->findString:[Ljava/lang/String;

    .line 43
    .line 44
    array-length v5, v4

    .line 45
    move v6, v1

    .line 46
    :goto_0
    if-ge v6, v5, :cond_3

    .line 47
    .line 48
    aget-object v7, v4, v6

    .line 49
    .line 50
    invoke-virtual {v3, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    if-eqz v7, :cond_2

    .line 55
    .line 56
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    iget-object v3, p0, Ltop/linl/dexparser/process/MethodStringFinder;->findString:[Ljava/lang/String;

    .line 62
    .line 63
    array-length v3, v3

    .line 64
    if-lt v2, v3, :cond_1

    .line 65
    .line 66
    invoke-virtual {p0, p1, p2}, Ltop/linl/dexparser/process/BaseFinder;->addMethodToResult(Ltop/linl/dexparser/DexParser;Ltop/linl/dexparser/bean/ids/DexMethodId;)V

    .line 67
    .line 68
    .line 69
    :cond_4
    :goto_1
    return-void
.end method
