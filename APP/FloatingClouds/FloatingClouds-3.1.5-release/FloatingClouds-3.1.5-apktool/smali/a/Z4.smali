.class public final La/Z4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, La/Z4;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget v0, p0, La/Z4;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p2, Ljava/lang/String;

    sget-object v0, La/jg;->a:La/jg;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, La/jg;->g(Ljava/lang/String;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, La/jg;->g(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p1}, La/w1;->f(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_0
    check-cast p1, La/lb;

    iget-object p1, p1, La/lb;->d:Ljava/lang/String;

    check-cast p2, La/lb;

    iget-object p2, p2, La/lb;->d:Ljava/lang/String;

    invoke-static {p1, p2}, La/w1;->f(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_1
    check-cast p1, La/r6;

    iget-object p1, p1, La/r6;->d:Ljava/lang/String;

    check-cast p2, La/r6;

    iget-object p2, p2, La/r6;->d:Ljava/lang/String;

    invoke-static {p1, p2}, La/w1;->f(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_2
    check-cast p1, La/b3;

    iget-object p1, p1, La/b3;->c:Ljava/lang/String;

    check-cast p2, La/b3;

    iget-object p2, p2, La/b3;->c:Ljava/lang/String;

    invoke-static {p1, p2}, La/w1;->f(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
