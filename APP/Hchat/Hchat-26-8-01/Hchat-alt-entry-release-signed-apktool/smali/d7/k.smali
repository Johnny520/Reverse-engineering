.class public Ld7/k;
.super Ld7/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final n:Lr7/c;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, v0, v1}, Ld7/j;-><init>(IZ)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lr7/c;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, v1, v2}, Lr7/c;-><init>(II)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Ld7/k;->n:Lr7/c;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lo7/d;->P(Lk7/a;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final R(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld7/k;->n:Lr7/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lr7/c;->Q(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
