.class public final Lnb/q;
.super Landroid/media/VolumeProvider;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:Lnb/w;


# direct methods
.method public constructor <init>(IILnb/w;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lnb/q;->a:Lnb/w;

    .line 2
    .line 3
    const/4 p3, 0x1

    .line 4
    invoke-direct {p0, p3, p1, p2}, Landroid/media/VolumeProvider;-><init>(III)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final onAdjustVolume(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lnb/q;->a:Lnb/w;

    .line 2
    .line 3
    iget-object v1, v0, Lnb/w;->b:Landroid/os/Handler;

    .line 4
    .line 5
    new-instance v2, Lf0/d;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-direct {v2, p1, v3, v0}, Lf0/d;-><init>(IILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method
