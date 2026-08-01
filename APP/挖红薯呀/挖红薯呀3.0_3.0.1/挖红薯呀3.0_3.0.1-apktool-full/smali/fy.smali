.class public final synthetic Lfy;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lpo;


# instance fields
.field public final synthetic d:Lhy;

.field public final synthetic e:Lk81;


# direct methods
.method public synthetic constructor <init>(Lhy;Lk81;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfy;->d:Lhy;

    .line 5
    .line 6
    iput-object p2, p0, Lfy;->e:Lk81;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lfy;->e:Lk81;

    .line 2
    .line 3
    iget-object p0, p0, Lfy;->d:Lhy;

    .line 4
    .line 5
    iget-object p0, p0, Lhy;->f:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
