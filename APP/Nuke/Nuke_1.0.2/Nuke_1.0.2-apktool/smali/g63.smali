.class public final synthetic Lg63;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lcom/highcapable/kavaref/extension/TypeRef;


# direct methods
.method public synthetic constructor <init>(Lcom/highcapable/kavaref/extension/TypeRef;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg63;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lg63;->i:Lcom/highcapable/kavaref/extension/TypeRef;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lg63;->h:I

    .line 2
    .line 3
    iget-object p0, p0, Lg63;->i:Lcom/highcapable/kavaref/extension/TypeRef;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lcom/highcapable/kavaref/extension/TypeRef;->b(Lcom/highcapable/kavaref/extension/TypeRef;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    invoke-static {p0}, Lcom/highcapable/kavaref/extension/TypeRef;->a(Lcom/highcapable/kavaref/extension/TypeRef;)Ljava/lang/reflect/Type;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
