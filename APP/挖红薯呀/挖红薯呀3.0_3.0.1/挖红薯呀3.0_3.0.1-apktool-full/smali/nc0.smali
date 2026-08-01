.class public final synthetic Lnc0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput p2, p0, Lnc0;->d:I

    .line 2
    .line 3
    iput-object p3, p0, Lnc0;->e:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p4, p0, Lnc0;->f:Ljava/lang/String;

    .line 6
    .line 7
    iput p1, p0, Lnc0;->g:I

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
    iget v0, p0, Lnc0;->d:I

    .line 2
    .line 3
    iget v1, p0, Lnc0;->g:I

    .line 4
    .line 5
    iget-object v2, p0, Lnc0;->f:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Lnc0;->e:Ljava/lang/String;

    .line 8
    .line 9
    check-cast p1, Lji;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v2, v1, p1, p2}, Lzc0;->e(Ljava/lang/String;Ljava/lang/String;ILji;I)Lna1;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :pswitch_0
    invoke-static {p0, v2, v1, p1, p2}, Lzc0;->r(Ljava/lang/String;Ljava/lang/String;ILji;I)Lna1;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
