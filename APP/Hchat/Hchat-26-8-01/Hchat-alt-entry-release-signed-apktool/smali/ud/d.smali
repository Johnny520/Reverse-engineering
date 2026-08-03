.class public final synthetic Lud/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 8
    iput p1, p0, Lud/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lxe/l;)V
    .locals 0

    .line 1
    const/4 p1, 0x3

    .line 2
    iput p1, p0, Lud/d;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Lud/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lxe/p;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    throw p1

    .line 13
    :pswitch_0
    check-cast p1, Lud/a;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const-string v0, "Dominance frontier not set for block: "

    .line 19
    .line 20
    :try_start_0
    iget-object v1, p1, Lud/a;->n:Ljava/util/List;

    .line 21
    .line 22
    invoke-static {v1}, Lxe/s;->m(Ljava/util/List;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iput-object v2, p1, Lud/a;->n:Ljava/util/List;

    .line 27
    .line 28
    iget-object v3, p1, Lud/a;->o:Ljava/util/List;

    .line 29
    .line 30
    if-ne v1, v3, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {v3}, Lxe/s;->m(Ljava/util/List;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    :goto_0
    iput-object v2, p1, Lud/a;->o:Ljava/util/List;

    .line 38
    .line 39
    iget-object v1, p1, Lud/a;->m:Ljava/util/List;

    .line 40
    .line 41
    invoke-static {v1}, Lxe/s;->m(Ljava/util/List;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iput-object v1, p1, Lud/a;->m:Ljava/util/List;

    .line 46
    .line 47
    iget-object v1, p1, Lud/a;->u:Ljava/util/List;

    .line 48
    .line 49
    invoke-static {v1}, Lxe/s;->m(Ljava/util/List;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iput-object v1, p1, Lud/a;->u:Ljava/util/List;

    .line 54
    .line 55
    iget-object v1, p1, Lud/a;->r:Ljava/util/BitSet;

    .line 56
    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    new-instance v1, Laf/g;

    .line 61
    .line 62
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    :catch_0
    move-exception v0

    .line 75
    new-instance v1, Laf/g;

    .line 76
    .line 77
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const-string v2, "Failed to lock block: "

    .line 82
    .line 83
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    throw v1

    .line 91
    :pswitch_1
    check-cast p1, Lud/g;

    .line 92
    .line 93
    invoke-virtual {p1}, Lmd/e;->F()V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_2
    check-cast p1, Lud/e;

    .line 98
    .line 99
    invoke-virtual {p1}, Lud/e;->o0()V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
