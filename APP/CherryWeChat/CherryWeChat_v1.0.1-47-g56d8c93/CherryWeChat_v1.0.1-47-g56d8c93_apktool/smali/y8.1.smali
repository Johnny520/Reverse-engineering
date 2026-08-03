.class public final synthetic Ly8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lfj;


# direct methods
.method public synthetic constructor <init>(Lfj;I)V
    .locals 0

    iput p2, p0, Ly8;->a:I

    iput-object p1, p0, Ly8;->b:Lfj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, Ly8;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ly8;->b:Lfj;

    check-cast v0, Lx8;

    invoke-static {v0, p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->A(Lx8;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Ly8;->b:Lfj;

    check-cast v0, Lx8;

    invoke-static {v0, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->e(Lx8;Ljava/lang/Object;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
