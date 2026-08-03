.class public final synthetic Lqe/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lqe/n;

.field public final synthetic c:Lud/r;


# direct methods
.method public synthetic constructor <init>(Lqe/n;Lud/r;I)V
    .locals 0

    .line 1
    iput p3, p0, Lqe/m;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lqe/m;->b:Lqe/n;

    .line 4
    .line 5
    iput-object p2, p0, Lqe/m;->c:Lud/r;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Lqe/m;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqe/m;->b:Lqe/n;

    .line 7
    .line 8
    iget-object v1, p0, Lqe/m;->c:Lud/r;

    .line 9
    .line 10
    check-cast p1, Lqd/s;

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {v0, v1, p1}, Lqe/n;->k(Lud/r;Lqd/s;)V
    :try_end_0
    .catch Laf/f; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception v0

    .line 17
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v2, "Failed to calculate best type for var: "

    .line 22
    .line 23
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {v1, p1, v0}, Lnd/b0;->M(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    return-void

    .line 31
    :catch_1
    move-exception p1

    .line 32
    throw p1

    .line 33
    :pswitch_0
    iget-object v0, p0, Lqe/m;->b:Lqe/n;

    .line 34
    .line 35
    iget-object v1, p0, Lqe/m;->c:Lud/r;

    .line 36
    .line 37
    check-cast p1, Lqd/s;

    .line 38
    .line 39
    :try_start_1
    invoke-virtual {p1}, Lqd/s;->d()Lqd/j;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    iget-object v0, v0, Lqe/n;->h:Lqe/x;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    sget-object v3, Lqe/a0;->d:Lqe/a0;

    .line 51
    .line 52
    invoke-virtual {v0, v1, p1, v2, v3}, Lqe/x;->c(Lud/r;Lqd/s;Lqd/j;Lqe/a0;)I
    :try_end_1
    .catch Laf/f; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :catch_2
    move-exception v0

    .line 57
    goto :goto_1

    .line 58
    :catch_3
    move-exception p1

    .line 59
    goto :goto_3

    .line 60
    :goto_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    const-string v2, "Failed to set immutable type for var: "

    .line 65
    .line 66
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {v1, p1, v0}, Lnd/b0;->M(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    :cond_0
    :goto_2
    return-void

    .line 74
    :goto_3
    throw p1

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
