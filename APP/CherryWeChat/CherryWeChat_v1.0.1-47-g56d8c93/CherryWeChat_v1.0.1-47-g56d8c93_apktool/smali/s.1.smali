.class public final synthetic Ls;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfj;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Ls;->a:I

    iput-object p2, p0, Ls;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Ls;->a:I

    const-string v1, ": "

    sget-object v2, LTC;->a:LTC;

    iget-object v3, p0, Ls;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast p1, LhG;

    const-wide v0, -0x20caffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    invoke-virtual {p1, v3}, Lqs;->C(Ljava/lang/Object;)V

    return-object v2

    :pswitch_0
    check-cast v3, LaA;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    invoke-virtual {v3}, LaA;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, LNx;->c(Ljava/lang/String;Z)V

    return-object v2

    :pswitch_1
    check-cast v3, LEx;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v3, LEx;->e:[Ljava/lang/String;

    aget-object v2, v2, p1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v3, LEx;->f:[LCx;

    aget-object p1, v1, p1

    invoke-interface {p1}, LCx;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast v3, Landroid/widget/LinearLayout;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v0, -0xacfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, LNx;->c(Ljava/lang/String;Z)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v3, p1}, Landroid/view/View;->setVisibility(I)V

    return-object v2

    :pswitch_3
    check-cast v3, LSt;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v3, LSt;->e:[Ljava/lang/String;

    aget-object v2, v2, p1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, LSt;->j(I)LCx;

    move-result-object p1

    invoke-interface {p1}, LCx;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast v3, Lhk;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LZp;->a:Lnk;

    invoke-static {v0}, LPj;->a(Lac;)LCb;

    move-result-object v0

    new-instance v1, Ll;

    const/4 v4, 0x0

    const/4 v5, 0x4

    invoke-direct {v1, v3, p1, v4, v5}, Ll;-><init>(Ljava/lang/Object;ILEb;I)V

    const/4 p1, 0x3

    invoke-static {v0, v1, p1}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    return-object v2

    :pswitch_5
    check-cast v3, Lve;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    iget-object v0, v3, Lve;->o:Lfj;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v2

    :pswitch_6
    check-cast v3, Lha;

    check-cast p1, Ljava/lang/String;

    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, LEA;->j(Ljava/lang/String;)V

    invoke-virtual {v3}, Lha;->g()V

    return-object v2

    :pswitch_7
    check-cast v3, LA;

    if-ne p1, v3, :cond_2

    const-string p1, "(this Collection)"

    goto :goto_1

    :cond_2
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_1
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
