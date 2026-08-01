.class public final Lyf0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lxf0;


# instance fields
.field public final d:Lcp0;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcp0;

    .line 5
    .line 6
    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcp0;-><init>(F)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lyf0;->d:Lcp0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final h(Lpk;)Lpk;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lpf1;->J(Lnk;Lpk;)Lpk;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final l(Lok;)Lnk;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lpf1;->v(Lnk;Lok;)Lnk;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final p(Lww;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p2, p0}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final t(Lok;)Lpk;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lpf1;->F(Lnk;Lok;)Lpk;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final u()F
    .locals 0

    .line 1
    iget-object p0, p0, Lyf0;->d:Lcp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcp0;->g()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
