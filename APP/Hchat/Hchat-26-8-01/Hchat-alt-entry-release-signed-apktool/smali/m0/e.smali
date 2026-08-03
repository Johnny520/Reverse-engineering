.class public final Lm0/e;
.super Lm0/j0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final c:Lm0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lm0/e;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v3, v1, v2}, Lm0/j0;-><init>(III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lm0/e;->c:Lm0/e;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Lh0/s;Li0/a;Ll0/k;Lb5/i;Lm0/k0;)V
    .locals 3

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1, p2}, Lh0/s;->d(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    check-cast p2, Ll0/b;

    .line 7
    .line 8
    const/4 p5, 0x1

    .line 9
    invoke-virtual {p1, p5}, Lh0/s;->d(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    instance-of v0, p1, Li0/k0;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    move-object v0, p1

    .line 18
    check-cast v0, Li0/k0;

    .line 19
    .line 20
    iget-object v1, p4, Lb5/i;->f:Ljava/util/RandomAccess;

    .line 21
    .line 22
    check-cast v1, Lj0/b;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p4, p4, Lb5/i;->e:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p4, Lf/l0;

    .line 30
    .line 31
    invoke-virtual {p4, v0}, Lf/l0;->a(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_0
    iget p4, p3, Ll0/k;->n:I

    .line 35
    .line 36
    if-nez p4, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const-string p4, "Can only append a slot if not current inserting"

    .line 40
    .line 41
    invoke-static {p4}, Li0/m;->a(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    iget p4, p3, Ll0/k;->i:I

    .line 45
    .line 46
    iget v0, p3, Ll0/k;->j:I

    .line 47
    .line 48
    invoke-virtual {p3, p2}, Ll0/k;->c(Ll0/b;)I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    iget-object v1, p3, Ll0/k;->b:[I

    .line 53
    .line 54
    add-int/lit8 v2, p2, 0x1

    .line 55
    .line 56
    invoke-virtual {p3, v2}, Ll0/k;->r(I)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-virtual {p3, v1, v2}, Ll0/k;->g([II)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    iput v1, p3, Ll0/k;->i:I

    .line 65
    .line 66
    iput v1, p3, Ll0/k;->j:I

    .line 67
    .line 68
    invoke-virtual {p3, p5, p2}, Ll0/k;->x(II)V

    .line 69
    .line 70
    .line 71
    if-lt p4, v1, :cond_2

    .line 72
    .line 73
    add-int/lit8 p4, p4, 0x1

    .line 74
    .line 75
    add-int/lit8 v0, v0, 0x1

    .line 76
    .line 77
    :cond_2
    iget-object p2, p3, Ll0/k;->c:[Ljava/lang/Object;

    .line 78
    .line 79
    aput-object p1, p2, v1

    .line 80
    .line 81
    iput p4, p3, Ll0/k;->i:I

    .line 82
    .line 83
    iput v0, p3, Ll0/k;->j:I

    .line 84
    .line 85
    return-void
.end method
