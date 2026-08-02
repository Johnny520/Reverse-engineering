.class public final Lvr;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:Lxk1;

.field public final synthetic i:I

.field public final synthetic j:Lzq;


# direct methods
.method public constructor <init>(Lxk1;ILzq;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvr;->h:Lxk1;

    .line 5
    .line 6
    iput p2, p0, Lvr;->i:I

    .line 7
    .line 8
    iput-object p3, p0, Lvr;->j:Lzq;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    sget-object v1, Lyr;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 12
    .line 13
    iget-object v1, v0, Lvr;->h:Lxk1;

    .line 14
    .line 15
    invoke-interface {v1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Ljava/util/List;

    .line 20
    .line 21
    invoke-static {v2}, Ldu;->H0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const/16 v17, 0x0

    .line 26
    .line 27
    const/16 v18, 0x3ffb

    .line 28
    .line 29
    move-object v3, v2

    .line 30
    iget-object v2, v0, Lvr;->j:Lzq;

    .line 31
    .line 32
    move-object v5, v3

    .line 33
    const/4 v3, 0x0

    .line 34
    move-object v6, v5

    .line 35
    const/4 v5, 0x0

    .line 36
    move-object v7, v6

    .line 37
    const/4 v6, 0x0

    .line 38
    move-object v8, v7

    .line 39
    const/4 v7, 0x0

    .line 40
    move-object v9, v8

    .line 41
    const/4 v8, 0x0

    .line 42
    move-object v10, v9

    .line 43
    const/4 v9, 0x0

    .line 44
    move-object v11, v10

    .line 45
    const/4 v10, 0x0

    .line 46
    move-object v12, v11

    .line 47
    const/4 v11, 0x0

    .line 48
    move-object v13, v12

    .line 49
    const/4 v12, 0x0

    .line 50
    move-object v15, v13

    .line 51
    const-wide/16 v13, 0x0

    .line 52
    .line 53
    move-object/from16 v19, v15

    .line 54
    .line 55
    const-wide/16 v15, 0x0

    .line 56
    .line 57
    move-object/from16 p1, v1

    .line 58
    .line 59
    move-object/from16 v1, v19

    .line 60
    .line 61
    invoke-static/range {v2 .. v18}, Lzq;->a(Lzq;Ljava/lang/String;ZLgr;Ljava/util/List;ZLer;Ljava/util/Set;Lir;Ljava/lang/String;IJJZI)Lzq;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    iget v0, v0, Lvr;->i:I

    .line 66
    .line 67
    invoke-virtual {v1, v0, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-object/from16 v0, p1

    .line 71
    .line 72
    invoke-interface {v0, v1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    sget-object v0, La83;->a:La83;

    .line 76
    .line 77
    return-object v0
.end method
