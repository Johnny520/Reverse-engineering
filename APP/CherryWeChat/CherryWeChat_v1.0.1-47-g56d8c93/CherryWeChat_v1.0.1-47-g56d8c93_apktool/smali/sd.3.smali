.class public final Lsd;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lyx;


# instance fields
.field public final synthetic a:I

.field public final b:I

.field public final c:Lkotlin/jvm/functions/Function2;

.field public final d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILkotlin/jvm/functions/Function2;I)V
    .locals 0

    iput p4, p0, Lsd;->a:I

    iput-object p1, p0, Lsd;->d:Ljava/lang/Object;

    iput p2, p0, Lsd;->b:I

    iput-object p3, p0, Lsd;->c:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    iget v0, p0, Lsd;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Luh;

    invoke-direct {v0, p0}, Luh;-><init>(Lsd;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lrd;

    invoke-direct {v0, p0}, Lrd;-><init>(Lsd;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
