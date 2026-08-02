.class public final Lmf0;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic i:Z

.field public final synthetic j:Lxm0;


# direct methods
.method public constructor <init>(ZLxm0;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lmf0;->i:Z

    .line 2
    .line 3
    iput-object p2, p0, Lmf0;->j:Lxm0;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lca2;

    .line 2
    .line 3
    iget-boolean v0, p0, Lmf0;->i:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lmf0;->j:Lxm0;

    .line 8
    .line 9
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    :goto_0
    invoke-virtual {p1, p0}, Lca2;->g(Z)V

    .line 25
    .line 26
    .line 27
    sget-object p0, La83;->a:La83;

    .line 28
    .line 29
    return-object p0
.end method
