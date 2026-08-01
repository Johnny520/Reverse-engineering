.class public final Lkc;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:J

.field public final synthetic e:Ljn0;

.field public final synthetic f:Lxw;


# direct methods
.method public constructor <init>(JLjn0;Lxw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lkc;->d:J

    .line 5
    .line 6
    iput-object p3, p0, Lkc;->e:Ljn0;

    .line 7
    .line 8
    iput-object p4, p0, Lkc;->f:Lxw;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, Lji;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    and-int/lit8 v0, p2, 0x3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    move v0, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v2

    .line 19
    :goto_0
    and-int/2addr p2, v3

    .line 20
    move-object v7, p1

    .line 21
    check-cast v7, Lpi;

    .line 22
    .line 23
    invoke-virtual {v7, p2, v0}, Lpi;->O(IZ)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    sget-object p1, Lfa1;->a:Lg41;

    .line 30
    .line 31
    invoke-virtual {v7, p1}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lda1;

    .line 36
    .line 37
    iget-object v5, p1, Lda1;->m:Ls71;

    .line 38
    .line 39
    new-instance p1, Ljc;

    .line 40
    .line 41
    iget-object p2, p0, Lkc;->e:Ljn0;

    .line 42
    .line 43
    iget-object v0, p0, Lkc;->f:Lxw;

    .line 44
    .line 45
    invoke-direct {p1, v2, p2, v0}, Ljc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    const p2, 0x18e49c83

    .line 49
    .line 50
    .line 51
    invoke-static {p2, p1, v7}, Lkl;->w(ILex;Lji;)Lmh;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    const/16 v8, 0x180

    .line 56
    .line 57
    iget-wide v3, p0, Lkc;->d:J

    .line 58
    .line 59
    invoke-static/range {v3 .. v8}, Lr60;->c(JLs71;Lww;Lji;I)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    invoke-virtual {v7}, Lpi;->R()V

    .line 64
    .line 65
    .line 66
    :goto_1
    sget-object p0, Lna1;->a:Lna1;

    .line 67
    .line 68
    return-object p0
.end method
