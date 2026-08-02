.class public final synthetic Lur0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lca0;


# instance fields
.field public final synthetic h:Lvr0;

.field public final synthetic i:Lq23;


# direct methods
.method public synthetic constructor <init>(Lvr0;Lq23;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lur0;->h:Lvr0;

    .line 5
    .line 6
    iput-object p2, p0, Lur0;->i:Lq23;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lur0;->i:Lq23;

    .line 2
    .line 3
    iget-object p0, p0, Lur0;->h:Lvr0;

    .line 4
    .line 5
    iget-object p0, p0, Lvr0;->j:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
