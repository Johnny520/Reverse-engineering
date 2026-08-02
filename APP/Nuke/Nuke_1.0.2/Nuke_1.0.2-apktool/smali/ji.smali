.class public final synthetic Lji;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:Ljava/lang/Long;

.field public final synthetic i:Lin0;

.field public final synthetic j:Lxk1;

.field public final synthetic k:Lxk1;

.field public final synthetic l:Lxk1;

.field public final synthetic m:Lxk1;

.field public final synthetic n:Lxk1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Long;Lin0;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lji;->h:Ljava/lang/Long;

    .line 5
    .line 6
    iput-object p2, p0, Lji;->i:Lin0;

    .line 7
    .line 8
    iput-object p3, p0, Lji;->j:Lxk1;

    .line 9
    .line 10
    iput-object p4, p0, Lji;->k:Lxk1;

    .line 11
    .line 12
    iput-object p5, p0, Lji;->l:Lxk1;

    .line 13
    .line 14
    iput-object p6, p0, Lji;->m:Lxk1;

    .line 15
    .line 16
    iput-object p7, p0, Lji;->n:Lxk1;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lji;->h:Ljava/lang/Long;

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    new-instance v2, Ldi;

    .line 12
    .line 13
    iget-object v0, p0, Lji;->j:Lxk1;

    .line 14
    .line 15
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    iget-object v0, p0, Lji;->k:Lxk1;

    .line 26
    .line 27
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    move-object v6, v0

    .line 32
    check-cast v6, Ljava/util/Set;

    .line 33
    .line 34
    iget-object v0, p0, Lji;->l:Lxk1;

    .line 35
    .line 36
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    move-object v7, v0

    .line 41
    check-cast v7, Ljava/util/Set;

    .line 42
    .line 43
    new-instance v8, Lgi;

    .line 44
    .line 45
    iget-object v0, p0, Lji;->m:Lxk1;

    .line 46
    .line 47
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget-object v9, p0, Lji;->n:Lxk1;

    .line 58
    .line 59
    invoke-interface {v9}, Lgu2;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    check-cast v9, Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v9}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    invoke-direct {v8, v9, v0}, Lgi;-><init>(Ljava/lang/String;Z)V

    .line 74
    .line 75
    .line 76
    invoke-direct/range {v2 .. v8}, Ldi;-><init>(JZLjava/util/Set;Ljava/util/Set;Lgi;)V

    .line 77
    .line 78
    .line 79
    iget-object p0, p0, Lji;->i:Lin0;

    .line 80
    .line 81
    invoke-interface {p0, v2}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    :cond_0
    return-object v1
.end method
