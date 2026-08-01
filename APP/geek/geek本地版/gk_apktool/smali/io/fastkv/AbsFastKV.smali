.class abstract Lio/fastkv/AbsFastKV;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/SharedPreferences;
.implements Landroid/content/SharedPreferences$Editor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/fastkv/AbsFastKV$Segment;
    }
.end annotation


# static fields
.field protected static final A_SUFFIX:Ljava/lang/String; = ".kva"

.field protected static final BASE_GC_BYTES_THRESHOLD:I = 0x2000

.field protected static final BASE_GC_KEYS_THRESHOLD:I = 0x50

.field protected static final BOTH_FILES_ERROR:Ljava/lang/String; = "both files error"

.field protected static final B_SUFFIX:Ljava/lang/String; = ".kvb"

.field protected static final CIPHER_MASK:I = 0x40000000

.field protected static final C_SUFFIX:Ljava/lang/String; = ".kvc"

.field protected static final DATA_SIZE_LIMIT:I = 0x10000000

.field protected static final DATA_START:I = 0xc

.field protected static final EMPTY_ARRAY:[B

.field protected static final ENCRYPT_FAILED:Ljava/lang/String; = "Encrypt failed"

.field static final GC_FINISH:Ljava/lang/String; = "gc finish"

.field protected static final MAP_FAILED:Ljava/lang/String; = "map failed"

.field protected static final MISS_CIPHER:Ljava/lang/String; = "miss cipher"

.field protected static final OPEN_FILE_FAILED:Ljava/lang/String; = "open file failed"

.field protected static final PAGE_SIZE:I

.field protected static final PARSE_DATA_FAILED:Ljava/lang/String; = "parse dara failed"

.field protected static final TEMP_SUFFIX:Ljava/lang/String; = ".tmp"

.field static final TRUNCATE_FINISH:Ljava/lang/String; = "truncate finish"

.field protected static final TRUNCATE_THRESHOLD:I

.field protected static final TYPE_SIZE:[I


# instance fields
.field protected final INTERNAL_LIMIT:I

.field protected final bigValueCache:Lio/fastkv/WeakCache;

.field protected checksum:J

.field protected final cipher:Lio/fastkv/interfaces/FastCipher;

.field protected closed:Z

.field protected final data:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lio/fastkv/Container$BaseContainer;",
            ">;"
        }
    .end annotation
.end field

.field protected dataEnd:I

.field protected final deletedFiles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected final encoderMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/fastkv/interfaces/FastEncoder;",
            ">;"
        }
    .end annotation
.end field

.field protected final externalCache:Lio/fastkv/WeakCache;

.field protected final externalExecutor:Lio/fastkv/TagExecutor;

.field protected fastBuffer:Lio/fastkv/FastBuffer;

.field protected invalidBytes:I

.field protected final invalids:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lio/fastkv/AbsFastKV$Segment;",
            ">;"
        }
    .end annotation
.end field

.field protected final listeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;",
            ">;"
        }
    .end annotation
.end field

.field protected final logger:Lio/fastkv/interfaces/FastLogger;

.field private final mainHandler:Landroid/os/Handler;

.field protected final name:Ljava/lang/String;

.field protected needRewrite:Z

.field protected final path:Ljava/lang/String;

.field protected volatile startLoading:Z

.field protected tempExternalName:Ljava/lang/String;

.field protected updateSize:I

