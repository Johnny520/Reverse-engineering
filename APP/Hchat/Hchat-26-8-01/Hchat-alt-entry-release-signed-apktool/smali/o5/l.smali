.class public final Lo5/l;
.super Lo5/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final b:La5/a;

.field public final c:Lk5/u;

.field public final d:I

.field public e:I


# direct methods
.method public constructor <init>(Lk5/u;I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lo5/l;->e:I

    .line 6
    .line 7
    iput-object p1, p0, Lo5/l;->c:Lk5/u;

    .line 8
    .line 9
    iget-object p1, p1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v1, La5/a;

    .line 15
    .line 16
    const/4 v2, 0x5

    .line 17
    invoke-direct {v1, p2, v2, p1}, La5/a;-><init>(IILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lo5/l;->b:La5/a;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, La5/a;->o(Z)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iput p1, p0, Lo5/l;->d:I

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lo5/l;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()Lw5/a;
    .locals 2

    .line 1
    iget v0, p0, Lo5/l;->e:I

    .line 2
    .line 3
    iget v1, p0, Lo5/l;->d:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    iput v0, p0, Lo5/l;->e:I

    .line 10
    .line 11
    iget-object v0, p0, Lo5/l;->c:Lk5/u;

    .line 12
    .line 13
    iget-object v1, p0, Lo5/l;->b:La5/a;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lfb/v0;->J(Lk5/u;La5/a;)Lw5/a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return-object v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget-object v0, p0, Lo5/l;->b:La5/a;

    .line 2
    .line 3
    iget v0, v0, La5/a;->h:I

    .line 4
    .line 5
    return v0
.end method

.method public final d()V
    .locals 2

    .line 1
    iget v0, p0, Lo5/l;->e:I

    .line 2
    .line 3
    iget v1, p0, Lo5/l;->d:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    iput v0, p0, Lo5/l;->e:I

    .line 10
    .line 11
    iget-object v0, p0, Lo5/l;->b:La5/a;

    .line 12
    .line 13
    invoke-static {v0}, Lfb/v0;->K(La5/a;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
