.class public final Lh/e;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Lh/e0;


# direct methods
.method public constructor <init>(Lh/e0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh/e;->g:Lh/e0;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Lv1/p0;

    .line 2
    .line 3
    check-cast p2, Lv1/m0;

    .line 4
    .line 5
    check-cast p3, Lu2/a;

    .line 6
    .line 7
    iget-wide v0, p3, Lu2/a;->a:J

    .line 8
    .line 9
    invoke-interface {p2, v0, v1}, Lv1/m0;->Q(J)Lv1/b1;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget p3, p2, Lv1/b1;->g:I

    .line 14
    .line 15
    iget v0, p2, Lv1/b1;->h:I

    .line 16
    .line 17
    new-instance v1, Lf1/p;

    .line 18
    .line 19
    iget-object v2, p0, Lh/e;->g:Lh/e0;

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    invoke-direct {v1, p2, v3, v2}, Lf1/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget-object p2, Ltf/u;->g:Ltf/u;

    .line 26
    .line 27
    invoke-interface {p1, p3, v0, p2, v1}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method