.field protected updateStart:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lio/fastkv/AbsFastKV;->TYPE_SIZE:[I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    sput-object v0, Lio/fastkv/AbsFastKV;->EMPTY_ARRAY:[B

    .line 13
    .line 14
    invoke-static {}, Lio/fastkv/Utils;->getPageSize()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    sput v0, Lio/fastkv/AbsFastKV;->PAGE_SIZE:I

    .line 19
    .line 20
    const v1, 0x8000

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    sput v0, Lio/fastkv/AbsFastKV;->TRUNCATE_THRESHOLD:I

    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :array_0
    .array-data 4
        0x0
        0x1
        0x4
        0x4
        0x8
        0x8
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Lio/fastkv/interfaces/FastEncoder;Lio/fastkv/interfaces/FastCipher;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Lio/fastkv/FastKVConfig;->internalLimit:I

    .line 5
    .line 6
    iput v0, p0, Lio/fastkv/AbsFastKV;->INTERNAL_LIMIT:I

    .line 7
    .line 8
    sget-object v0, Lio/fastkv/FastKVConfig;->sLogger:Lio/fastkv/interfaces/FastLogger;

    .line 9
    .line 10
    iput-object v0, p0, Lio/fastkv/AbsFastKV;->logger:Lio/fastkv/interfaces/FastLogger;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lio/fastkv/AbsFastKV;->startLoading:Z

    .line 21
    .line 22
    new-instance v1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lio/fastkv/AbsFastKV;->deletedFiles:Ljava/util/List;

    .line 28
    .line 29
    iput-boolean v0, p0, Lio/fastkv/AbsFastKV;->needRewrite:Z

    .line 30
    .line 31
    iput-boolean v0, p0, Lio/fastkv/AbsFastKV;->closed:Z

    .line 32
    .line 33
    new-instance v1, Lio/fastkv/WeakCache;

    .line 34
    .line 35
    invoke-direct {v1}, Lio/fastkv/WeakCache;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Lio/fastkv/AbsFastKV;->externalCache:Lio/fastkv/WeakCache;

    .line 39
    .line 40
    new-instance v1, Lio/fastkv/WeakCache;

    .line 41
    .line 42
    invoke-direct {v1}, Lio/fastkv/WeakCache;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Lio/fastkv/AbsFastKV;->bigValueCache:Lio/fastkv/WeakCache;

    .line 46
    .line 47
    new-instance v1, Lio/fastkv/TagExecutor;

    .line 48
    .line 49
    invoke-direct {v1}, Lio/fastkv/TagExecutor;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v1, p0, Lio/fastkv/AbsFastKV;->externalExecutor:Lio/fastkv/TagExecutor;

    .line 53
    .line 54
    new-instance v1, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, Lio/fastkv/AbsFastKV;->invalids:Ljava/util/ArrayList;

    .line 60
    .line 61
    new-instance v1, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v1, p0, Lio/fastkv/AbsFastKV;->listeners:Ljava/util/ArrayList;

    .line 67
    .line 68
    new-instance v1, Landroid/os/Handler;

    .line 69
    .line 70
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 75
    .line 76
    .line 77
    iput-object v1, p0, Lio/fastkv/AbsFastKV;->mainHandler:Landroid/os/Handler;

    .line 78
    .line 79
    iput-object p1, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 80
    .line 81
    iput-object p2, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 82
    .line 83
    iput-object p4, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;

    .line 84
    .line 85
    new-instance p1, Ljava/util/HashMap;

    .line 86
    .line 87
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 88
    .line 89
    .line 90
    if-eqz p3, :cond_1

    .line 91
    .line 92
    array-length p2, p3

    .line 93
    :goto_0
    if-ge v0, p2, :cond_1

    .line 94
    .line 95
    aget-object p4, p3, v0

    .line 96
    .line 97
    invoke-interface {p4}, Lio/fastkv/interfaces/FastEncoder;->tag()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eqz v2, :cond_0

    .line 106
    .line 107
    new-instance p4, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    const-string v2, "duplicate encoder tag:"

    .line 110
    .line 111
    invoke-direct {p4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p4

    .line 121
    invoke-virtual {p0, p4}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_0
    invoke-virtual {p1, v1, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_1
    sget-object p2, Lio/fastkv/StringSetEncoder;->INSTANCE:Lio/fastkv/StringSetEncoder;

    .line 132
    .line 133
    invoke-virtual {p2}, Lio/fastkv/StringSetEncoder;->tag()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p3

    .line 137
    invoke-virtual {p1, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    iput-object p1, p0, Lio/fastkv/AbsFastKV;->encoderMap:Ljava/util/Map;

    .line 141
    .line 142
    return-void
.end method

.method public static synthetic a(Lio/fastkv/AbsFastKV;Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lio/fastkv/AbsFastKV;->lambda$notifyListeners$0(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private addObject(Ljava/lang/String;Ljava/lang/Object;[BB)V
    .locals 6

    .line 1
    invoke-direct {p0, p1, p3, p4}, Lio/fastkv/AbsFastKV;->saveArray(Ljava/lang/String;[BB)I

    .line 2
    .line 3
    .line 4
    move-result v2

    .line 5
    if-lez v2, :cond_4

    .line 6
    .line 7
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->tempExternalName:Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    :goto_0
    move v5, v0

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    goto :goto_0

    .line 16
    :goto_1
    if-eqz v5, :cond_1

    .line 17
    .line 18
    iget-object p3, p0, Lio/fastkv/AbsFastKV;->bigValueCache:Lio/fastkv/WeakCache;

    .line 19
    .line 20
    invoke-virtual {p3, p1, p2}, Lio/fastkv/WeakCache;->put(Ljava/lang/String;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p2, p0, Lio/fastkv/AbsFastKV;->tempExternalName:Ljava/lang/String;

    .line 24
    .line 25
    const/4 p3, 0x0

    .line 26
    iput-object p3, p0, Lio/fastkv/AbsFastKV;->tempExternalName:Ljava/lang/String;

    .line 27
    .line 28
    const/16 p3, 0x20

    .line 29
    .line 30
    :goto_2
    move-object v3, p2

    .line 31
    move v4, p3

    .line 32
    goto :goto_3

    .line 33
    :cond_1
    array-length p3, p3

    .line 34
    goto :goto_2

    .line 35
    :goto_3
    const/4 p2, 0x6

    .line 36
    if-ne p4, p2, :cond_2

    .line 37
    .line 38
    new-instance v0, Lio/fastkv/Container$StringContainer;

    .line 39
    .line 40
    iget v1, p0, Lio/fastkv/AbsFastKV;->updateStart:I

    .line 41
    .line 42
    check-cast v3, Ljava/lang/String;

    .line 43
    .line 44
    invoke-direct/range {v0 .. v5}, Lio/fastkv/Container$StringContainer;-><init>(IILjava/lang/String;IZ)V

    .line 45
    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_2
    const/4 p2, 0x7

    .line 49
    if-ne p4, p2, :cond_3

    .line 50
    .line 51
    new-instance v0, Lio/fastkv/Container$ArrayContainer;

    .line 52
    .line 53
    iget v1, p0, Lio/fastkv/AbsFastKV;->updateStart:I

    .line 54
    .line 55
    invoke-direct/range {v0 .. v5}, Lio/fastkv/Container$ArrayContainer;-><init>(IILjava/lang/Object;IZ)V

    .line 56
    .line 57
    .line 58
    goto :goto_4

    .line 59
    :cond_3
    new-instance v0, Lio/fastkv/Container$ObjectContainer;

    .line 60
    .line 61
    iget v1, p0, Lio/fastkv/AbsFastKV;->updateStart:I

    .line 62
    .line 63
    invoke-direct/range {v0 .. v5}, Lio/fastkv/Container$ObjectContainer;-><init>(IILjava/lang/Object;IZ)V

    .line 64
    .line 65
    .line 66
    :goto_4
    iget-object p2, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 67
    .line 68
    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->updateChange()V

    .line 72
    .line 73
    .line 74
    :cond_4
    return-void
.end method

.method public static synthetic b(Lio/fastkv/AbsFastKV;Ljava/lang/String;[BLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lio/fastkv/AbsFastKV;->lambda$saveArray$1(Ljava/lang/String;[BLjava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private countInvalid(II)V
    .locals 2

    .line 1
    iget v0, p0, Lio/fastkv/AbsFastKV;->invalidBytes:I

    .line 2
    .line 3
    sub-int v1, p2, p1

    .line 4
    .line 5
    add-int/2addr v1, v0

    .line 6
    iput v1, p0, Lio/fastkv/AbsFastKV;->invalidBytes:I

    .line 7
    .line 8
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->invalids:Ljava/util/ArrayList;

    .line 9
    .line 10
    new-instance v1, Lio/fastkv/AbsFastKV$Segment;

    .line 11
    .line 12
    invoke-direct {v1, p1, p2}, Lio/fastkv/AbsFastKV$Segment;-><init>(II)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private encodeObject(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/Class;",
            "Lio/fastkv/interfaces/FastEncoder;",
            ">;)V"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Ljava/util/Set;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ljava/util/Set;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    instance-of v1, v1, Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0, p1, v0}, Lio/fastkv/AbsFastKV;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    if-eqz p3, :cond_3

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    check-cast p3, Lio/fastkv/interfaces/FastEncoder;

    .line 41
    .line 42
    if-eqz p3, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2, p3}, Lio/fastkv/AbsFastKV;->putObject(Ljava/lang/String;Ljava/lang/Object;Lio/fastkv/interfaces/FastEncoder;)Landroid/content/SharedPreferences$Editor;

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    new-instance p1, Ljava/lang/Exception;

    .line 49
    .line 50
    new-instance p3, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v0, "missing encoder for type:"

    .line 53
    .line 54
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->warning(Ljava/lang/Exception;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_3
    new-instance p1, Ljava/lang/Exception;

    .line 76
    .line 77
    const-string p2, "missing encoders"

    .line 78
    .line 79
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->warning(Ljava/lang/Exception;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method private getNewDoubleValue(D)J
    .locals 1

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p1, p2}, Lio/fastkv/interfaces/FastCipher;->encrypt(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    :cond_0
    return-wide p1
.end method

.method private getNewFloatValue(F)I
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lio/fastkv/interfaces/FastCipher;->encrypt(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    :cond_0
    return p1
.end method

.method public static isCipher(I)Z
    .locals 1

    .line 1
    const/high16 v0, 0x40000000    # 2.0f

    .line 2
    .line 3
    and-int/2addr p0, v0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method private synthetic lambda$notifyListeners$0(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0, p2}, Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;->onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic lambda$saveArray$1(Ljava/lang/String;[BLjava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, p2}, Lio/fastkv/Utils;->saveBytes(Ljava/io/File;[B)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    const-string p1, "Write large value with key:"

    .line 32
    .line 33
    const-string p2, " failed"

    .line 34
    .line 35
    invoke-static {p1, p3, p2}, Lz30;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->info(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public static mergeInvalids(Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lio/fastkv/AbsFastKV$Segment;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    check-cast v1, Lio/fastkv/AbsFastKV$Segment;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x1

    .line 13
    move v4, v3

    .line 14
    :goto_0
    if-ge v4, v2, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    check-cast v5, Lio/fastkv/AbsFastKV$Segment;

    .line 21
    .line 22
    iget v6, v5, Lio/fastkv/AbsFastKV$Segment;->start:I

    .line 23
    .line 24
    iget v7, v1, Lio/fastkv/AbsFastKV$Segment;->end:I

    .line 25
    .line 26
    if-ne v6, v7, :cond_0

    .line 27
    .line 28
    iget v5, v5, Lio/fastkv/AbsFastKV$Segment;->end:I

    .line 29
    .line 30
    iput v5, v1, Lio/fastkv/AbsFastKV$Segment;->end:I

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    if-eq v0, v4, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0, v0, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    :cond_1
    move-object v1, v5

    .line 41
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    add-int/2addr v0, v3

    .line 45
    if-le v2, v0, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0, v0, v2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 52
    .line 53
    .line 54
    :cond_3
    return-void
.end method

.method private parseObject(ILjava/lang/String;IILio/fastkv/interfaces/FastCipher;)V
    .locals 9

    .line 1
    if-nez p5, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 4
    .line 5
    move v1, p1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    new-array v1, p1, [B

    .line 8
    .line 9
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 10
    .line 11
    iget-object v3, v2, Lio/fastkv/FastBuffer;->hb:[B

    .line 12
    .line 13
    iget v2, v2, Lio/fastkv/FastBuffer;->position:I

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-static {v3, v2, v1, v4, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p5, v1}, Lio/fastkv/interfaces/FastCipher;->decrypt([B)[B

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Lio/fastkv/FastBuffer;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lio/fastkv/FastBuffer;-><init>([B)V

    .line 26
    .line 27
    .line 28
    array-length v0, v0

    .line 29
    move-object v8, v1

    .line 30
    move v1, v0

    .line 31
    move-object v0, v8

    .line 32
    :goto_0
    invoke-virtual {v0}, Lio/fastkv/FastBuffer;->get()B

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    and-int/lit16 v2, v2, 0xff

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Lio/fastkv/FastBuffer;->getString(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    iget-object v4, p0, Lio/fastkv/AbsFastKV;->encoderMap:Ljava/util/Map;

    .line 43
    .line 44
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    move-object v7, v4

    .line 49
    check-cast v7, Lio/fastkv/interfaces/FastEncoder;

    .line 50
    .line 51
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    sub-int/2addr v1, v2

    .line 54
    if-ltz v1, :cond_3

    .line 55
    .line 56
    if-eqz v7, :cond_2

    .line 57
    .line 58
    :try_start_0
    iget-object v2, v0, Lio/fastkv/FastBuffer;->hb:[B

    .line 59
    .line 60
    iget v0, v0, Lio/fastkv/FastBuffer;->position:I

    .line 61
    .line 62
    invoke-interface {v7, v2, v0, v1}, Lio/fastkv/interfaces/FastEncoder;->decode([BII)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    if-eqz v4, :cond_1

    .line 67
    .line 68
    new-instance v1, Lio/fastkv/Container$ObjectContainer;

    .line 69
    .line 70
    add-int/lit8 v3, p4, 0x2

    .line 71
    .line 72
    const/4 v6, 0x0

    .line 73
    move v5, p1

    .line 74
    move v2, p3

    .line 75
    invoke-direct/range {v1 .. v6}, Lio/fastkv/Container$ObjectContainer;-><init>(IILjava/lang/Object;IZ)V

    .line 76
    .line 77
    .line 78
    iput-object v7, v1, Lio/fastkv/Container$ObjectContainer;->encoder:Lio/fastkv/interfaces/FastEncoder;

    .line 79
    .line 80
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 81
    .line 82
    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :catch_0
    move-exception v0

    .line 87
    goto :goto_1

    .line 88
    :cond_1
    return-void

    .line 89
    :goto_1
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_2
    const-string v0, "object with tag: "

    .line 94
    .line 95
    const-string v1, " without encoder"

    .line 96
    .line 97
    invoke-static {v0, v3, v1}, Lz30;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_3
    new-instance v0, Ljava/lang/Exception;

    .line 106
    .line 107
    const-string v1, "parse dara failed"

    .line 108
    .line 109
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v0
.end method

.method private prepareHeaderInfo(IIB)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->checkKeySize(I)V

    .line 2
    .line 3
    .line 4
    add-int/lit8 p1, p1, 0x2

    .line 5
    .line 6
    add-int/2addr p1, p2

    .line 7
    iput p1, p0, Lio/fastkv/AbsFastKV;->updateSize:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->preparePutBytes()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 13
    .line 14
    invoke-virtual {p1, p3}, Lio/fastkv/FastBuffer;->put(B)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private resetBuffer()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Lio/fastkv/FastBuffer;->hb:[B

    .line 6
    .line 7
    array-length v1, v1

    .line 8
    sget v2, Lio/fastkv/AbsFastKV;->PAGE_SIZE:I

    .line 9
    .line 10
    if-eq v1, v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x4

    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2, v3}, Lio/fastkv/FastBuffer;->putLong(IJ)V

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    new-instance v0, Lio/fastkv/FastBuffer;

    .line 21
    .line 22
    sget v1, Lio/fastkv/AbsFastKV;->PAGE_SIZE:I

    .line 23
    .line 24
    invoke-direct {v0, v1}, Lio/fastkv/FastBuffer;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 28
    .line 29
    :goto_1
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-virtual {p0, v1}, Lio/fastkv/AbsFastKV;->packSize(I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {v0, v1, v2}, Lio/fastkv/FastBuffer;->putInt(II)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method private saveArray(Ljava/lang/String;[BB)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lio/fastkv/AbsFastKV;->tempExternalName:Ljava/lang/String;

    .line 3
    .line 4
    array-length v0, p2

    .line 5
    iget v1, p0, Lio/fastkv/AbsFastKV;->INTERNAL_LIMIT:I

    .line 6
    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1, p2, p3}, Lio/fastkv/AbsFastKV;->wrapArray(Ljava/lang/String;[BB)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v1, "Large value, key: "

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, ", size: "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    array-length v1, p2

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->info(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lio/fastkv/Utils;->randomName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/16 v1, 0x20

    .line 45
    .line 46
    new-array v2, v1, [B

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-virtual {v0, v3, v1, v2, v3}, Ljava/lang/String;->getBytes(II[BI)V

    .line 50
    .line 51
    .line 52
    or-int/lit8 p3, p3, 0x40

    .line 53
    .line 54
    int-to-byte p3, p3

    .line 55
    invoke-direct {p0, p1, v2, p3}, Lio/fastkv/AbsFastKV;->wrapArray(Ljava/lang/String;[BB)I

    .line 56
    .line 57
    .line 58
    move-result p3

    .line 59
    if-lez p3, :cond_1

    .line 60
    .line 61
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->externalCache:Lio/fastkv/WeakCache;

    .line 62
    .line 63
    invoke-virtual {v1, v0, p2}, Lio/fastkv/WeakCache;->put(Ljava/lang/String;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->externalExecutor:Lio/fastkv/TagExecutor;

    .line 67
    .line 68
    new-instance v2, Lio/fastkv/a;

    .line 69
    .line 70
    invoke-direct {v2, p0, v0, p2, p1}, Lio/fastkv/a;-><init>(Lio/fastkv/AbsFastKV;Ljava/lang/String;[BLjava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, p1, v2}, Lio/fastkv/TagExecutor;->execute(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, Lio/fastkv/AbsFastKV;->tempExternalName:Ljava/lang/String;

    .line 77
    .line 78
    :cond_1
    return p3
.end method

.method public static unpackSize(I)I
    .locals 1

    .line 1
    const v0, -0x40000001    # -1.9999999f

    .line 2
    .line 3
    .line 4
    and-int/2addr p0, v0

    .line 5
    return p0
.end method

.method private updateObject(Ljava/lang/String;Ljava/lang/Object;[BLio/fastkv/Container$VarContainer;)V
    .locals 7

    .line 1
    invoke-virtual {p4}, Lio/fastkv/Container$BaseContainer;->getType()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, p1, p3, v0}, Lio/fastkv/AbsFastKV;->saveArray(Ljava/lang/String;[BB)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_3

    .line 10
    .line 11
    iget-boolean v1, p4, Lio/fastkv/Container$VarContainer;->external:Z

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v1, p4, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v1, v2

    .line 22
    :goto_0
    invoke-virtual {p4}, Lio/fastkv/Container$BaseContainer;->getType()B

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    iget v4, p4, Lio/fastkv/Container$VarContainer;->start:I

    .line 27
    .line 28
    iget v5, p4, Lio/fastkv/Container$BaseContainer;->offset:I

    .line 29
    .line 30
    iget v6, p4, Lio/fastkv/Container$VarContainer;->valueSize:I

    .line 31
    .line 32
    add-int/2addr v5, v6

    .line 33
    invoke-virtual {p0, v3, v4, v5}, Lio/fastkv/AbsFastKV;->remove(BII)V

    .line 34
    .line 35
    .line 36
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->tempExternalName:Ljava/lang/String;

    .line 37
    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/4 v3, 0x0

    .line 43
    :goto_1
    iget v4, p0, Lio/fastkv/AbsFastKV;->updateStart:I

    .line 44
    .line 45
    iput v4, p4, Lio/fastkv/Container$VarContainer;->start:I

    .line 46
    .line 47
    iput v0, p4, Lio/fastkv/Container$BaseContainer;->offset:I

    .line 48
    .line 49
    iput-boolean v3, p4, Lio/fastkv/Container$VarContainer;->external:Z

    .line 50
    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    iget-object p3, p0, Lio/fastkv/AbsFastKV;->bigValueCache:Lio/fastkv/WeakCache;

    .line 54
    .line 55
    invoke-virtual {p3, p1, p2}, Lio/fastkv/WeakCache;->put(Ljava/lang/String;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lio/fastkv/AbsFastKV;->tempExternalName:Ljava/lang/String;

    .line 59
    .line 60
    iput-object p1, p4, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 61
    .line 62
    const/16 p1, 0x20

    .line 63
    .line 64
    iput p1, p4, Lio/fastkv/Container$VarContainer;->valueSize:I

    .line 65
    .line 66
    iput-object v2, p0, Lio/fastkv/AbsFastKV;->tempExternalName:Ljava/lang/String;

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    iput-object p2, p4, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 70
    .line 71
    array-length p1, p3

    .line 72
    iput p1, p4, Lio/fastkv/Container$VarContainer;->valueSize:I

    .line 73
    .line 74
    :goto_2
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->updateChange()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->checkGC()V

    .line 78
    .line 79
    .line 80
    if-eqz v1, :cond_3

    .line 81
    .line 82
    invoke-virtual {p0, v1}, Lio/fastkv/AbsFastKV;->removeOldFile(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_3
    return-void
.end method

.method private wrapArray(Ljava/lang/String;[BB)I
    .locals 1

    .line 1
    array-length v0, p2

    .line 2
    add-int/lit8 v0, v0, 0x2

    .line 3
    .line 4
    invoke-direct {p0, p1, p3, v0}, Lio/fastkv/AbsFastKV;->wrapHeader(Ljava/lang/String;BI)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    return p1

    .line 12
    :cond_0
    iget-object p1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 13
    .line 14
    array-length p3, p2

    .line 15
    int-to-short p3, p3

    .line 16
    invoke-virtual {p1, p3}, Lio/fastkv/FastBuffer;->putShort(S)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 20
    .line 21
    iget p3, p1, Lio/fastkv/FastBuffer;->position:I

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Lio/fastkv/FastBuffer;->putBytes([B)V

    .line 24
    .line 25
    .line 26
    return p3
.end method

.method private wrapHeader(Ljava/lang/String;B)Z
    .locals 1

    .line 1
    sget-object v0, Lio/fastkv/AbsFastKV;->TYPE_SIZE:[I

    aget v0, v0, p2

    invoke-direct {p0, p1, p2, v0}, Lio/fastkv/AbsFastKV;->wrapHeader(Ljava/lang/String;BI)Z

    move-result p1

    return p1
.end method

.method private wrapHeader(Ljava/lang/String;BI)Z
    .locals 2

    .line 2
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;

    if-eqz v0, :cond_1

    .line 3
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-interface {v0, p1}, Lio/fastkv/interfaces/FastCipher;->encrypt([B)[B

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 4
    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Encrypt failed"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    return v0

    .line 5
    :cond_0
    array-length v1, p1

    .line 6
    invoke-direct {p0, v1, p3, p2}, Lio/fastkv/AbsFastKV;->prepareHeaderInfo(IIB)V

    .line 7
    iget-object p2, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    int-to-byte p3, v1

    invoke-virtual {p2, p3}, Lio/fastkv/FastBuffer;->put(B)V

    .line 8
    iget-object p2, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    iget-object p3, p2, Lio/fastkv/FastBuffer;->hb:[B

    iget p2, p2, Lio/fastkv/FastBuffer;->position:I

    invoke-static {p1, v0, p3, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 9
    iget-object p1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    iget p2, p1, Lio/fastkv/FastBuffer;->position:I

    add-int/2addr p2, v1

    iput p2, p1, Lio/fastkv/FastBuffer;->position:I

    goto :goto_0

    .line 10
    :cond_1
    invoke-static {p1}, Lio/fastkv/FastBuffer;->getStringSize(Ljava/lang/String;)I

    move-result v0

    .line 11
    invoke-direct {p0, v0, p3, p2}, Lio/fastkv/AbsFastKV;->prepareHeaderInfo(IIB)V

    .line 12
    invoke-direct {p0, p1, v0}, Lio/fastkv/AbsFastKV;->wrapKey(Ljava/lang/String;I)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private wrapKey(Ljava/lang/String;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 2
    .line 3
    int-to-byte v1, p2

    .line 4
    invoke-virtual {v0, v1}, Lio/fastkv/FastBuffer;->put(B)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-ne p2, v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 14
    .line 15
    iget-object v1, v0, Lio/fastkv/FastBuffer;->hb:[B

    .line 16
    .line 17
    iget v0, v0, Lio/fastkv/FastBuffer;->position:I

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {p1, v2, p2, v1, v0}, Ljava/lang/String;->getBytes(II[BI)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 24
    .line 25
    iget v0, p1, Lio/fastkv/FastBuffer;->position:I

    .line 26
    .line 27
    add-int/2addr v0, p2

    .line 28
    iput v0, p1, Lio/fastkv/FastBuffer;->position:I

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-object p2, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 32
    .line 33
    invoke-virtual {p2, p1}, Lio/fastkv/FastBuffer;->putString(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method private wrapStringValue(Ljava/lang/String;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 2
    .line 3
    int-to-short v1, p2

    .line 4
    invoke-virtual {v0, v1}, Lio/fastkv/FastBuffer;->putShort(S)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-ne p2, v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 14
    .line 15
    iget-object v1, v0, Lio/fastkv/FastBuffer;->hb:[B

    .line 16
    .line 17
    iget v0, v0, Lio/fastkv/FastBuffer;->position:I

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {p1, v2, p2, v1, v0}, Ljava/lang/String;->getBytes(II[BI)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object p2, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Lio/fastkv/FastBuffer;->putString(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public addOrUpdate(Ljava/lang/String;Ljava/lang/Object;[BLio/fastkv/Container$VarContainer;B)V
    .locals 1

    .line 1
    if-nez p4, :cond_0

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3, p5}, Lio/fastkv/AbsFastKV;->addObject(Ljava/lang/String;Ljava/lang/Object;[BB)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-boolean p5, p4, Lio/fastkv/Container$VarContainer;->external:Z

    .line 8
    .line 9
    if-nez p5, :cond_1

    .line 10
    .line 11
    iget p5, p4, Lio/fastkv/Container$VarContainer;->valueSize:I

    .line 12
    .line 13
    array-length v0, p3

    .line 14
    if-ne p5, v0, :cond_1

    .line 15
    .line 16
    iget p1, p4, Lio/fastkv/Container$BaseContainer;->offset:I

    .line 17
    .line 18
    invoke-virtual {p0, p1, p3}, Lio/fastkv/AbsFastKV;->updateBytes(I[B)V

    .line 19
    .line 20
    .line 21
    iput-object p2, p4, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lio/fastkv/AbsFastKV;->updateObject(Ljava/lang/String;Ljava/lang/Object;[BLio/fastkv/Container$VarContainer;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final bytesThreshold()I
    .locals 2

    .line 1
    iget v0, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 2
    .line 3
    const/16 v1, 0x4000

    .line 4
    .line 5
    if-gt v0, v1, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x2000

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    return v1
.end method

.method public abstract checkGC()V
.end method

.method public final checkKey(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    const-string v0, "key is empty"

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p1
.end method

.method public final checkKeySize(I)V
    .locals 1

    .line 1
    const/16 v0, 0xff

    .line 2
    .line 3
    if-gt p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 7
    .line 8
    const-string v0, "key\'s length must less than 256"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public final clearInvalid()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lio/fastkv/AbsFastKV;->invalidBytes:I

    .line 3
    .line 4
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->invalids:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public declared-synchronized contains(Ljava/lang/String;)Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p0

    .line 9
    return p1

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw p1
.end method

.method public abstract copyToMainFile(Lio/fastkv/FastKV;)V
.end method

.method public final deleteCFiles()V
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v3, ".kvc"

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lio/fastkv/Utils;->deleteFile(Ljava/io/File;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Ljava/io/File;

    .line 31
    .line 32
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 33
    .line 34
    new-instance v2, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v3, ".tmp"

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Lio/fastkv/Utils;->deleteFile(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :catch_0
    move-exception v0

    .line 61
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public edit()Landroid/content/SharedPreferences$Editor;
    .locals 0

    .line 1
    return-object p0
.end method

.method public abstract ensureSize(I)V
.end method

.method public final error(Ljava/lang/Exception;)V
    .locals 2

    .line 3
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->logger:Lio/fastkv/interfaces/FastLogger;

    if-eqz v0, :cond_0

    .line 4
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Lio/fastkv/interfaces/FastLogger;->e(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public final error(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->logger:Lio/fastkv/interfaces/FastLogger;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    new-instance v2, Ljava/lang/Exception;

    invoke-direct {v2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1, v2}, Lio/fastkv/interfaces/FastLogger;->e(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public fastPutString(Ljava/lang/String;Ljava/lang/String;Lio/fastkv/Container$StringContainer;)V
    .locals 9

    .line 1
    invoke-static {p2}, Lio/fastkv/FastBuffer;->getStringSize(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result v4

    .line 5
    const/4 v0, 0x6

    .line 6
    if-nez p3, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lio/fastkv/FastBuffer;->getStringSize(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result p3

    .line 12
    invoke-virtual {p0, p3}, Lio/fastkv/AbsFastKV;->checkKeySize(I)V

    .line 13
    .line 14
    .line 15
    add-int/lit8 v1, p3, 0x4

    .line 16
    .line 17
    add-int v2, v1, v4

    .line 18
    .line 19
    iput v2, p0, Lio/fastkv/AbsFastKV;->updateSize:I

    .line 20
    .line 21
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->preparePutBytes()V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 25
    .line 26
    invoke-virtual {v2, v0}, Lio/fastkv/FastBuffer;->put(B)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, p1, p3}, Lio/fastkv/AbsFastKV;->wrapKey(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, p2, v4}, Lio/fastkv/AbsFastKV;->wrapStringValue(Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    iget-object p3, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 36
    .line 37
    new-instance v0, Lio/fastkv/Container$StringContainer;

    .line 38
    .line 39
    move v2, v1

    .line 40
    iget v1, p0, Lio/fastkv/AbsFastKV;->updateStart:I

    .line 41
    .line 42
    add-int/2addr v2, v1

    .line 43
    const/4 v5, 0x0

    .line 44
    move-object v3, p2

    .line 45
    invoke-direct/range {v0 .. v5}, Lio/fastkv/Container$StringContainer;-><init>(IILjava/lang/String;IZ)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p3, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->updateChange()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    move-object v3, p2

    .line 56
    iget p1, p3, Lio/fastkv/Container$BaseContainer;->offset:I

    .line 57
    .line 58
    iget p2, p3, Lio/fastkv/Container$VarContainer;->start:I

    .line 59
    .line 60
    sub-int p2, p1, p2

    .line 61
    .line 62
    iget v1, p3, Lio/fastkv/Container$VarContainer;->valueSize:I

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    const/4 v5, 0x0

    .line 66
    if-ne v1, v4, :cond_2

    .line 67
    .line 68
    iget-wide v6, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 69
    .line 70
    iget-object p2, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 71
    .line 72
    invoke-virtual {p2, p1, v1}, Lio/fastkv/FastBuffer;->getChecksum(II)J

    .line 73
    .line 74
    .line 75
    move-result-wide p1

    .line 76
    xor-long/2addr p1, v6

    .line 77
    iput-wide p1, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-ne v4, p1, :cond_1

    .line 84
    .line 85
    iget-object p1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 86
    .line 87
    iget-object p1, p1, Lio/fastkv/FastBuffer;->hb:[B

    .line 88
    .line 89
    iget p2, p3, Lio/fastkv/Container$BaseContainer;->offset:I

    .line 90
    .line 91
    invoke-virtual {v3, v5, v4, p1, p2}, Ljava/lang/String;->getBytes(II[BI)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    iget-object p1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 96
    .line 97
    iget p2, p3, Lio/fastkv/Container$BaseContainer;->offset:I

    .line 98
    .line 99
    iput p2, p1, Lio/fastkv/FastBuffer;->position:I

    .line 100
    .line 101
    invoke-virtual {p1, v3}, Lio/fastkv/FastBuffer;->putString(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    :goto_0
    iget p1, p3, Lio/fastkv/Container$BaseContainer;->offset:I

    .line 105
    .line 106
    iput p1, p0, Lio/fastkv/AbsFastKV;->updateStart:I

    .line 107
    .line 108
    iput v4, p0, Lio/fastkv/AbsFastKV;->updateSize:I

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    add-int p1, p2, v4

    .line 112
    .line 113
    iput p1, p0, Lio/fastkv/AbsFastKV;->updateSize:I

    .line 114
    .line 115
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->preparePutBytes()V

    .line 116
    .line 117
    .line 118
    iget-object p1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 119
    .line 120
    invoke-virtual {p1, v0}, Lio/fastkv/FastBuffer;->put(B)V

    .line 121
    .line 122
    .line 123
    add-int/lit8 p1, p2, -0x3

    .line 124
    .line 125
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 126
    .line 127
    iget-object v6, v1, Lio/fastkv/FastBuffer;->hb:[B

    .line 128
    .line 129
    iget v7, p3, Lio/fastkv/Container$VarContainer;->start:I

    .line 130
    .line 131
    const/4 v8, 0x1

    .line 132
    add-int/2addr v7, v8

    .line 133
    iget v1, v1, Lio/fastkv/FastBuffer;->position:I

    .line 134
    .line 135
    invoke-static {v6, v7, v6, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 136
    .line 137
    .line 138
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 139
    .line 140
    iget v6, v1, Lio/fastkv/FastBuffer;->position:I

    .line 141
    .line 142
    add-int/2addr v6, p1

    .line 143
    iput v6, v1, Lio/fastkv/FastBuffer;->position:I

    .line 144
    .line 145
    invoke-direct {p0, v3, v4}, Lio/fastkv/AbsFastKV;->wrapStringValue(Ljava/lang/String;I)V

    .line 146
    .line 147
    .line 148
    iget p1, p3, Lio/fastkv/Container$VarContainer;->start:I

    .line 149
    .line 150
    iget v1, p3, Lio/fastkv/Container$BaseContainer;->offset:I

    .line 151
    .line 152
    iget v6, p3, Lio/fastkv/Container$VarContainer;->valueSize:I

    .line 153
    .line 154
    add-int/2addr v1, v6

    .line 155
    invoke-virtual {p0, v0, p1, v1}, Lio/fastkv/AbsFastKV;->remove(BII)V

    .line 156
    .line 157
    .line 158
    iget-boolean p1, p3, Lio/fastkv/Container$VarContainer;->external:Z

    .line 159
    .line 160
    if-eqz p1, :cond_3

    .line 161
    .line 162
    iget-object p1, p3, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 163
    .line 164
    move-object v2, p1

    .line 165
    check-cast v2, Ljava/lang/String;

    .line 166
    .line 167
    :cond_3
    iput-boolean v5, p3, Lio/fastkv/Container$VarContainer;->external:Z

    .line 168
    .line 169
    iget p1, p0, Lio/fastkv/AbsFastKV;->updateStart:I

    .line 170
    .line 171
    iput p1, p3, Lio/fastkv/Container$VarContainer;->start:I

    .line 172
    .line 173
    add-int/2addr p1, p2

    .line 174
    iput p1, p3, Lio/fastkv/Container$BaseContainer;->offset:I

    .line 175
    .line 176
    iput v4, p3, Lio/fastkv/Container$VarContainer;->valueSize:I

    .line 177
    .line 178
    move v5, v8

    .line 179
    :goto_1
    iput-object v3, p3, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 180
    .line 181
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->updateChange()V

    .line 182
    .line 183
    .line 184
    if-eqz v5, :cond_4

    .line 185
    .line 186
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->checkGC()V

    .line 187
    .line 188
    .line 189
    :cond_4
    if-eqz v2, :cond_5

    .line 190
    .line 191
    invoke-virtual {p0, v2}, Lio/fastkv/AbsFastKV;->removeOldFile(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    :cond_5
    return-void
.end method

.method public gc(I)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lio/fastkv/AbsFastKV;->invalids:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lio/fastkv/AbsFastKV;->invalids:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {v1}, Lio/fastkv/AbsFastKV;->mergeInvalids(Ljava/util/ArrayList;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Lio/fastkv/AbsFastKV;->invalids:Ljava/util/ArrayList;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lio/fastkv/AbsFastKV$Segment;

    .line 21
    .line 22
    iget v3, v1, Lio/fastkv/AbsFastKV$Segment;->start:I

    .line 23
    .line 24
    iget v4, v0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 25
    .line 26
    iget v5, v0, Lio/fastkv/AbsFastKV;->invalidBytes:I

    .line 27
    .line 28
    sub-int v5, v4, v5

    .line 29
    .line 30
    add-int/lit8 v6, v5, -0xc

    .line 31
    .line 32
    sub-int v7, v5, v3

    .line 33
    .line 34
    sub-int/2addr v4, v3

    .line 35
    add-int v8, v4, v7

    .line 36
    .line 37
    const/4 v9, 0x1

    .line 38
    if-ge v6, v8, :cond_0

    .line 39
    .line 40
    move v2, v9

    .line 41
    :cond_0
    if-nez v2, :cond_1

    .line 42
    .line 43
    iget-wide v10, v0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 44
    .line 45
    iget-object v8, v0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 46
    .line 47
    invoke-virtual {v8, v3, v4}, Lio/fastkv/FastBuffer;->getChecksum(II)J

    .line 48
    .line 49
    .line 50
    move-result-wide v12

    .line 51
    xor-long/2addr v10, v12

    .line 52
    iput-wide v10, v0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 53
    .line 54
    :cond_1
    iget-object v4, v0, Lio/fastkv/AbsFastKV;->invalids:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    iget v8, v0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 61
    .line 62
    iget-object v10, v0, Lio/fastkv/AbsFastKV;->invalids:Ljava/util/ArrayList;

    .line 63
    .line 64
    add-int/lit8 v11, v4, -0x1

    .line 65
    .line 66
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    check-cast v10, Lio/fastkv/AbsFastKV$Segment;

    .line 71
    .line 72
    iget v10, v10, Lio/fastkv/AbsFastKV$Segment;->end:I

    .line 73
    .line 74
    sub-int/2addr v8, v10

    .line 75
    if-lez v8, :cond_2

    .line 76
    .line 77
    move v10, v4

    .line 78
    goto :goto_0

    .line 79
    :cond_2
    move v10, v11

    .line 80
    :goto_0
    new-array v12, v10, [I

    .line 81
    .line 82
    new-array v10, v10, [I

    .line 83
    .line 84
    iget v13, v1, Lio/fastkv/AbsFastKV$Segment;->start:I

    .line 85
    .line 86
    iget v1, v1, Lio/fastkv/AbsFastKV$Segment;->end:I

    .line 87
    .line 88
    :goto_1
    if-ge v9, v4, :cond_3

    .line 89
    .line 90
    iget-object v14, v0, Lio/fastkv/AbsFastKV;->invalids:Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v14

    .line 96
    check-cast v14, Lio/fastkv/AbsFastKV$Segment;

    .line 97
    .line 98
    iget v15, v14, Lio/fastkv/AbsFastKV$Segment;->start:I

    .line 99
    .line 100
    sub-int/2addr v15, v1

    .line 101
    move/from16 v16, v2

    .line 102
    .line 103
    iget-object v2, v0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 104
    .line 105
    iget-object v2, v2, Lio/fastkv/FastBuffer;->hb:[B

    .line 106
    .line 107
    invoke-static {v2, v1, v2, v13, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 108
    .line 109
    .line 110
    add-int/lit8 v2, v9, -0x1

    .line 111
    .line 112
    aput v1, v12, v2

    .line 113
    .line 114
    sub-int/2addr v1, v13

    .line 115
    aput v1, v10, v2

    .line 116
    .line 117
    add-int/2addr v13, v15

    .line 118
    iget v1, v14, Lio/fastkv/AbsFastKV$Segment;->end:I

    .line 119
    .line 120
    add-int/lit8 v9, v9, 0x1

    .line 121
    .line 122
    move/from16 v2, v16

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_3
    move/from16 v16, v2

    .line 126
    .line 127
    if-lez v8, :cond_4

    .line 128
    .line 129
    iget-object v2, v0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 130
    .line 131
    iget-object v2, v2, Lio/fastkv/FastBuffer;->hb:[B

    .line 132
    .line 133
    invoke-static {v2, v1, v2, v13, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 134
    .line 135
    .line 136
    aput v1, v12, v11

    .line 137
    .line 138
    sub-int/2addr v1, v13

    .line 139
    aput v1, v10, v11

    .line 140
    .line 141
    :cond_4
    invoke-virtual {v0}, Lio/fastkv/AbsFastKV;->clearInvalid()V

    .line 142
    .line 143
    .line 144
    if-eqz v16, :cond_5

    .line 145
    .line 146
    iget-object v1, v0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 147
    .line 148
    const/16 v2, 0xc

    .line 149
    .line 150
    invoke-virtual {v1, v2, v6}, Lio/fastkv/FastBuffer;->getChecksum(II)J

    .line 151
    .line 152
    .line 153
    move-result-wide v1

    .line 154
    iput-wide v1, v0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_5
    iget-wide v1, v0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 158
    .line 159
    iget-object v4, v0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 160
    .line 161
    invoke-virtual {v4, v3, v7}, Lio/fastkv/FastBuffer;->getChecksum(II)J

    .line 162
    .line 163
    .line 164
    move-result-wide v8

    .line 165
    xor-long/2addr v1, v8

    .line 166
    iput-wide v1, v0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 167
    .line 168
    :goto_2
    iput v5, v0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 169
    .line 170
    move/from16 v1, p1

    .line 171
    .line 172
    invoke-virtual {v0, v3, v1, v7}, Lio/fastkv/AbsFastKV;->syncCompatBuffer(III)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v3, v12, v10}, Lio/fastkv/AbsFastKV;->updateOffset(I[I[I)V

    .line 176
    .line 177
    .line 178
    const-string v1, "gc finish"

    .line 179
    .line 180
    invoke-virtual {v0, v1}, Lio/fastkv/AbsFastKV;->info(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    return-void
.end method

.method public declared-synchronized getAll()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-object v0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto/16 :goto_2

    .line 19
    .line 20
    :cond_0
    :try_start_1
    new-instance v1, Ljava/util/HashMap;

    .line 21
    .line 22
    mul-int/lit8 v0, v0, 0x4

    .line 23
    .line 24
    div-int/lit8 v0, v0, 0x3

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_5

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Ljava/util/Map$Entry;

    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Ljava/lang/String;

    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Lio/fastkv/Container$BaseContainer;

    .line 64
    .line 65
    invoke-virtual {v2}, Lio/fastkv/Container$BaseContainer;->getType()B

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    packed-switch v4, :pswitch_data_0

    .line 70
    .line 71
    .line 72
    const/4 v2, 0x0

    .line 73
    goto :goto_1

    .line 74
    :pswitch_0
    move-object v4, v2

    .line 75
    check-cast v4, Lio/fastkv/Container$ObjectContainer;

    .line 76
    .line 77
    iget-boolean v5, v4, Lio/fastkv/Container$VarContainer;->external:Z

    .line 78
    .line 79
    if-eqz v5, :cond_2

    .line 80
    .line 81
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;

    .line 82
    .line 83
    invoke-virtual {p0, v4, v2}, Lio/fastkv/AbsFastKV;->getObjectFromFile(Lio/fastkv/Container$ObjectContainer;Lio/fastkv/interfaces/FastCipher;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    check-cast v2, Lio/fastkv/Container$ObjectContainer;

    .line 89
    .line 90
    iget-object v2, v2, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :pswitch_1
    check-cast v2, Lio/fastkv/Container$ArrayContainer;

    .line 94
    .line 95
    iget-boolean v4, v2, Lio/fastkv/Container$VarContainer;->external:Z

    .line 96
    .line 97
    if-eqz v4, :cond_3

    .line 98
    .line 99
    iget-object v4, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;

    .line 100
    .line 101
    invoke-virtual {p0, v2, v4}, Lio/fastkv/AbsFastKV;->getArrayFromFile(Lio/fastkv/Container$ArrayContainer;Lio/fastkv/interfaces/FastCipher;)[B

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    goto :goto_1

    .line 106
    :cond_3
    iget-object v2, v2, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :pswitch_2
    check-cast v2, Lio/fastkv/Container$StringContainer;

    .line 110
    .line 111
    iget-boolean v4, v2, Lio/fastkv/Container$VarContainer;->external:Z

    .line 112
    .line 113
    if-eqz v4, :cond_4

    .line 114
    .line 115
    iget-object v4, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;

    .line 116
    .line 117
    invoke-virtual {p0, v2, v4}, Lio/fastkv/AbsFastKV;->getStringFromFile(Lio/fastkv/Container$StringContainer;Lio/fastkv/interfaces/FastCipher;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    goto :goto_1

    .line 122
    :cond_4
    iget-object v2, v2, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :pswitch_3
    check-cast v2, Lio/fastkv/Container$DoubleContainer;

    .line 126
    .line 127
    iget-wide v4, v2, Lio/fastkv/Container$DoubleContainer;->value:D

    .line 128
    .line 129
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    goto :goto_1

    .line 134
    :pswitch_4
    check-cast v2, Lio/fastkv/Container$LongContainer;

    .line 135
    .line 136
    iget-wide v4, v2, Lio/fastkv/Container$LongContainer;->value:J

    .line 137
    .line 138
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    goto :goto_1

    .line 143
    :pswitch_5
    check-cast v2, Lio/fastkv/Container$FloatContainer;

    .line 144
    .line 145
    iget v2, v2, Lio/fastkv/Container$FloatContainer;->value:F

    .line 146
    .line 147
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    goto :goto_1

    .line 152
    :pswitch_6
    check-cast v2, Lio/fastkv/Container$IntContainer;

    .line 153
    .line 154
    iget v2, v2, Lio/fastkv/Container$IntContainer;->value:I

    .line 155
    .line 156
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    goto :goto_1

    .line 161
    :pswitch_7
    check-cast v2, Lio/fastkv/Container$BooleanContainer;

    .line 162
    .line 163
    iget-boolean v2, v2, Lio/fastkv/Container$BooleanContainer;->value:Z

    .line 164
    .line 165
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    :goto_1
    if-eqz v2, :cond_1

    .line 170
    .line 171
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 172
    .line 173
    .line 174
    goto/16 :goto_0

    .line 175
    .line 176
    :cond_5
    monitor-exit p0

    .line 177
    return-object v1

    .line 178
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 179
    throw v0

    .line 180
    nop

    .line 181
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getArray(Ljava/lang/String;)[B
    .locals 1

    .line 1
    sget-object v0, Lio/fastkv/AbsFastKV;->EMPTY_ARRAY:[B

    invoke-virtual {p0, p1, v0}, Lio/fastkv/AbsFastKV;->getArray(Ljava/lang/String;[B)[B

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized getArray(Ljava/lang/String;[B)[B
    .locals 3

    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/fastkv/Container$ArrayContainer;

    if-eqz v0, :cond_4

    .line 3
    iget-boolean v1, v0, Lio/fastkv/Container$VarContainer;->external:Z

    if-eqz v1, :cond_3

    .line 4
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->bigValueCache:Lio/fastkv/WeakCache;

    invoke-virtual {v1, p1}, Lio/fastkv/WeakCache;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 5
    instance-of v2, v1, [B

    if-eqz v2, :cond_0

    .line 6
    check-cast v1, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 7
    :cond_0
    :try_start_1
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;

    invoke-virtual {p0, v0, v1}, Lio/fastkv/AbsFastKV;->getArrayFromFile(Lio/fastkv/Container$ArrayContainer;Lio/fastkv/interfaces/FastCipher;)[B

    move-result-object v0

    if-eqz v0, :cond_2

    .line 8
    array-length v1, v0

    if-nez v1, :cond_1

    goto :goto_0

    .line 9
    :cond_1
    iget-object p2, p0, Lio/fastkv/AbsFastKV;->bigValueCache:Lio/fastkv/WeakCache;

    invoke-virtual {p2, p1, v0}, Lio/fastkv/WeakCache;->put(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    monitor-exit p0

    return-object v0

    .line 11
    :cond_2
    :goto_0
    :try_start_2
    invoke-interface {p0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_1

    .line 12
    :cond_3
    iget-object p1, v0, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    check-cast p1, [B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object p1

    .line 13
    :cond_4
    :goto_1
    monitor-exit p0

    return-object p2

    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public getArrayFromFile(Lio/fastkv/Container$ArrayContainer;Lio/fastkv/interfaces/FastCipher;)[B
    .locals 3

    .line 1
    iget-object p1, p1, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/lang/String;

    .line 4
    .line 5
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->externalCache:Lio/fastkv/WeakCache;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lio/fastkv/WeakCache;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, [B

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Lio/fastkv/Utils;->getBytes(Ljava/io/File;)[B

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_0
    if-eqz v0, :cond_2

    .line 45
    .line 46
    if-eqz p2, :cond_1

    .line 47
    .line 48
    invoke-interface {p2, v0}, Lio/fastkv/interfaces/FastCipher;->decrypt([B)[B

    .line 49
    .line 50
    .line 51
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    return-object p1

    .line 53
    :catch_0
    move-exception p1

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    return-object v0

    .line 56
    :goto_1
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    const/4 p1, 0x0

    .line 60
    return-object p1
.end method

.method public declared-synchronized getBoolean(Ljava/lang/String;)Z
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lio/fastkv/AbsFastKV;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized getBoolean(Ljava/lang/String;Z)Z
    .locals 1

    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/fastkv/Container$BooleanContainer;

    if-nez p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-boolean p2, p1, Lio/fastkv/Container$BooleanContainer;->value:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return p2

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public getDouble(Ljava/lang/String;)D
    .locals 2

    const-wide/16 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, v1}, Lio/fastkv/AbsFastKV;->getDouble(Ljava/lang/String;D)D

    move-result-wide v0

    return-wide v0
.end method

.method public declared-synchronized getDouble(Ljava/lang/String;D)D
    .locals 1

    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/fastkv/Container$DoubleContainer;

    if-nez p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-wide p2, p1, Lio/fastkv/Container$DoubleContainer;->value:D
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-wide p2

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public getFloat(Ljava/lang/String;)F
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lio/fastkv/AbsFastKV;->getFloat(Ljava/lang/String;F)F

    move-result p1

    return p1
.end method

.method public declared-synchronized getFloat(Ljava/lang/String;F)F
    .locals 1

    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/fastkv/Container$FloatContainer;

    if-nez p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget p2, p1, Lio/fastkv/Container$FloatContainer;->value:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return p2

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public getInt(Ljava/lang/String;)I
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lio/fastkv/AbsFastKV;->getInt(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public declared-synchronized getInt(Ljava/lang/String;I)I
    .locals 1

    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/fastkv/Container$IntContainer;

    if-nez p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget p2, p1, Lio/fastkv/Container$IntContainer;->value:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return p2

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized getLong(Ljava/lang/String;)J
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/fastkv/Container$LongContainer;

    if-nez p1, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    .line 2
    :cond_0
    iget-wide v0, p1, Lio/fastkv/Container$LongContainer;->value:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized getLong(Ljava/lang/String;J)J
    .locals 1

    monitor-enter p0

    .line 3
    :try_start_0
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/fastkv/Container$LongContainer;

    if-nez p1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-wide p2, p1, Lio/fastkv/Container$LongContainer;->value:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-wide p2

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final getNewCapacity(II)I
    .locals 1

    .line 1
    const/high16 v0, 0x10000000

    .line 2
    .line 3
    if-ge p2, v0, :cond_2

    .line 4
    .line 5
    sget v0, Lio/fastkv/AbsFastKV;->PAGE_SIZE:I

    .line 6
    .line 7
    if-gt p2, v0, :cond_0

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    :goto_0
    if-ge p1, p2, :cond_1

    .line 11
    .line 12
    shl-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    return p1

    .line 16
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string p2, "data size out of limit"

    .line 19
    .line 20
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1
.end method

.method public declared-synchronized getObject(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lio/fastkv/Container$ObjectContainer;

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    iget-boolean v1, v0, Lio/fastkv/Container$VarContainer;->external:Z

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->bigValueCache:Lio/fastkv/WeakCache;

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Lio/fastkv/WeakCache;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    monitor-exit p0

    .line 25
    return-object v1

    .line 26
    :cond_0
    :try_start_1
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;

    .line 27
    .line 28
    invoke-virtual {p0, v0, v1}, Lio/fastkv/AbsFastKV;->getObjectFromFile(Lio/fastkv/Container$ObjectContainer;Lio/fastkv/interfaces/FastCipher;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    invoke-interface {p0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->bigValueCache:Lio/fastkv/WeakCache;

    .line 41
    .line 42
    invoke-virtual {v1, p1, v0}, Lio/fastkv/WeakCache;->put(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    .line 45
    monitor-exit p0

    .line 46
    return-object v0

    .line 47
    :cond_2
    :try_start_2
    iget-object p1, v0, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 48
    .line 49
    monitor-exit p0

    .line 50
    return-object p1

    .line 51
    :cond_3
    :goto_0
    monitor-exit p0

    .line 52
    const/4 p1, 0x0

    .line 53
    return-object p1

    .line 54
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 55
    throw p1
.end method

.method public getObjectFromFile(Lio/fastkv/Container$ObjectContainer;Lio/fastkv/interfaces/FastCipher;)Ljava/lang/Object;
    .locals 5

    .line 1
    const-string v0, "No encoder for tag:"

    .line 2
    .line 3
    iget-object v1, p1, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->externalCache:Lio/fastkv/WeakCache;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Lio/fastkv/WeakCache;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, [B

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    :try_start_0
    new-instance v2, Ljava/io/File;

    .line 19
    .line 20
    new-instance v3, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object v4, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v4, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-direct {v2, v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v2}, Lio/fastkv/Utils;->getBytes(Ljava/io/File;)[B

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    :goto_0
    if-eqz v2, :cond_3

    .line 47
    .line 48
    if-eqz p2, :cond_1

    .line 49
    .line 50
    invoke-interface {p2, v2}, Lio/fastkv/interfaces/FastCipher;->decrypt([B)[B

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    goto :goto_1

    .line 55
    :catch_0
    move-exception p1

    .line 56
    goto :goto_2

    .line 57
    :cond_1
    :goto_1
    const/4 p2, 0x0

    .line 58
    aget-byte p2, v2, p2

    .line 59
    .line 60
    and-int/lit16 p2, p2, 0xff

    .line 61
    .line 62
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 63
    .line 64
    const/4 v3, 0x1

    .line 65
    invoke-virtual {v1, v2, v3, p2}, Lio/fastkv/FastBuffer;->decodeStr([BII)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget-object v4, p0, Lio/fastkv/AbsFastKV;->encoderMap:Ljava/util/Map;

    .line 70
    .line 71
    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    check-cast v4, Lio/fastkv/interfaces/FastEncoder;

    .line 76
    .line 77
    if-eqz v4, :cond_2

    .line 78
    .line 79
    iput-object v4, p1, Lio/fastkv/Container$ObjectContainer;->encoder:Lio/fastkv/interfaces/FastEncoder;

    .line 80
    .line 81
    add-int/2addr p2, v3

    .line 82
    array-length p1, v2

    .line 83
    sub-int/2addr p1, p2

    .line 84
    invoke-interface {v4, v2, p2, p1}, Lio/fastkv/interfaces/FastEncoder;->decode([BII)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1

    .line 89
    :cond_2
    new-instance p1, Ljava/lang/Exception;

    .line 90
    .line 91
    new-instance p2, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->warning(Ljava/lang/Exception;)V

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_3
    new-instance p1, Ljava/lang/Exception;

    .line 111
    .line 112
    const-string p2, "Read object data failed"

    .line 113
    .line 114
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->warning(Ljava/lang/Exception;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :goto_2
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 122
    .line 123
    .line 124
    :goto_3
    const/4 p1, 0x0

    .line 125
    return-object p1
.end method

.method public getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ""

    invoke-virtual {p0, p1, v0}, Lio/fastkv/AbsFastKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/fastkv/Container$StringContainer;

    if-eqz v0, :cond_4

    .line 3
    iget-boolean v1, v0, Lio/fastkv/Container$VarContainer;->external:Z

    if-eqz v1, :cond_3

    .line 4
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->bigValueCache:Lio/fastkv/WeakCache;

    invoke-virtual {v1, p1}, Lio/fastkv/WeakCache;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 5
    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 6
    check-cast v1, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 7
    :cond_0
    :try_start_1
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;

    invoke-virtual {p0, v0, v1}, Lio/fastkv/AbsFastKV;->getStringFromFile(Lio/fastkv/Container$StringContainer;Lio/fastkv/interfaces/FastCipher;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 9
    :cond_1
    iget-object p2, p0, Lio/fastkv/AbsFastKV;->bigValueCache:Lio/fastkv/WeakCache;

    invoke-virtual {p2, p1, v0}, Lio/fastkv/WeakCache;->put(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    monitor-exit p0

    return-object v0

    .line 11
    :cond_2
    :goto_0
    :try_start_2
    invoke-interface {p0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_1

    .line 12
    :cond_3
    iget-object p1, v0, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object p1

    .line 13
    :cond_4
    :goto_1
    monitor-exit p0

    return-object p2

    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public getStringFromFile(Lio/fastkv/Container$StringContainer;Lio/fastkv/interfaces/FastCipher;)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object p1, p1, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/lang/String;

    .line 4
    .line 5
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->externalCache:Lio/fastkv/WeakCache;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lio/fastkv/WeakCache;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, [B

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 18
    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-direct {v0, v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Lio/fastkv/Utils;->getBytes(Ljava/io/File;)[B

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :goto_0
    if-eqz v0, :cond_3

    .line 46
    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    invoke-interface {p2, v0}, Lio/fastkv/interfaces/FastCipher;->decrypt([B)[B

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    goto :goto_1

    .line 54
    :catch_0
    move-exception p1

    .line 55
    goto :goto_2

    .line 56
    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    .line 57
    .line 58
    new-instance p1, Ljava/lang/String;

    .line 59
    .line 60
    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 61
    .line 62
    invoke-direct {p1, v0, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    return-object p1

    .line 66
    :cond_2
    return-object v1

    .line 67
    :goto_2
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    return-object v1
.end method

.method public declared-synchronized getStringSet(Ljava/lang/String;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->getObject(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->getStringSet(Ljava/lang/String;)Ljava/util/Set;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    return-object p2
.end method

.method public abstract handleChange(Ljava/lang/String;)V
.end method

.method public final info(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->logger:Lio/fastkv/interfaces/FastLogger;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 6
    .line 7
    invoke-interface {v0, v1, p1}, Lio/fastkv/interfaces/FastLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final loadWithBlockingIO(Ljava/io/File;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_3

    .line 11
    .line 12
    const-wide/32 v4, 0x10000000

    .line 13
    .line 14
    .line 15
    cmp-long v2, v0, v4

    .line 16
    .line 17
    if-ltz v2, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    long-to-int v0, v0

    .line 21
    sget v1, Lio/fastkv/AbsFastKV;->PAGE_SIZE:I

    .line 22
    .line 23
    invoke-virtual {p0, v1, v0}, Lio/fastkv/AbsFastKV;->getNewCapacity(II)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    iget-object v4, v2, Lio/fastkv/FastBuffer;->hb:[B

    .line 32
    .line 33
    array-length v4, v4

    .line 34
    if-ne v4, v1, :cond_1

    .line 35
    .line 36
    iput v3, v2, Lio/fastkv/FastBuffer;->position:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    new-instance v2, Lio/fastkv/FastBuffer;

    .line 40
    .line 41
    new-array v1, v1, [B

    .line 42
    .line 43
    invoke-direct {v2, v1}, Lio/fastkv/FastBuffer;-><init>([B)V

    .line 44
    .line 45
    .line 46
    iput-object v2, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 47
    .line 48
    :goto_0
    iget-object v1, v2, Lio/fastkv/FastBuffer;->hb:[B

    .line 49
    .line 50
    invoke-static {p1, v1, v0}, Lio/fastkv/Utils;->readBytes(Ljava/io/File;[BI)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Lio/fastkv/FastBuffer;->getInt()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-gez p1, :cond_2

    .line 58
    .line 59
    return v3

    .line 60
    :cond_2
    invoke-static {p1}, Lio/fastkv/AbsFastKV;->unpackSize(I)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-static {p1}, Lio/fastkv/AbsFastKV;->isCipher(I)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    invoke-virtual {v2}, Lio/fastkv/FastBuffer;->getLong()J

    .line 69
    .line 70
    .line 71
    move-result-wide v4

    .line 72
    add-int/lit8 v6, v1, 0xc

    .line 73
    .line 74
    iput v6, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 75
    .line 76
    if-ltz v1, :cond_3

    .line 77
    .line 78
    const/16 v6, 0xc

    .line 79
    .line 80
    sub-int/2addr v0, v6

    .line 81
    if-gt v1, v0, :cond_3

    .line 82
    .line 83
    invoke-virtual {v2, v6, v1}, Lio/fastkv/FastBuffer;->getChecksum(II)J

    .line 84
    .line 85
    .line 86
    move-result-wide v0

    .line 87
    cmp-long v0, v4, v0

    .line 88
    .line 89
    if-nez v0, :cond_3

    .line 90
    .line 91
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->parseData(Z)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-eqz p1, :cond_3

    .line 96
    .line 97
    iput-wide v4, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 98
    .line 99
    const/4 p1, 0x1

    .line 100
    return p1

    .line 101
    :cond_3
    :goto_1
    return v3
.end method

.method public lockAndCheckUpdate()V
    .locals 0

    .line 1
    return-void
.end method

.method public declared-synchronized notifyListeners(Ljava/lang/String;)V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->listeners:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    check-cast v3, Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    .line 18
    .line 19
    iget-object v4, p0, Lio/fastkv/AbsFastKV;->mainHandler:Landroid/os/Handler;

    .line 20
    .line 21
    new-instance v5, Lio/fastkv/b;

    .line 22
    .line 23
    invoke-direct {v5, p0, v3, p1}, Lio/fastkv/b;-><init>(Lio/fastkv/AbsFastKV;Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    monitor-exit p0

    .line 33
    return-void

    .line 34
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw p1
.end method

.method public final packSize(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return p1

    .line 6
    :cond_0
    const/high16 v0, 0x40000000    # 2.0f

    .line 7
    .line 8
    or-int/2addr p1, v0

    .line 9
    return p1
.end method

.method public final parseData(Z)Z
    .locals 15

    .line 1
    const/4 v1, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string v0, "miss cipher"

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;

    .line 17
    .line 18
    :goto_0
    move-object v7, v0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    goto :goto_0

    .line 22
    :goto_1
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 23
    .line 24
    const/16 v8, 0xc

    .line 25
    .line 26
    iput v8, v0, Lio/fastkv/FastBuffer;->position:I

    .line 27
    .line 28
    :goto_2
    :try_start_0
    iget v10, v0, Lio/fastkv/FastBuffer;->position:I

    .line 29
    .line 30
    iget v2, p0, Lio/fastkv/AbsFastKV;->dataEnd:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    const-string v3, "parse dara failed"

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    if-ge v10, v2, :cond_14

    .line 36
    .line 37
    :try_start_1
    invoke-virtual {v0}, Lio/fastkv/FastBuffer;->get()B

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    and-int/lit8 v5, v2, 0x3f

    .line 42
    .line 43
    int-to-byte v5, v5

    .line 44
    if-lt v5, v4, :cond_13

    .line 45
    .line 46
    const/16 v6, 0x8

    .line 47
    .line 48
    if-gt v5, v6, :cond_13

    .line 49
    .line 50
    invoke-virtual {v0}, Lio/fastkv/FastBuffer;->get()B

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    and-int/lit16 v3, v3, 0xff

    .line 55
    .line 56
    if-eqz v3, :cond_12

    .line 57
    .line 58
    const v6, 0xffff

    .line 59
    .line 60
    .line 61
    const/4 v9, 0x5

    .line 62
    if-gez v2, :cond_3

    .line 63
    .line 64
    iget v2, v0, Lio/fastkv/FastBuffer;->position:I

    .line 65
    .line 66
    add-int/2addr v2, v3

    .line 67
    iput v2, v0, Lio/fastkv/FastBuffer;->position:I

    .line 68
    .line 69
    if-gt v5, v9, :cond_2

    .line 70
    .line 71
    sget-object v2, Lio/fastkv/AbsFastKV;->TYPE_SIZE:[I

    .line 72
    .line 73
    aget v2, v2, v5

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :catch_0
    move-exception v0

    .line 77
    goto/16 :goto_b

    .line 78
    .line 79
    :cond_2
    invoke-virtual {v0}, Lio/fastkv/FastBuffer;->getShort()S

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    and-int/2addr v2, v6

    .line 84
    :goto_3
    iget v3, v0, Lio/fastkv/FastBuffer;->position:I

    .line 85
    .line 86
    add-int/2addr v3, v2

    .line 87
    iput v3, v0, Lio/fastkv/FastBuffer;->position:I

    .line 88
    .line 89
    invoke-direct {p0, v10, v3}, Lio/fastkv/AbsFastKV;->countInvalid(II)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    invoke-virtual {v0, v7, v3}, Lio/fastkv/FastBuffer;->getString(Lio/fastkv/interfaces/FastCipher;I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    move v11, v6

    .line 98
    iget v6, v0, Lio/fastkv/FastBuffer;->position:I

    .line 99
    .line 100
    if-gt v5, v9, :cond_9

    .line 101
    .line 102
    if-eq v5, v4, :cond_7

    .line 103
    .line 104
    const/4 v2, 0x2

    .line 105
    if-eq v5, v2, :cond_6

    .line 106
    .line 107
    const/4 v2, 0x3

    .line 108
    if-eq v5, v2, :cond_5

    .line 109
    .line 110
    const/4 v2, 0x4

    .line 111
    if-eq v5, v2, :cond_4

    .line 112
    .line 113
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 114
    .line 115
    new-instance v4, Lio/fastkv/Container$DoubleContainer;

    .line 116
    .line 117
    invoke-virtual {v0, v7}, Lio/fastkv/FastBuffer;->getDouble(Lio/fastkv/interfaces/FastCipher;)D

    .line 118
    .line 119
    .line 120
    move-result-wide v9

    .line 121
    invoke-direct {v4, v6, v9, v10}, Lio/fastkv/Container$DoubleContainer;-><init>(ID)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_4
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 129
    .line 130
    new-instance v4, Lio/fastkv/Container$LongContainer;

    .line 131
    .line 132
    invoke-virtual {v0, v7}, Lio/fastkv/FastBuffer;->getLong(Lio/fastkv/interfaces/FastCipher;)J

    .line 133
    .line 134
    .line 135
    move-result-wide v9

    .line 136
    invoke-direct {v4, v6, v9, v10}, Lio/fastkv/Container$LongContainer;-><init>(IJ)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_5
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 144
    .line 145
    new-instance v4, Lio/fastkv/Container$FloatContainer;

    .line 146
    .line 147
    invoke-virtual {v0, v7}, Lio/fastkv/FastBuffer;->getFloat(Lio/fastkv/interfaces/FastCipher;)F

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    invoke-direct {v4, v6, v5}, Lio/fastkv/Container$FloatContainer;-><init>(IF)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    goto/16 :goto_2

    .line 158
    .line 159
    :cond_6
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 160
    .line 161
    new-instance v4, Lio/fastkv/Container$IntContainer;

    .line 162
    .line 163
    invoke-virtual {v0, v7}, Lio/fastkv/FastBuffer;->getInt(Lio/fastkv/interfaces/FastCipher;)I

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    invoke-direct {v4, v6, v5}, Lio/fastkv/Container$IntContainer;-><init>(II)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    goto/16 :goto_2

    .line 174
    .line 175
    :cond_7
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 176
    .line 177
    new-instance v5, Lio/fastkv/Container$BooleanContainer;

    .line 178
    .line 179
    invoke-virtual {v0}, Lio/fastkv/FastBuffer;->get()B

    .line 180
    .line 181
    .line 182
    move-result v9

    .line 183
    if-ne v9, v4, :cond_8

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_8
    move v4, v1

    .line 187
    :goto_4
    invoke-direct {v5, v6, v4}, Lio/fastkv/Container$BooleanContainer;-><init>(IZ)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    goto/16 :goto_2

    .line 194
    .line 195
    :cond_9
    invoke-virtual {v0}, Lio/fastkv/FastBuffer;->getShort()S

    .line 196
    .line 197
    .line 198
    move-result v9

    .line 199
    and-int v13, v9, v11

    .line 200
    .line 201
    and-int/lit8 v2, v2, 0x40

    .line 202
    .line 203
    if-eqz v2, :cond_a

    .line 204
    .line 205
    move v14, v4

    .line 206
    goto :goto_5

    .line 207
    :cond_a
    move v14, v1

    .line 208
    :goto_5
    if-eqz v14, :cond_c

    .line 209
    .line 210
    const/16 v2, 0x20

    .line 211
    .line 212
    if-ne v13, v2, :cond_b

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 216
    .line 217
    const-string v2, "name size not match"

    .line 218
    .line 219
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    throw v0

    .line 223
    :cond_c
    :goto_6
    const/4 v2, 0x6

    .line 224
    if-eq v5, v2, :cond_10

    .line 225
    .line 226
    const/4 v2, 0x7

    .line 227
    if-eq v5, v2, :cond_e

    .line 228
    .line 229
    if-eqz v14, :cond_d

    .line 230
    .line 231
    invoke-virtual {v0, v13}, Lio/fastkv/FastBuffer;->getString(I)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v12

    .line 235
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 236
    .line 237
    new-instance v9, Lio/fastkv/Container$ObjectContainer;

    .line 238
    .line 239
    add-int/lit8 v11, v6, 0x2

    .line 240
    .line 241
    const/4 v14, 0x1

    .line 242
    invoke-direct/range {v9 .. v14}, Lio/fastkv/Container$ObjectContainer;-><init>(IILjava/lang/Object;IZ)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v3, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    goto/16 :goto_2

    .line 249
    .line 250
    :cond_d
    move-object v2, p0

    .line 251
    move-object v4, v3

    .line 252
    move v5, v10

    .line 253
    move v3, v13

    .line 254
    invoke-direct/range {v2 .. v7}, Lio/fastkv/AbsFastKV;->parseObject(ILjava/lang/String;IILio/fastkv/interfaces/FastCipher;)V

    .line 255
    .line 256
    .line 257
    add-int/lit8 v6, v6, 0x2

    .line 258
    .line 259
    add-int/2addr v6, v13

    .line 260
    iput v6, v0, Lio/fastkv/FastBuffer;->position:I

    .line 261
    .line 262
    goto/16 :goto_2

    .line 263
    .line 264
    :cond_e
    move-object v4, v3

    .line 265
    if-eqz v14, :cond_f

    .line 266
    .line 267
    invoke-virtual {v0, v13}, Lio/fastkv/FastBuffer;->getString(I)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    :goto_7
    move-object v12, v2

    .line 272
    goto :goto_8

    .line 273
    :cond_f
    invoke-virtual {v0, v7, v13}, Lio/fastkv/FastBuffer;->getBytes(Lio/fastkv/interfaces/FastCipher;I)[B

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    goto :goto_7

    .line 278
    :goto_8
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 279
    .line 280
    new-instance v9, Lio/fastkv/Container$ArrayContainer;

    .line 281
    .line 282
    add-int/lit8 v11, v6, 0x2

    .line 283
    .line 284
    invoke-direct/range {v9 .. v14}, Lio/fastkv/Container$ArrayContainer;-><init>(IILjava/lang/Object;IZ)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2, v4, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    goto/16 :goto_2

    .line 291
    .line 292
    :cond_10
    move-object v4, v3

    .line 293
    if-eqz v14, :cond_11

    .line 294
    .line 295
    invoke-virtual {v0, v13}, Lio/fastkv/FastBuffer;->getString(I)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    :goto_9
    move-object v12, v2

    .line 300
    goto :goto_a

    .line 301
    :cond_11
    invoke-virtual {v0, v7, v13}, Lio/fastkv/FastBuffer;->getString(Lio/fastkv/interfaces/FastCipher;I)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    goto :goto_9

    .line 306
    :goto_a
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 307
    .line 308
    new-instance v9, Lio/fastkv/Container$StringContainer;

    .line 309
    .line 310
    add-int/lit8 v11, v6, 0x2

    .line 311
    .line 312
    invoke-direct/range {v9 .. v14}, Lio/fastkv/Container$StringContainer;-><init>(IILjava/lang/String;IZ)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2, v4, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    goto/16 :goto_2

    .line 319
    .line 320
    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 321
    .line 322
    const-string v2, "invalid key size"

    .line 323
    .line 324
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    throw v0

    .line 328
    :cond_13
    new-instance v0, Ljava/lang/Exception;

    .line 329
    .line 330
    invoke-direct {v0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 334
    :cond_14
    if-eq v10, v2, :cond_15

    .line 335
    .line 336
    new-instance v0, Ljava/lang/Exception;

    .line 337
    .line 338
    invoke-direct {v0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 342
    .line 343
    .line 344
    return v1

    .line 345
    :cond_15
    if-nez p1, :cond_16

    .line 346
    .line 347
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;

    .line 348
    .line 349
    if-eqz v0, :cond_16

    .line 350
    .line 351
    if-eq v2, v8, :cond_16

    .line 352
    .line 353
    move v1, v4

    .line 354
    :cond_16
    iput-boolean v1, p0, Lio/fastkv/AbsFastKV;->needRewrite:Z

    .line 355
    .line 356
    return v4

    .line 357
    :goto_b
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 358
    .line 359
    .line 360
    return v1
.end method

.method public preparePutBytes()V
    .locals 2

    .line 1
    iget v0, p0, Lio/fastkv/AbsFastKV;->updateSize:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->ensureSize(I)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 7
    .line 8
    iput v0, p0, Lio/fastkv/AbsFastKV;->updateStart:I

    .line 9
    .line 10
    iget v1, p0, Lio/fastkv/AbsFastKV;->updateSize:I

    .line 11
    .line 12
    add-int/2addr v1, v0

    .line 13
    iput v1, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 14
    .line 15
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 16
    .line 17
    iput v0, v1, Lio/fastkv/FastBuffer;->position:I

    .line 18
    .line 19
    return-void
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 22
    invoke-virtual {p0, p1, v0}, Lio/fastkv/AbsFastKV;->putAll(Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method public declared-synchronized putAll(Ljava/util/Map;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/Class;",
            "Lio/fastkv/interfaces/FastEncoder;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lio/fastkv/AbsFastKV;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    .line 2
    :cond_0
    :try_start_1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 3
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 4
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 6
    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_2

    .line 7
    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v1, v0}, Lio/fastkv/AbsFastKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 8
    :cond_2
    instance-of v2, v0, Ljava/lang/Boolean;

    if-eqz v2, :cond_3

    .line 9
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v1, v0}, Lio/fastkv/AbsFastKV;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 10
    :cond_3
    instance-of v2, v0, Ljava/lang/Integer;

    if-eqz v2, :cond_4

    .line 11
    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v1, v0}, Lio/fastkv/AbsFastKV;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 12
    :cond_4
    instance-of v2, v0, Ljava/lang/Long;

    if-eqz v2, :cond_5

    .line 13
    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v1, v2, v3}, Lio/fastkv/AbsFastKV;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 14
    :cond_5
    instance-of v2, v0, Ljava/lang/Float;

    if-eqz v2, :cond_6

    .line 15
    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p0, v1, v0}, Lio/fastkv/AbsFastKV;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 16
    :cond_6
    instance-of v2, v0, Ljava/lang/Double;

    if-eqz v2, :cond_7

    .line 17
    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {p0, v1, v2, v3}, Lio/fastkv/AbsFastKV;->putDouble(Ljava/lang/String;D)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 18
    :cond_7
    instance-of v2, v0, [B

    if-eqz v2, :cond_8

    .line 19
    check-cast v0, [B

    invoke-virtual {p0, v1, v0}, Lio/fastkv/AbsFastKV;->putArray(Ljava/lang/String;[B)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 20
    :cond_8
    invoke-direct {p0, v1, v0, p2}, Lio/fastkv/AbsFastKV;->encodeObject(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 21
    :cond_9
    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public declared-synchronized putArray(Ljava/lang/String;[B)Landroid/content/SharedPreferences$Editor;
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lio/fastkv/AbsFastKV;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->checkKey(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 9
    .line 10
    .line 11
    if-nez p2, :cond_1

    .line 12
    .line 13
    :try_start_2
    invoke-interface {p0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 14
    .line 15
    .line 16
    move-object v1, p0

    .line 17
    goto :goto_1

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    move-object p1, v0

    .line 20
    move-object v1, p0

    .line 21
    goto :goto_3

    .line 22
    :cond_1
    :try_start_3
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->lockAndCheckUpdate()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    move-object v5, v0

    .line 32
    check-cast v5, Lio/fastkv/Container$ArrayContainer;

    .line 33
    .line 34
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    :try_start_4
    invoke-interface {v0, p2}, Lio/fastkv/interfaces/FastCipher;->encrypt([B)[B

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    move-object v4, v0

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    move-object v4, p2

    .line 45
    :goto_0
    if-nez v4, :cond_3

    .line 46
    .line 47
    new-instance p1, Ljava/lang/Exception;

    .line 48
    .line 49
    const-string p2, "Encrypt failed"

    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 55
    .line 56
    .line 57
    monitor-exit p0

    .line 58
    return-object p0

    .line 59
    :cond_3
    const/4 v6, 0x7

    .line 60
    move-object v1, p0

    .line 61
    move-object v2, p1

    .line 62
    move-object v3, p2

    .line 63
    :try_start_5
    invoke-virtual/range {v1 .. v6}, Lio/fastkv/AbsFastKV;->addOrUpdate(Ljava/lang/String;Ljava/lang/Object;[BLio/fastkv/Container$VarContainer;B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v2}, Lio/fastkv/AbsFastKV;->handleChange(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 67
    .line 68
    .line 69
    :goto_1
    monitor-exit p0

    .line 70
    return-object v1

    .line 71
    :catchall_1
    move-exception v0

    .line 72
    :goto_2
    move-object p1, v0

    .line 73
    goto :goto_3

    .line 74
    :catchall_2
    move-exception v0

    .line 75
    move-object v1, p0

    .line 76
    goto :goto_2

    .line 77
    :goto_3
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 78
    throw p1
.end method

.method public declared-synchronized putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lio/fastkv/AbsFastKV;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->checkKey(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->lockAndCheckUpdate()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lio/fastkv/Container$BooleanContainer;

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p0, p1, v0}, Lio/fastkv/AbsFastKV;->wrapHeader(Ljava/lang/String;B)Z

    .line 26
    .line 27
    .line 28
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    monitor-exit p0

    .line 32
    return-object p0

    .line 33
    :cond_1
    :try_start_2
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 34
    .line 35
    iget v1, v0, Lio/fastkv/FastBuffer;->position:I

    .line 36
    .line 37
    int-to-byte v2, p2

    .line 38
    invoke-virtual {v0, v2}, Lio/fastkv/FastBuffer;->put(B)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->updateChange()V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 45
    .line 46
    new-instance v2, Lio/fastkv/Container$BooleanContainer;

    .line 47
    .line 48
    invoke-direct {v2, v1, p2}, Lio/fastkv/Container$BooleanContainer;-><init>(IZ)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->handleChange(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    iget-boolean v1, v0, Lio/fastkv/Container$BooleanContainer;->value:Z

    .line 61
    .line 62
    if-eq v1, p2, :cond_3

    .line 63
    .line 64
    iput-boolean p2, v0, Lio/fastkv/Container$BooleanContainer;->value:Z

    .line 65
    .line 66
    int-to-byte p2, p2

    .line 67
    iget v0, v0, Lio/fastkv/Container$BaseContainer;->offset:I

    .line 68
    .line 69
    invoke-virtual {p0, p2, v0}, Lio/fastkv/AbsFastKV;->updateBoolean(BI)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->handleChange(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 73
    .line 74
    .line 75
    :cond_3
    :goto_0
    monitor-exit p0

    .line 76
    return-object p0

    .line 77
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 78
    throw p1
.end method

.method public declared-synchronized putDouble(Ljava/lang/String;D)Landroid/content/SharedPreferences$Editor;
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lio/fastkv/AbsFastKV;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->checkKey(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->lockAndCheckUpdate()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lio/fastkv/Container$DoubleContainer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 21
    .line 22
    if-nez v0, :cond_3

    .line 23
    .line 24
    const/4 v0, 0x5

    .line 25
    :try_start_2
    invoke-direct {p0, p1, v0}, Lio/fastkv/AbsFastKV;->wrapHeader(Ljava/lang/String;B)Z

    .line 26
    .line 27
    .line 28
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    monitor-exit p0

    .line 32
    return-object p0

    .line 33
    :cond_1
    :try_start_3
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 34
    .line 35
    iget v1, v0, Lio/fastkv/FastBuffer;->position:I

    .line 36
    .line 37
    invoke-direct {p0, p2, p3}, Lio/fastkv/AbsFastKV;->getNewDoubleValue(D)J

    .line 38
    .line 39
    .line 40
    move-result-wide v2

    .line 41
    invoke-virtual {v0, v2, v3}, Lio/fastkv/FastBuffer;->putLong(J)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->updateChange()V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 48
    .line 49
    new-instance v2, Lio/fastkv/Container$DoubleContainer;

    .line 50
    .line 51
    invoke-direct {v2, v1, p2, p3}, Lio/fastkv/Container$DoubleContainer;-><init>(ID)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->handleChange(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 58
    .line 59
    .line 60
    :cond_2
    move-object v2, p0

    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    move-object p1, v0

    .line 64
    move-object v2, p0

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    :try_start_4
    iget-wide v1, v0, Lio/fastkv/Container$DoubleContainer;->value:D

    .line 67
    .line 68
    cmpl-double v1, v1, p2

    .line 69
    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    invoke-direct {p0, p2, p3}, Lio/fastkv/AbsFastKV;->getNewDoubleValue(D)J

    .line 73
    .line 74
    .line 75
    move-result-wide v3

    .line 76
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 77
    .line 78
    iget v2, v0, Lio/fastkv/Container$BaseContainer;->offset:I

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Lio/fastkv/FastBuffer;->getLong(I)J

    .line 81
    .line 82
    .line 83
    move-result-wide v1

    .line 84
    xor-long v5, v3, v1

    .line 85
    .line 86
    iput-wide p2, v0, Lio/fastkv/Container$DoubleContainer;->value:D

    .line 87
    .line 88
    iget v7, v0, Lio/fastkv/Container$BaseContainer;->offset:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 89
    .line 90
    move-object v2, p0

    .line 91
    :try_start_5
    invoke-virtual/range {v2 .. v7}, Lio/fastkv/AbsFastKV;->updateInt64(JJI)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->handleChange(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :catchall_1
    move-exception v0

    .line 99
    :goto_0
    move-object p1, v0

    .line 100
    goto :goto_2

    .line 101
    :catchall_2
    move-exception v0

    .line 102
    move-object v2, p0

    .line 103
    goto :goto_0

    .line 104
    :goto_1
    monitor-exit p0

    .line 105
    return-object v2

    .line 106
    :goto_2
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 107
    throw p1
.end method

.method public declared-synchronized putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lio/fastkv/AbsFastKV;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->checkKey(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->lockAndCheckUpdate()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lio/fastkv/Container$FloatContainer;

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    invoke-direct {p0, p1, v0}, Lio/fastkv/AbsFastKV;->wrapHeader(Ljava/lang/String;B)Z

    .line 26
    .line 27
    .line 28
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    monitor-exit p0

    .line 32
    return-object p0

    .line 33
    :cond_1
    :try_start_2
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 34
    .line 35
    iget v1, v0, Lio/fastkv/FastBuffer;->position:I

    .line 36
    .line 37
    invoke-direct {p0, p2}, Lio/fastkv/AbsFastKV;->getNewFloatValue(F)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-virtual {v0, v2}, Lio/fastkv/FastBuffer;->putInt(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->updateChange()V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 48
    .line 49
    new-instance v2, Lio/fastkv/Container$FloatContainer;

    .line 50
    .line 51
    invoke-direct {v2, v1, p2}, Lio/fastkv/Container$FloatContainer;-><init>(IF)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->handleChange(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    iget v1, v0, Lio/fastkv/Container$FloatContainer;->value:F

    .line 64
    .line 65
    cmpl-float v1, v1, p2

    .line 66
    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    invoke-direct {p0, p2}, Lio/fastkv/AbsFastKV;->getNewFloatValue(F)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 74
    .line 75
    iget v3, v0, Lio/fastkv/Container$BaseContainer;->offset:I

    .line 76
    .line 77
    invoke-virtual {v2, v3}, Lio/fastkv/FastBuffer;->getInt(I)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    xor-int/2addr v2, v1

    .line 82
    int-to-long v2, v2

    .line 83
    const-wide v4, 0xffffffffL

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    and-long/2addr v2, v4

    .line 89
    iput p2, v0, Lio/fastkv/Container$FloatContainer;->value:F

    .line 90
    .line 91
    iget p2, v0, Lio/fastkv/Container$BaseContainer;->offset:I

    .line 92
    .line 93
    invoke-virtual {p0, v1, v2, v3, p2}, Lio/fastkv/AbsFastKV;->updateInt32(IJI)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->handleChange(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    .line 98
    .line 99
    :cond_3
    :goto_0
    monitor-exit p0

    .line 100
    return-object p0

    .line 101
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 102
    throw p1
.end method

.method public declared-synchronized putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lio/fastkv/AbsFastKV;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->checkKey(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->lockAndCheckUpdate()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lio/fastkv/Container$IntContainer;

    .line 21
    .line 22
    if-nez v0, :cond_3

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    invoke-direct {p0, p1, v0}, Lio/fastkv/AbsFastKV;->wrapHeader(Ljava/lang/String;B)Z

    .line 26
    .line 27
    .line 28
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    monitor-exit p0

    .line 32
    return-object p0

    .line 33
    :cond_1
    :try_start_2
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 34
    .line 35
    iget v1, v0, Lio/fastkv/FastBuffer;->position:I

    .line 36
    .line 37
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    invoke-interface {v2, p2}, Lio/fastkv/interfaces/FastCipher;->encrypt(I)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_4

    .line 48
    :cond_2
    move v2, p2

    .line 49
    :goto_0
    invoke-virtual {v0, v2}, Lio/fastkv/FastBuffer;->putInt(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->updateChange()V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 56
    .line 57
    new-instance v2, Lio/fastkv/Container$IntContainer;

    .line 58
    .line 59
    invoke-direct {v2, v1, p2}, Lio/fastkv/Container$IntContainer;-><init>(II)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->handleChange(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_3
    iget v1, v0, Lio/fastkv/Container$IntContainer;->value:I

    .line 70
    .line 71
    if-eq v1, p2, :cond_6

    .line 72
    .line 73
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;

    .line 74
    .line 75
    if-eqz v1, :cond_4

    .line 76
    .line 77
    invoke-interface {v1, p2}, Lio/fastkv/interfaces/FastCipher;->encrypt(I)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    goto :goto_1

    .line 82
    :cond_4
    move v1, p2

    .line 83
    :goto_1
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;

    .line 84
    .line 85
    if-eqz v2, :cond_5

    .line 86
    .line 87
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 88
    .line 89
    iget v3, v0, Lio/fastkv/Container$BaseContainer;->offset:I

    .line 90
    .line 91
    invoke-virtual {v2, v3}, Lio/fastkv/FastBuffer;->getInt(I)I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    goto :goto_2

    .line 96
    :cond_5
    iget v2, v0, Lio/fastkv/Container$IntContainer;->value:I

    .line 97
    .line 98
    :goto_2
    xor-int/2addr v2, v1

    .line 99
    int-to-long v2, v2

    .line 100
    const-wide v4, 0xffffffffL

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    and-long/2addr v2, v4

    .line 106
    iput p2, v0, Lio/fastkv/Container$IntContainer;->value:I

    .line 107
    .line 108
    iget p2, v0, Lio/fastkv/Container$BaseContainer;->offset:I

    .line 109
    .line 110
    invoke-virtual {p0, v1, v2, v3, p2}, Lio/fastkv/AbsFastKV;->updateInt32(IJI)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->handleChange(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 114
    .line 115
    .line 116
    :cond_6
    :goto_3
    monitor-exit p0

    .line 117
    return-object p0

    .line 118
    :goto_4
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 119
    throw p1
.end method

.method public declared-synchronized putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lio/fastkv/AbsFastKV;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->checkKey(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->lockAndCheckUpdate()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lio/fastkv/Container$LongContainer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 21
    .line 22
    if-nez v0, :cond_4

    .line 23
    .line 24
    const/4 v0, 0x4

    .line 25
    :try_start_2
    invoke-direct {p0, p1, v0}, Lio/fastkv/AbsFastKV;->wrapHeader(Ljava/lang/String;B)Z

    .line 26
    .line 27
    .line 28
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    monitor-exit p0

    .line 32
    return-object p0

    .line 33
    :cond_1
    :try_start_3
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 34
    .line 35
    iget v1, v0, Lio/fastkv/FastBuffer;->position:I

    .line 36
    .line 37
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    invoke-interface {v2, p2, p3}, Lio/fastkv/interfaces/FastCipher;->encrypt(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    move-object p1, v0

    .line 48
    move-object v1, p0

    .line 49
    goto :goto_5

    .line 50
    :cond_2
    move-wide v2, p2

    .line 51
    :goto_0
    invoke-virtual {v0, v2, v3}, Lio/fastkv/FastBuffer;->putLong(J)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->updateChange()V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 58
    .line 59
    new-instance v2, Lio/fastkv/Container$LongContainer;

    .line 60
    .line 61
    invoke-direct {v2, v1, p2, p3}, Lio/fastkv/Container$LongContainer;-><init>(IJ)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->handleChange(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 68
    .line 69
    .line 70
    :cond_3
    move-object v1, p0

    .line 71
    goto :goto_4

    .line 72
    :cond_4
    :try_start_4
    iget-wide v1, v0, Lio/fastkv/Container$LongContainer;->value:J

    .line 73
    .line 74
    cmp-long v1, v1, p2

    .line 75
    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 79
    .line 80
    if-eqz v1, :cond_5

    .line 81
    .line 82
    :try_start_5
    invoke-interface {v1, p2, p3}, Lio/fastkv/interfaces/FastCipher;->encrypt(J)J

    .line 83
    .line 84
    .line 85
    move-result-wide v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 86
    move-wide v2, v1

    .line 87
    goto :goto_1

    .line 88
    :cond_5
    move-wide v2, p2

    .line 89
    :goto_1
    :try_start_6
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 90
    .line 91
    if-eqz v1, :cond_6

    .line 92
    .line 93
    :try_start_7
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 94
    .line 95
    iget v4, v0, Lio/fastkv/Container$BaseContainer;->offset:I

    .line 96
    .line 97
    invoke-virtual {v1, v4}, Lio/fastkv/FastBuffer;->getLong(I)J

    .line 98
    .line 99
    .line 100
    move-result-wide v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 101
    goto :goto_2

    .line 102
    :cond_6
    :try_start_8
    iget-wide v4, v0, Lio/fastkv/Container$LongContainer;->value:J

    .line 103
    .line 104
    :goto_2
    xor-long/2addr v4, v2

    .line 105
    iput-wide p2, v0, Lio/fastkv/Container$LongContainer;->value:J

    .line 106
    .line 107
    iget v6, v0, Lio/fastkv/Container$BaseContainer;->offset:I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 108
    .line 109
    move-object v1, p0

    .line 110
    :try_start_9
    invoke-virtual/range {v1 .. v6}, Lio/fastkv/AbsFastKV;->updateInt64(JJI)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->handleChange(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 114
    .line 115
    .line 116
    goto :goto_4

    .line 117
    :catchall_1
    move-exception v0

    .line 118
    :goto_3
    move-object p1, v0

    .line 119
    goto :goto_5

    .line 120
    :catchall_2
    move-exception v0

    .line 121
    move-object v1, p0

    .line 122
    goto :goto_3

    .line 123
    :goto_4
    monitor-exit p0

    .line 124
    return-object v1

    .line 125
    :goto_5
    :try_start_a
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 126
    throw p1
.end method

.method public declared-synchronized putObject(Ljava/lang/String;Ljava/lang/Object;Lio/fastkv/interfaces/FastEncoder;)Landroid/content/SharedPreferences$Editor;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;",
            "Lio/fastkv/interfaces/FastEncoder<",
            "TT;>;)",
            "Landroid/content/SharedPreferences$Editor;"
        }
    .end annotation

    .line 1
    const-string v0, "Invalid encoder tag:"

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lio/fastkv/AbsFastKV;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->checkKey(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    if-eqz p3, :cond_7

    .line 14
    .line 15
    invoke-interface {p3}, Lio/fastkv/interfaces/FastEncoder;->tag()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v1, :cond_6

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_6

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/16 v3, 0x32

    .line 32
    .line 33
    if-gt v2, v3, :cond_6

    .line 34
    .line 35
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->encoderMap:Ljava/util/Map;

    .line 36
    .line 37
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 41
    if-eqz v0, :cond_5

    .line 42
    .line 43
    if-nez p2, :cond_1

    .line 44
    .line 45
    :try_start_2
    invoke-interface {p0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 46
    .line 47
    .line 48
    monitor-exit p0

    .line 49
    return-object p0

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    move-object p1, v0

    .line 52
    move-object p2, p1

    .line 53
    move-object p1, p0

    .line 54
    goto/16 :goto_2

    .line 55
    .line 56
    :cond_1
    :try_start_3
    invoke-interface {p3, p2}, Lio/fastkv/interfaces/FastEncoder;->encode(Ljava/lang/Object;)[B

    .line 57
    .line 58
    .line 59
    move-result-object p3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 60
    goto :goto_0

    .line 61
    :catch_0
    move-exception v0

    .line 62
    move-object p3, v0

    .line 63
    :try_start_4
    invoke-virtual {p0, p3}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 64
    .line 65
    .line 66
    const/4 p3, 0x0

    .line 67
    :goto_0
    if-nez p3, :cond_2

    .line 68
    .line 69
    :try_start_5
    invoke-interface {p0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 70
    .line 71
    .line 72
    monitor-exit p0

    .line 73
    return-object p0

    .line 74
    :cond_2
    :try_start_6
    invoke-static {v1}, Lio/fastkv/FastBuffer;->getStringSize(Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    new-instance v2, Lio/fastkv/FastBuffer;

    .line 79
    .line 80
    add-int/lit8 v3, v0, 0x1

    .line 81
    .line 82
    array-length v4, p3

    .line 83
    add-int/2addr v3, v4

    .line 84
    invoke-direct {v2, v3}, Lio/fastkv/FastBuffer;-><init>(I)V

    .line 85
    .line 86
    .line 87
    int-to-byte v0, v0

    .line 88
    invoke-virtual {v2, v0}, Lio/fastkv/FastBuffer;->put(B)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v1}, Lio/fastkv/FastBuffer;->putString(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, p3}, Lio/fastkv/FastBuffer;->putBytes([B)V

    .line 95
    .line 96
    .line 97
    iget-object p3, v2, Lio/fastkv/FastBuffer;->hb:[B

    .line 98
    .line 99
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->lockAndCheckUpdate()V

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 103
    .line 104
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    move-object v5, v0

    .line 109
    check-cast v5, Lio/fastkv/Container$ObjectContainer;

    .line 110
    .line 111
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 112
    .line 113
    if-eqz v0, :cond_3

    .line 114
    .line 115
    :try_start_7
    invoke-interface {v0, p3}, Lio/fastkv/interfaces/FastCipher;->encrypt([B)[B

    .line 116
    .line 117
    .line 118
    move-result-object p3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 119
    :cond_3
    move-object v4, p3

    .line 120
    if-nez v4, :cond_4

    .line 121
    .line 122
    monitor-exit p0

    .line 123
    return-object p0

    .line 124
    :cond_4
    const/16 v6, 0x8

    .line 125
    .line 126
    move-object v1, p0

    .line 127
    move-object v2, p1

    .line 128
    move-object v3, p2

    .line 129
    :try_start_8
    invoke-virtual/range {v1 .. v6}, Lio/fastkv/AbsFastKV;->addOrUpdate(Ljava/lang/String;Ljava/lang/Object;[BLio/fastkv/Container$VarContainer;B)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 130
    .line 131
    .line 132
    move-object p1, v1

    .line 133
    :try_start_9
    invoke-virtual {p0, v2}, Lio/fastkv/AbsFastKV;->handleChange(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 134
    .line 135
    .line 136
    monitor-exit p0

    .line 137
    return-object p1

    .line 138
    :catchall_1
    move-exception v0

    .line 139
    :goto_1
    move-object p2, v0

    .line 140
    goto :goto_2

    .line 141
    :catchall_2
    move-exception v0

    .line 142
    move-object p1, v1

    .line 143
    goto :goto_1

    .line 144
    :catchall_3
    move-exception v0

    .line 145
    move-object p1, p0

    .line 146
    goto :goto_1

    .line 147
    :cond_5
    move-object p1, p0

    .line 148
    :try_start_a
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 149
    .line 150
    const-string p3, "Encoder hasn\'t been registered"

    .line 151
    .line 152
    invoke-direct {p2, p3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw p2

    .line 156
    :cond_6
    move-object p1, p0

    .line 157
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 158
    .line 159
    new-instance p3, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p3

    .line 171
    invoke-direct {p2, p3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw p2

    .line 175
    :cond_7
    move-object p1, p0

    .line 176
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 177
    .line 178
    const-string p3, "Encoder is null"

    .line 179
    .line 180
    invoke-direct {p2, p3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw p2

    .line 184
    :goto_2
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 185
    throw p2
.end method

.method public declared-synchronized putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lio/fastkv/AbsFastKV;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->checkKey(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 9
    .line 10
    .line 11
    if-nez p2, :cond_1

    .line 12
    .line 13
    :try_start_2
    invoke-interface {p0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 14
    .line 15
    .line 16
    move-object v1, p0

    .line 17
    goto :goto_2

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    move-object p1, v0

    .line 20
    move-object v1, p0

    .line 21
    goto :goto_4

    .line 22
    :cond_1
    :try_start_3
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->lockAndCheckUpdate()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    move-object v5, v0

    .line 32
    check-cast v5, Lio/fastkv/Container$StringContainer;

    .line 33
    .line 34
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    :try_start_4
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    mul-int/lit8 v0, v0, 0x3

    .line 43
    .line 44
    iget v1, p0, Lio/fastkv/AbsFastKV;->INTERNAL_LIMIT:I

    .line 45
    .line 46
    if-ge v0, v1, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0, p1, p2, v5}, Lio/fastkv/AbsFastKV;->fastPutString(Ljava/lang/String;Ljava/lang/String;Lio/fastkv/Container$StringContainer;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 49
    .line 50
    .line 51
    move-object v1, p0

    .line 52
    move-object v2, p1

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    :try_start_5
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    :try_start_6
    sget-object v0, Lio/fastkv/AbsFastKV;->EMPTY_ARRAY:[B
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    :try_start_7
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 64
    .line 65
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    :goto_0
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 70
    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    :try_start_8
    invoke-interface {v1, v0}, Lio/fastkv/interfaces/FastCipher;->encrypt([B)[B

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :cond_4
    move-object v4, v0

    .line 78
    if-nez v4, :cond_5

    .line 79
    .line 80
    new-instance p1, Ljava/lang/Exception;

    .line 81
    .line 82
    const-string p2, "Encrypt failed"

    .line 83
    .line 84
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 88
    .line 89
    .line 90
    monitor-exit p0

    .line 91
    return-object p0

    .line 92
    :cond_5
    const/4 v6, 0x6

    .line 93
    move-object v1, p0

    .line 94
    move-object v2, p1

    .line 95
    move-object v3, p2

    .line 96
    :try_start_9
    invoke-virtual/range {v1 .. v6}, Lio/fastkv/AbsFastKV;->addOrUpdate(Ljava/lang/String;Ljava/lang/Object;[BLio/fastkv/Container$VarContainer;B)V

    .line 97
    .line 98
    .line 99
    :goto_1
    invoke-virtual {p0, v2}, Lio/fastkv/AbsFastKV;->handleChange(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 100
    .line 101
    .line 102
    :goto_2
    monitor-exit p0

    .line 103
    return-object v1

    .line 104
    :catchall_1
    move-exception v0

    .line 105
    :goto_3
    move-object p1, v0

    .line 106
    goto :goto_4

    .line 107
    :catchall_2
    move-exception v0

    .line 108
    move-object v1, p0

    .line 109
    goto :goto_3

    .line 110
    :goto_4
    :try_start_a
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 111
    throw p1
.end method

.method public declared-synchronized putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/content/SharedPreferences$Editor;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lio/fastkv/AbsFastKV;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    if-nez p2, :cond_1

    .line 9
    .line 10
    :try_start_1
    invoke-interface {p0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    sget-object v0, Lio/fastkv/StringSetEncoder;->INSTANCE:Lio/fastkv/StringSetEncoder;

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2, v0}, Lio/fastkv/AbsFastKV;->putObject(Ljava/lang/String;Ljava/lang/Object;Lio/fastkv/interfaces/FastEncoder;)Landroid/content/SharedPreferences$Editor;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    .line 20
    .line 21
    :goto_0
    monitor-exit p0

    .line 22
    return-object p0

    .line 23
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 24
    throw p1
.end method

.method public declared-synchronized registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->listeners:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->listeners:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw p1
.end method

.method public remove(BII)V
    .locals 8

    .line 1
    invoke-direct {p0, p2, p3}, Lio/fastkv/AbsFastKV;->countInvalid(II)V

    .line 2
    .line 3
    .line 4
    or-int/lit8 p1, p1, -0x80

    .line 5
    .line 6
    int-to-byte p1, p1

    .line 7
    iget-object p3, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 8
    .line 9
    iget-object p3, p3, Lio/fastkv/FastBuffer;->hb:[B

    .line 10
    .line 11
    aget-byte v0, p3, p2

    .line 12
    .line 13
    and-int/lit8 v1, p2, 0x7

    .line 14
    .line 15
    shl-int/lit8 v1, v1, 0x3

    .line 16
    .line 17
    iget-wide v2, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 18
    .line 19
    xor-int/2addr v0, p1

    .line 20
    int-to-long v4, v0

    .line 21
    const-wide/16 v6, 0xff

    .line 22
    .line 23
    and-long/2addr v4, v6

    .line 24
    shl-long v0, v4, v1

    .line 25
    .line 26
    xor-long/2addr v0, v2

    .line 27
    iput-wide v0, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 28
    .line 29
    aput-byte p1, p3, p2

    .line 30
    .line 31
    return-void
.end method

.method public abstract removeOldFile(Ljava/lang/String;)V
.end method

.method public resetData()V
    .locals 2

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    iput v0, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    iput-wide v0, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 8
    .line 9
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->bigValueCache:Lio/fastkv/WeakCache;

    .line 15
    .line 16
    invoke-virtual {v0}, Lio/fastkv/WeakCache;->clear()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->externalCache:Lio/fastkv/WeakCache;

    .line 20
    .line 21
    invoke-virtual {v0}, Lio/fastkv/WeakCache;->clear()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->clearInvalid()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final resetMemory()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->resetData()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lio/fastkv/AbsFastKV;->resetBuffer()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public rewrite()V
    .locals 9

    .line 1
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->encoderMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-array v0, v0, [Lio/fastkv/interfaces/FastEncoder;

    .line 8
    .line 9
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->encoderMap:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v4, v0

    .line 20
    check-cast v4, [Lio/fastkv/interfaces/FastEncoder;

    .line 21
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, "temp_"

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    new-instance v1, Lio/fastkv/FastKV;

    .line 39
    .line 40
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v5, p0, Lio/fastkv/AbsFastKV;->cipher:Lio/fastkv/interfaces/FastCipher;

    .line 43
    .line 44
    const/4 v6, 0x2

    .line 45
    invoke-direct/range {v1 .. v6}, Lio/fastkv/FastKV;-><init>(Ljava/lang/String;Ljava/lang/String;[Lio/fastkv/interfaces/FastEncoder;Lio/fastkv/interfaces/FastCipher;I)V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    iput-boolean v0, v1, Lio/fastkv/FastKV;->autoCommit:Z

    .line 50
    .line 51
    new-instance v2, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    iget-object v4, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_b

    .line 71
    .line 72
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    check-cast v5, Ljava/util/Map$Entry;

    .line 77
    .line 78
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    check-cast v6, Ljava/lang/String;

    .line 83
    .line 84
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    instance-of v7, v5, Lio/fastkv/Container$StringContainer;

    .line 89
    .line 90
    const/4 v8, 0x0

    .line 91
    if-eqz v7, :cond_2

    .line 92
    .line 93
    check-cast v5, Lio/fastkv/Container$StringContainer;

    .line 94
    .line 95
    iget-boolean v7, v5, Lio/fastkv/Container$VarContainer;->external:Z

    .line 96
    .line 97
    if-eqz v7, :cond_1

    .line 98
    .line 99
    iget-object v7, v5, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v7, Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v5, v8}, Lio/fastkv/AbsFastKV;->getStringFromFile(Lio/fastkv/Container$StringContainer;Lio/fastkv/interfaces/FastCipher;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    if-eqz v5, :cond_0

    .line 111
    .line 112
    invoke-virtual {v1, v6, v5}, Lio/fastkv/FastKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_1
    iget-object v5, v5, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v5, Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v1, v6, v5}, Lio/fastkv/FastKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_2
    instance-of v7, v5, Lio/fastkv/Container$BooleanContainer;

    .line 125
    .line 126
    if-eqz v7, :cond_3

    .line 127
    .line 128
    check-cast v5, Lio/fastkv/Container$BooleanContainer;

    .line 129
    .line 130
    iget-boolean v5, v5, Lio/fastkv/Container$BooleanContainer;->value:Z

    .line 131
    .line 132
    invoke-virtual {v1, v6, v5}, Lio/fastkv/FastKV;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_3
    instance-of v7, v5, Lio/fastkv/Container$IntContainer;

    .line 137
    .line 138
    if-eqz v7, :cond_4

    .line 139
    .line 140
    check-cast v5, Lio/fastkv/Container$IntContainer;

    .line 141
    .line 142
    iget v5, v5, Lio/fastkv/Container$IntContainer;->value:I

    .line 143
    .line 144
    invoke-virtual {v1, v6, v5}, Lio/fastkv/FastKV;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 145
    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_4
    instance-of v7, v5, Lio/fastkv/Container$LongContainer;

    .line 149
    .line 150
    if-eqz v7, :cond_5

    .line 151
    .line 152
    check-cast v5, Lio/fastkv/Container$LongContainer;

    .line 153
    .line 154
    iget-wide v7, v5, Lio/fastkv/Container$LongContainer;->value:J

    .line 155
    .line 156
    invoke-virtual {v1, v6, v7, v8}, Lio/fastkv/FastKV;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_5
    instance-of v7, v5, Lio/fastkv/Container$FloatContainer;

    .line 161
    .line 162
    if-eqz v7, :cond_6

    .line 163
    .line 164
    check-cast v5, Lio/fastkv/Container$FloatContainer;

    .line 165
    .line 166
    iget v5, v5, Lio/fastkv/Container$FloatContainer;->value:F

    .line 167
    .line 168
    invoke-virtual {v1, v6, v5}, Lio/fastkv/FastKV;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 169
    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_6
    instance-of v7, v5, Lio/fastkv/Container$DoubleContainer;

    .line 173
    .line 174
    if-eqz v7, :cond_7

    .line 175
    .line 176
    check-cast v5, Lio/fastkv/Container$DoubleContainer;

    .line 177
    .line 178
    iget-wide v7, v5, Lio/fastkv/Container$DoubleContainer;->value:D

    .line 179
    .line 180
    invoke-virtual {v1, v6, v7, v8}, Lio/fastkv/FastKV;->putDouble(Ljava/lang/String;D)Landroid/content/SharedPreferences$Editor;

    .line 181
    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_7
    instance-of v7, v5, Lio/fastkv/Container$ArrayContainer;

    .line 185
    .line 186
    if-eqz v7, :cond_9

    .line 187
    .line 188
    check-cast v5, Lio/fastkv/Container$ArrayContainer;

    .line 189
    .line 190
    iget-boolean v7, v5, Lio/fastkv/Container$VarContainer;->external:Z

    .line 191
    .line 192
    if-eqz v7, :cond_8

    .line 193
    .line 194
    iget-object v7, v5, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v7, Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0, v5, v8}, Lio/fastkv/AbsFastKV;->getArrayFromFile(Lio/fastkv/Container$ArrayContainer;Lio/fastkv/interfaces/FastCipher;)[B

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    if-eqz v5, :cond_0

    .line 206
    .line 207
    invoke-virtual {v1, v6, v5}, Lio/fastkv/FastKV;->putArray(Ljava/lang/String;[B)Landroid/content/SharedPreferences$Editor;

    .line 208
    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :cond_8
    iget-object v5, v5, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v5, [B

    .line 215
    .line 216
    invoke-virtual {v1, v6, v5}, Lio/fastkv/FastKV;->putArray(Ljava/lang/String;[B)Landroid/content/SharedPreferences$Editor;

    .line 217
    .line 218
    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :cond_9
    instance-of v7, v5, Lio/fastkv/Container$ObjectContainer;

    .line 222
    .line 223
    if-eqz v7, :cond_0

    .line 224
    .line 225
    check-cast v5, Lio/fastkv/Container$ObjectContainer;

    .line 226
    .line 227
    iget-boolean v7, v5, Lio/fastkv/Container$VarContainer;->external:Z

    .line 228
    .line 229
    if-eqz v7, :cond_a

    .line 230
    .line 231
    iget-object v7, v5, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v7, Ljava/lang/String;

    .line 234
    .line 235
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0, v5, v8}, Lio/fastkv/AbsFastKV;->getObjectFromFile(Lio/fastkv/Container$ObjectContainer;Lio/fastkv/interfaces/FastCipher;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    if-eqz v7, :cond_0

    .line 243
    .line 244
    iget-object v5, v5, Lio/fastkv/Container$ObjectContainer;->encoder:Lio/fastkv/interfaces/FastEncoder;

    .line 245
    .line 246
    if-eqz v5, :cond_0

    .line 247
    .line 248
    invoke-virtual {v1, v6, v7, v5}, Lio/fastkv/FastKV;->putObject(Ljava/lang/String;Ljava/lang/Object;Lio/fastkv/interfaces/FastEncoder;)Landroid/content/SharedPreferences$Editor;

    .line 249
    .line 250
    .line 251
    goto/16 :goto_0

    .line 252
    .line 253
    :cond_a
    iget-object v7, v5, Lio/fastkv/Container$ObjectContainer;->encoder:Lio/fastkv/interfaces/FastEncoder;

    .line 254
    .line 255
    if-eqz v7, :cond_0

    .line 256
    .line 257
    iget-object v5, v5, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 258
    .line 259
    invoke-virtual {v1, v6, v5, v7}, Lio/fastkv/FastKV;->putObject(Ljava/lang/String;Ljava/lang/Object;Lio/fastkv/interfaces/FastEncoder;)Landroid/content/SharedPreferences$Editor;

    .line 260
    .line 261
    .line 262
    goto/16 :goto_0

    .line 263
    .line 264
    :cond_b
    const-string v4, ""

    .line 265
    .line 266
    invoke-virtual {v1, v4}, Lio/fastkv/FastKV;->contains(Ljava/lang/String;)Z

    .line 267
    .line 268
    .line 269
    iget-object v4, v1, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 270
    .line 271
    iput-object v4, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 272
    .line 273
    iget-wide v4, v1, Lio/fastkv/AbsFastKV;->checksum:J

    .line 274
    .line 275
    iput-wide v4, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 276
    .line 277
    iget v4, v1, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 278
    .line 279
    iput v4, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 280
    .line 281
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->clearInvalid()V

    .line 282
    .line 283
    .line 284
    iget-object v4, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 285
    .line 286
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 287
    .line 288
    .line 289
    iget-object v4, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 290
    .line 291
    iget-object v5, v1, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 292
    .line 293
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {p0, v1}, Lio/fastkv/AbsFastKV;->copyToMainFile(Lio/fastkv/FastKV;)V

    .line 297
    .line 298
    .line 299
    :catch_0
    :goto_1
    iget-object v4, v1, Lio/fastkv/AbsFastKV;->externalExecutor:Lio/fastkv/TagExecutor;

    .line 300
    .line 301
    invoke-virtual {v4}, Lio/fastkv/TagExecutor;->isEmpty()Z

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    if-nez v4, :cond_c

    .line 306
    .line 307
    const-wide/16 v4, 0xa

    .line 308
    .line 309
    :try_start_0
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 310
    .line 311
    .line 312
    goto :goto_1

    .line 313
    :cond_c
    new-instance v1, Ljava/io/File;

    .line 314
    .line 315
    iget-object v4, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 316
    .line 317
    invoke-direct {v1, v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    new-instance v3, Ljava/lang/StringBuilder;

    .line 321
    .line 322
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 323
    .line 324
    .line 325
    iget-object v4, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 326
    .line 327
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    iget-object v4, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 331
    .line 332
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    invoke-static {v1, v3}, Lio/fastkv/Utils;->moveDirFiles(Ljava/io/File;Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    invoke-static {v1}, Lio/fastkv/Utils;->deleteFile(Ljava/io/File;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 346
    .line 347
    .line 348
    move-result v1

    .line 349
    move v4, v0

    .line 350
    :goto_2
    if-ge v4, v1, :cond_d

    .line 351
    .line 352
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    add-int/lit8 v4, v4, 0x1

    .line 357
    .line 358
    check-cast v5, Ljava/lang/String;

    .line 359
    .line 360
    new-instance v6, Ljava/io/File;

    .line 361
    .line 362
    invoke-direct {v6, v3, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    invoke-static {v6}, Lio/fastkv/Utils;->deleteFile(Ljava/io/File;)V

    .line 366
    .line 367
    .line 368
    goto :goto_2

    .line 369
    :cond_d
    iput-boolean v0, p0, Lio/fastkv/AbsFastKV;->needRewrite:Z

    .line 370
    .line 371
    return-void
.end method

.method public final shiftCheckSum(JI)J
    .locals 2

    .line 1
    and-int/lit8 p3, p3, 0x7

    .line 2
    .line 3
    shl-int/lit8 p3, p3, 0x3

    .line 4
    .line 5
    shl-long v0, p1, p3

    .line 6
    .line 7
    rsub-int/lit8 p3, p3, 0x40

    .line 8
    .line 9
    ushr-long/2addr p1, p3

    .line 10
    or-long/2addr p1, v0

    .line 11
    return-wide p1
.end method

.method public abstract syncCompatBuffer(III)V
.end method

.method public final tryBlockingIO(Ljava/io/File;Ljava/io/File;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->loadWithBlockingIO(Ljava/io/File;)Z

    .line 2
    .line 3
    .line 4
    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :catch_0
    move-exception p1

    .line 9
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->warning(Ljava/lang/Exception;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->resetMemory()V

    .line 13
    .line 14
    .line 15
    :try_start_1
    invoke-virtual {p0, p2}, Lio/fastkv/AbsFastKV;->loadWithBlockingIO(Ljava/io/File;)Z

    .line 16
    .line 17
    .line 18
    move-result p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :catch_1
    move-exception p1

    .line 23
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->warning(Ljava/lang/Exception;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->resetMemory()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public declared-synchronized unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->listeners:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw p1
.end method

.method public abstract updateBoolean(BI)V
.end method

.method public updateBytes(I[B)V
    .locals 5

    .line 1
    array-length v0, p2

    .line 2
    iget-wide v1, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 3
    .line 4
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 5
    .line 6
    invoke-virtual {v3, p1, v0}, Lio/fastkv/FastBuffer;->getChecksum(II)J

    .line 7
    .line 8
    .line 9
    move-result-wide v3

    .line 10
    xor-long/2addr v1, v3

    .line 11
    iput-wide v1, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 12
    .line 13
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 14
    .line 15
    iput p1, v1, Lio/fastkv/FastBuffer;->position:I

    .line 16
    .line 17
    invoke-virtual {v1, p2}, Lio/fastkv/FastBuffer;->putBytes([B)V

    .line 18
    .line 19
    .line 20
    iget-wide v1, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 21
    .line 22
    iget-object p2, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 23
    .line 24
    invoke-virtual {p2, p1, v0}, Lio/fastkv/FastBuffer;->getChecksum(II)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    xor-long/2addr p1, v1

    .line 29
    iput-wide p1, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 30
    .line 31
    return-void
.end method

.method public abstract updateChange()V
.end method

.method public abstract updateInt32(IJI)V
.end method

.method public abstract updateInt64(JJI)V
.end method

.method public final updateOffset(I[I[I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lio/fastkv/Container$BaseContainer;

    .line 22
    .line 23
    iget v2, v1, Lio/fastkv/Container$BaseContainer;->offset:I

    .line 24
    .line 25
    if-le v2, p1, :cond_0

    .line 26
    .line 27
    invoke-static {p2, v2}, Lio/fastkv/Utils;->binarySearch([II)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    aget v2, p3, v2

    .line 32
    .line 33
    iget v3, v1, Lio/fastkv/Container$BaseContainer;->offset:I

    .line 34
    .line 35
    sub-int/2addr v3, v2

    .line 36
    iput v3, v1, Lio/fastkv/Container$BaseContainer;->offset:I

    .line 37
    .line 38
    invoke-virtual {v1}, Lio/fastkv/Container$BaseContainer;->getType()B

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const/4 v4, 0x6

    .line 43
    if-lt v3, v4, :cond_0

    .line 44
    .line 45
    check-cast v1, Lio/fastkv/Container$VarContainer;

    .line 46
    .line 47
    iget v3, v1, Lio/fastkv/Container$VarContainer;->start:I

    .line 48
    .line 49
    sub-int/2addr v3, v2

    .line 50
    iput v3, v1, Lio/fastkv/Container$VarContainer;->start:I

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    return-void
.end method

.method public final warning(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->logger:Lio/fastkv/interfaces/FastLogger;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 6
    .line 7
    invoke-interface {v0, v1, p1}, Lio/fastkv/interfaces/FastLogger;->w(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
