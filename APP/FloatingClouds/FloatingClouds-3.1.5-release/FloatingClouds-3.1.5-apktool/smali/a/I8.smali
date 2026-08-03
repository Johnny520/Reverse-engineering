.class public final synthetic La/I8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/D7;

.field public final synthetic c:Lio/github/libxposed/api/XposedInterface$Chain;


# direct methods
.method public synthetic constructor <init>(La/D7;Lio/github/libxposed/api/XposedInterface$Chain;I)V
    .locals 0

    iput p3, p0, La/I8;->a:I

    iput-object p1, p0, La/I8;->b:La/D7;

    iput-object p2, p0, La/I8;->c:Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    iget v0, p0, La/I8;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/I8;->c:Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    iget-object v1, p0, La/I8;->b:La/D7;

    invoke-interface {v1, v0}, La/D7;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, La/I8;->c:Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    iget-object v1, p0, La/I8;->b:La/D7;

    invoke-interface {v1, v0}, La/D7;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
