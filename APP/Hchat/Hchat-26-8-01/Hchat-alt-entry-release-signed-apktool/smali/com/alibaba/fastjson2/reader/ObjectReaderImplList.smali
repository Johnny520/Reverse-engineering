.class public final Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/ObjectReader;


# static fields
.field static final CLASS_ARRAYS_LIST:Ljava/lang/Class;

.field static final CLASS_EMPTY_LIST:Ljava/lang/Class;

.field static final CLASS_EMPTY_SET:Ljava/lang/Class;

.field static final CLASS_SINGLETON:Ljava/lang/Class;

.field static final CLASS_SINGLETON_LIST:Ljava/lang/Class;

.field static final CLASS_UNMODIFIABLE_COLLECTION:Ljava/lang/Class;

.field static final CLASS_UNMODIFIABLE_LIST:Ljava/lang/Class;

.field static final CLASS_UNMODIFIABLE_SET:Ljava/lang/Class;

.field public static INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;

.field public static JSON_ARRAY_READER:Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;


# instance fields
.field final builder:Ljava/util/function/Function;

.field volatile instanceError:Z

.field final instanceType:Ljava/lang/Class;

.field final instanceTypeHash:J

.field final itemClass:Ljava/lang/Class;

.field final itemClassName:Ljava/lang/String;

.field final itemClassNameHash:J

.field itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field final itemType:Ljava/lang/reflect/Type;

.field final listClass:Ljava/lang/Class;

.field listSingleton:Ljava/lang/Object;

.field final listType:Ljava/lang/reflect/Type;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sput-object v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_EMPTY_SET:Ljava/lang/Class;

    .line 8
    .line 9
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    sput-object v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_EMPTY_LIST:Ljava/lang/Class;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    sput-object v3, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_SINGLETON:Ljava/lang/Class;

    .line 31
    .line 32
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    sput-object v3, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_SINGLETON_LIST:Ljava/lang/Class;

    .line 41
    .line 42
    filled-new-array {v2}, [Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    sput-object v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_ARRAYS_LIST:Ljava/lang/Class;

    .line 55
    .line 56
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    sput-object v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_UNMODIFIABLE_COLLECTION:Ljava/lang/Class;

    .line 65
    .line 66
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    sput-object v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_UNMODIFIABLE_LIST:Ljava/lang/Class;

    .line 75
    .line 76
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    sput-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_UNMODIFIABLE_SET:Ljava/lang/Class;

    .line 85
    .line 86
    new-instance v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;

    .line 87
    .line 88
    const-string v10, "Object"

    .line 89
    .line 90
    const-wide v11, 0x7463656a624fL

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    const-class v2, Ljava/util/ArrayList;

    .line 96
    .line 97
    const-class v3, Ljava/util/ArrayList;

    .line 98
    .line 99
    const-class v4, Ljava/util/ArrayList;

    .line 100
    .line 101
    const-wide/16 v5, 0x41

    .line 102
    .line 103
    const-class v7, Ljava/lang/Object;

    .line 104
    .line 105
    const-class v8, Ljava/lang/Object;

    .line 106
    .line 107
    const/4 v9, 0x0

    .line 108
    invoke-direct/range {v1 .. v12}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;-><init>(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;JLjava/lang/reflect/Type;Ljava/lang/Class;Ljava/util/function/Function;Ljava/lang/String;J)V

    .line 109
    .line 110
    .line 111
    sput-object v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;

    .line 112
    .line 113
    new-instance v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;

    .line 114
    .line 115
    const-string v11, "Object"

    .line 116
    .line 117
    const-wide v12, 0x7463656a624fL

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    const-class v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 123
    .line 124
    const-class v4, Lcom/alibaba/fastjson2/JSONArray;

    .line 125
    .line 126
    const-class v5, Lcom/alibaba/fastjson2/JSONArray;

    .line 127
    .line 128
    const-wide v6, 0x7b6c46ca33cd9078L    # 3.3638134088297784E286

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    const-class v8, Ljava/lang/Object;

    .line 134
    .line 135
    const-class v9, Ljava/lang/Object;

    .line 136
    .line 137
    const/4 v10, 0x0

    .line 138
    invoke-direct/range {v2 .. v13}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;-><init>(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;JLjava/lang/reflect/Type;Ljava/lang/Class;Ljava/util/function/Function;Ljava/lang/String;J)V

    .line 139
    .line 140
    .line 141
    sput-object v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->JSON_ARRAY_READER:Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;

    .line 142
    .line 143
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 6

    .line 52
    const-class v4, Ljava/lang/Object;

    const/4 v5, 0x0

    move-object v2, p1

    move-object v3, p1

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;-><init>(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/function/Function;)V

    .line 53
    iput-object p2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->listSingleton:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;JLjava/lang/reflect/Type;Ljava/lang/Class;Ljava/util/function/Function;Ljava/lang/String;J)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->listType:Ljava/lang/reflect/Type;

    .line 56
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->listClass:Ljava/lang/Class;

    .line 57
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->instanceType:Ljava/lang/Class;

    .line 58
    iput-wide p4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->instanceTypeHash:J

    .line 59
    iput-object p6, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemType:Ljava/lang/reflect/Type;

    .line 60
    iput-object p7, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemClass:Ljava/lang/Class;

    .line 61
    iput-object p8, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->builder:Ljava/util/function/Function;

    .line 62
    iput-object p9, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemClassName:Ljava/lang/String;

    .line 63
    iput-wide p10, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemClassNameHash:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/function/Function;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->listType:Ljava/lang/reflect/Type;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->listClass:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->instanceType:Ljava/lang/Class;

    .line 9
    .line 10
    invoke-static {p3}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    iput-wide p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->instanceTypeHash:J

    .line 19
    .line 20
    iput-object p4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemType:Ljava/lang/reflect/Type;

    .line 21
    .line 22
    invoke-static {p4}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemClass:Ljava/lang/Class;

    .line 27
    .line 28
    iput-object p5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->builder:Ljava/util/function/Function;

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 p1, 0x0

    .line 38
    :goto_0
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemClassName:Ljava/lang/String;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 43
    .line 44
    .line 45
    move-result-wide p1

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-wide/16 p1, 0x0

    .line 48
    .line 49
    :goto_1
    iput-wide p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemClassNameHash:J

    .line 50
    .line 51
    return-void
.end method

