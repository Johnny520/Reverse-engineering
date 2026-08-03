.class public LYue/ۥۣ۠ۨۨ;
.super Ljava/lang/Object;


# static fields
.field public static final ۥ۟۟:Ljava/lang/String;

.field public static final ۥ۟۟۟:Lcom/google/gson/Gson;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;


# instance fields
.field public ۥ:Lcom/yuexin/panel/utils/entity/GridGestureConfig;

.field public ۥ۟:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3a9

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥۣ۠ۨۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥۣ۠ۨۨ;->ۥ۟۟:Ljava/lang/String;

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    sput-object v0, LYue/ۥۣ۠ۨۨ;->ۥ۟۟۟:Lcom/google/gson/Gson;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, LYue/ۥۣ۠ۨۨ;->ۥ۟۟۟()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ(LYue/ۥۣ۠ۨۨ;Lcom/yuexin/panel/utils/entity/GridGestureConfig;)V
.end method


# virtual methods
.method public native ۥ۟()Lcom/yuexin/panel/utils/entity/GridGestureConfig;
.end method

.method public final native synthetic ۥ۟۟(Lcom/yuexin/panel/utils/entity/GridGestureConfig;)V
.end method

.method public final native ۥ۟۟۟()V
.end method

.method public final native ۥ۟۟۟۟(Lcom/yuexin/panel/utils/entity/GridGestureConfig;)V
.end method

.method public native ۥ۟۟۟۠(Landroid/content/Context;)V
.end method
