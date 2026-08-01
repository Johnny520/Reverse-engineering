.class public final Lne1;
.super Landroid/database/ContentObserver;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final synthetic a:Lvb;


# direct methods
.method public constructor <init>(Lvb;Landroid/os/Handler;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lne1;->a:Lvb;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onChange(ZLandroid/net/Uri;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lne1;->a:Lvb;

    .line 2
    .line 3
    sget-object p1, Lna1;->a:Lna1;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ln01;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method
