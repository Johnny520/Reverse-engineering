.class public final Lyyds/ᛶᲀᛵᲇ;
.super Lyyds/ᛱᛶᛶᲇ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛱᲈᲁ:Ljava/util/Set;

.field public static final ᛲᛳᛶᲁ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ᛶᛷᛲᲁ:Ljava/util/Set;

.field public static final ᛷᛲᲈᛱ:Lyyds/ᛱᛲᛶᛱ;

.field public static final ᛷᛵᲇᲀ:Lyyds/ᛱᛲᛶᛱ;

.field public static final ᛷᲈᲈᲁ:Lyyds/ᛱᛲᛶᛱ;

.field public static final ᲇᲇᲇᛱ:Lyyds/ᛶᲀᛵᲇ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛶᲀᛵᲇ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᛱᛶᛶᲇ;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛶᲀᛵᲇ;->ᲇᲇᲇᛱ:Lyyds/ᛶᲀᛵᲇ;

    .line 7
    .line 8
    new-instance v0, Ljava/util/WeakHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lyyds/ᛶᲀᛵᲇ;->ᛶᛷᛲᲁ:Ljava/util/Set;

    .line 22
    .line 23
    new-instance v0, Ljava/util/WeakHashMap;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, Lyyds/ᛶᲀᛵᲇ;->ᛱᲈᲁ:Ljava/util/Set;

    .line 37
    .line 38
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lyyds/ᛶᲀᛵᲇ;->ᛲᛳᛶᲁ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 45
    .line 46
    new-instance v0, Lyyds/ᛴᛳᲇᲇ;

    .line 47
    .line 48
    const/4 v1, 0x7

    .line 49
    invoke-direct {v0, v1}, Lyyds/ᛴᛳᲇᲇ;-><init>(I)V

    .line 50
    .line 51
    .line 52
    new-instance v1, Lyyds/ᛱᛲᛶᛱ;

    .line 53
    .line 54
    invoke-direct {v1, v0}, Lyyds/ᛱᛲᛶᛱ;-><init>(Lyyds/ᲁᛶᲁᲀ;)V

    .line 55
    .line 56
    .line 57
    sput-object v1, Lyyds/ᛶᲀᛵᲇ;->ᛷᲈᲈᲁ:Lyyds/ᛱᛲᛶᛱ;

    .line 58
    .line 59
    new-instance v0, Lyyds/ᛴᛳᲇᲇ;

    .line 60
    .line 61
    const/16 v1, 0x8

    .line 62
    .line 63
    invoke-direct {v0, v1}, Lyyds/ᛴᛳᲇᲇ;-><init>(I)V

    .line 64
    .line 65
    .line 66
    new-instance v1, Lyyds/ᛱᛲᛶᛱ;

    .line 67
    .line 68
    invoke-direct {v1, v0}, Lyyds/ᛱᛲᛶᛱ;-><init>(Lyyds/ᲁᛶᲁᲀ;)V

    .line 69
    .line 70
    .line 71
    sput-object v1, Lyyds/ᛶᲀᛵᲇ;->ᛷᛲᲈᛱ:Lyyds/ᛱᛲᛶᛱ;

    .line 72
    .line 73
    new-instance v0, Lyyds/ᛴᛳᲇᲇ;

    .line 74
    .line 75
    const/16 v1, 0x9

    .line 76
    .line 77
    invoke-direct {v0, v1}, Lyyds/ᛴᛳᲇᲇ;-><init>(I)V

    .line 78
    .line 79
    .line 80
    new-instance v1, Lyyds/ᛱᛲᛶᛱ;

    .line 81
    .line 82
    invoke-direct {v1, v0}, Lyyds/ᛱᛲᛶᛱ;-><init>(Lyyds/ᲁᛶᲁᲀ;)V

    .line 83
    .line 84
    .line 85
    sput-object v1, Lyyds/ᛶᲀᛵᲇ;->ᛷᛵᲇᲀ:Lyyds/ᛱᛲᛶᛱ;

    .line 86
    .line 87
    return-void
.end method

.method public static native ᛱᛳᛶᛳ(Ljava/util/List;Lyyds/ᛳᲈᲁᲀ;Lyyds/ᛳᲈᲁᲀ;Ljava/lang/ClassLoader;Ljava/lang/String;)V
.end method


# virtual methods
.method public final native ᲇᲇᲇᛱ()V
.end method
