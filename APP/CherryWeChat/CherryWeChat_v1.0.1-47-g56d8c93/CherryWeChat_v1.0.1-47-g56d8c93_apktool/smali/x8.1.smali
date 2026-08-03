.class public final synthetic Lx8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfj;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lx8;->a:I

    iput p1, p0, Lx8;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lx8;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget v0, p0, Lx8;->b:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lx8;->b:I

    check-cast p1, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;

    invoke-static {v0, p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->C(ILio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;)Z

    move-result p1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget v0, p0, Lx8;->b:I

    check-cast p1, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;

    invoke-static {v0, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->g(ILio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;)Z

    move-result p1

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
