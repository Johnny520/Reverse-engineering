.class public final synthetic Lnl;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, Lnl;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Lnl;->e:Ljava/lang/String;

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
    .locals 4

    .line 1
    iget v0, p0, Lnl;->d:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    iget-object p0, p0, Lnl;->e:Ljava/lang/String;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Landroid/graphics/Bitmap;

    .line 11
    .line 12
    invoke-static {p0, p1}, Lsz;->b(Ljava/lang/String;Landroid/graphics/Bitmap;)Lna1;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    check-cast p1, Landroid/graphics/Bitmap;

    .line 18
    .line 19
    invoke-static {p0, p1}, Lsz;->c(Ljava/lang/String;Landroid/graphics/Bitmap;)Lna1;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_1
    check-cast p1, Lf01;

    .line 25
    .line 26
    sget-object v0, Ld01;->a:[Lu40;

    .line 27
    .line 28
    sget-object v0, Lb01;->a:Le01;

    .line 29
    .line 30
    invoke-static {p0}, Lo30;->v(Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-interface {p1, v0, p0}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x5

    .line 38
    invoke-static {p1, p0}, Ld01;->a(Lf01;I)V

    .line 39
    .line 40
    .line 41
    return-object v1

    .line 42
    :pswitch_2
    check-cast p1, Lf01;

    .line 43
    .line 44
    sget-object v0, Ld01;->a:[Lu40;

    .line 45
    .line 46
    sget-object v0, Lb01;->d:Le01;

    .line 47
    .line 48
    sget-object v2, Ld01;->a:[Lu40;

    .line 49
    .line 50
    const/4 v3, 0x2

    .line 51
    aget-object v2, v2, v3

    .line 52
    .line 53
    invoke-interface {p1, v0, p0}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
