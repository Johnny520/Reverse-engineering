.class public final Lfz2;
.super Lu60;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lgy;
.implements Lry2;


# instance fields
.field public A:Lj10;

.field public B:Lzt2;

.field public final C:Ln70;

.field public D:Lo62;

.field public x:Ldq1;

.field public y:Lvz2;

.field public z:Lwz2;


# direct methods
.method public constructor <init>(Ldq1;Lvz2;Lwz2;Lj10;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lu60;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfz2;->x:Ldq1;

    .line 5
    .line 6
    iput-object p2, p0, Lfz2;->y:Lvz2;

    .line 7
    .line 8
    iput-object p3, p0, Lfz2;->z:Lwz2;

    .line 9
    .line 10
    iput-object p4, p0, Lfz2;->A:Lj10;

    .line 11
    .line 12
    new-instance p1, Lta;

    .line 13
    .line 14
    const/16 p2, 0x1c

    .line 15
    .line 16
    invoke-direct {p1, p2, p0}, Lta;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lop0;->m(Lxm0;)Ln70;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lfz2;->C:Ln70;

    .line 24
    .line 25
    sget-object p1, Lo62;->e:Lo62;

    .line 26
    .line 27
    iput-object p1, p0, Lfz2;->D:Lo62;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final E0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lfz2;->x:Ldq1;

    .line 2
    .line 3
    sget-object v1, Lw23;->j:Lw23;

    .line 4
    .line 5
    iput-object v1, v0, Ldq1;->j:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p0, v0, Ldq1;->i:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public final F0()V
    .locals 1

    .line 1
    iget-object p0, p0, Lfz2;->x:Ldq1;

    .line 2
    .line 3
    sget-object v0, Lw23;->i:Lw23;

    .line 4
    .line 5
    iput-object v0, p0, Ldq1;->j:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Ldq1;->i:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public final h(Lc61;)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lfz2;->n(Lc61;)Lo62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lo62;->d()J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    return-wide p0
.end method

.method public final n(Lc61;)Lo62;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lth1;->u:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lfz2;->D:Lo62;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object v0, p0, Lfz2;->A:Lj10;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lj10;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lo62;

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    iget-object p0, p0, Lfz2;->D:Lo62;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    iput-object p1, p0, Lfz2;->D:Lo62;

    .line 22
    .line 23
    return-object p1
.end method

.method public final v0()Lqy2;
    .locals 0

    .line 1
    iget-object p0, p0, Lfz2;->C:Ln70;

    .line 2
    .line 3
    invoke-virtual {p0}, Ln70;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lqy2;

    .line 8
    .line 9
    return-object p0
.end method
