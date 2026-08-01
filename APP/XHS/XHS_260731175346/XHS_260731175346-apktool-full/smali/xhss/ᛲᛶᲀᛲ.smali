.class public final synthetic Lxhss/ᛲᛶᲀᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛱᛳᲇᛶ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final synthetic ᛳᲁᲇᛸ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᛲᛶᲀᛲ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iput-object p2, p0, Lxhss/ᛲᛶᲀᛲ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lxhss/ᛲᛶᲀᛲ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛲᛶᲀᛲ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    check-cast p0, Lxhss/ᲁᛲᛵ;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    :try_start_0
    iget-object v1, p0, Lxhss/ᲁᛲᛵ;->ᲀᛷᲁᲀ:Lxhss/ᲀᛱᛶᛳ;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2, v2}, Lxhss/ᲀᛱᛶᛳ;->ᛷᲁᲁ(IIZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-exception v1

    .line 25
    invoke-virtual {p0, v0, v0, v1}, Lxhss/ᲁᛲᛵ;->ᛱᛱᛲᲇ(IILjava/io/IOException;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    sget-object p0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_1
    check-cast p0, Ljava/util/List;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_2
    check-cast p0, Lxhss/ᛱᛳᲇᛶ;

    .line 35
    .line 36
    :try_start_1
    invoke-interface {p0}, Lxhss/ᛱᛳᲇᛶ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Ljava/util/List;
    :try_end_1
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catch_1
    sget-object p0, Lxhss/ᛵᛷᛶᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛷᛶᛱ;

    .line 44
    .line 45
    :goto_1
    return-object p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
