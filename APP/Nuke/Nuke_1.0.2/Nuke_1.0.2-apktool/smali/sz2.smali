.class public final Lsz2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lbm2;


# instance fields
.field public final synthetic a:Lbm2;

.field public final b:Ln70;

.field public final c:Ln70;


# direct methods
.method public constructor <init>(Lbm2;Ltz2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsz2;->a:Lbm2;

    .line 5
    .line 6
    new-instance p1, Lrz2;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, p2, v0}, Lrz2;-><init>(Ltz2;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lop0;->m(Lxm0;)Ln70;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lsz2;->b:Ln70;

    .line 17
    .line 18
    new-instance p1, Lrz2;

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-direct {p1, p2, v0}, Lrz2;-><init>(Ltz2;I)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lop0;->m(Lxm0;)Ln70;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lsz2;->c:Ln70;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lsz2;->c:Ln70;

    .line 2
    .line 3
    invoke-virtual {p0}, Ln70;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final b()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lsz2;->a:Lbm2;

    .line 2
    .line 3
    invoke-interface {p0}, Lbm2;->b()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lsz2;->b:Ln70;

    .line 2
    .line 3
    invoke-virtual {p0}, Ln70;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final d(Lbl1;Lmn0;Lu00;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lsz2;->a:Lbm2;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2, p3}, Lbm2;->d(Lbl1;Lmn0;Lu00;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final e(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Lsz2;->a:Lbm2;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lbm2;->e(F)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
