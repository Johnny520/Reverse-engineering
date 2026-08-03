.class public final LHC;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Comparator;I)V
    .locals 0

    iput p2, p0, LHC;->a:I

    iput-object p1, p0, LHC;->b:Ljava/util/Comparator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget v0, p0, LHC;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LHC;->b:Ljava/util/Comparator;

    check-cast v0, LHC;

    invoke-virtual {v0, p1, p2}, LHC;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p2, LEC;

    iget-boolean p2, p2, LEC;->l:Z

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    check-cast p1, LEC;

    iget-boolean p1, p1, LEC;->l:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p2, p1}, LPj;->d(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result v0

    :goto_0
    return v0

    :pswitch_0
    iget-object v0, p0, LHC;->b:Ljava/util/Comparator;

    check-cast v0, LWb;

    invoke-virtual {v0, p1, p2}, LWb;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p2, LEC;

    iget-boolean p2, p2, LEC;->t:Z

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    check-cast p1, LEC;

    iget-boolean p1, p1, LEC;->t:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p2, p1}, LPj;->d(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result v0

    :goto_1
    return v0

    :pswitch_1
    iget-object v0, p0, LHC;->b:Ljava/util/Comparator;

    check-cast v0, LHC;

    invoke-virtual {v0, p1, p2}, LHC;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    check-cast p1, LEC;

    iget-object p1, p1, LEC;->c:Ljava/lang/String;

    check-cast p2, LEC;

    iget-object p2, p2, LEC;->c:Ljava/lang/String;

    invoke-static {p1, p2}, LPj;->d(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result v0

    :goto_2
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
