.class public LYue/ۥۣ۟۠۟$ۥ۟;
.super Ljava/util/TimerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟۠۟;->ۥ۟۟۠ۤ(Lcom/kongzue/dialogx/dialogs/BottomDialog;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroid/content/Context;

.field public final synthetic ۥ۟۟۠ۤ:Lcom/kongzue/dialogx/dialogs/BottomDialog;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2d1

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/kongzue/dialogx/dialogs/BottomDialog;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣ۟۠۟$ۥ۟;->ۥۣ۟۟۠:Landroid/content/Context;

    iput-object p2, p0, LYue/ۥۣ۟۠۟$ۥ۟;->ۥ۟۟۠ۤ:Lcom/kongzue/dialogx/dialogs/BottomDialog;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method


# virtual methods
.method public native run()V
.end method
