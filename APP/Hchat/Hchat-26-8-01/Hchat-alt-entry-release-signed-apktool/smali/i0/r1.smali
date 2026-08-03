.class public final Li0/r1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:Li0/q;

.field public b:I

.field public c:Ll0/b;

.field public d:Lfg/p;

.field public e:I

.field public f:Lf/b0;

.field public g:Lf/k0;


# direct methods
.method public constructor <init>(Li0/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li0/r1;->a:Li0/q;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Li0/r1;->a:Li0/q;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Li0/r1;->c:Ll0/b;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Ll0/b;->a()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v1

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    return v0

    .line 20
    :cond_1
    return v1
.end method

.method public final b(Ljava/lang/Object;)Li0/o0;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/r1;->a:Li0/q;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0, p0, p1}, Li0/q;->s(Li0/r1;Ljava/lang/Object;)Li0/o0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object p1

    .line 13
    :cond_1
    :goto_0
    sget-object p1, Li0/o0;->g:Li0/o0;

    .line 14
    .line 15
    return-object p1
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Li0/r1;->a:Li0/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iput-boolean v1, v0, Li0/q;->u:Z

    .line 7
    .line 8
    iget-object v0, v0, Li0/q;->z:Landroidx/lifecycle/x;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/lifecycle/x;->m()V

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Li0/r1;->a:Li0/q;

    .line 15
    .line 16
    iput-object v0, p0, Li0/r1;->f:Lf/b0;

    .line 17
    .line 18
    iput-object v0, p0, Li0/r1;->g:Lf/k0;

    .line 19
    .line 20
    iput-object v0, p0, Li0/r1;->d:Lfg/p;

    .line 21
    .line 22
    return-void
.end method

.method public final d(Z)V
    .locals 1

    .line 1
    iget v0, p0, Li0/r1;->b:I

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    or-int/lit8 p1, v0, 0x20

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    and-int/lit8 p1, v0, -0x21

    .line 9
    .line 10
    :goto_0
    iput p1, p0, Li0/r1;->b:I

    .line 11
    .line 12
    return-void
.end method

.method public final e(Lfg/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li0/r1;->d:Lfg/p;

    .line 2
    .line 3
    return-void
.end method
