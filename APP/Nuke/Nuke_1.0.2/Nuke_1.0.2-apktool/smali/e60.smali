.class public final Le60;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lbm2;


# instance fields
.field public final a:Lin0;

.field public final b:Ld60;

.field public final c:Lgl1;

.field public final d:Lnx1;

.field public final e:Lnx1;

.field public final f:Lnx1;


# direct methods
.method public constructor <init>(Lin0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le60;->a:Lin0;

    .line 5
    .line 6
    new-instance p1, Ld60;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Ld60;-><init>(Le60;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Le60;->b:Ld60;

    .line 12
    .line 13
    new-instance p1, Lgl1;

    .line 14
    .line 15
    invoke-direct {p1}, Lgl1;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Le60;->c:Lgl1;

    .line 19
    .line 20
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Le60;->d:Lnx1;

    .line 27
    .line 28
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Le60;->e:Lnx1;

    .line 33
    .line 34
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Le60;->f:Lnx1;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 0

    .line 1
    iget-object p0, p0, Le60;->d:Lnx1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnx1;->getValue()Ljava/lang/Object;

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
    .locals 6

    .line 1
    new-instance v0, Lb2;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/4 v5, 0x6

    .line 5
    move-object v1, p0

    .line 6
    move-object v2, p1

    .line 7
    move-object v3, p2

    .line 8
    invoke-direct/range {v0 .. v5}, Lb2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, p3}, Lte;->u(Lmn0;Lt00;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object p1, Lk20;->h:Lk20;

    .line 16
    .line 17
    if-ne p0, p1, :cond_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object p0, La83;->a:La83;

    .line 21
    .line 22
    return-object p0
.end method

.method public final e(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Le60;->a:Lin0;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/Number;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method
