.class public final synthetic LV9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfj;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lqe;


# direct methods
.method public synthetic constructor <init>(Lqe;I)V
    .locals 0

    iput p2, p0, LV9;->a:I

    iput-object p1, p0, LV9;->b:Lqe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, LV9;->a:I

    sget-object v1, LTC;->a:LTC;

    iget-object v2, p0, LV9;->b:Lqe;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LZp;->a:Lnk;

    invoke-static {v0}, LPj;->a(Lac;)LCb;

    move-result-object v0

    new-instance v3, Ll;

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct {v3, v2, p1, v4, v5}, Ll;-><init>(Ljava/lang/Object;ILEb;I)V

    const/4 p1, 0x3

    invoke-static {v0, v3, p1}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    return-object v1

    :pswitch_0
    mul-int/lit8 p1, p1, 0x5f

    div-int/lit8 p1, p1, 0x64

    invoke-virtual {v2, p1}, Lqe;->b(I)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
