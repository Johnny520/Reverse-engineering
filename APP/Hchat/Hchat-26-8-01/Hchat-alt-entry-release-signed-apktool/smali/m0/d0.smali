.class public final Lm0/d0;
.super Lm0/j0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final c:Lm0/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lm0/d0;

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
    sput-object v0, Lm0/d0;->c:Lm0/d0;

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
    if-eqz p2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p2, p1}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ls0/f;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    if-eqz p1, :cond_2

    .line 23
    .line 24
    iget-object p2, p4, Lb5/i;->a:Ljava/util/ArrayList;

    .line 25
    .line 26
    if-nez p2, :cond_1

    .line 27
    .line 28
    new-instance p2, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p2, p4, Lb5/i;->a:Ljava/util/ArrayList;

    .line 34
    .line 35
    :cond_1
    iget-object p3, p4, Lb5/i;->f:Ljava/util/RandomAccess;

    .line 36
    .line 37
    check-cast p3, Lj0/b;

    .line 38
    .line 39
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    iget-object p1, p1, Ls0/f;->h:Lj0/b;

    .line 43
    .line 44
    iput-object p1, p4, Lb5/i;->f:Ljava/util/RandomAccess;

    .line 45
    .line 46
    :cond_2
    return-void
.end method
