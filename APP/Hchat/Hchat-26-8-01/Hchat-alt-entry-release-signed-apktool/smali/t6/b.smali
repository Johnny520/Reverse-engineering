.class public final synthetic Lt6/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lcom/highcapable/kavaref/extension/TypeRef;


# direct methods
.method public synthetic constructor <init>(Lcom/highcapable/kavaref/extension/TypeRef;I)V
    .locals 0

    .line 1
    iput p2, p0, Lt6/b;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lt6/b;->h:Lcom/highcapable/kavaref/extension/TypeRef;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lt6/b;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt6/b;->h:Lcom/highcapable/kavaref/extension/TypeRef;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/highcapable/kavaref/extension/TypeRef;->b(Lcom/highcapable/kavaref/extension/TypeRef;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0

    .line 13
    :pswitch_0
    iget-object v0, p0, Lt6/b;->h:Lcom/highcapable/kavaref/extension/TypeRef;

    .line 14
    .line 15
    invoke-static {v0}, Lcom/highcapable/kavaref/extension/TypeRef;->a(Lcom/highcapable/kavaref/extension/TypeRef;)Ljava/lang/reflect/Type;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
