.class public Lw10;
.super Lg;

# interfaces
.implements Lqe;


# instance fields
.field public final d:Lm50;


# direct methods
.method public constructor <init>(Lge;Lm50;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Lg;-><init>(Lge;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lw10;->d:Lm50;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final B()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final c()Lqe;
    .locals 1

    .line 1
    iget-object v0, p0, Lw10;->d:Lm50;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    return-object v0
.end method

.method public k(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw10;->d:Lm50;

    .line 2
    .line 3
    invoke-static {v0}, Lip;->z(Lld;)Lld;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, La80;->A(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {v0, p1}, La80;->B(Lld;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public l(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw10;->d:Lm50;

    .line 2
    .line 3
    invoke-static {p1}, La80;->A(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lm50;->f(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
