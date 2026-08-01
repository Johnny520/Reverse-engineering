.class public final Llc1;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# instance fields
.field public final synthetic d:Lr;

.field public final synthetic e:Lr5;

.field public final synthetic f:Lxc;


# direct methods
.method public constructor <init>(Lr;Lr5;Lxc;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llc1;->d:Lr;

    .line 2
    .line 3
    iput-object p2, p0, Llc1;->e:Lr5;

    .line 4
    .line 5
    iput-object p3, p0, Llc1;->f:Lxc;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Llc1;->e:Lr5;

    .line 2
    .line 3
    iget-object v1, p0, Llc1;->d:Lr;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Lj50;->o(Landroid/view/View;)Lur0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, Lur0;->a:Ljava/util/ArrayList;

    .line 13
    .line 14
    iget-object p0, p0, Llc1;->f:Lxc;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    sget-object p0, Lna1;->a:Lna1;

    .line 20
    .line 21
    return-object p0
.end method
