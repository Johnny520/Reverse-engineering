.class public final Lc0/n;
.super Lx1/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/h;
.implements Ld0/d;


# instance fields
.field public A:Lqg/e1;

.field public final B:Li0/x;

.field public C:Le1/c;

.field public w:Lb/e;

.field public x:Lh0/v0;

.field public y:Lh0/w0;

.field public z:Lh0/t0;


# direct methods
.method public constructor <init>(Lb/e;Lh0/v0;Lh0/w0;Lh0/t0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx1/j;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc0/n;->w:Lb/e;

    .line 5
    .line 6
    iput-object p2, p0, Lc0/n;->x:Lh0/v0;

    .line 7
    .line 8
    iput-object p3, p0, Lc0/n;->y:Lh0/w0;

    .line 9
    .line 10
    iput-object p4, p0, Lc0/n;->z:Lh0/t0;

    .line 11
    .line 12
    new-instance p1, Lab/a;

    .line 13
    .line 14
    const/16 p2, 0x8

    .line 15
    .line 16
    invoke-direct {p1, p0, p2}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lc0/n;->B:Li0/x;

    .line 24
    .line 25
    sget-object p1, Le1/c;->e:Le1/c;

    .line 26
    .line 27
    iput-object p1, p0, Lc0/n;->C:Le1/c;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final E0(Lv1/t;)J
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lc0/n;->w0(Lv1/t;)Le1/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Le1/c;->d()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final c1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc0/n;->w:Lb/e;

    .line 2
    .line 3
    sget-object v1, Lc0/o;->i:Lc0/o;

    .line 4
    .line 5
    iput-object v1, v0, Lb/e;->i:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p0, v0, Lb/e;->h:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public final d1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc0/n;->w:Lb/e;

    .line 2
    .line 3
    sget-object v1, Lc0/o;->h:Lc0/o;

    .line 4
    .line 5
    iput-object v1, v0, Lb/e;->i:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-object v1, v0, Lb/e;->h:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public final j0()Lz/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lc0/n;->B:Li0/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/x;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lz/c;

    .line 8
    .line 9
    return-object v0
.end method

.method public final w0(Lv1/t;)Le1/c;
    .locals 1

    .line 1
    iget-boolean v0, p0, Ly0/n;->t:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lc0/n;->C:Le1/c;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object v0, p0, Lc0/n;->z:Lh0/t0;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lh0/t0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Le1/c;

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    iget-object p1, p0, Lc0/n;->C:Le1/c;

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_1
    iput-object p1, p0, Lc0/n;->C:Le1/c;

    .line 22
    .line 23
    return-object p1
.end method
