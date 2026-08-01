.class public final synthetic Ljs0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:Lns0;

.field public final synthetic ζ:Landroid/view/View;

.field public final synthetic η:Landroid/view/View;

.field public final synthetic θ:Z

.field public final synthetic ι:F

.field public final synthetic κ:Lwa;


# direct methods
.method public synthetic constructor <init>(Lns0;Landroid/view/View;Landroid/view/View;ZFLwa;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljs0;->ε:Lns0;

    .line 5
    .line 6
    iput-object p2, p0, Ljs0;->ζ:Landroid/view/View;

    .line 7
    .line 8
    iput-object p3, p0, Ljs0;->η:Landroid/view/View;

    .line 9
    .line 10
    iput-boolean p4, p0, Ljs0;->θ:Z

    .line 11
    .line 12
    iput p5, p0, Ljs0;->ι:F

    .line 13
    .line 14
    iput-object p6, p0, Ljs0;->κ:Lwa;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v4, p0, Ljs0;->ι:F

    .line 2
    .line 3
    iget-object v5, p0, Ljs0;->κ:Lwa;

    .line 4
    .line 5
    iget-object v0, p0, Ljs0;->ε:Lns0;

    .line 6
    .line 7
    iget-object v1, p0, Ljs0;->ζ:Landroid/view/View;

    .line 8
    .line 9
    iget-object v2, p0, Ljs0;->η:Landroid/view/View;

    .line 10
    .line 11
    iget-boolean v3, p0, Ljs0;->θ:Z

    .line 12
    .line 13
    invoke-virtual/range {v0 .. v5}, Lns0;->α(Landroid/view/View;Landroid/view/View;ZFLwa;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
