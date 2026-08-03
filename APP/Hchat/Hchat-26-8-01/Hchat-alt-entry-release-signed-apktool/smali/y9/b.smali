.class public final synthetic Ly9/b;
.super Lgg/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V
    .locals 0

    .line 1
    iput p8, p0, Ly9/b;->n:I

    .line 2
    .line 3
    invoke-direct/range {p0 .. p7}, Lgg/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ly9/b;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Throwable;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lz8/e;

    .line 16
    .line 17
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 21
    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 24
    .line 25
    check-cast p2, Ljava/lang/Throwable;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lz8/a;

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 38
    .line 39
    return-object p1

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 41
    .line 42
    check-cast p2, Ljava/lang/Throwable;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lya/h;

    .line 50
    .line 51
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 58
    .line 59
    check-cast p2, Ljava/lang/Throwable;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Ly9/c;

    .line 67
    .line 68
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 72
    .line 73
    return-object p1

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
