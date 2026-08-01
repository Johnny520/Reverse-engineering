.class public final synthetic Lj00;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lm00;

.field public final synthetic f:I

.field public final synthetic g:Lkp;


# direct methods
.method public synthetic constructor <init>(Lm00;ILkp;I)V
    .locals 0

    .line 1
    iput p4, p0, Lj00;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Lj00;->e:Lm00;

    .line 4
    .line 5
    iput p2, p0, Lj00;->f:I

    .line 6
    .line 7
    iput-object p3, p0, Lj00;->g:Lkp;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lj00;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Lj00;->g:Lkp;

    .line 4
    .line 5
    iget v2, p0, Lj00;->f:I

    .line 6
    .line 7
    iget-object p0, p0, Lj00;->e:Lm00;

    .line 8
    .line 9
    check-cast p1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    check-cast p2, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v2, v1, p1, p2}, Lm00;->q0(Lm00;ILkp;II)Lna1;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_0
    invoke-static {p0, v2, v1, p1, p2}, Lm00;->b(Lm00;ILkp;II)Lna1;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
