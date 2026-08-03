.class public final synthetic LYue/ۥۡۤۢۨ;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroid/widget/TextView;

.field public final synthetic ۥ۟۟۠ۤ:I

.field public final synthetic ۥ۟۟۠ۥ:Landroid/widget/SeekBar;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2f1

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/widget/TextView;ILandroid/widget/SeekBar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۤۢۨ;->ۥۣ۟۟۠:Landroid/widget/TextView;

    iput p2, p0, LYue/ۥۡۤۢۨ;->ۥ۟۟۠ۤ:I

    iput-object p3, p0, LYue/ۥۡۤۢۨ;->ۥ۟۟۠ۥ:Landroid/widget/SeekBar;

    return-void
.end method


# virtual methods
.method public final native run()V
.end method
