.class public final Lsa;
.super Lsm;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lvz0;


# instance fields
.field public t:Loa;

.field public u:F

.field public v:Lg31;

.field public w:Lx01;

.field public final x:Lmc;


# direct methods
.method public constructor <init>(FLg31;Lx01;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lsm;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lsa;->u:F

    .line 5
    .line 6
    iput-object p2, p0, Lsa;->v:Lg31;

    .line 7
    .line 8
    iput-object p3, p0, Lsa;->w:Lx01;

    .line 9
    .line 10
    new-instance p1, Lo;

    .line 11
    .line 12
    const/4 p2, 0x2

    .line 13
    invoke-direct {p1, p2, p0}, Lo;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    new-instance p2, Lmc;

    .line 17
    .line 18
    new-instance p3, Lnc;

    .line 19
    .line 20
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    sget-object v0, Ln2;->z:Ln2;

    .line 24
    .line 25
    iput-object v0, p3, Lnc;->d:Lbc;

    .line 26
    .line 27
    invoke-direct {p2, p3, p1}, Lmc;-><init>(Lnc;Lo;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p2}, Lsm;->w0(Lrm;)Lrm;

    .line 31
    .line 32
    .line 33
    iput-object p2, p0, Lsa;->x:Lmc;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final S(Lf01;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lsa;->w:Lx01;

    .line 2
    .line 3
    invoke-static {p1, p0}, Ld01;->b(Lf01;Lx01;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final l0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
