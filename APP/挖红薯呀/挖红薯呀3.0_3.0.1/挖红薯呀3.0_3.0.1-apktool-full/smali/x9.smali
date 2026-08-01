.class public final synthetic Lx9;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lxq0;


# direct methods
.method public synthetic constructor <init>(Lxq0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lx9;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Lx9;->e:Lxq0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lx9;->d:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, Lx9;->e:Lxq0;

    .line 7
    .line 8
    check-cast p1, Lwq0;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p0, v2, v2}, Lwq0;->k(Lwq0;Lxq0;II)V

    .line 14
    .line 15
    .line 16
    return-object v1

    .line 17
    :pswitch_0
    invoke-static {p1, p0, v2, v2}, Lwq0;->i(Lwq0;Lxq0;II)V

    .line 18
    .line 19
    .line 20
    return-object v1

    .line 21
    :pswitch_1
    invoke-static {p1, p0, v2, v2}, Lwq0;->k(Lwq0;Lxq0;II)V

    .line 22
    .line 23
    .line 24
    return-object v1

    .line 25
    :pswitch_2
    invoke-static {p1, p0, v2, v2}, Lwq0;->i(Lwq0;Lxq0;II)V

    .line 26
    .line 27
    .line 28
    return-object v1

    .line 29
    :pswitch_3
    invoke-static {p1, p0, v2, v2}, Lwq0;->i(Lwq0;Lxq0;II)V

    .line 30
    .line 31
    .line 32
    return-object v1

    .line 33
    :pswitch_4
    invoke-static {p1, p0, v2, v2}, Lwq0;->k(Lwq0;Lxq0;II)V

    .line 34
    .line 35
    .line 36
    return-object v1

    .line 37
    :pswitch_5
    invoke-static {p1, p0, v2, v2}, Lwq0;->i(Lwq0;Lxq0;II)V

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
