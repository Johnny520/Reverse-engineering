.class public Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۠;
.super Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۡ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/ۥ۟۟۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06e0\u06e0"
.end annotation


# instance fields
.field public final ۥ۟۟:Landroid/os/PowerManager;

.field public final synthetic ۥ۟۟۟:Landroidx/appcompat/app/ۥ۟۟۟۟;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/ۥ۟۟۟۟;Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroidx/appcompat/app/ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010,
            0x0
        }
        names = {
            null,
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۠;->ۥ۟۟۟:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-direct {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۡ;-><init>(Landroidx/appcompat/app/ۥ۟۟۟۟;)V

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "power"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/PowerManager;

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۠;->ۥ۟۟:Landroid/os/PowerManager;

    return-void
.end method


# virtual methods
.method public ۥ۟()Landroid/content/IntentFilter;
    .locals 2

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.os.action.POWER_SAVE_MODE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-object v0
.end method

.method public ۥ۟۟()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۠;->ۥ۟۟:Landroid/os/PowerManager;

    invoke-static {v0}, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۦ;->ۥ(Landroid/os/PowerManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟۟()V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۠;->ۥ۟۟۟:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟۟۠()Z

    return-void
.end method
