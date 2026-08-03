.class public final synthetic LYue/ۥۡۤۢۦ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroid/media/MediaPlayer;

.field public final synthetic ۥ۟۟۠ۤ:Landroid/widget/ImageView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2ef

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/media/MediaPlayer;Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۤۢۦ;->ۥۣ۟۟۠:Landroid/media/MediaPlayer;

    iput-object p2, p0, LYue/ۥۡۤۢۦ;->ۥ۟۟۠ۤ:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final native onClick(Landroid/view/View;)V
.end method
