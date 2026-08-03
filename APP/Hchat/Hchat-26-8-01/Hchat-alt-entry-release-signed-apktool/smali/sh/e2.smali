.class public final Lsh/e2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final d:Lp4/t;


# instance fields
.field public a:F

.field public final b:Li0/f1;

.field public final c:Li0/f1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Li2/y;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1}, Li2/y;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lr9/p;

    .line 9
    .line 10
    const/4 v2, 0x7

    .line 11
    invoke-direct {v1, v2}, Lr9/p;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lv0/k;->b(Lfg/p;Lfg/l;)Lp4/t;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lsh/e2;->d:Lp4/t;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(FFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lsh/e2;->a:F

    .line 5
    .line 6
    new-instance p1, Li0/f1;

    .line 7
    .line 8
    invoke-direct {p1, p3}, Li0/f1;-><init>(F)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lsh/e2;->b:Li0/f1;

    .line 12
    .line 13
    new-instance p1, Li0/f1;

    .line 14
    .line 15
    invoke-direct {p1, p2}, Li0/f1;-><init>(F)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lsh/e2;->c:Li0/f1;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()F
    .locals 2

    .line 1
    iget v0, p0, Lsh/e2;->a:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpg-float v0, v0, v1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p0, Lsh/e2;->c:Li0/f1;

    .line 10
    .line 11
    invoke-virtual {v0}, Li0/f1;->g()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget v1, p0, Lsh/e2;->a:F

    .line 16
    .line 17
    div-float/2addr v0, v1

    .line 18
    return v0
.end method

.method public final b(F)V
    .locals 2

    .line 1
    iget v0, p0, Lsh/e2;->a:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p1, v0, v1}, Lr9/e0;->q(FFF)F

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iget-object v0, p0, Lsh/e2;->c:Li0/f1;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Li0/f1;->h(F)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
