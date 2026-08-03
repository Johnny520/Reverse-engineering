.class public final Lci/n0;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/v;


# instance fields
.field public final u:Ln/k;

.field public final v:Li/r0;

.field public final w:Li/c;


# direct methods
.method public constructor <init>(Ln/k;Li/r0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ly0/n;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lci/n0;->u:Ln/k;

    .line 8
    .line 9
    iput-object p2, p0, Lci/n0;->v:Li/r0;

    .line 10
    .line 11
    const/high16 p1, 0x3f800000    # 1.0f

    .line 12
    .line 13
    const p2, 0x3c23d70a    # 0.01f

    .line 14
    .line 15
    .line 16
    invoke-static {p1, p2}, Li/d;->a(FF)Li/c;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lci/n0;->w:Li/c;

    .line 21
    .line 22
    return-void
.end method

.method public static final k1(Lci/n0;F)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ly0/n;->Y0()Lqg/t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lci/m0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lci/m0;-><init>(Lci/n0;FLwf/c;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x3

    .line 12
    invoke-static {v0, v2, v1, p0}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final c1()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ly0/n;->Y0()Lqg/t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lci/c;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v1, p0, v3, v2}, Lci/c;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x3

    .line 13
    invoke-static {v0, v3, v1, v2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final j(Lv1/p0;Lv1/m0;J)Lv1/o0;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, p3, p4}, Lv1/m0;->Q(J)Lv1/b1;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    iget p3, p2, Lv1/b1;->g:I

    .line 9
    .line 10
    iget p4, p2, Lv1/b1;->h:I

    .line 11
    .line 12
    new-instance v0, Lc9/i;

    .line 13
    .line 14
    const/16 v1, 0xa

    .line 15
    .line 16
    invoke-direct {v0, p2, v1, p0}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p2, Ltf/u;->g:Ltf/u;

    .line 20
    .line 21
    invoke-interface {p1, p3, p4, p2, v0}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method
