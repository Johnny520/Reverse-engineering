.class public final Lm0/o;
.super Lm0/j0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final c:Lm0/o;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lm0/o;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, v1, v2, v2}, Lm0/j0;-><init>(III)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lm0/o;->c:Lm0/o;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lh0/s;Li0/a;Ll0/k;Lb5/i;Lm0/k0;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1, p2}, Lh0/s;->d(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    check-cast p1, Li0/r1;

    .line 7
    .line 8
    iget-object p2, p4, Lb5/i;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p2, Lf/k0;

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    invoke-virtual {p2, p1}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    check-cast p3, Ls0/f;

    .line 19
    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    iget-object p3, p4, Lb5/i;->a:Ljava/util/ArrayList;

    .line 23
    .line 24
    if-eqz p3, :cond_0

    .line 25
    .line 26
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result p5

    .line 30
    add-int/lit8 p5, p5, -0x1

    .line 31
    .line 32
    invoke-virtual {p3, p5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    check-cast p3, Lj0/b;

    .line 37
    .line 38
    if-eqz p3, :cond_0

    .line 39
    .line 40
    iput-object p3, p4, Lb5/i;->f:Ljava/util/RandomAccess;

    .line 41
    .line 42
    :cond_0
    invoke-virtual {p2, p1}, Lf/k0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method
