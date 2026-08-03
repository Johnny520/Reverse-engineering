.class public final synthetic Lwb/co;
.super Lgg/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Landroid/content/Context;

.field public final synthetic q:Li0/a1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 6

    .line 1
    iput-object p2, p0, Lwb/co;->n:Li0/a1;

    .line 2
    .line 3
    iput-object p3, p0, Lwb/co;->o:Li0/a1;

    .line 4
    .line 5
    iput-object p1, p0, Lwb/co;->p:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p4, p0, Lwb/co;->q:Li0/a1;

    .line 8
    .line 9
    const-class p1, Lgg/k;

    .line 10
    .line 11
    invoke-static {p1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v4, "SelectedMessagesMiuixPage$openContactPicker(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Landroidx/compose/runtime/MutableState;)V"

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v1, 0x0

    .line 19
    const-string v3, "openContactPicker"

    .line 20
    .line 21
    move-object v0, p0

    .line 22
    invoke-direct/range {v0 .. v5}, Lgg/j;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lwb/co;->n:Li0/a1;

    .line 2
    .line 3
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Lwb/co;->o:Li0/a1;

    .line 14
    .line 15
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ldb/c;

    .line 20
    .line 21
    invoke-static {v1}, Lwb/ho;->T6(Ldb/c;)Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v0, v1}, La/a;->a1(ILjava/util/List;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iget-object v2, p0, Lwb/co;->p:Landroid/content/Context;

    .line 33
    .line 34
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    sget-object v0, Lwb/cu;->a:Lwb/cu;

    .line 43
    .line 44
    iget-object v1, p0, Lwb/co;->q:Li0/a1;

    .line 45
    .line 46
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 50
    .line 51
    return-object v0
.end method
