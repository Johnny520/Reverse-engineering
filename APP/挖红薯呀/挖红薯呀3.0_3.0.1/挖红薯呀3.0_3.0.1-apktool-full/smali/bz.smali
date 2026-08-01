.class public final Lbz;
.super Loe0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhp0;


# instance fields
.field public r:Lfa;


# virtual methods
.method public final c0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Lgw0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lgw0;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    new-instance p1, Lgw0;

    .line 12
    .line 13
    invoke-direct {p1}, Lgw0;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_1
    iget-object p0, p0, Lbz;->r:Lfa;

    .line 17
    .line 18
    new-instance v0, Lfl;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lfl;-><init>(Lfa;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p1, Lgw0;->c:Lfl;

    .line 24
    .line 25
    return-object p1
.end method
