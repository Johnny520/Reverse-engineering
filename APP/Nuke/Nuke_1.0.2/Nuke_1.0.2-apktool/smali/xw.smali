.class public final Lxw;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic l:Ly62;


# direct methods
.method public constructor <init>(Ly62;Lt00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxw;->l:Ly62;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, Ltw2;-><init>(ILt00;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lak0;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Throwable;

    .line 4
    .line 5
    check-cast p3, Lt00;

    .line 6
    .line 7
    new-instance p1, Lxw;

    .line 8
    .line 9
    iget-object p0, p0, Lxw;->l:Ly62;

    .line 10
    .line 11
    invoke-direct {p1, p0, p3}, Lxw;-><init>(Ly62;Lt00;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, La83;->a:La83;

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lxw;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lxw;->l:Ly62;

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Ly62;->h:Z

    .line 8
    .line 9
    sget-object p0, La83;->a:La83;

    .line 10
    .line 11
    return-object p0
.end method
