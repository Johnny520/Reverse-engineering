.class public final Lu33;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Ln43;

.field public final b:Lnx1;

.field public final synthetic c:Ly33;


# direct methods
.method public constructor <init>(Ly33;Ln43;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu33;->c:Ly33;

    .line 5
    .line 6
    iput-object p2, p0, Lu33;->a:Ln43;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lu33;->b:Lnx1;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Lin0;Lin0;)Lt33;
    .locals 8

    .line 1
    iget-object v0, p0, Lu33;->b:Lnx1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lt33;

    .line 8
    .line 9
    iget-object v2, p0, Lu33;->c:Ly33;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lt33;

    .line 14
    .line 15
    new-instance v3, Lw33;

    .line 16
    .line 17
    invoke-virtual {v2}, Ly33;->c()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-interface {p2, v4}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v2}, Ly33;->c()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-interface {p2, v5}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    iget-object v6, p0, Lu33;->a:Ln43;

    .line 34
    .line 35
    iget-object v7, v6, Ln43;->a:Lin0;

    .line 36
    .line 37
    invoke-interface {v7, v5}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, Lnd;

    .line 42
    .line 43
    invoke-virtual {v5}, Lnd;->d()V

    .line 44
    .line 45
    .line 46
    invoke-direct {v3, v2, v4, v5, v6}, Lw33;-><init>(Ly33;Ljava/lang/Object;Lnd;Ln43;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, p0, v3, p1, p2}, Lt33;-><init>(Lu33;Lw33;Lin0;Lin0;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p0, v2, Ly33;->i:Lps2;

    .line 56
    .line 57
    invoke-virtual {p0, v3}, Lps2;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_0
    iput-object p2, v1, Lt33;->j:Lin0;

    .line 61
    .line 62
    iput-object p1, v1, Lt33;->i:Lin0;

    .line 63
    .line 64
    invoke-virtual {v2}, Ly33;->f()Lv33;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {v1, p0}, Lt33;->a(Lv33;)V

    .line 69
    .line 70
    .line 71
    return-object v1
.end method
