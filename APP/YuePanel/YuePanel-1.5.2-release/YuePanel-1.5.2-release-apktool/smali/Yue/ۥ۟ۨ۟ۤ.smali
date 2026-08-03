.class public LYue/ۥ۟ۨ۟ۤ;
.super Ljava/lang/Object;


# static fields
.field public static final ۥ۟۟۟۠:Ljava/lang/String;

.field public static final ۥ۟۟۟ۡ:Ljava/lang/String;

.field public static final ۥ۟۟۟ۢ:Ljava/lang/String;

.field public static final ۥۣ۟۟۟:I = 0xc8

.field public static volatile synthetic ۥ۟۟۟ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۡ:Ljava/lang/String;


# instance fields
.field public final ۥ:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟:Lcom/google/gson/Gson;

.field public final ۥ۟۟:Landroid/database/sqlite/SQLiteDatabase;

.field public final ۥ۟۟۟:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۟۟:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x261

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥ۟ۨ۟ۤ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۨ۟ۤ;->ۥ۟۟۟۠:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, LYue/ۥ۟ۨ۟ۤ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۨ۟ۤ;->ۥ۟۟۟ۡ:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, LYue/ۥ۟ۨ۟ۤ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۨ۟ۤ;->ۥ۟۟۟ۢ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۨ۟ۤ;->ۥ۟:Lcom/google/gson/Gson;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۨ۟ۤ;->ۥ۟۟۟:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, LYue/ۥ۟ۨ۟ۤ;->ۥ۟۟۟۟:Ljava/util/concurrent/ExecutorService;

    new-instance v0, LYue/ۥ۟ۨ۟ۤ$ۥ;

    const v1, 0x186a0

    invoke-direct {v0, p0, v1}, LYue/ۥ۟ۨ۟ۤ$ۥ;-><init>(LYue/ۥ۟ۨ۟ۤ;I)V

    iput-object v0, p0, LYue/ۥ۟ۨ۟ۤ;->ۥ:Landroid/util/LruCache;

    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۤ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x3

    invoke-static {v2}, LYue/ۥ۟ۨ۟ۤ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_0
    new-instance v1, Ljava/io/File;

    const/4 v2, 0x4

    invoke-static {v2}, LYue/ۥ۟ۨ۟ۤ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->openOrCreateDatabase(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, LYue/ۥ۟ۨ۟ۤ;->ۥ۟۟:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->enableWriteAheadLogging()Z

    const/4 v1, 0x5

    invoke-static {v1}, LYue/ۥ۟ۨ۟ۤ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥ۟ۨ۟ۤ;->ۥ۟۟()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ(LYue/ۥ۟ۨ۟ۤ;Ljava/lang/String;)V
.end method


# virtual methods
.method public native ۥ۟()V
.end method

.method public final native ۥ۟۟()V
.end method

.method public native declared-synchronized ۥ۟۟۟()V
.end method

.method public final native ۥ۟۟۟۟()V
.end method

.method public native ۥ۟۟۟۠(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation
.end method

.method public final native synthetic ۥ۟۟۟ۡ(Ljava/lang/String;)V
.end method

.method public native ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation
.end method

.method public native ۥۣ۟۟۟(Ljava/lang/String;)V
.end method
