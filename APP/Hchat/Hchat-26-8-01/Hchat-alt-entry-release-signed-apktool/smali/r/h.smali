.class public final Lr/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lac/k;


# direct methods
.method public constructor <init>(Lfg/l;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lac/k;

    .line 5
    .line 6
    const/16 v1, 0x9

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, v2, v1}, Lac/k;-><init>(BI)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lr/h;->a:Lac/k;

    .line 13
    .line 14
    invoke-interface {p1, p0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static a(Lr/h;Ljava/lang/Object;Lfg/q;I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p3, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move-object p1, v1

    .line 7
    :cond_0
    iget-object p0, p0, Lr/h;->a:Lac/k;

    .line 8
    .line 9
    new-instance p3, Lb5/c;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    new-instance v1, Lc9/k1;

    .line 14
    .line 15
    const/16 v2, 0x16

    .line 16
    .line 17
    invoke-direct {v1, p1, v2}, Lc9/k1;-><init>(Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    :cond_1
    new-instance p1, Lo9/e;

    .line 21
    .line 22
    const/16 v2, 0x1a

    .line 23
    .line 24
    invoke-direct {p1, v2}, Lo9/e;-><init>(I)V

    .line 25
    .line 26
    .line 27
    new-instance v2, Lq2/c;

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    invoke-direct {v2, p2, v3}, Lq2/c;-><init>(Ljava/lang/Object;I)V

    .line 31
    .line 32
    .line 33
    new-instance p2, Ls0/d;

    .line 34
    .line 35
    const v3, -0x331bf287

    .line 36
    .line 37
    .line 38
    invoke-direct {p2, v3, v2, v0}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p3, v1, p1, p2}, Lb5/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v0, p3}, Lac/k;->b(ILb5/c;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method
