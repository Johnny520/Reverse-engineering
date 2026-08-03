.class public final synthetic LYue/ۥۣ۠ۧۨ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ۥ:Landroid/location/LocationManager;

.field public final synthetic ۥ۟:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;


# direct methods
.method public synthetic constructor <init>(Landroid/location/LocationManager;LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۠ۧۨ;->ۥ:Landroid/location/LocationManager;

    iput-object p2, p0, LYue/ۥۣ۠ۧۨ;->ۥ۟:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LYue/ۥۣ۠ۧۨ;->ۥ:Landroid/location/LocationManager;

    iget-object v1, p0, LYue/ۥۣ۠ۧۨ;->ۥ۟:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;

    invoke-static {v0, v1}, LYue/ۥ۠ۧۨۤ;->ۥ۟(Landroid/location/LocationManager;LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
