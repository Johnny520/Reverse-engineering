.class public final Laz0;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:J


# direct methods
.method public constructor <init>(JLik;)V
    .locals 0

    .line 1
    iput-wide p1, p0, Laz0;->i:J

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p3}, Lm51;-><init>(ILik;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 3

    .line 1
    new-instance v0, Laz0;

    .line 2
    .line 3
    iget-wide v1, p0, Laz0;->i:J

    .line 4
    .line 5
    invoke-direct {v0, v1, v2, p2}, Laz0;-><init>(JLik;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Laz0;->h:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljz0;

    .line 2
    .line 3
    check-cast p2, Lik;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Laz0;->g(Ljava/lang/Object;Lik;)Lik;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Laz0;

    .line 10
    .line 11
    sget-object p1, Lna1;->a:Lna1;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Laz0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Laz0;->h:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, Ljz0;

    .line 7
    .line 8
    iget-object p1, p1, Ljz0;->a:Llz0;

    .line 9
    .line 10
    iget-object v0, p1, Llz0;->k:Lny0;

    .line 11
    .line 12
    iget-wide v1, p0, Laz0;->i:J

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    invoke-virtual {p1, v0, v1, v2, p0}, Llz0;->c(Lny0;JI)J

    .line 16
    .line 17
    .line 18
    sget-object p0, Lna1;->a:Lna1;

    .line 19
    .line 20
    return-object p0
.end method
