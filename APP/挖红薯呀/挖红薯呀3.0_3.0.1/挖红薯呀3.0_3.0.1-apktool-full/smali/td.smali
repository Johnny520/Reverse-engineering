.class public final Ltd;
.super Lod;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final h:Lxw;


# direct methods
.method public constructor <init>(Lxw;Lhu;Lpk;ILtb;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3, p4, p5}, Lod;-><init>(Lhu;Lpk;ILtb;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltd;->h:Lxw;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lpk;ILtb;)Lod;
    .locals 6

    .line 1
    new-instance v0, Ltd;

    .line 2
    .line 3
    iget-object v1, p0, Ltd;->h:Lxw;

    .line 4
    .line 5
    iget-object v2, p0, Lod;->g:Lhu;

    .line 6
    .line 7
    move-object v3, p1

    .line 8
    move v4, p2

    .line 9
    move-object v5, p3

    .line 10
    invoke-direct/range {v0 .. v5}, Ltd;-><init>(Lxw;Lhu;Lpk;ILtb;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final e(Liu;Lik;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lqd;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lqd;-><init>(Ltd;Liu;Lik;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p2}, Lp30;->w(Lww;Lik;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object p1, Lzk;->d:Lzk;

    .line 12
    .line 13
    if-ne p0, p1, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    sget-object p0, Lna1;->a:Lna1;

    .line 17
    .line 18
    return-object p0
.end method
