.class public LYue/ۥ۟ۦۨۦ;
.super Ljava/lang/Object;


# static fields
.field public static ۥ:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e1\u06e8\u06e0;",
            ">;"
        }
    .end annotation
.end field

.field public static final ۥ۟:Ljava/lang/String;

.field public static final ۥ۟۟:Ljava/lang/String;

.field public static final ۥ۟۟۟:Ljava/lang/String;

.field public static final ۥ۟۟۟۟:Ljava/lang/String;

.field public static final ۥ۟۟۟۠:I = 0x3c

.field public static final ۥ۟۟۟ۡ:I = 0x1f4

.field public static ۥ۟۟۟ۢ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static volatile synthetic ۥۣ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۦ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x42b

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥ۟ۦۨۦ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۦۨۦ;->ۥ۟:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, LYue/ۥ۟ۦۨۦ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۦۨۦ;->ۥ۟۟:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, LYue/ۥ۟ۦۨۦ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۦۨۦ;->ۥ۟۟۟:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, LYue/ۥ۟ۦۨۦ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۦۨۦ;->ۥ۟۟۟۟:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, LYue/ۥ۟ۦۨۦ;->ۥ:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    sput-object v0, LYue/ۥ۟ۦۨۦ;->ۥ۟۟۟ۢ:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method
