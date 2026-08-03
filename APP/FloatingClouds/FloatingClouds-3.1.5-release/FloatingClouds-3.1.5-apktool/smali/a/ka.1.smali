.class public final synthetic La/ka;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/jc;

.field public final synthetic c:La/ra;


# direct methods
.method public synthetic constructor <init>(La/jc;La/ra;I)V
    .locals 0

    iput p3, p0, La/ka;->a:I

    iput-object p1, p0, La/ka;->b:La/jc;

    iput-object p2, p0, La/ka;->c:La/ra;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La/ka;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/ka;->b:La/jc;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, La/jc;->Q:Ljava/lang/String;

    iget-object p1, p0, La/ka;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/ka;->b:La/jc;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, La/jc;->P:Ljava/lang/String;

    iget-object p1, p0, La/ka;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/ka;->b:La/jc;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, La/jc;->C:Ljava/lang/String;

    iget-object p1, p0, La/ka;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ka;->b:La/jc;

    iput-boolean p1, v0, La/jc;->B:Z

    iget-object p1, p0, La/ka;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ka;->b:La/jc;

    iput-boolean p1, v0, La/jc;->A:Z

    iget-object p1, p0, La/ka;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ka;->b:La/jc;

    iput-boolean p1, v0, La/jc;->c:Z

    iget-object p1, p0, La/ka;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ka;->b:La/jc;

    iput-boolean p1, v0, La/jc;->E:Z

    iget-object p1, p0, La/ka;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ka;->b:La/jc;

    iput-boolean p1, v0, La/jc;->m:Z

    iget-object p1, p0, La/ka;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ka;->b:La/jc;

    iput-boolean p1, v0, La/jc;->l:Z

    iget-object p1, p0, La/ka;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_8
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ka;->b:La/jc;

    iput-boolean p1, v0, La/jc;->k:Z

    iget-object p1, p0, La/ka;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_9
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ka;->b:La/jc;

    iput-boolean p1, v0, La/jc;->j:Z

    iget-object p1, p0, La/ka;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_a
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ka;->b:La/jc;

    iput-boolean p1, v0, La/jc;->i:Z

    iget-object p1, p0, La/ka;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_b
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ka;->b:La/jc;

    iput-boolean p1, v0, La/jc;->h:Z

    iget-object p1, p0, La/ka;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_c
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ka;->b:La/jc;

    iput-boolean p1, v0, La/jc;->g:Z

    iget-object p1, p0, La/ka;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_d
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ka;->b:La/jc;

    iput-boolean p1, v0, La/jc;->e:Z

    iget-object p1, p0, La/ka;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_e
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ka;->b:La/jc;

    iput-boolean p1, v0, La/jc;->d:Z

    iget-object p1, p0, La/ka;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_f
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ka;->b:La/jc;

    iput-boolean p1, v0, La/jc;->f:Z

    iget-object p1, p0, La/ka;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
