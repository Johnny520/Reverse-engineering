.class public final synthetic LYue/ۥۡۤۢۥ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field public final synthetic ۥ:Landroid/widget/SeekBar;

.field public final synthetic ۥ۟:Landroid/widget/TextView;

.field public final synthetic ۥ۟۟:Landroid/widget/ImageView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2ed

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/widget/SeekBar;Landroid/widget/TextView;Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۤۢۥ;->ۥ:Landroid/widget/SeekBar;

    iput-object p2, p0, LYue/ۥۡۤۢۥ;->ۥ۟:Landroid/widget/TextView;

    iput-object p3, p0, LYue/ۥۡۤۢۥ;->ۥ۟۟:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final native onCompletion(Landroid/media/MediaPlayer;)V
.end method
