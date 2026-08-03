.class public final synthetic Lre/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Li4/c0;

.field public final synthetic c:Lud/e;


# direct methods
.method public synthetic constructor <init>(Li4/c0;Lud/e;I)V
    .locals 0

    .line 1
    iput p3, p0, Lre/a;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lre/a;->b:Li4/c0;

    .line 4
    .line 5
    iput-object p2, p0, Lre/a;->c:Lud/e;

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
    .locals 2

    .line 1
    iget v0, p0, Lre/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lre/a;->c:Lud/e;

    .line 7
    .line 8
    check-cast p1, Lud/e;

    .line 9
    .line 10
    iget-object v1, p0, Lre/a;->b:Li4/c0;

    .line 11
    .line 12
    invoke-virtual {v1, v0, p1}, Li4/c0;->d(Lud/e;Lud/e;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lre/a;->c:Lud/e;

    .line 17
    .line 18
    check-cast p1, Lud/e;

    .line 19
    .line 20
    iget-object v1, p0, Lre/a;->b:Li4/c0;

    .line 21
    .line 22
    invoke-virtual {v1, v0, p1}, Li4/c0;->d(Lud/e;Lud/e;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object v0, p0, Lre/a;->c:Lud/e;

    .line 27
    .line 28
    check-cast p1, Lud/e;

    .line 29
    .line 30
    iget-object v1, p0, Lre/a;->b:Li4/c0;

    .line 31
    .line 32
    invoke-virtual {v1, v0, p1}, Li4/c0;->d(Lud/e;Lud/e;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
