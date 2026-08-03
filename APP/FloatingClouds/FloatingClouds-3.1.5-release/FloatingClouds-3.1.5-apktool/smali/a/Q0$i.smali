.class public final La/Q0$i;
.super La/Q0$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/Q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "i"
.end annotation


# instance fields
.field public final c:Landroid/os/PowerManager;

.field public final synthetic d:La/Q0;


# direct methods
.method public constructor <init>(La/Q0;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, La/Q0$i;->d:La/Q0;

    invoke-direct {p0, p1}, La/Q0$j;-><init>(La/Q0;)V

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "power"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/PowerManager;

    iput-object p1, p0, La/Q0$i;->c:Landroid/os/PowerManager;

    return-void
.end method


# virtual methods
.method public final b()Landroid/content/IntentFilter;
    .locals 2

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.os.action.POWER_SAVE_MODE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, La/Q0$i;->c:Landroid/os/PowerManager;

    invoke-static {v0}, La/Q0$e;->a(Landroid/os/PowerManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final d()V
    .locals 2

    const/4 v0, 0x1

    iget-object v1, p0, La/Q0$i;->d:La/Q0;

    invoke-virtual {v1, v0, v0}, La/Q0;->D(ZZ)Z

    return-void
.end method
