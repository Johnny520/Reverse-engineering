.class public final Lj3;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public final synthetic ε:Lae;

.field public final synthetic ζ:La80;


# direct methods
.method public constructor <init>(Lae;Lk3;La80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj3;->ε:Lae;

    .line 5
    .line 6
    iput-object p3, p0, Lj3;->ζ:La80;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj3;->ζ:La80;

    .line 2
    .line 3
    :try_start_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    new-instance p2, Leo1;

    .line 14
    .line 15
    invoke-direct {p2, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    move-object p1, p2

    .line 19
    :goto_0
    iget-object p0, p0, Lj3;->ε:Lae;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lae;->ζ(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
