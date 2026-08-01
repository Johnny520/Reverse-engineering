.class public final synthetic Lxhss/ᲁᛴᛴᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛱᛳᲇᛶ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final synthetic ᛳᲁᲇᛸ:Lcom/highcapable/kavaref/extension/TypeRef;


# direct methods
.method public synthetic constructor <init>(Lcom/highcapable/kavaref/extension/TypeRef;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxhss/ᲁᛴᛴᛳ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iput-object p1, p0, Lxhss/ᲁᛴᛴᛳ;->ᛳᲁᲇᛸ:Lcom/highcapable/kavaref/extension/TypeRef;

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
    .locals 1

    .line 1
    iget v0, p0, Lxhss/ᲁᛴᛴᛳ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᲁᛴᛴᛳ;->ᛳᲁᲇᛸ:Lcom/highcapable/kavaref/extension/TypeRef;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lcom/highcapable/kavaref/extension/TypeRef;->ᛱᛱᛲᲇ(Lcom/highcapable/kavaref/extension/TypeRef;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    invoke-static {p0}, Lcom/highcapable/kavaref/extension/TypeRef;->ᛷᛵᛵᲈ(Lcom/highcapable/kavaref/extension/TypeRef;)Ljava/lang/reflect/Type;

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
