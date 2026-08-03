.class public LYue/ۥۡۤۢۧ$ۥ۟;
.super Ljava/util/TimerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۤۢۧ;->ۥ۟۟۠ۢ(Ljava/lang/String;Landroid/view/View;Lcom/kongzue/dialogx/dialogs/BottomDialog;Landroid/media/MediaPlayer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Lcom/kongzue/dialogx/dialogs/BottomDialog;

.field public final synthetic ۥ۟۟۠ۤ:Landroid/media/MediaPlayer;

.field public final synthetic ۥ۟۟۠ۥ:Ljava/util/Timer;

.field public final synthetic ۥ۟۟۠ۦ:Landroid/widget/TextView;

.field public final synthetic ۥ۟۟۠ۧ:Landroid/widget/SeekBar;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3e8

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Lcom/kongzue/dialogx/dialogs/BottomDialog;Landroid/media/MediaPlayer;Ljava/util/Timer;Landroid/widget/TextView;Landroid/widget/SeekBar;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۤۢۧ$ۥ۟;->ۥۣ۟۟۠:Lcom/kongzue/dialogx/dialogs/BottomDialog;

    iput-object p2, p0, LYue/ۥۡۤۢۧ$ۥ۟;->ۥ۟۟۠ۤ:Landroid/media/MediaPlayer;

    iput-object p3, p0, LYue/ۥۡۤۢۧ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/util/Timer;

    iput-object p4, p0, LYue/ۥۡۤۢۧ$ۥ۟;->ۥ۟۟۠ۦ:Landroid/widget/TextView;

    iput-object p5, p0, LYue/ۥۡۤۢۧ$ۥ۟;->ۥ۟۟۠ۧ:Landroid/widget/SeekBar;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method public static native synthetic ۥ(Landroid/widget/TextView;ILandroid/widget/SeekBar;)V
.end method

.method public static native synthetic ۥ۟(Landroid/widget/TextView;ILandroid/widget/SeekBar;)V
.end method


# virtual methods
.method public native run()V
.end method
