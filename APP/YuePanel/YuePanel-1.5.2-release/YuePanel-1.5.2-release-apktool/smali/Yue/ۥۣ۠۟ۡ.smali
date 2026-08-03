.class public final LYue/ۥۣ۠۟ۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ۟:Ljava/lang/String; = "android.hardware.display.category.PRESENTATION"


# instance fields
.field public final ۥ:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۠۟ۡ;->ۥ:Landroid/content/Context;

    return-void
.end method

.method public static ۥ۟۟۟(Landroid/content/Context;)LYue/ۥۣ۠۟ۡ;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥۣ۠۟ۡ;

    invoke-direct {v0, p0}, LYue/ۥۣ۠۟ۡ;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public ۥ(I)Landroid/view/Display;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠۟ۡ;->ۥ:Landroid/content/Context;

    const-string v1, "display"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/display/DisplayManager;

    invoke-virtual {v0, p1}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟()[Landroid/view/Display;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠۟ۡ;->ۥ:Landroid/content/Context;

    const-string v1, "display"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/display/DisplayManager;

    invoke-virtual {v0}, Landroid/hardware/display/DisplayManager;->getDisplays()[Landroid/view/Display;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟(Ljava/lang/String;)[Landroid/view/Display;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object p1, p0, LYue/ۥۣ۠۟ۡ;->ۥ:Landroid/content/Context;

    const-string v0, "display"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/display/DisplayManager;

    invoke-virtual {p1}, Landroid/hardware/display/DisplayManager;->getDisplays()[Landroid/view/Display;

    move-result-object p1

    return-object p1
.end method
