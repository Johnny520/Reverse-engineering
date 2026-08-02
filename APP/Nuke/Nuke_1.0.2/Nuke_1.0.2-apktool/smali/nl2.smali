.class public final Lnl2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lbm2;


# static fields
.field public static final j:Ldq1;


# instance fields
.field public final a:Lkx1;

.field public final b:Lkx1;

.field public final c:Lkx1;

.field public final d:Lbk1;

.field public final e:Lkx1;

.field public f:F

.field public final g:Le60;

.field public final h:Ln70;

.field public final i:Ln70;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lyc2;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lyc2;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lml2;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v2}, Lml2;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Ldq1;

    .line 15
    .line 16
    const/16 v3, 0xa

    .line 17
    .line 18
    invoke-direct {v2, v3, v0, v1}, Ldq1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sput-object v2, Lnl2;->j:Ldq1;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkx1;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lkx1;-><init>(I)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lnl2;->a:Lkx1;

    .line 10
    .line 11
    new-instance p1, Lkx1;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p1, v0}, Lkx1;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lnl2;->b:Lkx1;

    .line 18
    .line 19
    new-instance p1, Lkx1;

    .line 20
    .line 21
    invoke-direct {p1, v0}, Lkx1;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lnl2;->c:Lkx1;

    .line 25
    .line 26
    new-instance p1, Lbk1;

    .line 27
    .line 28
    invoke-direct {p1}, Lbk1;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lnl2;->d:Lbk1;

    .line 32
    .line 33
    new-instance p1, Lkx1;

    .line 34
    .line 35
    const v1, 0x7fffffff

    .line 36
    .line 37
    .line 38
    invoke-direct {p1, v1}, Lkx1;-><init>(I)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lnl2;->e:Lkx1;

    .line 42
    .line 43
    new-instance p1, Lv;

    .line 44
    .line 45
    const/16 v1, 0x1b

    .line 46
    .line 47
    invoke-direct {p1, v1, p0}, Lv;-><init>(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance v1, Le60;

    .line 51
    .line 52
    invoke-direct {v1, p1}, Le60;-><init>(Lin0;)V

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, Lnl2;->g:Le60;

    .line 56
    .line 57
    new-instance p1, Lll2;

    .line 58
    .line 59
    invoke-direct {p1, p0, v0}, Lll2;-><init>(Lnl2;I)V

    .line 60
    .line 61
    .line 62
    invoke-static {p1}, Lop0;->m(Lxm0;)Ln70;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, Lnl2;->h:Ln70;

    .line 67
    .line 68
    new-instance p1, Lll2;

    .line 69
    .line 70
    const/4 v0, 0x1

    .line 71
    invoke-direct {p1, p0, v0}, Lll2;-><init>(Lnl2;I)V

    .line 72
    .line 73
    .line 74
    invoke-static {p1}, Lop0;->m(Lxm0;)Ln70;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iput-object p1, p0, Lnl2;->i:Ln70;

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnl2;->i:Ln70;

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
    iget-object p0, p0, Lnl2;->g:Le60;

    .line 2
    .line 3
    invoke-virtual {p0}, Le60;->b()Z

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
    iget-object p0, p0, Lnl2;->h:Ln70;

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
    iget-object p0, p0, Lnl2;->g:Le60;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Le60;->d(Lbl1;Lmn0;Lu00;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lk20;->h:Lk20;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, La83;->a:La83;

    .line 13
    .line 14
    return-object p0
.end method

.method public final e(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Lnl2;->g:Le60;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Le60;->e(F)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
