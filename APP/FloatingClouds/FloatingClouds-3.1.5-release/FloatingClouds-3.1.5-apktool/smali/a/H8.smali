.class public final synthetic La/H8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/github/libxposed/api/XposedInterface$Hooker;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/o6;

.field public final synthetic c:La/D7;


# direct methods
.method public synthetic constructor <init>(La/o6;La/D7;I)V
    .locals 0

    iput p3, p0, La/H8;->a:I

    iput-object p1, p0, La/H8;->b:La/o6;

    iput-object p2, p0, La/H8;->c:La/D7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final intercept(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, La/H8;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "chain"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La/I8;

    iget-object v1, p0, La/H8;->c:La/D7;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, La/I8;-><init>(La/D7;Lio/github/libxposed/api/XposedInterface$Chain;I)V

    iget-object p1, p0, La/H8;->b:La/o6;

    invoke-static {p1, v0}, La/o6;->a(La/o6;La/s7;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-string v0, "chain"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La/I8;

    iget-object v1, p0, La/H8;->c:La/D7;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p1, v2}, La/I8;-><init>(La/D7;Lio/github/libxposed/api/XposedInterface$Chain;I)V

    iget-object p1, p0, La/H8;->b:La/o6;

    invoke-static {p1, v0}, La/o6;->a(La/o6;La/s7;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
