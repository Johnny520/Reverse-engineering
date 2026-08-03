.class public final Li/d0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li0/l2;


# instance fields
.field public g:Ljava/lang/Float;

.field public h:Ljava/lang/Float;

.field public final i:Li0/j1;

.field public j:Li/z0;

.field public k:Z

.field public l:Z

.field public m:J

.field public final synthetic n:Li/g0;


# direct methods
.method public constructor <init>(Li/g0;Ljava/lang/Float;Ljava/lang/Float;Li/c0;)V
    .locals 6

    .line 1
    sget-object v2, Li/d;->j:Li/m1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Li/d0;->n:Li/g0;

    .line 7
    .line 8
    iput-object p2, p0, Li/d0;->g:Ljava/lang/Float;

    .line 9
    .line 10
    iput-object p3, p0, Li/d0;->h:Ljava/lang/Float;

    .line 11
    .line 12
    invoke-static {p2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Li/d0;->i:Li0/j1;

    .line 17
    .line 18
    new-instance v0, Li/z0;

    .line 19
    .line 20
    iget-object v3, p0, Li/d0;->g:Ljava/lang/Float;

    .line 21
    .line 22
    iget-object v4, p0, Li/d0;->h:Ljava/lang/Float;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    move-object v1, p4

    .line 26
    invoke-direct/range {v0 .. v5}, Li/z0;-><init>(Li/k;Li/m1;Ljava/lang/Object;Ljava/lang/Object;Li/q;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Li/d0;->j:Li/z0;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Li/d0;->i:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
