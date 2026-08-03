.class public LYue/ۥ۟ۥۣۢ$ۥ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۥۣۢ;->ۥ۟۟۠ۡ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥ۟ۥۣۢ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1ad

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(LYue/ۥ۟ۥۣۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۥۣۢ$ۥ;->ۥ:LYue/ۥ۟ۥۣۢ;

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
