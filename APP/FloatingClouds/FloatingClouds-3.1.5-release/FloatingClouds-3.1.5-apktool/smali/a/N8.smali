.class public final synthetic La/N8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/R8;


# direct methods
.method public synthetic constructor <init>(La/R8;I)V
    .locals 0

    iput p2, p0, La/N8;->a:I

    iput-object p1, p0, La/N8;->b:La/R8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, La/N8;->a:I

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    packed-switch v0, :pswitch_data_0

    const-string v0, "chain"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroid/widget/PopupWindow;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Landroid/widget/PopupWindow;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_1

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v2

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v2

    goto :goto_2

    :cond_2
    iget-object v1, p0, La/N8;->b:La/R8;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/R8;->b(Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object v0

    const/16 v1, 0x3e

    const-string v3, " "

    invoke-static {v0, v3, v2, v1}, La/t3;->p0(Ljava/util/Collection;Ljava/lang/String;La/D7;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, La/R8;->e:[Ljava/lang/String;

    array-length v3, v1

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_5

    aget-object v5, v1, v4

    const/4 v6, 0x1

    invoke-static {v0, v5, v6}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {}, La/bh;->b()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string p1, "PopupWindow.showAtLocation suppressed text="

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, La/R8;->r(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v2

    goto :goto_2

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v2

    :goto_2
    return-object v2

    :pswitch_0
    const-string v0, "chain"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroid/app/Dialog;

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    check-cast v0, Landroid/app/Dialog;

    goto :goto_3

    :cond_6
    move-object v0, v2

    :goto_3
    if-nez v0, :cond_7

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v2

    goto :goto_6

    :cond_7
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_8

    goto :goto_5

    :cond_8
    iget-object v1, p0, La/N8;->b:La/R8;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/R8;->b(Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object v0

    const/16 v1, 0x3e

    const-string v3, " "

    invoke-static {v0, v3, v2, v1}, La/t3;->p0(Ljava/util/Collection;Ljava/lang/String;La/D7;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, La/R8;->e:[Ljava/lang/String;

    array-length v3, v1

    const/4 v4, 0x0

    :goto_4
    if-ge v4, v3, :cond_b

    aget-object v5, v1, v4

    const/4 v6, 0x1

    invoke-static {v0, v5, v6}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-static {}, La/bh;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, La/bh;->b()Z

    move-result v3

    if-eqz v3, :cond_9

    if-eqz v1, :cond_9

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v3, "Dialog.show suppressed for active intercept user="

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " text="

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, La/R8;->r(Ljava/lang/String;)V

    goto :goto_6

    :cond_9
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v2

    goto :goto_6

    :cond_a
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_b
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v2

    goto :goto_6

    :cond_c
    :goto_5
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v2

    :goto_6
    return-object v2

    :pswitch_1
    const-string v0, "chain"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, La/bh;->f()Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object p1, p0, La/N8;->b:La/R8;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "suppress Vibrator.vibrate(VibrationEffect)"

    invoke-static {p1}, La/R8;->r(Ljava/lang/String;)V

    const/4 p1, 0x0

    goto :goto_7

    :cond_d
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    :goto_7
    return-object p1

    :pswitch_2
    const-string v0, "chain"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, La/bh;->f()Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object p1, p0, La/N8;->b:La/R8;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "suppress Vibrator.vibrate(long[], int)"

    invoke-static {p1}, La/R8;->r(Ljava/lang/String;)V

    const/4 p1, 0x0

    goto :goto_8

    :cond_e
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    :goto_8
    return-object p1

    :pswitch_3
    const-string v0, "chain"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, La/bh;->f()Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object p1, p0, La/N8;->b:La/R8;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "suppress Vibrator.vibrate(long)"

    invoke-static {p1}, La/R8;->r(Ljava/lang/String;)V

    const/4 p1, 0x0

    goto :goto_9

    :cond_f
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    :goto_9
    return-object p1

    :pswitch_4
    const-string v0, "chain"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, La/bh;->f()Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object p1, p0, La/N8;->b:La/R8;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "suppress ToneGenerator.startTone(int,int)"

    invoke-static {p1}, La/R8;->r(Ljava/lang/String;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_a

    :cond_10
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    :goto_a
    return-object p1

    :pswitch_5
    const-string v0, "chain"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, La/bh;->f()Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object p1, p0, La/N8;->b:La/R8;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "suppress ToneGenerator.startTone(int)"

    invoke-static {p1}, La/R8;->r(Ljava/lang/String;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_b

    :cond_11
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    :goto_b
    return-object p1

    :pswitch_6
    const-string v0, "chain"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, La/bh;->f()Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object p1, p0, La/N8;->b:La/R8;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "suppress AudioTrack.start"

    invoke-static {p1}, La/R8;->r(Ljava/lang/String;)V

    const/4 p1, 0x0

    goto :goto_c

    :cond_12
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    :goto_c
    return-object p1

    :pswitch_7
    const-string v0, "chain"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, La/bh;->f()Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object p1, p0, La/N8;->b:La/R8;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "suppress AudioTrack.play"

    invoke-static {p1}, La/R8;->r(Ljava/lang/String;)V

    const/4 p1, 0x0

    goto :goto_d

    :cond_13
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    :goto_d
    return-object p1

    :pswitch_8
    const-string v0, "chain"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, La/bh;->f()Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object p1, p0, La/N8;->b:La/R8;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "suppress Ringtone.play"

    invoke-static {p1}, La/R8;->r(Ljava/lang/String;)V

    const/4 p1, 0x0

    goto :goto_e

    :cond_14
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    :goto_e
    return-object p1

    :pswitch_9
    const-string v0, "chain"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, La/bh;->f()Z

    move-result v0

    if-eqz v0, :cond_15

    iget-object p1, p0, La/N8;->b:La/R8;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "suppress SoundPool.play"

    invoke-static {p1}, La/R8;->r(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_f

    :cond_15
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    :goto_f
    return-object p1

    :pswitch_a
    const-string v0, "chain"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, La/bh;->f()Z

    move-result v0

    if-eqz v0, :cond_16

    iget-object p1, p0, La/N8;->b:La/R8;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "suppress MediaPlayer.start"

    invoke-static {p1}, La/R8;->r(Ljava/lang/String;)V

    const/4 p1, 0x0

    goto :goto_10

    :cond_16
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    :goto_10
    return-object p1

    :pswitch_b
    const-string v0, "chain"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/N8;->b:La/R8;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, La/R8;->j(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
