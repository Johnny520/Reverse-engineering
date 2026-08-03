.class public final synthetic LU8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;III)V
    .locals 0

    iput p4, p0, LU8;->a:I

    iput-object p1, p0, LU8;->b:Ljava/lang/String;

    iput p2, p0, LU8;->c:I

    iput p3, p0, LU8;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    iget v0, p0, LU8;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, LU8;->c:I

    iget v1, p0, LU8;->d:I

    iget-object v2, p0, LU8;->b:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->E(Ljava/lang/String;II)LTC;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget v0, p0, LU8;->c:I

    iget v1, p0, LU8;->d:I

    iget-object v2, p0, LU8;->b:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->z(Ljava/lang/String;II)LTC;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
