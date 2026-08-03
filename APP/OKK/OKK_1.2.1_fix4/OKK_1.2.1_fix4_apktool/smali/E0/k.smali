.class public final LE0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV0/h;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, LE0/k;->a:I

    iput-object p2, p0, LE0/k;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    iget v0, p0, LE0/k;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LE0/k;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    return-object v0

    :pswitch_0
    iget-object v0, p0, LE0/k;->b:Ljava/lang/Object;

    check-cast v0, LP0/p;

    invoke-static {v0}, LU/S;->K(LP0/p;)LV0/i;

    move-result-object v0

    return-object v0

    :pswitch_1
    new-instance v0, LN0/l;

    invoke-direct {v0, p0}, LN0/l;-><init>(LE0/k;)V

    return-object v0

    :pswitch_2
    iget-object v0, p0, LE0/k;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    :pswitch_3
    const-string v0, "array"

    iget-object v1, p0, LE0/k;->b:Ljava/lang/Object;

    check-cast v1, [J

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LE0/c;

    invoke-direct {v0, v1}, LE0/c;-><init>([J)V

    return-object v0

    :pswitch_4
    iget-object v0, p0, LE0/k;->b:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    invoke-static {v0}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
