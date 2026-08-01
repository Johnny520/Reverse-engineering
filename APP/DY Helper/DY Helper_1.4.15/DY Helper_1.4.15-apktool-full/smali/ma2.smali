.class public final synthetic Lma2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Le80;


# direct methods
.method public synthetic constructor <init>(ILe80;)V
    .locals 0

    .line 1
    iput p1, p0, Lma2;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lma2;->ζ:Le80;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lma2;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x64

    .line 7
    .line 8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "\u5904\u7406\u5b8c\u6210"

    .line 13
    .line 14
    iget-object p0, p0, Lma2;->ζ:Le80;

    .line 15
    .line 16
    invoke-interface {p0, v0, v1}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    const/4 v0, 0x5

    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "\u51c6\u5907\u8f6c\u7801"

    .line 26
    .line 27
    iget-object p0, p0, Lma2;->ζ:Le80;

    .line 28
    .line 29
    invoke-interface {p0, v0, v1}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
