.class public LYue/ۥۣۢۦ۠;
.super Ljava/lang/Object;


# static fields
.field public static final ۥ:Ljava/lang/String;

.field public static final ۥ۟:I = 0x98

.field public static final ۥ۟۟:Z

.field public static ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x4c

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥۣۢۦ۠;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥۣۢۦ۠;->ۥ:Ljava/lang/String;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    sput-object v0, LYue/ۥۣۢۦ۠;->ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method
