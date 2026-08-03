.class public LYue/ۥۡۤۢۧ$ۥ۟۟;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۤۢۧ;->ۥ۟۟۠ۢ(Ljava/lang/String;Landroid/view/View;Lcom/kongzue/dialogx/dialogs/BottomDialog;Landroid/media/MediaPlayer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:Landroid/media/MediaPlayer;

.field public final synthetic ۥ۟:Landroid/widget/TextView;

.field public final synthetic ۥ۟۟:Landroid/widget/ImageView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3e5

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Landroid/media/MediaPlayer;Landroid/widget/TextView;Landroid/widget/ImageView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۤۢۧ$ۥ۟۟;->ۥ:Landroid/media/MediaPlayer;

    iput-object p2, p0, LYue/ۥۡۤۢۧ$ۥ۟۟;->ۥ۟:Landroid/widget/TextView;

    iput-object p3, p0, LYue/ۥۡۤۢۧ$ۥ۟۟;->ۥ۟۟:Landroid/widget/ImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native onProgressChanged(Landroid/widget/SeekBar;IZ)V
.end method

.method public native onStartTrackingTouch(Landroid/widget/SeekBar;)V
.end method

.method public native onStopTrackingTouch(Landroid/widget/SeekBar;)V
.end method
