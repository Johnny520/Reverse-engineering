.class public final Lorg/luckypray/dexkit/result/ClassData$-Companion;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/result/ClassData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "-Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lzq;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/ClassData$-Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getId-pVg5ArA()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getDexId-pVg5ArA()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getSourceFile()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string v0, ""

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    move-object v4, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v4, p0

    .line 26
    :goto_0
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getAccessFlags-pVg5ArA()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getDexDescriptor()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-nez p0, :cond_1

    .line 35
    .line 36
    move-object v6, v0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move-object v6, p0

    .line 39
    :goto_1
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getSuperClass-pVg5ArA()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    const/4 v0, -0x1

    .line 44
    if-ne p0, v0, :cond_2

    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    :goto_2
    move-object v7, p0

    .line 48
    goto :goto_3

    .line 49
    :cond_2
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    goto :goto_2

    .line 54
    :goto_3
    new-instance v8, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getInterfacesLength()I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    const/4 v0, 0x0

    .line 64
    move v1, v0

    .line 65
    :goto_4
    if-ge v1, p0, :cond_3

    .line 66
    .line 67
    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-ClassMeta;->interfaces(I)I

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    add-int/lit8 v1, v1, 0x1

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_3
    new-instance v9, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getMethodsLength()I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    move v1, v0

    .line 91
    :goto_5
    if-ge v1, p0, :cond_4

    .line 92
    .line 93
    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-ClassMeta;->methods(I)I

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    add-int/lit8 v1, v1, 0x1

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_4
    new-instance v10, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getFieldsLength()I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    :goto_6
    if-ge v0, p0, :cond_5

    .line 117
    .line 118
    invoke-virtual {p2, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->fields(I)I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-interface {v10, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    add-int/lit8 v0, v0, 0x1

    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_5
    new-instance v0, Lorg/luckypray/dexkit/result/ClassData;

    .line 133
    .line 134
    const/4 v11, 0x0

    .line 135
    move-object v1, p1

    .line 136
    invoke-direct/range {v0 .. v11}, Lorg/luckypray/dexkit/result/ClassData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lzq;)V

    .line 137
    .line 138
    .line 139
    return-object v0
.end method
