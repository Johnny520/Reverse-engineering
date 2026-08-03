.class public final Ly2/w;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:Lgg/t;

.field public final synthetic h:Ly2/x;

.field public final synthetic i:Lu2/k;

.field public final synthetic j:J

.field public final synthetic k:J


# direct methods
.method public constructor <init>(Lgg/t;Ly2/x;Lu2/k;JJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly2/w;->g:Lgg/t;

    .line 2
    .line 3
    iput-object p2, p0, Ly2/w;->h:Ly2/x;

    .line 4
    .line 5
    iput-object p3, p0, Ly2/w;->i:Lu2/k;

    .line 6
    .line 7
    iput-wide p4, p0, Ly2/w;->j:J

    .line 8
    .line 9
    iput-wide p6, p0, Ly2/w;->k:J

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Ly2/w;->h:Ly2/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly2/x;->getPositionProvider()Ly2/b0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Ly2/x;->getParentLayoutDirection()Lu2/m;

    .line 8
    .line 9
    .line 10
    move-result-object v5

    .line 11
    iget-wide v6, p0, Ly2/w;->k:J

    .line 12
    .line 13
    iget-object v2, p0, Ly2/w;->i:Lu2/k;

    .line 14
    .line 15
    iget-wide v3, p0, Ly2/w;->j:J

    .line 16
    .line 17
    invoke-interface/range {v1 .. v7}, Ly2/b0;->e(Lu2/k;JLu2/m;J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iget-object v2, p0, Ly2/w;->g:Lgg/t;

    .line 22
    .line 23
    iput-wide v0, v2, Lgg/t;->g:J

    .line 24
    .line 25
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 26
    .line 27
    return-object v0
.end method
