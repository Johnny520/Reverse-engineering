.class public final synthetic Lc0/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LP0/l;


# direct methods
.method public synthetic constructor <init>(LP0/l;I)V
    .locals 0

    iput p2, p0, Lc0/O;->a:I

    iput-object p1, p0, Lc0/O;->b:LP0/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lc0/O;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "$tmp0"

    iget-object v1, p0, Lc0/O;->b:LP0/l;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object p1

    :pswitch_0
    const-string v0, "$tmp0"

    iget-object v1, p0, Lc0/O;->b:LP0/l;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/reflect/Field;

    return-object p1

    :pswitch_1
    const-string v0, "$tmp0"

    iget-object v1, p0, Lc0/O;->b:LP0/l;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/reflect/Method;

    return-object p1

    :pswitch_2
    const-string v0, "$tmp0"

    iget-object v1, p0, Lc0/O;->b:LP0/l;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/reflect/Method;

    return-object p1

    :pswitch_3
    const-string v0, "$tmp0"

    iget-object v1, p0, Lc0/O;->b:LP0/l;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    return-object p1

    :pswitch_4
    const-string v0, "$tmp0"

    iget-object v1, p0, Lc0/O;->b:LP0/l;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/reflect/Field;

    return-object p1

    :pswitch_5
    const-string v0, "$tmp0"

    iget-object v1, p0, Lc0/O;->b:LP0/l;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc0/S;

    return-object p1

    :pswitch_6
    const-string v0, "$tmp0"

    iget-object v1, p0, Lc0/O;->b:LP0/l;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc0/S;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
