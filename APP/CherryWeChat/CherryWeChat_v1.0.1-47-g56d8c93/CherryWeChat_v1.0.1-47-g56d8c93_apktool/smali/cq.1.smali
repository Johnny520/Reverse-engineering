.class public final synthetic Lcq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljq;


# direct methods
.method public synthetic constructor <init>(Ljq;I)V
    .locals 0

    iput p2, p0, Lcq;->a:I

    iput-object p1, p0, Lcq;->b:Ljq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcq;->a:I

    packed-switch v0, :pswitch_data_0

    const-wide v0, -0x2ebbafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcq;->b:Ljq;

    invoke-virtual {v1, v0}, Ljq;->k(Ljava/lang/String;)V

    :goto_0
    sget-object v0, LTC;->a:LTC;

    return-object v0

    :pswitch_0
    const-wide v0, -0x2eb9efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcq;->b:Ljq;

    invoke-virtual {v1, v0}, Ljq;->k(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_1
    const-wide v0, -0x2ebfefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcq;->b:Ljq;

    invoke-virtual {v1, v0}, Ljq;->k(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
