.class public abstract Lk20;
.super Loe0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lh91;


# instance fields
.field public r:Lfd1;

.field public s:Lfd1;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Loe0;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lp30;->n:Lut;

    .line 5
    .line 6
    iput-object v0, p0, Lk20;->r:Lfd1;

    .line 7
    .line 8
    iput-object v0, p0, Lk20;->s:Lfd1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final k()Ljava/lang/Object;
    .locals 0

    .line 1
    const-string p0, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 2
    .line 3
    return-object p0
.end method

.method public final o0()V
    .locals 2

    .line 1
    new-instance v0, Lj20;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lj20;-><init>(Lk20;I)V

    .line 5
    .line 6
    .line 7
    const-string v1, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 8
    .line 9
    invoke-static {p0, v1, v0}, Lr60;->D(Loe0;Ljava/lang/Object;Lsw;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lk20;->x0()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final p0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk20;->r:Lfd1;

    .line 2
    .line 3
    iput-object v0, p0, Lk20;->s:Lfd1;

    .line 4
    .line 5
    new-instance v0, Lj20;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lj20;-><init>(Lk20;I)V

    .line 9
    .line 10
    .line 11
    const-string v1, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Lr60;->E(Lrm;Ljava/lang/String;Lsw;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final q0()V
    .locals 1

    .line 1
    sget-object v0, Lp30;->n:Lut;

    .line 2
    .line 3
    iput-object v0, p0, Lk20;->r:Lfd1;

    .line 4
    .line 5
    return-void
.end method

.method public abstract w0(Lfd1;)Lfd1;
.end method

.method public x0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk20;->r:Lfd1;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lk20;->w0(Lfd1;)Lfd1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lk20;->s:Lfd1;

    .line 8
    .line 9
    new-instance v0, Lj20;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, p0, v1}, Lj20;-><init>(Lk20;I)V

    .line 13
    .line 14
    .line 15
    const-string v1, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 16
    .line 17
    invoke-static {p0, v1, v0}, Lr60;->E(Lrm;Ljava/lang/String;Lsw;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
