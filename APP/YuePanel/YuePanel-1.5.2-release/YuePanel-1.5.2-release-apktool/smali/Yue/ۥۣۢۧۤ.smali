.class public LYue/ۥۣۢۧۤ;
.super LYue/ۥ۠ۥ۟;


# static fields
.field public static final ۥ۟۟۟ۢ:J = 0x1f4L

.field public static final ۥۣ۟۟۟:I = 0x12c

.field public static final ۥ۟۟۟ۤ:I = 0x1e

.field public static volatile synthetic ۥ۟۟۟ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۨ:Ljava/lang/String;


# instance fields
.field public ۥ:F

.field public ۥ۟:F

.field public ۥ۟۟:J

.field public ۥ۟۟۟:I

.field public ۥ۟۟۟۟:J

.field public ۥ۟۟۟۠:Z

.field public ۥ۟۟۟ۡ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x91

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, LYue/ۥ۠ۥ۟;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥۣۢۧۤ;->ۥ۟۟۟:I

    const-wide/16 v1, 0x0

    iput-wide v1, p0, LYue/ۥۣۢۧۤ;->ۥ۟۟۟۟:J

    iput-boolean v0, p0, LYue/ۥۣۢۧۤ;->ۥ۟۟۟۠:Z

    iput-boolean v0, p0, LYue/ۥۣۢۧۤ;->ۥ۟۟۟ۡ:Z

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method


# virtual methods
.method public native info()Lcom/yuexin/panel/myClass/itemInfo;
.end method

.method public native load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end method
