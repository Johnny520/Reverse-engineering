.class public final Lh6/d;
.super Lh6/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lh6/d;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lh6/d;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Lo6/a;Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, Lh6/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh6/d;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lk6/s0;

    .line 9
    .line 10
    iget-object v0, v0, Lk6/s0;->i:Lh6/n;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, Lh6/n;->b(Lo6/a;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p2, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 17
    .line 18
    invoke-virtual {p1}, Lo6/a;->b()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicLongArray;->length()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    :goto_0
    if-ge v1, v0, :cond_0

    .line 27
    .line 28
    iget-object v2, p0, Lh6/d;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Lh6/n;

    .line 31
    .line 32
    invoke-virtual {p2, v1}, Ljava/util/concurrent/atomic/AtomicLongArray;->get(I)J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v2, p1, v3}, Lh6/n;->b(Lo6/a;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {p1}, Lo6/a;->g()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_1
    check-cast p2, Ljava/util/concurrent/atomic/AtomicLong;

    .line 51
    .line 52
    iget-object v0, p0, Lh6/d;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Lh6/n;

    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 57
    .line 58
    .line 59
    move-result-wide v1

    .line 60
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-virtual {v0, p1, p2}, Lh6/n;->b(Lo6/a;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
