.class public final La/y0;
.super La/u9;
.source "SourceFile"

# interfaces
.implements La/s7;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:La/X1;


# direct methods
.method public synthetic constructor <init>(La/X1;I)V
    .locals 0

    iput p2, p0, La/y0;->b:I

    iput-object p1, p0, La/y0;->c:La/X1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/u9;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    iget v0, p0, La/y0;->b:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, La/f5;

    iget-object v1, p0, La/y0;->c:La/X1;

    check-cast v1, La/lb;

    iget-object v1, v1, La/lb;->d:Ljava/lang/String;

    invoke-direct {v0, v1}, La/f5;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_0
    new-instance v0, La/X4;

    iget-object v1, p0, La/y0;->c:La/X1;

    check-cast v1, La/b3;

    iget-object v1, v1, La/b3;->c:Ljava/lang/String;

    invoke-direct {v0, v1}, La/X4;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_1
    new-instance v0, La/X4;

    iget-object v1, p0, La/y0;->c:La/X1;

    check-cast v1, La/x0;

    iget-object v1, v1, La/x0;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, La/X4;-><init>(Ljava/lang/String;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
