.class public abstract Landroidx/core/content/UnusedAppRestrictionsBackportService;
.super Landroid/app/Service;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final ε:Lz62;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lz62;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lz62;-><init>(Landroidx/core/content/UnusedAppRestrictionsBackportService;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/core/content/UnusedAppRestrictionsBackportService;->ε:Lz62;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/core/content/UnusedAppRestrictionsBackportService;->ε:Lz62;

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract α()V
.end method
