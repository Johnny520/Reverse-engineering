.class public abstract LYue/ۥ۟ۢۥۤ;
.super Landroid/app/Dialog;


# static fields
.field public static final ۥۣ۟۟۠:F = 0.7f

.field public static final ۥ۟۟۠ۤ:I = -0x2


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x335

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0}, LYue/ۥ۟ۢۥۤ;->ۥ۟()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 4
    invoke-virtual {p0}, LYue/ۥ۟ۢۥۤ;->ۥ۟()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/content/DialogInterface$OnCancelListener;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 6
    invoke-virtual {p0}, LYue/ۥ۟ۢۥۤ;->ۥ۟()V

    return-void
.end method


# virtual methods
.method public abstract ۥ()Landroid/view/View;
.end method

.method public final native ۥ۟()V
.end method

.method public native ۥ۟۟(Ljava/lang/Integer;Ljava/lang/Integer;)V
.end method
