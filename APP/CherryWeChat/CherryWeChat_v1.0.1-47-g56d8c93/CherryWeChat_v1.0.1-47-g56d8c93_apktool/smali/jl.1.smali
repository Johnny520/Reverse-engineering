.class public final Ljl;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Iterable;
.implements LMm;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Ljl;->a:I

    iput-object p2, p0, Ljl;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    iget v0, p0, Ljl;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljl;->b:Ljava/lang/Object;

    check-cast v0, Lsd;

    new-instance v1, Lrd;

    invoke-direct {v1, v0}, Lrd;-><init>(Lsd;)V

    return-object v1

    :pswitch_0
    new-instance v0, Lx;

    iget-object v1, p0, Ljl;->b:Ljava/lang/Object;

    check-cast v1, LQ4;

    invoke-virtual {v1}, LQ4;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Iterator;

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, Lx;-><init>(ILjava/lang/Object;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
