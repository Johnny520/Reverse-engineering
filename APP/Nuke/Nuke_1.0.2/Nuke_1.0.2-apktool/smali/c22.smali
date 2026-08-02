.class public final Lc22;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic i:Lb72;

.field public final synthetic j:Ld22;

.field public final synthetic k:Ld11;

.field public final synthetic l:J

.field public final synthetic m:J


# direct methods
.method public constructor <init>(Lb72;Ld22;Ld11;JJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc22;->i:Lb72;

    .line 2
    .line 3
    iput-object p2, p0, Lc22;->j:Ld22;

    .line 4
    .line 5
    iput-object p3, p0, Lc22;->k:Ld11;

    .line 6
    .line 7
    iput-wide p4, p0, Lc22;->l:J

    .line 8
    .line 9
    iput-wide p6, p0, Lc22;->m:J

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lc22;->j:Ld22;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld22;->getPositionProvider()Lg22;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Ld22;->getParentLayoutDirection()Ld61;

    .line 8
    .line 9
    .line 10
    move-result-object v5

    .line 11
    iget-wide v6, p0, Lc22;->m:J

    .line 12
    .line 13
    iget-object v2, p0, Lc22;->k:Ld11;

    .line 14
    .line 15
    iget-wide v3, p0, Lc22;->l:J

    .line 16
    .line 17
    invoke-interface/range {v1 .. v7}, Lg22;->a(Ld11;JLd61;J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iget-object p0, p0, Lc22;->i:Lb72;

    .line 22
    .line 23
    iput-wide v0, p0, Lb72;->h:J

    .line 24
    .line 25
    sget-object p0, La83;->a:La83;

    .line 26
    .line 27
    return-object p0
.end method