.method public static synthetic a(Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->lambda$readJSONBObject$11(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->lambda$of$1(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->lambda$of$3(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->lambda$of$0(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->lambda$of$2(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->lambda$readJSONBObject$7(Ljava/util/Collection;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic g(Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->lambda$readJSONBObject$10(Ljava/util/List;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->lambda$of$6(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic i(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->lambda$readJSONBObject$9(Ljava/util/Collection;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->lambda$of$5(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->lambda$of$4(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic l(Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->lambda$readJSONBObject$8(Ljava/util/List;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static synthetic lambda$of$0(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ljava/util/Collection;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    instance-of v0, p0, Ljava/lang/Class;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Class;

    .line 14
    .line 15
    invoke-static {p0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-static {p1}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method private static synthetic lambda$of$1(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p0, Ljava/util/List;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method private static synthetic lambda$of$2(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p0, Ljava/util/List;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method private static synthetic lambda$of$3(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p0, Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private static synthetic lambda$of$4(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p0, Ljava/util/Collection;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private static synthetic lambda$of$5(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p0, Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private static synthetic lambda$of$6(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p0, Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private static synthetic lambda$readJSONBObject$10(Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private synthetic lambda$readJSONBObject$11(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/util/Collection;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemType:Ljava/lang/reflect/Type;

    .line 10
    .line 11
    instance-of v1, v0, Ljava/lang/Class;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast v0, Ljava/lang/Class;

    .line 16
    .line 17
    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    invoke-static {p1}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method private static synthetic lambda$readJSONBObject$7(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method private static synthetic lambda$readJSONBObject$8(Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static synthetic lambda$readJSONBObject$9(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static of(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 12

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    const-string p2, ""

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :cond_0
    move-object v1, p0

    .line 24
    nop

    .line 25
    instance-of p0, v1, Ljava/lang/reflect/ParameterizedType;

    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    const/4 p3, 0x1

    .line 29
    const-class v0, Ljava/lang/Object;

    .line 30
    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    move-object p0, v1

    .line 34
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    array-length v3, p0

    .line 45
    if-ne v3, p3, :cond_1

    .line 46
    .line 47
    aget-object v0, p0, p2

    .line 48
    .line 49
    :cond_1
    :goto_0
    move-object v4, v0

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    if-eqz p1, :cond_3

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    instance-of v2, p0, Ljava/lang/reflect/ParameterizedType;

    .line 58
    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 62
    .line 63
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    array-length v3, p0

    .line 72
    if-ne v3, p3, :cond_1

    .line 73
    .line 74
    aget-object v0, p0, p2

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    move-object v4, v0

    .line 78
    move-object v2, v1

    .line 79
    :goto_1
    if-nez p1, :cond_4

    .line 80
    .line 81
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    :cond_4
    move-object v2, p1

    .line 86
    const-class p0, Ljava/lang/Iterable;

    .line 87
    .line 88
    const/4 p1, 0x3

    .line 89
    const/4 v0, 0x2

    .line 90
    const/4 v3, -0x1

    .line 91
    const/4 v5, 0x0

    .line 92
    const-class v6, Ljava/util/ArrayList;

    .line 93
    .line 94
    if-eq v2, p0, :cond_18

    .line 95
    .line 96
    const-class p0, Ljava/util/Collection;

    .line 97
    .line 98
    if-eq v2, p0, :cond_18

    .line 99
    .line 100
    const-class p0, Ljava/util/List;

    .line 101
    .line 102
    if-eq v2, p0, :cond_18

    .line 103
    .line 104
    const-class p0, Ljava/util/AbstractCollection;

    .line 105
    .line 106
    if-eq v2, p0, :cond_18

    .line 107
    .line 108
    const-class p0, Ljava/util/AbstractList;

    .line 109
    .line 110
    if-ne v2, p0, :cond_5

    .line 111
    .line 112
    goto/16 :goto_5

    .line 113
    .line 114
    :cond_5
    const-class p0, Ljava/util/Queue;

    .line 115
    .line 116
    if-eq v2, p0, :cond_1b

    .line 117
    .line 118
    const-class p0, Ljava/util/Deque;

    .line 119
    .line 120
    if-eq v2, p0, :cond_1b

    .line 121
    .line 122
    const-class p0, Ljava/util/AbstractSequentialList;

    .line 123
    .line 124
    if-ne v2, p0, :cond_6

    .line 125
    .line 126
    goto/16 :goto_9

    .line 127
    .line 128
    :cond_6
    const-class p0, Ljava/util/Set;

    .line 129
    .line 130
    const-class v7, Ljava/util/HashSet;

    .line 131
    .line 132
    if-eq v2, p0, :cond_1a

    .line 133
    .line 134
    const-class p0, Ljava/util/AbstractSet;

    .line 135
    .line 136
    if-ne v2, p0, :cond_7

    .line 137
    .line 138
    goto/16 :goto_8

    .line 139
    .line 140
    :cond_7
    const-class p0, Ljava/util/EnumSet;

    .line 141
    .line 142
    const/4 v8, 0x4

    .line 143
    if-ne v2, p0, :cond_8

    .line 144
    .line 145
    new-instance p0, Lbc/j;

    .line 146
    .line 147
    invoke-direct {p0, v4, v8}, Lbc/j;-><init>(Ljava/lang/Object;I)V

    .line 148
    .line 149
    .line 150
    :goto_2
    move-object v6, v7

    .line 151
    goto/16 :goto_a

    .line 152
    .line 153
    :cond_8
    const-class p0, Ljava/util/NavigableSet;

    .line 154
    .line 155
    const-class v9, Ljava/util/TreeSet;

    .line 156
    .line 157
    if-eq v2, p0, :cond_19

    .line 158
    .line 159
    const-class p0, Ljava/util/SortedSet;

    .line 160
    .line 161
    if-ne v2, p0, :cond_9

    .line 162
    .line 163
    goto/16 :goto_7

    .line 164
    .line 165
    :cond_9
    sget-object p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_SINGLETON:Ljava/lang/Class;

    .line 166
    .line 167
    if-ne v2, p0, :cond_a

    .line 168
    .line 169
    new-instance p0, Lcom/alibaba/fastjson2/reader/f;

    .line 170
    .line 171
    const/16 v7, 0x9

    .line 172
    .line 173
    invoke-direct {p0, v7}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 174
    .line 175
    .line 176
    goto/16 :goto_a

    .line 177
    .line 178
    :cond_a
    sget-object p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_SINGLETON_LIST:Ljava/lang/Class;

    .line 179
    .line 180
    if-ne v2, p0, :cond_b

    .line 181
    .line 182
    new-instance p0, Lcom/alibaba/fastjson2/reader/f;

    .line 183
    .line 184
    const/16 v7, 0xa

    .line 185
    .line 186
    invoke-direct {p0, v7}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 187
    .line 188
    .line 189
    goto/16 :goto_a

    .line 190
    .line 191
    :cond_b
    sget-object p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_ARRAYS_LIST:Ljava/lang/Class;

    .line 192
    .line 193
    if-ne v2, p0, :cond_c

    .line 194
    .line 195
    new-instance v6, Lcom/alibaba/fastjson2/reader/f;

    .line 196
    .line 197
    const/16 v7, 0xb

    .line 198
    .line 199
    invoke-direct {v6, v7}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 200
    .line 201
    .line 202
    move-object v11, v6

    .line 203
    move-object v6, p0

    .line 204
    move-object p0, v11

    .line 205
    goto/16 :goto_a

    .line 206
    .line 207
    :cond_c
    sget-object p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_UNMODIFIABLE_COLLECTION:Ljava/lang/Class;

    .line 208
    .line 209
    if-ne v2, p0, :cond_d

    .line 210
    .line 211
    new-instance p0, Lcom/alibaba/fastjson2/reader/f;

    .line 212
    .line 213
    const/16 v7, 0xc

    .line 214
    .line 215
    invoke-direct {p0, v7}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 216
    .line 217
    .line 218
    goto/16 :goto_a

    .line 219
    .line 220
    :cond_d
    sget-object p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_UNMODIFIABLE_LIST:Ljava/lang/Class;

    .line 221
    .line 222
    if-ne v2, p0, :cond_e

    .line 223
    .line 224
    new-instance p0, Lcom/alibaba/fastjson2/reader/f;

    .line 225
    .line 226
    const/16 v7, 0xd

    .line 227
    .line 228
    invoke-direct {p0, v7}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 229
    .line 230
    .line 231
    goto/16 :goto_a

    .line 232
    .line 233
    :cond_e
    sget-object p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_UNMODIFIABLE_SET:Ljava/lang/Class;

    .line 234
    .line 235
    if-ne v2, p0, :cond_f

    .line 236
    .line 237
    new-instance p0, Lcom/alibaba/fastjson2/reader/f;

    .line 238
    .line 239
    const/16 v6, 0xe

    .line 240
    .line 241
    invoke-direct {p0, v6}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 242
    .line 243
    .line 244
    const-class v6, Ljava/util/LinkedHashSet;

    .line 245
    .line 246
    goto/16 :goto_a

    .line 247
    .line 248
    :cond_f
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 256
    .line 257
    .line 258
    move-result v10

    .line 259
    sparse-switch v10, :sswitch_data_0

    .line 260
    .line 261
    .line 262
    :goto_3
    move v8, v3

    .line 263
    goto/16 :goto_4

    .line 264
    .line 265
    :sswitch_0
    const-string v8, "java.util.AbstractList$SubList"

    .line 266
    .line 267
    invoke-virtual {p0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result p0

    .line 271
    if-nez p0, :cond_10

    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_10
    const/4 v8, 0x7

    .line 275
    goto :goto_4

    .line 276
    :sswitch_1
    const-string v8, "java.util.RandomAccessSubList"

    .line 277
    .line 278
    invoke-virtual {p0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result p0

    .line 282
    if-nez p0, :cond_11

    .line 283
    .line 284
    goto :goto_3

    .line 285
    :cond_11
    const/4 v8, 0x6

    .line 286
    goto :goto_4

    .line 287
    :sswitch_2
    const-string v8, "java.util.SubList"

    .line 288
    .line 289
    invoke-virtual {p0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result p0

    .line 293
    if-nez p0, :cond_12

    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_12
    const/4 v8, 0x5

    .line 297
    goto :goto_4

    .line 298
    :sswitch_3
    const-string v10, "java.util.Collections$SynchronizedRandomAccessList"

    .line 299
    .line 300
    invoke-virtual {p0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result p0

    .line 304
    if-nez p0, :cond_17

    .line 305
    .line 306
    goto :goto_3

    .line 307
    :sswitch_4
    const-string v8, "java.util.Collections$SynchronizedCollection"

    .line 308
    .line 309
    invoke-virtual {p0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result p0

    .line 313
    if-nez p0, :cond_13

    .line 314
    .line 315
    goto :goto_3

    .line 316
    :cond_13
    move v8, p1

    .line 317
    goto :goto_4

    .line 318
    :sswitch_5
    const-string v8, "java.util.Collections$SynchronizedSet"

    .line 319
    .line 320
    invoke-virtual {p0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result p0

    .line 324
    if-nez p0, :cond_14

    .line 325
    .line 326
    goto :goto_3

    .line 327
    :cond_14
    move v8, v0

    .line 328
    goto :goto_4

    .line 329
    :sswitch_6
    const-string v8, "java.util.Collections$SynchronizedSortedSet"

    .line 330
    .line 331
    invoke-virtual {p0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result p0

    .line 335
    if-nez p0, :cond_15

    .line 336
    .line 337
    goto :goto_3

    .line 338
    :cond_15
    move v8, p3

    .line 339
    goto :goto_4

    .line 340
    :sswitch_7
    const-string v8, "java.util.AbstractList$RandomAccessSubList"

    .line 341
    .line 342
    invoke-virtual {p0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result p0

    .line 346
    if-nez p0, :cond_16

    .line 347
    .line 348
    goto :goto_3

    .line 349
    :cond_16
    move v8, p2

    .line 350
    :cond_17
    :goto_4
    packed-switch v8, :pswitch_data_0

    .line 351
    .line 352
    .line 353
    move-object v6, v2

    .line 354
    :cond_18
    :goto_5
    :pswitch_0
    move-object p0, v5

    .line 355
    goto :goto_a

    .line 356
    :pswitch_1
    new-instance p0, Lcom/alibaba/fastjson2/reader/f;

    .line 357
    .line 358
    const/16 v7, 0xf

    .line 359
    .line 360
    invoke-direct {p0, v7}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 361
    .line 362
    .line 363
    goto :goto_a

    .line 364
    :pswitch_2
    new-instance p0, Lcom/alibaba/fastjson2/reader/f;

    .line 365
    .line 366
    const/16 v7, 0x10

    .line 367
    .line 368
    invoke-direct {p0, v7}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 369
    .line 370
    .line 371
    goto :goto_a

    .line 372
    :pswitch_3
    new-instance p0, Lcom/alibaba/fastjson2/reader/f;

    .line 373
    .line 374
    invoke-direct {p0, p2}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 375
    .line 376
    .line 377
    goto/16 :goto_2

    .line 378
    .line 379
    :pswitch_4
    new-instance p0, Lcom/alibaba/fastjson2/reader/f;

    .line 380
    .line 381
    const/16 v6, 0x8

    .line 382
    .line 383
    invoke-direct {p0, v6}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 384
    .line 385
    .line 386
    :goto_6
    move-object v6, v9

    .line 387
    goto :goto_a

    .line 388
    :cond_19
    :goto_7
    move-object p0, v5

    .line 389
    goto :goto_6

    .line 390
    :cond_1a
    :goto_8
    move-object p0, v5

    .line 391
    goto/16 :goto_2

    .line 392
    .line 393
    :cond_1b
    :goto_9
    const-class v6, Ljava/util/LinkedList;

    .line 394
    .line 395
    goto :goto_5

    .line 396
    :goto_a
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v7

    .line 400
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 404
    .line 405
    .line 406
    move-result v8

    .line 407
    sparse-switch v8, :sswitch_data_1

    .line 408
    .line 409
    .line 410
    :goto_b
    move p2, v3

    .line 411
    goto :goto_c

    .line 412
    :sswitch_8
    const-string p2, "kotlin.collections.EmptySet"

    .line 413
    .line 414
    invoke-virtual {v7, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result p2

    .line 418
    if-nez p2, :cond_1c

    .line 419
    .line 420
    goto :goto_b

    .line 421
    :cond_1c
    move p2, p1

    .line 422
    goto :goto_c

    .line 423
    :sswitch_9
    const-string p1, "java.util.Collections$EmptyList"

    .line 424
    .line 425
    invoke-virtual {v7, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result p1

    .line 429
    if-nez p1, :cond_1d

    .line 430
    .line 431
    goto :goto_b

    .line 432
    :cond_1d
    move p2, v0

    .line 433
    goto :goto_c

    .line 434
    :sswitch_a
    const-string p1, "java.util.Collections$EmptySet"

    .line 435
    .line 436
    invoke-virtual {v7, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result p1

    .line 440
    if-nez p1, :cond_1e

    .line 441
    .line 442
    goto :goto_b

    .line 443
    :cond_1e
    move p2, p3

    .line 444
    goto :goto_c

    .line 445
    :sswitch_b
    const-string p1, "kotlin.collections.EmptyList"

    .line 446
    .line 447
    invoke-virtual {v7, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    move-result p1

    .line 451
    if-nez p1, :cond_1f

    .line 452
    .line 453
    goto :goto_b

    .line 454
    :cond_1f
    :goto_c
    packed-switch p2, :pswitch_data_1

    .line 455
    .line 456
    .line 457
    sget-object p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_EMPTY_SET:Ljava/lang/Class;

    .line 458
    .line 459
    if-eq v1, p1, :cond_23

    .line 460
    .line 461
    sget-object p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_EMPTY_LIST:Ljava/lang/Class;

    .line 462
    .line 463
    if-ne v1, p1, :cond_20

    .line 464
    .line 465
    goto :goto_d

    .line 466
    :cond_20
    const-class p1, Ljava/lang/String;

    .line 467
    .line 468
    if-ne v4, p1, :cond_21

    .line 469
    .line 470
    if-nez p0, :cond_21

    .line 471
    .line 472
    new-instance p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;

    .line 473
    .line 474
    invoke-direct {p0, v2, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 475
    .line 476
    .line 477
    return-object p0

    .line 478
    :cond_21
    const-class p1, Ljava/lang/Long;

    .line 479
    .line 480
    if-ne v4, p1, :cond_22

    .line 481
    .line 482
    if-nez p0, :cond_22

    .line 483
    .line 484
    new-instance p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;

    .line 485
    .line 486
    invoke-direct {p0, v2, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 487
    .line 488
    .line 489
    return-object p0

    .line 490
    :cond_22
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;

    .line 491
    .line 492
    move-object v5, p0

    .line 493
    move-object v3, v6

    .line 494
    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;-><init>(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/function/Function;)V

    .line 495
    .line 496
    .line 497
    return-object v0

    .line 498
    :cond_23
    :goto_d
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;

    .line 499
    .line 500
    move-object v2, v1

    .line 501
    check-cast v2, Ljava/lang/Class;

    .line 502
    .line 503
    const-class v4, Ljava/lang/Object;

    .line 504
    .line 505
    const/4 v5, 0x0

    .line 506
    move-object v3, v2

    .line 507
    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;-><init>(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/function/Function;)V

    .line 508
    .line 509
    .line 510
    return-object v0

    .line 511
    :pswitch_5
    new-instance p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;

    .line 512
    .line 513
    check-cast v1, Ljava/lang/Class;

    .line 514
    .line 515
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 516
    .line 517
    invoke-direct {p0, v1, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    return-object p0

    .line 521
    :pswitch_6
    new-instance p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;

    .line 522
    .line 523
    check-cast v1, Ljava/lang/Class;

    .line 524
    .line 525
    sget-object p1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 526
    .line 527
    invoke-direct {p0, v1, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 528
    .line 529
    .line 530
    return-object p0

    .line 531
    :pswitch_7
    move-object p0, v1

    .line 532
    check-cast p0, Ljava/lang/Class;

    .line 533
    .line 534
    :try_start_0
    const-string p1, "INSTANCE"

    .line 535
    .line 536
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 537
    .line 538
    .line 539
    move-result-object p1

    .line 540
    invoke-virtual {p1}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 541
    .line 542
    .line 543
    move-result p2

    .line 544
    if-nez p2, :cond_24

    .line 545
    .line 546
    invoke-virtual {p1, p3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 547
    .line 548
    .line 549
    goto :goto_f

    .line 550
    :catch_0
    move-exception v0

    .line 551
    :goto_e
    move-object p0, v0

    .line 552
    goto :goto_10

    .line 553
    :catch_1
    move-exception v0

    .line 554
    goto :goto_e

    .line 555
    :cond_24
    :goto_f
    invoke-virtual {p1, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 559
    new-instance p2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;

    .line 560
    .line 561
    invoke-direct {p2, p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    return-object p2

    .line 565
    :goto_10
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 566
    .line 567
    new-instance p2, Ljava/lang/StringBuilder;

    .line 568
    .line 569
    const-string p3, "Failed to get singleton of "

    .line 570
    .line 571
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object p2

    .line 581
    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 582
    .line 583
    .line 584
    throw p1

    .line 585
    :sswitch_data_0
    .sparse-switch
        -0x7fab182d -> :sswitch_7
        -0x7a823dfe -> :sswitch_6
        -0x6007a441 -> :sswitch_5
        -0x30d4835f -> :sswitch_4
        -0xcb38ef8 -> :sswitch_3
        0x136dc13e -> :sswitch_2
        0x1bd28b37 -> :sswitch_1
        0x300127da -> :sswitch_0
    .end sparse-switch

    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    :sswitch_data_1
    .sparse-switch
        -0x6c36e6db -> :sswitch_b
        -0x18a7e41c -> :sswitch_a
        0x3a8415c -> :sswitch_9
        0x1548a6fb -> :sswitch_8
    .end sparse-switch

    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_7
    .end packed-switch
.end method


# virtual methods
.method public createInstance(J)Ljava/lang/Object;
    .locals 3

    .line 272
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->instanceType:Ljava/lang/Class;

    const-class p2, Ljava/util/ArrayList;

    if-ne p1, p2, :cond_0

    .line 273
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    .line 274
    :cond_0
    const-class p2, Ljava/util/LinkedList;

    if-ne p1, p2, :cond_1

    .line 275
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    return-object p1

    .line 276
    :cond_1
    const-class p2, Ljava/util/HashSet;

    if-ne p1, p2, :cond_2

    .line 277
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    return-object p1

    .line 278
    :cond_2
    const-class p2, Ljava/util/LinkedHashSet;

    if-ne p1, p2, :cond_3

    .line 279
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    return-object p1

    .line 280
    :cond_3
    const-class p2, Ljava/util/TreeSet;

    if-ne p1, p2, :cond_4

    .line 281
    new-instance p1, Ljava/util/TreeSet;

    invoke-direct {p1}, Ljava/util/TreeSet;-><init>()V

    return-object p1

    .line 282
    :cond_4
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->listSingleton:Ljava/lang/Object;

    if-eqz p2, :cond_5

    return-object p2

    :cond_5
    if-eqz p1, :cond_9

    .line 283
    iget-boolean p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->instanceError:Z

    const-string p2, "create list error, type "

    const/4 v0, 0x1

    if-nez p1, :cond_6

    .line 284
    :try_start_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->instanceType:Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 285
    :catch_0
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->instanceError:Z

    .line 286
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->instanceType:Ljava/lang/Class;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_6
    const/4 p1, 0x0

    .line 287
    :goto_0
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->instanceError:Z

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->instanceType:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/util/List;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 288
    :try_start_1
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->instanceType:Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    .line 289
    :catch_1
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->instanceError:Z

    .line 290
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->instanceType:Ljava/lang/Class;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    :cond_7
    if-nez p1, :cond_8

    goto :goto_1

    .line 291
    :cond_8
    throw p1

    .line 292
    :cond_9
    :goto_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method

.method public createInstance(Ljava/util/Collection;J)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->listClass:Ljava/lang/Class;

    .line 8
    .line 9
    const-class v1, Ljava/util/List;

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    new-instance p1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->builder:Ljava/util/function/Function;

    .line 19
    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    invoke-interface {p2, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :cond_0
    return-object p1

    .line 27
    :cond_1
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->instanceType:Ljava/lang/Class;

    .line 30
    .line 31
    const-class v2, Ljava/util/ArrayList;

    .line 32
    .line 33
    if-ne v1, v2, :cond_2

    .line 34
    .line 35
    new-instance v1, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {p0, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->createInstance(J)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ljava/util/Collection;

    .line 50
    .line 51
    :goto_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_11

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    if-nez v2, :cond_3

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    const-class v4, Lcom/alibaba/fastjson2/JSONObject;

    .line 77
    .line 78
    if-eq v3, v4, :cond_4

    .line 79
    .line 80
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getClassJSONObject1x()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    if-ne v3, v4, :cond_6

    .line 85
    .line 86
    :cond_4
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemClass:Ljava/lang/Class;

    .line 87
    .line 88
    if-eq v4, v3, :cond_6

    .line 89
    .line 90
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 91
    .line 92
    if-nez v3, :cond_5

    .line 93
    .line 94
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemType:Ljava/lang/reflect/Type;

    .line 95
    .line 96
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    iput-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 101
    .line 102
    :cond_5
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 103
    .line 104
    check-cast v2, Lcom/alibaba/fastjson2/JSONObject;

    .line 105
    .line 106
    invoke-interface {v3, v2, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Map;J)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    goto/16 :goto_3

    .line 111
    .line 112
    :cond_6
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemType:Ljava/lang/reflect/Type;

    .line 113
    .line 114
    if-eq v3, v4, :cond_10

    .line 115
    .line 116
    invoke-virtual {v0, v3, v4}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getTypeConvert(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    if-eqz v4, :cond_7

    .line 121
    .line 122
    invoke-interface {v4, v2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    goto/16 :goto_3

    .line 127
    .line 128
    :cond_7
    instance-of v4, v2, Ljava/util/Map;

    .line 129
    .line 130
    if-eqz v4, :cond_9

    .line 131
    .line 132
    check-cast v2, Ljava/util/Map;

    .line 133
    .line 134
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 135
    .line 136
    if-nez v3, :cond_8

    .line 137
    .line 138
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemType:Ljava/lang/reflect/Type;

    .line 139
    .line 140
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    iput-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 145
    .line 146
    :cond_8
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 147
    .line 148
    invoke-interface {v3, v2, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Map;J)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    goto :goto_3

    .line 153
    :cond_9
    instance-of v4, v2, Ljava/util/Collection;

    .line 154
    .line 155
    if-eqz v4, :cond_b

    .line 156
    .line 157
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 158
    .line 159
    if-nez v3, :cond_a

    .line 160
    .line 161
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemType:Ljava/lang/reflect/Type;

    .line 162
    .line 163
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    iput-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 168
    .line 169
    :cond_a
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 170
    .line 171
    check-cast v2, Ljava/util/Collection;

    .line 172
    .line 173
    invoke-interface {v3, v2, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Collection;J)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    goto :goto_3

    .line 178
    :cond_b
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemClass:Ljava/lang/Class;

    .line 179
    .line 180
    invoke-virtual {v4, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    if-eqz v4, :cond_c

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_c
    const-class v4, Ljava/lang/Enum;

    .line 188
    .line 189
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemClass:Ljava/lang/Class;

    .line 190
    .line 191
    invoke-virtual {v4, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    const-string v5, " to "

    .line 196
    .line 197
    const-string v6, "can not convert from "

    .line 198
    .line 199
    if-eqz v4, :cond_f

    .line 200
    .line 201
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 202
    .line 203
    if-nez v4, :cond_d

    .line 204
    .line 205
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemType:Ljava/lang/reflect/Type;

    .line 206
    .line 207
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    iput-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 212
    .line 213
    :cond_d
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 214
    .line 215
    instance-of v7, v4, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;

    .line 216
    .line 217
    if-eqz v7, :cond_e

    .line 218
    .line 219
    check-cast v4, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;

    .line 220
    .line 221
    check-cast v2, Ljava/lang/String;

    .line 222
    .line 223
    invoke-virtual {v4, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->getEnum(Ljava/lang/String;)Ljava/lang/Enum;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    goto :goto_3

    .line 228
    :cond_e
    new-instance p1, Ljava/lang/StringBuilder;

    .line 229
    .line 230
    invoke-direct {p1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemType:Ljava/lang/reflect/Type;

    .line 237
    .line 238
    invoke-static {p1, v5, p2}, Lah/a;->s(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    :goto_2
    const/4 p1, 0x0

    .line 242
    return-object p1

    .line 243
    :cond_f
    new-instance p1, Ljava/lang/StringBuilder;

    .line 244
    .line 245
    invoke-direct {p1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemType:Ljava/lang/reflect/Type;

    .line 252
    .line 253
    invoke-static {p1, v5, p2}, Lah/a;->s(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_10
    :goto_3
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    goto/16 :goto_1

    .line 261
    .line 262
    :cond_11
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->builder:Ljava/util/function/Function;

    .line 263
    .line 264
    if-eqz p1, :cond_12

    .line 265
    .line 266
    invoke-interface {p1, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    return-object p1

    .line 271
    :cond_12
    return-object v1
.end method

.method public getBuildFunction()Ljava/util/function/Function;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->builder:Ljava/util/function/Function;

    .line 2
    .line 3
    return-object v0
.end method

.method public getObjectClass()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->listClass:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v8, 0x0

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    return-object v8

    .line 13
    :cond_0
    iget-object v3, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->listClass:Ljava/lang/Class;

    .line 14
    .line 15
    const-wide/16 v4, 0x0

    .line 16
    .line 17
    move-object/from16 v2, p1

    .line 18
    .line 19
    move-wide/from16 v6, p4

    .line 20
    .line 21
    invoke-virtual/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONReader;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-object v4, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->builder:Ljava/util/function/Function;

    .line 26
    .line 27
    iget-object v5, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->instanceType:Ljava/lang/Class;

    .line 28
    .line 29
    const-class v6, Ljava/util/LinkedHashSet;

    .line 30
    .line 31
    const-class v7, Ljava/util/ArrayList;

    .line 32
    .line 33
    if-eqz v3, :cond_6

    .line 34
    .line 35
    instance-of v5, v3, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;

    .line 36
    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    check-cast v3, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;

    .line 40
    .line 41
    iget-object v4, v3, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->instanceType:Ljava/lang/Class;

    .line 42
    .line 43
    iget-object v3, v3, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->builder:Ljava/util/function/Function;

    .line 44
    .line 45
    move-object v5, v4

    .line 46
    move-object v4, v3

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-interface {v3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getObjectClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    move-object v5, v3

    .line 53
    :goto_0
    sget-object v3, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_UNMODIFIABLE_COLLECTION:Ljava/lang/Class;

    .line 54
    .line 55
    if-ne v5, v3, :cond_2

    .line 56
    .line 57
    new-instance v4, Lcom/alibaba/fastjson2/reader/f;

    .line 58
    .line 59
    const/4 v3, 0x1

    .line 60
    invoke-direct {v4, v3}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 61
    .line 62
    .line 63
    :goto_1
    move-object v5, v7

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    sget-object v3, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_UNMODIFIABLE_LIST:Ljava/lang/Class;

    .line 66
    .line 67
    if-ne v5, v3, :cond_3

    .line 68
    .line 69
    new-instance v4, Lcom/alibaba/fastjson2/reader/f;

    .line 70
    .line 71
    const/4 v3, 0x2

    .line 72
    invoke-direct {v4, v3}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    sget-object v3, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_UNMODIFIABLE_SET:Ljava/lang/Class;

    .line 77
    .line 78
    if-ne v5, v3, :cond_4

    .line 79
    .line 80
    new-instance v4, Lcom/alibaba/fastjson2/reader/f;

    .line 81
    .line 82
    const/4 v3, 0x3

    .line 83
    invoke-direct {v4, v3}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 84
    .line 85
    .line 86
    move-object v5, v6

    .line 87
    goto :goto_2

    .line 88
    :cond_4
    sget-object v3, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_SINGLETON:Ljava/lang/Class;

    .line 89
    .line 90
    if-ne v5, v3, :cond_5

    .line 91
    .line 92
    new-instance v4, Lcom/alibaba/fastjson2/reader/f;

    .line 93
    .line 94
    const/4 v3, 0x4

    .line 95
    invoke-direct {v4, v3}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    sget-object v3, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_SINGLETON_LIST:Ljava/lang/Class;

    .line 100
    .line 101
    if-ne v5, v3, :cond_6

    .line 102
    .line 103
    new-instance v4, Lcom/alibaba/fastjson2/reader/f;

    .line 104
    .line 105
    const/4 v3, 0x5

    .line 106
    invoke-direct {v4, v3}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_6
    :goto_2
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->startArray()I

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    if-lez v9, :cond_7

    .line 115
    .line 116
    iget-object v3, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 117
    .line 118
    if-nez v3, :cond_7

    .line 119
    .line 120
    iget-object v3, v2, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 121
    .line 122
    iget-object v10, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemType:Ljava/lang/reflect/Type;

    .line 123
    .line 124
    invoke-virtual {v3, v10}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    iput-object v3, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 129
    .line 130
    :cond_7
    sget-object v3, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_ARRAYS_LIST:Ljava/lang/Class;

    .line 131
    .line 132
    const-string v10, ".."

    .line 133
    .line 134
    const/4 v11, 0x0

    .line 135
    if-ne v5, v3, :cond_b

    .line 136
    .line 137
    new-array v0, v9, [Ljava/lang/Object;

    .line 138
    .line 139
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object v12

    .line 143
    :goto_3
    if-ge v11, v9, :cond_a

    .line 144
    .line 145
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->isReference()Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-eqz v3, :cond_9

    .line 150
    .line 151
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readReference()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    if-eqz v4, :cond_8

    .line 160
    .line 161
    move-object v3, v12

    .line 162
    goto :goto_4

    .line 163
    :cond_8
    invoke-static {v3}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-virtual {v2, v12, v11, v3}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask(Ljava/util/Collection;ILcom/alibaba/fastjson2/JSONPath;)V

    .line 168
    .line 169
    .line 170
    move-object v3, v8

    .line 171
    :goto_4
    move-object v15, v3

    .line 172
    move-object v3, v2

    .line 173
    move-object v2, v15

    .line 174
    goto :goto_5

    .line 175
    :cond_9
    iget-object v2, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 176
    .line 177
    iget-object v4, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemType:Ljava/lang/reflect/Type;

    .line 178
    .line 179
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    move-object/from16 v3, p1

    .line 184
    .line 185
    move-wide/from16 v6, p4

    .line 186
    .line 187
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    :goto_5
    aput-object v2, v0, v11

    .line 192
    .line 193
    add-int/lit8 v11, v11, 0x1

    .line 194
    .line 195
    move-object v2, v3

    .line 196
    goto :goto_3

    .line 197
    :cond_a
    return-object v12

    .line 198
    :cond_b
    move-object v3, v2

    .line 199
    if-ne v5, v7, :cond_d

    .line 200
    .line 201
    new-instance v2, Ljava/util/ArrayList;

    .line 202
    .line 203
    if-lez v9, :cond_c

    .line 204
    .line 205
    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 206
    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_c
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 210
    .line 211
    .line 212
    :goto_6
    move-object v12, v2

    .line 213
    move-object v13, v4

    .line 214
    goto/16 :goto_8

    .line 215
    .line 216
    :cond_d
    const-class v2, Lcom/alibaba/fastjson2/JSONArray;

    .line 217
    .line 218
    if-ne v5, v2, :cond_f

    .line 219
    .line 220
    new-instance v2, Lcom/alibaba/fastjson2/JSONArray;

    .line 221
    .line 222
    if-lez v9, :cond_e

    .line 223
    .line 224
    invoke-direct {v2, v9}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 225
    .line 226
    .line 227
    goto :goto_6

    .line 228
    :cond_e
    invoke-direct {v2}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 229
    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_f
    const-class v2, Ljava/util/HashSet;

    .line 233
    .line 234
    if-ne v5, v2, :cond_10

    .line 235
    .line 236
    new-instance v2, Ljava/util/HashSet;

    .line 237
    .line 238
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 239
    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_10
    if-ne v5, v6, :cond_11

    .line 243
    .line 244
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 245
    .line 246
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 247
    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_11
    const-class v2, Ljava/util/TreeSet;

    .line 251
    .line 252
    if-ne v5, v2, :cond_12

    .line 253
    .line 254
    new-instance v2, Ljava/util/TreeSet;

    .line 255
    .line 256
    invoke-direct {v2}, Ljava/util/TreeSet;-><init>()V

    .line 257
    .line 258
    .line 259
    goto :goto_6

    .line 260
    :cond_12
    sget-object v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_EMPTY_SET:Ljava/lang/Class;

    .line 261
    .line 262
    if-ne v5, v2, :cond_13

    .line 263
    .line 264
    sget-object v2, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_13
    sget-object v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_EMPTY_LIST:Ljava/lang/Class;

    .line 268
    .line 269
    if-ne v5, v2, :cond_14

    .line 270
    .line 271
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 272
    .line 273
    goto :goto_6

    .line 274
    :cond_14
    sget-object v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_SINGLETON_LIST:Ljava/lang/Class;

    .line 275
    .line 276
    if-ne v5, v2, :cond_15

    .line 277
    .line 278
    new-instance v2, Ljava/util/ArrayList;

    .line 279
    .line 280
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 281
    .line 282
    .line 283
    new-instance v4, Lcom/alibaba/fastjson2/reader/f;

    .line 284
    .line 285
    const/4 v6, 0x6

    .line 286
    invoke-direct {v4, v6}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 287
    .line 288
    .line 289
    goto :goto_6

    .line 290
    :cond_15
    sget-object v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_UNMODIFIABLE_LIST:Ljava/lang/Class;

    .line 291
    .line 292
    if-ne v5, v2, :cond_16

    .line 293
    .line 294
    new-instance v2, Ljava/util/ArrayList;

    .line 295
    .line 296
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 297
    .line 298
    .line 299
    new-instance v4, Lcom/alibaba/fastjson2/reader/f;

    .line 300
    .line 301
    const/4 v6, 0x7

    .line 302
    invoke-direct {v4, v6}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 303
    .line 304
    .line 305
    goto :goto_6

    .line 306
    :cond_16
    if-eqz v5, :cond_17

    .line 307
    .line 308
    const-class v2, Ljava/util/EnumSet;

    .line 309
    .line 310
    invoke-virtual {v2, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    if-eqz v2, :cond_17

    .line 315
    .line 316
    new-instance v2, Ljava/util/HashSet;

    .line 317
    .line 318
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 319
    .line 320
    .line 321
    new-instance v4, Lbc/j;

    .line 322
    .line 323
    const/4 v6, 0x5

    .line 324
    invoke-direct {v4, v1, v6}, Lbc/j;-><init>(Ljava/lang/Object;I)V

    .line 325
    .line 326
    .line 327
    goto :goto_6

    .line 328
    :cond_17
    if-eqz v5, :cond_18

    .line 329
    .line 330
    iget-object v2, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->listType:Ljava/lang/reflect/Type;

    .line 331
    .line 332
    if-eq v5, v2, :cond_18

    .line 333
    .line 334
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    check-cast v2, Ljava/util/Collection;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 339
    .line 340
    goto/16 :goto_6

    .line 341
    .line 342
    :catch_0
    move-exception v0

    .line 343
    goto :goto_7

    .line 344
    :catch_1
    move-exception v0

    .line 345
    :goto_7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 346
    .line 347
    const-string v4, "create instance error "

    .line 348
    .line 349
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    invoke-static {v2, v0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 364
    .line 365
    .line 366
    const/4 v0, 0x0

    .line 367
    return-object v0

    .line 368
    :cond_18
    iget-object v2, v3, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 369
    .line 370
    iget-wide v6, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 371
    .line 372
    or-long v6, v6, p4

    .line 373
    .line 374
    invoke-virtual {v1, v6, v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->createInstance(J)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    check-cast v2, Ljava/util/Collection;

    .line 379
    .line 380
    goto/16 :goto_6

    .line 381
    .line 382
    :goto_8
    iget-object v2, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 383
    .line 384
    iget-object v4, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemType:Ljava/lang/reflect/Type;

    .line 385
    .line 386
    if-eqz v0, :cond_1d

    .line 387
    .line 388
    if-eq v0, v5, :cond_1d

    .line 389
    .line 390
    instance-of v5, v0, Ljava/lang/reflect/ParameterizedType;

    .line 391
    .line 392
    if-eqz v5, :cond_1d

    .line 393
    .line 394
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 395
    .line 396
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    array-length v5, v0

    .line 401
    const/4 v6, 0x1

    .line 402
    if-ne v5, v6, :cond_1d

    .line 403
    .line 404
    aget-object v4, v0, v11

    .line 405
    .line 406
    iget-object v0, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemType:Ljava/lang/reflect/Type;

    .line 407
    .line 408
    if-eq v4, v0, :cond_1d

    .line 409
    .line 410
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    goto/16 :goto_d

    .line 415
    .line 416
    :goto_9
    if-ge v11, v9, :cond_1e

    .line 417
    .line 418
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReader;->isReference()Z

    .line 419
    .line 420
    .line 421
    move-result v2

    .line 422
    if-eqz v2, :cond_1b

    .line 423
    .line 424
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReader;->readReference()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    move-result v4

    .line 432
    if-eqz v4, :cond_19

    .line 433
    .line 434
    move-object v2, v12

    .line 435
    goto :goto_a

    .line 436
    :cond_19
    invoke-static {v2}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    invoke-virtual {v3, v12, v11, v2}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask(Ljava/util/Collection;ILcom/alibaba/fastjson2/JSONPath;)V

    .line 441
    .line 442
    .line 443
    instance-of v2, v12, Ljava/util/List;

    .line 444
    .line 445
    if-eqz v2, :cond_1a

    .line 446
    .line 447
    move-object v2, v8

    .line 448
    :goto_a
    move-object v4, v2

    .line 449
    move-object v2, v0

    .line 450
    move-object v0, v4

    .line 451
    move-object v4, v14

    .line 452
    goto :goto_b

    .line 453
    :cond_1a
    move-object v2, v0

    .line 454
    move-object v4, v14

    .line 455
    goto :goto_c

    .line 456
    :cond_1b
    iget-object v3, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemClass:Ljava/lang/Class;

    .line 457
    .line 458
    iget-wide v4, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemClassNameHash:J

    .line 459
    .line 460
    move-object/from16 v2, p1

    .line 461
    .line 462
    move-wide/from16 v6, p4

    .line 463
    .line 464
    invoke-virtual/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONReader;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    if-eqz v3, :cond_1c

    .line 469
    .line 470
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 471
    .line 472
    .line 473
    move-result-object v5

    .line 474
    move-wide/from16 v6, p4

    .line 475
    .line 476
    move-object v2, v3

    .line 477
    move-object v4, v14

    .line 478
    move-object/from16 v3, p1

    .line 479
    .line 480
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    move-object v15, v2

    .line 485
    move-object v2, v0

    .line 486
    move-object v0, v15

    .line 487
    goto :goto_b

    .line 488
    :cond_1c
    move-object v4, v14

    .line 489
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 490
    .line 491
    .line 492
    move-result-object v5

    .line 493
    move-object/from16 v3, p1

    .line 494
    .line 495
    move-wide/from16 v6, p4

    .line 496
    .line 497
    move-object v2, v0

    .line 498
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    :goto_b
    invoke-interface {v12, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    :goto_c
    add-int/lit8 v11, v11, 0x1

    .line 506
    .line 507
    move-object/from16 v3, p1

    .line 508
    .line 509
    :cond_1d
    :goto_d
    move-object v0, v2

    .line 510
    move-object v14, v4

    .line 511
    goto :goto_9

    .line 512
    :cond_1e
    if-eqz v13, :cond_1f

    .line 513
    .line 514
    invoke-interface {v13, v12}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    return-object v0

    .line 519
    :cond_1f
    return-object v12
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemType:Ljava/lang/reflect/Type;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 14
    .line 15
    :cond_0
    iget-boolean v1, p1, Lcom/alibaba/fastjson2/JSONReader;->jsonb:Z

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    const-wide/16 v6, 0x0

    .line 20
    .line 21
    move-object v2, p0

    .line 22
    move-object v3, p1

    .line 23
    move-object v4, p2

    .line 24
    move-object v5, p3

    .line 25
    invoke-virtual/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_1
    move-object v2, p0

    .line 31
    move-object v4, p1

    .line 32
    move-object p1, p2

    .line 33
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->readIfNull()Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    const/4 p3, 0x0

    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    return-object p3

    .line 41
    :cond_2
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->nextIfSet()Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_3

    .line 46
    .line 47
    new-instance p2, Ljava/util/HashSet;

    .line 48
    .line 49
    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    iget-wide v5, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 54
    .line 55
    or-long/2addr v5, p4

    .line 56
    invoke-virtual {p0, v5, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->createInstance(J)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    check-cast p2, Ljava/util/Collection;

    .line 61
    .line 62
    :goto_0
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    const/16 v3, 0x22

    .line 67
    .line 68
    const-class v9, Ljava/lang/String;

    .line 69
    .line 70
    if-ne v1, v3, :cond_a

    .line 71
    .line 72
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object v1, v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemClass:Ljava/lang/Class;

    .line 77
    .line 78
    if-ne v1, v9, :cond_4

    .line 79
    .line 80
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 81
    .line 82
    .line 83
    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    return-object p2

    .line 87
    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_5

    .line 92
    .line 93
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 94
    .line 95
    .line 96
    return-object p3

    .line 97
    :cond_5
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader$Context;->getProvider()Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iget-object v3, v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemClass:Ljava/lang/Class;

    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/lang/Class;->isEnum()Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_8

    .line 108
    .line 109
    iget-object v3, v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemClass:Ljava/lang/Class;

    .line 110
    .line 111
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    instance-of v3, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;

    .line 116
    .line 117
    if-eqz v3, :cond_8

    .line 118
    .line 119
    check-cast v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;

    .line 120
    .line 121
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->getEnum(Ljava/lang/String;)Ljava/lang/Enum;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-nez v0, :cond_7

    .line 126
    .line 127
    sget-object p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnEnumNotMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 128
    .line 129
    invoke-virtual {v4, p4, p5}, Lcom/alibaba/fastjson2/JSONReader;->features(J)J

    .line 130
    .line 131
    .line 132
    move-result-wide p4

    .line 133
    invoke-virtual {p2, p4, p5}, Lcom/alibaba/fastjson2/JSONReader$Feature;->isEnabled(J)Z

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    if-nez p2, :cond_6

    .line 138
    .line 139
    return-object p3

    .line 140
    :cond_6
    const-string p2, "enum not match : "

    .line 141
    .line 142
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {v4, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    const/4 p1, 0x0

    .line 154
    return-object p1

    .line 155
    :cond_7
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    return-object p2

    .line 159
    :cond_8
    iget-object p3, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 160
    .line 161
    iget-object p4, v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemType:Ljava/lang/reflect/Type;

    .line 162
    .line 163
    invoke-virtual {p3, v9, p4}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getTypeConvert(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 164
    .line 165
    .line 166
    move-result-object p3

    .line 167
    if-eqz p3, :cond_9

    .line 168
    .line 169
    invoke-interface {p3, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 174
    .line 175
    .line 176
    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    return-object p2

    .line 180
    :cond_9
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    const/4 p1, 0x0

    .line 188
    return-object p1

    .line 189
    :cond_a
    const/16 p3, 0x5b

    .line 190
    .line 191
    const/4 p4, 0x0

    .line 192
    if-ne v1, p3, :cond_13

    .line 193
    .line 194
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 195
    .line 196
    .line 197
    iget-object p3, v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 198
    .line 199
    iget-object p5, v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemType:Ljava/lang/reflect/Type;

    .line 200
    .line 201
    if-eqz p1, :cond_b

    .line 202
    .line 203
    iget-object v0, v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->listType:Ljava/lang/reflect/Type;

    .line 204
    .line 205
    if-eq p1, v0, :cond_b

    .line 206
    .line 207
    instance-of v0, p1, Ljava/lang/reflect/ParameterizedType;

    .line 208
    .line 209
    if-eqz v0, :cond_b

    .line 210
    .line 211
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 212
    .line 213
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    array-length v0, p1

    .line 218
    const/4 v1, 0x1

    .line 219
    if-ne v0, v1, :cond_b

    .line 220
    .line 221
    aget-object p5, p1, p4

    .line 222
    .line 223
    iget-object p1, v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemType:Ljava/lang/reflect/Type;

    .line 224
    .line 225
    if-eq p5, p1, :cond_b

    .line 226
    .line 227
    invoke-virtual {v4, p5}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 228
    .line 229
    .line 230
    move-result-object p3

    .line 231
    :cond_b
    move-object v3, p3

    .line 232
    move-object v5, p5

    .line 233
    :goto_1
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    if-eqz p1, :cond_d

    .line 238
    .line 239
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 240
    .line 241
    .line 242
    iget-object p1, v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->builder:Ljava/util/function/Function;

    .line 243
    .line 244
    if-eqz p1, :cond_c

    .line 245
    .line 246
    invoke-interface {p1, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    return-object p1

    .line 251
    :cond_c
    return-object p2

    .line 252
    :cond_d
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 253
    .line 254
    .line 255
    move-result p1

    .line 256
    const/16 p3, 0x2c

    .line 257
    .line 258
    if-eq p1, p3, :cond_12

    .line 259
    .line 260
    if-ne v5, v9, :cond_e

    .line 261
    .line 262
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    goto :goto_2

    .line 267
    :cond_e
    if-eqz v3, :cond_11

    .line 268
    .line 269
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->isReference()Z

    .line 270
    .line 271
    .line 272
    move-result p1

    .line 273
    if-eqz p1, :cond_10

    .line 274
    .line 275
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->readReference()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    const-string p3, ".."

    .line 280
    .line 281
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result p3

    .line 285
    if-eqz p3, :cond_f

    .line 286
    .line 287
    move-object p1, v2

    .line 288
    goto :goto_2

    .line 289
    :cond_f
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    invoke-virtual {v4, p2, p4, p1}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask(Ljava/util/Collection;ILcom/alibaba/fastjson2/JSONPath;)V

    .line 294
    .line 295
    .line 296
    goto :goto_3

    .line 297
    :cond_10
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 298
    .line 299
    .line 300
    move-result-object v6

    .line 301
    const-wide/16 v7, 0x0

    .line 302
    .line 303
    invoke-interface/range {v3 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    :goto_2
    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    :goto_3
    add-int/lit8 p4, p4, 0x1

    .line 311
    .line 312
    goto :goto_1

    .line 313
    :cond_11
    new-instance p1, Ljava/lang/StringBuilder;

    .line 314
    .line 315
    const-string p2, "TODO : "

    .line 316
    .line 317
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    invoke-virtual {v4, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    const/4 p1, 0x0

    .line 335
    return-object p1

    .line 336
    :cond_12
    const-string p1, "illegal input error"

    .line 337
    .line 338
    invoke-virtual {v4, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    const/4 p1, 0x0

    .line 346
    return-object p1

    .line 347
    :cond_13
    iget-object p1, v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemClass:Ljava/lang/Class;

    .line 348
    .line 349
    const-class p3, Ljava/lang/Object;

    .line 350
    .line 351
    if-eq p1, p3, :cond_14

    .line 352
    .line 353
    iget-object p5, v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 354
    .line 355
    if-nez p5, :cond_15

    .line 356
    .line 357
    :cond_14
    if-ne p1, p3, :cond_17

    .line 358
    .line 359
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->isObject()Z

    .line 360
    .line 361
    .line 362
    move-result p1

    .line 363
    if-eqz p1, :cond_17

    .line 364
    .line 365
    :cond_15
    iget-object v3, v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 366
    .line 367
    iget-object v5, v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemType:Ljava/lang/reflect/Type;

    .line 368
    .line 369
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 370
    .line 371
    .line 372
    move-result-object v6

    .line 373
    const-wide/16 v7, 0x0

    .line 374
    .line 375
    invoke-interface/range {v3 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    iget-object p1, v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->builder:Ljava/util/function/Function;

    .line 383
    .line 384
    if-eqz p1, :cond_16

    .line 385
    .line 386
    invoke-interface {p1, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    check-cast p1, Ljava/util/Collection;

    .line 391
    .line 392
    return-object p1

    .line 393
    :cond_16
    return-object p2

    .line 394
    :cond_17
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    const/4 p1, 0x0

    .line 402
    return-object p1
.end method
