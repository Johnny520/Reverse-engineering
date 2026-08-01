.class public final Lgt0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lx31;
.implements Lhu;
.implements Lix;


# instance fields
.field public final synthetic d:Lz31;


# direct methods
.method public constructor <init>(Lz31;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgt0;->d:Lz31;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Liu;Lik;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lgt0;->d:Lz31;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lz31;->b(Liu;Lik;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lzk;->d:Lzk;

    .line 7
    .line 8
    return-object p0
.end method

.method public final c(Lpk;ILtb;)Lhu;
    .locals 1

    .line 1
    if-ltz p2, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-ge p2, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, -0x2

    .line 8
    if-ne p2, v0, :cond_1

    .line 9
    .line 10
    :goto_0
    sget-object v0, Ltb;->e:Ltb;

    .line 11
    .line 12
    if-ne p3, v0, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    if-eqz p2, :cond_2

    .line 16
    .line 17
    const/4 v0, -0x3

    .line 18
    if-ne p2, v0, :cond_3

    .line 19
    .line 20
    :cond_2
    sget-object v0, Ltb;->d:Ltb;

    .line 21
    .line 22
    if-ne p3, v0, :cond_3

    .line 23
    .line 24
    :goto_1
    return-object p0

    .line 25
    :cond_3
    new-instance v0, Lpd;

    .line 26
    .line 27
    invoke-direct {v0, p0, p1, p2, p3}, Lod;-><init>(Lhu;Lpk;ILtb;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lgt0;->d:Lz31;

    .line 2
    .line 3
    invoke-virtual {p0}, Lz31;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
