.class public final Lk5/e0;
.super Lo5/r;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lk5/f0;


# direct methods
.method public constructor <init>(Lk5/f0;Landroidx/lifecycle/x;III)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk5/e0;->k:Lk5/f0;

    .line 2
    .line 3
    iput p5, p0, Lk5/e0;->j:I

    .line 4
    .line 5
    invoke-direct {p0, p2, p3, p4}, Lo5/r;-><init>(Landroidx/lifecycle/x;II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La5/a;I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lk5/e0;->j:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    if-ne p2, v0, :cond_0

    .line 6
    .line 7
    new-instance p2, Lk5/d;

    .line 8
    .line 9
    invoke-direct {p2, p1}, Lk5/d;-><init>(La5/a;)V

    .line 10
    .line 11
    .line 12
    return-object p2

    .line 13
    :cond_0
    new-instance p2, Lk5/g0;

    .line 14
    .line 15
    iget-object v0, p0, Lk5/e0;->k:Lk5/f0;

    .line 16
    .line 17
    iget-object v0, v0, Lk5/f0;->a:Lk5/u;

    .line 18
    .line 19
    invoke-direct {p2, v0, p1}, Lk5/g0;-><init>(Lk5/u;La5/a;)V

    .line 20
    .line 21
    .line 22
    return-object p2
.end method
