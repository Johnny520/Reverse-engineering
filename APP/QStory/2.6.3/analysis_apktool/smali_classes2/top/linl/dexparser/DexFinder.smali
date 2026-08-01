.class public Ltop/linl/dexparser/DexFinder;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/linl/dexparser/DexFinder$Builder;,
        Ltop/linl/dexparser/DexFinder$OnProgress;
    }
.end annotation


# instance fields
.field private builder:Ltop/linl/dexparser/DexFinder$Builder;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ltop/linl/dexparser/DexFinder;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static builder(Ljava/lang/ClassLoader;Ljava/lang/String;)Ltop/linl/dexparser/DexFinder$Builder;
    .locals 1

    .line 1
    new-instance v0, Ltop/linl/dexparser/DexFinder$Builder;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ltop/linl/dexparser/DexFinder$Builder;-><init>(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static builder(Ljava/lang/String;)Ltop/linl/dexparser/DexFinder$Builder;
    .locals 1

    .line 7
    new-instance v0, Ltop/linl/dexparser/DexFinder$Builder;

    invoke-direct {v0, p0}, Ltop/linl/dexparser/DexFinder$Builder;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private findMethodAppearedString(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v2, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget v0, Ltop/linl/dexparser/DexFinder$Builder;->mThreadSize:I

    .line 7
    .line 8
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    .line 11
    move-result-object v6

    .line 12
    invoke-static {}, Ltop/linl/dexparser/DexFinder;->getDexParsersList()Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v7

    .line 20
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    move-object v3, v0

    .line 31
    check-cast v3, Ltop/linl/dexparser/DexParser;

    .line 32
    .line 33
    new-instance v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;

    .line 34
    .line 35
    const/4 v5, 0x4

    .line 36
    move-object v1, p0

    .line 37
    move-object v4, p1

    .line 38
    invoke-direct/range {v0 .. v5}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v6, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-interface {v6}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 46
    .line 47
    .line 48
    const-wide/16 p0, 0xf

    .line 49
    .line 50
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 51
    .line 52
    invoke-interface {v6, p0, p1, v0}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 53
    .line 54
    .line 55
    return-object v2
.end method

.method private findStringInWhichMethodAppears(Ltop/linl/dexparser/DexParser;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltop/linl/dexparser/DexParser;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Ltop/linl/dexparser/DexParser;->dexMethodIdsList:[Ltop/linl/dexparser/bean/ids/DexMethodId;

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v3, v1, :cond_5

    .line 12
    .line 13
    aget-object v4, v0, v3

    .line 14
    .line 15
    invoke-virtual {v4}, Ltop/linl/dexparser/bean/ids/DexMethodId;->getUsedStringList()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    if-nez v5, :cond_0

    .line 20
    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v4}, Ltop/linl/dexparser/bean/ids/DexMethodId;->getUsedStringList()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    if-eqz v6, :cond_4

    .line 36
    .line 37
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    check-cast v6, Ljava/lang/Integer;

    .line 42
    .line 43
    iget-object v7, p1, Ltop/linl/dexparser/DexParser;->dexStringIdsList:[Ltop/linl/dexparser/bean/ids/DexStringId;

    .line 44
    .line 45
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    aget-object v6, v7, v6

    .line 50
    .line 51
    invoke-virtual {v6, p1}, Ltop/linl/dexparser/bean/ids/DexStringId;->getString(Ltop/linl/dexparser/DexParser;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-virtual {v6, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-eqz v6, :cond_1

    .line 60
    .line 61
    iget-object v5, p1, Ltop/linl/dexparser/DexParser;->dexStringIdsList:[Ltop/linl/dexparser/bean/ids/DexStringId;

    .line 62
    .line 63
    iget v6, v4, Ltop/linl/dexparser/bean/ids/DexMethodId;->name_idx:I

    .line 64
    .line 65
    aget-object v5, v5, v6

    .line 66
    .line 67
    invoke-virtual {v5, p1}, Ltop/linl/dexparser/bean/ids/DexStringId;->getString(Ltop/linl/dexparser/DexParser;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    const-string v6, "<init>"

    .line 72
    .line 73
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-nez v6, :cond_4

    .line 78
    .line 79
    const-string v6, "<cinit>"

    .line 80
    .line 81
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_2

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_2
    iget-object v6, p1, Ltop/linl/dexparser/DexParser;->dexStringIdsList:[Ltop/linl/dexparser/bean/ids/DexStringId;

    .line 89
    .line 90
    iget-object v7, p1, Ltop/linl/dexparser/DexParser;->dexTypeIdsList:[Ltop/linl/dexparser/bean/ids/DexTypeId;

    .line 91
    .line 92
    iget-short v8, v4, Ltop/linl/dexparser/bean/ids/DexMethodId;->class_ids:S

    .line 93
    .line 94
    aget-object v7, v7, v8

    .line 95
    .line 96
    iget v7, v7, Ltop/linl/dexparser/bean/ids/DexTypeId;->descriptor_idx:I

    .line 97
    .line 98
    aget-object v6, v6, v7

    .line 99
    .line 100
    invoke-virtual {v6, p1}, Ltop/linl/dexparser/bean/ids/DexStringId;->getString(Ltop/linl/dexparser/DexParser;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-virtual {v4, p1}, Ltop/linl/dexparser/bean/ids/DexMethodId;->getMethodParams(Ltop/linl/dexparser/DexParser;)[Ltop/linl/dexparser/bean/ids/DexTypeId;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-static {v6}, Ltop/linl/dexparser/util/DexTypeUtils;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    array-length v7, v4

    .line 113
    new-array v8, v7, [Ljava/lang/Class;

    .line 114
    .line 115
    move v9, v2

    .line 116
    :goto_1
    if-ge v9, v7, :cond_3

    .line 117
    .line 118
    iget-object v10, p1, Ltop/linl/dexparser/DexParser;->dexStringIdsList:[Ltop/linl/dexparser/bean/ids/DexStringId;

    .line 119
    .line 120
    aget-object v11, v4, v9

    .line 121
    .line 122
    iget v11, v11, Ltop/linl/dexparser/bean/ids/DexTypeId;->descriptor_idx:I

    .line 123
    .line 124
    aget-object v10, v10, v11

    .line 125
    .line 126
    invoke-virtual {v10, p1}, Ltop/linl/dexparser/bean/ids/DexStringId;->getString(Ltop/linl/dexparser/DexParser;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    invoke-static {v10}, Ltop/linl/dexparser/util/DexTypeUtils;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    aput-object v10, v8, v9

    .line 135
    .line 136
    add-int/lit8 v9, v9, 0x1

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_3
    invoke-virtual {v6, v5, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    :cond_4
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 147
    .line 148
    goto/16 :goto_0

    .line 149
    .line 150
    :cond_5
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 151
    .line 152
    .line 153
    return-object p0
.end method

.method public static getDexParsersList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ltop/linl/dexparser/DexParser;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Ltop/linl/dexparser/DexFinder$Builder;->飘花落叶言子楪世兰哲苏()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private init()V
    .locals 0

    .line 1
    return-void
.end method

.method private synthetic lambda$findMethodAppearedString$1(Ljava/util/ArrayList;Ltop/linl/dexparser/DexParser;Ljava/lang/String;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-direct {p0, p2, p3}, Ltop/linl/dexparser/DexFinder;->findStringInWhichMethodAppears(Ltop/linl/dexparser/DexParser;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    :catch_0
    return-void
.end method

.method private synthetic lambda$testFindMethodString$0(Ljava/io/File;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p1}, Ltop/linl/dexparser/util/FileUtils;->readFileObject(Ljava/io/File;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ltop/linl/dexparser/DexParser;

    .line 6
    .line 7
    invoke-direct {p0, p1, p3}, Ltop/linl/dexparser/DexFinder;->testFindStringInWhichMethodAppears(Ltop/linl/dexparser/DexParser;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    :catch_0
    return-void
.end method

.method private synthetic lambda$useLocalLookupMethodString$2(Ljava/io/File;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p1}, Ltop/linl/dexparser/util/FileUtils;->readFileObject(Ljava/io/File;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ltop/linl/dexparser/DexParser;

    .line 6
    .line 7
    invoke-direct {p0, p1, p3}, Ltop/linl/dexparser/DexFinder;->findStringInWhichMethodAppears(Ltop/linl/dexparser/DexParser;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    :catch_0
    return-void
.end method

.method private testFindStringInWhichMethodAppears(Ltop/linl/dexparser/DexParser;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltop/linl/dexparser/DexParser;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Ltop/linl/dexparser/DexParser;->dexMethodIdsList:[Ltop/linl/dexparser/bean/ids/DexMethodId;

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v3, v1, :cond_4

    .line 12
    .line 13
    aget-object v4, v0, v3

    .line 14
    .line 15
    invoke-virtual {v4}, Ltop/linl/dexparser/bean/ids/DexMethodId;->getUsedStringList()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    if-nez v5, :cond_0

    .line 20
    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v4}, Ltop/linl/dexparser/bean/ids/DexMethodId;->getUsedStringList()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    if-eqz v6, :cond_3

    .line 36
    .line 37
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    check-cast v6, Ljava/lang/Integer;

    .line 42
    .line 43
    iget-object v7, p1, Ltop/linl/dexparser/DexParser;->dexStringIdsList:[Ltop/linl/dexparser/bean/ids/DexStringId;

    .line 44
    .line 45
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    aget-object v6, v7, v6

    .line 50
    .line 51
    invoke-virtual {v6, p1}, Ltop/linl/dexparser/bean/ids/DexStringId;->getString(Ltop/linl/dexparser/DexParser;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-virtual {v6, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-eqz v6, :cond_1

    .line 60
    .line 61
    iget-object v5, p1, Ltop/linl/dexparser/DexParser;->dexStringIdsList:[Ltop/linl/dexparser/bean/ids/DexStringId;

    .line 62
    .line 63
    iget v6, v4, Ltop/linl/dexparser/bean/ids/DexMethodId;->name_idx:I

    .line 64
    .line 65
    aget-object v5, v5, v6

    .line 66
    .line 67
    invoke-virtual {v5, p1}, Ltop/linl/dexparser/bean/ids/DexStringId;->getString(Ltop/linl/dexparser/DexParser;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    iget-object v6, p1, Ltop/linl/dexparser/DexParser;->dexStringIdsList:[Ltop/linl/dexparser/bean/ids/DexStringId;

    .line 72
    .line 73
    iget-object v7, p1, Ltop/linl/dexparser/DexParser;->dexTypeIdsList:[Ltop/linl/dexparser/bean/ids/DexTypeId;

    .line 74
    .line 75
    iget-short v8, v4, Ltop/linl/dexparser/bean/ids/DexMethodId;->class_ids:S

    .line 76
    .line 77
    aget-object v7, v7, v8

    .line 78
    .line 79
    iget v7, v7, Ltop/linl/dexparser/bean/ids/DexTypeId;->descriptor_idx:I

    .line 80
    .line 81
    aget-object v6, v6, v7

    .line 82
    .line 83
    invoke-virtual {v6, p1}, Ltop/linl/dexparser/bean/ids/DexStringId;->getString(Ltop/linl/dexparser/DexParser;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-virtual {v4, p1}, Ltop/linl/dexparser/bean/ids/DexMethodId;->getMethodParams(Ltop/linl/dexparser/DexParser;)[Ltop/linl/dexparser/bean/ids/DexTypeId;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-static {v6}, Ltop/linl/dexparser/util/DexTypeUtils;->conversionTypeName(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    new-instance v8, Lcom/alibaba/fastjson2/JSONObject;

    .line 96
    .line 97
    invoke-direct {v8}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 98
    .line 99
    .line 100
    const-string v9, "DeclareClass"

    .line 101
    .line 102
    invoke-virtual {v8, v9, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    const-string v6, "MethodName"

    .line 106
    .line 107
    invoke-virtual {v8, v6, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    new-instance v5, Lcom/alibaba/fastjson2/JSONArray;

    .line 111
    .line 112
    invoke-direct {v5}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 113
    .line 114
    .line 115
    array-length v6, v7

    .line 116
    move v9, v2

    .line 117
    :goto_1
    if-ge v9, v6, :cond_2

    .line 118
    .line 119
    aget-object v10, v7, v9

    .line 120
    .line 121
    invoke-virtual {v10, p1}, Ltop/linl/dexparser/bean/ids/DexTypeId;->getString(Ltop/linl/dexparser/DexParser;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v10

    .line 125
    invoke-static {v10}, Ltop/linl/dexparser/util/DexTypeUtils;->conversionTypeName(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    invoke-virtual {v5, v10}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    add-int/lit8 v9, v9, 0x1

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_2
    const-string v6, "Params"

    .line 136
    .line 137
    invoke-virtual {v8, v6, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4, p1}, Ltop/linl/dexparser/bean/ids/DexMethodId;->getReturnType(Ltop/linl/dexparser/DexParser;)Ltop/linl/dexparser/bean/ids/DexTypeId;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-virtual {v4, p1}, Ltop/linl/dexparser/bean/ids/DexTypeId;->getString(Ltop/linl/dexparser/DexParser;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-static {v4}, Ltop/linl/dexparser/util/DexTypeUtils;->conversionTypeName(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    const-string v5, "ReturnType"

    .line 153
    .line 154
    invoke-virtual {v8, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v8}, Lcom/alibaba/fastjson2/JSONObject;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 165
    .line 166
    goto/16 :goto_0

    .line 167
    .line 168
    :cond_4
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 169
    .line 170
    .line 171
    return-object p0
.end method

.method private useLocalLookupMethodString(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v3, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ltop/linl/dexparser/DexFinder;->builder:Ltop/linl/dexparser/DexFinder$Builder;

    .line 7
    .line 8
    invoke-static {v0}, Ltop/linl/dexparser/DexFinder$Builder;->飘花落叶言子楪世兰苏哲(Ltop/linl/dexparser/DexFinder$Builder;)[Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object v6

    .line 12
    sget v0, Ltop/linl/dexparser/DexFinder$Builder;->mThreadSize:I

    .line 13
    .line 14
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 15
    .line 16
    .line 17
    move-result-object v7

    .line 18
    array-length v8, v6

    .line 19
    const/4 v0, 0x0

    .line 20
    move v9, v0

    .line 21
    :goto_0
    if-ge v9, v8, :cond_0

    .line 22
    .line 23
    aget-object v2, v6, v9

    .line 24
    .line 25
    new-instance v0, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    move-object v1, p0

    .line 29
    move-object v4, p1

    .line 30
    invoke-direct/range {v0 .. v5}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏哲兰;-><init>(Ltop/linl/dexparser/DexFinder;Ljava/io/File;Ljava/util/ArrayList;Ljava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v7, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 v9, v9, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-interface {v7}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 40
    .line 41
    .line 42
    const-wide p0, 0x7fffffffffffffffL

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 48
    .line 49
    invoke-interface {v7, p0, p1, v0}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 50
    .line 51
    .line 52
    return-object v3
.end method

.method public static bridge synthetic 飘花落叶言子楪世兰苏哲(Ltop/linl/dexparser/DexFinder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ltop/linl/dexparser/DexFinder;->init()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic 飘花落叶言子楪世哲兰苏(Ltop/linl/dexparser/DexFinder;Ltop/linl/dexparser/DexFinder$Builder;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltop/linl/dexparser/DexFinder;->builder:Ltop/linl/dexparser/DexFinder$Builder;

    .line 2
    .line 3
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世哲苏兰(Ltop/linl/dexparser/DexFinder;Ljava/util/ArrayList;Ltop/linl/dexparser/DexParser;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ltop/linl/dexparser/DexFinder;->lambda$findMethodAppearedString$1(Ljava/util/ArrayList;Ltop/linl/dexparser/DexParser;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Ltop/linl/dexparser/DexFinder;Ljava/io/File;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ltop/linl/dexparser/DexFinder;->lambda$useLocalLookupMethodString$2(Ljava/io/File;Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Ltop/linl/dexparser/DexFinder;Ljava/io/File;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ltop/linl/dexparser/DexFinder;->lambda$testFindMethodString$0(Ljava/io/File;Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/linl/dexparser/DexFinder;->builder:Ltop/linl/dexparser/DexFinder$Builder;

    .line 2
    .line 3
    invoke-static {p0}, Ltop/linl/dexparser/DexFinder$Builder;->飘花落叶言子楪世哲兰苏(Ltop/linl/dexparser/DexFinder$Builder;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public findMethodString(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ltop/linl/dexparser/DexFinder;->builder:Ltop/linl/dexparser/DexFinder$Builder;

    .line 2
    .line 3
    invoke-static {v0}, Ltop/linl/dexparser/DexFinder$Builder;->飘花落叶言子楪世哲苏兰(Ltop/linl/dexparser/DexFinder$Builder;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1}, Ltop/linl/dexparser/DexFinder;->useLocalLookupMethodString(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-direct {p0, p1}, Ltop/linl/dexparser/DexFinder;->findMethodAppearedString(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public testFindMethodString(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v3, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ltop/linl/dexparser/DexFinder;->builder:Ltop/linl/dexparser/DexFinder$Builder;

    .line 7
    .line 8
    invoke-static {v0}, Ltop/linl/dexparser/DexFinder$Builder;->飘花落叶言子楪世兰苏哲(Ltop/linl/dexparser/DexFinder$Builder;)[Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object v6

    .line 12
    const/4 v0, 0x3

    .line 13
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 14
    .line 15
    .line 16
    move-result-object v7

    .line 17
    array-length v8, v6

    .line 18
    const/4 v0, 0x0

    .line 19
    move v9, v0

    .line 20
    :goto_0
    if-ge v9, v8, :cond_0

    .line 21
    .line 22
    aget-object v2, v6, v9

    .line 23
    .line 24
    new-instance v0, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏哲兰;

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    move-object v1, p0

    .line 28
    move-object v4, p1

    .line 29
    invoke-direct/range {v0 .. v5}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏哲兰;-><init>(Ltop/linl/dexparser/DexFinder;Ljava/io/File;Ljava/util/ArrayList;Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v7, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v9, v9, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-interface {v7}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 39
    .line 40
    .line 41
    const-wide p0, 0x7fffffffffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 47
    .line 48
    invoke-interface {v7, p0, p1, v0}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 49
    .line 50
    .line 51
    return-object v3
.end method
