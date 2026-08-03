.class public final Lm0/w;
.super Lm0/j0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final c:Lm0/w;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lm0/w;

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
    sput-object v0, Lm0/w;->c:Lm0/w;

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
    check-cast p1, Li0/k0;

    .line 7
    .line 8
    iget-object p2, p4, Lb5/i;->f:Ljava/util/RandomAccess;

    .line 9
    .line 10
    check-cast p2, Lj0/b;

    .line 11
    .line 12
    invoke-virtual {p2, p1}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p4, Lb5/i;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p2, Lf/l0;

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Lf/l0;->a(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method
