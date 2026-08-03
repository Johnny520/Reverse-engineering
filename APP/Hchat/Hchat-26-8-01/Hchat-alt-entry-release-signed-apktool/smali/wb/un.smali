.class public final synthetic Lwb/un;
.super Lgg/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Landroid/content/Context;

.field public final synthetic p:Li0/a1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Li0/a1;I)V
    .locals 12

    .line 1
    iput p3, p0, Lwb/un;->n:I

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lwb/un;->o:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p2, p0, Lwb/un;->p:Li0/a1;

    .line 9
    .line 10
    const-class p1, Lgg/k;

    .line 11
    .line 12
    invoke-static {p1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const-string v4, "FloatingShortcutMiuixPage$dismissEditor(Landroid/content/Context;Landroidx/compose/runtime/MutableState;)V"

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v1, 0x0

    .line 20
    const-string v3, "dismissEditor"

    .line 21
    .line 22
    move-object v0, p0

    .line 23
    invoke-direct/range {v0 .. v5}, Lgg/j;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_0
    move-object v0, p0

    .line 28
    iput-object p1, v0, Lwb/un;->o:Landroid/content/Context;

    .line 29
    .line 30
    iput-object p2, v0, Lwb/un;->p:Li0/a1;

    .line 31
    .line 32
    const-class p1, Lgg/k;

    .line 33
    .line 34
    invoke-static {p1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    const-string v10, "FloatingShortcutMiuixPage$dismissEditor(Landroid/content/Context;Landroidx/compose/runtime/MutableState;)V"

    .line 39
    .line 40
    const/4 v11, 0x0

    .line 41
    const/4 v7, 0x0

    .line 42
    const-string v9, "dismissEditor"

    .line 43
    .line 44
    move-object v6, v0

    .line 45
    invoke-direct/range {v6 .. v11}, Lgg/j;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lwb/un;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/un;->o:Landroid/content/Context;

    .line 7
    .line 8
    iget-object v1, p0, Lwb/un;->p:Li0/a1;

    .line 9
    .line 10
    invoke-static {v0, v1}, Lwb/ho;->w4(Landroid/content/Context;Li0/a1;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    iget-object v0, p0, Lwb/un;->o:Landroid/content/Context;

    .line 17
    .line 18
    iget-object v1, p0, Lwb/un;->p:Li0/a1;

    .line 19
    .line 20
    invoke-static {v0, v1}, Lwb/ho;->w4(Landroid/content/Context;Li0/a1;)V

    .line 21
    .line 22
    .line 23
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
