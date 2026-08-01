.class public final Llk;
.super Loe0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lvz0;


# instance fields
.field public final r:Z

.field public s:Lsw;


# direct methods
.method public constructor <init>(Lsw;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Loe0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Llk;->r:Z

    .line 5
    .line 6
    iput-object p1, p0, Llk;->s:Lsw;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final S(Lf01;)V
    .locals 0

    .line 1
    iget-object p0, p0, Llk;->s:Lsw;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final V()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Llk;->r:Z

    .line 2
    .line 3
    return p0
.end method

.method public final X()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
